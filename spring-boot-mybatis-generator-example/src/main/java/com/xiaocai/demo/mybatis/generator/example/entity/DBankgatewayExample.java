package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBankgatewayExample {
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
    public DBankgatewayExample() {
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
     * @Table : d_bankgateway
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

        public Criteria andSeqidIsNull() {
            addCriterion("SEQID is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("SEQID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Long value) {
            addCriterion("SEQID =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Long value) {
            addCriterion("SEQID <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Long value) {
            addCriterion("SEQID >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQID >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Long value) {
            addCriterion("SEQID <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Long value) {
            addCriterion("SEQID <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Long> values) {
            addCriterion("SEQID in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Long> values) {
            addCriterion("SEQID not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Long value1, Long value2) {
            addCriterion("SEQID between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Long value1, Long value2) {
            addCriterion("SEQID not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeIsNull() {
            addCriterion("ORDER_BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeIsNotNull() {
            addCriterion("ORDER_BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeEqualTo(String value) {
            addCriterion("ORDER_BANKCODE =", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotEqualTo(String value) {
            addCriterion("ORDER_BANKCODE <>", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeGreaterThan(String value) {
            addCriterion("ORDER_BANKCODE >", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKCODE >=", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLessThan(String value) {
            addCriterion("ORDER_BANKCODE <", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKCODE <=", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLike(String value) {
            addCriterion("ORDER_BANKCODE like", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotLike(String value) {
            addCriterion("ORDER_BANKCODE not like", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeIn(List<String> values) {
            addCriterion("ORDER_BANKCODE in", values, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotIn(List<String> values) {
            addCriterion("ORDER_BANKCODE not in", values, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeBetween(String value1, String value2) {
            addCriterion("ORDER_BANKCODE between", value1, value2, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_BANKCODE not between", value1, value2, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameIsNull() {
            addCriterion("ORDER_BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameIsNotNull() {
            addCriterion("ORDER_BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameEqualTo(String value) {
            addCriterion("ORDER_BANKNAME =", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameNotEqualTo(String value) {
            addCriterion("ORDER_BANKNAME <>", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameGreaterThan(String value) {
            addCriterion("ORDER_BANKNAME >", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKNAME >=", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameLessThan(String value) {
            addCriterion("ORDER_BANKNAME <", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKNAME <=", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameLike(String value) {
            addCriterion("ORDER_BANKNAME like", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameNotLike(String value) {
            addCriterion("ORDER_BANKNAME not like", value, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameIn(List<String> values) {
            addCriterion("ORDER_BANKNAME in", values, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameNotIn(List<String> values) {
            addCriterion("ORDER_BANKNAME not in", values, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameBetween(String value1, String value2) {
            addCriterion("ORDER_BANKNAME between", value1, value2, "orderBankname");
            return (Criteria) this;
        }

        public Criteria andOrderBanknameNotBetween(String value1, String value2) {
            addCriterion("ORDER_BANKNAME not between", value1, value2, "orderBankname");
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

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("REQUEST_ID =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("REQUEST_ID <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("REQUEST_ID >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("REQUEST_ID <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("REQUEST_ID like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("REQUEST_ID not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("REQUEST_ID in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("REQUEST_ID not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("REQUEST_ID between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("REQUEST_ID not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("REQUEST_URL is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("REQUEST_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("REQUEST_URL =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("REQUEST_URL <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("REQUEST_URL >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("REQUEST_URL <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("REQUEST_URL like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("REQUEST_URL not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("REQUEST_URL in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("REQUEST_URL not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("REQUEST_URL between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("REQUEST_URL not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlIsNull() {
            addCriterion("REFUND_URL is null");
            return (Criteria) this;
        }

        public Criteria andRefundUrlIsNotNull() {
            addCriterion("REFUND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRefundUrlEqualTo(String value) {
            addCriterion("REFUND_URL =", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlNotEqualTo(String value) {
            addCriterion("REFUND_URL <>", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlGreaterThan(String value) {
            addCriterion("REFUND_URL >", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_URL >=", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlLessThan(String value) {
            addCriterion("REFUND_URL <", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlLessThanOrEqualTo(String value) {
            addCriterion("REFUND_URL <=", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlLike(String value) {
            addCriterion("REFUND_URL like", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlNotLike(String value) {
            addCriterion("REFUND_URL not like", value, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlIn(List<String> values) {
            addCriterion("REFUND_URL in", values, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlNotIn(List<String> values) {
            addCriterion("REFUND_URL not in", values, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlBetween(String value1, String value2) {
            addCriterion("REFUND_URL between", value1, value2, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andRefundUrlNotBetween(String value1, String value2) {
            addCriterion("REFUND_URL not between", value1, value2, "refundUrl");
            return (Criteria) this;
        }

        public Criteria andSignkeyIsNull() {
            addCriterion("SIGNKEY is null");
            return (Criteria) this;
        }

        public Criteria andSignkeyIsNotNull() {
            addCriterion("SIGNKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSignkeyEqualTo(String value) {
            addCriterion("SIGNKEY =", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotEqualTo(String value) {
            addCriterion("SIGNKEY <>", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyGreaterThan(String value) {
            addCriterion("SIGNKEY >", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNKEY >=", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLessThan(String value) {
            addCriterion("SIGNKEY <", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLessThanOrEqualTo(String value) {
            addCriterion("SIGNKEY <=", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLike(String value) {
            addCriterion("SIGNKEY like", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotLike(String value) {
            addCriterion("SIGNKEY not like", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyIn(List<String> values) {
            addCriterion("SIGNKEY in", values, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotIn(List<String> values) {
            addCriterion("SIGNKEY not in", values, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyBetween(String value1, String value2) {
            addCriterion("SIGNKEY between", value1, value2, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotBetween(String value1, String value2) {
            addCriterion("SIGNKEY not between", value1, value2, "signkey");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("SIGNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("SIGNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(String value) {
            addCriterion("SIGNTYPE =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(String value) {
            addCriterion("SIGNTYPE <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(String value) {
            addCriterion("SIGNTYPE >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNTYPE >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(String value) {
            addCriterion("SIGNTYPE <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(String value) {
            addCriterion("SIGNTYPE <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLike(String value) {
            addCriterion("SIGNTYPE like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotLike(String value) {
            addCriterion("SIGNTYPE not like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<String> values) {
            addCriterion("SIGNTYPE in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<String> values) {
            addCriterion("SIGNTYPE not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(String value1, String value2) {
            addCriterion("SIGNTYPE between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(String value1, String value2) {
            addCriterion("SIGNTYPE not between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNull() {
            addCriterion("INSU_MIDNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNotNull() {
            addCriterion("INSU_MIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoEqualTo(String value) {
            addCriterion("INSU_MIDNO =", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotEqualTo(String value) {
            addCriterion("INSU_MIDNO <>", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThan(String value) {
            addCriterion("INSU_MIDNO >", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO >=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThan(String value) {
            addCriterion("INSU_MIDNO <", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO <=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLike(String value) {
            addCriterion("INSU_MIDNO like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotLike(String value) {
            addCriterion("INSU_MIDNO not like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIn(List<String> values) {
            addCriterion("INSU_MIDNO in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotIn(List<String> values) {
            addCriterion("INSU_MIDNO not in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO between", value1, value2, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO not between", value1, value2, "insuMidno");
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

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNull() {
            addCriterion("CHARSET is null");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNotNull() {
            addCriterion("CHARSET is not null");
            return (Criteria) this;
        }

        public Criteria andCharsetEqualTo(String value) {
            addCriterion("CHARSET =", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotEqualTo(String value) {
            addCriterion("CHARSET <>", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThan(String value) {
            addCriterion("CHARSET >", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("CHARSET >=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThan(String value) {
            addCriterion("CHARSET <", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThanOrEqualTo(String value) {
            addCriterion("CHARSET <=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLike(String value) {
            addCriterion("CHARSET like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotLike(String value) {
            addCriterion("CHARSET not like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetIn(List<String> values) {
            addCriterion("CHARSET in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotIn(List<String> values) {
            addCriterion("CHARSET not in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetBetween(String value1, String value2) {
            addCriterion("CHARSET between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotBetween(String value1, String value2) {
            addCriterion("CHARSET not between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andShowUrlIsNull() {
            addCriterion("SHOW_URL is null");
            return (Criteria) this;
        }

        public Criteria andShowUrlIsNotNull() {
            addCriterion("SHOW_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShowUrlEqualTo(String value) {
            addCriterion("SHOW_URL =", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlNotEqualTo(String value) {
            addCriterion("SHOW_URL <>", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlGreaterThan(String value) {
            addCriterion("SHOW_URL >", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_URL >=", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlLessThan(String value) {
            addCriterion("SHOW_URL <", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlLessThanOrEqualTo(String value) {
            addCriterion("SHOW_URL <=", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlLike(String value) {
            addCriterion("SHOW_URL like", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlNotLike(String value) {
            addCriterion("SHOW_URL not like", value, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlIn(List<String> values) {
            addCriterion("SHOW_URL in", values, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlNotIn(List<String> values) {
            addCriterion("SHOW_URL not in", values, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlBetween(String value1, String value2) {
            addCriterion("SHOW_URL between", value1, value2, "showUrl");
            return (Criteria) this;
        }

        public Criteria andShowUrlNotBetween(String value1, String value2) {
            addCriterion("SHOW_URL not between", value1, value2, "showUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("NOTIFY_URL =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("NOTIFY_URL <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("NOTIFY_URL >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("NOTIFY_URL <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("NOTIFY_URL like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("NOTIFY_URL not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("NOTIFY_URL in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("NOTIFY_URL not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNull() {
            addCriterion("RETURN_URL is null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNotNull() {
            addCriterion("RETURN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlEqualTo(String value) {
            addCriterion("RETURN_URL =", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotEqualTo(String value) {
            addCriterion("RETURN_URL <>", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThan(String value) {
            addCriterion("RETURN_URL >", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_URL >=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThan(String value) {
            addCriterion("RETURN_URL <", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThanOrEqualTo(String value) {
            addCriterion("RETURN_URL <=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLike(String value) {
            addCriterion("RETURN_URL like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotLike(String value) {
            addCriterion("RETURN_URL not like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIn(List<String> values) {
            addCriterion("RETURN_URL in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotIn(List<String> values) {
            addCriterion("RETURN_URL not in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlBetween(String value1, String value2) {
            addCriterion("RETURN_URL between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotBetween(String value1, String value2) {
            addCriterion("RETURN_URL not between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlIsNull() {
            addCriterion("REFUND_NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlIsNotNull() {
            addCriterion("REFUND_NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlEqualTo(String value) {
            addCriterion("REFUND_NOTIFY_URL =", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlNotEqualTo(String value) {
            addCriterion("REFUND_NOTIFY_URL <>", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlGreaterThan(String value) {
            addCriterion("REFUND_NOTIFY_URL >", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_NOTIFY_URL >=", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlLessThan(String value) {
            addCriterion("REFUND_NOTIFY_URL <", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("REFUND_NOTIFY_URL <=", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlLike(String value) {
            addCriterion("REFUND_NOTIFY_URL like", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlNotLike(String value) {
            addCriterion("REFUND_NOTIFY_URL not like", value, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlIn(List<String> values) {
            addCriterion("REFUND_NOTIFY_URL in", values, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlNotIn(List<String> values) {
            addCriterion("REFUND_NOTIFY_URL not in", values, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlBetween(String value1, String value2) {
            addCriterion("REFUND_NOTIFY_URL between", value1, value2, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("REFUND_NOTIFY_URL not between", value1, value2, "refundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlIsNull() {
            addCriterion("VERYFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlIsNotNull() {
            addCriterion("VERYFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlEqualTo(String value) {
            addCriterion("VERYFY_URL =", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlNotEqualTo(String value) {
            addCriterion("VERYFY_URL <>", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlGreaterThan(String value) {
            addCriterion("VERYFY_URL >", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VERYFY_URL >=", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlLessThan(String value) {
            addCriterion("VERYFY_URL <", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlLessThanOrEqualTo(String value) {
            addCriterion("VERYFY_URL <=", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlLike(String value) {
            addCriterion("VERYFY_URL like", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlNotLike(String value) {
            addCriterion("VERYFY_URL not like", value, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlIn(List<String> values) {
            addCriterion("VERYFY_URL in", values, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlNotIn(List<String> values) {
            addCriterion("VERYFY_URL not in", values, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlBetween(String value1, String value2) {
            addCriterion("VERYFY_URL between", value1, value2, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andVeryfyUrlNotBetween(String value1, String value2) {
            addCriterion("VERYFY_URL not between", value1, value2, "veryfyUrl");
            return (Criteria) this;
        }

        public Criteria andTransportIsNull() {
            addCriterion("TRANSPORT is null");
            return (Criteria) this;
        }

        public Criteria andTransportIsNotNull() {
            addCriterion("TRANSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEqualTo(String value) {
            addCriterion("TRANSPORT =", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotEqualTo(String value) {
            addCriterion("TRANSPORT <>", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThan(String value) {
            addCriterion("TRANSPORT >", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT >=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThan(String value) {
            addCriterion("TRANSPORT <", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT <=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLike(String value) {
            addCriterion("TRANSPORT like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotLike(String value) {
            addCriterion("TRANSPORT not like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportIn(List<String> values) {
            addCriterion("TRANSPORT in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotIn(List<String> values) {
            addCriterion("TRANSPORT not in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportBetween(String value1, String value2) {
            addCriterion("TRANSPORT between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT not between", value1, value2, "transport");
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

        public Criteria andDefaultLoginIsNull() {
            addCriterion("DEFAULT_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginIsNotNull() {
            addCriterion("DEFAULT_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginEqualTo(String value) {
            addCriterion("DEFAULT_LOGIN =", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginNotEqualTo(String value) {
            addCriterion("DEFAULT_LOGIN <>", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginGreaterThan(String value) {
            addCriterion("DEFAULT_LOGIN >", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_LOGIN >=", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginLessThan(String value) {
            addCriterion("DEFAULT_LOGIN <", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_LOGIN <=", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginLike(String value) {
            addCriterion("DEFAULT_LOGIN like", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginNotLike(String value) {
            addCriterion("DEFAULT_LOGIN not like", value, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginIn(List<String> values) {
            addCriterion("DEFAULT_LOGIN in", values, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginNotIn(List<String> values) {
            addCriterion("DEFAULT_LOGIN not in", values, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginBetween(String value1, String value2) {
            addCriterion("DEFAULT_LOGIN between", value1, value2, "defaultLogin");
            return (Criteria) this;
        }

        public Criteria andDefaultLoginNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_LOGIN not between", value1, value2, "defaultLogin");
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

        public Criteria andPosidIsNull() {
            addCriterion("POSID is null");
            return (Criteria) this;
        }

        public Criteria andPosidIsNotNull() {
            addCriterion("POSID is not null");
            return (Criteria) this;
        }

        public Criteria andPosidEqualTo(String value) {
            addCriterion("POSID =", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotEqualTo(String value) {
            addCriterion("POSID <>", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThan(String value) {
            addCriterion("POSID >", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThanOrEqualTo(String value) {
            addCriterion("POSID >=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThan(String value) {
            addCriterion("POSID <", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThanOrEqualTo(String value) {
            addCriterion("POSID <=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLike(String value) {
            addCriterion("POSID like", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotLike(String value) {
            addCriterion("POSID not like", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidIn(List<String> values) {
            addCriterion("POSID in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotIn(List<String> values) {
            addCriterion("POSID not in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidBetween(String value1, String value2) {
            addCriterion("POSID between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotBetween(String value1, String value2) {
            addCriterion("POSID not between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlIsNull() {
            addCriterion("MOBILE_REQUEST_URL is null");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlIsNotNull() {
            addCriterion("MOBILE_REQUEST_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlEqualTo(String value) {
            addCriterion("MOBILE_REQUEST_URL =", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlNotEqualTo(String value) {
            addCriterion("MOBILE_REQUEST_URL <>", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlGreaterThan(String value) {
            addCriterion("MOBILE_REQUEST_URL >", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_REQUEST_URL >=", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlLessThan(String value) {
            addCriterion("MOBILE_REQUEST_URL <", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_REQUEST_URL <=", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlLike(String value) {
            addCriterion("MOBILE_REQUEST_URL like", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlNotLike(String value) {
            addCriterion("MOBILE_REQUEST_URL not like", value, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlIn(List<String> values) {
            addCriterion("MOBILE_REQUEST_URL in", values, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlNotIn(List<String> values) {
            addCriterion("MOBILE_REQUEST_URL not in", values, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlBetween(String value1, String value2) {
            addCriterion("MOBILE_REQUEST_URL between", value1, value2, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andMobileRequestUrlNotBetween(String value1, String value2) {
            addCriterion("MOBILE_REQUEST_URL not between", value1, value2, "mobileRequestUrl");
            return (Criteria) this;
        }

        public Criteria andContractidIsNull() {
            addCriterion("CONTRACTID is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("CONTRACTID is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("CONTRACTID =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("CONTRACTID <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("CONTRACTID >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTID >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("CONTRACTID <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTID <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("CONTRACTID like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("CONTRACTID not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("CONTRACTID in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("CONTRACTID not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("CONTRACTID between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("CONTRACTID not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TYPENAME =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TYPENAME <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TYPENAME >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENAME >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TYPENAME <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TYPENAME <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TYPENAME like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TYPENAME not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TYPENAME in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TYPENAME not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TYPENAME between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TYPENAME not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
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

        public Criteria andSingleMaxamountIsNull() {
            addCriterion("SINGLE_MAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountIsNotNull() {
            addCriterion("SINGLE_MAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountEqualTo(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT =", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountNotEqualTo(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT <>", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountGreaterThan(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT >", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT >=", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountLessThan(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT <", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SINGLE_MAXAMOUNT <=", value, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountIn(List<BigDecimal> values) {
            addCriterion("SINGLE_MAXAMOUNT in", values, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountNotIn(List<BigDecimal> values) {
            addCriterion("SINGLE_MAXAMOUNT not in", values, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SINGLE_MAXAMOUNT between", value1, value2, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SINGLE_MAXAMOUNT not between", value1, value2, "singleMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountIsNull() {
            addCriterion("PACKET_MAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountIsNotNull() {
            addCriterion("PACKET_MAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT =", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountNotEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT <>", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountGreaterThan(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT >", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT >=", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountLessThan(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT <", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXAMOUNT <=", value, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountIn(List<BigDecimal> values) {
            addCriterion("PACKET_MAXAMOUNT in", values, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountNotIn(List<BigDecimal> values) {
            addCriterion("PACKET_MAXAMOUNT not in", values, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKET_MAXAMOUNT between", value1, value2, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKET_MAXAMOUNT not between", value1, value2, "packetMaxamount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountIsNull() {
            addCriterion("PACKET_MAXCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountIsNotNull() {
            addCriterion("PACKET_MAXCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT =", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountNotEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT <>", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountGreaterThan(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT >", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT >=", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountLessThan(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT <", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKET_MAXCOUNT <=", value, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountIn(List<BigDecimal> values) {
            addCriterion("PACKET_MAXCOUNT in", values, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountNotIn(List<BigDecimal> values) {
            addCriterion("PACKET_MAXCOUNT not in", values, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKET_MAXCOUNT between", value1, value2, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andPacketMaxcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKET_MAXCOUNT not between", value1, value2, "packetMaxcount");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultIsNull() {
            addCriterion("IFCHECKRESULT is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultIsNotNull() {
            addCriterion("IFCHECKRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultEqualTo(String value) {
            addCriterion("IFCHECKRESULT =", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultNotEqualTo(String value) {
            addCriterion("IFCHECKRESULT <>", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultGreaterThan(String value) {
            addCriterion("IFCHECKRESULT >", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECKRESULT >=", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultLessThan(String value) {
            addCriterion("IFCHECKRESULT <", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultLessThanOrEqualTo(String value) {
            addCriterion("IFCHECKRESULT <=", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultLike(String value) {
            addCriterion("IFCHECKRESULT like", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultNotLike(String value) {
            addCriterion("IFCHECKRESULT not like", value, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultIn(List<String> values) {
            addCriterion("IFCHECKRESULT in", values, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultNotIn(List<String> values) {
            addCriterion("IFCHECKRESULT not in", values, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultBetween(String value1, String value2) {
            addCriterion("IFCHECKRESULT between", value1, value2, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andIfcheckresultNotBetween(String value1, String value2) {
            addCriterion("IFCHECKRESULT not between", value1, value2, "ifcheckresult");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlIsNull() {
            addCriterion("TXCODEURL is null");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlIsNotNull() {
            addCriterion("TXCODEURL is not null");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlEqualTo(String value) {
            addCriterion("TXCODEURL =", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlNotEqualTo(String value) {
            addCriterion("TXCODEURL <>", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlGreaterThan(String value) {
            addCriterion("TXCODEURL >", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlGreaterThanOrEqualTo(String value) {
            addCriterion("TXCODEURL >=", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlLessThan(String value) {
            addCriterion("TXCODEURL <", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlLessThanOrEqualTo(String value) {
            addCriterion("TXCODEURL <=", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlLike(String value) {
            addCriterion("TXCODEURL like", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlNotLike(String value) {
            addCriterion("TXCODEURL not like", value, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlIn(List<String> values) {
            addCriterion("TXCODEURL in", values, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlNotIn(List<String> values) {
            addCriterion("TXCODEURL not in", values, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlBetween(String value1, String value2) {
            addCriterion("TXCODEURL between", value1, value2, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxcodeurlNotBetween(String value1, String value2) {
            addCriterion("TXCODEURL not between", value1, value2, "txcodeurl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlIsNull() {
            addCriterion("TXREDIRECTURL is null");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlIsNotNull() {
            addCriterion("TXREDIRECTURL is not null");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlEqualTo(String value) {
            addCriterion("TXREDIRECTURL =", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlNotEqualTo(String value) {
            addCriterion("TXREDIRECTURL <>", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlGreaterThan(String value) {
            addCriterion("TXREDIRECTURL >", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlGreaterThanOrEqualTo(String value) {
            addCriterion("TXREDIRECTURL >=", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlLessThan(String value) {
            addCriterion("TXREDIRECTURL <", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlLessThanOrEqualTo(String value) {
            addCriterion("TXREDIRECTURL <=", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlLike(String value) {
            addCriterion("TXREDIRECTURL like", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlNotLike(String value) {
            addCriterion("TXREDIRECTURL not like", value, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlIn(List<String> values) {
            addCriterion("TXREDIRECTURL in", values, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlNotIn(List<String> values) {
            addCriterion("TXREDIRECTURL not in", values, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlBetween(String value1, String value2) {
            addCriterion("TXREDIRECTURL between", value1, value2, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxredirecturlNotBetween(String value1, String value2) {
            addCriterion("TXREDIRECTURL not between", value1, value2, "txredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlIsNull() {
            addCriterion("TXAUTHURL is null");
            return (Criteria) this;
        }

        public Criteria andTxauthurlIsNotNull() {
            addCriterion("TXAUTHURL is not null");
            return (Criteria) this;
        }

        public Criteria andTxauthurlEqualTo(String value) {
            addCriterion("TXAUTHURL =", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlNotEqualTo(String value) {
            addCriterion("TXAUTHURL <>", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlGreaterThan(String value) {
            addCriterion("TXAUTHURL >", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlGreaterThanOrEqualTo(String value) {
            addCriterion("TXAUTHURL >=", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlLessThan(String value) {
            addCriterion("TXAUTHURL <", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlLessThanOrEqualTo(String value) {
            addCriterion("TXAUTHURL <=", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlLike(String value) {
            addCriterion("TXAUTHURL like", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlNotLike(String value) {
            addCriterion("TXAUTHURL not like", value, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlIn(List<String> values) {
            addCriterion("TXAUTHURL in", values, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlNotIn(List<String> values) {
            addCriterion("TXAUTHURL not in", values, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlBetween(String value1, String value2) {
            addCriterion("TXAUTHURL between", value1, value2, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthurlNotBetween(String value1, String value2) {
            addCriterion("TXAUTHURL not between", value1, value2, "txauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlIsNull() {
            addCriterion("TXUSERAUTHURL is null");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlIsNotNull() {
            addCriterion("TXUSERAUTHURL is not null");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlEqualTo(String value) {
            addCriterion("TXUSERAUTHURL =", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlNotEqualTo(String value) {
            addCriterion("TXUSERAUTHURL <>", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlGreaterThan(String value) {
            addCriterion("TXUSERAUTHURL >", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlGreaterThanOrEqualTo(String value) {
            addCriterion("TXUSERAUTHURL >=", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlLessThan(String value) {
            addCriterion("TXUSERAUTHURL <", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlLessThanOrEqualTo(String value) {
            addCriterion("TXUSERAUTHURL <=", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlLike(String value) {
            addCriterion("TXUSERAUTHURL like", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlNotLike(String value) {
            addCriterion("TXUSERAUTHURL not like", value, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlIn(List<String> values) {
            addCriterion("TXUSERAUTHURL in", values, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlNotIn(List<String> values) {
            addCriterion("TXUSERAUTHURL not in", values, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlBetween(String value1, String value2) {
            addCriterion("TXUSERAUTHURL between", value1, value2, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxuserauthurlNotBetween(String value1, String value2) {
            addCriterion("TXUSERAUTHURL not between", value1, value2, "txuserauthurl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlIsNull() {
            addCriterion("TXAUTHREDIRECTURL is null");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlIsNotNull() {
            addCriterion("TXAUTHREDIRECTURL is not null");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlEqualTo(String value) {
            addCriterion("TXAUTHREDIRECTURL =", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlNotEqualTo(String value) {
            addCriterion("TXAUTHREDIRECTURL <>", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlGreaterThan(String value) {
            addCriterion("TXAUTHREDIRECTURL >", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlGreaterThanOrEqualTo(String value) {
            addCriterion("TXAUTHREDIRECTURL >=", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlLessThan(String value) {
            addCriterion("TXAUTHREDIRECTURL <", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlLessThanOrEqualTo(String value) {
            addCriterion("TXAUTHREDIRECTURL <=", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlLike(String value) {
            addCriterion("TXAUTHREDIRECTURL like", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlNotLike(String value) {
            addCriterion("TXAUTHREDIRECTURL not like", value, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlIn(List<String> values) {
            addCriterion("TXAUTHREDIRECTURL in", values, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlNotIn(List<String> values) {
            addCriterion("TXAUTHREDIRECTURL not in", values, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlBetween(String value1, String value2) {
            addCriterion("TXAUTHREDIRECTURL between", value1, value2, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andTxauthredirecturlNotBetween(String value1, String value2) {
            addCriterion("TXAUTHREDIRECTURL not between", value1, value2, "txauthredirecturl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlIsNull() {
            addCriterion("WXAUTH_JSAPIURL is null");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlIsNotNull() {
            addCriterion("WXAUTH_JSAPIURL is not null");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlEqualTo(String value) {
            addCriterion("WXAUTH_JSAPIURL =", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlNotEqualTo(String value) {
            addCriterion("WXAUTH_JSAPIURL <>", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlGreaterThan(String value) {
            addCriterion("WXAUTH_JSAPIURL >", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlGreaterThanOrEqualTo(String value) {
            addCriterion("WXAUTH_JSAPIURL >=", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlLessThan(String value) {
            addCriterion("WXAUTH_JSAPIURL <", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlLessThanOrEqualTo(String value) {
            addCriterion("WXAUTH_JSAPIURL <=", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlLike(String value) {
            addCriterion("WXAUTH_JSAPIURL like", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlNotLike(String value) {
            addCriterion("WXAUTH_JSAPIURL not like", value, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlIn(List<String> values) {
            addCriterion("WXAUTH_JSAPIURL in", values, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlNotIn(List<String> values) {
            addCriterion("WXAUTH_JSAPIURL not in", values, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlBetween(String value1, String value2) {
            addCriterion("WXAUTH_JSAPIURL between", value1, value2, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andWxauthJsapiurlNotBetween(String value1, String value2) {
            addCriterion("WXAUTH_JSAPIURL not between", value1, value2, "wxauthJsapiurl");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2IsNull() {
            addCriterion("REQUEST_URL2 is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2IsNotNull() {
            addCriterion("REQUEST_URL2 is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2EqualTo(String value) {
            addCriterion("REQUEST_URL2 =", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2NotEqualTo(String value) {
            addCriterion("REQUEST_URL2 <>", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2GreaterThan(String value) {
            addCriterion("REQUEST_URL2 >", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL2 >=", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2LessThan(String value) {
            addCriterion("REQUEST_URL2 <", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2LessThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL2 <=", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2Like(String value) {
            addCriterion("REQUEST_URL2 like", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2NotLike(String value) {
            addCriterion("REQUEST_URL2 not like", value, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2In(List<String> values) {
            addCriterion("REQUEST_URL2 in", values, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2NotIn(List<String> values) {
            addCriterion("REQUEST_URL2 not in", values, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2Between(String value1, String value2) {
            addCriterion("REQUEST_URL2 between", value1, value2, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andRequestUrl2NotBetween(String value1, String value2) {
            addCriterion("REQUEST_URL2 not between", value1, value2, "requestUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlIsNull() {
            addCriterion("ORDERQUERY_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlIsNotNull() {
            addCriterion("ORDERQUERY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlEqualTo(String value) {
            addCriterion("ORDERQUERY_URL =", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlNotEqualTo(String value) {
            addCriterion("ORDERQUERY_URL <>", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlGreaterThan(String value) {
            addCriterion("ORDERQUERY_URL >", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERQUERY_URL >=", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlLessThan(String value) {
            addCriterion("ORDERQUERY_URL <", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDERQUERY_URL <=", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlLike(String value) {
            addCriterion("ORDERQUERY_URL like", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlNotLike(String value) {
            addCriterion("ORDERQUERY_URL not like", value, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlIn(List<String> values) {
            addCriterion("ORDERQUERY_URL in", values, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlNotIn(List<String> values) {
            addCriterion("ORDERQUERY_URL not in", values, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlBetween(String value1, String value2) {
            addCriterion("ORDERQUERY_URL between", value1, value2, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrlNotBetween(String value1, String value2) {
            addCriterion("ORDERQUERY_URL not between", value1, value2, "orderqueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2IsNull() {
            addCriterion("ORDERQUERY_URL2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2IsNotNull() {
            addCriterion("ORDERQUERY_URL2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2EqualTo(String value) {
            addCriterion("ORDERQUERY_URL2 =", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2NotEqualTo(String value) {
            addCriterion("ORDERQUERY_URL2 <>", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2GreaterThan(String value) {
            addCriterion("ORDERQUERY_URL2 >", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("ORDERQUERY_URL2 >=", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2LessThan(String value) {
            addCriterion("ORDERQUERY_URL2 <", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2LessThanOrEqualTo(String value) {
            addCriterion("ORDERQUERY_URL2 <=", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2Like(String value) {
            addCriterion("ORDERQUERY_URL2 like", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2NotLike(String value) {
            addCriterion("ORDERQUERY_URL2 not like", value, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2In(List<String> values) {
            addCriterion("ORDERQUERY_URL2 in", values, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2NotIn(List<String> values) {
            addCriterion("ORDERQUERY_URL2 not in", values, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2Between(String value1, String value2) {
            addCriterion("ORDERQUERY_URL2 between", value1, value2, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andOrderqueryUrl2NotBetween(String value1, String value2) {
            addCriterion("ORDERQUERY_URL2 not between", value1, value2, "orderqueryUrl2");
            return (Criteria) this;
        }

        public Criteria andCheckkeyIsNull() {
            addCriterion("CHECKKEY is null");
            return (Criteria) this;
        }

        public Criteria andCheckkeyIsNotNull() {
            addCriterion("CHECKKEY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckkeyEqualTo(String value) {
            addCriterion("CHECKKEY =", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyNotEqualTo(String value) {
            addCriterion("CHECKKEY <>", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyGreaterThan(String value) {
            addCriterion("CHECKKEY >", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKKEY >=", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyLessThan(String value) {
            addCriterion("CHECKKEY <", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyLessThanOrEqualTo(String value) {
            addCriterion("CHECKKEY <=", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyLike(String value) {
            addCriterion("CHECKKEY like", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyNotLike(String value) {
            addCriterion("CHECKKEY not like", value, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyIn(List<String> values) {
            addCriterion("CHECKKEY in", values, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyNotIn(List<String> values) {
            addCriterion("CHECKKEY not in", values, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyBetween(String value1, String value2) {
            addCriterion("CHECKKEY between", value1, value2, "checkkey");
            return (Criteria) this;
        }

        public Criteria andCheckkeyNotBetween(String value1, String value2) {
            addCriterion("CHECKKEY not between", value1, value2, "checkkey");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("APPSECRET is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("APPSECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("APPSECRET =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("APPSECRET <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("APPSECRET >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("APPSECRET >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("APPSECRET <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("APPSECRET <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("APPSECRET like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("APPSECRET not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("APPSECRET in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("APPSECRET not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("APPSECRET between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("APPSECRET not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlIsNull() {
            addCriterion("ORDERCLOSE_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlIsNotNull() {
            addCriterion("ORDERCLOSE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlEqualTo(String value) {
            addCriterion("ORDERCLOSE_URL =", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlNotEqualTo(String value) {
            addCriterion("ORDERCLOSE_URL <>", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlGreaterThan(String value) {
            addCriterion("ORDERCLOSE_URL >", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERCLOSE_URL >=", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlLessThan(String value) {
            addCriterion("ORDERCLOSE_URL <", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDERCLOSE_URL <=", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlLike(String value) {
            addCriterion("ORDERCLOSE_URL like", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlNotLike(String value) {
            addCriterion("ORDERCLOSE_URL not like", value, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlIn(List<String> values) {
            addCriterion("ORDERCLOSE_URL in", values, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlNotIn(List<String> values) {
            addCriterion("ORDERCLOSE_URL not in", values, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlBetween(String value1, String value2) {
            addCriterion("ORDERCLOSE_URL between", value1, value2, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andOrdercloseUrlNotBetween(String value1, String value2) {
            addCriterion("ORDERCLOSE_URL not between", value1, value2, "ordercloseUrl");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("TID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("TID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andInstmidIsNull() {
            addCriterion("INSTMID is null");
            return (Criteria) this;
        }

        public Criteria andInstmidIsNotNull() {
            addCriterion("INSTMID is not null");
            return (Criteria) this;
        }

        public Criteria andInstmidEqualTo(String value) {
            addCriterion("INSTMID =", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidNotEqualTo(String value) {
            addCriterion("INSTMID <>", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidGreaterThan(String value) {
            addCriterion("INSTMID >", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidGreaterThanOrEqualTo(String value) {
            addCriterion("INSTMID >=", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidLessThan(String value) {
            addCriterion("INSTMID <", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidLessThanOrEqualTo(String value) {
            addCriterion("INSTMID <=", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidLike(String value) {
            addCriterion("INSTMID like", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidNotLike(String value) {
            addCriterion("INSTMID not like", value, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidIn(List<String> values) {
            addCriterion("INSTMID in", values, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidNotIn(List<String> values) {
            addCriterion("INSTMID not in", values, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidBetween(String value1, String value2) {
            addCriterion("INSTMID between", value1, value2, "instmid");
            return (Criteria) this;
        }

        public Criteria andInstmidNotBetween(String value1, String value2) {
            addCriterion("INSTMID not between", value1, value2, "instmid");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceIsNull() {
            addCriterion("FIXINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceIsNotNull() {
            addCriterion("FIXINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceEqualTo(String value) {
            addCriterion("FIXINSURANCE =", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceNotEqualTo(String value) {
            addCriterion("FIXINSURANCE <>", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceGreaterThan(String value) {
            addCriterion("FIXINSURANCE >", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("FIXINSURANCE >=", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceLessThan(String value) {
            addCriterion("FIXINSURANCE <", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceLessThanOrEqualTo(String value) {
            addCriterion("FIXINSURANCE <=", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceLike(String value) {
            addCriterion("FIXINSURANCE like", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceNotLike(String value) {
            addCriterion("FIXINSURANCE not like", value, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceIn(List<String> values) {
            addCriterion("FIXINSURANCE in", values, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceNotIn(List<String> values) {
            addCriterion("FIXINSURANCE not in", values, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceBetween(String value1, String value2) {
            addCriterion("FIXINSURANCE between", value1, value2, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andFixinsuranceNotBetween(String value1, String value2) {
            addCriterion("FIXINSURANCE not between", value1, value2, "fixinsurance");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIsNull() {
            addCriterion("AUTHORIZATION is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIsNotNull() {
            addCriterion("AUTHORIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationEqualTo(String value) {
            addCriterion("AUTHORIZATION =", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotEqualTo(String value) {
            addCriterion("AUTHORIZATION <>", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationGreaterThan(String value) {
            addCriterion("AUTHORIZATION >", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION >=", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationLessThan(String value) {
            addCriterion("AUTHORIZATION <", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION <=", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationLike(String value) {
            addCriterion("AUTHORIZATION like", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotLike(String value) {
            addCriterion("AUTHORIZATION not like", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIn(List<String> values) {
            addCriterion("AUTHORIZATION in", values, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotIn(List<String> values) {
            addCriterion("AUTHORIZATION not in", values, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION between", value1, value2, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION not between", value1, value2, "authorization");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidIsNull() {
            addCriterion("MSGSRCID is null");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidIsNotNull() {
            addCriterion("MSGSRCID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidEqualTo(String value) {
            addCriterion("MSGSRCID =", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidNotEqualTo(String value) {
            addCriterion("MSGSRCID <>", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidGreaterThan(String value) {
            addCriterion("MSGSRCID >", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidGreaterThanOrEqualTo(String value) {
            addCriterion("MSGSRCID >=", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidLessThan(String value) {
            addCriterion("MSGSRCID <", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidLessThanOrEqualTo(String value) {
            addCriterion("MSGSRCID <=", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidLike(String value) {
            addCriterion("MSGSRCID like", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidNotLike(String value) {
            addCriterion("MSGSRCID not like", value, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidIn(List<String> values) {
            addCriterion("MSGSRCID in", values, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidNotIn(List<String> values) {
            addCriterion("MSGSRCID not in", values, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidBetween(String value1, String value2) {
            addCriterion("MSGSRCID between", value1, value2, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMsgsrcidNotBetween(String value1, String value2) {
            addCriterion("MSGSRCID not between", value1, value2, "msgsrcid");
            return (Criteria) this;
        }

        public Criteria andMchCertIsNull() {
            addCriterion("MCH_CERT is null");
            return (Criteria) this;
        }

        public Criteria andMchCertIsNotNull() {
            addCriterion("MCH_CERT is not null");
            return (Criteria) this;
        }

        public Criteria andMchCertEqualTo(String value) {
            addCriterion("MCH_CERT =", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertNotEqualTo(String value) {
            addCriterion("MCH_CERT <>", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertGreaterThan(String value) {
            addCriterion("MCH_CERT >", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertGreaterThanOrEqualTo(String value) {
            addCriterion("MCH_CERT >=", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertLessThan(String value) {
            addCriterion("MCH_CERT <", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertLessThanOrEqualTo(String value) {
            addCriterion("MCH_CERT <=", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertLike(String value) {
            addCriterion("MCH_CERT like", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertNotLike(String value) {
            addCriterion("MCH_CERT not like", value, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertIn(List<String> values) {
            addCriterion("MCH_CERT in", values, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertNotIn(List<String> values) {
            addCriterion("MCH_CERT not in", values, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertBetween(String value1, String value2) {
            addCriterion("MCH_CERT between", value1, value2, "mchCert");
            return (Criteria) this;
        }

        public Criteria andMchCertNotBetween(String value1, String value2) {
            addCriterion("MCH_CERT not between", value1, value2, "mchCert");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlIsNull() {
            addCriterion("PAY_PAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlIsNotNull() {
            addCriterion("PAY_PAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlEqualTo(String value) {
            addCriterion("PAY_PAGE_URL =", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlNotEqualTo(String value) {
            addCriterion("PAY_PAGE_URL <>", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlGreaterThan(String value) {
            addCriterion("PAY_PAGE_URL >", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PAGE_URL >=", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlLessThan(String value) {
            addCriterion("PAY_PAGE_URL <", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_PAGE_URL <=", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlLike(String value) {
            addCriterion("PAY_PAGE_URL like", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlNotLike(String value) {
            addCriterion("PAY_PAGE_URL not like", value, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlIn(List<String> values) {
            addCriterion("PAY_PAGE_URL in", values, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlNotIn(List<String> values) {
            addCriterion("PAY_PAGE_URL not in", values, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlBetween(String value1, String value2) {
            addCriterion("PAY_PAGE_URL between", value1, value2, "payPageUrl");
            return (Criteria) this;
        }

        public Criteria andPayPageUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_PAGE_URL not between", value1, value2, "payPageUrl");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : d_bankgateway
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
     * @Table : d_bankgateway
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