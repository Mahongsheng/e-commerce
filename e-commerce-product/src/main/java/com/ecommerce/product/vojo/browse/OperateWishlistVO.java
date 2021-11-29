package com.ecommerce.product.vojo.browse;

import com.ecommerce.common.validationGroup.DeleteGroup;
import com.ecommerce.common.validationGroup.InsertGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class OperateWishlistVO {
    @NotNull(message = "创建人ID不能为空！", groups = {InsertGroup.class, DeleteGroup.class})
    @ApiModelProperty(value = "创建人id")
    private String userId;

    @NotNull(message = "品牌ID不能为空！", groups = {InsertGroup.class, DeleteGroup.class})
    @ApiModelProperty(value = "品牌id")
    private Integer dsrId;

    @NotNull(message = "商品ID不能为空！", groups = {InsertGroup.class, DeleteGroup.class})
    @ApiModelProperty(value = "商品id")
    private Integer proId;
}