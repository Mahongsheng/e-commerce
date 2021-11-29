package com.ecommerce.admin.controller;

import com.ecommerce.admin.service.DataDictionaryService;
import com.ecommerce.admin.vojo.*;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.DeleteGroup;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yousabla
 */
@Api(value = "数据字典维护",tags = "数据字典控制类")
@CrossOrigin
@RestController
@RequestMapping("/dataDictionary")
public class DataDictionaryController extends BaseController {

    @Resource
    DataDictionaryService dataDictionaryService;

    @ApiOperation(value = "新增数据字典")
    @PutMapping(value = "/addCdmInfo")
    public CommonResult addCdmInfo(@Validated({InsertGroup.class}) @RequestBody AddCdmVO addCdmVO, BindingResult result)throws BusinessException {
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),addCdmVO.toString());
        }
        if (!dataDictionaryService.add(addCdmVO)) {
            return CommonResult.failed("新增数据字典失败！");
        }else {
            return CommonResult.success("新增数据字典成功！");
        }
    }

    @ApiOperation("获取所有数据字典")
    @PostMapping("/getAllCdmInfo")
    public CommonResult<CommonPage<CdmInfoVO>> getAllCdmInfo(@Validated({SelectGroup.class}) @RequestBody PageVO pageVO, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), pageVO.toString());
        }
        CommonPage<CdmInfoVO> commonPage = dataDictionaryService.getAllCdmInfo(pageVO);
        if (!commonPage.getList().isEmpty()) {
            return CommonResult.success(commonPage, "获取所有数据字典成功！");
        } else {
            return CommonResult.failed("后台当前无数据字典！");
        }
    }

    @ApiOperation(value = "模糊匹配数据字典")
    @PostMapping(value = "/searchCdm")
    public CommonResult<CommonPage<CdmInfoVO>> searchCdm(@Validated({SelectGroup.class}) @RequestBody SearchCdmVO searchCdmVO, BindingResult result) {
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),searchCdmVO.toString());
        }
        CommonPage<CdmInfoVO> commonPage = dataDictionaryService.searchCdm(searchCdmVO);
        if (!commonPage.getList().isEmpty()) {
            return CommonResult.success(commonPage, "模糊匹配数据字典成功！");
        } else {
            return CommonResult.failed("数据字典不存在！");
        }
    }

    @ApiOperation(value = "修改前获取原数据字典记录")
    @GetMapping(value = "/getCdmWhenUpdate")
    public CommonResult<CdmInfoVO> getCdmWhenUpdate(@RequestParam("cdmId") Integer cdmId) {
        CdmInfoVO cdmInfoVO = dataDictionaryService.getCdmWhenUpdate(cdmId);
        if (cdmInfoVO == null) {
            return CommonResult.failed("数据字典不存在！");
        }
        return CommonResult.success(cdmInfoVO,"数据字典获取成功！");
    }

    @ApiOperation(value = "更新数据字典")
    @PostMapping(value = "/updateCdm")
    public CommonResult updateCdm(@Validated({UpdateGroup.class}) @RequestBody UpdateCdmVO updateCdmVO, BindingResult result) {
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),updateCdmVO.toString());
        }
        if (!dataDictionaryService.updateCdm(updateCdmVO)) {
            return CommonResult.failed("更新数据字典失败！");
        }else {
            return CommonResult.success("更新数据字典成功！");
        }
    }

    @ApiOperation(value = "删除数据字典")
    @DeleteMapping(value = "/deleteCdm")
    public CommonResult deleteCdm(@RequestParam("cdmId") Integer cdmId) {
        if (!dataDictionaryService.deleteCdm(cdmId)) {
            return CommonResult.failed("删除数据字典失败！");
        }else {
            return CommonResult.success("删除数据字典成功！");
        }
    }

    @ApiOperation(value = "批量删除数据字典")
    @PostMapping(value = "/batchDeleteCdm")
    public CommonResult batchDeleteCdm(@Validated({DeleteGroup.class})@RequestBody List<Integer> cdmIds,BindingResult result) throws BusinessException{
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),cdmIds.toString());
        }
        if (!dataDictionaryService.batchDeleteCdm(cdmIds)) {
            return CommonResult.failed("批量删除数据字典失败！");
        }else {
            return CommonResult.success("批量删除数据字典成功！");
        }
    }
}
