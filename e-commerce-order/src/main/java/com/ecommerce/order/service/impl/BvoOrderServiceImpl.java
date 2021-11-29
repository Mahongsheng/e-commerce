package com.ecommerce.order.service.impl;

import com.ecommerce.mybatis.dao.*;
import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.order.service.BvoOrderService;
import com.ecommerce.order.vo.IntegerArrayVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.service.impl
 * @ClassName: BvoOrderServiceImpl
 * @Description: BVO订单管理接口实现
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/7 9:14
 */
@Service("bvoOrderService")
public class BvoOrderServiceImpl implements BvoOrderService {
    @Autowired
    private StrStoreMapper strStoreMapper;
    @Autowired
    private StoStoreOrderMapper stoStoreOrderMapper;
    @Autowired
    private SaoSalesOrderMapper saoSalesOrderMapper;
    @Autowired
    private SalSalesOrderLineItemMapper salSalesOrderLineItemMapper;
    @Autowired
    private ProProductMapper proProductMapper;
    @Autowired
    private ShaShippingAddressMapper shaShippingAddressMapper;
    @Autowired
    private FreightCostMapper freightCostMapper;

    @Override
    public StrStore getStrStoreByDsrId(int dsrId){
        //进行筛选
        StrStoreExample strStoreExample = new StrStoreExample();
        StrStoreExample.Criteria criteria = strStoreExample.createCriteria();
        criteria.andDsrIdEqualTo(dsrId);
        //获取strStore对象
        List<StrStore> strStores = strStoreMapper.selectByExample(strStoreExample);
        //找不到对应的strStore对象则返回null值
        if(strStores == null || strStores.size() == 0){
            return null;
        }else {
            return strStores.get(0);
        }
    }

    @Override
    public List<StoStoreOrder> getStosByStrId(int strId){
        //进行筛选
        StoStoreOrderExample stoStoreOrderExample = new StoStoreOrderExample();
        StoStoreOrderExample.Criteria criteria = stoStoreOrderExample.createCriteria();
        criteria.andStrIdEqualTo(strId);
        //选取数据
        List<StoStoreOrder> stoStoreOrders = stoStoreOrderMapper.selectByExample(stoStoreOrderExample);
        //未找到数据则返回null
        if(stoStoreOrders == null || stoStoreOrders.size() == 0){
            return null;
        }
        else {
            return stoStoreOrders;
        }
    }

    @Override
    public SaoSalesOrder getSaoByStoId(int stoId){
        //进行筛选
       SaoSalesOrderExample saoSalesOrderExample = new SaoSalesOrderExample();
       SaoSalesOrderExample.Criteria criteria = saoSalesOrderExample.createCriteria();
       criteria.andStoIdEqualTo(stoId);
        //选取数据
        List<SaoSalesOrder> SaoSalesOrders = saoSalesOrderMapper.selectByExample(saoSalesOrderExample);
        //未找到数据则返回null
        if(SaoSalesOrders == null || SaoSalesOrders.size() == 0){
            return null;
        }else {
            return SaoSalesOrders.get(0);
        }
    }

