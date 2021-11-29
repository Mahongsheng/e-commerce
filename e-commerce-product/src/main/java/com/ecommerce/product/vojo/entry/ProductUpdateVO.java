package com.ecommerce.product.vojo.entry;

import com.ecommerce.common.validationGroup.UpdateGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class ProductUpdateVO {

    @NotNull(message = "商品ID不能为空！", groups = {UpdateGroup.class})
    @ApiModelProperty(value = "主键id")
    private Integer proId;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSkuCd() {
        return skuCd;
    }

    public void setSkuCd(String skuCd) {
        this.skuCd = skuCd;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getWarrantyDay() {
        return warrantyDay;
    }

    public void setWarrantyDay(String warrantyDay) {
        this.warrantyDay = warrantyDay;
    }

    @NotNull(message = "修改人ID不能为空！", groups = {UpdateGroup.class})
    @ApiModelProperty(value = "修改人id")
    private String userId;

    /**
     * 标题
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 宽 - cm
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "宽 - cm")
    private String width;

    /**
     * 高 - cm
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "高 - cm")
    private String height;

    /**
     * 长 - cm
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "长 - cm")
    private String length;

    /**
     * 重 - kg
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "重 - kg")
    private String weight;

    /**
     * 商品sku编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品sku编码")
    private String skuCd;

    /**
     * upc编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "upc编码")
    private String upc;

    /**
     * ena编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "ena编码")
    private String ean;

    /**
     * 型号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "型号")
    private String model;

    /**
     * 建议零售价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "建议零售价")
    private String retailPrice;


    /**
     * 保修期（单位有年、月、日）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "保修期（单位有年、月、日）")
    private String warrantyDay;

    /**
     * 保修期（单位有年、月、日）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "eBay描述")
    private String eBayDescription;

    /**
     * 保修期（单位有年、月、日）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "Amazon描述")
    private String amazonDescription;
}
