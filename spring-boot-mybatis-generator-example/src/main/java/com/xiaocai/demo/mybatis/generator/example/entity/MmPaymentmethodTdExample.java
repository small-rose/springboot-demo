package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPaymentmethodTdExample {
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
    public MmPaymentmethodTdExample() {
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
     * @Table : mm_paymentmethod_td
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

        public Criteria andPaymethodIsNull() {
            addCriterion("PAYMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNotNull() {
            addCriterion("PAYMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodEqualTo(String value) {
            addCriterion("PAYMETHOD =", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotEqualTo(String value) {
            addCriterion("PAYMETHOD <>", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThan(String value) {
            addCriterion("PAYMETHOD >", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD >=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThan(String value) {
            addCriterion("PAYMETHOD <", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD <=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLike(String value) {
            addCriterion("PAYMETHOD like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotLike(String value) {
            addCriterion("PAYMETHOD not like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodIn(List<String> values) {
            addCriterion("PAYMETHOD in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotIn(List<String> values) {
            addCriterion("PAYMETHOD not in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodBetween(String value1, String value2) {
            addCriterion("PAYMETHOD between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotBetween(String value1, String value2) {
            addCriterion("PAYMETHOD not between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
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

        public Criteria andIfpublicIsNull() {
            addCriterion("IFPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIfpublicIsNotNull() {
            addCriterion("IFPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIfpublicEqualTo(String value) {
            addCriterion("IFPUBLIC =", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicNotEqualTo(String value) {
            addCriterion("IFPUBLIC <>", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicGreaterThan(String value) {
            addCriterion("IFPUBLIC >", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicGreaterThanOrEqualTo(String value) {
            addCriterion("IFPUBLIC >=", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicLessThan(String value) {
            addCriterion("IFPUBLIC <", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicLessThanOrEqualTo(String value) {
            addCriterion("IFPUBLIC <=", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicLike(String value) {
            addCriterion("IFPUBLIC like", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicNotLike(String value) {
            addCriterion("IFPUBLIC not like", value, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicIn(List<String> values) {
            addCriterion("IFPUBLIC in", values, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicNotIn(List<String> values) {
            addCriterion("IFPUBLIC not in", values, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicBetween(String value1, String value2) {
            addCriterion("IFPUBLIC between", value1, value2, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andIfpublicNotBetween(String value1, String value2) {
            addCriterion("IFPUBLIC not between", value1, value2, "ifpublic");
            return (Criteria) this;
        }

        public Criteria andRootidIsNull() {
            addCriterion("ROOTID is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("ROOTID is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(BigDecimal value) {
            addCriterion("ROOTID =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(BigDecimal value) {
            addCriterion("ROOTID <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(BigDecimal value) {
            addCriterion("ROOTID >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOTID >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(BigDecimal value) {
            addCriterion("ROOTID <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOTID <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<BigDecimal> values) {
            addCriterion("ROOTID in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<BigDecimal> values) {
            addCriterion("ROOTID not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOTID between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOTID not between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DISPLAYORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DISPLAYORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(String value) {
            addCriterion("DISPLAYORDER =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(String value) {
            addCriterion("DISPLAYORDER <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(String value) {
            addCriterion("DISPLAYORDER >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYORDER >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(String value) {
            addCriterion("DISPLAYORDER <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYORDER <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLike(String value) {
            addCriterion("DISPLAYORDER like", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotLike(String value) {
            addCriterion("DISPLAYORDER not like", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<String> values) {
            addCriterion("DISPLAYORDER in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<String> values) {
            addCriterion("DISPLAYORDER not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(String value1, String value2) {
            addCriterion("DISPLAYORDER between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(String value1, String value2) {
            addCriterion("DISPLAYORDER not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNull() {
            addCriterion("ISDISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("ISDISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(String value) {
            addCriterion("ISDISPLAY =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(String value) {
            addCriterion("ISDISPLAY <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(String value) {
            addCriterion("ISDISPLAY >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(String value) {
            addCriterion("ISDISPLAY >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(String value) {
            addCriterion("ISDISPLAY <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(String value) {
            addCriterion("ISDISPLAY <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLike(String value) {
            addCriterion("ISDISPLAY like", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotLike(String value) {
            addCriterion("ISDISPLAY not like", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<String> values) {
            addCriterion("ISDISPLAY in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<String> values) {
            addCriterion("ISDISPLAY not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(String value1, String value2) {
            addCriterion("ISDISPLAY between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(String value1, String value2) {
            addCriterion("ISDISPLAY not between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andVTimestampIsNull() {
            addCriterion("V_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andVTimestampIsNotNull() {
            addCriterion("V_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andVTimestampEqualTo(Date value) {
            addCriterion("V_TIMESTAMP =", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampNotEqualTo(Date value) {
            addCriterion("V_TIMESTAMP <>", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampGreaterThan(Date value) {
            addCriterion("V_TIMESTAMP >", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("V_TIMESTAMP >=", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampLessThan(Date value) {
            addCriterion("V_TIMESTAMP <", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampLessThanOrEqualTo(Date value) {
            addCriterion("V_TIMESTAMP <=", value, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampIn(List<Date> values) {
            addCriterion("V_TIMESTAMP in", values, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampNotIn(List<Date> values) {
            addCriterion("V_TIMESTAMP not in", values, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampBetween(Date value1, Date value2) {
            addCriterion("V_TIMESTAMP between", value1, value2, "vTimestamp");
            return (Criteria) this;
        }

        public Criteria andVTimestampNotBetween(Date value1, Date value2) {
            addCriterion("V_TIMESTAMP not between", value1, value2, "vTimestamp");
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

        public Criteria andReserveIsNull() {
            addCriterion("RESERVE is null");
            return (Criteria) this;
        }

        public Criteria andReserveIsNotNull() {
            addCriterion("RESERVE is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEqualTo(String value) {
            addCriterion("RESERVE =", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotEqualTo(String value) {
            addCriterion("RESERVE <>", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThan(String value) {
            addCriterion("RESERVE >", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE >=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThan(String value) {
            addCriterion("RESERVE <", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThanOrEqualTo(String value) {
            addCriterion("RESERVE <=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLike(String value) {
            addCriterion("RESERVE like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotLike(String value) {
            addCriterion("RESERVE not like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveIn(List<String> values) {
            addCriterion("RESERVE in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotIn(List<String> values) {
            addCriterion("RESERVE not in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveBetween(String value1, String value2) {
            addCriterion("RESERVE between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotBetween(String value1, String value2) {
            addCriterion("RESERVE not between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andMaxamountIsNull() {
            addCriterion("MAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxamountIsNotNull() {
            addCriterion("MAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxamountEqualTo(BigDecimal value) {
            addCriterion("MAXAMOUNT =", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotEqualTo(BigDecimal value) {
            addCriterion("MAXAMOUNT <>", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountGreaterThan(BigDecimal value) {
            addCriterion("MAXAMOUNT >", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXAMOUNT >=", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountLessThan(BigDecimal value) {
            addCriterion("MAXAMOUNT <", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXAMOUNT <=", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountIn(List<BigDecimal> values) {
            addCriterion("MAXAMOUNT in", values, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotIn(List<BigDecimal> values) {
            addCriterion("MAXAMOUNT not in", values, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXAMOUNT between", value1, value2, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXAMOUNT not between", value1, value2, "maxamount");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_paymentmethod_td
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
     * @Table : mm_paymentmethod_td
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