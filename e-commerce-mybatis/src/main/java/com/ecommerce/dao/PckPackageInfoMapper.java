package com.ecommerce.dao;

import com.ecommerce.pojo.PckPackageInfo;
import com.ecommerce.pojo.PckPackageInfoExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PckPackageInfoMapper {
    long countByExample(PckPackageInfoExample example);

    int deleteByExample(PckPackageInfoExample example);

    int deleteByPrimaryKey(Integer pckId);

    int insert(PckPackageInfo record);

    int insertSelective(PckPackageInfo record);

    List<PckPackageInfo> selectByExample(PckPackageInfoExample example);

    PckPackageInfo selectByPrimaryKey(Integer pckId);

    int updateByExampleSelective(@Param("record") PckPackageInfo record, @Param("example") PckPackageInfoExample example);

    int updateByExample(@Param("record") PckPackageInfo record, @Param("example") PckPackageInfoExample example);

    int updateByPrimaryKeySelective(PckPackageInfo record);

    int updateByPrimaryKey(PckPackageInfo record);

    int deletePackageInfoByList(@Param("proIds")List<Integer> proIds);

}