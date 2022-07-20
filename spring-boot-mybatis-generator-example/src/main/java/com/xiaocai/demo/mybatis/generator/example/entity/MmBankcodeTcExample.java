package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBankcodeTcExample {
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
    public MmBankcodeTcExample() {
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
     * @Table : mm_bankcode_tc
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

        public Criteria andUridIsNull() {
            addCriterion("URID is null");
            return (Criteria) this;
        }

        public Criteria andUridIsNotNull() {
            addCriterion("URID is not null");
            return (Criteria) this;
        }

        public Criteria andUridEqualTo(Long value) {
            addCriterion("URID =", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotEqualTo(Long value) {
            addCriterion("URID <>", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThan(Long value) {
            addCriterion("URID >", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThanOrEqualTo(Long value) {
            addCriterion("URID >=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThan(Long value) {
            addCriterion("URID <", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThanOrEqualTo(Long value) {
            addCriterion("URID <=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridIn(List<Long> values) {
            addCriterion("URID in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotIn(List<Long> values) {
            addCriterion("URID not in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridBetween(Long value1, Long value2) {
            addCriterion("URID between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotBetween(Long value1, Long value2) {
            addCriterion("URID not between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankshortnameIsNull() {
            addCriterion("BANKSHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andBankshortnameIsNotNull() {
            addCriterion("BANKSHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankshortnameEqualTo(String value) {
            addCriterion("BANKSHORTNAME =", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameNotEqualTo(String value) {
            addCriterion("BANKSHORTNAME <>", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameGreaterThan(String value) {
            addCriterion("BANKSHORTNAME >", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKSHORTNAME >=", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameLessThan(String value) {
            addCriterion("BANKSHORTNAME <", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameLessThanOrEqualTo(String value) {
            addCriterion("BANKSHORTNAME <=", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameLike(String value) {
            addCriterion("BANKSHORTNAME like", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameNotLike(String value) {
            addCriterion("BANKSHORTNAME not like", value, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameIn(List<String> values) {
            addCriterion("BANKSHORTNAME in", values, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameNotIn(List<String> values) {
            addCriterion("BANKSHORTNAME not in", values, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameBetween(String value1, String value2) {
            addCriterion("BANKSHORTNAME between", value1, value2, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBankshortnameNotBetween(String value1, String value2) {
            addCriterion("BANKSHORTNAME not between", value1, value2, "bankshortname");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
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

        public Criteria andHibernateversionEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Short value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Short value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
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

        public Criteria andBankcode2IsNull() {
            addCriterion("BANKCODE2 is null");
            return (Criteria) this;
        }

        public Criteria andBankcode2IsNotNull() {
            addCriterion("BANKCODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBankcode2EqualTo(String value) {
            addCriterion("BANKCODE2 =", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2NotEqualTo(String value) {
            addCriterion("BANKCODE2 <>", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2GreaterThan(String value) {
            addCriterion("BANKCODE2 >", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2GreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE2 >=", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2LessThan(String value) {
            addCriterion("BANKCODE2 <", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2LessThanOrEqualTo(String value) {
            addCriterion("BANKCODE2 <=", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2Like(String value) {
            addCriterion("BANKCODE2 like", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2NotLike(String value) {
            addCriterion("BANKCODE2 not like", value, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2In(List<String> values) {
            addCriterion("BANKCODE2 in", values, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2NotIn(List<String> values) {
            addCriterion("BANKCODE2 not in", values, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2Between(String value1, String value2) {
            addCriterion("BANKCODE2 between", value1, value2, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andBankcode2NotBetween(String value1, String value2) {
            addCriterion("BANKCODE2 not between", value1, value2, "bankcode2");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNull() {
            addCriterion("ISDISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("ISDISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(String value) {
            addCriterion("ISDISPLAY =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(String value) {
            addCriterion("ISDISPLAY <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(String value) {
            addCriterion("ISDISPLAY >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(String value) {
            addCriterion("ISDISPLAY >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(String value) {
            addCriterion("ISDISPLAY <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(String value) {
            addCriterion("ISDISPLAY <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLike(String value) {
            addCriterion("ISDISPLAY like", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotLike(String value) {
            addCriterion("ISDISPLAY not like", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<String> values) {
            addCriterion("ISDISPLAY in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<String> values) {
            addCriterion("ISDISPLAY not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(String value1, String value2) {
            addCriterion("ISDISPLAY between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(String value1, String value2) {
            addCriterion("ISDISPLAY not between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeIsNull() {
            addCriterion("REFBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeIsNotNull() {
            addCriterion("REFBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeEqualTo(String value) {
            addCriterion("REFBANKCODE =", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeNotEqualTo(String value) {
            addCriterion("REFBANKCODE <>", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeGreaterThan(String value) {
            addCriterion("REFBANKCODE >", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("REFBANKCODE >=", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeLessThan(String value) {
            addCriterion("REFBANKCODE <", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeLessThanOrEqualTo(String value) {
            addCriterion("REFBANKCODE <=", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeLike(String value) {
            addCriterion("REFBANKCODE like", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeNotLike(String value) {
            addCriterion("REFBANKCODE not like", value, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeIn(List<String> values) {
            addCriterion("REFBANKCODE in", values, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeNotIn(List<String> values) {
            addCriterion("REFBANKCODE not in", values, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeBetween(String value1, String value2) {
            addCriterion("REFBANKCODE between", value1, value2, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbankcodeNotBetween(String value1, String value2) {
            addCriterion("REFBANKCODE not between", value1, value2, "refbankcode");
            return (Criteria) this;
        }

        public Criteria andRefbanknameIsNull() {
            addCriterion("REFBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andRefbanknameIsNotNull() {
            addCriterion("REFBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRefbanknameEqualTo(String value) {
            addCriterion("REFBANKNAME =", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameNotEqualTo(String value) {
            addCriterion("REFBANKNAME <>", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameGreaterThan(String value) {
            addCriterion("REFBANKNAME >", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("REFBANKNAME >=", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameLessThan(String value) {
            addCriterion("REFBANKNAME <", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameLessThanOrEqualTo(String value) {
            addCriterion("REFBANKNAME <=", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameLike(String value) {
            addCriterion("REFBANKNAME like", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameNotLike(String value) {
            addCriterion("REFBANKNAME not like", value, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameIn(List<String> values) {
            addCriterion("REFBANKNAME in", values, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameNotIn(List<String> values) {
            addCriterion("REFBANKNAME not in", values, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameBetween(String value1, String value2) {
            addCriterion("REFBANKNAME between", value1, value2, "refbankname");
            return (Criteria) this;
        }

        public Criteria andRefbanknameNotBetween(String value1, String value2) {
            addCriterion("REFBANKNAME not between", value1, value2, "refbankname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bankcode_tc
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
     * @Table : mm_bankcode_tc
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