package com.ecommerce.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.ecommerce.mybatis.dao")
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.ecommerce.*")
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
