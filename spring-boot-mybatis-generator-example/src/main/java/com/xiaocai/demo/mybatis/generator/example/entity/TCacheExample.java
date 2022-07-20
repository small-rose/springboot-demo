package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class TCacheExample {
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
    public TCacheExample() {
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
     * @Table : t_cache
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCacheNameIsNull() {
            addCriterion("CACHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCacheNameIsNotNull() {
            addCriterion("CACHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCacheNameEqualTo(String value) {
            addCriterion("CACHE_NAME =", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotEqualTo(String value) {
            addCriterion("CACHE_NAME <>", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameGreaterThan(String value) {
            addCriterion("CACHE_NAME >", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("CACHE_NAME >=", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLessThan(String value) {
            addCriterion("CACHE_NAME <", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLessThanOrEqualTo(String value) {
            addCriterion("CACHE_NAME <=", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLike(String value) {
            addCriterion("CACHE_NAME like", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotLike(String value) {
            addCriterion("CACHE_NAME not like", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameIn(List<String> values) {
            addCriterion("CACHE_NAME in", values, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotIn(List<String> values) {
            addCriterion("CACHE_NAME not in", values, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameBetween(String value1, String value2) {
            addCriterion("CACHE_NAME between", value1, value2, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotBetween(String value1, String value2) {
            addCriterion("CACHE_NAME not between", value1, value2, "cacheName");
            return (Criteria) this;
        }

        public Criteria andDbTableIsNull() {
            addCriterion("DB_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andDbTableIsNotNull() {
            addCriterion("DB_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDbTableEqualTo(String value) {
            addCriterion("DB_TABLE =", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotEqualTo(String value) {
            addCriterion("DB_TABLE <>", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableGreaterThan(String value) {
            addCriterion("DB_TABLE >", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableGreaterThanOrEqualTo(String value) {
            addCriterion("DB_TABLE >=", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLessThan(String value) {
            addCriterion("DB_TABLE <", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLessThanOrEqualTo(String value) {
            addCriterion("DB_TABLE <=", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLike(String value) {
            addCriterion("DB_TABLE like", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotLike(String value) {
            addCriterion("DB_TABLE not like", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableIn(List<String> values) {
            addCriterion("DB_TABLE in", values, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotIn(List<String> values) {
            addCriterion("DB_TABLE not in", values, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableBetween(String value1, String value2) {
            addCriterion("DB_TABLE between", value1, value2, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotBetween(String value1, String value2) {
            addCriterion("DB_TABLE not between", value1, value2, "dbTable");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_cache
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
     * @Table : t_cache
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