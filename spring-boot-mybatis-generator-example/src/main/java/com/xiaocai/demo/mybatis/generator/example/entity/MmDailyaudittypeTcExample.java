package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmDailyaudittypeTcExample {
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
    public MmDailyaudittypeTcExample() {
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
     * @Table : mm_dailyaudittype_tc
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

        public Criteria andDailyaudittypeIsNull() {
            addCriterion("DAILYAUDITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeIsNotNull() {
            addCriterion("DAILYAUDITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE =", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE <>", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeGreaterThan(String value) {
            addCriterion("DAILYAUDITTYPE >", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE >=", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLessThan(String value) {
            addCriterion("DAILYAUDITTYPE <", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE <=", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLike(String value) {
            addCriterion("DAILYAUDITTYPE like", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotLike(String value) {
            addCriterion("DAILYAUDITTYPE not like", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeIn(List<String> values) {
            addCriterion("DAILYAUDITTYPE in", values, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotIn(List<String> values) {
            addCriterion("DAILYAUDITTYPE not in", values, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeBetween(String value1, String value2) {
            addCriterion("DAILYAUDITTYPE between", value1, value2, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITTYPE not between", value1, value2, "dailyaudittype");
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

        public Criteria andDailyauditcodeIsNull() {
            addCriterion("DAILYAUDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeIsNotNull() {
            addCriterion("DAILYAUDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeEqualTo(String value) {
            addCriterion("DAILYAUDITCODE =", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeNotEqualTo(String value) {
            addCriterion("DAILYAUDITCODE <>", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeGreaterThan(String value) {
            addCriterion("DAILYAUDITCODE >", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITCODE >=", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeLessThan(String value) {
            addCriterion("DAILYAUDITCODE <", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITCODE <=", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeLike(String value) {
            addCriterion("DAILYAUDITCODE like", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeNotLike(String value) {
            addCriterion("DAILYAUDITCODE not like", value, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeIn(List<String> values) {
            addCriterion("DAILYAUDITCODE in", values, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeNotIn(List<String> values) {
            addCriterion("DAILYAUDITCODE not in", values, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeBetween(String value1, String value2) {
            addCriterion("DAILYAUDITCODE between", value1, value2, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditcodeNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITCODE not between", value1, value2, "dailyauditcode");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameIsNull() {
            addCriterion("DAILYAUDITNAME is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameIsNotNull() {
            addCriterion("DAILYAUDITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameEqualTo(String value) {
            addCriterion("DAILYAUDITNAME =", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameNotEqualTo(String value) {
            addCriterion("DAILYAUDITNAME <>", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameGreaterThan(String value) {
            addCriterion("DAILYAUDITNAME >", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNAME >=", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameLessThan(String value) {
            addCriterion("DAILYAUDITNAME <", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNAME <=", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameLike(String value) {
            addCriterion("DAILYAUDITNAME like", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameNotLike(String value) {
            addCriterion("DAILYAUDITNAME not like", value, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameIn(List<String> values) {
            addCriterion("DAILYAUDITNAME in", values, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameNotIn(List<String> values) {
            addCriterion("DAILYAUDITNAME not in", values, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNAME between", value1, value2, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andDailyauditnameNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNAME not between", value1, value2, "dailyauditname");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNull() {
            addCriterion("IFCHECK is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNotNull() {
            addCriterion("IFCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckEqualTo(String value) {
            addCriterion("IFCHECK =", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotEqualTo(String value) {
            addCriterion("IFCHECK <>", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThan(String value) {
            addCriterion("IFCHECK >", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECK >=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThan(String value) {
            addCriterion("IFCHECK <", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThanOrEqualTo(String value) {
            addCriterion("IFCHECK <=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLike(String value) {
            addCriterion("IFCHECK like", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotLike(String value) {
            addCriterion("IFCHECK not like", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckIn(List<String> values) {
            addCriterion("IFCHECK in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotIn(List<String> values) {
            addCriterion("IFCHECK not in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckBetween(String value1, String value2) {
            addCriterion("IFCHECK between", value1, value2, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotBetween(String value1, String value2) {
            addCriterion("IFCHECK not between", value1, value2, "ifcheck");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_dailyaudittype_tc
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
     * @Table : mm_dailyaudittype_tc
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