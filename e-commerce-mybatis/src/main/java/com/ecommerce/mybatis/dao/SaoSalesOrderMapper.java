package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SaoSalesOrder;
import com.ecommerce.mybatis.pojo.SaoSalesOrderExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaoSalesOrderMapper {
    long countByExample(SaoSalesOrderExample example);

    int deleteByExample(SaoSalesOrderExample example);

    int deleteByPrimaryKey(Integer saoId);

    int insert(SaoSalesOrder record);

    int insertSelective(SaoSalesOrder record);

    List<SaoSalesOrder> selectByExampleWithBLOBs(SaoSalesOrderExample example);

    List<SaoSalesOrder> selectByExample(SaoSalesOrderExample example);

    SaoSalesOrder selectByPrimaryKey(Integer saoId);

    int updateByExampleSelective(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExample(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByPrimaryKeySelective(SaoSalesOrder record);

    int updateByPrimaryKeyWithBLOBs(SaoSalesOrder record);

    int updateByPrimaryKey(SaoSalesOrder record);
}