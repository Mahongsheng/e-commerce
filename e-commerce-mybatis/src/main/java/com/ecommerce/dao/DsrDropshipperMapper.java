package com.ecommerce.dao;

import com.ecommerce.pojo.DsrDropshipper;
import com.ecommerce.pojo.DsrDropshipperExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsrDropshipperMapper {
    long countByExample(DsrDropshipperExample example);

    int deleteByExample(DsrDropshipperExample example);

    int deleteByPrimaryKey(Integer dsrId);

    int insert(DsrDropshipper record);

    int insertSelective(DsrDropshipper record);

    List<DsrDropshipper> selectByExample(DsrDropshipperExample example);

    DsrDropshipper selectByPrimaryKey(Integer dsrId);

    int updateByExampleSelective(@Param("record") DsrDropshipper record, @Param("example") DsrDropshipperExample example);

    int updateByExample(@Param("record") DsrDropshipper record, @Param("example") DsrDropshipperExample example);

    int updateByPrimaryKeySelective(DsrDropshipper record);

    int updateByPrimaryKey(DsrDropshipper record);
}