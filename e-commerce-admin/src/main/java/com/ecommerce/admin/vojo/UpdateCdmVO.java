package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yousabla
 */
@Data
public class UpdateCdmVO {
    @ApiModelProperty(value = "cdm主键")
    private Integer cdmId;

    @ApiModelProperty(value = "数据字典类型")
    private String cdmType;

    @ApiModelProperty(value = "数据字典主键")
    private String cdmCd;

    @ApiModelProperty(value = "数据字典值")
    private String cdmValue;

    @ApiModelProperty(value = "数据字典说明")
    private String description;

    @ApiModelProperty(value = "创建用户Id")
    private String userId;
}
