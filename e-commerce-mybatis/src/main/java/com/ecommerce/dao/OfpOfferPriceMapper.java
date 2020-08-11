package com.ecommerce.dao;

import com.ecommerce.pojo.OfpOfferPrice;
import com.ecommerce.pojo.OfpOfferPriceExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfpOfferPriceMapper {
    long countByExample(OfpOfferPriceExample example);

    int deleteByExample(OfpOfferPriceExample example);

    int deleteByPrimaryKey(Integer ofpId);

    int insert(OfpOfferPrice record);

    int insertSelective(OfpOfferPrice record);

    List<OfpOfferPrice> selectByExample(OfpOfferPriceExample example);

    OfpOfferPrice selectByPrimaryKey(Integer ofpId);

    int updateByExampleSelective(@Param("record") OfpOfferPrice record, @Param("example") OfpOfferPriceExample example);

    int updateByExample(@Param("record") OfpOfferPrice record, @Param("example") OfpOfferPriceExample example);

    int updateByPrimaryKeySelective(OfpOfferPrice record);

    int updateByPrimaryKey(OfpOfferPrice record);
}