package com.ecommerce.basicInfo.controller;

import com.ecommerce.basicInfo.vojo.bvoinfo.BVOEntryVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoInitVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.BVOInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.bvoinfo.GetBVOVO;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.basicInfo.service.BVOInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Api(value = "BVO-基本信息管理控制器", tags = "BVO-基本信息管理控制器")
@RestController
@RequestMapping("/bvoInfo")
public class BVOInfoController extends BaseController {

    @Autowired
    BVOInfoService bvoInfoService;


    @ApiOperation("找到BVO信息")
    @PostMapping("/getInfo")
    public CommonResult<BVOEntryVO> getInfo(@RequestBody GetBVOVO getBVOVO) {
        BVOEntryVO result = bvoInfoService.getBVO(getBVOVO);
        return CommonResult.success(result, "Match Successfully");
    }

    @ApiOperation("初始化BVO信息")
    @PutMapping("/initBVOInfo")
    public CommonResult initBVOInfo(@Validated({InsertGroup.class}) @RequestBody BVOInfoInitVO bvoInfoInitVO,
                                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.INSERT_FAIL.newInstance(this.getErrorResponse(bindingResult), bvoInfoInitVO.toString());
        } else {
            if (bvoInfoService.initBVOInfo(bvoInfoInitVO)) {
                return CommonResult.success("Add Successfully");
            } else {
                throw BusinessException.INSERT_FAIL;
            }
        }
    }

    @ApiOperation("更新BVO信息")
    @PatchMapping("/updateBVOInfo")
    public CommonResult updateBVOInfo(@Validated({UpdateGroup.class}) @RequestBody BVOInfoUpdateVO bvoInfoUpdateVO,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), bvoInfoUpdateVO.toString());
        } else {
            if (bvoInfoService.updateBVOInfo(bvoInfoUpdateVO)) {
                return CommonResult.success("Update Successfully");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }

}
