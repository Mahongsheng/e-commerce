package com.ecommerce.product.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonPage;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.common.exception.BusinessException;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import com.ecommerce.product.service.ProductImageService;
import com.ecommerce.product.vojo.image.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Api(value = "品牌商-商品主图模块控制器", tags = "品牌商-商品主图模块控制器")
@RestController
@RequestMapping("/productImage")
public class ProductImageController extends BaseController {

    @Autowired
    private ProductImageService productImageService;

    @ApiOperation("找到该品牌所有商品主图")
    @PostMapping("/getAllProductImage")
    public CommonResult<CommonPage<ProductImageVO>> getAllProductImage(@Validated({SelectGroup.class}) @RequestBody GetAllProductImageVO getAllProductImageVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), getAllProductImageVO.toString());
        } else {
            CommonPage<ProductImageVO> result = productImageService.getAllProductImage(getAllProductImageVO);
            if (!result.getList().isEmpty()) {
                return CommonResult.success(result, "匹配成功");
            } else {
                return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
            }
        }
    }

    @ApiOperation("通过商品标题模糊匹配商品")
    @PostMapping("/searchProductImageByTitle")
    public CommonResult<CommonPage<ProductImageVO>> searchProductImageByTitle(@Validated({SelectGroup.class}) @RequestBody SearchProductImageVO searchProductImageVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.SELECT_FAIL.newInstance(this.getErrorResponse(bindingResult), searchProductImageVO.toString());
        } else {
            CommonPage<ProductImageVO> result = productImageService.searchProductImageByTitle(searchProductImageVO);
            if (!result.getList().isEmpty()) {
                return CommonResult.success(result, "匹配成功");
            } else {
                return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
            }
        }

    }

    @ApiOperation("通过商品ID更新商品主图")
    @PatchMapping("/updateProductImage")
    public CommonResult updateProductImage(@Validated({UpdateGroup.class}) @RequestBody ProductCategoryUpdateVO productCategoryUpdateVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), productCategoryUpdateVO.toString());
        } else {
            if (productImageService.updateProductImage(productCategoryUpdateVO)) {
                return CommonResult.success("更新成功");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }

    @ApiOperation("通过商品ID删除商品主图")
    @PostMapping("/deleteProductImage")
    public CommonResult deleteProductImage(@RequestBody List<Integer> proIds) {
        if (productImageService.deleteProductImage(proIds)) {
            return CommonResult.success("更新成功");
        } else {
            throw BusinessException.DELETE_FAIL;
        }
    }

    @ApiOperation("在添加商品主图对话框打开时，获取商品所有一级分类、二级分类")
    @GetMapping("/getAllCategory")
    public CommonResult<List<ProductCategoryVO>> getAllCategory() {
        List<ProductCategoryVO> allCategory = productImageService.getAllCategory();
        if (!allCategory.isEmpty()) {
            return CommonResult.success(allCategory, "所有商品分类获得成功");
        } else {
            throw BusinessException.SELECT_FAIL;
        }
    }

    @ApiOperation("添加新的商品主图")
    @PutMapping("/addProductImage")
    public CommonResult addProductImage(@Validated({InsertGroup.class}) @RequestBody ProductCategoryAddVO productCategoryAddVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.INSERT_FAIL.newInstance(this.getErrorResponse(bindingResult), productCategoryAddVO.toString());
        } else {
            if (productImageService.addProductCategory(productCategoryAddVO)) {
                return CommonResult.success("添加成功");
            } else {
                throw BusinessException.INSERT_FAIL;
            }
        }
    }

    @ApiOperation("改变商品状态")
    @PatchMapping("/changeProStatus")
    public CommonResult changeProStatus(@Validated({InsertGroup.class}) @RequestBody ProductStatusVO productStatusVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw BusinessException.UPDATE_FAIL.newInstance(this.getErrorResponse(bindingResult), productStatusVO.toString());
        } else {
            if (productImageService.changeProStatus(productStatusVO)) {
                return CommonResult.success("修改成功");
            } else {
                throw BusinessException.UPDATE_FAIL;
            }
        }
    }

}