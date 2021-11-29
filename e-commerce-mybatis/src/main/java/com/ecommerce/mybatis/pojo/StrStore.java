package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class StrStore implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer strId;

    /**
     * 借卖id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "借卖id")
    private Integer dsrId;

    /**
     * 平台类别,1:Amazon;2:ebay
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "平台类别,1:Amazon;2:ebay")
    private String platformType;

    /**
     * 网店名 - 从api中取得
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "网店名 - 从api中取得")
    private String storeName;

    /**
     * API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭")
    private String storeStsCd;

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

    private static final long serialVersionUID = 1L;

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public Integer getDsrId() {
        return dsrId;
    }

    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreStsCd() {
        return storeStsCd;
    }

    public void setStoreStsCd(String storeStsCd) {
        this.storeStsCd = storeStsCd;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", strId=").append(strId);
        sb.append(", dsrId=").append(dsrId);
        sb.append(", platformType=").append(platformType);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeStsCd=").append(storeStsCd);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}