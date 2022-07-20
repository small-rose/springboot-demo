package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmCentralizationTdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public MmCentralizationTdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : orderByClause  String
     * @modified by : 
     * @last-modify : 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : distinct  boolean
     * @modified by : 
     * @last-modify : 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : criteria  Criteria
     * @modified by : 
     * @last-modify : 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modified by : 
     * @last-modify : 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Table : mm_centralization_td
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modify : 
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIsNull() {
            addCriterion("BATCHSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIsNotNull() {
            addCriterion("BATCHSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoEqualTo(String value) {
            addCriterion("BATCHSERIALNO =", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotEqualTo(String value) {
            addCriterion("BATCHSERIALNO <>", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThan(String value) {
            addCriterion("BATCHSERIALNO >", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO >=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThan(String value) {
            addCriterion("BATCHSERIALNO <", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO <=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLike(String value) {
            addCriterion("BATCHSERIALNO like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotLike(String value) {
            addCriterion("BATCHSERIALNO not like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIn(List<String> values) {
            addCriterion("BATCHSERIALNO in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotIn(List<String> values) {
            addCriterion("BATCHSERIALNO not in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO between", value1, value2, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO not between", value1, value2, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DATASOURCE like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DATASOURCE not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("SUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("SUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("SUBCOMPANY =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("SUBCOMPANY <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("SUBCOMPANY >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANY >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("SUBCOMPANY <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANY <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("SUBCOMPANY like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("SUBCOMPANY not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("SUBCOMPANY in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("SUBCOMPANY not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("SUBCOMPANY between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("SUBCOMPANY not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("DEPARTMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("DEPARTMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("DEPARTMENTCODE =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("DEPARTMENTCODE >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("DEPARTMENTCODE <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("DEPARTMENTCODE like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("DEPARTMENTCODE not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("DEPARTMENTCODE in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("DEPARTMENTCODE not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNull() {
            addCriterion("SUMMARYNO is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("SUMMARYNO is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("SUMMARYNO =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("SUMMARYNO <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("SUMMARYNO >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("SUMMARYNO <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("SUMMARYNO like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("SUMMARYNO not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("SUMMARYNO in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("SUMMARYNO not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("SUMMARYNO between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("SUMMARYNO not between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("CURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("CURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("CURRENCYCODE =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("CURRENCYCODE <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("CURRENCYCODE >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("CURRENCYCODE <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("CURRENCYCODE like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("CURRENCYCODE not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("CURRENCYCODE in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("CURRENCYCODE not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("OPERATETIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("OPERATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterion("OPERATETIME =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterion("OPERATETIME <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterion("OPERATETIME >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATETIME >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterion("OPERATETIME <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATETIME <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterion("OPERATETIME in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterion("OPERATETIME not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterion("OPERATETIME between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATETIME not between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andBusinesscountIsNull() {
            addCriterion("BUSINESSCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscountIsNotNull() {
            addCriterion("BUSINESSCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscountEqualTo(Long value) {
            addCriterion("BUSINESSCOUNT =", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountNotEqualTo(Long value) {
            addCriterion("BUSINESSCOUNT <>", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountGreaterThan(Long value) {
            addCriterion("BUSINESSCOUNT >", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESSCOUNT >=", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountLessThan(Long value) {
            addCriterion("BUSINESSCOUNT <", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESSCOUNT <=", value, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountIn(List<Long> values) {
            addCriterion("BUSINESSCOUNT in", values, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountNotIn(List<Long> values) {
            addCriterion("BUSINESSCOUNT not in", values, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountBetween(Long value1, Long value2) {
            addCriterion("BUSINESSCOUNT between", value1, value2, "businesscount");
            return (Criteria) this;
        }

        public Criteria andBusinesscountNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESSCOUNT not between", value1, value2, "businesscount");
            return (Criteria) this;
        }

        public Criteria andOpflagIsNull() {
            addCriterion("OPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpflagIsNotNull() {
            addCriterion("OPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpflagEqualTo(String value) {
            addCriterion("OPFLAG =", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotEqualTo(String value) {
            addCriterion("OPFLAG <>", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagGreaterThan(String value) {
            addCriterion("OPFLAG >", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagGreaterThanOrEqualTo(String value) {
            addCriterion("OPFLAG >=", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLessThan(String value) {
            addCriterion("OPFLAG <", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLessThanOrEqualTo(String value) {
            addCriterion("OPFLAG <=", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLike(String value) {
            addCriterion("OPFLAG like", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotLike(String value) {
            addCriterion("OPFLAG not like", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagIn(List<String> values) {
            addCriterion("OPFLAG in", values, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotIn(List<String> values) {
            addCriterion("OPFLAG not in", values, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagBetween(String value1, String value2) {
            addCriterion("OPFLAG between", value1, value2, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotBetween(String value1, String value2) {
            addCriterion("OPFLAG not between", value1, value2, "opflag");
            return (Criteria) this;
        }

        public Criteria andBatchnumIsNull() {
            addCriterion("BATCHNUM is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumIsNotNull() {
            addCriterion("BATCHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumEqualTo(Short value) {
            addCriterion("BATCHNUM =", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotEqualTo(Short value) {
            addCriterion("BATCHNUM <>", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumGreaterThan(Short value) {
            addCriterion("BATCHNUM >", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumGreaterThanOrEqualTo(Short value) {
            addCriterion("BATCHNUM >=", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumLessThan(Short value) {
            addCriterion("BATCHNUM <", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumLessThanOrEqualTo(Short value) {
            addCriterion("BATCHNUM <=", value, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumIn(List<Short> values) {
            addCriterion("BATCHNUM in", values, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotIn(List<Short> values) {
            addCriterion("BATCHNUM not in", values, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumBetween(Short value1, Short value2) {
            addCriterion("BATCHNUM between", value1, value2, "batchnum");
            return (Criteria) this;
        }

        public Criteria andBatchnumNotBetween(Short value1, Short value2) {
            addCriterion("BATCHNUM not between", value1, value2, "batchnum");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("AGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("AGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("AGENTCODE =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("AGENTCODE <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("AGENTCODE >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTCODE >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("AGENTCODE <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENTCODE <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("AGENTCODE like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("AGENTCODE not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("AGENTCODE in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("AGENTCODE not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("AGENTCODE between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("AGENTCODE not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("UNITCODE like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("UNITCODE not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("CUSTOMERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("CUSTOMERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("CUSTOMERPARTYNO >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("CUSTOMERPARTYNO <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("CUSTOMERPARTYNO like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("CUSTOMERPARTYNO not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO not between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNull() {
            addCriterion("CUSTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNotNull() {
            addCriterion("CUSTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO =", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <>", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNO >", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO >=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThan(String value) {
            addCriterion("CUSTACCOUNTNO <", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLike(String value) {
            addCriterion("CUSTACCOUNTNO like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotLike(String value) {
            addCriterion("CUSTACCOUNTNO not like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO not in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO not between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNull() {
            addCriterion("CUSTBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNotNull() {
            addCriterion("CUSTBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoEqualTo(String value) {
            addCriterion("CUSTBANKNO =", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotEqualTo(String value) {
            addCriterion("CUSTBANKNO <>", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThan(String value) {
            addCriterion("CUSTBANKNO >", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO >=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThan(String value) {
            addCriterion("CUSTBANKNO <", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO <=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLike(String value) {
            addCriterion("CUSTBANKNO like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotLike(String value) {
            addCriterion("CUSTBANKNO not like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIn(List<String> values) {
            addCriterion("CUSTBANKNO in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotIn(List<String> values) {
            addCriterion("CUSTBANKNO not in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO not between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("BANKPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("BANKPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("BANKPROVINCE =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("BANKPROVINCE <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("BANKPROVINCE >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("BANKPROVINCE <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("BANKPROVINCE like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("BANKPROVINCE not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("BANKPROVINCE in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("BANKPROVINCE not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNull() {
            addCriterion("BANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("BANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("BANKCITY =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("BANKCITY <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("BANKCITY >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCITY >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("BANKCITY <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("BANKCITY <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("BANKCITY like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("BANKCITY not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("BANKCITY in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("BANKCITY not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("BANKCITY between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("BANKCITY not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("BANKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("BANKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("BANKTYPE =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("BANKTYPE <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("BANKTYPE >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTYPE >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("BANKTYPE <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("BANKTYPE <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("BANKTYPE like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("BANKTYPE not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("BANKTYPE in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("BANKTYPE not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("BANKTYPE between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("BANKTYPE not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNull() {
            addCriterion("ISPAYPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNotNull() {
            addCriterion("ISPAYPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicEqualTo(String value) {
            addCriterion("ISPAYPUBLIC =", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <>", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThan(String value) {
            addCriterion("ISPAYPUBLIC >", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC >=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThan(String value) {
            addCriterion("ISPAYPUBLIC <", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLike(String value) {
            addCriterion("ISPAYPUBLIC like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotLike(String value) {
            addCriterion("ISPAYPUBLIC not like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIn(List<String> values) {
            addCriterion("ISPAYPUBLIC in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotIn(List<String> values) {
            addCriterion("ISPAYPUBLIC not in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC not between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNull() {
            addCriterion("CUSTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNotNull() {
            addCriterion("CUSTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustseqEqualTo(String value) {
            addCriterion("CUSTSEQ =", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotEqualTo(String value) {
            addCriterion("CUSTSEQ <>", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThan(String value) {
            addCriterion("CUSTSEQ >", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ >=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThan(String value) {
            addCriterion("CUSTSEQ <", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ <=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLike(String value) {
            addCriterion("CUSTSEQ like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotLike(String value) {
            addCriterion("CUSTSEQ not like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqIn(List<String> values) {
            addCriterion("CUSTSEQ in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotIn(List<String> values) {
            addCriterion("CUSTSEQ not in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqBetween(String value1, String value2) {
            addCriterion("CUSTSEQ between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotBetween(String value1, String value2) {
            addCriterion("CUSTSEQ not between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNull() {
            addCriterion("OFFSETNO is null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNotNull() {
            addCriterion("OFFSETNO is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoEqualTo(String value) {
            addCriterion("OFFSETNO =", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotEqualTo(String value) {
            addCriterion("OFFSETNO <>", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThan(String value) {
            addCriterion("OFFSETNO >", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETNO >=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThan(String value) {
            addCriterion("OFFSETNO <", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThanOrEqualTo(String value) {
            addCriterion("OFFSETNO <=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLike(String value) {
            addCriterion("OFFSETNO like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotLike(String value) {
            addCriterion("OFFSETNO not like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIn(List<String> values) {
            addCriterion("OFFSETNO in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotIn(List<String> values) {
            addCriterion("OFFSETNO not in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoBetween(String value1, String value2) {
            addCriterion("OFFSETNO between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotBetween(String value1, String value2) {
            addCriterion("OFFSETNO not between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("TIMESTAMP =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("TIMESTAMP <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("TIMESTAMP >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("TIMESTAMP <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("TIMESTAMP in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("TIMESTAMP not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("LASTOPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("LASTOPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("LASTOPDATE =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("LASTOPDATE <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("LASTOPDATE >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("LASTOPDATE <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("LASTOPDATE in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("LASTOPDATE not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("HIBERNATEVERSION is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("HIBERNATEVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Short value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Short value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("MODIFYDESC is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("MODIFYDESC is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("MODIFYDESC =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("MODIFYDESC <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("MODIFYDESC >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("MODIFYDESC <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("MODIFYDESC like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("MODIFYDESC not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("MODIFYDESC in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("MODIFYDESC not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("MODIFYDESC between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("MODIFYDESC not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNull() {
            addCriterion("ERRMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNotNull() {
            addCriterion("ERRMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrmsgEqualTo(String value) {
            addCriterion("ERRMSG =", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotEqualTo(String value) {
            addCriterion("ERRMSG <>", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThan(String value) {
            addCriterion("ERRMSG >", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRMSG >=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThan(String value) {
            addCriterion("ERRMSG <", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThanOrEqualTo(String value) {
            addCriterion("ERRMSG <=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLike(String value) {
            addCriterion("ERRMSG like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotLike(String value) {
            addCriterion("ERRMSG not like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgIn(List<String> values) {
            addCriterion("ERRMSG in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotIn(List<String> values) {
            addCriterion("ERRMSG not in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgBetween(String value1, String value2) {
            addCriterion("ERRMSG between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotBetween(String value1, String value2) {
            addCriterion("ERRMSG not between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNull() {
            addCriterion("USEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("USEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("USEDAMOUNT >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("USEDAMOUNT <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT not between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("OPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("OPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("OPSTATUS =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("OPSTATUS <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("OPSTATUS >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTATUS >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("OPSTATUS <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("OPSTATUS <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("OPSTATUS like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("OPSTATUS not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("OPSTATUS in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("OPSTATUS not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("OPSTATUS between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("OPSTATUS not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("CLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("CLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("CLASSESCODE like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("CLASSESCODE not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("BUSINESSCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("BUSINESSCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("BUSINESSCHANNEL >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("BUSINESSCHANNEL <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("BUSINESSCHANNEL like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("BUSINESSCHANNEL not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNull() {
            addCriterion("CARDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNotNull() {
            addCriterion("CARDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCardflagEqualTo(String value) {
            addCriterion("CARDFLAG =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(String value) {
            addCriterion("CARDFLAG <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(String value) {
            addCriterion("CARDFLAG >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(String value) {
            addCriterion("CARDFLAG >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(String value) {
            addCriterion("CARDFLAG <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(String value) {
            addCriterion("CARDFLAG <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLike(String value) {
            addCriterion("CARDFLAG like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotLike(String value) {
            addCriterion("CARDFLAG not like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<String> values) {
            addCriterion("CARDFLAG in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<String> values) {
            addCriterion("CARDFLAG not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(String value1, String value2) {
            addCriterion("CARDFLAG between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(String value1, String value2) {
            addCriterion("CARDFLAG not between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNull() {
            addCriterion("CERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNotNull() {
            addCriterion("CERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoEqualTo(String value) {
            addCriterion("CERTIFICATENO =", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotEqualTo(String value) {
            addCriterion("CERTIFICATENO <>", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThan(String value) {
            addCriterion("CERTIFICATENO >", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO >=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThan(String value) {
            addCriterion("CERTIFICATENO <", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO <=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLike(String value) {
            addCriterion("CERTIFICATENO like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotLike(String value) {
            addCriterion("CERTIFICATENO not like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIn(List<String> values) {
            addCriterion("CERTIFICATENO in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotIn(List<String> values) {
            addCriterion("CERTIFICATENO not in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO not between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNull() {
            addCriterion("CUSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("CUSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("CUSTEMAIL =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("CUSTEMAIL <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("CUSTEMAIL >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("CUSTEMAIL <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("CUSTEMAIL like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("CUSTEMAIL not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("CUSTEMAIL in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("CUSTEMAIL not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL not between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNull() {
            addCriterion("CUSTACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNotNull() {
            addCriterion("CUSTACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME =", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <>", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAME >", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME >=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThan(String value) {
            addCriterion("CUSTACCOUNTNAME <", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLike(String value) {
            addCriterion("CUSTACCOUNTNAME like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotLike(String value) {
            addCriterion("CUSTACCOUNTNAME not like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME not in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME not between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNull() {
            addCriterion("FASTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("FASTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(String value) {
            addCriterion("FASTFLAG =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(String value) {
            addCriterion("FASTFLAG <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(String value) {
            addCriterion("FASTFLAG >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(String value) {
            addCriterion("FASTFLAG >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(String value) {
            addCriterion("FASTFLAG <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(String value) {
            addCriterion("FASTFLAG <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLike(String value) {
            addCriterion("FASTFLAG like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotLike(String value) {
            addCriterion("FASTFLAG not like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<String> values) {
            addCriterion("FASTFLAG in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<String> values) {
            addCriterion("FASTFLAG not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(String value1, String value2) {
            addCriterion("FASTFLAG between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(String value1, String value2) {
            addCriterion("FASTFLAG not between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNull() {
            addCriterion("SMSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNotNull() {
            addCriterion("SMSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSmsflagEqualTo(String value) {
            addCriterion("SMSFLAG =", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotEqualTo(String value) {
            addCriterion("SMSFLAG <>", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThan(String value) {
            addCriterion("SMSFLAG >", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThanOrEqualTo(String value) {
            addCriterion("SMSFLAG >=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThan(String value) {
            addCriterion("SMSFLAG <", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThanOrEqualTo(String value) {
            addCriterion("SMSFLAG <=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLike(String value) {
            addCriterion("SMSFLAG like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotLike(String value) {
            addCriterion("SMSFLAG not like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIn(List<String> values) {
            addCriterion("SMSFLAG in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotIn(List<String> values) {
            addCriterion("SMSFLAG not in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagBetween(String value1, String value2) {
            addCriterion("SMSFLAG between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotBetween(String value1, String value2) {
            addCriterion("SMSFLAG not between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNull() {
            addCriterion("INPAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNotNull() {
            addCriterion("INPAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD =", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <>", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThan(String value) {
            addCriterion("INPAYMENTMETHOD >", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD >=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThan(String value) {
            addCriterion("INPAYMENTMETHOD <", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLike(String value) {
            addCriterion("INPAYMENTMETHOD like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotLike(String value) {
            addCriterion("INPAYMENTMETHOD not like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD not in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD not between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNull() {
            addCriterion("CUSTAGENTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNotNull() {
            addCriterion("CUSTAGENTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME =", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME <>", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThan(String value) {
            addCriterion("CUSTAGENTBANKNAME >", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME >=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThan(String value) {
            addCriterion("CUSTAGENTBANKNAME <", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME <=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLike(String value) {
            addCriterion("CUSTAGENTBANKNAME like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotLike(String value) {
            addCriterion("CUSTAGENTBANKNAME not like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIn(List<String> values) {
            addCriterion("CUSTAGENTBANKNAME in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotIn(List<String> values) {
            addCriterion("CUSTAGENTBANKNAME not in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKNAME between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKNAME not between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNull() {
            addCriterion("CUSTAGENTBANKADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNotNull() {
            addCriterion("CUSTAGENTBANKADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR =", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR <>", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThan(String value) {
            addCriterion("CUSTAGENTBANKADDR >", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR >=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThan(String value) {
            addCriterion("CUSTAGENTBANKADDR <", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR <=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLike(String value) {
            addCriterion("CUSTAGENTBANKADDR like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotLike(String value) {
            addCriterion("CUSTAGENTBANKADDR not like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIn(List<String> values) {
            addCriterion("CUSTAGENTBANKADDR in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotIn(List<String> values) {
            addCriterion("CUSTAGENTBANKADDR not in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKADDR between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKADDR not between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNull() {
            addCriterion("CUSTAGENTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNotNull() {
            addCriterion("CUSTAGENTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO =", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <>", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThan(String value) {
            addCriterion("CUSTAGENTACCOUNTNO >", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO >=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThan(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLike(String value) {
            addCriterion("CUSTAGENTACCOUNTNO like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotLike(String value) {
            addCriterion("CUSTAGENTACCOUNTNO not like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIn(List<String> values) {
            addCriterion("CUSTAGENTACCOUNTNO in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotIn(List<String> values) {
            addCriterion("CUSTAGENTACCOUNTNO not in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTAGENTACCOUNTNO between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTACCOUNTNO not between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNull() {
            addCriterion("CUSTADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNotNull() {
            addCriterion("CUSTADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustaddressEqualTo(String value) {
            addCriterion("CUSTADDRESS =", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotEqualTo(String value) {
            addCriterion("CUSTADDRESS <>", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThan(String value) {
            addCriterion("CUSTADDRESS >", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTADDRESS >=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThan(String value) {
            addCriterion("CUSTADDRESS <", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTADDRESS <=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLike(String value) {
            addCriterion("CUSTADDRESS like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotLike(String value) {
            addCriterion("CUSTADDRESS not like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressIn(List<String> values) {
            addCriterion("CUSTADDRESS in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotIn(List<String> values) {
            addCriterion("CUSTADDRESS not in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressBetween(String value1, String value2) {
            addCriterion("CUSTADDRESS between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotBetween(String value1, String value2) {
            addCriterion("CUSTADDRESS not between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNull() {
            addCriterion("CUSTCOUNTRYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNotNull() {
            addCriterion("CUSTCOUNTRYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME =", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME <>", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThan(String value) {
            addCriterion("CUSTCOUNTRYNAME >", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME >=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThan(String value) {
            addCriterion("CUSTCOUNTRYNAME <", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME <=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLike(String value) {
            addCriterion("CUSTCOUNTRYNAME like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotLike(String value) {
            addCriterion("CUSTCOUNTRYNAME not like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIn(List<String> values) {
            addCriterion("CUSTCOUNTRYNAME in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotIn(List<String> values) {
            addCriterion("CUSTCOUNTRYNAME not in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYNAME between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYNAME not between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNull() {
            addCriterion("CUSTCOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNotNull() {
            addCriterion("CUSTCOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE =", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE <>", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThan(String value) {
            addCriterion("CUSTCOUNTRYCODE >", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE >=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThan(String value) {
            addCriterion("CUSTCOUNTRYCODE <", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE <=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLike(String value) {
            addCriterion("CUSTCOUNTRYCODE like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotLike(String value) {
            addCriterion("CUSTCOUNTRYCODE not like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIn(List<String> values) {
            addCriterion("CUSTCOUNTRYCODE in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotIn(List<String> values) {
            addCriterion("CUSTCOUNTRYCODE not in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYCODE between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYCODE not between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNull() {
            addCriterion("OPERATORCODE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNotNull() {
            addCriterion("OPERATORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeEqualTo(String value) {
            addCriterion("OPERATORCODE =", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotEqualTo(String value) {
            addCriterion("OPERATORCODE <>", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThan(String value) {
            addCriterion("OPERATORCODE >", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE >=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThan(String value) {
            addCriterion("OPERATORCODE <", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE <=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLike(String value) {
            addCriterion("OPERATORCODE like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotLike(String value) {
            addCriterion("OPERATORCODE not like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIn(List<String> values) {
            addCriterion("OPERATORCODE in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotIn(List<String> values) {
            addCriterion("OPERATORCODE not in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeBetween(String value1, String value2) {
            addCriterion("OPERATORCODE between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotBetween(String value1, String value2) {
            addCriterion("OPERATORCODE not between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("OPERATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OPERATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OPERATORNAME =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OPERATORNAME <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OPERATORNAME >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OPERATORNAME <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OPERATORNAME like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OPERATORNAME not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OPERATORNAME in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OPERATORNAME not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OPERATORNAME between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OPERATORNAME not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoIsNull() {
            addCriterion("VOUCHERREGNO is null");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoIsNotNull() {
            addCriterion("VOUCHERREGNO is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoEqualTo(String value) {
            addCriterion("VOUCHERREGNO =", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoNotEqualTo(String value) {
            addCriterion("VOUCHERREGNO <>", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoGreaterThan(String value) {
            addCriterion("VOUCHERREGNO >", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERREGNO >=", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoLessThan(String value) {
            addCriterion("VOUCHERREGNO <", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERREGNO <=", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoLike(String value) {
            addCriterion("VOUCHERREGNO like", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoNotLike(String value) {
            addCriterion("VOUCHERREGNO not like", value, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoIn(List<String> values) {
            addCriterion("VOUCHERREGNO in", values, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoNotIn(List<String> values) {
            addCriterion("VOUCHERREGNO not in", values, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoBetween(String value1, String value2) {
            addCriterion("VOUCHERREGNO between", value1, value2, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andVoucherregnoNotBetween(String value1, String value2) {
            addCriterion("VOUCHERREGNO not between", value1, value2, "voucherregno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoIsNull() {
            addCriterion("AGENCYSUMMARYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoIsNotNull() {
            addCriterion("AGENCYSUMMARYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoEqualTo(String value) {
            addCriterion("AGENCYSUMMARYNO =", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoNotEqualTo(String value) {
            addCriterion("AGENCYSUMMARYNO <>", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoGreaterThan(String value) {
            addCriterion("AGENCYSUMMARYNO >", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCYSUMMARYNO >=", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoLessThan(String value) {
            addCriterion("AGENCYSUMMARYNO <", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoLessThanOrEqualTo(String value) {
            addCriterion("AGENCYSUMMARYNO <=", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoLike(String value) {
            addCriterion("AGENCYSUMMARYNO like", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoNotLike(String value) {
            addCriterion("AGENCYSUMMARYNO not like", value, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoIn(List<String> values) {
            addCriterion("AGENCYSUMMARYNO in", values, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoNotIn(List<String> values) {
            addCriterion("AGENCYSUMMARYNO not in", values, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoBetween(String value1, String value2) {
            addCriterion("AGENCYSUMMARYNO between", value1, value2, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andAgencysummarynoNotBetween(String value1, String value2) {
            addCriterion("AGENCYSUMMARYNO not between", value1, value2, "agencysummaryno");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNull() {
            addCriterion("EXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNotNull() {
            addCriterion("EXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExstatusEqualTo(String value) {
            addCriterion("EXSTATUS =", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotEqualTo(String value) {
            addCriterion("EXSTATUS <>", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThan(String value) {
            addCriterion("EXSTATUS >", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXSTATUS >=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThan(String value) {
            addCriterion("EXSTATUS <", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThanOrEqualTo(String value) {
            addCriterion("EXSTATUS <=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLike(String value) {
            addCriterion("EXSTATUS like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotLike(String value) {
            addCriterion("EXSTATUS not like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusIn(List<String> values) {
            addCriterion("EXSTATUS in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotIn(List<String> values) {
            addCriterion("EXSTATUS not in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusBetween(String value1, String value2) {
            addCriterion("EXSTATUS between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotBetween(String value1, String value2) {
            addCriterion("EXSTATUS not between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNull() {
            addCriterion("EXCEPTIONCAUSE is null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNotNull() {
            addCriterion("EXCEPTIONCAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE =", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <>", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThan(String value) {
            addCriterion("EXCEPTIONCAUSE >", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE >=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThan(String value) {
            addCriterion("EXCEPTIONCAUSE <", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLike(String value) {
            addCriterion("EXCEPTIONCAUSE like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotLike(String value) {
            addCriterion("EXCEPTIONCAUSE not like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE not in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE not between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNull() {
            addCriterion("CUSTACCOUNTAREA is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNotNull() {
            addCriterion("CUSTACCOUNTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA =", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <>", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThan(String value) {
            addCriterion("CUSTACCOUNTAREA >", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA >=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThan(String value) {
            addCriterion("CUSTACCOUNTAREA <", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLike(String value) {
            addCriterion("CUSTACCOUNTAREA like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotLike(String value) {
            addCriterion("CUSTACCOUNTAREA not like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA not in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA not between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNull() {
            addCriterion("CUSTBANKADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNotNull() {
            addCriterion("CUSTBANKADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrEqualTo(String value) {
            addCriterion("CUSTBANKADDR =", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotEqualTo(String value) {
            addCriterion("CUSTBANKADDR <>", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThan(String value) {
            addCriterion("CUSTBANKADDR >", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR >=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThan(String value) {
            addCriterion("CUSTBANKADDR <", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR <=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLike(String value) {
            addCriterion("CUSTBANKADDR like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotLike(String value) {
            addCriterion("CUSTBANKADDR not like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIn(List<String> values) {
            addCriterion("CUSTBANKADDR in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotIn(List<String> values) {
            addCriterion("CUSTBANKADDR not in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR not between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNull() {
            addCriterion("CUSTBANKSWIFTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNotNull() {
            addCriterion("CUSTBANKSWIFTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE =", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <>", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE >", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE >=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE <", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE not like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE not in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE not between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNull() {
            addCriterion("CUSTCHARGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNotNull() {
            addCriterion("CUSTCHARGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE =", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <>", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThan(String value) {
            addCriterion("CUSTCHARGETYPE >", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE >=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThan(String value) {
            addCriterion("CUSTCHARGETYPE <", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLike(String value) {
            addCriterion("CUSTCHARGETYPE like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotLike(String value) {
            addCriterion("CUSTCHARGETYPE not like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE not in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE between", value1, value2, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE not between", value1, value2, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNull() {
            addCriterion("TAXORGTALLY is null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNotNull() {
            addCriterion("TAXORGTALLY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyEqualTo(String value) {
            addCriterion("TAXORGTALLY =", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotEqualTo(String value) {
            addCriterion("TAXORGTALLY <>", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThan(String value) {
            addCriterion("TAXORGTALLY >", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY >=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThan(String value) {
            addCriterion("TAXORGTALLY <", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY <=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLike(String value) {
            addCriterion("TAXORGTALLY like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotLike(String value) {
            addCriterion("TAXORGTALLY not like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIn(List<String> values) {
            addCriterion("TAXORGTALLY in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotIn(List<String> values) {
            addCriterion("TAXORGTALLY not in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY not between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andIfprecostIsNull() {
            addCriterion("IFPRECOST is null");
            return (Criteria) this;
        }

        public Criteria andIfprecostIsNotNull() {
            addCriterion("IFPRECOST is not null");
            return (Criteria) this;
        }

        public Criteria andIfprecostEqualTo(String value) {
            addCriterion("IFPRECOST =", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotEqualTo(String value) {
            addCriterion("IFPRECOST <>", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostGreaterThan(String value) {
            addCriterion("IFPRECOST >", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostGreaterThanOrEqualTo(String value) {
            addCriterion("IFPRECOST >=", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLessThan(String value) {
            addCriterion("IFPRECOST <", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLessThanOrEqualTo(String value) {
            addCriterion("IFPRECOST <=", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLike(String value) {
            addCriterion("IFPRECOST like", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotLike(String value) {
            addCriterion("IFPRECOST not like", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostIn(List<String> values) {
            addCriterion("IFPRECOST in", values, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotIn(List<String> values) {
            addCriterion("IFPRECOST not in", values, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostBetween(String value1, String value2) {
            addCriterion("IFPRECOST between", value1, value2, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotBetween(String value1, String value2) {
            addCriterion("IFPRECOST not between", value1, value2, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNull() {
            addCriterion("AGENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNotNull() {
            addCriterion("AGENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeEqualTo(String value) {
            addCriterion("AGENTTYPE =", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotEqualTo(String value) {
            addCriterion("AGENTTYPE <>", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThan(String value) {
            addCriterion("AGENTTYPE >", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE >=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThan(String value) {
            addCriterion("AGENTTYPE <", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE <=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLike(String value) {
            addCriterion("AGENTTYPE like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotLike(String value) {
            addCriterion("AGENTTYPE not like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIn(List<String> values) {
            addCriterion("AGENTTYPE in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotIn(List<String> values) {
            addCriterion("AGENTTYPE not in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeBetween(String value1, String value2) {
            addCriterion("AGENTTYPE between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotBetween(String value1, String value2) {
            addCriterion("AGENTTYPE not between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNull() {
            addCriterion("TAXPAYERCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNotNull() {
            addCriterion("TAXPAYERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeEqualTo(String value) {
            addCriterion("TAXPAYERCODE =", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotEqualTo(String value) {
            addCriterion("TAXPAYERCODE <>", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThan(String value) {
            addCriterion("TAXPAYERCODE >", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE >=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThan(String value) {
            addCriterion("TAXPAYERCODE <", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE <=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLike(String value) {
            addCriterion("TAXPAYERCODE like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotLike(String value) {
            addCriterion("TAXPAYERCODE not like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIn(List<String> values) {
            addCriterion("TAXPAYERCODE in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotIn(List<String> values) {
            addCriterion("TAXPAYERCODE not in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE not between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNull() {
            addCriterion("TAXPAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNotNull() {
            addCriterion("TAXPAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameEqualTo(String value) {
            addCriterion("TAXPAYERNAME =", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotEqualTo(String value) {
            addCriterion("TAXPAYERNAME <>", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThan(String value) {
            addCriterion("TAXPAYERNAME >", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME >=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThan(String value) {
            addCriterion("TAXPAYERNAME <", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME <=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLike(String value) {
            addCriterion("TAXPAYERNAME like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotLike(String value) {
            addCriterion("TAXPAYERNAME not like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIn(List<String> values) {
            addCriterion("TAXPAYERNAME in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotIn(List<String> values) {
            addCriterion("TAXPAYERNAME not in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME not between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("TAXPAYER is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("TAXPAYER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("TAXPAYER =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("TAXPAYER <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("TAXPAYER >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("TAXPAYER <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("TAXPAYER like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("TAXPAYER not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("TAXPAYER in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("TAXPAYER not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("TAXPAYER between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNull() {
            addCriterion("TAXESADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNotNull() {
            addCriterion("TAXESADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressEqualTo(String value) {
            addCriterion("TAXESADDRESS =", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotEqualTo(String value) {
            addCriterion("TAXESADDRESS <>", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThan(String value) {
            addCriterion("TAXESADDRESS >", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS >=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThan(String value) {
            addCriterion("TAXESADDRESS <", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS <=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLike(String value) {
            addCriterion("TAXESADDRESS like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotLike(String value) {
            addCriterion("TAXESADDRESS not like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIn(List<String> values) {
            addCriterion("TAXESADDRESS in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotIn(List<String> values) {
            addCriterion("TAXESADDRESS not in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS not between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNull() {
            addCriterion("TAXESPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNotNull() {
            addCriterion("TAXESPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneEqualTo(String value) {
            addCriterion("TAXESPHONE =", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotEqualTo(String value) {
            addCriterion("TAXESPHONE <>", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThan(String value) {
            addCriterion("TAXESPHONE >", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE >=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThan(String value) {
            addCriterion("TAXESPHONE <", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE <=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLike(String value) {
            addCriterion("TAXESPHONE like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotLike(String value) {
            addCriterion("TAXESPHONE not like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIn(List<String> values) {
            addCriterion("TAXESPHONE in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotIn(List<String> values) {
            addCriterion("TAXESPHONE not in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneBetween(String value1, String value2) {
            addCriterion("TAXESPHONE between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotBetween(String value1, String value2) {
            addCriterion("TAXESPHONE not between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNull() {
            addCriterion("TAXESMOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNotNull() {
            addCriterion("TAXESMOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE =", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <>", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThan(String value) {
            addCriterion("TAXESMOBILEPHONE >", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE >=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThan(String value) {
            addCriterion("TAXESMOBILEPHONE <", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLike(String value) {
            addCriterion("TAXESMOBILEPHONE like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotLike(String value) {
            addCriterion("TAXESMOBILEPHONE not like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE not in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE not between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNull() {
            addCriterion("TAXESEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNotNull() {
            addCriterion("TAXESEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailEqualTo(String value) {
            addCriterion("TAXESEMAIL =", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotEqualTo(String value) {
            addCriterion("TAXESEMAIL <>", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThan(String value) {
            addCriterion("TAXESEMAIL >", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL >=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThan(String value) {
            addCriterion("TAXESEMAIL <", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL <=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLike(String value) {
            addCriterion("TAXESEMAIL like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotLike(String value) {
            addCriterion("TAXESEMAIL not like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIn(List<String> values) {
            addCriterion("TAXESEMAIL in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotIn(List<String> values) {
            addCriterion("TAXESEMAIL not in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL not between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNull() {
            addCriterion("TAXESBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNotNull() {
            addCriterion("TAXESBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameEqualTo(String value) {
            addCriterion("TAXESBANKNAME =", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotEqualTo(String value) {
            addCriterion("TAXESBANKNAME <>", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThan(String value) {
            addCriterion("TAXESBANKNAME >", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME >=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThan(String value) {
            addCriterion("TAXESBANKNAME <", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME <=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLike(String value) {
            addCriterion("TAXESBANKNAME like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotLike(String value) {
            addCriterion("TAXESBANKNAME not like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIn(List<String> values) {
            addCriterion("TAXESBANKNAME in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotIn(List<String> values) {
            addCriterion("TAXESBANKNAME not in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME not between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNull() {
            addCriterion("TAXESACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNotNull() {
            addCriterion("TAXESACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO =", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <>", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThan(String value) {
            addCriterion("TAXESACCOUNTNO >", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO >=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThan(String value) {
            addCriterion("TAXESACCOUNTNO <", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLike(String value) {
            addCriterion("TAXESACCOUNTNO like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotLike(String value) {
            addCriterion("TAXESACCOUNTNO not like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO not in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO not between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNull() {
            addCriterion("TAXESPAYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNotNull() {
            addCriterion("TAXESPAYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE =", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <>", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThan(String value) {
            addCriterion("TAXESPAYERTYPE >", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE >=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThan(String value) {
            addCriterion("TAXESPAYERTYPE <", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLike(String value) {
            addCriterion("TAXESPAYERTYPE like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotLike(String value) {
            addCriterion("TAXESPAYERTYPE not like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE not in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE not between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNull() {
            addCriterion("TAXESCERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNotNull() {
            addCriterion("TAXESCERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE =", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <>", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE >", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE >=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE <", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE not like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE not in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE not between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNull() {
            addCriterion("TAXESCERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNotNull() {
            addCriterion("TAXESCERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO =", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <>", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATENO >", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO >=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThan(String value) {
            addCriterion("TAXESCERTIFICATENO <", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLike(String value) {
            addCriterion("TAXESCERTIFICATENO like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotLike(String value) {
            addCriterion("TAXESCERTIFICATENO not like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO not in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO not between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("INVOICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("INVOICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("INVOICETYPE =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("INVOICETYPE <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("INVOICETYPE >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("INVOICETYPE <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("INVOICETYPE like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("INVOICETYPE not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("INVOICETYPE in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("INVOICETYPE not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("INVOICETYPE between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("INVOICETYPE not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNull() {
            addCriterion("INVOICEREMARK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNotNull() {
            addCriterion("INVOICEREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkEqualTo(String value) {
            addCriterion("INVOICEREMARK =", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotEqualTo(String value) {
            addCriterion("INVOICEREMARK <>", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThan(String value) {
            addCriterion("INVOICEREMARK >", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK >=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThan(String value) {
            addCriterion("INVOICEREMARK <", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK <=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLike(String value) {
            addCriterion("INVOICEREMARK like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotLike(String value) {
            addCriterion("INVOICEREMARK not like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIn(List<String> values) {
            addCriterion("INVOICEREMARK in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotIn(List<String> values) {
            addCriterion("INVOICEREMARK not in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK not between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIsNull() {
            addCriterion("businessBelong is null");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIsNotNull() {
            addCriterion("businessBelong is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongEqualTo(String value) {
            addCriterion("businessBelong =", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotEqualTo(String value) {
            addCriterion("businessBelong <>", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongGreaterThan(String value) {
            addCriterion("businessBelong >", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongGreaterThanOrEqualTo(String value) {
            addCriterion("businessBelong >=", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLessThan(String value) {
            addCriterion("businessBelong <", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLessThanOrEqualTo(String value) {
            addCriterion("businessBelong <=", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLike(String value) {
            addCriterion("businessBelong like", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotLike(String value) {
            addCriterion("businessBelong not like", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIn(List<String> values) {
            addCriterion("businessBelong in", values, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotIn(List<String> values) {
            addCriterion("businessBelong not in", values, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongBetween(String value1, String value2) {
            addCriterion("businessBelong between", value1, value2, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotBetween(String value1, String value2) {
            addCriterion("businessBelong not between", value1, value2, "businessbelong");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_centralization_td
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modify : 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @Table : mm_centralization_td
     * @description : 
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @modify : 
     */
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