package com.ecommerce.dao;

import com.ecommerce.pojo.MorMonitorResult;
import com.ecommerce.pojo.MorMonitorResultExample;
import io.swagger.annotations.ApiModelProperty;
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