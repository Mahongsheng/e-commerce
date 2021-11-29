package com.ecommerce.product.vojo.entry;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetAllProductVO {
    private Integer manId;
    private Integer pageNum;
    private Integer pageSize;

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
