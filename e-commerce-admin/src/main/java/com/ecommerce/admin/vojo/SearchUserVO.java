package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class SearchUserVO {
    @ApiModelProperty(value = "用户名")
    @NotBlank
    private String username;

    @ApiModelProperty("页数")
    @NotNull
    private Integer pageNum;

    @ApiModelProperty("页面大小")
    @NotNull
    private Integer pageSize;
}
