package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SysRoleMenuRelation;
import com.ecommerce.mybatis.pojo.SysRoleMenuRelationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuRelationMapper {
    long countByExample(SysRoleMenuRelationExample example);

    int deleteByExample(SysRoleMenuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenuRelation record);

    int insertSelective(SysRoleMenuRelation record);

    List<SysRoleMenuRelation> selectByExample(SysRoleMenuRelationExample example);

    SysRoleMenuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    int updateByExample(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    int updateByPrimaryKeySelective(SysRoleMenuRelation record);

    int updateByPrimaryKey(SysRoleMenuRelation record);
}