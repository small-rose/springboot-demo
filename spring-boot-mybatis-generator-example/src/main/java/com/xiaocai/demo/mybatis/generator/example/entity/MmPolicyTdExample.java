package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPolicyTdExample {
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
    public MmPolicyTdExample() {
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
     * @Table : mm_policy_td
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSeqpolicyIsNull() {
            addCriterion("SEQPOLICY is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("SEQPOLICY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(Long value) {
            addCriterion("SEQPOLICY =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(Long value) {
            addCriterion("SEQPOLICY <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(Long value) {
            addCriterion("SEQPOLICY >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQPOLICY >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(Long value) {
            addCriterion("SEQPOLICY <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(Long value) {
            addCriterion("SEQPOLICY <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<Long> values) {
            addCriterion("SEQPOLICY in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<Long> values) {
            addCriterion("SEQPOLICY not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(Long value1, Long value2) {
            addCriterion("SEQPOLICY between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(Long value1, Long value2) {
            addCriterion("SEQPOLICY not between", value1, value2, "seqpolicy");
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

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("BASECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("BASECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("BASECURRENCYCODE =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("BASECURRENCYCODE >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("BASECURRENCYCODE <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("BASECURRENCYCODE like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("BASECURRENCYCODE not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("BASECURRENCYCODE in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("BASECURRENCYCODE not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("BASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("BASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("BASEAMOUNT >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("BASEAMOUNT <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIsNull() {
            addCriterion("BASEACCOUNTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIsNotNull() {
            addCriterion("BASEACCOUNTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT =", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <>", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThan(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT >", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT >=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThan(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIn(List<BigDecimal> values) {
            addCriterion("BASEACCOUNTAMOUNT in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEACCOUNTAMOUNT not in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEACCOUNTAMOUNT between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEACCOUNTAMOUNT not between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNull() {
            addCriterion("BASERECEIVABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNotNull() {
            addCriterion("BASERECEIVABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT =", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <>", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThan(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT >", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT >=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThan(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIn(List<BigDecimal> values) {
            addCriterion("BASERECEIVABLEAMOUNT in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("BASERECEIVABLEAMOUNT not in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASERECEIVABLEAMOUNT between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASERECEIVABLEAMOUNT not between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNull() {
            addCriterion("BASEREALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNotNull() {
            addCriterion("BASEREALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT =", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <>", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThan(BigDecimal value) {
            addCriterion("BASEREALAMOUNT >", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT >=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThan(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIn(List<BigDecimal> values) {
            addCriterion("BASEREALAMOUNT in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEREALAMOUNT not in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEREALAMOUNT between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEREALAMOUNT not between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNull() {
            addCriterion("INVOICEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNotNull() {
            addCriterion("INVOICEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT =", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <>", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT not in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT not between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIsNull() {
            addCriterion("INVOICEPAIDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIsNotNull() {
            addCriterion("INVOICEPAIDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT =", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT <>", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT >", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT >=", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountLessThan(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT <", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEPAIDAMOUNT <=", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEPAIDAMOUNT in", values, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEPAIDAMOUNT not in", values, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEPAIDAMOUNT between", value1, value2, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEPAIDAMOUNT not between", value1, value2, "invoicepaidamount");
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

        public Criteria andAccountamountIsNull() {
            addCriterion("ACCOUNTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("ACCOUNTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT not between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIsNull() {
            addCriterion("RECEIVABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIsNotNull() {
            addCriterion("RECEIVABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT =", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <>", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThan(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT >", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT >=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThan(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEAMOUNT in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEAMOUNT not in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEAMOUNT between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEAMOUNT not between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNull() {
            addCriterion("REALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNotNull() {
            addCriterion("REALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealamountEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT =", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <>", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThan(BigDecimal value) {
            addCriterion("REALAMOUNT >", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT >=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThan(BigDecimal value) {
            addCriterion("REALAMOUNT <", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT not in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT not between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("PREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("PREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("PREMIUM =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("PREMIUM <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("PREMIUM >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUM >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("PREMIUM <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUM <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("PREMIUM in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("PREMIUM not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUM between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUM not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNull() {
            addCriterion("AGIOTAGEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNotNull() {
            addCriterion("AGIOTAGEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT =", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <>", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThan(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT >", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT >=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThan(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIn(List<BigDecimal> values) {
            addCriterion("AGIOTAGEAMOUNT in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotIn(List<BigDecimal> values) {
            addCriterion("AGIOTAGEAMOUNT not in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGIOTAGEAMOUNT between", value1, value2, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGIOTAGEAMOUNT not between", value1, value2, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIsNull() {
            addCriterion("INCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIsNotNull() {
            addCriterion("INCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeEqualTo(String value) {
            addCriterion("INCURRENCYCODE =", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotEqualTo(String value) {
            addCriterion("INCURRENCYCODE <>", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeGreaterThan(String value) {
            addCriterion("INCURRENCYCODE >", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("INCURRENCYCODE >=", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLessThan(String value) {
            addCriterion("INCURRENCYCODE <", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("INCURRENCYCODE <=", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLike(String value) {
            addCriterion("INCURRENCYCODE like", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotLike(String value) {
            addCriterion("INCURRENCYCODE not like", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIn(List<String> values) {
            addCriterion("INCURRENCYCODE in", values, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotIn(List<String> values) {
            addCriterion("INCURRENCYCODE not in", values, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeBetween(String value1, String value2) {
            addCriterion("INCURRENCYCODE between", value1, value2, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotBetween(String value1, String value2) {
            addCriterion("INCURRENCYCODE not between", value1, value2, "incurrencycode");
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

        public Criteria andIfstartIsNull() {
            addCriterion("IFSTART is null");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNotNull() {
            addCriterion("IFSTART is not null");
            return (Criteria) this;
        }

        public Criteria andIfstartEqualTo(String value) {
            addCriterion("IFSTART =", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotEqualTo(String value) {
            addCriterion("IFSTART <>", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThan(String value) {
            addCriterion("IFSTART >", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThanOrEqualTo(String value) {
            addCriterion("IFSTART >=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThan(String value) {
            addCriterion("IFSTART <", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThanOrEqualTo(String value) {
            addCriterion("IFSTART <=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLike(String value) {
            addCriterion("IFSTART like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotLike(String value) {
            addCriterion("IFSTART not like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartIn(List<String> values) {
            addCriterion("IFSTART in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotIn(List<String> values) {
            addCriterion("IFSTART not in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartBetween(String value1, String value2) {
            addCriterion("IFSTART between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotBetween(String value1, String value2) {
            addCriterion("IFSTART not between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNull() {
            addCriterion("OPERATEDTIMES is null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNotNull() {
            addCriterion("OPERATEDTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES =", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES <>", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThan(BigDecimal value) {
            addCriterion("OPERATEDTIMES >", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES >=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThan(BigDecimal value) {
            addCriterion("OPERATEDTIMES <", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES <=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIn(List<BigDecimal> values) {
            addCriterion("OPERATEDTIMES in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotIn(List<BigDecimal> values) {
            addCriterion("OPERATEDTIMES not in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATEDTIMES between", value1, value2, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATEDTIMES not between", value1, value2, "operatedtimes");
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

        public Criteria andSigndateIsNull() {
            addCriterion("SIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("SIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
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

        public Criteria andTransactorcodeIsNull() {
            addCriterion("TRANSACTORCODE is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("TRANSACTORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("TRANSACTORCODE =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("TRANSACTORCODE <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("TRANSACTORCODE >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("TRANSACTORCODE <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("TRANSACTORCODE like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("TRANSACTORCODE not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("TRANSACTORCODE in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("TRANSACTORCODE not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNull() {
            addCriterion("UNDERWRITERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNotNull() {
            addCriterion("UNDERWRITERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeEqualTo(String value) {
            addCriterion("UNDERWRITERCODE =", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <>", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThan(String value) {
            addCriterion("UNDERWRITERCODE >", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE >=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThan(String value) {
            addCriterion("UNDERWRITERCODE <", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLike(String value) {
            addCriterion("UNDERWRITERCODE like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotLike(String value) {
            addCriterion("UNDERWRITERCODE not like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIn(List<String> values) {
            addCriterion("UNDERWRITERCODE in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotIn(List<String> values) {
            addCriterion("UNDERWRITERCODE not in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE not between", value1, value2, "underwritercode");
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

        public Criteria andRisktypeIsNull() {
            addCriterion("RISKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("RISKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("RISKTYPE =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("RISKTYPE <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("RISKTYPE >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKTYPE >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("RISKTYPE <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("RISKTYPE <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("RISKTYPE like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("RISKTYPE not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("RISKTYPE in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("RISKTYPE not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("RISKTYPE between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("RISKTYPE not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNull() {
            addCriterion("CLASSESKIND is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNotNull() {
            addCriterion("CLASSESKIND is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindEqualTo(String value) {
            addCriterion("CLASSESKIND =", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotEqualTo(String value) {
            addCriterion("CLASSESKIND <>", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThan(String value) {
            addCriterion("CLASSESKIND >", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND >=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThan(String value) {
            addCriterion("CLASSESKIND <", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND <=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLike(String value) {
            addCriterion("CLASSESKIND like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotLike(String value) {
            addCriterion("CLASSESKIND not like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindIn(List<String> values) {
            addCriterion("CLASSESKIND in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotIn(List<String> values) {
            addCriterion("CLASSESKIND not in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindBetween(String value1, String value2) {
            addCriterion("CLASSESKIND between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotBetween(String value1, String value2) {
            addCriterion("CLASSESKIND not between", value1, value2, "classeskind");
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

        public Criteria andEndorsetypeIsNull() {
            addCriterion("ENDORSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIsNotNull() {
            addCriterion("ENDORSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeEqualTo(String value) {
            addCriterion("ENDORSETYPE =", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotEqualTo(String value) {
            addCriterion("ENDORSETYPE <>", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThan(String value) {
            addCriterion("ENDORSETYPE >", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE >=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThan(String value) {
            addCriterion("ENDORSETYPE <", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE <=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLike(String value) {
            addCriterion("ENDORSETYPE like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotLike(String value) {
            addCriterion("ENDORSETYPE not like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIn(List<String> values) {
            addCriterion("ENDORSETYPE in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotIn(List<String> values) {
            addCriterion("ENDORSETYPE not in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE not between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNull() {
            addCriterion("HASPLAN is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("HASPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("HASPLAN =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("HASPLAN <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("HASPLAN >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("HASPLAN >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("HASPLAN <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("HASPLAN <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("HASPLAN like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("HASPLAN not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("HASPLAN in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("HASPLAN not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("HASPLAN between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("HASPLAN not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIsNull() {
            addCriterion("ISCOINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIsNotNull() {
            addCriterion("ISCOINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceEqualTo(String value) {
            addCriterion("ISCOINSURANCE =", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotEqualTo(String value) {
            addCriterion("ISCOINSURANCE <>", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThan(String value) {
            addCriterion("ISCOINSURANCE >", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOINSURANCE >=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThan(String value) {
            addCriterion("ISCOINSURANCE <", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThanOrEqualTo(String value) {
            addCriterion("ISCOINSURANCE <=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLike(String value) {
            addCriterion("ISCOINSURANCE like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotLike(String value) {
            addCriterion("ISCOINSURANCE not like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIn(List<String> values) {
            addCriterion("ISCOINSURANCE in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotIn(List<String> values) {
            addCriterion("ISCOINSURANCE not in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceBetween(String value1, String value2) {
            addCriterion("ISCOINSURANCE between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotBetween(String value1, String value2) {
            addCriterion("ISCOINSURANCE not between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIsNull() {
            addCriterion("MASTERPROTOCOLNO is null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIsNotNull() {
            addCriterion("MASTERPROTOCOLNO is not null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO =", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO <>", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThan(String value) {
            addCriterion("MASTERPROTOCOLNO >", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO >=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThan(String value) {
            addCriterion("MASTERPROTOCOLNO <", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThanOrEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO <=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLike(String value) {
            addCriterion("MASTERPROTOCOLNO like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotLike(String value) {
            addCriterion("MASTERPROTOCOLNO not like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIn(List<String> values) {
            addCriterion("MASTERPROTOCOLNO in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotIn(List<String> values) {
            addCriterion("MASTERPROTOCOLNO not in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoBetween(String value1, String value2) {
            addCriterion("MASTERPROTOCOLNO between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotBetween(String value1, String value2) {
            addCriterion("MASTERPROTOCOLNO not between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIsNull() {
            addCriterion("CARDPOLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIsNotNull() {
            addCriterion("CARDPOLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoEqualTo(String value) {
            addCriterion("CARDPOLICYNO =", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotEqualTo(String value) {
            addCriterion("CARDPOLICYNO <>", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThan(String value) {
            addCriterion("CARDPOLICYNO >", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDPOLICYNO >=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThan(String value) {
            addCriterion("CARDPOLICYNO <", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThanOrEqualTo(String value) {
            addCriterion("CARDPOLICYNO <=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLike(String value) {
            addCriterion("CARDPOLICYNO like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotLike(String value) {
            addCriterion("CARDPOLICYNO not like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIn(List<String> values) {
            addCriterion("CARDPOLICYNO in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotIn(List<String> values) {
            addCriterion("CARDPOLICYNO not in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoBetween(String value1, String value2) {
            addCriterion("CARDPOLICYNO between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotBetween(String value1, String value2) {
            addCriterion("CARDPOLICYNO not between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNull() {
            addCriterion("TOTALPROTOCOLTNO is null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNotNull() {
            addCriterion("TOTALPROTOCOLTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO =", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO <>", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThan(String value) {
            addCriterion("TOTALPROTOCOLTNO >", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO >=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThan(String value) {
            addCriterion("TOTALPROTOCOLTNO <", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO <=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLike(String value) {
            addCriterion("TOTALPROTOCOLTNO like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotLike(String value) {
            addCriterion("TOTALPROTOCOLTNO not like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIn(List<String> values) {
            addCriterion("TOTALPROTOCOLTNO in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotIn(List<String> values) {
            addCriterion("TOTALPROTOCOLTNO not in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLTNO between", value1, value2, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLTNO not between", value1, value2, "totalprotocoltno");
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

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
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

        public Criteria andHandovernoIsNull() {
            addCriterion("HANDOVERNO is null");
            return (Criteria) this;
        }

        public Criteria andHandovernoIsNotNull() {
            addCriterion("HANDOVERNO is not null");
            return (Criteria) this;
        }

        public Criteria andHandovernoEqualTo(String value) {
            addCriterion("HANDOVERNO =", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotEqualTo(String value) {
            addCriterion("HANDOVERNO <>", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThan(String value) {
            addCriterion("HANDOVERNO >", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThanOrEqualTo(String value) {
            addCriterion("HANDOVERNO >=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThan(String value) {
            addCriterion("HANDOVERNO <", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThanOrEqualTo(String value) {
            addCriterion("HANDOVERNO <=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLike(String value) {
            addCriterion("HANDOVERNO like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotLike(String value) {
            addCriterion("HANDOVERNO not like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoIn(List<String> values) {
            addCriterion("HANDOVERNO in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotIn(List<String> values) {
            addCriterion("HANDOVERNO not in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoBetween(String value1, String value2) {
            addCriterion("HANDOVERNO between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotBetween(String value1, String value2) {
            addCriterion("HANDOVERNO not between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIsNull() {
            addCriterion("POLICYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIsNotNull() {
            addCriterion("POLICYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystatusEqualTo(String value) {
            addCriterion("POLICYSTATUS =", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotEqualTo(String value) {
            addCriterion("POLICYSTATUS <>", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusGreaterThan(String value) {
            addCriterion("POLICYSTATUS >", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYSTATUS >=", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLessThan(String value) {
            addCriterion("POLICYSTATUS <", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLessThanOrEqualTo(String value) {
            addCriterion("POLICYSTATUS <=", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLike(String value) {
            addCriterion("POLICYSTATUS like", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotLike(String value) {
            addCriterion("POLICYSTATUS not like", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIn(List<String> values) {
            addCriterion("POLICYSTATUS in", values, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotIn(List<String> values) {
            addCriterion("POLICYSTATUS not in", values, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusBetween(String value1, String value2) {
            addCriterion("POLICYSTATUS between", value1, value2, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotBetween(String value1, String value2) {
            addCriterion("POLICYSTATUS not between", value1, value2, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIsNull() {
            addCriterion("POLICYATTR is null");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIsNotNull() {
            addCriterion("POLICYATTR is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyattrEqualTo(String value) {
            addCriterion("POLICYATTR =", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotEqualTo(String value) {
            addCriterion("POLICYATTR <>", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrGreaterThan(String value) {
            addCriterion("POLICYATTR >", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYATTR >=", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLessThan(String value) {
            addCriterion("POLICYATTR <", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLessThanOrEqualTo(String value) {
            addCriterion("POLICYATTR <=", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLike(String value) {
            addCriterion("POLICYATTR like", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotLike(String value) {
            addCriterion("POLICYATTR not like", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIn(List<String> values) {
            addCriterion("POLICYATTR in", values, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotIn(List<String> values) {
            addCriterion("POLICYATTR not in", values, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrBetween(String value1, String value2) {
            addCriterion("POLICYATTR between", value1, value2, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotBetween(String value1, String value2) {
            addCriterion("POLICYATTR not between", value1, value2, "policyattr");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNull() {
            addCriterion("VEHICLENO is null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNotNull() {
            addCriterion("VEHICLENO is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoEqualTo(String value) {
            addCriterion("VEHICLENO =", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotEqualTo(String value) {
            addCriterion("VEHICLENO <>", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThan(String value) {
            addCriterion("VEHICLENO >", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLENO >=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThan(String value) {
            addCriterion("VEHICLENO <", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLENO <=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLike(String value) {
            addCriterion("VEHICLENO like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotLike(String value) {
            addCriterion("VEHICLENO not like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIn(List<String> values) {
            addCriterion("VEHICLENO in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotIn(List<String> values) {
            addCriterion("VEHICLENO not in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoBetween(String value1, String value2) {
            addCriterion("VEHICLENO between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotBetween(String value1, String value2) {
            addCriterion("VEHICLENO not between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andCanpayIsNull() {
            addCriterion("CANPAY is null");
            return (Criteria) this;
        }

        public Criteria andCanpayIsNotNull() {
            addCriterion("CANPAY is not null");
            return (Criteria) this;
        }

        public Criteria andCanpayEqualTo(String value) {
            addCriterion("CANPAY =", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotEqualTo(String value) {
            addCriterion("CANPAY <>", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayGreaterThan(String value) {
            addCriterion("CANPAY >", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayGreaterThanOrEqualTo(String value) {
            addCriterion("CANPAY >=", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLessThan(String value) {
            addCriterion("CANPAY <", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLessThanOrEqualTo(String value) {
            addCriterion("CANPAY <=", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLike(String value) {
            addCriterion("CANPAY like", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotLike(String value) {
            addCriterion("CANPAY not like", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayIn(List<String> values) {
            addCriterion("CANPAY in", values, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotIn(List<String> values) {
            addCriterion("CANPAY not in", values, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayBetween(String value1, String value2) {
            addCriterion("CANPAY between", value1, value2, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotBetween(String value1, String value2) {
            addCriterion("CANPAY not between", value1, value2, "canpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("DATATYPE =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("DATATYPE <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("DATATYPE >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("DATATYPE <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("DATATYPE like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("DATATYPE not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("DATATYPE in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("DATATYPE not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("DATATYPE between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("DATATYPE not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNull() {
            addCriterion("INSURENCECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNotNull() {
            addCriterion("INSURENCECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT =", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <>", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT >", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT >=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT <", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT not in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT not between", value1, value2, "insurencecount");
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

        public Criteria andTaxstateIsNull() {
            addCriterion("TAXSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxstateIsNotNull() {
            addCriterion("TAXSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxstateEqualTo(String value) {
            addCriterion("TAXSTATE =", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotEqualTo(String value) {
            addCriterion("TAXSTATE <>", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateGreaterThan(String value) {
            addCriterion("TAXSTATE >", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateGreaterThanOrEqualTo(String value) {
            addCriterion("TAXSTATE >=", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLessThan(String value) {
            addCriterion("TAXSTATE <", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLessThanOrEqualTo(String value) {
            addCriterion("TAXSTATE <=", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLike(String value) {
            addCriterion("TAXSTATE like", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotLike(String value) {
            addCriterion("TAXSTATE not like", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateIn(List<String> values) {
            addCriterion("TAXSTATE in", values, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotIn(List<String> values) {
            addCriterion("TAXSTATE not in", values, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateBetween(String value1, String value2) {
            addCriterion("TAXSTATE between", value1, value2, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotBetween(String value1, String value2) {
            addCriterion("TAXSTATE not between", value1, value2, "taxstate");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIsNull() {
            addCriterion("CUSTOMERNAMESIMPLE is null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIsNotNull() {
            addCriterion("CUSTOMERNAMESIMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleEqualTo(String value) {
            addCriterion("CUSTOMERNAMESIMPLE =", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMESIMPLE <>", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleGreaterThan(String value) {
            addCriterion("CUSTOMERNAMESIMPLE >", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMESIMPLE >=", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLessThan(String value) {
            addCriterion("CUSTOMERNAMESIMPLE <", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMESIMPLE <=", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLike(String value) {
            addCriterion("CUSTOMERNAMESIMPLE like", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotLike(String value) {
            addCriterion("CUSTOMERNAMESIMPLE not like", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIn(List<String> values) {
            addCriterion("CUSTOMERNAMESIMPLE in", values, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMESIMPLE not in", values, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMESIMPLE between", value1, value2, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMESIMPLE not between", value1, value2, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andPolandinvIsNull() {
            addCriterion("POLANDINV is null");
            return (Criteria) this;
        }

        public Criteria andPolandinvIsNotNull() {
            addCriterion("POLANDINV is not null");
            return (Criteria) this;
        }

        public Criteria andPolandinvEqualTo(String value) {
            addCriterion("POLANDINV =", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotEqualTo(String value) {
            addCriterion("POLANDINV <>", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThan(String value) {
            addCriterion("POLANDINV >", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThanOrEqualTo(String value) {
            addCriterion("POLANDINV >=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThan(String value) {
            addCriterion("POLANDINV <", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThanOrEqualTo(String value) {
            addCriterion("POLANDINV <=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLike(String value) {
            addCriterion("POLANDINV like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotLike(String value) {
            addCriterion("POLANDINV not like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvIn(List<String> values) {
            addCriterion("POLANDINV in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotIn(List<String> values) {
            addCriterion("POLANDINV not in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvBetween(String value1, String value2) {
            addCriterion("POLANDINV between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotBetween(String value1, String value2) {
            addCriterion("POLANDINV not between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNull() {
            addCriterion("USEDTAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNotNull() {
            addCriterion("USEDTAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountEqualTo(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT =", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT <>", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThan(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT >", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT >=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThan(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT <", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDTAXAMOUNT <=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIn(List<BigDecimal> values) {
            addCriterion("USEDTAXAMOUNT in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDTAXAMOUNT not in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDTAXAMOUNT between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDTAXAMOUNT not between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andIfbackIsNull() {
            addCriterion("IFBACK is null");
            return (Criteria) this;
        }

        public Criteria andIfbackIsNotNull() {
            addCriterion("IFBACK is not null");
            return (Criteria) this;
        }

        public Criteria andIfbackEqualTo(String value) {
            addCriterion("IFBACK =", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotEqualTo(String value) {
            addCriterion("IFBACK <>", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackGreaterThan(String value) {
            addCriterion("IFBACK >", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackGreaterThanOrEqualTo(String value) {
            addCriterion("IFBACK >=", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackLessThan(String value) {
            addCriterion("IFBACK <", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackLessThanOrEqualTo(String value) {
            addCriterion("IFBACK <=", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackLike(String value) {
            addCriterion("IFBACK like", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotLike(String value) {
            addCriterion("IFBACK not like", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackIn(List<String> values) {
            addCriterion("IFBACK in", values, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotIn(List<String> values) {
            addCriterion("IFBACK not in", values, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackBetween(String value1, String value2) {
            addCriterion("IFBACK between", value1, value2, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotBetween(String value1, String value2) {
            addCriterion("IFBACK not between", value1, value2, "ifback");
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

        public Criteria andCasenoIsNull() {
            addCriterion("CASENO is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CASENO is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CASENO =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CASENO <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CASENO >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CASENO >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CASENO <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CASENO <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CASENO like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CASENO not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CASENO in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CASENO not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CASENO between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CASENO not between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andFeeflagIsNull() {
            addCriterion("FEEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFeeflagIsNotNull() {
            addCriterion("FEEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFeeflagEqualTo(String value) {
            addCriterion("FEEFLAG =", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotEqualTo(String value) {
            addCriterion("FEEFLAG <>", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagGreaterThan(String value) {
            addCriterion("FEEFLAG >", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagGreaterThanOrEqualTo(String value) {
            addCriterion("FEEFLAG >=", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLessThan(String value) {
            addCriterion("FEEFLAG <", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLessThanOrEqualTo(String value) {
            addCriterion("FEEFLAG <=", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLike(String value) {
            addCriterion("FEEFLAG like", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotLike(String value) {
            addCriterion("FEEFLAG not like", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagIn(List<String> values) {
            addCriterion("FEEFLAG in", values, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotIn(List<String> values) {
            addCriterion("FEEFLAG not in", values, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagBetween(String value1, String value2) {
            addCriterion("FEEFLAG between", value1, value2, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotBetween(String value1, String value2) {
            addCriterion("FEEFLAG not between", value1, value2, "feeflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagIsNull() {
            addCriterion("DONATEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDonateflagIsNotNull() {
            addCriterion("DONATEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDonateflagEqualTo(String value) {
            addCriterion("DONATEFLAG =", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotEqualTo(String value) {
            addCriterion("DONATEFLAG <>", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagGreaterThan(String value) {
            addCriterion("DONATEFLAG >", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagGreaterThanOrEqualTo(String value) {
            addCriterion("DONATEFLAG >=", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLessThan(String value) {
            addCriterion("DONATEFLAG <", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLessThanOrEqualTo(String value) {
            addCriterion("DONATEFLAG <=", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLike(String value) {
            addCriterion("DONATEFLAG like", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotLike(String value) {
            addCriterion("DONATEFLAG not like", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagIn(List<String> values) {
            addCriterion("DONATEFLAG in", values, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotIn(List<String> values) {
            addCriterion("DONATEFLAG not in", values, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagBetween(String value1, String value2) {
            addCriterion("DONATEFLAG between", value1, value2, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotBetween(String value1, String value2) {
            addCriterion("DONATEFLAG not between", value1, value2, "donateflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIsNull() {
            addCriterion("PROTOCOLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIsNotNull() {
            addCriterion("PROTOCOLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagEqualTo(String value) {
            addCriterion("PROTOCOLFLAG =", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <>", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThan(String value) {
            addCriterion("PROTOCOLFLAG >", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG >=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThan(String value) {
            addCriterion("PROTOCOLFLAG <", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLike(String value) {
            addCriterion("PROTOCOLFLAG like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotLike(String value) {
            addCriterion("PROTOCOLFLAG not like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIn(List<String> values) {
            addCriterion("PROTOCOLFLAG in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotIn(List<String> values) {
            addCriterion("PROTOCOLFLAG not in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG not between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIsNull() {
            addCriterion("INPAYMENTDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIsNotNull() {
            addCriterion("INPAYMENTDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT =", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <>", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT >", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT >=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT <", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT not like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT not in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT between", value1, value2, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT not between", value1, value2, "inpaymentdepartment");
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

        public Criteria andFarmflagIsNull() {
            addCriterion("FARMFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNotNull() {
            addCriterion("FARMFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagEqualTo(String value) {
            addCriterion("FARMFLAG =", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotEqualTo(String value) {
            addCriterion("FARMFLAG <>", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThan(String value) {
            addCriterion("FARMFLAG >", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAG >=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThan(String value) {
            addCriterion("FARMFLAG <", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAG <=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLike(String value) {
            addCriterion("FARMFLAG like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotLike(String value) {
            addCriterion("FARMFLAG not like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagIn(List<String> values) {
            addCriterion("FARMFLAG in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotIn(List<String> values) {
            addCriterion("FARMFLAG not in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagBetween(String value1, String value2) {
            addCriterion("FARMFLAG between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotBetween(String value1, String value2) {
            addCriterion("FARMFLAG not between", value1, value2, "farmflag");
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

        public Criteria andInsuredcodeIsNull() {
            addCriterion("INSUREDCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNotNull() {
            addCriterion("INSUREDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeEqualTo(String value) {
            addCriterion("INSUREDCODE =", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotEqualTo(String value) {
            addCriterion("INSUREDCODE <>", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThan(String value) {
            addCriterion("INSUREDCODE >", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE >=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThan(String value) {
            addCriterion("INSUREDCODE <", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE <=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLike(String value) {
            addCriterion("INSUREDCODE like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotLike(String value) {
            addCriterion("INSUREDCODE not like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIn(List<String> values) {
            addCriterion("INSUREDCODE in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotIn(List<String> values) {
            addCriterion("INSUREDCODE not in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeBetween(String value1, String value2) {
            addCriterion("INSUREDCODE between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotBetween(String value1, String value2) {
            addCriterion("INSUREDCODE not between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNull() {
            addCriterion("INSUREDNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNotNull() {
            addCriterion("INSUREDNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenEqualTo(String value) {
            addCriterion("INSUREDNAMEEN =", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <>", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThan(String value) {
            addCriterion("INSUREDNAMEEN >", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN >=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThan(String value) {
            addCriterion("INSUREDNAMEEN <", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLike(String value) {
            addCriterion("INSUREDNAMEEN like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotLike(String value) {
            addCriterion("INSUREDNAMEEN not like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIn(List<String> values) {
            addCriterion("INSUREDNAMEEN in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotIn(List<String> values) {
            addCriterion("INSUREDNAMEEN not in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN not between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNull() {
            addCriterion("INSUREDPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNotNull() {
            addCriterion("INSUREDPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoEqualTo(String value) {
            addCriterion("INSUREDPARTYNO =", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <>", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThan(String value) {
            addCriterion("INSUREDPARTYNO >", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO >=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThan(String value) {
            addCriterion("INSUREDPARTYNO <", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLike(String value) {
            addCriterion("INSUREDPARTYNO like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotLike(String value) {
            addCriterion("INSUREDPARTYNO not like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIn(List<String> values) {
            addCriterion("INSUREDPARTYNO in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotIn(List<String> values) {
            addCriterion("INSUREDPARTYNO not in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO not between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNull() {
            addCriterion("APPLICANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNotNull() {
            addCriterion("APPLICANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeEqualTo(String value) {
            addCriterion("APPLICANTCODE =", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotEqualTo(String value) {
            addCriterion("APPLICANTCODE <>", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThan(String value) {
            addCriterion("APPLICANTCODE >", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE >=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThan(String value) {
            addCriterion("APPLICANTCODE <", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE <=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLike(String value) {
            addCriterion("APPLICANTCODE like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotLike(String value) {
            addCriterion("APPLICANTCODE not like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIn(List<String> values) {
            addCriterion("APPLICANTCODE in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotIn(List<String> values) {
            addCriterion("APPLICANTCODE not in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE not between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNull() {
            addCriterion("APPLICANTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNotNull() {
            addCriterion("APPLICANTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnEqualTo(String value) {
            addCriterion("APPLICANTNAMECN =", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <>", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThan(String value) {
            addCriterion("APPLICANTNAMECN >", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN >=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThan(String value) {
            addCriterion("APPLICANTNAMECN <", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLike(String value) {
            addCriterion("APPLICANTNAMECN like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotLike(String value) {
            addCriterion("APPLICANTNAMECN not like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIn(List<String> values) {
            addCriterion("APPLICANTNAMECN in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotIn(List<String> values) {
            addCriterion("APPLICANTNAMECN not in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN not between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNull() {
            addCriterion("APPLICANTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNotNull() {
            addCriterion("APPLICANTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN =", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <>", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThan(String value) {
            addCriterion("APPLICANTNAMEEN >", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN >=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThan(String value) {
            addCriterion("APPLICANTNAMEEN <", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLike(String value) {
            addCriterion("APPLICANTNAMEEN like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotLike(String value) {
            addCriterion("APPLICANTNAMEEN not like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN not in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN not between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNull() {
            addCriterion("APPLICANTIONPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNotNull() {
            addCriterion("APPLICANTIONPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO =", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <>", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThan(String value) {
            addCriterion("APPLICANTIONPARTYNO >", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO >=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThan(String value) {
            addCriterion("APPLICANTIONPARTYNO <", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLike(String value) {
            addCriterion("APPLICANTIONPARTYNO like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotLike(String value) {
            addCriterion("APPLICANTIONPARTYNO not like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO not in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO not between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNull() {
            addCriterion("APPISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNotNull() {
            addCriterion("APPISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanEqualTo(String value) {
            addCriterion("APPISJAPAN =", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotEqualTo(String value) {
            addCriterion("APPISJAPAN <>", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThan(String value) {
            addCriterion("APPISJAPAN >", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN >=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThan(String value) {
            addCriterion("APPISJAPAN <", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN <=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLike(String value) {
            addCriterion("APPISJAPAN like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotLike(String value) {
            addCriterion("APPISJAPAN not like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIn(List<String> values) {
            addCriterion("APPISJAPAN in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotIn(List<String> values) {
            addCriterion("APPISJAPAN not in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanBetween(String value1, String value2) {
            addCriterion("APPISJAPAN between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotBetween(String value1, String value2) {
            addCriterion("APPISJAPAN not between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("DOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("DOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(String value) {
            addCriterion("DOMESTIC =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(String value) {
            addCriterion("DOMESTIC <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(String value) {
            addCriterion("DOMESTIC >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(String value) {
            addCriterion("DOMESTIC <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLike(String value) {
            addCriterion("DOMESTIC like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotLike(String value) {
            addCriterion("DOMESTIC not like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<String> values) {
            addCriterion("DOMESTIC in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<String> values) {
            addCriterion("DOMESTIC not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(String value1, String value2) {
            addCriterion("DOMESTIC between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC not between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNull() {
            addCriterion("PORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNotNull() {
            addCriterion("PORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPorttypeEqualTo(String value) {
            addCriterion("PORTTYPE =", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotEqualTo(String value) {
            addCriterion("PORTTYPE <>", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThan(String value) {
            addCriterion("PORTTYPE >", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTTYPE >=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThan(String value) {
            addCriterion("PORTTYPE <", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThanOrEqualTo(String value) {
            addCriterion("PORTTYPE <=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLike(String value) {
            addCriterion("PORTTYPE like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotLike(String value) {
            addCriterion("PORTTYPE not like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeIn(List<String> values) {
            addCriterion("PORTTYPE in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotIn(List<String> values) {
            addCriterion("PORTTYPE not in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeBetween(String value1, String value2) {
            addCriterion("PORTTYPE between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotBetween(String value1, String value2) {
            addCriterion("PORTTYPE not between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BILLNO not between", value1, value2, "billno");
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

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
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

        public Criteria andCustisjapanIsNull() {
            addCriterion("CUSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNotNull() {
            addCriterion("CUSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanEqualTo(String value) {
            addCriterion("CUSTISJAPAN =", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotEqualTo(String value) {
            addCriterion("CUSTISJAPAN <>", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThan(String value) {
            addCriterion("CUSTISJAPAN >", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN >=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThan(String value) {
            addCriterion("CUSTISJAPAN <", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN <=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLike(String value) {
            addCriterion("CUSTISJAPAN like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotLike(String value) {
            addCriterion("CUSTISJAPAN not like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIn(List<String> values) {
            addCriterion("CUSTISJAPAN in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotIn(List<String> values) {
            addCriterion("CUSTISJAPAN not in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN not between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNull() {
            addCriterion("AGENTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNotNull() {
            addCriterion("AGENTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnEqualTo(String value) {
            addCriterion("AGENTNAMECN =", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotEqualTo(String value) {
            addCriterion("AGENTNAMECN <>", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThan(String value) {
            addCriterion("AGENTNAMECN >", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN >=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThan(String value) {
            addCriterion("AGENTNAMECN <", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN <=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLike(String value) {
            addCriterion("AGENTNAMECN like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotLike(String value) {
            addCriterion("AGENTNAMECN not like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIn(List<String> values) {
            addCriterion("AGENTNAMECN in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotIn(List<String> values) {
            addCriterion("AGENTNAMECN not in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN not between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNull() {
            addCriterion("AGENTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNotNull() {
            addCriterion("AGENTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenEqualTo(String value) {
            addCriterion("AGENTNAMEEN =", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotEqualTo(String value) {
            addCriterion("AGENTNAMEEN <>", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThan(String value) {
            addCriterion("AGENTNAMEEN >", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN >=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThan(String value) {
            addCriterion("AGENTNAMEEN <", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN <=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLike(String value) {
            addCriterion("AGENTNAMEEN like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotLike(String value) {
            addCriterion("AGENTNAMEEN not like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIn(List<String> values) {
            addCriterion("AGENTNAMEEN in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotIn(List<String> values) {
            addCriterion("AGENTNAMEEN not in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN not between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNull() {
            addCriterion("AGENTPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNotNull() {
            addCriterion("AGENTPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoEqualTo(String value) {
            addCriterion("AGENTPARTYNO =", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotEqualTo(String value) {
            addCriterion("AGENTPARTYNO <>", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThan(String value) {
            addCriterion("AGENTPARTYNO >", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO >=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThan(String value) {
            addCriterion("AGENTPARTYNO <", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO <=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLike(String value) {
            addCriterion("AGENTPARTYNO like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotLike(String value) {
            addCriterion("AGENTPARTYNO not like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIn(List<String> values) {
            addCriterion("AGENTPARTYNO in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotIn(List<String> values) {
            addCriterion("AGENTPARTYNO not in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO not between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
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

        public Criteria andCustaccountnameenIsNull() {
            addCriterion("CUSTACCOUNTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNotNull() {
            addCriterion("CUSTACCOUNTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN =", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <>", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN not like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN not in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN not between", value1, value2, "custaccountnameen");
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

        public Criteria andInsurancetermIsNull() {
            addCriterion("INSURANCETERM is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNotNull() {
            addCriterion("INSURANCETERM is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermEqualTo(String value) {
            addCriterion("INSURANCETERM =", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotEqualTo(String value) {
            addCriterion("INSURANCETERM <>", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThan(String value) {
            addCriterion("INSURANCETERM >", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM >=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThan(String value) {
            addCriterion("INSURANCETERM <", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM <=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLike(String value) {
            addCriterion("INSURANCETERM like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotLike(String value) {
            addCriterion("INSURANCETERM not like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIn(List<String> values) {
            addCriterion("INSURANCETERM in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotIn(List<String> values) {
            addCriterion("INSURANCETERM not in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermBetween(String value1, String value2) {
            addCriterion("INSURANCETERM between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotBetween(String value1, String value2) {
            addCriterion("INSURANCETERM not between", value1, value2, "insuranceterm");
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

        public Criteria andInstallmentstimesEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES =", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <>", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThan(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES >", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES >=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThan(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIn(List<BigDecimal> values) {
            addCriterion("INSTALLMENTSTIMES in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotIn(List<BigDecimal> values) {
            addCriterion("INSTALLMENTSTIMES not in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALLMENTSTIMES between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALLMENTSTIMES not between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusIsNull() {
            addCriterion("POLICYTAXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusIsNotNull() {
            addCriterion("POLICYTAXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusEqualTo(String value) {
            addCriterion("POLICYTAXSTATUS =", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusNotEqualTo(String value) {
            addCriterion("POLICYTAXSTATUS <>", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusGreaterThan(String value) {
            addCriterion("POLICYTAXSTATUS >", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYTAXSTATUS >=", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusLessThan(String value) {
            addCriterion("POLICYTAXSTATUS <", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusLessThanOrEqualTo(String value) {
            addCriterion("POLICYTAXSTATUS <=", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusLike(String value) {
            addCriterion("POLICYTAXSTATUS like", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusNotLike(String value) {
            addCriterion("POLICYTAXSTATUS not like", value, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusIn(List<String> values) {
            addCriterion("POLICYTAXSTATUS in", values, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusNotIn(List<String> values) {
            addCriterion("POLICYTAXSTATUS not in", values, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusBetween(String value1, String value2) {
            addCriterion("POLICYTAXSTATUS between", value1, value2, "policytaxstatus");
            return (Criteria) this;
        }

        public Criteria andPolicytaxstatusNotBetween(String value1, String value2) {
            addCriterion("POLICYTAXSTATUS not between", value1, value2, "policytaxstatus");
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

        public Criteria andIfuploadIsNull() {
            addCriterion("IFUPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNotNull() {
            addCriterion("IFUPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIfuploadEqualTo(String value) {
            addCriterion("IFUPLOAD =", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotEqualTo(String value) {
            addCriterion("IFUPLOAD <>", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThan(String value) {
            addCriterion("IFUPLOAD >", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD >=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThan(String value) {
            addCriterion("IFUPLOAD <", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD <=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLike(String value) {
            addCriterion("IFUPLOAD like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotLike(String value) {
            addCriterion("IFUPLOAD not like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadIn(List<String> values) {
            addCriterion("IFUPLOAD in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotIn(List<String> values) {
            addCriterion("IFUPLOAD not in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadBetween(String value1, String value2) {
            addCriterion("IFUPLOAD between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotBetween(String value1, String value2) {
            addCriterion("IFUPLOAD not between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andProposalformnoIsNull() {
            addCriterion("PROPOSALFORMNO is null");
            return (Criteria) this;
        }

        public Criteria andProposalformnoIsNotNull() {
            addCriterion("PROPOSALFORMNO is not null");
            return (Criteria) this;
        }

        public Criteria andProposalformnoEqualTo(String value) {
            addCriterion("PROPOSALFORMNO =", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoNotEqualTo(String value) {
            addCriterion("PROPOSALFORMNO <>", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoGreaterThan(String value) {
            addCriterion("PROPOSALFORMNO >", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSALFORMNO >=", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoLessThan(String value) {
            addCriterion("PROPOSALFORMNO <", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoLessThanOrEqualTo(String value) {
            addCriterion("PROPOSALFORMNO <=", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoLike(String value) {
            addCriterion("PROPOSALFORMNO like", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoNotLike(String value) {
            addCriterion("PROPOSALFORMNO not like", value, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoIn(List<String> values) {
            addCriterion("PROPOSALFORMNO in", values, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoNotIn(List<String> values) {
            addCriterion("PROPOSALFORMNO not in", values, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoBetween(String value1, String value2) {
            addCriterion("PROPOSALFORMNO between", value1, value2, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andProposalformnoNotBetween(String value1, String value2) {
            addCriterion("PROPOSALFORMNO not between", value1, value2, "proposalformno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNull() {
            addCriterion("SETTLEMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("SETTLEMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(String value) {
            addCriterion("SETTLEMENTNO =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(String value) {
            addCriterion("SETTLEMENTNO <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(String value) {
            addCriterion("SETTLEMENTNO >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTNO >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(String value) {
            addCriterion("SETTLEMENTNO <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTNO <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLike(String value) {
            addCriterion("SETTLEMENTNO like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotLike(String value) {
            addCriterion("SETTLEMENTNO not like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<String> values) {
            addCriterion("SETTLEMENTNO in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<String> values) {
            addCriterion("SETTLEMENTNO not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(String value1, String value2) {
            addCriterion("SETTLEMENTNO between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENTNO not between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNull() {
            addCriterion("SOURCENO is null");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNotNull() {
            addCriterion("SOURCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenoEqualTo(BigDecimal value) {
            addCriterion("SOURCENO =", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <>", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThan(BigDecimal value) {
            addCriterion("SOURCENO >", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO >=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThan(BigDecimal value) {
            addCriterion("SOURCENO <", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIn(List<BigDecimal> values) {
            addCriterion("SOURCENO in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotIn(List<BigDecimal> values) {
            addCriterion("SOURCENO not in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO not between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeIsNull() {
            addCriterion("BUSIOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeIsNotNull() {
            addCriterion("BUSIOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeEqualTo(String value) {
            addCriterion("BUSIOPCODE =", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeNotEqualTo(String value) {
            addCriterion("BUSIOPCODE <>", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeGreaterThan(String value) {
            addCriterion("BUSIOPCODE >", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSIOPCODE >=", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeLessThan(String value) {
            addCriterion("BUSIOPCODE <", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeLessThanOrEqualTo(String value) {
            addCriterion("BUSIOPCODE <=", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeLike(String value) {
            addCriterion("BUSIOPCODE like", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeNotLike(String value) {
            addCriterion("BUSIOPCODE not like", value, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeIn(List<String> values) {
            addCriterion("BUSIOPCODE in", values, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeNotIn(List<String> values) {
            addCriterion("BUSIOPCODE not in", values, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeBetween(String value1, String value2) {
            addCriterion("BUSIOPCODE between", value1, value2, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andBusiopcodeNotBetween(String value1, String value2) {
            addCriterion("BUSIOPCODE not between", value1, value2, "busiopcode");
            return (Criteria) this;
        }

        public Criteria andOffersiteIsNull() {
            addCriterion("OFFERSITE is null");
            return (Criteria) this;
        }

        public Criteria andOffersiteIsNotNull() {
            addCriterion("OFFERSITE is not null");
            return (Criteria) this;
        }

        public Criteria andOffersiteEqualTo(String value) {
            addCriterion("OFFERSITE =", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteNotEqualTo(String value) {
            addCriterion("OFFERSITE <>", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteGreaterThan(String value) {
            addCriterion("OFFERSITE >", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteGreaterThanOrEqualTo(String value) {
            addCriterion("OFFERSITE >=", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteLessThan(String value) {
            addCriterion("OFFERSITE <", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteLessThanOrEqualTo(String value) {
            addCriterion("OFFERSITE <=", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteLike(String value) {
            addCriterion("OFFERSITE like", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteNotLike(String value) {
            addCriterion("OFFERSITE not like", value, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteIn(List<String> values) {
            addCriterion("OFFERSITE in", values, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteNotIn(List<String> values) {
            addCriterion("OFFERSITE not in", values, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteBetween(String value1, String value2) {
            addCriterion("OFFERSITE between", value1, value2, "offersite");
            return (Criteria) this;
        }

        public Criteria andOffersiteNotBetween(String value1, String value2) {
            addCriterion("OFFERSITE not between", value1, value2, "offersite");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeIsNull() {
            addCriterion("INSURANCEADDRESSCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeIsNotNull() {
            addCriterion("INSURANCEADDRESSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeEqualTo(String value) {
            addCriterion("INSURANCEADDRESSCODE =", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeNotEqualTo(String value) {
            addCriterion("INSURANCEADDRESSCODE <>", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeGreaterThan(String value) {
            addCriterion("INSURANCEADDRESSCODE >", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCEADDRESSCODE >=", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeLessThan(String value) {
            addCriterion("INSURANCEADDRESSCODE <", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeLessThanOrEqualTo(String value) {
            addCriterion("INSURANCEADDRESSCODE <=", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeLike(String value) {
            addCriterion("INSURANCEADDRESSCODE like", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeNotLike(String value) {
            addCriterion("INSURANCEADDRESSCODE not like", value, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeIn(List<String> values) {
            addCriterion("INSURANCEADDRESSCODE in", values, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeNotIn(List<String> values) {
            addCriterion("INSURANCEADDRESSCODE not in", values, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeBetween(String value1, String value2) {
            addCriterion("INSURANCEADDRESSCODE between", value1, value2, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddresscodeNotBetween(String value1, String value2) {
            addCriterion("INSURANCEADDRESSCODE not between", value1, value2, "insuranceaddresscode");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameIsNull() {
            addCriterion("INSURANCEADDRESSNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameIsNotNull() {
            addCriterion("INSURANCEADDRESSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameEqualTo(String value) {
            addCriterion("INSURANCEADDRESSNAME =", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameNotEqualTo(String value) {
            addCriterion("INSURANCEADDRESSNAME <>", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameGreaterThan(String value) {
            addCriterion("INSURANCEADDRESSNAME >", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCEADDRESSNAME >=", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameLessThan(String value) {
            addCriterion("INSURANCEADDRESSNAME <", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameLessThanOrEqualTo(String value) {
            addCriterion("INSURANCEADDRESSNAME <=", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameLike(String value) {
            addCriterion("INSURANCEADDRESSNAME like", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameNotLike(String value) {
            addCriterion("INSURANCEADDRESSNAME not like", value, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameIn(List<String> values) {
            addCriterion("INSURANCEADDRESSNAME in", values, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameNotIn(List<String> values) {
            addCriterion("INSURANCEADDRESSNAME not in", values, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameBetween(String value1, String value2) {
            addCriterion("INSURANCEADDRESSNAME between", value1, value2, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andInsuranceaddressnameNotBetween(String value1, String value2) {
            addCriterion("INSURANCEADDRESSNAME not between", value1, value2, "insuranceaddressname");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateIsNull() {
            addCriterion("LASTPOLICYENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateIsNotNull() {
            addCriterion("LASTPOLICYENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateEqualTo(Date value) {
            addCriterion("LASTPOLICYENDDATE =", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateNotEqualTo(Date value) {
            addCriterion("LASTPOLICYENDDATE <>", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateGreaterThan(Date value) {
            addCriterion("LASTPOLICYENDDATE >", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTPOLICYENDDATE >=", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateLessThan(Date value) {
            addCriterion("LASTPOLICYENDDATE <", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateLessThanOrEqualTo(Date value) {
            addCriterion("LASTPOLICYENDDATE <=", value, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateIn(List<Date> values) {
            addCriterion("LASTPOLICYENDDATE in", values, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateNotIn(List<Date> values) {
            addCriterion("LASTPOLICYENDDATE not in", values, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateBetween(Date value1, Date value2) {
            addCriterion("LASTPOLICYENDDATE between", value1, value2, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andLastpolicyenddateNotBetween(Date value1, Date value2) {
            addCriterion("LASTPOLICYENDDATE not between", value1, value2, "lastpolicyenddate");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeIsNull() {
            addCriterion("CLASSESITEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeIsNotNull() {
            addCriterion("CLASSESITEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeEqualTo(String value) {
            addCriterion("CLASSESITEMCODE =", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeNotEqualTo(String value) {
            addCriterion("CLASSESITEMCODE <>", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeGreaterThan(String value) {
            addCriterion("CLASSESITEMCODE >", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESITEMCODE >=", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeLessThan(String value) {
            addCriterion("CLASSESITEMCODE <", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESITEMCODE <=", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeLike(String value) {
            addCriterion("CLASSESITEMCODE like", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeNotLike(String value) {
            addCriterion("CLASSESITEMCODE not like", value, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeIn(List<String> values) {
            addCriterion("CLASSESITEMCODE in", values, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeNotIn(List<String> values) {
            addCriterion("CLASSESITEMCODE not in", values, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeBetween(String value1, String value2) {
            addCriterion("CLASSESITEMCODE between", value1, value2, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemcodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESITEMCODE not between", value1, value2, "classesitemcode");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameIsNull() {
            addCriterion("CLASSESITEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameIsNotNull() {
            addCriterion("CLASSESITEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameEqualTo(String value) {
            addCriterion("CLASSESITEMNAME =", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameNotEqualTo(String value) {
            addCriterion("CLASSESITEMNAME <>", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameGreaterThan(String value) {
            addCriterion("CLASSESITEMNAME >", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESITEMNAME >=", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameLessThan(String value) {
            addCriterion("CLASSESITEMNAME <", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSESITEMNAME <=", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameLike(String value) {
            addCriterion("CLASSESITEMNAME like", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameNotLike(String value) {
            addCriterion("CLASSESITEMNAME not like", value, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameIn(List<String> values) {
            addCriterion("CLASSESITEMNAME in", values, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameNotIn(List<String> values) {
            addCriterion("CLASSESITEMNAME not in", values, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameBetween(String value1, String value2) {
            addCriterion("CLASSESITEMNAME between", value1, value2, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andClassesitemnameNotBetween(String value1, String value2) {
            addCriterion("CLASSESITEMNAME not between", value1, value2, "classesitemname");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIsNull() {
            addCriterion("ISACTIVEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIsNotNull() {
            addCriterion("ISACTIVEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagEqualTo(String value) {
            addCriterion("ISACTIVEFLAG =", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotEqualTo(String value) {
            addCriterion("ISACTIVEFLAG <>", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagGreaterThan(String value) {
            addCriterion("ISACTIVEFLAG >", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVEFLAG >=", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLessThan(String value) {
            addCriterion("ISACTIVEFLAG <", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVEFLAG <=", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLike(String value) {
            addCriterion("ISACTIVEFLAG like", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotLike(String value) {
            addCriterion("ISACTIVEFLAG not like", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIn(List<String> values) {
            addCriterion("ISACTIVEFLAG in", values, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotIn(List<String> values) {
            addCriterion("ISACTIVEFLAG not in", values, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagBetween(String value1, String value2) {
            addCriterion("ISACTIVEFLAG between", value1, value2, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotBetween(String value1, String value2) {
            addCriterion("ISACTIVEFLAG not between", value1, value2, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementIsNull() {
            addCriterion("ISBATCHSETTLEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementIsNotNull() {
            addCriterion("ISBATCHSETTLEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementEqualTo(String value) {
            addCriterion("ISBATCHSETTLEMENT =", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementNotEqualTo(String value) {
            addCriterion("ISBATCHSETTLEMENT <>", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementGreaterThan(String value) {
            addCriterion("ISBATCHSETTLEMENT >", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementGreaterThanOrEqualTo(String value) {
            addCriterion("ISBATCHSETTLEMENT >=", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementLessThan(String value) {
            addCriterion("ISBATCHSETTLEMENT <", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementLessThanOrEqualTo(String value) {
            addCriterion("ISBATCHSETTLEMENT <=", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementLike(String value) {
            addCriterion("ISBATCHSETTLEMENT like", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementNotLike(String value) {
            addCriterion("ISBATCHSETTLEMENT not like", value, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementIn(List<String> values) {
            addCriterion("ISBATCHSETTLEMENT in", values, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementNotIn(List<String> values) {
            addCriterion("ISBATCHSETTLEMENT not in", values, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementBetween(String value1, String value2) {
            addCriterion("ISBATCHSETTLEMENT between", value1, value2, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andIsbatchsettlementNotBetween(String value1, String value2) {
            addCriterion("ISBATCHSETTLEMENT not between", value1, value2, "isbatchsettlement");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNull() {
            addCriterion("SEQCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNotNull() {
            addCriterion("SEQCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE =", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE <>", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThan(BigDecimal value) {
            addCriterion("SEQCHARGE >", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE >=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThan(BigDecimal value) {
            addCriterion("SEQCHARGE <", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE <=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIn(List<BigDecimal> values) {
            addCriterion("SEQCHARGE in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotIn(List<BigDecimal> values) {
            addCriterion("SEQCHARGE not in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQCHARGE between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQCHARGE not between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNull() {
            addCriterion("EXCHANGECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNotNull() {
            addCriterion("EXCHANGECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE =", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE <>", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThan(String value) {
            addCriterion("EXCHANGECURRENCYCODE >", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE >=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThan(String value) {
            addCriterion("EXCHANGECURRENCYCODE <", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE <=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLike(String value) {
            addCriterion("EXCHANGECURRENCYCODE like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotLike(String value) {
            addCriterion("EXCHANGECURRENCYCODE not like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIn(List<String> values) {
            addCriterion("EXCHANGECURRENCYCODE in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotIn(List<String> values) {
            addCriterion("EXCHANGECURRENCYCODE not in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCYCODE between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCYCODE not between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNull() {
            addCriterion("EXCHANGEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNotNull() {
            addCriterion("EXCHANGEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT =", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <>", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT not in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT not between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andMasternoIsNull() {
            addCriterion("MASTERNO is null");
            return (Criteria) this;
        }

        public Criteria andMasternoIsNotNull() {
            addCriterion("MASTERNO is not null");
            return (Criteria) this;
        }

        public Criteria andMasternoEqualTo(String value) {
            addCriterion("MASTERNO =", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotEqualTo(String value) {
            addCriterion("MASTERNO <>", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThan(String value) {
            addCriterion("MASTERNO >", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNO >=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThan(String value) {
            addCriterion("MASTERNO <", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThanOrEqualTo(String value) {
            addCriterion("MASTERNO <=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLike(String value) {
            addCriterion("MASTERNO like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotLike(String value) {
            addCriterion("MASTERNO not like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoIn(List<String> values) {
            addCriterion("MASTERNO in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotIn(List<String> values) {
            addCriterion("MASTERNO not in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoBetween(String value1, String value2) {
            addCriterion("MASTERNO between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotBetween(String value1, String value2) {
            addCriterion("MASTERNO not between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNull() {
            addCriterion("MASTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNotNull() {
            addCriterion("MASTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMasternameEqualTo(String value) {
            addCriterion("MASTERNAME =", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotEqualTo(String value) {
            addCriterion("MASTERNAME <>", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThan(String value) {
            addCriterion("MASTERNAME >", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNAME >=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThan(String value) {
            addCriterion("MASTERNAME <", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThanOrEqualTo(String value) {
            addCriterion("MASTERNAME <=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLike(String value) {
            addCriterion("MASTERNAME like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotLike(String value) {
            addCriterion("MASTERNAME not like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameIn(List<String> values) {
            addCriterion("MASTERNAME in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotIn(List<String> values) {
            addCriterion("MASTERNAME not in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameBetween(String value1, String value2) {
            addCriterion("MASTERNAME between", value1, value2, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotBetween(String value1, String value2) {
            addCriterion("MASTERNAME not between", value1, value2, "mastername");
            return (Criteria) this;
        }

        public Criteria andOptcodeIsNull() {
            addCriterion("OPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andOptcodeIsNotNull() {
            addCriterion("OPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptcodeEqualTo(String value) {
            addCriterion("OPTCODE =", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotEqualTo(String value) {
            addCriterion("OPTCODE <>", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThan(String value) {
            addCriterion("OPTCODE >", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTCODE >=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThan(String value) {
            addCriterion("OPTCODE <", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThanOrEqualTo(String value) {
            addCriterion("OPTCODE <=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLike(String value) {
            addCriterion("OPTCODE like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotLike(String value) {
            addCriterion("OPTCODE not like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeIn(List<String> values) {
            addCriterion("OPTCODE in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotIn(List<String> values) {
            addCriterion("OPTCODE not in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeBetween(String value1, String value2) {
            addCriterion("OPTCODE between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotBetween(String value1, String value2) {
            addCriterion("OPTCODE not between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNull() {
            addCriterion("OPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNotNull() {
            addCriterion("OPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptnameEqualTo(String value) {
            addCriterion("OPTNAME =", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotEqualTo(String value) {
            addCriterion("OPTNAME <>", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThan(String value) {
            addCriterion("OPTNAME >", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPTNAME >=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThan(String value) {
            addCriterion("OPTNAME <", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThanOrEqualTo(String value) {
            addCriterion("OPTNAME <=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLike(String value) {
            addCriterion("OPTNAME like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotLike(String value) {
            addCriterion("OPTNAME not like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameIn(List<String> values) {
            addCriterion("OPTNAME in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotIn(List<String> values) {
            addCriterion("OPTNAME not in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameBetween(String value1, String value2) {
            addCriterion("OPTNAME between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotBetween(String value1, String value2) {
            addCriterion("OPTNAME not between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andTransactornameIsNull() {
            addCriterion("TRANSACTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andTransactornameIsNotNull() {
            addCriterion("TRANSACTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransactornameEqualTo(String value) {
            addCriterion("TRANSACTORNAME =", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotEqualTo(String value) {
            addCriterion("TRANSACTORNAME <>", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThan(String value) {
            addCriterion("TRANSACTORNAME >", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME >=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThan(String value) {
            addCriterion("TRANSACTORNAME <", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME <=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLike(String value) {
            addCriterion("TRANSACTORNAME like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotLike(String value) {
            addCriterion("TRANSACTORNAME not like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameIn(List<String> values) {
            addCriterion("TRANSACTORNAME in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotIn(List<String> values) {
            addCriterion("TRANSACTORNAME not in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME not between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNull() {
            addCriterion("PREMIUMSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNotNull() {
            addCriterion("PREMIUMSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceEqualTo(String value) {
            addCriterion("PREMIUMSOURCE =", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <>", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThan(String value) {
            addCriterion("PREMIUMSOURCE >", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE >=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThan(String value) {
            addCriterion("PREMIUMSOURCE <", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLike(String value) {
            addCriterion("PREMIUMSOURCE like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotLike(String value) {
            addCriterion("PREMIUMSOURCE not like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIn(List<String> values) {
            addCriterion("PREMIUMSOURCE in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotIn(List<String> values) {
            addCriterion("PREMIUMSOURCE not in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE not between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNull() {
            addCriterion("ISSPLITTED is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("ISSPLITTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("ISSPLITTED like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("ISSPLITTED not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
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

        public Criteria andBiztypeIsNull() {
            addCriterion("BIZTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNotNull() {
            addCriterion("BIZTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBiztypeEqualTo(String value) {
            addCriterion("BIZTYPE =", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotEqualTo(String value) {
            addCriterion("BIZTYPE <>", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThan(String value) {
            addCriterion("BIZTYPE >", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZTYPE >=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThan(String value) {
            addCriterion("BIZTYPE <", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThanOrEqualTo(String value) {
            addCriterion("BIZTYPE <=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLike(String value) {
            addCriterion("BIZTYPE like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotLike(String value) {
            addCriterion("BIZTYPE not like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeIn(List<String> values) {
            addCriterion("BIZTYPE in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotIn(List<String> values) {
            addCriterion("BIZTYPE not in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeBetween(String value1, String value2) {
            addCriterion("BIZTYPE between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotBetween(String value1, String value2) {
            addCriterion("BIZTYPE not between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiznoIsNull() {
            addCriterion("BIZNO is null");
            return (Criteria) this;
        }

        public Criteria andBiznoIsNotNull() {
            addCriterion("BIZNO is not null");
            return (Criteria) this;
        }

        public Criteria andBiznoEqualTo(String value) {
            addCriterion("BIZNO =", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotEqualTo(String value) {
            addCriterion("BIZNO <>", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoGreaterThan(String value) {
            addCriterion("BIZNO >", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZNO >=", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLessThan(String value) {
            addCriterion("BIZNO <", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLessThanOrEqualTo(String value) {
            addCriterion("BIZNO <=", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLike(String value) {
            addCriterion("BIZNO like", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotLike(String value) {
            addCriterion("BIZNO not like", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoIn(List<String> values) {
            addCriterion("BIZNO in", values, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotIn(List<String> values) {
            addCriterion("BIZNO not in", values, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoBetween(String value1, String value2) {
            addCriterion("BIZNO between", value1, value2, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotBetween(String value1, String value2) {
            addCriterion("BIZNO not between", value1, value2, "bizno");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNull() {
            addCriterion("TAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNotNull() {
            addCriterion("TAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT =", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <>", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT >", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT >=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT <", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT not in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT not between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIsNull() {
            addCriterion("TAXESRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIsNotNull() {
            addCriterion("TAXESRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE =", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <>", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThan(BigDecimal value) {
            addCriterion("TAXESRATE >", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE >=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThan(BigDecimal value) {
            addCriterion("TAXESRATE <", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE not in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE not between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIsNull() {
            addCriterion("EQUALSALE is null");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIsNotNull() {
            addCriterion("EQUALSALE is not null");
            return (Criteria) this;
        }

        public Criteria andEqualsaleEqualTo(String value) {
            addCriterion("EQUALSALE =", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotEqualTo(String value) {
            addCriterion("EQUALSALE <>", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleGreaterThan(String value) {
            addCriterion("EQUALSALE >", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleGreaterThanOrEqualTo(String value) {
            addCriterion("EQUALSALE >=", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLessThan(String value) {
            addCriterion("EQUALSALE <", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLessThanOrEqualTo(String value) {
            addCriterion("EQUALSALE <=", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLike(String value) {
            addCriterion("EQUALSALE like", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotLike(String value) {
            addCriterion("EQUALSALE not like", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIn(List<String> values) {
            addCriterion("EQUALSALE in", values, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotIn(List<String> values) {
            addCriterion("EQUALSALE not in", values, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleBetween(String value1, String value2) {
            addCriterion("EQUALSALE between", value1, value2, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotBetween(String value1, String value2) {
            addCriterion("EQUALSALE not between", value1, value2, "equalsale");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIsNull() {
            addCriterion("IFAGENTBUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIsNotNull() {
            addCriterion("IFAGENTBUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS =", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS <>", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessGreaterThan(String value) {
            addCriterion("IFAGENTBUSINESS >", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS >=", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLessThan(String value) {
            addCriterion("IFAGENTBUSINESS <", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLessThanOrEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS <=", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLike(String value) {
            addCriterion("IFAGENTBUSINESS like", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotLike(String value) {
            addCriterion("IFAGENTBUSINESS not like", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIn(List<String> values) {
            addCriterion("IFAGENTBUSINESS in", values, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotIn(List<String> values) {
            addCriterion("IFAGENTBUSINESS not in", values, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessBetween(String value1, String value2) {
            addCriterion("IFAGENTBUSINESS between", value1, value2, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotBetween(String value1, String value2) {
            addCriterion("IFAGENTBUSINESS not between", value1, value2, "ifagentbusiness");
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

        public Criteria andTaxesamountoutIsNull() {
            addCriterion("TAXESAMOUNTOUT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNotNull() {
            addCriterion("TAXESAMOUNTOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT =", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <>", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT not in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT not between", value1, value2, "taxesamountout");
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

        public Criteria andIsjointinsuranceIsNull() {
            addCriterion("ISJOINTINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceIsNotNull() {
            addCriterion("ISJOINTINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE =", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE <>", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceGreaterThan(String value) {
            addCriterion("ISJOINTINSURANCE >", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE >=", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLessThan(String value) {
            addCriterion("ISJOINTINSURANCE <", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLessThanOrEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE <=", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLike(String value) {
            addCriterion("ISJOINTINSURANCE like", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotLike(String value) {
            addCriterion("ISJOINTINSURANCE not like", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceIn(List<String> values) {
            addCriterion("ISJOINTINSURANCE in", values, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotIn(List<String> values) {
            addCriterion("ISJOINTINSURANCE not in", values, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceBetween(String value1, String value2) {
            addCriterion("ISJOINTINSURANCE between", value1, value2, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotBetween(String value1, String value2) {
            addCriterion("ISJOINTINSURANCE not between", value1, value2, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoIsNull() {
            addCriterion("JOINTINSURANCENO is null");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoIsNotNull() {
            addCriterion("JOINTINSURANCENO is not null");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoEqualTo(String value) {
            addCriterion("JOINTINSURANCENO =", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotEqualTo(String value) {
            addCriterion("JOINTINSURANCENO <>", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoGreaterThan(String value) {
            addCriterion("JOINTINSURANCENO >", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoGreaterThanOrEqualTo(String value) {
            addCriterion("JOINTINSURANCENO >=", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLessThan(String value) {
            addCriterion("JOINTINSURANCENO <", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLessThanOrEqualTo(String value) {
            addCriterion("JOINTINSURANCENO <=", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLike(String value) {
            addCriterion("JOINTINSURANCENO like", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotLike(String value) {
            addCriterion("JOINTINSURANCENO not like", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoIn(List<String> values) {
            addCriterion("JOINTINSURANCENO in", values, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotIn(List<String> values) {
            addCriterion("JOINTINSURANCENO not in", values, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoBetween(String value1, String value2) {
            addCriterion("JOINTINSURANCENO between", value1, value2, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotBetween(String value1, String value2) {
            addCriterion("JOINTINSURANCENO not between", value1, value2, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNull() {
            addCriterion("BUSINESSSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNotNull() {
            addCriterion("BUSINESSSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceEqualTo(String value) {
            addCriterion("BUSINESSSOURCE =", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <>", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThan(String value) {
            addCriterion("BUSINESSSOURCE >", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE >=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThan(String value) {
            addCriterion("BUSINESSSOURCE <", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLike(String value) {
            addCriterion("BUSINESSSOURCE like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotLike(String value) {
            addCriterion("BUSINESSSOURCE not like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIn(List<String> values) {
            addCriterion("BUSINESSSOURCE in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotIn(List<String> values) {
            addCriterion("BUSINESSSOURCE not in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE not between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
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

        public Criteria andCharacteristicsIsNull() {
            addCriterion("CHARACTERISTICS is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNotNull() {
            addCriterion("CHARACTERISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsEqualTo(String value) {
            addCriterion("CHARACTERISTICS =", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotEqualTo(String value) {
            addCriterion("CHARACTERISTICS <>", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThan(String value) {
            addCriterion("CHARACTERISTICS >", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS >=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThan(String value) {
            addCriterion("CHARACTERISTICS <", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS <=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLike(String value) {
            addCriterion("CHARACTERISTICS like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotLike(String value) {
            addCriterion("CHARACTERISTICS not like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIn(List<String> values) {
            addCriterion("CHARACTERISTICS in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotIn(List<String> values) {
            addCriterion("CHARACTERISTICS not in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS not between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNull() {
            addCriterion("GROUPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNotNull() {
            addCriterion("GROUPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGroupflagEqualTo(String value) {
            addCriterion("GROUPFLAG =", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotEqualTo(String value) {
            addCriterion("GROUPFLAG <>", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThan(String value) {
            addCriterion("GROUPFLAG >", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG >=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThan(String value) {
            addCriterion("GROUPFLAG <", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG <=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLike(String value) {
            addCriterion("GROUPFLAG like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotLike(String value) {
            addCriterion("GROUPFLAG not like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIn(List<String> values) {
            addCriterion("GROUPFLAG in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotIn(List<String> values) {
            addCriterion("GROUPFLAG not in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagBetween(String value1, String value2) {
            addCriterion("GROUPFLAG between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotBetween(String value1, String value2) {
            addCriterion("GROUPFLAG not between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNull() {
            addCriterion("PERIODFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNotNull() {
            addCriterion("PERIODFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagEqualTo(String value) {
            addCriterion("PERIODFLAG =", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotEqualTo(String value) {
            addCriterion("PERIODFLAG <>", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThan(String value) {
            addCriterion("PERIODFLAG >", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG >=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThan(String value) {
            addCriterion("PERIODFLAG <", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG <=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLike(String value) {
            addCriterion("PERIODFLAG like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotLike(String value) {
            addCriterion("PERIODFLAG not like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIn(List<String> values) {
            addCriterion("PERIODFLAG in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotIn(List<String> values) {
            addCriterion("PERIODFLAG not in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagBetween(String value1, String value2) {
            addCriterion("PERIODFLAG between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotBetween(String value1, String value2) {
            addCriterion("PERIODFLAG not between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("BATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BATCHNUMBER =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BATCHNUMBER <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BATCHNUMBER >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BATCHNUMBER <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BATCHNUMBER like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BATCHNUMBER not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BATCHNUMBER in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BATCHNUMBER not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNull() {
            addCriterion("OUTDATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNotNull() {
            addCriterion("OUTDATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceEqualTo(String value) {
            addCriterion("OUTDATASOURCE =", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotEqualTo(String value) {
            addCriterion("OUTDATASOURCE <>", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThan(String value) {
            addCriterion("OUTDATASOURCE >", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("OUTDATASOURCE >=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThan(String value) {
            addCriterion("OUTDATASOURCE <", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThanOrEqualTo(String value) {
            addCriterion("OUTDATASOURCE <=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLike(String value) {
            addCriterion("OUTDATASOURCE like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotLike(String value) {
            addCriterion("OUTDATASOURCE not like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIn(List<String> values) {
            addCriterion("OUTDATASOURCE in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotIn(List<String> values) {
            addCriterion("OUTDATASOURCE not in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceBetween(String value1, String value2) {
            addCriterion("OUTDATASOURCE between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotBetween(String value1, String value2) {
            addCriterion("OUTDATASOURCE not between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIsNull() {
            addCriterion("CUSTOMERSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIsNotNull() {
            addCriterion("CUSTOMERSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE =", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE <>", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThan(String value) {
            addCriterion("CUSTOMERSOURCE >", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE >=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThan(String value) {
            addCriterion("CUSTOMERSOURCE <", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE <=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLike(String value) {
            addCriterion("CUSTOMERSOURCE like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotLike(String value) {
            addCriterion("CUSTOMERSOURCE not like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIn(List<String> values) {
            addCriterion("CUSTOMERSOURCE in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotIn(List<String> values) {
            addCriterion("CUSTOMERSOURCE not in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceBetween(String value1, String value2) {
            addCriterion("CUSTOMERSOURCE between", value1, value2, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSOURCE not between", value1, value2, "customersource");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNull() {
            addCriterion("BUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("BUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("BUSINESSNO like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("BUSINESSNO not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIsNull() {
            addCriterion("TOTALSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIsNotNull() {
            addCriterion("TOTALSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoEqualTo(String value) {
            addCriterion("TOTALSERIALNO =", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotEqualTo(String value) {
            addCriterion("TOTALSERIALNO <>", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThan(String value) {
            addCriterion("TOTALSERIALNO >", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALSERIALNO >=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThan(String value) {
            addCriterion("TOTALSERIALNO <", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThanOrEqualTo(String value) {
            addCriterion("TOTALSERIALNO <=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLike(String value) {
            addCriterion("TOTALSERIALNO like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotLike(String value) {
            addCriterion("TOTALSERIALNO not like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIn(List<String> values) {
            addCriterion("TOTALSERIALNO in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotIn(List<String> values) {
            addCriterion("TOTALSERIALNO not in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoBetween(String value1, String value2) {
            addCriterion("TOTALSERIALNO between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotBetween(String value1, String value2) {
            addCriterion("TOTALSERIALNO not between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNull() {
            addCriterion("FARMFLAGCODE is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNotNull() {
            addCriterion("FARMFLAGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeEqualTo(String value) {
            addCriterion("FARMFLAGCODE =", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotEqualTo(String value) {
            addCriterion("FARMFLAGCODE <>", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThan(String value) {
            addCriterion("FARMFLAGCODE >", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE >=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThan(String value) {
            addCriterion("FARMFLAGCODE <", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE <=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLike(String value) {
            addCriterion("FARMFLAGCODE like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotLike(String value) {
            addCriterion("FARMFLAGCODE not like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIn(List<String> values) {
            addCriterion("FARMFLAGCODE in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotIn(List<String> values) {
            addCriterion("FARMFLAGCODE not in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE not between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("VEHKIND is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("VEHKIND is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("VEHKIND =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("VEHKIND <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("VEHKIND >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("VEHKIND >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("VEHKIND <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("VEHKIND <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("VEHKIND like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("VEHKIND not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("VEHKIND in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("VEHKIND not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("VEHKIND between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("VEHKIND not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("USEPORPERTY like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("USEPORPERTY not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNull() {
            addCriterion("FARPOLICYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNotNull() {
            addCriterion("FARPOLICYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeEqualTo(String value) {
            addCriterion("FARPOLICYTYPE =", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <>", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThan(String value) {
            addCriterion("FARPOLICYTYPE >", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE >=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThan(String value) {
            addCriterion("FARPOLICYTYPE <", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLike(String value) {
            addCriterion("FARPOLICYTYPE like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotLike(String value) {
            addCriterion("FARPOLICYTYPE not like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIn(List<String> values) {
            addCriterion("FARPOLICYTYPE in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotIn(List<String> values) {
            addCriterion("FARPOLICYTYPE not in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE not between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNull() {
            addCriterion("CARUSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNotNull() {
            addCriterion("CARUSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeEqualTo(String value) {
            addCriterion("CARUSETYPE =", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotEqualTo(String value) {
            addCriterion("CARUSETYPE <>", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThan(String value) {
            addCriterion("CARUSETYPE >", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE >=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThan(String value) {
            addCriterion("CARUSETYPE <", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE <=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLike(String value) {
            addCriterion("CARUSETYPE like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotLike(String value) {
            addCriterion("CARUSETYPE not like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIn(List<String> values) {
            addCriterion("CARUSETYPE in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotIn(List<String> values) {
            addCriterion("CARUSETYPE not in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeBetween(String value1, String value2) {
            addCriterion("CARUSETYPE between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotBetween(String value1, String value2) {
            addCriterion("CARUSETYPE not between", value1, value2, "carusetype");
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

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("SERIALNO like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("SERIALNO not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIsNull() {
            addCriterion("MAINPOLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIsNotNull() {
            addCriterion("MAINPOLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoEqualTo(String value) {
            addCriterion("MAINPOLICYNO =", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotEqualTo(String value) {
            addCriterion("MAINPOLICYNO <>", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoGreaterThan(String value) {
            addCriterion("MAINPOLICYNO >", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("MAINPOLICYNO >=", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLessThan(String value) {
            addCriterion("MAINPOLICYNO <", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLessThanOrEqualTo(String value) {
            addCriterion("MAINPOLICYNO <=", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLike(String value) {
            addCriterion("MAINPOLICYNO like", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotLike(String value) {
            addCriterion("MAINPOLICYNO not like", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIn(List<String> values) {
            addCriterion("MAINPOLICYNO in", values, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotIn(List<String> values) {
            addCriterion("MAINPOLICYNO not in", values, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoBetween(String value1, String value2) {
            addCriterion("MAINPOLICYNO between", value1, value2, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotBetween(String value1, String value2) {
            addCriterion("MAINPOLICYNO not between", value1, value2, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIsNull() {
            addCriterion("INVOICEISSUEWAY is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIsNotNull() {
            addCriterion("INVOICEISSUEWAY is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY =", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY <>", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayGreaterThan(String value) {
            addCriterion("INVOICEISSUEWAY >", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY >=", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLessThan(String value) {
            addCriterion("INVOICEISSUEWAY <", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLessThanOrEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY <=", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLike(String value) {
            addCriterion("INVOICEISSUEWAY like", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotLike(String value) {
            addCriterion("INVOICEISSUEWAY not like", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIn(List<String> values) {
            addCriterion("INVOICEISSUEWAY in", values, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotIn(List<String> values) {
            addCriterion("INVOICEISSUEWAY not in", values, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayBetween(String value1, String value2) {
            addCriterion("INVOICEISSUEWAY between", value1, value2, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotBetween(String value1, String value2) {
            addCriterion("INVOICEISSUEWAY not between", value1, value2, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNull() {
            addCriterion("TAXESAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNotNull() {
            addCriterion("TAXESAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1EqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 =", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <>", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1In(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 not in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 not between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateIsNull() {
            addCriterion("CNYEXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateIsNotNull() {
            addCriterion("CNYEXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateEqualTo(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE =", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateNotEqualTo(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE <>", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateGreaterThan(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE >", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE >=", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateLessThan(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE <", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CNYEXCHANGERATE <=", value, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateIn(List<BigDecimal> values) {
            addCriterion("CNYEXCHANGERATE in", values, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateNotIn(List<BigDecimal> values) {
            addCriterion("CNYEXCHANGERATE not in", values, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNYEXCHANGERATE between", value1, value2, "cnyexchangerate");
            return (Criteria) this;
        }

        public Criteria andCnyexchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNYEXCHANGERATE not between", value1, value2, "cnyexchangerate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_policy_td
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
     * @Table : mm_policy_td
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