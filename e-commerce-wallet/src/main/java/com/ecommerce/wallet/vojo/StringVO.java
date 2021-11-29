package com.ecommerce.wallet.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class StringVO {

    @ApiModelProperty("账户名")
    @NotBlank
    private String accountName;
}
