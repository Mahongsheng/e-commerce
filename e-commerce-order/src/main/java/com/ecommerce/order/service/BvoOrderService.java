package com.ecommerce.order.service;

import com.ecommerce.mybatis.pojo.*;
import com.ecommerce.order.vo.IntegerArrayVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;

import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.service
 * @ClassName: BvoOrderService
 * @Description: BVO订单管理接口
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/7 9:10
 */
public interface BvoOrderService {
    //通过dsrId获取strStore对象
    StrStore getStrStoreByDsrId(int dsrId);

    //通过strId获取sto对象列表
    List<StoStoreOrder> getStosByStrId(int strId);

    //通过stoId获取sao对象
    SaoSalesOrder getSaoByStoId(int stoId);

    //根据saoId 查询 sal
    List<SalSalesOrderLineItem> getSalBySaoId(int[] saoIds);

    //根据sal的proId查询pro
    ProProduct getProBySalId(Integer salId);

    //根据dsrId返回saoVO对象列表
    List<SaoSalesOrderVO> getSaoVosByDsrId(int dsrId);

    //根据省、市返回运费
    double getFeeByProvinceCode(String state);

    //根据saoId更新订单状态
    int updateOrderBySaoId(IntegerArrayVO integerArrayVO);


}
