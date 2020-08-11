package com.ecommerce.controller;

import cn.hutool.json.JSONUtil;
import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.service.WalletFlowService;
import com.ecommerce.vojo.StringVO;
import com.ecommerce.vojo.WalletFlowRecordVO;
import com.ecommerce.vojo.WalletFlowVO;
import com.ecommerce.vojo.WalletOrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.*;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 钱包流水控制类
 * Created by yousabla on 2020/7/4.
 */

@Api(value = "钱包流水控制，包括充值，提现，查看当前账户流水等功能", tags = "钱包流水控制器")
@CrossOrigin
@RestController
@RequestMapping("/walletFlow")
public class WalletFlowController extends BaseController {

    @Resource
    WalletFlowService walletFlowService;

    @ApiOperation("充值")
    @PatchMapping("/deposit")
    public CommonResult deposit(@Validated({UpdateGroup.class}) @RequestBody WalletFlowVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            Integer deposit = walletFlowService.deposit(info);
            if (deposit == 1) {
                return CommonResult.success("充值成功！等待管理员审核......");
            } else if (deposit == -2) {
                return CommonResult.failed("充值失败，支付密码错误！");
            } else {
                return CommonResult.failed("充值失败，账户不存在！");
            }
        }
    }

    @ApiOperation("提现")
    @PatchMapping("/withdraw")
    public CommonResult withdraw(@Validated({UpdateGroup.class}) @RequestBody WalletFlowVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            Integer withdraw = walletFlowService.withdraw(info);
            if (withdraw == 1) {
                return CommonResult.success("提现成功！等待管理员审核......");
            } else if (withdraw == -1) {
                return CommonResult.failed("账户不存在！");
            } else if (withdraw == -2) {
                return CommonResult.failed("支付密码错误！");
            } else {
                return CommonResult.failed("账户余额不足！");
            }
        }
    }

    @ApiOperation("查看流水")
    @PostMapping("/check")
    public CommonResult<List<WalletFlowRecordVO>> check(@Validated({SelectGroup.class}) @RequestBody StringVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            List<WalletFlowRecordVO> recordVOS = walletFlowService.check(info.getAccountName());
            if (recordVOS == null) {
                return CommonResult.failed("账户尚未创建，请创建新账户！");
            }
            return CommonResult.success(recordVOS, "获取账户流水记录成功！");
        }
    }

    @ApiOperation("支付")
    @PatchMapping("/pay")
    public CommonResult pay(@Validated({UpdateGroup.class}) @RequestBody WalletOrderVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            Integer pay = walletFlowService.pay(info);
            if (pay == 1) {
                return CommonResult.success("支付成功！");
            } else if (pay == -1) {
                return CommonResult.failed("账户不存在!");
            } else if (pay == -2) {
                return CommonResult.failed("账户余额不足！");
            } else {
                return CommonResult.failed("支付密码错误！");
            }
        }
    }

    @ApiOperation("申请退款")
    @PatchMapping("/refund")
    public CommonResult refund(@Validated({UpdateGroup.class}) @RequestBody WalletOrderVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            if (walletFlowService.refund(info)) {
                return CommonResult.success("退款申请成功！等待管理员审核......");
            } else {
                return CommonResult.failed("申请退款失败！");
            }
        }
    }
}
