package com.ecommerce.basicInfo.service;

import com.ecommerce.basicInfo.vojo.company.CompanyEntryVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInitVO;
import com.ecommerce.basicInfo.vojo.company.GetCompanyVO;

public interface CompanyService {
    CompanyEntryVO getCompany(GetCompanyVO getCompanyVO);

    boolean initCompany(CompanyInitVO companyInitVO);

    boolean updateCompanyInfo(CompanyInfoUpdateVO companyInfoUpdateVO);
}
