package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAccountageInfluxTdExample {
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
    public MmAccountageInfluxTdExample() {
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
     * @Table : mm_accountage_influx_td
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

        public Criteria andInfluxidIsNull() {
            addCriterion("INFLUXID is null");
            return (Criteria) this;
        }

        public Criteria andInfluxidIsNotNull() {
            addCriterion("INFLUXID is not null");
            return (Criteria) this;
        }

        public Criteria andInfluxidEqualTo(Long value) {
            addCriterion("INFLUXID =", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidNotEqualTo(Long value) {
            addCriterion("INFLUXID <>", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidGreaterThan(Long value) {
            addCriterion("INFLUXID >", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidGreaterThanOrEqualTo(Long value) {
            addCriterion("INFLUXID >=", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidLessThan(Long value) {
            addCriterion("INFLUXID <", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidLessThanOrEqualTo(Long value) {
            addCriterion("INFLUXID <=", value, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidIn(List<Long> values) {
            addCriterion("INFLUXID in", values, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidNotIn(List<Long> values) {
            addCriterion("INFLUXID not in", values, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidBetween(Long value1, Long value2) {
            addCriterion("INFLUXID between", value1, value2, "influxid");
            return (Criteria) this;
        }

        public Criteria andInfluxidNotBetween(Long value1, Long value2) {
            addCriterion("INFLUXID not between", value1, value2, "influxid");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNull() {
            addCriterion("MIRRORID is null");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNotNull() {
            addCriterion("MIRRORID is not null");
            return (Criteria) this;
        }

        public Criteria andMirroridEqualTo(Long value) {
            addCriterion("MIRRORID =", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotEqualTo(Long value) {
            addCriterion("MIRRORID <>", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThan(Long value) {
            addCriterion("MIRRORID >", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThanOrEqualTo(Long value) {
            addCriterion("MIRRORID >=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThan(Long value) {
            addCriterion("MIRRORID <", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThanOrEqualTo(Long value) {
            addCriterion("MIRRORID <=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridIn(List<Long> values) {
            addCriterion("MIRRORID in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotIn(List<Long> values) {
            addCriterion("MIRRORID not in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridBetween(Long value1, Long value2) {
            addCriterion("MIRRORID between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotBetween(Long value1, Long value2) {
            addCriterion("MIRRORID not between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("UNITCODE like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("UNITCODE not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andMirrordateIsNull() {
            addCriterion("MIRRORDATE is null");
            return (Criteria) this;
        }

        public Criteria andMirrordateIsNotNull() {
            addCriterion("MIRRORDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMirrordateEqualTo(Date value) {
            addCriterion("MIRRORDATE =", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotEqualTo(Date value) {
            addCriterion("MIRRORDATE <>", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateGreaterThan(Date value) {
            addCriterion("MIRRORDATE >", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateGreaterThanOrEqualTo(Date value) {
            addCriterion("MIRRORDATE >=", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateLessThan(Date value) {
            addCriterion("MIRRORDATE <", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateLessThanOrEqualTo(Date value) {
            addCriterion("MIRRORDATE <=", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateIn(List<Date> values) {
            addCriterion("MIRRORDATE in", values, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotIn(List<Date> values) {
            addCriterion("MIRRORDATE not in", values, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateBetween(Date value1, Date value2) {
            addCriterion("MIRRORDATE between", value1, value2, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotBetween(Date value1, Date value2) {
            addCriterion("MIRRORDATE not between", value1, value2, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameIsNull() {
            addCriterion("CLASSESKINDNAME is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameIsNotNull() {
            addCriterion("CLASSESKINDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameEqualTo(String value) {
            addCriterion("CLASSESKINDNAME =", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameNotEqualTo(String value) {
            addCriterion("CLASSESKINDNAME <>", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameGreaterThan(String value) {
            addCriterion("CLASSESKINDNAME >", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESKINDNAME >=", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameLessThan(String value) {
            addCriterion("CLASSESKINDNAME <", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSESKINDNAME <=", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameLike(String value) {
            addCriterion("CLASSESKINDNAME like", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameNotLike(String value) {
            addCriterion("CLASSESKINDNAME not like", value, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameIn(List<String> values) {
            addCriterion("CLASSESKINDNAME in", values, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameNotIn(List<String> values) {
            addCriterion("CLASSESKINDNAME not in", values, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameBetween(String value1, String value2) {
            addCriterion("CLASSESKINDNAME between", value1, value2, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClasseskindnameNotBetween(String value1, String value2) {
            addCriterion("CLASSESKINDNAME not between", value1, value2, "classeskindname");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("CLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("CLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("CLASSESCODE like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("CLASSESCODE not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andRemainsIsNull() {
            addCriterion("REMAINS is null");
            return (Criteria) this;
        }

        public Criteria andRemainsIsNotNull() {
            addCriterion("REMAINS is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsEqualTo(BigDecimal value) {
            addCriterion("REMAINS =", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotEqualTo(BigDecimal value) {
            addCriterion("REMAINS <>", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsGreaterThan(BigDecimal value) {
            addCriterion("REMAINS >", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS >=", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsLessThan(BigDecimal value) {
            addCriterion("REMAINS <", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS <=", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsIn(List<BigDecimal> values) {
            addCriterion("REMAINS in", values, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotIn(List<BigDecimal> values) {
            addCriterion("REMAINS not in", values, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS between", value1, value2, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS not between", value1, value2, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNull() {
            addCriterion("REMAINS_UNDUED is null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNotNull() {
            addCriterion("REMAINS_UNDUED is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED =", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <>", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThan(BigDecimal value) {
            addCriterion("REMAINS_UNDUED >", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED >=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThan(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIn(List<BigDecimal> values) {
            addCriterion("REMAINS_UNDUED in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_UNDUED not in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_UNDUED between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_UNDUED not between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedIsNull() {
            addCriterion("SUMREMAINS_UNDUED is null");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedIsNotNull() {
            addCriterion("SUMREMAINS_UNDUED is not null");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedEqualTo(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED =", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedNotEqualTo(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED <>", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedGreaterThan(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED >", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED >=", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedLessThan(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED <", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMREMAINS_UNDUED <=", value, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedIn(List<BigDecimal> values) {
            addCriterion("SUMREMAINS_UNDUED in", values, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedNotIn(List<BigDecimal> values) {
            addCriterion("SUMREMAINS_UNDUED not in", values, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMREMAINS_UNDUED between", value1, value2, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSumremainsUnduedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMREMAINS_UNDUED not between", value1, value2, "sumremainsUndued");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsIsNull() {
            addCriterion("SUM12MONTH_REMAINS is null");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsIsNotNull() {
            addCriterion("SUM12MONTH_REMAINS is not null");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsEqualTo(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS =", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsNotEqualTo(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS <>", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsGreaterThan(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS >", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS >=", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsLessThan(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS <", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM12MONTH_REMAINS <=", value, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsIn(List<BigDecimal> values) {
            addCriterion("SUM12MONTH_REMAINS in", values, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsNotIn(List<BigDecimal> values) {
            addCriterion("SUM12MONTH_REMAINS not in", values, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM12MONTH_REMAINS between", value1, value2, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andSum12monthRemainsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM12MONTH_REMAINS not between", value1, value2, "sum12monthRemains");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1IsNull() {
            addCriterion("REMAINS_DATE1 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1IsNotNull() {
            addCriterion("REMAINS_DATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE1 =", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE1 <>", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE1 >", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE1 >=", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE1 <", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE1 <=", value, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE1 in", values, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE1 not in", values, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE1 between", value1, value2, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE1 not between", value1, value2, "remainsDate1");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2IsNull() {
            addCriterion("REMAINS_DATE2 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2IsNotNull() {
            addCriterion("REMAINS_DATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE2 =", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE2 <>", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE2 >", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE2 >=", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE2 <", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE2 <=", value, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE2 in", values, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE2 not in", values, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE2 between", value1, value2, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE2 not between", value1, value2, "remainsDate2");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3IsNull() {
            addCriterion("REMAINS_DATE3 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3IsNotNull() {
            addCriterion("REMAINS_DATE3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE3 =", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE3 <>", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE3 >", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE3 >=", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE3 <", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE3 <=", value, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE3 in", values, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE3 not in", values, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE3 between", value1, value2, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE3 not between", value1, value2, "remainsDate3");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4IsNull() {
            addCriterion("REMAINS_DATE4 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4IsNotNull() {
            addCriterion("REMAINS_DATE4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE4 =", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE4 <>", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE4 >", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE4 >=", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE4 <", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE4 <=", value, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE4 in", values, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE4 not in", values, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE4 between", value1, value2, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE4 not between", value1, value2, "remainsDate4");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5IsNull() {
            addCriterion("REMAINS_DATE5 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5IsNotNull() {
            addCriterion("REMAINS_DATE5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE5 =", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE5 <>", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE5 >", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE5 >=", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE5 <", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE5 <=", value, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE5 in", values, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE5 not in", values, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE5 between", value1, value2, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE5 not between", value1, value2, "remainsDate5");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6IsNull() {
            addCriterion("REMAINS_DATE6 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6IsNotNull() {
            addCriterion("REMAINS_DATE6 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE6 =", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE6 <>", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE6 >", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE6 >=", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE6 <", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE6 <=", value, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE6 in", values, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE6 not in", values, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE6 between", value1, value2, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE6 not between", value1, value2, "remainsDate6");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7IsNull() {
            addCriterion("REMAINS_DATE7 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7IsNotNull() {
            addCriterion("REMAINS_DATE7 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE7 =", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE7 <>", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE7 >", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE7 >=", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE7 <", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE7 <=", value, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE7 in", values, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE7 not in", values, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE7 between", value1, value2, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE7 not between", value1, value2, "remainsDate7");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8IsNull() {
            addCriterion("REMAINS_DATE8 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8IsNotNull() {
            addCriterion("REMAINS_DATE8 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE8 =", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE8 <>", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE8 >", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE8 >=", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE8 <", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE8 <=", value, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE8 in", values, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE8 not in", values, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE8 between", value1, value2, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE8 not between", value1, value2, "remainsDate8");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9IsNull() {
            addCriterion("REMAINS_DATE9 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9IsNotNull() {
            addCriterion("REMAINS_DATE9 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE9 =", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE9 <>", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE9 >", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE9 >=", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE9 <", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE9 <=", value, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE9 in", values, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE9 not in", values, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE9 between", value1, value2, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE9 not between", value1, value2, "remainsDate9");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10IsNull() {
            addCriterion("REMAINS_DATE10 is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10IsNotNull() {
            addCriterion("REMAINS_DATE10 is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10EqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE10 =", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10NotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE10 <>", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10GreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DATE10 >", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE10 >=", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10LessThan(BigDecimal value) {
            addCriterion("REMAINS_DATE10 <", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DATE10 <=", value, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10In(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE10 in", values, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10NotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DATE10 not in", values, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE10 between", value1, value2, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andRemainsDate10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DATE10 not between", value1, value2, "remainsDate10");
            return (Criteria) this;
        }

        public Criteria andAgetypeIsNull() {
            addCriterion("AGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgetypeIsNotNull() {
            addCriterion("AGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgetypeEqualTo(String value) {
            addCriterion("AGETYPE =", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotEqualTo(String value) {
            addCriterion("AGETYPE <>", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThan(String value) {
            addCriterion("AGETYPE >", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGETYPE >=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThan(String value) {
            addCriterion("AGETYPE <", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThanOrEqualTo(String value) {
            addCriterion("AGETYPE <=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLike(String value) {
            addCriterion("AGETYPE like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotLike(String value) {
            addCriterion("AGETYPE not like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeIn(List<String> values) {
            addCriterion("AGETYPE in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotIn(List<String> values) {
            addCriterion("AGETYPE not in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeBetween(String value1, String value2) {
            addCriterion("AGETYPE between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotBetween(String value1, String value2) {
            addCriterion("AGETYPE not between", value1, value2, "agetype");
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

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("ERRORMSG =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("ERRORMSG <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("ERRORMSG >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMSG >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("ERRORMSG <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("ERRORMSG <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("ERRORMSG like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("ERRORMSG not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("ERRORMSG in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("ERRORMSG not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("ERRORMSG between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("ERRORMSG not between", value1, value2, "errormsg");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_accountage_influx_td
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
     * @Table : mm_accountage_influx_td
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