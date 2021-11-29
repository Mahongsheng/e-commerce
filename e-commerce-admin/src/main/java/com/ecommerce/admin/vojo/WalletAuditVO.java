package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WalletAuditVO {

    @ApiModelProperty("是否通过")
    private Boolean status;

    @ApiModelProperty("备注")
    private String note;

    @ApiModelProperty("流水号")
    private String transactionNumber;
}
