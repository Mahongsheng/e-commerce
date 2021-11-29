package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yousabla
 */
@Data
public class SearchParVO {
    @ApiModelProperty(value = "参数主键")
    private String parCd;

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("页面大小")
    private Integer pageSize;
}
