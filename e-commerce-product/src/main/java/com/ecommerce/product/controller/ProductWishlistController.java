package com.ecommerce.product.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.common.base.ResultCode;
import com.ecommerce.mybatis.dto.product.wishlist.ProductCatsDTO;
import com.ecommerce.mybatis.dto.product.wishlist.ProductWishlistDTO;
import com.ecommerce.product.service.ProductWishlistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Api(value = "借卖商-愿望单模块控制器", tags = "借卖商-愿望单模块控制器")
@RestController
@RequestMapping("/productWishlist")
public class ProductWishlistController extends BaseController {

    @Autowired
    private ProductWishlistService productWishlistService;

    @ApiOperation("根据品牌商ID获得其愿望清单中所有商品的分类")
    @GetMapping("/getAllCatFromWishlist")
    public CommonResult<List<ProductCatsDTO>> getAllCatFromWishlist(@RequestParam(value = "dsrId") Integer dsrId) {
        List<ProductCatsDTO> result = productWishlistService.getAllCatFromWishlist(dsrId);
        if (!result.isEmpty()) {
            return CommonResult.success(result, "获得愿望清单中所有商品的分类成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("根据品牌商ID和商品分类ID获取到其愿望清单")
    @GetMapping("/getWishlistByIdAndCat")
    public CommonResult<List<ProductWishlistDTO>> getWishlistByIdAndCat(@RequestParam(value = "dsrId") Integer dsrId, @RequestParam(value = "catId") Integer catId) {
        List<ProductWishlistDTO> result = productWishlistService.getWishlistByIdAndCat(dsrId, catId);
        if (!result.isEmpty()) {
            return CommonResult.success(result, "获得所有愿望清单成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("根据品牌商ID和商品分类ID从愿望清单中删除某商品")
    @DeleteMapping("/deleteProFromWit")
    public CommonResult deleteProFromWit(@RequestParam(value = "dsrId") Integer dsrId, @RequestParam(value = "proId") Integer proId) {
        if (productWishlistService.deleteProFromWit(dsrId, proId)) {
            return CommonResult.success("删除该愿望清单成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }

    @ApiOperation("根据品牌商ID和商品分类ID从愿望清单中批量删除某商品")
    @DeleteMapping("/batchDeleteProFromWit")
    public CommonResult batchDeleteProFromWit(@RequestParam(value = "dsrId") Integer dsrId, @RequestParam(value = "proIds") List<Integer> proIds) {
        if (productWishlistService.batchDeleteProFromWit(dsrId, proIds)) {
            return CommonResult.success("批量删除愿望清单成功");
        } else {
            return CommonResult.failed(ResultCode.THINGS_NOT_FOUND);
        }
    }
}
