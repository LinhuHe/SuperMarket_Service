package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.entity.UserInfo;
import cqdx.finall.supertmarket.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo checkAndAddMyInfo(String uid, String nickname, int sex, String ip, String portrait)
    {
        if(uid!=null && nickname!=null && ip!=null & portrait!=null)  //无空
        {
            if(userInfoMapper.isContain(uid)<=0)  //不存在
            {
                userInfoMapper.insert(new UserInfo(uid,nickname,sex,ip,portrait)); //插入
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
}
