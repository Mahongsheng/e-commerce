package com.ecommerce.order.config.securityConfig;

import com.ecommerce.mybatis.pojo.SysUser;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {
    /**
     * 根据用户名获取用户信息
     */
    SysUser getUserByName(String username);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    List<Long> getPermissionResourceList(Long roleId);
}
