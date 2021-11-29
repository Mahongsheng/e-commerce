package com.ecommerce.admin.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.UUID;
import com.ecommerce.admin.vojo.LoginVO;
import com.ecommerce.admin.vojo.RegisterVO;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.mybatis.pojo.SysUser;
import com.ecommerce.security.component.DynamicSecurityMetadataSource;
import com.ecommerce.redis.service.RedisService;
import com.ecommerce.admin.service.UserService;
import com.ecommerce.admin.vojo.ValidateImageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
@Api(value = "用户信息维护", tags = "用户控制类")
@RequestMapping("/log")
public class LogController extends BaseController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Resource
    private UserService userService;
    @Resource
    private DynamicSecurityMetadataSource dynamicSecurityMetadataSource;
    @Resource
    private RedisService redisService;

    @ApiOperation(value = "用户注册")
    @PutMapping(value = "/register")
    @ResponseBody
    public CommonResult<SysUser> register(@Validated({InsertGroup.class}) @RequestBody RegisterVO registerVO, BindingResult result) throws BusinessException{
        if (result.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(result), registerVO.toString());
        }
        SysUser umsAdmin = userService.register(registerVO);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        dynamicSecurityMetadataSource.clearDataSource();
        return CommonResult.success(umsAdmin, "注册成功！");
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    @ResponseBody
    public CommonResult<Map<String, String>> login(@Validated({SelectGroup.class}) @RequestBody LoginVO loginVO, BindingResult result) throws BusinessException{
        if (result.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(result), loginVO.toString());
        }
        String code = (String) redisService.get(loginVO.getTokenId());
        if (code == null) {
            return CommonResult.validateFailed("验证码已过期");
        } else if (!code.equals(loginVO.getCode())) {
            return CommonResult.validateFailed("验证码输入错误");
        }

        String token = userService.login(loginVO.getUsername(), loginVO.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap, "");
    }

    @ApiOperation(value = "生成图像验证码")
    @GetMapping(value = "/generateValidateCode")
    @ResponseBody
    public ValidateImageVO generateValidateCode() {
        // 生成验证码
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(105, 52, 4, 4);
        captcha.setBackground(new Color(234, 234, 234));
        captcha.setFont(new Font("Times New Roman", Font.BOLD, 40));
        String img = captcha.getImageBase64();
        String code = captcha.getCode();
        // 生成唯一验证
        UUID uuid = UUID.randomUUID();
        ValidateImageVO validateImageVO = new ValidateImageVO();
        validateImageVO.setImg("data:image/png;base64," + img);
        validateImageVO.setTokenId(String.valueOf(uuid));
        // 存入Redis并设置失效时间
        redisService.set(String.valueOf(uuid), code, 60L);
        return validateImageVO;
    }
}
