package com.ecommerce.wallet;

import com.ecommerce.wallet.service.WalletFlowService;
import com.ecommerce.wallet.vojo.WalletFlowVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: WalletFlowServiceTest
 * @Description: test类
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/17 8:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WalletApplication.class})
public class WalletFlowServiceTest {
    @Autowired
    private WalletFlowService walletFlowService;

    //暂时测试未通过，应该是密码皮配不上
    @Test
    public void testDeposit(){
        WalletFlowVO walletFlowVO = new WalletFlowVO();
        walletFlowVO.setAccountName("qiuxiaolin");
        walletFlowVO.setPassword("123456");
        walletFlowVO.setFlow(BigDecimal.valueOf(100));
        Integer result = walletFlowService.deposit(walletFlowVO);
        assertTrue(result == 1);
    }

    //暂时测试未通过，应该是密码皮配不上
    @Test
    public void testWithdraw(){
        WalletFlowVO walletFlowVO = new WalletFlowVO();
        walletFlowVO.setAccountName("qiuxiaolin");
        walletFlowVO.setPassword("123456");
        walletFlowVO.setFlow(BigDecimal.valueOf(100));
        Integer result = walletFlowService.withdraw(walletFlowVO);
        assertTrue(result == 1);
    }
}
