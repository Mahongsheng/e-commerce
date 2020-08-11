package com.ecommerce.dao;

import com.ecommerce.pojo.CdmCodeMaster;
import com.ecommerce.pojo.CdmCodeMasterExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CdmCodeMasterMapper {
    long countByExample(CdmCodeMasterExample example);

    int deleteByExample(CdmCodeMasterExample example);

    int deleteByPrimaryKey(Integer cdmId);

    int insert(CdmCodeMaster record);

    int insertSelective(CdmCodeMaster record);

    List<CdmCodeMaster> selectByExample(CdmCodeMasterExample example);

    CdmCodeMaster selectByPrimaryKey(Integer cdmId);

    int updateByExampleSelective(@Param("record") CdmCodeMaster record, @Param("example") CdmCodeMasterExample example);

    int updateByExample(@Param("record") CdmCodeMaster record, @Param("example") CdmCodeMasterExample example);

    int updateByPrimaryKeySelective(CdmCodeMaster record);

    int updateByPrimaryKey(CdmCodeMaster record);
}