package com.ecommerce.basicInfo.service.impl;

import com.ecommerce.basicInfo.service.BVOInfoService;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOEntryVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoInitVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.GetBVOVO;
import com.ecommerce.mybatis.dao.DsrDropshipperMapper;
import com.ecommerce.mybatis.pojo.DsrDropshipper;
import com.ecommerce.mybatis.pojo.DsrDropshipperExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BVOInfoServiceImpl implements BVOInfoService {

    @Autowired
    DsrDropshipperMapper dsrDropshipperMapper;

    @Override
    public BVOEntryVO getBVO(GetBVOVO getBVOVO) {
        DsrDropshipperExample dsrDropshipperExample = new DsrDropshipperExample();
        DsrDropshipperExample.Criteria criteria = dsrDropshipperExample.createCriteria();
        criteria.andDsrIdEqualTo(getBVOVO.getDsrId());
        DsrDropshipper dsrDropshipper = dsrDropshipperMapper.
                selectByExample(dsrDropshipperExample).get(0);

        BVOEntryVO bvoEntryVO = new BVOEntryVO();
        bvoEntryVO.setDsrId(dsrDropshipper.getDsrId());
        bvoEntryVO.setEmail(dsrDropshipper.getEmail());
        bvoEntryVO.setName(dsrDropshipper.getName());
        bvoEntryVO.setPhoneNumber(dsrDropshipper.getPhoneNumber());

        return bvoEntryVO;
    }

    @Override
    public boolean initBVOInfo(BVOInfoInitVO bvoInfoInitVO) {
        DsrDropshipper dsrDropshipper = new DsrDropshipper();
        dsrDropshipper.setDsrId(bvoInfoInitVO.getDsrId());
        dsrDropshipper.setEmail(bvoInfoInitVO.getEmail());
        dsrDropshipper.setName(bvoInfoInitVO.getName());
        dsrDropshipper.setPhoneNumber(bvoInfoInitVO.getPhoneNumber());
        dsrDropshipper.setCallCnt(bvoInfoInitVO.getCallCnt());
        dsrDropshipper.setCreatedBy(bvoInfoInitVO.getCreatedBy());
        dsrDropshipper.setCreationDate(new Date());
        dsrDropshipper.setLastUpdateBy(bvoInfoInitVO.getLastUpdateBy());
        dsrDropshipper.setLastUpdateDate(new Date());
        dsrDropshipper.setRegisterDate(bvoInfoInitVO.getRegisterDate());
        dsrDropshipper.setRemark(bvoInfoInitVO.getRemark());
        dsrDropshipper.setStsCd(bvoInfoInitVO.getStsCd());

        dsrDropshipperMapper.insertSelective(dsrDropshipper);
        return true;
    }

    @Override
    public boolean updateBVOInfo(BVOInfoUpdateVO bvoInfoUpdateVO) {
        DsrDropshipperExample dsrDropshipperExample = new DsrDropshipperExample();
        DsrDropshipperExample.Criteria criteria = dsrDropshipperExample.createCriteria();
        criteria.andDsrIdEqualTo(bvoInfoUpdateVO.getDsrId());

        DsrDropshipper dsrDropshipper = new DsrDropshipper();
        dsrDropshipper.setDsrId(bvoInfoUpdateVO.getDsrId());
        dsrDropshipper.setEmail(bvoInfoUpdateVO.getEmail());
        dsrDropshipper.setName(bvoInfoUpdateVO.getName());
        dsrDropshipper.setPhoneNumber(bvoInfoUpdateVO.getPhoneNumber());
        dsrDropshipper.setCallCnt(bvoInfoUpdateVO.getCallCnt());
        dsrDropshipper.setCreatedBy(bvoInfoUpdateVO.getCreatedBy());
        dsrDropshipper.setCreationDate(bvoInfoUpdateVO.getCreationDate());
        dsrDropshipper.setLastUpdateBy(bvoInfoUpdateVO.getLastUpdateBy());
        dsrDropshipper.setLastUpdateDate(new Date());
        dsrDropshipper.setRegisterDate(bvoInfoUpdateVO.getRegisterDate());
        dsrDropshipper.setRemark(bvoInfoUpdateVO.getRemark());
        dsrDropshipper.setStsCd(bvoInfoUpdateVO.getStsCd());

        dsrDropshipperMapper.updateByExampleSelective(dsrDropshipper, dsrDropshipperExample);

        return true;
    }
}
