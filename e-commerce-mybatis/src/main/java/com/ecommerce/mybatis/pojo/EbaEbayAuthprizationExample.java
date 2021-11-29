package com.ecommerce.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbaEbayAuthprizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbaEbayAuthprizationExample() {
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

        public Criteria andEbaIdIsNull() {
            addCriterion("eba_id is null");
            return (Criteria) this;
        }

        public Criteria andEbaIdIsNotNull() {
            addCriterion("eba_id is not null");
            return (Criteria) this;
        }

        public Criteria andEbaIdEqualTo(Integer value) {
            addCriterion("eba_id =", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdNotEqualTo(Integer value) {
            addCriterion("eba_id <>", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdGreaterThan(Integer value) {
            addCriterion("eba_id >", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eba_id >=", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdLessThan(Integer value) {
            addCriterion("eba_id <", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdLessThanOrEqualTo(Integer value) {
            addCriterion("eba_id <=", value, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdIn(List<Integer> values) {
            addCriterion("eba_id in", values, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdNotIn(List<Integer> values) {
            addCriterion("eba_id not in", values, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdBetween(Integer value1, Integer value2) {
            addCriterion("eba_id between", value1, value2, "ebaId");
            return (Criteria) this;
        }

        public Criteria andEbaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eba_id not between", value1, value2, "ebaId");
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNull() {
            addCriterion("secret_key is null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNotNull() {
            addCriterion("secret_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyEqualTo(String value) {
            addCriterion("secret_key =", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotEqualTo(String value) {
            addCriterion("secret_key <>", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThan(String value) {
            addCriterion("secret_key >", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("secret_key >=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThan(String value) {
            addCriterion("secret_key <", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("secret_key <=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLike(String value) {
            addCriterion("secret_key like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotLike(String value) {
            addCriterion("secret_key not like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIn(List<String> values) {
            addCriterion("secret_key in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotIn(List<String> values) {
            addCriterion("secret_key not in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyBetween(String value1, String value2) {
            addCriterion("secret_key between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotBetween(String value1, String value2) {
            addCriterion("secret_key not between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("last_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("last_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(String value) {
            addCriterion("last_modified_time =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(String value) {
            addCriterion("last_modified_time <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(String value) {
            addCriterion("last_modified_time >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_modified_time >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(String value) {
            addCriterion("last_modified_time <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("last_modified_time <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLike(String value) {
            addCriterion("last_modified_time like", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotLike(String value) {
            addCriterion("last_modified_time not like", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<String> values) {
            addCriterion("last_modified_time in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<String> values) {
            addCriterion("last_modified_time not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(String value1, String value2) {
            addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
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

        public Criteria andExpDateIsNull() {
            addCriterion("exp_date is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("exp_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterion("exp_date =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterion("exp_date <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterion("exp_date >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_date >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterion("exp_date <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterion("exp_date <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterion("exp_date in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterion("exp_date not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterion("exp_date between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterion("exp_date not between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
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