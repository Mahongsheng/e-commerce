package com.ecommerce.basicInfo.service;

import com.ecommerce.basicInfo.vojo.store.*;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.mybatis.pojo.StrStore;

import java.util.List;

public interface StoreService {
    CommonPage<StoreEntryVO> getStore(GetStoreVO getStoreVO);

//    boolean addStore(StoreAddVO storeAddVO);

    boolean addDsr(DsrVO dsrVO);

    //根据dsrId获得对应的str对象列表
    List<StrStore> getStrsByDsrId(int dsrId);

    //更新sys_user表
    boolean updateSysUser(SysUserVO sysUserVO);

    //插入网店信息
    boolean insertStrStore(StoreAddVO storeAddVO);

    //插入eba信息
    boolean insertEba(EbaVO ebaVO);
}
