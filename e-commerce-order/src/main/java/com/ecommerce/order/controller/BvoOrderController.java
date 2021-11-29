package com.ecommerce.order.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.order.service.BvoOrderService;
import com.ecommerce.order.vo.IntegerArrayVO;
import com.ecommerce.order.vo.IntegerVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import com.ecommerce.order.vo.StringVO;
import com.ecommerce.mybatis.pojo.SalSalesOrderLineItem;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.controller
 * @ClassName: BvoOrderController
 * @Description: BVO订单管理
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/6 17:27
 */

@CrossOrigin
@RestController
@RequestMapping("/bvoOrder")
public class BvoOrderController extends BaseController {
    @Autowired
    private BvoOrderService bvoOrderService;

    @ApiOperation("根据dsrId获取订单信息->dsr：借卖方对象")
    @PostMapping("/getVosByDsrId")
    public CommonResult<List<SaoSalesOrderVO>> getVo(@Validated({SelectGroup.class}) @RequestBody IntegerVO integerVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), integerVO.getI());
        }else {
            List<SaoSalesOrderVO> saoSalesOrderVOS = bvoOrderService.getSaoVosByDsrId(integerVO.getI());
            if(saoSalesOrderVOS == null){
                throw BusinessException.SELECT_FAIL;
            }else {
                return CommonResult.success(saoSalesOrderVOS,"返回数据成功");
            }
        }
    }

    @ApiOperation("根据saoId获取sal对象")
    @PostMapping("/getSalBySaoId")
    public CommonResult<List<SalSalesOrderLineItem>> getSalBySaoId(@RequestBody int[] saoIds){
        List<SalSalesOrderLineItem> sals = bvoOrderService.getSalBySaoId(saoIds);
        if(sals == null || sals.size() == 0){
            throw BusinessException.SELECT_FAIL;
        }else {
            return CommonResult.success(sals,"返回数据成功");
        }
    }

    @ApiOperation("支付以后，根据saoId修改对应的订单状态")
    @PostMapping("/update")
    public CommonResult<Integer> update(@Validated({UpdateGroup.class}) @RequestBody IntegerArrayVO integerArrayVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), integerArrayVO.getInts()[0]);
        }else {
            int result = bvoOrderService.updateOrderBySaoId(integerArrayVO);
            if(result == 0){
                throw BusinessException.UPDATE_FAIL;
            }else {
                return CommonResult.success(result,"返回数据成功");
            }
        }
    }

    @ApiOperation("根据收货地址获取运费")
    @PostMapping("/getFeeByProvinceCode")
    public CommonResult<Double> getFeeByProvinceCode(@Validated({SelectGroup.class}) @RequestBody StringVO stringVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), stringVO.getString());
        }else {
            double fee = bvoOrderService.getFeeByProvinceCode(stringVO.getString());
            if(fee == -1){
                throw BusinessException.SELECT_FAIL;
            }else {
                return CommonResult.success(fee,"返回数据成功");
            }
        }
    }


}
