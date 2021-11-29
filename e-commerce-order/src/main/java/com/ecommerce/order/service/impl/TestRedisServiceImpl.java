package com.ecommerce.order.service.impl;

import com.ecommerce.order.service.TestRedisService;
import com.ecommerce.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
@Service
public class TestRedisServiceImpl implements TestRedisService {
    @Autowired
    private RedisService redisService;

    @Override
    public String generateAuthCode(String telephone) {

        redisService.set("chenmingjie", "666");
        return (String) redisService.get("chenmingjie");
    }

    @Override
    public String verifyAuthCode(String telephone, String authCode) {
        return null;
    }

}
