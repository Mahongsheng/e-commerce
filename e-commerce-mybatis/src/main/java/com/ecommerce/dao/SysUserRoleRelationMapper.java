package com.ecommerce.dao;

import com.ecommerce.pojo.SysUserRoleRelation;
import com.ecommerce.pojo.SysUserRoleRelationExample;
import io.swagger.annotations.ApiModelProperty;
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