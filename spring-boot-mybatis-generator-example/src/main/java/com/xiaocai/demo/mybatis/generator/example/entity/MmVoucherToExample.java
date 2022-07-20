package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmVoucherToExample {
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
    public MmVoucherToExample() {
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
     * @Table : mm_voucher_to
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

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(Long value) {
            addCriterion("ATTRIBUTE4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(Long value) {
            addCriterion("ATTRIBUTE4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(Long value) {
            addCriterion("ATTRIBUTE4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(Long value) {
            addCriterion("ATTRIBUTE4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<Long> values) {
            addCriterion("ATTRIBUTE4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<Long> values) {
            addCriterion("ATTRIBUTE4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(Long value1, Long value2) {
            addCriterion("ATTRIBUTE4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(Long value1, Long value2) {
            addCriterion("ATTRIBUTE4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andSetofbooksIsNull() {
            addCriterion("SETOFBOOKS is null");
            return (Criteria) this;
        }

        public Criteria andSetofbooksIsNotNull() {
            addCriterion("SETOFBOOKS is not null");
            return (Criteria) this;
        }

        public Criteria andSetofbooksEqualTo(String value) {
            addCriterion("SETOFBOOKS =", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksNotEqualTo(String value) {
            addCriterion("SETOFBOOKS <>", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksGreaterThan(String value) {
            addCriterion("SETOFBOOKS >", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksGreaterThanOrEqualTo(String value) {
            addCriterion("SETOFBOOKS >=", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksLessThan(String value) {
            addCriterion("SETOFBOOKS <", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksLessThanOrEqualTo(String value) {
            addCriterion("SETOFBOOKS <=", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksLike(String value) {
            addCriterion("SETOFBOOKS like", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksNotLike(String value) {
            addCriterion("SETOFBOOKS not like", value, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksIn(List<String> values) {
            addCriterion("SETOFBOOKS in", values, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksNotIn(List<String> values) {
            addCriterion("SETOFBOOKS not in", values, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksBetween(String value1, String value2) {
            addCriterion("SETOFBOOKS between", value1, value2, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andSetofbooksNotBetween(String value1, String value2) {
            addCriterion("SETOFBOOKS not between", value1, value2, "setofbooks");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIsNull() {
            addCriterion("ACCOUNTINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIsNotNull() {
            addCriterion("ACCOUNTINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE =", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <>", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE >", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE >=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThan(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNTINGDATE in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNTINGDATE not in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNTINGDATE between", value1, value2, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNTINGDATE not between", value1, value2, "accountingdate");
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

        public Criteria andJecategorynameIsNull() {
            addCriterion("JECATEGORYNAME is null");
            return (Criteria) this;
        }

        public Criteria andJecategorynameIsNotNull() {
            addCriterion("JECATEGORYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJecategorynameEqualTo(String value) {
            addCriterion("JECATEGORYNAME =", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameNotEqualTo(String value) {
            addCriterion("JECATEGORYNAME <>", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameGreaterThan(String value) {
            addCriterion("JECATEGORYNAME >", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("JECATEGORYNAME >=", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameLessThan(String value) {
            addCriterion("JECATEGORYNAME <", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameLessThanOrEqualTo(String value) {
            addCriterion("JECATEGORYNAME <=", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameLike(String value) {
            addCriterion("JECATEGORYNAME like", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameNotLike(String value) {
            addCriterion("JECATEGORYNAME not like", value, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameIn(List<String> values) {
            addCriterion("JECATEGORYNAME in", values, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameNotIn(List<String> values) {
            addCriterion("JECATEGORYNAME not in", values, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameBetween(String value1, String value2) {
            addCriterion("JECATEGORYNAME between", value1, value2, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andJecategorynameNotBetween(String value1, String value2) {
            addCriterion("JECATEGORYNAME not between", value1, value2, "jecategoryname");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameIsNull() {
            addCriterion("USERJESOURCENAME is null");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameIsNotNull() {
            addCriterion("USERJESOURCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameEqualTo(String value) {
            addCriterion("USERJESOURCENAME =", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameNotEqualTo(String value) {
            addCriterion("USERJESOURCENAME <>", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameGreaterThan(String value) {
            addCriterion("USERJESOURCENAME >", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("USERJESOURCENAME >=", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameLessThan(String value) {
            addCriterion("USERJESOURCENAME <", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameLessThanOrEqualTo(String value) {
            addCriterion("USERJESOURCENAME <=", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameLike(String value) {
            addCriterion("USERJESOURCENAME like", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameNotLike(String value) {
            addCriterion("USERJESOURCENAME not like", value, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameIn(List<String> values) {
            addCriterion("USERJESOURCENAME in", values, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameNotIn(List<String> values) {
            addCriterion("USERJESOURCENAME not in", values, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameBetween(String value1, String value2) {
            addCriterion("USERJESOURCENAME between", value1, value2, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andUserjesourcenameNotBetween(String value1, String value2) {
            addCriterion("USERJESOURCENAME not between", value1, value2, "userjesourcename");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateIsNull() {
            addCriterion("CURRENCYCONVERSIONRATE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateIsNotNull() {
            addCriterion("CURRENCYCONVERSIONRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateEqualTo(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE =", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateNotEqualTo(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE <>", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateGreaterThan(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE >", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE >=", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateLessThan(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE <", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYCONVERSIONRATE <=", value, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateIn(List<BigDecimal> values) {
            addCriterion("CURRENCYCONVERSIONRATE in", values, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateNotIn(List<BigDecimal> values) {
            addCriterion("CURRENCYCONVERSIONRATE not in", values, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYCONVERSIONRATE between", value1, value2, "currencyconversionrate");
            return (Criteria) this;
        }

        public Criteria andCurrencyconversionrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYCONVERSIONRATE not between", value1, value2, "currencyconversionrate");
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

        public Criteria andBusinessnoEqualTo(BigDecimal value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(BigDecimal value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(BigDecimal value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<BigDecimal> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("SEGMENT5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("SEGMENT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(String value) {
            addCriterion("SEGMENT5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(String value) {
            addCriterion("SEGMENT5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(String value) {
            addCriterion("SEGMENT5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(String value) {
            addCriterion("SEGMENT5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Like(String value) {
            addCriterion("SEGMENT5 like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotLike(String value) {
            addCriterion("SEGMENT5 not like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<String> values) {
            addCriterion("SEGMENT5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<String> values) {
            addCriterion("SEGMENT5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(String value1, String value2) {
            addCriterion("SEGMENT5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(String value1, String value2) {
            addCriterion("SEGMENT5 not between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNull() {
            addCriterion("SEGMENT6 is null");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNotNull() {
            addCriterion("SEGMENT6 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6EqualTo(String value) {
            addCriterion("SEGMENT6 =", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotEqualTo(String value) {
            addCriterion("SEGMENT6 <>", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThan(String value) {
            addCriterion("SEGMENT6 >", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 >=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThan(String value) {
            addCriterion("SEGMENT6 <", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 <=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Like(String value) {
            addCriterion("SEGMENT6 like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotLike(String value) {
            addCriterion("SEGMENT6 not like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6In(List<String> values) {
            addCriterion("SEGMENT6 in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotIn(List<String> values) {
            addCriterion("SEGMENT6 not in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Between(String value1, String value2) {
            addCriterion("SEGMENT6 between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotBetween(String value1, String value2) {
            addCriterion("SEGMENT6 not between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNull() {
            addCriterion("SEGMENT7 is null");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNotNull() {
            addCriterion("SEGMENT7 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7EqualTo(String value) {
            addCriterion("SEGMENT7 =", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotEqualTo(String value) {
            addCriterion("SEGMENT7 <>", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThan(String value) {
            addCriterion("SEGMENT7 >", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 >=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThan(String value) {
            addCriterion("SEGMENT7 <", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 <=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Like(String value) {
            addCriterion("SEGMENT7 like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotLike(String value) {
            addCriterion("SEGMENT7 not like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7In(List<String> values) {
            addCriterion("SEGMENT7 in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotIn(List<String> values) {
            addCriterion("SEGMENT7 not in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Between(String value1, String value2) {
            addCriterion("SEGMENT7 between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotBetween(String value1, String value2) {
            addCriterion("SEGMENT7 not between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNull() {
            addCriterion("SEGMENT8 is null");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNotNull() {
            addCriterion("SEGMENT8 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8EqualTo(String value) {
            addCriterion("SEGMENT8 =", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotEqualTo(String value) {
            addCriterion("SEGMENT8 <>", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThan(String value) {
            addCriterion("SEGMENT8 >", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 >=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThan(String value) {
            addCriterion("SEGMENT8 <", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 <=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Like(String value) {
            addCriterion("SEGMENT8 like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotLike(String value) {
            addCriterion("SEGMENT8 not like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8In(List<String> values) {
            addCriterion("SEGMENT8 in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotIn(List<String> values) {
            addCriterion("SEGMENT8 not in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Between(String value1, String value2) {
            addCriterion("SEGMENT8 between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotBetween(String value1, String value2) {
            addCriterion("SEGMENT8 not between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andEntereddrIsNull() {
            addCriterion("ENTEREDDR is null");
            return (Criteria) this;
        }

        public Criteria andEntereddrIsNotNull() {
            addCriterion("ENTEREDDR is not null");
            return (Criteria) this;
        }

        public Criteria andEntereddrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDDR =", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrNotEqualTo(BigDecimal value) {
            addCriterion("ENTEREDDR <>", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrGreaterThan(BigDecimal value) {
            addCriterion("ENTEREDDR >", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDDR >=", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrLessThan(BigDecimal value) {
            addCriterion("ENTEREDDR <", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDDR <=", value, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrIn(List<BigDecimal> values) {
            addCriterion("ENTEREDDR in", values, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrNotIn(List<BigDecimal> values) {
            addCriterion("ENTEREDDR not in", values, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTEREDDR between", value1, value2, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEntereddrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTEREDDR not between", value1, value2, "entereddr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrIsNull() {
            addCriterion("ENTEREDCR is null");
            return (Criteria) this;
        }

        public Criteria andEnteredcrIsNotNull() {
            addCriterion("ENTEREDCR is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredcrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDCR =", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrNotEqualTo(BigDecimal value) {
            addCriterion("ENTEREDCR <>", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrGreaterThan(BigDecimal value) {
            addCriterion("ENTEREDCR >", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDCR >=", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrLessThan(BigDecimal value) {
            addCriterion("ENTEREDCR <", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTEREDCR <=", value, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrIn(List<BigDecimal> values) {
            addCriterion("ENTEREDCR in", values, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrNotIn(List<BigDecimal> values) {
            addCriterion("ENTEREDCR not in", values, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTEREDCR between", value1, value2, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andEnteredcrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTEREDCR not between", value1, value2, "enteredcr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrIsNull() {
            addCriterion("ACCOUNTEDDR is null");
            return (Criteria) this;
        }

        public Criteria andAccounteddrIsNotNull() {
            addCriterion("ACCOUNTEDDR is not null");
            return (Criteria) this;
        }

        public Criteria andAccounteddrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDDR =", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDDR <>", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTEDDR >", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDDR >=", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrLessThan(BigDecimal value) {
            addCriterion("ACCOUNTEDDR <", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDDR <=", value, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTEDDR in", values, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTEDDR not in", values, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTEDDR between", value1, value2, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccounteddrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTEDDR not between", value1, value2, "accounteddr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrIsNull() {
            addCriterion("ACCOUNTEDCR is null");
            return (Criteria) this;
        }

        public Criteria andAccountedcrIsNotNull() {
            addCriterion("ACCOUNTEDCR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountedcrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDCR =", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDCR <>", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTEDCR >", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDCR >=", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrLessThan(BigDecimal value) {
            addCriterion("ACCOUNTEDCR <", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTEDCR <=", value, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTEDCR in", values, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTEDCR not in", values, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTEDCR between", value1, value2, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andAccountedcrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTEDCR not between", value1, value2, "accountedcr");
            return (Criteria) this;
        }

        public Criteria andReference1IsNull() {
            addCriterion("REFERENCE1 is null");
            return (Criteria) this;
        }

        public Criteria andReference1IsNotNull() {
            addCriterion("REFERENCE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReference1EqualTo(String value) {
            addCriterion("REFERENCE1 =", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotEqualTo(String value) {
            addCriterion("REFERENCE1 <>", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1GreaterThan(String value) {
            addCriterion("REFERENCE1 >", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE1 >=", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1LessThan(String value) {
            addCriterion("REFERENCE1 <", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE1 <=", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1Like(String value) {
            addCriterion("REFERENCE1 like", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotLike(String value) {
            addCriterion("REFERENCE1 not like", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1In(List<String> values) {
            addCriterion("REFERENCE1 in", values, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotIn(List<String> values) {
            addCriterion("REFERENCE1 not in", values, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1Between(String value1, String value2) {
            addCriterion("REFERENCE1 between", value1, value2, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotBetween(String value1, String value2) {
            addCriterion("REFERENCE1 not between", value1, value2, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference4IsNull() {
            addCriterion("REFERENCE4 is null");
            return (Criteria) this;
        }

        public Criteria andReference4IsNotNull() {
            addCriterion("REFERENCE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReference4EqualTo(String value) {
            addCriterion("REFERENCE4 =", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotEqualTo(String value) {
            addCriterion("REFERENCE4 <>", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThan(String value) {
            addCriterion("REFERENCE4 >", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 >=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThan(String value) {
            addCriterion("REFERENCE4 <", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 <=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Like(String value) {
            addCriterion("REFERENCE4 like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotLike(String value) {
            addCriterion("REFERENCE4 not like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4In(List<String> values) {
            addCriterion("REFERENCE4 in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotIn(List<String> values) {
            addCriterion("REFERENCE4 not in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Between(String value1, String value2) {
            addCriterion("REFERENCE4 between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotBetween(String value1, String value2) {
            addCriterion("REFERENCE4 not between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference5IsNull() {
            addCriterion("REFERENCE5 is null");
            return (Criteria) this;
        }

        public Criteria andReference5IsNotNull() {
            addCriterion("REFERENCE5 is not null");
            return (Criteria) this;
        }

        public Criteria andReference5EqualTo(String value) {
            addCriterion("REFERENCE5 =", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5NotEqualTo(String value) {
            addCriterion("REFERENCE5 <>", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5GreaterThan(String value) {
            addCriterion("REFERENCE5 >", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE5 >=", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5LessThan(String value) {
            addCriterion("REFERENCE5 <", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE5 <=", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5Like(String value) {
            addCriterion("REFERENCE5 like", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5NotLike(String value) {
            addCriterion("REFERENCE5 not like", value, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5In(List<String> values) {
            addCriterion("REFERENCE5 in", values, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5NotIn(List<String> values) {
            addCriterion("REFERENCE5 not in", values, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5Between(String value1, String value2) {
            addCriterion("REFERENCE5 between", value1, value2, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference5NotBetween(String value1, String value2) {
            addCriterion("REFERENCE5 not between", value1, value2, "reference5");
            return (Criteria) this;
        }

        public Criteria andReference10IsNull() {
            addCriterion("REFERENCE10 is null");
            return (Criteria) this;
        }

        public Criteria andReference10IsNotNull() {
            addCriterion("REFERENCE10 is not null");
            return (Criteria) this;
        }

        public Criteria andReference10EqualTo(String value) {
            addCriterion("REFERENCE10 =", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10NotEqualTo(String value) {
            addCriterion("REFERENCE10 <>", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10GreaterThan(String value) {
            addCriterion("REFERENCE10 >", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE10 >=", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10LessThan(String value) {
            addCriterion("REFERENCE10 <", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE10 <=", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10Like(String value) {
            addCriterion("REFERENCE10 like", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10NotLike(String value) {
            addCriterion("REFERENCE10 not like", value, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10In(List<String> values) {
            addCriterion("REFERENCE10 in", values, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10NotIn(List<String> values) {
            addCriterion("REFERENCE10 not in", values, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10Between(String value1, String value2) {
            addCriterion("REFERENCE10 between", value1, value2, "reference10");
            return (Criteria) this;
        }

        public Criteria andReference10NotBetween(String value1, String value2) {
            addCriterion("REFERENCE10 not between", value1, value2, "reference10");
            return (Criteria) this;
        }

        public Criteria andJelinenumIsNull() {
            addCriterion("JELINENUM is null");
            return (Criteria) this;
        }

        public Criteria andJelinenumIsNotNull() {
            addCriterion("JELINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andJelinenumEqualTo(Long value) {
            addCriterion("JELINENUM =", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumNotEqualTo(Long value) {
            addCriterion("JELINENUM <>", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumGreaterThan(Long value) {
            addCriterion("JELINENUM >", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumGreaterThanOrEqualTo(Long value) {
            addCriterion("JELINENUM >=", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumLessThan(Long value) {
            addCriterion("JELINENUM <", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumLessThanOrEqualTo(Long value) {
            addCriterion("JELINENUM <=", value, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumIn(List<Long> values) {
            addCriterion("JELINENUM in", values, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumNotIn(List<Long> values) {
            addCriterion("JELINENUM not in", values, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumBetween(Long value1, Long value2) {
            addCriterion("JELINENUM between", value1, value2, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andJelinenumNotBetween(Long value1, Long value2) {
            addCriterion("JELINENUM not between", value1, value2, "jelinenum");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNull() {
            addCriterion("ATTRIBUTE6 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNotNull() {
            addCriterion("ATTRIBUTE6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute6EqualTo(String value) {
            addCriterion("ATTRIBUTE6 =", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <>", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThan(String value) {
            addCriterion("ATTRIBUTE6 >", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 >=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThan(String value) {
            addCriterion("ATTRIBUTE6 <", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Like(String value) {
            addCriterion("ATTRIBUTE6 like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotLike(String value) {
            addCriterion("ATTRIBUTE6 not like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6In(List<String> values) {
            addCriterion("ATTRIBUTE6 in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotIn(List<String> values) {
            addCriterion("ATTRIBUTE6 not in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Between(String value1, String value2) {
            addCriterion("ATTRIBUTE6 between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE6 not between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNull() {
            addCriterion("ATTRIBUTE7 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNotNull() {
            addCriterion("ATTRIBUTE7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute7EqualTo(String value) {
            addCriterion("ATTRIBUTE7 =", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <>", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThan(String value) {
            addCriterion("ATTRIBUTE7 >", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 >=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThan(String value) {
            addCriterion("ATTRIBUTE7 <", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Like(String value) {
            addCriterion("ATTRIBUTE7 like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotLike(String value) {
            addCriterion("ATTRIBUTE7 not like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7In(List<String> values) {
            addCriterion("ATTRIBUTE7 in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotIn(List<String> values) {
            addCriterion("ATTRIBUTE7 not in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Between(String value1, String value2) {
            addCriterion("ATTRIBUTE7 between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE7 not between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNull() {
            addCriterion("ATTRIBUTE8 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNotNull() {
            addCriterion("ATTRIBUTE8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute8EqualTo(String value) {
            addCriterion("ATTRIBUTE8 =", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <>", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThan(String value) {
            addCriterion("ATTRIBUTE8 >", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 >=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThan(String value) {
            addCriterion("ATTRIBUTE8 <", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Like(String value) {
            addCriterion("ATTRIBUTE8 like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotLike(String value) {
            addCriterion("ATTRIBUTE8 not like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8In(List<String> values) {
            addCriterion("ATTRIBUTE8 in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotIn(List<String> values) {
            addCriterion("ATTRIBUTE8 not in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Between(String value1, String value2) {
            addCriterion("ATTRIBUTE8 between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE8 not between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNull() {
            addCriterion("ATTRIBUTE9 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNotNull() {
            addCriterion("ATTRIBUTE9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute9EqualTo(String value) {
            addCriterion("ATTRIBUTE9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(String value) {
            addCriterion("ATTRIBUTE9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(String value) {
            addCriterion("ATTRIBUTE9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Like(String value) {
            addCriterion("ATTRIBUTE9 like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotLike(String value) {
            addCriterion("ATTRIBUTE9 not like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<String> values) {
            addCriterion("ATTRIBUTE9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<String> values) {
            addCriterion("ATTRIBUTE9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(String value1, String value2) {
            addCriterion("ATTRIBUTE9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE9 not between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNull() {
            addCriterion("ATTRIBUTE10 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNotNull() {
            addCriterion("ATTRIBUTE10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute10EqualTo(String value) {
            addCriterion("ATTRIBUTE10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(String value) {
            addCriterion("ATTRIBUTE10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(String value) {
            addCriterion("ATTRIBUTE10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Like(String value) {
            addCriterion("ATTRIBUTE10 like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotLike(String value) {
            addCriterion("ATTRIBUTE10 not like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<String> values) {
            addCriterion("ATTRIBUTE10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<String> values) {
            addCriterion("ATTRIBUTE10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(String value1, String value2) {
            addCriterion("ATTRIBUTE10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE10 not between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNull() {
            addCriterion("ATTRIBUTE11 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNotNull() {
            addCriterion("ATTRIBUTE11 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute11EqualTo(String value) {
            addCriterion("ATTRIBUTE11 =", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotEqualTo(String value) {
            addCriterion("ATTRIBUTE11 <>", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThan(String value) {
            addCriterion("ATTRIBUTE11 >", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE11 >=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThan(String value) {
            addCriterion("ATTRIBUTE11 <", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE11 <=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Like(String value) {
            addCriterion("ATTRIBUTE11 like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotLike(String value) {
            addCriterion("ATTRIBUTE11 not like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11In(List<String> values) {
            addCriterion("ATTRIBUTE11 in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotIn(List<String> values) {
            addCriterion("ATTRIBUTE11 not in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Between(String value1, String value2) {
            addCriterion("ATTRIBUTE11 between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE11 not between", value1, value2, "attribute11");
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

        public Criteria andSegment9IsNull() {
            addCriterion("SEGMENT9 is null");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNotNull() {
            addCriterion("SEGMENT9 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9EqualTo(String value) {
            addCriterion("SEGMENT9 =", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotEqualTo(String value) {
            addCriterion("SEGMENT9 <>", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThan(String value) {
            addCriterion("SEGMENT9 >", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 >=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThan(String value) {
            addCriterion("SEGMENT9 <", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 <=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Like(String value) {
            addCriterion("SEGMENT9 like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotLike(String value) {
            addCriterion("SEGMENT9 not like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9In(List<String> values) {
            addCriterion("SEGMENT9 in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotIn(List<String> values) {
            addCriterion("SEGMENT9 not in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Between(String value1, String value2) {
            addCriterion("SEGMENT9 between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotBetween(String value1, String value2) {
            addCriterion("SEGMENT9 not between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNull() {
            addCriterion("SEGMENT10 is null");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNotNull() {
            addCriterion("SEGMENT10 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10EqualTo(String value) {
            addCriterion("SEGMENT10 =", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotEqualTo(String value) {
            addCriterion("SEGMENT10 <>", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThan(String value) {
            addCriterion("SEGMENT10 >", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 >=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThan(String value) {
            addCriterion("SEGMENT10 <", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 <=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Like(String value) {
            addCriterion("SEGMENT10 like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotLike(String value) {
            addCriterion("SEGMENT10 not like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10In(List<String> values) {
            addCriterion("SEGMENT10 in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotIn(List<String> values) {
            addCriterion("SEGMENT10 not in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Between(String value1, String value2) {
            addCriterion("SEGMENT10 between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotBetween(String value1, String value2) {
            addCriterion("SEGMENT10 not between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNull() {
            addCriterion("SEGMENT11 is null");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNotNull() {
            addCriterion("SEGMENT11 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11EqualTo(String value) {
            addCriterion("SEGMENT11 =", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotEqualTo(String value) {
            addCriterion("SEGMENT11 <>", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThan(String value) {
            addCriterion("SEGMENT11 >", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 >=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThan(String value) {
            addCriterion("SEGMENT11 <", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 <=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Like(String value) {
            addCriterion("SEGMENT11 like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotLike(String value) {
            addCriterion("SEGMENT11 not like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11In(List<String> values) {
            addCriterion("SEGMENT11 in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotIn(List<String> values) {
            addCriterion("SEGMENT11 not in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Between(String value1, String value2) {
            addCriterion("SEGMENT11 between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotBetween(String value1, String value2) {
            addCriterion("SEGMENT11 not between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNull() {
            addCriterion("SEGMENT12 is null");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNotNull() {
            addCriterion("SEGMENT12 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12EqualTo(String value) {
            addCriterion("SEGMENT12 =", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotEqualTo(String value) {
            addCriterion("SEGMENT12 <>", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThan(String value) {
            addCriterion("SEGMENT12 >", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 >=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThan(String value) {
            addCriterion("SEGMENT12 <", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 <=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Like(String value) {
            addCriterion("SEGMENT12 like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotLike(String value) {
            addCriterion("SEGMENT12 not like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12In(List<String> values) {
            addCriterion("SEGMENT12 in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotIn(List<String> values) {
            addCriterion("SEGMENT12 not in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Between(String value1, String value2) {
            addCriterion("SEGMENT12 between", value1, value2, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotBetween(String value1, String value2) {
            addCriterion("SEGMENT12 not between", value1, value2, "segment12");
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

        public Criteria andSegment13IsNull() {
            addCriterion("SEGMENT13 is null");
            return (Criteria) this;
        }

        public Criteria andSegment13IsNotNull() {
            addCriterion("SEGMENT13 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment13EqualTo(String value) {
            addCriterion("SEGMENT13 =", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotEqualTo(String value) {
            addCriterion("SEGMENT13 <>", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThan(String value) {
            addCriterion("SEGMENT13 >", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 >=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThan(String value) {
            addCriterion("SEGMENT13 <", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 <=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Like(String value) {
            addCriterion("SEGMENT13 like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotLike(String value) {
            addCriterion("SEGMENT13 not like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13In(List<String> values) {
            addCriterion("SEGMENT13 in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotIn(List<String> values) {
            addCriterion("SEGMENT13 not in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Between(String value1, String value2) {
            addCriterion("SEGMENT13 between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotBetween(String value1, String value2) {
            addCriterion("SEGMENT13 not between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNull() {
            addCriterion("ATSBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNotNull() {
            addCriterion("ATSBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoEqualTo(String value) {
            addCriterion("ATSBILLNO =", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotEqualTo(String value) {
            addCriterion("ATSBILLNO <>", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThan(String value) {
            addCriterion("ATSBILLNO >", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO >=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThan(String value) {
            addCriterion("ATSBILLNO <", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO <=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLike(String value) {
            addCriterion("ATSBILLNO like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotLike(String value) {
            addCriterion("ATSBILLNO not like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIn(List<String> values) {
            addCriterion("ATSBILLNO in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotIn(List<String> values) {
            addCriterion("ATSBILLNO not in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoBetween(String value1, String value2) {
            addCriterion("ATSBILLNO between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotBetween(String value1, String value2) {
            addCriterion("ATSBILLNO not between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNull() {
            addCriterion("SEGMENT14 is null");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNotNull() {
            addCriterion("SEGMENT14 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment14EqualTo(String value) {
            addCriterion("SEGMENT14 =", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotEqualTo(String value) {
            addCriterion("SEGMENT14 <>", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThan(String value) {
            addCriterion("SEGMENT14 >", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 >=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThan(String value) {
            addCriterion("SEGMENT14 <", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 <=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Like(String value) {
            addCriterion("SEGMENT14 like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotLike(String value) {
            addCriterion("SEGMENT14 not like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14In(List<String> values) {
            addCriterion("SEGMENT14 in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotIn(List<String> values) {
            addCriterion("SEGMENT14 not in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Between(String value1, String value2) {
            addCriterion("SEGMENT14 between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotBetween(String value1, String value2) {
            addCriterion("SEGMENT14 not between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNull() {
            addCriterion("SEGMENT15 is null");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNotNull() {
            addCriterion("SEGMENT15 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment15EqualTo(String value) {
            addCriterion("SEGMENT15 =", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotEqualTo(String value) {
            addCriterion("SEGMENT15 <>", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThan(String value) {
            addCriterion("SEGMENT15 >", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 >=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThan(String value) {
            addCriterion("SEGMENT15 <", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 <=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Like(String value) {
            addCriterion("SEGMENT15 like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotLike(String value) {
            addCriterion("SEGMENT15 not like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15In(List<String> values) {
            addCriterion("SEGMENT15 in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotIn(List<String> values) {
            addCriterion("SEGMENT15 not in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Between(String value1, String value2) {
            addCriterion("SEGMENT15 between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotBetween(String value1, String value2) {
            addCriterion("SEGMENT15 not between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNull() {
            addCriterion("SEGMENT16 is null");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNotNull() {
            addCriterion("SEGMENT16 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment16EqualTo(String value) {
            addCriterion("SEGMENT16 =", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotEqualTo(String value) {
            addCriterion("SEGMENT16 <>", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThan(String value) {
            addCriterion("SEGMENT16 >", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 >=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThan(String value) {
            addCriterion("SEGMENT16 <", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 <=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Like(String value) {
            addCriterion("SEGMENT16 like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotLike(String value) {
            addCriterion("SEGMENT16 not like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16In(List<String> values) {
            addCriterion("SEGMENT16 in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotIn(List<String> values) {
            addCriterion("SEGMENT16 not in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Between(String value1, String value2) {
            addCriterion("SEGMENT16 between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotBetween(String value1, String value2) {
            addCriterion("SEGMENT16 not between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNull() {
            addCriterion("SEGMENT17 is null");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNotNull() {
            addCriterion("SEGMENT17 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment17EqualTo(String value) {
            addCriterion("SEGMENT17 =", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotEqualTo(String value) {
            addCriterion("SEGMENT17 <>", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThan(String value) {
            addCriterion("SEGMENT17 >", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 >=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThan(String value) {
            addCriterion("SEGMENT17 <", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 <=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Like(String value) {
            addCriterion("SEGMENT17 like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotLike(String value) {
            addCriterion("SEGMENT17 not like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17In(List<String> values) {
            addCriterion("SEGMENT17 in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotIn(List<String> values) {
            addCriterion("SEGMENT17 not in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Between(String value1, String value2) {
            addCriterion("SEGMENT17 between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotBetween(String value1, String value2) {
            addCriterion("SEGMENT17 not between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNull() {
            addCriterion("SEGMENT18 is null");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNotNull() {
            addCriterion("SEGMENT18 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment18EqualTo(String value) {
            addCriterion("SEGMENT18 =", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotEqualTo(String value) {
            addCriterion("SEGMENT18 <>", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThan(String value) {
            addCriterion("SEGMENT18 >", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 >=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThan(String value) {
            addCriterion("SEGMENT18 <", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 <=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Like(String value) {
            addCriterion("SEGMENT18 like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotLike(String value) {
            addCriterion("SEGMENT18 not like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18In(List<String> values) {
            addCriterion("SEGMENT18 in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotIn(List<String> values) {
            addCriterion("SEGMENT18 not in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Between(String value1, String value2) {
            addCriterion("SEGMENT18 between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotBetween(String value1, String value2) {
            addCriterion("SEGMENT18 not between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNull() {
            addCriterion("SEGMENT19 is null");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNotNull() {
            addCriterion("SEGMENT19 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment19EqualTo(String value) {
            addCriterion("SEGMENT19 =", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotEqualTo(String value) {
            addCriterion("SEGMENT19 <>", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThan(String value) {
            addCriterion("SEGMENT19 >", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 >=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThan(String value) {
            addCriterion("SEGMENT19 <", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 <=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Like(String value) {
            addCriterion("SEGMENT19 like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotLike(String value) {
            addCriterion("SEGMENT19 not like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19In(List<String> values) {
            addCriterion("SEGMENT19 in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotIn(List<String> values) {
            addCriterion("SEGMENT19 not in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Between(String value1, String value2) {
            addCriterion("SEGMENT19 between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotBetween(String value1, String value2) {
            addCriterion("SEGMENT19 not between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNull() {
            addCriterion("SEGMENT20 is null");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNotNull() {
            addCriterion("SEGMENT20 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment20EqualTo(String value) {
            addCriterion("SEGMENT20 =", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotEqualTo(String value) {
            addCriterion("SEGMENT20 <>", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThan(String value) {
            addCriterion("SEGMENT20 >", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 >=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThan(String value) {
            addCriterion("SEGMENT20 <", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 <=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Like(String value) {
            addCriterion("SEGMENT20 like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotLike(String value) {
            addCriterion("SEGMENT20 not like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20In(List<String> values) {
            addCriterion("SEGMENT20 in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotIn(List<String> values) {
            addCriterion("SEGMENT20 not in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Between(String value1, String value2) {
            addCriterion("SEGMENT20 between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotBetween(String value1, String value2) {
            addCriterion("SEGMENT20 not between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNull() {
            addCriterion("SEGMENT21 is null");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNotNull() {
            addCriterion("SEGMENT21 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment21EqualTo(String value) {
            addCriterion("SEGMENT21 =", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotEqualTo(String value) {
            addCriterion("SEGMENT21 <>", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThan(String value) {
            addCriterion("SEGMENT21 >", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 >=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThan(String value) {
            addCriterion("SEGMENT21 <", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 <=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Like(String value) {
            addCriterion("SEGMENT21 like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotLike(String value) {
            addCriterion("SEGMENT21 not like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21In(List<String> values) {
            addCriterion("SEGMENT21 in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotIn(List<String> values) {
            addCriterion("SEGMENT21 not in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Between(String value1, String value2) {
            addCriterion("SEGMENT21 between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotBetween(String value1, String value2) {
            addCriterion("SEGMENT21 not between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNull() {
            addCriterion("SEGMENT22 is null");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNotNull() {
            addCriterion("SEGMENT22 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment22EqualTo(String value) {
            addCriterion("SEGMENT22 =", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotEqualTo(String value) {
            addCriterion("SEGMENT22 <>", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThan(String value) {
            addCriterion("SEGMENT22 >", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 >=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThan(String value) {
            addCriterion("SEGMENT22 <", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 <=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Like(String value) {
            addCriterion("SEGMENT22 like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotLike(String value) {
            addCriterion("SEGMENT22 not like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22In(List<String> values) {
            addCriterion("SEGMENT22 in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotIn(List<String> values) {
            addCriterion("SEGMENT22 not in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Between(String value1, String value2) {
            addCriterion("SEGMENT22 between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotBetween(String value1, String value2) {
            addCriterion("SEGMENT22 not between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNull() {
            addCriterion("SEGMENT23 is null");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNotNull() {
            addCriterion("SEGMENT23 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment23EqualTo(String value) {
            addCriterion("SEGMENT23 =", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotEqualTo(String value) {
            addCriterion("SEGMENT23 <>", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThan(String value) {
            addCriterion("SEGMENT23 >", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 >=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThan(String value) {
            addCriterion("SEGMENT23 <", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 <=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Like(String value) {
            addCriterion("SEGMENT23 like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotLike(String value) {
            addCriterion("SEGMENT23 not like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23In(List<String> values) {
            addCriterion("SEGMENT23 in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotIn(List<String> values) {
            addCriterion("SEGMENT23 not in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Between(String value1, String value2) {
            addCriterion("SEGMENT23 between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotBetween(String value1, String value2) {
            addCriterion("SEGMENT23 not between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNull() {
            addCriterion("SEGMENT24 is null");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNotNull() {
            addCriterion("SEGMENT24 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment24EqualTo(String value) {
            addCriterion("SEGMENT24 =", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotEqualTo(String value) {
            addCriterion("SEGMENT24 <>", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThan(String value) {
            addCriterion("SEGMENT24 >", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 >=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThan(String value) {
            addCriterion("SEGMENT24 <", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 <=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Like(String value) {
            addCriterion("SEGMENT24 like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotLike(String value) {
            addCriterion("SEGMENT24 not like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24In(List<String> values) {
            addCriterion("SEGMENT24 in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotIn(List<String> values) {
            addCriterion("SEGMENT24 not in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Between(String value1, String value2) {
            addCriterion("SEGMENT24 between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotBetween(String value1, String value2) {
            addCriterion("SEGMENT24 not between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNull() {
            addCriterion("SEGMENT25 is null");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNotNull() {
            addCriterion("SEGMENT25 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment25EqualTo(String value) {
            addCriterion("SEGMENT25 =", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotEqualTo(String value) {
            addCriterion("SEGMENT25 <>", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThan(String value) {
            addCriterion("SEGMENT25 >", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 >=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThan(String value) {
            addCriterion("SEGMENT25 <", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 <=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Like(String value) {
            addCriterion("SEGMENT25 like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotLike(String value) {
            addCriterion("SEGMENT25 not like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25In(List<String> values) {
            addCriterion("SEGMENT25 in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotIn(List<String> values) {
            addCriterion("SEGMENT25 not in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Between(String value1, String value2) {
            addCriterion("SEGMENT25 between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotBetween(String value1, String value2) {
            addCriterion("SEGMENT25 not between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNull() {
            addCriterion("SEGMENT26 is null");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNotNull() {
            addCriterion("SEGMENT26 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment26EqualTo(String value) {
            addCriterion("SEGMENT26 =", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotEqualTo(String value) {
            addCriterion("SEGMENT26 <>", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThan(String value) {
            addCriterion("SEGMENT26 >", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 >=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThan(String value) {
            addCriterion("SEGMENT26 <", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 <=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Like(String value) {
            addCriterion("SEGMENT26 like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotLike(String value) {
            addCriterion("SEGMENT26 not like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26In(List<String> values) {
            addCriterion("SEGMENT26 in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotIn(List<String> values) {
            addCriterion("SEGMENT26 not in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Between(String value1, String value2) {
            addCriterion("SEGMENT26 between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotBetween(String value1, String value2) {
            addCriterion("SEGMENT26 not between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNull() {
            addCriterion("SEGMENT27 is null");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNotNull() {
            addCriterion("SEGMENT27 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment27EqualTo(String value) {
            addCriterion("SEGMENT27 =", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotEqualTo(String value) {
            addCriterion("SEGMENT27 <>", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThan(String value) {
            addCriterion("SEGMENT27 >", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 >=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThan(String value) {
            addCriterion("SEGMENT27 <", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 <=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Like(String value) {
            addCriterion("SEGMENT27 like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotLike(String value) {
            addCriterion("SEGMENT27 not like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27In(List<String> values) {
            addCriterion("SEGMENT27 in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotIn(List<String> values) {
            addCriterion("SEGMENT27 not in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Between(String value1, String value2) {
            addCriterion("SEGMENT27 between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotBetween(String value1, String value2) {
            addCriterion("SEGMENT27 not between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNull() {
            addCriterion("SEGMENT28 is null");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNotNull() {
            addCriterion("SEGMENT28 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment28EqualTo(String value) {
            addCriterion("SEGMENT28 =", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotEqualTo(String value) {
            addCriterion("SEGMENT28 <>", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThan(String value) {
            addCriterion("SEGMENT28 >", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 >=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThan(String value) {
            addCriterion("SEGMENT28 <", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 <=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Like(String value) {
            addCriterion("SEGMENT28 like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotLike(String value) {
            addCriterion("SEGMENT28 not like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28In(List<String> values) {
            addCriterion("SEGMENT28 in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotIn(List<String> values) {
            addCriterion("SEGMENT28 not in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Between(String value1, String value2) {
            addCriterion("SEGMENT28 between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotBetween(String value1, String value2) {
            addCriterion("SEGMENT28 not between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNull() {
            addCriterion("SEGMENT29 is null");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNotNull() {
            addCriterion("SEGMENT29 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment29EqualTo(String value) {
            addCriterion("SEGMENT29 =", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotEqualTo(String value) {
            addCriterion("SEGMENT29 <>", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThan(String value) {
            addCriterion("SEGMENT29 >", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 >=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThan(String value) {
            addCriterion("SEGMENT29 <", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 <=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Like(String value) {
            addCriterion("SEGMENT29 like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotLike(String value) {
            addCriterion("SEGMENT29 not like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29In(List<String> values) {
            addCriterion("SEGMENT29 in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotIn(List<String> values) {
            addCriterion("SEGMENT29 not in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Between(String value1, String value2) {
            addCriterion("SEGMENT29 between", value1, value2, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotBetween(String value1, String value2) {
            addCriterion("SEGMENT29 not between", value1, value2, "segment29");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_voucher_to
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
     * @Table : mm_voucher_to
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