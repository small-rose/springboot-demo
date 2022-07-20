package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAccountTdExample {
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
    public MmAccountTdExample() {
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
     * @Table : mm_account_td
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

        public Criteria andMmaccountidIsNull() {
            addCriterion("MMACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIsNotNull() {
            addCriterion("MMACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidEqualTo(Long value) {
            addCriterion("MMACCOUNTID =", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotEqualTo(Long value) {
            addCriterion("MMACCOUNTID <>", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThan(Long value) {
            addCriterion("MMACCOUNTID >", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("MMACCOUNTID >=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThan(Long value) {
            addCriterion("MMACCOUNTID <", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThanOrEqualTo(Long value) {
            addCriterion("MMACCOUNTID <=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIn(List<Long> values) {
            addCriterion("MMACCOUNTID in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotIn(List<Long> values) {
            addCriterion("MMACCOUNTID not in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidBetween(Long value1, Long value2) {
            addCriterion("MMACCOUNTID between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotBetween(Long value1, Long value2) {
            addCriterion("MMACCOUNTID not between", value1, value2, "mmaccountid");
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

        public Criteria andUnitnameIsNull() {
            addCriterion("UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UNITNAME =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UNITNAME <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UNITNAME >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNITNAME >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UNITNAME <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UNITNAME <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UNITNAME like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UNITNAME not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UNITNAME in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UNITNAME not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UNITNAME between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UNITNAME not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
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

        public Criteria andBanknoIsNull() {
            addCriterion("BANKNO is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BANKNO =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BANKNO <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BANKNO >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNO >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BANKNO <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BANKNO <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BANKNO like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BANKNO not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BANKNO in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BANKNO not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BANKNO between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BANKNO not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankbalanceIsNull() {
            addCriterion("BANKBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBankbalanceIsNotNull() {
            addCriterion("BANKBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankbalanceEqualTo(BigDecimal value) {
            addCriterion("BANKBALANCE =", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceNotEqualTo(BigDecimal value) {
            addCriterion("BANKBALANCE <>", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceGreaterThan(BigDecimal value) {
            addCriterion("BANKBALANCE >", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKBALANCE >=", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceLessThan(BigDecimal value) {
            addCriterion("BANKBALANCE <", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKBALANCE <=", value, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceIn(List<BigDecimal> values) {
            addCriterion("BANKBALANCE in", values, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceNotIn(List<BigDecimal> values) {
            addCriterion("BANKBALANCE not in", values, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKBALANCE between", value1, value2, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andBankbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKBALANCE not between", value1, value2, "bankbalance");
            return (Criteria) this;
        }

        public Criteria andOpeningdateIsNull() {
            addCriterion("OPENINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpeningdateIsNotNull() {
            addCriterion("OPENINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningdateEqualTo(Date value) {
            addCriterion("OPENINGDATE =", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateNotEqualTo(Date value) {
            addCriterion("OPENINGDATE <>", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateGreaterThan(Date value) {
            addCriterion("OPENINGDATE >", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPENINGDATE >=", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateLessThan(Date value) {
            addCriterion("OPENINGDATE <", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateLessThanOrEqualTo(Date value) {
            addCriterion("OPENINGDATE <=", value, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateIn(List<Date> values) {
            addCriterion("OPENINGDATE in", values, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateNotIn(List<Date> values) {
            addCriterion("OPENINGDATE not in", values, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateBetween(Date value1, Date value2) {
            addCriterion("OPENINGDATE between", value1, value2, "openingdate");
            return (Criteria) this;
        }

        public Criteria andOpeningdateNotBetween(Date value1, Date value2) {
            addCriterion("OPENINGDATE not between", value1, value2, "openingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNull() {
            addCriterion("CLOSINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNotNull() {
            addCriterion("CLOSINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosingdateEqualTo(Date value) {
            addCriterion("CLOSINGDATE =", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotEqualTo(Date value) {
            addCriterion("CLOSINGDATE <>", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThan(Date value) {
            addCriterion("CLOSINGDATE >", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSINGDATE >=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThan(Date value) {
            addCriterion("CLOSINGDATE <", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThanOrEqualTo(Date value) {
            addCriterion("CLOSINGDATE <=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateIn(List<Date> values) {
            addCriterion("CLOSINGDATE in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotIn(List<Date> values) {
            addCriterion("CLOSINGDATE not in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateBetween(Date value1, Date value2) {
            addCriterion("CLOSINGDATE between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotBetween(Date value1, Date value2) {
            addCriterion("CLOSINGDATE not between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andAccattributeIsNull() {
            addCriterion("ACCATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andAccattributeIsNotNull() {
            addCriterion("ACCATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andAccattributeEqualTo(String value) {
            addCriterion("ACCATTRIBUTE =", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeNotEqualTo(String value) {
            addCriterion("ACCATTRIBUTE <>", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeGreaterThan(String value) {
            addCriterion("ACCATTRIBUTE >", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE >=", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeLessThan(String value) {
            addCriterion("ACCATTRIBUTE <", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeLessThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE <=", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeLike(String value) {
            addCriterion("ACCATTRIBUTE like", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeNotLike(String value) {
            addCriterion("ACCATTRIBUTE not like", value, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeIn(List<String> values) {
            addCriterion("ACCATTRIBUTE in", values, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeNotIn(List<String> values) {
            addCriterion("ACCATTRIBUTE not in", values, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeBetween(String value1, String value2) {
            addCriterion("ACCATTRIBUTE between", value1, value2, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattributeNotBetween(String value1, String value2) {
            addCriterion("ACCATTRIBUTE not between", value1, value2, "accattribute");
            return (Criteria) this;
        }

        public Criteria andAccattribute2IsNull() {
            addCriterion("ACCATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAccattribute2IsNotNull() {
            addCriterion("ACCATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccattribute2EqualTo(String value) {
            addCriterion("ACCATTRIBUTE2 =", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2NotEqualTo(String value) {
            addCriterion("ACCATTRIBUTE2 <>", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2GreaterThan(String value) {
            addCriterion("ACCATTRIBUTE2 >", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE2 >=", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2LessThan(String value) {
            addCriterion("ACCATTRIBUTE2 <", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2LessThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE2 <=", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2Like(String value) {
            addCriterion("ACCATTRIBUTE2 like", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2NotLike(String value) {
            addCriterion("ACCATTRIBUTE2 not like", value, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2In(List<String> values) {
            addCriterion("ACCATTRIBUTE2 in", values, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2NotIn(List<String> values) {
            addCriterion("ACCATTRIBUTE2 not in", values, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2Between(String value1, String value2) {
            addCriterion("ACCATTRIBUTE2 between", value1, value2, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andAccattribute2NotBetween(String value1, String value2) {
            addCriterion("ACCATTRIBUTE2 not between", value1, value2, "accattribute2");
            return (Criteria) this;
        }

        public Criteria andIfnetbankIsNull() {
            addCriterion("IFNETBANK is null");
            return (Criteria) this;
        }

        public Criteria andIfnetbankIsNotNull() {
            addCriterion("IFNETBANK is not null");
            return (Criteria) this;
        }

        public Criteria andIfnetbankEqualTo(String value) {
            addCriterion("IFNETBANK =", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankNotEqualTo(String value) {
            addCriterion("IFNETBANK <>", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankGreaterThan(String value) {
            addCriterion("IFNETBANK >", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankGreaterThanOrEqualTo(String value) {
            addCriterion("IFNETBANK >=", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankLessThan(String value) {
            addCriterion("IFNETBANK <", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankLessThanOrEqualTo(String value) {
            addCriterion("IFNETBANK <=", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankLike(String value) {
            addCriterion("IFNETBANK like", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankNotLike(String value) {
            addCriterion("IFNETBANK not like", value, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankIn(List<String> values) {
            addCriterion("IFNETBANK in", values, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankNotIn(List<String> values) {
            addCriterion("IFNETBANK not in", values, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankBetween(String value1, String value2) {
            addCriterion("IFNETBANK between", value1, value2, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andIfnetbankNotBetween(String value1, String value2) {
            addCriterion("IFNETBANK not between", value1, value2, "ifnetbank");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("BANKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("BANKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("BANKTYPE =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("BANKTYPE <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("BANKTYPE >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTYPE >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("BANKTYPE <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("BANKTYPE <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("BANKTYPE like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("BANKTYPE not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("BANKTYPE in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("BANKTYPE not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("BANKTYPE between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("BANKTYPE not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andAssignercodeIsNull() {
            addCriterion("ASSIGNERCODE is null");
            return (Criteria) this;
        }

        public Criteria andAssignercodeIsNotNull() {
            addCriterion("ASSIGNERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignercodeEqualTo(String value) {
            addCriterion("ASSIGNERCODE =", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeNotEqualTo(String value) {
            addCriterion("ASSIGNERCODE <>", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeGreaterThan(String value) {
            addCriterion("ASSIGNERCODE >", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNERCODE >=", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeLessThan(String value) {
            addCriterion("ASSIGNERCODE <", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNERCODE <=", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeLike(String value) {
            addCriterion("ASSIGNERCODE like", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeNotLike(String value) {
            addCriterion("ASSIGNERCODE not like", value, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeIn(List<String> values) {
            addCriterion("ASSIGNERCODE in", values, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeNotIn(List<String> values) {
            addCriterion("ASSIGNERCODE not in", values, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeBetween(String value1, String value2) {
            addCriterion("ASSIGNERCODE between", value1, value2, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignercodeNotBetween(String value1, String value2) {
            addCriterion("ASSIGNERCODE not between", value1, value2, "assignercode");
            return (Criteria) this;
        }

        public Criteria andAssignernameIsNull() {
            addCriterion("ASSIGNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAssignernameIsNotNull() {
            addCriterion("ASSIGNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAssignernameEqualTo(String value) {
            addCriterion("ASSIGNERNAME =", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameNotEqualTo(String value) {
            addCriterion("ASSIGNERNAME <>", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameGreaterThan(String value) {
            addCriterion("ASSIGNERNAME >", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNERNAME >=", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameLessThan(String value) {
            addCriterion("ASSIGNERNAME <", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNERNAME <=", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameLike(String value) {
            addCriterion("ASSIGNERNAME like", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameNotLike(String value) {
            addCriterion("ASSIGNERNAME not like", value, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameIn(List<String> values) {
            addCriterion("ASSIGNERNAME in", values, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameNotIn(List<String> values) {
            addCriterion("ASSIGNERNAME not in", values, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameBetween(String value1, String value2) {
            addCriterion("ASSIGNERNAME between", value1, value2, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssignernameNotBetween(String value1, String value2) {
            addCriterion("ASSIGNERNAME not between", value1, value2, "assignername");
            return (Criteria) this;
        }

        public Criteria andAssigndateIsNull() {
            addCriterion("ASSIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andAssigndateIsNotNull() {
            addCriterion("ASSIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssigndateEqualTo(Date value) {
            addCriterion("ASSIGNDATE =", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotEqualTo(Date value) {
            addCriterion("ASSIGNDATE <>", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateGreaterThan(Date value) {
            addCriterion("ASSIGNDATE >", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSIGNDATE >=", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateLessThan(Date value) {
            addCriterion("ASSIGNDATE <", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateLessThanOrEqualTo(Date value) {
            addCriterion("ASSIGNDATE <=", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateIn(List<Date> values) {
            addCriterion("ASSIGNDATE in", values, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotIn(List<Date> values) {
            addCriterion("ASSIGNDATE not in", values, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateBetween(Date value1, Date value2) {
            addCriterion("ASSIGNDATE between", value1, value2, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotBetween(Date value1, Date value2) {
            addCriterion("ASSIGNDATE not between", value1, value2, "assigndate");
            return (Criteria) this;
        }

        public Criteria andFromatcodeIsNull() {
            addCriterion("FROMATCODE is null");
            return (Criteria) this;
        }

        public Criteria andFromatcodeIsNotNull() {
            addCriterion("FROMATCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromatcodeEqualTo(BigDecimal value) {
            addCriterion("FROMATCODE =", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeNotEqualTo(BigDecimal value) {
            addCriterion("FROMATCODE <>", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeGreaterThan(BigDecimal value) {
            addCriterion("FROMATCODE >", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FROMATCODE >=", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeLessThan(BigDecimal value) {
            addCriterion("FROMATCODE <", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FROMATCODE <=", value, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeIn(List<BigDecimal> values) {
            addCriterion("FROMATCODE in", values, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeNotIn(List<BigDecimal> values) {
            addCriterion("FROMATCODE not in", values, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROMATCODE between", value1, value2, "fromatcode");
            return (Criteria) this;
        }

        public Criteria andFromatcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROMATCODE not between", value1, value2, "fromatcode");
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

        public Criteria andErpaccountcodeIsNull() {
            addCriterion("ERPACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIsNotNull() {
            addCriterion("ERPACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE =", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <>", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThan(String value) {
            addCriterion("ERPACCOUNTCODE >", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE >=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThan(String value) {
            addCriterion("ERPACCOUNTCODE <", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLike(String value) {
            addCriterion("ERPACCOUNTCODE like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotLike(String value) {
            addCriterion("ERPACCOUNTCODE not like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE not in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE not between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andIfeditIsNull() {
            addCriterion("IFEDIT is null");
            return (Criteria) this;
        }

        public Criteria andIfeditIsNotNull() {
            addCriterion("IFEDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIfeditEqualTo(String value) {
            addCriterion("IFEDIT =", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditNotEqualTo(String value) {
            addCriterion("IFEDIT <>", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditGreaterThan(String value) {
            addCriterion("IFEDIT >", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditGreaterThanOrEqualTo(String value) {
            addCriterion("IFEDIT >=", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditLessThan(String value) {
            addCriterion("IFEDIT <", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditLessThanOrEqualTo(String value) {
            addCriterion("IFEDIT <=", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditLike(String value) {
            addCriterion("IFEDIT like", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditNotLike(String value) {
            addCriterion("IFEDIT not like", value, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditIn(List<String> values) {
            addCriterion("IFEDIT in", values, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditNotIn(List<String> values) {
            addCriterion("IFEDIT not in", values, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditBetween(String value1, String value2) {
            addCriterion("IFEDIT between", value1, value2, "ifedit");
            return (Criteria) this;
        }

        public Criteria andIfeditNotBetween(String value1, String value2) {
            addCriterion("IFEDIT not between", value1, value2, "ifedit");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("MODIFYDESC is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("MODIFYDESC is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("MODIFYDESC =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("MODIFYDESC <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("MODIFYDESC >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("MODIFYDESC <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("MODIFYDESC like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("MODIFYDESC not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("MODIFYDESC in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("MODIFYDESC not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("MODIFYDESC between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("MODIFYDESC not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andAccountownerIsNull() {
            addCriterion("ACCOUNTOWNER is null");
            return (Criteria) this;
        }

        public Criteria andAccountownerIsNotNull() {
            addCriterion("ACCOUNTOWNER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountownerEqualTo(String value) {
            addCriterion("ACCOUNTOWNER =", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerNotEqualTo(String value) {
            addCriterion("ACCOUNTOWNER <>", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerGreaterThan(String value) {
            addCriterion("ACCOUNTOWNER >", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTOWNER >=", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerLessThan(String value) {
            addCriterion("ACCOUNTOWNER <", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTOWNER <=", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerLike(String value) {
            addCriterion("ACCOUNTOWNER like", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerNotLike(String value) {
            addCriterion("ACCOUNTOWNER not like", value, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerIn(List<String> values) {
            addCriterion("ACCOUNTOWNER in", values, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerNotIn(List<String> values) {
            addCriterion("ACCOUNTOWNER not in", values, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerBetween(String value1, String value2) {
            addCriterion("ACCOUNTOWNER between", value1, value2, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccountownerNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTOWNER not between", value1, value2, "accountowner");
            return (Criteria) this;
        }

        public Criteria andAccattribute3IsNull() {
            addCriterion("ACCATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAccattribute3IsNotNull() {
            addCriterion("ACCATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAccattribute3EqualTo(String value) {
            addCriterion("ACCATTRIBUTE3 =", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3NotEqualTo(String value) {
            addCriterion("ACCATTRIBUTE3 <>", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3GreaterThan(String value) {
            addCriterion("ACCATTRIBUTE3 >", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE3 >=", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3LessThan(String value) {
            addCriterion("ACCATTRIBUTE3 <", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3LessThanOrEqualTo(String value) {
            addCriterion("ACCATTRIBUTE3 <=", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3Like(String value) {
            addCriterion("ACCATTRIBUTE3 like", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3NotLike(String value) {
            addCriterion("ACCATTRIBUTE3 not like", value, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3In(List<String> values) {
            addCriterion("ACCATTRIBUTE3 in", values, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3NotIn(List<String> values) {
            addCriterion("ACCATTRIBUTE3 not in", values, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3Between(String value1, String value2) {
            addCriterion("ACCATTRIBUTE3 between", value1, value2, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccattribute3NotBetween(String value1, String value2) {
            addCriterion("ACCATTRIBUTE3 not between", value1, value2, "accattribute3");
            return (Criteria) this;
        }

        public Criteria andAccaccountidIsNull() {
            addCriterion("ACCACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andAccaccountidIsNotNull() {
            addCriterion("ACCACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andAccaccountidEqualTo(String value) {
            addCriterion("ACCACCOUNTID =", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidNotEqualTo(String value) {
            addCriterion("ACCACCOUNTID <>", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidGreaterThan(String value) {
            addCriterion("ACCACCOUNTID >", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCACCOUNTID >=", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidLessThan(String value) {
            addCriterion("ACCACCOUNTID <", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidLessThanOrEqualTo(String value) {
            addCriterion("ACCACCOUNTID <=", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidLike(String value) {
            addCriterion("ACCACCOUNTID like", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidNotLike(String value) {
            addCriterion("ACCACCOUNTID not like", value, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidIn(List<String> values) {
            addCriterion("ACCACCOUNTID in", values, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidNotIn(List<String> values) {
            addCriterion("ACCACCOUNTID not in", values, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidBetween(String value1, String value2) {
            addCriterion("ACCACCOUNTID between", value1, value2, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andAccaccountidNotBetween(String value1, String value2) {
            addCriterion("ACCACCOUNTID not between", value1, value2, "accaccountid");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNull() {
            addCriterion("MERCHANTNO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNotNull() {
            addCriterion("MERCHANTNO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoEqualTo(String value) {
            addCriterion("MERCHANTNO =", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotEqualTo(String value) {
            addCriterion("MERCHANTNO <>", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThan(String value) {
            addCriterion("MERCHANTNO >", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTNO >=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThan(String value) {
            addCriterion("MERCHANTNO <", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTNO <=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLike(String value) {
            addCriterion("MERCHANTNO like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotLike(String value) {
            addCriterion("MERCHANTNO not like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIn(List<String> values) {
            addCriterion("MERCHANTNO in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotIn(List<String> values) {
            addCriterion("MERCHANTNO not in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoBetween(String value1, String value2) {
            addCriterion("MERCHANTNO between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotBetween(String value1, String value2) {
            addCriterion("MERCHANTNO not between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andImpformatidIsNull() {
            addCriterion("IMPFORMATID is null");
            return (Criteria) this;
        }

        public Criteria andImpformatidIsNotNull() {
            addCriterion("IMPFORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andImpformatidEqualTo(BigDecimal value) {
            addCriterion("IMPFORMATID =", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidNotEqualTo(BigDecimal value) {
            addCriterion("IMPFORMATID <>", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidGreaterThan(BigDecimal value) {
            addCriterion("IMPFORMATID >", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPFORMATID >=", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidLessThan(BigDecimal value) {
            addCriterion("IMPFORMATID <", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPFORMATID <=", value, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidIn(List<BigDecimal> values) {
            addCriterion("IMPFORMATID in", values, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidNotIn(List<BigDecimal> values) {
            addCriterion("IMPFORMATID not in", values, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPFORMATID between", value1, value2, "impformatid");
            return (Criteria) this;
        }

        public Criteria andImpformatidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPFORMATID not between", value1, value2, "impformatid");
            return (Criteria) this;
        }

        public Criteria andBankcodenameIsNull() {
            addCriterion("BANKCODENAME is null");
            return (Criteria) this;
        }

        public Criteria andBankcodenameIsNotNull() {
            addCriterion("BANKCODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodenameEqualTo(String value) {
            addCriterion("BANKCODENAME =", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameNotEqualTo(String value) {
            addCriterion("BANKCODENAME <>", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameGreaterThan(String value) {
            addCriterion("BANKCODENAME >", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODENAME >=", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameLessThan(String value) {
            addCriterion("BANKCODENAME <", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameLessThanOrEqualTo(String value) {
            addCriterion("BANKCODENAME <=", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameLike(String value) {
            addCriterion("BANKCODENAME like", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameNotLike(String value) {
            addCriterion("BANKCODENAME not like", value, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameIn(List<String> values) {
            addCriterion("BANKCODENAME in", values, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameNotIn(List<String> values) {
            addCriterion("BANKCODENAME not in", values, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameBetween(String value1, String value2) {
            addCriterion("BANKCODENAME between", value1, value2, "bankcodename");
            return (Criteria) this;
        }

        public Criteria andBankcodenameNotBetween(String value1, String value2) {
            addCriterion("BANKCODENAME not between", value1, value2, "bankcodename");
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

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andIfdirectIsNull() {
            addCriterion("IFDIRECT is null");
            return (Criteria) this;
        }

        public Criteria andIfdirectIsNotNull() {
            addCriterion("IFDIRECT is not null");
            return (Criteria) this;
        }

        public Criteria andIfdirectEqualTo(String value) {
            addCriterion("IFDIRECT =", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotEqualTo(String value) {
            addCriterion("IFDIRECT <>", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectGreaterThan(String value) {
            addCriterion("IFDIRECT >", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectGreaterThanOrEqualTo(String value) {
            addCriterion("IFDIRECT >=", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLessThan(String value) {
            addCriterion("IFDIRECT <", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLessThanOrEqualTo(String value) {
            addCriterion("IFDIRECT <=", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectLike(String value) {
            addCriterion("IFDIRECT like", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotLike(String value) {
            addCriterion("IFDIRECT not like", value, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectIn(List<String> values) {
            addCriterion("IFDIRECT in", values, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotIn(List<String> values) {
            addCriterion("IFDIRECT not in", values, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectBetween(String value1, String value2) {
            addCriterion("IFDIRECT between", value1, value2, "ifdirect");
            return (Criteria) this;
        }

        public Criteria andIfdirectNotBetween(String value1, String value2) {
            addCriterion("IFDIRECT not between", value1, value2, "ifdirect");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_account_td
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
     * @Table : mm_account_td
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