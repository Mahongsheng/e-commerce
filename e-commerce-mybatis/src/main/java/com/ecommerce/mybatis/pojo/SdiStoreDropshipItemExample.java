package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdiStoreDropshipItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SdiStoreDropshipItemExample() {
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

        public Criteria andDilIdIsNull() {
            addCriterion("dil_id is null");
            return (Criteria) this;
        }

        public Criteria andDilIdIsNotNull() {
            addCriterion("dil_id is not null");
            return (Criteria) this;
        }

        public Criteria andDilIdEqualTo(Integer value) {
            addCriterion("dil_id =", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotEqualTo(Integer value) {
            addCriterion("dil_id <>", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThan(Integer value) {
            addCriterion("dil_id >", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dil_id >=", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdLessThan(Integer value) {
            addCriterion("dil_id <", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdLessThanOrEqualTo(Integer value) {
            addCriterion("dil_id <=", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdIn(List<Integer> values) {
            addCriterion("dil_id in", values, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotIn(List<Integer> values) {
            addCriterion("dil_id not in", values, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdBetween(Integer value1, Integer value2) {
            addCriterion("dil_id between", value1, value2, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dil_id not between", value1, value2, "dilId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNull() {
            addCriterion("str_id is null");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNotNull() {
            addCriterion("str_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdEqualTo(Integer value) {
            addCriterion("str_id =", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualTo(Integer value) {
            addCriterion("str_id <>", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThan(Integer value) {
            addCriterion("str_id >", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("str_id >=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThan(Integer value) {
            addCriterion("str_id <", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualTo(Integer value) {
            addCriterion("str_id <=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdIn(List<Integer> values) {
            addCriterion("str_id in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotIn(List<Integer> values) {
            addCriterion("str_id not in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdBetween(Integer value1, Integer value2) {
            addCriterion("str_id between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("str_id not between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionIsNull() {
            addCriterion("store_retention is null");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionIsNotNull() {
            addCriterion("store_retention is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionEqualTo(Integer value) {
            addCriterion("store_retention =", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotEqualTo(Integer value) {
            addCriterion("store_retention <>", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThan(Integer value) {
            addCriterion("store_retention >", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_retention >=", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThan(Integer value) {
            addCriterion("store_retention <", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThanOrEqualTo(Integer value) {
            addCriterion("store_retention <=", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionIn(List<Integer> values) {
            addCriterion("store_retention in", values, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotIn(List<Integer> values) {
            addCriterion("store_retention not in", values, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionBetween(Integer value1, Integer value2) {
            addCriterion("store_retention between", value1, value2, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotBetween(Integer value1, Integer value2) {
            addCriterion("store_retention not between", value1, value2, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIsNull() {
            addCriterion("dropship_price is null");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIsNotNull() {
            addCriterion("dropship_price is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceEqualTo(BigDecimal value) {
            addCriterion("dropship_price =", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotEqualTo(BigDecimal value) {
            addCriterion("dropship_price <>", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThan(BigDecimal value) {
            addCriterion("dropship_price >", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dropship_price >=", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThan(BigDecimal value) {
            addCriterion("dropship_price <", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dropship_price <=", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIn(List<BigDecimal> values) {
            addCriterion("dropship_price in", values, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotIn(List<BigDecimal> values) {
            addCriterion("dropship_price not in", values, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dropship_price between", value1, value2, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dropship_price not between", value1, value2, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIsNull() {
            addCriterion("dropship_status is null");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIsNotNull() {
            addCriterion("dropship_status is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusEqualTo(String value) {
            addCriterion("dropship_status =", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotEqualTo(String value) {
            addCriterion("dropship_status <>", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThan(String value) {
            addCriterion("dropship_status >", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dropship_status >=", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThan(String value) {
            addCriterion("dropship_status <", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThanOrEqualTo(String value) {
            addCriterion("dropship_status <=", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLike(String value) {
            addCriterion("dropship_status like", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotLike(String value) {
            addCriterion("dropship_status not like", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIn(List<String> values) {
            addCriterion("dropship_status in", values, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotIn(List<String> values) {
            addCriterion("dropship_status not in", values, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusBetween(String value1, String value2) {
            addCriterion("dropship_status between", value1, value2, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotBetween(String value1, String value2) {
            addCriterion("dropship_status not between", value1, value2, "dropshipStatus");
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

        public Criteria andShelfStockIsNull() {
            addCriterion("shelf_stock is null");
            return (Criteria) this;
        }

        public Criteria andShelfStockIsNotNull() {
            addCriterion("shelf_stock is not null");
            return (Criteria) this;
        }

        public Criteria andShelfStockEqualTo(Integer value) {
            addCriterion("shelf_stock =", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotEqualTo(Integer value) {
            addCriterion("shelf_stock <>", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThan(Integer value) {
            addCriterion("shelf_stock >", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_stock >=", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThan(Integer value) {
            addCriterion("shelf_stock <", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_stock <=", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockIn(List<Integer> values) {
            addCriterion("shelf_stock in", values, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotIn(List<Integer> values) {
            addCriterion("shelf_stock not in", values, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockBetween(Integer value1, Integer value2) {
            addCriterion("shelf_stock between", value1, value2, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_stock not between", value1, value2, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andPreferDateIsNull() {
            addCriterion("prefer_date is null");
            return (Criteria) this;
        }

        public Criteria andPreferDateIsNotNull() {
            addCriterion("prefer_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreferDateEqualTo(Date value) {
            addCriterion("prefer_date =", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotEqualTo(Date value) {
            addCriterion("prefer_date <>", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThan(Date value) {
            addCriterion("prefer_date >", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThanOrEqualTo(Date value) {
            addCriterion("prefer_date >=", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThan(Date value) {
            addCriterion("prefer_date <", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThanOrEqualTo(Date value) {
            addCriterion("prefer_date <=", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateIn(List<Date> values) {
            addCriterion("prefer_date in", values, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotIn(List<Date> values) {
            addCriterion("prefer_date not in", values, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateBetween(Date value1, Date value2) {
            addCriterion("prefer_date between", value1, value2, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotBetween(Date value1, Date value2) {
            addCriterion("prefer_date not between", value1, value2, "preferDate");
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