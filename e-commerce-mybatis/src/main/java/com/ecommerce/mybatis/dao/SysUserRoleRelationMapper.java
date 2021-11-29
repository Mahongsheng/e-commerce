package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SysUserRoleRelation;
import com.ecommerce.mybatis.pojo.SysUserRoleRelationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleRelationMapper {
    long countByExample(SysUserRoleRelationExample example);

    int deleteByExample(SysUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRoleRelation record);

    int insertSelective(SysUserRoleRelation record);

    List<SysUserRoleRelation> selectByExample(SysUserRoleRelationExample example);

    SysUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserRoleRelation record, @Param("example") SysUserRoleRelationExample example);

    int updateByExample(@Param("record") SysUserRoleRelation record, @Param("example") SysUserRoleRelationExample example);

    int updateByPrimaryKeySelective(SysUserRoleRelation record);

    int updateByPrimaryKey(SysUserRoleRelation record);
}