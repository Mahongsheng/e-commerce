package com.ecommerce.product.vojo.entry;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchProductVO {
    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    private Integer manId;
    private String title;
    private Integer pageNum;
    private Integer pageSize;
}
