package com.ecommerce.order.controller;

import com.ecommerce.order.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
@RestController
public class TestRedisController {

    @Autowired
    private TestRedisService testRedisService;

    @GetMapping("/aasdf")
    public String generateAuthCode(@RequestParam String telephone) {
        return testRedisService.generateAuthCode(telephone);
    }
}
