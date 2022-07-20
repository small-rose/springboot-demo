package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPrintableinvoiceTdExample {
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
    public MmPrintableinvoiceTdExample() {
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
     * @Table : mm_printableinvoice_td
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

        public Criteria andTradebatnoIsNull() {
            addCriterion("TRADEBATNO is null");
            return (Criteria) this;
        }

        public Criteria andTradebatnoIsNotNull() {
            addCriterion("TRADEBATNO is not null");
            return (Criteria) this;
        }

        public Criteria andTradebatnoEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO =", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO <>", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoGreaterThan(BigDecimal value) {
            addCriterion("TRADEBATNO >", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO >=", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoLessThan(BigDecimal value) {
            addCriterion("TRADEBATNO <", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO <=", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoIn(List<BigDecimal> values) {
            addCriterion("TRADEBATNO in", values, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotIn(List<BigDecimal> values) {
            addCriterion("TRADEBATNO not in", values, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEBATNO between", value1, value2, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEBATNO not between", value1, value2, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
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

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
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

        public Criteria andInvoicerateIsNull() {
            addCriterion("invoiceRate is null");
            return (Criteria) this;
        }

        public Criteria andInvoicerateIsNotNull() {
            addCriterion("invoiceRate is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicerateEqualTo(BigDecimal value) {
            addCriterion("invoiceRate =", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateNotEqualTo(BigDecimal value) {
            addCriterion("invoiceRate <>", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateGreaterThan(BigDecimal value) {
            addCriterion("invoiceRate >", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoiceRate >=", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateLessThan(BigDecimal value) {
            addCriterion("invoiceRate <", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoiceRate <=", value, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateIn(List<BigDecimal> values) {
            addCriterion("invoiceRate in", values, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateNotIn(List<BigDecimal> values) {
            addCriterion("invoiceRate not in", values, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoiceRate between", value1, value2, "invoicerate");
            return (Criteria) this;
        }

        public Criteria andInvoicerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoiceRate not between", value1, value2, "invoicerate");
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

        public Criteria andClassesstypeIsNull() {
            addCriterion("CLASSESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIsNotNull() {
            addCriterion("CLASSESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeEqualTo(String value) {
            addCriterion("CLASSESSTYPE =", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotEqualTo(String value) {
            addCriterion("CLASSESSTYPE <>", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThan(String value) {
            addCriterion("CLASSESSTYPE >", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE >=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThan(String value) {
            addCriterion("CLASSESSTYPE <", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE <=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLike(String value) {
            addCriterion("CLASSESSTYPE like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotLike(String value) {
            addCriterion("CLASSESSTYPE not like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIn(List<String> values) {
            addCriterion("CLASSESSTYPE in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotIn(List<String> values) {
            addCriterion("CLASSESSTYPE not in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE between", value1, value2, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE not between", value1, value2, "classesstype");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNull() {
            addCriterion("HANDLEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNotNull() {
            addCriterion("HANDLEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandledamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT =", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <>", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT not in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT not between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountIsNull() {
            addCriterion("INVHANDLEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountIsNotNull() {
            addCriterion("INVHANDLEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT =", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountNotEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT <>", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountGreaterThan(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT >", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT >=", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountLessThan(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT <", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDAMOUNT <=", value, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountIn(List<BigDecimal> values) {
            addCriterion("INVHANDLEDAMOUNT in", values, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountNotIn(List<BigDecimal> values) {
            addCriterion("INVHANDLEDAMOUNT not in", values, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVHANDLEDAMOUNT between", value1, value2, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVHANDLEDAMOUNT not between", value1, value2, "invhandledamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountIsNull() {
            addCriterion("HANDLETAXESDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountIsNotNull() {
            addCriterion("HANDLETAXESDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountEqualTo(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT =", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT <>", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT >", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT >=", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountLessThan(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT <", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLETAXESDAMOUNT <=", value, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountIn(List<BigDecimal> values) {
            addCriterion("HANDLETAXESDAMOUNT in", values, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLETAXESDAMOUNT not in", values, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLETAXESDAMOUNT between", value1, value2, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andHandletaxesdamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLETAXESDAMOUNT not between", value1, value2, "handletaxesdamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountIsNull() {
            addCriterion("INVHANDLEDTAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountIsNotNull() {
            addCriterion("INVHANDLEDTAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT =", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT <>", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountGreaterThan(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT >", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT >=", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountLessThan(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT <", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVHANDLEDTAXESAMOUNT <=", value, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountIn(List<BigDecimal> values) {
            addCriterion("INVHANDLEDTAXESAMOUNT in", values, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("INVHANDLEDTAXESAMOUNT not in", values, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVHANDLEDTAXESAMOUNT between", value1, value2, "invhandledtaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvhandledtaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVHANDLEDTAXESAMOUNT not between", value1, value2, "invhandledtaxesamount");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_printableinvoice_td
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
     * @Table : mm_printableinvoice_td
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