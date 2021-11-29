package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SaoSalesOrder implements Serializable {
    /**
     *  主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = " 主键")
    private Integer saoId;

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

    /**
     * 制造商ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "制造商ID")
    private Integer manId;

    /**
     * 仓库ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "仓库ID")
    private Integer warId;

    /**
     * 第一次同步时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "第一次同步时间")
    private Date syncDate;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "支付时间")
    private Date paymentDate;

    /**
     * 推送到仓库的时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "推送到仓库的时间")
    private Date pushDate;

    /**
     * 取得物流跟踪号的时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "取得物流跟踪号的时间")
    private Date trackNoDate;

    /**
     * 物流妥投的时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "物流妥投的时间")
    private Date fulfillmentDate;

    /**
     * 结款时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "结款时间")
    private Date settlementDate;

    /**
     * 订单价格
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单价格")
    private BigDecimal productAmount;

    /**
     * 运费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "运费")
    private BigDecimal freightCost;

    /**
     * 订单处理费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单处理费")
    private BigDecimal handlingFee;

    /**
     * 消费者备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "消费者备注")
    private String customerRemark;

    /**
     * 订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z")
    private String orderNo;

    /**
     * 订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消")
    private String orderSts;

    /**
     * 退款状态 1. OPEN - 开启 2. CLOSE - 已完结
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "退款状态 1. OPEN - 开启 2. CLOSE - 已完结")
    private String refundSts;

    /**
     * 发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投")
    private String deliverySts;

    /**
     * GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单")
    private Integer stoId;

    /**
     * 斑马返回物流费用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "斑马返回物流费用")
    private BigDecimal lastFreightCost;

    /**
     * 取消时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "取消时间")
    private Date cancelTime;

    /**
     * 0自动，1非自动，2取消，3异常，4完成
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "0自动，1非自动，2取消，3异常，4完成")
    private String autoPayStatus;

    /**
     * 订单自动支付时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单自动支付时间")
    private String autoPayTime;

    /**
     * 用户留言
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户留言")
    private String buyerCheckoutMessage;

    private static final long serialVersionUID = 1L;

    public Integer getSaoId() {
        return saoId;
    }

    public void setSaoId(Integer saoId) {
        this.saoId = saoId;
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

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPushDate() {
        return pushDate;
    }

    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }

    public Date getTrackNoDate() {
        return trackNoDate;
    }

    public void setTrackNoDate(Date trackNoDate) {
        this.trackNoDate = trackNoDate;
    }

    public Date getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(Date fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    public BigDecimal getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(BigDecimal freightCost) {
        this.freightCost = freightCost;
    }

    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderSts() {
        return orderSts;
    }

    public void setOrderSts(String orderSts) {
        this.orderSts = orderSts;
    }

    public String getRefundSts() {
        return refundSts;
    }

    public void setRefundSts(String refundSts) {
        this.refundSts = refundSts;
    }

    public String getDeliverySts() {
        return deliverySts;
    }

    public void setDeliverySts(String deliverySts) {
        this.deliverySts = deliverySts;
    }

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public BigDecimal getLastFreightCost() {
        return lastFreightCost;
    }

    public void setLastFreightCost(BigDecimal lastFreightCost) {
        this.lastFreightCost = lastFreightCost;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    public void setAutoPayStatus(String autoPayStatus) {
        this.autoPayStatus = autoPayStatus;
    }

    public String getAutoPayTime() {
        return autoPayTime;
    }

    public void setAutoPayTime(String autoPayTime) {
        this.autoPayTime = autoPayTime;
    }

    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    public void setBuyerCheckoutMessage(String buyerCheckoutMessage) {
        this.buyerCheckoutMessage = buyerCheckoutMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saoId=").append(saoId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", manId=").append(manId);
        sb.append(", warId=").append(warId);
        sb.append(", syncDate=").append(syncDate);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", pushDate=").append(pushDate);
        sb.append(", trackNoDate=").append(trackNoDate);
        sb.append(", fulfillmentDate=").append(fulfillmentDate);
        sb.append(", settlementDate=").append(settlementDate);
        sb.append(", productAmount=").append(productAmount);
        sb.append(", freightCost=").append(freightCost);
        sb.append(", handlingFee=").append(handlingFee);
        sb.append(", customerRemark=").append(customerRemark);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderSts=").append(orderSts);
        sb.append(", refundSts=").append(refundSts);
        sb.append(", deliverySts=").append(deliverySts);
        sb.append(", stoId=").append(stoId);
        sb.append(", lastFreightCost=").append(lastFreightCost);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", autoPayStatus=").append(autoPayStatus);
        sb.append(", autoPayTime=").append(autoPayTime);
        sb.append(", buyerCheckoutMessage=").append(buyerCheckoutMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}