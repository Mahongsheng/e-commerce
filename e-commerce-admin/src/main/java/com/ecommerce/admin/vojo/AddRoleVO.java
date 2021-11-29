package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class AddRoleVO {
    @ApiModelProperty("角色名")
    private String roleName;
    @ApiModelProperty("角色描述")
    private String description;
    @ApiModelProperty("菜单")
    private List<Long> menus;
}
