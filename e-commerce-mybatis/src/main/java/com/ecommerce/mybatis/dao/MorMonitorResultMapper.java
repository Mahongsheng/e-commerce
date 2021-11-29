package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.MorMonitorResult;
import com.ecommerce.mybatis.pojo.MorMonitorResultExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MorMonitorResultMapper {
    long countByExample(MorMonitorResultExample example);

    int deleteByExample(MorMonitorResultExample example);

    int deleteByPrimaryKey(Integer morId);

    int insert(MorMonitorResult record);

    int insertSelective(MorMonitorResult record);

    List<MorMonitorResult> selectByExample(MorMonitorResultExample example);

    MorMonitorResult selectByPrimaryKey(Integer morId);

    int updateByExampleSelective(@Param("record") MorMonitorResult record, @Param("example") MorMonitorResultExample example);

    int updateByExample(@Param("record") MorMonitorResult record, @Param("example") MorMonitorResultExample example);

    int updateByPrimaryKeySelective(MorMonitorResult record);

    int updateByPrimaryKey(MorMonitorResult record);
}