package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.StrStore;
import com.ecommerce.mybatis.pojo.StrStoreExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrStoreMapper {
    long countByExample(StrStoreExample example);

    int deleteByExample(StrStoreExample example);

    int deleteByPrimaryKey(Integer strId);

    int insert(StrStore record);

    int insertSelective(StrStore record);

    List<StrStore> selectByExample(StrStoreExample example);

    StrStore selectByPrimaryKey(Integer strId);

    int updateByExampleSelective(@Param("record") StrStore record, @Param("example") StrStoreExample example);

    int updateByExample(@Param("record") StrStore record, @Param("example") StrStoreExample example);

    int updateByPrimaryKeySelective(StrStore record);

    int updateByPrimaryKey(StrStore record);
}