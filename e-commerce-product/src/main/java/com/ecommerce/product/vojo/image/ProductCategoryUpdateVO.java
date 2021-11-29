package com.ecommerce.product.vojo.image;

import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.mybatis.dto.product.OssCallbackResult;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
public class ProductCategoryUpdateVO {
    @NotNull(message = "商品ID不能为空！", groups = {InsertGroup.class})
    @ApiModelProperty(value = "主键id")
    private Integer proId;

    @NotNull(message = "创建人ID不能为空！", groups = {InsertGroup.class})
    @ApiModelProperty(value = "创建人id")
    private String userId;


    @ApiModelProperty(value = "分类ID")
    private List<Integer> category;

    @ApiModelProperty(value = "所有图片")
    private List<OssCallbackResult> images;

}
