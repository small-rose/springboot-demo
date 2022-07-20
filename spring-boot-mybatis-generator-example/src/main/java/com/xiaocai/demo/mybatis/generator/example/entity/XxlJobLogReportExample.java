package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxlJobLogReportExample {
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
    public XxlJobLogReportExample() {
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
     * @Table : xxl_job_log_report
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

        public Criteria andTriggerDayIsNull() {
            addCriterion("trigger_day is null");
            return (Criteria) this;
        }

        public Criteria andTriggerDayIsNotNull() {
            addCriterion("trigger_day is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerDayEqualTo(Date value) {
            addCriterion("trigger_day =", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayNotEqualTo(Date value) {
            addCriterion("trigger_day <>", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayGreaterThan(Date value) {
            addCriterion("trigger_day >", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayGreaterThanOrEqualTo(Date value) {
            addCriterion("trigger_day >=", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayLessThan(Date value) {
            addCriterion("trigger_day <", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayLessThanOrEqualTo(Date value) {
            addCriterion("trigger_day <=", value, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayIn(List<Date> values) {
            addCriterion("trigger_day in", values, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayNotIn(List<Date> values) {
            addCriterion("trigger_day not in", values, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayBetween(Date value1, Date value2) {
            addCriterion("trigger_day between", value1, value2, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andTriggerDayNotBetween(Date value1, Date value2) {
            addCriterion("trigger_day not between", value1, value2, "triggerDay");
            return (Criteria) this;
        }

        public Criteria andRunningCountIsNull() {
            addCriterion("running_count is null");
            return (Criteria) this;
        }

        public Criteria andRunningCountIsNotNull() {
            addCriterion("running_count is not null");
            return (Criteria) this;
        }

        public Criteria andRunningCountEqualTo(Integer value) {
            addCriterion("running_count =", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountNotEqualTo(Integer value) {
            addCriterion("running_count <>", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountGreaterThan(Integer value) {
            addCriterion("running_count >", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("running_count >=", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountLessThan(Integer value) {
            addCriterion("running_count <", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountLessThanOrEqualTo(Integer value) {
            addCriterion("running_count <=", value, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountIn(List<Integer> values) {
            addCriterion("running_count in", values, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountNotIn(List<Integer> values) {
            addCriterion("running_count not in", values, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountBetween(Integer value1, Integer value2) {
            addCriterion("running_count between", value1, value2, "runningCount");
            return (Criteria) this;
        }

        public Criteria andRunningCountNotBetween(Integer value1, Integer value2) {
            addCriterion("running_count not between", value1, value2, "runningCount");
            return (Criteria) this;
        }

        public Criteria andSucCountIsNull() {
            addCriterion("suc_count is null");
            return (Criteria) this;
        }

        public Criteria andSucCountIsNotNull() {
            addCriterion("suc_count is not null");
            return (Criteria) this;
        }

        public Criteria andSucCountEqualTo(Integer value) {
            addCriterion("suc_count =", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotEqualTo(Integer value) {
            addCriterion("suc_count <>", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountGreaterThan(Integer value) {
            addCriterion("suc_count >", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("suc_count >=", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountLessThan(Integer value) {
            addCriterion("suc_count <", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountLessThanOrEqualTo(Integer value) {
            addCriterion("suc_count <=", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountIn(List<Integer> values) {
            addCriterion("suc_count in", values, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotIn(List<Integer> values) {
            addCriterion("suc_count not in", values, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountBetween(Integer value1, Integer value2) {
            addCriterion("suc_count between", value1, value2, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotBetween(Integer value1, Integer value2) {
            addCriterion("suc_count not between", value1, value2, "sucCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNull() {
            addCriterion("fail_count is null");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNotNull() {
            addCriterion("fail_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailCountEqualTo(Integer value) {
            addCriterion("fail_count =", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotEqualTo(Integer value) {
            addCriterion("fail_count <>", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThan(Integer value) {
            addCriterion("fail_count >", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail_count >=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThan(Integer value) {
            addCriterion("fail_count <", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("fail_count <=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIn(List<Integer> values) {
            addCriterion("fail_count in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotIn(List<Integer> values) {
            addCriterion("fail_count not in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountBetween(Integer value1, Integer value2) {
            addCriterion("fail_count between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fail_count not between", value1, value2, "failCount");
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
     * @Table : xxl_job_log_report
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
     * @Table : xxl_job_log_report
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