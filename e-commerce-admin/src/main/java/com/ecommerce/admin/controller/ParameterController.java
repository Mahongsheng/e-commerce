package com.ecommerce.admin.controller;

import com.ecommerce.admin.service.ParameterService;
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
@Api(value = "参数维护",tags = "参数控制类")
@CrossOrigin
@RestController
@RequestMapping("/parameter")
public class ParameterController extends BaseController {

    @Resource
    ParameterService parameterService;

    @ApiOperation(value = "新增参数")
    @PutMapping(value = "/addParameter")
    public CommonResult addParameter(@Validated({InsertGroup.class}) @RequestBody AddParameterVO addParameterVO, BindingResult result) throws BusinessException{
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),addParameterVO.toString());
        }
        if (!parameterService.add(addParameterVO)) {
            return CommonResult.failed("新增参数失败！");
        }else {
            return CommonResult.success("新增参数成功！");
        }
    }

    @ApiOperation("获取所有参数")
    @PostMapping("/getAllParInfo")
    public CommonResult<CommonPage<ParInfoVO>> getAllFlow(@Validated({SelectGroup.class}) @RequestBody PageVO pageVO, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), pageVO.toString());
        }
        CommonPage<ParInfoVO> commonPage = parameterService.getAllParInfo(pageVO);
        if (!commonPage.getList().isEmpty()) {
            return CommonResult.success(commonPage, "获取所有参数成功！");
        } else {
            return CommonResult.failed("后台暂无参数数据！");
        }
    }

    @ApiOperation(value = "模糊匹配参数")
    @PostMapping(value = "/searchPar")
    public CommonResult<CommonPage<ParInfoVO>> searchPar(@Validated({SelectGroup.class}) @RequestBody SearchParVO searchParVO, BindingResult result) throws BusinessException{
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),searchParVO.toString());
        }
        CommonPage<ParInfoVO> commonPage = parameterService.searchPar(searchParVO);
        if (!commonPage.getList().isEmpty()) {
            return CommonResult.success(commonPage, "模糊匹配参数成功！");
        } else {
            return CommonResult.failed("模糊匹配参数失败！");
        }
    }

    @ApiOperation(value = "修改前获取原参数记录")
    @GetMapping(value = "/getParWhenUpdate")
    public CommonResult<ParInfoVO> getParWhenUpdate(@RequestParam("parId") Integer parId) {
        ParInfoVO parInfoVO = parameterService.getParWhenUpdate(parId);
        if (parInfoVO == null){
            return CommonResult.failed("参数获取失败！");
        }
        return CommonResult.success(parInfoVO,"获取参数成功！");
    }

    @ApiOperation(value = "更新参数")
    @PostMapping(value = "/updatePar")
    public CommonResult updatePar(@Validated({UpdateGroup.class}) @RequestBody UpdateParVO updateParVO, BindingResult result)throws BusinessException {
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),updateParVO.toString());
        }
        if (!parameterService.updatePar(updateParVO)) {
            return CommonResult.failed("更新参数失败！");
        }else {
            return CommonResult.success("更新参数成功！");
        }
    }

    @ApiOperation(value = "删除参数")
    @DeleteMapping(value = "/deletePar")
    public CommonResult deletePar(@RequestParam("parId") Integer parId) {
        if (!parameterService.deletePar(parId)) {
            return CommonResult.failed("删除参数失败！");
        }else {
            return CommonResult.success("删除参数成功！");
        }
    }

    @ApiOperation(value = "批量删除参数")
    @PostMapping(value = "/batchDeletePar")
    public CommonResult batchDeletePar(@Validated({DeleteGroup.class}) @RequestBody List<Integer> parIds, BindingResult result)throws BusinessException {
        if (result.hasErrors()){
            throw new BusinessException().newInstance(this.getErrorResponse(result),parIds.toString());
        }
        if (!parameterService.batchDeletePar(parIds)) {
            return CommonResult.failed("批量删除参数失败！");
        }else {
            return CommonResult.success("批量删除参数成功！");
        }
    }

}
