package com.ecommerce.wallet.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 钱包账户VO
 * Created by yousabla on 2020/7/3.
 */

@Api("钱包账户VO")
@Data
public class WalletAccountVO implements Serializable {

    @ApiModelProperty("用户名")
    @NotBlank(message = "username cannot be blank")
    private String accountName;

    @ApiModelProperty("密码")
    @NotBlank(message = "password cannot be blank")
    private String password;
}
