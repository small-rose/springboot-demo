package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPermissionsTdExample {
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
    public MmPermissionsTdExample() {
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
     * @Table : mm_permissions_td
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

        public Criteria andPermissionsidIsNull() {
            addCriterion("PERMISSIONSID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsidIsNotNull() {
            addCriterion("PERMISSIONSID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsidEqualTo(Long value) {
            addCriterion("PERMISSIONSID =", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotEqualTo(Long value) {
            addCriterion("PERMISSIONSID <>", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidGreaterThan(Long value) {
            addCriterion("PERMISSIONSID >", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidGreaterThanOrEqualTo(Long value) {
            addCriterion("PERMISSIONSID >=", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidLessThan(Long value) {
            addCriterion("PERMISSIONSID <", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidLessThanOrEqualTo(Long value) {
            addCriterion("PERMISSIONSID <=", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidIn(List<Long> values) {
            addCriterion("PERMISSIONSID in", values, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotIn(List<Long> values) {
            addCriterion("PERMISSIONSID not in", values, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidBetween(Long value1, Long value2) {
            addCriterion("PERMISSIONSID between", value1, value2, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotBetween(Long value1, Long value2) {
            addCriterion("PERMISSIONSID not between", value1, value2, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("BUSINESSCODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("BUSINESSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(Long value) {
            addCriterion("BUSINESSCODE =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(Long value) {
            addCriterion("BUSINESSCODE <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(Long value) {
            addCriterion("BUSINESSCODE >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESSCODE >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(Long value) {
            addCriterion("BUSINESSCODE <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESSCODE <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<Long> values) {
            addCriterion("BUSINESSCODE in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<Long> values) {
            addCriterion("BUSINESSCODE not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(Long value1, Long value2) {
            addCriterion("BUSINESSCODE between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESSCODE not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("OPCODE =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("OPCODE <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("OPCODE >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("OPCODE <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("OPCODE <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("OPCODE like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("OPCODE not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("OPCODE in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("OPCODE not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("OPCODE between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("OPCODE not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonIsNull() {
            addCriterion("AUTHORIZEDPERSON is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonIsNotNull() {
            addCriterion("AUTHORIZEDPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonEqualTo(String value) {
            addCriterion("AUTHORIZEDPERSON =", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonNotEqualTo(String value) {
            addCriterion("AUTHORIZEDPERSON <>", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonGreaterThan(String value) {
            addCriterion("AUTHORIZEDPERSON >", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDPERSON >=", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonLessThan(String value) {
            addCriterion("AUTHORIZEDPERSON <", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDPERSON <=", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonLike(String value) {
            addCriterion("AUTHORIZEDPERSON like", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonNotLike(String value) {
            addCriterion("AUTHORIZEDPERSON not like", value, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonIn(List<String> values) {
            addCriterion("AUTHORIZEDPERSON in", values, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonNotIn(List<String> values) {
            addCriterion("AUTHORIZEDPERSON not in", values, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDPERSON between", value1, value2, "authorizedperson");
            return (Criteria) this;
        }

        public Criteria andAuthorizedpersonNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDPERSON not between", value1, value2, "authorizedperson");
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

        public Criteria andAuthorizedtypeIsNull() {
            addCriterion("AUTHORIZEDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeIsNotNull() {
            addCriterion("AUTHORIZEDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeEqualTo(String value) {
            addCriterion("AUTHORIZEDTYPE =", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeNotEqualTo(String value) {
            addCriterion("AUTHORIZEDTYPE <>", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeGreaterThan(String value) {
            addCriterion("AUTHORIZEDTYPE >", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDTYPE >=", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeLessThan(String value) {
            addCriterion("AUTHORIZEDTYPE <", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDTYPE <=", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeLike(String value) {
            addCriterion("AUTHORIZEDTYPE like", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeNotLike(String value) {
            addCriterion("AUTHORIZEDTYPE not like", value, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeIn(List<String> values) {
            addCriterion("AUTHORIZEDTYPE in", values, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeNotIn(List<String> values) {
            addCriterion("AUTHORIZEDTYPE not in", values, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDTYPE between", value1, value2, "authorizedtype");
            return (Criteria) this;
        }

        public Criteria andAuthorizedtypeNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDTYPE not between", value1, value2, "authorizedtype");
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

        public Criteria andPowertypeIsNull() {
            addCriterion("POWERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPowertypeIsNotNull() {
            addCriterion("POWERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPowertypeEqualTo(String value) {
            addCriterion("POWERTYPE =", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotEqualTo(String value) {
            addCriterion("POWERTYPE <>", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeGreaterThan(String value) {
            addCriterion("POWERTYPE >", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeGreaterThanOrEqualTo(String value) {
            addCriterion("POWERTYPE >=", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLessThan(String value) {
            addCriterion("POWERTYPE <", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLessThanOrEqualTo(String value) {
            addCriterion("POWERTYPE <=", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLike(String value) {
            addCriterion("POWERTYPE like", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotLike(String value) {
            addCriterion("POWERTYPE not like", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeIn(List<String> values) {
            addCriterion("POWERTYPE in", values, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotIn(List<String> values) {
            addCriterion("POWERTYPE not in", values, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeBetween(String value1, String value2) {
            addCriterion("POWERTYPE between", value1, value2, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotBetween(String value1, String value2) {
            addCriterion("POWERTYPE not between", value1, value2, "powertype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_permissions_td
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
     * @Table : mm_permissions_td
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