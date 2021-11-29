package com.ecommerce.mybatis.dto.product.browse;

import lombok.Data;

@Data
public class ProductBrowseDTO {
    private Integer proId;
    private String image;
    private String title;
    private String minRetailPrice;
    private String retailPrice;
}
