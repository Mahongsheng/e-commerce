package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.DsrDropshipper;
import com.ecommerce.mybatis.pojo.DsrDropshipperExample;

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