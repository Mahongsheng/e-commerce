package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PrcProductCategory implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Integer prcId;

    /**
     * 商品ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品ID")
    private Integer proId;

    /**
     * 分类id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "分类id")
    private Integer categoryId;

    /**
     * 类别名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "类别名称")
    private String categoryName;

    /**
     * 类别全路径如 ce>digital>mp3
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "类别全路径如 ce>digital>mp3")
    private String categoryPath;

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
     * 修改人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改人")
    private String lastUpdateBy;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date lastUpdateDate;

    /**
     * 乐观锁
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "乐观锁")
    private Integer callInt;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     *  状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 状态")
    private String stsCd;

    /**
     *  平台类型,ebay：2，Amazon：1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 平台类型,ebay：2，Amazon：1")
    private String platformType;

    private static final long serialVersionUID = 1L;

    public Integer getPrcId() {
        return prcId;
    }

    public void setPrcId(Integer prcId) {
        this.prcId = prcId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
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

    public Integer getCallInt() {
        return callInt;
    }

    public void setCallInt(Integer callInt) {
        this.callInt = callInt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prcId=").append(prcId);
        sb.append(", proId=").append(proId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryPath=").append(categoryPath);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callInt=").append(callInt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", platformType=").append(platformType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}