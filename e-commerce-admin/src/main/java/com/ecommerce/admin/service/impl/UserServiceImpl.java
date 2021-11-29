package com.ecommerce.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.ecommerce.admin.service.UserService;
import com.ecommerce.admin.utils.AdminUserDetails;
import com.ecommerce.admin.vojo.*;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.*;
import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.security.util.JwtTokenUtil;
import com.ecommerce.redis.service.RedisService;
import com.ecommerce.redis.utils.CacheException;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysUserRoleRelationMapper sysUserRoleRelationMapper;
    @Resource
    private SysResourceMapper sysResourceMapper;
    @Resource
    private SysUserLoginLogMapper sysUserLoginLogMapper;
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysRoleResourceRelationMapper sysRoleResourceRelationMapper;
    @Resource
    private SysMenuMapper sysMenuMapper;
    @Resource
    private SysRoleMenuRelationMapper sysRoleMenuRelationMapper;
    @Resource
    private DsrDropshipperMapper dsrDropshipperMapper;
    @Resource
    private ManManufacturerMapper manManufacturerMapper;
    @Resource
    private RedisService redisService;

    private static final Long CASHE_TIME = 1800L;

    @CacheException
    @Override
    public SysUser getUserByName(String username) {
        SysUser user;
//        user = (SysUser) redisService.get(username);
//        if (user != null) {
//            return user;
//        }
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<SysUser> users = sysUserMapper.selectByExample(example);
        if (users != null && users.size() > 0) {
            user = users.get(0);
            redisService.set(username, user, CASHE_TIME);
            return user;
        }
        return null;
    }

    @Override
    public SysUser register(RegisterVO registerVO) {
        SysUser user = new SysUser();
        BeanUtils.copyProperties(registerVO, user);
        user.setCreateTime(new Date());
        user.setStatus(1);
        //查询是否有相同用户名的用户
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<SysUser> umsAdminList = sysUserMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);

        if (registerVO.getRoleId() == 2) {
            ManManufacturer manManufacturer = new ManManufacturer();
            manManufacturer.setCreationDate(new Date());
            manManufacturer.setNameCn(registerVO.getNickName());
            manManufacturer.setDescription(registerVO.getNote());
            user.setManId(manManufacturerMapper.insertSelective(manManufacturer));
        } else if (registerVO.getRoleId() == 1) {
            DsrDropshipper dsrDropshipper = new DsrDropshipper();
            dsrDropshipper.setRegisterDate(new Date());
            dsrDropshipper.setName(registerVO.getNickName());
            dsrDropshipper.setEmail(registerVO.getEmail());
            user.setManBuyerId(dsrDropshipperMapper.insertSelective(dsrDropshipper));
        }
        int userId = sysUserMapper.insertSelective(user);
        redisService.set(user.getUsername(), user, CASHE_TIME);
        //插入角色权限
        SysUserRoleRelation sysUserRoleRelation = new SysUserRoleRelation();
        sysUserRoleRelation.setAdminId((long) userId);
        sysUserRoleRelation.setRoleId((long) registerVO.getRoleId());
        sysUserRoleRelationMapper.insertSelective(sysUserRoleRelation);
        return user;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            //通过自定义方法装载UserDetails类
            UserDetails userDetails = loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            updateLoginTimeByUsername(username);
            insertLoginLog(username);
        } catch (AuthenticationException e) {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    /**
     * 更新登录时间
     *
     * @param username 用户名
     */
    private void updateLoginTimeByUsername(String username) {
        SysUser user = getUserByName(username);
        user.setLoginTime(new Date());
        sysUserMapper.updateByPrimaryKeySelective(user);
        redisService.set(username, user, CASHE_TIME);
    }

    /**
     * 添加登录记录
     *
     * @param username 用户名
     */
    private void insertLoginLog(String username) {
        SysUser user = getUserByName(username);
        SysUserLoginLog loginLog = new SysUserLoginLog();
        loginLog.setMemberId(user.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes != null ? attributes.getRequest() : null;
        loginLog.setIp(request != null ? request.getRemoteAddr() : null);
        sysUserLoginLogMapper.insertSelective(loginLog);
    }

    @Override
    public String refreshToken(String oldToken) {
        return jwtTokenUtil.refreshHeadToken(oldToken);
    }

    @Override
    public CommonPage<SysUser> getAllUser(PageVO pageVO) {
        Page<SysUser> flowPage = PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize()).doSelectPage(() -> {
            SysUserExample example = new SysUserExample();
            sysUserMapper.selectByExample(example);
        });
        return CommonPage.restPage(new ArrayList<>(flowPage.getResult()), flowPage);
    }

    @Override
    public CommonPage<SysUser> searchUser(SearchUserVO searchUserVO) {
        Page<SysUser> flowPage = PageHelper.startPage(searchUserVO.getPageNum(), searchUserVO.getPageSize()).doSelectPage(() -> {
            SysUserExample example = new SysUserExample();
            example.createCriteria().andUsernameLike("%" + searchUserVO.getUsername() + "%");
            sysUserMapper.selectByExample(example);
        });
        return CommonPage.restPage(new ArrayList<>(flowPage.getResult()), flowPage);
    }

    @Override
    public SysUser getItem(Long id) {
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        redisService.set(user.getUsername(), user, CASHE_TIME);
        return user;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        SysUserRoleRelationExample example = new SysUserRoleRelationExample();
        example.createCriteria().andAdminIdEqualTo(adminId);
        sysUserRoleRelationMapper.deleteByExample(example);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            roleIds.forEach(roleId -> {
                SysUserRoleRelation roleRelation = new SysUserRoleRelation();
                roleRelation.setAdminId(adminId);
                roleRelation.setRoleId(roleId);
                sysUserRoleRelationMapper.insertSelective(roleRelation);
            });
        }
        redisService.del(adminId + "menuList", adminId + "resourceList");
        return count;
    }

    @Override
    public List<SysRole> getRoleList() {
        SysRoleExample example = new SysRoleExample();
        return sysRoleMapper.selectByExample(example);
    }

    @CacheException
    @Override
    public List<SysResource> getResourceList() {
        List<SysResource> resources = (List<SysResource>) redisService.get("resources");
        if (resources != null) {
            return resources;
        }
        SysResourceExample example = new SysResourceExample();
        resources = sysResourceMapper.selectByExample(example);
        redisService.set("resources", resources, CASHE_TIME);
        return resources;
    }

    @CacheException
    @Override
    public List<MenuVO> getMenuList() {
//        List<MenuVO> menus = (List<MenuVO>) redisService.get("menus");
//        if (menus != null) {
//            return menus;
//        }
        SysMenuExample example = new SysMenuExample();
        List<SysMenu> menusFromDB = sysMenuMapper.selectByExample(example);

        List<MenuVO> result = new ArrayList<>();
        menusFromDB.stream().filter(menu -> menu.getParentId() == 0).forEachOrdered(menu -> {
            MenuVO parent = new MenuVO();
            BeanUtils.copyProperties(menu, parent);
            result.add(parent);
        });

        for (SysMenu menu : menusFromDB) {
            if (menu.getParentId() != 0) {
                MenuVO child = new MenuVO();
                BeanUtils.copyProperties(menu,child);
                result.stream().filter(parent -> parent.getId().equals(child.getParentId())).forEachOrdered(parent -> parent.getChildren().add(child));
            }
        }

        redisService.set("menus", result, CASHE_TIME);
        return result;
    }

    @Override
    public boolean addMenu(AddMenuVO addMenuVO) {
        SysMenu sysMenu = new SysMenu();
        BeanUtils.copyProperties(addMenuVO, sysMenu);
        sysMenu.setCreateTime(new Date());
        System.out.println(sysMenu.toString());
        return sysMenuMapper.insertSelective(sysMenu) == 1;
    }

    @Override
    public boolean deleteMenu(Long menuId) {
        return sysMenuMapper.deleteByPrimaryKey(menuId) == 1;
    }

    @Override
    public int updateResource(Long roleId, List<Long> resourceIds) {
        int count = resourceIds == null ? 0 : resourceIds.size();
        //删除原所有接口权限关系
        SysRoleResourceRelationExample example = new SysRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        sysRoleResourceRelationMapper.deleteByExample(example);

        if (!CollectionUtils.isEmpty(resourceIds)) {
            resourceIds.forEach(resourceId -> {
                SysRoleResourceRelation sysRoleResourceRelation = new SysRoleResourceRelation();
                sysRoleResourceRelation.setRoleId(roleId);
                sysRoleResourceRelation.setResourceId(resourceId);
                sysRoleResourceRelationMapper.insertSelective(sysRoleResourceRelation);
            });
        }
        return count;
    }

    @Override
    public int updateMenu(Long roleId, List<Long> menuIds) {
        int count = menuIds == null ? 0 : menuIds.size();
        //删除原所有菜单权限关系
        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        sysRoleMenuRelationMapper.deleteByExample(example);
        if (!CollectionUtils.isEmpty(menuIds)) {
            menuIds.forEach(menuId -> {
                SysRoleMenuRelation sysRoleMenuRelation = new SysRoleMenuRelation();
                sysRoleMenuRelation.setMenuId(menuId);
                sysRoleMenuRelation.setRoleId(roleId);
                sysRoleMenuRelationMapper.insertSelective(sysRoleMenuRelation);
            });
        }
        return count;
    }

    @CacheException
    @Override
    public List<Long> getPermissionResourceList(Long roleId) {
        List<Long> resourceList = (List<Long>) redisService.get(roleId + "resourceList");
        if (resourceList != null) {
            return resourceList;
        }
        SysRoleResourceRelationExample example = new SysRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleResourceRelation> relations = sysRoleResourceRelationMapper.selectByExample(example);
        List<Long> list = relations.stream().map(SysRoleResourceRelation::getResourceId).collect(Collectors.toList());
        redisService.set(roleId + "resourceList", list, CASHE_TIME);
        return list;
    }

    @CacheException
    @Override
    public List<MenuVO> getPermissionMenuList(Long userId) {
        SysUserRoleRelationExample sysUserRoleRelationExample = new SysUserRoleRelationExample();
        sysUserRoleRelationExample.createCriteria().andAdminIdEqualTo(userId);
        List<SysUserRoleRelation> sysUserRoleRelations = sysUserRoleRelationMapper.selectByExample(sysUserRoleRelationExample);
        if (sysUserRoleRelations == null || sysUserRoleRelations.isEmpty())
            throw new UsernameNotFoundException("该用户未关联任何角色");

//        List<MenuVO> menuList = (List<MenuVO>) redisService.get(userId + "menuList");
//        if (menuList != null) {
//            return menuList;
//        }

        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(sysUserRoleRelations.get(0).getRoleId());
        List<SysRoleMenuRelation> relations = sysRoleMenuRelationMapper.selectByExample(example);
        List<Long> menuIds = relations.stream().map(SysRoleMenuRelation::getMenuId).collect(Collectors.toList());

        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andIdIn(menuIds);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        List<MenuVO> menus = new ArrayList<>();
        for (SysMenu menu : sysMenus) {
            MenuVO menuVO = new MenuVO();
            BeanUtils.copyProperties(menu, menuVO);
            menus.add(menuVO);
        }

        redisService.set(userId + "menuList", menus, CASHE_TIME);
        return menus;
    }

    @Override
    public int updatePassword(UpdatePasswordVO updatePasswordVO) {
        if (StrUtil.isEmpty(updatePasswordVO.getUsername())
                || StrUtil.isEmpty(updatePasswordVO.getOldPassword())
                || StrUtil.isEmpty(updatePasswordVO.getNewPassword())) {
            return -1;
        }
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(updatePasswordVO.getUsername());
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (CollUtil.isEmpty(sysUsers)) {
            return -2;
        }
        SysUser sysUser = sysUsers.get(0);
        if (!passwordEncoder.matches(updatePasswordVO.getOldPassword(), sysUser.getPassword())) {
            return -3;
        }
        sysUser.setPassword(passwordEncoder.encode(updatePasswordVO.getNewPassword()));
        sysUserMapper.updateByPrimaryKey(sysUser);
        redisService.set(sysUser.getUsername(), sysUser, CASHE_TIME);
        return 1;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        //获取用户信息
        SysUser sysUser = getUserByName(username);
        if (sysUser != null) {
            SysUserRoleRelationExample sysUserRoleRelationExample = new SysUserRoleRelationExample();
            sysUserRoleRelationExample.createCriteria().andAdminIdEqualTo(sysUser.getId());
            List<SysUserRoleRelation> sysUserRoleRelations = sysUserRoleRelationMapper.selectByExample(sysUserRoleRelationExample);
            if (sysUserRoleRelations == null || sysUserRoleRelations.isEmpty())
                throw new UsernameNotFoundException("该用户未关联任何角色");

            SysResourceExample example = new SysResourceExample();
            List<Long> permissionResourceList = getPermissionResourceList(sysUserRoleRelations.get(0).getRoleId());
            example.createCriteria().andIdIn(permissionResourceList);
            List<SysResource> resourceList = sysResourceMapper.selectByExample(example);
            return new AdminUserDetails(sysUser, resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @CacheException
    @Override
    public List<MenuVO> getRoleMenu(Long roleId) {

//        List<MenuVO> menuList = (List<MenuVO>) redisService.get(roleId + "menuList");
//        if (menuList != null) {
//            return menuList;
//        }
        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleMenuRelation> relations = sysRoleMenuRelationMapper.selectByExample(example);
        List<Long> menuIds = relations.stream().map(SysRoleMenuRelation::getMenuId).collect(Collectors.toList());

        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andIdIn(menuIds);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        List<MenuVO> menus = new ArrayList<>();
        for (SysMenu menu : sysMenus) {
            MenuVO menuVO = new MenuVO();
            BeanUtils.copyProperties(menu, menuVO);
            menus.add(menuVO);
        }

        redisService.set(roleId + "menuList", menus, CASHE_TIME);
        return menus;
    }

    @Override
    public boolean addNewRole(AddRoleVO addRoleVO) {
        SysRole sysRole = new SysRole();
        sysRole.setDescription(addRoleVO.getDescription());
        sysRole.setName(addRoleVO.getRoleName());
        sysRole.setAdminCount(0);
        sysRole.setCreateTime(new Date());
        sysRoleMapper.insertSelective(sysRole);

        for (long menuId : addRoleVO.getMenus()) {
            SysRoleMenuRelation sysRoleMenuRelation = new SysRoleMenuRelation();
            sysRoleMenuRelation.setRoleId(sysRole.getId());
            sysRoleMenuRelation.setMenuId(menuId);
            sysRoleMenuRelationMapper.insertSelective(sysRoleMenuRelation);
        }
        return true;
    }

    @Override
    public boolean deleteRole(Long roleId) {
        int result = sysRoleMapper.deleteByPrimaryKey(roleId);
        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);

        sysRoleMenuRelationMapper.deleteByExample(example);

        return result == 1;
    }

    @Override
    public List<Long> getMenuWhenUpdateRole(Long roleId) {
        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleMenuRelation> relations = sysRoleMenuRelationMapper.selectByExample(example);
        List<Long> menuIds = relations.stream().map(SysRoleMenuRelation::getMenuId).collect(Collectors.toList());

        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andIdIn(menuIds);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        return sysMenus.stream().map(SysMenu::getId).collect(Collectors.toList());
    }

    @Override
    public boolean updateRole(UpdateRoleVO updateRoleVO) {
        SysRole sysRole = new SysRole();
        sysRole.setId(updateRoleVO.getRoleId());
        sysRole.setDescription(updateRoleVO.getDescription());
        sysRole.setName(updateRoleVO.getRoleName());
        sysRole.setCreateTime(new Date());
        sysRoleMapper.updateByPrimaryKeySelective(sysRole);

        SysRoleMenuRelationExample example = new SysRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(updateRoleVO.getRoleId());
        sysRoleMenuRelationMapper.deleteByExample(example);

        for (long menuId : updateRoleVO.getMenus()) {
            SysRoleMenuRelation sysRoleMenuRelation = new SysRoleMenuRelation();
            sysRoleMenuRelation.setRoleId(updateRoleVO.getRoleId());
            sysRoleMenuRelation.setMenuId(menuId);
            sysRoleMenuRelationMapper.insertSelective(sysRoleMenuRelation);
        }
        return true;
    }


}
