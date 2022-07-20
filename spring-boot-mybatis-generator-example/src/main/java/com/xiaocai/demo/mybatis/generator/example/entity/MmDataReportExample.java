package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmDataReportExample {
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
    public MmDataReportExample() {
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
     * @Table : mm_data_report
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

        public Criteria andSubDeptCdeIsNull() {
            addCriterion("SUB_DEPT_CDE is null");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeIsNotNull() {
            addCriterion("SUB_DEPT_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeEqualTo(Long value) {
            addCriterion("SUB_DEPT_CDE =", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeNotEqualTo(Long value) {
            addCriterion("SUB_DEPT_CDE <>", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeGreaterThan(Long value) {
            addCriterion("SUB_DEPT_CDE >", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUB_DEPT_CDE >=", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeLessThan(Long value) {
            addCriterion("SUB_DEPT_CDE <", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeLessThanOrEqualTo(Long value) {
            addCriterion("SUB_DEPT_CDE <=", value, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeIn(List<Long> values) {
            addCriterion("SUB_DEPT_CDE in", values, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeNotIn(List<Long> values) {
            addCriterion("SUB_DEPT_CDE not in", values, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeBetween(Long value1, Long value2) {
            addCriterion("SUB_DEPT_CDE between", value1, value2, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andSubDeptCdeNotBetween(Long value1, Long value2) {
            addCriterion("SUB_DEPT_CDE not between", value1, value2, "subDeptCde");
            return (Criteria) this;
        }

        public Criteria andCItemNoIsNull() {
            addCriterion("C_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andCItemNoIsNotNull() {
            addCriterion("C_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCItemNoEqualTo(Long value) {
            addCriterion("C_ITEM_NO =", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoNotEqualTo(Long value) {
            addCriterion("C_ITEM_NO <>", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoGreaterThan(Long value) {
            addCriterion("C_ITEM_NO >", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoGreaterThanOrEqualTo(Long value) {
            addCriterion("C_ITEM_NO >=", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoLessThan(Long value) {
            addCriterion("C_ITEM_NO <", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoLessThanOrEqualTo(Long value) {
            addCriterion("C_ITEM_NO <=", value, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoIn(List<Long> values) {
            addCriterion("C_ITEM_NO in", values, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoNotIn(List<Long> values) {
            addCriterion("C_ITEM_NO not in", values, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoBetween(Long value1, Long value2) {
            addCriterion("C_ITEM_NO between", value1, value2, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCItemNoNotBetween(Long value1, Long value2) {
            addCriterion("C_ITEM_NO not between", value1, value2, "cItemNo");
            return (Criteria) this;
        }

        public Criteria andCValueIsNull() {
            addCriterion("C_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCValueIsNotNull() {
            addCriterion("C_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCValueEqualTo(BigDecimal value) {
            addCriterion("C_VALUE =", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotEqualTo(BigDecimal value) {
            addCriterion("C_VALUE <>", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThan(BigDecimal value) {
            addCriterion("C_VALUE >", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_VALUE >=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThan(BigDecimal value) {
            addCriterion("C_VALUE <", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_VALUE <=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueIn(List<BigDecimal> values) {
            addCriterion("C_VALUE in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotIn(List<BigDecimal> values) {
            addCriterion("C_VALUE not in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_VALUE between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_VALUE not between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCItemNmeIsNull() {
            addCriterion("C_ITEM_NME is null");
            return (Criteria) this;
        }

        public Criteria andCItemNmeIsNotNull() {
            addCriterion("C_ITEM_NME is not null");
            return (Criteria) this;
        }

        public Criteria andCItemNmeEqualTo(String value) {
            addCriterion("C_ITEM_NME =", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeNotEqualTo(String value) {
            addCriterion("C_ITEM_NME <>", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeGreaterThan(String value) {
            addCriterion("C_ITEM_NME >", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ITEM_NME >=", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeLessThan(String value) {
            addCriterion("C_ITEM_NME <", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeLessThanOrEqualTo(String value) {
            addCriterion("C_ITEM_NME <=", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeLike(String value) {
            addCriterion("C_ITEM_NME like", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeNotLike(String value) {
            addCriterion("C_ITEM_NME not like", value, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeIn(List<String> values) {
            addCriterion("C_ITEM_NME in", values, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeNotIn(List<String> values) {
            addCriterion("C_ITEM_NME not in", values, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeBetween(String value1, String value2) {
            addCriterion("C_ITEM_NME between", value1, value2, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCItemNmeNotBetween(String value1, String value2) {
            addCriterion("C_ITEM_NME not between", value1, value2, "cItemNme");
            return (Criteria) this;
        }

        public Criteria andCTmIsNull() {
            addCriterion("C_TM is null");
            return (Criteria) this;
        }

        public Criteria andCTmIsNotNull() {
            addCriterion("C_TM is not null");
            return (Criteria) this;
        }

        public Criteria andCTmEqualTo(String value) {
            addCriterion("C_TM =", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotEqualTo(String value) {
            addCriterion("C_TM <>", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmGreaterThan(String value) {
            addCriterion("C_TM >", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmGreaterThanOrEqualTo(String value) {
            addCriterion("C_TM >=", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLessThan(String value) {
            addCriterion("C_TM <", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLessThanOrEqualTo(String value) {
            addCriterion("C_TM <=", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLike(String value) {
            addCriterion("C_TM like", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotLike(String value) {
            addCriterion("C_TM not like", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmIn(List<String> values) {
            addCriterion("C_TM in", values, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotIn(List<String> values) {
            addCriterion("C_TM not in", values, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmBetween(String value1, String value2) {
            addCriterion("C_TM between", value1, value2, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotBetween(String value1, String value2) {
            addCriterion("C_TM not between", value1, value2, "cTm");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIsNull() {
            addCriterion("C_FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIsNotNull() {
            addCriterion("C_FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCFrequencyEqualTo(String value) {
            addCriterion("C_FREQUENCY =", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotEqualTo(String value) {
            addCriterion("C_FREQUENCY <>", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyGreaterThan(String value) {
            addCriterion("C_FREQUENCY >", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("C_FREQUENCY >=", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyLessThan(String value) {
            addCriterion("C_FREQUENCY <", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyLessThanOrEqualTo(String value) {
            addCriterion("C_FREQUENCY <=", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyLike(String value) {
            addCriterion("C_FREQUENCY like", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotLike(String value) {
            addCriterion("C_FREQUENCY not like", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIn(List<String> values) {
            addCriterion("C_FREQUENCY in", values, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotIn(List<String> values) {
            addCriterion("C_FREQUENCY not in", values, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyBetween(String value1, String value2) {
            addCriterion("C_FREQUENCY between", value1, value2, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotBetween(String value1, String value2) {
            addCriterion("C_FREQUENCY not between", value1, value2, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNull() {
            addCriterion("C_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNotNull() {
            addCriterion("C_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andCChannelEqualTo(String value) {
            addCriterion("C_CHANNEL =", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotEqualTo(String value) {
            addCriterion("C_CHANNEL <>", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThan(String value) {
            addCriterion("C_CHANNEL >", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHANNEL >=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThan(String value) {
            addCriterion("C_CHANNEL <", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThanOrEqualTo(String value) {
            addCriterion("C_CHANNEL <=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLike(String value) {
            addCriterion("C_CHANNEL like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotLike(String value) {
            addCriterion("C_CHANNEL not like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelIn(List<String> values) {
            addCriterion("C_CHANNEL in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotIn(List<String> values) {
            addCriterion("C_CHANNEL not in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelBetween(String value1, String value2) {
            addCriterion("C_CHANNEL between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotBetween(String value1, String value2) {
            addCriterion("C_CHANNEL not between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("ERRORMSG =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("ERRORMSG <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("ERRORMSG >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMSG >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("ERRORMSG <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("ERRORMSG <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("ERRORMSG like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("ERRORMSG not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("ERRORMSG in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("ERRORMSG not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("ERRORMSG between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("ERRORMSG not between", value1, value2, "errormsg");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_data_report
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
     * @Table : mm_data_report
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