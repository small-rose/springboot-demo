package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmTempSumbalanceExample {
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
    public MmTempSumbalanceExample() {
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
     * @Table : mm_temp_sumbalance
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNull() {
            addCriterion("mirrorid is null");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNotNull() {
            addCriterion("mirrorid is not null");
            return (Criteria) this;
        }

        public Criteria andMirroridEqualTo(BigDecimal value) {
            addCriterion("mirrorid =", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotEqualTo(BigDecimal value) {
            addCriterion("mirrorid <>", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThan(BigDecimal value) {
            addCriterion("mirrorid >", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mirrorid >=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThan(BigDecimal value) {
            addCriterion("mirrorid <", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mirrorid <=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridIn(List<BigDecimal> values) {
            addCriterion("mirrorid in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotIn(List<BigDecimal> values) {
            addCriterion("mirrorid not in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mirrorid between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mirrorid not between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNull() {
            addCriterion("seqpolicy is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("seqpolicy is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(BigDecimal value) {
            addCriterion("seqpolicy =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(BigDecimal value) {
            addCriterion("seqpolicy <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(BigDecimal value) {
            addCriterion("seqpolicy >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seqpolicy >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(BigDecimal value) {
            addCriterion("seqpolicy <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seqpolicy <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<BigDecimal> values) {
            addCriterion("seqpolicy in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<BigDecimal> values) {
            addCriterion("seqpolicy not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seqpolicy between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seqpolicy not between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIsNull() {
            addCriterion("remains_dued is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIsNotNull() {
            addCriterion("remains_dued is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedEqualTo(BigDecimal value) {
            addCriterion("remains_dued =", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotEqualTo(BigDecimal value) {
            addCriterion("remains_dued <>", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedGreaterThan(BigDecimal value) {
            addCriterion("remains_dued >", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remains_dued >=", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedLessThan(BigDecimal value) {
            addCriterion("remains_dued <", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remains_dued <=", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIn(List<BigDecimal> values) {
            addCriterion("remains_dued in", values, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotIn(List<BigDecimal> values) {
            addCriterion("remains_dued not in", values, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remains_dued between", value1, value2, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remains_dued not between", value1, value2, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNull() {
            addCriterion("remains_undued is null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNotNull() {
            addCriterion("remains_undued is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedEqualTo(BigDecimal value) {
            addCriterion("remains_undued =", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotEqualTo(BigDecimal value) {
            addCriterion("remains_undued <>", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThan(BigDecimal value) {
            addCriterion("remains_undued >", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remains_undued >=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThan(BigDecimal value) {
            addCriterion("remains_undued <", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remains_undued <=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIn(List<BigDecimal> values) {
            addCriterion("remains_undued in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotIn(List<BigDecimal> values) {
            addCriterion("remains_undued not in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remains_undued between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remains_undued not between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_sumbalance
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
     * @Table : mm_temp_sumbalance
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