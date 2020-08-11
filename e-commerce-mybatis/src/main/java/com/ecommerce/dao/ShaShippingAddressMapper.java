package com.ecommerce.dao;

import com.ecommerce.pojo.ShaShippingAddress;
import com.ecommerce.pojo.ShaShippingAddressExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShaShippingAddressMapper {
    long countByExample(ShaShippingAddressExample example);

    int deleteByExample(ShaShippingAddressExample example);

    int insert(ShaShippingAddress record);

    int insertSelective(ShaShippingAddress record);

    List<ShaShippingAddress> selectByExample(ShaShippingAddressExample example);

    int updateByExampleSelective(@Param("record") ShaShippingAddress record, @Param("example") ShaShippingAddressExample example);

    int updateByExample(@Param("record") ShaShippingAddress record, @Param("example") ShaShippingAddressExample example);
}