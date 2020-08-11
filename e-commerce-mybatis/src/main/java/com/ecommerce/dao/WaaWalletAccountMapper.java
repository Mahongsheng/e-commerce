package com.ecommerce.dao;

import com.ecommerce.pojo.WaaWalletAccount;
import com.ecommerce.pojo.WaaWalletAccountExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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