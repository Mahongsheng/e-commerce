package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CdmCodeMaster implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer cdmId;

    /**
     * 字典类型
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "字典类型")
    private String codeType;

    /**
     * 用途描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用途描述")
    private String description;

    /**
     * 编码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "编码")
    private String typeCd;

    /**
     * 编码值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "编码值")
    private String codeVal;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer seqNo;

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

    public Integer getCdmId() {
        return cdmId;
    }

    public void setCdmId(Integer cdmId) {
        this.cdmId = cdmId;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getCodeVal() {
        return codeVal;
    }

    public void setCodeVal(String codeVal) {
        this.codeVal = codeVal;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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
        sb.append(", cdmId=").append(cdmId);
        sb.append(", codeType=").append(codeType);
        sb.append(", description=").append(description);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", codeVal=").append(codeVal);
        sb.append(", seqNo=").append(seqNo);
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