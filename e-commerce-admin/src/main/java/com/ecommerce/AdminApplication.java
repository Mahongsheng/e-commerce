package com.ecommerce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.ecommerce.dao")
@EnableSwagger2
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.ecommerce.AdminApplication.class, args);
    }

}
