package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yousabla
 */
@Data
public class AddParameterVO {

    @ApiModelProperty(value = "参数主键")
    private String parCd;

    @ApiModelProperty(value = "参数值")
    private String parValue;

    @ApiModelProperty(value = "参数说明")
    private String description;

    @ApiModelProperty(value = "创建用户Id")
    private String userId;
}
