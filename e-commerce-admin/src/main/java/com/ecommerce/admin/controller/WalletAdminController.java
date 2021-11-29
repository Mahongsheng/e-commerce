package com.ecommerce.admin.controller;

import com.ecommerce.admin.vojo.PageVO;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.admin.service.WalletAdminService;
import com.ecommerce.admin.vojo.WalletAdminVO;
import com.ecommerce.admin.vojo.WalletAuditVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员-钱包流水控制类
 * Created by yousabla on 2020/7/5.
 */

@Api(value = "负责获取待审核的流水账单，审核待审核的账单", tags = "管理员-钱包流水控制器")
@CrossOrigin
@RestController
@RequestMapping("/walletAdmin")
public class WalletAdminController extends BaseController {

    @Resource
    private WalletAdminService walletAdminService;

    @ApiOperation("管理员获取所有待审核wallet流水")
    @PostMapping("/getAllFlow")
    public CommonResult<CommonPage<WalletAdminVO>> getAllFlow(@RequestBody PageVO pageVO){
        CommonPage<WalletAdminVO> commonPage = walletAdminService.getAllFlow(pageVO);
        if (!commonPage.getList().isEmpty()) {
            return CommonResult.success(commonPage, "get all flows successful");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("审核")
    @PatchMapping("/audit")
    public CommonResult audit(@Validated({UpdateGroup.class}) @RequestBody WalletAuditVO walletAuditVO, BindingResult bindingResult) throws BusinessException{
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), walletAuditVO.toString());
        } else {
            if (walletAdminService.audit(walletAuditVO)) {
                return new CommonResult(20000,"audit successful");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }
}
