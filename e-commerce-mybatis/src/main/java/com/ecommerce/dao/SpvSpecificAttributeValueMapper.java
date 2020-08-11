package com.ecommerce.dao;

import com.ecommerce.pojo.SpvSpecificAttributeValue;
import com.ecommerce.pojo.SpvSpecificAttributeValueExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpvSpecificAttributeValueMapper {
    long countByExample(SpvSpecificAttributeValueExample example);

    int deleteByExample(SpvSpecificAttributeValueExample example);

    int deleteByPrimaryKey(Integer spvId);

    int insert(SpvSpecificAttributeValue record);

    int insertSelective(SpvSpecificAttributeValue record);

    List<SpvSpecificAttributeValue> selectByExample(SpvSpecificAttributeValueExample example);

    SpvSpecificAttributeValue selectByPrimaryKey(Integer spvId);

    int updateByExampleSelective(@Param("record") SpvSpecificAttributeValue record, @Param("example") SpvSpecificAttributeValueExample example);

    int updateByExample(@Param("record") SpvSpecificAttributeValue record, @Param("example") SpvSpecificAttributeValueExample example);

    int updateByPrimaryKeySelective(SpvSpecificAttributeValue record);

    int updateByPrimaryKey(SpvSpecificAttributeValue record);
}