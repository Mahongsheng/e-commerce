package com.ecommerce;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.pojo.SysMenu;
import com.ecommerce.pojo.SysResource;
import com.ecommerce.pojo.SysRole;
import com.ecommerce.pojo.SysUser;
import com.ecommerce.service.UserService;
import com.ecommerce.vojo.MenuVO;
import com.ecommerce.vojo.PageVO;
import com.ecommerce.vojo.RegisterVO;
import com.ecommerce.vojo.SearchUserVO;
import com.netflix.discovery.converters.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: DataDictionaryServiceTest
 * @Description: test类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 9:12
 */
@SpringBootTest(classes = {AdminApplication.class})
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUserByName(){
        SysUser sysUser = userService.getUserByName("string");
        Assert.assertEquals(1,(long)sysUser.getId());
    }

    @Test
    public void testRegister(){
        RegisterVO registerVO = new RegisterVO();
        registerVO.setEmail("qiuxiaolin@qq.com");
        registerVO.setNickName("hideonbush");
        registerVO.setIcon("qxlicon");
        registerVO.setNote("testRegister");
        registerVO.setPassword("qiuxiaolin");
        registerVO.setRoleId(1);
        registerVO.setUsername("qiuxiaolin");
        SysUser sysUser = userService.register(registerVO);
        System.out.println(sysUser.toString());
    }

    @Test
    public void testGetAllUser(){
        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(1);
        Assert.assertEquals("string",
                userService.getAllUser(pageVO).getList().get(0).getUsername());
    }

    @Test
    public void testSearchUser(){
        SearchUserVO searchUserVO = new SearchUserVO();
        searchUserVO.setPageNum(1);
        searchUserVO.setPageSize(1);
        searchUserVO.setUsername("qiuxiaolin");
        CommonPage<SysUser> sysUserCommonPage = userService.searchUser(searchUserVO);
        Assert.assertEquals("hideonbush",sysUserCommonPage.getList().get(0).getNickName());
    }

    @Test
    public void testGetItem(){
        long id = 2;
        SysUser sysUser = userService.getItem(id);
        Assert.assertEquals("qiuxiaolin",sysUser.getUsername());
    }

    @Test
    public void testUpdateRole(){
        List<Long> roleIds = new ArrayList<>();
        roleIds.add(Long.valueOf(1));
        roleIds.add(Long.valueOf(0));
        Long adminId = Long.valueOf(2);
        int result =  userService.updateRole(adminId,  roleIds);
        Assert.assertEquals(2,result);
    }

    @Test
    public void testGetRoleList(){
        List<SysRole> sysRoles = userService.getRoleList();
        Assert.assertEquals("BVO",sysRoles.get(0).getName());
        Assert.assertEquals("MVO",sysRoles.get(1).getName());
        Assert.assertEquals("admin",sysRoles.get(2).getName());
    }

    @Test
    public void testGetResourceList(){
        List<SysResource> sysResources = userService.getResourceList();
        Assert.assertEquals(true,sysResources.get(0).getName().equals("用户信息维护以及交互"));
    }

    @Test
    public void testGetMenuList(){
        List<MenuVO> sysMenus = userService.getMenuList();
        Assert.assertEquals(true,sysMenus.get(0).getName().equals("qiuxiaolin"));
    }

    @Test
    public void testLoadUserByUsername(){
        UserDetails userDetails = userService.loadUserByUsername("qiuxiaolin");
        boolean flag =  userDetails.getPassword().equals("$2a$10$SDNriinX.Sk843QN1Eh7aOWOoaKj8hx3cITKULfW2clLznUgeIXQW");
        Assert.assertEquals(true, flag);
    }
}
