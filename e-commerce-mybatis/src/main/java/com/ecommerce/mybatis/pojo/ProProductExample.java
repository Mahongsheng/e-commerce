package com.ecommerce.mybatis.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductExample() {
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

        public Criteria andSkuCdIsNull() {
            addCriterion("sku_cd is null");
            return (Criteria) this;
        }

        public Criteria andSkuCdIsNotNull() {
            addCriterion("sku_cd is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCdEqualTo(String value) {
            addCriterion("sku_cd =", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotEqualTo(String value) {
            addCriterion("sku_cd <>", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThan(String value) {
            addCriterion("sku_cd >", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_cd >=", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThan(String value) {
            addCriterion("sku_cd <", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThanOrEqualTo(String value) {
            addCriterion("sku_cd <=", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdLike(String value) {
            addCriterion("sku_cd like", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotLike(String value) {
            addCriterion("sku_cd not like", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdIn(List<String> values) {
            addCriterion("sku_cd in", values, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotIn(List<String> values) {
            addCriterion("sku_cd not in", values, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdBetween(String value1, String value2) {
            addCriterion("sku_cd between", value1, value2, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotBetween(String value1, String value2) {
            addCriterion("sku_cd not between", value1, value2, "skuCd");
            return (Criteria) this;
        }

        public Criteria andBrdIdIsNull() {
            addCriterion("brd_id is null");
            return (Criteria) this;
        }

        public Criteria andBrdIdIsNotNull() {
            addCriterion("brd_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrdIdEqualTo(Integer value) {
            addCriterion("brd_id =", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotEqualTo(Integer value) {
            addCriterion("brd_id <>", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThan(Integer value) {
            addCriterion("brd_id >", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brd_id >=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThan(Integer value) {
            addCriterion("brd_id <", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("brd_id <=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdIn(List<Integer> values) {
            addCriterion("brd_id in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotIn(List<Integer> values) {
            addCriterion("brd_id not in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdBetween(Integer value1, Integer value2) {
            addCriterion("brd_id between", value1, value2, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brd_id not between", value1, value2, "brdId");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUpcIsNull() {
            addCriterion("upc is null");
            return (Criteria) this;
        }

        public Criteria andUpcIsNotNull() {
            addCriterion("upc is not null");
            return (Criteria) this;
        }

        public Criteria andUpcEqualTo(String value) {
            addCriterion("upc =", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotEqualTo(String value) {
            addCriterion("upc <>", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThan(String value) {
            addCriterion("upc >", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThanOrEqualTo(String value) {
            addCriterion("upc >=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThan(String value) {
            addCriterion("upc <", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThanOrEqualTo(String value) {
            addCriterion("upc <=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLike(String value) {
            addCriterion("upc like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotLike(String value) {
            addCriterion("upc not like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcIn(List<String> values) {
            addCriterion("upc in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotIn(List<String> values) {
            addCriterion("upc not in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcBetween(String value1, String value2) {
            addCriterion("upc between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotBetween(String value1, String value2) {
            addCriterion("upc not between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andEanIsNull() {
            addCriterion("ean is null");
            return (Criteria) this;
        }

        public Criteria andEanIsNotNull() {
            addCriterion("ean is not null");
            return (Criteria) this;
        }

        public Criteria andEanEqualTo(String value) {
            addCriterion("ean =", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotEqualTo(String value) {
            addCriterion("ean <>", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThan(String value) {
            addCriterion("ean >", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThanOrEqualTo(String value) {
            addCriterion("ean >=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThan(String value) {
            addCriterion("ean <", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThanOrEqualTo(String value) {
            addCriterion("ean <=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLike(String value) {
            addCriterion("ean like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotLike(String value) {
            addCriterion("ean not like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanIn(List<String> values) {
            addCriterion("ean in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotIn(List<String> values) {
            addCriterion("ean not in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanBetween(String value1, String value2) {
            addCriterion("ean between", value1, value2, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotBetween(String value1, String value2) {
            addCriterion("ean not between", value1, value2, "ean");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIsNull() {
            addCriterion("warranty_day is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIsNotNull() {
            addCriterion("warranty_day is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayEqualTo(String value) {
            addCriterion("warranty_day =", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotEqualTo(String value) {
            addCriterion("warranty_day <>", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThan(String value) {
            addCriterion("warranty_day >", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_day >=", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThan(String value) {
            addCriterion("warranty_day <", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThanOrEqualTo(String value) {
            addCriterion("warranty_day <=", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLike(String value) {
            addCriterion("warranty_day like", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotLike(String value) {
            addCriterion("warranty_day not like", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIn(List<String> values) {
            addCriterion("warranty_day in", values, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotIn(List<String> values) {
            addCriterion("warranty_day not in", values, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayBetween(String value1, String value2) {
            addCriterion("warranty_day between", value1, value2, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotBetween(String value1, String value2) {
            addCriterion("warranty_day not between", value1, value2, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(BigDecimal value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(BigDecimal value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<BigDecimal> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
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

        public Criteria andCallIntIsNull() {
            addCriterion("call_int is null");
            return (Criteria) this;
        }

        public Criteria andCallIntIsNotNull() {
            addCriterion("call_int is not null");
            return (Criteria) this;
        }

        public Criteria andCallIntEqualTo(Integer value) {
            addCriterion("call_int =", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntNotEqualTo(Integer value) {
            addCriterion("call_int <>", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntGreaterThan(Integer value) {
            addCriterion("call_int >", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_int >=", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntLessThan(Integer value) {
            addCriterion("call_int <", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntLessThanOrEqualTo(Integer value) {
            addCriterion("call_int <=", value, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntIn(List<Integer> values) {
            addCriterion("call_int in", values, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntNotIn(List<Integer> values) {
            addCriterion("call_int not in", values, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntBetween(Integer value1, Integer value2) {
            addCriterion("call_int between", value1, value2, "callInt");
            return (Criteria) this;
        }

        public Criteria andCallIntNotBetween(Integer value1, Integer value2) {
            addCriterion("call_int not between", value1, value2, "callInt");
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

        public Criteria andMininumRetailPriceIsNull() {
            addCriterion("mininum_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceIsNotNull() {
            addCriterion("mininum_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceEqualTo(BigDecimal value) {
            addCriterion("mininum_retail_price =", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("mininum_retail_price <>", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("mininum_retail_price >", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mininum_retail_price >=", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThan(BigDecimal value) {
            addCriterion("mininum_retail_price <", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mininum_retail_price <=", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceIn(List<BigDecimal> values) {
            addCriterion("mininum_retail_price in", values, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("mininum_retail_price not in", values, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mininum_retail_price between", value1, value2, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mininum_retail_price not between", value1, value2, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIsNull() {
            addCriterion("replenishment_period is null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIsNotNull() {
            addCriterion("replenishment_period is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodEqualTo(Integer value) {
            addCriterion("replenishment_period =", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotEqualTo(Integer value) {
            addCriterion("replenishment_period <>", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThan(Integer value) {
            addCriterion("replenishment_period >", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("replenishment_period >=", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThan(Integer value) {
            addCriterion("replenishment_period <", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("replenishment_period <=", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIn(List<Integer> values) {
            addCriterion("replenishment_period in", values, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotIn(List<Integer> values) {
            addCriterion("replenishment_period not in", values, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodBetween(Integer value1, Integer value2) {
            addCriterion("replenishment_period between", value1, value2, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("replenishment_period not between", value1, value2, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("key_words is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("key_words is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(String value) {
            addCriterion("key_words =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(String value) {
            addCriterion("key_words <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(String value) {
            addCriterion("key_words >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("key_words >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(String value) {
            addCriterion("key_words <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("key_words <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLike(String value) {
            addCriterion("key_words like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotLike(String value) {
            addCriterion("key_words not like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<String> values) {
            addCriterion("key_words in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<String> values) {
            addCriterion("key_words not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(String value1, String value2) {
            addCriterion("key_words between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(String value1, String value2) {
            addCriterion("key_words not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNull() {
            addCriterion("time_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNotNull() {
            addCriterion("time_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualTo(String value) {
            addCriterion("time_unit =", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualTo(String value) {
            addCriterion("time_unit <>", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThan(String value) {
            addCriterion("time_unit >", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("time_unit >=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThan(String value) {
            addCriterion("time_unit <", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("time_unit <=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLike(String value) {
            addCriterion("time_unit like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotLike(String value) {
            addCriterion("time_unit not like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIn(List<String> values) {
            addCriterion("time_unit in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotIn(List<String> values) {
            addCriterion("time_unit not in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitBetween(String value1, String value2) {
            addCriterion("time_unit between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotBetween(String value1, String value2) {
            addCriterion("time_unit not between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andStocksetingIsNull() {
            addCriterion("stockseting is null");
            return (Criteria) this;
        }

        public Criteria andStocksetingIsNotNull() {
            addCriterion("stockseting is not null");
            return (Criteria) this;
        }

        public Criteria andStocksetingEqualTo(Integer value) {
            addCriterion("stockseting =", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotEqualTo(Integer value) {
            addCriterion("stockseting <>", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThan(Integer value) {
            addCriterion("stockseting >", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockseting >=", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThan(Integer value) {
            addCriterion("stockseting <", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThanOrEqualTo(Integer value) {
            addCriterion("stockseting <=", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingIn(List<Integer> values) {
            addCriterion("stockseting in", values, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotIn(List<Integer> values) {
            addCriterion("stockseting not in", values, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingBetween(Integer value1, Integer value2) {
            addCriterion("stockseting between", value1, value2, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotBetween(Integer value1, Integer value2) {
            addCriterion("stockseting not between", value1, value2, "stockseting");
            return (Criteria) this;
        }

        public Criteria andPrcIdIsNull() {
            addCriterion("prc_id is null");
            return (Criteria) this;
        }

        public Criteria andPrcIdIsNotNull() {
            addCriterion("prc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrcIdEqualTo(Integer value) {
            addCriterion("prc_id =", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotEqualTo(Integer value) {
            addCriterion("prc_id <>", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdGreaterThan(Integer value) {
            addCriterion("prc_id >", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prc_id >=", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdLessThan(Integer value) {
            addCriterion("prc_id <", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdLessThanOrEqualTo(Integer value) {
            addCriterion("prc_id <=", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdIn(List<Integer> values) {
            addCriterion("prc_id in", values, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotIn(List<Integer> values) {
            addCriterion("prc_id not in", values, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdBetween(Integer value1, Integer value2) {
            addCriterion("prc_id between", value1, value2, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prc_id not between", value1, value2, "prcId");
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