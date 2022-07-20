package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxlJobLogExample {
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
    public XxlJobLogExample() {
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
     * @Table : xxl_job_log
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

        public Criteria andExecutorAddressIsNull() {
            addCriterion("executor_address is null");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressIsNotNull() {
            addCriterion("executor_address is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressEqualTo(String value) {
            addCriterion("executor_address =", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressNotEqualTo(String value) {
            addCriterion("executor_address <>", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressGreaterThan(String value) {
            addCriterion("executor_address >", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressGreaterThanOrEqualTo(String value) {
            addCriterion("executor_address >=", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressLessThan(String value) {
            addCriterion("executor_address <", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressLessThanOrEqualTo(String value) {
            addCriterion("executor_address <=", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressLike(String value) {
            addCriterion("executor_address like", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressNotLike(String value) {
            addCriterion("executor_address not like", value, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressIn(List<String> values) {
            addCriterion("executor_address in", values, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressNotIn(List<String> values) {
            addCriterion("executor_address not in", values, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressBetween(String value1, String value2) {
            addCriterion("executor_address between", value1, value2, "executorAddress");
            return (Criteria) this;
        }

        public Criteria andExecutorAddressNotBetween(String value1, String value2) {
            addCriterion("executor_address not between", value1, value2, "executorAddress");
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

        public Criteria andExecutorShardingParamIsNull() {
            addCriterion("executor_sharding_param is null");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamIsNotNull() {
            addCriterion("executor_sharding_param is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamEqualTo(String value) {
            addCriterion("executor_sharding_param =", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamNotEqualTo(String value) {
            addCriterion("executor_sharding_param <>", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamGreaterThan(String value) {
            addCriterion("executor_sharding_param >", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamGreaterThanOrEqualTo(String value) {
            addCriterion("executor_sharding_param >=", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamLessThan(String value) {
            addCriterion("executor_sharding_param <", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamLessThanOrEqualTo(String value) {
            addCriterion("executor_sharding_param <=", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamLike(String value) {
            addCriterion("executor_sharding_param like", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamNotLike(String value) {
            addCriterion("executor_sharding_param not like", value, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamIn(List<String> values) {
            addCriterion("executor_sharding_param in", values, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamNotIn(List<String> values) {
            addCriterion("executor_sharding_param not in", values, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamBetween(String value1, String value2) {
            addCriterion("executor_sharding_param between", value1, value2, "executorShardingParam");
            return (Criteria) this;
        }

        public Criteria andExecutorShardingParamNotBetween(String value1, String value2) {
            addCriterion("executor_sharding_param not between", value1, value2, "executorShardingParam");
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

        public Criteria andTriggerTimeIsNull() {
            addCriterion("trigger_time is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNotNull() {
            addCriterion("trigger_time is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeEqualTo(Date value) {
            addCriterion("trigger_time =", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotEqualTo(Date value) {
            addCriterion("trigger_time <>", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThan(Date value) {
            addCriterion("trigger_time >", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trigger_time >=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThan(Date value) {
            addCriterion("trigger_time <", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThanOrEqualTo(Date value) {
            addCriterion("trigger_time <=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIn(List<Date> values) {
            addCriterion("trigger_time in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotIn(List<Date> values) {
            addCriterion("trigger_time not in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeBetween(Date value1, Date value2) {
            addCriterion("trigger_time between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotBetween(Date value1, Date value2) {
            addCriterion("trigger_time not between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeIsNull() {
            addCriterion("trigger_code is null");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeIsNotNull() {
            addCriterion("trigger_code is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeEqualTo(Integer value) {
            addCriterion("trigger_code =", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotEqualTo(Integer value) {
            addCriterion("trigger_code <>", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeGreaterThan(Integer value) {
            addCriterion("trigger_code >", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trigger_code >=", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeLessThan(Integer value) {
            addCriterion("trigger_code <", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("trigger_code <=", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeIn(List<Integer> values) {
            addCriterion("trigger_code in", values, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotIn(List<Integer> values) {
            addCriterion("trigger_code not in", values, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeBetween(Integer value1, Integer value2) {
            addCriterion("trigger_code between", value1, value2, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("trigger_code not between", value1, value2, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgIsNull() {
            addCriterion("trigger_msg is null");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgIsNotNull() {
            addCriterion("trigger_msg is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgEqualTo(String value) {
            addCriterion("trigger_msg =", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgNotEqualTo(String value) {
            addCriterion("trigger_msg <>", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgGreaterThan(String value) {
            addCriterion("trigger_msg >", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_msg >=", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgLessThan(String value) {
            addCriterion("trigger_msg <", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgLessThanOrEqualTo(String value) {
            addCriterion("trigger_msg <=", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgLike(String value) {
            addCriterion("trigger_msg like", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgNotLike(String value) {
            addCriterion("trigger_msg not like", value, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgIn(List<String> values) {
            addCriterion("trigger_msg in", values, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgNotIn(List<String> values) {
            addCriterion("trigger_msg not in", values, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgBetween(String value1, String value2) {
            addCriterion("trigger_msg between", value1, value2, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andTriggerMsgNotBetween(String value1, String value2) {
            addCriterion("trigger_msg not between", value1, value2, "triggerMsg");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIsNull() {
            addCriterion("handle_code is null");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIsNotNull() {
            addCriterion("handle_code is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCodeEqualTo(Integer value) {
            addCriterion("handle_code =", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotEqualTo(Integer value) {
            addCriterion("handle_code <>", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeGreaterThan(Integer value) {
            addCriterion("handle_code >", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("handle_code >=", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeLessThan(Integer value) {
            addCriterion("handle_code <", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("handle_code <=", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIn(List<Integer> values) {
            addCriterion("handle_code in", values, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotIn(List<Integer> values) {
            addCriterion("handle_code not in", values, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeBetween(Integer value1, Integer value2) {
            addCriterion("handle_code between", value1, value2, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("handle_code not between", value1, value2, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIsNull() {
            addCriterion("handle_msg is null");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIsNotNull() {
            addCriterion("handle_msg is not null");
            return (Criteria) this;
        }

        public Criteria andHandleMsgEqualTo(String value) {
            addCriterion("handle_msg =", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotEqualTo(String value) {
            addCriterion("handle_msg <>", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThan(String value) {
            addCriterion("handle_msg >", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanOrEqualTo(String value) {
            addCriterion("handle_msg >=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThan(String value) {
            addCriterion("handle_msg <", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanOrEqualTo(String value) {
            addCriterion("handle_msg <=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLike(String value) {
            addCriterion("handle_msg like", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotLike(String value) {
            addCriterion("handle_msg not like", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIn(List<String> values) {
            addCriterion("handle_msg in", values, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotIn(List<String> values) {
            addCriterion("handle_msg not in", values, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgBetween(String value1, String value2) {
            addCriterion("handle_msg between", value1, value2, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotBetween(String value1, String value2) {
            addCriterion("handle_msg not between", value1, value2, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNull() {
            addCriterion("alarm_status is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNotNull() {
            addCriterion("alarm_status is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusEqualTo(Byte value) {
            addCriterion("alarm_status =", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotEqualTo(Byte value) {
            addCriterion("alarm_status <>", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThan(Byte value) {
            addCriterion("alarm_status >", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarm_status >=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThan(Byte value) {
            addCriterion("alarm_status <", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("alarm_status <=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIn(List<Byte> values) {
            addCriterion("alarm_status in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotIn(List<Byte> values) {
            addCriterion("alarm_status not in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusBetween(Byte value1, Byte value2) {
            addCriterion("alarm_status between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("alarm_status not between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : xxl_job_log
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
     * @Table : xxl_job_log
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