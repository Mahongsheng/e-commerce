package com.ecommerce.wallet.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Create by yousabla on 2020/7/5
 * 用于返回当前账户钱包流水的VO类
 */

@Data
@Api("用于返回当前账户钱包流水的VO类")
public class WalletFlowRecordVO {

    @ApiModelProperty(value = "买家ID")
    private Integer buyerId;

    @ApiModelProperty(value = "流水号")
    private String transactionNumber;

    @ApiModelProperty(value = "流水金额")
    private BigDecimal transactionMoney;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "状态")
    private Byte status;
}
