package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmUseporpertyTdExample {
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
    public MmUseporpertyTdExample() {
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
     * @Table : mm_useporperty_td
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

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(Long value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(Long value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(Long value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(Long value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(Long value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(Long value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<Long> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<Long> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(Long value1, Long value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(Long value1, Long value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyIsNull() {
            addCriterion("ERPUSEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyIsNotNull() {
            addCriterion("ERPUSEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyEqualTo(Long value) {
            addCriterion("ERPUSEPORPERTY =", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyNotEqualTo(Long value) {
            addCriterion("ERPUSEPORPERTY <>", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyGreaterThan(Long value) {
            addCriterion("ERPUSEPORPERTY >", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyGreaterThanOrEqualTo(Long value) {
            addCriterion("ERPUSEPORPERTY >=", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyLessThan(Long value) {
            addCriterion("ERPUSEPORPERTY <", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyLessThanOrEqualTo(Long value) {
            addCriterion("ERPUSEPORPERTY <=", value, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyIn(List<Long> values) {
            addCriterion("ERPUSEPORPERTY in", values, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyNotIn(List<Long> values) {
            addCriterion("ERPUSEPORPERTY not in", values, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyBetween(Long value1, Long value2) {
            addCriterion("ERPUSEPORPERTY between", value1, value2, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertyNotBetween(Long value1, Long value2) {
            addCriterion("ERPUSEPORPERTY not between", value1, value2, "erpuseporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameIsNull() {
            addCriterion("USEPORPERTYNAME is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameIsNotNull() {
            addCriterion("USEPORPERTYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameEqualTo(String value) {
            addCriterion("USEPORPERTYNAME =", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameNotEqualTo(String value) {
            addCriterion("USEPORPERTYNAME <>", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameGreaterThan(String value) {
            addCriterion("USEPORPERTYNAME >", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTYNAME >=", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameLessThan(String value) {
            addCriterion("USEPORPERTYNAME <", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTYNAME <=", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameLike(String value) {
            addCriterion("USEPORPERTYNAME like", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameNotLike(String value) {
            addCriterion("USEPORPERTYNAME not like", value, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameIn(List<String> values) {
            addCriterion("USEPORPERTYNAME in", values, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameNotIn(List<String> values) {
            addCriterion("USEPORPERTYNAME not in", values, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameBetween(String value1, String value2) {
            addCriterion("USEPORPERTYNAME between", value1, value2, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andUseporpertynameNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTYNAME not between", value1, value2, "useporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameIsNull() {
            addCriterion("ERPUSEPORPERTYNAME is null");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameIsNotNull() {
            addCriterion("ERPUSEPORPERTYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameEqualTo(String value) {
            addCriterion("ERPUSEPORPERTYNAME =", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameNotEqualTo(String value) {
            addCriterion("ERPUSEPORPERTYNAME <>", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameGreaterThan(String value) {
            addCriterion("ERPUSEPORPERTYNAME >", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameGreaterThanOrEqualTo(String value) {
            addCriterion("ERPUSEPORPERTYNAME >=", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameLessThan(String value) {
            addCriterion("ERPUSEPORPERTYNAME <", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameLessThanOrEqualTo(String value) {
            addCriterion("ERPUSEPORPERTYNAME <=", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameLike(String value) {
            addCriterion("ERPUSEPORPERTYNAME like", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameNotLike(String value) {
            addCriterion("ERPUSEPORPERTYNAME not like", value, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameIn(List<String> values) {
            addCriterion("ERPUSEPORPERTYNAME in", values, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameNotIn(List<String> values) {
            addCriterion("ERPUSEPORPERTYNAME not in", values, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameBetween(String value1, String value2) {
            addCriterion("ERPUSEPORPERTYNAME between", value1, value2, "erpuseporpertyname");
            return (Criteria) this;
        }

        public Criteria andErpuseporpertynameNotBetween(String value1, String value2) {
            addCriterion("ERPUSEPORPERTYNAME not between", value1, value2, "erpuseporpertyname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_useporperty_td
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
     * @Table : mm_useporperty_td
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