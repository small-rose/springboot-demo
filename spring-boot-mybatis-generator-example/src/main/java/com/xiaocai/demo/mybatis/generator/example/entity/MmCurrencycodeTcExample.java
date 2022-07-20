package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmCurrencycodeTcExample {
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
    public MmCurrencycodeTcExample() {
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
     * @Table : mm_currencycode_tc
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

        public Criteria andCurrencynameIsNull() {
            addCriterion("CURRENCYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIsNotNull() {
            addCriterion("CURRENCYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameEqualTo(String value) {
            addCriterion("CURRENCYNAME =", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotEqualTo(String value) {
            addCriterion("CURRENCYNAME <>", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThan(String value) {
            addCriterion("CURRENCYNAME >", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME >=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThan(String value) {
            addCriterion("CURRENCYNAME <", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME <=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLike(String value) {
            addCriterion("CURRENCYNAME like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotLike(String value) {
            addCriterion("CURRENCYNAME not like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIn(List<String> values) {
            addCriterion("CURRENCYNAME in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotIn(List<String> values) {
            addCriterion("CURRENCYNAME not in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME not between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessIsNull() {
            addCriterion("CURRENCYNAMEBUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessIsNotNull() {
            addCriterion("CURRENCYNAMEBUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessEqualTo(String value) {
            addCriterion("CURRENCYNAMEBUSINESS =", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessNotEqualTo(String value) {
            addCriterion("CURRENCYNAMEBUSINESS <>", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessGreaterThan(String value) {
            addCriterion("CURRENCYNAMEBUSINESS >", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAMEBUSINESS >=", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessLessThan(String value) {
            addCriterion("CURRENCYNAMEBUSINESS <", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAMEBUSINESS <=", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessLike(String value) {
            addCriterion("CURRENCYNAMEBUSINESS like", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessNotLike(String value) {
            addCriterion("CURRENCYNAMEBUSINESS not like", value, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessIn(List<String> values) {
            addCriterion("CURRENCYNAMEBUSINESS in", values, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessNotIn(List<String> values) {
            addCriterion("CURRENCYNAMEBUSINESS not in", values, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessBetween(String value1, String value2) {
            addCriterion("CURRENCYNAMEBUSINESS between", value1, value2, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencynamebusinessNotBetween(String value1, String value2) {
            addCriterion("CURRENCYNAMEBUSINESS not between", value1, value2, "currencynamebusiness");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIsNull() {
            addCriterion("CURRENCYSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIsNotNull() {
            addCriterion("CURRENCYSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysignEqualTo(String value) {
            addCriterion("CURRENCYSIGN =", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotEqualTo(String value) {
            addCriterion("CURRENCYSIGN <>", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignGreaterThan(String value) {
            addCriterion("CURRENCYSIGN >", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN >=", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLessThan(String value) {
            addCriterion("CURRENCYSIGN <", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN <=", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLike(String value) {
            addCriterion("CURRENCYSIGN like", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotLike(String value) {
            addCriterion("CURRENCYSIGN not like", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIn(List<String> values) {
            addCriterion("CURRENCYSIGN in", values, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotIn(List<String> values) {
            addCriterion("CURRENCYSIGN not in", values, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignBetween(String value1, String value2) {
            addCriterion("CURRENCYSIGN between", value1, value2, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotBetween(String value1, String value2) {
            addCriterion("CURRENCYSIGN not between", value1, value2, "currencysign");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeIsNull() {
            addCriterion("ACCCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeIsNotNull() {
            addCriterion("ACCCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeEqualTo(String value) {
            addCriterion("ACCCURRENCYCODE =", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeNotEqualTo(String value) {
            addCriterion("ACCCURRENCYCODE <>", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeGreaterThan(String value) {
            addCriterion("ACCCURRENCYCODE >", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCCURRENCYCODE >=", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeLessThan(String value) {
            addCriterion("ACCCURRENCYCODE <", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("ACCCURRENCYCODE <=", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeLike(String value) {
            addCriterion("ACCCURRENCYCODE like", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeNotLike(String value) {
            addCriterion("ACCCURRENCYCODE not like", value, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeIn(List<String> values) {
            addCriterion("ACCCURRENCYCODE in", values, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeNotIn(List<String> values) {
            addCriterion("ACCCURRENCYCODE not in", values, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeBetween(String value1, String value2) {
            addCriterion("ACCCURRENCYCODE between", value1, value2, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andAcccurrencycodeNotBetween(String value1, String value2) {
            addCriterion("ACCCURRENCYCODE not between", value1, value2, "acccurrencycode");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
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

        public Criteria andHibernateversionEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Integer value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Integer value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Integer> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Integer> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Integer value1, Integer value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDisplayorderIsNull() {
            addCriterion("DISPLAYORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DISPLAYORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(BigDecimal value) {
            addCriterion("DISPLAYORDER >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(BigDecimal value) {
            addCriterion("DISPLAYORDER <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andEnabledflagIsNull() {
            addCriterion("ENABLEDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnabledflagIsNotNull() {
            addCriterion("ENABLEDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledflagEqualTo(String value) {
            addCriterion("ENABLEDFLAG =", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotEqualTo(String value) {
            addCriterion("ENABLEDFLAG <>", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagGreaterThan(String value) {
            addCriterion("ENABLEDFLAG >", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLEDFLAG >=", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLessThan(String value) {
            addCriterion("ENABLEDFLAG <", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLessThanOrEqualTo(String value) {
            addCriterion("ENABLEDFLAG <=", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLike(String value) {
            addCriterion("ENABLEDFLAG like", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotLike(String value) {
            addCriterion("ENABLEDFLAG not like", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagIn(List<String> values) {
            addCriterion("ENABLEDFLAG in", values, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotIn(List<String> values) {
            addCriterion("ENABLEDFLAG not in", values, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagBetween(String value1, String value2) {
            addCriterion("ENABLEDFLAG between", value1, value2, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotBetween(String value1, String value2) {
            addCriterion("ENABLEDFLAG not between", value1, value2, "enabledflag");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_currencycode_tc
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
     * @Table : mm_currencycode_tc
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