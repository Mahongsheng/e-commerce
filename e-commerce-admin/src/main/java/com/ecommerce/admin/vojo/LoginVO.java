package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class LoginVO {
    @ApiModelProperty(value = "用户名，唯一")
    @NotBlank
    private String username;

    @ApiModelProperty(value = "密码")
    @NotBlank
    private String password;

    @ApiModelProperty(value = "验证码")
    @NotBlank
    private String code;

    @ApiModelProperty(value = "验证码随机Token")
    @NotBlank
    private String tokenId;
}
