package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmInvoiceSplitTdExample {
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
    public MmInvoiceSplitTdExample() {
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
     * @Table : mm_invoice_split_td
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

        public Criteria andHandidIsNull() {
            addCriterion("HANDID is null");
            return (Criteria) this;
        }

        public Criteria andHandidIsNotNull() {
            addCriterion("HANDID is not null");
            return (Criteria) this;
        }

        public Criteria andHandidEqualTo(String value) {
            addCriterion("HANDID =", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidNotEqualTo(String value) {
            addCriterion("HANDID <>", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidGreaterThan(String value) {
            addCriterion("HANDID >", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidGreaterThanOrEqualTo(String value) {
            addCriterion("HANDID >=", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidLessThan(String value) {
            addCriterion("HANDID <", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidLessThanOrEqualTo(String value) {
            addCriterion("HANDID <=", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidLike(String value) {
            addCriterion("HANDID like", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidNotLike(String value) {
            addCriterion("HANDID not like", value, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidIn(List<String> values) {
            addCriterion("HANDID in", values, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidNotIn(List<String> values) {
            addCriterion("HANDID not in", values, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidBetween(String value1, String value2) {
            addCriterion("HANDID between", value1, value2, "handid");
            return (Criteria) this;
        }

        public Criteria andHandidNotBetween(String value1, String value2) {
            addCriterion("HANDID not between", value1, value2, "handid");
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

        public Criteria andOpcountIsNull() {
            addCriterion("OPCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOpcountIsNotNull() {
            addCriterion("OPCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOpcountEqualTo(BigDecimal value) {
            addCriterion("OPCOUNT =", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotEqualTo(BigDecimal value) {
            addCriterion("OPCOUNT <>", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountGreaterThan(BigDecimal value) {
            addCriterion("OPCOUNT >", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPCOUNT >=", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountLessThan(BigDecimal value) {
            addCriterion("OPCOUNT <", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPCOUNT <=", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountIn(List<BigDecimal> values) {
            addCriterion("OPCOUNT in", values, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotIn(List<BigDecimal> values) {
            addCriterion("OPCOUNT not in", values, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPCOUNT between", value1, value2, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPCOUNT not between", value1, value2, "opcount");
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

        public Criteria andUnderwriternameIsNull() {
            addCriterion("UNDERWRITERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameIsNotNull() {
            addCriterion("UNDERWRITERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameEqualTo(String value) {
            addCriterion("UNDERWRITERNAME =", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameNotEqualTo(String value) {
            addCriterion("UNDERWRITERNAME <>", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameGreaterThan(String value) {
            addCriterion("UNDERWRITERNAME >", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameGreaterThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERNAME >=", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameLessThan(String value) {
            addCriterion("UNDERWRITERNAME <", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameLessThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERNAME <=", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameLike(String value) {
            addCriterion("UNDERWRITERNAME like", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameNotLike(String value) {
            addCriterion("UNDERWRITERNAME not like", value, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameIn(List<String> values) {
            addCriterion("UNDERWRITERNAME in", values, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameNotIn(List<String> values) {
            addCriterion("UNDERWRITERNAME not in", values, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameBetween(String value1, String value2) {
            addCriterion("UNDERWRITERNAME between", value1, value2, "underwritername");
            return (Criteria) this;
        }

        public Criteria andUnderwriternameNotBetween(String value1, String value2) {
            addCriterion("UNDERWRITERNAME not between", value1, value2, "underwritername");
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

        public Criteria andDatedateIsNull() {
            addCriterion("DATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDatedateIsNotNull() {
            addCriterion("DATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatedateEqualTo(Date value) {
            addCriterion("DATEDATE =", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotEqualTo(Date value) {
            addCriterion("DATEDATE <>", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateGreaterThan(Date value) {
            addCriterion("DATEDATE >", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATEDATE >=", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateLessThan(Date value) {
            addCriterion("DATEDATE <", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateLessThanOrEqualTo(Date value) {
            addCriterion("DATEDATE <=", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateIn(List<Date> values) {
            addCriterion("DATEDATE in", values, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotIn(List<Date> values) {
            addCriterion("DATEDATE not in", values, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateBetween(Date value1, Date value2) {
            addCriterion("DATEDATE between", value1, value2, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotBetween(Date value1, Date value2) {
            addCriterion("DATEDATE not between", value1, value2, "datedate");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeIsNull() {
            addCriterion("BORROWERCODE is null");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeIsNotNull() {
            addCriterion("BORROWERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeEqualTo(String value) {
            addCriterion("BORROWERCODE =", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeNotEqualTo(String value) {
            addCriterion("BORROWERCODE <>", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeGreaterThan(String value) {
            addCriterion("BORROWERCODE >", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWERCODE >=", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeLessThan(String value) {
            addCriterion("BORROWERCODE <", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeLessThanOrEqualTo(String value) {
            addCriterion("BORROWERCODE <=", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeLike(String value) {
            addCriterion("BORROWERCODE like", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeNotLike(String value) {
            addCriterion("BORROWERCODE not like", value, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeIn(List<String> values) {
            addCriterion("BORROWERCODE in", values, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeNotIn(List<String> values) {
            addCriterion("BORROWERCODE not in", values, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeBetween(String value1, String value2) {
            addCriterion("BORROWERCODE between", value1, value2, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andBorrowercodeNotBetween(String value1, String value2) {
            addCriterion("BORROWERCODE not between", value1, value2, "borrowercode");
            return (Criteria) this;
        }

        public Criteria andPlantermIsNull() {
            addCriterion("PLANTERM is null");
            return (Criteria) this;
        }

        public Criteria andPlantermIsNotNull() {
            addCriterion("PLANTERM is not null");
            return (Criteria) this;
        }

        public Criteria andPlantermEqualTo(BigDecimal value) {
            addCriterion("PLANTERM =", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermNotEqualTo(BigDecimal value) {
            addCriterion("PLANTERM <>", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermGreaterThan(BigDecimal value) {
            addCriterion("PLANTERM >", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANTERM >=", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermLessThan(BigDecimal value) {
            addCriterion("PLANTERM <", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANTERM <=", value, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermIn(List<BigDecimal> values) {
            addCriterion("PLANTERM in", values, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermNotIn(List<BigDecimal> values) {
            addCriterion("PLANTERM not in", values, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANTERM between", value1, value2, "planterm");
            return (Criteria) this;
        }

        public Criteria andPlantermNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANTERM not between", value1, value2, "planterm");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeIsNull() {
            addCriterion("RATIFIERCODE is null");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeIsNotNull() {
            addCriterion("RATIFIERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeEqualTo(String value) {
            addCriterion("RATIFIERCODE =", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeNotEqualTo(String value) {
            addCriterion("RATIFIERCODE <>", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeGreaterThan(String value) {
            addCriterion("RATIFIERCODE >", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeGreaterThanOrEqualTo(String value) {
            addCriterion("RATIFIERCODE >=", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeLessThan(String value) {
            addCriterion("RATIFIERCODE <", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeLessThanOrEqualTo(String value) {
            addCriterion("RATIFIERCODE <=", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeLike(String value) {
            addCriterion("RATIFIERCODE like", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeNotLike(String value) {
            addCriterion("RATIFIERCODE not like", value, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeIn(List<String> values) {
            addCriterion("RATIFIERCODE in", values, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeNotIn(List<String> values) {
            addCriterion("RATIFIERCODE not in", values, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeBetween(String value1, String value2) {
            addCriterion("RATIFIERCODE between", value1, value2, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifiercodeNotBetween(String value1, String value2) {
            addCriterion("RATIFIERCODE not between", value1, value2, "ratifiercode");
            return (Criteria) this;
        }

        public Criteria andRatifydateIsNull() {
            addCriterion("RATIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andRatifydateIsNotNull() {
            addCriterion("RATIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRatifydateEqualTo(Date value) {
            addCriterion("RATIFYDATE =", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateNotEqualTo(Date value) {
            addCriterion("RATIFYDATE <>", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateGreaterThan(Date value) {
            addCriterion("RATIFYDATE >", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("RATIFYDATE >=", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateLessThan(Date value) {
            addCriterion("RATIFYDATE <", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateLessThanOrEqualTo(Date value) {
            addCriterion("RATIFYDATE <=", value, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateIn(List<Date> values) {
            addCriterion("RATIFYDATE in", values, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateNotIn(List<Date> values) {
            addCriterion("RATIFYDATE not in", values, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateBetween(Date value1, Date value2) {
            addCriterion("RATIFYDATE between", value1, value2, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andRatifydateNotBetween(Date value1, Date value2) {
            addCriterion("RATIFYDATE not between", value1, value2, "ratifydate");
            return (Criteria) this;
        }

        public Criteria andPrintercodeIsNull() {
            addCriterion("PRINTERCODE is null");
            return (Criteria) this;
        }

        public Criteria andPrintercodeIsNotNull() {
            addCriterion("PRINTERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintercodeEqualTo(String value) {
            addCriterion("PRINTERCODE =", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeNotEqualTo(String value) {
            addCriterion("PRINTERCODE <>", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeGreaterThan(String value) {
            addCriterion("PRINTERCODE >", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTERCODE >=", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeLessThan(String value) {
            addCriterion("PRINTERCODE <", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeLessThanOrEqualTo(String value) {
            addCriterion("PRINTERCODE <=", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeLike(String value) {
            addCriterion("PRINTERCODE like", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeNotLike(String value) {
            addCriterion("PRINTERCODE not like", value, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeIn(List<String> values) {
            addCriterion("PRINTERCODE in", values, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeNotIn(List<String> values) {
            addCriterion("PRINTERCODE not in", values, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeBetween(String value1, String value2) {
            addCriterion("PRINTERCODE between", value1, value2, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintercodeNotBetween(String value1, String value2) {
            addCriterion("PRINTERCODE not between", value1, value2, "printercode");
            return (Criteria) this;
        }

        public Criteria andPrintdateIsNull() {
            addCriterion("PRINTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPrintdateIsNotNull() {
            addCriterion("PRINTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintdateEqualTo(Date value) {
            addCriterion("PRINTDATE =", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotEqualTo(Date value) {
            addCriterion("PRINTDATE <>", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateGreaterThan(Date value) {
            addCriterion("PRINTDATE >", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRINTDATE >=", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateLessThan(Date value) {
            addCriterion("PRINTDATE <", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateLessThanOrEqualTo(Date value) {
            addCriterion("PRINTDATE <=", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateIn(List<Date> values) {
            addCriterion("PRINTDATE in", values, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotIn(List<Date> values) {
            addCriterion("PRINTDATE not in", values, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateBetween(Date value1, Date value2) {
            addCriterion("PRINTDATE between", value1, value2, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotBetween(Date value1, Date value2) {
            addCriterion("PRINTDATE not between", value1, value2, "printdate");
            return (Criteria) this;
        }

        public Criteria andIfprintedIsNull() {
            addCriterion("IFPRINTED is null");
            return (Criteria) this;
        }

        public Criteria andIfprintedIsNotNull() {
            addCriterion("IFPRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andIfprintedEqualTo(String value) {
            addCriterion("IFPRINTED =", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotEqualTo(String value) {
            addCriterion("IFPRINTED <>", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedGreaterThan(String value) {
            addCriterion("IFPRINTED >", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedGreaterThanOrEqualTo(String value) {
            addCriterion("IFPRINTED >=", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLessThan(String value) {
            addCriterion("IFPRINTED <", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLessThanOrEqualTo(String value) {
            addCriterion("IFPRINTED <=", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLike(String value) {
            addCriterion("IFPRINTED like", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotLike(String value) {
            addCriterion("IFPRINTED not like", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedIn(List<String> values) {
            addCriterion("IFPRINTED in", values, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotIn(List<String> values) {
            addCriterion("IFPRINTED not in", values, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedBetween(String value1, String value2) {
            addCriterion("IFPRINTED between", value1, value2, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotBetween(String value1, String value2) {
            addCriterion("IFPRINTED not between", value1, value2, "ifprinted");
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

        public Criteria andInvoicetypeidIsNull() {
            addCriterion("INVOICETYPEID is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidIsNotNull() {
            addCriterion("INVOICETYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidEqualTo(BigDecimal value) {
            addCriterion("INVOICETYPEID =", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidNotEqualTo(BigDecimal value) {
            addCriterion("INVOICETYPEID <>", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidGreaterThan(BigDecimal value) {
            addCriterion("INVOICETYPEID >", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETYPEID >=", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidLessThan(BigDecimal value) {
            addCriterion("INVOICETYPEID <", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETYPEID <=", value, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidIn(List<BigDecimal> values) {
            addCriterion("INVOICETYPEID in", values, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidNotIn(List<BigDecimal> values) {
            addCriterion("INVOICETYPEID not in", values, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETYPEID between", value1, value2, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETYPEID not between", value1, value2, "invoicetypeid");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("ISCHECK is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("ISCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(String value) {
            addCriterion("ISCHECK =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(String value) {
            addCriterion("ISCHECK <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(String value) {
            addCriterion("ISCHECK >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(String value) {
            addCriterion("ISCHECK >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(String value) {
            addCriterion("ISCHECK <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(String value) {
            addCriterion("ISCHECK <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLike(String value) {
            addCriterion("ISCHECK like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotLike(String value) {
            addCriterion("ISCHECK not like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<String> values) {
            addCriterion("ISCHECK in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<String> values) {
            addCriterion("ISCHECK not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(String value1, String value2) {
            addCriterion("ISCHECK between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(String value1, String value2) {
            addCriterion("ISCHECK not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andInvIdIsNull() {
            addCriterion("INV_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvIdIsNotNull() {
            addCriterion("INV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvIdEqualTo(String value) {
            addCriterion("INV_ID =", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotEqualTo(String value) {
            addCriterion("INV_ID <>", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThan(String value) {
            addCriterion("INV_ID >", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_ID >=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThan(String value) {
            addCriterion("INV_ID <", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThanOrEqualTo(String value) {
            addCriterion("INV_ID <=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLike(String value) {
            addCriterion("INV_ID like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotLike(String value) {
            addCriterion("INV_ID not like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdIn(List<String> values) {
            addCriterion("INV_ID in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotIn(List<String> values) {
            addCriterion("INV_ID not in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdBetween(String value1, String value2) {
            addCriterion("INV_ID between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotBetween(String value1, String value2) {
            addCriterion("INV_ID not between", value1, value2, "invId");
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

        public Criteria andLastopcodeIsNull() {
            addCriterion("LASTOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNotNull() {
            addCriterion("LASTOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeEqualTo(String value) {
            addCriterion("LASTOPCODE =", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotEqualTo(String value) {
            addCriterion("LASTOPCODE <>", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThan(String value) {
            addCriterion("LASTOPCODE >", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE >=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThan(String value) {
            addCriterion("LASTOPCODE <", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE <=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLike(String value) {
            addCriterion("LASTOPCODE like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotLike(String value) {
            addCriterion("LASTOPCODE not like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIn(List<String> values) {
            addCriterion("LASTOPCODE in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotIn(List<String> values) {
            addCriterion("LASTOPCODE not in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeBetween(String value1, String value2) {
            addCriterion("LASTOPCODE between", value1, value2, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotBetween(String value1, String value2) {
            addCriterion("LASTOPCODE not between", value1, value2, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceIsNull() {
            addCriterion("COSEQINVOICE is null");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceIsNotNull() {
            addCriterion("COSEQINVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceEqualTo(BigDecimal value) {
            addCriterion("COSEQINVOICE =", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceNotEqualTo(BigDecimal value) {
            addCriterion("COSEQINVOICE <>", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceGreaterThan(BigDecimal value) {
            addCriterion("COSEQINVOICE >", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COSEQINVOICE >=", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceLessThan(BigDecimal value) {
            addCriterion("COSEQINVOICE <", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COSEQINVOICE <=", value, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceIn(List<BigDecimal> values) {
            addCriterion("COSEQINVOICE in", values, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceNotIn(List<BigDecimal> values) {
            addCriterion("COSEQINVOICE not in", values, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSEQINVOICE between", value1, value2, "coseqinvoice");
            return (Criteria) this;
        }

        public Criteria andCoseqinvoiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSEQINVOICE not between", value1, value2, "coseqinvoice");
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

        public Criteria andSeqprintIsNull() {
            addCriterion("SEQPRINT is null");
            return (Criteria) this;
        }

        public Criteria andSeqprintIsNotNull() {
            addCriterion("SEQPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andSeqprintEqualTo(BigDecimal value) {
            addCriterion("SEQPRINT =", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintNotEqualTo(BigDecimal value) {
            addCriterion("SEQPRINT <>", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintGreaterThan(BigDecimal value) {
            addCriterion("SEQPRINT >", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQPRINT >=", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintLessThan(BigDecimal value) {
            addCriterion("SEQPRINT <", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQPRINT <=", value, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintIn(List<BigDecimal> values) {
            addCriterion("SEQPRINT in", values, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintNotIn(List<BigDecimal> values) {
            addCriterion("SEQPRINT not in", values, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQPRINT between", value1, value2, "seqprint");
            return (Criteria) this;
        }

        public Criteria andSeqprintNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQPRINT not between", value1, value2, "seqprint");
            return (Criteria) this;
        }

        public Criteria andPrintdeptIsNull() {
            addCriterion("PRINTDEPT is null");
            return (Criteria) this;
        }

        public Criteria andPrintdeptIsNotNull() {
            addCriterion("PRINTDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPrintdeptEqualTo(String value) {
            addCriterion("PRINTDEPT =", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptNotEqualTo(String value) {
            addCriterion("PRINTDEPT <>", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptGreaterThan(String value) {
            addCriterion("PRINTDEPT >", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTDEPT >=", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptLessThan(String value) {
            addCriterion("PRINTDEPT <", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptLessThanOrEqualTo(String value) {
            addCriterion("PRINTDEPT <=", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptLike(String value) {
            addCriterion("PRINTDEPT like", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptNotLike(String value) {
            addCriterion("PRINTDEPT not like", value, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptIn(List<String> values) {
            addCriterion("PRINTDEPT in", values, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptNotIn(List<String> values) {
            addCriterion("PRINTDEPT not in", values, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptBetween(String value1, String value2) {
            addCriterion("PRINTDEPT between", value1, value2, "printdept");
            return (Criteria) this;
        }

        public Criteria andPrintdeptNotBetween(String value1, String value2) {
            addCriterion("PRINTDEPT not between", value1, value2, "printdept");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SOURCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SOURCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("SOURCETYPE =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("SOURCETYPE <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("SOURCETYPE >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("SOURCETYPE <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("SOURCETYPE like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("SOURCETYPE not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("SOURCETYPE in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("SOURCETYPE not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("SOURCETYPE between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("SOURCETYPE not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoIsNull() {
            addCriterion("GENINVOICENO is null");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoIsNotNull() {
            addCriterion("GENINVOICENO is not null");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoEqualTo(String value) {
            addCriterion("GENINVOICENO =", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoNotEqualTo(String value) {
            addCriterion("GENINVOICENO <>", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoGreaterThan(String value) {
            addCriterion("GENINVOICENO >", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("GENINVOICENO >=", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoLessThan(String value) {
            addCriterion("GENINVOICENO <", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoLessThanOrEqualTo(String value) {
            addCriterion("GENINVOICENO <=", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoLike(String value) {
            addCriterion("GENINVOICENO like", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoNotLike(String value) {
            addCriterion("GENINVOICENO not like", value, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoIn(List<String> values) {
            addCriterion("GENINVOICENO in", values, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoNotIn(List<String> values) {
            addCriterion("GENINVOICENO not in", values, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoBetween(String value1, String value2) {
            addCriterion("GENINVOICENO between", value1, value2, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicenoNotBetween(String value1, String value2) {
            addCriterion("GENINVOICENO not between", value1, value2, "geninvoiceno");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeIsNull() {
            addCriterion("GENINVOICECODE is null");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeIsNotNull() {
            addCriterion("GENINVOICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeEqualTo(String value) {
            addCriterion("GENINVOICECODE =", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeNotEqualTo(String value) {
            addCriterion("GENINVOICECODE <>", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeGreaterThan(String value) {
            addCriterion("GENINVOICECODE >", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("GENINVOICECODE >=", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeLessThan(String value) {
            addCriterion("GENINVOICECODE <", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeLessThanOrEqualTo(String value) {
            addCriterion("GENINVOICECODE <=", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeLike(String value) {
            addCriterion("GENINVOICECODE like", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeNotLike(String value) {
            addCriterion("GENINVOICECODE not like", value, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeIn(List<String> values) {
            addCriterion("GENINVOICECODE in", values, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeNotIn(List<String> values) {
            addCriterion("GENINVOICECODE not in", values, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeBetween(String value1, String value2) {
            addCriterion("GENINVOICECODE between", value1, value2, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andGeninvoicecodeNotBetween(String value1, String value2) {
            addCriterion("GENINVOICECODE not between", value1, value2, "geninvoicecode");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNull() {
            addCriterion("CUSTOMERTEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNotNull() {
            addCriterion("CUSTOMERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertelEqualTo(String value) {
            addCriterion("CUSTOMERTEL =", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotEqualTo(String value) {
            addCriterion("CUSTOMERTEL <>", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThan(String value) {
            addCriterion("CUSTOMERTEL >", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTEL >=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThan(String value) {
            addCriterion("CUSTOMERTEL <", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTEL <=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLike(String value) {
            addCriterion("CUSTOMERTEL like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotLike(String value) {
            addCriterion("CUSTOMERTEL not like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelIn(List<String> values) {
            addCriterion("CUSTOMERTEL in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotIn(List<String> values) {
            addCriterion("CUSTOMERTEL not in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelBetween(String value1, String value2) {
            addCriterion("CUSTOMERTEL between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTEL not between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andCredittypeIsNull() {
            addCriterion("CREDITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCredittypeIsNotNull() {
            addCriterion("CREDITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCredittypeEqualTo(String value) {
            addCriterion("CREDITTYPE =", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeNotEqualTo(String value) {
            addCriterion("CREDITTYPE <>", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeGreaterThan(String value) {
            addCriterion("CREDITTYPE >", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITTYPE >=", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeLessThan(String value) {
            addCriterion("CREDITTYPE <", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeLessThanOrEqualTo(String value) {
            addCriterion("CREDITTYPE <=", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeLike(String value) {
            addCriterion("CREDITTYPE like", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeNotLike(String value) {
            addCriterion("CREDITTYPE not like", value, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeIn(List<String> values) {
            addCriterion("CREDITTYPE in", values, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeNotIn(List<String> values) {
            addCriterion("CREDITTYPE not in", values, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeBetween(String value1, String value2) {
            addCriterion("CREDITTYPE between", value1, value2, "credittype");
            return (Criteria) this;
        }

        public Criteria andCredittypeNotBetween(String value1, String value2) {
            addCriterion("CREDITTYPE not between", value1, value2, "credittype");
            return (Criteria) this;
        }

        public Criteria andCreditnoIsNull() {
            addCriterion("CREDITNO is null");
            return (Criteria) this;
        }

        public Criteria andCreditnoIsNotNull() {
            addCriterion("CREDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andCreditnoEqualTo(String value) {
            addCriterion("CREDITNO =", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotEqualTo(String value) {
            addCriterion("CREDITNO <>", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoGreaterThan(String value) {
            addCriterion("CREDITNO >", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITNO >=", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLessThan(String value) {
            addCriterion("CREDITNO <", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLessThanOrEqualTo(String value) {
            addCriterion("CREDITNO <=", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLike(String value) {
            addCriterion("CREDITNO like", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotLike(String value) {
            addCriterion("CREDITNO not like", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoIn(List<String> values) {
            addCriterion("CREDITNO in", values, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotIn(List<String> values) {
            addCriterion("CREDITNO not in", values, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoBetween(String value1, String value2) {
            addCriterion("CREDITNO between", value1, value2, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotBetween(String value1, String value2) {
            addCriterion("CREDITNO not between", value1, value2, "creditno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoIsNull() {
            addCriterion("INVOICEBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoIsNotNull() {
            addCriterion("INVOICEBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoEqualTo(String value) {
            addCriterion("INVOICEBATCHNO =", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoNotEqualTo(String value) {
            addCriterion("INVOICEBATCHNO <>", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoGreaterThan(String value) {
            addCriterion("INVOICEBATCHNO >", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEBATCHNO >=", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoLessThan(String value) {
            addCriterion("INVOICEBATCHNO <", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoLessThanOrEqualTo(String value) {
            addCriterion("INVOICEBATCHNO <=", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoLike(String value) {
            addCriterion("INVOICEBATCHNO like", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoNotLike(String value) {
            addCriterion("INVOICEBATCHNO not like", value, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoIn(List<String> values) {
            addCriterion("INVOICEBATCHNO in", values, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoNotIn(List<String> values) {
            addCriterion("INVOICEBATCHNO not in", values, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoBetween(String value1, String value2) {
            addCriterion("INVOICEBATCHNO between", value1, value2, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andInvoicebatchnoNotBetween(String value1, String value2) {
            addCriterion("INVOICEBATCHNO not between", value1, value2, "invoicebatchno");
            return (Criteria) this;
        }

        public Criteria andPrintnameIsNull() {
            addCriterion("PRINTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPrintnameIsNotNull() {
            addCriterion("PRINTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrintnameEqualTo(String value) {
            addCriterion("PRINTNAME =", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameNotEqualTo(String value) {
            addCriterion("PRINTNAME <>", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameGreaterThan(String value) {
            addCriterion("PRINTNAME >", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTNAME >=", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameLessThan(String value) {
            addCriterion("PRINTNAME <", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameLessThanOrEqualTo(String value) {
            addCriterion("PRINTNAME <=", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameLike(String value) {
            addCriterion("PRINTNAME like", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameNotLike(String value) {
            addCriterion("PRINTNAME not like", value, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameIn(List<String> values) {
            addCriterion("PRINTNAME in", values, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameNotIn(List<String> values) {
            addCriterion("PRINTNAME not in", values, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameBetween(String value1, String value2) {
            addCriterion("PRINTNAME between", value1, value2, "printname");
            return (Criteria) this;
        }

        public Criteria andPrintnameNotBetween(String value1, String value2) {
            addCriterion("PRINTNAME not between", value1, value2, "printname");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNull() {
            addCriterion("FATHERNO is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("FATHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(BigDecimal value) {
            addCriterion("FATHERNO =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(BigDecimal value) {
            addCriterion("FATHERNO <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(BigDecimal value) {
            addCriterion("FATHERNO >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FATHERNO >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(BigDecimal value) {
            addCriterion("FATHERNO <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FATHERNO <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<BigDecimal> values) {
            addCriterion("FATHERNO in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<BigDecimal> values) {
            addCriterion("FATHERNO not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FATHERNO between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FATHERNO not between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNull() {
            addCriterion("SONNO is null");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNotNull() {
            addCriterion("SONNO is not null");
            return (Criteria) this;
        }

        public Criteria andSonnoEqualTo(BigDecimal value) {
            addCriterion("SONNO =", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotEqualTo(BigDecimal value) {
            addCriterion("SONNO <>", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThan(BigDecimal value) {
            addCriterion("SONNO >", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SONNO >=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThan(BigDecimal value) {
            addCriterion("SONNO <", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SONNO <=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoIn(List<BigDecimal> values) {
            addCriterion("SONNO in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotIn(List<BigDecimal> values) {
            addCriterion("SONNO not in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SONNO between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SONNO not between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIsNull() {
            addCriterion("SECURITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIsNotNull() {
            addCriterion("SECURITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeEqualTo(String value) {
            addCriterion("SECURITYCODE =", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotEqualTo(String value) {
            addCriterion("SECURITYCODE <>", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeGreaterThan(String value) {
            addCriterion("SECURITYCODE >", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYCODE >=", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLessThan(String value) {
            addCriterion("SECURITYCODE <", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLessThanOrEqualTo(String value) {
            addCriterion("SECURITYCODE <=", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLike(String value) {
            addCriterion("SECURITYCODE like", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotLike(String value) {
            addCriterion("SECURITYCODE not like", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIn(List<String> values) {
            addCriterion("SECURITYCODE in", values, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotIn(List<String> values) {
            addCriterion("SECURITYCODE not in", values, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeBetween(String value1, String value2) {
            addCriterion("SECURITYCODE between", value1, value2, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotBetween(String value1, String value2) {
            addCriterion("SECURITYCODE not between", value1, value2, "securitycode");
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

        public Criteria andCombnameIsNull() {
            addCriterion("COMBNAME is null");
            return (Criteria) this;
        }

        public Criteria andCombnameIsNotNull() {
            addCriterion("COMBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCombnameEqualTo(String value) {
            addCriterion("COMBNAME =", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameNotEqualTo(String value) {
            addCriterion("COMBNAME <>", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameGreaterThan(String value) {
            addCriterion("COMBNAME >", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameGreaterThanOrEqualTo(String value) {
            addCriterion("COMBNAME >=", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameLessThan(String value) {
            addCriterion("COMBNAME <", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameLessThanOrEqualTo(String value) {
            addCriterion("COMBNAME <=", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameLike(String value) {
            addCriterion("COMBNAME like", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameNotLike(String value) {
            addCriterion("COMBNAME not like", value, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameIn(List<String> values) {
            addCriterion("COMBNAME in", values, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameNotIn(List<String> values) {
            addCriterion("COMBNAME not in", values, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameBetween(String value1, String value2) {
            addCriterion("COMBNAME between", value1, value2, "combname");
            return (Criteria) this;
        }

        public Criteria andCombnameNotBetween(String value1, String value2) {
            addCriterion("COMBNAME not between", value1, value2, "combname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("AUDITSTATUS like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("AUDITSTATUS not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnIsNull() {
            addCriterion("AUDITSUGSTN is null");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnIsNotNull() {
            addCriterion("AUDITSUGSTN is not null");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnEqualTo(String value) {
            addCriterion("AUDITSUGSTN =", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnNotEqualTo(String value) {
            addCriterion("AUDITSUGSTN <>", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnGreaterThan(String value) {
            addCriterion("AUDITSUGSTN >", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSUGSTN >=", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnLessThan(String value) {
            addCriterion("AUDITSUGSTN <", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnLessThanOrEqualTo(String value) {
            addCriterion("AUDITSUGSTN <=", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnLike(String value) {
            addCriterion("AUDITSUGSTN like", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnNotLike(String value) {
            addCriterion("AUDITSUGSTN not like", value, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnIn(List<String> values) {
            addCriterion("AUDITSUGSTN in", values, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnNotIn(List<String> values) {
            addCriterion("AUDITSUGSTN not in", values, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnBetween(String value1, String value2) {
            addCriterion("AUDITSUGSTN between", value1, value2, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andAuditsugstnNotBetween(String value1, String value2) {
            addCriterion("AUDITSUGSTN not between", value1, value2, "auditsugstn");
            return (Criteria) this;
        }

        public Criteria andIsbrandIsNull() {
            addCriterion("ISBRAND is null");
            return (Criteria) this;
        }

        public Criteria andIsbrandIsNotNull() {
            addCriterion("ISBRAND is not null");
            return (Criteria) this;
        }

        public Criteria andIsbrandEqualTo(String value) {
            addCriterion("ISBRAND =", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandNotEqualTo(String value) {
            addCriterion("ISBRAND <>", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandGreaterThan(String value) {
            addCriterion("ISBRAND >", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandGreaterThanOrEqualTo(String value) {
            addCriterion("ISBRAND >=", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandLessThan(String value) {
            addCriterion("ISBRAND <", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandLessThanOrEqualTo(String value) {
            addCriterion("ISBRAND <=", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandLike(String value) {
            addCriterion("ISBRAND like", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandNotLike(String value) {
            addCriterion("ISBRAND not like", value, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandIn(List<String> values) {
            addCriterion("ISBRAND in", values, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandNotIn(List<String> values) {
            addCriterion("ISBRAND not in", values, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandBetween(String value1, String value2) {
            addCriterion("ISBRAND between", value1, value2, "isbrand");
            return (Criteria) this;
        }

        public Criteria andIsbrandNotBetween(String value1, String value2) {
            addCriterion("ISBRAND not between", value1, value2, "isbrand");
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

        public Criteria andKplxIsNull() {
            addCriterion("KPLX is null");
            return (Criteria) this;
        }

        public Criteria andKplxIsNotNull() {
            addCriterion("KPLX is not null");
            return (Criteria) this;
        }

        public Criteria andKplxEqualTo(String value) {
            addCriterion("KPLX =", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotEqualTo(String value) {
            addCriterion("KPLX <>", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxGreaterThan(String value) {
            addCriterion("KPLX >", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxGreaterThanOrEqualTo(String value) {
            addCriterion("KPLX >=", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxLessThan(String value) {
            addCriterion("KPLX <", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxLessThanOrEqualTo(String value) {
            addCriterion("KPLX <=", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxLike(String value) {
            addCriterion("KPLX like", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotLike(String value) {
            addCriterion("KPLX not like", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxIn(List<String> values) {
            addCriterion("KPLX in", values, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotIn(List<String> values) {
            addCriterion("KPLX not in", values, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxBetween(String value1, String value2) {
            addCriterion("KPLX between", value1, value2, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotBetween(String value1, String value2) {
            addCriterion("KPLX not between", value1, value2, "kplx");
            return (Criteria) this;
        }

        public Criteria andHjjeIsNull() {
            addCriterion("HJJE is null");
            return (Criteria) this;
        }

        public Criteria andHjjeIsNotNull() {
            addCriterion("HJJE is not null");
            return (Criteria) this;
        }

        public Criteria andHjjeEqualTo(BigDecimal value) {
            addCriterion("HJJE =", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeNotEqualTo(BigDecimal value) {
            addCriterion("HJJE <>", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeGreaterThan(BigDecimal value) {
            addCriterion("HJJE >", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HJJE >=", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeLessThan(BigDecimal value) {
            addCriterion("HJJE <", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HJJE <=", value, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeIn(List<BigDecimal> values) {
            addCriterion("HJJE in", values, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeNotIn(List<BigDecimal> values) {
            addCriterion("HJJE not in", values, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJJE between", value1, value2, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJJE not between", value1, value2, "hjje");
            return (Criteria) this;
        }

        public Criteria andHjseIsNull() {
            addCriterion("HJSE is null");
            return (Criteria) this;
        }

        public Criteria andHjseIsNotNull() {
            addCriterion("HJSE is not null");
            return (Criteria) this;
        }

        public Criteria andHjseEqualTo(BigDecimal value) {
            addCriterion("HJSE =", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseNotEqualTo(BigDecimal value) {
            addCriterion("HJSE <>", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseGreaterThan(BigDecimal value) {
            addCriterion("HJSE >", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HJSE >=", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseLessThan(BigDecimal value) {
            addCriterion("HJSE <", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HJSE <=", value, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseIn(List<BigDecimal> values) {
            addCriterion("HJSE in", values, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseNotIn(List<BigDecimal> values) {
            addCriterion("HJSE not in", values, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJSE between", value1, value2, "hjse");
            return (Criteria) this;
        }

        public Criteria andHjseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJSE not between", value1, value2, "hjse");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNull() {
            addCriterion("SENDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNotNull() {
            addCriterion("SENDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSendstatusEqualTo(String value) {
            addCriterion("SENDSTATUS =", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotEqualTo(String value) {
            addCriterion("SENDSTATUS <>", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThan(String value) {
            addCriterion("SENDSTATUS >", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SENDSTATUS >=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThan(String value) {
            addCriterion("SENDSTATUS <", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThanOrEqualTo(String value) {
            addCriterion("SENDSTATUS <=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLike(String value) {
            addCriterion("SENDSTATUS like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotLike(String value) {
            addCriterion("SENDSTATUS not like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusIn(List<String> values) {
            addCriterion("SENDSTATUS in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotIn(List<String> values) {
            addCriterion("SENDSTATUS not in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusBetween(String value1, String value2) {
            addCriterion("SENDSTATUS between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotBetween(String value1, String value2) {
            addCriterion("SENDSTATUS not between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNull() {
            addCriterion("RETURNCODE is null");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNotNull() {
            addCriterion("RETURNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturncodeEqualTo(String value) {
            addCriterion("RETURNCODE =", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotEqualTo(String value) {
            addCriterion("RETURNCODE <>", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThan(String value) {
            addCriterion("RETURNCODE >", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNCODE >=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThan(String value) {
            addCriterion("RETURNCODE <", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThanOrEqualTo(String value) {
            addCriterion("RETURNCODE <=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLike(String value) {
            addCriterion("RETURNCODE like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotLike(String value) {
            addCriterion("RETURNCODE not like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeIn(List<String> values) {
            addCriterion("RETURNCODE in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotIn(List<String> values) {
            addCriterion("RETURNCODE not in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeBetween(String value1, String value2) {
            addCriterion("RETURNCODE between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotBetween(String value1, String value2) {
            addCriterion("RETURNCODE not between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNull() {
            addCriterion("RETURNMSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNotNull() {
            addCriterion("RETURNMSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgEqualTo(String value) {
            addCriterion("RETURNMSG =", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotEqualTo(String value) {
            addCriterion("RETURNMSG <>", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThan(String value) {
            addCriterion("RETURNMSG >", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNMSG >=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThan(String value) {
            addCriterion("RETURNMSG <", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThanOrEqualTo(String value) {
            addCriterion("RETURNMSG <=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLike(String value) {
            addCriterion("RETURNMSG like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotLike(String value) {
            addCriterion("RETURNMSG not like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIn(List<String> values) {
            addCriterion("RETURNMSG in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotIn(List<String> values) {
            addCriterion("RETURNMSG not in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgBetween(String value1, String value2) {
            addCriterion("RETURNMSG between", value1, value2, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotBetween(String value1, String value2) {
            addCriterion("RETURNMSG not between", value1, value2, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountIsNull() {
            addCriterion("EXCLUSIVETAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountIsNotNull() {
            addCriterion("EXCLUSIVETAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT =", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <>", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountGreaterThan(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT >", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT >=", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountLessThan(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <=", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountIn(List<BigDecimal> values) {
            addCriterion("EXCLUSIVETAXAMOUNT in", values, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotIn(List<BigDecimal> values) {
            addCriterion("EXCLUSIVETAXAMOUNT not in", values, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCLUSIVETAXAMOUNT between", value1, value2, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCLUSIVETAXAMOUNT not between", value1, value2, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNull() {
            addCriterion("INVOICECODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNotNull() {
            addCriterion("INVOICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeEqualTo(String value) {
            addCriterion("INVOICECODE =", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotEqualTo(String value) {
            addCriterion("INVOICECODE <>", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThan(String value) {
            addCriterion("INVOICECODE >", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICECODE >=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThan(String value) {
            addCriterion("INVOICECODE <", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICECODE <=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLike(String value) {
            addCriterion("INVOICECODE like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotLike(String value) {
            addCriterion("INVOICECODE not like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIn(List<String> values) {
            addCriterion("INVOICECODE in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotIn(List<String> values) {
            addCriterion("INVOICECODE not in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeBetween(String value1, String value2) {
            addCriterion("INVOICECODE between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotBetween(String value1, String value2) {
            addCriterion("INVOICECODE not between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andXsdwshIsNull() {
            addCriterion("XSDWSH is null");
            return (Criteria) this;
        }

        public Criteria andXsdwshIsNotNull() {
            addCriterion("XSDWSH is not null");
            return (Criteria) this;
        }

        public Criteria andXsdwshEqualTo(String value) {
            addCriterion("XSDWSH =", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshNotEqualTo(String value) {
            addCriterion("XSDWSH <>", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshGreaterThan(String value) {
            addCriterion("XSDWSH >", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshGreaterThanOrEqualTo(String value) {
            addCriterion("XSDWSH >=", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshLessThan(String value) {
            addCriterion("XSDWSH <", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshLessThanOrEqualTo(String value) {
            addCriterion("XSDWSH <=", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshLike(String value) {
            addCriterion("XSDWSH like", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshNotLike(String value) {
            addCriterion("XSDWSH not like", value, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshIn(List<String> values) {
            addCriterion("XSDWSH in", values, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshNotIn(List<String> values) {
            addCriterion("XSDWSH not in", values, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshBetween(String value1, String value2) {
            addCriterion("XSDWSH between", value1, value2, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andXsdwshNotBetween(String value1, String value2) {
            addCriterion("XSDWSH not between", value1, value2, "xsdwsh");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andYfpdmIsNull() {
            addCriterion("YFPDM is null");
            return (Criteria) this;
        }

        public Criteria andYfpdmIsNotNull() {
            addCriterion("YFPDM is not null");
            return (Criteria) this;
        }

        public Criteria andYfpdmEqualTo(String value) {
            addCriterion("YFPDM =", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmNotEqualTo(String value) {
            addCriterion("YFPDM <>", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmGreaterThan(String value) {
            addCriterion("YFPDM >", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmGreaterThanOrEqualTo(String value) {
            addCriterion("YFPDM >=", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmLessThan(String value) {
            addCriterion("YFPDM <", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmLessThanOrEqualTo(String value) {
            addCriterion("YFPDM <=", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmLike(String value) {
            addCriterion("YFPDM like", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmNotLike(String value) {
            addCriterion("YFPDM not like", value, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmIn(List<String> values) {
            addCriterion("YFPDM in", values, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmNotIn(List<String> values) {
            addCriterion("YFPDM not in", values, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmBetween(String value1, String value2) {
            addCriterion("YFPDM between", value1, value2, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfpdmNotBetween(String value1, String value2) {
            addCriterion("YFPDM not between", value1, value2, "yfpdm");
            return (Criteria) this;
        }

        public Criteria andYfphmIsNull() {
            addCriterion("YFPHM is null");
            return (Criteria) this;
        }

        public Criteria andYfphmIsNotNull() {
            addCriterion("YFPHM is not null");
            return (Criteria) this;
        }

        public Criteria andYfphmEqualTo(String value) {
            addCriterion("YFPHM =", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmNotEqualTo(String value) {
            addCriterion("YFPHM <>", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmGreaterThan(String value) {
            addCriterion("YFPHM >", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmGreaterThanOrEqualTo(String value) {
            addCriterion("YFPHM >=", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmLessThan(String value) {
            addCriterion("YFPHM <", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmLessThanOrEqualTo(String value) {
            addCriterion("YFPHM <=", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmLike(String value) {
            addCriterion("YFPHM like", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmNotLike(String value) {
            addCriterion("YFPHM not like", value, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmIn(List<String> values) {
            addCriterion("YFPHM in", values, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmNotIn(List<String> values) {
            addCriterion("YFPHM not in", values, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmBetween(String value1, String value2) {
            addCriterion("YFPHM between", value1, value2, "yfphm");
            return (Criteria) this;
        }

        public Criteria andYfphmNotBetween(String value1, String value2) {
            addCriterion("YFPHM not between", value1, value2, "yfphm");
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

        public Criteria andUnitnameIsNull() {
            addCriterion("UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UNITNAME =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UNITNAME <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UNITNAME >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNITNAME >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UNITNAME <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UNITNAME <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UNITNAME like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UNITNAME not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UNITNAME in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UNITNAME not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UNITNAME between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UNITNAME not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameIsNull() {
            addCriterion("TAXSALESNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameIsNotNull() {
            addCriterion("TAXSALESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameEqualTo(String value) {
            addCriterion("TAXSALESNAME =", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameNotEqualTo(String value) {
            addCriterion("TAXSALESNAME <>", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameGreaterThan(String value) {
            addCriterion("TAXSALESNAME >", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXSALESNAME >=", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameLessThan(String value) {
            addCriterion("TAXSALESNAME <", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameLessThanOrEqualTo(String value) {
            addCriterion("TAXSALESNAME <=", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameLike(String value) {
            addCriterion("TAXSALESNAME like", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameNotLike(String value) {
            addCriterion("TAXSALESNAME not like", value, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameIn(List<String> values) {
            addCriterion("TAXSALESNAME in", values, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameNotIn(List<String> values) {
            addCriterion("TAXSALESNAME not in", values, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameBetween(String value1, String value2) {
            addCriterion("TAXSALESNAME between", value1, value2, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesnameNotBetween(String value1, String value2) {
            addCriterion("TAXSALESNAME not between", value1, value2, "taxsalesname");
            return (Criteria) this;
        }

        public Criteria andTaxsalesIsNull() {
            addCriterion("TAXSALES is null");
            return (Criteria) this;
        }

        public Criteria andTaxsalesIsNotNull() {
            addCriterion("TAXSALES is not null");
            return (Criteria) this;
        }

        public Criteria andTaxsalesEqualTo(String value) {
            addCriterion("TAXSALES =", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesNotEqualTo(String value) {
            addCriterion("TAXSALES <>", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesGreaterThan(String value) {
            addCriterion("TAXSALES >", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesGreaterThanOrEqualTo(String value) {
            addCriterion("TAXSALES >=", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesLessThan(String value) {
            addCriterion("TAXSALES <", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesLessThanOrEqualTo(String value) {
            addCriterion("TAXSALES <=", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesLike(String value) {
            addCriterion("TAXSALES like", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesNotLike(String value) {
            addCriterion("TAXSALES not like", value, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesIn(List<String> values) {
            addCriterion("TAXSALES in", values, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesNotIn(List<String> values) {
            addCriterion("TAXSALES not in", values, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesBetween(String value1, String value2) {
            addCriterion("TAXSALES between", value1, value2, "taxsales");
            return (Criteria) this;
        }

        public Criteria andTaxsalesNotBetween(String value1, String value2) {
            addCriterion("TAXSALES not between", value1, value2, "taxsales");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateIsNull() {
            addCriterion("INVOICETAXRATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateIsNotNull() {
            addCriterion("INVOICETAXRATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXRATE =", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateNotEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXRATE <>", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateGreaterThan(BigDecimal value) {
            addCriterion("INVOICETAXRATE >", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXRATE >=", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateLessThan(BigDecimal value) {
            addCriterion("INVOICETAXRATE <", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICETAXRATE <=", value, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateIn(List<BigDecimal> values) {
            addCriterion("INVOICETAXRATE in", values, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateNotIn(List<BigDecimal> values) {
            addCriterion("INVOICETAXRATE not in", values, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETAXRATE between", value1, value2, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoicetaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICETAXRATE not between", value1, value2, "invoicetaxrate");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusIsNull() {
            addCriterion("INVOICEVERIFICATIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusIsNotNull() {
            addCriterion("INVOICEVERIFICATIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusEqualTo(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS =", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusNotEqualTo(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS <>", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusGreaterThan(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS >", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS >=", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusLessThan(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS <", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusLessThanOrEqualTo(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS <=", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusLike(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS like", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusNotLike(String value) {
            addCriterion("INVOICEVERIFICATIONSTATUS not like", value, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusIn(List<String> values) {
            addCriterion("INVOICEVERIFICATIONSTATUS in", values, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusNotIn(List<String> values) {
            addCriterion("INVOICEVERIFICATIONSTATUS not in", values, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusBetween(String value1, String value2) {
            addCriterion("INVOICEVERIFICATIONSTATUS between", value1, value2, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceverificationstatusNotBetween(String value1, String value2) {
            addCriterion("INVOICEVERIFICATIONSTATUS not between", value1, value2, "invoiceverificationstatus");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonIsNull() {
            addCriterion("INVOICEFAILUREREASON is null");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonIsNotNull() {
            addCriterion("INVOICEFAILUREREASON is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonEqualTo(String value) {
            addCriterion("INVOICEFAILUREREASON =", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonNotEqualTo(String value) {
            addCriterion("INVOICEFAILUREREASON <>", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonGreaterThan(String value) {
            addCriterion("INVOICEFAILUREREASON >", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEFAILUREREASON >=", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonLessThan(String value) {
            addCriterion("INVOICEFAILUREREASON <", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonLessThanOrEqualTo(String value) {
            addCriterion("INVOICEFAILUREREASON <=", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonLike(String value) {
            addCriterion("INVOICEFAILUREREASON like", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonNotLike(String value) {
            addCriterion("INVOICEFAILUREREASON not like", value, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonIn(List<String> values) {
            addCriterion("INVOICEFAILUREREASON in", values, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonNotIn(List<String> values) {
            addCriterion("INVOICEFAILUREREASON not in", values, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonBetween(String value1, String value2) {
            addCriterion("INVOICEFAILUREREASON between", value1, value2, "invoicefailurereason");
            return (Criteria) this;
        }

        public Criteria andInvoicefailurereasonNotBetween(String value1, String value2) {
            addCriterion("INVOICEFAILUREREASON not between", value1, value2, "invoicefailurereason");
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

        public Criteria andIfprintsaleslistIsNull() {
            addCriterion("IFPRINTSALESLIST is null");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistIsNotNull() {
            addCriterion("IFPRINTSALESLIST is not null");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistEqualTo(String value) {
            addCriterion("IFPRINTSALESLIST =", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistNotEqualTo(String value) {
            addCriterion("IFPRINTSALESLIST <>", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistGreaterThan(String value) {
            addCriterion("IFPRINTSALESLIST >", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistGreaterThanOrEqualTo(String value) {
            addCriterion("IFPRINTSALESLIST >=", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistLessThan(String value) {
            addCriterion("IFPRINTSALESLIST <", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistLessThanOrEqualTo(String value) {
            addCriterion("IFPRINTSALESLIST <=", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistLike(String value) {
            addCriterion("IFPRINTSALESLIST like", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistNotLike(String value) {
            addCriterion("IFPRINTSALESLIST not like", value, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistIn(List<String> values) {
            addCriterion("IFPRINTSALESLIST in", values, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistNotIn(List<String> values) {
            addCriterion("IFPRINTSALESLIST not in", values, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistBetween(String value1, String value2) {
            addCriterion("IFPRINTSALESLIST between", value1, value2, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andIfprintsaleslistNotBetween(String value1, String value2) {
            addCriterion("IFPRINTSALESLIST not between", value1, value2, "ifprintsaleslist");
            return (Criteria) this;
        }

        public Criteria andTaxamount1IsNull() {
            addCriterion("TAXAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxamount1IsNotNull() {
            addCriterion("TAXAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamount1EqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 =", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <>", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT1 >", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 >=", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1LessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <=", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1In(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT1 in", values, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT1 not in", values, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT1 between", value1, value2, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT1 not between", value1, value2, "taxamount1");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invoice_split_td
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
     * @Table : mm_invoice_split_td
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