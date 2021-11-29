package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SolStoreOrderLineItem;
import com.ecommerce.mybatis.pojo.SolStoreOrderLineItemExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolStoreOrderLineItemMapper {
    long countByExample(SolStoreOrderLineItemExample example);

    int deleteByExample(SolStoreOrderLineItemExample example);

    int deleteByPrimaryKey(Integer solId);

    int insert(SolStoreOrderLineItem record);

    int insertSelective(SolStoreOrderLineItem record);

    List<SolStoreOrderLineItem> selectByExampleWithBLOBs(SolStoreOrderLineItemExample example);

    List<SolStoreOrderLineItem> selectByExample(SolStoreOrderLineItemExample example);

    SolStoreOrderLineItem selectByPrimaryKey(Integer solId);

    int updateByExampleSelective(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByExampleWithBLOBs(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByExample(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByPrimaryKeySelective(SolStoreOrderLineItem record);

    int updateByPrimaryKeyWithBLOBs(SolStoreOrderLineItem record);

    int updateByPrimaryKey(SolStoreOrderLineItem record);


}