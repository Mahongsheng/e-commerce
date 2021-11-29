package com.ecommerce.product.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.product.service.ProductEntryService;
import com.ecommerce.product.vojo.entry.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Api(value = "品牌商-商品录入模块控制器", tags = "品牌商-商品录入模块控制器")
@RestController
@RequestMapping("/productEntry")
public class ProductEntryController extends BaseController {

    @Autowired
    private ProductEntryService productEntryService;

    @ApiOperation("找到该品牌所有商品")
    @PostMapping("/getAllProduct")
    public CommonResult<CommonPage<ProductEntryVO>> getAllProduct(@RequestBody GetAllProductVO getAllProductVO) {
        CommonPage<ProductEntryVO> result = productEntryService.getAllProduct(getAllProductVO);
        if (!result.getList().isEmpty()) {
            return CommonResult.success(result, "匹配成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("通过商品标题模糊匹配商品")
    @PostMapping("/searchProductByTitle")
    public CommonResult<CommonPage<ProductEntryVO>> searchProductByTitle(@RequestBody SearchProductVO searchProductVO) {
        CommonPage<ProductEntryVO> result = productEntryService.searchProductByTitle(searchProductVO);
        if (!result.getList().isEmpty()) {
            return CommonResult.success(result, "匹配成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("添加新的商品")
    @PutMapping("/addProductInfo")
    public CommonResult addProductInfo(@Validated({InsertGroup.class}) @RequestBody ProductAddVO productAddVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.INSERT_FAIL.newInstance(this.getErrorResponse(bindingResult), productAddVO.toString());
        } else {
            if (productEntryService.addProductInfo(productAddVO)) {
                return CommonResult.success("添加成功");
            } else {
                throw BusinessException.INSERT_FAIL;
            }
        }
    }

    @ApiOperation("通过商品ID更新商品信息")
    @PatchMapping("/updateProductInfo")
    public CommonResult updateProductInfo(@Validated({UpdateGroup.class}) @RequestBody ProductUpdateVO productUpdateVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), productUpdateVO.toString());
        } else {
            if (productEntryService.updateProductInfo(productUpdateVO)) {
                return CommonResult.success("更新成功");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }

    @ApiOperation("更新时通过商品ID获得商品信息")
    @GetMapping("/getProductInfoWhenUpdate")
    public CommonResult<ProductAddVO> getProductInfoWhenUpdate(@RequestParam(value = "proId") Integer proId) {
        return CommonResult.success(productEntryService.getProductInfoWhenUpdate(proId), "获取成功");
    }

    @ApiOperation("通过商品ID删除商品信息")
    @DeleteMapping("/deleteProductInfo")
    public CommonResult deleteProductInfo(@RequestParam(value = "proId") Integer proId) {
        if (productEntryService.deleteProductInfo(proId)) {
            return CommonResult.success("删除成功");
        } else {
            throw BusinessException.DELETE_FAIL;
        }
    }

    @ApiOperation("通过商品ID批量删除商品信息")
    @PostMapping("/batchDeleteProInfo")
    public CommonResult batchDeleteProInfo(@RequestBody List<Integer> proIds) {
        if (productEntryService.batchDeleteProductInfo(proIds)) {
            return CommonResult.success("批量删除成功");
        } else {
            throw BusinessException.DELETE_FAIL;
        }
    }

}
