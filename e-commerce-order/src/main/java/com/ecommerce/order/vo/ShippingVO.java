package com.ecommerce.order.vo;

import com.ecommerce.common.validationGroup.InsertGroup;
import com.ecommerce.common.validationGroup.UpdateGroup;

import javax.validation.constraints.NotNull;

/**
 * @ProjectName: e-commerce
 * @Package: com.ecommerce.vo
 * @ClassName: ShippingVO
 * @Description: 前端传给后端的发货的订单和订单号的VO
 * @Author: 邱晓淋
 * @CreateDate: 2020/7/10 18:12
 */
public class ShippingVO {
    @NotNull(groups = {UpdateGroup.class}, message = "saoId为空")
    int saoId;
    @NotNull(groups = {UpdateGroup.class}, message = "快递单号为空")
    String trackNo;

    public int getSaoId() {
        return saoId;
    }

    public void setSaoId(int saoId) {
        this.saoId = saoId;
    }

    public String getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }
}
