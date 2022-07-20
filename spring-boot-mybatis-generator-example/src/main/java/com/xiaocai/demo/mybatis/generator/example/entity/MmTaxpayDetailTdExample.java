package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxpayDetailTdExample {
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
    public MmTaxpayDetailTdExample() {
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
     * @Table : mm_taxpay_detail_td
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

        public Criteria andPayidIsNull() {
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Long value) {
            addCriterion("PAYID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Long value) {
            addCriterion("PAYID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Long value) {
            addCriterion("PAYID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Long value) {
            addCriterion("PAYID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Long value) {
            addCriterion("PAYID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Long> values) {
            addCriterion("PAYID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Long> values) {
            addCriterion("PAYID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Long value1, Long value2) {
            addCriterion("PAYID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Long value1, Long value2) {
            addCriterion("PAYID not between", value1, value2, "payid");
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

        public Criteria andPayNoIsNull() {
            addCriterion("PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("PAY_NO =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("PAY_NO <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("PAY_NO >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NO >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("PAY_NO <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_NO <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("PAY_NO like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("PAY_NO not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("PAY_NO in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("PAY_NO not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("PAY_NO between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("PAY_NO not between", value1, value2, "payNo");
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

        public Criteria andPayTaxIsNull() {
            addCriterion("PAY_TAX is null");
            return (Criteria) this;
        }

        public Criteria andPayTaxIsNotNull() {
            addCriterion("PAY_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andPayTaxEqualTo(BigDecimal value) {
            addCriterion("PAY_TAX =", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxNotEqualTo(BigDecimal value) {
            addCriterion("PAY_TAX <>", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxGreaterThan(BigDecimal value) {
            addCriterion("PAY_TAX >", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_TAX >=", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxLessThan(BigDecimal value) {
            addCriterion("PAY_TAX <", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_TAX <=", value, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxIn(List<BigDecimal> values) {
            addCriterion("PAY_TAX in", values, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxNotIn(List<BigDecimal> values) {
            addCriterion("PAY_TAX not in", values, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_TAX between", value1, value2, "payTax");
            return (Criteria) this;
        }

        public Criteria andPayTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_TAX not between", value1, value2, "payTax");
            return (Criteria) this;
        }

        public Criteria andLateFeeIsNull() {
            addCriterion("LATE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andLateFeeIsNotNull() {
            addCriterion("LATE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andLateFeeEqualTo(BigDecimal value) {
            addCriterion("LATE_FEE =", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeNotEqualTo(BigDecimal value) {
            addCriterion("LATE_FEE <>", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeGreaterThan(BigDecimal value) {
            addCriterion("LATE_FEE >", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATE_FEE >=", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeLessThan(BigDecimal value) {
            addCriterion("LATE_FEE <", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATE_FEE <=", value, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeIn(List<BigDecimal> values) {
            addCriterion("LATE_FEE in", values, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeNotIn(List<BigDecimal> values) {
            addCriterion("LATE_FEE not in", values, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATE_FEE between", value1, value2, "lateFee");
            return (Criteria) this;
        }

        public Criteria andLateFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATE_FEE not between", value1, value2, "lateFee");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("AGENT is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("AGENT =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("AGENT <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("AGENT >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("AGENT <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("AGENT <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("AGENT like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("AGENT not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("AGENT in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("AGENT not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("AGENT between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("AGENT not between", value1, value2, "agent");
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

        public Criteria andConfirmnoIsNull() {
            addCriterion("CONFIRMNO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmnoIsNotNull() {
            addCriterion("CONFIRMNO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmnoEqualTo(String value) {
            addCriterion("CONFIRMNO =", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoNotEqualTo(String value) {
            addCriterion("CONFIRMNO <>", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoGreaterThan(String value) {
            addCriterion("CONFIRMNO >", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMNO >=", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoLessThan(String value) {
            addCriterion("CONFIRMNO <", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMNO <=", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoLike(String value) {
            addCriterion("CONFIRMNO like", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoNotLike(String value) {
            addCriterion("CONFIRMNO not like", value, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoIn(List<String> values) {
            addCriterion("CONFIRMNO in", values, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoNotIn(List<String> values) {
            addCriterion("CONFIRMNO not in", values, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoBetween(String value1, String value2) {
            addCriterion("CONFIRMNO between", value1, value2, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmnoNotBetween(String value1, String value2) {
            addCriterion("CONFIRMNO not between", value1, value2, "confirmno");
            return (Criteria) this;
        }

        public Criteria andConfirmdateIsNull() {
            addCriterion("CONFIRMDATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmdateIsNotNull() {
            addCriterion("CONFIRMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmdateEqualTo(Date value) {
            addCriterion("CONFIRMDATE =", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotEqualTo(Date value) {
            addCriterion("CONFIRMDATE <>", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateGreaterThan(Date value) {
            addCriterion("CONFIRMDATE >", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE >=", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateLessThan(Date value) {
            addCriterion("CONFIRMDATE <", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE <=", value, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateIn(List<Date> values) {
            addCriterion("CONFIRMDATE in", values, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotIn(List<Date> values) {
            addCriterion("CONFIRMDATE not in", values, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE between", value1, value2, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andConfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE not between", value1, value2, "confirmdate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNull() {
            addCriterion("VEHVIN is null");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNotNull() {
            addCriterion("VEHVIN is not null");
            return (Criteria) this;
        }

        public Criteria andVehvinEqualTo(String value) {
            addCriterion("VEHVIN =", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotEqualTo(String value) {
            addCriterion("VEHVIN <>", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThan(String value) {
            addCriterion("VEHVIN >", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThanOrEqualTo(String value) {
            addCriterion("VEHVIN >=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThan(String value) {
            addCriterion("VEHVIN <", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThanOrEqualTo(String value) {
            addCriterion("VEHVIN <=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLike(String value) {
            addCriterion("VEHVIN like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotLike(String value) {
            addCriterion("VEHVIN not like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinIn(List<String> values) {
            addCriterion("VEHVIN in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotIn(List<String> values) {
            addCriterion("VEHVIN not in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinBetween(String value1, String value2) {
            addCriterion("VEHVIN between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotBetween(String value1, String value2) {
            addCriterion("VEHVIN not between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNull() {
            addCriterion("VEHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNotNull() {
            addCriterion("VEHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehtypeEqualTo(String value) {
            addCriterion("VEHTYPE =", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotEqualTo(String value) {
            addCriterion("VEHTYPE <>", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThan(String value) {
            addCriterion("VEHTYPE >", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHTYPE >=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThan(String value) {
            addCriterion("VEHTYPE <", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThanOrEqualTo(String value) {
            addCriterion("VEHTYPE <=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLike(String value) {
            addCriterion("VEHTYPE like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotLike(String value) {
            addCriterion("VEHTYPE not like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeIn(List<String> values) {
            addCriterion("VEHTYPE in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotIn(List<String> values) {
            addCriterion("VEHTYPE not in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeBetween(String value1, String value2) {
            addCriterion("VEHTYPE between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotBetween(String value1, String value2) {
            addCriterion("VEHTYPE not between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNull() {
            addCriterion("TAXPAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNotNull() {
            addCriterion("TAXPAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE =", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <>", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThan(BigDecimal value) {
            addCriterion("TAXPAYABLE >", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE >=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThan(BigDecimal value) {
            addCriterion("TAXPAYABLE <", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE not in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE not between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNull() {
            addCriterion("BACKTAX is null");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNotNull() {
            addCriterion("BACKTAX is not null");
            return (Criteria) this;
        }

        public Criteria andBacktaxEqualTo(BigDecimal value) {
            addCriterion("BACKTAX =", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <>", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThan(BigDecimal value) {
            addCriterion("BACKTAX >", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX >=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThan(BigDecimal value) {
            addCriterion("BACKTAX <", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxIn(List<BigDecimal> values) {
            addCriterion("BACKTAX in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotIn(List<BigDecimal> values) {
            addCriterion("BACKTAX not in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX not between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNull() {
            addCriterion("TAXTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNotNull() {
            addCriterion("TAXTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL =", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL <>", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThan(BigDecimal value) {
            addCriterion("TAXTOTAL >", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL >=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThan(BigDecimal value) {
            addCriterion("TAXTOTAL <", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL <=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIn(List<BigDecimal> values) {
            addCriterion("TAXTOTAL in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotIn(List<BigDecimal> values) {
            addCriterion("TAXTOTAL not in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXTOTAL between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXTOTAL not between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andFailreasonIsNull() {
            addCriterion("FAILREASON is null");
            return (Criteria) this;
        }

        public Criteria andFailreasonIsNotNull() {
            addCriterion("FAILREASON is not null");
            return (Criteria) this;
        }

        public Criteria andFailreasonEqualTo(String value) {
            addCriterion("FAILREASON =", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonNotEqualTo(String value) {
            addCriterion("FAILREASON <>", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonGreaterThan(String value) {
            addCriterion("FAILREASON >", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonGreaterThanOrEqualTo(String value) {
            addCriterion("FAILREASON >=", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonLessThan(String value) {
            addCriterion("FAILREASON <", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonLessThanOrEqualTo(String value) {
            addCriterion("FAILREASON <=", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonLike(String value) {
            addCriterion("FAILREASON like", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonNotLike(String value) {
            addCriterion("FAILREASON not like", value, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonIn(List<String> values) {
            addCriterion("FAILREASON in", values, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonNotIn(List<String> values) {
            addCriterion("FAILREASON not in", values, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonBetween(String value1, String value2) {
            addCriterion("FAILREASON between", value1, value2, "failreason");
            return (Criteria) this;
        }

        public Criteria andFailreasonNotBetween(String value1, String value2) {
            addCriterion("FAILREASON not between", value1, value2, "failreason");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxpay_detail_td
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
     * @Table : mm_taxpay_detail_td
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