package com.ecommerce.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.ecommerce.mybatis.dao")
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.ecommerce.*")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
