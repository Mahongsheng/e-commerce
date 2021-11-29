package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.EbaEbayAuthprization;
import com.ecommerce.mybatis.pojo.EbaEbayAuthprizationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbaEbayAuthprizationMapper {
    long countByExample(EbaEbayAuthprizationExample example);

    int deleteByExample(EbaEbayAuthprizationExample example);

    int deleteByPrimaryKey(Integer ebaId);

    int insert(EbaEbayAuthprization record);

    int insertSelective(EbaEbayAuthprization record);

    List<EbaEbayAuthprization> selectByExampleWithBLOBs(EbaEbayAuthprizationExample example);

    List<EbaEbayAuthprization> selectByExample(EbaEbayAuthprizationExample example);

    EbaEbayAuthprization selectByPrimaryKey(Integer ebaId);

    int updateByExampleSelective(@Param("record") EbaEbayAuthprization record, @Param("example") EbaEbayAuthprizationExample example);

    int updateByExampleWithBLOBs(@Param("record") EbaEbayAuthprization record, @Param("example") EbaEbayAuthprizationExample example);

    int updateByExample(@Param("record") EbaEbayAuthprization record, @Param("example") EbaEbayAuthprizationExample example);

    int updateByPrimaryKeySelective(EbaEbayAuthprization record);

    int updateByPrimaryKeyWithBLOBs(EbaEbayAuthprization record);

    int updateByPrimaryKey(EbaEbayAuthprization record);
}