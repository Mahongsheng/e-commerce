package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.CatCategory;
import com.ecommerce.mybatis.pojo.CatCategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CatCategoryMapper {
    long countByExample(CatCategoryExample example);

    int deleteByExample(CatCategoryExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(CatCategory record);

    int insertSelective(CatCategory record);

    List<CatCategory> selectByExample(CatCategoryExample example);

    CatCategory selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") CatCategory record, @Param("example") CatCategoryExample example);

    int updateByExample(@Param("record") CatCategory record, @Param("example") CatCategoryExample example);

    int updateByPrimaryKeySelective(CatCategory record);

    int updateByPrimaryKey(CatCategory record);
}