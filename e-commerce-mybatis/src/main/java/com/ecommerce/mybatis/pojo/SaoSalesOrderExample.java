package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaoSalesOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaoSalesOrderExample() {
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

        public Criteria andSaoIdIsNull() {
            addCriterion("sao_id is null");
            return (Criteria) this;
        }

        public Criteria andSaoIdIsNotNull() {
            addCriterion("sao_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaoIdEqualTo(Integer value) {
            addCriterion("sao_id =", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotEqualTo(Integer value) {
            addCriterion("sao_id <>", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThan(Integer value) {
            addCriterion("sao_id >", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sao_id >=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThan(Integer value) {
            addCriterion("sao_id <", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("sao_id <=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdIn(List<Integer> values) {
            addCriterion("sao_id in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotIn(List<Integer> values) {
            addCriterion("sao_id not in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdBetween(Integer value1, Integer value2) {
            addCriterion("sao_id between", value1, value2, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sao_id not between", value1, value2, "saoId");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
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

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNull() {
            addCriterion("call_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNotNull() {
            addCriterion("call_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualTo(Integer value) {
            addCriterion("call_cnt =", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("call_cnt <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("call_cnt >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_cnt >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("call_cnt <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("call_cnt <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntIn(List<Integer> values) {
            addCriterion("call_cnt in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotIn(List<Integer> values) {
            addCriterion("call_cnt not in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntBetween(Integer value1, Integer value2) {
            addCriterion("call_cnt between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotBetween(Integer value1, Integer value2) {
            addCriterion("call_cnt not between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNull() {
            addCriterion("sts_cd is null");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNotNull() {
            addCriterion("sts_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStsCdEqualTo(String value) {
            addCriterion("sts_cd =", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("sts_cd <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("sts_cd >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("sts_cd >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("sts_cd <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("sts_cd <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLike(String value) {
            addCriterion("sts_cd like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotLike(String value) {
            addCriterion("sts_cd not like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdIn(List<String> values) {
            addCriterion("sts_cd in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotIn(List<String> values) {
            addCriterion("sts_cd not in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdBetween(String value1, String value2) {
            addCriterion("sts_cd between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotBetween(String value1, String value2) {
            addCriterion("sts_cd not between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andManIdIsNull() {
            addCriterion("man_id is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("man_id is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("man_id =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("man_id <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("man_id >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_id >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("man_id <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("man_id <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Integer> values) {
            addCriterion("man_id in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Integer> values) {
            addCriterion("man_id not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Integer value1, Integer value2) {
            addCriterion("man_id between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("man_id not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andWarIdIsNull() {
            addCriterion("war_id is null");
            return (Criteria) this;
        }

        public Criteria andWarIdIsNotNull() {
            addCriterion("war_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarIdEqualTo(Integer value) {
            addCriterion("war_id =", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotEqualTo(Integer value) {
            addCriterion("war_id <>", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdGreaterThan(Integer value) {
            addCriterion("war_id >", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("war_id >=", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdLessThan(Integer value) {
            addCriterion("war_id <", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdLessThanOrEqualTo(Integer value) {
            addCriterion("war_id <=", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdIn(List<Integer> values) {
            addCriterion("war_id in", values, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotIn(List<Integer> values) {
            addCriterion("war_id not in", values, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdBetween(Integer value1, Integer value2) {
            addCriterion("war_id between", value1, value2, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("war_id not between", value1, value2, "warId");
            return (Criteria) this;
        }

        public Criteria andSyncDateIsNull() {
            addCriterion("sync_date is null");
            return (Criteria) this;
        }

        public Criteria andSyncDateIsNotNull() {
            addCriterion("sync_date is not null");
            return (Criteria) this;
        }

        public Criteria andSyncDateEqualTo(Date value) {
            addCriterion("sync_date =", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotEqualTo(Date value) {
            addCriterion("sync_date <>", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateGreaterThan(Date value) {
            addCriterion("sync_date >", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sync_date >=", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateLessThan(Date value) {
            addCriterion("sync_date <", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateLessThanOrEqualTo(Date value) {
            addCriterion("sync_date <=", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateIn(List<Date> values) {
            addCriterion("sync_date in", values, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotIn(List<Date> values) {
            addCriterion("sync_date not in", values, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateBetween(Date value1, Date value2) {
            addCriterion("sync_date between", value1, value2, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotBetween(Date value1, Date value2) {
            addCriterion("sync_date not between", value1, value2, "syncDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPushDateIsNull() {
            addCriterion("push_date is null");
            return (Criteria) this;
        }

        public Criteria andPushDateIsNotNull() {
            addCriterion("push_date is not null");
            return (Criteria) this;
        }

        public Criteria andPushDateEqualTo(Date value) {
            addCriterion("push_date =", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotEqualTo(Date value) {
            addCriterion("push_date <>", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateGreaterThan(Date value) {
            addCriterion("push_date >", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateGreaterThanOrEqualTo(Date value) {
            addCriterion("push_date >=", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateLessThan(Date value) {
            addCriterion("push_date <", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateLessThanOrEqualTo(Date value) {
            addCriterion("push_date <=", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateIn(List<Date> values) {
            addCriterion("push_date in", values, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotIn(List<Date> values) {
            addCriterion("push_date not in", values, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateBetween(Date value1, Date value2) {
            addCriterion("push_date between", value1, value2, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotBetween(Date value1, Date value2) {
            addCriterion("push_date not between", value1, value2, "pushDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIsNull() {
            addCriterion("track_no_date is null");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIsNotNull() {
            addCriterion("track_no_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateEqualTo(Date value) {
            addCriterion("track_no_date =", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotEqualTo(Date value) {
            addCriterion("track_no_date <>", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateGreaterThan(Date value) {
            addCriterion("track_no_date >", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("track_no_date >=", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateLessThan(Date value) {
            addCriterion("track_no_date <", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateLessThanOrEqualTo(Date value) {
            addCriterion("track_no_date <=", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIn(List<Date> values) {
            addCriterion("track_no_date in", values, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotIn(List<Date> values) {
            addCriterion("track_no_date not in", values, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateBetween(Date value1, Date value2) {
            addCriterion("track_no_date between", value1, value2, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotBetween(Date value1, Date value2) {
            addCriterion("track_no_date not between", value1, value2, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIsNull() {
            addCriterion("fulfillment_date is null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIsNotNull() {
            addCriterion("fulfillment_date is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateEqualTo(Date value) {
            addCriterion("fulfillment_date =", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotEqualTo(Date value) {
            addCriterion("fulfillment_date <>", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateGreaterThan(Date value) {
            addCriterion("fulfillment_date >", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fulfillment_date >=", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateLessThan(Date value) {
            addCriterion("fulfillment_date <", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateLessThanOrEqualTo(Date value) {
            addCriterion("fulfillment_date <=", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIn(List<Date> values) {
            addCriterion("fulfillment_date in", values, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotIn(List<Date> values) {
            addCriterion("fulfillment_date not in", values, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateBetween(Date value1, Date value2) {
            addCriterion("fulfillment_date between", value1, value2, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotBetween(Date value1, Date value2) {
            addCriterion("fulfillment_date not between", value1, value2, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIsNull() {
            addCriterion("settlement_date is null");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIsNotNull() {
            addCriterion("settlement_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementDateEqualTo(Date value) {
            addCriterion("settlement_date =", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotEqualTo(Date value) {
            addCriterion("settlement_date <>", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateGreaterThan(Date value) {
            addCriterion("settlement_date >", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_date >=", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateLessThan(Date value) {
            addCriterion("settlement_date <", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateLessThanOrEqualTo(Date value) {
            addCriterion("settlement_date <=", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIn(List<Date> values) {
            addCriterion("settlement_date in", values, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotIn(List<Date> values) {
            addCriterion("settlement_date not in", values, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateBetween(Date value1, Date value2) {
            addCriterion("settlement_date between", value1, value2, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotBetween(Date value1, Date value2) {
            addCriterion("settlement_date not between", value1, value2, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNull() {
            addCriterion("product_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("product_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(BigDecimal value) {
            addCriterion("product_amount =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(BigDecimal value) {
            addCriterion("product_amount <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(BigDecimal value) {
            addCriterion("product_amount >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_amount >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(BigDecimal value) {
            addCriterion("product_amount <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_amount <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<BigDecimal> values) {
            addCriterion("product_amount in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<BigDecimal> values) {
            addCriterion("product_amount not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_amount between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_amount not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andFreightCostIsNull() {
            addCriterion("freight_cost is null");
            return (Criteria) this;
        }

        public Criteria andFreightCostIsNotNull() {
            addCriterion("freight_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFreightCostEqualTo(BigDecimal value) {
            addCriterion("freight_cost =", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotEqualTo(BigDecimal value) {
            addCriterion("freight_cost <>", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostGreaterThan(BigDecimal value) {
            addCriterion("freight_cost >", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_cost >=", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostLessThan(BigDecimal value) {
            addCriterion("freight_cost <", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_cost <=", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostIn(List<BigDecimal> values) {
            addCriterion("freight_cost in", values, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotIn(List<BigDecimal> values) {
            addCriterion("freight_cost not in", values, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_cost between", value1, value2, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_cost not between", value1, value2, "freightCost");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNull() {
            addCriterion("handling_fee is null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNotNull() {
            addCriterion("handling_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeEqualTo(BigDecimal value) {
            addCriterion("handling_fee =", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotEqualTo(BigDecimal value) {
            addCriterion("handling_fee <>", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThan(BigDecimal value) {
            addCriterion("handling_fee >", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("handling_fee >=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThan(BigDecimal value) {
            addCriterion("handling_fee <", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("handling_fee <=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIn(List<BigDecimal> values) {
            addCriterion("handling_fee in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotIn(List<BigDecimal> values) {
            addCriterion("handling_fee not in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handling_fee between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handling_fee not between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNull() {
            addCriterion("customer_remark is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNotNull() {
            addCriterion("customer_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkEqualTo(String value) {
            addCriterion("customer_remark =", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotEqualTo(String value) {
            addCriterion("customer_remark <>", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThan(String value) {
            addCriterion("customer_remark >", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("customer_remark >=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThan(String value) {
            addCriterion("customer_remark <", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThanOrEqualTo(String value) {
            addCriterion("customer_remark <=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLike(String value) {
            addCriterion("customer_remark like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotLike(String value) {
            addCriterion("customer_remark not like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIn(List<String> values) {
            addCriterion("customer_remark in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotIn(List<String> values) {
            addCriterion("customer_remark not in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkBetween(String value1, String value2) {
            addCriterion("customer_remark between", value1, value2, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotBetween(String value1, String value2) {
            addCriterion("customer_remark not between", value1, value2, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNull() {
            addCriterion("order_sts is null");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNotNull() {
            addCriterion("order_sts is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStsEqualTo(String value) {
            addCriterion("order_sts =", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotEqualTo(String value) {
            addCriterion("order_sts <>", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThan(String value) {
            addCriterion("order_sts >", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("order_sts >=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThan(String value) {
            addCriterion("order_sts <", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThanOrEqualTo(String value) {
            addCriterion("order_sts <=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLike(String value) {
            addCriterion("order_sts like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotLike(String value) {
            addCriterion("order_sts not like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsIn(List<String> values) {
            addCriterion("order_sts in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotIn(List<String> values) {
            addCriterion("order_sts not in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsBetween(String value1, String value2) {
            addCriterion("order_sts between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotBetween(String value1, String value2) {
            addCriterion("order_sts not between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNull() {
            addCriterion("refund_sts is null");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNotNull() {
            addCriterion("refund_sts is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStsEqualTo(String value) {
            addCriterion("refund_sts =", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotEqualTo(String value) {
            addCriterion("refund_sts <>", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThan(String value) {
            addCriterion("refund_sts >", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThanOrEqualTo(String value) {
            addCriterion("refund_sts >=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThan(String value) {
            addCriterion("refund_sts <", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThanOrEqualTo(String value) {
            addCriterion("refund_sts <=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLike(String value) {
            addCriterion("refund_sts like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotLike(String value) {
            addCriterion("refund_sts not like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsIn(List<String> values) {
            addCriterion("refund_sts in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotIn(List<String> values) {
            addCriterion("refund_sts not in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsBetween(String value1, String value2) {
            addCriterion("refund_sts between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotBetween(String value1, String value2) {
            addCriterion("refund_sts not between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIsNull() {
            addCriterion("delivery_sts is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIsNotNull() {
            addCriterion("delivery_sts is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsEqualTo(String value) {
            addCriterion("delivery_sts =", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotEqualTo(String value) {
            addCriterion("delivery_sts <>", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsGreaterThan(String value) {
            addCriterion("delivery_sts >", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_sts >=", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLessThan(String value) {
            addCriterion("delivery_sts <", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLessThanOrEqualTo(String value) {
            addCriterion("delivery_sts <=", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLike(String value) {
            addCriterion("delivery_sts like", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotLike(String value) {
            addCriterion("delivery_sts not like", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIn(List<String> values) {
            addCriterion("delivery_sts in", values, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotIn(List<String> values) {
            addCriterion("delivery_sts not in", values, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsBetween(String value1, String value2) {
            addCriterion("delivery_sts between", value1, value2, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotBetween(String value1, String value2) {
            addCriterion("delivery_sts not between", value1, value2, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNull() {
            addCriterion("sto_id is null");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNotNull() {
            addCriterion("sto_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualTo(Integer value) {
            addCriterion("sto_id =", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(Integer value) {
            addCriterion("sto_id <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(Integer value) {
            addCriterion("sto_id >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sto_id >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(Integer value) {
            addCriterion("sto_id <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(Integer value) {
            addCriterion("sto_id <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdIn(List<Integer> values) {
            addCriterion("sto_id in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotIn(List<Integer> values) {
            addCriterion("sto_id not in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdBetween(Integer value1, Integer value2) {
            addCriterion("sto_id between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sto_id not between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIsNull() {
            addCriterion("last_freight_cost is null");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIsNotNull() {
            addCriterion("last_freight_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostEqualTo(BigDecimal value) {
            addCriterion("last_freight_cost =", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotEqualTo(BigDecimal value) {
            addCriterion("last_freight_cost <>", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostGreaterThan(BigDecimal value) {
            addCriterion("last_freight_cost >", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_freight_cost >=", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostLessThan(BigDecimal value) {
            addCriterion("last_freight_cost <", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_freight_cost <=", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIn(List<BigDecimal> values) {
            addCriterion("last_freight_cost in", values, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotIn(List<BigDecimal> values) {
            addCriterion("last_freight_cost not in", values, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_freight_cost between", value1, value2, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_freight_cost not between", value1, value2, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIsNull() {
            addCriterion("auto_pay_status is null");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIsNotNull() {
            addCriterion("auto_pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusEqualTo(String value) {
            addCriterion("auto_pay_status =", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotEqualTo(String value) {
            addCriterion("auto_pay_status <>", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusGreaterThan(String value) {
            addCriterion("auto_pay_status >", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("auto_pay_status >=", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLessThan(String value) {
            addCriterion("auto_pay_status <", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLessThanOrEqualTo(String value) {
            addCriterion("auto_pay_status <=", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLike(String value) {
            addCriterion("auto_pay_status like", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotLike(String value) {
            addCriterion("auto_pay_status not like", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIn(List<String> values) {
            addCriterion("auto_pay_status in", values, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotIn(List<String> values) {
            addCriterion("auto_pay_status not in", values, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusBetween(String value1, String value2) {
            addCriterion("auto_pay_status between", value1, value2, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotBetween(String value1, String value2) {
            addCriterion("auto_pay_status not between", value1, value2, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIsNull() {
            addCriterion("auto_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIsNotNull() {
            addCriterion("auto_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeEqualTo(String value) {
            addCriterion("auto_pay_time =", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotEqualTo(String value) {
            addCriterion("auto_pay_time <>", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeGreaterThan(String value) {
            addCriterion("auto_pay_time >", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("auto_pay_time >=", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLessThan(String value) {
            addCriterion("auto_pay_time <", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLessThanOrEqualTo(String value) {
            addCriterion("auto_pay_time <=", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLike(String value) {
            addCriterion("auto_pay_time like", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotLike(String value) {
            addCriterion("auto_pay_time not like", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIn(List<String> values) {
            addCriterion("auto_pay_time in", values, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotIn(List<String> values) {
            addCriterion("auto_pay_time not in", values, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeBetween(String value1, String value2) {
            addCriterion("auto_pay_time between", value1, value2, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotBetween(String value1, String value2) {
            addCriterion("auto_pay_time not between", value1, value2, "autoPayTime");
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