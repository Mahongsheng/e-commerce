package com.ecommerce.product.vojo.browse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductBrowseVO {
    private Integer proId;
    private String image;
    private String title;
    private String minRetailPrice;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    private String retailPrice;
}
