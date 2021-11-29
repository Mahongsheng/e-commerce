package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SysResource;
import com.ecommerce.mybatis.pojo.SysResourceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceMapper {
    long countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    List<SysResource> selectByExample(SysResourceExample example);

    SysResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);

    /**
     * 获取用户所有可访问资源
     */
    List<SysResource> getResourceList(@Param("userId") Long userId);
}