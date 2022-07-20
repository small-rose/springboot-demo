package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmReportorgcodeTcExample {
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
    public MmReportorgcodeTcExample() {
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
     * @Table : mm_reportorgcode_tc
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

        public Criteria andRepDptCdeIsNull() {
            addCriterion("REP_DPT_CDE is null");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeIsNotNull() {
            addCriterion("REP_DPT_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeEqualTo(String value) {
            addCriterion("REP_DPT_CDE =", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeNotEqualTo(String value) {
            addCriterion("REP_DPT_CDE <>", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeGreaterThan(String value) {
            addCriterion("REP_DPT_CDE >", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeGreaterThanOrEqualTo(String value) {
            addCriterion("REP_DPT_CDE >=", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeLessThan(String value) {
            addCriterion("REP_DPT_CDE <", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeLessThanOrEqualTo(String value) {
            addCriterion("REP_DPT_CDE <=", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeLike(String value) {
            addCriterion("REP_DPT_CDE like", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeNotLike(String value) {
            addCriterion("REP_DPT_CDE not like", value, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeIn(List<String> values) {
            addCriterion("REP_DPT_CDE in", values, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeNotIn(List<String> values) {
            addCriterion("REP_DPT_CDE not in", values, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeBetween(String value1, String value2) {
            addCriterion("REP_DPT_CDE between", value1, value2, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andRepDptCdeNotBetween(String value1, String value2) {
            addCriterion("REP_DPT_CDE not between", value1, value2, "repDptCde");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNull() {
            addCriterion("C_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNotNull() {
            addCriterion("C_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCLevelEqualTo(String value) {
            addCriterion("C_LEVEL =", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotEqualTo(String value) {
            addCriterion("C_LEVEL <>", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThan(String value) {
            addCriterion("C_LEVEL >", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThanOrEqualTo(String value) {
            addCriterion("C_LEVEL >=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThan(String value) {
            addCriterion("C_LEVEL <", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThanOrEqualTo(String value) {
            addCriterion("C_LEVEL <=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLike(String value) {
            addCriterion("C_LEVEL like", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotLike(String value) {
            addCriterion("C_LEVEL not like", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelIn(List<String> values) {
            addCriterion("C_LEVEL in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotIn(List<String> values) {
            addCriterion("C_LEVEL not in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelBetween(String value1, String value2) {
            addCriterion("C_LEVEL between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotBetween(String value1, String value2) {
            addCriterion("C_LEVEL not between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCIfvalidIsNull() {
            addCriterion("C_IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andCIfvalidIsNotNull() {
            addCriterion("C_IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andCIfvalidEqualTo(String value) {
            addCriterion("C_IFVALID =", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidNotEqualTo(String value) {
            addCriterion("C_IFVALID <>", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidGreaterThan(String value) {
            addCriterion("C_IFVALID >", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("C_IFVALID >=", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidLessThan(String value) {
            addCriterion("C_IFVALID <", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidLessThanOrEqualTo(String value) {
            addCriterion("C_IFVALID <=", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidLike(String value) {
            addCriterion("C_IFVALID like", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidNotLike(String value) {
            addCriterion("C_IFVALID not like", value, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidIn(List<String> values) {
            addCriterion("C_IFVALID in", values, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidNotIn(List<String> values) {
            addCriterion("C_IFVALID not in", values, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidBetween(String value1, String value2) {
            addCriterion("C_IFVALID between", value1, value2, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCIfvalidNotBetween(String value1, String value2) {
            addCriterion("C_IFVALID not between", value1, value2, "cIfvalid");
            return (Criteria) this;
        }

        public Criteria andCFree1IsNull() {
            addCriterion("C_FREE1 is null");
            return (Criteria) this;
        }

        public Criteria andCFree1IsNotNull() {
            addCriterion("C_FREE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCFree1EqualTo(String value) {
            addCriterion("C_FREE1 =", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1NotEqualTo(String value) {
            addCriterion("C_FREE1 <>", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1GreaterThan(String value) {
            addCriterion("C_FREE1 >", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1GreaterThanOrEqualTo(String value) {
            addCriterion("C_FREE1 >=", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1LessThan(String value) {
            addCriterion("C_FREE1 <", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1LessThanOrEqualTo(String value) {
            addCriterion("C_FREE1 <=", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1Like(String value) {
            addCriterion("C_FREE1 like", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1NotLike(String value) {
            addCriterion("C_FREE1 not like", value, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1In(List<String> values) {
            addCriterion("C_FREE1 in", values, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1NotIn(List<String> values) {
            addCriterion("C_FREE1 not in", values, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1Between(String value1, String value2) {
            addCriterion("C_FREE1 between", value1, value2, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree1NotBetween(String value1, String value2) {
            addCriterion("C_FREE1 not between", value1, value2, "cFree1");
            return (Criteria) this;
        }

        public Criteria andCFree2IsNull() {
            addCriterion("C_FREE2 is null");
            return (Criteria) this;
        }

        public Criteria andCFree2IsNotNull() {
            addCriterion("C_FREE2 is not null");
            return (Criteria) this;
        }

        public Criteria andCFree2EqualTo(String value) {
            addCriterion("C_FREE2 =", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2NotEqualTo(String value) {
            addCriterion("C_FREE2 <>", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2GreaterThan(String value) {
            addCriterion("C_FREE2 >", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2GreaterThanOrEqualTo(String value) {
            addCriterion("C_FREE2 >=", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2LessThan(String value) {
            addCriterion("C_FREE2 <", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2LessThanOrEqualTo(String value) {
            addCriterion("C_FREE2 <=", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2Like(String value) {
            addCriterion("C_FREE2 like", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2NotLike(String value) {
            addCriterion("C_FREE2 not like", value, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2In(List<String> values) {
            addCriterion("C_FREE2 in", values, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2NotIn(List<String> values) {
            addCriterion("C_FREE2 not in", values, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2Between(String value1, String value2) {
            addCriterion("C_FREE2 between", value1, value2, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree2NotBetween(String value1, String value2) {
            addCriterion("C_FREE2 not between", value1, value2, "cFree2");
            return (Criteria) this;
        }

        public Criteria andCFree3IsNull() {
            addCriterion("C_FREE3 is null");
            return (Criteria) this;
        }

        public Criteria andCFree3IsNotNull() {
            addCriterion("C_FREE3 is not null");
            return (Criteria) this;
        }

        public Criteria andCFree3EqualTo(String value) {
            addCriterion("C_FREE3 =", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3NotEqualTo(String value) {
            addCriterion("C_FREE3 <>", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3GreaterThan(String value) {
            addCriterion("C_FREE3 >", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3GreaterThanOrEqualTo(String value) {
            addCriterion("C_FREE3 >=", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3LessThan(String value) {
            addCriterion("C_FREE3 <", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3LessThanOrEqualTo(String value) {
            addCriterion("C_FREE3 <=", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3Like(String value) {
            addCriterion("C_FREE3 like", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3NotLike(String value) {
            addCriterion("C_FREE3 not like", value, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3In(List<String> values) {
            addCriterion("C_FREE3 in", values, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3NotIn(List<String> values) {
            addCriterion("C_FREE3 not in", values, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3Between(String value1, String value2) {
            addCriterion("C_FREE3 between", value1, value2, "cFree3");
            return (Criteria) this;
        }

        public Criteria andCFree3NotBetween(String value1, String value2) {
            addCriterion("C_FREE3 not between", value1, value2, "cFree3");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reportorgcode_tc
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
     * @Table : mm_reportorgcode_tc
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