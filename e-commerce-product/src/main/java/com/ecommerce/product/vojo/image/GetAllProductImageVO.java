package com.ecommerce.product.vojo.image;

import com.ecommerce.common.validationGroup.DeleteGroup;
import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.SelectGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class GetAllProductImageVO {

    @NotNull(message = "品牌商ID不能为空！", groups = {SelectGroup.class})
    @ApiModelProperty(value = "品牌商id")
    private Integer manId;
    private Integer pageNum;
    private Integer pageSize;
}
