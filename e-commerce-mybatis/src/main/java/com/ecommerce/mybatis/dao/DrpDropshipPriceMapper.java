package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.DrpDropshipPrice;
import com.ecommerce.mybatis.pojo.DrpDropshipPriceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrpDropshipPriceMapper {
    long countByExample(DrpDropshipPriceExample example);

    int deleteByExample(DrpDropshipPriceExample example);

    int deleteByPrimaryKey(Integer drpId);

    int insert(DrpDropshipPrice record);

    int insertSelective(DrpDropshipPrice record);

    List<DrpDropshipPrice> selectByExample(DrpDropshipPriceExample example);

    DrpDropshipPrice selectByPrimaryKey(Integer drpId);

    int updateByExampleSelective(@Param("record") DrpDropshipPrice record, @Param("example") DrpDropshipPriceExample example);

    int updateByExample(@Param("record") DrpDropshipPrice record, @Param("example") DrpDropshipPriceExample example);

    int updateByPrimaryKeySelective(DrpDropshipPrice record);

    int updateByPrimaryKey(DrpDropshipPrice record);
}