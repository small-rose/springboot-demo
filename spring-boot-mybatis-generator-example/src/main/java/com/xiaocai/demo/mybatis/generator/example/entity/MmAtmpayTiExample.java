package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAtmpayTiExample {
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
    public MmAtmpayTiExample() {
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
     * @Table : mm_atmpay_ti
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

        public Criteria andInpaymentnoIsNull() {
            addCriterion("INPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIsNotNull() {
            addCriterion("INPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoEqualTo(String value) {
            addCriterion("INPAYMENTNO =", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotEqualTo(String value) {
            addCriterion("INPAYMENTNO <>", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThan(String value) {
            addCriterion("INPAYMENTNO >", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO >=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThan(String value) {
            addCriterion("INPAYMENTNO <", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO <=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLike(String value) {
            addCriterion("INPAYMENTNO like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotLike(String value) {
            addCriterion("INPAYMENTNO not like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIn(List<String> values) {
            addCriterion("INPAYMENTNO in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotIn(List<String> values) {
            addCriterion("INPAYMENTNO not in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO between", value1, value2, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO not between", value1, value2, "inpaymentno");
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

        public Criteria andEndorsenoIsNull() {
            addCriterion("ENDORSENO is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("ENDORSENO is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("ENDORSENO =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("ENDORSENO <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("ENDORSENO >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("ENDORSENO >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("ENDORSENO <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("ENDORSENO <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("ENDORSENO like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("ENDORSENO not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("ENDORSENO in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("ENDORSENO not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("ENDORSENO between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("ENDORSENO not between", value1, value2, "endorseno");
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

        public Criteria andBusinessattrIsNull() {
            addCriterion("BUSINESSATTR is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("BUSINESSATTR is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("BUSINESSATTR =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("BUSINESSATTR <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("BUSINESSATTR >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("BUSINESSATTR <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("BUSINESSATTR like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("BUSINESSATTR not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("BUSINESSATTR in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("BUSINESSATTR not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIsNull() {
            addCriterion("INPAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIsNotNull() {
            addCriterion("INPAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateEqualTo(Date value) {
            addCriterion("INPAYMENTDATE =", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotEqualTo(Date value) {
            addCriterion("INPAYMENTDATE <>", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateGreaterThan(Date value) {
            addCriterion("INPAYMENTDATE >", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPAYMENTDATE >=", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateLessThan(Date value) {
            addCriterion("INPAYMENTDATE <", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("INPAYMENTDATE <=", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIn(List<Date> values) {
            addCriterion("INPAYMENTDATE in", values, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotIn(List<Date> values) {
            addCriterion("INPAYMENTDATE not in", values, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateBetween(Date value1, Date value2) {
            addCriterion("INPAYMENTDATE between", value1, value2, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("INPAYMENTDATE not between", value1, value2, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountIsNull() {
            addCriterion("INPAYMENTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountIsNotNull() {
            addCriterion("INPAYMENTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT =", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountNotEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT <>", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountGreaterThan(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT >", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT >=", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountLessThan(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT <", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTAMOUNT <=", value, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTAMOUNT in", values, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountNotIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTAMOUNT not in", values, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTAMOUNT between", value1, value2, "inpaymentamount");
            return (Criteria) this;
        }

        public Criteria andInpaymentamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTAMOUNT not between", value1, value2, "inpaymentamount");
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

        public Criteria andBackoneIsNull() {
            addCriterion("BACKONE is null");
            return (Criteria) this;
        }

        public Criteria andBackoneIsNotNull() {
            addCriterion("BACKONE is not null");
            return (Criteria) this;
        }

        public Criteria andBackoneEqualTo(String value) {
            addCriterion("BACKONE =", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneNotEqualTo(String value) {
            addCriterion("BACKONE <>", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneGreaterThan(String value) {
            addCriterion("BACKONE >", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneGreaterThanOrEqualTo(String value) {
            addCriterion("BACKONE >=", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneLessThan(String value) {
            addCriterion("BACKONE <", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneLessThanOrEqualTo(String value) {
            addCriterion("BACKONE <=", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneLike(String value) {
            addCriterion("BACKONE like", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneNotLike(String value) {
            addCriterion("BACKONE not like", value, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneIn(List<String> values) {
            addCriterion("BACKONE in", values, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneNotIn(List<String> values) {
            addCriterion("BACKONE not in", values, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneBetween(String value1, String value2) {
            addCriterion("BACKONE between", value1, value2, "backone");
            return (Criteria) this;
        }

        public Criteria andBackoneNotBetween(String value1, String value2) {
            addCriterion("BACKONE not between", value1, value2, "backone");
            return (Criteria) this;
        }

        public Criteria andBacktwoIsNull() {
            addCriterion("BACKTWO is null");
            return (Criteria) this;
        }

        public Criteria andBacktwoIsNotNull() {
            addCriterion("BACKTWO is not null");
            return (Criteria) this;
        }

        public Criteria andBacktwoEqualTo(String value) {
            addCriterion("BACKTWO =", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoNotEqualTo(String value) {
            addCriterion("BACKTWO <>", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoGreaterThan(String value) {
            addCriterion("BACKTWO >", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoGreaterThanOrEqualTo(String value) {
            addCriterion("BACKTWO >=", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoLessThan(String value) {
            addCriterion("BACKTWO <", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoLessThanOrEqualTo(String value) {
            addCriterion("BACKTWO <=", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoLike(String value) {
            addCriterion("BACKTWO like", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoNotLike(String value) {
            addCriterion("BACKTWO not like", value, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoIn(List<String> values) {
            addCriterion("BACKTWO in", values, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoNotIn(List<String> values) {
            addCriterion("BACKTWO not in", values, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoBetween(String value1, String value2) {
            addCriterion("BACKTWO between", value1, value2, "backtwo");
            return (Criteria) this;
        }

        public Criteria andBacktwoNotBetween(String value1, String value2) {
            addCriterion("BACKTWO not between", value1, value2, "backtwo");
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

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("SERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(BigDecimal value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(BigDecimal value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(BigDecimal value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(BigDecimal value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<BigDecimal> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<BigDecimal> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
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

        public Criteria andIsgroupIsNull() {
            addCriterion("ISGROUP is null");
            return (Criteria) this;
        }

        public Criteria andIsgroupIsNotNull() {
            addCriterion("ISGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIsgroupEqualTo(String value) {
            addCriterion("ISGROUP =", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotEqualTo(String value) {
            addCriterion("ISGROUP <>", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThan(String value) {
            addCriterion("ISGROUP >", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThanOrEqualTo(String value) {
            addCriterion("ISGROUP >=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThan(String value) {
            addCriterion("ISGROUP <", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThanOrEqualTo(String value) {
            addCriterion("ISGROUP <=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLike(String value) {
            addCriterion("ISGROUP like", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotLike(String value) {
            addCriterion("ISGROUP not like", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupIn(List<String> values) {
            addCriterion("ISGROUP in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotIn(List<String> values) {
            addCriterion("ISGROUP not in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupBetween(String value1, String value2) {
            addCriterion("ISGROUP between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotBetween(String value1, String value2) {
            addCriterion("ISGROUP not between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNull() {
            addCriterion("INSTALLMENTSTIMES is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNotNull() {
            addCriterion("INSTALLMENTSTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesEqualTo(Integer value) {
            addCriterion("INSTALLMENTSTIMES =", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotEqualTo(Integer value) {
            addCriterion("INSTALLMENTSTIMES <>", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThan(Integer value) {
            addCriterion("INSTALLMENTSTIMES >", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSTALLMENTSTIMES >=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThan(Integer value) {
            addCriterion("INSTALLMENTSTIMES <", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThanOrEqualTo(Integer value) {
            addCriterion("INSTALLMENTSTIMES <=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIn(List<Integer> values) {
            addCriterion("INSTALLMENTSTIMES in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotIn(List<Integer> values) {
            addCriterion("INSTALLMENTSTIMES not in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesBetween(Integer value1, Integer value2) {
            addCriterion("INSTALLMENTSTIMES between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotBetween(Integer value1, Integer value2) {
            addCriterion("INSTALLMENTSTIMES not between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNull() {
            addCriterion("INSU_MIDNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNotNull() {
            addCriterion("INSU_MIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoEqualTo(String value) {
            addCriterion("INSU_MIDNO =", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotEqualTo(String value) {
            addCriterion("INSU_MIDNO <>", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThan(String value) {
            addCriterion("INSU_MIDNO >", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO >=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThan(String value) {
            addCriterion("INSU_MIDNO <", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO <=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLike(String value) {
            addCriterion("INSU_MIDNO like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotLike(String value) {
            addCriterion("INSU_MIDNO not like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIn(List<String> values) {
            addCriterion("INSU_MIDNO in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotIn(List<String> values) {
            addCriterion("INSU_MIDNO not in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO between", value1, value2, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO not between", value1, value2, "insuMidno");
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

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_atmpay_ti
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
     * @Table : mm_atmpay_ti
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