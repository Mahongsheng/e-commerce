package com.ecommerce.basicInfo.vojo.store;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StoreEntryVO {

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
}
