package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAccountageTdExample {
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
    public MmAccountageTdExample() {
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
     * @Table : mm_accountage_td
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

        public Criteria andPeriodnameIsNull() {
            addCriterion("PERIODNAME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodnameIsNotNull() {
            addCriterion("PERIODNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodnameEqualTo(Long value) {
            addCriterion("PERIODNAME =", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotEqualTo(Long value) {
            addCriterion("PERIODNAME <>", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameGreaterThan(Long value) {
            addCriterion("PERIODNAME >", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameGreaterThanOrEqualTo(Long value) {
            addCriterion("PERIODNAME >=", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameLessThan(Long value) {
            addCriterion("PERIODNAME <", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameLessThanOrEqualTo(Long value) {
            addCriterion("PERIODNAME <=", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameIn(List<Long> values) {
            addCriterion("PERIODNAME in", values, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotIn(List<Long> values) {
            addCriterion("PERIODNAME not in", values, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameBetween(Long value1, Long value2) {
            addCriterion("PERIODNAME between", value1, value2, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotBetween(Long value1, Long value2) {
            addCriterion("PERIODNAME not between", value1, value2, "periodname");
            return (Criteria) this;
        }

        public Criteria andAccountcodeIsNull() {
            addCriterion("ACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAccountcodeIsNotNull() {
            addCriterion("ACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcodeEqualTo(Long value) {
            addCriterion("ACCOUNTCODE =", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotEqualTo(Long value) {
            addCriterion("ACCOUNTCODE <>", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeGreaterThan(Long value) {
            addCriterion("ACCOUNTCODE >", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTCODE >=", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeLessThan(Long value) {
            addCriterion("ACCOUNTCODE <", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTCODE <=", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeIn(List<Long> values) {
            addCriterion("ACCOUNTCODE in", values, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotIn(List<Long> values) {
            addCriterion("ACCOUNTCODE not in", values, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTCODE between", value1, value2, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTCODE not between", value1, value2, "accountcode");
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

        public Criteria andClassescodeEqualTo(Long value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(Long value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(Long value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(Long value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(Long value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(Long value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<Long> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<Long> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(Long value1, Long value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(Long value1, Long value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
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

        public Criteria andCurrencycodeEqualTo(Long value) {
            addCriterion("CURRENCYCODE =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(Long value) {
            addCriterion("CURRENCYCODE <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(Long value) {
            addCriterion("CURRENCYCODE >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENCYCODE >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(Long value) {
            addCriterion("CURRENCYCODE <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(Long value) {
            addCriterion("CURRENCYCODE <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<Long> values) {
            addCriterion("CURRENCYCODE in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<Long> values) {
            addCriterion("CURRENCYCODE not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(Long value1, Long value2) {
            addCriterion("CURRENCYCODE between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(Long value1, Long value2) {
            addCriterion("CURRENCYCODE not between", value1, value2, "currencycode");
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

        public Criteria andAgetypeIsNull() {
            addCriterion("AGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgetypeIsNotNull() {
            addCriterion("AGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgetypeEqualTo(Long value) {
            addCriterion("AGETYPE =", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotEqualTo(Long value) {
            addCriterion("AGETYPE <>", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThan(Long value) {
            addCriterion("AGETYPE >", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThanOrEqualTo(Long value) {
            addCriterion("AGETYPE >=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThan(Long value) {
            addCriterion("AGETYPE <", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThanOrEqualTo(Long value) {
            addCriterion("AGETYPE <=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeIn(List<Long> values) {
            addCriterion("AGETYPE in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotIn(List<Long> values) {
            addCriterion("AGETYPE not in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeBetween(Long value1, Long value2) {
            addCriterion("AGETYPE between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotBetween(Long value1, Long value2) {
            addCriterion("AGETYPE not between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNull() {
            addCriterion("SYSTEMID is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("SYSTEMID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(String value) {
            addCriterion("SYSTEMID =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(String value) {
            addCriterion("SYSTEMID <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(String value) {
            addCriterion("SYSTEMID >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMID >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(String value) {
            addCriterion("SYSTEMID <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMID <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLike(String value) {
            addCriterion("SYSTEMID like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotLike(String value) {
            addCriterion("SYSTEMID not like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<String> values) {
            addCriterion("SYSTEMID in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<String> values) {
            addCriterion("SYSTEMID not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(String value1, String value2) {
            addCriterion("SYSTEMID between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(String value1, String value2) {
            addCriterion("SYSTEMID not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrIsNull() {
            addCriterion("PTD_ENTERED_DR is null");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrIsNotNull() {
            addCriterion("PTD_ENTERED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR =", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrNotEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR <>", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrGreaterThan(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR >", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR >=", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrLessThan(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR <", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_DR <=", value, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrIn(List<BigDecimal> values) {
            addCriterion("PTD_ENTERED_DR in", values, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrNotIn(List<BigDecimal> values) {
            addCriterion("PTD_ENTERED_DR not in", values, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ENTERED_DR between", value1, value2, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ENTERED_DR not between", value1, value2, "ptdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrIsNull() {
            addCriterion("PTD_ENTERED_CR is null");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrIsNotNull() {
            addCriterion("PTD_ENTERED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR =", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrNotEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR <>", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrGreaterThan(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR >", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR >=", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrLessThan(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR <", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ENTERED_CR <=", value, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrIn(List<BigDecimal> values) {
            addCriterion("PTD_ENTERED_CR in", values, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrNotIn(List<BigDecimal> values) {
            addCriterion("PTD_ENTERED_CR not in", values, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ENTERED_CR between", value1, value2, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdEnteredCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ENTERED_CR not between", value1, value2, "ptdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrIsNull() {
            addCriterion("YTD_ENTERED_DR is null");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrIsNotNull() {
            addCriterion("YTD_ENTERED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR =", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrNotEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR <>", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrGreaterThan(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR >", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR >=", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrLessThan(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR <", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_DR <=", value, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrIn(List<BigDecimal> values) {
            addCriterion("YTD_ENTERED_DR in", values, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrNotIn(List<BigDecimal> values) {
            addCriterion("YTD_ENTERED_DR not in", values, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ENTERED_DR between", value1, value2, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ENTERED_DR not between", value1, value2, "ytdEnteredDr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrIsNull() {
            addCriterion("YTD_ENTERED_CR is null");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrIsNotNull() {
            addCriterion("YTD_ENTERED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR =", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrNotEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR <>", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrGreaterThan(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR >", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR >=", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrLessThan(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR <", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ENTERED_CR <=", value, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrIn(List<BigDecimal> values) {
            addCriterion("YTD_ENTERED_CR in", values, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrNotIn(List<BigDecimal> values) {
            addCriterion("YTD_ENTERED_CR not in", values, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ENTERED_CR between", value1, value2, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andYtdEnteredCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ENTERED_CR not between", value1, value2, "ytdEnteredCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrIsNull() {
            addCriterion("PTD_ACCOUNTED_DR is null");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrIsNotNull() {
            addCriterion("PTD_ACCOUNTED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR =", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrNotEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR <>", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrGreaterThan(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR >", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR >=", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrLessThan(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR <", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_DR <=", value, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrIn(List<BigDecimal> values) {
            addCriterion("PTD_ACCOUNTED_DR in", values, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrNotIn(List<BigDecimal> values) {
            addCriterion("PTD_ACCOUNTED_DR not in", values, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ACCOUNTED_DR between", value1, value2, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ACCOUNTED_DR not between", value1, value2, "ptdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrIsNull() {
            addCriterion("PTD_ACCOUNTED_CR is null");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrIsNotNull() {
            addCriterion("PTD_ACCOUNTED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR =", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrNotEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR <>", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrGreaterThan(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR >", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR >=", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrLessThan(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR <", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTD_ACCOUNTED_CR <=", value, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrIn(List<BigDecimal> values) {
            addCriterion("PTD_ACCOUNTED_CR in", values, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrNotIn(List<BigDecimal> values) {
            addCriterion("PTD_ACCOUNTED_CR not in", values, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ACCOUNTED_CR between", value1, value2, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andPtdAccountedCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTD_ACCOUNTED_CR not between", value1, value2, "ptdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrIsNull() {
            addCriterion("YTD_ACCOUNTED_DR is null");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrIsNotNull() {
            addCriterion("YTD_ACCOUNTED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR =", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrNotEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR <>", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrGreaterThan(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR >", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR >=", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrLessThan(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR <", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_DR <=", value, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrIn(List<BigDecimal> values) {
            addCriterion("YTD_ACCOUNTED_DR in", values, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrNotIn(List<BigDecimal> values) {
            addCriterion("YTD_ACCOUNTED_DR not in", values, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ACCOUNTED_DR between", value1, value2, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ACCOUNTED_DR not between", value1, value2, "ytdAccountedDr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrIsNull() {
            addCriterion("YTD_ACCOUNTED_CR is null");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrIsNotNull() {
            addCriterion("YTD_ACCOUNTED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR =", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrNotEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR <>", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrGreaterThan(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR >", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR >=", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrLessThan(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR <", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YTD_ACCOUNTED_CR <=", value, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrIn(List<BigDecimal> values) {
            addCriterion("YTD_ACCOUNTED_CR in", values, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrNotIn(List<BigDecimal> values) {
            addCriterion("YTD_ACCOUNTED_CR not in", values, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ACCOUNTED_CR between", value1, value2, "ytdAccountedCr");
            return (Criteria) this;
        }

        public Criteria andYtdAccountedCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YTD_ACCOUNTED_CR not between", value1, value2, "ytdAccountedCr");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_accountage_td
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
     * @Table : mm_accountage_td
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