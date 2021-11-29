package com.ecommerce.basicInfo.vojo.bvoinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BVOEntryVO {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer dsrId;

    /**
     *  借卖方名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 借卖方名称")
    private String name;
    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 手机号码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;
}
