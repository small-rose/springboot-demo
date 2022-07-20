package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmBankInpaymentTiExample {
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
    public MmBankInpaymentTiExample() {
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
     * @Table : mm_bank_inpayment_ti
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

        public Criteria andYqidIsNull() {
            addCriterion("YQID is null");
            return (Criteria) this;
        }

        public Criteria andYqidIsNotNull() {
            addCriterion("YQID is not null");
            return (Criteria) this;
        }

        public Criteria andYqidEqualTo(String value) {
            addCriterion("YQID =", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotEqualTo(String value) {
            addCriterion("YQID <>", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidGreaterThan(String value) {
            addCriterion("YQID >", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidGreaterThanOrEqualTo(String value) {
            addCriterion("YQID >=", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidLessThan(String value) {
            addCriterion("YQID <", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidLessThanOrEqualTo(String value) {
            addCriterion("YQID <=", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidLike(String value) {
            addCriterion("YQID like", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotLike(String value) {
            addCriterion("YQID not like", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidIn(List<String> values) {
            addCriterion("YQID in", values, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotIn(List<String> values) {
            addCriterion("YQID not in", values, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidBetween(String value1, String value2) {
            addCriterion("YQID between", value1, value2, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotBetween(String value1, String value2) {
            addCriterion("YQID not between", value1, value2, "yqid");
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

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
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

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andAccountflagIsNull() {
            addCriterion("ACCOUNTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAccountflagIsNotNull() {
            addCriterion("ACCOUNTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAccountflagEqualTo(String value) {
            addCriterion("ACCOUNTFLAG =", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotEqualTo(String value) {
            addCriterion("ACCOUNTFLAG <>", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagGreaterThan(String value) {
            addCriterion("ACCOUNTFLAG >", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTFLAG >=", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagLessThan(String value) {
            addCriterion("ACCOUNTFLAG <", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTFLAG <=", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagLike(String value) {
            addCriterion("ACCOUNTFLAG like", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotLike(String value) {
            addCriterion("ACCOUNTFLAG not like", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagIn(List<String> values) {
            addCriterion("ACCOUNTFLAG in", values, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotIn(List<String> values) {
            addCriterion("ACCOUNTFLAG not in", values, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagBetween(String value1, String value2) {
            addCriterion("ACCOUNTFLAG between", value1, value2, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTFLAG not between", value1, value2, "accountflag");
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

        public Criteria andChecktypeIsNull() {
            addCriterion("CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNull() {
            addCriterion("CHECKNO is null");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNotNull() {
            addCriterion("CHECKNO is not null");
            return (Criteria) this;
        }

        public Criteria andChecknoEqualTo(String value) {
            addCriterion("CHECKNO =", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotEqualTo(String value) {
            addCriterion("CHECKNO <>", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThan(String value) {
            addCriterion("CHECKNO >", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNO >=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThan(String value) {
            addCriterion("CHECKNO <", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThanOrEqualTo(String value) {
            addCriterion("CHECKNO <=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLike(String value) {
            addCriterion("CHECKNO like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotLike(String value) {
            addCriterion("CHECKNO not like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoIn(List<String> values) {
            addCriterion("CHECKNO in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotIn(List<String> values) {
            addCriterion("CHECKNO not in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoBetween(String value1, String value2) {
            addCriterion("CHECKNO between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotBetween(String value1, String value2) {
            addCriterion("CHECKNO not between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andRemitternameIsNull() {
            addCriterion("REMITTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andRemitternameIsNotNull() {
            addCriterion("REMITTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRemitternameEqualTo(String value) {
            addCriterion("REMITTERNAME =", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotEqualTo(String value) {
            addCriterion("REMITTERNAME <>", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameGreaterThan(String value) {
            addCriterion("REMITTERNAME >", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameGreaterThanOrEqualTo(String value) {
            addCriterion("REMITTERNAME >=", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLessThan(String value) {
            addCriterion("REMITTERNAME <", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLessThanOrEqualTo(String value) {
            addCriterion("REMITTERNAME <=", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLike(String value) {
            addCriterion("REMITTERNAME like", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotLike(String value) {
            addCriterion("REMITTERNAME not like", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameIn(List<String> values) {
            addCriterion("REMITTERNAME in", values, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotIn(List<String> values) {
            addCriterion("REMITTERNAME not in", values, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameBetween(String value1, String value2) {
            addCriterion("REMITTERNAME between", value1, value2, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotBetween(String value1, String value2) {
            addCriterion("REMITTERNAME not between", value1, value2, "remittername");
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

        public Criteria andCustaccountbanknameIsNull() {
            addCriterion("CUSTACCOUNTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameIsNotNull() {
            addCriterion("CUSTACCOUNTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKNAME =", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKNAME <>", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameGreaterThan(String value) {
            addCriterion("CUSTACCOUNTBANKNAME >", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKNAME >=", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameLessThan(String value) {
            addCriterion("CUSTACCOUNTBANKNAME <", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKNAME <=", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameLike(String value) {
            addCriterion("CUSTACCOUNTBANKNAME like", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameNotLike(String value) {
            addCriterion("CUSTACCOUNTBANKNAME not like", value, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameIn(List<String> values) {
            addCriterion("CUSTACCOUNTBANKNAME in", values, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTBANKNAME not in", values, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTBANKNAME between", value1, value2, "custaccountbankname");
            return (Criteria) this;
        }

        public Criteria andCustaccountbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTBANKNAME not between", value1, value2, "custaccountbankname");
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

        public Criteria andMsgIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("MSG =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("MSG <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("MSG >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("MSG <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("MSG like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("MSG not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("MSG in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("MSG not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeIsNull() {
            addCriterion("RECONCILIATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeIsNotNull() {
            addCriterion("RECONCILIATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeEqualTo(String value) {
            addCriterion("RECONCILIATIONCODE =", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeNotEqualTo(String value) {
            addCriterion("RECONCILIATIONCODE <>", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeGreaterThan(String value) {
            addCriterion("RECONCILIATIONCODE >", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECONCILIATIONCODE >=", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeLessThan(String value) {
            addCriterion("RECONCILIATIONCODE <", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeLessThanOrEqualTo(String value) {
            addCriterion("RECONCILIATIONCODE <=", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeLike(String value) {
            addCriterion("RECONCILIATIONCODE like", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeNotLike(String value) {
            addCriterion("RECONCILIATIONCODE not like", value, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeIn(List<String> values) {
            addCriterion("RECONCILIATIONCODE in", values, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeNotIn(List<String> values) {
            addCriterion("RECONCILIATIONCODE not in", values, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeBetween(String value1, String value2) {
            addCriterion("RECONCILIATIONCODE between", value1, value2, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andReconciliationcodeNotBetween(String value1, String value2) {
            addCriterion("RECONCILIATIONCODE not between", value1, value2, "reconciliationcode");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("BALANCE like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("BALANCE not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("PURPOSE =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("PURPOSE <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("PURPOSE >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("PURPOSE >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("PURPOSE <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("PURPOSE <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("PURPOSE like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("PURPOSE not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("PURPOSE in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("PURPOSE not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("PURPOSE between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("PURPOSE not between", value1, value2, "purpose");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bank_inpayment_ti
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
     * @Table : mm_bank_inpayment_ti
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