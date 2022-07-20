package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmClaimTdExample {
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
    public MmClaimTdExample() {
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
     * @Table : mm_claim_td
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSeqpaymentIsNull() {
            addCriterion("SEQPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentIsNotNull() {
            addCriterion("SEQPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentEqualTo(Long value) {
            addCriterion("SEQPAYMENT =", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentNotEqualTo(Long value) {
            addCriterion("SEQPAYMENT <>", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentGreaterThan(Long value) {
            addCriterion("SEQPAYMENT >", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQPAYMENT >=", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentLessThan(Long value) {
            addCriterion("SEQPAYMENT <", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentLessThanOrEqualTo(Long value) {
            addCriterion("SEQPAYMENT <=", value, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentIn(List<Long> values) {
            addCriterion("SEQPAYMENT in", values, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentNotIn(List<Long> values) {
            addCriterion("SEQPAYMENT not in", values, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentBetween(Long value1, Long value2) {
            addCriterion("SEQPAYMENT between", value1, value2, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentNotBetween(Long value1, Long value2) {
            addCriterion("SEQPAYMENT not between", value1, value2, "seqpayment");
            return (Criteria) this;
        }

        public Criteria andSeqclaimIsNull() {
            addCriterion("SEQCLAIM is null");
            return (Criteria) this;
        }

        public Criteria andSeqclaimIsNotNull() {
            addCriterion("SEQCLAIM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqclaimEqualTo(Long value) {
            addCriterion("SEQCLAIM =", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimNotEqualTo(Long value) {
            addCriterion("SEQCLAIM <>", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimGreaterThan(Long value) {
            addCriterion("SEQCLAIM >", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQCLAIM >=", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimLessThan(Long value) {
            addCriterion("SEQCLAIM <", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimLessThanOrEqualTo(Long value) {
            addCriterion("SEQCLAIM <=", value, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimIn(List<Long> values) {
            addCriterion("SEQCLAIM in", values, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimNotIn(List<Long> values) {
            addCriterion("SEQCLAIM not in", values, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimBetween(Long value1, Long value2) {
            addCriterion("SEQCLAIM between", value1, value2, "seqclaim");
            return (Criteria) this;
        }

        public Criteria andSeqclaimNotBetween(Long value1, Long value2) {
            addCriterion("SEQCLAIM not between", value1, value2, "seqclaim");
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

        public Criteria andCasenoIsNull() {
            addCriterion("CASENO is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CASENO is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CASENO =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CASENO <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CASENO >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CASENO >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CASENO <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CASENO <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CASENO like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CASENO not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CASENO in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CASENO not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CASENO between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CASENO not between", value1, value2, "caseno");
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

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNull() {
            addCriterion("BUSINESSATTR is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("BUSINESSATTR is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("BUSINESSATTR =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("BUSINESSATTR <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("BUSINESSATTR >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("BUSINESSATTR <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("BUSINESSATTR like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("BUSINESSATTR not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("BUSINESSATTR in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("BUSINESSATTR not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNull() {
            addCriterion("TRANSACTORCODE is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("TRANSACTORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("TRANSACTORCODE =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("TRANSACTORCODE <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("TRANSACTORCODE >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("TRANSACTORCODE <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("TRANSACTORCODE like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("TRANSACTORCODE not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("TRANSACTORCODE in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("TRANSACTORCODE not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("BUSINESSCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("BUSINESSCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("BUSINESSCHANNEL >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("BUSINESSCHANNEL <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("BUSINESSCHANNEL like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("BUSINESSCHANNEL not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL not between", value1, value2, "businesschannel");
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

        public Criteria andClasseskindIsNull() {
            addCriterion("CLASSESKIND is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNotNull() {
            addCriterion("CLASSESKIND is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindEqualTo(String value) {
            addCriterion("CLASSESKIND =", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotEqualTo(String value) {
            addCriterion("CLASSESKIND <>", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThan(String value) {
            addCriterion("CLASSESKIND >", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND >=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThan(String value) {
            addCriterion("CLASSESKIND <", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND <=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLike(String value) {
            addCriterion("CLASSESKIND like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotLike(String value) {
            addCriterion("CLASSESKIND not like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindIn(List<String> values) {
            addCriterion("CLASSESKIND in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotIn(List<String> values) {
            addCriterion("CLASSESKIND not in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindBetween(String value1, String value2) {
            addCriterion("CLASSESKIND between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotBetween(String value1, String value2) {
            addCriterion("CLASSESKIND not between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AUDITDATE =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AUDITDATE <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AUDITDATE >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AUDITDATE <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AUDITDATE in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AUDITDATE not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE not between", value1, value2, "auditdate");
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

        public Criteria andBaseaccountamountIsNull() {
            addCriterion("BASEACCOUNTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIsNotNull() {
            addCriterion("BASEACCOUNTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT =", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <>", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThan(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT >", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT >=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThan(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEACCOUNTAMOUNT <=", value, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountIn(List<BigDecimal> values) {
            addCriterion("BASEACCOUNTAMOUNT in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEACCOUNTAMOUNT not in", values, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEACCOUNTAMOUNT between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBaseaccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEACCOUNTAMOUNT not between", value1, value2, "baseaccountamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNull() {
            addCriterion("BASERECEIVABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIsNotNull() {
            addCriterion("BASERECEIVABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT =", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <>", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThan(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT >", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT >=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThan(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASERECEIVABLEAMOUNT <=", value, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountIn(List<BigDecimal> values) {
            addCriterion("BASERECEIVABLEAMOUNT in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("BASERECEIVABLEAMOUNT not in", values, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASERECEIVABLEAMOUNT between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBasereceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASERECEIVABLEAMOUNT not between", value1, value2, "basereceivableamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNull() {
            addCriterion("BASEREALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNotNull() {
            addCriterion("BASEREALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT =", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <>", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThan(BigDecimal value) {
            addCriterion("BASEREALAMOUNT >", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT >=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThan(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEREALAMOUNT <=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIn(List<BigDecimal> values) {
            addCriterion("BASEREALAMOUNT in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEREALAMOUNT not in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEREALAMOUNT between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEREALAMOUNT not between", value1, value2, "baserealamount");
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

        public Criteria andReceivableamountIsNull() {
            addCriterion("RECEIVABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIsNotNull() {
            addCriterion("RECEIVABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableamountEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT =", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <>", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThan(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT >", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT >=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThan(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEAMOUNT <=", value, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEAMOUNT in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEAMOUNT not in", values, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEAMOUNT between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andReceivableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEAMOUNT not between", value1, value2, "receivableamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNull() {
            addCriterion("REALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNotNull() {
            addCriterion("REALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealamountEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT =", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <>", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThan(BigDecimal value) {
            addCriterion("REALAMOUNT >", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT >=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThan(BigDecimal value) {
            addCriterion("REALAMOUNT <", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT not in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT not between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNull() {
            addCriterion("AGIOTAGEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIsNotNull() {
            addCriterion("AGIOTAGEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT =", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <>", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThan(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT >", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT >=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThan(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGIOTAGEAMOUNT <=", value, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountIn(List<BigDecimal> values) {
            addCriterion("AGIOTAGEAMOUNT in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotIn(List<BigDecimal> values) {
            addCriterion("AGIOTAGEAMOUNT not in", values, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGIOTAGEAMOUNT between", value1, value2, "agiotageamount");
            return (Criteria) this;
        }

        public Criteria andAgiotageamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGIOTAGEAMOUNT not between", value1, value2, "agiotageamount");
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

        public Criteria andClaimtypeIsNull() {
            addCriterion("CLAIMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNotNull() {
            addCriterion("CLAIMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeEqualTo(String value) {
            addCriterion("CLAIMTYPE =", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotEqualTo(String value) {
            addCriterion("CLAIMTYPE <>", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThan(String value) {
            addCriterion("CLAIMTYPE >", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE >=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThan(String value) {
            addCriterion("CLAIMTYPE <", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE <=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLike(String value) {
            addCriterion("CLAIMTYPE like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotLike(String value) {
            addCriterion("CLAIMTYPE not like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIn(List<String> values) {
            addCriterion("CLAIMTYPE in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotIn(List<String> values) {
            addCriterion("CLAIMTYPE not in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE not between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNull() {
            addCriterion("INPAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNotNull() {
            addCriterion("INPAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD =", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <>", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThan(String value) {
            addCriterion("INPAYMENTMETHOD >", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD >=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThan(String value) {
            addCriterion("INPAYMENTMETHOD <", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLike(String value) {
            addCriterion("INPAYMENTMETHOD like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotLike(String value) {
            addCriterion("INPAYMENTMETHOD not like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD not in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD not between", value1, value2, "inpaymentmethod");
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

        public Criteria andOpstatusIsNull() {
            addCriterion("OPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("OPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("OPSTATUS =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("OPSTATUS <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("OPSTATUS >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTATUS >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("OPSTATUS <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("OPSTATUS <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("OPSTATUS like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("OPSTATUS not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("OPSTATUS in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("OPSTATUS not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("OPSTATUS between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("OPSTATUS not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DATASOURCE like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DATASOURCE not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
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

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
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

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyIsNull() {
            addCriterion("PAYSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyIsNotNull() {
            addCriterion("PAYSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyEqualTo(String value) {
            addCriterion("PAYSUBCOMPANY =", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyNotEqualTo(String value) {
            addCriterion("PAYSUBCOMPANY <>", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyGreaterThan(String value) {
            addCriterion("PAYSUBCOMPANY >", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PAYSUBCOMPANY >=", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyLessThan(String value) {
            addCriterion("PAYSUBCOMPANY <", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyLessThanOrEqualTo(String value) {
            addCriterion("PAYSUBCOMPANY <=", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyLike(String value) {
            addCriterion("PAYSUBCOMPANY like", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyNotLike(String value) {
            addCriterion("PAYSUBCOMPANY not like", value, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyIn(List<String> values) {
            addCriterion("PAYSUBCOMPANY in", values, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyNotIn(List<String> values) {
            addCriterion("PAYSUBCOMPANY not in", values, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyBetween(String value1, String value2) {
            addCriterion("PAYSUBCOMPANY between", value1, value2, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andPaysubcompanyNotBetween(String value1, String value2) {
            addCriterion("PAYSUBCOMPANY not between", value1, value2, "paysubcompany");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayIsNull() {
            addCriterion("IFCORSSPAY is null");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayIsNotNull() {
            addCriterion("IFCORSSPAY is not null");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayEqualTo(String value) {
            addCriterion("IFCORSSPAY =", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayNotEqualTo(String value) {
            addCriterion("IFCORSSPAY <>", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayGreaterThan(String value) {
            addCriterion("IFCORSSPAY >", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayGreaterThanOrEqualTo(String value) {
            addCriterion("IFCORSSPAY >=", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayLessThan(String value) {
            addCriterion("IFCORSSPAY <", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayLessThanOrEqualTo(String value) {
            addCriterion("IFCORSSPAY <=", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayLike(String value) {
            addCriterion("IFCORSSPAY like", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayNotLike(String value) {
            addCriterion("IFCORSSPAY not like", value, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayIn(List<String> values) {
            addCriterion("IFCORSSPAY in", values, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayNotIn(List<String> values) {
            addCriterion("IFCORSSPAY not in", values, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayBetween(String value1, String value2) {
            addCriterion("IFCORSSPAY between", value1, value2, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andIfcorsspayNotBetween(String value1, String value2) {
            addCriterion("IFCORSSPAY not between", value1, value2, "ifcorsspay");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceIsNull() {
            addCriterion("ADVANCESEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceIsNotNull() {
            addCriterion("ADVANCESEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceEqualTo(String value) {
            addCriterion("ADVANCESEQUENCE =", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceNotEqualTo(String value) {
            addCriterion("ADVANCESEQUENCE <>", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceGreaterThan(String value) {
            addCriterion("ADVANCESEQUENCE >", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCESEQUENCE >=", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceLessThan(String value) {
            addCriterion("ADVANCESEQUENCE <", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceLessThanOrEqualTo(String value) {
            addCriterion("ADVANCESEQUENCE <=", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceLike(String value) {
            addCriterion("ADVANCESEQUENCE like", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceNotLike(String value) {
            addCriterion("ADVANCESEQUENCE not like", value, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceIn(List<String> values) {
            addCriterion("ADVANCESEQUENCE in", values, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceNotIn(List<String> values) {
            addCriterion("ADVANCESEQUENCE not in", values, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceBetween(String value1, String value2) {
            addCriterion("ADVANCESEQUENCE between", value1, value2, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andAdvancesequenceNotBetween(String value1, String value2) {
            addCriterion("ADVANCESEQUENCE not between", value1, value2, "advancesequence");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("SERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("SERIALNO like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("SERIALNO not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNull() {
            addCriterion("CUSTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNotNull() {
            addCriterion("CUSTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustseqEqualTo(String value) {
            addCriterion("CUSTSEQ =", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotEqualTo(String value) {
            addCriterion("CUSTSEQ <>", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThan(String value) {
            addCriterion("CUSTSEQ >", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ >=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThan(String value) {
            addCriterion("CUSTSEQ <", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ <=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLike(String value) {
            addCriterion("CUSTSEQ like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotLike(String value) {
            addCriterion("CUSTSEQ not like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqIn(List<String> values) {
            addCriterion("CUSTSEQ in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotIn(List<String> values) {
            addCriterion("CUSTSEQ not in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqBetween(String value1, String value2) {
            addCriterion("CUSTSEQ between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotBetween(String value1, String value2) {
            addCriterion("CUSTSEQ not between", value1, value2, "custseq");
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

        public Criteria andIscoinsuranceIsNull() {
            addCriterion("ISCOINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIsNotNull() {
            addCriterion("ISCOINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceEqualTo(String value) {
            addCriterion("ISCOINSURANCE =", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotEqualTo(String value) {
            addCriterion("ISCOINSURANCE <>", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThan(String value) {
            addCriterion("ISCOINSURANCE >", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOINSURANCE >=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThan(String value) {
            addCriterion("ISCOINSURANCE <", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLessThanOrEqualTo(String value) {
            addCriterion("ISCOINSURANCE <=", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceLike(String value) {
            addCriterion("ISCOINSURANCE like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotLike(String value) {
            addCriterion("ISCOINSURANCE not like", value, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceIn(List<String> values) {
            addCriterion("ISCOINSURANCE in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotIn(List<String> values) {
            addCriterion("ISCOINSURANCE not in", values, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceBetween(String value1, String value2) {
            addCriterion("ISCOINSURANCE between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andIscoinsuranceNotBetween(String value1, String value2) {
            addCriterion("ISCOINSURANCE not between", value1, value2, "iscoinsurance");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNull() {
            addCriterion("INSUREDCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNotNull() {
            addCriterion("INSUREDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeEqualTo(String value) {
            addCriterion("INSUREDCODE =", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotEqualTo(String value) {
            addCriterion("INSUREDCODE <>", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThan(String value) {
            addCriterion("INSUREDCODE >", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE >=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThan(String value) {
            addCriterion("INSUREDCODE <", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE <=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLike(String value) {
            addCriterion("INSUREDCODE like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotLike(String value) {
            addCriterion("INSUREDCODE not like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIn(List<String> values) {
            addCriterion("INSUREDCODE in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotIn(List<String> values) {
            addCriterion("INSUREDCODE not in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeBetween(String value1, String value2) {
            addCriterion("INSUREDCODE between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotBetween(String value1, String value2) {
            addCriterion("INSUREDCODE not between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNull() {
            addCriterion("INSUREDNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNotNull() {
            addCriterion("INSUREDNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenEqualTo(String value) {
            addCriterion("INSUREDNAMEEN =", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <>", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThan(String value) {
            addCriterion("INSUREDNAMEEN >", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN >=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThan(String value) {
            addCriterion("INSUREDNAMEEN <", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLike(String value) {
            addCriterion("INSUREDNAMEEN like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotLike(String value) {
            addCriterion("INSUREDNAMEEN not like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIn(List<String> values) {
            addCriterion("INSUREDNAMEEN in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotIn(List<String> values) {
            addCriterion("INSUREDNAMEEN not in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN not between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNull() {
            addCriterion("INSUREDPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNotNull() {
            addCriterion("INSUREDPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoEqualTo(String value) {
            addCriterion("INSUREDPARTYNO =", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <>", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThan(String value) {
            addCriterion("INSUREDPARTYNO >", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO >=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThan(String value) {
            addCriterion("INSUREDPARTYNO <", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLike(String value) {
            addCriterion("INSUREDPARTYNO like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotLike(String value) {
            addCriterion("INSUREDPARTYNO not like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIn(List<String> values) {
            addCriterion("INSUREDPARTYNO in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotIn(List<String> values) {
            addCriterion("INSUREDPARTYNO not in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO not between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNull() {
            addCriterion("APPLICANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNotNull() {
            addCriterion("APPLICANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeEqualTo(String value) {
            addCriterion("APPLICANTCODE =", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotEqualTo(String value) {
            addCriterion("APPLICANTCODE <>", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThan(String value) {
            addCriterion("APPLICANTCODE >", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE >=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThan(String value) {
            addCriterion("APPLICANTCODE <", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE <=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLike(String value) {
            addCriterion("APPLICANTCODE like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotLike(String value) {
            addCriterion("APPLICANTCODE not like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIn(List<String> values) {
            addCriterion("APPLICANTCODE in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotIn(List<String> values) {
            addCriterion("APPLICANTCODE not in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE not between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNull() {
            addCriterion("APPLICANTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNotNull() {
            addCriterion("APPLICANTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnEqualTo(String value) {
            addCriterion("APPLICANTNAMECN =", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <>", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThan(String value) {
            addCriterion("APPLICANTNAMECN >", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN >=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThan(String value) {
            addCriterion("APPLICANTNAMECN <", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLike(String value) {
            addCriterion("APPLICANTNAMECN like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotLike(String value) {
            addCriterion("APPLICANTNAMECN not like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIn(List<String> values) {
            addCriterion("APPLICANTNAMECN in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotIn(List<String> values) {
            addCriterion("APPLICANTNAMECN not in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN not between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNull() {
            addCriterion("APPLICANTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNotNull() {
            addCriterion("APPLICANTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN =", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <>", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThan(String value) {
            addCriterion("APPLICANTNAMEEN >", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN >=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThan(String value) {
            addCriterion("APPLICANTNAMEEN <", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLike(String value) {
            addCriterion("APPLICANTNAMEEN like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotLike(String value) {
            addCriterion("APPLICANTNAMEEN not like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN not in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN not between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNull() {
            addCriterion("APPLICANTIONPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNotNull() {
            addCriterion("APPLICANTIONPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO =", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <>", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThan(String value) {
            addCriterion("APPLICANTIONPARTYNO >", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO >=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThan(String value) {
            addCriterion("APPLICANTIONPARTYNO <", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLike(String value) {
            addCriterion("APPLICANTIONPARTYNO like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotLike(String value) {
            addCriterion("APPLICANTIONPARTYNO not like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO not in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO not between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNull() {
            addCriterion("APPISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNotNull() {
            addCriterion("APPISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanEqualTo(String value) {
            addCriterion("APPISJAPAN =", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotEqualTo(String value) {
            addCriterion("APPISJAPAN <>", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThan(String value) {
            addCriterion("APPISJAPAN >", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN >=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThan(String value) {
            addCriterion("APPISJAPAN <", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN <=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLike(String value) {
            addCriterion("APPISJAPAN like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotLike(String value) {
            addCriterion("APPISJAPAN not like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIn(List<String> values) {
            addCriterion("APPISJAPAN in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotIn(List<String> values) {
            addCriterion("APPISJAPAN not in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanBetween(String value1, String value2) {
            addCriterion("APPISJAPAN between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotBetween(String value1, String value2) {
            addCriterion("APPISJAPAN not between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("DOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("DOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(String value) {
            addCriterion("DOMESTIC =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(String value) {
            addCriterion("DOMESTIC <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(String value) {
            addCriterion("DOMESTIC >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(String value) {
            addCriterion("DOMESTIC <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLike(String value) {
            addCriterion("DOMESTIC like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotLike(String value) {
            addCriterion("DOMESTIC not like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<String> values) {
            addCriterion("DOMESTIC in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<String> values) {
            addCriterion("DOMESTIC not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(String value1, String value2) {
            addCriterion("DOMESTIC between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC not between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNull() {
            addCriterion("PORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNotNull() {
            addCriterion("PORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPorttypeEqualTo(String value) {
            addCriterion("PORTTYPE =", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotEqualTo(String value) {
            addCriterion("PORTTYPE <>", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThan(String value) {
            addCriterion("PORTTYPE >", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTTYPE >=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThan(String value) {
            addCriterion("PORTTYPE <", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThanOrEqualTo(String value) {
            addCriterion("PORTTYPE <=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLike(String value) {
            addCriterion("PORTTYPE like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotLike(String value) {
            addCriterion("PORTTYPE not like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeIn(List<String> values) {
            addCriterion("PORTTYPE in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotIn(List<String> values) {
            addCriterion("PORTTYPE not in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeBetween(String value1, String value2) {
            addCriterion("PORTTYPE between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotBetween(String value1, String value2) {
            addCriterion("PORTTYPE not between", value1, value2, "porttype");
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

        public Criteria andOffsetnoIsNull() {
            addCriterion("OFFSETNO is null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNotNull() {
            addCriterion("OFFSETNO is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoEqualTo(String value) {
            addCriterion("OFFSETNO =", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotEqualTo(String value) {
            addCriterion("OFFSETNO <>", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThan(String value) {
            addCriterion("OFFSETNO >", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETNO >=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThan(String value) {
            addCriterion("OFFSETNO <", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThanOrEqualTo(String value) {
            addCriterion("OFFSETNO <=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLike(String value) {
            addCriterion("OFFSETNO like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotLike(String value) {
            addCriterion("OFFSETNO not like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIn(List<String> values) {
            addCriterion("OFFSETNO in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotIn(List<String> values) {
            addCriterion("OFFSETNO not in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoBetween(String value1, String value2) {
            addCriterion("OFFSETNO between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotBetween(String value1, String value2) {
            addCriterion("OFFSETNO not between", value1, value2, "offsetno");
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

        public Criteria andCustisjapanIsNull() {
            addCriterion("CUSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNotNull() {
            addCriterion("CUSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanEqualTo(String value) {
            addCriterion("CUSTISJAPAN =", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotEqualTo(String value) {
            addCriterion("CUSTISJAPAN <>", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThan(String value) {
            addCriterion("CUSTISJAPAN >", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN >=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThan(String value) {
            addCriterion("CUSTISJAPAN <", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN <=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLike(String value) {
            addCriterion("CUSTISJAPAN like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotLike(String value) {
            addCriterion("CUSTISJAPAN not like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIn(List<String> values) {
            addCriterion("CUSTISJAPAN in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotIn(List<String> values) {
            addCriterion("CUSTISJAPAN not in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN not between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNull() {
            addCriterion("AGENTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNotNull() {
            addCriterion("AGENTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnEqualTo(String value) {
            addCriterion("AGENTNAMECN =", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotEqualTo(String value) {
            addCriterion("AGENTNAMECN <>", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThan(String value) {
            addCriterion("AGENTNAMECN >", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN >=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThan(String value) {
            addCriterion("AGENTNAMECN <", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN <=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLike(String value) {
            addCriterion("AGENTNAMECN like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotLike(String value) {
            addCriterion("AGENTNAMECN not like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIn(List<String> values) {
            addCriterion("AGENTNAMECN in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotIn(List<String> values) {
            addCriterion("AGENTNAMECN not in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN not between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNull() {
            addCriterion("AGENTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNotNull() {
            addCriterion("AGENTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenEqualTo(String value) {
            addCriterion("AGENTNAMEEN =", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotEqualTo(String value) {
            addCriterion("AGENTNAMEEN <>", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThan(String value) {
            addCriterion("AGENTNAMEEN >", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN >=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThan(String value) {
            addCriterion("AGENTNAMEEN <", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN <=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLike(String value) {
            addCriterion("AGENTNAMEEN like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotLike(String value) {
            addCriterion("AGENTNAMEEN not like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIn(List<String> values) {
            addCriterion("AGENTNAMEEN in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotIn(List<String> values) {
            addCriterion("AGENTNAMEEN not in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN not between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNull() {
            addCriterion("AGENTPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNotNull() {
            addCriterion("AGENTPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoEqualTo(String value) {
            addCriterion("AGENTPARTYNO =", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotEqualTo(String value) {
            addCriterion("AGENTPARTYNO <>", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThan(String value) {
            addCriterion("AGENTPARTYNO >", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO >=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThan(String value) {
            addCriterion("AGENTPARTYNO <", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO <=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLike(String value) {
            addCriterion("AGENTPARTYNO like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotLike(String value) {
            addCriterion("AGENTPARTYNO not like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIn(List<String> values) {
            addCriterion("AGENTPARTYNO in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotIn(List<String> values) {
            addCriterion("AGENTPARTYNO not in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO not between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
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

        public Criteria andCustaccountnameenIsNull() {
            addCriterion("CUSTACCOUNTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNotNull() {
            addCriterion("CUSTACCOUNTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN =", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <>", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN not like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN not in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN not between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNull() {
            addCriterion("CHARGEDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNotNull() {
            addCriterion("CHARGEDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION =", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION <>", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThan(String value) {
            addCriterion("CHARGEDESCRIPTION >", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION >=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThan(String value) {
            addCriterion("CHARGEDESCRIPTION <", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThanOrEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION <=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLike(String value) {
            addCriterion("CHARGEDESCRIPTION like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotLike(String value) {
            addCriterion("CHARGEDESCRIPTION not like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIn(List<String> values) {
            addCriterion("CHARGEDESCRIPTION in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotIn(List<String> values) {
            addCriterion("CHARGEDESCRIPTION not in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionBetween(String value1, String value2) {
            addCriterion("CHARGEDESCRIPTION between", value1, value2, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotBetween(String value1, String value2) {
            addCriterion("CHARGEDESCRIPTION not between", value1, value2, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNull() {
            addCriterion("INSURANCETERM is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNotNull() {
            addCriterion("INSURANCETERM is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermEqualTo(String value) {
            addCriterion("INSURANCETERM =", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotEqualTo(String value) {
            addCriterion("INSURANCETERM <>", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThan(String value) {
            addCriterion("INSURANCETERM >", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM >=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThan(String value) {
            addCriterion("INSURANCETERM <", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM <=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLike(String value) {
            addCriterion("INSURANCETERM like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotLike(String value) {
            addCriterion("INSURANCETERM not like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIn(List<String> values) {
            addCriterion("INSURANCETERM in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotIn(List<String> values) {
            addCriterion("INSURANCETERM not in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermBetween(String value1, String value2) {
            addCriterion("INSURANCETERM between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotBetween(String value1, String value2) {
            addCriterion("INSURANCETERM not between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeIsNull() {
            addCriterion("RECOVERYCODE is null");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeIsNotNull() {
            addCriterion("RECOVERYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeEqualTo(String value) {
            addCriterion("RECOVERYCODE =", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeNotEqualTo(String value) {
            addCriterion("RECOVERYCODE <>", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeGreaterThan(String value) {
            addCriterion("RECOVERYCODE >", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECOVERYCODE >=", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeLessThan(String value) {
            addCriterion("RECOVERYCODE <", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeLessThanOrEqualTo(String value) {
            addCriterion("RECOVERYCODE <=", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeLike(String value) {
            addCriterion("RECOVERYCODE like", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeNotLike(String value) {
            addCriterion("RECOVERYCODE not like", value, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeIn(List<String> values) {
            addCriterion("RECOVERYCODE in", values, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeNotIn(List<String> values) {
            addCriterion("RECOVERYCODE not in", values, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeBetween(String value1, String value2) {
            addCriterion("RECOVERYCODE between", value1, value2, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andRecoverycodeNotBetween(String value1, String value2) {
            addCriterion("RECOVERYCODE not between", value1, value2, "recoverycode");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNull() {
            addCriterion("EXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNotNull() {
            addCriterion("EXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExstatusEqualTo(String value) {
            addCriterion("EXSTATUS =", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotEqualTo(String value) {
            addCriterion("EXSTATUS <>", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThan(String value) {
            addCriterion("EXSTATUS >", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXSTATUS >=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThan(String value) {
            addCriterion("EXSTATUS <", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThanOrEqualTo(String value) {
            addCriterion("EXSTATUS <=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLike(String value) {
            addCriterion("EXSTATUS like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotLike(String value) {
            addCriterion("EXSTATUS not like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusIn(List<String> values) {
            addCriterion("EXSTATUS in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotIn(List<String> values) {
            addCriterion("EXSTATUS not in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusBetween(String value1, String value2) {
            addCriterion("EXSTATUS between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotBetween(String value1, String value2) {
            addCriterion("EXSTATUS not between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNull() {
            addCriterion("EXCEPTIONCAUSE is null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNotNull() {
            addCriterion("EXCEPTIONCAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE =", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <>", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThan(String value) {
            addCriterion("EXCEPTIONCAUSE >", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE >=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThan(String value) {
            addCriterion("EXCEPTIONCAUSE <", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLike(String value) {
            addCriterion("EXCEPTIONCAUSE like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotLike(String value) {
            addCriterion("EXCEPTIONCAUSE not like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE not in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE not between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andBanksIsNull() {
            addCriterion("BANKS is null");
            return (Criteria) this;
        }

        public Criteria andBanksIsNotNull() {
            addCriterion("BANKS is not null");
            return (Criteria) this;
        }

        public Criteria andBanksEqualTo(String value) {
            addCriterion("BANKS =", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksNotEqualTo(String value) {
            addCriterion("BANKS <>", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksGreaterThan(String value) {
            addCriterion("BANKS >", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksGreaterThanOrEqualTo(String value) {
            addCriterion("BANKS >=", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksLessThan(String value) {
            addCriterion("BANKS <", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksLessThanOrEqualTo(String value) {
            addCriterion("BANKS <=", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksLike(String value) {
            addCriterion("BANKS like", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksNotLike(String value) {
            addCriterion("BANKS not like", value, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksIn(List<String> values) {
            addCriterion("BANKS in", values, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksNotIn(List<String> values) {
            addCriterion("BANKS not in", values, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksBetween(String value1, String value2) {
            addCriterion("BANKS between", value1, value2, "banks");
            return (Criteria) this;
        }

        public Criteria andBanksNotBetween(String value1, String value2) {
            addCriterion("BANKS not between", value1, value2, "banks");
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

        public Criteria andPayeecityIsNull() {
            addCriterion("PAYEECITY is null");
            return (Criteria) this;
        }

        public Criteria andPayeecityIsNotNull() {
            addCriterion("PAYEECITY is not null");
            return (Criteria) this;
        }

        public Criteria andPayeecityEqualTo(String value) {
            addCriterion("PAYEECITY =", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityNotEqualTo(String value) {
            addCriterion("PAYEECITY <>", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityGreaterThan(String value) {
            addCriterion("PAYEECITY >", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEECITY >=", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityLessThan(String value) {
            addCriterion("PAYEECITY <", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityLessThanOrEqualTo(String value) {
            addCriterion("PAYEECITY <=", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityLike(String value) {
            addCriterion("PAYEECITY like", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityNotLike(String value) {
            addCriterion("PAYEECITY not like", value, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityIn(List<String> values) {
            addCriterion("PAYEECITY in", values, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityNotIn(List<String> values) {
            addCriterion("PAYEECITY not in", values, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityBetween(String value1, String value2) {
            addCriterion("PAYEECITY between", value1, value2, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeecityNotBetween(String value1, String value2) {
            addCriterion("PAYEECITY not between", value1, value2, "payeecity");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceIsNull() {
            addCriterion("PAYEEPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceIsNotNull() {
            addCriterion("PAYEEPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceEqualTo(String value) {
            addCriterion("PAYEEPROVINCE =", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceNotEqualTo(String value) {
            addCriterion("PAYEEPROVINCE <>", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceGreaterThan(String value) {
            addCriterion("PAYEEPROVINCE >", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEPROVINCE >=", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceLessThan(String value) {
            addCriterion("PAYEEPROVINCE <", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceLessThanOrEqualTo(String value) {
            addCriterion("PAYEEPROVINCE <=", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceLike(String value) {
            addCriterion("PAYEEPROVINCE like", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceNotLike(String value) {
            addCriterion("PAYEEPROVINCE not like", value, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceIn(List<String> values) {
            addCriterion("PAYEEPROVINCE in", values, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceNotIn(List<String> values) {
            addCriterion("PAYEEPROVINCE not in", values, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceBetween(String value1, String value2) {
            addCriterion("PAYEEPROVINCE between", value1, value2, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andPayeeprovinceNotBetween(String value1, String value2) {
            addCriterion("PAYEEPROVINCE not between", value1, value2, "payeeprovince");
            return (Criteria) this;
        }

        public Criteria andDefraymodeIsNull() {
            addCriterion("DEFRAYMODE is null");
            return (Criteria) this;
        }

        public Criteria andDefraymodeIsNotNull() {
            addCriterion("DEFRAYMODE is not null");
            return (Criteria) this;
        }

        public Criteria andDefraymodeEqualTo(String value) {
            addCriterion("DEFRAYMODE =", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeNotEqualTo(String value) {
            addCriterion("DEFRAYMODE <>", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeGreaterThan(String value) {
            addCriterion("DEFRAYMODE >", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEFRAYMODE >=", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeLessThan(String value) {
            addCriterion("DEFRAYMODE <", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeLessThanOrEqualTo(String value) {
            addCriterion("DEFRAYMODE <=", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeLike(String value) {
            addCriterion("DEFRAYMODE like", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeNotLike(String value) {
            addCriterion("DEFRAYMODE not like", value, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeIn(List<String> values) {
            addCriterion("DEFRAYMODE in", values, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeNotIn(List<String> values) {
            addCriterion("DEFRAYMODE not in", values, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeBetween(String value1, String value2) {
            addCriterion("DEFRAYMODE between", value1, value2, "defraymode");
            return (Criteria) this;
        }

        public Criteria andDefraymodeNotBetween(String value1, String value2) {
            addCriterion("DEFRAYMODE not between", value1, value2, "defraymode");
            return (Criteria) this;
        }

        public Criteria andClaimflagIsNull() {
            addCriterion("CLAIMFLAG is null");
            return (Criteria) this;
        }

        public Criteria andClaimflagIsNotNull() {
            addCriterion("CLAIMFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andClaimflagEqualTo(Long value) {
            addCriterion("CLAIMFLAG =", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagNotEqualTo(Long value) {
            addCriterion("CLAIMFLAG <>", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagGreaterThan(Long value) {
            addCriterion("CLAIMFLAG >", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagGreaterThanOrEqualTo(Long value) {
            addCriterion("CLAIMFLAG >=", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagLessThan(Long value) {
            addCriterion("CLAIMFLAG <", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagLessThanOrEqualTo(Long value) {
            addCriterion("CLAIMFLAG <=", value, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagIn(List<Long> values) {
            addCriterion("CLAIMFLAG in", values, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagNotIn(List<Long> values) {
            addCriterion("CLAIMFLAG not in", values, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagBetween(Long value1, Long value2) {
            addCriterion("CLAIMFLAG between", value1, value2, "claimflag");
            return (Criteria) this;
        }

        public Criteria andClaimflagNotBetween(Long value1, Long value2) {
            addCriterion("CLAIMFLAG not between", value1, value2, "claimflag");
            return (Criteria) this;
        }

        public Criteria andBankremarkIsNull() {
            addCriterion("BANKREMARK is null");
            return (Criteria) this;
        }

        public Criteria andBankremarkIsNotNull() {
            addCriterion("BANKREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andBankremarkEqualTo(String value) {
            addCriterion("BANKREMARK =", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkNotEqualTo(String value) {
            addCriterion("BANKREMARK <>", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkGreaterThan(String value) {
            addCriterion("BANKREMARK >", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkGreaterThanOrEqualTo(String value) {
            addCriterion("BANKREMARK >=", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkLessThan(String value) {
            addCriterion("BANKREMARK <", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkLessThanOrEqualTo(String value) {
            addCriterion("BANKREMARK <=", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkLike(String value) {
            addCriterion("BANKREMARK like", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkNotLike(String value) {
            addCriterion("BANKREMARK not like", value, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkIn(List<String> values) {
            addCriterion("BANKREMARK in", values, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkNotIn(List<String> values) {
            addCriterion("BANKREMARK not in", values, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkBetween(String value1, String value2) {
            addCriterion("BANKREMARK between", value1, value2, "bankremark");
            return (Criteria) this;
        }

        public Criteria andBankremarkNotBetween(String value1, String value2) {
            addCriterion("BANKREMARK not between", value1, value2, "bankremark");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIsNull() {
            addCriterion("REPORTCASENO is null");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIsNotNull() {
            addCriterion("REPORTCASENO is not null");
            return (Criteria) this;
        }

        public Criteria andReportcasenoEqualTo(String value) {
            addCriterion("REPORTCASENO =", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotEqualTo(String value) {
            addCriterion("REPORTCASENO <>", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoGreaterThan(String value) {
            addCriterion("REPORTCASENO >", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTCASENO >=", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLessThan(String value) {
            addCriterion("REPORTCASENO <", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLessThanOrEqualTo(String value) {
            addCriterion("REPORTCASENO <=", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLike(String value) {
            addCriterion("REPORTCASENO like", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotLike(String value) {
            addCriterion("REPORTCASENO not like", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIn(List<String> values) {
            addCriterion("REPORTCASENO in", values, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotIn(List<String> values) {
            addCriterion("REPORTCASENO not in", values, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoBetween(String value1, String value2) {
            addCriterion("REPORTCASENO between", value1, value2, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotBetween(String value1, String value2) {
            addCriterion("REPORTCASENO not between", value1, value2, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andPairnoIsNull() {
            addCriterion("PAIRNO is null");
            return (Criteria) this;
        }

        public Criteria andPairnoIsNotNull() {
            addCriterion("PAIRNO is not null");
            return (Criteria) this;
        }

        public Criteria andPairnoEqualTo(String value) {
            addCriterion("PAIRNO =", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotEqualTo(String value) {
            addCriterion("PAIRNO <>", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoGreaterThan(String value) {
            addCriterion("PAIRNO >", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAIRNO >=", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLessThan(String value) {
            addCriterion("PAIRNO <", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLessThanOrEqualTo(String value) {
            addCriterion("PAIRNO <=", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLike(String value) {
            addCriterion("PAIRNO like", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotLike(String value) {
            addCriterion("PAIRNO not like", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoIn(List<String> values) {
            addCriterion("PAIRNO in", values, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotIn(List<String> values) {
            addCriterion("PAIRNO not in", values, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoBetween(String value1, String value2) {
            addCriterion("PAIRNO between", value1, value2, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotBetween(String value1, String value2) {
            addCriterion("PAIRNO not between", value1, value2, "pairno");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceIsNull() {
            addCriterion("IFCOINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceIsNotNull() {
            addCriterion("IFCOINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceEqualTo(String value) {
            addCriterion("IFCOINSURANCE =", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceNotEqualTo(String value) {
            addCriterion("IFCOINSURANCE <>", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceGreaterThan(String value) {
            addCriterion("IFCOINSURANCE >", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("IFCOINSURANCE >=", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceLessThan(String value) {
            addCriterion("IFCOINSURANCE <", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceLessThanOrEqualTo(String value) {
            addCriterion("IFCOINSURANCE <=", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceLike(String value) {
            addCriterion("IFCOINSURANCE like", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceNotLike(String value) {
            addCriterion("IFCOINSURANCE not like", value, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceIn(List<String> values) {
            addCriterion("IFCOINSURANCE in", values, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceNotIn(List<String> values) {
            addCriterion("IFCOINSURANCE not in", values, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceBetween(String value1, String value2) {
            addCriterion("IFCOINSURANCE between", value1, value2, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfcoinsuranceNotBetween(String value1, String value2) {
            addCriterion("IFCOINSURANCE not between", value1, value2, "ifcoinsurance");
            return (Criteria) this;
        }

        public Criteria andIfinsideIsNull() {
            addCriterion("IFINSIDE is null");
            return (Criteria) this;
        }

        public Criteria andIfinsideIsNotNull() {
            addCriterion("IFINSIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIfinsideEqualTo(String value) {
            addCriterion("IFINSIDE =", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideNotEqualTo(String value) {
            addCriterion("IFINSIDE <>", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideGreaterThan(String value) {
            addCriterion("IFINSIDE >", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideGreaterThanOrEqualTo(String value) {
            addCriterion("IFINSIDE >=", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideLessThan(String value) {
            addCriterion("IFINSIDE <", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideLessThanOrEqualTo(String value) {
            addCriterion("IFINSIDE <=", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideLike(String value) {
            addCriterion("IFINSIDE like", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideNotLike(String value) {
            addCriterion("IFINSIDE not like", value, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideIn(List<String> values) {
            addCriterion("IFINSIDE in", values, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideNotIn(List<String> values) {
            addCriterion("IFINSIDE not in", values, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideBetween(String value1, String value2) {
            addCriterion("IFINSIDE between", value1, value2, "ifinside");
            return (Criteria) this;
        }

        public Criteria andIfinsideNotBetween(String value1, String value2) {
            addCriterion("IFINSIDE not between", value1, value2, "ifinside");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoIsNull() {
            addCriterion("MAINCLAIMNO is null");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoIsNotNull() {
            addCriterion("MAINCLAIMNO is not null");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoEqualTo(String value) {
            addCriterion("MAINCLAIMNO =", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoNotEqualTo(String value) {
            addCriterion("MAINCLAIMNO <>", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoGreaterThan(String value) {
            addCriterion("MAINCLAIMNO >", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoGreaterThanOrEqualTo(String value) {
            addCriterion("MAINCLAIMNO >=", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoLessThan(String value) {
            addCriterion("MAINCLAIMNO <", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoLessThanOrEqualTo(String value) {
            addCriterion("MAINCLAIMNO <=", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoLike(String value) {
            addCriterion("MAINCLAIMNO like", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoNotLike(String value) {
            addCriterion("MAINCLAIMNO not like", value, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoIn(List<String> values) {
            addCriterion("MAINCLAIMNO in", values, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoNotIn(List<String> values) {
            addCriterion("MAINCLAIMNO not in", values, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoBetween(String value1, String value2) {
            addCriterion("MAINCLAIMNO between", value1, value2, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andMainclaimnoNotBetween(String value1, String value2) {
            addCriterion("MAINCLAIMNO not between", value1, value2, "mainclaimno");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyIsNull() {
            addCriterion("SEQPAYMENTCOPY is null");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyIsNotNull() {
            addCriterion("SEQPAYMENTCOPY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyEqualTo(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY =", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyNotEqualTo(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY <>", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyGreaterThan(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY >", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY >=", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyLessThan(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY <", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQPAYMENTCOPY <=", value, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyIn(List<BigDecimal> values) {
            addCriterion("SEQPAYMENTCOPY in", values, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyNotIn(List<BigDecimal> values) {
            addCriterion("SEQPAYMENTCOPY not in", values, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQPAYMENTCOPY between", value1, value2, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andSeqpaymentcopyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQPAYMENTCOPY not between", value1, value2, "seqpaymentcopy");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeIsNull() {
            addCriterion("GDUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeIsNotNull() {
            addCriterion("GDUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeEqualTo(String value) {
            addCriterion("GDUNITCODE =", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeNotEqualTo(String value) {
            addCriterion("GDUNITCODE <>", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeGreaterThan(String value) {
            addCriterion("GDUNITCODE >", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GDUNITCODE >=", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeLessThan(String value) {
            addCriterion("GDUNITCODE <", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeLessThanOrEqualTo(String value) {
            addCriterion("GDUNITCODE <=", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeLike(String value) {
            addCriterion("GDUNITCODE like", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeNotLike(String value) {
            addCriterion("GDUNITCODE not like", value, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeIn(List<String> values) {
            addCriterion("GDUNITCODE in", values, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeNotIn(List<String> values) {
            addCriterion("GDUNITCODE not in", values, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeBetween(String value1, String value2) {
            addCriterion("GDUNITCODE between", value1, value2, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitcodeNotBetween(String value1, String value2) {
            addCriterion("GDUNITCODE not between", value1, value2, "gdunitcode");
            return (Criteria) this;
        }

        public Criteria andGdunitnameIsNull() {
            addCriterion("GDUNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andGdunitnameIsNotNull() {
            addCriterion("GDUNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGdunitnameEqualTo(String value) {
            addCriterion("GDUNITNAME =", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameNotEqualTo(String value) {
            addCriterion("GDUNITNAME <>", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameGreaterThan(String value) {
            addCriterion("GDUNITNAME >", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("GDUNITNAME >=", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameLessThan(String value) {
            addCriterion("GDUNITNAME <", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameLessThanOrEqualTo(String value) {
            addCriterion("GDUNITNAME <=", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameLike(String value) {
            addCriterion("GDUNITNAME like", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameNotLike(String value) {
            addCriterion("GDUNITNAME not like", value, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameIn(List<String> values) {
            addCriterion("GDUNITNAME in", values, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameNotIn(List<String> values) {
            addCriterion("GDUNITNAME not in", values, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameBetween(String value1, String value2) {
            addCriterion("GDUNITNAME between", value1, value2, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andGdunitnameNotBetween(String value1, String value2) {
            addCriterion("GDUNITNAME not between", value1, value2, "gdunitname");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNull() {
            addCriterion("VEHICLENO is null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNotNull() {
            addCriterion("VEHICLENO is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoEqualTo(String value) {
            addCriterion("VEHICLENO =", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotEqualTo(String value) {
            addCriterion("VEHICLENO <>", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThan(String value) {
            addCriterion("VEHICLENO >", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLENO >=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThan(String value) {
            addCriterion("VEHICLENO <", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLENO <=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLike(String value) {
            addCriterion("VEHICLENO like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotLike(String value) {
            addCriterion("VEHICLENO not like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIn(List<String> values) {
            addCriterion("VEHICLENO in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotIn(List<String> values) {
            addCriterion("VEHICLENO not in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoBetween(String value1, String value2) {
            addCriterion("VEHICLENO between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotBetween(String value1, String value2) {
            addCriterion("VEHICLENO not between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNull() {
            addCriterion("TAXORGTALLY is null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNotNull() {
            addCriterion("TAXORGTALLY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyEqualTo(String value) {
            addCriterion("TAXORGTALLY =", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotEqualTo(String value) {
            addCriterion("TAXORGTALLY <>", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThan(String value) {
            addCriterion("TAXORGTALLY >", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY >=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThan(String value) {
            addCriterion("TAXORGTALLY <", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY <=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLike(String value) {
            addCriterion("TAXORGTALLY like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotLike(String value) {
            addCriterion("TAXORGTALLY not like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIn(List<String> values) {
            addCriterion("TAXORGTALLY in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotIn(List<String> values) {
            addCriterion("TAXORGTALLY not in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY not between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNull() {
            addCriterion("TAXESAMOUNTOUT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNotNull() {
            addCriterion("TAXESAMOUNTOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT =", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <>", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT not in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT not between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNull() {
            addCriterion("TAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNotNull() {
            addCriterion("TAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT =", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <>", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT >", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT >=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT <", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT not in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT not between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNull() {
            addCriterion("BUSINESSSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNotNull() {
            addCriterion("BUSINESSSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceEqualTo(String value) {
            addCriterion("BUSINESSSOURCE =", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <>", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThan(String value) {
            addCriterion("BUSINESSSOURCE >", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE >=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThan(String value) {
            addCriterion("BUSINESSSOURCE <", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLike(String value) {
            addCriterion("BUSINESSSOURCE like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotLike(String value) {
            addCriterion("BUSINESSSOURCE not like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIn(List<String> values) {
            addCriterion("BUSINESSSOURCE in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotIn(List<String> values) {
            addCriterion("BUSINESSSOURCE not in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE not between", value1, value2, "businesssource");
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

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("USEPORPERTY like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("USEPORPERTY not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNull() {
            addCriterion("CHARACTERISTICS is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNotNull() {
            addCriterion("CHARACTERISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsEqualTo(String value) {
            addCriterion("CHARACTERISTICS =", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotEqualTo(String value) {
            addCriterion("CHARACTERISTICS <>", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThan(String value) {
            addCriterion("CHARACTERISTICS >", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS >=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThan(String value) {
            addCriterion("CHARACTERISTICS <", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS <=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLike(String value) {
            addCriterion("CHARACTERISTICS like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotLike(String value) {
            addCriterion("CHARACTERISTICS not like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIn(List<String> values) {
            addCriterion("CHARACTERISTICS in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotIn(List<String> values) {
            addCriterion("CHARACTERISTICS not in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS not between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNull() {
            addCriterion("CARUSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNotNull() {
            addCriterion("CARUSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeEqualTo(String value) {
            addCriterion("CARUSETYPE =", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotEqualTo(String value) {
            addCriterion("CARUSETYPE <>", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThan(String value) {
            addCriterion("CARUSETYPE >", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE >=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThan(String value) {
            addCriterion("CARUSETYPE <", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE <=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLike(String value) {
            addCriterion("CARUSETYPE like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotLike(String value) {
            addCriterion("CARUSETYPE not like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIn(List<String> values) {
            addCriterion("CARUSETYPE in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotIn(List<String> values) {
            addCriterion("CARUSETYPE not in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeBetween(String value1, String value2) {
            addCriterion("CARUSETYPE between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotBetween(String value1, String value2) {
            addCriterion("CARUSETYPE not between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("VEHKIND is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("VEHKIND is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("VEHKIND =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("VEHKIND <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("VEHKIND >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("VEHKIND >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("VEHKIND <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("VEHKIND <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("VEHKIND like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("VEHKIND not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("VEHKIND in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("VEHKIND not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("VEHKIND between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("VEHKIND not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_claim_td
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
     * @Table : mm_claim_td
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