package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.FileUpload;
import cqdx.finall.supertmarket.entity.UserInfo;
import cqdx.finall.supertmarket.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo getUserInfo(String uid)
    {
        if(uid!=null)
        {
            return userInfoMapper.selectByPrimaryKey(uid);
        }
        return null;
    }

    public UserInfo checkAndAddMyInfo(String uid, String nickname, int sex, String ip, String portrait)
    {
        if(uid!=null && nickname!=null && ip!=null & portrait!=null)  //无空
        {
            if(userInfoMapper.isContain(uid)<=0)  //不存在
            {
                userInfoMapper.insert(new UserInfo(uid,nickname+"_"+System.currentTimeMillis(),sex,ip,portrait)); //插入
                System.out.println("用户uid："+uid+"录入成功");
            }
            else
            {
                System.out.println("用户uid："+uid+"存在 无需在次录入");
            }
        }
        else System.out.println("UserInfoController/checkAndAddMyInfo 存在非法参数");

        return userInfoMapper.selectByPrimaryKey(uid);
    }

    public void changeProtrait(MultipartFile portrait, String userName, String uid)
    {
        if(portrait==null || userName ==null || uid==null) return;

        String newPortrait = FileUpload.writeUploadFile(portrait,userName); //上传新头像
        String portraitURL = FileUpload.service+"userPic/"+userName+"/"+newPortrait;
        System.out.println("用户新的头像地址"+portraitURL);
        userInfoMapper.updatePortrait(uid,portraitURL);
    }

    public int changeNickname(String newNickname,String uid)
    {
        if( newNickname ==null || newNickname.equals("") || uid==null) return 0; //错误信息

        if(userInfoMapper.ablityNickname(newNickname)>=1) return 1; //存在同名
        else
        {
            try {
                UserInfo old = userInfoMapper.selectByPrimaryKey(uid);
                String strs[] = old.getUserPortrait().split("/");
                StringBuffer newPortraitURL = new StringBuffer(); //替换原头像路径

                for(int i=0;i<strs.length;i++)
                {
                    if(strs[i].equals(old.getUserNickname()))  //存在 说明改过头像了 需要再操作
                    {
                        newPortraitURL.append(old.getUserPortrait().replace(old.getUserNickname(),newNickname));
                        break;
                    }
                    if(i==strs.length-1)   //没改过 不需要操作
                    {
                        newPortraitURL.append(old.getUserPortrait());
                    }
                }


                System.out.println("新的头像地址:"+newPortraitURL);
                //原文件夹的路径
                File file1 = new File("F:/IDEA/mycode/supertmarket/picture/" + old.getUserNickname());
                //将原文件夹更改
                file1.renameTo(new File("F:/IDEA/mycode/supertmarket/picture/" + newNickname));
                //删除源文件夹
                deleteFile("F:/IDEA/mycode/supertmarket/picture/" + old.getUserNickname());

                userInfoMapper.updateNickname(uid,newNickname,newPortraitURL.toString()); //更新

                return 2; //成功
            }
            catch(Exception e)
            {
                System.err.println(e);
                return 0;
            }
        }
    }

    public static void deleteFile(String dirPath) {
        File file = new File(dirPath);
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            if (files == null) {
                file.delete();
            } else {
                for (int i = 0; i < files.length; i++) {
                    deleteFile(files[i].getAbsolutePath());
                }
                file.delete();
            }
        }
    }

}
