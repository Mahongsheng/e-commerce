package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtaWalletTransactionAduitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtaWalletTransactionAduitExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTransactionAuditIdIsNull() {
            addCriterion("transaction_audit_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdIsNotNull() {
            addCriterion("transaction_audit_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdEqualTo(Integer value) {
            addCriterion("transaction_audit_id =", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotEqualTo(Integer value) {
            addCriterion("transaction_audit_id <>", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThan(Integer value) {
            addCriterion("transaction_audit_id >", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_audit_id >=", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThan(Integer value) {
            addCriterion("transaction_audit_id <", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_audit_id <=", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdIn(List<Integer> values) {
            addCriterion("transaction_audit_id in", values, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotIn(List<Integer> values) {
            addCriterion("transaction_audit_id not in", values, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdBetween(Integer value1, Integer value2) {
            addCriterion("transaction_audit_id between", value1, value2, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_audit_id not between", value1, value2, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(Integer value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(Integer value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(Integer value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(Integer value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<Integer> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<Integer> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIsNull() {
            addCriterion("available_money_before is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIsNotNull() {
            addCriterion("available_money_before is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("available_money_before =", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("available_money_before <>", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("available_money_before >", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_money_before >=", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("available_money_before <", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_money_before <=", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("available_money_before in", values, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("available_money_before not in", values, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_money_before between", value1, value2, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_money_before not between", value1, value2, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIsNull() {
            addCriterion("depositing_money_before is null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIsNotNull() {
            addCriterion("depositing_money_before is not null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("depositing_money_before =", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("depositing_money_before <>", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("depositing_money_before >", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("depositing_money_before >=", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("depositing_money_before <", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("depositing_money_before <=", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("depositing_money_before in", values, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("depositing_money_before not in", values, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositing_money_before between", value1, value2, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositing_money_before not between", value1, value2, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIsNull() {
            addCriterion("withdrawing_money_before is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIsNotNull() {
            addCriterion("withdrawing_money_before is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_before =", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_before <>", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("withdrawing_money_before >", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_before >=", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("withdrawing_money_before <", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_before <=", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("withdrawing_money_before in", values, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("withdrawing_money_before not in", values, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawing_money_before between", value1, value2, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawing_money_before not between", value1, value2, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIsNull() {
            addCriterion("operate_money is null");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIsNotNull() {
            addCriterion("operate_money is not null");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyEqualTo(BigDecimal value) {
            addCriterion("operate_money =", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotEqualTo(BigDecimal value) {
            addCriterion("operate_money <>", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThan(BigDecimal value) {
            addCriterion("operate_money >", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operate_money >=", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThan(BigDecimal value) {
            addCriterion("operate_money <", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operate_money <=", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIn(List<BigDecimal> values) {
            addCriterion("operate_money in", values, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotIn(List<BigDecimal> values) {
            addCriterion("operate_money not in", values, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operate_money between", value1, value2, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operate_money not between", value1, value2, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(Byte value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(Byte value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(Byte value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(Byte value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<Byte> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<Byte> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(Byte value1, Byte value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIsNull() {
            addCriterion("available_money_after is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIsNotNull() {
            addCriterion("available_money_after is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("available_money_after =", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("available_money_after <>", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("available_money_after >", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_money_after >=", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThan(BigDecimal value) {
            addCriterion("available_money_after <", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_money_after <=", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("available_money_after in", values, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("available_money_after not in", values, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_money_after between", value1, value2, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_money_after not between", value1, value2, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIsNull() {
            addCriterion("depositing_money_after is null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIsNotNull() {
            addCriterion("depositing_money_after is not null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("depositing_money_after =", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("depositing_money_after <>", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("depositing_money_after >", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("depositing_money_after >=", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThan(BigDecimal value) {
            addCriterion("depositing_money_after <", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("depositing_money_after <=", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("depositing_money_after in", values, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("depositing_money_after not in", values, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositing_money_after between", value1, value2, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositing_money_after not between", value1, value2, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIsNull() {
            addCriterion("withdrawing_money_after is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIsNotNull() {
            addCriterion("withdrawing_money_after is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_after =", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_after <>", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("withdrawing_money_after >", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_after >=", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThan(BigDecimal value) {
            addCriterion("withdrawing_money_after <", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawing_money_after <=", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("withdrawing_money_after in", values, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("withdrawing_money_after not in", values, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawing_money_after between", value1, value2, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawing_money_after not between", value1, value2, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andOperateByIsNull() {
            addCriterion("operate_by is null");
            return (Criteria) this;
        }

        public Criteria andOperateByIsNotNull() {
            addCriterion("operate_by is not null");
            return (Criteria) this;
        }

        public Criteria andOperateByEqualTo(String value) {
            addCriterion("operate_by =", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotEqualTo(String value) {
            addCriterion("operate_by <>", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThan(String value) {
            addCriterion("operate_by >", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThanOrEqualTo(String value) {
            addCriterion("operate_by >=", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByLessThan(String value) {
            addCriterion("operate_by <", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByLessThanOrEqualTo(String value) {
            addCriterion("operate_by <=", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByLike(String value) {
            addCriterion("operate_by like", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotLike(String value) {
            addCriterion("operate_by not like", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByIn(List<String> values) {
            addCriterion("operate_by in", values, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotIn(List<String> values) {
            addCriterion("operate_by not in", values, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByBetween(String value1, String value2) {
            addCriterion("operate_by between", value1, value2, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotBetween(String value1, String value2) {
            addCriterion("operate_by not between", value1, value2, "operateBy");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("last_update_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("last_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("last_update_by =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("last_update_by <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("last_update_by >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_by >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("last_update_by <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("last_update_by <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("last_update_by like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("last_update_by not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("last_update_by in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("last_update_by not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("last_update_by between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("last_update_by not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}