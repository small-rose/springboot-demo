package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxoutbackTdExample {
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
    public MmTaxoutbackTdExample() {
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
     * @Table : mm_taxoutback_td
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

        public Criteria andTaxidIsNull() {
            addCriterion("TAXID is null");
            return (Criteria) this;
        }

        public Criteria andTaxidIsNotNull() {
            addCriterion("TAXID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxidEqualTo(Long value) {
            addCriterion("TAXID =", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotEqualTo(Long value) {
            addCriterion("TAXID <>", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThan(Long value) {
            addCriterion("TAXID >", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThanOrEqualTo(Long value) {
            addCriterion("TAXID >=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThan(Long value) {
            addCriterion("TAXID <", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThanOrEqualTo(Long value) {
            addCriterion("TAXID <=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidIn(List<Long> values) {
            addCriterion("TAXID in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotIn(List<Long> values) {
            addCriterion("TAXID not in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidBetween(Long value1, Long value2) {
            addCriterion("TAXID between", value1, value2, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotBetween(Long value1, Long value2) {
            addCriterion("TAXID not between", value1, value2, "taxid");
            return (Criteria) this;
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

        public Criteria andTaxstatusIsNull() {
            addCriterion("TAXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaxstatusIsNotNull() {
            addCriterion("TAXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxstatusEqualTo(String value) {
            addCriterion("TAXSTATUS =", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusNotEqualTo(String value) {
            addCriterion("TAXSTATUS <>", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusGreaterThan(String value) {
            addCriterion("TAXSTATUS >", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TAXSTATUS >=", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusLessThan(String value) {
            addCriterion("TAXSTATUS <", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusLessThanOrEqualTo(String value) {
            addCriterion("TAXSTATUS <=", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusLike(String value) {
            addCriterion("TAXSTATUS like", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusNotLike(String value) {
            addCriterion("TAXSTATUS not like", value, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusIn(List<String> values) {
            addCriterion("TAXSTATUS in", values, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusNotIn(List<String> values) {
            addCriterion("TAXSTATUS not in", values, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusBetween(String value1, String value2) {
            addCriterion("TAXSTATUS between", value1, value2, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andTaxstatusNotBetween(String value1, String value2) {
            addCriterion("TAXSTATUS not between", value1, value2, "taxstatus");
            return (Criteria) this;
        }

        public Criteria andJylshIsNull() {
            addCriterion("JYLSH is null");
            return (Criteria) this;
        }

        public Criteria andJylshIsNotNull() {
            addCriterion("JYLSH is not null");
            return (Criteria) this;
        }

        public Criteria andJylshEqualTo(String value) {
            addCriterion("JYLSH =", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotEqualTo(String value) {
            addCriterion("JYLSH <>", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshGreaterThan(String value) {
            addCriterion("JYLSH >", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshGreaterThanOrEqualTo(String value) {
            addCriterion("JYLSH >=", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLessThan(String value) {
            addCriterion("JYLSH <", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLessThanOrEqualTo(String value) {
            addCriterion("JYLSH <=", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLike(String value) {
            addCriterion("JYLSH like", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotLike(String value) {
            addCriterion("JYLSH not like", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshIn(List<String> values) {
            addCriterion("JYLSH in", values, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotIn(List<String> values) {
            addCriterion("JYLSH not in", values, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshBetween(String value1, String value2) {
            addCriterion("JYLSH between", value1, value2, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotBetween(String value1, String value2) {
            addCriterion("JYLSH not between", value1, value2, "jylsh");
            return (Criteria) this;
        }

        public Criteria andNetnoIsNull() {
            addCriterion("NETNO is null");
            return (Criteria) this;
        }

        public Criteria andNetnoIsNotNull() {
            addCriterion("NETNO is not null");
            return (Criteria) this;
        }

        public Criteria andNetnoEqualTo(String value) {
            addCriterion("NETNO =", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoNotEqualTo(String value) {
            addCriterion("NETNO <>", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoGreaterThan(String value) {
            addCriterion("NETNO >", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoGreaterThanOrEqualTo(String value) {
            addCriterion("NETNO >=", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoLessThan(String value) {
            addCriterion("NETNO <", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoLessThanOrEqualTo(String value) {
            addCriterion("NETNO <=", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoLike(String value) {
            addCriterion("NETNO like", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoNotLike(String value) {
            addCriterion("NETNO not like", value, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoIn(List<String> values) {
            addCriterion("NETNO in", values, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoNotIn(List<String> values) {
            addCriterion("NETNO not in", values, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoBetween(String value1, String value2) {
            addCriterion("NETNO between", value1, value2, "netno");
            return (Criteria) this;
        }

        public Criteria andNetnoNotBetween(String value1, String value2) {
            addCriterion("NETNO not between", value1, value2, "netno");
            return (Criteria) this;
        }

        public Criteria andBackjylshIsNull() {
            addCriterion("BACKJYLSH is null");
            return (Criteria) this;
        }

        public Criteria andBackjylshIsNotNull() {
            addCriterion("BACKJYLSH is not null");
            return (Criteria) this;
        }

        public Criteria andBackjylshEqualTo(String value) {
            addCriterion("BACKJYLSH =", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshNotEqualTo(String value) {
            addCriterion("BACKJYLSH <>", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshGreaterThan(String value) {
            addCriterion("BACKJYLSH >", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshGreaterThanOrEqualTo(String value) {
            addCriterion("BACKJYLSH >=", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshLessThan(String value) {
            addCriterion("BACKJYLSH <", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshLessThanOrEqualTo(String value) {
            addCriterion("BACKJYLSH <=", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshLike(String value) {
            addCriterion("BACKJYLSH like", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshNotLike(String value) {
            addCriterion("BACKJYLSH not like", value, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshIn(List<String> values) {
            addCriterion("BACKJYLSH in", values, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshNotIn(List<String> values) {
            addCriterion("BACKJYLSH not in", values, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshBetween(String value1, String value2) {
            addCriterion("BACKJYLSH between", value1, value2, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andBackjylshNotBetween(String value1, String value2) {
            addCriterion("BACKJYLSH not between", value1, value2, "backjylsh");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNull() {
            addCriterion("TYPENO is null");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNotNull() {
            addCriterion("TYPENO is not null");
            return (Criteria) this;
        }

        public Criteria andTypenoEqualTo(String value) {
            addCriterion("TYPENO =", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotEqualTo(String value) {
            addCriterion("TYPENO <>", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThan(String value) {
            addCriterion("TYPENO >", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENO >=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThan(String value) {
            addCriterion("TYPENO <", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThanOrEqualTo(String value) {
            addCriterion("TYPENO <=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLike(String value) {
            addCriterion("TYPENO like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotLike(String value) {
            addCriterion("TYPENO not like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoIn(List<String> values) {
            addCriterion("TYPENO in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotIn(List<String> values) {
            addCriterion("TYPENO not in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoBetween(String value1, String value2) {
            addCriterion("TYPENO between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotBetween(String value1, String value2) {
            addCriterion("TYPENO not between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andFhmIsNull() {
            addCriterion("FHM is null");
            return (Criteria) this;
        }

        public Criteria andFhmIsNotNull() {
            addCriterion("FHM is not null");
            return (Criteria) this;
        }

        public Criteria andFhmEqualTo(String value) {
            addCriterion("FHM =", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmNotEqualTo(String value) {
            addCriterion("FHM <>", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmGreaterThan(String value) {
            addCriterion("FHM >", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmGreaterThanOrEqualTo(String value) {
            addCriterion("FHM >=", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmLessThan(String value) {
            addCriterion("FHM <", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmLessThanOrEqualTo(String value) {
            addCriterion("FHM <=", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmLike(String value) {
            addCriterion("FHM like", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmNotLike(String value) {
            addCriterion("FHM not like", value, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmIn(List<String> values) {
            addCriterion("FHM in", values, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmNotIn(List<String> values) {
            addCriterion("FHM not in", values, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmBetween(String value1, String value2) {
            addCriterion("FHM between", value1, value2, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhmNotBetween(String value1, String value2) {
            addCriterion("FHM not between", value1, value2, "fhm");
            return (Criteria) this;
        }

        public Criteria andFhxxIsNull() {
            addCriterion("FHXX is null");
            return (Criteria) this;
        }

        public Criteria andFhxxIsNotNull() {
            addCriterion("FHXX is not null");
            return (Criteria) this;
        }

        public Criteria andFhxxEqualTo(String value) {
            addCriterion("FHXX =", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxNotEqualTo(String value) {
            addCriterion("FHXX <>", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxGreaterThan(String value) {
            addCriterion("FHXX >", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxGreaterThanOrEqualTo(String value) {
            addCriterion("FHXX >=", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxLessThan(String value) {
            addCriterion("FHXX <", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxLessThanOrEqualTo(String value) {
            addCriterion("FHXX <=", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxLike(String value) {
            addCriterion("FHXX like", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxNotLike(String value) {
            addCriterion("FHXX not like", value, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxIn(List<String> values) {
            addCriterion("FHXX in", values, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxNotIn(List<String> values) {
            addCriterion("FHXX not in", values, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxBetween(String value1, String value2) {
            addCriterion("FHXX between", value1, value2, "fhxx");
            return (Criteria) this;
        }

        public Criteria andFhxxNotBetween(String value1, String value2) {
            addCriterion("FHXX not between", value1, value2, "fhxx");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateIsNull() {
            addCriterion("TAXPAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateIsNotNull() {
            addCriterion("TAXPAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateEqualTo(Date value) {
            addCriterion("TAXPAYDATE =", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateNotEqualTo(Date value) {
            addCriterion("TAXPAYDATE <>", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateGreaterThan(Date value) {
            addCriterion("TAXPAYDATE >", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("TAXPAYDATE >=", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateLessThan(Date value) {
            addCriterion("TAXPAYDATE <", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateLessThanOrEqualTo(Date value) {
            addCriterion("TAXPAYDATE <=", value, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateIn(List<Date> values) {
            addCriterion("TAXPAYDATE in", values, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateNotIn(List<Date> values) {
            addCriterion("TAXPAYDATE not in", values, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateBetween(Date value1, Date value2) {
            addCriterion("TAXPAYDATE between", value1, value2, "taxpaydate");
            return (Criteria) this;
        }

        public Criteria andTaxpaydateNotBetween(Date value1, Date value2) {
            addCriterion("TAXPAYDATE not between", value1, value2, "taxpaydate");
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

        public Criteria andConfirmdateIsNull() {
            addCriterion("CONFIRMDATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmdateIsNotNull() {
            addCriterion("CONFIRMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmdateEqualTo(Date value) {
            addCriterion("CONFIRMDATE =", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotEqualTo(Date value) {
            addCriterion("CONFIRMDATE <>", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateGreaterThan(Date value) {
            addCriterion("CONFIRMDATE >", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE >=", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateLessThan(Date value) {
            addCriterion("CONFIRMDATE <", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE <=", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateIn(List<Date> values) {
            addCriterion("CONFIRMDATE in", values, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotIn(List<Date> values) {
            addCriterion("CONFIRMDATE not in", values, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE between", value1, value2, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE not between", value1, value2, "confirmdate");
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

        public Criteria andTaxpayableIsNull() {
            addCriterion("TAXPAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNotNull() {
            addCriterion("TAXPAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE =", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <>", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThan(BigDecimal value) {
            addCriterion("TAXPAYABLE >", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE >=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThan(BigDecimal value) {
            addCriterion("TAXPAYABLE <", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE not in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE not between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNull() {
            addCriterion("BACKTAX is null");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNotNull() {
            addCriterion("BACKTAX is not null");
            return (Criteria) this;
        }

        public Criteria andBacktaxEqualTo(BigDecimal value) {
            addCriterion("BACKTAX =", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <>", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThan(BigDecimal value) {
            addCriterion("BACKTAX >", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX >=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThan(BigDecimal value) {
            addCriterion("BACKTAX <", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxIn(List<BigDecimal> values) {
            addCriterion("BACKTAX in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotIn(List<BigDecimal> values) {
            addCriterion("BACKTAX not in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX not between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNull() {
            addCriterion("LATEFEE is null");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNotNull() {
            addCriterion("LATEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andLatefeeEqualTo(BigDecimal value) {
            addCriterion("LATEFEE =", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotEqualTo(BigDecimal value) {
            addCriterion("LATEFEE <>", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThan(BigDecimal value) {
            addCriterion("LATEFEE >", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEFEE >=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThan(BigDecimal value) {
            addCriterion("LATEFEE <", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEFEE <=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeIn(List<BigDecimal> values) {
            addCriterion("LATEFEE in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotIn(List<BigDecimal> values) {
            addCriterion("LATEFEE not in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEFEE between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEFEE not between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNull() {
            addCriterion("TAXCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNotNull() {
            addCriterion("TAXCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoEqualTo(String value) {
            addCriterion("TAXCERTNO =", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotEqualTo(String value) {
            addCriterion("TAXCERTNO <>", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThan(String value) {
            addCriterion("TAXCERTNO >", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXCERTNO >=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThan(String value) {
            addCriterion("TAXCERTNO <", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThanOrEqualTo(String value) {
            addCriterion("TAXCERTNO <=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLike(String value) {
            addCriterion("TAXCERTNO like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotLike(String value) {
            addCriterion("TAXCERTNO not like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIn(List<String> values) {
            addCriterion("TAXCERTNO in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotIn(List<String> values) {
            addCriterion("TAXCERTNO not in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoBetween(String value1, String value2) {
            addCriterion("TAXCERTNO between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotBetween(String value1, String value2) {
            addCriterion("TAXCERTNO not between", value1, value2, "taxcertno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxoutback_td
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
     * @Table : mm_taxoutback_td
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