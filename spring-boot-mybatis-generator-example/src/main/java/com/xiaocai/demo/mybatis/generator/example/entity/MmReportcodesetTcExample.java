package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmReportcodesetTcExample {
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
    public MmReportcodesetTcExample() {
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
     * @Table : mm_reportcodeset_tc
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

        public Criteria andClasscodeIsNull() {
            addCriterion("CLASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andClasscodeIsNotNull() {
            addCriterion("CLASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClasscodeEqualTo(Long value) {
            addCriterion("CLASSCODE =", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotEqualTo(Long value) {
            addCriterion("CLASSCODE <>", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeGreaterThan(Long value) {
            addCriterion("CLASSCODE >", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("CLASSCODE >=", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeLessThan(Long value) {
            addCriterion("CLASSCODE <", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeLessThanOrEqualTo(Long value) {
            addCriterion("CLASSCODE <=", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeIn(List<Long> values) {
            addCriterion("CLASSCODE in", values, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotIn(List<Long> values) {
            addCriterion("CLASSCODE not in", values, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeBetween(Long value1, Long value2) {
            addCriterion("CLASSCODE between", value1, value2, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotBetween(Long value1, Long value2) {
            addCriterion("CLASSCODE not between", value1, value2, "classcode");
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

        public Criteria andLong1EqualTo(BigDecimal value) {
            addCriterion("LONG1 =", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotEqualTo(BigDecimal value) {
            addCriterion("LONG1 <>", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1GreaterThan(BigDecimal value) {
            addCriterion("LONG1 >", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONG1 >=", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1LessThan(BigDecimal value) {
            addCriterion("LONG1 <", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONG1 <=", value, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1In(List<BigDecimal> values) {
            addCriterion("LONG1 in", values, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotIn(List<BigDecimal> values) {
            addCriterion("LONG1 not in", values, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONG1 between", value1, value2, "long1");
            return (Criteria) this;
        }

        public Criteria andLong1NotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andLong2EqualTo(BigDecimal value) {
            addCriterion("LONG2 =", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotEqualTo(BigDecimal value) {
            addCriterion("LONG2 <>", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2GreaterThan(BigDecimal value) {
            addCriterion("LONG2 >", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONG2 >=", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2LessThan(BigDecimal value) {
            addCriterion("LONG2 <", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONG2 <=", value, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2In(List<BigDecimal> values) {
            addCriterion("LONG2 in", values, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotIn(List<BigDecimal> values) {
            addCriterion("LONG2 not in", values, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONG2 between", value1, value2, "long2");
            return (Criteria) this;
        }

        public Criteria andLong2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONG2 not between", value1, value2, "long2");
            return (Criteria) this;
        }

        public Criteria andBalanceflagIsNull() {
            addCriterion("BALANCEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andBalanceflagIsNotNull() {
            addCriterion("BALANCEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceflagEqualTo(String value) {
            addCriterion("BALANCEFLAG =", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagNotEqualTo(String value) {
            addCriterion("BALANCEFLAG <>", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagGreaterThan(String value) {
            addCriterion("BALANCEFLAG >", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCEFLAG >=", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagLessThan(String value) {
            addCriterion("BALANCEFLAG <", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagLessThanOrEqualTo(String value) {
            addCriterion("BALANCEFLAG <=", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagLike(String value) {
            addCriterion("BALANCEFLAG like", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagNotLike(String value) {
            addCriterion("BALANCEFLAG not like", value, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagIn(List<String> values) {
            addCriterion("BALANCEFLAG in", values, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagNotIn(List<String> values) {
            addCriterion("BALANCEFLAG not in", values, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagBetween(String value1, String value2) {
            addCriterion("BALANCEFLAG between", value1, value2, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andBalanceflagNotBetween(String value1, String value2) {
            addCriterion("BALANCEFLAG not between", value1, value2, "balanceflag");
            return (Criteria) this;
        }

        public Criteria andRecodeIsNull() {
            addCriterion("RECODE is null");
            return (Criteria) this;
        }

        public Criteria andRecodeIsNotNull() {
            addCriterion("RECODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecodeEqualTo(String value) {
            addCriterion("RECODE =", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotEqualTo(String value) {
            addCriterion("RECODE <>", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeGreaterThan(String value) {
            addCriterion("RECODE >", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECODE >=", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeLessThan(String value) {
            addCriterion("RECODE <", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeLessThanOrEqualTo(String value) {
            addCriterion("RECODE <=", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeLike(String value) {
            addCriterion("RECODE like", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotLike(String value) {
            addCriterion("RECODE not like", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeIn(List<String> values) {
            addCriterion("RECODE in", values, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotIn(List<String> values) {
            addCriterion("RECODE not in", values, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeBetween(String value1, String value2) {
            addCriterion("RECODE between", value1, value2, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotBetween(String value1, String value2) {
            addCriterion("RECODE not between", value1, value2, "recode");
            return (Criteria) this;
        }

        public Criteria andTinestampIsNull() {
            addCriterion("TINESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andTinestampIsNotNull() {
            addCriterion("TINESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTinestampEqualTo(Date value) {
            addCriterion("TINESTAMP =", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampNotEqualTo(Date value) {
            addCriterion("TINESTAMP <>", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampGreaterThan(Date value) {
            addCriterion("TINESTAMP >", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampGreaterThanOrEqualTo(Date value) {
            addCriterion("TINESTAMP >=", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampLessThan(Date value) {
            addCriterion("TINESTAMP <", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampLessThanOrEqualTo(Date value) {
            addCriterion("TINESTAMP <=", value, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampIn(List<Date> values) {
            addCriterion("TINESTAMP in", values, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampNotIn(List<Date> values) {
            addCriterion("TINESTAMP not in", values, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampBetween(Date value1, Date value2) {
            addCriterion("TINESTAMP between", value1, value2, "tinestamp");
            return (Criteria) this;
        }

        public Criteria andTinestampNotBetween(Date value1, Date value2) {
            addCriterion("TINESTAMP not between", value1, value2, "tinestamp");
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

        public Criteria andRecnameIsNull() {
            addCriterion("RECNAME is null");
            return (Criteria) this;
        }

        public Criteria andRecnameIsNotNull() {
            addCriterion("RECNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecnameEqualTo(String value) {
            addCriterion("RECNAME =", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameNotEqualTo(String value) {
            addCriterion("RECNAME <>", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameGreaterThan(String value) {
            addCriterion("RECNAME >", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameGreaterThanOrEqualTo(String value) {
            addCriterion("RECNAME >=", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameLessThan(String value) {
            addCriterion("RECNAME <", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameLessThanOrEqualTo(String value) {
            addCriterion("RECNAME <=", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameLike(String value) {
            addCriterion("RECNAME like", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameNotLike(String value) {
            addCriterion("RECNAME not like", value, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameIn(List<String> values) {
            addCriterion("RECNAME in", values, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameNotIn(List<String> values) {
            addCriterion("RECNAME not in", values, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameBetween(String value1, String value2) {
            addCriterion("RECNAME between", value1, value2, "recname");
            return (Criteria) this;
        }

        public Criteria andRecnameNotBetween(String value1, String value2) {
            addCriterion("RECNAME not between", value1, value2, "recname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reportcodeset_tc
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
     * @Table : mm_reportcodeset_tc
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