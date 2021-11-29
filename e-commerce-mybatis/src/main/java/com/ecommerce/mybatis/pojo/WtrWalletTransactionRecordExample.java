package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrWalletTransactionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrWalletTransactionRecordExample() {
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

        public Criteria andBankCardIdIsNull() {
            addCriterion("bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNotNull() {
            addCriterion("bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualTo(Integer value) {
            addCriterion("bank_card_id =", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualTo(Integer value) {
            addCriterion("bank_card_id <>", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThan(Integer value) {
            addCriterion("bank_card_id >", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id >=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThan(Integer value) {
            addCriterion("bank_card_id <", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id <=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIn(List<Integer> values) {
            addCriterion("bank_card_id in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotIn(List<Integer> values) {
            addCriterion("bank_card_id not in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id not between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNull() {
            addCriterion("transaction_number is null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNotNull() {
            addCriterion("transaction_number is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberEqualTo(String value) {
            addCriterion("transaction_number =", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotEqualTo(String value) {
            addCriterion("transaction_number <>", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThan(String value) {
            addCriterion("transaction_number >", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_number >=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThan(String value) {
            addCriterion("transaction_number <", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThanOrEqualTo(String value) {
            addCriterion("transaction_number <=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLike(String value) {
            addCriterion("transaction_number like", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotLike(String value) {
            addCriterion("transaction_number not like", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIn(List<String> values) {
            addCriterion("transaction_number in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotIn(List<String> values) {
            addCriterion("transaction_number not in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberBetween(String value1, String value2) {
            addCriterion("transaction_number between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotBetween(String value1, String value2) {
            addCriterion("transaction_number not between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(Byte value) {
            addCriterion("transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(Byte value) {
            addCriterion("transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(Byte value) {
            addCriterion("transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(Byte value) {
            addCriterion("transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<Byte> values) {
            addCriterion("transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<Byte> values) {
            addCriterion("transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(Byte value1, Byte value2) {
            addCriterion("transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("transaction_type not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIsNull() {
            addCriterion("transaction_money is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIsNotNull() {
            addCriterion("transaction_money is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyEqualTo(BigDecimal value) {
            addCriterion("transaction_money =", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("transaction_money <>", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThan(BigDecimal value) {
            addCriterion("transaction_money >", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transaction_money >=", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThan(BigDecimal value) {
            addCriterion("transaction_money <", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transaction_money <=", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIn(List<BigDecimal> values) {
            addCriterion("transaction_money in", values, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("transaction_money not in", values, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transaction_money between", value1, value2, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transaction_money not between", value1, value2, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(BigDecimal value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(BigDecimal value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(BigDecimal value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(BigDecimal value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<BigDecimal> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<BigDecimal> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIsNull() {
            addCriterion("discount_commission is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIsNotNull() {
            addCriterion("discount_commission is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionEqualTo(BigDecimal value) {
            addCriterion("discount_commission =", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotEqualTo(BigDecimal value) {
            addCriterion("discount_commission <>", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThan(BigDecimal value) {
            addCriterion("discount_commission >", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_commission >=", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThan(BigDecimal value) {
            addCriterion("discount_commission <", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_commission <=", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIn(List<BigDecimal> values) {
            addCriterion("discount_commission in", values, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotIn(List<BigDecimal> values) {
            addCriterion("discount_commission not in", values, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_commission between", value1, value2, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_commission not between", value1, value2, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIsNull() {
            addCriterion("transaction_method is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIsNotNull() {
            addCriterion("transaction_method is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodEqualTo(Byte value) {
            addCriterion("transaction_method =", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotEqualTo(Byte value) {
            addCriterion("transaction_method <>", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThan(Byte value) {
            addCriterion("transaction_method >", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("transaction_method >=", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThan(Byte value) {
            addCriterion("transaction_method <", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThanOrEqualTo(Byte value) {
            addCriterion("transaction_method <=", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIn(List<Byte> values) {
            addCriterion("transaction_method in", values, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotIn(List<Byte> values) {
            addCriterion("transaction_method not in", values, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodBetween(Byte value1, Byte value2) {
            addCriterion("transaction_method between", value1, value2, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("transaction_method not between", value1, value2, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
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

        public Criteria andActualMoneyIsNull() {
            addCriterion("actual_money is null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIsNotNull() {
            addCriterion("actual_money is not null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyEqualTo(BigDecimal value) {
            addCriterion("actual_money =", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotEqualTo(BigDecimal value) {
            addCriterion("actual_money <>", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThan(BigDecimal value) {
            addCriterion("actual_money >", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_money >=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThan(BigDecimal value) {
            addCriterion("actual_money <", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_money <=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIn(List<BigDecimal> values) {
            addCriterion("actual_money in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotIn(List<BigDecimal> values) {
            addCriterion("actual_money not in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_money between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_money not between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualCommissionIsNull() {
            addCriterion("actual_commission is null");
            return (Criteria) this;
        }

        public Criteria andActualCommissionIsNotNull() {
            addCriterion("actual_commission is not null");
            return (Criteria) this;
        }

        public Criteria andActualCommissionEqualTo(BigDecimal value) {
            addCriterion("actual_commission =", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotEqualTo(BigDecimal value) {
            addCriterion("actual_commission <>", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThan(BigDecimal value) {
            addCriterion("actual_commission >", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_commission >=", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThan(BigDecimal value) {
            addCriterion("actual_commission <", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_commission <=", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionIn(List<BigDecimal> values) {
            addCriterion("actual_commission in", values, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotIn(List<BigDecimal> values) {
            addCriterion("actual_commission not in", values, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_commission between", value1, value2, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_commission not between", value1, value2, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIsNull() {
            addCriterion("actual_discount_commission is null");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIsNotNull() {
            addCriterion("actual_discount_commission is not null");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionEqualTo(BigDecimal value) {
            addCriterion("actual_discount_commission =", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotEqualTo(BigDecimal value) {
            addCriterion("actual_discount_commission <>", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThan(BigDecimal value) {
            addCriterion("actual_discount_commission >", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_discount_commission >=", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThan(BigDecimal value) {
            addCriterion("actual_discount_commission <", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_discount_commission <=", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIn(List<BigDecimal> values) {
            addCriterion("actual_discount_commission in", values, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotIn(List<BigDecimal> values) {
            addCriterion("actual_discount_commission not in", values, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_discount_commission between", value1, value2, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_discount_commission not between", value1, value2, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNull() {
            addCriterion("finance_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNotNull() {
            addCriterion("finance_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeEqualTo(Byte value) {
            addCriterion("finance_type =", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotEqualTo(Byte value) {
            addCriterion("finance_type <>", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThan(Byte value) {
            addCriterion("finance_type >", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("finance_type >=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThan(Byte value) {
            addCriterion("finance_type <", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("finance_type <=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIn(List<Byte> values) {
            addCriterion("finance_type in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotIn(List<Byte> values) {
            addCriterion("finance_type not in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeBetween(Byte value1, Byte value2) {
            addCriterion("finance_type between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("finance_type not between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNull() {
            addCriterion("operator_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNotNull() {
            addCriterion("operator_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpEqualTo(String value) {
            addCriterion("operator_ip =", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotEqualTo(String value) {
            addCriterion("operator_ip <>", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThan(String value) {
            addCriterion("operator_ip >", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThanOrEqualTo(String value) {
            addCriterion("operator_ip >=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThan(String value) {
            addCriterion("operator_ip <", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThanOrEqualTo(String value) {
            addCriterion("operator_ip <=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLike(String value) {
            addCriterion("operator_ip like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotLike(String value) {
            addCriterion("operator_ip not like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIn(List<String> values) {
            addCriterion("operator_ip in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotIn(List<String> values) {
            addCriterion("operator_ip not in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpBetween(String value1, String value2) {
            addCriterion("operator_ip between", value1, value2, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotBetween(String value1, String value2) {
            addCriterion("operator_ip not between", value1, value2, "operatorIp");
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

        public Criteria andBankReceiptUrlIsNull() {
            addCriterion("bank_receipt_url is null");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlIsNotNull() {
            addCriterion("bank_receipt_url is not null");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlEqualTo(String value) {
            addCriterion("bank_receipt_url =", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotEqualTo(String value) {
            addCriterion("bank_receipt_url <>", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThan(String value) {
            addCriterion("bank_receipt_url >", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bank_receipt_url >=", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThan(String value) {
            addCriterion("bank_receipt_url <", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThanOrEqualTo(String value) {
            addCriterion("bank_receipt_url <=", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLike(String value) {
            addCriterion("bank_receipt_url like", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotLike(String value) {
            addCriterion("bank_receipt_url not like", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlIn(List<String> values) {
            addCriterion("bank_receipt_url in", values, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotIn(List<String> values) {
            addCriterion("bank_receipt_url not in", values, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlBetween(String value1, String value2) {
            addCriterion("bank_receipt_url between", value1, value2, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotBetween(String value1, String value2) {
            addCriterion("bank_receipt_url not between", value1, value2, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNull() {
            addCriterion("transaction_desc is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNotNull() {
            addCriterion("transaction_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescEqualTo(String value) {
            addCriterion("transaction_desc =", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotEqualTo(String value) {
            addCriterion("transaction_desc <>", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThan(String value) {
            addCriterion("transaction_desc >", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_desc >=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThan(String value) {
            addCriterion("transaction_desc <", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThanOrEqualTo(String value) {
            addCriterion("transaction_desc <=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLike(String value) {
            addCriterion("transaction_desc like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotLike(String value) {
            addCriterion("transaction_desc not like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIn(List<String> values) {
            addCriterion("transaction_desc in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotIn(List<String> values) {
            addCriterion("transaction_desc not in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescBetween(String value1, String value2) {
            addCriterion("transaction_desc between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotBetween(String value1, String value2) {
            addCriterion("transaction_desc not between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIsNull() {
            addCriterion("foreign_exchange_fee is null");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIsNotNull() {
            addCriterion("foreign_exchange_fee is not null");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeEqualTo(BigDecimal value) {
            addCriterion("foreign_exchange_fee =", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotEqualTo(BigDecimal value) {
            addCriterion("foreign_exchange_fee <>", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThan(BigDecimal value) {
            addCriterion("foreign_exchange_fee >", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_exchange_fee >=", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThan(BigDecimal value) {
            addCriterion("foreign_exchange_fee <", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_exchange_fee <=", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIn(List<BigDecimal> values) {
            addCriterion("foreign_exchange_fee in", values, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotIn(List<BigDecimal> values) {
            addCriterion("foreign_exchange_fee not in", values, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_exchange_fee between", value1, value2, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_exchange_fee not between", value1, value2, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIsNull() {
            addCriterion("withdraw_fee is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIsNotNull() {
            addCriterion("withdraw_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeEqualTo(BigDecimal value) {
            addCriterion("withdraw_fee =", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_fee <>", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThan(BigDecimal value) {
            addCriterion("withdraw_fee >", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_fee >=", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThan(BigDecimal value) {
            addCriterion("withdraw_fee <", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_fee <=", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIn(List<BigDecimal> values) {
            addCriterion("withdraw_fee in", values, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_fee not in", values, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_fee between", value1, value2, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_fee not between", value1, value2, "withdrawFee");
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