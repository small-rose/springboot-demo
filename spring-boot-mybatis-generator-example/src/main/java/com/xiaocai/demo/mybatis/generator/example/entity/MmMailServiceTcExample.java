package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmMailServiceTcExample {
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
    public MmMailServiceTcExample() {
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
     * @Table : mm_mail_service_tc
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

        public Criteria andMailcodeIsNull() {
            addCriterion("MAILCODE is null");
            return (Criteria) this;
        }

        public Criteria andMailcodeIsNotNull() {
            addCriterion("MAILCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMailcodeEqualTo(String value) {
            addCriterion("MAILCODE =", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeNotEqualTo(String value) {
            addCriterion("MAILCODE <>", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeGreaterThan(String value) {
            addCriterion("MAILCODE >", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MAILCODE >=", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeLessThan(String value) {
            addCriterion("MAILCODE <", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeLessThanOrEqualTo(String value) {
            addCriterion("MAILCODE <=", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeLike(String value) {
            addCriterion("MAILCODE like", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeNotLike(String value) {
            addCriterion("MAILCODE not like", value, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeIn(List<String> values) {
            addCriterion("MAILCODE in", values, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeNotIn(List<String> values) {
            addCriterion("MAILCODE not in", values, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeBetween(String value1, String value2) {
            addCriterion("MAILCODE between", value1, value2, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailcodeNotBetween(String value1, String value2) {
            addCriterion("MAILCODE not between", value1, value2, "mailcode");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNull() {
            addCriterion("MAILADDR is null");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNotNull() {
            addCriterion("MAILADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMailaddrEqualTo(String value) {
            addCriterion("MAILADDR =", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotEqualTo(String value) {
            addCriterion("MAILADDR <>", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThan(String value) {
            addCriterion("MAILADDR >", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThanOrEqualTo(String value) {
            addCriterion("MAILADDR >=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThan(String value) {
            addCriterion("MAILADDR <", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThanOrEqualTo(String value) {
            addCriterion("MAILADDR <=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLike(String value) {
            addCriterion("MAILADDR like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotLike(String value) {
            addCriterion("MAILADDR not like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrIn(List<String> values) {
            addCriterion("MAILADDR in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotIn(List<String> values) {
            addCriterion("MAILADDR not in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrBetween(String value1, String value2) {
            addCriterion("MAILADDR between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotBetween(String value1, String value2) {
            addCriterion("MAILADDR not between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andPasscodeIsNull() {
            addCriterion("PASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andPasscodeIsNotNull() {
            addCriterion("PASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPasscodeEqualTo(String value) {
            addCriterion("PASSCODE =", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeNotEqualTo(String value) {
            addCriterion("PASSCODE <>", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeGreaterThan(String value) {
            addCriterion("PASSCODE >", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeGreaterThanOrEqualTo(String value) {
            addCriterion("PASSCODE >=", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeLessThan(String value) {
            addCriterion("PASSCODE <", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeLessThanOrEqualTo(String value) {
            addCriterion("PASSCODE <=", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeLike(String value) {
            addCriterion("PASSCODE like", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeNotLike(String value) {
            addCriterion("PASSCODE not like", value, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeIn(List<String> values) {
            addCriterion("PASSCODE in", values, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeNotIn(List<String> values) {
            addCriterion("PASSCODE not in", values, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeBetween(String value1, String value2) {
            addCriterion("PASSCODE between", value1, value2, "passcode");
            return (Criteria) this;
        }

        public Criteria andPasscodeNotBetween(String value1, String value2) {
            addCriterion("PASSCODE not between", value1, value2, "passcode");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNull() {
            addCriterion("HOSTADDR is null");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNotNull() {
            addCriterion("HOSTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHostaddrEqualTo(String value) {
            addCriterion("HOSTADDR =", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotEqualTo(String value) {
            addCriterion("HOSTADDR <>", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThan(String value) {
            addCriterion("HOSTADDR >", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThanOrEqualTo(String value) {
            addCriterion("HOSTADDR >=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThan(String value) {
            addCriterion("HOSTADDR <", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThanOrEqualTo(String value) {
            addCriterion("HOSTADDR <=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLike(String value) {
            addCriterion("HOSTADDR like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotLike(String value) {
            addCriterion("HOSTADDR not like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrIn(List<String> values) {
            addCriterion("HOSTADDR in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotIn(List<String> values) {
            addCriterion("HOSTADDR not in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrBetween(String value1, String value2) {
            addCriterion("HOSTADDR between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotBetween(String value1, String value2) {
            addCriterion("HOSTADDR not between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNull() {
            addCriterion("IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("IFVALID =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("IFVALID <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("IFVALID >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IFVALID >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("IFVALID <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("IFVALID <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("IFVALID like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("IFVALID not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("IFVALID in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("IFVALID not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("IFVALID between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("IFVALID not between", value1, value2, "ifvalid");
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

        public Criteria andHibernateversionIsNull() {
            addCriterion("hibernateversion is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("hibernateversion is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("hibernateversion =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("hibernateversion <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("hibernateversion >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("hibernateversion >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("hibernateversion <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("hibernateversion <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("hibernateversion in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("hibernateversion not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("hibernateversion between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("hibernateversion not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_mail_service_tc
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
     * @Table : mm_mail_service_tc
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