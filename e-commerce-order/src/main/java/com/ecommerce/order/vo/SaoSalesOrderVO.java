package com.ecommerce.order.vo;

import com.ecommerce.common.validationGroup.SelectGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vo
 * @ClassName: StoStorOrderVO
 * @Description: java类作用描述
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/3 15:30
 */

public class SaoSalesOrderVO {


    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public Date getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Date productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public String getProductOrderNum() {
        return productOrderNum;
    }

    public void setProductOrderNum(String productOrderNum) {
        this.productOrderNum = productOrderNum;
    }



    private String productTitle;
    private BigDecimal productPrice;
    private int productNum;
    private String productSku;
    private Date productCreateTime;
    private String productOrderNum;
    private String type;
    private int saoId;
    private String trackingNo;
    private int proId;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SaoSalesOrderVO(String productTitle, BigDecimal productPrice, int productNum, String productSku, Date productCreateTime, String productOrderNum, String type, int saoId, String trackingNo, int proId) {
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productNum = productNum;
        this.productSku = productSku;
        this.productCreateTime = productCreateTime;
        this.productOrderNum = productOrderNum;
        this.type = type;
        this.saoId = saoId;
        this.trackingNo = trackingNo;
        this.proId = proId;
    }

    public int getSaoId() {
        return saoId;
    }

    public void setSaoId(int saoId) {
        this.saoId = saoId;
    }

    @Override
    public String toString() {
        return "SaoSalesOrderVO{" +
                "productTitle='" + productTitle + '\'' +
                ", productPrice=" + productPrice +
                ", productNum=" + productNum +
                ", productSku='" + productSku + '\'' +
                ", productCreateTime=" + productCreateTime +
                ", productOrderNum='" + productOrderNum + '\'' +
                ", type='" + type + '\'' +
                ", saoId=" + saoId +
                ", trackingNo='" + trackingNo + '\'' +
                '}';
    }
}
