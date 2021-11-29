package com.ecommerce.product.vojo.browse;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetailVO {
    private Integer proId;
    private String title;
    private String mainCatName;
    private String viceCatName;
    private String minRetailPrice;
    private String retailPrice;

    private Boolean ifInWishlist;
    private List<String> images;

    private String ebayDescription;
    private String amazonDescription;
}
