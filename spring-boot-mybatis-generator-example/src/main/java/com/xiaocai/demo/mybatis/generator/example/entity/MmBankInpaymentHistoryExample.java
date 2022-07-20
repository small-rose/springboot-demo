package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBankInpaymentHistoryExample {
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
    public MmBankInpaymentHistoryExample() {
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
     * @Table : mm_bank_inpayment_history
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

        public Criteria andUridIsNull() {
            addCriterion("URID is null");
            return (Criteria) this;
        }

        public Criteria andUridIsNotNull() {
            addCriterion("URID is not null");
            return (Criteria) this;
        }

        public Criteria andUridEqualTo(String value) {
            addCriterion("URID =", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotEqualTo(String value) {
            addCriterion("URID <>", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThan(String value) {
            addCriterion("URID >", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThanOrEqualTo(String value) {
            addCriterion("URID >=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThan(String value) {
            addCriterion("URID <", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThanOrEqualTo(String value) {
            addCriterion("URID <=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLike(String value) {
            addCriterion("URID like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotLike(String value) {
            addCriterion("URID not like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridIn(List<String> values) {
            addCriterion("URID in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotIn(List<String> values) {
            addCriterion("URID not in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridBetween(String value1, String value2) {
            addCriterion("URID between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotBetween(String value1, String value2) {
            addCriterion("URID not between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
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

        public Criteria andLedgeramountIsNull() {
            addCriterion("LEDGERAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLedgeramountIsNotNull() {
            addCriterion("LEDGERAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLedgeramountEqualTo(BigDecimal value) {
            addCriterion("LEDGERAMOUNT =", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountNotEqualTo(BigDecimal value) {
            addCriterion("LEDGERAMOUNT <>", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountGreaterThan(BigDecimal value) {
            addCriterion("LEDGERAMOUNT >", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEDGERAMOUNT >=", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountLessThan(BigDecimal value) {
            addCriterion("LEDGERAMOUNT <", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEDGERAMOUNT <=", value, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountIn(List<BigDecimal> values) {
            addCriterion("LEDGERAMOUNT in", values, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountNotIn(List<BigDecimal> values) {
            addCriterion("LEDGERAMOUNT not in", values, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEDGERAMOUNT between", value1, value2, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andLedgeramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEDGERAMOUNT not between", value1, value2, "ledgeramount");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNull() {
            addCriterion("POSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("POSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(Date value) {
            addCriterion("POSTDATE =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(Date value) {
            addCriterion("POSTDATE <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(Date value) {
            addCriterion("POSTDATE >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("POSTDATE >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(Date value) {
            addCriterion("POSTDATE <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(Date value) {
            addCriterion("POSTDATE <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(List<Date> values) {
            addCriterion("POSTDATE in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(List<Date> values) {
            addCriterion("POSTDATE not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(Date value1, Date value2) {
            addCriterion("POSTDATE between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(Date value1, Date value2) {
            addCriterion("POSTDATE not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeIsNull() {
            addCriterion("POSTDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeIsNotNull() {
            addCriterion("POSTDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeEqualTo(Date value) {
            addCriterion("POSTDATETIME =", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeNotEqualTo(Date value) {
            addCriterion("POSTDATETIME <>", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeGreaterThan(Date value) {
            addCriterion("POSTDATETIME >", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("POSTDATETIME >=", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeLessThan(Date value) {
            addCriterion("POSTDATETIME <", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("POSTDATETIME <=", value, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeIn(List<Date> values) {
            addCriterion("POSTDATETIME in", values, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeNotIn(List<Date> values) {
            addCriterion("POSTDATETIME not in", values, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeBetween(Date value1, Date value2) {
            addCriterion("POSTDATETIME between", value1, value2, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andPostdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("POSTDATETIME not between", value1, value2, "postdatetime");
            return (Criteria) this;
        }

        public Criteria andValuedateIsNull() {
            addCriterion("VALUEDATE is null");
            return (Criteria) this;
        }

        public Criteria andValuedateIsNotNull() {
            addCriterion("VALUEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andValuedateEqualTo(Date value) {
            addCriterion("VALUEDATE =", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateNotEqualTo(Date value) {
            addCriterion("VALUEDATE <>", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateGreaterThan(Date value) {
            addCriterion("VALUEDATE >", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("VALUEDATE >=", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateLessThan(Date value) {
            addCriterion("VALUEDATE <", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateLessThanOrEqualTo(Date value) {
            addCriterion("VALUEDATE <=", value, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateIn(List<Date> values) {
            addCriterion("VALUEDATE in", values, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateNotIn(List<Date> values) {
            addCriterion("VALUEDATE not in", values, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateBetween(Date value1, Date value2) {
            addCriterion("VALUEDATE between", value1, value2, "valuedate");
            return (Criteria) this;
        }

        public Criteria andValuedateNotBetween(Date value1, Date value2) {
            addCriterion("VALUEDATE not between", value1, value2, "valuedate");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNull() {
            addCriterion("ABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNotNull() {
            addCriterion("ABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractEqualTo(String value) {
            addCriterion("ABSTRACT =", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotEqualTo(String value) {
            addCriterion("ABSTRACT <>", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThan(String value) {
            addCriterion("ABSTRACT >", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("ABSTRACT >=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThan(String value) {
            addCriterion("ABSTRACT <", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThanOrEqualTo(String value) {
            addCriterion("ABSTRACT <=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLike(String value) {
            addCriterion("ABSTRACT like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotLike(String value) {
            addCriterion("ABSTRACT not like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractIn(List<String> values) {
            addCriterion("ABSTRACT in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotIn(List<String> values) {
            addCriterion("ABSTRACT not in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractBetween(String value1, String value2) {
            addCriterion("ABSTRACT between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotBetween(String value1, String value2) {
            addCriterion("ABSTRACT not between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("PURPOSE =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("PURPOSE <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("PURPOSE >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("PURPOSE >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("PURPOSE <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("PURPOSE <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("PURPOSE like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("PURPOSE not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("PURPOSE in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("PURPOSE not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("PURPOSE between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("PURPOSE not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceIsNull() {
            addCriterion("CUSTOMERREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceIsNotNull() {
            addCriterion("CUSTOMERREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCE =", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceNotEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCE <>", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceGreaterThan(String value) {
            addCriterion("CUSTOMERREFERENCE >", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCE >=", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceLessThan(String value) {
            addCriterion("CUSTOMERREFERENCE <", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCE <=", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceLike(String value) {
            addCriterion("CUSTOMERREFERENCE like", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceNotLike(String value) {
            addCriterion("CUSTOMERREFERENCE not like", value, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceIn(List<String> values) {
            addCriterion("CUSTOMERREFERENCE in", values, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceNotIn(List<String> values) {
            addCriterion("CUSTOMERREFERENCE not in", values, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceBetween(String value1, String value2) {
            addCriterion("CUSTOMERREFERENCE between", value1, value2, "customerreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferenceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERREFERENCE not between", value1, value2, "customerreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceIsNull() {
            addCriterion("BANKREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andBankreferenceIsNotNull() {
            addCriterion("BANKREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankreferenceEqualTo(String value) {
            addCriterion("BANKREFERENCE =", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceNotEqualTo(String value) {
            addCriterion("BANKREFERENCE <>", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceGreaterThan(String value) {
            addCriterion("BANKREFERENCE >", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKREFERENCE >=", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceLessThan(String value) {
            addCriterion("BANKREFERENCE <", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceLessThanOrEqualTo(String value) {
            addCriterion("BANKREFERENCE <=", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceLike(String value) {
            addCriterion("BANKREFERENCE like", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceNotLike(String value) {
            addCriterion("BANKREFERENCE not like", value, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceIn(List<String> values) {
            addCriterion("BANKREFERENCE in", values, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceNotIn(List<String> values) {
            addCriterion("BANKREFERENCE not in", values, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceBetween(String value1, String value2) {
            addCriterion("BANKREFERENCE between", value1, value2, "bankreference");
            return (Criteria) this;
        }

        public Criteria andBankreferenceNotBetween(String value1, String value2) {
            addCriterion("BANKREFERENCE not between", value1, value2, "bankreference");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameIsNull() {
            addCriterion("CUSTOMERREFERENCENAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameIsNotNull() {
            addCriterion("CUSTOMERREFERENCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCENAME =", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameNotEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCENAME <>", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameGreaterThan(String value) {
            addCriterion("CUSTOMERREFERENCENAME >", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCENAME >=", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameLessThan(String value) {
            addCriterion("CUSTOMERREFERENCENAME <", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREFERENCENAME <=", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameLike(String value) {
            addCriterion("CUSTOMERREFERENCENAME like", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameNotLike(String value) {
            addCriterion("CUSTOMERREFERENCENAME not like", value, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameIn(List<String> values) {
            addCriterion("CUSTOMERREFERENCENAME in", values, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameNotIn(List<String> values) {
            addCriterion("CUSTOMERREFERENCENAME not in", values, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameBetween(String value1, String value2) {
            addCriterion("CUSTOMERREFERENCENAME between", value1, value2, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andCustomerreferencenameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERREFERENCENAME not between", value1, value2, "customerreferencename");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeIsNull() {
            addCriterion("TRANSACTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeIsNotNull() {
            addCriterion("TRANSACTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeEqualTo(String value) {
            addCriterion("TRANSACTIONCODE =", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeNotEqualTo(String value) {
            addCriterion("TRANSACTIONCODE <>", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeGreaterThan(String value) {
            addCriterion("TRANSACTIONCODE >", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONCODE >=", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeLessThan(String value) {
            addCriterion("TRANSACTIONCODE <", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONCODE <=", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeLike(String value) {
            addCriterion("TRANSACTIONCODE like", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeNotLike(String value) {
            addCriterion("TRANSACTIONCODE not like", value, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeIn(List<String> values) {
            addCriterion("TRANSACTIONCODE in", values, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeNotIn(List<String> values) {
            addCriterion("TRANSACTIONCODE not in", values, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeBetween(String value1, String value2) {
            addCriterion("TRANSACTIONCODE between", value1, value2, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andTransactioncodeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONCODE not between", value1, value2, "transactioncode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIsNull() {
            addCriterion("VOUCHERCODE is null");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIsNotNull() {
            addCriterion("VOUCHERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVouchercodeEqualTo(String value) {
            addCriterion("VOUCHERCODE =", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotEqualTo(String value) {
            addCriterion("VOUCHERCODE <>", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeGreaterThan(String value) {
            addCriterion("VOUCHERCODE >", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERCODE >=", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLessThan(String value) {
            addCriterion("VOUCHERCODE <", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERCODE <=", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLike(String value) {
            addCriterion("VOUCHERCODE like", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotLike(String value) {
            addCriterion("VOUCHERCODE not like", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIn(List<String> values) {
            addCriterion("VOUCHERCODE in", values, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotIn(List<String> values) {
            addCriterion("VOUCHERCODE not in", values, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeBetween(String value1, String value2) {
            addCriterion("VOUCHERCODE between", value1, value2, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotBetween(String value1, String value2) {
            addCriterion("VOUCHERCODE not between", value1, value2, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andTransseqIsNull() {
            addCriterion("TRANSSEQ is null");
            return (Criteria) this;
        }

        public Criteria andTransseqIsNotNull() {
            addCriterion("TRANSSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTransseqEqualTo(String value) {
            addCriterion("TRANSSEQ =", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotEqualTo(String value) {
            addCriterion("TRANSSEQ <>", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThan(String value) {
            addCriterion("TRANSSEQ >", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSEQ >=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThan(String value) {
            addCriterion("TRANSSEQ <", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThanOrEqualTo(String value) {
            addCriterion("TRANSSEQ <=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLike(String value) {
            addCriterion("TRANSSEQ like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotLike(String value) {
            addCriterion("TRANSSEQ not like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqIn(List<String> values) {
            addCriterion("TRANSSEQ in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotIn(List<String> values) {
            addCriterion("TRANSSEQ not in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqBetween(String value1, String value2) {
            addCriterion("TRANSSEQ between", value1, value2, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotBetween(String value1, String value2) {
            addCriterion("TRANSSEQ not between", value1, value2, "transseq");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("MSG =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("MSG <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("MSG >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("MSG <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("MSG like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("MSG not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("MSG in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("MSG not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "msg");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bank_inpayment_history
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
     * @Table : mm_bank_inpayment_history
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