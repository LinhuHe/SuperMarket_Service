package cqdx.finall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
