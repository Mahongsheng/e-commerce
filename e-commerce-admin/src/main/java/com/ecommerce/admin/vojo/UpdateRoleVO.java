package com.ecommerce.admin.vojo;

import lombok.Data;

import java.util.List;

@Data
public class UpdateRoleVO {
    private Long roleId;
    private String roleName;
    private String description;
    private List<Long> menus;
}
