package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SysResourceCategory;
import com.ecommerce.mybatis.pojo.SysResourceCategoryExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceCategoryMapper {
    long countByExample(SysResourceCategoryExample example);

    int deleteByExample(SysResourceCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysResourceCategory record);

    int insertSelective(SysResourceCategory record);

    List<SysResourceCategory> selectByExample(SysResourceCategoryExample example);

    SysResourceCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysResourceCategory record, @Param("example") SysResourceCategoryExample example);

    int updateByExample(@Param("record") SysResourceCategory record, @Param("example") SysResourceCategoryExample example);

    int updateByPrimaryKeySelective(SysResourceCategory record);

    int updateByPrimaryKey(SysResourceCategory record);
}