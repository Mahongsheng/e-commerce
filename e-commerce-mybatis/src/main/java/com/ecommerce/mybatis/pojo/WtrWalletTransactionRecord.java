package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WtrWalletTransactionRecord implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer transactionId;

    /**
     * 买家id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "买家id")
    private Integer buyerId;

    /**
     * 银行卡id for 充值、提现、退款,  卡账户消费情况下为空
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "银行卡id for 充值、提现、退款,  卡账户消费情况下为空")
    private Integer bankCardId;

    /**
     * 流水号，GM应用生成
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "流水号，GM应用生成")
    private String transactionNumber;

    /**
     * 业务类型 1-充值 2-提现 3-消费 4-退款
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "业务类型 1-充值 2-提现 3-消费 4-退款")
    private Byte transactionType;

    /**
     * gmcp$account.account_name 账户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "gmcp$account.account_name 账户名")
    private String accountName;

    /**
     * 金额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "金额")
    private BigDecimal transactionMoney;

    /**
     * 手续费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手续费")
    private BigDecimal commission;

    /**
     * 折后手续费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "折后手续费")
    private BigDecimal discountCommission;

    /**
     * 方式 0-T/T 1-Paypal 2-现金 3消费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "方式 0-T/T 1-Paypal 2-现金 3消费")
    private Byte transactionMethod;

    /**
     * 完成时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "完成时间")
    private Date completeTime;

    /**
     * 状态 2 -申请 , 4 -完成 , -1-失败
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态 2 -申请 , 4 -完成 , -1-失败")
    private Byte status;

    /**
     * 实际金额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "实际金额")
    private BigDecimal actualMoney;

    /**
     * 实际手续费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "实际手续费")
    private BigDecimal actualCommission;

    /**
     * 折后实际手续费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "折后实际手续费")
    private BigDecimal actualDiscountCommission;

    /**
     * 余额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "余额")
    private BigDecimal balance;

    /**
     * 订单id 针对消费,  gmsales.trade.id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "订单id 针对消费,  gmsales.trade.id")
    private Integer businessId;

    /**
     * 类型 1-入款 2-出款
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "类型 1-入款 2-出款")
    private Byte financeType;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String note;

    /**
     * 操作人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "操作人")
    private String operatorName;

    /**
     * 操作人IP
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "操作人IP")
    private String operatorIp;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "更新人")
    private String lastUpdateBy;

    /**
     * 最后更新时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "最后更新时间")
    private Date lastUpdateTime;

    /**
     * 银行请求地址
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "银行请求地址")
    private String bankReceiptUrl;

    /**
     * 转换汇率
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "转换汇率")
    private BigDecimal exchangeRate;

    /**
     * 流水描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "流水描述")
    private String transactionDesc;

    /**
     * 外汇
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "外汇")
    private BigDecimal foreignExchangeFee;

    /**
     * 处理费
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "处理费")
    private BigDecimal withdrawFee;

    private static final long serialVersionUID = 1L;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Byte getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Byte transactionType) {
        this.transactionType = transactionType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getTransactionMoney() {
        return transactionMoney;
    }

    public void setTransactionMoney(BigDecimal transactionMoney) {
        this.transactionMoney = transactionMoney;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getDiscountCommission() {
        return discountCommission;
    }

    public void setDiscountCommission(BigDecimal discountCommission) {
        this.discountCommission = discountCommission;
    }

    public Byte getTransactionMethod() {
        return transactionMethod;
    }

    public void setTransactionMethod(Byte transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(BigDecimal actualMoney) {
        this.actualMoney = actualMoney;
    }

    public BigDecimal getActualCommission() {
        return actualCommission;
    }

    public void setActualCommission(BigDecimal actualCommission) {
        this.actualCommission = actualCommission;
    }

    public BigDecimal getActualDiscountCommission() {
        return actualDiscountCommission;
    }

    public void setActualDiscountCommission(BigDecimal actualDiscountCommission) {
        this.actualDiscountCommission = actualDiscountCommission;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Byte getFinanceType() {
        return financeType;
    }

    public void setFinanceType(Byte financeType) {
        this.financeType = financeType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getBankReceiptUrl() {
        return bankReceiptUrl;
    }

    public void setBankReceiptUrl(String bankReceiptUrl) {
        this.bankReceiptUrl = bankReceiptUrl;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public BigDecimal getForeignExchangeFee() {
        return foreignExchangeFee;
    }

    public void setForeignExchangeFee(BigDecimal foreignExchangeFee) {
        this.foreignExchangeFee = foreignExchangeFee;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transactionId=").append(transactionId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", transactionNumber=").append(transactionNumber);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", accountName=").append(accountName);
        sb.append(", transactionMoney=").append(transactionMoney);
        sb.append(", commission=").append(commission);
        sb.append(", discountCommission=").append(discountCommission);
        sb.append(", transactionMethod=").append(transactionMethod);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", status=").append(status);
        sb.append(", actualMoney=").append(actualMoney);
        sb.append(", actualCommission=").append(actualCommission);
        sb.append(", actualDiscountCommission=").append(actualDiscountCommission);
        sb.append(", balance=").append(balance);
        sb.append(", businessId=").append(businessId);
        sb.append(", financeType=").append(financeType);
        sb.append(", note=").append(note);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", operatorIp=").append(operatorIp);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", bankReceiptUrl=").append(bankReceiptUrl);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", transactionDesc=").append(transactionDesc);
        sb.append(", foreignExchangeFee=").append(foreignExchangeFee);
        sb.append(", withdrawFee=").append(withdrawFee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}