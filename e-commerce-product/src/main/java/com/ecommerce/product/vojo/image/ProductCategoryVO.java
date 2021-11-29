package com.ecommerce.product.vojo.image;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductCategoryVO {
    private Integer catId;
    private String catName;

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

    public List<ViceCategory> getViceCats() {
        return viceCats;
    }

    public void setViceCats(List<ViceCategory> viceCats) {
        this.viceCats = viceCats;
    }

    private List<ViceCategory> viceCats = new ArrayList<>();
}
