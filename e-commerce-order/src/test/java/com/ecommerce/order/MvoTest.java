package com.ecommerce.order;

import com.ecommerce.order.service.OrderService;
import com.ecommerce.mybatis.pojo.ProProduct;
import com.ecommerce.mybatis.pojo.SalSalesOrderLineItem;
import com.ecommerce.order.vo.IntegerVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import com.ecommerce.order.vo.ShippingVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.test
 * @ClassName: com.ecommerce.MvoTest
 * @Description: 测试mvo
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/14 9:33
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderApplication.class})
public class MvoTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testGetSaoByManId(){
        List<SaoSalesOrderVO> saoSalesOrderVOS = orderService.getSaoByManId(11);
        for(SaoSalesOrderVO saoSalesOrderVO : saoSalesOrderVOS){
            System.out.println(saoSalesOrderVO.toString());
        }
        assertEquals(1,2);
    }

    @Test
    public void testGetSalBySaoId(){
        SalSalesOrderLineItem salSalesOrderLineItem = orderService.getSalBySaoId(1);
        System.out.println(salSalesOrderLineItem.toString());
    }

    @Test
    public void testGetProBySalId(){
        for(int i = 1; i < 10; i++){
            ProProduct proProduct = orderService.getProBySalId(i);
            System.out.println(proProduct.toString());
        }
    }

    @Test
    public void testUpdateOrder(){
        ShippingVO shippingVO = new ShippingVO();
        String trackNo = "Z1234";
        for(int i = 100; i < 107; i++){
            shippingVO.setSaoId(i);
            trackNo += i;
            shippingVO.setTrackNo(trackNo);
            Assert.assertEquals(true,orderService.updateOrder(shippingVO));
        }
    }

    @Test
    public void testCancel(){
        for(int i = 100; i < 103; i++){
            IntegerVO integerVO = new IntegerVO();
            integerVO.setI(i);
            Assert.assertEquals(true,orderService.cancelOrder(integerVO));
        }
    }
}
