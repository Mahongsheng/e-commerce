package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.StoStoreOrder;
import com.ecommerce.mybatis.pojo.StoStoreOrderExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoStoreOrderMapper {
    long countByExample(StoStoreOrderExample example);

    int deleteByExample(StoStoreOrderExample example);

    int deleteByPrimaryKey(Integer stoId);

    int insert(StoStoreOrder record);

    int insertSelective(StoStoreOrder record);

    List<StoStoreOrder> selectByExample(StoStoreOrderExample example);

    StoStoreOrder selectByPrimaryKey(Integer stoId);

    int updateByExampleSelective(@Param("record") StoStoreOrder record, @Param("example") StoStoreOrderExample example);

    int updateByExample(@Param("record") StoStoreOrder record, @Param("example") StoStoreOrderExample example);

    int updateByPrimaryKeySelective(StoStoreOrder record);

    int updateByPrimaryKey(StoStoreOrder record);
}