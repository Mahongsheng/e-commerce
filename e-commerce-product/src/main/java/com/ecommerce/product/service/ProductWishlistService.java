package com.ecommerce.product.service;

import com.ecommerce.mybatis.dto.product.wishlist.ProductCatsDTO;
import com.ecommerce.mybatis.dto.product.wishlist.ProductWishlistDTO;

import java.util.List;

public interface ProductWishlistService {

    List<ProductCatsDTO> getAllCatFromWishlist(Integer dsrId);

    List<ProductWishlistDTO> getWishlistByIdAndCat(Integer dsrId, Integer catId);

    boolean deleteProFromWit(Integer dsrId, Integer proId);

    boolean batchDeleteProFromWit(Integer dsrId, List<Integer> proIds);
}
