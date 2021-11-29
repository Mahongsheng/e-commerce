package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OfpOfferPrice implements Serializable {
    private Integer ofpId;

    /**
     * 制造商ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "制造商ID")
    private Integer manId;

    /**
     * 价格有效期开始时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "价格有效期开始时间")
    private Date effectiveStartDate;

    /**
     * 价格有效期结束时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "价格有效期结束时间")
    private Date effectiveEndDate;

    /**
     * 外键->商品ID 外键关联pro表
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "外键->商品ID 外键关联pro表")
    private Integer proId;

    /**
     * 单价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "单价")
    private BigDecimal price;

    /**
     * 对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价")
    private String typeCd;

    /**
     * 借卖方id，关联专享价用，其他类型该字段为空
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "借卖方id，关联专享价用，其他类型该字段为空")
    private Integer dsrId;

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
    @ApiModelProperty(value = "乐观锁 ")
    private Integer callCnt;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 有效性
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "有效性")
    private String stsCd;

    /**
     * 是否自动设置价格（1为自动以相同价格进入下一个周期）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否自动设置价格（1为自动以相同价格进入下一个周期）")
    private String period;

    private static final long serialVersionUID = 1L;

    public Integer getOfpId() {
        return ofpId;
    }

    public void setOfpId(Integer ofpId) {
        this.ofpId = ofpId;
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public Integer getDsrId() {
        return dsrId;
    }

    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ofpId=").append(ofpId);
        sb.append(", manId=").append(manId);
        sb.append(", effectiveStartDate=").append(effectiveStartDate);
        sb.append(", effectiveEndDate=").append(effectiveEndDate);
        sb.append(", proId=").append(proId);
        sb.append(", price=").append(price);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", dsrId=").append(dsrId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", period=").append(period);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}