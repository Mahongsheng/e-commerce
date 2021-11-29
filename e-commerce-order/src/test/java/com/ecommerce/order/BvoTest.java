package com.ecommerce.order;

import com.ecommerce.order.service.BvoOrderService;
import com.ecommerce.mybatis.pojo.ProProduct;
import com.ecommerce.mybatis.pojo.SalSalesOrderLineItem;
import com.ecommerce.order.vo.IntegerArrayVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce
 * @ClassName: BvoTest
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/14 16:57
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderApplication.class})
public class BvoTest {
    @Autowired
    private BvoOrderService bvoOrderService;

    @Test
    public void testGetSaoVosByDsrId() {
        List<SaoSalesOrderVO> saoSalesOrderVOS = bvoOrderService.getSaoVosByDsrId(1);
        for (SaoSalesOrderVO saoSalesOrderVO : saoSalesOrderVOS) {
            System.out.println(saoSalesOrderVO.toString());
        }
    }

    @Test
    public void testGetSalBySaoId() {
        int[] saoIds = {100, 101, 102, 103, 104, 105, 106};
        List<SalSalesOrderLineItem> salSalesOrderLineItems = bvoOrderService.getSalBySaoId(saoIds);
        for (SalSalesOrderLineItem salSalesOrderLineItem : salSalesOrderLineItems) {
            System.out.println(salSalesOrderLineItem.toString());
            ;
        }
    }

    @Test
    public void testGetProBySalId() {
        List<ProProduct> proProducts = new ArrayList<>();
        for (int i = 100; i < 107; i++) {
            ProProduct proProduct = bvoOrderService.getProBySalId(i);
            proProducts.add(proProduct);
        }
        for (ProProduct proProduct : proProducts) {
            System.out.println(proProduct.toString());
        }
    }

    @Test
    public void testGetFeeByProvinceCode() {
        String[] states = {"110000", "120000", "130000", "210000", "220000", "230000",
                "310000", "320000", "330000", "410000", "420000"};
        for (String string : states) {
            System.out.println(bvoOrderService.getFeeByProvinceCode(string));
        }
    }

    @Test
    public void testUpdateOrderBySaoId(){
        IntegerArrayVO integerArrayVO = new IntegerArrayVO();
        int[] saoIds = {100,101,102,103,104,105,106};
        integerArrayVO.setInts(saoIds);
        int result = bvoOrderService.updateOrderBySaoId(integerArrayVO);
        Assert.assertEquals(7,result);
    }
}
