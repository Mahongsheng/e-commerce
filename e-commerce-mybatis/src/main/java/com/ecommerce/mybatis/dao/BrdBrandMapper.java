package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.BrdBrand;
import com.ecommerce.mybatis.pojo.BrdBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrdBrandMapper {
    long countByExample(BrdBrandExample example);

    int deleteByExample(BrdBrandExample example);

    int deleteByPrimaryKey(Integer brdId);

    int insert(BrdBrand record);

    int insertSelective(BrdBrand record);

    List<BrdBrand> selectByExample(BrdBrandExample example);

    BrdBrand selectByPrimaryKey(Integer brdId);

    int updateByExampleSelective(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByExample(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByPrimaryKeySelective(BrdBrand record);

    int updateByPrimaryKey(BrdBrand record);
}