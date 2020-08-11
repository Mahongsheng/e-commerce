package com.ecommerce.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Create by yousabla on 2020/7/5
 * 用于提现/充值/支付/退款的VO类
 */

@Api("用于提现/充值/支付/退款的VO类")
@Data

public class WalletFlowVO {

    @ApiModelProperty("用户名")
    @NotBlank(message = "username cannot be blank")
    private String accountName;

    @ApiModelProperty("密码")
    @NotBlank(message = "password cannot be blank")
    private String password;

    @ApiModelProperty(value = "流水金额：提现/充值/支付/退款")
    @NotNull(message = "flow cannot be null")
    private BigDecimal flow;
}
