package com.ecommerce.order.service;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
public interface TestRedisService {

    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    String verifyAuthCode(String telephone, String authCode);

}
