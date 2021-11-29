package com.ecommerce.basicInfo.vojo.company;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class CompanyEntryVO {
    @Override
    public String toString() {
        return "CompanyEntryVO{" +
                "manId=" + manId +
                ", nameEn='" + nameEn + '\'' +
                ", nameCn='" + nameCn + '\'' +
                ", gmcReportType='" + gmcReportType + '\'' +
                ", gmcReportUrl='" + gmcReportUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
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

    public String getGmcReportType() {
        return gmcReportType;
    }

    public void setGmcReportType(String gmcReportType) {
        this.gmcReportType = gmcReportType;
    }

    public String getGmcReportUrl() {
        return gmcReportUrl;
    }

    public void setGmcReportUrl(String gmcReportUrl) {
        this.gmcReportUrl = gmcReportUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ApiModelProperty(value = "主键，制造商ID")
    private Integer manId;

    /**
     * 制造商英文名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "制造商英文名")
    private String nameEn;

    /**
     * 制造商中文名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "制造商中文名")
    private String nameCn;

    /**
     * 品牌商认证类型 1-TUV,2-UL
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "品牌商认证类型 1-TUV,2-UL")
    private String gmcReportType;

    /**
     * 证书地址
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "证书地址")
    private String gmcReportUrl;

    /**
     * 品牌商公司介绍
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "品牌商公司介绍")
    private String description;
}
