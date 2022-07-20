package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmClassescodemappingInTcExample {
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
    public MmClassescodemappingInTcExample() {
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
     * @Table : mm_classescodemapping_in_tc
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

        public Criteria andErpclassescodeIsNull() {
            addCriterion("ERPCLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeIsNotNull() {
            addCriterion("ERPCLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeEqualTo(Long value) {
            addCriterion("ERPCLASSESCODE =", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeNotEqualTo(Long value) {
            addCriterion("ERPCLASSESCODE <>", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeGreaterThan(Long value) {
            addCriterion("ERPCLASSESCODE >", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ERPCLASSESCODE >=", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeLessThan(Long value) {
            addCriterion("ERPCLASSESCODE <", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeLessThanOrEqualTo(Long value) {
            addCriterion("ERPCLASSESCODE <=", value, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeIn(List<Long> values) {
            addCriterion("ERPCLASSESCODE in", values, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeNotIn(List<Long> values) {
            addCriterion("ERPCLASSESCODE not in", values, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeBetween(Long value1, Long value2) {
            addCriterion("ERPCLASSESCODE between", value1, value2, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andErpclassescodeNotBetween(Long value1, Long value2) {
            addCriterion("ERPCLASSESCODE not between", value1, value2, "erpclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeIsNull() {
            addCriterion("BUSCLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeIsNotNull() {
            addCriterion("BUSCLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeEqualTo(Long value) {
            addCriterion("BUSCLASSESCODE =", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeNotEqualTo(Long value) {
            addCriterion("BUSCLASSESCODE <>", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeGreaterThan(Long value) {
            addCriterion("BUSCLASSESCODE >", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSCLASSESCODE >=", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeLessThan(Long value) {
            addCriterion("BUSCLASSESCODE <", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeLessThanOrEqualTo(Long value) {
            addCriterion("BUSCLASSESCODE <=", value, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeIn(List<Long> values) {
            addCriterion("BUSCLASSESCODE in", values, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeNotIn(List<Long> values) {
            addCriterion("BUSCLASSESCODE not in", values, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeBetween(Long value1, Long value2) {
            addCriterion("BUSCLASSESCODE between", value1, value2, "busclassescode");
            return (Criteria) this;
        }

        public Criteria andBusclassescodeNotBetween(Long value1, Long value2) {
            addCriterion("BUSCLASSESCODE not between", value1, value2, "busclassescode");
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

        public Criteria andClasskindIsNull() {
            addCriterion("CLASSKIND is null");
            return (Criteria) this;
        }

        public Criteria andClasskindIsNotNull() {
            addCriterion("CLASSKIND is not null");
            return (Criteria) this;
        }

        public Criteria andClasskindEqualTo(String value) {
            addCriterion("CLASSKIND =", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindNotEqualTo(String value) {
            addCriterion("CLASSKIND <>", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindGreaterThan(String value) {
            addCriterion("CLASSKIND >", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSKIND >=", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindLessThan(String value) {
            addCriterion("CLASSKIND <", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindLessThanOrEqualTo(String value) {
            addCriterion("CLASSKIND <=", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindLike(String value) {
            addCriterion("CLASSKIND like", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindNotLike(String value) {
            addCriterion("CLASSKIND not like", value, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindIn(List<String> values) {
            addCriterion("CLASSKIND in", values, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindNotIn(List<String> values) {
            addCriterion("CLASSKIND not in", values, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindBetween(String value1, String value2) {
            addCriterion("CLASSKIND between", value1, value2, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindNotBetween(String value1, String value2) {
            addCriterion("CLASSKIND not between", value1, value2, "classkind");
            return (Criteria) this;
        }

        public Criteria andClasskindnameIsNull() {
            addCriterion("CLASSKINDNAME is null");
            return (Criteria) this;
        }

        public Criteria andClasskindnameIsNotNull() {
            addCriterion("CLASSKINDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClasskindnameEqualTo(String value) {
            addCriterion("CLASSKINDNAME =", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameNotEqualTo(String value) {
            addCriterion("CLASSKINDNAME <>", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameGreaterThan(String value) {
            addCriterion("CLASSKINDNAME >", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSKINDNAME >=", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameLessThan(String value) {
            addCriterion("CLASSKINDNAME <", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSKINDNAME <=", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameLike(String value) {
            addCriterion("CLASSKINDNAME like", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameNotLike(String value) {
            addCriterion("CLASSKINDNAME not like", value, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameIn(List<String> values) {
            addCriterion("CLASSKINDNAME in", values, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameNotIn(List<String> values) {
            addCriterion("CLASSKINDNAME not in", values, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameBetween(String value1, String value2) {
            addCriterion("CLASSKINDNAME between", value1, value2, "classkindname");
            return (Criteria) this;
        }

        public Criteria andClasskindnameNotBetween(String value1, String value2) {
            addCriterion("CLASSKINDNAME not between", value1, value2, "classkindname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameIsNull() {
            addCriterion("ERPCLASSESNAME is null");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameIsNotNull() {
            addCriterion("ERPCLASSESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameEqualTo(String value) {
            addCriterion("ERPCLASSESNAME =", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameNotEqualTo(String value) {
            addCriterion("ERPCLASSESNAME <>", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameGreaterThan(String value) {
            addCriterion("ERPCLASSESNAME >", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameGreaterThanOrEqualTo(String value) {
            addCriterion("ERPCLASSESNAME >=", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameLessThan(String value) {
            addCriterion("ERPCLASSESNAME <", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameLessThanOrEqualTo(String value) {
            addCriterion("ERPCLASSESNAME <=", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameLike(String value) {
            addCriterion("ERPCLASSESNAME like", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameNotLike(String value) {
            addCriterion("ERPCLASSESNAME not like", value, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameIn(List<String> values) {
            addCriterion("ERPCLASSESNAME in", values, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameNotIn(List<String> values) {
            addCriterion("ERPCLASSESNAME not in", values, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameBetween(String value1, String value2) {
            addCriterion("ERPCLASSESNAME between", value1, value2, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andErpclassesnameNotBetween(String value1, String value2) {
            addCriterion("ERPCLASSESNAME not between", value1, value2, "erpclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameIsNull() {
            addCriterion("BUSCLASSESNAME is null");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameIsNotNull() {
            addCriterion("BUSCLASSESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameEqualTo(String value) {
            addCriterion("BUSCLASSESNAME =", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameNotEqualTo(String value) {
            addCriterion("BUSCLASSESNAME <>", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameGreaterThan(String value) {
            addCriterion("BUSCLASSESNAME >", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSCLASSESNAME >=", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameLessThan(String value) {
            addCriterion("BUSCLASSESNAME <", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameLessThanOrEqualTo(String value) {
            addCriterion("BUSCLASSESNAME <=", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameLike(String value) {
            addCriterion("BUSCLASSESNAME like", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameNotLike(String value) {
            addCriterion("BUSCLASSESNAME not like", value, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameIn(List<String> values) {
            addCriterion("BUSCLASSESNAME in", values, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameNotIn(List<String> values) {
            addCriterion("BUSCLASSESNAME not in", values, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameBetween(String value1, String value2) {
            addCriterion("BUSCLASSESNAME between", value1, value2, "busclassesname");
            return (Criteria) this;
        }

        public Criteria andBusclassesnameNotBetween(String value1, String value2) {
            addCriterion("BUSCLASSESNAME not between", value1, value2, "busclassesname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_classescodemapping_in_tc
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
     * @Table : mm_classescodemapping_in_tc
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