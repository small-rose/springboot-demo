package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPaystatusTdExample {
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
    public MmPaystatusTdExample() {
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
     * @Table : mm_paystatus_td
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

        public Criteria andPayablenoIsNull() {
            addCriterion("PAYABLENO is null");
            return (Criteria) this;
        }

        public Criteria andPayablenoIsNotNull() {
            addCriterion("PAYABLENO is not null");
            return (Criteria) this;
        }

        public Criteria andPayablenoEqualTo(Long value) {
            addCriterion("PAYABLENO =", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotEqualTo(Long value) {
            addCriterion("PAYABLENO <>", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThan(Long value) {
            addCriterion("PAYABLENO >", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYABLENO >=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThan(Long value) {
            addCriterion("PAYABLENO <", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThanOrEqualTo(Long value) {
            addCriterion("PAYABLENO <=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoIn(List<Long> values) {
            addCriterion("PAYABLENO in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotIn(List<Long> values) {
            addCriterion("PAYABLENO not in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoBetween(Long value1, Long value2) {
            addCriterion("PAYABLENO between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotBetween(Long value1, Long value2) {
            addCriterion("PAYABLENO not between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("PAYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("PAYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("PAYSTATUS =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("PAYSTATUS <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("PAYSTATUS >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAYSTATUS >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("PAYSTATUS <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("PAYSTATUS <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("PAYSTATUS like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("PAYSTATUS not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("PAYSTATUS in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("PAYSTATUS not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("PAYSTATUS between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("PAYSTATUS not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNull() {
            addCriterion("SOURCENO is null");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNotNull() {
            addCriterion("SOURCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenoEqualTo(Long value) {
            addCriterion("SOURCENO =", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotEqualTo(Long value) {
            addCriterion("SOURCENO <>", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThan(Long value) {
            addCriterion("SOURCENO >", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThanOrEqualTo(Long value) {
            addCriterion("SOURCENO >=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThan(Long value) {
            addCriterion("SOURCENO <", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThanOrEqualTo(Long value) {
            addCriterion("SOURCENO <=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIn(List<Long> values) {
            addCriterion("SOURCENO in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotIn(List<Long> values) {
            addCriterion("SOURCENO not in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoBetween(Long value1, Long value2) {
            addCriterion("SOURCENO between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotBetween(Long value1, Long value2) {
            addCriterion("SOURCENO not between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidIsNull() {
            addCriterion("PLATFORMDETAILID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidIsNotNull() {
            addCriterion("PLATFORMDETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidEqualTo(Long value) {
            addCriterion("PLATFORMDETAILID =", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotEqualTo(Long value) {
            addCriterion("PLATFORMDETAILID <>", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidGreaterThan(Long value) {
            addCriterion("PLATFORMDETAILID >", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("PLATFORMDETAILID >=", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidLessThan(Long value) {
            addCriterion("PLATFORMDETAILID <", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidLessThanOrEqualTo(Long value) {
            addCriterion("PLATFORMDETAILID <=", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidIn(List<Long> values) {
            addCriterion("PLATFORMDETAILID in", values, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotIn(List<Long> values) {
            addCriterion("PLATFORMDETAILID not in", values, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidBetween(Long value1, Long value2) {
            addCriterion("PLATFORMDETAILID between", value1, value2, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotBetween(Long value1, Long value2) {
            addCriterion("PLATFORMDETAILID not between", value1, value2, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("PAYDATE =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("PAYDATE <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("PAYDATE >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYDATE >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("PAYDATE <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("PAYDATE <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("PAYDATE in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("PAYDATE not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("PAYDATE between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("PAYDATE not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNull() {
            addCriterion("PAYMADEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNotNull() {
            addCriterion("PAYMADEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateEqualTo(Date value) {
            addCriterion("PAYMADEDATE =", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotEqualTo(Date value) {
            addCriterion("PAYMADEDATE <>", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThan(Date value) {
            addCriterion("PAYMADEDATE >", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMADEDATE >=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThan(Date value) {
            addCriterion("PAYMADEDATE <", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMADEDATE <=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIn(List<Date> values) {
            addCriterion("PAYMADEDATE in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotIn(List<Date> values) {
            addCriterion("PAYMADEDATE not in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateBetween(Date value1, Date value2) {
            addCriterion("PAYMADEDATE between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMADEDATE not between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeIsNull() {
            addCriterion("PAYRESULTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeIsNotNull() {
            addCriterion("PAYRESULTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeEqualTo(String value) {
            addCriterion("PAYRESULTCODE =", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeNotEqualTo(String value) {
            addCriterion("PAYRESULTCODE <>", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeGreaterThan(String value) {
            addCriterion("PAYRESULTCODE >", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYRESULTCODE >=", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeLessThan(String value) {
            addCriterion("PAYRESULTCODE <", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeLessThanOrEqualTo(String value) {
            addCriterion("PAYRESULTCODE <=", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeLike(String value) {
            addCriterion("PAYRESULTCODE like", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeNotLike(String value) {
            addCriterion("PAYRESULTCODE not like", value, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeIn(List<String> values) {
            addCriterion("PAYRESULTCODE in", values, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeNotIn(List<String> values) {
            addCriterion("PAYRESULTCODE not in", values, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeBetween(String value1, String value2) {
            addCriterion("PAYRESULTCODE between", value1, value2, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultcodeNotBetween(String value1, String value2) {
            addCriterion("PAYRESULTCODE not between", value1, value2, "payresultcode");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIsNull() {
            addCriterion("PAYRESULTINFO is null");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIsNotNull() {
            addCriterion("PAYRESULTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoEqualTo(String value) {
            addCriterion("PAYRESULTINFO =", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotEqualTo(String value) {
            addCriterion("PAYRESULTINFO <>", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoGreaterThan(String value) {
            addCriterion("PAYRESULTINFO >", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYRESULTINFO >=", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLessThan(String value) {
            addCriterion("PAYRESULTINFO <", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLessThanOrEqualTo(String value) {
            addCriterion("PAYRESULTINFO <=", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLike(String value) {
            addCriterion("PAYRESULTINFO like", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotLike(String value) {
            addCriterion("PAYRESULTINFO not like", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIn(List<String> values) {
            addCriterion("PAYRESULTINFO in", values, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotIn(List<String> values) {
            addCriterion("PAYRESULTINFO not in", values, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoBetween(String value1, String value2) {
            addCriterion("PAYRESULTINFO between", value1, value2, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotBetween(String value1, String value2) {
            addCriterion("PAYRESULTINFO not between", value1, value2, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNull() {
            addCriterion("REFUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNotNull() {
            addCriterion("REFUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeEqualTo(Date value) {
            addCriterion("REFUNDTIME =", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotEqualTo(Date value) {
            addCriterion("REFUNDTIME <>", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThan(Date value) {
            addCriterion("REFUNDTIME >", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUNDTIME >=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThan(Date value) {
            addCriterion("REFUNDTIME <", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUNDTIME <=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIn(List<Date> values) {
            addCriterion("REFUNDTIME in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotIn(List<Date> values) {
            addCriterion("REFUNDTIME not in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeBetween(Date value1, Date value2) {
            addCriterion("REFUNDTIME between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUNDTIME not between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNull() {
            addCriterion("REFUNDINFO is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNotNull() {
            addCriterion("REFUNDINFO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoEqualTo(String value) {
            addCriterion("REFUNDINFO =", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotEqualTo(String value) {
            addCriterion("REFUNDINFO <>", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThan(String value) {
            addCriterion("REFUNDINFO >", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDINFO >=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThan(String value) {
            addCriterion("REFUNDINFO <", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThanOrEqualTo(String value) {
            addCriterion("REFUNDINFO <=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLike(String value) {
            addCriterion("REFUNDINFO like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotLike(String value) {
            addCriterion("REFUNDINFO not like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIn(List<String> values) {
            addCriterion("REFUNDINFO in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotIn(List<String> values) {
            addCriterion("REFUNDINFO not in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoBetween(String value1, String value2) {
            addCriterion("REFUNDINFO between", value1, value2, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotBetween(String value1, String value2) {
            addCriterion("REFUNDINFO not between", value1, value2, "refundinfo");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_paystatus_td
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
     * @Table : mm_paystatus_td
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