package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxlJobInfoExample {
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
    public XxlJobInfoExample() {
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
     * @Table : xxl_job_info
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

        public Criteria andJobGroupIsNull() {
            addCriterion("job_group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("job_group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(Integer value) {
            addCriterion("job_group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(Integer value) {
            addCriterion("job_group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(Integer value) {
            addCriterion("job_group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(Integer value) {
            addCriterion("job_group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(Integer value) {
            addCriterion("job_group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<Integer> values) {
            addCriterion("job_group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<Integer> values) {
            addCriterion("job_group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(Integer value1, Integer value2) {
            addCriterion("job_group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("job_group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNull() {
            addCriterion("job_desc is null");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNotNull() {
            addCriterion("job_desc is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescEqualTo(String value) {
            addCriterion("job_desc =", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotEqualTo(String value) {
            addCriterion("job_desc <>", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThan(String value) {
            addCriterion("job_desc >", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThanOrEqualTo(String value) {
            addCriterion("job_desc >=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThan(String value) {
            addCriterion("job_desc <", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThanOrEqualTo(String value) {
            addCriterion("job_desc <=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLike(String value) {
            addCriterion("job_desc like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotLike(String value) {
            addCriterion("job_desc not like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescIn(List<String> values) {
            addCriterion("job_desc in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotIn(List<String> values) {
            addCriterion("job_desc not in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescBetween(String value1, String value2) {
            addCriterion("job_desc between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotBetween(String value1, String value2) {
            addCriterion("job_desc not between", value1, value2, "jobDesc");
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIsNull() {
            addCriterion("alarm_email is null");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIsNotNull() {
            addCriterion("alarm_email is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailEqualTo(String value) {
            addCriterion("alarm_email =", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotEqualTo(String value) {
            addCriterion("alarm_email <>", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailGreaterThan(String value) {
            addCriterion("alarm_email >", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_email >=", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLessThan(String value) {
            addCriterion("alarm_email <", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLessThanOrEqualTo(String value) {
            addCriterion("alarm_email <=", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLike(String value) {
            addCriterion("alarm_email like", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotLike(String value) {
            addCriterion("alarm_email not like", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIn(List<String> values) {
            addCriterion("alarm_email in", values, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotIn(List<String> values) {
            addCriterion("alarm_email not in", values, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailBetween(String value1, String value2) {
            addCriterion("alarm_email between", value1, value2, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotBetween(String value1, String value2) {
            addCriterion("alarm_email not between", value1, value2, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeIsNull() {
            addCriterion("schedule_type is null");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeIsNotNull() {
            addCriterion("schedule_type is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeEqualTo(String value) {
            addCriterion("schedule_type =", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeNotEqualTo(String value) {
            addCriterion("schedule_type <>", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeGreaterThan(String value) {
            addCriterion("schedule_type >", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_type >=", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeLessThan(String value) {
            addCriterion("schedule_type <", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeLessThanOrEqualTo(String value) {
            addCriterion("schedule_type <=", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeLike(String value) {
            addCriterion("schedule_type like", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeNotLike(String value) {
            addCriterion("schedule_type not like", value, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeIn(List<String> values) {
            addCriterion("schedule_type in", values, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeNotIn(List<String> values) {
            addCriterion("schedule_type not in", values, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeBetween(String value1, String value2) {
            addCriterion("schedule_type between", value1, value2, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleTypeNotBetween(String value1, String value2) {
            addCriterion("schedule_type not between", value1, value2, "scheduleType");
            return (Criteria) this;
        }

        public Criteria andScheduleConfIsNull() {
            addCriterion("schedule_conf is null");
            return (Criteria) this;
        }

        public Criteria andScheduleConfIsNotNull() {
            addCriterion("schedule_conf is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleConfEqualTo(String value) {
            addCriterion("schedule_conf =", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfNotEqualTo(String value) {
            addCriterion("schedule_conf <>", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfGreaterThan(String value) {
            addCriterion("schedule_conf >", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_conf >=", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfLessThan(String value) {
            addCriterion("schedule_conf <", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfLessThanOrEqualTo(String value) {
            addCriterion("schedule_conf <=", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfLike(String value) {
            addCriterion("schedule_conf like", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfNotLike(String value) {
            addCriterion("schedule_conf not like", value, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfIn(List<String> values) {
            addCriterion("schedule_conf in", values, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfNotIn(List<String> values) {
            addCriterion("schedule_conf not in", values, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfBetween(String value1, String value2) {
            addCriterion("schedule_conf between", value1, value2, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andScheduleConfNotBetween(String value1, String value2) {
            addCriterion("schedule_conf not between", value1, value2, "scheduleConf");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyIsNull() {
            addCriterion("misfire_strategy is null");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyIsNotNull() {
            addCriterion("misfire_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyEqualTo(String value) {
            addCriterion("misfire_strategy =", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyNotEqualTo(String value) {
            addCriterion("misfire_strategy <>", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyGreaterThan(String value) {
            addCriterion("misfire_strategy >", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("misfire_strategy >=", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyLessThan(String value) {
            addCriterion("misfire_strategy <", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyLessThanOrEqualTo(String value) {
            addCriterion("misfire_strategy <=", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyLike(String value) {
            addCriterion("misfire_strategy like", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyNotLike(String value) {
            addCriterion("misfire_strategy not like", value, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyIn(List<String> values) {
            addCriterion("misfire_strategy in", values, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyNotIn(List<String> values) {
            addCriterion("misfire_strategy not in", values, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyBetween(String value1, String value2) {
            addCriterion("misfire_strategy between", value1, value2, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andMisfireStrategyNotBetween(String value1, String value2) {
            addCriterion("misfire_strategy not between", value1, value2, "misfireStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIsNull() {
            addCriterion("executor_route_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIsNotNull() {
            addCriterion("executor_route_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyEqualTo(String value) {
            addCriterion("executor_route_strategy =", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotEqualTo(String value) {
            addCriterion("executor_route_strategy <>", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyGreaterThan(String value) {
            addCriterion("executor_route_strategy >", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("executor_route_strategy >=", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLessThan(String value) {
            addCriterion("executor_route_strategy <", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLessThanOrEqualTo(String value) {
            addCriterion("executor_route_strategy <=", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLike(String value) {
            addCriterion("executor_route_strategy like", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotLike(String value) {
            addCriterion("executor_route_strategy not like", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIn(List<String> values) {
            addCriterion("executor_route_strategy in", values, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotIn(List<String> values) {
            addCriterion("executor_route_strategy not in", values, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyBetween(String value1, String value2) {
            addCriterion("executor_route_strategy between", value1, value2, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotBetween(String value1, String value2) {
            addCriterion("executor_route_strategy not between", value1, value2, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIsNull() {
            addCriterion("executor_handler is null");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIsNotNull() {
            addCriterion("executor_handler is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerEqualTo(String value) {
            addCriterion("executor_handler =", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotEqualTo(String value) {
            addCriterion("executor_handler <>", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerGreaterThan(String value) {
            addCriterion("executor_handler >", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("executor_handler >=", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLessThan(String value) {
            addCriterion("executor_handler <", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLessThanOrEqualTo(String value) {
            addCriterion("executor_handler <=", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLike(String value) {
            addCriterion("executor_handler like", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotLike(String value) {
            addCriterion("executor_handler not like", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIn(List<String> values) {
            addCriterion("executor_handler in", values, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotIn(List<String> values) {
            addCriterion("executor_handler not in", values, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerBetween(String value1, String value2) {
            addCriterion("executor_handler between", value1, value2, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotBetween(String value1, String value2) {
            addCriterion("executor_handler not between", value1, value2, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIsNull() {
            addCriterion("executor_param is null");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIsNotNull() {
            addCriterion("executor_param is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorParamEqualTo(String value) {
            addCriterion("executor_param =", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotEqualTo(String value) {
            addCriterion("executor_param <>", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamGreaterThan(String value) {
            addCriterion("executor_param >", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamGreaterThanOrEqualTo(String value) {
            addCriterion("executor_param >=", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLessThan(String value) {
            addCriterion("executor_param <", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLessThanOrEqualTo(String value) {
            addCriterion("executor_param <=", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLike(String value) {
            addCriterion("executor_param like", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotLike(String value) {
            addCriterion("executor_param not like", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIn(List<String> values) {
            addCriterion("executor_param in", values, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotIn(List<String> values) {
            addCriterion("executor_param not in", values, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamBetween(String value1, String value2) {
            addCriterion("executor_param between", value1, value2, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotBetween(String value1, String value2) {
            addCriterion("executor_param not between", value1, value2, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIsNull() {
            addCriterion("executor_block_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIsNotNull() {
            addCriterion("executor_block_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyEqualTo(String value) {
            addCriterion("executor_block_strategy =", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotEqualTo(String value) {
            addCriterion("executor_block_strategy <>", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyGreaterThan(String value) {
            addCriterion("executor_block_strategy >", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("executor_block_strategy >=", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLessThan(String value) {
            addCriterion("executor_block_strategy <", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLessThanOrEqualTo(String value) {
            addCriterion("executor_block_strategy <=", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLike(String value) {
            addCriterion("executor_block_strategy like", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotLike(String value) {
            addCriterion("executor_block_strategy not like", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIn(List<String> values) {
            addCriterion("executor_block_strategy in", values, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotIn(List<String> values) {
            addCriterion("executor_block_strategy not in", values, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyBetween(String value1, String value2) {
            addCriterion("executor_block_strategy between", value1, value2, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotBetween(String value1, String value2) {
            addCriterion("executor_block_strategy not between", value1, value2, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutIsNull() {
            addCriterion("executor_timeout is null");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutIsNotNull() {
            addCriterion("executor_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutEqualTo(Integer value) {
            addCriterion("executor_timeout =", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutNotEqualTo(Integer value) {
            addCriterion("executor_timeout <>", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutGreaterThan(Integer value) {
            addCriterion("executor_timeout >", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("executor_timeout >=", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutLessThan(Integer value) {
            addCriterion("executor_timeout <", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("executor_timeout <=", value, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutIn(List<Integer> values) {
            addCriterion("executor_timeout in", values, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutNotIn(List<Integer> values) {
            addCriterion("executor_timeout not in", values, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("executor_timeout between", value1, value2, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("executor_timeout not between", value1, value2, "executorTimeout");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountIsNull() {
            addCriterion("executor_fail_retry_count is null");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountIsNotNull() {
            addCriterion("executor_fail_retry_count is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountEqualTo(Integer value) {
            addCriterion("executor_fail_retry_count =", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountNotEqualTo(Integer value) {
            addCriterion("executor_fail_retry_count <>", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountGreaterThan(Integer value) {
            addCriterion("executor_fail_retry_count >", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("executor_fail_retry_count >=", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountLessThan(Integer value) {
            addCriterion("executor_fail_retry_count <", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountLessThanOrEqualTo(Integer value) {
            addCriterion("executor_fail_retry_count <=", value, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountIn(List<Integer> values) {
            addCriterion("executor_fail_retry_count in", values, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountNotIn(List<Integer> values) {
            addCriterion("executor_fail_retry_count not in", values, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountBetween(Integer value1, Integer value2) {
            addCriterion("executor_fail_retry_count between", value1, value2, "executorFailRetryCount");
            return (Criteria) this;
        }

        public Criteria andExecutorFailRetryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("executor_fail_retry_count not between", value1, value2, "executorFailRetryCount");
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

        public Criteria andGlueUpdatetimeIsNull() {
            addCriterion("glue_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeIsNotNull() {
            addCriterion("glue_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeEqualTo(Date value) {
            addCriterion("glue_updatetime =", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotEqualTo(Date value) {
            addCriterion("glue_updatetime <>", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeGreaterThan(Date value) {
            addCriterion("glue_updatetime >", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("glue_updatetime >=", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeLessThan(Date value) {
            addCriterion("glue_updatetime <", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("glue_updatetime <=", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeIn(List<Date> values) {
            addCriterion("glue_updatetime in", values, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotIn(List<Date> values) {
            addCriterion("glue_updatetime not in", values, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("glue_updatetime between", value1, value2, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("glue_updatetime not between", value1, value2, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andChildJobidIsNull() {
            addCriterion("child_jobid is null");
            return (Criteria) this;
        }

        public Criteria andChildJobidIsNotNull() {
            addCriterion("child_jobid is not null");
            return (Criteria) this;
        }

        public Criteria andChildJobidEqualTo(String value) {
            addCriterion("child_jobid =", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidNotEqualTo(String value) {
            addCriterion("child_jobid <>", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidGreaterThan(String value) {
            addCriterion("child_jobid >", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidGreaterThanOrEqualTo(String value) {
            addCriterion("child_jobid >=", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidLessThan(String value) {
            addCriterion("child_jobid <", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidLessThanOrEqualTo(String value) {
            addCriterion("child_jobid <=", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidLike(String value) {
            addCriterion("child_jobid like", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidNotLike(String value) {
            addCriterion("child_jobid not like", value, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidIn(List<String> values) {
            addCriterion("child_jobid in", values, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidNotIn(List<String> values) {
            addCriterion("child_jobid not in", values, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidBetween(String value1, String value2) {
            addCriterion("child_jobid between", value1, value2, "childJobid");
            return (Criteria) this;
        }

        public Criteria andChildJobidNotBetween(String value1, String value2) {
            addCriterion("child_jobid not between", value1, value2, "childJobid");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIsNull() {
            addCriterion("trigger_status is null");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIsNotNull() {
            addCriterion("trigger_status is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusEqualTo(Byte value) {
            addCriterion("trigger_status =", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotEqualTo(Byte value) {
            addCriterion("trigger_status <>", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusGreaterThan(Byte value) {
            addCriterion("trigger_status >", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("trigger_status >=", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusLessThan(Byte value) {
            addCriterion("trigger_status <", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusLessThanOrEqualTo(Byte value) {
            addCriterion("trigger_status <=", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIn(List<Byte> values) {
            addCriterion("trigger_status in", values, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotIn(List<Byte> values) {
            addCriterion("trigger_status not in", values, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusBetween(Byte value1, Byte value2) {
            addCriterion("trigger_status between", value1, value2, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("trigger_status not between", value1, value2, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeIsNull() {
            addCriterion("trigger_last_time is null");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeIsNotNull() {
            addCriterion("trigger_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeEqualTo(Long value) {
            addCriterion("trigger_last_time =", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeNotEqualTo(Long value) {
            addCriterion("trigger_last_time <>", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeGreaterThan(Long value) {
            addCriterion("trigger_last_time >", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("trigger_last_time >=", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeLessThan(Long value) {
            addCriterion("trigger_last_time <", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeLessThanOrEqualTo(Long value) {
            addCriterion("trigger_last_time <=", value, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeIn(List<Long> values) {
            addCriterion("trigger_last_time in", values, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeNotIn(List<Long> values) {
            addCriterion("trigger_last_time not in", values, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeBetween(Long value1, Long value2) {
            addCriterion("trigger_last_time between", value1, value2, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerLastTimeNotBetween(Long value1, Long value2) {
            addCriterion("trigger_last_time not between", value1, value2, "triggerLastTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeIsNull() {
            addCriterion("trigger_next_time is null");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeIsNotNull() {
            addCriterion("trigger_next_time is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeEqualTo(Long value) {
            addCriterion("trigger_next_time =", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeNotEqualTo(Long value) {
            addCriterion("trigger_next_time <>", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeGreaterThan(Long value) {
            addCriterion("trigger_next_time >", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("trigger_next_time >=", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeLessThan(Long value) {
            addCriterion("trigger_next_time <", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeLessThanOrEqualTo(Long value) {
            addCriterion("trigger_next_time <=", value, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeIn(List<Long> values) {
            addCriterion("trigger_next_time in", values, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeNotIn(List<Long> values) {
            addCriterion("trigger_next_time not in", values, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeBetween(Long value1, Long value2) {
            addCriterion("trigger_next_time between", value1, value2, "triggerNextTime");
            return (Criteria) this;
        }

        public Criteria andTriggerNextTimeNotBetween(Long value1, Long value2) {
            addCriterion("trigger_next_time not between", value1, value2, "triggerNextTime");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : xxl_job_info
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
     * @Table : xxl_job_info
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