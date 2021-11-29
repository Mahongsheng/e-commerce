package com.ecommerce.basicInfo.vojo.store;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.GET;
import java.util.Date;

@Getter
@Setter
public class StoreAddVO {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer strId;

    /**
     * 借卖id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "借卖id")
    private Integer dsrId;


    /**
     * 平台类别,1:Amazon;2:ebay
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "平台类别,1:Amazon;2:ebay")
    private String platformType;

    /**
     * 网店名 - 从api中取得
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "网店名 - 从api中取得")
    private String storeName;

    /**
     * API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭")
    private String storeStsCd;

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
}
