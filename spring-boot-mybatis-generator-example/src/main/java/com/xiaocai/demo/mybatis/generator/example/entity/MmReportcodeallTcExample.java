package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmReportcodeallTcExample {
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
    public MmReportcodeallTcExample() {
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
     * @Table : mm_reportcodeall_tc
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

        public Criteria andRecodeIsNull() {
            addCriterion("RECODE is null");
            return (Criteria) this;
        }

        public Criteria andRecodeIsNotNull() {
            addCriterion("RECODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecodeEqualTo(Long value) {
            addCriterion("RECODE =", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotEqualTo(Long value) {
            addCriterion("RECODE <>", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeGreaterThan(Long value) {
            addCriterion("RECODE >", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeGreaterThanOrEqualTo(Long value) {
            addCriterion("RECODE >=", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeLessThan(Long value) {
            addCriterion("RECODE <", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeLessThanOrEqualTo(Long value) {
            addCriterion("RECODE <=", value, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeIn(List<Long> values) {
            addCriterion("RECODE in", values, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotIn(List<Long> values) {
            addCriterion("RECODE not in", values, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeBetween(Long value1, Long value2) {
            addCriterion("RECODE between", value1, value2, "recode");
            return (Criteria) this;
        }

        public Criteria andRecodeNotBetween(Long value1, Long value2) {
            addCriterion("RECODE not between", value1, value2, "recode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("UNITCODE like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("UNITCODE not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
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
     * @Table : mm_reportcodeall_tc
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
     * @Table : mm_reportcodeall_tc
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