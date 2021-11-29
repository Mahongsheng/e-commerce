package com.ecommerce.product.vojo.image;

import com.ecommerce.common.validationGroup.InsertGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class ProductStatusVO {
    @NotNull(message = "商品ID不能为空！", groups = {InsertGroup.class})
    @ApiModelProperty(value = "主键id")
    private Integer proId;
    private String status;
}
