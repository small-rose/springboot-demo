package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPaymentsaleTempExample {
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
    public MmPaymentsaleTempExample() {
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
     * @Table : mm_paymentsale_temp
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

        public Criteria andSeqhandoverIsNull() {
            addCriterion("SEQHANDOVER is null");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverIsNotNull() {
            addCriterion("SEQHANDOVER is not null");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverEqualTo(String value) {
            addCriterion("SEQHANDOVER =", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotEqualTo(String value) {
            addCriterion("SEQHANDOVER <>", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverGreaterThan(String value) {
            addCriterion("SEQHANDOVER >", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverGreaterThanOrEqualTo(String value) {
            addCriterion("SEQHANDOVER >=", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverLessThan(String value) {
            addCriterion("SEQHANDOVER <", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverLessThanOrEqualTo(String value) {
            addCriterion("SEQHANDOVER <=", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverLike(String value) {
            addCriterion("SEQHANDOVER like", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotLike(String value) {
            addCriterion("SEQHANDOVER not like", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverIn(List<String> values) {
            addCriterion("SEQHANDOVER in", values, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotIn(List<String> values) {
            addCriterion("SEQHANDOVER not in", values, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverBetween(String value1, String value2) {
            addCriterion("SEQHANDOVER between", value1, value2, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotBetween(String value1, String value2) {
            addCriterion("SEQHANDOVER not between", value1, value2, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNull() {
            addCriterion("APPLYDATAID is null");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNotNull() {
            addCriterion("APPLYDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andApplydataidEqualTo(String value) {
            addCriterion("APPLYDATAID =", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotEqualTo(String value) {
            addCriterion("APPLYDATAID <>", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThan(String value) {
            addCriterion("APPLYDATAID >", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID >=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThan(String value) {
            addCriterion("APPLYDATAID <", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID <=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLike(String value) {
            addCriterion("APPLYDATAID like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotLike(String value) {
            addCriterion("APPLYDATAID not like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidIn(List<String> values) {
            addCriterion("APPLYDATAID in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotIn(List<String> values) {
            addCriterion("APPLYDATAID not in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidBetween(String value1, String value2) {
            addCriterion("APPLYDATAID between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotBetween(String value1, String value2) {
            addCriterion("APPLYDATAID not between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNull() {
            addCriterion("NEWNO is null");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNotNull() {
            addCriterion("NEWNO is not null");
            return (Criteria) this;
        }

        public Criteria andNewnoEqualTo(Long value) {
            addCriterion("NEWNO =", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotEqualTo(Long value) {
            addCriterion("NEWNO <>", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThan(Long value) {
            addCriterion("NEWNO >", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWNO >=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThan(Long value) {
            addCriterion("NEWNO <", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThanOrEqualTo(Long value) {
            addCriterion("NEWNO <=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoIn(List<Long> values) {
            addCriterion("NEWNO in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotIn(List<Long> values) {
            addCriterion("NEWNO not in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoBetween(Long value1, Long value2) {
            addCriterion("NEWNO between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotBetween(Long value1, Long value2) {
            addCriterion("NEWNO not between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNull() {
            addCriterion("SETTLEMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("SETTLEMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENTNO =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENTNO <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(BigDecimal value) {
            addCriterion("SETTLEMENTNO >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENTNO >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(BigDecimal value) {
            addCriterion("SETTLEMENTNO <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENTNO <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENTNO in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENTNO not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENTNO between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENTNO not between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andMergeidIsNull() {
            addCriterion("MERGEID is null");
            return (Criteria) this;
        }

        public Criteria andMergeidIsNotNull() {
            addCriterion("MERGEID is not null");
            return (Criteria) this;
        }

        public Criteria andMergeidEqualTo(String value) {
            addCriterion("MERGEID =", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotEqualTo(String value) {
            addCriterion("MERGEID <>", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidGreaterThan(String value) {
            addCriterion("MERGEID >", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidGreaterThanOrEqualTo(String value) {
            addCriterion("MERGEID >=", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLessThan(String value) {
            addCriterion("MERGEID <", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLessThanOrEqualTo(String value) {
            addCriterion("MERGEID <=", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLike(String value) {
            addCriterion("MERGEID like", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotLike(String value) {
            addCriterion("MERGEID not like", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidIn(List<String> values) {
            addCriterion("MERGEID in", values, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotIn(List<String> values) {
            addCriterion("MERGEID not in", values, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidBetween(String value1, String value2) {
            addCriterion("MERGEID between", value1, value2, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotBetween(String value1, String value2) {
            addCriterion("MERGEID not between", value1, value2, "mergeid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNull() {
            addCriterion("PLATFORMID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("PLATFORMID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(String value) {
            addCriterion("PLATFORMID =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(String value) {
            addCriterion("PLATFORMID <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(String value) {
            addCriterion("PLATFORMID >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMID >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(String value) {
            addCriterion("PLATFORMID <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMID <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLike(String value) {
            addCriterion("PLATFORMID like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotLike(String value) {
            addCriterion("PLATFORMID not like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<String> values) {
            addCriterion("PLATFORMID in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<String> values) {
            addCriterion("PLATFORMID not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(String value1, String value2) {
            addCriterion("PLATFORMID between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(String value1, String value2) {
            addCriterion("PLATFORMID not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIsNull() {
            addCriterion("MMACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIsNotNull() {
            addCriterion("MMACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID =", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID <>", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThan(BigDecimal value) {
            addCriterion("MMACCOUNTID >", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID >=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThan(BigDecimal value) {
            addCriterion("MMACCOUNTID <", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID <=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIn(List<BigDecimal> values) {
            addCriterion("MMACCOUNTID in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotIn(List<BigDecimal> values) {
            addCriterion("MMACCOUNTID not in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMACCOUNTID between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMACCOUNTID not between", value1, value2, "mmaccountid");
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

        public Criteria andAccountaccattributeIsNull() {
            addCriterion("ACCOUNTACCATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeIsNotNull() {
            addCriterion("ACCOUNTACCATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeEqualTo(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE =", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeNotEqualTo(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE <>", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeGreaterThan(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE >", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE >=", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeLessThan(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE <", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE <=", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeLike(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE like", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeNotLike(String value) {
            addCriterion("ACCOUNTACCATTRIBUTE not like", value, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeIn(List<String> values) {
            addCriterion("ACCOUNTACCATTRIBUTE in", values, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeNotIn(List<String> values) {
            addCriterion("ACCOUNTACCATTRIBUTE not in", values, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeBetween(String value1, String value2) {
            addCriterion("ACCOUNTACCATTRIBUTE between", value1, value2, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andAccountaccattributeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTACCATTRIBUTE not between", value1, value2, "accountaccattribute");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIsNull() {
            addCriterion("FROMUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIsNotNull() {
            addCriterion("FROMUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeEqualTo(String value) {
            addCriterion("FROMUNITCODE =", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotEqualTo(String value) {
            addCriterion("FROMUNITCODE <>", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThan(String value) {
            addCriterion("FROMUNITCODE >", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE >=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThan(String value) {
            addCriterion("FROMUNITCODE <", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE <=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLike(String value) {
            addCriterion("FROMUNITCODE like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotLike(String value) {
            addCriterion("FROMUNITCODE not like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIn(List<String> values) {
            addCriterion("FROMUNITCODE in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotIn(List<String> values) {
            addCriterion("FROMUNITCODE not in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE not between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("DATATYPE =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("DATATYPE <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("DATATYPE >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("DATATYPE <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("DATATYPE like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("DATATYPE not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("DATATYPE in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("DATATYPE not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("DATATYPE between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("DATATYPE not between", value1, value2, "datatype");
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

        public Criteria andTosubcompanyIsNull() {
            addCriterion("TOSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIsNotNull() {
            addCriterion("TOSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyEqualTo(String value) {
            addCriterion("TOSUBCOMPANY =", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <>", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThan(String value) {
            addCriterion("TOSUBCOMPANY >", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY >=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThan(String value) {
            addCriterion("TOSUBCOMPANY <", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLike(String value) {
            addCriterion("TOSUBCOMPANY like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotLike(String value) {
            addCriterion("TOSUBCOMPANY not like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIn(List<String> values) {
            addCriterion("TOSUBCOMPANY in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotIn(List<String> values) {
            addCriterion("TOSUBCOMPANY not in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY between", value1, value2, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY not between", value1, value2, "tosubcompany");
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

        public Criteria andReturnnoIsNull() {
            addCriterion("RETURNNO is null");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNotNull() {
            addCriterion("RETURNNO is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnoEqualTo(String value) {
            addCriterion("RETURNNO =", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotEqualTo(String value) {
            addCriterion("RETURNNO <>", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThan(String value) {
            addCriterion("RETURNNO >", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNNO >=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThan(String value) {
            addCriterion("RETURNNO <", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThanOrEqualTo(String value) {
            addCriterion("RETURNNO <=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLike(String value) {
            addCriterion("RETURNNO like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotLike(String value) {
            addCriterion("RETURNNO not like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIn(List<String> values) {
            addCriterion("RETURNNO in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotIn(List<String> values) {
            addCriterion("RETURNNO not in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoBetween(String value1, String value2) {
            addCriterion("RETURNNO between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotBetween(String value1, String value2) {
            addCriterion("RETURNNO not between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("POLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("POLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("POLICYNO =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("POLICYNO <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("POLICYNO >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYNO >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("POLICYNO <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("POLICYNO <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("POLICYNO like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("POLICYNO not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("POLICYNO in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("POLICYNO not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("POLICYNO between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("POLICYNO not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("ENDORSENO is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("ENDORSENO is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("ENDORSENO =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("ENDORSENO <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("ENDORSENO >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("ENDORSENO >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("ENDORSENO <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("ENDORSENO <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("ENDORSENO like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("ENDORSENO not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("ENDORSENO in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("ENDORSENO not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("ENDORSENO between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("ENDORSENO not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNull() {
            addCriterion("CLAIMNO is null");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNotNull() {
            addCriterion("CLAIMNO is not null");
            return (Criteria) this;
        }

        public Criteria andClaimnoEqualTo(String value) {
            addCriterion("CLAIMNO =", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotEqualTo(String value) {
            addCriterion("CLAIMNO <>", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThan(String value) {
            addCriterion("CLAIMNO >", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMNO >=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThan(String value) {
            addCriterion("CLAIMNO <", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThanOrEqualTo(String value) {
            addCriterion("CLAIMNO <=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLike(String value) {
            addCriterion("CLAIMNO like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotLike(String value) {
            addCriterion("CLAIMNO not like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIn(List<String> values) {
            addCriterion("CLAIMNO in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotIn(List<String> values) {
            addCriterion("CLAIMNO not in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoBetween(String value1, String value2) {
            addCriterion("CLAIMNO between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotBetween(String value1, String value2) {
            addCriterion("CLAIMNO not between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNull() {
            addCriterion("SUMMARYNO is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("SUMMARYNO is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("SUMMARYNO =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("SUMMARYNO <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("SUMMARYNO >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("SUMMARYNO <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("SUMMARYNO like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("SUMMARYNO not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("SUMMARYNO in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("SUMMARYNO not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("SUMMARYNO between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("SUMMARYNO not between", value1, value2, "summaryno");
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

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNull() {
            addCriterion("USEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("USEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("USEDAMOUNT >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("USEDAMOUNT <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT not between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNull() {
            addCriterion("HANDLEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNotNull() {
            addCriterion("HANDLEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandledamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT =", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <>", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT not in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT not between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("BASECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("BASECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("BASECURRENCYCODE =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("BASECURRENCYCODE >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("BASECURRENCYCODE <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("BASECURRENCYCODE like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("BASECURRENCYCODE not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("BASECURRENCYCODE in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("BASECURRENCYCODE not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("BASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("BASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("BASEAMOUNT >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("BASEAMOUNT <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNull() {
            addCriterion("BASEUSEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNotNull() {
            addCriterion("BASEUSEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT =", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <>", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThan(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT >", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT >=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThan(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIn(List<BigDecimal> values) {
            addCriterion("BASEUSEDAMOUNT in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEUSEDAMOUNT not in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEUSEDAMOUNT between", value1, value2, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEUSEDAMOUNT not between", value1, value2, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIsNull() {
            addCriterion("HANDLEDBASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIsNotNull() {
            addCriterion("HANDLEDBASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT =", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <>", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT >", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT >=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThan(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEDBASEAMOUNT in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEDBASEAMOUNT not in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDBASEAMOUNT between", value1, value2, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDBASEAMOUNT not between", value1, value2, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeIsNull() {
            addCriterion("ACCOUNTCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeIsNotNull() {
            addCriterion("ACCOUNTCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeEqualTo(String value) {
            addCriterion("ACCOUNTCURRENCYCODE =", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeNotEqualTo(String value) {
            addCriterion("ACCOUNTCURRENCYCODE <>", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeGreaterThan(String value) {
            addCriterion("ACCOUNTCURRENCYCODE >", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCURRENCYCODE >=", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeLessThan(String value) {
            addCriterion("ACCOUNTCURRENCYCODE <", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCURRENCYCODE <=", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeLike(String value) {
            addCriterion("ACCOUNTCURRENCYCODE like", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeNotLike(String value) {
            addCriterion("ACCOUNTCURRENCYCODE not like", value, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeIn(List<String> values) {
            addCriterion("ACCOUNTCURRENCYCODE in", values, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeNotIn(List<String> values) {
            addCriterion("ACCOUNTCURRENCYCODE not in", values, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeBetween(String value1, String value2) {
            addCriterion("ACCOUNTCURRENCYCODE between", value1, value2, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountcurrencycodeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTCURRENCYCODE not between", value1, value2, "accountcurrencycode");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNull() {
            addCriterion("ACCOUNTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("ACCOUNTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT not between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("CUSTOMERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("CUSTOMERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("CUSTOMERPARTYNO >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("CUSTOMERPARTYNO <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("CUSTOMERPARTYNO like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("CUSTOMERPARTYNO not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO not between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("DEPARTMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("DEPARTMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("DEPARTMENTCODE =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("DEPARTMENTCODE >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("DEPARTMENTCODE <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("DEPARTMENTCODE like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("DEPARTMENTCODE not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("DEPARTMENTCODE in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("DEPARTMENTCODE not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("DEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("DEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("DEPARTMENTNAME =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("DEPARTMENTNAME >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("DEPARTMENTNAME <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("DEPARTMENTNAME like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("DEPARTMENTNAME not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("DEPARTMENTNAME in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("DEPARTMENTNAME not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("AGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("AGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("AGENTCODE =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("AGENTCODE <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("AGENTCODE >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTCODE >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("AGENTCODE <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENTCODE <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("AGENTCODE like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("AGENTCODE not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("AGENTCODE in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("AGENTCODE not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("AGENTCODE between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("AGENTCODE not between", value1, value2, "agentcode");
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

        public Criteria andRisktypeIsNull() {
            addCriterion("RISKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("RISKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("RISKTYPE =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("RISKTYPE <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("RISKTYPE >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKTYPE >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("RISKTYPE <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("RISKTYPE <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("RISKTYPE like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("RISKTYPE not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("RISKTYPE in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("RISKTYPE not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("RISKTYPE between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("RISKTYPE not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNull() {
            addCriterion("CONFIRMSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNotNull() {
            addCriterion("CONFIRMSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO =", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <>", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThan(String value) {
            addCriterion("CONFIRMSEQUENCENO >", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO >=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThan(String value) {
            addCriterion("CONFIRMSEQUENCENO <", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLike(String value) {
            addCriterion("CONFIRMSEQUENCENO like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotLike(String value) {
            addCriterion("CONFIRMSEQUENCENO not like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO not in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO not between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNull() {
            addCriterion("INVOICECODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNotNull() {
            addCriterion("INVOICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeEqualTo(String value) {
            addCriterion("INVOICECODE =", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotEqualTo(String value) {
            addCriterion("INVOICECODE <>", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThan(String value) {
            addCriterion("INVOICECODE >", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICECODE >=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThan(String value) {
            addCriterion("INVOICECODE <", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICECODE <=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLike(String value) {
            addCriterion("INVOICECODE like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotLike(String value) {
            addCriterion("INVOICECODE not like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIn(List<String> values) {
            addCriterion("INVOICECODE in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotIn(List<String> values) {
            addCriterion("INVOICECODE not in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeBetween(String value1, String value2) {
            addCriterion("INVOICECODE between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotBetween(String value1, String value2) {
            addCriterion("INVOICECODE not between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitIsNull() {
            addCriterion("INVOICEDUNIT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitIsNotNull() {
            addCriterion("INVOICEDUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitEqualTo(String value) {
            addCriterion("INVOICEDUNIT =", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotEqualTo(String value) {
            addCriterion("INVOICEDUNIT <>", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitGreaterThan(String value) {
            addCriterion("INVOICEDUNIT >", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEDUNIT >=", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLessThan(String value) {
            addCriterion("INVOICEDUNIT <", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLessThanOrEqualTo(String value) {
            addCriterion("INVOICEDUNIT <=", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLike(String value) {
            addCriterion("INVOICEDUNIT like", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotLike(String value) {
            addCriterion("INVOICEDUNIT not like", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitIn(List<String> values) {
            addCriterion("INVOICEDUNIT in", values, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotIn(List<String> values) {
            addCriterion("INVOICEDUNIT not in", values, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitBetween(String value1, String value2) {
            addCriterion("INVOICEDUNIT between", value1, value2, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotBetween(String value1, String value2) {
            addCriterion("INVOICEDUNIT not between", value1, value2, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNull() {
            addCriterion("INVOICEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNotNull() {
            addCriterion("INVOICEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT =", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <>", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT not in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT not between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIsNull() {
            addCriterion("EBANKINGSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIsNotNull() {
            addCriterion("EBANKINGSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO =", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <>", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThan(String value) {
            addCriterion("EBANKINGSEQUENCENO >", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO >=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThan(String value) {
            addCriterion("EBANKINGSEQUENCENO <", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLike(String value) {
            addCriterion("EBANKINGSEQUENCENO like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotLike(String value) {
            addCriterion("EBANKINGSEQUENCENO not like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO not in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO between", value1, value2, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO not between", value1, value2, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNull() {
            addCriterion("RECEIVEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNotNull() {
            addCriterion("RECEIVEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitEqualTo(String value) {
            addCriterion("RECEIVEUNIT =", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotEqualTo(String value) {
            addCriterion("RECEIVEUNIT <>", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThan(String value) {
            addCriterion("RECEIVEUNIT >", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEUNIT >=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThan(String value) {
            addCriterion("RECEIVEUNIT <", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEUNIT <=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLike(String value) {
            addCriterion("RECEIVEUNIT like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotLike(String value) {
            addCriterion("RECEIVEUNIT not like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIn(List<String> values) {
            addCriterion("RECEIVEUNIT in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotIn(List<String> values) {
            addCriterion("RECEIVEUNIT not in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitBetween(String value1, String value2) {
            addCriterion("RECEIVEUNIT between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotBetween(String value1, String value2) {
            addCriterion("RECEIVEUNIT not between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReference4IsNull() {
            addCriterion("REFERENCE4 is null");
            return (Criteria) this;
        }

        public Criteria andReference4IsNotNull() {
            addCriterion("REFERENCE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReference4EqualTo(String value) {
            addCriterion("REFERENCE4 =", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotEqualTo(String value) {
            addCriterion("REFERENCE4 <>", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThan(String value) {
            addCriterion("REFERENCE4 >", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 >=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThan(String value) {
            addCriterion("REFERENCE4 <", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 <=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Like(String value) {
            addCriterion("REFERENCE4 like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotLike(String value) {
            addCriterion("REFERENCE4 not like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4In(List<String> values) {
            addCriterion("REFERENCE4 in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotIn(List<String> values) {
            addCriterion("REFERENCE4 not in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Between(String value1, String value2) {
            addCriterion("REFERENCE4 between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotBetween(String value1, String value2) {
            addCriterion("REFERENCE4 not between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNull() {
            addCriterion("IFUPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNotNull() {
            addCriterion("IFUPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIfuploadEqualTo(String value) {
            addCriterion("IFUPLOAD =", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotEqualTo(String value) {
            addCriterion("IFUPLOAD <>", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThan(String value) {
            addCriterion("IFUPLOAD >", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD >=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThan(String value) {
            addCriterion("IFUPLOAD <", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD <=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLike(String value) {
            addCriterion("IFUPLOAD like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotLike(String value) {
            addCriterion("IFUPLOAD not like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadIn(List<String> values) {
            addCriterion("IFUPLOAD in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotIn(List<String> values) {
            addCriterion("IFUPLOAD not in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadBetween(String value1, String value2) {
            addCriterion("IFUPLOAD between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotBetween(String value1, String value2) {
            addCriterion("IFUPLOAD not between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNull() {
            addCriterion("SEQINVPLY is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNotNull() {
            addCriterion("SEQINVPLY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyEqualTo(BigDecimal value) {
            addCriterion("SEQINVPLY =", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotEqualTo(BigDecimal value) {
            addCriterion("SEQINVPLY <>", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThan(BigDecimal value) {
            addCriterion("SEQINVPLY >", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQINVPLY >=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThan(BigDecimal value) {
            addCriterion("SEQINVPLY <", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQINVPLY <=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIn(List<BigDecimal> values) {
            addCriterion("SEQINVPLY in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotIn(List<BigDecimal> values) {
            addCriterion("SEQINVPLY not in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQINVPLY between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQINVPLY not between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNull() {
            addCriterion("PROJECTCODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNotNull() {
            addCriterion("PROJECTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeEqualTo(String value) {
            addCriterion("PROJECTCODE =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(String value) {
            addCriterion("PROJECTCODE <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(String value) {
            addCriterion("PROJECTCODE >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(String value) {
            addCriterion("PROJECTCODE <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLike(String value) {
            addCriterion("PROJECTCODE like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotLike(String value) {
            addCriterion("PROJECTCODE not like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<String> values) {
            addCriterion("PROJECTCODE in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<String> values) {
            addCriterion("PROJECTCODE not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(String value1, String value2) {
            addCriterion("PROJECTCODE between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCODE not between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNull() {
            addCriterion("CUSTACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNotNull() {
            addCriterion("CUSTACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME =", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <>", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAME >", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME >=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThan(String value) {
            addCriterion("CUSTACCOUNTNAME <", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLike(String value) {
            addCriterion("CUSTACCOUNTNAME like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotLike(String value) {
            addCriterion("CUSTACCOUNTNAME not like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME not in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME not between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNull() {
            addCriterion("CUSTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNotNull() {
            addCriterion("CUSTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO =", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <>", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNO >", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO >=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThan(String value) {
            addCriterion("CUSTACCOUNTNO <", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLike(String value) {
            addCriterion("CUSTACCOUNTNO like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotLike(String value) {
            addCriterion("CUSTACCOUNTNO not like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO not in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO not between", value1, value2, "custaccountno");
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

        public Criteria andCustbanknoIsNull() {
            addCriterion("CUSTBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNotNull() {
            addCriterion("CUSTBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoEqualTo(String value) {
            addCriterion("CUSTBANKNO =", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotEqualTo(String value) {
            addCriterion("CUSTBANKNO <>", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThan(String value) {
            addCriterion("CUSTBANKNO >", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO >=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThan(String value) {
            addCriterion("CUSTBANKNO <", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO <=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLike(String value) {
            addCriterion("CUSTBANKNO like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotLike(String value) {
            addCriterion("CUSTBANKNO not like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIn(List<String> values) {
            addCriterion("CUSTBANKNO in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotIn(List<String> values) {
            addCriterion("CUSTBANKNO not in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO not between", value1, value2, "custbankno");
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

        public Criteria andBankcityIsNull() {
            addCriterion("BANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("BANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("BANKCITY =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("BANKCITY <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("BANKCITY >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCITY >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("BANKCITY <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("BANKCITY <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("BANKCITY like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("BANKCITY not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("BANKCITY in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("BANKCITY not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("BANKCITY between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("BANKCITY not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("BANKPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("BANKPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("BANKPROVINCE =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("BANKPROVINCE <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("BANKPROVINCE >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("BANKPROVINCE <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("BANKPROVINCE like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("BANKPROVINCE not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("BANKPROVINCE in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("BANKPROVINCE not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNull() {
            addCriterion("ISPAYPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNotNull() {
            addCriterion("ISPAYPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicEqualTo(String value) {
            addCriterion("ISPAYPUBLIC =", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <>", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThan(String value) {
            addCriterion("ISPAYPUBLIC >", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC >=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThan(String value) {
            addCriterion("ISPAYPUBLIC <", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLike(String value) {
            addCriterion("ISPAYPUBLIC like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotLike(String value) {
            addCriterion("ISPAYPUBLIC not like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIn(List<String> values) {
            addCriterion("ISPAYPUBLIC in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotIn(List<String> values) {
            addCriterion("ISPAYPUBLIC not in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC not between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNull() {
            addCriterion("CARDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNotNull() {
            addCriterion("CARDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCardflagEqualTo(String value) {
            addCriterion("CARDFLAG =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(String value) {
            addCriterion("CARDFLAG <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(String value) {
            addCriterion("CARDFLAG >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(String value) {
            addCriterion("CARDFLAG >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(String value) {
            addCriterion("CARDFLAG <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(String value) {
            addCriterion("CARDFLAG <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLike(String value) {
            addCriterion("CARDFLAG like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotLike(String value) {
            addCriterion("CARDFLAG not like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<String> values) {
            addCriterion("CARDFLAG in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<String> values) {
            addCriterion("CARDFLAG not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(String value1, String value2) {
            addCriterion("CARDFLAG between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(String value1, String value2) {
            addCriterion("CARDFLAG not between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNull() {
            addCriterion("CERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNotNull() {
            addCriterion("CERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoEqualTo(String value) {
            addCriterion("CERTIFICATENO =", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotEqualTo(String value) {
            addCriterion("CERTIFICATENO <>", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThan(String value) {
            addCriterion("CERTIFICATENO >", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO >=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThan(String value) {
            addCriterion("CERTIFICATENO <", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO <=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLike(String value) {
            addCriterion("CERTIFICATENO like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotLike(String value) {
            addCriterion("CERTIFICATENO not like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIn(List<String> values) {
            addCriterion("CERTIFICATENO in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotIn(List<String> values) {
            addCriterion("CERTIFICATENO not in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO not between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNull() {
            addCriterion("CUSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("CUSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("CUSTEMAIL =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("CUSTEMAIL <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("CUSTEMAIL >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("CUSTEMAIL <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("CUSTEMAIL like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("CUSTEMAIL not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("CUSTEMAIL in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("CUSTEMAIL not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL not between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIsNull() {
            addCriterion("UNITBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIsNotNull() {
            addCriterion("UNITBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoEqualTo(String value) {
            addCriterion("UNITBANKNO =", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotEqualTo(String value) {
            addCriterion("UNITBANKNO <>", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoGreaterThan(String value) {
            addCriterion("UNITBANKNO >", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("UNITBANKNO >=", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLessThan(String value) {
            addCriterion("UNITBANKNO <", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLessThanOrEqualTo(String value) {
            addCriterion("UNITBANKNO <=", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLike(String value) {
            addCriterion("UNITBANKNO like", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotLike(String value) {
            addCriterion("UNITBANKNO not like", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIn(List<String> values) {
            addCriterion("UNITBANKNO in", values, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotIn(List<String> values) {
            addCriterion("UNITBANKNO not in", values, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoBetween(String value1, String value2) {
            addCriterion("UNITBANKNO between", value1, value2, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotBetween(String value1, String value2) {
            addCriterion("UNITBANKNO not between", value1, value2, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNull() {
            addCriterion("FASTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("FASTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(String value) {
            addCriterion("FASTFLAG =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(String value) {
            addCriterion("FASTFLAG <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(String value) {
            addCriterion("FASTFLAG >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(String value) {
            addCriterion("FASTFLAG >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(String value) {
            addCriterion("FASTFLAG <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(String value) {
            addCriterion("FASTFLAG <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLike(String value) {
            addCriterion("FASTFLAG like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotLike(String value) {
            addCriterion("FASTFLAG not like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<String> values) {
            addCriterion("FASTFLAG in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<String> values) {
            addCriterion("FASTFLAG not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(String value1, String value2) {
            addCriterion("FASTFLAG between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(String value1, String value2) {
            addCriterion("FASTFLAG not between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNull() {
            addCriterion("SMSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNotNull() {
            addCriterion("SMSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSmsflagEqualTo(String value) {
            addCriterion("SMSFLAG =", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotEqualTo(String value) {
            addCriterion("SMSFLAG <>", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThan(String value) {
            addCriterion("SMSFLAG >", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThanOrEqualTo(String value) {
            addCriterion("SMSFLAG >=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThan(String value) {
            addCriterion("SMSFLAG <", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThanOrEqualTo(String value) {
            addCriterion("SMSFLAG <=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLike(String value) {
            addCriterion("SMSFLAG like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotLike(String value) {
            addCriterion("SMSFLAG not like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIn(List<String> values) {
            addCriterion("SMSFLAG in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotIn(List<String> values) {
            addCriterion("SMSFLAG not in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagBetween(String value1, String value2) {
            addCriterion("SMSFLAG between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotBetween(String value1, String value2) {
            addCriterion("SMSFLAG not between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNull() {
            addCriterion("PAYMODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNotNull() {
            addCriterion("PAYMODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymodeEqualTo(String value) {
            addCriterion("PAYMODE =", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotEqualTo(String value) {
            addCriterion("PAYMODE <>", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThan(String value) {
            addCriterion("PAYMODE >", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMODE >=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThan(String value) {
            addCriterion("PAYMODE <", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMODE <=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLike(String value) {
            addCriterion("PAYMODE like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotLike(String value) {
            addCriterion("PAYMODE not like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeIn(List<String> values) {
            addCriterion("PAYMODE in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotIn(List<String> values) {
            addCriterion("PAYMODE not in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeBetween(String value1, String value2) {
            addCriterion("PAYMODE between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotBetween(String value1, String value2) {
            addCriterion("PAYMODE not between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BILLNO not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNull() {
            addCriterion("CHECKNO is null");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNotNull() {
            addCriterion("CHECKNO is not null");
            return (Criteria) this;
        }

        public Criteria andChecknoEqualTo(String value) {
            addCriterion("CHECKNO =", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotEqualTo(String value) {
            addCriterion("CHECKNO <>", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThan(String value) {
            addCriterion("CHECKNO >", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNO >=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThan(String value) {
            addCriterion("CHECKNO <", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThanOrEqualTo(String value) {
            addCriterion("CHECKNO <=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLike(String value) {
            addCriterion("CHECKNO like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotLike(String value) {
            addCriterion("CHECKNO not like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoIn(List<String> values) {
            addCriterion("CHECKNO in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotIn(List<String> values) {
            addCriterion("CHECKNO not in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoBetween(String value1, String value2) {
            addCriterion("CHECKNO between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotBetween(String value1, String value2) {
            addCriterion("CHECKNO not between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andPayreasonIsNull() {
            addCriterion("PAYREASON is null");
            return (Criteria) this;
        }

        public Criteria andPayreasonIsNotNull() {
            addCriterion("PAYREASON is not null");
            return (Criteria) this;
        }

        public Criteria andPayreasonEqualTo(String value) {
            addCriterion("PAYREASON =", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonNotEqualTo(String value) {
            addCriterion("PAYREASON <>", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonGreaterThan(String value) {
            addCriterion("PAYREASON >", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonGreaterThanOrEqualTo(String value) {
            addCriterion("PAYREASON >=", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonLessThan(String value) {
            addCriterion("PAYREASON <", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonLessThanOrEqualTo(String value) {
            addCriterion("PAYREASON <=", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonLike(String value) {
            addCriterion("PAYREASON like", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonNotLike(String value) {
            addCriterion("PAYREASON not like", value, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonIn(List<String> values) {
            addCriterion("PAYREASON in", values, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonNotIn(List<String> values) {
            addCriterion("PAYREASON not in", values, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonBetween(String value1, String value2) {
            addCriterion("PAYREASON between", value1, value2, "payreason");
            return (Criteria) this;
        }

        public Criteria andPayreasonNotBetween(String value1, String value2) {
            addCriterion("PAYREASON not between", value1, value2, "payreason");
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

        public Criteria andPaycommentIsNull() {
            addCriterion("PAYCOMMENT is null");
            return (Criteria) this;
        }

        public Criteria andPaycommentIsNotNull() {
            addCriterion("PAYCOMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPaycommentEqualTo(String value) {
            addCriterion("PAYCOMMENT =", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentNotEqualTo(String value) {
            addCriterion("PAYCOMMENT <>", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentGreaterThan(String value) {
            addCriterion("PAYCOMMENT >", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCOMMENT >=", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentLessThan(String value) {
            addCriterion("PAYCOMMENT <", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentLessThanOrEqualTo(String value) {
            addCriterion("PAYCOMMENT <=", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentLike(String value) {
            addCriterion("PAYCOMMENT like", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentNotLike(String value) {
            addCriterion("PAYCOMMENT not like", value, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentIn(List<String> values) {
            addCriterion("PAYCOMMENT in", values, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentNotIn(List<String> values) {
            addCriterion("PAYCOMMENT not in", values, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentBetween(String value1, String value2) {
            addCriterion("PAYCOMMENT between", value1, value2, "paycomment");
            return (Criteria) this;
        }

        public Criteria andPaycommentNotBetween(String value1, String value2) {
            addCriterion("PAYCOMMENT not between", value1, value2, "paycomment");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNull() {
            addCriterion("INPAYMENTBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNotNull() {
            addCriterion("INPAYMENTBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO =", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <>", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThan(String value) {
            addCriterion("INPAYMENTBATCHNO >", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO >=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThan(String value) {
            addCriterion("INPAYMENTBATCHNO <", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLike(String value) {
            addCriterion("INPAYMENTBATCHNO like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotLike(String value) {
            addCriterion("INPAYMENTBATCHNO not like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO not in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO not between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNull() {
            addCriterion("INPAYMENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNotNull() {
            addCriterion("INPAYMENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagEqualTo(String value) {
            addCriterion("INPAYMENTFLAG =", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <>", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThan(String value) {
            addCriterion("INPAYMENTFLAG >", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG >=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThan(String value) {
            addCriterion("INPAYMENTFLAG <", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLike(String value) {
            addCriterion("INPAYMENTFLAG like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotLike(String value) {
            addCriterion("INPAYMENTFLAG not like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIn(List<String> values) {
            addCriterion("INPAYMENTFLAG in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotIn(List<String> values) {
            addCriterion("INPAYMENTFLAG not in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG not between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNull() {
            addCriterion("CERTITYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNotNull() {
            addCriterion("CERTITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertitypeEqualTo(String value) {
            addCriterion("CERTITYPE =", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotEqualTo(String value) {
            addCriterion("CERTITYPE <>", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThan(String value) {
            addCriterion("CERTITYPE >", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTITYPE >=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThan(String value) {
            addCriterion("CERTITYPE <", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThanOrEqualTo(String value) {
            addCriterion("CERTITYPE <=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLike(String value) {
            addCriterion("CERTITYPE like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotLike(String value) {
            addCriterion("CERTITYPE not like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeIn(List<String> values) {
            addCriterion("CERTITYPE in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotIn(List<String> values) {
            addCriterion("CERTITYPE not in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeBetween(String value1, String value2) {
            addCriterion("CERTITYPE between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotBetween(String value1, String value2) {
            addCriterion("CERTITYPE not between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("PAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("PAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("PAYMENTMETHOD =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("PAYMENTMETHOD <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("PAYMENTMETHOD >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTMETHOD >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("PAYMENTMETHOD <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTMETHOD <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("PAYMENTMETHOD like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("PAYMENTMETHOD not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("PAYMENTMETHOD in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("PAYMENTMETHOD not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("PAYMENTMETHOD between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("PAYMENTMETHOD not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidIsNull() {
            addCriterion("PAYMENTRULEID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidIsNotNull() {
            addCriterion("PAYMENTRULEID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidEqualTo(String value) {
            addCriterion("PAYMENTRULEID =", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidNotEqualTo(String value) {
            addCriterion("PAYMENTRULEID <>", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidGreaterThan(String value) {
            addCriterion("PAYMENTRULEID >", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTRULEID >=", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidLessThan(String value) {
            addCriterion("PAYMENTRULEID <", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTRULEID <=", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidLike(String value) {
            addCriterion("PAYMENTRULEID like", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidNotLike(String value) {
            addCriterion("PAYMENTRULEID not like", value, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidIn(List<String> values) {
            addCriterion("PAYMENTRULEID in", values, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidNotIn(List<String> values) {
            addCriterion("PAYMENTRULEID not in", values, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidBetween(String value1, String value2) {
            addCriterion("PAYMENTRULEID between", value1, value2, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andPaymentruleidNotBetween(String value1, String value2) {
            addCriterion("PAYMENTRULEID not between", value1, value2, "paymentruleid");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNull() {
            addCriterion("CUSTACCOUNTAREA is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNotNull() {
            addCriterion("CUSTACCOUNTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA =", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <>", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThan(String value) {
            addCriterion("CUSTACCOUNTAREA >", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA >=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThan(String value) {
            addCriterion("CUSTACCOUNTAREA <", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLike(String value) {
            addCriterion("CUSTACCOUNTAREA like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotLike(String value) {
            addCriterion("CUSTACCOUNTAREA not like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA not in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA not between", value1, value2, "custaccountarea");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_paymentsale_temp
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
     * @Table : mm_paymentsale_temp
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