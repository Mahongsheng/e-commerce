package com.ecommerce.mybatis.dto.product.browse;

import lombok.Data;

@Data
public class ProductDetailDTO {
    private Integer proId;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getMinRetailPrice() {
        return minRetailPrice;
    }

    public void setMinRetailPrice(String minRetailPrice) {
        this.minRetailPrice = minRetailPrice;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    private String title;
    private String categoryPath;
    private String minRetailPrice;
    private String retailPrice;
}
