package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TApplicationdetailExample {
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
    public TApplicationdetailExample() {
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
     * @Table : t_applicationdetail
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

        public Criteria andAppdetailnoIsNull() {
            addCriterion("APPDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoIsNotNull() {
            addCriterion("APPDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoEqualTo(String value) {
            addCriterion("APPDETAILNO =", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoNotEqualTo(String value) {
            addCriterion("APPDETAILNO <>", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoGreaterThan(String value) {
            addCriterion("APPDETAILNO >", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPDETAILNO >=", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoLessThan(String value) {
            addCriterion("APPDETAILNO <", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoLessThanOrEqualTo(String value) {
            addCriterion("APPDETAILNO <=", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoLike(String value) {
            addCriterion("APPDETAILNO like", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoNotLike(String value) {
            addCriterion("APPDETAILNO not like", value, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoIn(List<String> values) {
            addCriterion("APPDETAILNO in", values, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoNotIn(List<String> values) {
            addCriterion("APPDETAILNO not in", values, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoBetween(String value1, String value2) {
            addCriterion("APPDETAILNO between", value1, value2, "appdetailno");
            return (Criteria) this;
        }

        public Criteria andAppdetailnoNotBetween(String value1, String value2) {
            addCriterion("APPDETAILNO not between", value1, value2, "appdetailno");
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

        public Criteria andApplicantnoIsNull() {
            addCriterion("APPLICANTNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnoIsNotNull() {
            addCriterion("APPLICANTNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnoEqualTo(String value) {
            addCriterion("APPLICANTNO =", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotEqualTo(String value) {
            addCriterion("APPLICANTNO <>", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoGreaterThan(String value) {
            addCriterion("APPLICANTNO >", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNO >=", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLessThan(String value) {
            addCriterion("APPLICANTNO <", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNO <=", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLike(String value) {
            addCriterion("APPLICANTNO like", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotLike(String value) {
            addCriterion("APPLICANTNO not like", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoIn(List<String> values) {
            addCriterion("APPLICANTNO in", values, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotIn(List<String> values) {
            addCriterion("APPLICANTNO not in", values, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoBetween(String value1, String value2) {
            addCriterion("APPLICANTNO between", value1, value2, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNO not between", value1, value2, "applicantno");
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

        public Criteria andTransactornameIsNull() {
            addCriterion("TRANSACTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andTransactornameIsNotNull() {
            addCriterion("TRANSACTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransactornameEqualTo(String value) {
            addCriterion("TRANSACTORNAME =", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotEqualTo(String value) {
            addCriterion("TRANSACTORNAME <>", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThan(String value) {
            addCriterion("TRANSACTORNAME >", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME >=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThan(String value) {
            addCriterion("TRANSACTORNAME <", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME <=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLike(String value) {
            addCriterion("TRANSACTORNAME like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotLike(String value) {
            addCriterion("TRANSACTORNAME not like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameIn(List<String> values) {
            addCriterion("TRANSACTORNAME in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotIn(List<String> values) {
            addCriterion("TRANSACTORNAME not in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME not between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameIsNull() {
            addCriterion("APPLICANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameIsNotNull() {
            addCriterion("APPLICANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameEqualTo(String value) {
            addCriterion("APPLICANTNAME =", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotEqualTo(String value) {
            addCriterion("APPLICANTNAME <>", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameGreaterThan(String value) {
            addCriterion("APPLICANTNAME >", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAME >=", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLessThan(String value) {
            addCriterion("APPLICANTNAME <", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAME <=", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLike(String value) {
            addCriterion("APPLICANTNAME like", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotLike(String value) {
            addCriterion("APPLICANTNAME not like", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameIn(List<String> values) {
            addCriterion("APPLICANTNAME in", values, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotIn(List<String> values) {
            addCriterion("APPLICANTNAME not in", values, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameBetween(String value1, String value2) {
            addCriterion("APPLICANTNAME between", value1, value2, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAME not between", value1, value2, "applicantname");
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

        public Criteria andInstallmentstimesIsNull() {
            addCriterion("INSTALLMENTSTIMES is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNotNull() {
            addCriterion("INSTALLMENTSTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES =", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES <>", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThan(String value) {
            addCriterion("INSTALLMENTSTIMES >", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES >=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThan(String value) {
            addCriterion("INSTALLMENTSTIMES <", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThanOrEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES <=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLike(String value) {
            addCriterion("INSTALLMENTSTIMES like", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotLike(String value) {
            addCriterion("INSTALLMENTSTIMES not like", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIn(List<String> values) {
            addCriterion("INSTALLMENTSTIMES in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotIn(List<String> values) {
            addCriterion("INSTALLMENTSTIMES not in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesBetween(String value1, String value2) {
            addCriterion("INSTALLMENTSTIMES between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotBetween(String value1, String value2) {
            addCriterion("INSTALLMENTSTIMES not between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
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

        public Criteria andTanoIsNull() {
            addCriterion("TANO is null");
            return (Criteria) this;
        }

        public Criteria andTanoIsNotNull() {
            addCriterion("TANO is not null");
            return (Criteria) this;
        }

        public Criteria andTanoEqualTo(String value) {
            addCriterion("TANO =", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotEqualTo(String value) {
            addCriterion("TANO <>", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThan(String value) {
            addCriterion("TANO >", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThanOrEqualTo(String value) {
            addCriterion("TANO >=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThan(String value) {
            addCriterion("TANO <", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThanOrEqualTo(String value) {
            addCriterion("TANO <=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLike(String value) {
            addCriterion("TANO like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotLike(String value) {
            addCriterion("TANO not like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoIn(List<String> values) {
            addCriterion("TANO in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotIn(List<String> values) {
            addCriterion("TANO not in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoBetween(String value1, String value2) {
            addCriterion("TANO between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotBetween(String value1, String value2) {
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

        public Criteria andProconfirmSequenceNoIsNull() {
            addCriterion("PROCONFIRM_SEQUENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoIsNotNull() {
            addCriterion("PROCONFIRM_SEQUENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoEqualTo(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO =", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoNotEqualTo(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO <>", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoGreaterThan(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO >", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO >=", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoLessThan(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO <", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoLessThanOrEqualTo(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO <=", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoLike(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO like", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoNotLike(String value) {
            addCriterion("PROCONFIRM_SEQUENCE_NO not like", value, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoIn(List<String> values) {
            addCriterion("PROCONFIRM_SEQUENCE_NO in", values, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoNotIn(List<String> values) {
            addCriterion("PROCONFIRM_SEQUENCE_NO not in", values, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoBetween(String value1, String value2) {
            addCriterion("PROCONFIRM_SEQUENCE_NO between", value1, value2, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProconfirmSequenceNoNotBetween(String value1, String value2) {
            addCriterion("PROCONFIRM_SEQUENCE_NO not between", value1, value2, "proconfirmSequenceNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoIsNull() {
            addCriterion("AMEND_QUERY_NO is null");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoIsNotNull() {
            addCriterion("AMEND_QUERY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoEqualTo(String value) {
            addCriterion("AMEND_QUERY_NO =", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoNotEqualTo(String value) {
            addCriterion("AMEND_QUERY_NO <>", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoGreaterThan(String value) {
            addCriterion("AMEND_QUERY_NO >", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoGreaterThanOrEqualTo(String value) {
            addCriterion("AMEND_QUERY_NO >=", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoLessThan(String value) {
            addCriterion("AMEND_QUERY_NO <", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoLessThanOrEqualTo(String value) {
            addCriterion("AMEND_QUERY_NO <=", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoLike(String value) {
            addCriterion("AMEND_QUERY_NO like", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoNotLike(String value) {
            addCriterion("AMEND_QUERY_NO not like", value, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoIn(List<String> values) {
            addCriterion("AMEND_QUERY_NO in", values, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoNotIn(List<String> values) {
            addCriterion("AMEND_QUERY_NO not in", values, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoBetween(String value1, String value2) {
            addCriterion("AMEND_QUERY_NO between", value1, value2, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andAmendQueryNoNotBetween(String value1, String value2) {
            addCriterion("AMEND_QUERY_NO not between", value1, value2, "amendQueryNo");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIsNull() {
            addCriterion("POLICYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIsNotNull() {
            addCriterion("POLICYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicytypeEqualTo(String value) {
            addCriterion("POLICYTYPE =", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotEqualTo(String value) {
            addCriterion("POLICYTYPE <>", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeGreaterThan(String value) {
            addCriterion("POLICYTYPE >", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYTYPE >=", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLessThan(String value) {
            addCriterion("POLICYTYPE <", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLessThanOrEqualTo(String value) {
            addCriterion("POLICYTYPE <=", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLike(String value) {
            addCriterion("POLICYTYPE like", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotLike(String value) {
            addCriterion("POLICYTYPE not like", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIn(List<String> values) {
            addCriterion("POLICYTYPE in", values, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotIn(List<String> values) {
            addCriterion("POLICYTYPE not in", values, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeBetween(String value1, String value2) {
            addCriterion("POLICYTYPE between", value1, value2, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotBetween(String value1, String value2) {
            addCriterion("POLICYTYPE not between", value1, value2, "policytype");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CITYCODE like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CITYCODE not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeIsNull() {
            addCriterion("COVERAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeIsNotNull() {
            addCriterion("COVERAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeEqualTo(String value) {
            addCriterion("COVERAGETYPE =", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeNotEqualTo(String value) {
            addCriterion("COVERAGETYPE <>", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeGreaterThan(String value) {
            addCriterion("COVERAGETYPE >", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeGreaterThanOrEqualTo(String value) {
            addCriterion("COVERAGETYPE >=", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeLessThan(String value) {
            addCriterion("COVERAGETYPE <", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeLessThanOrEqualTo(String value) {
            addCriterion("COVERAGETYPE <=", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeLike(String value) {
            addCriterion("COVERAGETYPE like", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeNotLike(String value) {
            addCriterion("COVERAGETYPE not like", value, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeIn(List<String> values) {
            addCriterion("COVERAGETYPE in", values, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeNotIn(List<String> values) {
            addCriterion("COVERAGETYPE not in", values, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeBetween(String value1, String value2) {
            addCriterion("COVERAGETYPE between", value1, value2, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andCoveragetypeNotBetween(String value1, String value2) {
            addCriterion("COVERAGETYPE not between", value1, value2, "coveragetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeIsNull() {
            addCriterion("LICENSEPLATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeIsNotNull() {
            addCriterion("LICENSEPLATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeEqualTo(String value) {
            addCriterion("LICENSEPLATETYPE =", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeNotEqualTo(String value) {
            addCriterion("LICENSEPLATETYPE <>", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeGreaterThan(String value) {
            addCriterion("LICENSEPLATETYPE >", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSEPLATETYPE >=", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeLessThan(String value) {
            addCriterion("LICENSEPLATETYPE <", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeLessThanOrEqualTo(String value) {
            addCriterion("LICENSEPLATETYPE <=", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeLike(String value) {
            addCriterion("LICENSEPLATETYPE like", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeNotLike(String value) {
            addCriterion("LICENSEPLATETYPE not like", value, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeIn(List<String> values) {
            addCriterion("LICENSEPLATETYPE in", values, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeNotIn(List<String> values) {
            addCriterion("LICENSEPLATETYPE not in", values, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeBetween(String value1, String value2) {
            addCriterion("LICENSEPLATETYPE between", value1, value2, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatetypeNotBetween(String value1, String value2) {
            addCriterion("LICENSEPLATETYPE not between", value1, value2, "licenseplatetype");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoIsNull() {
            addCriterion("LICENSEPLATENO is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoIsNotNull() {
            addCriterion("LICENSEPLATENO is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoEqualTo(String value) {
            addCriterion("LICENSEPLATENO =", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoNotEqualTo(String value) {
            addCriterion("LICENSEPLATENO <>", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoGreaterThan(String value) {
            addCriterion("LICENSEPLATENO >", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSEPLATENO >=", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoLessThan(String value) {
            addCriterion("LICENSEPLATENO <", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoLessThanOrEqualTo(String value) {
            addCriterion("LICENSEPLATENO <=", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoLike(String value) {
            addCriterion("LICENSEPLATENO like", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoNotLike(String value) {
            addCriterion("LICENSEPLATENO not like", value, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoIn(List<String> values) {
            addCriterion("LICENSEPLATENO in", values, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoNotIn(List<String> values) {
            addCriterion("LICENSEPLATENO not in", values, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoBetween(String value1, String value2) {
            addCriterion("LICENSEPLATENO between", value1, value2, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenoNotBetween(String value1, String value2) {
            addCriterion("LICENSEPLATENO not between", value1, value2, "licenseplateno");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNull() {
            addCriterion("ENGINENO is null");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNotNull() {
            addCriterion("ENGINENO is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenoEqualTo(String value) {
            addCriterion("ENGINENO =", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotEqualTo(String value) {
            addCriterion("ENGINENO <>", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThan(String value) {
            addCriterion("ENGINENO >", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINENO >=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThan(String value) {
            addCriterion("ENGINENO <", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThanOrEqualTo(String value) {
            addCriterion("ENGINENO <=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLike(String value) {
            addCriterion("ENGINENO like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotLike(String value) {
            addCriterion("ENGINENO not like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoIn(List<String> values) {
            addCriterion("ENGINENO in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotIn(List<String> values) {
            addCriterion("ENGINENO not in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoBetween(String value1, String value2) {
            addCriterion("ENGINENO between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotBetween(String value1, String value2) {
            addCriterion("ENGINENO not between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNull() {
            addCriterion("EXPIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNotNull() {
            addCriterion("EXPIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredateEqualTo(String value) {
            addCriterion("EXPIREDATE =", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotEqualTo(String value) {
            addCriterion("EXPIREDATE <>", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThan(String value) {
            addCriterion("EXPIREDATE >", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIREDATE >=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThan(String value) {
            addCriterion("EXPIREDATE <", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThanOrEqualTo(String value) {
            addCriterion("EXPIREDATE <=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLike(String value) {
            addCriterion("EXPIREDATE like", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotLike(String value) {
            addCriterion("EXPIREDATE not like", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIn(List<String> values) {
            addCriterion("EXPIREDATE in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotIn(List<String> values) {
            addCriterion("EXPIREDATE not in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateBetween(String value1, String value2) {
            addCriterion("EXPIREDATE between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotBetween(String value1, String value2) {
            addCriterion("EXPIREDATE not between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNull() {
            addCriterion("BUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("BUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("BUSINESSNO like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("BUSINESSNO not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeIsNull() {
            addCriterion("UNIONCLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeIsNotNull() {
            addCriterion("UNIONCLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeEqualTo(String value) {
            addCriterion("UNIONCLASSESCODE =", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeNotEqualTo(String value) {
            addCriterion("UNIONCLASSESCODE <>", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeGreaterThan(String value) {
            addCriterion("UNIONCLASSESCODE >", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIONCLASSESCODE >=", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeLessThan(String value) {
            addCriterion("UNIONCLASSESCODE <", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeLessThanOrEqualTo(String value) {
            addCriterion("UNIONCLASSESCODE <=", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeLike(String value) {
            addCriterion("UNIONCLASSESCODE like", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeNotLike(String value) {
            addCriterion("UNIONCLASSESCODE not like", value, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeIn(List<String> values) {
            addCriterion("UNIONCLASSESCODE in", values, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeNotIn(List<String> values) {
            addCriterion("UNIONCLASSESCODE not in", values, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeBetween(String value1, String value2) {
            addCriterion("UNIONCLASSESCODE between", value1, value2, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andUnionclassescodeNotBetween(String value1, String value2) {
            addCriterion("UNIONCLASSESCODE not between", value1, value2, "unionclassescode");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("MD5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("MD5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("MD5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("MD5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("MD5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("MD5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("MD5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("MD5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("MD5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("MD5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("MD5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("MD5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("MD5 not between", value1, value2, "md5");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_applicationdetail
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
     * @Table : t_applicationdetail
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