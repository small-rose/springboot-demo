package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmInvatinvoiceTiExample {
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
    public MmInvatinvoiceTiExample() {
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
     * @Table : mm_invatinvoice_ti
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

        public Criteria andTotalamountIsNull() {
            addCriterion("TOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT not between", value1, value2, "totalamount");
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

        public Criteria andInvoicedateIsNull() {
            addCriterion("INVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNotNull() {
            addCriterion("INVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateEqualTo(Date value) {
            addCriterion("INVOICEDATE =", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotEqualTo(Date value) {
            addCriterion("INVOICEDATE <>", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThan(Date value) {
            addCriterion("INVOICEDATE >", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE >=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThan(Date value) {
            addCriterion("INVOICEDATE <", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE <=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIn(List<Date> values) {
            addCriterion("INVOICEDATE in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotIn(List<Date> values) {
            addCriterion("INVOICEDATE not in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE not between", value1, value2, "invoicedate");
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

        public Criteria andTaxbilltypeIsNull() {
            addCriterion("TAXBILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeIsNotNull() {
            addCriterion("TAXBILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeEqualTo(String value) {
            addCriterion("TAXBILLTYPE =", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeNotEqualTo(String value) {
            addCriterion("TAXBILLTYPE <>", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeGreaterThan(String value) {
            addCriterion("TAXBILLTYPE >", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXBILLTYPE >=", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeLessThan(String value) {
            addCriterion("TAXBILLTYPE <", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeLessThanOrEqualTo(String value) {
            addCriterion("TAXBILLTYPE <=", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeLike(String value) {
            addCriterion("TAXBILLTYPE like", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeNotLike(String value) {
            addCriterion("TAXBILLTYPE not like", value, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeIn(List<String> values) {
            addCriterion("TAXBILLTYPE in", values, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeNotIn(List<String> values) {
            addCriterion("TAXBILLTYPE not in", values, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeBetween(String value1, String value2) {
            addCriterion("TAXBILLTYPE between", value1, value2, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andTaxbilltypeNotBetween(String value1, String value2) {
            addCriterion("TAXBILLTYPE not between", value1, value2, "taxbilltype");
            return (Criteria) this;
        }

        public Criteria andDkstatusIsNull() {
            addCriterion("DKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDkstatusIsNotNull() {
            addCriterion("DKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDkstatusEqualTo(String value) {
            addCriterion("DKSTATUS =", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotEqualTo(String value) {
            addCriterion("DKSTATUS <>", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusGreaterThan(String value) {
            addCriterion("DKSTATUS >", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("DKSTATUS >=", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLessThan(String value) {
            addCriterion("DKSTATUS <", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLessThanOrEqualTo(String value) {
            addCriterion("DKSTATUS <=", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLike(String value) {
            addCriterion("DKSTATUS like", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotLike(String value) {
            addCriterion("DKSTATUS not like", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusIn(List<String> values) {
            addCriterion("DKSTATUS in", values, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotIn(List<String> values) {
            addCriterion("DKSTATUS not in", values, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusBetween(String value1, String value2) {
            addCriterion("DKSTATUS between", value1, value2, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotBetween(String value1, String value2) {
            addCriterion("DKSTATUS not between", value1, value2, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDectypeIsNull() {
            addCriterion("DECTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDectypeIsNotNull() {
            addCriterion("DECTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDectypeEqualTo(String value) {
            addCriterion("DECTYPE =", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotEqualTo(String value) {
            addCriterion("DECTYPE <>", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeGreaterThan(String value) {
            addCriterion("DECTYPE >", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeGreaterThanOrEqualTo(String value) {
            addCriterion("DECTYPE >=", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLessThan(String value) {
            addCriterion("DECTYPE <", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLessThanOrEqualTo(String value) {
            addCriterion("DECTYPE <=", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLike(String value) {
            addCriterion("DECTYPE like", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotLike(String value) {
            addCriterion("DECTYPE not like", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeIn(List<String> values) {
            addCriterion("DECTYPE in", values, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotIn(List<String> values) {
            addCriterion("DECTYPE not in", values, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeBetween(String value1, String value2) {
            addCriterion("DECTYPE between", value1, value2, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotBetween(String value1, String value2) {
            addCriterion("DECTYPE not between", value1, value2, "dectype");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNull() {
            addCriterion("BILLSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNotNull() {
            addCriterion("BILLSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBillstatusEqualTo(String value) {
            addCriterion("BILLSTATUS =", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotEqualTo(String value) {
            addCriterion("BILLSTATUS <>", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThan(String value) {
            addCriterion("BILLSTATUS >", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BILLSTATUS >=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThan(String value) {
            addCriterion("BILLSTATUS <", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThanOrEqualTo(String value) {
            addCriterion("BILLSTATUS <=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLike(String value) {
            addCriterion("BILLSTATUS like", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotLike(String value) {
            addCriterion("BILLSTATUS not like", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusIn(List<String> values) {
            addCriterion("BILLSTATUS in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotIn(List<String> values) {
            addCriterion("BILLSTATUS not in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusBetween(String value1, String value2) {
            addCriterion("BILLSTATUS between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotBetween(String value1, String value2) {
            addCriterion("BILLSTATUS not between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusIsNull() {
            addCriterion("AUTHSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuthstatusIsNotNull() {
            addCriterion("AUTHSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuthstatusEqualTo(String value) {
            addCriterion("AUTHSTATUS =", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusNotEqualTo(String value) {
            addCriterion("AUTHSTATUS <>", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusGreaterThan(String value) {
            addCriterion("AUTHSTATUS >", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHSTATUS >=", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusLessThan(String value) {
            addCriterion("AUTHSTATUS <", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusLessThanOrEqualTo(String value) {
            addCriterion("AUTHSTATUS <=", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusLike(String value) {
            addCriterion("AUTHSTATUS like", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusNotLike(String value) {
            addCriterion("AUTHSTATUS not like", value, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusIn(List<String> values) {
            addCriterion("AUTHSTATUS in", values, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusNotIn(List<String> values) {
            addCriterion("AUTHSTATUS not in", values, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusBetween(String value1, String value2) {
            addCriterion("AUTHSTATUS between", value1, value2, "authstatus");
            return (Criteria) this;
        }

        public Criteria andAuthstatusNotBetween(String value1, String value2) {
            addCriterion("AUTHSTATUS not between", value1, value2, "authstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Date value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Date value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Date value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Date value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Date value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Date> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Date> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Date value1, Date value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Date value1, Date value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoIsNull() {
            addCriterion("OUTTAXNO is null");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoIsNotNull() {
            addCriterion("OUTTAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoEqualTo(String value) {
            addCriterion("OUTTAXNO =", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoNotEqualTo(String value) {
            addCriterion("OUTTAXNO <>", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoGreaterThan(String value) {
            addCriterion("OUTTAXNO >", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("OUTTAXNO >=", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoLessThan(String value) {
            addCriterion("OUTTAXNO <", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoLessThanOrEqualTo(String value) {
            addCriterion("OUTTAXNO <=", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoLike(String value) {
            addCriterion("OUTTAXNO like", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoNotLike(String value) {
            addCriterion("OUTTAXNO not like", value, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoIn(List<String> values) {
            addCriterion("OUTTAXNO in", values, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoNotIn(List<String> values) {
            addCriterion("OUTTAXNO not in", values, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoBetween(String value1, String value2) {
            addCriterion("OUTTAXNO between", value1, value2, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOuttaxnoNotBetween(String value1, String value2) {
            addCriterion("OUTTAXNO not between", value1, value2, "outtaxno");
            return (Criteria) this;
        }

        public Criteria andOutnameIsNull() {
            addCriterion("OUTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOutnameIsNotNull() {
            addCriterion("OUTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutnameEqualTo(String value) {
            addCriterion("OUTNAME =", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameNotEqualTo(String value) {
            addCriterion("OUTNAME <>", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameGreaterThan(String value) {
            addCriterion("OUTNAME >", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameGreaterThanOrEqualTo(String value) {
            addCriterion("OUTNAME >=", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameLessThan(String value) {
            addCriterion("OUTNAME <", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameLessThanOrEqualTo(String value) {
            addCriterion("OUTNAME <=", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameLike(String value) {
            addCriterion("OUTNAME like", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameNotLike(String value) {
            addCriterion("OUTNAME not like", value, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameIn(List<String> values) {
            addCriterion("OUTNAME in", values, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameNotIn(List<String> values) {
            addCriterion("OUTNAME not in", values, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameBetween(String value1, String value2) {
            addCriterion("OUTNAME between", value1, value2, "outname");
            return (Criteria) this;
        }

        public Criteria andOutnameNotBetween(String value1, String value2) {
            addCriterion("OUTNAME not between", value1, value2, "outname");
            return (Criteria) this;
        }

        public Criteria andOutaddrIsNull() {
            addCriterion("OUTADDR is null");
            return (Criteria) this;
        }

        public Criteria andOutaddrIsNotNull() {
            addCriterion("OUTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOutaddrEqualTo(String value) {
            addCriterion("OUTADDR =", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrNotEqualTo(String value) {
            addCriterion("OUTADDR <>", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrGreaterThan(String value) {
            addCriterion("OUTADDR >", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrGreaterThanOrEqualTo(String value) {
            addCriterion("OUTADDR >=", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrLessThan(String value) {
            addCriterion("OUTADDR <", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrLessThanOrEqualTo(String value) {
            addCriterion("OUTADDR <=", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrLike(String value) {
            addCriterion("OUTADDR like", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrNotLike(String value) {
            addCriterion("OUTADDR not like", value, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrIn(List<String> values) {
            addCriterion("OUTADDR in", values, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrNotIn(List<String> values) {
            addCriterion("OUTADDR not in", values, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrBetween(String value1, String value2) {
            addCriterion("OUTADDR between", value1, value2, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutaddrNotBetween(String value1, String value2) {
            addCriterion("OUTADDR not between", value1, value2, "outaddr");
            return (Criteria) this;
        }

        public Criteria andOutphoneIsNull() {
            addCriterion("OUTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andOutphoneIsNotNull() {
            addCriterion("OUTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOutphoneEqualTo(String value) {
            addCriterion("OUTPHONE =", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneNotEqualTo(String value) {
            addCriterion("OUTPHONE <>", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneGreaterThan(String value) {
            addCriterion("OUTPHONE >", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPHONE >=", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneLessThan(String value) {
            addCriterion("OUTPHONE <", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneLessThanOrEqualTo(String value) {
            addCriterion("OUTPHONE <=", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneLike(String value) {
            addCriterion("OUTPHONE like", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneNotLike(String value) {
            addCriterion("OUTPHONE not like", value, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneIn(List<String> values) {
            addCriterion("OUTPHONE in", values, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneNotIn(List<String> values) {
            addCriterion("OUTPHONE not in", values, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneBetween(String value1, String value2) {
            addCriterion("OUTPHONE between", value1, value2, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutphoneNotBetween(String value1, String value2) {
            addCriterion("OUTPHONE not between", value1, value2, "outphone");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIsNull() {
            addCriterion("OUTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIsNotNull() {
            addCriterion("OUTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutbanknameEqualTo(String value) {
            addCriterion("OUTBANKNAME =", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotEqualTo(String value) {
            addCriterion("OUTBANKNAME <>", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameGreaterThan(String value) {
            addCriterion("OUTBANKNAME >", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("OUTBANKNAME >=", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLessThan(String value) {
            addCriterion("OUTBANKNAME <", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLessThanOrEqualTo(String value) {
            addCriterion("OUTBANKNAME <=", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLike(String value) {
            addCriterion("OUTBANKNAME like", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotLike(String value) {
            addCriterion("OUTBANKNAME not like", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIn(List<String> values) {
            addCriterion("OUTBANKNAME in", values, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotIn(List<String> values) {
            addCriterion("OUTBANKNAME not in", values, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameBetween(String value1, String value2) {
            addCriterion("OUTBANKNAME between", value1, value2, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotBetween(String value1, String value2) {
            addCriterion("OUTBANKNAME not between", value1, value2, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknoIsNull() {
            addCriterion("OUTBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andOutbanknoIsNotNull() {
            addCriterion("OUTBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andOutbanknoEqualTo(String value) {
            addCriterion("OUTBANKNO =", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoNotEqualTo(String value) {
            addCriterion("OUTBANKNO <>", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoGreaterThan(String value) {
            addCriterion("OUTBANKNO >", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("OUTBANKNO >=", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoLessThan(String value) {
            addCriterion("OUTBANKNO <", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoLessThanOrEqualTo(String value) {
            addCriterion("OUTBANKNO <=", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoLike(String value) {
            addCriterion("OUTBANKNO like", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoNotLike(String value) {
            addCriterion("OUTBANKNO not like", value, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoIn(List<String> values) {
            addCriterion("OUTBANKNO in", values, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoNotIn(List<String> values) {
            addCriterion("OUTBANKNO not in", values, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoBetween(String value1, String value2) {
            addCriterion("OUTBANKNO between", value1, value2, "outbankno");
            return (Criteria) this;
        }

        public Criteria andOutbanknoNotBetween(String value1, String value2) {
            addCriterion("OUTBANKNO not between", value1, value2, "outbankno");
            return (Criteria) this;
        }

        public Criteria andIfalloutIsNull() {
            addCriterion("IFALLOUT is null");
            return (Criteria) this;
        }

        public Criteria andIfalloutIsNotNull() {
            addCriterion("IFALLOUT is not null");
            return (Criteria) this;
        }

        public Criteria andIfalloutEqualTo(String value) {
            addCriterion("IFALLOUT =", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutNotEqualTo(String value) {
            addCriterion("IFALLOUT <>", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutGreaterThan(String value) {
            addCriterion("IFALLOUT >", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutGreaterThanOrEqualTo(String value) {
            addCriterion("IFALLOUT >=", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutLessThan(String value) {
            addCriterion("IFALLOUT <", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutLessThanOrEqualTo(String value) {
            addCriterion("IFALLOUT <=", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutLike(String value) {
            addCriterion("IFALLOUT like", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutNotLike(String value) {
            addCriterion("IFALLOUT not like", value, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutIn(List<String> values) {
            addCriterion("IFALLOUT in", values, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutNotIn(List<String> values) {
            addCriterion("IFALLOUT not in", values, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutBetween(String value1, String value2) {
            addCriterion("IFALLOUT between", value1, value2, "ifallout");
            return (Criteria) this;
        }

        public Criteria andIfalloutNotBetween(String value1, String value2) {
            addCriterion("IFALLOUT not between", value1, value2, "ifallout");
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

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("RESERVE2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("RESERVE2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("RESERVE2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("RESERVE2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("RESERVE2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("RESERVE2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("RESERVE2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("RESERVE2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("RESERVE2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("RESERVE2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("RESERVE2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("RESERVE3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("RESERVE3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("RESERVE3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("RESERVE3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("RESERVE3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("RESERVE3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("RESERVE3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("RESERVE3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("RESERVE3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("RESERVE3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("RESERVE3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("RESERVE3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("RESERVE3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("RESERVE4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("RESERVE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(Date value) {
            addCriterion("RESERVE4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(Date value) {
            addCriterion("RESERVE4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(Date value) {
            addCriterion("RESERVE4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(Date value) {
            addCriterion("RESERVE4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(Date value) {
            addCriterion("RESERVE4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(Date value) {
            addCriterion("RESERVE4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<Date> values) {
            addCriterion("RESERVE4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<Date> values) {
            addCriterion("RESERVE4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(Date value1, Date value2) {
            addCriterion("RESERVE4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(Date value1, Date value2) {
            addCriterion("RESERVE4 not between", value1, value2, "reserve4");
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

        public Criteria andHibernateversionEqualTo(String value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(String value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(String value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(String value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(String value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(String value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLike(String value) {
            addCriterion("HIBERNATEVERSION like", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotLike(String value) {
            addCriterion("HIBERNATEVERSION not like", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<String> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<String> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(String value1, String value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(String value1, String value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invatinvoice_ti
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
     * @Table : mm_invatinvoice_ti
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