    @Override
    //根据saoId 查询 sal
    public List<SalSalesOrderLineItem> getSalBySaoId(int[] saoIds){
        List<SalSalesOrderLineItem> result = new ArrayList<>();

        for(int i = 0; i < saoIds.length; i++){
            SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
            SalSalesOrderLineItemExample.Criteria criteria = salSalesOrderLineItemExample.createCriteria();
            int saoId = saoIds[i];
            criteria.andSaoIdEqualTo(saoId);
            List<SalSalesOrderLineItem> salSalesOrderLineItems = salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample);
            if(salSalesOrderLineItems == null || salSalesOrderLineItems.size() == 0){
                continue;
            }else {
                result.add(salSalesOrderLineItems.get(0));
            }
        }
        if(result == null || result.size() == 0){
            return null;
        }else
            return result;
    }

    @Override
    //根据sal的proId查询pro
    public ProProduct getProBySalId(Integer salId){
        SalSalesOrderLineItem salSalesOrderLineItem = salSalesOrderLineItemMapper.selectByPrimaryKey(salId);
        if(salSalesOrderLineItem == null)
            return null;
        int proId = salSalesOrderLineItem.getProId();
        return proProductMapper.selectByPrimaryKey(proId);
    }

    @Override
    //根据dsrId返回saoVO对象列表
    public List<SaoSalesOrderVO> getSaoVosByDsrId(int dsrId){
        //dsrId->strStore.id->List<StoStoreOrder>->List<Sao...>->List<VOs>
        StrStore strStore = this.getStrStoreByDsrId(dsrId);
        if(strStore == null){
            return null;
        }

        List<StoStoreOrder> stoStoreOrders = this.getStosByStrId(strStore.getStrId());
        if(stoStoreOrders == null){
            return null;
        }

        List<SaoSalesOrder> saoSalesOrders = new ArrayList<>();
        //获取每一个sao，然后add进列表里
        for(StoStoreOrder stoStoreOrder : stoStoreOrders){
            SaoSalesOrder temp =  this.getSaoByStoId(stoStoreOrder.getStoId());
            if(temp == null){
                continue;
            }else {
                saoSalesOrders.add(temp);
            }
        }
        if(saoSalesOrders == null || saoSalesOrders.size() == 0){
            return null;
        }

        //最终要返回的vo列表
        List<SaoSalesOrderVO> saoSalesOrderVOs = new ArrayList<>();
        SaoSalesOrderVO tempVO;
        for(SaoSalesOrder saoSalesOrder : saoSalesOrders){
            int[] saoIds = {saoSalesOrder.getSaoId()};
            SalSalesOrderLineItem salTemp = this.getSalBySaoId(saoIds).get(0);
            if(salTemp == null){
                continue;
            }else {
                ProProduct proTemp = this.getProBySalId(salTemp.getSalId());
                if(proTemp == null){
                    continue;
                }else {
                    tempVO = new SaoSalesOrderVO(proTemp.getTitle(),salTemp.getPrice(),
                            salTemp.getQty(),proTemp.getSkuCd(),salTemp.getCreationDate(), saoSalesOrder.getOrderNo(),
                            saoSalesOrder.getOrderSts() ,saoSalesOrder.getSaoId(), salTemp.getTrackingNo(),proTemp.getProId());
                    saoSalesOrderVOs.add(tempVO);
                }
            }
        }
        if(saoSalesOrderVOs == null || saoSalesOrderVOs.size() == 0){
            return null;
        }else
            return saoSalesOrderVOs;
    }

    @Override
    public double getFeeByProvinceCode(String stateCode){
        return freightCostMapper.selectByPrimaryKey(stateCode).getShippingFee();

//        //获取sao对象，然后从sao对象里面获取stoId
//        SaoSalesOrder saoSalesOrder = saoSalesOrderMapper.selectByPrimaryKey(saoId);
//        if(saoSalesOrder == null){
//            return -1;
//        }
//        int stoId = saoSalesOrder.getStoId();
//        //根据stoId,并用example来进行筛选数据,获取sha对象
//        ShaShippingAddressExample shaShippingAddressExample = new ShaShippingAddressExample();
//        ShaShippingAddressExample.Criteria criteria = shaShippingAddressExample.createCriteria();
//        criteria.andStoIdEqualTo(stoId);
//        List<ShaShippingAddress> shaShippingAddresses = shaShippingAddressMapper.selectByExample(shaShippingAddressExample);
//        if(shaShippingAddresses == null || shaShippingAddresses.size() == 0){
//            return -1;
//        }else {
//            ShaShippingAddress shaShippingAddress = shaShippingAddresses.get(0);
//            String code = shaShippingAddress.getCountryIsoCd()+shaShippingAddress.getStateOrProvinceCd();
//            if(code == "" || code == null){
//                return -1;
//            }else {
//                double fee = freightCostMapper.selectByPrimaryKey(code).getShippingFee();
//                return fee;
//            }
//        }
    }

    @Override
    public int updateOrderBySaoId(IntegerArrayVO integerArrayVO){
        int result = 0;
        int[]  saoIds = integerArrayVO.getInts();
        for(int i = 0; i < saoIds.length; i++){
            int saoId = saoIds[i];
            SaoSalesOrder saoSalesOrder = saoSalesOrderMapper.selectByPrimaryKey(saoId);
            saoSalesOrder.setOrderSts("2");
            result += saoSalesOrderMapper.updateByPrimaryKey(saoSalesOrder);
        }

        return result;
    }
}
