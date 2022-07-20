package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmConversionrateTcExample {
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
    public MmConversionrateTcExample() {
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
     * @Table : mm_conversionrate_tc
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

        public Criteria andSeqrateIsNull() {
            addCriterion("SEQRATE is null");
            return (Criteria) this;
        }

        public Criteria andSeqrateIsNotNull() {
            addCriterion("SEQRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqrateEqualTo(Long value) {
            addCriterion("SEQRATE =", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateNotEqualTo(Long value) {
            addCriterion("SEQRATE <>", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateGreaterThan(Long value) {
            addCriterion("SEQRATE >", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQRATE >=", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateLessThan(Long value) {
            addCriterion("SEQRATE <", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateLessThanOrEqualTo(Long value) {
            addCriterion("SEQRATE <=", value, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateIn(List<Long> values) {
            addCriterion("SEQRATE in", values, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateNotIn(List<Long> values) {
            addCriterion("SEQRATE not in", values, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateBetween(Long value1, Long value2) {
            addCriterion("SEQRATE between", value1, value2, "seqrate");
            return (Criteria) this;
        }

        public Criteria andSeqrateNotBetween(Long value1, Long value2) {
            addCriterion("SEQRATE not between", value1, value2, "seqrate");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1IsNull() {
            addCriterion("CURRENCYCODE1 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1IsNotNull() {
            addCriterion("CURRENCYCODE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1EqualTo(String value) {
            addCriterion("CURRENCYCODE1 =", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1NotEqualTo(String value) {
            addCriterion("CURRENCYCODE1 <>", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1GreaterThan(String value) {
            addCriterion("CURRENCYCODE1 >", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE1 >=", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1LessThan(String value) {
            addCriterion("CURRENCYCODE1 <", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE1 <=", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1Like(String value) {
            addCriterion("CURRENCYCODE1 like", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1NotLike(String value) {
            addCriterion("CURRENCYCODE1 not like", value, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1In(List<String> values) {
            addCriterion("CURRENCYCODE1 in", values, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1NotIn(List<String> values) {
            addCriterion("CURRENCYCODE1 not in", values, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1Between(String value1, String value2) {
            addCriterion("CURRENCYCODE1 between", value1, value2, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode1NotBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE1 not between", value1, value2, "currencycode1");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2IsNull() {
            addCriterion("CURRENCYCODE2 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2IsNotNull() {
            addCriterion("CURRENCYCODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2EqualTo(String value) {
            addCriterion("CURRENCYCODE2 =", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2NotEqualTo(String value) {
            addCriterion("CURRENCYCODE2 <>", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2GreaterThan(String value) {
            addCriterion("CURRENCYCODE2 >", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE2 >=", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2LessThan(String value) {
            addCriterion("CURRENCYCODE2 <", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE2 <=", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2Like(String value) {
            addCriterion("CURRENCYCODE2 like", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2NotLike(String value) {
            addCriterion("CURRENCYCODE2 not like", value, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2In(List<String> values) {
            addCriterion("CURRENCYCODE2 in", values, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2NotIn(List<String> values) {
            addCriterion("CURRENCYCODE2 not in", values, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2Between(String value1, String value2) {
            addCriterion("CURRENCYCODE2 between", value1, value2, "currencycode2");
            return (Criteria) this;
        }

        public Criteria andCurrencycode2NotBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE2 not between", value1, value2, "currencycode2");
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

        public Criteria andRecorddateIsNull() {
            addCriterion("RECORDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNotNull() {
            addCriterion("RECORDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecorddateEqualTo(Date value) {
            addCriterion("RECORDDATE =", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotEqualTo(Date value) {
            addCriterion("RECORDDATE <>", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThan(Date value) {
            addCriterion("RECORDDATE >", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORDDATE >=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThan(Date value) {
            addCriterion("RECORDDATE <", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThanOrEqualTo(Date value) {
            addCriterion("RECORDDATE <=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateIn(List<Date> values) {
            addCriterion("RECORDDATE in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotIn(List<Date> values) {
            addCriterion("RECORDDATE not in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateBetween(Date value1, Date value2) {
            addCriterion("RECORDDATE between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotBetween(Date value1, Date value2) {
            addCriterion("RECORDDATE not between", value1, value2, "recorddate");
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

        public Criteria andCurrencysign1IsNull() {
            addCriterion("CURRENCYSIGN1 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1IsNotNull() {
            addCriterion("CURRENCYSIGN1 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1EqualTo(String value) {
            addCriterion("CURRENCYSIGN1 =", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1NotEqualTo(String value) {
            addCriterion("CURRENCYSIGN1 <>", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1GreaterThan(String value) {
            addCriterion("CURRENCYSIGN1 >", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN1 >=", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1LessThan(String value) {
            addCriterion("CURRENCYSIGN1 <", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN1 <=", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1Like(String value) {
            addCriterion("CURRENCYSIGN1 like", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1NotLike(String value) {
            addCriterion("CURRENCYSIGN1 not like", value, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1In(List<String> values) {
            addCriterion("CURRENCYSIGN1 in", values, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1NotIn(List<String> values) {
            addCriterion("CURRENCYSIGN1 not in", values, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1Between(String value1, String value2) {
            addCriterion("CURRENCYSIGN1 between", value1, value2, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign1NotBetween(String value1, String value2) {
            addCriterion("CURRENCYSIGN1 not between", value1, value2, "currencysign1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1IsNull() {
            addCriterion("CURRENCYNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1IsNotNull() {
            addCriterion("CURRENCYNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1EqualTo(String value) {
            addCriterion("CURRENCYNAME1 =", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1NotEqualTo(String value) {
            addCriterion("CURRENCYNAME1 <>", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1GreaterThan(String value) {
            addCriterion("CURRENCYNAME1 >", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME1 >=", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1LessThan(String value) {
            addCriterion("CURRENCYNAME1 <", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME1 <=", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1Like(String value) {
            addCriterion("CURRENCYNAME1 like", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1NotLike(String value) {
            addCriterion("CURRENCYNAME1 not like", value, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1In(List<String> values) {
            addCriterion("CURRENCYNAME1 in", values, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1NotIn(List<String> values) {
            addCriterion("CURRENCYNAME1 not in", values, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1Between(String value1, String value2) {
            addCriterion("CURRENCYNAME1 between", value1, value2, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencyname1NotBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME1 not between", value1, value2, "currencyname1");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2IsNull() {
            addCriterion("CURRENCYSIGN2 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2IsNotNull() {
            addCriterion("CURRENCYSIGN2 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2EqualTo(String value) {
            addCriterion("CURRENCYSIGN2 =", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2NotEqualTo(String value) {
            addCriterion("CURRENCYSIGN2 <>", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2GreaterThan(String value) {
            addCriterion("CURRENCYSIGN2 >", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN2 >=", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2LessThan(String value) {
            addCriterion("CURRENCYSIGN2 <", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYSIGN2 <=", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2Like(String value) {
            addCriterion("CURRENCYSIGN2 like", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2NotLike(String value) {
            addCriterion("CURRENCYSIGN2 not like", value, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2In(List<String> values) {
            addCriterion("CURRENCYSIGN2 in", values, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2NotIn(List<String> values) {
            addCriterion("CURRENCYSIGN2 not in", values, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2Between(String value1, String value2) {
            addCriterion("CURRENCYSIGN2 between", value1, value2, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencysign2NotBetween(String value1, String value2) {
            addCriterion("CURRENCYSIGN2 not between", value1, value2, "currencysign2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2IsNull() {
            addCriterion("CURRENCYNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2IsNotNull() {
            addCriterion("CURRENCYNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2EqualTo(String value) {
            addCriterion("CURRENCYNAME2 =", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2NotEqualTo(String value) {
            addCriterion("CURRENCYNAME2 <>", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2GreaterThan(String value) {
            addCriterion("CURRENCYNAME2 >", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2GreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME2 >=", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2LessThan(String value) {
            addCriterion("CURRENCYNAME2 <", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2LessThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME2 <=", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2Like(String value) {
            addCriterion("CURRENCYNAME2 like", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2NotLike(String value) {
            addCriterion("CURRENCYNAME2 not like", value, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2In(List<String> values) {
            addCriterion("CURRENCYNAME2 in", values, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2NotIn(List<String> values) {
            addCriterion("CURRENCYNAME2 not in", values, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2Between(String value1, String value2) {
            addCriterion("CURRENCYNAME2 between", value1, value2, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andCurrencyname2NotBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME2 not between", value1, value2, "currencyname2");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_conversionrate_tc
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
     * @Table : mm_conversionrate_tc
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