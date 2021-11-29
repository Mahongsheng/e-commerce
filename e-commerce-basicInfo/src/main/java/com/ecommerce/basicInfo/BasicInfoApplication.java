package com.ecommerce.basicInfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.ecommerce.mybatis.dao")
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.ecommerce.*")
public class BasicInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicInfoApplication.class, args);
    }

}
