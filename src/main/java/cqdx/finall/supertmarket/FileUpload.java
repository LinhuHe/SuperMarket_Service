package cqdx.finall.supertmarket;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileUpload {

    public static String service  = "http://30bm574434.zicp.vip/";
    /**
     * 文件上传处理
     *
     * @param file
     * @return
     */
    public static String writeUploadFile(MultipartFile file,String user) {
        String filename = file.getOriginalFilename();
        String realpath = "F:/IDEA/mycode/supertmarket/picture/" +  user ;
        File fileDir = new File(realpath);
        if (!fileDir.exists())
            fileDir.mkdirs();

        String extname = FilenameUtils.getExtension(filename);  //获取扩展名
        String allowImgFormat = "gif,jpg,jpeg,png";
        if (!allowImgFormat.contains(extname.toLowerCase())) {
            return "NOT_IMAGE";
        }

        filename = Math.abs(file.getOriginalFilename().hashCode()) + RandomUtils.createRandomString( 10 ) + "." + extname; //原file hashcode+10位随机组合+扩展名
        InputStream input = null;
        FileOutputStream fos = null;
        try {
            input = file.getInputStream();
            System.out.println("即将写入 路径为："+realpath + "/" + filename);
            fos = new FileOutputStream(realpath + "/" + filename);
            IOUtils.copy(input, fos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(fos);
        }
        return filename;
    }
}
