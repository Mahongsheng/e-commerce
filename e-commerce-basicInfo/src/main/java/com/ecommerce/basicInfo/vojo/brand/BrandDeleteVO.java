package com.ecommerce.basicInfo.vojo.brand;

import com.ecommerce.common.validationGroup.DeleteGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
public class BrandDeleteVO {
    @NotNull(message = "无品牌ID", groups = {DeleteGroup.class})
    private List<Integer> brdId;
}
