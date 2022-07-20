package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBankplatformTcExample {
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
    public MmBankplatformTcExample() {
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
     * @Table : mm_bankplatform_tc
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

        public Criteria andPlatformidIsNull() {
            addCriterion("PLATFORMID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("PLATFORMID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(String value) {
            addCriterion("PLATFORMID =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(String value) {
            addCriterion("PLATFORMID <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(String value) {
            addCriterion("PLATFORMID >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMID >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(String value) {
            addCriterion("PLATFORMID <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMID <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLike(String value) {
            addCriterion("PLATFORMID like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotLike(String value) {
            addCriterion("PLATFORMID not like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<String> values) {
            addCriterion("PLATFORMID in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<String> values) {
            addCriterion("PLATFORMID not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(String value1, String value2) {
            addCriterion("PLATFORMID between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(String value1, String value2) {
            addCriterion("PLATFORMID not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNull() {
            addCriterion("PLATFORMNAME is null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNotNull() {
            addCriterion("PLATFORMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameEqualTo(String value) {
            addCriterion("PLATFORMNAME =", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotEqualTo(String value) {
            addCriterion("PLATFORMNAME <>", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThan(String value) {
            addCriterion("PLATFORMNAME >", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMNAME >=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThan(String value) {
            addCriterion("PLATFORMNAME <", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMNAME <=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLike(String value) {
            addCriterion("PLATFORMNAME like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotLike(String value) {
            addCriterion("PLATFORMNAME not like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIn(List<String> values) {
            addCriterion("PLATFORMNAME in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotIn(List<String> values) {
            addCriterion("PLATFORMNAME not in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameBetween(String value1, String value2) {
            addCriterion("PLATFORMNAME between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotBetween(String value1, String value2) {
            addCriterion("PLATFORMNAME not between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andInputformatidIsNull() {
            addCriterion("INPUTFORMATID is null");
            return (Criteria) this;
        }

        public Criteria andInputformatidIsNotNull() {
            addCriterion("INPUTFORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andInputformatidEqualTo(BigDecimal value) {
            addCriterion("INPUTFORMATID =", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidNotEqualTo(BigDecimal value) {
            addCriterion("INPUTFORMATID <>", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidGreaterThan(BigDecimal value) {
            addCriterion("INPUTFORMATID >", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INPUTFORMATID >=", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidLessThan(BigDecimal value) {
            addCriterion("INPUTFORMATID <", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INPUTFORMATID <=", value, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidIn(List<BigDecimal> values) {
            addCriterion("INPUTFORMATID in", values, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidNotIn(List<BigDecimal> values) {
            addCriterion("INPUTFORMATID not in", values, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPUTFORMATID between", value1, value2, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andInputformatidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPUTFORMATID not between", value1, value2, "inputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidIsNull() {
            addCriterion("OUTPUTFORMATID is null");
            return (Criteria) this;
        }

        public Criteria andOutputformatidIsNotNull() {
            addCriterion("OUTPUTFORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andOutputformatidEqualTo(BigDecimal value) {
            addCriterion("OUTPUTFORMATID =", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidNotEqualTo(BigDecimal value) {
            addCriterion("OUTPUTFORMATID <>", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidGreaterThan(BigDecimal value) {
            addCriterion("OUTPUTFORMATID >", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPUTFORMATID >=", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidLessThan(BigDecimal value) {
            addCriterion("OUTPUTFORMATID <", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPUTFORMATID <=", value, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidIn(List<BigDecimal> values) {
            addCriterion("OUTPUTFORMATID in", values, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidNotIn(List<BigDecimal> values) {
            addCriterion("OUTPUTFORMATID not in", values, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPUTFORMATID between", value1, value2, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andOutputformatidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPUTFORMATID not between", value1, value2, "outputformatid");
            return (Criteria) this;
        }

        public Criteria andIfdirectIsNull() {
            addCriterion("IFDIRECT is null");
            return (Criteria) this;
        }

        public Criteria andIfdirectIsNotNull() {
            addCriterion("IFDIRECT is not null");
            return (Criteria) this;
        }

        public Criteria andIfdirectEqualTo(String value) {
            addCriterion("IFDIRECT =", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotEqualTo(String value) {
            addCriterion("IFDIRECT <>", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectGreaterThan(String value) {
            addCriterion("IFDIRECT >", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectGreaterThanOrEqualTo(String value) {
            addCriterion("IFDIRECT >=", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLessThan(String value) {
            addCriterion("IFDIRECT <", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLessThanOrEqualTo(String value) {
            addCriterion("IFDIRECT <=", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLike(String value) {
            addCriterion("IFDIRECT like", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotLike(String value) {
            addCriterion("IFDIRECT not like", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectIn(List<String> values) {
            addCriterion("IFDIRECT in", values, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotIn(List<String> values) {
            addCriterion("IFDIRECT not in", values, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectBetween(String value1, String value2) {
            addCriterion("IFDIRECT between", value1, value2, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotBetween(String value1, String value2) {
            addCriterion("IFDIRECT not between", value1, value2, "ifdirect");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
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

        public Criteria andDiscmaxnumIsNull() {
            addCriterion("DISCMAXNUM is null");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumIsNotNull() {
            addCriterion("DISCMAXNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumEqualTo(BigDecimal value) {
            addCriterion("DISCMAXNUM =", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumNotEqualTo(BigDecimal value) {
            addCriterion("DISCMAXNUM <>", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumGreaterThan(BigDecimal value) {
            addCriterion("DISCMAXNUM >", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCMAXNUM >=", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumLessThan(BigDecimal value) {
            addCriterion("DISCMAXNUM <", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCMAXNUM <=", value, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumIn(List<BigDecimal> values) {
            addCriterion("DISCMAXNUM in", values, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumNotIn(List<BigDecimal> values) {
            addCriterion("DISCMAXNUM not in", values, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCMAXNUM between", value1, value2, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andDiscmaxnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCMAXNUM not between", value1, value2, "discmaxnum");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidIsNull() {
            addCriterion("AUTHORIZATIONID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidIsNotNull() {
            addCriterion("AUTHORIZATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZATIONID =", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidNotEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZATIONID <>", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidGreaterThan(BigDecimal value) {
            addCriterion("AUTHORIZATIONID >", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZATIONID >=", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidLessThan(BigDecimal value) {
            addCriterion("AUTHORIZATIONID <", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZATIONID <=", value, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidIn(List<BigDecimal> values) {
            addCriterion("AUTHORIZATIONID in", values, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidNotIn(List<BigDecimal> values) {
            addCriterion("AUTHORIZATIONID not in", values, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTHORIZATIONID between", value1, value2, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andAuthorizationidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTHORIZATIONID not between", value1, value2, "authorizationid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidIsNull() {
            addCriterion("OLDPLATFORMID is null");
            return (Criteria) this;
        }

        public Criteria andOldplatformidIsNotNull() {
            addCriterion("OLDPLATFORMID is not null");
            return (Criteria) this;
        }

        public Criteria andOldplatformidEqualTo(String value) {
            addCriterion("OLDPLATFORMID =", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidNotEqualTo(String value) {
            addCriterion("OLDPLATFORMID <>", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidGreaterThan(String value) {
            addCriterion("OLDPLATFORMID >", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidGreaterThanOrEqualTo(String value) {
            addCriterion("OLDPLATFORMID >=", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidLessThan(String value) {
            addCriterion("OLDPLATFORMID <", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidLessThanOrEqualTo(String value) {
            addCriterion("OLDPLATFORMID <=", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidLike(String value) {
            addCriterion("OLDPLATFORMID like", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidNotLike(String value) {
            addCriterion("OLDPLATFORMID not like", value, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidIn(List<String> values) {
            addCriterion("OLDPLATFORMID in", values, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidNotIn(List<String> values) {
            addCriterion("OLDPLATFORMID not in", values, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidBetween(String value1, String value2) {
            addCriterion("OLDPLATFORMID between", value1, value2, "oldplatformid");
            return (Criteria) this;
        }

        public Criteria andOldplatformidNotBetween(String value1, String value2) {
            addCriterion("OLDPLATFORMID not between", value1, value2, "oldplatformid");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bankplatform_tc
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
     * @Table : mm_bankplatform_tc
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