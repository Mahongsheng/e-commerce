package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class StoStoreOrder implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer stoId;

    /**
     * 网店ID，外键关联str表主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "网店ID，外键关联str表主键")
    private Integer strId;

    /**
     * AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826")
    private String orderId;

    /**
     * 订单创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单创建时间")
    private String orderCreatedTime;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "支付时间")
    private String paidTime;

    /**
     * 订单更新时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单更新时间")
    private String lastModifiedTime;

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
     * 平台类别 1、amazon 2、ebay
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "平台类别 1、amazon 2、ebay")
    private String platformType;

    /**
     * 订单取消时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单取消时间")
    private String cancelCompileDate;

    private static final long serialVersionUID = 1L;

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(String orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getCancelCompileDate() {
        return cancelCompileDate;
    }

    public void setCancelCompileDate(String cancelCompileDate) {
        this.cancelCompileDate = cancelCompileDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stoId=").append(stoId);
        sb.append(", strId=").append(strId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCreatedTime=").append(orderCreatedTime);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", lastModifiedTime=").append(lastModifiedTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", platformType=").append(platformType);
        sb.append(", cancelCompileDate=").append(cancelCompileDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}