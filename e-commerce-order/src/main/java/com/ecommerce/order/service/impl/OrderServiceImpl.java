package com.ecommerce.order.service.impl;

import com.ecommerce.mybatis.dao.*;
import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.order.service.OrderService;
import com.ecommerce.order.vo.IntegerVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import com.ecommerce.order.vo.ShippingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private StoStoreOrderMapper stoStoreOrderMapper;
    @Autowired
    private SolStoreOrderLineItemMapper solStoreOrderLineItemMapper;
    @Autowired
    private SalSalesOrderLineItemMapper salSalesOrderLineItemMapper;
    @Autowired
    private SaoSalesOrderMapper saoSalesOrderMapper;
    @Autowired
    private ProProductMapper proProductMapper;

//    @Override
//    public List<StoStoreOrder> getAllStoStoreOrder(){
//        StoStoreOrderExample stoStoreOrderExample = new StoStoreOrderExample();
//        return stoStoreOrderMapper.selectByExample(stoStoreOrderExample);
//    }
//
//    @Override
//    public List<SolStoreOrderLineItem> getSolStoreOrderLineItem(String stsCd){
//        //获取状态与stsCd一致的sto对象
//        StoStoreOrderExample stoStoreOrderExample = new StoStoreOrderExample();
//        StoStoreOrderExample.Criteria criteria = stoStoreOrderExample.createCriteria();
//        criteria.andStsCdEqualTo(stsCd);
//        List<StoStoreOrder> stoStoreOrders = stoStoreOrderMapper.selectByExample(stoStoreOrderExample);
//
//        //没找到符合状态的订单，返回null
//        if(stoStoreOrders.size() == 0 || stoStoreOrders == null){
//            return null;
//        }
//
//        /**
//         * 在获取的stoStoreOrders内遍历，然后在数据库中获取对应的sol对象列表
//         */
//        SolStoreOrderLineItemExample solStoreOrderLineItemExample = new SolStoreOrderLineItemExample();
//        SolStoreOrderLineItemExample.Criteria solCriteria = solStoreOrderLineItemExample.createCriteria();
//
//        //用于保存返回值
//        List<SolStoreOrderLineItem> results = new ArrayList<>();
//        //开始遍历
//        for(StoStoreOrder tempSto : stoStoreOrders){
//            solCriteria.andStoIdEqualTo(tempSto.getStoId());
//            SolStoreOrderLineItem temp = new SolStoreOrderLineItem();
//            List<SolStoreOrderLineItem> tempList =  solStoreOrderLineItemMapper.selectByExample(solStoreOrderLineItemExample);
//            if(tempList.size() == 0 || tempList == null){
//                continue;
//            }else {
//                temp = tempList.get(0);
//                results.add(temp);
//            }
//        }
//
//        return results;
//    }
//
//    @Override
//    public List<SalSalesOrderLineItem> getSalSalesOrderLineItem(String stsCd){
//        //获取状态与orderSts一致的sao对象
//        SaoSalesOrderExample saoSalesOrderExample = new SaoSalesOrderExample();
//        SaoSalesOrderExample.Criteria criteria = saoSalesOrderExample.createCriteria();
//        criteria.andOrderStsEqualTo(stsCd);
//        List<SaoSalesOrder> saoSalesOrders = saoSalesOrderMapper.selectByExample(saoSalesOrderExample);
//
//        //没找到符合状态的订单，返回null
//        if(saoSalesOrders.size() == 0 || saoSalesOrders == null){
//            return null;
//        }
//
//        /**
//         * 在获取的stoStoreOrders内遍历，然后在数据库中获取对应的sol对象列表
//         */
//        SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
//        SalSalesOrderLineItemExample.Criteria salCriteria = salSalesOrderLineItemExample.createCriteria();
//
//
//        //用于保存返回值
//        List<SalSalesOrderLineItem> results = new ArrayList<>();
//        //开始遍历
//        for(SaoSalesOrder tempSao : saoSalesOrders){
//            salCriteria.andSaoIdEqualTo(tempSao.getSaoId());
//            SalSalesOrderLineItem temp = new SalSalesOrderLineItem();
//            List<SalSalesOrderLineItem> tempList =  salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample);
//            if(tempList.size() == 0 || tempList == null){
//                continue;
//            }else {
//                temp = tempList.get(0);
//                results.add(temp);
//            }
//        }
//
//        return results;
//    }

    @Override
    //根据manId查询sao信息,
    public List<SaoSalesOrderVO> getSaoByManId(int manId){
        //用SaoSalesOrderExample来获取对应的Sao列表
        SaoSalesOrderExample saoSalesOrderExample = new SaoSalesOrderExample();
        SaoSalesOrderExample.Criteria saoCriteria = saoSalesOrderExample.createCriteria();

        //选中条件-> manId相等；获取对应的sao
        saoCriteria.andManIdEqualTo(manId);
        List<SaoSalesOrder> saoSalesOrders =  saoSalesOrderMapper.selectByExample(saoSalesOrderExample);

//        System.out.println(saoSalesOrders.size());
//        System.out.println(saoSalesOrders == null );
        //没找到符合状态的sao列表，返回null
        if(saoSalesOrders == null || saoSalesOrders.size() == 0){
            return null;
        }

        //用来暂时储存找到的sal对象，如果一个sal对象都没找到，就返回null
        List<SalSalesOrderLineItem> tempList = new ArrayList<>();
        //最终要返回的vo列表
        List<SaoSalesOrderVO> saoSalesOrderVOs = new ArrayList<>();
        SaoSalesOrderVO tempVO;
        //根据sao对象来获取对应的sal对象，并且根据sal对象中的proId获取对应的pro对象，然后把所有的信息封装到VO中，再把VO添加进返回列表里
        for(SaoSalesOrder temp : saoSalesOrders){
            //用SalSalesOrderLineItemExample来获取对应的Sal列表
            SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
            SalSalesOrderLineItemExample.Criteria salCriteria = salSalesOrderLineItemExample.createCriteria();
            salCriteria.andSaoIdEqualTo(temp.getSaoId());
            tempList = salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample);
            if(tempList == null || tempList.size() == 0){
                continue;
            }else {
                //获取对应的sal对象
                SalSalesOrderLineItem sal = tempList.get(0);
                //获取proId，然后获取pro对象
                int proId = sal.getProId();
                ProProduct pro = proProductMapper.selectByPrimaryKey(proId);
                if(pro == null){
                    continue;
                }
                //把所有的信息封装到VO中，再把VO添加进返回列表里
                tempVO = new SaoSalesOrderVO(pro.getTitle(),sal.getPrice(),
                    sal.getQty(),pro.getSkuCd(),sal.getCreationDate(), temp.getOrderNo(), temp.getOrderSts() ,temp.getSaoId(),
                        sal.getTrackingNo(),pro.getProId());
                saoSalesOrderVOs.add(tempVO);
            }
        }
        if(tempList == null || tempList.size() == 0){
            return null;
        }else {
            return saoSalesOrderVOs;
        }
    }

    @Override
    //根据saoId 查询 sal
    public SalSalesOrderLineItem getSalBySaoId(Integer saoId){
        SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
        SalSalesOrderLineItemExample.Criteria criteria = salSalesOrderLineItemExample.createCriteria();
        criteria.andSaoIdEqualTo(saoId);
        List<SalSalesOrderLineItem> salSalesOrderLineItems = salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample);
        if(salSalesOrderLineItems == null || salSalesOrderLineItems.size() == 0){
            return null;
        }else {
            return salSalesOrderLineItems.get(0);
        }
    }

    @Override
    //根据sal的proId查询pro
    public ProProduct getProBySalId(Integer salId){
        SalSalesOrderLineItem salSalesOrderLineItem = salSalesOrderLineItemMapper.selectByPrimaryKey(salId);
        if(salSalesOrderLineItem == null)
            return null;
        int proId= salSalesOrderLineItem.getProId();
        return proProductMapper.selectByPrimaryKey(proId);
    }

    @Override
    //根据saoId更新订单状态
    public boolean updateOrder(ShippingVO shippingVO){
        int saoId = shippingVO.getSaoId();
        String trackingNo = shippingVO.getTrackNo();
        SaoSalesOrder saoSalesOrder = saoSalesOrderMapper.selectByPrimaryKey(saoId);
        saoSalesOrder.setOrderSts("3");

        SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
        SalSalesOrderLineItemExample.Criteria criteria = salSalesOrderLineItemExample.createCriteria();
        criteria.andSaoIdEqualTo(saoId);
        SalSalesOrderLineItem salSalesOrderLineItem = salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample).get(0);
        if(salSalesOrderLineItem == null){
            return false;
        }
        salSalesOrderLineItem.setTrackingNo(trackingNo);
        salSalesOrderLineItemMapper.updateByPrimaryKey(salSalesOrderLineItem);
        if(saoSalesOrderMapper.updateByPrimaryKey(saoSalesOrder)==1){
            return  true;
        }else {
            return false;
        }
    }

    @Override
    //退货
    public boolean cancelOrder(IntegerVO integerVO){
        int saoId = integerVO.getI();
        SaoSalesOrder saoSalesOrder = saoSalesOrderMapper.selectByPrimaryKey(saoId);
        saoSalesOrder.setOrderSts("5");
        if(saoSalesOrderMapper.updateByPrimaryKey(saoSalesOrder)==1){
            return  true;
        }else {
            return false;
        }
    }
}
