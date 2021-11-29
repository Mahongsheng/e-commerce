package com.ecommerce.wallet.config.securityConfig;

import com.ecommerce.mybatis.dao.SysResourceMapper;
import com.ecommerce.mybatis.dao.SysRoleResourceRelationMapper;
import com.ecommerce.mybatis.dao.SysUserMapper;
import com.ecommerce.mybatis.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysResourceMapper sysResourceMapper;

    @Resource
    SysRoleResourceRelationMapper sysRoleResourceRelationMapper;


    @Override
    public SysUser getUserByName(String username) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<SysUser> users = sysUserMapper.selectByExample(example);
        if (users != null && users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        //获取用户信息
        SysUser sysUser = getUserByName(username);
        if (sysUser != null) {
            SysResourceExample example = new SysResourceExample();
            example.createCriteria().andIdIn(getPermissionResourceList(sysUser.getId()));
            List<SysResource> resourceList = sysResourceMapper.selectByExample(example);
            return new AuthorityUserDetails(sysUser, resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public List<Long> getPermissionResourceList(Long roleId) {
        SysRoleResourceRelationExample example = new SysRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleResourceRelation> relations = sysRoleResourceRelationMapper.selectByExample(example);
        return relations.stream().map(SysRoleResourceRelation::getResourceId).collect(Collectors.toList());
    }
}
