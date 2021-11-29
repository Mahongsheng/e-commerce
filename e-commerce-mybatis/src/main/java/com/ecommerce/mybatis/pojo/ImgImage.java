package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ImgImage implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer imgId;

    /**
     * 名字
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名字")
    private String name;

    /**
     * 图片宽，pixel
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "图片宽，pixel")
    private Integer width;

    /**
     * 图片高，pixel
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "图片高，pixel")
    private Integer height;

    /**
     * 图片地址
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "图片地址")
    private String uri;

    /**
     * O - 原图 M - 中图 （用于列表) L - 大图 (用于详情页) M2 - 中图(2x) L2 - 大图(2x)
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "O - 原图 M - 中图 （用于列表) L - 大图 (用于详情页) M2 - 中图(2x) L2 - 大图(2x)")
    private String typeCd;

    /**
     * 关联表的主键id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "关联表的主键id")
    private String entityId;

    /**
     * 关联自定义的code
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "关联自定义的code")
    private String entityCd;

    /**
     * 如果一个产品有多图时，要按小到大的顺序进行显示
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "如果一个产品有多图时，要按小到大的顺序进行显示")
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

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
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
        sb.append(", imgId=").append(imgId);
        sb.append(", name=").append(name);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", uri=").append(uri);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", entityId=").append(entityId);
        sb.append(", entityCd=").append(entityCd);
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