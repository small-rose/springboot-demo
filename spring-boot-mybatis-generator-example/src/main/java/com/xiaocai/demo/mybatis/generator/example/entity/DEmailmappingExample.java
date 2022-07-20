package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DEmailmappingExample {
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
    public DEmailmappingExample() {
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
     * @Table : d_emailmapping
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

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBussnissnoIsNull() {
            addCriterion("BUSSNISSNO is null");
            return (Criteria) this;
        }

        public Criteria andBussnissnoIsNotNull() {
            addCriterion("BUSSNISSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBussnissnoEqualTo(String value) {
            addCriterion("BUSSNISSNO =", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoNotEqualTo(String value) {
            addCriterion("BUSSNISSNO <>", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoGreaterThan(String value) {
            addCriterion("BUSSNISSNO >", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSSNISSNO >=", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoLessThan(String value) {
            addCriterion("BUSSNISSNO <", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoLessThanOrEqualTo(String value) {
            addCriterion("BUSSNISSNO <=", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoLike(String value) {
            addCriterion("BUSSNISSNO like", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoNotLike(String value) {
            addCriterion("BUSSNISSNO not like", value, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoIn(List<String> values) {
            addCriterion("BUSSNISSNO in", values, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoNotIn(List<String> values) {
            addCriterion("BUSSNISSNO not in", values, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoBetween(String value1, String value2) {
            addCriterion("BUSSNISSNO between", value1, value2, "bussnissno");
            return (Criteria) this;
        }

        public Criteria andBussnissnoNotBetween(String value1, String value2) {
            addCriterion("BUSSNISSNO not between", value1, value2, "bussnissno");
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

        public Criteria andHibernateIsNull() {
            addCriterion("HIBERNATE is null");
            return (Criteria) this;
        }

        public Criteria andHibernateIsNotNull() {
            addCriterion("HIBERNATE is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateEqualTo(Integer value) {
            addCriterion("HIBERNATE =", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateNotEqualTo(Integer value) {
            addCriterion("HIBERNATE <>", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateGreaterThan(Integer value) {
            addCriterion("HIBERNATE >", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATE >=", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateLessThan(Integer value) {
            addCriterion("HIBERNATE <", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateLessThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATE <=", value, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateIn(List<Integer> values) {
            addCriterion("HIBERNATE in", values, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateNotIn(List<Integer> values) {
            addCriterion("HIBERNATE not in", values, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateBetween(Integer value1, Integer value2) {
            addCriterion("HIBERNATE between", value1, value2, "hibernate");
            return (Criteria) this;
        }

        public Criteria andHibernateNotBetween(Integer value1, Integer value2) {
            addCriterion("HIBERNATE not between", value1, value2, "hibernate");
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

        public Criteria andBussnissnameIsNull() {
            addCriterion("BUSSNISSNAME is null");
            return (Criteria) this;
        }

        public Criteria andBussnissnameIsNotNull() {
            addCriterion("BUSSNISSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBussnissnameEqualTo(String value) {
            addCriterion("BUSSNISSNAME =", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameNotEqualTo(String value) {
            addCriterion("BUSSNISSNAME <>", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameGreaterThan(String value) {
            addCriterion("BUSSNISSNAME >", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSSNISSNAME >=", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameLessThan(String value) {
            addCriterion("BUSSNISSNAME <", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameLessThanOrEqualTo(String value) {
            addCriterion("BUSSNISSNAME <=", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameLike(String value) {
            addCriterion("BUSSNISSNAME like", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameNotLike(String value) {
            addCriterion("BUSSNISSNAME not like", value, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameIn(List<String> values) {
            addCriterion("BUSSNISSNAME in", values, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameNotIn(List<String> values) {
            addCriterion("BUSSNISSNAME not in", values, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameBetween(String value1, String value2) {
            addCriterion("BUSSNISSNAME between", value1, value2, "bussnissname");
            return (Criteria) this;
        }

        public Criteria andBussnissnameNotBetween(String value1, String value2) {
            addCriterion("BUSSNISSNAME not between", value1, value2, "bussnissname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : d_emailmapping
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
     * @Table : d_emailmapping
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