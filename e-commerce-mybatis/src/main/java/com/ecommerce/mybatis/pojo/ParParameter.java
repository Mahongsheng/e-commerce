package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ParParameter implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer parId;

    /**
     * 参数主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "参数主键")
    private String paramCd;

    /**
     * 参数值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "参数值")
    private String paramValue;

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

    /**
     * 参数说明
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "参数说明")
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getParId() {
        return parId;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    public String getParamCd() {
        return paramCd;
    }

    public void setParamCd(String paramCd) {
        this.paramCd = paramCd;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parId=").append(parId);
        sb.append(", paramCd=").append(paramCd);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}