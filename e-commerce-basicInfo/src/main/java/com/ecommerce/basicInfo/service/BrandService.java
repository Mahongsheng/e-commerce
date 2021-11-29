package com.ecommerce.basicInfo.service;

import com.ecommerce.basicInfo.vojo.brand.BrandAddVO;
import com.ecommerce.basicInfo.vojo.brand.BrandEntryVO;
import com.ecommerce.basicInfo.vojo.brand.BrandUpdateVO;
import com.ecommerce.basicInfo.vojo.brand.GetAllBrandVO;
import com.ecommerce.common.base.CommonPage;

public interface BrandService {
    CommonPage<BrandEntryVO> getAllBrand(GetAllBrandVO getAllBrandVO);

    boolean addBrandInfo(BrandAddVO brandAddVO);

    boolean updateBrandInfo(BrandUpdateVO brandUpdateVO);

    boolean deleteBrandInfo(Integer brdId);
}
