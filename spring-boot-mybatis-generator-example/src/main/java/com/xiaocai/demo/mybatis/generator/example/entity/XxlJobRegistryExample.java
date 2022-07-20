package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxlJobRegistryExample {
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
    public XxlJobRegistryExample() {
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
     * @Table : xxl_job_registry
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupIsNull() {
            addCriterion("registry_group is null");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupIsNotNull() {
            addCriterion("registry_group is not null");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupEqualTo(String value) {
            addCriterion("registry_group =", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupNotEqualTo(String value) {
            addCriterion("registry_group <>", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupGreaterThan(String value) {
            addCriterion("registry_group >", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupGreaterThanOrEqualTo(String value) {
            addCriterion("registry_group >=", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupLessThan(String value) {
            addCriterion("registry_group <", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupLessThanOrEqualTo(String value) {
            addCriterion("registry_group <=", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupLike(String value) {
            addCriterion("registry_group like", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupNotLike(String value) {
            addCriterion("registry_group not like", value, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupIn(List<String> values) {
            addCriterion("registry_group in", values, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupNotIn(List<String> values) {
            addCriterion("registry_group not in", values, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupBetween(String value1, String value2) {
            addCriterion("registry_group between", value1, value2, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryGroupNotBetween(String value1, String value2) {
            addCriterion("registry_group not between", value1, value2, "registryGroup");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyIsNull() {
            addCriterion("registry_key is null");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyIsNotNull() {
            addCriterion("registry_key is not null");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyEqualTo(String value) {
            addCriterion("registry_key =", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyNotEqualTo(String value) {
            addCriterion("registry_key <>", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyGreaterThan(String value) {
            addCriterion("registry_key >", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyGreaterThanOrEqualTo(String value) {
            addCriterion("registry_key >=", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyLessThan(String value) {
            addCriterion("registry_key <", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyLessThanOrEqualTo(String value) {
            addCriterion("registry_key <=", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyLike(String value) {
            addCriterion("registry_key like", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyNotLike(String value) {
            addCriterion("registry_key not like", value, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyIn(List<String> values) {
            addCriterion("registry_key in", values, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyNotIn(List<String> values) {
            addCriterion("registry_key not in", values, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyBetween(String value1, String value2) {
            addCriterion("registry_key between", value1, value2, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryKeyNotBetween(String value1, String value2) {
            addCriterion("registry_key not between", value1, value2, "registryKey");
            return (Criteria) this;
        }

        public Criteria andRegistryValueIsNull() {
            addCriterion("registry_value is null");
            return (Criteria) this;
        }

        public Criteria andRegistryValueIsNotNull() {
            addCriterion("registry_value is not null");
            return (Criteria) this;
        }

        public Criteria andRegistryValueEqualTo(String value) {
            addCriterion("registry_value =", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueNotEqualTo(String value) {
            addCriterion("registry_value <>", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueGreaterThan(String value) {
            addCriterion("registry_value >", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueGreaterThanOrEqualTo(String value) {
            addCriterion("registry_value >=", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueLessThan(String value) {
            addCriterion("registry_value <", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueLessThanOrEqualTo(String value) {
            addCriterion("registry_value <=", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueLike(String value) {
            addCriterion("registry_value like", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueNotLike(String value) {
            addCriterion("registry_value not like", value, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueIn(List<String> values) {
            addCriterion("registry_value in", values, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueNotIn(List<String> values) {
            addCriterion("registry_value not in", values, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueBetween(String value1, String value2) {
            addCriterion("registry_value between", value1, value2, "registryValue");
            return (Criteria) this;
        }

        public Criteria andRegistryValueNotBetween(String value1, String value2) {
            addCriterion("registry_value not between", value1, value2, "registryValue");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : xxl_job_registry
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
     * @Table : xxl_job_registry
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