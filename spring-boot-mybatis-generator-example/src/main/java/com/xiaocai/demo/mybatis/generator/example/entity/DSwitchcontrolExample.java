package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DSwitchcontrolExample {
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
    public DSwitchcontrolExample() {
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
     * @Table : d_switchcontrol
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andSubcompanynameIsNull() {
            addCriterion("SUBCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIsNotNull() {
            addCriterion("SUBCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME =", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <>", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThan(String value) {
            addCriterion("SUBCOMPANYNAME >", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME >=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThan(String value) {
            addCriterion("SUBCOMPANYNAME <", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLike(String value) {
            addCriterion("SUBCOMPANYNAME like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotLike(String value) {
            addCriterion("SUBCOMPANYNAME not like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME not in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME not between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andChannelcodeIsNull() {
            addCriterion("CHANNELCODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelcodeIsNotNull() {
            addCriterion("CHANNELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelcodeEqualTo(String value) {
            addCriterion("CHANNELCODE =", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeNotEqualTo(String value) {
            addCriterion("CHANNELCODE <>", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeGreaterThan(String value) {
            addCriterion("CHANNELCODE >", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELCODE >=", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeLessThan(String value) {
            addCriterion("CHANNELCODE <", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNELCODE <=", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeLike(String value) {
            addCriterion("CHANNELCODE like", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeNotLike(String value) {
            addCriterion("CHANNELCODE not like", value, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeIn(List<String> values) {
            addCriterion("CHANNELCODE in", values, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeNotIn(List<String> values) {
            addCriterion("CHANNELCODE not in", values, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeBetween(String value1, String value2) {
            addCriterion("CHANNELCODE between", value1, value2, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelcodeNotBetween(String value1, String value2) {
            addCriterion("CHANNELCODE not between", value1, value2, "channelcode");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("CHANNELNAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("CHANNELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("CHANNELNAME =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("CHANNELNAME <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("CHANNELNAME >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELNAME >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("CHANNELNAME <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("CHANNELNAME <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("CHANNELNAME like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("CHANNELNAME not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("CHANNELNAME in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("CHANNELNAME not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("CHANNELNAME between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("CHANNELNAME not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BANKID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("BANKID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("BANKID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("BANKID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("BANKID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("BANKID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("BANKID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("BANKID like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("BANKID not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("BANKID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("BANKID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("BANKID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("BANKID not between", value1, value2, "bankid");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModetypeIsNull() {
            addCriterion("MODETYPE is null");
            return (Criteria) this;
        }

        public Criteria andModetypeIsNotNull() {
            addCriterion("MODETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModetypeEqualTo(String value) {
            addCriterion("MODETYPE =", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeNotEqualTo(String value) {
            addCriterion("MODETYPE <>", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeGreaterThan(String value) {
            addCriterion("MODETYPE >", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODETYPE >=", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeLessThan(String value) {
            addCriterion("MODETYPE <", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeLessThanOrEqualTo(String value) {
            addCriterion("MODETYPE <=", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeLike(String value) {
            addCriterion("MODETYPE like", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeNotLike(String value) {
            addCriterion("MODETYPE not like", value, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeIn(List<String> values) {
            addCriterion("MODETYPE in", values, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeNotIn(List<String> values) {
            addCriterion("MODETYPE not in", values, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeBetween(String value1, String value2) {
            addCriterion("MODETYPE between", value1, value2, "modetype");
            return (Criteria) this;
        }

        public Criteria andModetypeNotBetween(String value1, String value2) {
            addCriterion("MODETYPE not between", value1, value2, "modetype");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeIsNull() {
            addCriterion("REALNAMEMODE is null");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeIsNotNull() {
            addCriterion("REALNAMEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeEqualTo(String value) {
            addCriterion("REALNAMEMODE =", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeNotEqualTo(String value) {
            addCriterion("REALNAMEMODE <>", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeGreaterThan(String value) {
            addCriterion("REALNAMEMODE >", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAMEMODE >=", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeLessThan(String value) {
            addCriterion("REALNAMEMODE <", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeLessThanOrEqualTo(String value) {
            addCriterion("REALNAMEMODE <=", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeLike(String value) {
            addCriterion("REALNAMEMODE like", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeNotLike(String value) {
            addCriterion("REALNAMEMODE not like", value, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeIn(List<String> values) {
            addCriterion("REALNAMEMODE in", values, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeNotIn(List<String> values) {
            addCriterion("REALNAMEMODE not in", values, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeBetween(String value1, String value2) {
            addCriterion("REALNAMEMODE between", value1, value2, "realnamemode");
            return (Criteria) this;
        }

        public Criteria andRealnamemodeNotBetween(String value1, String value2) {
            addCriterion("REALNAMEMODE not between", value1, value2, "realnamemode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : d_switchcontrol
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
     * @Table : d_switchcontrol
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