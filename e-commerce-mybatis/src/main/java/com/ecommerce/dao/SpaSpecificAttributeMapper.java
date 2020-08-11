package com.ecommerce.dao;

import com.ecommerce.pojo.SpaSpecificAttribute;
import com.ecommerce.pojo.SpaSpecificAttributeExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaSpecificAttributeMapper {
    long countByExample(SpaSpecificAttributeExample example);

    int deleteByExample(SpaSpecificAttributeExample example);

    int deleteByPrimaryKey(Integer spaId);

    int insert(SpaSpecificAttribute record);

    int insertSelective(SpaSpecificAttribute record);

    List<SpaSpecificAttribute> selectByExample(SpaSpecificAttributeExample example);

    SpaSpecificAttribute selectByPrimaryKey(Integer spaId);

    int updateByExampleSelective(@Param("record") SpaSpecificAttribute record, @Param("example") SpaSpecificAttributeExample example);

    int updateByExample(@Param("record") SpaSpecificAttribute record, @Param("example") SpaSpecificAttributeExample example);

    int updateByPrimaryKeySelective(SpaSpecificAttribute record);

    int updateByPrimaryKey(SpaSpecificAttribute record);
}