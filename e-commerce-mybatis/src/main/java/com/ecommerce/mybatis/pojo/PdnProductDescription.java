package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PdnProductDescription implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer pdnId;

    /**
     * 外键->关联pro表主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "外键->关联pro表主键")
    private Integer proId;

    /**
     * 对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon")
    private String typeCd;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建人")
    private String createdBy;

    /**
     * 创健时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创健时间")
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
     * 平台类型，ebay：2，Amazon：1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "平台类型，ebay：2，Amazon：1")
    private String platformType;

    /**
     * 商品描述（富文本、纯文本、卖点）
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "商品描述（富文本、纯文本、卖点）")
    private String descrition;

    private static final long serialVersionUID = 1L;

    public Integer getPdnId() {
        return pdnId;
    }

    public void setPdnId(Integer pdnId) {
        this.pdnId = pdnId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
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

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pdnId=").append(pdnId);
        sb.append(", proId=").append(proId);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", platformType=").append(platformType);
        sb.append(", descrition=").append(descrition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}