package com.ecommerce.wallet.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.wallet.service.WalletService;
import com.ecommerce.wallet.vojo.StringVO;
import com.ecommerce.wallet.vojo.WalletAccountVO;
import com.ecommerce.wallet.vojo.WalletBalanceVO;
import com.ecommerce.wallet.vojo.WalletPasswordVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 钱包控制类
 * Created by yousabla on 2020/7/3.
 */

@Api(value = "钱包控制器,负责控制钱包账户的注册，登录（获取钱包信息），更改密码", tags = "钱包控制器")
@CrossOrigin
@RestController
@RequestMapping("/wallet")
public class WalletController extends BaseController {
    @Resource
    private WalletService walletService;

    @ApiOperation("注册新的钱包账户")
    @PutMapping("/register")
    public CommonResult<List<WalletBalanceVO>> register(@Validated({InsertGroup.class}) @RequestBody WalletAccountVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            if (walletService.addWallet(info)) {
                return CommonResult.success(walletService.getWalletInfo(info.getAccountName()),"注册新账户成功");
            } else {
                return CommonResult.failed("用户名已存在！");
            }
        }
    }

    @ApiOperation("获取账户钱包信息")
    @PostMapping("/getInfo")
    public CommonResult<List<WalletBalanceVO>> getInfo(@Validated({SelectGroup.class}) @RequestBody StringVO info, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            List<WalletBalanceVO> balanceVOs = walletService.getWalletInfo(info.getAccountName());
            if (balanceVOs != null) {
                return CommonResult.success(balanceVOs,"获取钱包信息成功！");
            } else {
                return CommonResult.failed("未注册需要注册才能访问钱包！");
            }
        }
    }

    @ApiOperation("更改支付密码")
    @PatchMapping("/changePassword")
    public CommonResult changePassword(@Validated({UpdateGroup.class}) @RequestBody WalletPasswordVO info, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException().newInstance(this.getErrorResponse(bindingResult), info.toString());
        } else {
            if (walletService.changePassword(info)) {
                return CommonResult.success("修改支付密码成功！");
            } else {
                return CommonResult.failed("原支付密码错误！");
            }
        }
    }
}
