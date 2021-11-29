package com.ecommerce.wallet.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by yousabla on 2020/7/3.
 * 用于提现/充值的VO类
 */

@Api("用于提现/充值的VO类")
@Data
public class WalletBalanceVO {

    @ApiModelProperty(value = "卖家id")
    private Integer buyerId;

    @ApiModelProperty(value = "可用金额")
    private BigDecimal availableMoney;

    @ApiModelProperty(value = "充值中金额")
    private BigDecimal depositingMoney;

    @ApiModelProperty(value = "提现中金额")
    private BigDecimal withdrawingMoney;

    @ApiModelProperty(value = "账户币种：USD,RMB")
    private String currency;
}
