package com.ecommerce.order.vo;

import com.ecommerce.common.validationGroup.SelectGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vo
 * @ClassName: IntegerVO
 * @Description: 接受Integer类型的Vo
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/8 11:04
 */
public class IntegerVO {

    @ApiModelProperty("指代前端往后端传入的整数数据，如各种id")
    @Length(min = 1, max = 10)
    @NotNull(groups = {SelectGroup.class, UpdateGroup.class}, message = "参数id为空")
    int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
