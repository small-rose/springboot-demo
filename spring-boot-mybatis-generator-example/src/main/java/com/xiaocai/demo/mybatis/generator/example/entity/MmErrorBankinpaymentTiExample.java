package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmErrorBankinpaymentTiExample {
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
    public MmErrorBankinpaymentTiExample() {
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
     * @Table : mm_error_bankinpayment_ti
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

        public Criteria andErroridIsNull() {
            addCriterion("ERRORID is null");
            return (Criteria) this;
        }

        public Criteria andErroridIsNotNull() {
            addCriterion("ERRORID is not null");
            return (Criteria) this;
        }

        public Criteria andErroridEqualTo(String value) {
            addCriterion("ERRORID =", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotEqualTo(String value) {
            addCriterion("ERRORID <>", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThan(String value) {
            addCriterion("ERRORID >", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORID >=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThan(String value) {
            addCriterion("ERRORID <", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThanOrEqualTo(String value) {
            addCriterion("ERRORID <=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLike(String value) {
            addCriterion("ERRORID like", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotLike(String value) {
            addCriterion("ERRORID not like", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridIn(List<String> values) {
            addCriterion("ERRORID in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotIn(List<String> values) {
            addCriterion("ERRORID not in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridBetween(String value1, String value2) {
            addCriterion("ERRORID between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotBetween(String value1, String value2) {
            addCriterion("ERRORID not between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIsNull() {
            addCriterion("ERRORSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIsNotNull() {
            addCriterion("ERRORSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andErrorstatusEqualTo(String value) {
            addCriterion("ERRORSTATUS =", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotEqualTo(String value) {
            addCriterion("ERRORSTATUS <>", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusGreaterThan(String value) {
            addCriterion("ERRORSTATUS >", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORSTATUS >=", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLessThan(String value) {
            addCriterion("ERRORSTATUS <", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLessThanOrEqualTo(String value) {
            addCriterion("ERRORSTATUS <=", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLike(String value) {
            addCriterion("ERRORSTATUS like", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotLike(String value) {
            addCriterion("ERRORSTATUS not like", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIn(List<String> values) {
            addCriterion("ERRORSTATUS in", values, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotIn(List<String> values) {
            addCriterion("ERRORSTATUS not in", values, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusBetween(String value1, String value2) {
            addCriterion("ERRORSTATUS between", value1, value2, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotBetween(String value1, String value2) {
            addCriterion("ERRORSTATUS not between", value1, value2, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameIsNull() {
            addCriterion("ERRORFILEDNAME is null");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameIsNotNull() {
            addCriterion("ERRORFILEDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameEqualTo(String value) {
            addCriterion("ERRORFILEDNAME =", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameNotEqualTo(String value) {
            addCriterion("ERRORFILEDNAME <>", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameGreaterThan(String value) {
            addCriterion("ERRORFILEDNAME >", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORFILEDNAME >=", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameLessThan(String value) {
            addCriterion("ERRORFILEDNAME <", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameLessThanOrEqualTo(String value) {
            addCriterion("ERRORFILEDNAME <=", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameLike(String value) {
            addCriterion("ERRORFILEDNAME like", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameNotLike(String value) {
            addCriterion("ERRORFILEDNAME not like", value, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameIn(List<String> values) {
            addCriterion("ERRORFILEDNAME in", values, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameNotIn(List<String> values) {
            addCriterion("ERRORFILEDNAME not in", values, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameBetween(String value1, String value2) {
            addCriterion("ERRORFILEDNAME between", value1, value2, "errorfiledname");
            return (Criteria) this;
        }

        public Criteria andErrorfilednameNotBetween(String value1, String value2) {
            addCriterion("ERRORFILEDNAME not between", value1, value2, "errorfiledname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_error_bankinpayment_ti
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
     * @Table : mm_error_bankinpayment_ti
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