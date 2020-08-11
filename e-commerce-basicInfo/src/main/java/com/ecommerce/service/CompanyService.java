package com.ecommerce.service;

import com.ecommerce.vojo.company.*;

public interface CompanyService {
    CompanyEntryVO getCompany(GetCompanyVO getCompanyVO);

    boolean initCompany(CompanyInitVO companyInitVO);

    boolean updateCompanyInfo(CompanyInfoUpdateVO companyInfoUpdateVO);
}
