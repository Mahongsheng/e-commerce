package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Sequence implements Serializable {
    /**
     * 序列名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "序列名称")
    private String name;

    /**
     * 当前值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "当前值")
    private Integer currentValue;

    /**
     * 增长值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "增长值")
    private Integer increment;

    /**
     * 首字母
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "首字母")
    private String initial;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", currentValue=").append(currentValue);
        sb.append(", increment=").append(increment);
        sb.append(", initial=").append(initial);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}