package com.ecommerce.admin;

import com.ecommerce.admin.vojo.MenuVO;
import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.admin.vojo.RegisterVO;
import com.ecommerce.admin.vojo.SearchUserVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.pojo.SysResource;
import com.ecommerce.mybatis.pojo.SysRole;
import com.ecommerce.mybatis.pojo.SysUser;
import com.ecommerce.admin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: DataDictionaryServiceTest
 * @Description: test类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 9:12
 */
@SpringBootTest(classes = {AdminApplication.class})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUserByName() {
        SysUser sysUser = userService.getUserByName("string");
        assertEquals(1, (long) sysUser.getId());
    }

    @Test
    public void testRegister() {
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
    public void testGetAllUser() {
        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(1);
        assertEquals("string",
                userService.getAllUser(pageVO).getList().get(0).getUsername());
    }

    @Test
    public void testSearchUser() {
        SearchUserVO searchUserVO = new SearchUserVO();
        searchUserVO.setPageNum(1);
        searchUserVO.setPageSize(1);
        searchUserVO.setUsername("qiuxiaolin");
        CommonPage<SysUser> sysUserCommonPage = userService.searchUser(searchUserVO);
        assertEquals("hideonbush", sysUserCommonPage.getList().get(0).getNickName());
    }

    @Test
    public void testGetItem() {
        long id = 2;
        SysUser sysUser = userService.getItem(id);
        assertEquals("qiuxiaolin", sysUser.getUsername());
    }

    @Test
    public void testUpdateRole() {
        List<Long> roleIds = new ArrayList<>();
        roleIds.add(Long.valueOf(1));
        roleIds.add(Long.valueOf(0));
        Long adminId = Long.valueOf(2);
        int result = userService.updateRole(adminId, roleIds);
        assertEquals(2, result);
    }

    @Test
    public void testGetRoleList() {
        List<SysRole> sysRoles = userService.getRoleList();
        assertEquals("BVO", sysRoles.get(0).getName());
        assertEquals("MVO", sysRoles.get(1).getName());
        assertEquals("admin", sysRoles.get(2).getName());
    }

    @Test
    public void testGetResourceList() {
        List<SysResource> sysResources = userService.getResourceList();
        assertEquals(true, sysResources.get(0).getName().equals("用户信息维护以及交互"));
    }

    @Test
    public void testGetMenuList() {
        List<MenuVO> sysMenus = userService.getMenuList();
        assertEquals(true, sysMenus.get(0).getName().equals("qiuxiaolin"));
    }

    @Test
    public void testLoadUserByUsername() {
        UserDetails userDetails = userService.loadUserByUsername("qiuxiaolin");
        boolean flag = userDetails.getPassword().equals("$2a$10$SDNriinX.Sk843QN1Eh7aOWOoaKj8hx3cITKULfW2clLznUgeIXQW");
        assertEquals(true, flag);
    }
}
