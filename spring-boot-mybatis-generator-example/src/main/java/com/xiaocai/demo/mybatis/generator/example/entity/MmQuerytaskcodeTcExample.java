package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmQuerytaskcodeTcExample {
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
    public MmQuerytaskcodeTcExample() {
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
     * @Table : mm_querytaskcode_tc
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

        public Criteria andTaskcodeIsNull() {
            addCriterion("TASKCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIsNotNull() {
            addCriterion("TASKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeEqualTo(String value) {
            addCriterion("TASKCODE =", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotEqualTo(String value) {
            addCriterion("TASKCODE <>", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThan(String value) {
            addCriterion("TASKCODE >", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCODE >=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThan(String value) {
            addCriterion("TASKCODE <", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThanOrEqualTo(String value) {
            addCriterion("TASKCODE <=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLike(String value) {
            addCriterion("TASKCODE like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotLike(String value) {
            addCriterion("TASKCODE not like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIn(List<String> values) {
            addCriterion("TASKCODE in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotIn(List<String> values) {
            addCriterion("TASKCODE not in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeBetween(String value1, String value2) {
            addCriterion("TASKCODE between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotBetween(String value1, String value2) {
            addCriterion("TASKCODE not between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("TASKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("TASKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("TASKTYPE =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("TASKTYPE <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("TASKTYPE >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASKTYPE >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("TASKTYPE <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("TASKTYPE <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("TASKTYPE like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("TASKTYPE not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("TASKTYPE in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("TASKTYPE not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("TASKTYPE between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("TASKTYPE not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andModenameIsNull() {
            addCriterion("MODENAME is null");
            return (Criteria) this;
        }

        public Criteria andModenameIsNotNull() {
            addCriterion("MODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andModenameEqualTo(String value) {
            addCriterion("MODENAME =", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotEqualTo(String value) {
            addCriterion("MODENAME <>", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThan(String value) {
            addCriterion("MODENAME >", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThanOrEqualTo(String value) {
            addCriterion("MODENAME >=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThan(String value) {
            addCriterion("MODENAME <", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThanOrEqualTo(String value) {
            addCriterion("MODENAME <=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLike(String value) {
            addCriterion("MODENAME like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotLike(String value) {
            addCriterion("MODENAME not like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameIn(List<String> values) {
            addCriterion("MODENAME in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotIn(List<String> values) {
            addCriterion("MODENAME not in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameBetween(String value1, String value2) {
            addCriterion("MODENAME between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotBetween(String value1, String value2) {
            addCriterion("MODENAME not between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andIsdispatchIsNull() {
            addCriterion("ISDISPATCH is null");
            return (Criteria) this;
        }

        public Criteria andIsdispatchIsNotNull() {
            addCriterion("ISDISPATCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsdispatchEqualTo(String value) {
            addCriterion("ISDISPATCH =", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchNotEqualTo(String value) {
            addCriterion("ISDISPATCH <>", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchGreaterThan(String value) {
            addCriterion("ISDISPATCH >", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchGreaterThanOrEqualTo(String value) {
            addCriterion("ISDISPATCH >=", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchLessThan(String value) {
            addCriterion("ISDISPATCH <", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchLessThanOrEqualTo(String value) {
            addCriterion("ISDISPATCH <=", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchLike(String value) {
            addCriterion("ISDISPATCH like", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchNotLike(String value) {
            addCriterion("ISDISPATCH not like", value, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchIn(List<String> values) {
            addCriterion("ISDISPATCH in", values, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchNotIn(List<String> values) {
            addCriterion("ISDISPATCH not in", values, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchBetween(String value1, String value2) {
            addCriterion("ISDISPATCH between", value1, value2, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andIsdispatchNotBetween(String value1, String value2) {
            addCriterion("ISDISPATCH not between", value1, value2, "isdispatch");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(BigDecimal value) {
            addCriterion("POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(BigDecimal value) {
            addCriterion("POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(BigDecimal value) {
            addCriterion("POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(BigDecimal value) {
            addCriterion("POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<BigDecimal> values) {
            addCriterion("POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<BigDecimal> values) {
            addCriterion("POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltIsNull() {
            addCriterion("ISTASKFILT is null");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltIsNotNull() {
            addCriterion("ISTASKFILT is not null");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltEqualTo(String value) {
            addCriterion("ISTASKFILT =", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltNotEqualTo(String value) {
            addCriterion("ISTASKFILT <>", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltGreaterThan(String value) {
            addCriterion("ISTASKFILT >", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltGreaterThanOrEqualTo(String value) {
            addCriterion("ISTASKFILT >=", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltLessThan(String value) {
            addCriterion("ISTASKFILT <", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltLessThanOrEqualTo(String value) {
            addCriterion("ISTASKFILT <=", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltLike(String value) {
            addCriterion("ISTASKFILT like", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltNotLike(String value) {
            addCriterion("ISTASKFILT not like", value, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltIn(List<String> values) {
            addCriterion("ISTASKFILT in", values, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltNotIn(List<String> values) {
            addCriterion("ISTASKFILT not in", values, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltBetween(String value1, String value2) {
            addCriterion("ISTASKFILT between", value1, value2, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andIstaskfiltNotBetween(String value1, String value2) {
            addCriterion("ISTASKFILT not between", value1, value2, "istaskfilt");
            return (Criteria) this;
        }

        public Criteria andSqlstrIsNull() {
            addCriterion("SQLSTR is null");
            return (Criteria) this;
        }

        public Criteria andSqlstrIsNotNull() {
            addCriterion("SQLSTR is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstrEqualTo(String value) {
            addCriterion("SQLSTR =", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotEqualTo(String value) {
            addCriterion("SQLSTR <>", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrGreaterThan(String value) {
            addCriterion("SQLSTR >", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrGreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR >=", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLessThan(String value) {
            addCriterion("SQLSTR <", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLessThanOrEqualTo(String value) {
            addCriterion("SQLSTR <=", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLike(String value) {
            addCriterion("SQLSTR like", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotLike(String value) {
            addCriterion("SQLSTR not like", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrIn(List<String> values) {
            addCriterion("SQLSTR in", values, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotIn(List<String> values) {
            addCriterion("SQLSTR not in", values, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrBetween(String value1, String value2) {
            addCriterion("SQLSTR between", value1, value2, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotBetween(String value1, String value2) {
            addCriterion("SQLSTR not between", value1, value2, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNull() {
            addCriterion("FIELDNAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("FIELDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("FIELDNAME =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("FIELDNAME <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("FIELDNAME >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELDNAME >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("FIELDNAME <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("FIELDNAME <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("FIELDNAME like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("FIELDNAME not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("FIELDNAME in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("FIELDNAME not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("FIELDNAME between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("FIELDNAME not between", value1, value2, "fieldname");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_querytaskcode_tc
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
     * @Table : mm_querytaskcode_tc
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