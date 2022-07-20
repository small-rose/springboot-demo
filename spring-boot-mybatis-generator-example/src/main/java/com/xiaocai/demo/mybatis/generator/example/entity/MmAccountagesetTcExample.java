package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAccountagesetTcExample {
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
    public MmAccountagesetTcExample() {
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
     * @Table : mm_accountageset_tc
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

        public Criteria andAgekindIsNull() {
            addCriterion("AGEKIND is null");
            return (Criteria) this;
        }

        public Criteria andAgekindIsNotNull() {
            addCriterion("AGEKIND is not null");
            return (Criteria) this;
        }

        public Criteria andAgekindEqualTo(Long value) {
            addCriterion("AGEKIND =", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindNotEqualTo(Long value) {
            addCriterion("AGEKIND <>", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindGreaterThan(Long value) {
            addCriterion("AGEKIND >", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindGreaterThanOrEqualTo(Long value) {
            addCriterion("AGEKIND >=", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindLessThan(Long value) {
            addCriterion("AGEKIND <", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindLessThanOrEqualTo(Long value) {
            addCriterion("AGEKIND <=", value, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindIn(List<Long> values) {
            addCriterion("AGEKIND in", values, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindNotIn(List<Long> values) {
            addCriterion("AGEKIND not in", values, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindBetween(Long value1, Long value2) {
            addCriterion("AGEKIND between", value1, value2, "agekind");
            return (Criteria) this;
        }

        public Criteria andAgekindNotBetween(Long value1, Long value2) {
            addCriterion("AGEKIND not between", value1, value2, "agekind");
            return (Criteria) this;
        }

        public Criteria andAccountageIsNull() {
            addCriterion("ACCOUNTAGE is null");
            return (Criteria) this;
        }

        public Criteria andAccountageIsNotNull() {
            addCriterion("ACCOUNTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountageEqualTo(Long value) {
            addCriterion("ACCOUNTAGE =", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotEqualTo(Long value) {
            addCriterion("ACCOUNTAGE <>", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThan(Long value) {
            addCriterion("ACCOUNTAGE >", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTAGE >=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThan(Long value) {
            addCriterion("ACCOUNTAGE <", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTAGE <=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageIn(List<Long> values) {
            addCriterion("ACCOUNTAGE in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotIn(List<Long> values) {
            addCriterion("ACCOUNTAGE not in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTAGE between", value1, value2, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTAGE not between", value1, value2, "accountage");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLong1IsNull() {
            addCriterion("LONG1 is null");
            return (Criteria) this;
        }

        public Criteria andLong1IsNotNull() {
            addCriterion("LONG1 is not null");
            return (Criteria) this;
        }

        public Criteria andLong1EqualTo(Integer value) {
            addCriterion("LONG1 =", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotEqualTo(Integer value) {
            addCriterion("LONG1 <>", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1GreaterThan(Integer value) {
            addCriterion("LONG1 >", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1GreaterThanOrEqualTo(Integer value) {
            addCriterion("LONG1 >=", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1LessThan(Integer value) {
            addCriterion("LONG1 <", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1LessThanOrEqualTo(Integer value) {
            addCriterion("LONG1 <=", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1In(List<Integer> values) {
            addCriterion("LONG1 in", values, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotIn(List<Integer> values) {
            addCriterion("LONG1 not in", values, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1Between(Integer value1, Integer value2) {
            addCriterion("LONG1 between", value1, value2, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotBetween(Integer value1, Integer value2) {
            addCriterion("LONG1 not between", value1, value2, "long1");
            return (Criteria) this;
        }

        public Criteria andLong2IsNull() {
            addCriterion("LONG2 is null");
            return (Criteria) this;
        }

        public Criteria andLong2IsNotNull() {
            addCriterion("LONG2 is not null");
            return (Criteria) this;
        }

        public Criteria andLong2EqualTo(Integer value) {
            addCriterion("LONG2 =", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotEqualTo(Integer value) {
            addCriterion("LONG2 <>", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2GreaterThan(Integer value) {
            addCriterion("LONG2 >", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2GreaterThanOrEqualTo(Integer value) {
            addCriterion("LONG2 >=", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2LessThan(Integer value) {
            addCriterion("LONG2 <", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2LessThanOrEqualTo(Integer value) {
            addCriterion("LONG2 <=", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2In(List<Integer> values) {
            addCriterion("LONG2 in", values, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotIn(List<Integer> values) {
            addCriterion("LONG2 not in", values, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2Between(Integer value1, Integer value2) {
            addCriterion("LONG2 between", value1, value2, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotBetween(Integer value1, Integer value2) {
            addCriterion("LONG2 not between", value1, value2, "long2");
            return (Criteria) this;
        }

        public Criteria andExtractPercentIsNull() {
            addCriterion("EXTRACT_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andExtractPercentIsNotNull() {
            addCriterion("EXTRACT_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andExtractPercentEqualTo(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT =", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentNotEqualTo(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT <>", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentGreaterThan(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT >", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT >=", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentLessThan(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT <", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACT_PERCENT <=", value, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentIn(List<BigDecimal> values) {
            addCriterion("EXTRACT_PERCENT in", values, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentNotIn(List<BigDecimal> values) {
            addCriterion("EXTRACT_PERCENT not in", values, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACT_PERCENT between", value1, value2, "extractPercent");
            return (Criteria) this;
        }

        public Criteria andExtractPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACT_PERCENT not between", value1, value2, "extractPercent");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_accountageset_tc
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
     * @Table : mm_accountageset_tc
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