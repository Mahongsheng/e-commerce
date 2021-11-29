package com.ecommerce.admin.config;

import com.ecommerce.admin.service.UserService;
import com.ecommerce.mybatis.dao.SysResourceMapper;
import com.ecommerce.mybatis.pojo.SysResource;
import com.ecommerce.mybatis.pojo.SysResourceExample;
import com.ecommerce.security.component.DynamicSecurityService;
import com.ecommerce.security.config.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AdminSecurityConfig extends SecurityConfig {

    @Resource
    private UserService userService;

    @Resource
    private SysResourceMapper sysResourceMapper;

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> userService.loadUserByUsername(username);
    }

    @Bean
    public DynamicSecurityService dynamicSecurityService() {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                SysResourceExample example = new SysResourceExample();
                List<SysResource> resourceList = sysResourceMapper.selectByExample(example);
                for (SysResource resource : resourceList) {
                    map.put(resource.getUrl(), new org.springframework.security.access.SecurityConfig(resource.getId() + ":" + resource.getName()));
                }
                return map;
            }
        };
    }
}