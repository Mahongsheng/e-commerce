package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ShaShippingAddress implements Serializable {
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
     * 姓
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "姓")
    private String familyName;

    /**
     * 名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名")
    private String givenName;

    /**
     * 国家
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "国家")
    private String countryName;

    /**
     * 国家编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "国家编码")
    private String countryIsoCd;

    /**
     * 省份或洲名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "省份或洲名称")
    private String stateOrProvinceName;

    /**
     * 省份或洲编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "省份或洲编码")
    private String stateOrProvinceCd;

    /**
     * 城市名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "城市名")
    private String cityName;

    /**
     * 地址1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "地址1")
    private String addressLine1;

    /**
     * 地址2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "地址2")
    private String addressLine2;

    /**
     * 地址3
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "地址3")
    private String addressLine3;

    /**
     * 邮编
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮编")
    private String postalCd;

    /**
     * 电话
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "电话")
    private String contactPhoneNo;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 外键关联sto_store_order表主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "外键关联sto_store_order表主键")
    private Integer stoId;

    /**
     * 快递公司名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "快递公司名称")
    private String carrierName;

    private static final long serialVersionUID = 1L;

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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryIsoCd() {
        return countryIsoCd;
    }

    public void setCountryIsoCd(String countryIsoCd) {
        this.countryIsoCd = countryIsoCd;
    }

    public String getStateOrProvinceName() {
        return stateOrProvinceName;
    }

    public void setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
    }

    public String getStateOrProvinceCd() {
        return stateOrProvinceCd;
    }

    public void setStateOrProvinceCd(String stateOrProvinceCd) {
        this.stateOrProvinceCd = stateOrProvinceCd;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String postalCd) {
        this.postalCd = postalCd;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", familyName=").append(familyName);
        sb.append(", givenName=").append(givenName);
        sb.append(", countryName=").append(countryName);
        sb.append(", countryIsoCd=").append(countryIsoCd);
        sb.append(", stateOrProvinceName=").append(stateOrProvinceName);
        sb.append(", stateOrProvinceCd=").append(stateOrProvinceCd);
        sb.append(", cityName=").append(cityName);
        sb.append(", addressLine1=").append(addressLine1);
        sb.append(", addressLine2=").append(addressLine2);
        sb.append(", addressLine3=").append(addressLine3);
        sb.append(", postalCd=").append(postalCd);
        sb.append(", contactPhoneNo=").append(contactPhoneNo);
        sb.append(", email=").append(email);
        sb.append(", stoId=").append(stoId);
        sb.append(", carrierName=").append(carrierName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}