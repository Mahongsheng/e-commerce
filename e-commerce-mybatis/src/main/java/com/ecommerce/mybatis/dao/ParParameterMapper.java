package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.ParParameter;
import com.ecommerce.mybatis.pojo.ParParameterExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParParameterMapper {
    long countByExample(ParParameterExample example);

    int deleteByExample(ParParameterExample example);

    int deleteByPrimaryKey(Integer parId);

    int insert(ParParameter record);

    int insertSelective(ParParameter record);

    List<ParParameter> selectByExampleWithBLOBs(ParParameterExample example);

    List<ParParameter> selectByExample(ParParameterExample example);

    ParParameter selectByPrimaryKey(Integer parId);

    int updateByExampleSelective(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByExampleWithBLOBs(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByExample(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByPrimaryKeySelective(ParParameter record);

    int updateByPrimaryKeyWithBLOBs(ParParameter record);

    int updateByPrimaryKey(ParParameter record);
}