package com.ecommerce.basicInfo.service.impl;

import com.ecommerce.basicInfo.service.CompanyService;
import com.ecommerce.basicInfo.vojo.company.CompanyEntryVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInitVO;
import com.ecommerce.basicInfo.vojo.company.GetCompanyVO;
import com.ecommerce.mybatis.dao.ManManufacturerMapper;
import com.ecommerce.mybatis.pojo.ManManufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    ManManufacturerMapper manManufacturerMapper;

    @Override
    public CompanyEntryVO getCompany(GetCompanyVO getCompanyVO) {
        ManManufacturer manManufacturer = manManufacturerMapper.selectByPrimaryKey(getCompanyVO.getManId());

        CompanyEntryVO companyEntryVO = new CompanyEntryVO();
        companyEntryVO.setGmcReportType(manManufacturer.getGmcReportType());
        companyEntryVO.setGmcReportUrl(manManufacturer.getGmcReportUrl());
        companyEntryVO.setManId(manManufacturer.getManId());
        companyEntryVO.setNameCn(manManufacturer.getNameCn());
        companyEntryVO.setNameEn(manManufacturer.getNameEn());
        companyEntryVO.setDescription(manManufacturer.getDescription());

        return companyEntryVO;
    }

    @Override
    public boolean initCompany(CompanyInitVO companyInitVO) {
        ManManufacturer manManufacturer = new ManManufacturer();
        manManufacturer.setGmcReportType(companyInitVO.getGmcReportType());
        manManufacturer.setGmcReportUrl(companyInitVO.getGmcReportUrl());
        manManufacturer.setManId(companyInitVO.getManId());
        manManufacturer.setNameCn(companyInitVO.getNameCn());
        manManufacturer.setNameEn(companyInitVO.getNameEn());
        manManufacturer.setCallCnt(companyInitVO.getCallCnt());
        manManufacturer.setCreatedBy(companyInitVO.getCreatedBy());
        manManufacturer.setCreationDate(new Date());
        manManufacturer.setDescription(companyInitVO.getDescription());
        manManufacturer.setLastUpdateBy(companyInitVO.getLastUpdateBy());
        manManufacturer.setLastUpdateDate(new Date());
        manManufacturer.setRemark(companyInitVO.getRemark());
        manManufacturer.setStsCd(companyInitVO.getStsCd());

        manManufacturerMapper.insertSelective(manManufacturer);
        return true;

    }

    @Override
    public boolean updateCompanyInfo(CompanyInfoUpdateVO companyInfoUpdateVO) {
//        ManManufacturerExample manManufacturerExample = new ManManufacturerExample();
//        ManManufacturerExample.Criteria criteria = manManufacturerExample.createCriteria();
//        criteria.andManIdEqualTo(companyInfoUpdateVO.getManId());

        ManManufacturer manManufacturer = new ManManufacturer();
        manManufacturer.setGmcReportType(companyInfoUpdateVO.getGmcReportType());
        manManufacturer.setGmcReportUrl(companyInfoUpdateVO.getGmcReportUrl());
        manManufacturer.setManId(companyInfoUpdateVO.getManId());
        manManufacturer.setNameCn(companyInfoUpdateVO.getNameCn());
        manManufacturer.setNameEn(companyInfoUpdateVO.getNameEn());
        manManufacturer.setCallCnt(companyInfoUpdateVO.getCallCnt());
        manManufacturer.setCreatedBy(companyInfoUpdateVO.getCreatedBy());
        manManufacturer.setCreationDate(new Date());
        manManufacturer.setDescription(companyInfoUpdateVO.getDescription());
        manManufacturer.setLastUpdateBy(companyInfoUpdateVO.getLastUpdateBy());
        manManufacturer.setLastUpdateDate(new Date());
        manManufacturer.setRemark(companyInfoUpdateVO.getRemark());
        manManufacturer.setStsCd(companyInfoUpdateVO.getStsCd());

        manManufacturerMapper.updateByPrimaryKeyWithBLOBs(manManufacturer);
//        manManufacturerMapper.updateByExampleSelective(manManufacturer, manManufacturerExample);
        return true;
    }
}
