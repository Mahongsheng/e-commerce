package com.ecommerce.dao;

import com.ecommerce.pojo.GoaGovernmentArea;
import com.ecommerce.pojo.GoaGovernmentAreaExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoaGovernmentAreaMapper {
    long countByExample(GoaGovernmentAreaExample example);

    int deleteByExample(GoaGovernmentAreaExample example);

    int deleteByPrimaryKey(Integer goaId);

    int insert(GoaGovernmentArea record);

    int insertSelective(GoaGovernmentArea record);

    List<GoaGovernmentArea> selectByExample(GoaGovernmentAreaExample example);

    GoaGovernmentArea selectByPrimaryKey(Integer goaId);

    int updateByExampleSelective(@Param("record") GoaGovernmentArea record, @Param("example") GoaGovernmentAreaExample example);

    int updateByExample(@Param("record") GoaGovernmentArea record, @Param("example") GoaGovernmentAreaExample example);

    int updateByPrimaryKeySelective(GoaGovernmentArea record);

    int updateByPrimaryKey(GoaGovernmentArea record);
}