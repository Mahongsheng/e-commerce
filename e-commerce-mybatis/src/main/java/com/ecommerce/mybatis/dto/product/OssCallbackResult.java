package com.ecommerce.mybatis.dto.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * oss上传文件的回调结果
 * Created by macro on 2018/5/17.
 */
@Data
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽")
    private String width;
    @ApiModelProperty("图片文件的高")
    private String height;
}
