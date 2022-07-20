package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvoicetotalpolicyTdExample {
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
    public MmInvoicetotalpolicyTdExample() {
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
     * @Table : mm_invoicetotalpolicy_td
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

        public Criteria andPrintablenoIsNull() {
            addCriterion("PRINTABLENO is null");
            return (Criteria) this;
        }

        public Criteria andPrintablenoIsNotNull() {
            addCriterion("PRINTABLENO is not null");
            return (Criteria) this;
        }

        public Criteria andPrintablenoEqualTo(Long value) {
            addCriterion("PRINTABLENO =", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotEqualTo(Long value) {
            addCriterion("PRINTABLENO <>", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoGreaterThan(Long value) {
            addCriterion("PRINTABLENO >", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoGreaterThanOrEqualTo(Long value) {
            addCriterion("PRINTABLENO >=", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoLessThan(Long value) {
            addCriterion("PRINTABLENO <", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoLessThanOrEqualTo(Long value) {
            addCriterion("PRINTABLENO <=", value, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoIn(List<Long> values) {
            addCriterion("PRINTABLENO in", values, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotIn(List<Long> values) {
            addCriterion("PRINTABLENO not in", values, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoBetween(Long value1, Long value2) {
            addCriterion("PRINTABLENO between", value1, value2, "printableno");
            return (Criteria) this;
        }

        public Criteria andPrintablenoNotBetween(Long value1, Long value2) {
            addCriterion("PRINTABLENO not between", value1, value2, "printableno");
            return (Criteria) this;
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

        public Criteria andTaxessamountIsNull() {
            addCriterion("TAXESSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxessamountIsNotNull() {
            addCriterion("TAXESSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxessamountEqualTo(BigDecimal value) {
            addCriterion("TAXESSAMOUNT =", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESSAMOUNT <>", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESSAMOUNT >", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESSAMOUNT >=", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountLessThan(BigDecimal value) {
            addCriterion("TAXESSAMOUNT <", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESSAMOUNT <=", value, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountIn(List<BigDecimal> values) {
            addCriterion("TAXESSAMOUNT in", values, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESSAMOUNT not in", values, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESSAMOUNT between", value1, value2, "taxessamount");
            return (Criteria) this;
        }

        public Criteria andTaxessamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESSAMOUNT not between", value1, value2, "taxessamount");
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

        public Criteria andInvoicetaxessamountIsNull() {
            addCriterion("INVOICETAXESSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountIsNotNull() {
            addCriterion("INVOICETAXESSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT =", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT <>", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT >", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT >=", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountLessThan(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT <", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXESSAMOUNT <=", value, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountIn(List<BigDecimal> values) {
            addCriterion("INVOICETAXESSAMOUNT in", values, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICETAXESSAMOUNT not in", values, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETAXESSAMOUNT between", value1, value2, "invoicetaxessamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxessamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETAXESSAMOUNT not between", value1, value2, "invoicetaxessamount");
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

        public Criteria andPolicystartamountIsNull() {
            addCriterion("POLICYSTARTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountIsNotNull() {
            addCriterion("POLICYSTARTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT =", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountNotEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT <>", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountGreaterThan(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT >", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT >=", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountLessThan(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT <", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTAMOUNT <=", value, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountIn(List<BigDecimal> values) {
            addCriterion("POLICYSTARTAMOUNT in", values, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountNotIn(List<BigDecimal> values) {
            addCriterion("POLICYSTARTAMOUNT not in", values, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POLICYSTARTAMOUNT between", value1, value2, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystartamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POLICYSTARTAMOUNT not between", value1, value2, "policystartamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountIsNull() {
            addCriterion("POLICYSTARTTAXESSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountIsNotNull() {
            addCriterion("POLICYSTARTTAXESSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT =", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountNotEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT <>", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountGreaterThan(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT >", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT >=", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountLessThan(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT <", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POLICYSTARTTAXESSAMOUNT <=", value, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountIn(List<BigDecimal> values) {
            addCriterion("POLICYSTARTTAXESSAMOUNT in", values, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountNotIn(List<BigDecimal> values) {
            addCriterion("POLICYSTARTTAXESSAMOUNT not in", values, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POLICYSTARTTAXESSAMOUNT between", value1, value2, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andPolicystarttaxessamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POLICYSTARTTAXESSAMOUNT not between", value1, value2, "policystarttaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountIsNull() {
            addCriterion("WRITEOFFINVINCEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountIsNotNull() {
            addCriterion("WRITEOFFINVINCEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT =", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountNotEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT <>", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountGreaterThan(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT >", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT >=", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountLessThan(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT <", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCEAMOUNT <=", value, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountIn(List<BigDecimal> values) {
            addCriterion("WRITEOFFINVINCEAMOUNT in", values, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountNotIn(List<BigDecimal> values) {
            addCriterion("WRITEOFFINVINCEAMOUNT not in", values, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WRITEOFFINVINCEAMOUNT between", value1, value2, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvinceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WRITEOFFINVINCEAMOUNT not between", value1, value2, "writeoffinvinceamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountIsNull() {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountIsNotNull() {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT =", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountNotEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT <>", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountGreaterThan(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT >", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT >=", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountLessThan(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT <", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT <=", value, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountIn(List<BigDecimal> values) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT in", values, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountNotIn(List<BigDecimal> values) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT not in", values, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT between", value1, value2, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffinvincetaxessamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WRITEOFFINVINCETAXESSAMOUNT not between", value1, value2, "writeoffinvincetaxessamount");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusIsNull() {
            addCriterion("WRITEOFFSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusIsNotNull() {
            addCriterion("WRITEOFFSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusEqualTo(String value) {
            addCriterion("WRITEOFFSTATUS =", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusNotEqualTo(String value) {
            addCriterion("WRITEOFFSTATUS <>", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusGreaterThan(String value) {
            addCriterion("WRITEOFFSTATUS >", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusGreaterThanOrEqualTo(String value) {
            addCriterion("WRITEOFFSTATUS >=", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusLessThan(String value) {
            addCriterion("WRITEOFFSTATUS <", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusLessThanOrEqualTo(String value) {
            addCriterion("WRITEOFFSTATUS <=", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusLike(String value) {
            addCriterion("WRITEOFFSTATUS like", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusNotLike(String value) {
            addCriterion("WRITEOFFSTATUS not like", value, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusIn(List<String> values) {
            addCriterion("WRITEOFFSTATUS in", values, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusNotIn(List<String> values) {
            addCriterion("WRITEOFFSTATUS not in", values, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusBetween(String value1, String value2) {
            addCriterion("WRITEOFFSTATUS between", value1, value2, "writeoffstatus");
            return (Criteria) this;
        }

        public Criteria andWriteoffstatusNotBetween(String value1, String value2) {
            addCriterion("WRITEOFFSTATUS not between", value1, value2, "writeoffstatus");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invoicetotalpolicy_td
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
     * @Table : mm_invoicetotalpolicy_td
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