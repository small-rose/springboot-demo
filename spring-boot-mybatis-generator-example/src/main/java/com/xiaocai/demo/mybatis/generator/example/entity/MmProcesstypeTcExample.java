package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmProcesstypeTcExample {
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
    public MmProcesstypeTcExample() {
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
     * @Table : mm_processtype_tc
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

        public Criteria andProcesstypeIsNull() {
            addCriterion("PROCESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProcesstypeIsNotNull() {
            addCriterion("PROCESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstypeEqualTo(String value) {
            addCriterion("PROCESSTYPE =", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotEqualTo(String value) {
            addCriterion("PROCESSTYPE <>", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeGreaterThan(String value) {
            addCriterion("PROCESSTYPE >", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE >=", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLessThan(String value) {
            addCriterion("PROCESSTYPE <", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE <=", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLike(String value) {
            addCriterion("PROCESSTYPE like", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotLike(String value) {
            addCriterion("PROCESSTYPE not like", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeIn(List<String> values) {
            addCriterion("PROCESSTYPE in", values, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotIn(List<String> values) {
            addCriterion("PROCESSTYPE not in", values, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE between", value1, value2, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE not between", value1, value2, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcessnameIsNull() {
            addCriterion("PROCESSNAME is null");
            return (Criteria) this;
        }

        public Criteria andProcessnameIsNotNull() {
            addCriterion("PROCESSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessnameEqualTo(String value) {
            addCriterion("PROCESSNAME =", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameNotEqualTo(String value) {
            addCriterion("PROCESSNAME <>", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameGreaterThan(String value) {
            addCriterion("PROCESSNAME >", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSNAME >=", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameLessThan(String value) {
            addCriterion("PROCESSNAME <", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameLessThanOrEqualTo(String value) {
            addCriterion("PROCESSNAME <=", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameLike(String value) {
            addCriterion("PROCESSNAME like", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameNotLike(String value) {
            addCriterion("PROCESSNAME not like", value, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameIn(List<String> values) {
            addCriterion("PROCESSNAME in", values, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameNotIn(List<String> values) {
            addCriterion("PROCESSNAME not in", values, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameBetween(String value1, String value2) {
            addCriterion("PROCESSNAME between", value1, value2, "processname");
            return (Criteria) this;
        }

        public Criteria andProcessnameNotBetween(String value1, String value2) {
            addCriterion("PROCESSNAME not between", value1, value2, "processname");
            return (Criteria) this;
        }

        public Criteria andProcesskindIsNull() {
            addCriterion("PROCESSKIND is null");
            return (Criteria) this;
        }

        public Criteria andProcesskindIsNotNull() {
            addCriterion("PROCESSKIND is not null");
            return (Criteria) this;
        }

        public Criteria andProcesskindEqualTo(String value) {
            addCriterion("PROCESSKIND =", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotEqualTo(String value) {
            addCriterion("PROCESSKIND <>", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindGreaterThan(String value) {
            addCriterion("PROCESSKIND >", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSKIND >=", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLessThan(String value) {
            addCriterion("PROCESSKIND <", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLessThanOrEqualTo(String value) {
            addCriterion("PROCESSKIND <=", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLike(String value) {
            addCriterion("PROCESSKIND like", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotLike(String value) {
            addCriterion("PROCESSKIND not like", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindIn(List<String> values) {
            addCriterion("PROCESSKIND in", values, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotIn(List<String> values) {
            addCriterion("PROCESSKIND not in", values, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindBetween(String value1, String value2) {
            addCriterion("PROCESSKIND between", value1, value2, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotBetween(String value1, String value2) {
            addCriterion("PROCESSKIND not between", value1, value2, "processkind");
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

        public Criteria andPasswordopdateIsNull() {
            addCriterion("PASSWORDOPDATE is null");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateIsNotNull() {
            addCriterion("PASSWORDOPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateEqualTo(Date value) {
            addCriterion("PASSWORDOPDATE =", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateNotEqualTo(Date value) {
            addCriterion("PASSWORDOPDATE <>", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateGreaterThan(Date value) {
            addCriterion("PASSWORDOPDATE >", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PASSWORDOPDATE >=", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateLessThan(Date value) {
            addCriterion("PASSWORDOPDATE <", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateLessThanOrEqualTo(Date value) {
            addCriterion("PASSWORDOPDATE <=", value, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateIn(List<Date> values) {
            addCriterion("PASSWORDOPDATE in", values, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateNotIn(List<Date> values) {
            addCriterion("PASSWORDOPDATE not in", values, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateBetween(Date value1, Date value2) {
            addCriterion("PASSWORDOPDATE between", value1, value2, "passwordopdate");
            return (Criteria) this;
        }

        public Criteria andPasswordopdateNotBetween(Date value1, Date value2) {
            addCriterion("PASSWORDOPDATE not between", value1, value2, "passwordopdate");
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

        public Criteria andErpaccountcodeIsNull() {
            addCriterion("ERPACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIsNotNull() {
            addCriterion("ERPACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE =", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <>", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThan(String value) {
            addCriterion("ERPACCOUNTCODE >", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE >=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThan(String value) {
            addCriterion("ERPACCOUNTCODE <", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLike(String value) {
            addCriterion("ERPACCOUNTCODE like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotLike(String value) {
            addCriterion("ERPACCOUNTCODE not like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE not in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE not between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIsNull() {
            addCriterion("ERPACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIsNotNull() {
            addCriterion("ERPACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME =", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME <>", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameGreaterThan(String value) {
            addCriterion("ERPACCOUNTNAME >", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME >=", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLessThan(String value) {
            addCriterion("ERPACCOUNTNAME <", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLessThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME <=", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLike(String value) {
            addCriterion("ERPACCOUNTNAME like", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotLike(String value) {
            addCriterion("ERPACCOUNTNAME not like", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIn(List<String> values) {
            addCriterion("ERPACCOUNTNAME in", values, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotIn(List<String> values) {
            addCriterion("ERPACCOUNTNAME not in", values, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTNAME between", value1, value2, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTNAME not between", value1, value2, "erpaccountname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_processtype_tc
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
     * @Table : mm_processtype_tc
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