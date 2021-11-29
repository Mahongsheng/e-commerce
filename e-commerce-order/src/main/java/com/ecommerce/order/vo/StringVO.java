package com.ecommerce.order.vo;

import com.ecommerce.common.validationGroup.SelectGroup;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vo
 * @ClassName: StringVO
 * @Description: 接受String类型的json
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/8 11:03
 */
public class StringVO {
    @ApiModelProperty("指代前端往后端传入的String数据，如各种String型的id或者username等")
    @NotNull(groups = {SelectGroup.class}, message = "收货地址编号之类的为空")
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
