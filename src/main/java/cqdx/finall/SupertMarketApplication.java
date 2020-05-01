package cqdx.finall;

import cqdx.finall.supertmarket.FileUpload;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@SpringBootApplication
@MapperScan(value = "cqdx.finall.supermarket.mapper")
public class SupertMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupertMarketApplication.class, args);
    }


    @RequestMapping("/")
    public String start()
    {
        return  "suc";
    }

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file,@RequestParam("user") String user)
    {
        String filename = FileUpload.writeUploadFile(file,user);
        return filename;
    }
}
