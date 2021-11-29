package com.ecommerce.product.vojo.wishlist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductCatsVO {
    private Integer catId;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    private String catName;
}
