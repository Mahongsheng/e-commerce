package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.FreightCost;
import com.ecommerce.mybatis.pojo.FreightCostExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreightCostMapper {
    long countByExample(FreightCostExample example);

    int deleteByExample(FreightCostExample example);

    int deleteByPrimaryKey(String provinceCode);

    int insert(FreightCost record);

    int insertSelective(FreightCost record);

    List<FreightCost> selectByExample(FreightCostExample example);

    FreightCost selectByPrimaryKey(String provinceCode);

    int updateByExampleSelective(@Param("record") FreightCost record, @Param("example") FreightCostExample example);

    int updateByExample(@Param("record") FreightCost record, @Param("example") FreightCostExample example);

    int updateByPrimaryKeySelective(FreightCost record);

    int updateByPrimaryKey(FreightCost record);
}