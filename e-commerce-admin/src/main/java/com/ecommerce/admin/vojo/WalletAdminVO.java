package com.ecommerce.admin.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用于返回待审核流水表的VO类
 * Created by yousabla on 2020/7/5.
 */

@Api("用于返回待审核流水表的VO类")
@Data
public class WalletAdminVO {

    @ApiModelProperty(value = "流水号")
    private String transactionNumber;

    @ApiModelProperty("账户名")
    private String accountName;

    @ApiModelProperty("业务类型")
    private Byte transactionType;

    @ApiModelProperty(value = "金额")
    private BigDecimal availableMoney;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "状态 2 -申请 , 4 -完成 , -1-失败")
    private Byte status;
}
