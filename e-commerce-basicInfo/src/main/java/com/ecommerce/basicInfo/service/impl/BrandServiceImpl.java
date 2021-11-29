package com.ecommerce.basicInfo.service.impl;

import com.ecommerce.basicInfo.service.BrandService;
import com.ecommerce.basicInfo.vojo.brand.BrandAddVO;
import com.ecommerce.basicInfo.vojo.brand.BrandEntryVO;
import com.ecommerce.basicInfo.vojo.brand.BrandUpdateVO;
import com.ecommerce.basicInfo.vojo.brand.GetAllBrandVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.BrdBrandMapper;
import com.ecommerce.mybatis.pojo.BrdBrand;
import com.ecommerce.mybatis.pojo.BrdBrandExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrdBrandMapper brdBrandMapper;


    @Override
    public CommonPage<BrandEntryVO> getAllBrand(GetAllBrandVO getAllBrandVO) {
        Page<BrdBrand> brandPage = PageHelper.startPage(getAllBrandVO.getPageNum(),
                getAllBrandVO.getPageSize()).doSelectPage(() -> {
            BrdBrandExample brdBrandExample = new BrdBrandExample();
            BrdBrandExample.Criteria criteria = brdBrandExample.createCriteria();
            criteria.andManIdEqualTo(getAllBrandVO.getManId());
            brdBrandMapper.selectByExample(brdBrandExample);
        });

        List<BrandEntryVO> result = new ArrayList<>();
        for (BrdBrand brand : brandPage.getResult()) {
            BrandEntryVO brandEntryVO = new BrandEntryVO();
            brandEntryVO.setBrdId(brand.getBrdId());
            brandEntryVO.setManId(brand.getManId());
            brandEntryVO.setNameEn(brand.getNameEn());
            brandEntryVO.setNameCn(brand.getNameCn());
            brandEntryVO.setRemark(brand.getRemark());
            brandEntryVO.setCallCnt(brand.getCallCnt());
            brandEntryVO.setCreatedBy(brand.getCreatedBy());
            brandEntryVO.setCreationDate(brand.getCreationDate());
            brandEntryVO.setLastUpdateBy(brand.getLastUpdateBy());
            brandEntryVO.setLastUpdateDate(brand.getLastUpdateDate());
            brandEntryVO.setStsCd(brand.getStsCd());
            result.add(brandEntryVO);
        }
        return CommonPage.restPage(result, brandPage);
    }

    @Override
    public boolean addBrandInfo(BrandAddVO brandAddVO) {
        BrdBrand brdBrand = new BrdBrand();
        brdBrand.setBrdId(brandAddVO.getBrdId());
        brdBrand.setCallCnt(brandAddVO.getCallCnt());
        brdBrand.setCreatedBy(brandAddVO.getCreatedBy());
        brdBrand.setCreationDate(new Date());
        brdBrand.setLastUpdateBy(brandAddVO.getLastUpdateBy());
        brdBrand.setLastUpdateDate(new Date());
        brdBrand.setManId(brandAddVO.getManId());
        brdBrand.setNameCn(brandAddVO.getNameCn());
        brdBrand.setNameEn(brandAddVO.getNameEn());
        brdBrand.setRemark(brandAddVO.getRemark());
        brdBrand.setStsCd(brandAddVO.getStsCd());
        brdBrandMapper.insertSelective(brdBrand);
        return true;
    }


    @Override
    public boolean updateBrandInfo(BrandUpdateVO brandUpdateVO) {
        BrdBrandExample brdBrandExample = new BrdBrandExample();
        BrdBrandExample.Criteria criteria = brdBrandExample.createCriteria();
        criteria.andBrdIdEqualTo(brandUpdateVO.getBrdId());

        BrdBrand brdBrand = new BrdBrand();
        brdBrand.setBrdId(brandUpdateVO.getBrdId());
        brdBrand.setCallCnt(brandUpdateVO.getCallCnt());
        brdBrand.setCreatedBy(brandUpdateVO.getCreatedBy());
        brdBrand.setCreationDate(brandUpdateVO.getCreationDate());
        brdBrand.setLastUpdateBy(brandUpdateVO.getLastUpdateBy());
        brdBrand.setLastUpdateDate(new Date());
        brdBrand.setManId(brandUpdateVO.getManId());
        brdBrand.setNameCn(brandUpdateVO.getNameCn());
        brdBrand.setNameEn(brandUpdateVO.getNameEn());
        brdBrand.setRemark(brandUpdateVO.getRemark());
        brdBrand.setStsCd(brandUpdateVO.getStsCd());
        
        brdBrandMapper.updateByExample(brdBrand,brdBrandExample);
        return true;
    }

    @Override
    public boolean deleteBrandInfo(Integer brdId) {
        brdBrandMapper.deleteByPrimaryKey(brdId);
        return true;
    }
}
