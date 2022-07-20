package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmDefaultsetTcExample {
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
    public MmDefaultsetTcExample() {
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
     * @Table : mm_defaultset_tc
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

        public Criteria andIfcuscontrolIsNull() {
            addCriterion("IFCUSCONTROL is null");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolIsNotNull() {
            addCriterion("IFCUSCONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolEqualTo(String value) {
            addCriterion("IFCUSCONTROL =", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolNotEqualTo(String value) {
            addCriterion("IFCUSCONTROL <>", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolGreaterThan(String value) {
            addCriterion("IFCUSCONTROL >", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolGreaterThanOrEqualTo(String value) {
            addCriterion("IFCUSCONTROL >=", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolLessThan(String value) {
            addCriterion("IFCUSCONTROL <", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolLessThanOrEqualTo(String value) {
            addCriterion("IFCUSCONTROL <=", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolLike(String value) {
            addCriterion("IFCUSCONTROL like", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolNotLike(String value) {
            addCriterion("IFCUSCONTROL not like", value, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolIn(List<String> values) {
            addCriterion("IFCUSCONTROL in", values, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolNotIn(List<String> values) {
            addCriterion("IFCUSCONTROL not in", values, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolBetween(String value1, String value2) {
            addCriterion("IFCUSCONTROL between", value1, value2, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andIfcuscontrolNotBetween(String value1, String value2) {
            addCriterion("IFCUSCONTROL not between", value1, value2, "ifcuscontrol");
            return (Criteria) this;
        }

        public Criteria andNextflagIsNull() {
            addCriterion("NEXTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andNextflagIsNotNull() {
            addCriterion("NEXTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNextflagEqualTo(String value) {
            addCriterion("NEXTFLAG =", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagNotEqualTo(String value) {
            addCriterion("NEXTFLAG <>", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagGreaterThan(String value) {
            addCriterion("NEXTFLAG >", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagGreaterThanOrEqualTo(String value) {
            addCriterion("NEXTFLAG >=", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagLessThan(String value) {
            addCriterion("NEXTFLAG <", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagLessThanOrEqualTo(String value) {
            addCriterion("NEXTFLAG <=", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagLike(String value) {
            addCriterion("NEXTFLAG like", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagNotLike(String value) {
            addCriterion("NEXTFLAG not like", value, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagIn(List<String> values) {
            addCriterion("NEXTFLAG in", values, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagNotIn(List<String> values) {
            addCriterion("NEXTFLAG not in", values, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagBetween(String value1, String value2) {
            addCriterion("NEXTFLAG between", value1, value2, "nextflag");
            return (Criteria) this;
        }

        public Criteria andNextflagNotBetween(String value1, String value2) {
            addCriterion("NEXTFLAG not between", value1, value2, "nextflag");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyIsNull() {
            addCriterion("IFGRADUALLY is null");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyIsNotNull() {
            addCriterion("IFGRADUALLY is not null");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyEqualTo(String value) {
            addCriterion("IFGRADUALLY =", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyNotEqualTo(String value) {
            addCriterion("IFGRADUALLY <>", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyGreaterThan(String value) {
            addCriterion("IFGRADUALLY >", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyGreaterThanOrEqualTo(String value) {
            addCriterion("IFGRADUALLY >=", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyLessThan(String value) {
            addCriterion("IFGRADUALLY <", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyLessThanOrEqualTo(String value) {
            addCriterion("IFGRADUALLY <=", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyLike(String value) {
            addCriterion("IFGRADUALLY like", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyNotLike(String value) {
            addCriterion("IFGRADUALLY not like", value, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyIn(List<String> values) {
            addCriterion("IFGRADUALLY in", values, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyNotIn(List<String> values) {
            addCriterion("IFGRADUALLY not in", values, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyBetween(String value1, String value2) {
            addCriterion("IFGRADUALLY between", value1, value2, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andIfgraduallyNotBetween(String value1, String value2) {
            addCriterion("IFGRADUALLY not between", value1, value2, "ifgradually");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysIsNull() {
            addCriterion("PASSVALIDDAYS is null");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysIsNotNull() {
            addCriterion("PASSVALIDDAYS is not null");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysEqualTo(BigDecimal value) {
            addCriterion("PASSVALIDDAYS =", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysNotEqualTo(BigDecimal value) {
            addCriterion("PASSVALIDDAYS <>", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysGreaterThan(BigDecimal value) {
            addCriterion("PASSVALIDDAYS >", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PASSVALIDDAYS >=", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysLessThan(BigDecimal value) {
            addCriterion("PASSVALIDDAYS <", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PASSVALIDDAYS <=", value, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysIn(List<BigDecimal> values) {
            addCriterion("PASSVALIDDAYS in", values, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysNotIn(List<BigDecimal> values) {
            addCriterion("PASSVALIDDAYS not in", values, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASSVALIDDAYS between", value1, value2, "passvaliddays");
            return (Criteria) this;
        }

        public Criteria andPassvaliddaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASSVALIDDAYS not between", value1, value2, "passvaliddays");
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

        public Criteria andPrinttoolIsNull() {
            addCriterion("PRINTTOOL is null");
            return (Criteria) this;
        }

        public Criteria andPrinttoolIsNotNull() {
            addCriterion("PRINTTOOL is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttoolEqualTo(String value) {
            addCriterion("PRINTTOOL =", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolNotEqualTo(String value) {
            addCriterion("PRINTTOOL <>", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolGreaterThan(String value) {
            addCriterion("PRINTTOOL >", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTTOOL >=", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolLessThan(String value) {
            addCriterion("PRINTTOOL <", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolLessThanOrEqualTo(String value) {
            addCriterion("PRINTTOOL <=", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolLike(String value) {
            addCriterion("PRINTTOOL like", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolNotLike(String value) {
            addCriterion("PRINTTOOL not like", value, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolIn(List<String> values) {
            addCriterion("PRINTTOOL in", values, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolNotIn(List<String> values) {
            addCriterion("PRINTTOOL not in", values, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolBetween(String value1, String value2) {
            addCriterion("PRINTTOOL between", value1, value2, "printtool");
            return (Criteria) this;
        }

        public Criteria andPrinttoolNotBetween(String value1, String value2) {
            addCriterion("PRINTTOOL not between", value1, value2, "printtool");
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

        public Criteria andManytomanyIsNull() {
            addCriterion("MANYTOMANY is null");
            return (Criteria) this;
        }

        public Criteria andManytomanyIsNotNull() {
            addCriterion("MANYTOMANY is not null");
            return (Criteria) this;
        }

        public Criteria andManytomanyEqualTo(String value) {
            addCriterion("MANYTOMANY =", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyNotEqualTo(String value) {
            addCriterion("MANYTOMANY <>", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyGreaterThan(String value) {
            addCriterion("MANYTOMANY >", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyGreaterThanOrEqualTo(String value) {
            addCriterion("MANYTOMANY >=", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyLessThan(String value) {
            addCriterion("MANYTOMANY <", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyLessThanOrEqualTo(String value) {
            addCriterion("MANYTOMANY <=", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyLike(String value) {
            addCriterion("MANYTOMANY like", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyNotLike(String value) {
            addCriterion("MANYTOMANY not like", value, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyIn(List<String> values) {
            addCriterion("MANYTOMANY in", values, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyNotIn(List<String> values) {
            addCriterion("MANYTOMANY not in", values, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyBetween(String value1, String value2) {
            addCriterion("MANYTOMANY between", value1, value2, "manytomany");
            return (Criteria) this;
        }

        public Criteria andManytomanyNotBetween(String value1, String value2) {
            addCriterion("MANYTOMANY not between", value1, value2, "manytomany");
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

        public Criteria andIfunitcontrolIsNull() {
            addCriterion("IFUNITCONTROL is null");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolIsNotNull() {
            addCriterion("IFUNITCONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolEqualTo(String value) {
            addCriterion("IFUNITCONTROL =", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolNotEqualTo(String value) {
            addCriterion("IFUNITCONTROL <>", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolGreaterThan(String value) {
            addCriterion("IFUNITCONTROL >", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("IFUNITCONTROL >=", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolLessThan(String value) {
            addCriterion("IFUNITCONTROL <", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolLessThanOrEqualTo(String value) {
            addCriterion("IFUNITCONTROL <=", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolLike(String value) {
            addCriterion("IFUNITCONTROL like", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolNotLike(String value) {
            addCriterion("IFUNITCONTROL not like", value, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolIn(List<String> values) {
            addCriterion("IFUNITCONTROL in", values, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolNotIn(List<String> values) {
            addCriterion("IFUNITCONTROL not in", values, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolBetween(String value1, String value2) {
            addCriterion("IFUNITCONTROL between", value1, value2, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfunitcontrolNotBetween(String value1, String value2) {
            addCriterion("IFUNITCONTROL not between", value1, value2, "ifunitcontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolIsNull() {
            addCriterion("IFBALANCECONTROL is null");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolIsNotNull() {
            addCriterion("IFBALANCECONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolEqualTo(String value) {
            addCriterion("IFBALANCECONTROL =", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolNotEqualTo(String value) {
            addCriterion("IFBALANCECONTROL <>", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolGreaterThan(String value) {
            addCriterion("IFBALANCECONTROL >", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolGreaterThanOrEqualTo(String value) {
            addCriterion("IFBALANCECONTROL >=", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolLessThan(String value) {
            addCriterion("IFBALANCECONTROL <", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolLessThanOrEqualTo(String value) {
            addCriterion("IFBALANCECONTROL <=", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolLike(String value) {
            addCriterion("IFBALANCECONTROL like", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolNotLike(String value) {
            addCriterion("IFBALANCECONTROL not like", value, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolIn(List<String> values) {
            addCriterion("IFBALANCECONTROL in", values, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolNotIn(List<String> values) {
            addCriterion("IFBALANCECONTROL not in", values, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolBetween(String value1, String value2) {
            addCriterion("IFBALANCECONTROL between", value1, value2, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andIfbalancecontrolNotBetween(String value1, String value2) {
            addCriterion("IFBALANCECONTROL not between", value1, value2, "ifbalancecontrol");
            return (Criteria) this;
        }

        public Criteria andQuerydaysIsNull() {
            addCriterion("QUERYDAYS is null");
            return (Criteria) this;
        }

        public Criteria andQuerydaysIsNotNull() {
            addCriterion("QUERYDAYS is not null");
            return (Criteria) this;
        }

        public Criteria andQuerydaysEqualTo(BigDecimal value) {
            addCriterion("QUERYDAYS =", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysNotEqualTo(BigDecimal value) {
            addCriterion("QUERYDAYS <>", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysGreaterThan(BigDecimal value) {
            addCriterion("QUERYDAYS >", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERYDAYS >=", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysLessThan(BigDecimal value) {
            addCriterion("QUERYDAYS <", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERYDAYS <=", value, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysIn(List<BigDecimal> values) {
            addCriterion("QUERYDAYS in", values, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysNotIn(List<BigDecimal> values) {
            addCriterion("QUERYDAYS not in", values, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERYDAYS between", value1, value2, "querydays");
            return (Criteria) this;
        }

        public Criteria andQuerydaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERYDAYS not between", value1, value2, "querydays");
            return (Criteria) this;
        }

        public Criteria andIfstopauditIsNull() {
            addCriterion("IFSTOPAUDIT is null");
            return (Criteria) this;
        }

        public Criteria andIfstopauditIsNotNull() {
            addCriterion("IFSTOPAUDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIfstopauditEqualTo(String value) {
            addCriterion("IFSTOPAUDIT =", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditNotEqualTo(String value) {
            addCriterion("IFSTOPAUDIT <>", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditGreaterThan(String value) {
            addCriterion("IFSTOPAUDIT >", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditGreaterThanOrEqualTo(String value) {
            addCriterion("IFSTOPAUDIT >=", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditLessThan(String value) {
            addCriterion("IFSTOPAUDIT <", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditLessThanOrEqualTo(String value) {
            addCriterion("IFSTOPAUDIT <=", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditLike(String value) {
            addCriterion("IFSTOPAUDIT like", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditNotLike(String value) {
            addCriterion("IFSTOPAUDIT not like", value, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditIn(List<String> values) {
            addCriterion("IFSTOPAUDIT in", values, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditNotIn(List<String> values) {
            addCriterion("IFSTOPAUDIT not in", values, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditBetween(String value1, String value2) {
            addCriterion("IFSTOPAUDIT between", value1, value2, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andIfstopauditNotBetween(String value1, String value2) {
            addCriterion("IFSTOPAUDIT not between", value1, value2, "ifstopaudit");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsIsNull() {
            addCriterion("AVAILABLESERVERIPS is null");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsIsNotNull() {
            addCriterion("AVAILABLESERVERIPS is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsEqualTo(String value) {
            addCriterion("AVAILABLESERVERIPS =", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsNotEqualTo(String value) {
            addCriterion("AVAILABLESERVERIPS <>", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsGreaterThan(String value) {
            addCriterion("AVAILABLESERVERIPS >", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsGreaterThanOrEqualTo(String value) {
            addCriterion("AVAILABLESERVERIPS >=", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsLessThan(String value) {
            addCriterion("AVAILABLESERVERIPS <", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsLessThanOrEqualTo(String value) {
            addCriterion("AVAILABLESERVERIPS <=", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsLike(String value) {
            addCriterion("AVAILABLESERVERIPS like", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsNotLike(String value) {
            addCriterion("AVAILABLESERVERIPS not like", value, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsIn(List<String> values) {
            addCriterion("AVAILABLESERVERIPS in", values, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsNotIn(List<String> values) {
            addCriterion("AVAILABLESERVERIPS not in", values, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsBetween(String value1, String value2) {
            addCriterion("AVAILABLESERVERIPS between", value1, value2, "availableserverips");
            return (Criteria) this;
        }

        public Criteria andAvailableserveripsNotBetween(String value1, String value2) {
            addCriterion("AVAILABLESERVERIPS not between", value1, value2, "availableserverips");
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

        public Criteria andSettleoptimesIsNull() {
            addCriterion("SETTLEOPTIMES is null");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesIsNotNull() {
            addCriterion("SETTLEOPTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesEqualTo(BigDecimal value) {
            addCriterion("SETTLEOPTIMES =", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEOPTIMES <>", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesGreaterThan(BigDecimal value) {
            addCriterion("SETTLEOPTIMES >", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEOPTIMES >=", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesLessThan(BigDecimal value) {
            addCriterion("SETTLEOPTIMES <", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEOPTIMES <=", value, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesIn(List<BigDecimal> values) {
            addCriterion("SETTLEOPTIMES in", values, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEOPTIMES not in", values, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEOPTIMES between", value1, value2, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andSettleoptimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEOPTIMES not between", value1, value2, "settleoptimes");
            return (Criteria) this;
        }

        public Criteria andIfp13loginIsNull() {
            addCriterion("IFP13LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIfp13loginIsNotNull() {
            addCriterion("IFP13LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIfp13loginEqualTo(String value) {
            addCriterion("IFP13LOGIN =", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginNotEqualTo(String value) {
            addCriterion("IFP13LOGIN <>", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginGreaterThan(String value) {
            addCriterion("IFP13LOGIN >", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginGreaterThanOrEqualTo(String value) {
            addCriterion("IFP13LOGIN >=", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginLessThan(String value) {
            addCriterion("IFP13LOGIN <", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginLessThanOrEqualTo(String value) {
            addCriterion("IFP13LOGIN <=", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginLike(String value) {
            addCriterion("IFP13LOGIN like", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginNotLike(String value) {
            addCriterion("IFP13LOGIN not like", value, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginIn(List<String> values) {
            addCriterion("IFP13LOGIN in", values, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginNotIn(List<String> values) {
            addCriterion("IFP13LOGIN not in", values, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginBetween(String value1, String value2) {
            addCriterion("IFP13LOGIN between", value1, value2, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andIfp13loginNotBetween(String value1, String value2) {
            addCriterion("IFP13LOGIN not between", value1, value2, "ifp13login");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateIsNull() {
            addCriterion("NEWINPAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateIsNotNull() {
            addCriterion("NEWINPAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateEqualTo(Date value) {
            addCriterion("NEWINPAYMENTDATE =", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateNotEqualTo(Date value) {
            addCriterion("NEWINPAYMENTDATE <>", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateGreaterThan(Date value) {
            addCriterion("NEWINPAYMENTDATE >", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("NEWINPAYMENTDATE >=", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateLessThan(Date value) {
            addCriterion("NEWINPAYMENTDATE <", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("NEWINPAYMENTDATE <=", value, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateIn(List<Date> values) {
            addCriterion("NEWINPAYMENTDATE in", values, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateNotIn(List<Date> values) {
            addCriterion("NEWINPAYMENTDATE not in", values, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateBetween(Date value1, Date value2) {
            addCriterion("NEWINPAYMENTDATE between", value1, value2, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andNewinpaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("NEWINPAYMENTDATE not between", value1, value2, "newinpaymentdate");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentIsNull() {
            addCriterion("IFNEWINPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentIsNotNull() {
            addCriterion("IFNEWINPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentEqualTo(String value) {
            addCriterion("IFNEWINPAYMENT =", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentNotEqualTo(String value) {
            addCriterion("IFNEWINPAYMENT <>", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentGreaterThan(String value) {
            addCriterion("IFNEWINPAYMENT >", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("IFNEWINPAYMENT >=", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentLessThan(String value) {
            addCriterion("IFNEWINPAYMENT <", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentLessThanOrEqualTo(String value) {
            addCriterion("IFNEWINPAYMENT <=", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentLike(String value) {
            addCriterion("IFNEWINPAYMENT like", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentNotLike(String value) {
            addCriterion("IFNEWINPAYMENT not like", value, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentIn(List<String> values) {
            addCriterion("IFNEWINPAYMENT in", values, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentNotIn(List<String> values) {
            addCriterion("IFNEWINPAYMENT not in", values, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentBetween(String value1, String value2) {
            addCriterion("IFNEWINPAYMENT between", value1, value2, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfnewinpaymentNotBetween(String value1, String value2) {
            addCriterion("IFNEWINPAYMENT not between", value1, value2, "ifnewinpayment");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeIsNull() {
            addCriterion("IFCONTROLPAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeIsNotNull() {
            addCriterion("IFCONTROLPAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeEqualTo(String value) {
            addCriterion("IFCONTROLPAYTYPE =", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeNotEqualTo(String value) {
            addCriterion("IFCONTROLPAYTYPE <>", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeGreaterThan(String value) {
            addCriterion("IFCONTROLPAYTYPE >", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("IFCONTROLPAYTYPE >=", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeLessThan(String value) {
            addCriterion("IFCONTROLPAYTYPE <", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeLessThanOrEqualTo(String value) {
            addCriterion("IFCONTROLPAYTYPE <=", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeLike(String value) {
            addCriterion("IFCONTROLPAYTYPE like", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeNotLike(String value) {
            addCriterion("IFCONTROLPAYTYPE not like", value, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeIn(List<String> values) {
            addCriterion("IFCONTROLPAYTYPE in", values, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeNotIn(List<String> values) {
            addCriterion("IFCONTROLPAYTYPE not in", values, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeBetween(String value1, String value2) {
            addCriterion("IFCONTROLPAYTYPE between", value1, value2, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfcontrolpaytypeNotBetween(String value1, String value2) {
            addCriterion("IFCONTROLPAYTYPE not between", value1, value2, "ifcontrolpaytype");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallIsNull() {
            addCriterion("IFSELECTSMALL is null");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallIsNotNull() {
            addCriterion("IFSELECTSMALL is not null");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallEqualTo(String value) {
            addCriterion("IFSELECTSMALL =", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallNotEqualTo(String value) {
            addCriterion("IFSELECTSMALL <>", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallGreaterThan(String value) {
            addCriterion("IFSELECTSMALL >", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallGreaterThanOrEqualTo(String value) {
            addCriterion("IFSELECTSMALL >=", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallLessThan(String value) {
            addCriterion("IFSELECTSMALL <", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallLessThanOrEqualTo(String value) {
            addCriterion("IFSELECTSMALL <=", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallLike(String value) {
            addCriterion("IFSELECTSMALL like", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallNotLike(String value) {
            addCriterion("IFSELECTSMALL not like", value, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallIn(List<String> values) {
            addCriterion("IFSELECTSMALL in", values, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallNotIn(List<String> values) {
            addCriterion("IFSELECTSMALL not in", values, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallBetween(String value1, String value2) {
            addCriterion("IFSELECTSMALL between", value1, value2, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfselectsmallNotBetween(String value1, String value2) {
            addCriterion("IFSELECTSMALL not between", value1, value2, "ifselectsmall");
            return (Criteria) this;
        }

        public Criteria andIfbankpayIsNull() {
            addCriterion("IFBANKPAY is null");
            return (Criteria) this;
        }

        public Criteria andIfbankpayIsNotNull() {
            addCriterion("IFBANKPAY is not null");
            return (Criteria) this;
        }

        public Criteria andIfbankpayEqualTo(String value) {
            addCriterion("IFBANKPAY =", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayNotEqualTo(String value) {
            addCriterion("IFBANKPAY <>", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayGreaterThan(String value) {
            addCriterion("IFBANKPAY >", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayGreaterThanOrEqualTo(String value) {
            addCriterion("IFBANKPAY >=", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayLessThan(String value) {
            addCriterion("IFBANKPAY <", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayLessThanOrEqualTo(String value) {
            addCriterion("IFBANKPAY <=", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayLike(String value) {
            addCriterion("IFBANKPAY like", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayNotLike(String value) {
            addCriterion("IFBANKPAY not like", value, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayIn(List<String> values) {
            addCriterion("IFBANKPAY in", values, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayNotIn(List<String> values) {
            addCriterion("IFBANKPAY not in", values, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayBetween(String value1, String value2) {
            addCriterion("IFBANKPAY between", value1, value2, "ifbankpay");
            return (Criteria) this;
        }

        public Criteria andIfbankpayNotBetween(String value1, String value2) {
            addCriterion("IFBANKPAY not between", value1, value2, "ifbankpay");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_defaultset_tc
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
     * @Table : mm_defaultset_tc
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