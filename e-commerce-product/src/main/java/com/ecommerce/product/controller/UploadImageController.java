package com.ecommerce.product.controller;

import com.ecommerce.common.base.BaseController;
import com.ecommerce.common.base.CommonResult;
import com.ecommerce.product.service.UploadImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@Api(value = "上传图片控制器", tags = "上传图片控制器")
@RestController
@RequestMapping("/upload")
public class UploadImageController extends BaseController {

    @Autowired
    private UploadImageService uploadImages;

    @ApiOperation("上传商品主图到阿里云OSS")
    @PostMapping(value = "/uploadImage")
    public CommonResult<String> uploadImages(@RequestParam("file") MultipartFile file) {
        if (file == null) System.out.println("卧槽");
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        String imageUrl = uploadImages.uploadImages(file);
        System.out.println(imageUrl);
        if (!imageUrl.equals(""))
            return CommonResult.success(imageUrl, "上传成功");
        else return CommonResult.failed("上传失败");
    }
}
