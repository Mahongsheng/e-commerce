package com.ecommerce.product.vojo.wishlist;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductWishlistWithCatVO {
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<ProductCatsVO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductCatsVO> products) {
        this.products = products;
    }

    private List<ProductCatsVO> products;
}
