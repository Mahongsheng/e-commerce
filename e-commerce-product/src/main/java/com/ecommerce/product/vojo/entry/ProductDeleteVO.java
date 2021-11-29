package com.ecommerce.product.vojo.entry;

import com.ecommerce.common.validationGroup.DeleteGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
public class ProductDeleteVO {

    @NotNull(message = "无商品ID", groups = {DeleteGroup.class})
    private List<Integer> proIds;

    public List<Integer> getProIds() {
        return proIds;
    }

    public void setProIds(List<Integer> proIds) {
        this.proIds = proIds;
    }
}
