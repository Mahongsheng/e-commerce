package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SolStoreOrderLineItem implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer solId;

    /**
     * 第三方平台line_item_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "第三方平台line_item_id")
    private String orderItemId;

    /**
     * 主表主键ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主表主键ID")
    private Integer stoId;

    /**
     * 商品单价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品单价")
    private BigDecimal salesPrice;

    /**
     * 商品数量
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品数量")
    private Integer qty;

    /**
     * 商品SKU编号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品SKU编号")
    private String skuNo;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建人")
    private String createdBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date creationDate;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "更新人")
    private String lastUpdateBy;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "更新时间")
    private Date lastUpdateDate;

    /**
     * 乐观锁
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "乐观锁")
    private Integer callCnt;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private String stsCd;

    /**
     * 用户留言
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户留言")
    private String buyerCheckoutMessage;

    private static final long serialVersionUID = 1L;

    public Integer getSolId() {
        return solId;
    }

    public void setSolId(Integer solId) {
        this.solId = solId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd;
    }

    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    public void setBuyerCheckoutMessage(String buyerCheckoutMessage) {
        this.buyerCheckoutMessage = buyerCheckoutMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", solId=").append(solId);
        sb.append(", orderItemId=").append(orderItemId);
        sb.append(", stoId=").append(stoId);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", qty=").append(qty);
        sb.append(", skuNo=").append(skuNo);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", buyerCheckoutMessage=").append(buyerCheckoutMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}