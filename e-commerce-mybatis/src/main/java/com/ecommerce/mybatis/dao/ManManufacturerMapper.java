package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.ManManufacturer;
import com.ecommerce.mybatis.pojo.ManManufacturerExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManManufacturerMapper {
    long countByExample(ManManufacturerExample example);

    int deleteByExample(ManManufacturerExample example);

    int deleteByPrimaryKey(Integer manId);

    int insert(ManManufacturer record);

    int insertSelective(ManManufacturer record);

    List<ManManufacturer> selectByExampleWithBLOBs(ManManufacturerExample example);

    List<ManManufacturer> selectByExample(ManManufacturerExample example);

    ManManufacturer selectByPrimaryKey(Integer manId);

    int updateByExampleSelective(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExampleWithBLOBs(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExample(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByPrimaryKeySelective(ManManufacturer record);

    int updateByPrimaryKeyWithBLOBs(ManManufacturer record);

    int updateByPrimaryKey(ManManufacturer record);
}