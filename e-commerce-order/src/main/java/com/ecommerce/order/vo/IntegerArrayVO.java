package com.ecommerce.order.vo;

import com.ecommerce.common.validationGroup.UpdateGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vo
 * @ClassName: IntegerArrayVO
 @Author: 邱晓淋
 * @CreateDate: 2020/7/21 19:11
 */
@Setter
@Getter
public class IntegerArrayVO {
    @NotNull(groups = {UpdateGroup.class}, message = "参数为空")
    private int[] ints;
}
