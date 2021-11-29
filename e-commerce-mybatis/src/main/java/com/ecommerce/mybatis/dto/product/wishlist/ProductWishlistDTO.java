package com.ecommerce.mybatis.dto.product.wishlist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductWishlistDTO {
    private Integer proId;
    private Integer dsrId;
    private String image;
    private String title;
    private String minRetailPrice;
    private String retailPrice;
}
