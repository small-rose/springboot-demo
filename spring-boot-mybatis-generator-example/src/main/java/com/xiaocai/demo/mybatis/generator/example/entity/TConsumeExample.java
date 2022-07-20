package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TConsumeExample {
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
    public TConsumeExample() {
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
     * @Table : t_consume
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

        public Criteria andTanoIsNull() {
            addCriterion("TANO is null");
            return (Criteria) this;
        }

        public Criteria andTanoIsNotNull() {
            addCriterion("TANO is not null");
            return (Criteria) this;
        }

        public Criteria andTanoEqualTo(Long value) {
            addCriterion("TANO =", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotEqualTo(Long value) {
            addCriterion("TANO <>", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThan(Long value) {
            addCriterion("TANO >", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThanOrEqualTo(Long value) {
            addCriterion("TANO >=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThan(Long value) {
            addCriterion("TANO <", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThanOrEqualTo(Long value) {
            addCriterion("TANO <=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoIn(List<Long> values) {
            addCriterion("TANO in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotIn(List<Long> values) {
            addCriterion("TANO not in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoBetween(Long value1, Long value2) {
            addCriterion("TANO between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotBetween(Long value1, Long value2) {
            addCriterion("TANO not between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andInsureIdIsNull() {
            addCriterion("INSURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsureIdIsNotNull() {
            addCriterion("INSURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsureIdEqualTo(String value) {
            addCriterion("INSURE_ID =", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotEqualTo(String value) {
            addCriterion("INSURE_ID <>", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThan(String value) {
            addCriterion("INSURE_ID >", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSURE_ID >=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThan(String value) {
            addCriterion("INSURE_ID <", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThanOrEqualTo(String value) {
            addCriterion("INSURE_ID <=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLike(String value) {
            addCriterion("INSURE_ID like", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotLike(String value) {
            addCriterion("INSURE_ID not like", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdIn(List<String> values) {
            addCriterion("INSURE_ID in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotIn(List<String> values) {
            addCriterion("INSURE_ID not in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdBetween(String value1, String value2) {
            addCriterion("INSURE_ID between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotBetween(String value1, String value2) {
            addCriterion("INSURE_ID not between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andMidnoIsNull() {
            addCriterion("MIDNO is null");
            return (Criteria) this;
        }

        public Criteria andMidnoIsNotNull() {
            addCriterion("MIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andMidnoEqualTo(String value) {
            addCriterion("MIDNO =", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotEqualTo(String value) {
            addCriterion("MIDNO <>", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoGreaterThan(String value) {
            addCriterion("MIDNO >", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoGreaterThanOrEqualTo(String value) {
            addCriterion("MIDNO >=", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLessThan(String value) {
            addCriterion("MIDNO <", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLessThanOrEqualTo(String value) {
            addCriterion("MIDNO <=", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLike(String value) {
            addCriterion("MIDNO like", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotLike(String value) {
            addCriterion("MIDNO not like", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoIn(List<String> values) {
            addCriterion("MIDNO in", values, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotIn(List<String> values) {
            addCriterion("MIDNO not in", values, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoBetween(String value1, String value2) {
            addCriterion("MIDNO between", value1, value2, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotBetween(String value1, String value2) {
            addCriterion("MIDNO not between", value1, value2, "midno");
            return (Criteria) this;
        }

        public Criteria andTidnoIsNull() {
            addCriterion("TIDNO is null");
            return (Criteria) this;
        }

        public Criteria andTidnoIsNotNull() {
            addCriterion("TIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andTidnoEqualTo(String value) {
            addCriterion("TIDNO =", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoNotEqualTo(String value) {
            addCriterion("TIDNO <>", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoGreaterThan(String value) {
            addCriterion("TIDNO >", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoGreaterThanOrEqualTo(String value) {
            addCriterion("TIDNO >=", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoLessThan(String value) {
            addCriterion("TIDNO <", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoLessThanOrEqualTo(String value) {
            addCriterion("TIDNO <=", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoLike(String value) {
            addCriterion("TIDNO like", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoNotLike(String value) {
            addCriterion("TIDNO not like", value, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoIn(List<String> values) {
            addCriterion("TIDNO in", values, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoNotIn(List<String> values) {
            addCriterion("TIDNO not in", values, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoBetween(String value1, String value2) {
            addCriterion("TIDNO between", value1, value2, "tidno");
            return (Criteria) this;
        }

        public Criteria andTidnoNotBetween(String value1, String value2) {
            addCriterion("TIDNO not between", value1, value2, "tidno");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateIsNull() {
            addCriterion("BK_ACCT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateIsNotNull() {
            addCriterion("BK_ACCT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateEqualTo(String value) {
            addCriterion("BK_ACCT_DATE =", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateNotEqualTo(String value) {
            addCriterion("BK_ACCT_DATE <>", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateGreaterThan(String value) {
            addCriterion("BK_ACCT_DATE >", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateGreaterThanOrEqualTo(String value) {
            addCriterion("BK_ACCT_DATE >=", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateLessThan(String value) {
            addCriterion("BK_ACCT_DATE <", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateLessThanOrEqualTo(String value) {
            addCriterion("BK_ACCT_DATE <=", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateLike(String value) {
            addCriterion("BK_ACCT_DATE like", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateNotLike(String value) {
            addCriterion("BK_ACCT_DATE not like", value, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateIn(List<String> values) {
            addCriterion("BK_ACCT_DATE in", values, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateNotIn(List<String> values) {
            addCriterion("BK_ACCT_DATE not in", values, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateBetween(String value1, String value2) {
            addCriterion("BK_ACCT_DATE between", value1, value2, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctDateNotBetween(String value1, String value2) {
            addCriterion("BK_ACCT_DATE not between", value1, value2, "bkAcctDate");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeIsNull() {
            addCriterion("BK_ACCT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeIsNotNull() {
            addCriterion("BK_ACCT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeEqualTo(String value) {
            addCriterion("BK_ACCT_TIME =", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeNotEqualTo(String value) {
            addCriterion("BK_ACCT_TIME <>", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeGreaterThan(String value) {
            addCriterion("BK_ACCT_TIME >", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BK_ACCT_TIME >=", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeLessThan(String value) {
            addCriterion("BK_ACCT_TIME <", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeLessThanOrEqualTo(String value) {
            addCriterion("BK_ACCT_TIME <=", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeLike(String value) {
            addCriterion("BK_ACCT_TIME like", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeNotLike(String value) {
            addCriterion("BK_ACCT_TIME not like", value, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeIn(List<String> values) {
            addCriterion("BK_ACCT_TIME in", values, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeNotIn(List<String> values) {
            addCriterion("BK_ACCT_TIME not in", values, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeBetween(String value1, String value2) {
            addCriterion("BK_ACCT_TIME between", value1, value2, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkAcctTimeNotBetween(String value1, String value2) {
            addCriterion("BK_ACCT_TIME not between", value1, value2, "bkAcctTime");
            return (Criteria) this;
        }

        public Criteria andBkSerialIsNull() {
            addCriterion("BK_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andBkSerialIsNotNull() {
            addCriterion("BK_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andBkSerialEqualTo(String value) {
            addCriterion("BK_SERIAL =", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialNotEqualTo(String value) {
            addCriterion("BK_SERIAL <>", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialGreaterThan(String value) {
            addCriterion("BK_SERIAL >", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialGreaterThanOrEqualTo(String value) {
            addCriterion("BK_SERIAL >=", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialLessThan(String value) {
            addCriterion("BK_SERIAL <", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialLessThanOrEqualTo(String value) {
            addCriterion("BK_SERIAL <=", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialLike(String value) {
            addCriterion("BK_SERIAL like", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialNotLike(String value) {
            addCriterion("BK_SERIAL not like", value, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialIn(List<String> values) {
            addCriterion("BK_SERIAL in", values, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialNotIn(List<String> values) {
            addCriterion("BK_SERIAL not in", values, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialBetween(String value1, String value2) {
            addCriterion("BK_SERIAL between", value1, value2, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkSerialNotBetween(String value1, String value2) {
            addCriterion("BK_SERIAL not between", value1, value2, "bkSerial");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlIsNull() {
            addCriterion("BK_TRAN_CHNL is null");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlIsNotNull() {
            addCriterion("BK_TRAN_CHNL is not null");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlEqualTo(String value) {
            addCriterion("BK_TRAN_CHNL =", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlNotEqualTo(String value) {
            addCriterion("BK_TRAN_CHNL <>", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlGreaterThan(String value) {
            addCriterion("BK_TRAN_CHNL >", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlGreaterThanOrEqualTo(String value) {
            addCriterion("BK_TRAN_CHNL >=", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlLessThan(String value) {
            addCriterion("BK_TRAN_CHNL <", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlLessThanOrEqualTo(String value) {
            addCriterion("BK_TRAN_CHNL <=", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlLike(String value) {
            addCriterion("BK_TRAN_CHNL like", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlNotLike(String value) {
            addCriterion("BK_TRAN_CHNL not like", value, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlIn(List<String> values) {
            addCriterion("BK_TRAN_CHNL in", values, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlNotIn(List<String> values) {
            addCriterion("BK_TRAN_CHNL not in", values, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlBetween(String value1, String value2) {
            addCriterion("BK_TRAN_CHNL between", value1, value2, "bkTranChnl");
            return (Criteria) this;
        }

        public Criteria andBkTranChnlNotBetween(String value1, String value2) {
            addCriterion("BK_TRAN_CHNL not between", value1, value2, "bkTranChnl");
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

        public Criteria andAmountEqualTo(String value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNull() {
            addCriterion("PAYCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNotNull() {
            addCriterion("PAYCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaycountEqualTo(BigDecimal value) {
            addCriterion("PAYCOUNT =", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotEqualTo(BigDecimal value) {
            addCriterion("PAYCOUNT <>", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThan(BigDecimal value) {
            addCriterion("PAYCOUNT >", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYCOUNT >=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThan(BigDecimal value) {
            addCriterion("PAYCOUNT <", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYCOUNT <=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountIn(List<BigDecimal> values) {
            addCriterion("PAYCOUNT in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotIn(List<BigDecimal> values) {
            addCriterion("PAYCOUNT not in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYCOUNT between", value1, value2, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYCOUNT not between", value1, value2, "paycount");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
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

        public Criteria andCheckOpcodeIsNull() {
            addCriterion("CHECK_OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeIsNotNull() {
            addCriterion("CHECK_OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeEqualTo(String value) {
            addCriterion("CHECK_OPCODE =", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeNotEqualTo(String value) {
            addCriterion("CHECK_OPCODE <>", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeGreaterThan(String value) {
            addCriterion("CHECK_OPCODE >", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OPCODE >=", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeLessThan(String value) {
            addCriterion("CHECK_OPCODE <", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_OPCODE <=", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeLike(String value) {
            addCriterion("CHECK_OPCODE like", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeNotLike(String value) {
            addCriterion("CHECK_OPCODE not like", value, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeIn(List<String> values) {
            addCriterion("CHECK_OPCODE in", values, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeNotIn(List<String> values) {
            addCriterion("CHECK_OPCODE not in", values, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeBetween(String value1, String value2) {
            addCriterion("CHECK_OPCODE between", value1, value2, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpcodeNotBetween(String value1, String value2) {
            addCriterion("CHECK_OPCODE not between", value1, value2, "checkOpcode");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameIsNull() {
            addCriterion("CHECK_OPNAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameIsNotNull() {
            addCriterion("CHECK_OPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameEqualTo(String value) {
            addCriterion("CHECK_OPNAME =", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameNotEqualTo(String value) {
            addCriterion("CHECK_OPNAME <>", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameGreaterThan(String value) {
            addCriterion("CHECK_OPNAME >", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OPNAME >=", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameLessThan(String value) {
            addCriterion("CHECK_OPNAME <", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameLessThanOrEqualTo(String value) {
            addCriterion("CHECK_OPNAME <=", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameLike(String value) {
            addCriterion("CHECK_OPNAME like", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameNotLike(String value) {
            addCriterion("CHECK_OPNAME not like", value, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameIn(List<String> values) {
            addCriterion("CHECK_OPNAME in", values, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameNotIn(List<String> values) {
            addCriterion("CHECK_OPNAME not in", values, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameBetween(String value1, String value2) {
            addCriterion("CHECK_OPNAME between", value1, value2, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCheckOpnameNotBetween(String value1, String value2) {
            addCriterion("CHECK_OPNAME not between", value1, value2, "checkOpname");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIsNull() {
            addCriterion("CURRENCYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIsNotNull() {
            addCriterion("CURRENCYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeEqualTo(String value) {
            addCriterion("CURRENCYTYPE =", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotEqualTo(String value) {
            addCriterion("CURRENCYTYPE <>", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeGreaterThan(String value) {
            addCriterion("CURRENCYTYPE >", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYTYPE >=", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLessThan(String value) {
            addCriterion("CURRENCYTYPE <", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYTYPE <=", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLike(String value) {
            addCriterion("CURRENCYTYPE like", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotLike(String value) {
            addCriterion("CURRENCYTYPE not like", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIn(List<String> values) {
            addCriterion("CURRENCYTYPE in", values, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotIn(List<String> values) {
            addCriterion("CURRENCYTYPE not in", values, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeBetween(String value1, String value2) {
            addCriterion("CURRENCYTYPE between", value1, value2, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotBetween(String value1, String value2) {
            addCriterion("CURRENCYTYPE not between", value1, value2, "currencytype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_consume
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
     * @Table : t_consume
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