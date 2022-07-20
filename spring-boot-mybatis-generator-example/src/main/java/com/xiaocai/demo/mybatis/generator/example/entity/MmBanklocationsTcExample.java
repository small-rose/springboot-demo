package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBanklocationsTcExample {
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
    public MmBanklocationsTcExample() {
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
     * @Table : mm_banklocations_tc
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSybankidIsNull() {
            addCriterion("SYBANKID is null");
            return (Criteria) this;
        }

        public Criteria andSybankidIsNotNull() {
            addCriterion("SYBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andSybankidEqualTo(BigDecimal value) {
            addCriterion("SYBANKID =", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidNotEqualTo(BigDecimal value) {
            addCriterion("SYBANKID <>", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidGreaterThan(BigDecimal value) {
            addCriterion("SYBANKID >", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYBANKID >=", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidLessThan(BigDecimal value) {
            addCriterion("SYBANKID <", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYBANKID <=", value, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidIn(List<BigDecimal> values) {
            addCriterion("SYBANKID in", values, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidNotIn(List<BigDecimal> values) {
            addCriterion("SYBANKID not in", values, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYBANKID between", value1, value2, "sybankid");
            return (Criteria) this;
        }

        public Criteria andSybankidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYBANKID not between", value1, value2, "sybankid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidIsNull() {
            addCriterion("STANDARDAREAID is null");
            return (Criteria) this;
        }

        public Criteria andStandardareaidIsNotNull() {
            addCriterion("STANDARDAREAID is not null");
            return (Criteria) this;
        }

        public Criteria andStandardareaidEqualTo(String value) {
            addCriterion("STANDARDAREAID =", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidNotEqualTo(String value) {
            addCriterion("STANDARDAREAID <>", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidGreaterThan(String value) {
            addCriterion("STANDARDAREAID >", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARDAREAID >=", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidLessThan(String value) {
            addCriterion("STANDARDAREAID <", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidLessThanOrEqualTo(String value) {
            addCriterion("STANDARDAREAID <=", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidLike(String value) {
            addCriterion("STANDARDAREAID like", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidNotLike(String value) {
            addCriterion("STANDARDAREAID not like", value, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidIn(List<String> values) {
            addCriterion("STANDARDAREAID in", values, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidNotIn(List<String> values) {
            addCriterion("STANDARDAREAID not in", values, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidBetween(String value1, String value2) {
            addCriterion("STANDARDAREAID between", value1, value2, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andStandardareaidNotBetween(String value1, String value2) {
            addCriterion("STANDARDAREAID not between", value1, value2, "standardareaid");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("CREATEDON is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("CREATEDON is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterion("CREATEDON =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterion("CREATEDON <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterion("CREATEDON >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDON >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterion("CREATEDON <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDON <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterion("CREATEDON in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterion("CREATEDON not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterion("CREATEDON between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDON not between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNull() {
            addCriterion("LASTMODIFIEDON is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNotNull() {
            addCriterion("LASTMODIFIEDON is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonEqualTo(Date value) {
            addCriterion("LASTMODIFIEDON =", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotEqualTo(Date value) {
            addCriterion("LASTMODIFIEDON <>", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThan(Date value) {
            addCriterion("LASTMODIFIEDON >", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDON >=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThan(Date value) {
            addCriterion("LASTMODIFIEDON <", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDON <=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIn(List<Date> values) {
            addCriterion("LASTMODIFIEDON in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotIn(List<Date> values) {
            addCriterion("LASTMODIFIEDON not in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDON between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDON not between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_banklocations_tc
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
     * @Table : mm_banklocations_tc
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