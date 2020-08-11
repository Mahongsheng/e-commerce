package com.ecommerce.dao;

import com.ecommerce.pojo.SalSalesOrderLineItem;
import com.ecommerce.pojo.SalSalesOrderLineItemExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalSalesOrderLineItemMapper {
    long countByExample(SalSalesOrderLineItemExample example);

    int deleteByExample(SalSalesOrderLineItemExample example);

    int deleteByPrimaryKey(Integer salId);

    int insert(SalSalesOrderLineItem record);

    int insertSelective(SalSalesOrderLineItem record);

    List<SalSalesOrderLineItem> selectByExample(SalSalesOrderLineItemExample example);

    SalSalesOrderLineItem selectByPrimaryKey(Integer salId);

    int updateByExampleSelective(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByExample(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByPrimaryKeySelective(SalSalesOrderLineItem record);

    int updateByPrimaryKey(SalSalesOrderLineItem record);
}