package com.ecommerce.product.service;

import com.ecommerce.product.vojo.browse.OperateWishlistVO;
import com.ecommerce.product.vojo.browse.ProductBrowseWithCatVO;
import com.ecommerce.product.vojo.browse.ProductDetailVO;

import java.util.List;

public interface ProductBrowseService {

    // 获得数据接口
    List<ProductBrowseWithCatVO> getAllProductWithStatD();

    ProductDetailVO getProductInfoDetailById(Integer dsrId, Integer proId);

    boolean addToWishlist(OperateWishlistVO operateWishlistVO);

    boolean deleteFromWishlist(OperateWishlistVO operateWishlistVO);
}
