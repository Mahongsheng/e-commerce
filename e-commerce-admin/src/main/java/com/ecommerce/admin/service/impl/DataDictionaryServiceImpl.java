package com.ecommerce.admin.service.impl;

import com.ecommerce.admin.service.DataDictionaryService;
import com.ecommerce.admin.vojo.*;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.CdmCodeMasterMapper;
import com.ecommerce.mybatis.pojo.CdmCodeMaster;
import com.ecommerce.mybatis.pojo.CdmCodeMasterExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yousabla
 */
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Resource
    CdmCodeMasterMapper cdmCodeMasterMapper;

    @Override
    public boolean add(AddCdmVO addCdmVO){
        CdmCodeMaster cdmCodeMaster = new CdmCodeMaster();
        cdmCodeMaster.setTypeCd(addCdmVO.getCdmCd());
        cdmCodeMaster.setCodeType(addCdmVO.getCdmType());
        cdmCodeMaster.setCodeVal(addCdmVO.getCdmValue());
        cdmCodeMaster.setCreatedBy(addCdmVO.getUserId());
        cdmCodeMaster.setCreationDate(new Date());
        cdmCodeMaster.setDescription(addCdmVO.getDescription());
        return cdmCodeMasterMapper.insertSelective(cdmCodeMaster) == 1;
    }

    private List<CdmInfoVO> convert(Page<CdmCodeMaster> flowPage){
        List<CdmInfoVO> infos = new ArrayList<>();
        flowPage.getResult().forEach(cdmCodeMaster -> {
            CdmInfoVO cdmInfoVO = new CdmInfoVO();
            cdmInfoVO.setCdmId(cdmCodeMaster.getCdmId());
            cdmInfoVO.setCdmCd(cdmCodeMaster.getCodeType());
            cdmInfoVO.setCdmValue(cdmCodeMaster.getCodeVal());
            cdmInfoVO.setCdmType(cdmCodeMaster.getCodeType());
            cdmInfoVO.setDescription(cdmCodeMaster.getDescription());
            infos.add(cdmInfoVO);
        });
        return infos;
    }

    @Override
    public CommonPage<CdmInfoVO> getAllCdmInfo(PageVO pageVO) {
        Page<CdmCodeMaster> flowPage = PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize()).doSelectPage(() -> {
            CdmCodeMasterExample example = new CdmCodeMasterExample();
            cdmCodeMasterMapper.selectByExample(example);
        });
        return CommonPage.restPage(convert(flowPage),flowPage);
    }

    @Override
    public CommonPage<CdmInfoVO> searchCdm(SearchCdmVO searchCdmVO) {
        Page<CdmCodeMaster> flowPage = PageHelper.startPage(searchCdmVO.getPageNum(), searchCdmVO.getPageSize()).doSelectPage(() -> {
            CdmCodeMasterExample example = new CdmCodeMasterExample();
            example.createCriteria().andCodeTypeLike("%" + searchCdmVO.getCdmType() + "%");
            cdmCodeMasterMapper.selectByExample(example);
        });
        return CommonPage.restPage(convert(flowPage),flowPage);
    }

    @Override
    public CdmInfoVO getCdmWhenUpdate(Integer parId){
        CdmCodeMaster cdmCodeMaster = cdmCodeMasterMapper.selectByPrimaryKey(parId);
        if (cdmCodeMaster == null) {
            return null;
        }
        CdmInfoVO cdmInfoVO = new CdmInfoVO();
        cdmInfoVO.setCdmId(cdmCodeMaster.getCdmId());
        cdmInfoVO.setCdmCd(cdmCodeMaster.getCodeType());
        cdmInfoVO.setCdmValue(cdmCodeMaster.getCodeVal());
        cdmInfoVO.setCdmType(cdmCodeMaster.getCodeType());
        cdmInfoVO.setDescription(cdmCodeMaster.getDescription());
        return cdmInfoVO;
    }

    @Override
    public Boolean updateCdm(UpdateCdmVO updateCdmVO){
        CdmCodeMaster cdmCodeMaster = cdmCodeMasterMapper.selectByPrimaryKey(updateCdmVO.getCdmId());
        if (cdmCodeMaster == null) {
            return false;
        }
        cdmCodeMaster.setCdmId(updateCdmVO.getCdmId());
        cdmCodeMaster.setTypeCd(updateCdmVO.getCdmCd());
        cdmCodeMaster.setCodeVal(updateCdmVO.getCdmValue());
        cdmCodeMaster.setCodeType(updateCdmVO.getCdmType());
        cdmCodeMaster.setDescription(updateCdmVO.getDescription());
        cdmCodeMaster.setLastUpdateBy(updateCdmVO.getUserId());
        cdmCodeMaster.setLastUpdateDate(new Date());
        return cdmCodeMasterMapper.updateByPrimaryKeySelective(cdmCodeMaster) >= 0;
    }

    @Override
    public Boolean deleteCdm(Integer cdmId){
        return cdmCodeMasterMapper.deleteByPrimaryKey(cdmId) >= 0;
    }

    @Override
    public Boolean batchDeleteCdm(List<Integer> cdmIds){
        CdmCodeMasterExample example = new CdmCodeMasterExample();
        example.createCriteria().andCdmIdIn(cdmIds);
        return cdmCodeMasterMapper.deleteByExample(example) == cdmIds.size();
    }
}
