package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.PdnProductDescription;
import com.ecommerce.mybatis.pojo.PdnProductDescriptionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PdnProductDescriptionMapper {
    long countByExample(PdnProductDescriptionExample example);

    int deleteByExample(PdnProductDescriptionExample example);

    int deleteByPrimaryKey(Integer pdnId);

    int insert(PdnProductDescription record);

    int insertSelective(PdnProductDescription record);

    List<PdnProductDescription> selectByExampleWithBLOBs(PdnProductDescriptionExample example);

    List<PdnProductDescription> selectByExample(PdnProductDescriptionExample example);

    PdnProductDescription selectByPrimaryKey(Integer pdnId);

    int updateByExampleSelective(@Param("record") PdnProductDescription record, @Param("example") PdnProductDescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") PdnProductDescription record, @Param("example") PdnProductDescriptionExample example);

    int updateByExample(@Param("record") PdnProductDescription record, @Param("example") PdnProductDescriptionExample example);

    int updateByPrimaryKeySelective(PdnProductDescription record);

    int updateByPrimaryKeyWithBLOBs(PdnProductDescription record);

    int updateByPrimaryKey(PdnProductDescription record);
}