package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WaaWalletAccount implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Integer buyerId;

    /**
     * 账户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "账户名")
    private String accountName;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 支付密码，加密串
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "支付密码，加密串")
    private String password;

    /**
     * 可用金额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "可用金额")
    private BigDecimal availableMoney;

    /**
     * 充值中金额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "充值中金额")
    private BigDecimal depositingMoney;

    /**
     * 提现中金额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "提现中金额")
    private BigDecimal withdrawingMoney;

    /**
     * 状态  7 -正常,  17 -冻结
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态  7 -正常,  17 -冻结")
    private Byte status;

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
     * 账户类型:1-客户 2-厂家
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "账户类型:1-客户 2-厂家")
    private Integer accountType;

    /**
     * 0-FALSE 1-TRUE
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "0-FALSE 1-TRUE")
    private String autoPayStatus;

    /**
     * 币种：USD,RMB
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "币种：USD,RMB")
    private String currency;

    private static final long serialVersionUID = 1L;

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public BigDecimal getDepositingMoney() {
        return depositingMoney;
    }

    public void setDepositingMoney(BigDecimal depositingMoney) {
        this.depositingMoney = depositingMoney;
    }

    public BigDecimal getWithdrawingMoney() {
        return withdrawingMoney;
    }

    public void setWithdrawingMoney(BigDecimal withdrawingMoney) {
        this.withdrawingMoney = withdrawingMoney;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    public void setAutoPayStatus(String autoPayStatus) {
        this.autoPayStatus = autoPayStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buyerId=").append(buyerId);
        sb.append(", accountName=").append(accountName);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", availableMoney=").append(availableMoney);
        sb.append(", depositingMoney=").append(depositingMoney);
        sb.append(", withdrawingMoney=").append(withdrawingMoney);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", accountType=").append(accountType);
        sb.append(", autoPayStatus=").append(autoPayStatus);
        sb.append(", currency=").append(currency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}