package com.ecommerce.product.vojo.image;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductImageVO {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Integer proId;

    /**
     * 标题
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 主分类名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主分类名称")
    private String categoryName;

    /**
     * 主图
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主图URI")
    private String imageUri;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品状态")
    private String status;

}

