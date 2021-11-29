package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FreightCost implements Serializable {
    /**
     * 国家及省份编码的组合，作为主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "国家及省份编码的组合，作为主键")
    private String provinceCode;

    private String provinceName;

    /**
     * 运费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "运费")
    private Double shippingFee;

    private static final long serialVersionUID = 1L;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}