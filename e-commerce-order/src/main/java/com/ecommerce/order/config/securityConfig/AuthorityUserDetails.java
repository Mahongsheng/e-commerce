package com.ecommerce.order.config.securityConfig;

import com.ecommerce.mybatis.pojo.SysResource;
import com.ecommerce.mybatis.pojo.SysUser;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Data
public class AuthorityUserDetails implements UserDetails {
    private SysUser sysUser;
    private List<SysResource> permissionList;
    public AuthorityUserDetails(SysUser sysUser, List<SysResource> permissionList) {
        this.sysUser = sysUser;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (SysResource resource : permissionList) {
            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(resource.getId() + ":" + resource.getName());
            list.add(simpleGrantedAuthority);
        }
        return list;
    }

    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sysUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
