package com.ecommerce.dao;

import com.ecommerce.pojo.WtrWalletTransactionRecord;
import com.ecommerce.pojo.WtrWalletTransactionRecordExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrWalletTransactionRecordMapper {
    long countByExample(WtrWalletTransactionRecordExample example);

    int deleteByExample(WtrWalletTransactionRecordExample example);

    int deleteByPrimaryKey(Integer transactionId);

    int insert(WtrWalletTransactionRecord record);

    int insertSelective(WtrWalletTransactionRecord record);

    List<WtrWalletTransactionRecord> selectByExample(WtrWalletTransactionRecordExample example);

    WtrWalletTransactionRecord selectByPrimaryKey(Integer transactionId);

    int updateByExampleSelective(@Param("record") WtrWalletTransactionRecord record, @Param("example") WtrWalletTransactionRecordExample example);

    int updateByExample(@Param("record") WtrWalletTransactionRecord record, @Param("example") WtrWalletTransactionRecordExample example);

    int updateByPrimaryKeySelective(WtrWalletTransactionRecord record);

    int updateByPrimaryKey(WtrWalletTransactionRecord record);
}