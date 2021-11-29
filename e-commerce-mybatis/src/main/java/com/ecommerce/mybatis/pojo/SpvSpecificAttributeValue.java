package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SpvSpecificAttributeValue implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键id")
    private Integer spvId;

    /**
     * 外键->关联spa表主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "外键->关联spa表主键")
    private Integer spaId;

    /**
     * 英文属性描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "英文属性描述")
    private String nameEn;

    /**
     * 中文属性描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "中文属性描述")
    private String nameCn;

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

    public Integer getSpvId() {
        return spvId;
    }

    public void setSpvId(Integer spvId) {
        this.spvId = spvId;
    }

    public Integer getSpaId() {
        return spaId;
    }

    public void setSpaId(Integer spaId) {
        this.spaId = spaId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
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
        sb.append(", spvId=").append(spvId);
        sb.append(", spaId=").append(spaId);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", nameCn=").append(nameCn);
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