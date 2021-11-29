package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.SdiStoreDropshipItem;
import com.ecommerce.mybatis.pojo.SdiStoreDropshipItemExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdiStoreDropshipItemMapper {
    long countByExample(SdiStoreDropshipItemExample example);

    int deleteByExample(SdiStoreDropshipItemExample example);

    int deleteByPrimaryKey(Integer dilId);

    int insert(SdiStoreDropshipItem record);

    int insertSelective(SdiStoreDropshipItem record);

    List<SdiStoreDropshipItem> selectByExample(SdiStoreDropshipItemExample example);

    SdiStoreDropshipItem selectByPrimaryKey(Integer dilId);

    int updateByExampleSelective(@Param("record") SdiStoreDropshipItem record, @Param("example") SdiStoreDropshipItemExample example);

    int updateByExample(@Param("record") SdiStoreDropshipItem record, @Param("example") SdiStoreDropshipItemExample example);

    int updateByPrimaryKeySelective(SdiStoreDropshipItem record);

    int updateByPrimaryKey(SdiStoreDropshipItem record);
}