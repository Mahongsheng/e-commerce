package com.ecommerce.admin;

import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.admin.service.WalletAdminService;
import com.ecommerce.admin.vojo.WalletAdminVO;
import com.ecommerce.admin.vojo.WalletAuditVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: WalletAdminServiceTest
 * @Description: 测试类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/16 17:33
 */
@SpringBootTest(classes = {AdminApplication.class})
public class WalletAdminServiceTest {
    @Autowired
    private WalletAdminService walletAdminService;

    @Test
    public void testGetAllFlow() {
        PageVO walletPageVO = new PageVO();
        walletPageVO.setPageNum(1);
        walletPageVO.setPageSize(1);
        CommonPage<WalletAdminVO> walletAdminVOCommonPage = walletAdminService.getAllFlow(walletPageVO);
        assertEquals("20200706161149345572", walletAdminVOCommonPage.getList().get(0).getTransactionNumber());
    }

    @Test
    public void testAudit() {
        WalletAuditVO walletAuditVO = new WalletAuditVO();
        walletAuditVO.setNote("test_case");
        walletAuditVO.setStatus(true);
        walletAuditVO.setTransactionNumber("12345678901234567890");
        Boolean flag = walletAdminService.audit(walletAuditVO);
        assertEquals(true, flag);
    }
}
//package com.ecommerce;
//
//import com.ecommerce.common.base.CommonPage;
//import com.ecommerce.service.WalletAdminService;
//import com.ecommerce.vojo.WalletAdminVO;
//import com.ecommerce.vojo.WalletAuditVO;
//import com.ecommerce.vojo.WalletFlowVO;
//import com.ecommerce.vojo.WalletPageVO;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * @ProjectName: e-commerce
// * @Package: com.ecommerce
// * @ClassName: WalletAdminServiceTest
// * @Description: 测试类
// * @Author: 邱晓淋
// * @CreateDate: 2020/7/16 17:33
// */
//@SpringBootTest(classes = {WalletApplication.class})
//@RunWith(SpringRunner.class)
//public class WalletAdminServiceTest {
//    @Autowired
//    private WalletAdminService walletAdminService;
//
//    @Test
//    public void testGetAllFlow(){
//        WalletPageVO walletPageVO = new WalletPageVO();
//        walletPageVO.setPageNum(1);
//        walletPageVO.setPageSize(1);
//        CommonPage<WalletAdminVO> walletAdminVOCommonPage = walletAdminService.getAllFlow(walletPageVO);
//
//        Assert.assertEquals("20200706161149345572",walletAdminVOCommonPage.getList().get(0).getTransactionNumber());
//    }
//
//    @Test
//    public void testAudit(){
//        WalletAuditVO walletAuditVO = new WalletAuditVO();
//        walletAuditVO.setNote("test_case");
//        walletAuditVO.setStatus(true);
//        walletAuditVO.setTransactionNumber("12345678901234567890");
//        Boolean flag = walletAdminService.audit(walletAuditVO);
//        Assert.assertEquals(true,flag);
//    }
//}
