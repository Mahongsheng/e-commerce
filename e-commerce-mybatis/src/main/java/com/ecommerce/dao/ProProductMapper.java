package com.ecommerce.dao;

import com.ecommerce.dto.product.browse.ProductBrowseDTO;
import com.ecommerce.dto.product.browse.ProductDetailDTO;
import com.ecommerce.pojo.ProProduct;
import com.ecommerce.pojo.ProProductExample;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProductMapper {
    long countByExample(ProProductExample example);

    int deleteByExample(ProProductExample example);

    int deleteByPrimaryKey(Integer proId);

    int insert(ProProduct record);

    int insertSelective(ProProduct record);

    List<ProProduct> selectByExampleWithBLOBs(ProProductExample example);

    List<ProProduct> selectByExample(ProProductExample example);

    ProProduct selectByPrimaryKey(Integer proId);

    int updateByExampleSelective(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExample(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByPrimaryKeySelective(ProProduct record);

    int updateByPrimaryKeyWithBLOBs(ProProduct record);

    int updateByPrimaryKey(ProProduct record);

    List<ProductBrowseDTO> selectProByPrcCat(@Param("catId") Integer catId);

    ProductDetailDTO selectProDetailById(@Param("proId") Integer proId);
}