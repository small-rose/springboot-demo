package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SpringSessionExample {
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
    public SpringSessionExample() {
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
     * @Table : spring_session
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

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("SESSION_ID like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("SESSION_ID not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(BigDecimal value) {
            addCriterion("CREATION_TIME =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(BigDecimal value) {
            addCriterion("CREATION_TIME <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(BigDecimal value) {
            addCriterion("CREATION_TIME >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATION_TIME >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(BigDecimal value) {
            addCriterion("CREATION_TIME <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATION_TIME <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<BigDecimal> values) {
            addCriterion("CREATION_TIME in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<BigDecimal> values) {
            addCriterion("CREATION_TIME not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATION_TIME between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATION_TIME not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIsNull() {
            addCriterion("LAST_ACCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIsNotNull() {
            addCriterion("LAST_ACCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeEqualTo(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME =", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotEqualTo(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME <>", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeGreaterThan(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME >", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME >=", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeLessThan(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME <", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_ACCESS_TIME <=", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIn(List<BigDecimal> values) {
            addCriterion("LAST_ACCESS_TIME in", values, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotIn(List<BigDecimal> values) {
            addCriterion("LAST_ACCESS_TIME not in", values, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_ACCESS_TIME between", value1, value2, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_ACCESS_TIME not between", value1, value2, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalIsNull() {
            addCriterion("MAX_INACTIVE_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalIsNotNull() {
            addCriterion("MAX_INACTIVE_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalEqualTo(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL =", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalNotEqualTo(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL <>", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalGreaterThan(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL >", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL >=", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalLessThan(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL <", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalLessThanOrEqualTo(Long value) {
            addCriterion("MAX_INACTIVE_INTERVAL <=", value, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalIn(List<Long> values) {
            addCriterion("MAX_INACTIVE_INTERVAL in", values, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalNotIn(List<Long> values) {
            addCriterion("MAX_INACTIVE_INTERVAL not in", values, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalBetween(Long value1, Long value2) {
            addCriterion("MAX_INACTIVE_INTERVAL between", value1, value2, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andMaxInactiveIntervalNotBetween(Long value1, Long value2) {
            addCriterion("MAX_INACTIVE_INTERVAL not between", value1, value2, "maxInactiveInterval");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("PRINCIPAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("PRINCIPAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("PRINCIPAL_NAME =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("PRINCIPAL_NAME <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("PRINCIPAL_NAME >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_NAME >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("PRINCIPAL_NAME <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_NAME <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("PRINCIPAL_NAME like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("PRINCIPAL_NAME not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("PRINCIPAL_NAME in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("PRINCIPAL_NAME not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_NAME between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_NAME not between", value1, value2, "principalName");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : spring_session
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
     * @Table : spring_session
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