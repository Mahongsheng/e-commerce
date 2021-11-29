package com.ecommerce.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShaShippingAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShaShippingAddressExample() {
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

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNull() {
            addCriterion("given_name is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("given_name is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("given_name =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("given_name <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("given_name >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("given_name >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("given_name <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("given_name <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("given_name like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("given_name not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("given_name in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("given_name not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("given_name between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("given_name not between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIsNull() {
            addCriterion("country_iso_cd is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIsNotNull() {
            addCriterion("country_iso_cd is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdEqualTo(String value) {
            addCriterion("country_iso_cd =", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotEqualTo(String value) {
            addCriterion("country_iso_cd <>", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThan(String value) {
            addCriterion("country_iso_cd >", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThanOrEqualTo(String value) {
            addCriterion("country_iso_cd >=", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThan(String value) {
            addCriterion("country_iso_cd <", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThanOrEqualTo(String value) {
            addCriterion("country_iso_cd <=", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLike(String value) {
            addCriterion("country_iso_cd like", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotLike(String value) {
            addCriterion("country_iso_cd not like", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIn(List<String> values) {
            addCriterion("country_iso_cd in", values, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotIn(List<String> values) {
            addCriterion("country_iso_cd not in", values, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdBetween(String value1, String value2) {
            addCriterion("country_iso_cd between", value1, value2, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotBetween(String value1, String value2) {
            addCriterion("country_iso_cd not between", value1, value2, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIsNull() {
            addCriterion("state_or_province_name is null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIsNotNull() {
            addCriterion("state_or_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameEqualTo(String value) {
            addCriterion("state_or_province_name =", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotEqualTo(String value) {
            addCriterion("state_or_province_name <>", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThan(String value) {
            addCriterion("state_or_province_name >", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("state_or_province_name >=", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThan(String value) {
            addCriterion("state_or_province_name <", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("state_or_province_name <=", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLike(String value) {
            addCriterion("state_or_province_name like", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotLike(String value) {
            addCriterion("state_or_province_name not like", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIn(List<String> values) {
            addCriterion("state_or_province_name in", values, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotIn(List<String> values) {
            addCriterion("state_or_province_name not in", values, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameBetween(String value1, String value2) {
            addCriterion("state_or_province_name between", value1, value2, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotBetween(String value1, String value2) {
            addCriterion("state_or_province_name not between", value1, value2, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIsNull() {
            addCriterion("state_or_province_cd is null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIsNotNull() {
            addCriterion("state_or_province_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdEqualTo(String value) {
            addCriterion("state_or_province_cd =", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotEqualTo(String value) {
            addCriterion("state_or_province_cd <>", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThan(String value) {
            addCriterion("state_or_province_cd >", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThanOrEqualTo(String value) {
            addCriterion("state_or_province_cd >=", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThan(String value) {
            addCriterion("state_or_province_cd <", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThanOrEqualTo(String value) {
            addCriterion("state_or_province_cd <=", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLike(String value) {
            addCriterion("state_or_province_cd like", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotLike(String value) {
            addCriterion("state_or_province_cd not like", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIn(List<String> values) {
            addCriterion("state_or_province_cd in", values, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotIn(List<String> values) {
            addCriterion("state_or_province_cd not in", values, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdBetween(String value1, String value2) {
            addCriterion("state_or_province_cd between", value1, value2, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotBetween(String value1, String value2) {
            addCriterion("state_or_province_cd not between", value1, value2, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAddressLine1IsNull() {
            addCriterion("address_line1 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine1IsNotNull() {
            addCriterion("address_line1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine1EqualTo(String value) {
            addCriterion("address_line1 =", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotEqualTo(String value) {
            addCriterion("address_line1 <>", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThan(String value) {
            addCriterion("address_line1 >", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThanOrEqualTo(String value) {
            addCriterion("address_line1 >=", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThan(String value) {
            addCriterion("address_line1 <", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThanOrEqualTo(String value) {
            addCriterion("address_line1 <=", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1Like(String value) {
            addCriterion("address_line1 like", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotLike(String value) {
            addCriterion("address_line1 not like", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1In(List<String> values) {
            addCriterion("address_line1 in", values, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotIn(List<String> values) {
            addCriterion("address_line1 not in", values, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1Between(String value1, String value2) {
            addCriterion("address_line1 between", value1, value2, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotBetween(String value1, String value2) {
            addCriterion("address_line1 not between", value1, value2, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine2IsNull() {
            addCriterion("address_line2 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine2IsNotNull() {
            addCriterion("address_line2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine2EqualTo(String value) {
            addCriterion("address_line2 =", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotEqualTo(String value) {
            addCriterion("address_line2 <>", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThan(String value) {
            addCriterion("address_line2 >", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThanOrEqualTo(String value) {
            addCriterion("address_line2 >=", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThan(String value) {
            addCriterion("address_line2 <", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThanOrEqualTo(String value) {
            addCriterion("address_line2 <=", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2Like(String value) {
            addCriterion("address_line2 like", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotLike(String value) {
            addCriterion("address_line2 not like", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2In(List<String> values) {
            addCriterion("address_line2 in", values, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotIn(List<String> values) {
            addCriterion("address_line2 not in", values, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2Between(String value1, String value2) {
            addCriterion("address_line2 between", value1, value2, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotBetween(String value1, String value2) {
            addCriterion("address_line2 not between", value1, value2, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine3IsNull() {
            addCriterion("address_line3 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine3IsNotNull() {
            addCriterion("address_line3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine3EqualTo(String value) {
            addCriterion("address_line3 =", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotEqualTo(String value) {
            addCriterion("address_line3 <>", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThan(String value) {
            addCriterion("address_line3 >", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThanOrEqualTo(String value) {
            addCriterion("address_line3 >=", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThan(String value) {
            addCriterion("address_line3 <", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThanOrEqualTo(String value) {
            addCriterion("address_line3 <=", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3Like(String value) {
            addCriterion("address_line3 like", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotLike(String value) {
            addCriterion("address_line3 not like", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3In(List<String> values) {
            addCriterion("address_line3 in", values, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotIn(List<String> values) {
            addCriterion("address_line3 not in", values, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3Between(String value1, String value2) {
            addCriterion("address_line3 between", value1, value2, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotBetween(String value1, String value2) {
            addCriterion("address_line3 not between", value1, value2, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andPostalCdIsNull() {
            addCriterion("postal_cd is null");
            return (Criteria) this;
        }

        public Criteria andPostalCdIsNotNull() {
            addCriterion("postal_cd is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCdEqualTo(String value) {
            addCriterion("postal_cd =", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotEqualTo(String value) {
            addCriterion("postal_cd <>", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThan(String value) {
            addCriterion("postal_cd >", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThanOrEqualTo(String value) {
            addCriterion("postal_cd >=", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThan(String value) {
            addCriterion("postal_cd <", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThanOrEqualTo(String value) {
            addCriterion("postal_cd <=", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdLike(String value) {
            addCriterion("postal_cd like", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotLike(String value) {
            addCriterion("postal_cd not like", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdIn(List<String> values) {
            addCriterion("postal_cd in", values, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotIn(List<String> values) {
            addCriterion("postal_cd not in", values, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdBetween(String value1, String value2) {
            addCriterion("postal_cd between", value1, value2, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotBetween(String value1, String value2) {
            addCriterion("postal_cd not between", value1, value2, "postalCd");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIsNull() {
            addCriterion("contact_phone_no is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIsNotNull() {
            addCriterion("contact_phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoEqualTo(String value) {
            addCriterion("contact_phone_no =", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotEqualTo(String value) {
            addCriterion("contact_phone_no <>", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThan(String value) {
            addCriterion("contact_phone_no >", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_no >=", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThan(String value) {
            addCriterion("contact_phone_no <", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("contact_phone_no <=", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLike(String value) {
            addCriterion("contact_phone_no like", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotLike(String value) {
            addCriterion("contact_phone_no not like", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIn(List<String> values) {
            addCriterion("contact_phone_no in", values, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotIn(List<String> values) {
            addCriterion("contact_phone_no not in", values, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoBetween(String value1, String value2) {
            addCriterion("contact_phone_no between", value1, value2, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotBetween(String value1, String value2) {
            addCriterion("contact_phone_no not between", value1, value2, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andCarrierNameIsNull() {
            addCriterion("carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("carrier_name =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("carrier_name <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("carrier_name >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_name >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("carrier_name <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("carrier_name <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("carrier_name like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("carrier_name not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("carrier_name in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("carrier_name not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("carrier_name between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("carrier_name not between", value1, value2, "carrierName");
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