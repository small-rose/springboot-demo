package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmTempRiinsurenceTdExample {
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
    public MmTempRiinsurenceTdExample() {
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
     * @Table : mm_temp_riinsurence_td
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

        public Criteria andReinsurercodeIsNull() {
            addCriterion("REINSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNotNull() {
            addCriterion("REINSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeEqualTo(Long value) {
            addCriterion("REINSURERCODE =", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotEqualTo(Long value) {
            addCriterion("REINSURERCODE <>", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThan(Long value) {
            addCriterion("REINSURERCODE >", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThanOrEqualTo(Long value) {
            addCriterion("REINSURERCODE >=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThan(Long value) {
            addCriterion("REINSURERCODE <", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThanOrEqualTo(Long value) {
            addCriterion("REINSURERCODE <=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIn(List<Long> values) {
            addCriterion("REINSURERCODE in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotIn(List<Long> values) {
            addCriterion("REINSURERCODE not in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeBetween(Long value1, Long value2) {
            addCriterion("REINSURERCODE between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotBetween(Long value1, Long value2) {
            addCriterion("REINSURERCODE not between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("SUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("SUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("SUBCOMPANY =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("SUBCOMPANY <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("SUBCOMPANY >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANY >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("SUBCOMPANY <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANY <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("SUBCOMPANY like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("SUBCOMPANY not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("SUBCOMPANY in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("SUBCOMPANY not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("SUBCOMPANY between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("SUBCOMPANY not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("CLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("CLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("CLASSESCODE like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("CLASSESCODE not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNull() {
            addCriterion("QSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNotNull() {
            addCriterion("QSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQstypeEqualTo(String value) {
            addCriterion("QSTYPE =", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotEqualTo(String value) {
            addCriterion("QSTYPE <>", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThan(String value) {
            addCriterion("QSTYPE >", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThanOrEqualTo(String value) {
            addCriterion("QSTYPE >=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThan(String value) {
            addCriterion("QSTYPE <", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThanOrEqualTo(String value) {
            addCriterion("QSTYPE <=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLike(String value) {
            addCriterion("QSTYPE like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotLike(String value) {
            addCriterion("QSTYPE not like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeIn(List<String> values) {
            addCriterion("QSTYPE in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotIn(List<String> values) {
            addCriterion("QSTYPE not in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeBetween(String value1, String value2) {
            addCriterion("QSTYPE between", value1, value2, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotBetween(String value1, String value2) {
            addCriterion("QSTYPE not between", value1, value2, "qstype");
            return (Criteria) this;
        }

        public Criteria andBusamountIsNull() {
            addCriterion("BUSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBusamountIsNotNull() {
            addCriterion("BUSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBusamountEqualTo(BigDecimal value) {
            addCriterion("BUSAMOUNT =", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountNotEqualTo(BigDecimal value) {
            addCriterion("BUSAMOUNT <>", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountGreaterThan(BigDecimal value) {
            addCriterion("BUSAMOUNT >", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSAMOUNT >=", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountLessThan(BigDecimal value) {
            addCriterion("BUSAMOUNT <", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSAMOUNT <=", value, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountIn(List<BigDecimal> values) {
            addCriterion("BUSAMOUNT in", values, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountNotIn(List<BigDecimal> values) {
            addCriterion("BUSAMOUNT not in", values, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSAMOUNT between", value1, value2, "busamount");
            return (Criteria) this;
        }

        public Criteria andBusamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSAMOUNT not between", value1, value2, "busamount");
            return (Criteria) this;
        }

        public Criteria andTabperiodIsNull() {
            addCriterion("TABPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTabperiodIsNotNull() {
            addCriterion("TABPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTabperiodEqualTo(String value) {
            addCriterion("TABPERIOD =", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotEqualTo(String value) {
            addCriterion("TABPERIOD <>", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThan(String value) {
            addCriterion("TABPERIOD >", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThanOrEqualTo(String value) {
            addCriterion("TABPERIOD >=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThan(String value) {
            addCriterion("TABPERIOD <", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThanOrEqualTo(String value) {
            addCriterion("TABPERIOD <=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLike(String value) {
            addCriterion("TABPERIOD like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotLike(String value) {
            addCriterion("TABPERIOD not like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodIn(List<String> values) {
            addCriterion("TABPERIOD in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotIn(List<String> values) {
            addCriterion("TABPERIOD not in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodBetween(String value1, String value2) {
            addCriterion("TABPERIOD between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotBetween(String value1, String value2) {
            addCriterion("TABPERIOD not between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("CURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("CURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("CURRENCYCODE =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("CURRENCYCODE <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("CURRENCYCODE >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("CURRENCYCODE <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("CURRENCYCODE like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("CURRENCYCODE not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("CURRENCYCODE in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("CURRENCYCODE not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE not between", value1, value2, "currencycode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_riinsurence_td
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
     * @Table : mm_temp_riinsurence_td
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