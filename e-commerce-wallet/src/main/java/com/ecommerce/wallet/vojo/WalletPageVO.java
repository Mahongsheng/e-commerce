package com.ecommerce.wallet.vojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Create by yousabla on 2020/7/5
 * 用于获取分页数值的VO类
 */

@Api("用于获取分页数值的VO类")
@Data
public class WalletPageVO {
    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("页面大小")
    private Integer pageSize;
}
