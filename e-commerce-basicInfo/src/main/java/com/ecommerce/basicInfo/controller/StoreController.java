package com.ecommerce.basicInfo.controller;

import com.ecommerce.basicInfo.vojo.store.EbaVO;
import com.ecommerce.basicInfo.vojo.store.GetStoreVO;
import com.ecommerce.basicInfo.vojo.store.StoreAddVO;
import com.ecommerce.basicInfo.vojo.store.StoreEntryVO;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.basicInfo.service.StoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Api(value = "BVO-店铺管理控制器", tags = "BVO-店铺管理控制器")
@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @ApiOperation("通过dsrId获得str对象列表")
    @PostMapping("/getStores")
    public CommonResult<CommonPage<StoreEntryVO>> getStores(@RequestBody GetStoreVO getStoreVO) {
        CommonPage<StoreEntryVO> result = storeService.getStore(getStoreVO);
        if (!result.getList().isEmpty()) {
            return CommonResult.success(result, "Match Successfully");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("插入网店信息")
    @PutMapping("/insertStr")
    public CommonResult<Boolean> insertStr(@RequestBody StoreAddVO storeAddVO) {
        if (storeService.insertStrStore(storeAddVO)) {
            return CommonResult.success(true, "插入成功");
        } else {
            throw BusinessException.INSERT_FAIL;
        }
    }

    @ApiOperation("插入网店授权记录信息")
    @PutMapping("/insertEba")
    public CommonResult<Boolean> insertEba(@RequestBody EbaVO ebaVO) {
        boolean result = storeService.insertEba(ebaVO);
        if (result) {
            return CommonResult.success(result, "插入成功");
        } else {
            throw BusinessException.INSERT_FAIL;
        }
    }
}
