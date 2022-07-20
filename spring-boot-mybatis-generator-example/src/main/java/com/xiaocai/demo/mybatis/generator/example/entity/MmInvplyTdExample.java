package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvplyTdExample {
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
    public MmInvplyTdExample() {
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
     * @Table : mm_invply_td
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

        public Criteria andSeqinvplyIsNull() {
            addCriterion("SEQINVPLY is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNotNull() {
            addCriterion("SEQINVPLY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyEqualTo(Long value) {
            addCriterion("SEQINVPLY =", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotEqualTo(Long value) {
            addCriterion("SEQINVPLY <>", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThan(Long value) {
            addCriterion("SEQINVPLY >", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVPLY >=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThan(Long value) {
            addCriterion("SEQINVPLY <", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVPLY <=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIn(List<Long> values) {
            addCriterion("SEQINVPLY in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotIn(List<Long> values) {
            addCriterion("SEQINVPLY not in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyBetween(Long value1, Long value2) {
            addCriterion("SEQINVPLY between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVPLY not between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIsNull() {
            addCriterion("SEQINVOICE is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIsNotNull() {
            addCriterion("SEQINVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceEqualTo(Long value) {
            addCriterion("SEQINVOICE =", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotEqualTo(Long value) {
            addCriterion("SEQINVOICE <>", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThan(Long value) {
            addCriterion("SEQINVOICE >", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE >=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThan(Long value) {
            addCriterion("SEQINVOICE <", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE <=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIn(List<Long> values) {
            addCriterion("SEQINVOICE in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotIn(List<Long> values) {
            addCriterion("SEQINVOICE not in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE not between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("INVOICENO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("INVOICENO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("INVOICENO =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("INVOICENO <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("INVOICENO >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICENO >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("INVOICENO <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("INVOICENO <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("INVOICENO like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("INVOICENO not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("INVOICENO in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("INVOICENO not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("INVOICENO between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("INVOICENO not between", value1, value2, "invoiceno");
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

        public Criteria andIncomeamountIsNull() {
            addCriterion("INCOMEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIncomeamountIsNotNull() {
            addCriterion("INCOMEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeamountEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT =", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <>", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountGreaterThan(BigDecimal value) {
            addCriterion("INCOMEAMOUNT >", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT >=", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountLessThan(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <=", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountIn(List<BigDecimal> values) {
            addCriterion("INCOMEAMOUNT in", values, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotIn(List<BigDecimal> values) {
            addCriterion("INCOMEAMOUNT not in", values, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEAMOUNT between", value1, value2, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEAMOUNT not between", value1, value2, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("OPCODE =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("OPCODE <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("OPCODE >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("OPCODE <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("OPCODE <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("OPCODE like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("OPCODE not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("OPCODE in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("OPCODE not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("OPCODE between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("OPCODE not between", value1, value2, "opcode");
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

        public Criteria andPrintablenoIsNull() {
            addCriterion("PRINTABLENO is null");
            return (Criteria) this;
        }

        public Criteria andPrintablenoIsNotNull() {
            addCriterion("PRINTABLENO is not null");
            return (Criteria) this;
        }

        public Criteria andPrintablenoEqualTo(BigDecimal value) {
            addCriterion("PRINTABLENO =", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotEqualTo(BigDecimal value) {
            addCriterion("PRINTABLENO <>", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoGreaterThan(BigDecimal value) {
            addCriterion("PRINTABLENO >", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINTABLENO >=", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoLessThan(BigDecimal value) {
            addCriterion("PRINTABLENO <", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINTABLENO <=", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoIn(List<BigDecimal> values) {
            addCriterion("PRINTABLENO in", values, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotIn(List<BigDecimal> values) {
            addCriterion("PRINTABLENO not in", values, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINTABLENO between", value1, value2, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINTABLENO not between", value1, value2, "printableno");
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

        public Criteria andInvoicecurrencyIsNull() {
            addCriterion("INVOICECURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyIsNotNull() {
            addCriterion("INVOICECURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyEqualTo(String value) {
            addCriterion("INVOICECURRENCY =", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyNotEqualTo(String value) {
            addCriterion("INVOICECURRENCY <>", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyGreaterThan(String value) {
            addCriterion("INVOICECURRENCY >", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICECURRENCY >=", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyLessThan(String value) {
            addCriterion("INVOICECURRENCY <", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyLessThanOrEqualTo(String value) {
            addCriterion("INVOICECURRENCY <=", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyLike(String value) {
            addCriterion("INVOICECURRENCY like", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyNotLike(String value) {
            addCriterion("INVOICECURRENCY not like", value, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyIn(List<String> values) {
            addCriterion("INVOICECURRENCY in", values, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyNotIn(List<String> values) {
            addCriterion("INVOICECURRENCY not in", values, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyBetween(String value1, String value2) {
            addCriterion("INVOICECURRENCY between", value1, value2, "invoicecurrency");
            return (Criteria) this;
        }

        public Criteria andInvoicecurrencyNotBetween(String value1, String value2) {
            addCriterion("INVOICECURRENCY not between", value1, value2, "invoicecurrency");
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

        public Criteria andInvincomeamountIsNull() {
            addCriterion("INVINCOMEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountIsNotNull() {
            addCriterion("INVINCOMEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountEqualTo(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT =", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountNotEqualTo(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT <>", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountGreaterThan(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT >", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT >=", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountLessThan(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT <", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVINCOMEAMOUNT <=", value, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountIn(List<BigDecimal> values) {
            addCriterion("INVINCOMEAMOUNT in", values, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountNotIn(List<BigDecimal> values) {
            addCriterion("INVINCOMEAMOUNT not in", values, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVINCOMEAMOUNT between", value1, value2, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvincomeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVINCOMEAMOUNT not between", value1, value2, "invincomeamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountIsNull() {
            addCriterion("invoicetaxesamount is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountIsNotNull() {
            addCriterion("invoicetaxesamount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountEqualTo(BigDecimal value) {
            addCriterion("invoicetaxesamount =", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("invoicetaxesamount <>", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountGreaterThan(BigDecimal value) {
            addCriterion("invoicetaxesamount >", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoicetaxesamount >=", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountLessThan(BigDecimal value) {
            addCriterion("invoicetaxesamount <", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoicetaxesamount <=", value, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountIn(List<BigDecimal> values) {
            addCriterion("invoicetaxesamount in", values, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("invoicetaxesamount not in", values, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoicetaxesamount between", value1, value2, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoicetaxesamount not between", value1, value2, "invoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountIsNull() {
            addCriterion("cnyinvoicetaxesamount is null");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountIsNotNull() {
            addCriterion("cnyinvoicetaxesamount is not null");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountEqualTo(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount =", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount <>", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountGreaterThan(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount >", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount >=", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountLessThan(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount <", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cnyinvoicetaxesamount <=", value, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountIn(List<BigDecimal> values) {
            addCriterion("cnyinvoicetaxesamount in", values, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("cnyinvoicetaxesamount not in", values, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cnyinvoicetaxesamount between", value1, value2, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }

        public Criteria andCnyinvoicetaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cnyinvoicetaxesamount not between", value1, value2, "cnyinvoicetaxesamount");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invply_td
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
     * @Table : mm_invply_td
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