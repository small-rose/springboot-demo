package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmWelcomeinfoExample {
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
    public MmWelcomeinfoExample() {
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
     * @Table : mm_welcomeinfo
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

        public Criteria andSubcompanyEqualTo(Long value) {
            addCriterion("SUBCOMPANY =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(Long value) {
            addCriterion("SUBCOMPANY <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(Long value) {
            addCriterion("SUBCOMPANY >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBCOMPANY >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(Long value) {
            addCriterion("SUBCOMPANY <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(Long value) {
            addCriterion("SUBCOMPANY <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<Long> values) {
            addCriterion("SUBCOMPANY in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<Long> values) {
            addCriterion("SUBCOMPANY not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(Long value1, Long value2) {
            addCriterion("SUBCOMPANY between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(Long value1, Long value2) {
            addCriterion("SUBCOMPANY not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoIsNull() {
            addCriterion("WELCOMEINFO is null");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoIsNotNull() {
            addCriterion("WELCOMEINFO is not null");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoEqualTo(String value) {
            addCriterion("WELCOMEINFO =", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoNotEqualTo(String value) {
            addCriterion("WELCOMEINFO <>", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoGreaterThan(String value) {
            addCriterion("WELCOMEINFO >", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("WELCOMEINFO >=", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoLessThan(String value) {
            addCriterion("WELCOMEINFO <", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoLessThanOrEqualTo(String value) {
            addCriterion("WELCOMEINFO <=", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoLike(String value) {
            addCriterion("WELCOMEINFO like", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoNotLike(String value) {
            addCriterion("WELCOMEINFO not like", value, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoIn(List<String> values) {
            addCriterion("WELCOMEINFO in", values, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoNotIn(List<String> values) {
            addCriterion("WELCOMEINFO not in", values, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoBetween(String value1, String value2) {
            addCriterion("WELCOMEINFO between", value1, value2, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeinfoNotBetween(String value1, String value2) {
            addCriterion("WELCOMEINFO not between", value1, value2, "welcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoIsNull() {
            addCriterion("TOPWELCOMEINFO is null");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoIsNotNull() {
            addCriterion("TOPWELCOMEINFO is not null");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoEqualTo(String value) {
            addCriterion("TOPWELCOMEINFO =", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoNotEqualTo(String value) {
            addCriterion("TOPWELCOMEINFO <>", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoGreaterThan(String value) {
            addCriterion("TOPWELCOMEINFO >", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("TOPWELCOMEINFO >=", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoLessThan(String value) {
            addCriterion("TOPWELCOMEINFO <", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoLessThanOrEqualTo(String value) {
            addCriterion("TOPWELCOMEINFO <=", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoLike(String value) {
            addCriterion("TOPWELCOMEINFO like", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoNotLike(String value) {
            addCriterion("TOPWELCOMEINFO not like", value, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoIn(List<String> values) {
            addCriterion("TOPWELCOMEINFO in", values, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoNotIn(List<String> values) {
            addCriterion("TOPWELCOMEINFO not in", values, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoBetween(String value1, String value2) {
            addCriterion("TOPWELCOMEINFO between", value1, value2, "topwelcomeinfo");
            return (Criteria) this;
        }

        public Criteria andTopwelcomeinfoNotBetween(String value1, String value2) {
            addCriterion("TOPWELCOMEINFO not between", value1, value2, "topwelcomeinfo");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_welcomeinfo
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
     * @Table : mm_welcomeinfo
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