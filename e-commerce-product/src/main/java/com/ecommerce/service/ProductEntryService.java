package com.ecommerce.service;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.vojo.entry.*;

import java.util.List;

public interface ProductEntryService {

    CommonPage<ProductEntryVO> getAllProduct(GetAllProductVO getAllProductVO);

    CommonPage<ProductEntryVO> searchProductByTitle(SearchProductVO searchProductVO);

    boolean addProductInfo(ProductAddVO productAddVO);

    ProductAddVO getProductInfoWhenUpdate(Integer proId);

    boolean updateProductInfo(ProductUpdateVO productUpdateVO);

    boolean deleteProductInfo(Integer proId);

    boolean batchDeleteProductInfo(List<Integer> proIds);
}
