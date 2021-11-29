package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.WaaWalletAccount;
import com.ecommerce.mybatis.pojo.WaaWalletAccountExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaaWalletAccountMapper {
    long countByExample(WaaWalletAccountExample example);

    int deleteByExample(WaaWalletAccountExample example);

    int deleteByPrimaryKey(Integer buyerId);

    int insert(WaaWalletAccount record);

    int insertSelective(WaaWalletAccount record);

    List<WaaWalletAccount> selectByExample(WaaWalletAccountExample example);

    WaaWalletAccount selectByPrimaryKey(Integer buyerId);

    int updateByExampleSelective(@Param("record") WaaWalletAccount record, @Param("example") WaaWalletAccountExample example);

    int updateByExample(@Param("record") WaaWalletAccount record, @Param("example") WaaWalletAccountExample example);

    int updateByPrimaryKeySelective(WaaWalletAccount record);

    int updateByPrimaryKey(WaaWalletAccount record);

    Integer getIdByName(@Param("accountName")String accountName);
}