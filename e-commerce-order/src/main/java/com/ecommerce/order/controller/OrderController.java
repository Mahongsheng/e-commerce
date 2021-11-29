package com.ecommerce.order.controller;


import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.order.service.OrderService;
import com.ecommerce.order.vo.IntegerVO;
import com.ecommerce.order.vo.SaoSalesOrderVO;
import com.ecommerce.order.vo.ShippingVO;
import com.ecommerce.mybatis.pojo.ProProduct;
import com.ecommerce.mybatis.pojo.SalSalesOrderLineItem;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;

    @ApiOperation("根据manId获得saoVo对象列表，sao->销售订单")
    @PostMapping("/sao")
    public CommonResult<List<SaoSalesOrderVO>> getSaoByManId(@Validated({SelectGroup.class}) @RequestBody IntegerVO integerVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), integerVO.getI());
        }else {
            List<SaoSalesOrderVO> saoSalesOrderVOS = orderService.getSaoByManId(integerVO.getI());
            if(saoSalesOrderVOS != null){
                return CommonResult.success(saoSalesOrderVOS,"获取sao数据成功");
            }else {
                throw BusinessException.SELECT_FAIL;
            }
        }
    }

    @ApiOperation("根据saoId查询sal，然后根据该sal查询proId，然后根据proId获得pro对象")
    @PostMapping("/getProBySao")
    public CommonResult<ProProduct> getProBySalId(@Validated({SelectGroup.class}) @RequestBody IntegerVO integerVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), integerVO.getI());
        }else {
            SalSalesOrderLineItem salSalesOrderLineItem = orderService.getSalBySaoId(integerVO.getI());
            if(salSalesOrderLineItem != null){
                ProProduct proProduct = orderService.getProBySalId(salSalesOrderLineItem.getSalId());
                if(proProduct != null){
                    return CommonResult.success(proProduct,"获取pro数据成功");
                }else {
                    throw BusinessException.SELECT_FAIL;
                }
            }else {
                throw BusinessException.SELECT_FAIL;
            }
        }
    }

    @ApiOperation("发货接口,根据'订单号和订单物流号'更新订单状态")
    @PostMapping("/shipment")
    public CommonResult<Boolean> getShipped(@Validated({UpdateGroup.class}) @RequestBody ShippingVO shippingVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), shippingVO.toString());
        }else {
            boolean result = orderService.updateOrder(shippingVO);
            if(result){
                return CommonResult.success(result,"发货成功");
            }else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }

    @ApiOperation("退货")
    @PostMapping("/cancel")
    public CommonResult<Boolean> cancelOrder(@Validated({UpdateGroup.class}) @RequestBody IntegerVO integerVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), integerVO.toString());
        }else {
            if(orderService.cancelOrder(integerVO)){
                return CommonResult.success(orderService.cancelOrder(integerVO),"退货成功");
            }else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }
}
