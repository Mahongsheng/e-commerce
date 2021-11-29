package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PckPackageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PckPackageInfoExample() {
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

        public Criteria andPckIdIsNull() {
            addCriterion("pck_id is null");
            return (Criteria) this;
        }

        public Criteria andPckIdIsNotNull() {
            addCriterion("pck_id is not null");
            return (Criteria) this;
        }

        public Criteria andPckIdEqualTo(Integer value) {
            addCriterion("pck_id =", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdNotEqualTo(Integer value) {
            addCriterion("pck_id <>", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdGreaterThan(Integer value) {
            addCriterion("pck_id >", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pck_id >=", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdLessThan(Integer value) {
            addCriterion("pck_id <", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdLessThanOrEqualTo(Integer value) {
            addCriterion("pck_id <=", value, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdIn(List<Integer> values) {
            addCriterion("pck_id in", values, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdNotIn(List<Integer> values) {
            addCriterion("pck_id not in", values, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdBetween(Integer value1, Integer value2) {
            addCriterion("pck_id between", value1, value2, "pckId");
            return (Criteria) this;
        }

        public Criteria andPckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pck_id not between", value1, value2, "pckId");
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

        public Criteria andTypeCdIsNull() {
            addCriterion("type_cd is null");
            return (Criteria) this;
        }

        public Criteria andTypeCdIsNotNull() {
            addCriterion("type_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCdEqualTo(String value) {
            addCriterion("type_cd =", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotEqualTo(String value) {
            addCriterion("type_cd <>", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThan(String value) {
            addCriterion("type_cd >", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("type_cd >=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThan(String value) {
            addCriterion("type_cd <", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThanOrEqualTo(String value) {
            addCriterion("type_cd <=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLike(String value) {
            addCriterion("type_cd like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotLike(String value) {
            addCriterion("type_cd not like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdIn(List<String> values) {
            addCriterion("type_cd in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotIn(List<String> values) {
            addCriterion("type_cd not in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdBetween(String value1, String value2) {
            addCriterion("type_cd between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotBetween(String value1, String value2) {
            addCriterion("type_cd not between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andLastUpdeteDateIsNull() {
            addCriterion("last_updete_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateIsNotNull() {
            addCriterion("last_updete_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateEqualTo(Date value) {
            addCriterion("last_updete_date =", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateNotEqualTo(Date value) {
            addCriterion("last_updete_date <>", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateGreaterThan(Date value) {
            addCriterion("last_updete_date >", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updete_date >=", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateLessThan(Date value) {
            addCriterion("last_updete_date <", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateLessThanOrEqualTo(Date value) {
            addCriterion("last_updete_date <=", value, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateIn(List<Date> values) {
            addCriterion("last_updete_date in", values, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateNotIn(List<Date> values) {
            addCriterion("last_updete_date not in", values, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateBetween(Date value1, Date value2) {
            addCriterion("last_updete_date between", value1, value2, "lastUpdeteDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdeteDateNotBetween(Date value1, Date value2) {
            addCriterion("last_updete_date not between", value1, value2, "lastUpdeteDate");
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

        public Criteria andHeavyCargoIsNull() {
            addCriterion("heavy_cargo is null");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoIsNotNull() {
            addCriterion("heavy_cargo is not null");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoEqualTo(String value) {
            addCriterion("heavy_cargo =", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoNotEqualTo(String value) {
            addCriterion("heavy_cargo <>", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoGreaterThan(String value) {
            addCriterion("heavy_cargo >", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoGreaterThanOrEqualTo(String value) {
            addCriterion("heavy_cargo >=", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoLessThan(String value) {
            addCriterion("heavy_cargo <", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoLessThanOrEqualTo(String value) {
            addCriterion("heavy_cargo <=", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoLike(String value) {
            addCriterion("heavy_cargo like", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoNotLike(String value) {
            addCriterion("heavy_cargo not like", value, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoIn(List<String> values) {
            addCriterion("heavy_cargo in", values, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoNotIn(List<String> values) {
            addCriterion("heavy_cargo not in", values, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoBetween(String value1, String value2) {
            addCriterion("heavy_cargo between", value1, value2, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andHeavyCargoNotBetween(String value1, String value2) {
            addCriterion("heavy_cargo not between", value1, value2, "heavyCargo");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
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