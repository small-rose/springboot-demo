package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxlJobLogglueExample {
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
    public XxlJobLogglueExample() {
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
     * @Table : xxl_job_logglue
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIsNull() {
            addCriterion("glue_type is null");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIsNotNull() {
            addCriterion("glue_type is not null");
            return (Criteria) this;
        }

        public Criteria andGlueTypeEqualTo(String value) {
            addCriterion("glue_type =", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotEqualTo(String value) {
            addCriterion("glue_type <>", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeGreaterThan(String value) {
            addCriterion("glue_type >", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("glue_type >=", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLessThan(String value) {
            addCriterion("glue_type <", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLessThanOrEqualTo(String value) {
            addCriterion("glue_type <=", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLike(String value) {
            addCriterion("glue_type like", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotLike(String value) {
            addCriterion("glue_type not like", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIn(List<String> values) {
            addCriterion("glue_type in", values, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotIn(List<String> values) {
            addCriterion("glue_type not in", values, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeBetween(String value1, String value2) {
            addCriterion("glue_type between", value1, value2, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotBetween(String value1, String value2) {
            addCriterion("glue_type not between", value1, value2, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueSourceIsNull() {
            addCriterion("glue_source is null");
            return (Criteria) this;
        }

        public Criteria andGlueSourceIsNotNull() {
            addCriterion("glue_source is not null");
            return (Criteria) this;
        }

        public Criteria andGlueSourceEqualTo(String value) {
            addCriterion("glue_source =", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceNotEqualTo(String value) {
            addCriterion("glue_source <>", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceGreaterThan(String value) {
            addCriterion("glue_source >", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceGreaterThanOrEqualTo(String value) {
            addCriterion("glue_source >=", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceLessThan(String value) {
            addCriterion("glue_source <", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceLessThanOrEqualTo(String value) {
            addCriterion("glue_source <=", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceLike(String value) {
            addCriterion("glue_source like", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceNotLike(String value) {
            addCriterion("glue_source not like", value, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceIn(List<String> values) {
            addCriterion("glue_source in", values, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceNotIn(List<String> values) {
            addCriterion("glue_source not in", values, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceBetween(String value1, String value2) {
            addCriterion("glue_source between", value1, value2, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueSourceNotBetween(String value1, String value2) {
            addCriterion("glue_source not between", value1, value2, "glueSource");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIsNull() {
            addCriterion("glue_remark is null");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIsNotNull() {
            addCriterion("glue_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkEqualTo(String value) {
            addCriterion("glue_remark =", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotEqualTo(String value) {
            addCriterion("glue_remark <>", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkGreaterThan(String value) {
            addCriterion("glue_remark >", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("glue_remark >=", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLessThan(String value) {
            addCriterion("glue_remark <", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLessThanOrEqualTo(String value) {
            addCriterion("glue_remark <=", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLike(String value) {
            addCriterion("glue_remark like", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotLike(String value) {
            addCriterion("glue_remark not like", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIn(List<String> values) {
            addCriterion("glue_remark in", values, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotIn(List<String> values) {
            addCriterion("glue_remark not in", values, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkBetween(String value1, String value2) {
            addCriterion("glue_remark between", value1, value2, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotBetween(String value1, String value2) {
            addCriterion("glue_remark not between", value1, value2, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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
     * @Table : xxl_job_logglue
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
     * @Table : xxl_job_logglue
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