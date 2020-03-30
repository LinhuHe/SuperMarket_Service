package cqdx.finall.supertmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cqdx.finall.supermarket.mapper")
public class SupertMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupertMarketApplication.class, args);
    }

}
