package com.ecommerce.basicInfo.controller;

import com.ecommerce.basicInfo.vojo.company.CompanyEntryVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInfoUpdateVO;
import com.ecommerce.basicInfo.vojo.company.CompanyInitVO;
import com.ecommerce.basicInfo.vojo.company.GetCompanyVO;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.basicInfo.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Api(value = "MVO-公司信息管理控制器", tags = "MVO-公司信息管理控制器")
@RestController
@RequestMapping("/man")
public class CompanyController extends BaseController {

    @Autowired
    CompanyService companyService;


    @ApiOperation("找到公司信息")
    @PostMapping("/getCompany")
    public CommonResult<CompanyEntryVO> getCompany(@RequestBody GetCompanyVO getCompanyVO) {
        CompanyEntryVO result = companyService.getCompany(getCompanyVO);
        return CommonResult.success(result, "Match Successfully");
    }

    @ApiOperation("初始化公司信息")
    @PutMapping("/initMan")
    public CommonResult initCompany(@Validated({InsertGroup.class}) @RequestBody CompanyInitVO companyInitVO,
                                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.INSERT_FAIL.newInstance(this.getErrorResponse(bindingResult), companyInitVO.toString());
        } else {
            if (companyService.initCompany(companyInitVO)) {
                return CommonResult.success("Add Successfully");
            } else {
                throw BusinessException.INSERT_FAIL;
            }
        }
    }

    @ApiOperation("更新公司信息")
    @PatchMapping("/updateMan")
    public CommonResult updateCompany(@Validated({UpdateGroup.class}) @RequestBody CompanyInfoUpdateVO companyInfoUpdateVO,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), companyInfoUpdateVO.toString());
        } else {
            if (companyService.updateCompanyInfo(companyInfoUpdateVO)) {
                return CommonResult.success("Update Successfully");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }
}
