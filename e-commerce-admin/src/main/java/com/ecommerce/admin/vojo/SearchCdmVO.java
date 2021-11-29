package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author yousabla
 */
@Data
public class SearchCdmVO {
    @ApiModelProperty(value = "数据字典类型")
    @NotBlank
    private String cdmType;

    @ApiModelProperty("页数")
    @NotNull
    private Integer pageNum;

    @ApiModelProperty("页面大小")
    @NotNull
    private Integer pageSize;
}
