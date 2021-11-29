package com.ecommerce.mybatis.dao;

import com.ecommerce.mybatis.dto.product.wishlist.ProductCatsDTO;
import com.ecommerce.mybatis.dto.product.wishlist.ProductWishlistDTO;
import com.ecommerce.mybatis.pojo.WitWishlist;
import com.ecommerce.mybatis.pojo.WitWishlistExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WitWishlistMapper {
    long countByExample(WitWishlistExample example);

    int deleteByExample(WitWishlistExample example);

    int deleteByPrimaryKey(Integer witId);

    int insert(WitWishlist record);

    int insertSelective(WitWishlist record);

    List<WitWishlist> selectByExample(WitWishlistExample example);

    WitWishlist selectByPrimaryKey(Integer witId);

    int updateByExampleSelective(@Param("record") WitWishlist record, @Param("example") WitWishlistExample example);

    int updateByExample(@Param("record") WitWishlist record, @Param("example") WitWishlistExample example);

    int updateByPrimaryKeySelective(WitWishlist record);

    int updateByPrimaryKey(WitWishlist record);

    int batchDeleteWishlist(@Param("dsrId") Integer dsrId, @Param("proIds") List<Integer> proIds);

    List<ProductWishlistDTO> getWishlistByIdAndCat(@Param("dsrId") Integer dsrId, @Param("catId") Integer catId);

    List<ProductWishlistDTO> getWishlistByIdNoCat(@Param("dsrId") Integer dsrId);

    List<ProductCatsDTO> getAllCatFromWishlist(@Param("dsrId") Integer dsrId);
}