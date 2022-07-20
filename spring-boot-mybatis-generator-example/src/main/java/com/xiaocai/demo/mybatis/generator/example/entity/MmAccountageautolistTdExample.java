package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAccountageautolistTdExample {
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
    public MmAccountageautolistTdExample() {
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
     * @Table : mm_accountageautolist_td
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChageIdIsNull() {
            addCriterion("CHAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChageIdIsNotNull() {
            addCriterion("CHAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChageIdEqualTo(String value) {
            addCriterion("CHAGE_ID =", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdNotEqualTo(String value) {
            addCriterion("CHAGE_ID <>", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdGreaterThan(String value) {
            addCriterion("CHAGE_ID >", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHAGE_ID >=", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdLessThan(String value) {
            addCriterion("CHAGE_ID <", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdLessThanOrEqualTo(String value) {
            addCriterion("CHAGE_ID <=", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdLike(String value) {
            addCriterion("CHAGE_ID like", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdNotLike(String value) {
            addCriterion("CHAGE_ID not like", value, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdIn(List<String> values) {
            addCriterion("CHAGE_ID in", values, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdNotIn(List<String> values) {
            addCriterion("CHAGE_ID not in", values, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdBetween(String value1, String value2) {
            addCriterion("CHAGE_ID between", value1, value2, "chageId");
            return (Criteria) this;
        }

        public Criteria andChageIdNotBetween(String value1, String value2) {
            addCriterion("CHAGE_ID not between", value1, value2, "chageId");
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

        public Criteria andAccountcodeIsNull() {
            addCriterion("ACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAccountcodeIsNotNull() {
            addCriterion("ACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcodeEqualTo(String value) {
            addCriterion("ACCOUNTCODE =", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotEqualTo(String value) {
            addCriterion("ACCOUNTCODE <>", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeGreaterThan(String value) {
            addCriterion("ACCOUNTCODE >", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCODE >=", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeLessThan(String value) {
            addCriterion("ACCOUNTCODE <", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCODE <=", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeLike(String value) {
            addCriterion("ACCOUNTCODE like", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotLike(String value) {
            addCriterion("ACCOUNTCODE not like", value, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeIn(List<String> values) {
            addCriterion("ACCOUNTCODE in", values, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotIn(List<String> values) {
            addCriterion("ACCOUNTCODE not in", values, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeBetween(String value1, String value2) {
            addCriterion("ACCOUNTCODE between", value1, value2, "accountcode");
            return (Criteria) this;
        }

        public Criteria andAccountcodeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTCODE not between", value1, value2, "accountcode");
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

        public Criteria andAccountageIsNull() {
            addCriterion("ACCOUNTAGE is null");
            return (Criteria) this;
        }

        public Criteria andAccountageIsNotNull() {
            addCriterion("ACCOUNTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountageEqualTo(String value) {
            addCriterion("ACCOUNTAGE =", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotEqualTo(String value) {
            addCriterion("ACCOUNTAGE <>", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThan(String value) {
            addCriterion("ACCOUNTAGE >", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE >=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThan(String value) {
            addCriterion("ACCOUNTAGE <", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE <=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLike(String value) {
            addCriterion("ACCOUNTAGE like", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotLike(String value) {
            addCriterion("ACCOUNTAGE not like", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageIn(List<String> values) {
            addCriterion("ACCOUNTAGE in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotIn(List<String> values) {
            addCriterion("ACCOUNTAGE not in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageBetween(String value1, String value2) {
            addCriterion("ACCOUNTAGE between", value1, value2, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotBetween(String value1, String value2) {
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

        public Criteria andAgetypeEqualTo(String value) {
            addCriterion("AGETYPE =", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotEqualTo(String value) {
            addCriterion("AGETYPE <>", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThan(String value) {
            addCriterion("AGETYPE >", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGETYPE >=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThan(String value) {
            addCriterion("AGETYPE <", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThanOrEqualTo(String value) {
            addCriterion("AGETYPE <=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLike(String value) {
            addCriterion("AGETYPE like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotLike(String value) {
            addCriterion("AGETYPE not like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeIn(List<String> values) {
            addCriterion("AGETYPE in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotIn(List<String> values) {
            addCriterion("AGETYPE not in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeBetween(String value1, String value2) {
            addCriterion("AGETYPE between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotBetween(String value1, String value2) {
            addCriterion("AGETYPE not between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("LASTOPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("LASTOPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("LASTOPDATE =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("LASTOPDATE <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("LASTOPDATE >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("LASTOPDATE <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTOPDATE <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("LASTOPDATE in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("LASTOPDATE not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTOPDATE not between", value1, value2, "lastopdate");
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
     * @Table : mm_accountageautolist_td
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
     * @Table : mm_accountageautolist_td
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