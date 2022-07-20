package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmAccperiodTdExample {
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
    public MmAccperiodTdExample() {
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
     * @Table : mm_accperiod_td
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

        public Criteria andAccountyearIsNull() {
            addCriterion("ACCOUNTYEAR is null");
            return (Criteria) this;
        }

        public Criteria andAccountyearIsNotNull() {
            addCriterion("ACCOUNTYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountyearEqualTo(Long value) {
            addCriterion("ACCOUNTYEAR =", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotEqualTo(Long value) {
            addCriterion("ACCOUNTYEAR <>", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearGreaterThan(Long value) {
            addCriterion("ACCOUNTYEAR >", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTYEAR >=", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearLessThan(Long value) {
            addCriterion("ACCOUNTYEAR <", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTYEAR <=", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearIn(List<Long> values) {
            addCriterion("ACCOUNTYEAR in", values, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotIn(List<Long> values) {
            addCriterion("ACCOUNTYEAR not in", values, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTYEAR between", value1, value2, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTYEAR not between", value1, value2, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIsNull() {
            addCriterion("ACCOUNTMONTH is null");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIsNotNull() {
            addCriterion("ACCOUNTMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andAccountmonthEqualTo(Long value) {
            addCriterion("ACCOUNTMONTH =", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotEqualTo(Long value) {
            addCriterion("ACCOUNTMONTH <>", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthGreaterThan(Long value) {
            addCriterion("ACCOUNTMONTH >", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTMONTH >=", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthLessThan(Long value) {
            addCriterion("ACCOUNTMONTH <", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTMONTH <=", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIn(List<Long> values) {
            addCriterion("ACCOUNTMONTH in", values, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotIn(List<Long> values) {
            addCriterion("ACCOUNTMONTH not in", values, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTMONTH between", value1, value2, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTMONTH not between", value1, value2, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccstartdateIsNull() {
            addCriterion("ACCSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccstartdateIsNotNull() {
            addCriterion("ACCSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE =", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE <>", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE >", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE >=", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateLessThan(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE <", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCSTARTDATE <=", value, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCSTARTDATE in", values, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCSTARTDATE not in", values, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCSTARTDATE between", value1, value2, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCSTARTDATE not between", value1, value2, "accstartdate");
            return (Criteria) this;
        }

        public Criteria andAccenddateIsNull() {
            addCriterion("ACCENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccenddateIsNotNull() {
            addCriterion("ACCENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccenddateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCENDDATE =", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCENDDATE <>", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCENDDATE >", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCENDDATE >=", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateLessThan(Date value) {
            addCriterionForJDBCDate("ACCENDDATE <", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCENDDATE <=", value, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCENDDATE in", values, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCENDDATE not in", values, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCENDDATE between", value1, value2, "accenddate");
            return (Criteria) this;
        }

        public Criteria andAccenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCENDDATE not between", value1, value2, "accenddate");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNull() {
            addCriterion("ISCLOSED is null");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNotNull() {
            addCriterion("ISCLOSED is not null");
            return (Criteria) this;
        }

        public Criteria andIsclosedEqualTo(String value) {
            addCriterion("ISCLOSED =", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotEqualTo(String value) {
            addCriterion("ISCLOSED <>", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThan(String value) {
            addCriterion("ISCLOSED >", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThanOrEqualTo(String value) {
            addCriterion("ISCLOSED >=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThan(String value) {
            addCriterion("ISCLOSED <", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThanOrEqualTo(String value) {
            addCriterion("ISCLOSED <=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLike(String value) {
            addCriterion("ISCLOSED like", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotLike(String value) {
            addCriterion("ISCLOSED not like", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedIn(List<String> values) {
            addCriterion("ISCLOSED in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotIn(List<String> values) {
            addCriterion("ISCLOSED not in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedBetween(String value1, String value2) {
            addCriterion("ISCLOSED between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotBetween(String value1, String value2) {
            addCriterion("ISCLOSED not between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthIsNull() {
            addCriterion("ACCOUNTYEARMONTH is null");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthIsNotNull() {
            addCriterion("ACCOUNTYEARMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthEqualTo(String value) {
            addCriterion("ACCOUNTYEARMONTH =", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthNotEqualTo(String value) {
            addCriterion("ACCOUNTYEARMONTH <>", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthGreaterThan(String value) {
            addCriterion("ACCOUNTYEARMONTH >", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYEARMONTH >=", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthLessThan(String value) {
            addCriterion("ACCOUNTYEARMONTH <", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYEARMONTH <=", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthLike(String value) {
            addCriterion("ACCOUNTYEARMONTH like", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthNotLike(String value) {
            addCriterion("ACCOUNTYEARMONTH not like", value, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthIn(List<String> values) {
            addCriterion("ACCOUNTYEARMONTH in", values, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthNotIn(List<String> values) {
            addCriterion("ACCOUNTYEARMONTH not in", values, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthBetween(String value1, String value2) {
            addCriterion("ACCOUNTYEARMONTH between", value1, value2, "accountyearmonth");
            return (Criteria) this;
        }

        public Criteria andAccountyearmonthNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTYEARMONTH not between", value1, value2, "accountyearmonth");
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

        public Criteria andOpttypeIsNull() {
            addCriterion("OPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNotNull() {
            addCriterion("OPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpttypeEqualTo(String value) {
            addCriterion("OPTTYPE =", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotEqualTo(String value) {
            addCriterion("OPTTYPE <>", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThan(String value) {
            addCriterion("OPTTYPE >", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTTYPE >=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThan(String value) {
            addCriterion("OPTTYPE <", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThanOrEqualTo(String value) {
            addCriterion("OPTTYPE <=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLike(String value) {
            addCriterion("OPTTYPE like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotLike(String value) {
            addCriterion("OPTTYPE not like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeIn(List<String> values) {
            addCriterion("OPTTYPE in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotIn(List<String> values) {
            addCriterion("OPTTYPE not in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeBetween(String value1, String value2) {
            addCriterion("OPTTYPE between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotBetween(String value1, String value2) {
            addCriterion("OPTTYPE not between", value1, value2, "opttype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_accperiod_td
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
     * @Table : mm_accperiod_td
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