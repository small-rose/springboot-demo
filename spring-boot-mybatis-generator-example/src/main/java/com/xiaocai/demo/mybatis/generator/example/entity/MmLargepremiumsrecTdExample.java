package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmLargepremiumsrecTdExample {
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
    public MmLargepremiumsrecTdExample() {
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
     * @Table : mm_largepremiumsrec_td
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

        public Criteria andSubcompanyIsNull() {
            addCriterion("SUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("SUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(Long value) {
            addCriterion("SUBCOMPANY =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(Long value) {
            addCriterion("SUBCOMPANY <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(Long value) {
            addCriterion("SUBCOMPANY >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBCOMPANY >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(Long value) {
            addCriterion("SUBCOMPANY <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(Long value) {
            addCriterion("SUBCOMPANY <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<Long> values) {
            addCriterion("SUBCOMPANY in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<Long> values) {
            addCriterion("SUBCOMPANY not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(Long value1, Long value2) {
            addCriterion("SUBCOMPANY between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(Long value1, Long value2) {
            addCriterion("SUBCOMPANY not between", value1, value2, "subcompany");
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

        public Criteria andUnitcodeEqualTo(Long value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(Long value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(Long value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(Long value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(Long value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<Long> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<Long> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(Long value1, Long value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(Long value1, Long value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
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

        public Criteria andMirrordateIsNull() {
            addCriterion("MIRRORDATE is null");
            return (Criteria) this;
        }

        public Criteria andMirrordateIsNotNull() {
            addCriterion("MIRRORDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMirrordateEqualTo(Date value) {
            addCriterion("MIRRORDATE =", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotEqualTo(Date value) {
            addCriterion("MIRRORDATE <>", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateGreaterThan(Date value) {
            addCriterion("MIRRORDATE >", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateGreaterThanOrEqualTo(Date value) {
            addCriterion("MIRRORDATE >=", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateLessThan(Date value) {
            addCriterion("MIRRORDATE <", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateLessThanOrEqualTo(Date value) {
            addCriterion("MIRRORDATE <=", value, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateIn(List<Date> values) {
            addCriterion("MIRRORDATE in", values, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotIn(List<Date> values) {
            addCriterion("MIRRORDATE not in", values, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateBetween(Date value1, Date value2) {
            addCriterion("MIRRORDATE between", value1, value2, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andMirrordateNotBetween(Date value1, Date value2) {
            addCriterion("MIRRORDATE not between", value1, value2, "mirrordate");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceIsNull() {
            addCriterion("PREMIUMSRECBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceIsNotNull() {
            addCriterion("PREMIUMSRECBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceEqualTo(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE =", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceNotEqualTo(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE <>", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceGreaterThan(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE >", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE >=", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceLessThan(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE <", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUMSRECBALANCE <=", value, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceIn(List<BigDecimal> values) {
            addCriterion("PREMIUMSRECBALANCE in", values, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceNotIn(List<BigDecimal> values) {
            addCriterion("PREMIUMSRECBALANCE not in", values, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUMSRECBALANCE between", value1, value2, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andPremiumsrecbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUMSRECBALANCE not between", value1, value2, "premiumsrecbalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceIsNull() {
            addCriterion("SETTLEDDATEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceIsNotNull() {
            addCriterion("SETTLEDDATEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceEqualTo(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE =", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE <>", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceGreaterThan(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE >", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE >=", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceLessThan(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE <", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEDDATEBALANCE <=", value, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceIn(List<BigDecimal> values) {
            addCriterion("SETTLEDDATEBALANCE in", values, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEDDATEBALANCE not in", values, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEDDATEBALANCE between", value1, value2, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andSettleddatebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEDDATEBALANCE not between", value1, value2, "settleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceIsNull() {
            addCriterion("BEFORESETTLEDDATEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceIsNotNull() {
            addCriterion("BEFORESETTLEDDATEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceEqualTo(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE =", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceNotEqualTo(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE <>", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceGreaterThan(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE >", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE >=", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceLessThan(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE <", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORESETTLEDDATEBALANCE <=", value, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceIn(List<BigDecimal> values) {
            addCriterion("BEFORESETTLEDDATEBALANCE in", values, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceNotIn(List<BigDecimal> values) {
            addCriterion("BEFORESETTLEDDATEBALANCE not in", values, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORESETTLEDDATEBALANCE between", value1, value2, "beforesettleddatebalance");
            return (Criteria) this;
        }

        public Criteria andBeforesettleddatebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORESETTLEDDATEBALANCE not between", value1, value2, "beforesettleddatebalance");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_largepremiumsrec_td
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
     * @Table : mm_largepremiumsrec_td
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