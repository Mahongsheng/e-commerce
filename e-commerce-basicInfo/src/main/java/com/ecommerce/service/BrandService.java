package com.ecommerce.service;

import com.ecommerce.common.base.CommonPage;
import com.ecommerce.vojo.brand.*;

public interface BrandService {
    CommonPage<BrandEntryVO> getAllBrand(GetAllBrandVO getAllBrandVO);

    boolean addBrandInfo(BrandAddVO brandAddVO);

    boolean updateBrandInfo(BrandUpdateVO brandUpdateVO);

    boolean deleteBrandInfo(Integer brdId);
}
