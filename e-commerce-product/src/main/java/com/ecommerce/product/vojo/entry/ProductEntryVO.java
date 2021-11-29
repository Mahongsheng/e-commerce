package com.ecommerce.product.vojo.entry;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class ProductEntryVO {


    @ApiModelProperty(value = "主键id")
    private Integer proId;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getSkuCd() {
        return skuCd;
    }

    public void setSkuCd(String skuCd) {
        this.skuCd = skuCd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getWarNum() {
        return warNum;
    }

    public void setWarNum(String warNum) {
        this.warNum = warNum;
    }

    /**
     * 商品sku编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品sku编码")
    private String skuCd;

    /**
     * 标题
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 建议零售价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "建议零售价")
    private String retailPrice;

    /**
     * 库存数量
     */
    @ApiModelProperty(value = "库存数量")
    private String warNum;

    @Override
    public String toString() {
        return "ProductEntryVO{" +
                "proId=" + proId +
                ", skuCd='" + skuCd + '\'' +
                ", title='" + title + '\'' +
                ", retailPrice='" + retailPrice + '\'' +
                ", warNum='" + warNum + '\'' +
                '}';
    }
}

