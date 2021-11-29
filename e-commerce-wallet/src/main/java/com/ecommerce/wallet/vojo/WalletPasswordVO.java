package com.ecommerce.wallet.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Create by yousabla on 2020/7/5
 * 用于更改支付密码的VO类
 */

@Api("用于更改支付密码的VO类")
@Data
public class WalletPasswordVO {

    @ApiModelProperty("用户名")
    @NotBlank
    private String accountName;

    @ApiModelProperty("旧密码")
    @NotBlank(message = "old password cannot be blank")
    private String oldPassword;

    @ApiModelProperty("新密码")
    @NotBlank(message = "new password cannot be blank")
    private String newPassword;
}
