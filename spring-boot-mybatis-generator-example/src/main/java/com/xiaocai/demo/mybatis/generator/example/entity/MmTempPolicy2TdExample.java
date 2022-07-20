package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTempPolicy2TdExample {
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
    public MmTempPolicy2TdExample() {
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
     * @Table : mm_temp_policy2_td
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

        public Criteria andSeqpolicyIsNull() {
            addCriterion("seqpolicy is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("seqpolicy is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(Long value) {
            addCriterion("seqpolicy =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(Long value) {
            addCriterion("seqpolicy <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(Long value) {
            addCriterion("seqpolicy >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(Long value) {
            addCriterion("seqpolicy >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(Long value) {
            addCriterion("seqpolicy <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(Long value) {
            addCriterion("seqpolicy <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<Long> values) {
            addCriterion("seqpolicy in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<Long> values) {
            addCriterion("seqpolicy not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(Long value1, Long value2) {
            addCriterion("seqpolicy between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(Long value1, Long value2) {
            addCriterion("seqpolicy not between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNull() {
            addCriterion("seqcharge is null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNotNull() {
            addCriterion("seqcharge is not null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeEqualTo(Long value) {
            addCriterion("seqcharge =", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotEqualTo(Long value) {
            addCriterion("seqcharge <>", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThan(Long value) {
            addCriterion("seqcharge >", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThanOrEqualTo(Long value) {
            addCriterion("seqcharge >=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThan(Long value) {
            addCriterion("seqcharge <", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThanOrEqualTo(Long value) {
            addCriterion("seqcharge <=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIn(List<Long> values) {
            addCriterion("seqcharge in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotIn(List<Long> values) {
            addCriterion("seqcharge not in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeBetween(Long value1, Long value2) {
            addCriterion("seqcharge between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotBetween(Long value1, Long value2) {
            addCriterion("seqcharge not between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subcompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subcompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subcompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subcompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subcompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subcompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subcompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subcompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subcompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subcompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subcompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subcompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subcompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subcompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("policyno is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("policyno is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("policyno =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("policyno <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("policyno >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("policyno >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("policyno <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("policyno <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("policyno like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("policyno not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("policyno in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("policyno not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("policyno between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("policyno not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("endorseno is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("endorseno is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("endorseno =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("endorseno <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("endorseno >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("endorseno >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("endorseno <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("endorseno <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("endorseno like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("endorseno not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("endorseno in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("endorseno not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("endorseno between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("endorseno not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("basecurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("basecurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("basecurrencycode =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("basecurrencycode <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("basecurrencycode >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("basecurrencycode >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("basecurrencycode <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("basecurrencycode <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("basecurrencycode like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("basecurrencycode not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("basecurrencycode in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("basecurrencycode not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("basecurrencycode between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("basecurrencycode not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("baseamount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("baseamount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("baseamount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("baseamount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("baseamount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("baseamount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIsNull() {
            addCriterion("baseaccountamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIsNotNull() {
            addCriterion("baseaccountamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountEqualTo(BigDecimal value) {
            addCriterion("baseaccountamount =", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotEqualTo(BigDecimal value) {
            addCriterion("baseaccountamount <>", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThan(BigDecimal value) {
            addCriterion("baseaccountamount >", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseaccountamount >=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThan(BigDecimal value) {
            addCriterion("baseaccountamount <", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseaccountamount <=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIn(List<BigDecimal> values) {
            addCriterion("baseaccountamount in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotIn(List<BigDecimal> values) {
            addCriterion("baseaccountamount not in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseaccountamount between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseaccountamount not between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNull() {
            addCriterion("basereceivableamount is null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNotNull() {
            addCriterion("basereceivableamount is not null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountEqualTo(BigDecimal value) {
            addCriterion("basereceivableamount =", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("basereceivableamount <>", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThan(BigDecimal value) {
            addCriterion("basereceivableamount >", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("basereceivableamount >=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThan(BigDecimal value) {
            addCriterion("basereceivableamount <", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("basereceivableamount <=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIn(List<BigDecimal> values) {
            addCriterion("basereceivableamount in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("basereceivableamount not in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basereceivableamount between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basereceivableamount not between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNull() {
            addCriterion("baserealamount is null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNotNull() {
            addCriterion("baserealamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountEqualTo(BigDecimal value) {
            addCriterion("baserealamount =", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotEqualTo(BigDecimal value) {
            addCriterion("baserealamount <>", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThan(BigDecimal value) {
            addCriterion("baserealamount >", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baserealamount >=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThan(BigDecimal value) {
            addCriterion("baserealamount <", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baserealamount <=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIn(List<BigDecimal> values) {
            addCriterion("baserealamount in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotIn(List<BigDecimal> values) {
            addCriterion("baserealamount not in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baserealamount between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baserealamount not between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNull() {
            addCriterion("invoiceamount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNotNull() {
            addCriterion("invoiceamount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountEqualTo(BigDecimal value) {
            addCriterion("invoiceamount =", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("invoiceamount <>", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("invoiceamount >", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoiceamount >=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThan(BigDecimal value) {
            addCriterion("invoiceamount <", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoiceamount <=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIn(List<BigDecimal> values) {
            addCriterion("invoiceamount in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("invoiceamount not in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoiceamount between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoiceamount not between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIsNull() {
            addCriterion("invoicepaidamount is null");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIsNotNull() {
            addCriterion("invoicepaidamount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountEqualTo(BigDecimal value) {
            addCriterion("invoicepaidamount =", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotEqualTo(BigDecimal value) {
            addCriterion("invoicepaidamount <>", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountGreaterThan(BigDecimal value) {
            addCriterion("invoicepaidamount >", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoicepaidamount >=", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountLessThan(BigDecimal value) {
            addCriterion("invoicepaidamount <", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoicepaidamount <=", value, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountIn(List<BigDecimal> values) {
            addCriterion("invoicepaidamount in", values, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotIn(List<BigDecimal> values) {
            addCriterion("invoicepaidamount not in", values, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoicepaidamount between", value1, value2, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicepaidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoicepaidamount not between", value1, value2, "invoicepaidamount");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencycode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencycode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencycode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencycode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencycode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencycode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencycode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencycode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencycode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencycode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencycode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencycode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencycode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencycode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNull() {
            addCriterion("accountamount is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("accountamount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("accountamount =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("accountamount <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("accountamount >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("accountamount <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("accountamount in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("accountamount not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount not between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIsNull() {
            addCriterion("receivableamount is null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIsNotNull() {
            addCriterion("receivableamount is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountEqualTo(BigDecimal value) {
            addCriterion("receivableamount =", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("receivableamount <>", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThan(BigDecimal value) {
            addCriterion("receivableamount >", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivableamount >=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThan(BigDecimal value) {
            addCriterion("receivableamount <", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivableamount <=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIn(List<BigDecimal> values) {
            addCriterion("receivableamount in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("receivableamount not in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivableamount between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivableamount not between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNull() {
            addCriterion("realamount is null");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNotNull() {
            addCriterion("realamount is not null");
            return (Criteria) this;
        }

        public Criteria andRealamountEqualTo(BigDecimal value) {
            addCriterion("realamount =", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotEqualTo(BigDecimal value) {
            addCriterion("realamount <>", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThan(BigDecimal value) {
            addCriterion("realamount >", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realamount >=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThan(BigDecimal value) {
            addCriterion("realamount <", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realamount <=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIn(List<BigDecimal> values) {
            addCriterion("realamount in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotIn(List<BigDecimal> values) {
            addCriterion("realamount not in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realamount between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realamount not between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNull() {
            addCriterion("agiotageamount is null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNotNull() {
            addCriterion("agiotageamount is not null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountEqualTo(BigDecimal value) {
            addCriterion("agiotageamount =", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotEqualTo(BigDecimal value) {
            addCriterion("agiotageamount <>", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThan(BigDecimal value) {
            addCriterion("agiotageamount >", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agiotageamount >=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThan(BigDecimal value) {
            addCriterion("agiotageamount <", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agiotageamount <=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIn(List<BigDecimal> values) {
            addCriterion("agiotageamount in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotIn(List<BigDecimal> values) {
            addCriterion("agiotageamount not in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agiotageamount between", value1, value2, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agiotageamount not between", value1, value2, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIsNull() {
            addCriterion("incurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIsNotNull() {
            addCriterion("incurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeEqualTo(String value) {
            addCriterion("incurrencycode =", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotEqualTo(String value) {
            addCriterion("incurrencycode <>", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeGreaterThan(String value) {
            addCriterion("incurrencycode >", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("incurrencycode >=", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLessThan(String value) {
            addCriterion("incurrencycode <", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("incurrencycode <=", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeLike(String value) {
            addCriterion("incurrencycode like", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotLike(String value) {
            addCriterion("incurrencycode not like", value, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeIn(List<String> values) {
            addCriterion("incurrencycode in", values, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotIn(List<String> values) {
            addCriterion("incurrencycode not in", values, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeBetween(String value1, String value2) {
            addCriterion("incurrencycode between", value1, value2, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andIncurrencycodeNotBetween(String value1, String value2) {
            addCriterion("incurrencycode not between", value1, value2, "incurrencycode");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNull() {
            addCriterion("businessattr is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("businessattr is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("businessattr =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("businessattr <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("businessattr >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("businessattr >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("businessattr <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("businessattr <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("businessattr like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("businessattr not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("businessattr in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("businessattr not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("businessattr between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("businessattr not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNull() {
            addCriterion("ifstart is null");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNotNull() {
            addCriterion("ifstart is not null");
            return (Criteria) this;
        }

        public Criteria andIfstartEqualTo(String value) {
            addCriterion("ifstart =", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotEqualTo(String value) {
            addCriterion("ifstart <>", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThan(String value) {
            addCriterion("ifstart >", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThanOrEqualTo(String value) {
            addCriterion("ifstart >=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThan(String value) {
            addCriterion("ifstart <", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThanOrEqualTo(String value) {
            addCriterion("ifstart <=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLike(String value) {
            addCriterion("ifstart like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotLike(String value) {
            addCriterion("ifstart not like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartIn(List<String> values) {
            addCriterion("ifstart in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotIn(List<String> values) {
            addCriterion("ifstart not in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartBetween(String value1, String value2) {
            addCriterion("ifstart between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotBetween(String value1, String value2) {
            addCriterion("ifstart not between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNull() {
            addCriterion("operatedtimes is null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNotNull() {
            addCriterion("operatedtimes is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesEqualTo(Long value) {
            addCriterion("operatedtimes =", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotEqualTo(Long value) {
            addCriterion("operatedtimes <>", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThan(Long value) {
            addCriterion("operatedtimes >", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThanOrEqualTo(Long value) {
            addCriterion("operatedtimes >=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThan(Long value) {
            addCriterion("operatedtimes <", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThanOrEqualTo(Long value) {
            addCriterion("operatedtimes <=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIn(List<Long> values) {
            addCriterion("operatedtimes in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotIn(List<Long> values) {
            addCriterion("operatedtimes not in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesBetween(Long value1, Long value2) {
            addCriterion("operatedtimes between", value1, value2, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotBetween(Long value1, Long value2) {
            addCriterion("operatedtimes not between", value1, value2, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("unitcode is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("unitcode is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("unitcode =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("unitcode <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("unitcode >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unitcode >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("unitcode <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("unitcode <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("unitcode like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("unitcode not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("unitcode in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("unitcode not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("unitcode between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("unitcode not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("signdate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterion("signdate =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterion("signdate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterion("signdate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("signdate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterion("signdate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterion("signdate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterion("signdate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterion("signdate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterion("signdate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterion("signdate not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("inputdate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("inputdate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("inputdate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("inputdate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("inputdate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("inputdate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("inputdate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("inputdate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("inputdate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("inputdate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("inputdate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("inputdate not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("opdate is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("opdate is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterion("opdate =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterion("opdate <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterion("opdate >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("opdate >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterion("opdate <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterion("opdate <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterion("opdate in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterion("opdate not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterion("opdate between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterion("opdate not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("customercode is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("customercode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("customercode =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("customercode <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("customercode >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("customercode >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("customercode <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("customercode <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("customercode like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("customercode not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("customercode in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("customercode not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("customercode between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("customercode not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNull() {
            addCriterion("transactorcode is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("transactorcode is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("transactorcode =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("transactorcode <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("transactorcode >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("transactorcode >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("transactorcode <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("transactorcode <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("transactorcode like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("transactorcode not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("transactorcode in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("transactorcode not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("transactorcode between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("transactorcode not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNull() {
            addCriterion("underwritercode is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNotNull() {
            addCriterion("underwritercode is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeEqualTo(String value) {
            addCriterion("underwritercode =", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotEqualTo(String value) {
            addCriterion("underwritercode <>", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThan(String value) {
            addCriterion("underwritercode >", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThanOrEqualTo(String value) {
            addCriterion("underwritercode >=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThan(String value) {
            addCriterion("underwritercode <", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThanOrEqualTo(String value) {
            addCriterion("underwritercode <=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLike(String value) {
            addCriterion("underwritercode like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotLike(String value) {
            addCriterion("underwritercode not like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIn(List<String> values) {
            addCriterion("underwritercode in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotIn(List<String> values) {
            addCriterion("underwritercode not in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeBetween(String value1, String value2) {
            addCriterion("underwritercode between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotBetween(String value1, String value2) {
            addCriterion("underwritercode not between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("businesschannel is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("businesschannel is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("businesschannel =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("businesschannel <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("businesschannel >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("businesschannel >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("businesschannel <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("businesschannel <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("businesschannel like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("businesschannel not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("businesschannel in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("businesschannel not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("businesschannel between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("businesschannel not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("classescode is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("classescode is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("classescode =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("classescode <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("classescode >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("classescode >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("classescode <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("classescode <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("classescode like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("classescode not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("classescode in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("classescode not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("classescode between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("classescode not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNull() {
            addCriterion("risktype is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("risktype is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("risktype =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("risktype <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("risktype >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("risktype >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("risktype <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("risktype <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("risktype like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("risktype not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("risktype in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("risktype not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("risktype between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("risktype not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNull() {
            addCriterion("classeskind is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNotNull() {
            addCriterion("classeskind is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindEqualTo(String value) {
            addCriterion("classeskind =", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotEqualTo(String value) {
            addCriterion("classeskind <>", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThan(String value) {
            addCriterion("classeskind >", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("classeskind >=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThan(String value) {
            addCriterion("classeskind <", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThanOrEqualTo(String value) {
            addCriterion("classeskind <=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLike(String value) {
            addCriterion("classeskind like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotLike(String value) {
            addCriterion("classeskind not like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindIn(List<String> values) {
            addCriterion("classeskind in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotIn(List<String> values) {
            addCriterion("classeskind not in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindBetween(String value1, String value2) {
            addCriterion("classeskind between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotBetween(String value1, String value2) {
            addCriterion("classeskind not between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("agentcode is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("agentcode is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("agentcode =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("agentcode <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("agentcode >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("agentcode >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("agentcode <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("agentcode <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("agentcode like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("agentcode not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("agentcode in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("agentcode not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("agentcode between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("agentcode not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIsNull() {
            addCriterion("endorsetype is null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIsNotNull() {
            addCriterion("endorsetype is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeEqualTo(String value) {
            addCriterion("endorsetype =", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotEqualTo(String value) {
            addCriterion("endorsetype <>", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThan(String value) {
            addCriterion("endorsetype >", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("endorsetype >=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThan(String value) {
            addCriterion("endorsetype <", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThanOrEqualTo(String value) {
            addCriterion("endorsetype <=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLike(String value) {
            addCriterion("endorsetype like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotLike(String value) {
            addCriterion("endorsetype not like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIn(List<String> values) {
            addCriterion("endorsetype in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotIn(List<String> values) {
            addCriterion("endorsetype not in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeBetween(String value1, String value2) {
            addCriterion("endorsetype between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotBetween(String value1, String value2) {
            addCriterion("endorsetype not between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNull() {
            addCriterion("hasplan is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("hasplan is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("hasplan =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("hasplan <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("hasplan >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("hasplan >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("hasplan <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("hasplan <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("hasplan like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("hasplan not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("hasplan in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("hasplan not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("hasplan between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("hasplan not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIsNull() {
            addCriterion("iscoinsurance is null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIsNotNull() {
            addCriterion("iscoinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceEqualTo(String value) {
            addCriterion("iscoinsurance =", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotEqualTo(String value) {
            addCriterion("iscoinsurance <>", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThan(String value) {
            addCriterion("iscoinsurance >", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("iscoinsurance >=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThan(String value) {
            addCriterion("iscoinsurance <", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThanOrEqualTo(String value) {
            addCriterion("iscoinsurance <=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLike(String value) {
            addCriterion("iscoinsurance like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotLike(String value) {
            addCriterion("iscoinsurance not like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIn(List<String> values) {
            addCriterion("iscoinsurance in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotIn(List<String> values) {
            addCriterion("iscoinsurance not in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceBetween(String value1, String value2) {
            addCriterion("iscoinsurance between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotBetween(String value1, String value2) {
            addCriterion("iscoinsurance not between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIsNull() {
            addCriterion("masterprotocolno is null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIsNotNull() {
            addCriterion("masterprotocolno is not null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoEqualTo(String value) {
            addCriterion("masterprotocolno =", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotEqualTo(String value) {
            addCriterion("masterprotocolno <>", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThan(String value) {
            addCriterion("masterprotocolno >", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThanOrEqualTo(String value) {
            addCriterion("masterprotocolno >=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThan(String value) {
            addCriterion("masterprotocolno <", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThanOrEqualTo(String value) {
            addCriterion("masterprotocolno <=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLike(String value) {
            addCriterion("masterprotocolno like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotLike(String value) {
            addCriterion("masterprotocolno not like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIn(List<String> values) {
            addCriterion("masterprotocolno in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotIn(List<String> values) {
            addCriterion("masterprotocolno not in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoBetween(String value1, String value2) {
            addCriterion("masterprotocolno between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotBetween(String value1, String value2) {
            addCriterion("masterprotocolno not between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIsNull() {
            addCriterion("cardpolicyno is null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIsNotNull() {
            addCriterion("cardpolicyno is not null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoEqualTo(String value) {
            addCriterion("cardpolicyno =", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotEqualTo(String value) {
            addCriterion("cardpolicyno <>", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThan(String value) {
            addCriterion("cardpolicyno >", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("cardpolicyno >=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThan(String value) {
            addCriterion("cardpolicyno <", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThanOrEqualTo(String value) {
            addCriterion("cardpolicyno <=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLike(String value) {
            addCriterion("cardpolicyno like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotLike(String value) {
            addCriterion("cardpolicyno not like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIn(List<String> values) {
            addCriterion("cardpolicyno in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotIn(List<String> values) {
            addCriterion("cardpolicyno not in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoBetween(String value1, String value2) {
            addCriterion("cardpolicyno between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotBetween(String value1, String value2) {
            addCriterion("cardpolicyno not between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNull() {
            addCriterion("totalprotocoltno is null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNotNull() {
            addCriterion("totalprotocoltno is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoEqualTo(String value) {
            addCriterion("totalprotocoltno =", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotEqualTo(String value) {
            addCriterion("totalprotocoltno <>", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThan(String value) {
            addCriterion("totalprotocoltno >", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThanOrEqualTo(String value) {
            addCriterion("totalprotocoltno >=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThan(String value) {
            addCriterion("totalprotocoltno <", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThanOrEqualTo(String value) {
            addCriterion("totalprotocoltno <=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLike(String value) {
            addCriterion("totalprotocoltno like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotLike(String value) {
            addCriterion("totalprotocoltno not like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIn(List<String> values) {
            addCriterion("totalprotocoltno in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotIn(List<String> values) {
            addCriterion("totalprotocoltno not in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoBetween(String value1, String value2) {
            addCriterion("totalprotocoltno between", value1, value2, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotBetween(String value1, String value2) {
            addCriterion("totalprotocoltno not between", value1, value2, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("lastopdate is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("lastopdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("lastopdate =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("lastopdate <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("lastopdate >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdate >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("lastopdate <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("lastopdate <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("lastopdate in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("lastopdate not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("lastopdate between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("lastopdate not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("hibernateversion is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("hibernateversion is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("hibernateversion =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("hibernateversion <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("hibernateversion >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("hibernateversion >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("hibernateversion <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("hibernateversion <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("hibernateversion in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("hibernateversion not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("hibernateversion between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("hibernateversion not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHandovernoIsNull() {
            addCriterion("handoverno is null");
            return (Criteria) this;
        }

        public Criteria andHandovernoIsNotNull() {
            addCriterion("handoverno is not null");
            return (Criteria) this;
        }

        public Criteria andHandovernoEqualTo(String value) {
            addCriterion("handoverno =", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotEqualTo(String value) {
            addCriterion("handoverno <>", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThan(String value) {
            addCriterion("handoverno >", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThanOrEqualTo(String value) {
            addCriterion("handoverno >=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThan(String value) {
            addCriterion("handoverno <", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThanOrEqualTo(String value) {
            addCriterion("handoverno <=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLike(String value) {
            addCriterion("handoverno like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotLike(String value) {
            addCriterion("handoverno not like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoIn(List<String> values) {
            addCriterion("handoverno in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotIn(List<String> values) {
            addCriterion("handoverno not in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoBetween(String value1, String value2) {
            addCriterion("handoverno between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotBetween(String value1, String value2) {
            addCriterion("handoverno not between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNull() {
            addCriterion("vehicleno is null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNotNull() {
            addCriterion("vehicleno is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoEqualTo(String value) {
            addCriterion("vehicleno =", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotEqualTo(String value) {
            addCriterion("vehicleno <>", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThan(String value) {
            addCriterion("vehicleno >", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleno >=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThan(String value) {
            addCriterion("vehicleno <", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThanOrEqualTo(String value) {
            addCriterion("vehicleno <=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLike(String value) {
            addCriterion("vehicleno like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotLike(String value) {
            addCriterion("vehicleno not like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIn(List<String> values) {
            addCriterion("vehicleno in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotIn(List<String> values) {
            addCriterion("vehicleno not in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoBetween(String value1, String value2) {
            addCriterion("vehicleno between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotBetween(String value1, String value2) {
            addCriterion("vehicleno not between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andCanpayIsNull() {
            addCriterion("canpay is null");
            return (Criteria) this;
        }

        public Criteria andCanpayIsNotNull() {
            addCriterion("canpay is not null");
            return (Criteria) this;
        }

        public Criteria andCanpayEqualTo(String value) {
            addCriterion("canpay =", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotEqualTo(String value) {
            addCriterion("canpay <>", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayGreaterThan(String value) {
            addCriterion("canpay >", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayGreaterThanOrEqualTo(String value) {
            addCriterion("canpay >=", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLessThan(String value) {
            addCriterion("canpay <", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLessThanOrEqualTo(String value) {
            addCriterion("canpay <=", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayLike(String value) {
            addCriterion("canpay like", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotLike(String value) {
            addCriterion("canpay not like", value, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayIn(List<String> values) {
            addCriterion("canpay in", values, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotIn(List<String> values) {
            addCriterion("canpay not in", values, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayBetween(String value1, String value2) {
            addCriterion("canpay between", value1, value2, "canpay");
            return (Criteria) this;
        }

        public Criteria andCanpayNotBetween(String value1, String value2) {
            addCriterion("canpay not between", value1, value2, "canpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("datatype is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("datatype is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("datatype =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("datatype <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("datatype >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("datatype >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("datatype <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("datatype <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("datatype like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("datatype not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("datatype in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("datatype not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("datatype between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("datatype not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIsNull() {
            addCriterion("policystatus is null");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIsNotNull() {
            addCriterion("policystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystatusEqualTo(String value) {
            addCriterion("policystatus =", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotEqualTo(String value) {
            addCriterion("policystatus <>", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusGreaterThan(String value) {
            addCriterion("policystatus >", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusGreaterThanOrEqualTo(String value) {
            addCriterion("policystatus >=", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLessThan(String value) {
            addCriterion("policystatus <", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLessThanOrEqualTo(String value) {
            addCriterion("policystatus <=", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusLike(String value) {
            addCriterion("policystatus like", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotLike(String value) {
            addCriterion("policystatus not like", value, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusIn(List<String> values) {
            addCriterion("policystatus in", values, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotIn(List<String> values) {
            addCriterion("policystatus not in", values, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusBetween(String value1, String value2) {
            addCriterion("policystatus between", value1, value2, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicystatusNotBetween(String value1, String value2) {
            addCriterion("policystatus not between", value1, value2, "policystatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIsNull() {
            addCriterion("policyattr is null");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIsNotNull() {
            addCriterion("policyattr is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyattrEqualTo(String value) {
            addCriterion("policyattr =", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotEqualTo(String value) {
            addCriterion("policyattr <>", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrGreaterThan(String value) {
            addCriterion("policyattr >", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrGreaterThanOrEqualTo(String value) {
            addCriterion("policyattr >=", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLessThan(String value) {
            addCriterion("policyattr <", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLessThanOrEqualTo(String value) {
            addCriterion("policyattr <=", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrLike(String value) {
            addCriterion("policyattr like", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotLike(String value) {
            addCriterion("policyattr not like", value, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrIn(List<String> values) {
            addCriterion("policyattr in", values, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotIn(List<String> values) {
            addCriterion("policyattr not in", values, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrBetween(String value1, String value2) {
            addCriterion("policyattr between", value1, value2, "policyattr");
            return (Criteria) this;
        }

        public Criteria andPolicyattrNotBetween(String value1, String value2) {
            addCriterion("policyattr not between", value1, value2, "policyattr");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNull() {
            addCriterion("insurencecount is null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNotNull() {
            addCriterion("insurencecount is not null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountEqualTo(Long value) {
            addCriterion("insurencecount =", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotEqualTo(Long value) {
            addCriterion("insurencecount <>", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThan(Long value) {
            addCriterion("insurencecount >", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThanOrEqualTo(Long value) {
            addCriterion("insurencecount >=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThan(Long value) {
            addCriterion("insurencecount <", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThanOrEqualTo(Long value) {
            addCriterion("insurencecount <=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIn(List<Long> values) {
            addCriterion("insurencecount in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotIn(List<Long> values) {
            addCriterion("insurencecount not in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountBetween(Long value1, Long value2) {
            addCriterion("insurencecount between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotBetween(Long value1, Long value2) {
            addCriterion("insurencecount not between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNull() {
            addCriterion("summaryno is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("summaryno is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("summaryno =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("summaryno <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("summaryno >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("summaryno >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("summaryno <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("summaryno <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("summaryno like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("summaryno not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("summaryno in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("summaryno not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("summaryno between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("summaryno not between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andTaxstateIsNull() {
            addCriterion("taxstate is null");
            return (Criteria) this;
        }

        public Criteria andTaxstateIsNotNull() {
            addCriterion("taxstate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxstateEqualTo(String value) {
            addCriterion("taxstate =", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotEqualTo(String value) {
            addCriterion("taxstate <>", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateGreaterThan(String value) {
            addCriterion("taxstate >", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateGreaterThanOrEqualTo(String value) {
            addCriterion("taxstate >=", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLessThan(String value) {
            addCriterion("taxstate <", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLessThanOrEqualTo(String value) {
            addCriterion("taxstate <=", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateLike(String value) {
            addCriterion("taxstate like", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotLike(String value) {
            addCriterion("taxstate not like", value, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateIn(List<String> values) {
            addCriterion("taxstate in", values, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotIn(List<String> values) {
            addCriterion("taxstate not in", values, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateBetween(String value1, String value2) {
            addCriterion("taxstate between", value1, value2, "taxstate");
            return (Criteria) this;
        }

        public Criteria andTaxstateNotBetween(String value1, String value2) {
            addCriterion("taxstate not between", value1, value2, "taxstate");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIsNull() {
            addCriterion("customernamesimple is null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIsNotNull() {
            addCriterion("customernamesimple is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleEqualTo(String value) {
            addCriterion("customernamesimple =", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotEqualTo(String value) {
            addCriterion("customernamesimple <>", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleGreaterThan(String value) {
            addCriterion("customernamesimple >", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleGreaterThanOrEqualTo(String value) {
            addCriterion("customernamesimple >=", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLessThan(String value) {
            addCriterion("customernamesimple <", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLessThanOrEqualTo(String value) {
            addCriterion("customernamesimple <=", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleLike(String value) {
            addCriterion("customernamesimple like", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotLike(String value) {
            addCriterion("customernamesimple not like", value, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleIn(List<String> values) {
            addCriterion("customernamesimple in", values, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotIn(List<String> values) {
            addCriterion("customernamesimple not in", values, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleBetween(String value1, String value2) {
            addCriterion("customernamesimple between", value1, value2, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andCustomernamesimpleNotBetween(String value1, String value2) {
            addCriterion("customernamesimple not between", value1, value2, "customernamesimple");
            return (Criteria) this;
        }

        public Criteria andPolandinvIsNull() {
            addCriterion("polandinv is null");
            return (Criteria) this;
        }

        public Criteria andPolandinvIsNotNull() {
            addCriterion("polandinv is not null");
            return (Criteria) this;
        }

        public Criteria andPolandinvEqualTo(String value) {
            addCriterion("polandinv =", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotEqualTo(String value) {
            addCriterion("polandinv <>", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThan(String value) {
            addCriterion("polandinv >", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThanOrEqualTo(String value) {
            addCriterion("polandinv >=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThan(String value) {
            addCriterion("polandinv <", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThanOrEqualTo(String value) {
            addCriterion("polandinv <=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLike(String value) {
            addCriterion("polandinv like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotLike(String value) {
            addCriterion("polandinv not like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvIn(List<String> values) {
            addCriterion("polandinv in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotIn(List<String> values) {
            addCriterion("polandinv not in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvBetween(String value1, String value2) {
            addCriterion("polandinv between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotBetween(String value1, String value2) {
            addCriterion("polandinv not between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("modifydesc is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("modifydesc is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("modifydesc =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("modifydesc <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("modifydesc >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("modifydesc >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("modifydesc <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("modifydesc <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("modifydesc like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("modifydesc not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("modifydesc in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("modifydesc not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("modifydesc between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("modifydesc not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNull() {
            addCriterion("usedtaxamount is null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNotNull() {
            addCriterion("usedtaxamount is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount =", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount <>", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThan(BigDecimal value) {
            addCriterion("usedtaxamount >", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount >=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThan(BigDecimal value) {
            addCriterion("usedtaxamount <", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount <=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIn(List<BigDecimal> values) {
            addCriterion("usedtaxamount in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotIn(List<BigDecimal> values) {
            addCriterion("usedtaxamount not in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedtaxamount between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedtaxamount not between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("vehkind is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("vehkind is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("vehkind =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("vehkind <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("vehkind >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("vehkind >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("vehkind <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("vehkind <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("vehkind like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("vehkind not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("vehkind in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("vehkind not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("vehkind between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("vehkind not between", value1, value2, "vehkind");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_policy2_td
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
     * @Table : mm_temp_policy2_td
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