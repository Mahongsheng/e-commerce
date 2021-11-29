package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UpdateRoleMenuVO {
    private Long key;

    /**
     * 前端名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "前端名称")
    private String label;

    /**
     * 是否可用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否可用")
    private Boolean disabled;
}
