package com.ecommerce.basicInfo.service.impl;

import com.ecommerce.basicInfo.service.StoreService;
import com.ecommerce.basicInfo.vojo.store.*;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.dao.DsrDropshipperMapper;
import com.ecommerce.mybatis.dao.EbaEbayAuthprizationMapper;
import com.ecommerce.mybatis.dao.StrStoreMapper;
import com.ecommerce.mybatis.dao.SysUserMapper;
import com.ecommerce.mybatis.pojo.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StrStoreMapper strStoreMapper;
    @Autowired
    private DsrDropshipperMapper dsrDropshipperMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private EbaEbayAuthprizationMapper ebaEbayAuthprizationMapper;

    @Override
    public CommonPage<StoreEntryVO> getStore(GetStoreVO getStoreVO){
        Page<StrStore> storePage = PageHelper.startPage(getStoreVO.getPageNum(),
                getStoreVO.getPageSize()).doSelectPage(() -> {
            StrStoreExample strStoreExample = new StrStoreExample();
            StrStoreExample.Criteria criteria = strStoreExample.createCriteria();
            criteria.andDsrIdEqualTo(getStoreVO.getDsrId());
            strStoreMapper.selectByExample(strStoreExample);
        });

        List<StoreEntryVO> result = new ArrayList<>();
        for (StrStore store : storePage.getResult()) {
            StoreEntryVO storeEntryVO = new StoreEntryVO();
            storeEntryVO.setStrId(store.getStrId());
            storeEntryVO.setDsrId(store.getDsrId());
            storeEntryVO.setPlatformType(store.getPlatformType());
            storeEntryVO.setStoreName(store.getStoreName());
            result.add(storeEntryVO);
        }
        return CommonPage.restPage(result, storePage);
    }

    @Override
    public boolean addDsr(DsrVO dsrVO){
        DsrDropshipper tempDsr = new DsrDropshipper();
        tempDsr.setName(dsrVO.getName());
        tempDsr.setCreatedBy(dsrVO.getCreatedBy());
        tempDsr.setCreationDate(dsrVO.getCreationDate());
        tempDsr.setDsrId(dsrVO.getDsrId());
        if(dsrDropshipperMapper.insert(tempDsr) > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<StrStore> getStrsByDsrId(int dsrId){
        StrStoreExample strStoreExample = new StrStoreExample();
        StrStoreExample.Criteria criteria = strStoreExample.createCriteria();
        criteria.andDsrIdEqualTo(dsrId);
        return strStoreMapper.selectByExample(strStoreExample);
    }

    @Override
    //更新sys_user表
    public boolean updateSysUser(SysUserVO sysUserVO){
        SysUser sysUser = new SysUser();
        sysUser.setManBuyerId(sysUserVO.getManBuyerId());
        sysUser.setUsername(sysUserVO.getUserName());
        sysUser.setPassword(sysUserVO.getPassWord());
        int result = sysUserMapper.insert(sysUser);
        if(result > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    //插入网店信息
    public boolean insertStrStore(StoreAddVO storeAddVO){
        StrStore strStore = new StrStore();
        strStore.setCallCnt(storeAddVO.getCallCnt());
        strStore.setCreatedBy(storeAddVO.getCreatedBy());
        strStore.setCreationDate(new Date());
        strStore.setDsrId(storeAddVO.getDsrId());
        strStore.setLastUpdateBy(storeAddVO.getLastUpdateBy());
        strStore.setLastUpdateDate(new Date());
        strStore.setPlatformType(storeAddVO.getPlatformType());
        strStore.setRemark(storeAddVO.getRemark());
        strStore.setStoreName(storeAddVO.getStoreName());
        strStore.setStoreStsCd(storeAddVO.getStoreStsCd());
        if(storeAddVO.getStrId() != 0 && storeAddVO.getStrId() != null){
            strStore.setStrId(storeAddVO.getStrId());
        }
        strStore.setStsCd(storeAddVO.getStsCd());
        int result = strStoreMapper.insert(strStore);
        if(result > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    //插入eba信息
    public boolean insertEba(EbaVO ebaVO){
        EbaEbayAuthprization ebaEbayAuthprization = new EbaEbayAuthprization();
        ebaEbayAuthprization.setAccountId(ebaVO.getAccountId());
        ebaEbayAuthprization.setAppId(ebaVO.getAppId());
        ebaEbayAuthprization.setCallCnt(ebaVO.getCallCnt());
        ebaEbayAuthprization.setCancelDate(ebaVO.getCancelDate());
        ebaEbayAuthprization.setCreatedBy(ebaVO.getCreatedBy());
        ebaEbayAuthprization.setCreationDate(ebaVO.getCreationDate());
        if(ebaVO.getEbaId() != 0 && ebaVO.getEbaId() != null){
            ebaEbayAuthprization.setEbaId(ebaVO.getEbaId());
        }
        ebaEbayAuthprization.setExpDate(ebaVO.getExpDate());
        ebaEbayAuthprization.setLastModifiedTime(ebaVO.getLastModifiedTime());
        ebaEbayAuthprization.setLastUpdateBy(ebaVO.getLastUpdateBy());
        ebaEbayAuthprization.setLastUpdateDate(ebaVO.getLastUpdateDate());
        ebaEbayAuthprization.setRemark(ebaVO.getRemark());
        ebaEbayAuthprization.setSecretKey(ebaVO.getSecretKey());
        ebaEbayAuthprization.setStrId(ebaVO.getStrId());
        ebaEbayAuthprization.setStsCd(ebaVO.getStsCd());
        ebaEbayAuthprization.setToken(ebaVO.getToken());

        int result = ebaEbayAuthprizationMapper.insert(ebaEbayAuthprization);
        if(result == 1){
            return true;
        }else {
            return false;
        }
    }
}
