package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SalSalesOrderLineItem implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer salId;

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
     * 销售订单表主id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "销售订单表主id")
    private Integer saoId;

    /**
     * 商品ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品ID")
    private Integer proId;

    /**
     * 商品数量
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品数量")
    private Integer qty;

    /**
     * 商品单价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品单价")
    private BigDecimal price;

    /**
     * 同步数据id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "同步数据id")
    private Integer solId;

    /**
     * 物流跟踪号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "物流跟踪号")
    private String trackingNo;

    /**
     * 快递公司
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "快递公司")
    private String wspName;

    private static final long serialVersionUID = 1L;

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
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

    public Integer getSaoId() {
        return saoId;
    }

    public void setSaoId(Integer saoId) {
        this.saoId = saoId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSolId() {
        return solId;
    }

    public void setSolId(Integer solId) {
        this.solId = solId;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getWspName() {
        return wspName;
    }

    public void setWspName(String wspName) {
        this.wspName = wspName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salId=").append(salId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", saoId=").append(saoId);
        sb.append(", proId=").append(proId);
        sb.append(", qty=").append(qty);
        sb.append(", price=").append(price);
        sb.append(", solId=").append(solId);
        sb.append(", trackingNo=").append(trackingNo);
        sb.append(", wspName=").append(wspName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}