package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxconvertTdExample {
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
    public MmTaxconvertTdExample() {
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
     * @Table : mm_taxconvert_td
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

        public Criteria andCorenumIsNull() {
            addCriterion("CORENUM is null");
            return (Criteria) this;
        }

        public Criteria andCorenumIsNotNull() {
            addCriterion("CORENUM is not null");
            return (Criteria) this;
        }

        public Criteria andCorenumEqualTo(String value) {
            addCriterion("CORENUM =", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumNotEqualTo(String value) {
            addCriterion("CORENUM <>", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumGreaterThan(String value) {
            addCriterion("CORENUM >", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumGreaterThanOrEqualTo(String value) {
            addCriterion("CORENUM >=", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumLessThan(String value) {
            addCriterion("CORENUM <", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumLessThanOrEqualTo(String value) {
            addCriterion("CORENUM <=", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumLike(String value) {
            addCriterion("CORENUM like", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumNotLike(String value) {
            addCriterion("CORENUM not like", value, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumIn(List<String> values) {
            addCriterion("CORENUM in", values, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumNotIn(List<String> values) {
            addCriterion("CORENUM not in", values, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumBetween(String value1, String value2) {
            addCriterion("CORENUM between", value1, value2, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenumNotBetween(String value1, String value2) {
            addCriterion("CORENUM not between", value1, value2, "corenum");
            return (Criteria) this;
        }

        public Criteria andCorenameIsNull() {
            addCriterion("CORENAME is null");
            return (Criteria) this;
        }

        public Criteria andCorenameIsNotNull() {
            addCriterion("CORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCorenameEqualTo(String value) {
            addCriterion("CORENAME =", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameNotEqualTo(String value) {
            addCriterion("CORENAME <>", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameGreaterThan(String value) {
            addCriterion("CORENAME >", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameGreaterThanOrEqualTo(String value) {
            addCriterion("CORENAME >=", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameLessThan(String value) {
            addCriterion("CORENAME <", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameLessThanOrEqualTo(String value) {
            addCriterion("CORENAME <=", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameLike(String value) {
            addCriterion("CORENAME like", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameNotLike(String value) {
            addCriterion("CORENAME not like", value, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameIn(List<String> values) {
            addCriterion("CORENAME in", values, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameNotIn(List<String> values) {
            addCriterion("CORENAME not in", values, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameBetween(String value1, String value2) {
            addCriterion("CORENAME between", value1, value2, "corename");
            return (Criteria) this;
        }

        public Criteria andCorenameNotBetween(String value1, String value2) {
            addCriterion("CORENAME not between", value1, value2, "corename");
            return (Criteria) this;
        }

        public Criteria andReportnumIsNull() {
            addCriterion("REPORTNUM is null");
            return (Criteria) this;
        }

        public Criteria andReportnumIsNotNull() {
            addCriterion("REPORTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andReportnumEqualTo(String value) {
            addCriterion("REPORTNUM =", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotEqualTo(String value) {
            addCriterion("REPORTNUM <>", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThan(String value) {
            addCriterion("REPORTNUM >", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTNUM >=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThan(String value) {
            addCriterion("REPORTNUM <", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThanOrEqualTo(String value) {
            addCriterion("REPORTNUM <=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLike(String value) {
            addCriterion("REPORTNUM like", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotLike(String value) {
            addCriterion("REPORTNUM not like", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumIn(List<String> values) {
            addCriterion("REPORTNUM in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotIn(List<String> values) {
            addCriterion("REPORTNUM not in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumBetween(String value1, String value2) {
            addCriterion("REPORTNUM between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotBetween(String value1, String value2) {
            addCriterion("REPORTNUM not between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNull() {
            addCriterion("REPORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNotNull() {
            addCriterion("REPORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportnameEqualTo(String value) {
            addCriterion("REPORTNAME =", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotEqualTo(String value) {
            addCriterion("REPORTNAME <>", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThan(String value) {
            addCriterion("REPORTNAME >", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTNAME >=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThan(String value) {
            addCriterion("REPORTNAME <", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThanOrEqualTo(String value) {
            addCriterion("REPORTNAME <=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLike(String value) {
            addCriterion("REPORTNAME like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotLike(String value) {
            addCriterion("REPORTNAME not like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameIn(List<String> values) {
            addCriterion("REPORTNAME in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotIn(List<String> values) {
            addCriterion("REPORTNAME not in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameBetween(String value1, String value2) {
            addCriterion("REPORTNAME between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotBetween(String value1, String value2) {
            addCriterion("REPORTNAME not between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNull() {
            addCriterion("IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("IFVALID =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("IFVALID <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("IFVALID >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IFVALID >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("IFVALID <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("IFVALID <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("IFVALID like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("IFVALID not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("IFVALID in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("IFVALID not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("IFVALID between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("IFVALID not between", value1, value2, "ifvalid");
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

        public Criteria andSubcompanynameIsNull() {
            addCriterion("SUBCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIsNotNull() {
            addCriterion("SUBCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME =", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <>", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThan(String value) {
            addCriterion("SUBCOMPANYNAME >", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME >=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThan(String value) {
            addCriterion("SUBCOMPANYNAME <", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLike(String value) {
            addCriterion("SUBCOMPANYNAME like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotLike(String value) {
            addCriterion("SUBCOMPANYNAME not like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME not in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME not between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNull() {
            addCriterion("YEARTAXSTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNotNull() {
            addCriterion("YEARTAXSTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD =", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <>", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThan(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD >", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD >=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThan(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIn(List<BigDecimal> values) {
            addCriterion("YEARTAXSTANDARD in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotIn(List<BigDecimal> values) {
            addCriterion("YEARTAXSTANDARD not in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARTAXSTANDARD between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARTAXSTANDARD not between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxconvert_td
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
     * @Table : mm_taxconvert_td
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