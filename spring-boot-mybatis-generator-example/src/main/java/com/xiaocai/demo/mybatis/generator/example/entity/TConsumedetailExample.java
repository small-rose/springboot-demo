package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TConsumedetailExample {
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
    public TConsumedetailExample() {
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
     * @Table : t_consumedetail
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

        public Criteria andCircpaymentnoIsNull() {
            addCriterion("CIRCPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoIsNotNull() {
            addCriterion("CIRCPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoEqualTo(Long value) {
            addCriterion("CIRCPAYMENTNO =", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoNotEqualTo(Long value) {
            addCriterion("CIRCPAYMENTNO <>", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoGreaterThan(Long value) {
            addCriterion("CIRCPAYMENTNO >", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoGreaterThanOrEqualTo(Long value) {
            addCriterion("CIRCPAYMENTNO >=", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoLessThan(Long value) {
            addCriterion("CIRCPAYMENTNO <", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoLessThanOrEqualTo(Long value) {
            addCriterion("CIRCPAYMENTNO <=", value, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoIn(List<Long> values) {
            addCriterion("CIRCPAYMENTNO in", values, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoNotIn(List<Long> values) {
            addCriterion("CIRCPAYMENTNO not in", values, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoBetween(Long value1, Long value2) {
            addCriterion("CIRCPAYMENTNO between", value1, value2, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andCircpaymentnoNotBetween(Long value1, Long value2) {
            addCriterion("CIRCPAYMENTNO not between", value1, value2, "circpaymentno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoIsNull() {
            addCriterion("PROCONFIRMSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoIsNotNull() {
            addCriterion("PROCONFIRMSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoEqualTo(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO =", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoNotEqualTo(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO <>", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoGreaterThan(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO >", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO >=", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoLessThan(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO <", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoLessThanOrEqualTo(Long value) {
            addCriterion("PROCONFIRMSEQUENCENO <=", value, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoIn(List<Long> values) {
            addCriterion("PROCONFIRMSEQUENCENO in", values, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoNotIn(List<Long> values) {
            addCriterion("PROCONFIRMSEQUENCENO not in", values, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoBetween(Long value1, Long value2) {
            addCriterion("PROCONFIRMSEQUENCENO between", value1, value2, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andProconfirmsequencenoNotBetween(Long value1, Long value2) {
            addCriterion("PROCONFIRMSEQUENCENO not between", value1, value2, "proconfirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoIsNull() {
            addCriterion("REFERENCENO is null");
            return (Criteria) this;
        }

        public Criteria andReferencenoIsNotNull() {
            addCriterion("REFERENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andReferencenoEqualTo(String value) {
            addCriterion("REFERENCENO =", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoNotEqualTo(String value) {
            addCriterion("REFERENCENO <>", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoGreaterThan(String value) {
            addCriterion("REFERENCENO >", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCENO >=", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoLessThan(String value) {
            addCriterion("REFERENCENO <", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoLessThanOrEqualTo(String value) {
            addCriterion("REFERENCENO <=", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoLike(String value) {
            addCriterion("REFERENCENO like", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoNotLike(String value) {
            addCriterion("REFERENCENO not like", value, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoIn(List<String> values) {
            addCriterion("REFERENCENO in", values, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoNotIn(List<String> values) {
            addCriterion("REFERENCENO not in", values, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoBetween(String value1, String value2) {
            addCriterion("REFERENCENO between", value1, value2, "referenceno");
            return (Criteria) this;
        }

        public Criteria andReferencenoNotBetween(String value1, String value2) {
            addCriterion("REFERENCENO not between", value1, value2, "referenceno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoIsNull() {
            addCriterion("AMENDQUERYNO is null");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoIsNotNull() {
            addCriterion("AMENDQUERYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoEqualTo(String value) {
            addCriterion("AMENDQUERYNO =", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoNotEqualTo(String value) {
            addCriterion("AMENDQUERYNO <>", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoGreaterThan(String value) {
            addCriterion("AMENDQUERYNO >", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoGreaterThanOrEqualTo(String value) {
            addCriterion("AMENDQUERYNO >=", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoLessThan(String value) {
            addCriterion("AMENDQUERYNO <", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoLessThanOrEqualTo(String value) {
            addCriterion("AMENDQUERYNO <=", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoLike(String value) {
            addCriterion("AMENDQUERYNO like", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoNotLike(String value) {
            addCriterion("AMENDQUERYNO not like", value, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoIn(List<String> values) {
            addCriterion("AMENDQUERYNO in", values, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoNotIn(List<String> values) {
            addCriterion("AMENDQUERYNO not in", values, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoBetween(String value1, String value2) {
            addCriterion("AMENDQUERYNO between", value1, value2, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andAmendquerynoNotBetween(String value1, String value2) {
            addCriterion("AMENDQUERYNO not between", value1, value2, "amendqueryno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoIsNull() {
            addCriterion("BANKACCOUNTSNO is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoIsNotNull() {
            addCriterion("BANKACCOUNTSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoEqualTo(String value) {
            addCriterion("BANKACCOUNTSNO =", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoNotEqualTo(String value) {
            addCriterion("BANKACCOUNTSNO <>", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoGreaterThan(String value) {
            addCriterion("BANKACCOUNTSNO >", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNTSNO >=", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoLessThan(String value) {
            addCriterion("BANKACCOUNTSNO <", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoLessThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNTSNO <=", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoLike(String value) {
            addCriterion("BANKACCOUNTSNO like", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoNotLike(String value) {
            addCriterion("BANKACCOUNTSNO not like", value, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoIn(List<String> values) {
            addCriterion("BANKACCOUNTSNO in", values, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoNotIn(List<String> values) {
            addCriterion("BANKACCOUNTSNO not in", values, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoBetween(String value1, String value2) {
            addCriterion("BANKACCOUNTSNO between", value1, value2, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankaccountsnoNotBetween(String value1, String value2) {
            addCriterion("BANKACCOUNTSNO not between", value1, value2, "bankaccountsno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoIsNull() {
            addCriterion("BANKPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoIsNotNull() {
            addCriterion("BANKPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoEqualTo(String value) {
            addCriterion("BANKPAYMENTNO =", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoNotEqualTo(String value) {
            addCriterion("BANKPAYMENTNO <>", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoGreaterThan(String value) {
            addCriterion("BANKPAYMENTNO >", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKPAYMENTNO >=", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoLessThan(String value) {
            addCriterion("BANKPAYMENTNO <", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoLessThanOrEqualTo(String value) {
            addCriterion("BANKPAYMENTNO <=", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoLike(String value) {
            addCriterion("BANKPAYMENTNO like", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoNotLike(String value) {
            addCriterion("BANKPAYMENTNO not like", value, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoIn(List<String> values) {
            addCriterion("BANKPAYMENTNO in", values, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoNotIn(List<String> values) {
            addCriterion("BANKPAYMENTNO not in", values, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoBetween(String value1, String value2) {
            addCriterion("BANKPAYMENTNO between", value1, value2, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymentnoNotBetween(String value1, String value2) {
            addCriterion("BANKPAYMENTNO not between", value1, value2, "bankpaymentno");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeIsNull() {
            addCriterion("BANKPAYMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeIsNotNull() {
            addCriterion("BANKPAYMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeEqualTo(Date value) {
            addCriterion("BANKPAYMENTTIME =", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeNotEqualTo(Date value) {
            addCriterion("BANKPAYMENTTIME <>", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeGreaterThan(Date value) {
            addCriterion("BANKPAYMENTTIME >", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BANKPAYMENTTIME >=", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeLessThan(Date value) {
            addCriterion("BANKPAYMENTTIME <", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeLessThanOrEqualTo(Date value) {
            addCriterion("BANKPAYMENTTIME <=", value, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeIn(List<Date> values) {
            addCriterion("BANKPAYMENTTIME in", values, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeNotIn(List<Date> values) {
            addCriterion("BANKPAYMENTTIME not in", values, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeBetween(Date value1, Date value2) {
            addCriterion("BANKPAYMENTTIME between", value1, value2, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andBankpaymenttimeNotBetween(Date value1, Date value2) {
            addCriterion("BANKPAYMENTTIME not between", value1, value2, "bankpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCarmarkIsNull() {
            addCriterion("CARMARK is null");
            return (Criteria) this;
        }

        public Criteria andCarmarkIsNotNull() {
            addCriterion("CARMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCarmarkEqualTo(String value) {
            addCriterion("CARMARK =", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkNotEqualTo(String value) {
            addCriterion("CARMARK <>", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkGreaterThan(String value) {
            addCriterion("CARMARK >", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkGreaterThanOrEqualTo(String value) {
            addCriterion("CARMARK >=", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkLessThan(String value) {
            addCriterion("CARMARK <", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkLessThanOrEqualTo(String value) {
            addCriterion("CARMARK <=", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkLike(String value) {
            addCriterion("CARMARK like", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkNotLike(String value) {
            addCriterion("CARMARK not like", value, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkIn(List<String> values) {
            addCriterion("CARMARK in", values, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkNotIn(List<String> values) {
            addCriterion("CARMARK not in", values, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkBetween(String value1, String value2) {
            addCriterion("CARMARK between", value1, value2, "carmark");
            return (Criteria) this;
        }

        public Criteria andCarmarkNotBetween(String value1, String value2) {
            addCriterion("CARMARK not between", value1, value2, "carmark");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeIsNull() {
            addCriterion("CIRCPAYMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeIsNotNull() {
            addCriterion("CIRCPAYMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeEqualTo(Date value) {
            addCriterion("CIRCPAYMENTTIME =", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeNotEqualTo(Date value) {
            addCriterion("CIRCPAYMENTTIME <>", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeGreaterThan(Date value) {
            addCriterion("CIRCPAYMENTTIME >", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CIRCPAYMENTTIME >=", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeLessThan(Date value) {
            addCriterion("CIRCPAYMENTTIME <", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeLessThanOrEqualTo(Date value) {
            addCriterion("CIRCPAYMENTTIME <=", value, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeIn(List<Date> values) {
            addCriterion("CIRCPAYMENTTIME in", values, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeNotIn(List<Date> values) {
            addCriterion("CIRCPAYMENTTIME not in", values, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeBetween(Date value1, Date value2) {
            addCriterion("CIRCPAYMENTTIME between", value1, value2, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andCircpaymenttimeNotBetween(Date value1, Date value2) {
            addCriterion("CIRCPAYMENTTIME not between", value1, value2, "circpaymenttime");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNull() {
            addCriterion("CONFIRMSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNotNull() {
            addCriterion("CONFIRMSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO =", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <>", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThan(String value) {
            addCriterion("CONFIRMSEQUENCENO >", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO >=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThan(String value) {
            addCriterion("CONFIRMSEQUENCENO <", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLike(String value) {
            addCriterion("CONFIRMSEQUENCENO like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotLike(String value) {
            addCriterion("CONFIRMSEQUENCENO not like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO not in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO not between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNull() {
            addCriterion("PAYMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNotNull() {
            addCriterion("PAYMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodEqualTo(String value) {
            addCriterion("PAYMETHOD =", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotEqualTo(String value) {
            addCriterion("PAYMETHOD <>", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThan(String value) {
            addCriterion("PAYMETHOD >", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD >=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThan(String value) {
            addCriterion("PAYMETHOD <", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD <=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLike(String value) {
            addCriterion("PAYMETHOD like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotLike(String value) {
            addCriterion("PAYMETHOD not like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodIn(List<String> values) {
            addCriterion("PAYMETHOD in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotIn(List<String> values) {
            addCriterion("PAYMETHOD not in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodBetween(String value1, String value2) {
            addCriterion("PAYMETHOD between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotBetween(String value1, String value2) {
            addCriterion("PAYMETHOD not between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(BigDecimal value) {
            addCriterion("PAYMENT =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(BigDecimal value) {
            addCriterion("PAYMENT <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<BigDecimal> values) {
            addCriterion("PAYMENT in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNull() {
            addCriterion("PAYMENTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNotNull() {
            addCriterion("PAYMENTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusEqualTo(String value) {
            addCriterion("PAYMENTSTATUS =", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotEqualTo(String value) {
            addCriterion("PAYMENTSTATUS <>", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThan(String value) {
            addCriterion("PAYMENTSTATUS >", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTSTATUS >=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThan(String value) {
            addCriterion("PAYMENTSTATUS <", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTSTATUS <=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLike(String value) {
            addCriterion("PAYMENTSTATUS like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotLike(String value) {
            addCriterion("PAYMENTSTATUS not like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIn(List<String> values) {
            addCriterion("PAYMENTSTATUS in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotIn(List<String> values) {
            addCriterion("PAYMENTSTATUS not in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusBetween(String value1, String value2) {
            addCriterion("PAYMENTSTATUS between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotBetween(String value1, String value2) {
            addCriterion("PAYMENTSTATUS not between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("POLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("POLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("POLICYNO =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("POLICYNO <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("POLICYNO >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYNO >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("POLICYNO <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("POLICYNO <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("POLICYNO like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("POLICYNO not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("POLICYNO in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("POLICYNO not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("POLICYNO between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("POLICYNO not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPosnoIsNull() {
            addCriterion("POSNO is null");
            return (Criteria) this;
        }

        public Criteria andPosnoIsNotNull() {
            addCriterion("POSNO is not null");
            return (Criteria) this;
        }

        public Criteria andPosnoEqualTo(String value) {
            addCriterion("POSNO =", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoNotEqualTo(String value) {
            addCriterion("POSNO <>", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoGreaterThan(String value) {
            addCriterion("POSNO >", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoGreaterThanOrEqualTo(String value) {
            addCriterion("POSNO >=", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoLessThan(String value) {
            addCriterion("POSNO <", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoLessThanOrEqualTo(String value) {
            addCriterion("POSNO <=", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoLike(String value) {
            addCriterion("POSNO like", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoNotLike(String value) {
            addCriterion("POSNO not like", value, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoIn(List<String> values) {
            addCriterion("POSNO in", values, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoNotIn(List<String> values) {
            addCriterion("POSNO not in", values, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoBetween(String value1, String value2) {
            addCriterion("POSNO between", value1, value2, "posno");
            return (Criteria) this;
        }

        public Criteria andPosnoNotBetween(String value1, String value2) {
            addCriterion("POSNO not between", value1, value2, "posno");
            return (Criteria) this;
        }

        public Criteria andRacknoIsNull() {
            addCriterion("RACKNO is null");
            return (Criteria) this;
        }

        public Criteria andRacknoIsNotNull() {
            addCriterion("RACKNO is not null");
            return (Criteria) this;
        }

        public Criteria andRacknoEqualTo(String value) {
            addCriterion("RACKNO =", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoNotEqualTo(String value) {
            addCriterion("RACKNO <>", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoGreaterThan(String value) {
            addCriterion("RACKNO >", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoGreaterThanOrEqualTo(String value) {
            addCriterion("RACKNO >=", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoLessThan(String value) {
            addCriterion("RACKNO <", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoLessThanOrEqualTo(String value) {
            addCriterion("RACKNO <=", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoLike(String value) {
            addCriterion("RACKNO like", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoNotLike(String value) {
            addCriterion("RACKNO not like", value, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoIn(List<String> values) {
            addCriterion("RACKNO in", values, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoNotIn(List<String> values) {
            addCriterion("RACKNO not in", values, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoBetween(String value1, String value2) {
            addCriterion("RACKNO between", value1, value2, "rackno");
            return (Criteria) this;
        }

        public Criteria andRacknoNotBetween(String value1, String value2) {
            addCriterion("RACKNO not between", value1, value2, "rackno");
            return (Criteria) this;
        }

        public Criteria andSumpremiumIsNull() {
            addCriterion("SUMPREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andSumpremiumIsNotNull() {
            addCriterion("SUMPREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumpremiumEqualTo(BigDecimal value) {
            addCriterion("SUMPREMIUM =", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumNotEqualTo(BigDecimal value) {
            addCriterion("SUMPREMIUM <>", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumGreaterThan(BigDecimal value) {
            addCriterion("SUMPREMIUM >", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPREMIUM >=", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumLessThan(BigDecimal value) {
            addCriterion("SUMPREMIUM <", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPREMIUM <=", value, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumIn(List<BigDecimal> values) {
            addCriterion("SUMPREMIUM in", values, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumNotIn(List<BigDecimal> values) {
            addCriterion("SUMPREMIUM not in", values, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPREMIUM between", value1, value2, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andSumpremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPREMIUM not between", value1, value2, "sumpremium");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIsNull() {
            addCriterion("VEHICLETYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIsNotNull() {
            addCriterion("VEHICLETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicletypeEqualTo(String value) {
            addCriterion("VEHICLETYPE =", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotEqualTo(String value) {
            addCriterion("VEHICLETYPE <>", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeGreaterThan(String value) {
            addCriterion("VEHICLETYPE >", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLETYPE >=", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLessThan(String value) {
            addCriterion("VEHICLETYPE <", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLETYPE <=", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLike(String value) {
            addCriterion("VEHICLETYPE like", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotLike(String value) {
            addCriterion("VEHICLETYPE not like", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIn(List<String> values) {
            addCriterion("VEHICLETYPE in", values, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotIn(List<String> values) {
            addCriterion("VEHICLETYPE not in", values, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeBetween(String value1, String value2) {
            addCriterion("VEHICLETYPE between", value1, value2, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotBetween(String value1, String value2) {
            addCriterion("VEHICLETYPE not between", value1, value2, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andWarrantnoIsNull() {
            addCriterion("WARRANTNO is null");
            return (Criteria) this;
        }

        public Criteria andWarrantnoIsNotNull() {
            addCriterion("WARRANTNO is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantnoEqualTo(String value) {
            addCriterion("WARRANTNO =", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoNotEqualTo(String value) {
            addCriterion("WARRANTNO <>", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoGreaterThan(String value) {
            addCriterion("WARRANTNO >", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANTNO >=", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoLessThan(String value) {
            addCriterion("WARRANTNO <", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoLessThanOrEqualTo(String value) {
            addCriterion("WARRANTNO <=", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoLike(String value) {
            addCriterion("WARRANTNO like", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoNotLike(String value) {
            addCriterion("WARRANTNO not like", value, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoIn(List<String> values) {
            addCriterion("WARRANTNO in", values, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoNotIn(List<String> values) {
            addCriterion("WARRANTNO not in", values, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoBetween(String value1, String value2) {
            addCriterion("WARRANTNO between", value1, value2, "warrantno");
            return (Criteria) this;
        }

        public Criteria andWarrantnoNotBetween(String value1, String value2) {
            addCriterion("WARRANTNO not between", value1, value2, "warrantno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_consumedetail
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
     * @Table : t_consumedetail
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