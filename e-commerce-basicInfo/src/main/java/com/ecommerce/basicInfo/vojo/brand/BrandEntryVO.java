package com.ecommerce.basicInfo.vojo.brand;

import com.ecommerce.common.validationGroup.InsertGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Setter
@Getter
public class BrandEntryVO {

    @ApiModelProperty(value = " 主键")
    private Integer brdId;

    @ApiModelProperty(value = "公司信息，外键关联man表主键")
    private Integer manId;

    /**
     * 公司英文名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "公司英文名")
    private String nameEn;

    /**
     * 公司中文名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "公司中文名")
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
     * 备注，用它存logo地址
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
}
