package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginBackVO {
    @ApiModelProperty(value = "昵称（可重复）")
    private String name;

    @ApiModelProperty(value = "角色ID")
    private String roleId;

    @ApiModelProperty(value = "BVO/MVO ID")
    private int manBuyerId;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "token请求头")
    private String tokenHead;
}
