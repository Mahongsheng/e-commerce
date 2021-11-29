package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class EbaEbayAuthprization implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer ebaId;

    /**
     * 网店ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "网店ID")
    private Integer strId;

    /**
     * ebay账号id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "ebay账号id")
    private String appId;

    /**
     * ebay密钥
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "ebay密钥")
    private String secretKey;

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
     * token失效时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "token失效时间")
    private Date expDate;

    /**
     * 取消授权时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "取消授权时间")
    private Date cancelDate;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户id")
    private String accountId;

    /**
     * ebay TOKEN
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "ebay TOKEN")
    private String token;

    private static final long serialVersionUID = 1L;

    public Integer getEbaId() {
        return ebaId;
    }

    public void setEbaId(Integer ebaId) {
        this.ebaId = ebaId;
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ebaId=").append(ebaId);
        sb.append(", strId=").append(strId);
        sb.append(", appId=").append(appId);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", lastModifiedTime=").append(lastModifiedTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", expDate=").append(expDate);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", accountId=").append(accountId);
        sb.append(", token=").append(token);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}