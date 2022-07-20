package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmRulesTdExample {
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
    public MmRulesTdExample() {
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
     * @Table : mm_rules_td
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

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("BATCH_ID like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("BATCH_ID not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameIsNull() {
            addCriterion("FLEX_VALIDATION_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameIsNotNull() {
            addCriterion("FLEX_VALIDATION_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME =", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameNotEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME <>", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameGreaterThan(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME >", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME >=", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameLessThan(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME <", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameLessThanOrEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME <=", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameLike(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME like", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameNotLike(String value) {
            addCriterion("FLEX_VALIDATION_RULE_NAME not like", value, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameIn(List<String> values) {
            addCriterion("FLEX_VALIDATION_RULE_NAME in", values, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameNotIn(List<String> values) {
            addCriterion("FLEX_VALIDATION_RULE_NAME not in", values, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameBetween(String value1, String value2) {
            addCriterion("FLEX_VALIDATION_RULE_NAME between", value1, value2, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleNameNotBetween(String value1, String value2) {
            addCriterion("FLEX_VALIDATION_RULE_NAME not between", value1, value2, "flexValidationRuleName");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescIsNull() {
            addCriterion("FLEX_VALIDATION_RULE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescIsNotNull() {
            addCriterion("FLEX_VALIDATION_RULE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC =", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescNotEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC <>", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescGreaterThan(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC >", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC >=", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescLessThan(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC <", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescLessThanOrEqualTo(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC <=", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescLike(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC like", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescNotLike(String value) {
            addCriterion("FLEX_VALIDATION_RULE_DESC not like", value, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescIn(List<String> values) {
            addCriterion("FLEX_VALIDATION_RULE_DESC in", values, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescNotIn(List<String> values) {
            addCriterion("FLEX_VALIDATION_RULE_DESC not in", values, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescBetween(String value1, String value2) {
            addCriterion("FLEX_VALIDATION_RULE_DESC between", value1, value2, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andFlexValidationRuleDescNotBetween(String value1, String value2) {
            addCriterion("FLEX_VALIDATION_RULE_DESC not between", value1, value2, "flexValidationRuleDesc");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextIsNull() {
            addCriterion("ERROR_MESSAGE_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextIsNotNull() {
            addCriterion("ERROR_MESSAGE_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextEqualTo(String value) {
            addCriterion("ERROR_MESSAGE_TEXT =", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextNotEqualTo(String value) {
            addCriterion("ERROR_MESSAGE_TEXT <>", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextGreaterThan(String value) {
            addCriterion("ERROR_MESSAGE_TEXT >", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE_TEXT >=", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextLessThan(String value) {
            addCriterion("ERROR_MESSAGE_TEXT <", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE_TEXT <=", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextLike(String value) {
            addCriterion("ERROR_MESSAGE_TEXT like", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextNotLike(String value) {
            addCriterion("ERROR_MESSAGE_TEXT not like", value, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextIn(List<String> values) {
            addCriterion("ERROR_MESSAGE_TEXT in", values, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextNotIn(List<String> values) {
            addCriterion("ERROR_MESSAGE_TEXT not in", values, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE_TEXT between", value1, value2, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andErrorMessageTextNotBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE_TEXT not between", value1, value2, "errorMessageText");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNull() {
            addCriterion("ENABLED_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNotNull() {
            addCriterion("ENABLED_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagEqualTo(String value) {
            addCriterion("ENABLED_FLAG =", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotEqualTo(String value) {
            addCriterion("ENABLED_FLAG <>", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThan(String value) {
            addCriterion("ENABLED_FLAG >", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG >=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThan(String value) {
            addCriterion("ENABLED_FLAG <", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG <=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLike(String value) {
            addCriterion("ENABLED_FLAG like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotLike(String value) {
            addCriterion("ENABLED_FLAG not like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIn(List<String> values) {
            addCriterion("ENABLED_FLAG in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotIn(List<String> values) {
            addCriterion("ENABLED_FLAG not in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG between", value1, value2, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG not between", value1, value2, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorIsNull() {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorIsNotNull() {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorEqualTo(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR =", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorNotEqualTo(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR <>", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorGreaterThan(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR >", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR >=", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorLessThan(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR <", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR <=", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorLike(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR like", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorNotLike(String value) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR not like", value, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorIn(List<String> values) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR in", values, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorNotIn(List<String> values) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR not in", values, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorBetween(String value1, String value2) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR between", value1, value2, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andIncludeExcludeIndicatorNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_EXCLUDE_INDICATOR not between", value1, value2, "includeExcludeIndicator");
            return (Criteria) this;
        }

        public Criteria andSegment1LowIsNull() {
            addCriterion("SEGMENT1_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment1LowIsNotNull() {
            addCriterion("SEGMENT1_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1LowEqualTo(String value) {
            addCriterion("SEGMENT1_LOW =", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowNotEqualTo(String value) {
            addCriterion("SEGMENT1_LOW <>", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowGreaterThan(String value) {
            addCriterion("SEGMENT1_LOW >", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1_LOW >=", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowLessThan(String value) {
            addCriterion("SEGMENT1_LOW <", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1_LOW <=", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowLike(String value) {
            addCriterion("SEGMENT1_LOW like", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowNotLike(String value) {
            addCriterion("SEGMENT1_LOW not like", value, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowIn(List<String> values) {
            addCriterion("SEGMENT1_LOW in", values, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowNotIn(List<String> values) {
            addCriterion("SEGMENT1_LOW not in", values, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowBetween(String value1, String value2) {
            addCriterion("SEGMENT1_LOW between", value1, value2, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment1LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT1_LOW not between", value1, value2, "segment1Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowIsNull() {
            addCriterion("SEGMENT2_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment2LowIsNotNull() {
            addCriterion("SEGMENT2_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2LowEqualTo(String value) {
            addCriterion("SEGMENT2_LOW =", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowNotEqualTo(String value) {
            addCriterion("SEGMENT2_LOW <>", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowGreaterThan(String value) {
            addCriterion("SEGMENT2_LOW >", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2_LOW >=", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowLessThan(String value) {
            addCriterion("SEGMENT2_LOW <", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2_LOW <=", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowLike(String value) {
            addCriterion("SEGMENT2_LOW like", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowNotLike(String value) {
            addCriterion("SEGMENT2_LOW not like", value, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowIn(List<String> values) {
            addCriterion("SEGMENT2_LOW in", values, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowNotIn(List<String> values) {
            addCriterion("SEGMENT2_LOW not in", values, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowBetween(String value1, String value2) {
            addCriterion("SEGMENT2_LOW between", value1, value2, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment2LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT2_LOW not between", value1, value2, "segment2Low");
            return (Criteria) this;
        }

        public Criteria andSegment1HighIsNull() {
            addCriterion("SEGMENT1_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment1HighIsNotNull() {
            addCriterion("SEGMENT1_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1HighEqualTo(String value) {
            addCriterion("SEGMENT1_HIGH =", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighNotEqualTo(String value) {
            addCriterion("SEGMENT1_HIGH <>", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighGreaterThan(String value) {
            addCriterion("SEGMENT1_HIGH >", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1_HIGH >=", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighLessThan(String value) {
            addCriterion("SEGMENT1_HIGH <", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1_HIGH <=", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighLike(String value) {
            addCriterion("SEGMENT1_HIGH like", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighNotLike(String value) {
            addCriterion("SEGMENT1_HIGH not like", value, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighIn(List<String> values) {
            addCriterion("SEGMENT1_HIGH in", values, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighNotIn(List<String> values) {
            addCriterion("SEGMENT1_HIGH not in", values, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighBetween(String value1, String value2) {
            addCriterion("SEGMENT1_HIGH between", value1, value2, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment1HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT1_HIGH not between", value1, value2, "segment1High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighIsNull() {
            addCriterion("SEGMENT2_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment2HighIsNotNull() {
            addCriterion("SEGMENT2_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2HighEqualTo(String value) {
            addCriterion("SEGMENT2_HIGH =", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighNotEqualTo(String value) {
            addCriterion("SEGMENT2_HIGH <>", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighGreaterThan(String value) {
            addCriterion("SEGMENT2_HIGH >", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2_HIGH >=", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighLessThan(String value) {
            addCriterion("SEGMENT2_HIGH <", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2_HIGH <=", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighLike(String value) {
            addCriterion("SEGMENT2_HIGH like", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighNotLike(String value) {
            addCriterion("SEGMENT2_HIGH not like", value, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighIn(List<String> values) {
            addCriterion("SEGMENT2_HIGH in", values, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighNotIn(List<String> values) {
            addCriterion("SEGMENT2_HIGH not in", values, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighBetween(String value1, String value2) {
            addCriterion("SEGMENT2_HIGH between", value1, value2, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment2HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT2_HIGH not between", value1, value2, "segment2High");
            return (Criteria) this;
        }

        public Criteria andSegment3LowIsNull() {
            addCriterion("SEGMENT3_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment3LowIsNotNull() {
            addCriterion("SEGMENT3_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3LowEqualTo(String value) {
            addCriterion("SEGMENT3_LOW =", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowNotEqualTo(String value) {
            addCriterion("SEGMENT3_LOW <>", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowGreaterThan(String value) {
            addCriterion("SEGMENT3_LOW >", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3_LOW >=", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowLessThan(String value) {
            addCriterion("SEGMENT3_LOW <", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3_LOW <=", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowLike(String value) {
            addCriterion("SEGMENT3_LOW like", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowNotLike(String value) {
            addCriterion("SEGMENT3_LOW not like", value, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowIn(List<String> values) {
            addCriterion("SEGMENT3_LOW in", values, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowNotIn(List<String> values) {
            addCriterion("SEGMENT3_LOW not in", values, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowBetween(String value1, String value2) {
            addCriterion("SEGMENT3_LOW between", value1, value2, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT3_LOW not between", value1, value2, "segment3Low");
            return (Criteria) this;
        }

        public Criteria andSegment3HighIsNull() {
            addCriterion("SEGMENT3_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment3HighIsNotNull() {
            addCriterion("SEGMENT3_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3HighEqualTo(String value) {
            addCriterion("SEGMENT3_HIGH =", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighNotEqualTo(String value) {
            addCriterion("SEGMENT3_HIGH <>", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighGreaterThan(String value) {
            addCriterion("SEGMENT3_HIGH >", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3_HIGH >=", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighLessThan(String value) {
            addCriterion("SEGMENT3_HIGH <", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3_HIGH <=", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighLike(String value) {
            addCriterion("SEGMENT3_HIGH like", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighNotLike(String value) {
            addCriterion("SEGMENT3_HIGH not like", value, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighIn(List<String> values) {
            addCriterion("SEGMENT3_HIGH in", values, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighNotIn(List<String> values) {
            addCriterion("SEGMENT3_HIGH not in", values, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighBetween(String value1, String value2) {
            addCriterion("SEGMENT3_HIGH between", value1, value2, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment3HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT3_HIGH not between", value1, value2, "segment3High");
            return (Criteria) this;
        }

        public Criteria andSegment4LowIsNull() {
            addCriterion("SEGMENT4_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment4LowIsNotNull() {
            addCriterion("SEGMENT4_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4LowEqualTo(String value) {
            addCriterion("SEGMENT4_LOW =", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowNotEqualTo(String value) {
            addCriterion("SEGMENT4_LOW <>", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowGreaterThan(String value) {
            addCriterion("SEGMENT4_LOW >", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4_LOW >=", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowLessThan(String value) {
            addCriterion("SEGMENT4_LOW <", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4_LOW <=", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowLike(String value) {
            addCriterion("SEGMENT4_LOW like", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowNotLike(String value) {
            addCriterion("SEGMENT4_LOW not like", value, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowIn(List<String> values) {
            addCriterion("SEGMENT4_LOW in", values, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowNotIn(List<String> values) {
            addCriterion("SEGMENT4_LOW not in", values, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowBetween(String value1, String value2) {
            addCriterion("SEGMENT4_LOW between", value1, value2, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT4_LOW not between", value1, value2, "segment4Low");
            return (Criteria) this;
        }

        public Criteria andSegment4HighIsNull() {
            addCriterion("SEGMENT4_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment4HighIsNotNull() {
            addCriterion("SEGMENT4_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4HighEqualTo(String value) {
            addCriterion("SEGMENT4_HIGH =", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighNotEqualTo(String value) {
            addCriterion("SEGMENT4_HIGH <>", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighGreaterThan(String value) {
            addCriterion("SEGMENT4_HIGH >", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4_HIGH >=", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighLessThan(String value) {
            addCriterion("SEGMENT4_HIGH <", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4_HIGH <=", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighLike(String value) {
            addCriterion("SEGMENT4_HIGH like", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighNotLike(String value) {
            addCriterion("SEGMENT4_HIGH not like", value, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighIn(List<String> values) {
            addCriterion("SEGMENT4_HIGH in", values, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighNotIn(List<String> values) {
            addCriterion("SEGMENT4_HIGH not in", values, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighBetween(String value1, String value2) {
            addCriterion("SEGMENT4_HIGH between", value1, value2, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment4HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT4_HIGH not between", value1, value2, "segment4High");
            return (Criteria) this;
        }

        public Criteria andSegment5LowIsNull() {
            addCriterion("SEGMENT5_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment5LowIsNotNull() {
            addCriterion("SEGMENT5_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5LowEqualTo(String value) {
            addCriterion("SEGMENT5_LOW =", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowNotEqualTo(String value) {
            addCriterion("SEGMENT5_LOW <>", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowGreaterThan(String value) {
            addCriterion("SEGMENT5_LOW >", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5_LOW >=", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowLessThan(String value) {
            addCriterion("SEGMENT5_LOW <", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5_LOW <=", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowLike(String value) {
            addCriterion("SEGMENT5_LOW like", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowNotLike(String value) {
            addCriterion("SEGMENT5_LOW not like", value, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowIn(List<String> values) {
            addCriterion("SEGMENT5_LOW in", values, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowNotIn(List<String> values) {
            addCriterion("SEGMENT5_LOW not in", values, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowBetween(String value1, String value2) {
            addCriterion("SEGMENT5_LOW between", value1, value2, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT5_LOW not between", value1, value2, "segment5Low");
            return (Criteria) this;
        }

        public Criteria andSegment5HighIsNull() {
            addCriterion("SEGMENT5_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment5HighIsNotNull() {
            addCriterion("SEGMENT5_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5HighEqualTo(String value) {
            addCriterion("SEGMENT5_HIGH =", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighNotEqualTo(String value) {
            addCriterion("SEGMENT5_HIGH <>", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighGreaterThan(String value) {
            addCriterion("SEGMENT5_HIGH >", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5_HIGH >=", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighLessThan(String value) {
            addCriterion("SEGMENT5_HIGH <", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5_HIGH <=", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighLike(String value) {
            addCriterion("SEGMENT5_HIGH like", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighNotLike(String value) {
            addCriterion("SEGMENT5_HIGH not like", value, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighIn(List<String> values) {
            addCriterion("SEGMENT5_HIGH in", values, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighNotIn(List<String> values) {
            addCriterion("SEGMENT5_HIGH not in", values, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighBetween(String value1, String value2) {
            addCriterion("SEGMENT5_HIGH between", value1, value2, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment5HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT5_HIGH not between", value1, value2, "segment5High");
            return (Criteria) this;
        }

        public Criteria andSegment6LowIsNull() {
            addCriterion("SEGMENT6_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment6LowIsNotNull() {
            addCriterion("SEGMENT6_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6LowEqualTo(String value) {
            addCriterion("SEGMENT6_LOW =", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowNotEqualTo(String value) {
            addCriterion("SEGMENT6_LOW <>", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowGreaterThan(String value) {
            addCriterion("SEGMENT6_LOW >", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6_LOW >=", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowLessThan(String value) {
            addCriterion("SEGMENT6_LOW <", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6_LOW <=", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowLike(String value) {
            addCriterion("SEGMENT6_LOW like", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowNotLike(String value) {
            addCriterion("SEGMENT6_LOW not like", value, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowIn(List<String> values) {
            addCriterion("SEGMENT6_LOW in", values, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowNotIn(List<String> values) {
            addCriterion("SEGMENT6_LOW not in", values, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowBetween(String value1, String value2) {
            addCriterion("SEGMENT6_LOW between", value1, value2, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT6_LOW not between", value1, value2, "segment6Low");
            return (Criteria) this;
        }

        public Criteria andSegment6HighIsNull() {
            addCriterion("SEGMENT6_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment6HighIsNotNull() {
            addCriterion("SEGMENT6_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6HighEqualTo(String value) {
            addCriterion("SEGMENT6_HIGH =", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighNotEqualTo(String value) {
            addCriterion("SEGMENT6_HIGH <>", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighGreaterThan(String value) {
            addCriterion("SEGMENT6_HIGH >", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6_HIGH >=", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighLessThan(String value) {
            addCriterion("SEGMENT6_HIGH <", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6_HIGH <=", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighLike(String value) {
            addCriterion("SEGMENT6_HIGH like", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighNotLike(String value) {
            addCriterion("SEGMENT6_HIGH not like", value, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighIn(List<String> values) {
            addCriterion("SEGMENT6_HIGH in", values, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighNotIn(List<String> values) {
            addCriterion("SEGMENT6_HIGH not in", values, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighBetween(String value1, String value2) {
            addCriterion("SEGMENT6_HIGH between", value1, value2, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment6HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT6_HIGH not between", value1, value2, "segment6High");
            return (Criteria) this;
        }

        public Criteria andSegment7LowIsNull() {
            addCriterion("SEGMENT7_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment7LowIsNotNull() {
            addCriterion("SEGMENT7_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7LowEqualTo(String value) {
            addCriterion("SEGMENT7_LOW =", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowNotEqualTo(String value) {
            addCriterion("SEGMENT7_LOW <>", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowGreaterThan(String value) {
            addCriterion("SEGMENT7_LOW >", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7_LOW >=", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowLessThan(String value) {
            addCriterion("SEGMENT7_LOW <", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7_LOW <=", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowLike(String value) {
            addCriterion("SEGMENT7_LOW like", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowNotLike(String value) {
            addCriterion("SEGMENT7_LOW not like", value, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowIn(List<String> values) {
            addCriterion("SEGMENT7_LOW in", values, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowNotIn(List<String> values) {
            addCriterion("SEGMENT7_LOW not in", values, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowBetween(String value1, String value2) {
            addCriterion("SEGMENT7_LOW between", value1, value2, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT7_LOW not between", value1, value2, "segment7Low");
            return (Criteria) this;
        }

        public Criteria andSegment7HighIsNull() {
            addCriterion("SEGMENT7_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment7HighIsNotNull() {
            addCriterion("SEGMENT7_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7HighEqualTo(String value) {
            addCriterion("SEGMENT7_HIGH =", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighNotEqualTo(String value) {
            addCriterion("SEGMENT7_HIGH <>", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighGreaterThan(String value) {
            addCriterion("SEGMENT7_HIGH >", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7_HIGH >=", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighLessThan(String value) {
            addCriterion("SEGMENT7_HIGH <", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7_HIGH <=", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighLike(String value) {
            addCriterion("SEGMENT7_HIGH like", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighNotLike(String value) {
            addCriterion("SEGMENT7_HIGH not like", value, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighIn(List<String> values) {
            addCriterion("SEGMENT7_HIGH in", values, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighNotIn(List<String> values) {
            addCriterion("SEGMENT7_HIGH not in", values, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighBetween(String value1, String value2) {
            addCriterion("SEGMENT7_HIGH between", value1, value2, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment7HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT7_HIGH not between", value1, value2, "segment7High");
            return (Criteria) this;
        }

        public Criteria andSegment8LowIsNull() {
            addCriterion("SEGMENT8_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment8LowIsNotNull() {
            addCriterion("SEGMENT8_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8LowEqualTo(String value) {
            addCriterion("SEGMENT8_LOW =", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowNotEqualTo(String value) {
            addCriterion("SEGMENT8_LOW <>", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowGreaterThan(String value) {
            addCriterion("SEGMENT8_LOW >", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT8_LOW >=", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowLessThan(String value) {
            addCriterion("SEGMENT8_LOW <", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT8_LOW <=", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowLike(String value) {
            addCriterion("SEGMENT8_LOW like", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowNotLike(String value) {
            addCriterion("SEGMENT8_LOW not like", value, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowIn(List<String> values) {
            addCriterion("SEGMENT8_LOW in", values, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowNotIn(List<String> values) {
            addCriterion("SEGMENT8_LOW not in", values, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowBetween(String value1, String value2) {
            addCriterion("SEGMENT8_LOW between", value1, value2, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT8_LOW not between", value1, value2, "segment8Low");
            return (Criteria) this;
        }

        public Criteria andSegment8HighIsNull() {
            addCriterion("SEGMENT8_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment8HighIsNotNull() {
            addCriterion("SEGMENT8_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8HighEqualTo(String value) {
            addCriterion("SEGMENT8_HIGH =", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighNotEqualTo(String value) {
            addCriterion("SEGMENT8_HIGH <>", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighGreaterThan(String value) {
            addCriterion("SEGMENT8_HIGH >", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT8_HIGH >=", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighLessThan(String value) {
            addCriterion("SEGMENT8_HIGH <", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT8_HIGH <=", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighLike(String value) {
            addCriterion("SEGMENT8_HIGH like", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighNotLike(String value) {
            addCriterion("SEGMENT8_HIGH not like", value, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighIn(List<String> values) {
            addCriterion("SEGMENT8_HIGH in", values, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighNotIn(List<String> values) {
            addCriterion("SEGMENT8_HIGH not in", values, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighBetween(String value1, String value2) {
            addCriterion("SEGMENT8_HIGH between", value1, value2, "segment8High");
            return (Criteria) this;
        }

        public Criteria andSegment8HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT8_HIGH not between", value1, value2, "segment8High");
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

        public Criteria andLastopdateIsNull() {
            addCriterion("LASTOPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("LASTOPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("LASTOPDATE =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("LASTOPDATE <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("LASTOPDATE >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("LASTOPDATE <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("LASTOPDATE in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("LASTOPDATE not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("HIBERNATEVERSION is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("HIBERNATEVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Integer value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Integer value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Integer value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Integer> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Integer> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Integer value1, Integer value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Integer value1, Integer value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andSegment9LowIsNull() {
            addCriterion("SEGMENT9_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment9LowIsNotNull() {
            addCriterion("SEGMENT9_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9LowEqualTo(String value) {
            addCriterion("SEGMENT9_LOW =", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowNotEqualTo(String value) {
            addCriterion("SEGMENT9_LOW <>", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowGreaterThan(String value) {
            addCriterion("SEGMENT9_LOW >", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT9_LOW >=", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowLessThan(String value) {
            addCriterion("SEGMENT9_LOW <", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT9_LOW <=", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowLike(String value) {
            addCriterion("SEGMENT9_LOW like", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowNotLike(String value) {
            addCriterion("SEGMENT9_LOW not like", value, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowIn(List<String> values) {
            addCriterion("SEGMENT9_LOW in", values, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowNotIn(List<String> values) {
            addCriterion("SEGMENT9_LOW not in", values, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowBetween(String value1, String value2) {
            addCriterion("SEGMENT9_LOW between", value1, value2, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT9_LOW not between", value1, value2, "segment9Low");
            return (Criteria) this;
        }

        public Criteria andSegment9HighIsNull() {
            addCriterion("SEGMENT9_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment9HighIsNotNull() {
            addCriterion("SEGMENT9_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9HighEqualTo(String value) {
            addCriterion("SEGMENT9_HIGH =", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighNotEqualTo(String value) {
            addCriterion("SEGMENT9_HIGH <>", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighGreaterThan(String value) {
            addCriterion("SEGMENT9_HIGH >", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT9_HIGH >=", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighLessThan(String value) {
            addCriterion("SEGMENT9_HIGH <", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT9_HIGH <=", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighLike(String value) {
            addCriterion("SEGMENT9_HIGH like", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighNotLike(String value) {
            addCriterion("SEGMENT9_HIGH not like", value, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighIn(List<String> values) {
            addCriterion("SEGMENT9_HIGH in", values, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighNotIn(List<String> values) {
            addCriterion("SEGMENT9_HIGH not in", values, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighBetween(String value1, String value2) {
            addCriterion("SEGMENT9_HIGH between", value1, value2, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment9HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT9_HIGH not between", value1, value2, "segment9High");
            return (Criteria) this;
        }

        public Criteria andSegment10LowIsNull() {
            addCriterion("SEGMENT10_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment10LowIsNotNull() {
            addCriterion("SEGMENT10_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10LowEqualTo(String value) {
            addCriterion("SEGMENT10_LOW =", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowNotEqualTo(String value) {
            addCriterion("SEGMENT10_LOW <>", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowGreaterThan(String value) {
            addCriterion("SEGMENT10_LOW >", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT10_LOW >=", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowLessThan(String value) {
            addCriterion("SEGMENT10_LOW <", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT10_LOW <=", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowLike(String value) {
            addCriterion("SEGMENT10_LOW like", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowNotLike(String value) {
            addCriterion("SEGMENT10_LOW not like", value, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowIn(List<String> values) {
            addCriterion("SEGMENT10_LOW in", values, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowNotIn(List<String> values) {
            addCriterion("SEGMENT10_LOW not in", values, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowBetween(String value1, String value2) {
            addCriterion("SEGMENT10_LOW between", value1, value2, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT10_LOW not between", value1, value2, "segment10Low");
            return (Criteria) this;
        }

        public Criteria andSegment10HighIsNull() {
            addCriterion("SEGMENT10_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment10HighIsNotNull() {
            addCriterion("SEGMENT10_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10HighEqualTo(String value) {
            addCriterion("SEGMENT10_HIGH =", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighNotEqualTo(String value) {
            addCriterion("SEGMENT10_HIGH <>", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighGreaterThan(String value) {
            addCriterion("SEGMENT10_HIGH >", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT10_HIGH >=", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighLessThan(String value) {
            addCriterion("SEGMENT10_HIGH <", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT10_HIGH <=", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighLike(String value) {
            addCriterion("SEGMENT10_HIGH like", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighNotLike(String value) {
            addCriterion("SEGMENT10_HIGH not like", value, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighIn(List<String> values) {
            addCriterion("SEGMENT10_HIGH in", values, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighNotIn(List<String> values) {
            addCriterion("SEGMENT10_HIGH not in", values, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighBetween(String value1, String value2) {
            addCriterion("SEGMENT10_HIGH between", value1, value2, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment10HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT10_HIGH not between", value1, value2, "segment10High");
            return (Criteria) this;
        }

        public Criteria andSegment11LowIsNull() {
            addCriterion("SEGMENT11_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment11LowIsNotNull() {
            addCriterion("SEGMENT11_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11LowEqualTo(String value) {
            addCriterion("SEGMENT11_LOW =", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowNotEqualTo(String value) {
            addCriterion("SEGMENT11_LOW <>", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowGreaterThan(String value) {
            addCriterion("SEGMENT11_LOW >", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT11_LOW >=", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowLessThan(String value) {
            addCriterion("SEGMENT11_LOW <", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT11_LOW <=", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowLike(String value) {
            addCriterion("SEGMENT11_LOW like", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowNotLike(String value) {
            addCriterion("SEGMENT11_LOW not like", value, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowIn(List<String> values) {
            addCriterion("SEGMENT11_LOW in", values, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowNotIn(List<String> values) {
            addCriterion("SEGMENT11_LOW not in", values, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowBetween(String value1, String value2) {
            addCriterion("SEGMENT11_LOW between", value1, value2, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT11_LOW not between", value1, value2, "segment11Low");
            return (Criteria) this;
        }

        public Criteria andSegment11HighIsNull() {
            addCriterion("SEGMENT11_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment11HighIsNotNull() {
            addCriterion("SEGMENT11_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11HighEqualTo(String value) {
            addCriterion("SEGMENT11_HIGH =", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighNotEqualTo(String value) {
            addCriterion("SEGMENT11_HIGH <>", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighGreaterThan(String value) {
            addCriterion("SEGMENT11_HIGH >", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT11_HIGH >=", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighLessThan(String value) {
            addCriterion("SEGMENT11_HIGH <", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT11_HIGH <=", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighLike(String value) {
            addCriterion("SEGMENT11_HIGH like", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighNotLike(String value) {
            addCriterion("SEGMENT11_HIGH not like", value, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighIn(List<String> values) {
            addCriterion("SEGMENT11_HIGH in", values, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighNotIn(List<String> values) {
            addCriterion("SEGMENT11_HIGH not in", values, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighBetween(String value1, String value2) {
            addCriterion("SEGMENT11_HIGH between", value1, value2, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment11HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT11_HIGH not between", value1, value2, "segment11High");
            return (Criteria) this;
        }

        public Criteria andSegment12LowIsNull() {
            addCriterion("SEGMENT12_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment12LowIsNotNull() {
            addCriterion("SEGMENT12_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12LowEqualTo(String value) {
            addCriterion("SEGMENT12_LOW =", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowNotEqualTo(String value) {
            addCriterion("SEGMENT12_LOW <>", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowGreaterThan(String value) {
            addCriterion("SEGMENT12_LOW >", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT12_LOW >=", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowLessThan(String value) {
            addCriterion("SEGMENT12_LOW <", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT12_LOW <=", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowLike(String value) {
            addCriterion("SEGMENT12_LOW like", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowNotLike(String value) {
            addCriterion("SEGMENT12_LOW not like", value, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowIn(List<String> values) {
            addCriterion("SEGMENT12_LOW in", values, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowNotIn(List<String> values) {
            addCriterion("SEGMENT12_LOW not in", values, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowBetween(String value1, String value2) {
            addCriterion("SEGMENT12_LOW between", value1, value2, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT12_LOW not between", value1, value2, "segment12Low");
            return (Criteria) this;
        }

        public Criteria andSegment12HighIsNull() {
            addCriterion("SEGMENT12_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment12HighIsNotNull() {
            addCriterion("SEGMENT12_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12HighEqualTo(String value) {
            addCriterion("SEGMENT12_HIGH =", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighNotEqualTo(String value) {
            addCriterion("SEGMENT12_HIGH <>", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighGreaterThan(String value) {
            addCriterion("SEGMENT12_HIGH >", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT12_HIGH >=", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighLessThan(String value) {
            addCriterion("SEGMENT12_HIGH <", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT12_HIGH <=", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighLike(String value) {
            addCriterion("SEGMENT12_HIGH like", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighNotLike(String value) {
            addCriterion("SEGMENT12_HIGH not like", value, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighIn(List<String> values) {
            addCriterion("SEGMENT12_HIGH in", values, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighNotIn(List<String> values) {
            addCriterion("SEGMENT12_HIGH not in", values, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighBetween(String value1, String value2) {
            addCriterion("SEGMENT12_HIGH between", value1, value2, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment12HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT12_HIGH not between", value1, value2, "segment12High");
            return (Criteria) this;
        }

        public Criteria andSegment13LowIsNull() {
            addCriterion("SEGMENT13_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment13LowIsNotNull() {
            addCriterion("SEGMENT13_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment13LowEqualTo(String value) {
            addCriterion("SEGMENT13_LOW =", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowNotEqualTo(String value) {
            addCriterion("SEGMENT13_LOW <>", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowGreaterThan(String value) {
            addCriterion("SEGMENT13_LOW >", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT13_LOW >=", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowLessThan(String value) {
            addCriterion("SEGMENT13_LOW <", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT13_LOW <=", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowLike(String value) {
            addCriterion("SEGMENT13_LOW like", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowNotLike(String value) {
            addCriterion("SEGMENT13_LOW not like", value, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowIn(List<String> values) {
            addCriterion("SEGMENT13_LOW in", values, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowNotIn(List<String> values) {
            addCriterion("SEGMENT13_LOW not in", values, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowBetween(String value1, String value2) {
            addCriterion("SEGMENT13_LOW between", value1, value2, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT13_LOW not between", value1, value2, "segment13Low");
            return (Criteria) this;
        }

        public Criteria andSegment13HighIsNull() {
            addCriterion("SEGMENT13_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment13HighIsNotNull() {
            addCriterion("SEGMENT13_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment13HighEqualTo(String value) {
            addCriterion("SEGMENT13_HIGH =", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighNotEqualTo(String value) {
            addCriterion("SEGMENT13_HIGH <>", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighGreaterThan(String value) {
            addCriterion("SEGMENT13_HIGH >", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT13_HIGH >=", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighLessThan(String value) {
            addCriterion("SEGMENT13_HIGH <", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT13_HIGH <=", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighLike(String value) {
            addCriterion("SEGMENT13_HIGH like", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighNotLike(String value) {
            addCriterion("SEGMENT13_HIGH not like", value, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighIn(List<String> values) {
            addCriterion("SEGMENT13_HIGH in", values, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighNotIn(List<String> values) {
            addCriterion("SEGMENT13_HIGH not in", values, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighBetween(String value1, String value2) {
            addCriterion("SEGMENT13_HIGH between", value1, value2, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment13HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT13_HIGH not between", value1, value2, "segment13High");
            return (Criteria) this;
        }

        public Criteria andSegment14LowIsNull() {
            addCriterion("SEGMENT14_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment14LowIsNotNull() {
            addCriterion("SEGMENT14_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment14LowEqualTo(String value) {
            addCriterion("SEGMENT14_LOW =", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowNotEqualTo(String value) {
            addCriterion("SEGMENT14_LOW <>", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowGreaterThan(String value) {
            addCriterion("SEGMENT14_LOW >", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT14_LOW >=", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowLessThan(String value) {
            addCriterion("SEGMENT14_LOW <", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT14_LOW <=", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowLike(String value) {
            addCriterion("SEGMENT14_LOW like", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowNotLike(String value) {
            addCriterion("SEGMENT14_LOW not like", value, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowIn(List<String> values) {
            addCriterion("SEGMENT14_LOW in", values, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowNotIn(List<String> values) {
            addCriterion("SEGMENT14_LOW not in", values, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowBetween(String value1, String value2) {
            addCriterion("SEGMENT14_LOW between", value1, value2, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT14_LOW not between", value1, value2, "segment14Low");
            return (Criteria) this;
        }

        public Criteria andSegment14HighIsNull() {
            addCriterion("SEGMENT14_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment14HighIsNotNull() {
            addCriterion("SEGMENT14_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment14HighEqualTo(String value) {
            addCriterion("SEGMENT14_HIGH =", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighNotEqualTo(String value) {
            addCriterion("SEGMENT14_HIGH <>", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighGreaterThan(String value) {
            addCriterion("SEGMENT14_HIGH >", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT14_HIGH >=", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighLessThan(String value) {
            addCriterion("SEGMENT14_HIGH <", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT14_HIGH <=", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighLike(String value) {
            addCriterion("SEGMENT14_HIGH like", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighNotLike(String value) {
            addCriterion("SEGMENT14_HIGH not like", value, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighIn(List<String> values) {
            addCriterion("SEGMENT14_HIGH in", values, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighNotIn(List<String> values) {
            addCriterion("SEGMENT14_HIGH not in", values, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighBetween(String value1, String value2) {
            addCriterion("SEGMENT14_HIGH between", value1, value2, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment14HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT14_HIGH not between", value1, value2, "segment14High");
            return (Criteria) this;
        }

        public Criteria andSegment15LowIsNull() {
            addCriterion("SEGMENT15_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment15LowIsNotNull() {
            addCriterion("SEGMENT15_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment15LowEqualTo(String value) {
            addCriterion("SEGMENT15_LOW =", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowNotEqualTo(String value) {
            addCriterion("SEGMENT15_LOW <>", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowGreaterThan(String value) {
            addCriterion("SEGMENT15_LOW >", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT15_LOW >=", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowLessThan(String value) {
            addCriterion("SEGMENT15_LOW <", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT15_LOW <=", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowLike(String value) {
            addCriterion("SEGMENT15_LOW like", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowNotLike(String value) {
            addCriterion("SEGMENT15_LOW not like", value, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowIn(List<String> values) {
            addCriterion("SEGMENT15_LOW in", values, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowNotIn(List<String> values) {
            addCriterion("SEGMENT15_LOW not in", values, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowBetween(String value1, String value2) {
            addCriterion("SEGMENT15_LOW between", value1, value2, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT15_LOW not between", value1, value2, "segment15Low");
            return (Criteria) this;
        }

        public Criteria andSegment15HighIsNull() {
            addCriterion("SEGMENT15_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment15HighIsNotNull() {
            addCriterion("SEGMENT15_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment15HighEqualTo(String value) {
            addCriterion("SEGMENT15_HIGH =", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighNotEqualTo(String value) {
            addCriterion("SEGMENT15_HIGH <>", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighGreaterThan(String value) {
            addCriterion("SEGMENT15_HIGH >", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT15_HIGH >=", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighLessThan(String value) {
            addCriterion("SEGMENT15_HIGH <", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT15_HIGH <=", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighLike(String value) {
            addCriterion("SEGMENT15_HIGH like", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighNotLike(String value) {
            addCriterion("SEGMENT15_HIGH not like", value, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighIn(List<String> values) {
            addCriterion("SEGMENT15_HIGH in", values, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighNotIn(List<String> values) {
            addCriterion("SEGMENT15_HIGH not in", values, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighBetween(String value1, String value2) {
            addCriterion("SEGMENT15_HIGH between", value1, value2, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment15HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT15_HIGH not between", value1, value2, "segment15High");
            return (Criteria) this;
        }

        public Criteria andSegment16LowIsNull() {
            addCriterion("SEGMENT16_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment16LowIsNotNull() {
            addCriterion("SEGMENT16_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment16LowEqualTo(String value) {
            addCriterion("SEGMENT16_LOW =", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowNotEqualTo(String value) {
            addCriterion("SEGMENT16_LOW <>", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowGreaterThan(String value) {
            addCriterion("SEGMENT16_LOW >", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT16_LOW >=", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowLessThan(String value) {
            addCriterion("SEGMENT16_LOW <", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT16_LOW <=", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowLike(String value) {
            addCriterion("SEGMENT16_LOW like", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowNotLike(String value) {
            addCriterion("SEGMENT16_LOW not like", value, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowIn(List<String> values) {
            addCriterion("SEGMENT16_LOW in", values, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowNotIn(List<String> values) {
            addCriterion("SEGMENT16_LOW not in", values, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowBetween(String value1, String value2) {
            addCriterion("SEGMENT16_LOW between", value1, value2, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT16_LOW not between", value1, value2, "segment16Low");
            return (Criteria) this;
        }

        public Criteria andSegment16HighIsNull() {
            addCriterion("SEGMENT16_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment16HighIsNotNull() {
            addCriterion("SEGMENT16_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment16HighEqualTo(String value) {
            addCriterion("SEGMENT16_HIGH =", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighNotEqualTo(String value) {
            addCriterion("SEGMENT16_HIGH <>", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighGreaterThan(String value) {
            addCriterion("SEGMENT16_HIGH >", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT16_HIGH >=", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighLessThan(String value) {
            addCriterion("SEGMENT16_HIGH <", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT16_HIGH <=", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighLike(String value) {
            addCriterion("SEGMENT16_HIGH like", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighNotLike(String value) {
            addCriterion("SEGMENT16_HIGH not like", value, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighIn(List<String> values) {
            addCriterion("SEGMENT16_HIGH in", values, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighNotIn(List<String> values) {
            addCriterion("SEGMENT16_HIGH not in", values, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighBetween(String value1, String value2) {
            addCriterion("SEGMENT16_HIGH between", value1, value2, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment16HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT16_HIGH not between", value1, value2, "segment16High");
            return (Criteria) this;
        }

        public Criteria andSegment17LowIsNull() {
            addCriterion("SEGMENT17_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment17LowIsNotNull() {
            addCriterion("SEGMENT17_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment17LowEqualTo(String value) {
            addCriterion("SEGMENT17_LOW =", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowNotEqualTo(String value) {
            addCriterion("SEGMENT17_LOW <>", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowGreaterThan(String value) {
            addCriterion("SEGMENT17_LOW >", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT17_LOW >=", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowLessThan(String value) {
            addCriterion("SEGMENT17_LOW <", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT17_LOW <=", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowLike(String value) {
            addCriterion("SEGMENT17_LOW like", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowNotLike(String value) {
            addCriterion("SEGMENT17_LOW not like", value, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowIn(List<String> values) {
            addCriterion("SEGMENT17_LOW in", values, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowNotIn(List<String> values) {
            addCriterion("SEGMENT17_LOW not in", values, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowBetween(String value1, String value2) {
            addCriterion("SEGMENT17_LOW between", value1, value2, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT17_LOW not between", value1, value2, "segment17Low");
            return (Criteria) this;
        }

        public Criteria andSegment17HighIsNull() {
            addCriterion("SEGMENT17_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment17HighIsNotNull() {
            addCriterion("SEGMENT17_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment17HighEqualTo(String value) {
            addCriterion("SEGMENT17_HIGH =", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighNotEqualTo(String value) {
            addCriterion("SEGMENT17_HIGH <>", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighGreaterThan(String value) {
            addCriterion("SEGMENT17_HIGH >", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT17_HIGH >=", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighLessThan(String value) {
            addCriterion("SEGMENT17_HIGH <", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT17_HIGH <=", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighLike(String value) {
            addCriterion("SEGMENT17_HIGH like", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighNotLike(String value) {
            addCriterion("SEGMENT17_HIGH not like", value, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighIn(List<String> values) {
            addCriterion("SEGMENT17_HIGH in", values, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighNotIn(List<String> values) {
            addCriterion("SEGMENT17_HIGH not in", values, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighBetween(String value1, String value2) {
            addCriterion("SEGMENT17_HIGH between", value1, value2, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment17HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT17_HIGH not between", value1, value2, "segment17High");
            return (Criteria) this;
        }

        public Criteria andSegment18LowIsNull() {
            addCriterion("SEGMENT18_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment18LowIsNotNull() {
            addCriterion("SEGMENT18_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment18LowEqualTo(String value) {
            addCriterion("SEGMENT18_LOW =", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowNotEqualTo(String value) {
            addCriterion("SEGMENT18_LOW <>", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowGreaterThan(String value) {
            addCriterion("SEGMENT18_LOW >", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT18_LOW >=", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowLessThan(String value) {
            addCriterion("SEGMENT18_LOW <", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT18_LOW <=", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowLike(String value) {
            addCriterion("SEGMENT18_LOW like", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowNotLike(String value) {
            addCriterion("SEGMENT18_LOW not like", value, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowIn(List<String> values) {
            addCriterion("SEGMENT18_LOW in", values, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowNotIn(List<String> values) {
            addCriterion("SEGMENT18_LOW not in", values, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowBetween(String value1, String value2) {
            addCriterion("SEGMENT18_LOW between", value1, value2, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT18_LOW not between", value1, value2, "segment18Low");
            return (Criteria) this;
        }

        public Criteria andSegment18HighIsNull() {
            addCriterion("SEGMENT18_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment18HighIsNotNull() {
            addCriterion("SEGMENT18_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment18HighEqualTo(String value) {
            addCriterion("SEGMENT18_HIGH =", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighNotEqualTo(String value) {
            addCriterion("SEGMENT18_HIGH <>", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighGreaterThan(String value) {
            addCriterion("SEGMENT18_HIGH >", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT18_HIGH >=", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighLessThan(String value) {
            addCriterion("SEGMENT18_HIGH <", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT18_HIGH <=", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighLike(String value) {
            addCriterion("SEGMENT18_HIGH like", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighNotLike(String value) {
            addCriterion("SEGMENT18_HIGH not like", value, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighIn(List<String> values) {
            addCriterion("SEGMENT18_HIGH in", values, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighNotIn(List<String> values) {
            addCriterion("SEGMENT18_HIGH not in", values, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighBetween(String value1, String value2) {
            addCriterion("SEGMENT18_HIGH between", value1, value2, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment18HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT18_HIGH not between", value1, value2, "segment18High");
            return (Criteria) this;
        }

        public Criteria andSegment19LowIsNull() {
            addCriterion("SEGMENT19_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment19LowIsNotNull() {
            addCriterion("SEGMENT19_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment19LowEqualTo(String value) {
            addCriterion("SEGMENT19_LOW =", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowNotEqualTo(String value) {
            addCriterion("SEGMENT19_LOW <>", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowGreaterThan(String value) {
            addCriterion("SEGMENT19_LOW >", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT19_LOW >=", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowLessThan(String value) {
            addCriterion("SEGMENT19_LOW <", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT19_LOW <=", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowLike(String value) {
            addCriterion("SEGMENT19_LOW like", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowNotLike(String value) {
            addCriterion("SEGMENT19_LOW not like", value, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowIn(List<String> values) {
            addCriterion("SEGMENT19_LOW in", values, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowNotIn(List<String> values) {
            addCriterion("SEGMENT19_LOW not in", values, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowBetween(String value1, String value2) {
            addCriterion("SEGMENT19_LOW between", value1, value2, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT19_LOW not between", value1, value2, "segment19Low");
            return (Criteria) this;
        }

        public Criteria andSegment19HighIsNull() {
            addCriterion("SEGMENT19_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment19HighIsNotNull() {
            addCriterion("SEGMENT19_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment19HighEqualTo(String value) {
            addCriterion("SEGMENT19_HIGH =", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighNotEqualTo(String value) {
            addCriterion("SEGMENT19_HIGH <>", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighGreaterThan(String value) {
            addCriterion("SEGMENT19_HIGH >", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT19_HIGH >=", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighLessThan(String value) {
            addCriterion("SEGMENT19_HIGH <", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT19_HIGH <=", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighLike(String value) {
            addCriterion("SEGMENT19_HIGH like", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighNotLike(String value) {
            addCriterion("SEGMENT19_HIGH not like", value, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighIn(List<String> values) {
            addCriterion("SEGMENT19_HIGH in", values, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighNotIn(List<String> values) {
            addCriterion("SEGMENT19_HIGH not in", values, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighBetween(String value1, String value2) {
            addCriterion("SEGMENT19_HIGH between", value1, value2, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment19HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT19_HIGH not between", value1, value2, "segment19High");
            return (Criteria) this;
        }

        public Criteria andSegment20LowIsNull() {
            addCriterion("SEGMENT20_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment20LowIsNotNull() {
            addCriterion("SEGMENT20_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment20LowEqualTo(String value) {
            addCriterion("SEGMENT20_LOW =", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowNotEqualTo(String value) {
            addCriterion("SEGMENT20_LOW <>", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowGreaterThan(String value) {
            addCriterion("SEGMENT20_LOW >", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT20_LOW >=", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowLessThan(String value) {
            addCriterion("SEGMENT20_LOW <", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT20_LOW <=", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowLike(String value) {
            addCriterion("SEGMENT20_LOW like", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowNotLike(String value) {
            addCriterion("SEGMENT20_LOW not like", value, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowIn(List<String> values) {
            addCriterion("SEGMENT20_LOW in", values, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowNotIn(List<String> values) {
            addCriterion("SEGMENT20_LOW not in", values, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowBetween(String value1, String value2) {
            addCriterion("SEGMENT20_LOW between", value1, value2, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT20_LOW not between", value1, value2, "segment20Low");
            return (Criteria) this;
        }

        public Criteria andSegment20HighIsNull() {
            addCriterion("SEGMENT20_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment20HighIsNotNull() {
            addCriterion("SEGMENT20_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment20HighEqualTo(String value) {
            addCriterion("SEGMENT20_HIGH =", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighNotEqualTo(String value) {
            addCriterion("SEGMENT20_HIGH <>", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighGreaterThan(String value) {
            addCriterion("SEGMENT20_HIGH >", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT20_HIGH >=", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighLessThan(String value) {
            addCriterion("SEGMENT20_HIGH <", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT20_HIGH <=", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighLike(String value) {
            addCriterion("SEGMENT20_HIGH like", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighNotLike(String value) {
            addCriterion("SEGMENT20_HIGH not like", value, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighIn(List<String> values) {
            addCriterion("SEGMENT20_HIGH in", values, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighNotIn(List<String> values) {
            addCriterion("SEGMENT20_HIGH not in", values, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighBetween(String value1, String value2) {
            addCriterion("SEGMENT20_HIGH between", value1, value2, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment20HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT20_HIGH not between", value1, value2, "segment20High");
            return (Criteria) this;
        }

        public Criteria andSegment21LowIsNull() {
            addCriterion("SEGMENT21_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment21LowIsNotNull() {
            addCriterion("SEGMENT21_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment21LowEqualTo(String value) {
            addCriterion("SEGMENT21_LOW =", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowNotEqualTo(String value) {
            addCriterion("SEGMENT21_LOW <>", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowGreaterThan(String value) {
            addCriterion("SEGMENT21_LOW >", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT21_LOW >=", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowLessThan(String value) {
            addCriterion("SEGMENT21_LOW <", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT21_LOW <=", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowLike(String value) {
            addCriterion("SEGMENT21_LOW like", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowNotLike(String value) {
            addCriterion("SEGMENT21_LOW not like", value, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowIn(List<String> values) {
            addCriterion("SEGMENT21_LOW in", values, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowNotIn(List<String> values) {
            addCriterion("SEGMENT21_LOW not in", values, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowBetween(String value1, String value2) {
            addCriterion("SEGMENT21_LOW between", value1, value2, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT21_LOW not between", value1, value2, "segment21Low");
            return (Criteria) this;
        }

        public Criteria andSegment21HighIsNull() {
            addCriterion("SEGMENT21_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment21HighIsNotNull() {
            addCriterion("SEGMENT21_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment21HighEqualTo(String value) {
            addCriterion("SEGMENT21_HIGH =", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighNotEqualTo(String value) {
            addCriterion("SEGMENT21_HIGH <>", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighGreaterThan(String value) {
            addCriterion("SEGMENT21_HIGH >", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT21_HIGH >=", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighLessThan(String value) {
            addCriterion("SEGMENT21_HIGH <", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT21_HIGH <=", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighLike(String value) {
            addCriterion("SEGMENT21_HIGH like", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighNotLike(String value) {
            addCriterion("SEGMENT21_HIGH not like", value, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighIn(List<String> values) {
            addCriterion("SEGMENT21_HIGH in", values, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighNotIn(List<String> values) {
            addCriterion("SEGMENT21_HIGH not in", values, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighBetween(String value1, String value2) {
            addCriterion("SEGMENT21_HIGH between", value1, value2, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment21HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT21_HIGH not between", value1, value2, "segment21High");
            return (Criteria) this;
        }

        public Criteria andSegment22LowIsNull() {
            addCriterion("SEGMENT22_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment22LowIsNotNull() {
            addCriterion("SEGMENT22_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment22LowEqualTo(String value) {
            addCriterion("SEGMENT22_LOW =", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowNotEqualTo(String value) {
            addCriterion("SEGMENT22_LOW <>", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowGreaterThan(String value) {
            addCriterion("SEGMENT22_LOW >", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT22_LOW >=", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowLessThan(String value) {
            addCriterion("SEGMENT22_LOW <", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT22_LOW <=", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowLike(String value) {
            addCriterion("SEGMENT22_LOW like", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowNotLike(String value) {
            addCriterion("SEGMENT22_LOW not like", value, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowIn(List<String> values) {
            addCriterion("SEGMENT22_LOW in", values, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowNotIn(List<String> values) {
            addCriterion("SEGMENT22_LOW not in", values, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowBetween(String value1, String value2) {
            addCriterion("SEGMENT22_LOW between", value1, value2, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT22_LOW not between", value1, value2, "segment22Low");
            return (Criteria) this;
        }

        public Criteria andSegment22HighIsNull() {
            addCriterion("SEGMENT22_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment22HighIsNotNull() {
            addCriterion("SEGMENT22_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment22HighEqualTo(String value) {
            addCriterion("SEGMENT22_HIGH =", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighNotEqualTo(String value) {
            addCriterion("SEGMENT22_HIGH <>", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighGreaterThan(String value) {
            addCriterion("SEGMENT22_HIGH >", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT22_HIGH >=", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighLessThan(String value) {
            addCriterion("SEGMENT22_HIGH <", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT22_HIGH <=", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighLike(String value) {
            addCriterion("SEGMENT22_HIGH like", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighNotLike(String value) {
            addCriterion("SEGMENT22_HIGH not like", value, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighIn(List<String> values) {
            addCriterion("SEGMENT22_HIGH in", values, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighNotIn(List<String> values) {
            addCriterion("SEGMENT22_HIGH not in", values, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighBetween(String value1, String value2) {
            addCriterion("SEGMENT22_HIGH between", value1, value2, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment22HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT22_HIGH not between", value1, value2, "segment22High");
            return (Criteria) this;
        }

        public Criteria andSegment23LowIsNull() {
            addCriterion("SEGMENT23_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment23LowIsNotNull() {
            addCriterion("SEGMENT23_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment23LowEqualTo(String value) {
            addCriterion("SEGMENT23_LOW =", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowNotEqualTo(String value) {
            addCriterion("SEGMENT23_LOW <>", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowGreaterThan(String value) {
            addCriterion("SEGMENT23_LOW >", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT23_LOW >=", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowLessThan(String value) {
            addCriterion("SEGMENT23_LOW <", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT23_LOW <=", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowLike(String value) {
            addCriterion("SEGMENT23_LOW like", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowNotLike(String value) {
            addCriterion("SEGMENT23_LOW not like", value, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowIn(List<String> values) {
            addCriterion("SEGMENT23_LOW in", values, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowNotIn(List<String> values) {
            addCriterion("SEGMENT23_LOW not in", values, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowBetween(String value1, String value2) {
            addCriterion("SEGMENT23_LOW between", value1, value2, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT23_LOW not between", value1, value2, "segment23Low");
            return (Criteria) this;
        }

        public Criteria andSegment23HighIsNull() {
            addCriterion("SEGMENT23_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment23HighIsNotNull() {
            addCriterion("SEGMENT23_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment23HighEqualTo(String value) {
            addCriterion("SEGMENT23_HIGH =", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighNotEqualTo(String value) {
            addCriterion("SEGMENT23_HIGH <>", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighGreaterThan(String value) {
            addCriterion("SEGMENT23_HIGH >", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT23_HIGH >=", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighLessThan(String value) {
            addCriterion("SEGMENT23_HIGH <", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT23_HIGH <=", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighLike(String value) {
            addCriterion("SEGMENT23_HIGH like", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighNotLike(String value) {
            addCriterion("SEGMENT23_HIGH not like", value, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighIn(List<String> values) {
            addCriterion("SEGMENT23_HIGH in", values, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighNotIn(List<String> values) {
            addCriterion("SEGMENT23_HIGH not in", values, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighBetween(String value1, String value2) {
            addCriterion("SEGMENT23_HIGH between", value1, value2, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment23HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT23_HIGH not between", value1, value2, "segment23High");
            return (Criteria) this;
        }

        public Criteria andSegment24LowIsNull() {
            addCriterion("SEGMENT24_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment24LowIsNotNull() {
            addCriterion("SEGMENT24_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment24LowEqualTo(String value) {
            addCriterion("SEGMENT24_LOW =", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowNotEqualTo(String value) {
            addCriterion("SEGMENT24_LOW <>", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowGreaterThan(String value) {
            addCriterion("SEGMENT24_LOW >", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT24_LOW >=", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowLessThan(String value) {
            addCriterion("SEGMENT24_LOW <", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT24_LOW <=", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowLike(String value) {
            addCriterion("SEGMENT24_LOW like", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowNotLike(String value) {
            addCriterion("SEGMENT24_LOW not like", value, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowIn(List<String> values) {
            addCriterion("SEGMENT24_LOW in", values, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowNotIn(List<String> values) {
            addCriterion("SEGMENT24_LOW not in", values, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowBetween(String value1, String value2) {
            addCriterion("SEGMENT24_LOW between", value1, value2, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT24_LOW not between", value1, value2, "segment24Low");
            return (Criteria) this;
        }

        public Criteria andSegment24HighIsNull() {
            addCriterion("SEGMENT24_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment24HighIsNotNull() {
            addCriterion("SEGMENT24_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment24HighEqualTo(String value) {
            addCriterion("SEGMENT24_HIGH =", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighNotEqualTo(String value) {
            addCriterion("SEGMENT24_HIGH <>", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighGreaterThan(String value) {
            addCriterion("SEGMENT24_HIGH >", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT24_HIGH >=", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighLessThan(String value) {
            addCriterion("SEGMENT24_HIGH <", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT24_HIGH <=", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighLike(String value) {
            addCriterion("SEGMENT24_HIGH like", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighNotLike(String value) {
            addCriterion("SEGMENT24_HIGH not like", value, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighIn(List<String> values) {
            addCriterion("SEGMENT24_HIGH in", values, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighNotIn(List<String> values) {
            addCriterion("SEGMENT24_HIGH not in", values, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighBetween(String value1, String value2) {
            addCriterion("SEGMENT24_HIGH between", value1, value2, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment24HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT24_HIGH not between", value1, value2, "segment24High");
            return (Criteria) this;
        }

        public Criteria andSegment25LowIsNull() {
            addCriterion("SEGMENT25_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment25LowIsNotNull() {
            addCriterion("SEGMENT25_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment25LowEqualTo(String value) {
            addCriterion("SEGMENT25_LOW =", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowNotEqualTo(String value) {
            addCriterion("SEGMENT25_LOW <>", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowGreaterThan(String value) {
            addCriterion("SEGMENT25_LOW >", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT25_LOW >=", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowLessThan(String value) {
            addCriterion("SEGMENT25_LOW <", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT25_LOW <=", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowLike(String value) {
            addCriterion("SEGMENT25_LOW like", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowNotLike(String value) {
            addCriterion("SEGMENT25_LOW not like", value, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowIn(List<String> values) {
            addCriterion("SEGMENT25_LOW in", values, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowNotIn(List<String> values) {
            addCriterion("SEGMENT25_LOW not in", values, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowBetween(String value1, String value2) {
            addCriterion("SEGMENT25_LOW between", value1, value2, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT25_LOW not between", value1, value2, "segment25Low");
            return (Criteria) this;
        }

        public Criteria andSegment25HighIsNull() {
            addCriterion("SEGMENT25_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment25HighIsNotNull() {
            addCriterion("SEGMENT25_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment25HighEqualTo(String value) {
            addCriterion("SEGMENT25_HIGH =", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighNotEqualTo(String value) {
            addCriterion("SEGMENT25_HIGH <>", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighGreaterThan(String value) {
            addCriterion("SEGMENT25_HIGH >", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT25_HIGH >=", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighLessThan(String value) {
            addCriterion("SEGMENT25_HIGH <", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT25_HIGH <=", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighLike(String value) {
            addCriterion("SEGMENT25_HIGH like", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighNotLike(String value) {
            addCriterion("SEGMENT25_HIGH not like", value, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighIn(List<String> values) {
            addCriterion("SEGMENT25_HIGH in", values, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighNotIn(List<String> values) {
            addCriterion("SEGMENT25_HIGH not in", values, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighBetween(String value1, String value2) {
            addCriterion("SEGMENT25_HIGH between", value1, value2, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment25HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT25_HIGH not between", value1, value2, "segment25High");
            return (Criteria) this;
        }

        public Criteria andSegment26LowIsNull() {
            addCriterion("SEGMENT26_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment26LowIsNotNull() {
            addCriterion("SEGMENT26_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment26LowEqualTo(String value) {
            addCriterion("SEGMENT26_LOW =", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowNotEqualTo(String value) {
            addCriterion("SEGMENT26_LOW <>", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowGreaterThan(String value) {
            addCriterion("SEGMENT26_LOW >", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT26_LOW >=", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowLessThan(String value) {
            addCriterion("SEGMENT26_LOW <", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT26_LOW <=", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowLike(String value) {
            addCriterion("SEGMENT26_LOW like", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowNotLike(String value) {
            addCriterion("SEGMENT26_LOW not like", value, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowIn(List<String> values) {
            addCriterion("SEGMENT26_LOW in", values, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowNotIn(List<String> values) {
            addCriterion("SEGMENT26_LOW not in", values, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowBetween(String value1, String value2) {
            addCriterion("SEGMENT26_LOW between", value1, value2, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT26_LOW not between", value1, value2, "segment26Low");
            return (Criteria) this;
        }

        public Criteria andSegment26HighIsNull() {
            addCriterion("SEGMENT26_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment26HighIsNotNull() {
            addCriterion("SEGMENT26_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment26HighEqualTo(String value) {
            addCriterion("SEGMENT26_HIGH =", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighNotEqualTo(String value) {
            addCriterion("SEGMENT26_HIGH <>", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighGreaterThan(String value) {
            addCriterion("SEGMENT26_HIGH >", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT26_HIGH >=", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighLessThan(String value) {
            addCriterion("SEGMENT26_HIGH <", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT26_HIGH <=", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighLike(String value) {
            addCriterion("SEGMENT26_HIGH like", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighNotLike(String value) {
            addCriterion("SEGMENT26_HIGH not like", value, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighIn(List<String> values) {
            addCriterion("SEGMENT26_HIGH in", values, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighNotIn(List<String> values) {
            addCriterion("SEGMENT26_HIGH not in", values, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighBetween(String value1, String value2) {
            addCriterion("SEGMENT26_HIGH between", value1, value2, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment26HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT26_HIGH not between", value1, value2, "segment26High");
            return (Criteria) this;
        }

        public Criteria andSegment27LowIsNull() {
            addCriterion("SEGMENT27_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment27LowIsNotNull() {
            addCriterion("SEGMENT27_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment27LowEqualTo(String value) {
            addCriterion("SEGMENT27_LOW =", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowNotEqualTo(String value) {
            addCriterion("SEGMENT27_LOW <>", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowGreaterThan(String value) {
            addCriterion("SEGMENT27_LOW >", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT27_LOW >=", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowLessThan(String value) {
            addCriterion("SEGMENT27_LOW <", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT27_LOW <=", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowLike(String value) {
            addCriterion("SEGMENT27_LOW like", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowNotLike(String value) {
            addCriterion("SEGMENT27_LOW not like", value, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowIn(List<String> values) {
            addCriterion("SEGMENT27_LOW in", values, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowNotIn(List<String> values) {
            addCriterion("SEGMENT27_LOW not in", values, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowBetween(String value1, String value2) {
            addCriterion("SEGMENT27_LOW between", value1, value2, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT27_LOW not between", value1, value2, "segment27Low");
            return (Criteria) this;
        }

        public Criteria andSegment27HighIsNull() {
            addCriterion("SEGMENT27_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment27HighIsNotNull() {
            addCriterion("SEGMENT27_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment27HighEqualTo(String value) {
            addCriterion("SEGMENT27_HIGH =", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighNotEqualTo(String value) {
            addCriterion("SEGMENT27_HIGH <>", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighGreaterThan(String value) {
            addCriterion("SEGMENT27_HIGH >", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT27_HIGH >=", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighLessThan(String value) {
            addCriterion("SEGMENT27_HIGH <", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT27_HIGH <=", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighLike(String value) {
            addCriterion("SEGMENT27_HIGH like", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighNotLike(String value) {
            addCriterion("SEGMENT27_HIGH not like", value, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighIn(List<String> values) {
            addCriterion("SEGMENT27_HIGH in", values, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighNotIn(List<String> values) {
            addCriterion("SEGMENT27_HIGH not in", values, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighBetween(String value1, String value2) {
            addCriterion("SEGMENT27_HIGH between", value1, value2, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment27HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT27_HIGH not between", value1, value2, "segment27High");
            return (Criteria) this;
        }

        public Criteria andSegment28LowIsNull() {
            addCriterion("SEGMENT28_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment28LowIsNotNull() {
            addCriterion("SEGMENT28_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment28LowEqualTo(String value) {
            addCriterion("SEGMENT28_LOW =", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowNotEqualTo(String value) {
            addCriterion("SEGMENT28_LOW <>", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowGreaterThan(String value) {
            addCriterion("SEGMENT28_LOW >", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT28_LOW >=", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowLessThan(String value) {
            addCriterion("SEGMENT28_LOW <", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT28_LOW <=", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowLike(String value) {
            addCriterion("SEGMENT28_LOW like", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowNotLike(String value) {
            addCriterion("SEGMENT28_LOW not like", value, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowIn(List<String> values) {
            addCriterion("SEGMENT28_LOW in", values, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowNotIn(List<String> values) {
            addCriterion("SEGMENT28_LOW not in", values, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowBetween(String value1, String value2) {
            addCriterion("SEGMENT28_LOW between", value1, value2, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT28_LOW not between", value1, value2, "segment28Low");
            return (Criteria) this;
        }

        public Criteria andSegment28HighIsNull() {
            addCriterion("SEGMENT28_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment28HighIsNotNull() {
            addCriterion("SEGMENT28_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment28HighEqualTo(String value) {
            addCriterion("SEGMENT28_HIGH =", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighNotEqualTo(String value) {
            addCriterion("SEGMENT28_HIGH <>", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighGreaterThan(String value) {
            addCriterion("SEGMENT28_HIGH >", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT28_HIGH >=", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighLessThan(String value) {
            addCriterion("SEGMENT28_HIGH <", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT28_HIGH <=", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighLike(String value) {
            addCriterion("SEGMENT28_HIGH like", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighNotLike(String value) {
            addCriterion("SEGMENT28_HIGH not like", value, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighIn(List<String> values) {
            addCriterion("SEGMENT28_HIGH in", values, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighNotIn(List<String> values) {
            addCriterion("SEGMENT28_HIGH not in", values, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighBetween(String value1, String value2) {
            addCriterion("SEGMENT28_HIGH between", value1, value2, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment28HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT28_HIGH not between", value1, value2, "segment28High");
            return (Criteria) this;
        }

        public Criteria andSegment29LowIsNull() {
            addCriterion("SEGMENT29_LOW is null");
            return (Criteria) this;
        }

        public Criteria andSegment29LowIsNotNull() {
            addCriterion("SEGMENT29_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andSegment29LowEqualTo(String value) {
            addCriterion("SEGMENT29_LOW =", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowNotEqualTo(String value) {
            addCriterion("SEGMENT29_LOW <>", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowGreaterThan(String value) {
            addCriterion("SEGMENT29_LOW >", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT29_LOW >=", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowLessThan(String value) {
            addCriterion("SEGMENT29_LOW <", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT29_LOW <=", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowLike(String value) {
            addCriterion("SEGMENT29_LOW like", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowNotLike(String value) {
            addCriterion("SEGMENT29_LOW not like", value, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowIn(List<String> values) {
            addCriterion("SEGMENT29_LOW in", values, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowNotIn(List<String> values) {
            addCriterion("SEGMENT29_LOW not in", values, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowBetween(String value1, String value2) {
            addCriterion("SEGMENT29_LOW between", value1, value2, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29LowNotBetween(String value1, String value2) {
            addCriterion("SEGMENT29_LOW not between", value1, value2, "segment29Low");
            return (Criteria) this;
        }

        public Criteria andSegment29HighIsNull() {
            addCriterion("SEGMENT29_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andSegment29HighIsNotNull() {
            addCriterion("SEGMENT29_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andSegment29HighEqualTo(String value) {
            addCriterion("SEGMENT29_HIGH =", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighNotEqualTo(String value) {
            addCriterion("SEGMENT29_HIGH <>", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighGreaterThan(String value) {
            addCriterion("SEGMENT29_HIGH >", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT29_HIGH >=", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighLessThan(String value) {
            addCriterion("SEGMENT29_HIGH <", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT29_HIGH <=", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighLike(String value) {
            addCriterion("SEGMENT29_HIGH like", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighNotLike(String value) {
            addCriterion("SEGMENT29_HIGH not like", value, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighIn(List<String> values) {
            addCriterion("SEGMENT29_HIGH in", values, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighNotIn(List<String> values) {
            addCriterion("SEGMENT29_HIGH not in", values, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighBetween(String value1, String value2) {
            addCriterion("SEGMENT29_HIGH between", value1, value2, "segment29High");
            return (Criteria) this;
        }

        public Criteria andSegment29HighNotBetween(String value1, String value2) {
            addCriterion("SEGMENT29_HIGH not between", value1, value2, "segment29High");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_rules_td
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
     * @Table : mm_rules_td
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