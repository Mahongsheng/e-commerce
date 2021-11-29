package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.pojo.WtaWalletTransactionAduit;
import com.ecommerce.mybatis.pojo.WtaWalletTransactionAduitExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtaWalletTransactionAduitMapper {
    long countByExample(WtaWalletTransactionAduitExample example);

    int deleteByExample(WtaWalletTransactionAduitExample example);

    int deleteByPrimaryKey(Integer transactionAuditId);

    int insert(WtaWalletTransactionAduit record);

    int insertSelective(WtaWalletTransactionAduit record);

    List<WtaWalletTransactionAduit> selectByExample(WtaWalletTransactionAduitExample example);

    WtaWalletTransactionAduit selectByPrimaryKey(Integer transactionAuditId);

    int updateByExampleSelective(@Param("record") WtaWalletTransactionAduit record, @Param("example") WtaWalletTransactionAduitExample example);

    int updateByExample(@Param("record") WtaWalletTransactionAduit record, @Param("example") WtaWalletTransactionAduitExample example);

    int updateByPrimaryKeySelective(WtaWalletTransactionAduit record);

    int updateByPrimaryKey(WtaWalletTransactionAduit record);
}