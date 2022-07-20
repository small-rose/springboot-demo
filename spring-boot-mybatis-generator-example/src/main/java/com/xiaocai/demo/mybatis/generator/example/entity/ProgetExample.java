package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgetExample {
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
    public ProgetExample() {
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
     * @Table : proget
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

        public Criteria andTransactionnoIsNull() {
            addCriterion("TRANSACTIONNO is null");
            return (Criteria) this;
        }

        public Criteria andTransactionnoIsNotNull() {
            addCriterion("TRANSACTIONNO is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionnoEqualTo(String value) {
            addCriterion("TRANSACTIONNO =", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoNotEqualTo(String value) {
            addCriterion("TRANSACTIONNO <>", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoGreaterThan(String value) {
            addCriterion("TRANSACTIONNO >", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONNO >=", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoLessThan(String value) {
            addCriterion("TRANSACTIONNO <", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONNO <=", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoLike(String value) {
            addCriterion("TRANSACTIONNO like", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoNotLike(String value) {
            addCriterion("TRANSACTIONNO not like", value, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoIn(List<String> values) {
            addCriterion("TRANSACTIONNO in", values, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoNotIn(List<String> values) {
            addCriterion("TRANSACTIONNO not in", values, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoBetween(String value1, String value2) {
            addCriterion("TRANSACTIONNO between", value1, value2, "transactionno");
            return (Criteria) this;
        }

        public Criteria andTransactionnoNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONNO not between", value1, value2, "transactionno");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("COMPANYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("COMPANYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(String value) {
            addCriterion("COMPANYCODE =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(String value) {
            addCriterion("COMPANYCODE <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(String value) {
            addCriterion("COMPANYCODE >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYCODE >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(String value) {
            addCriterion("COMPANYCODE <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(String value) {
            addCriterion("COMPANYCODE <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLike(String value) {
            addCriterion("COMPANYCODE like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotLike(String value) {
            addCriterion("COMPANYCODE not like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<String> values) {
            addCriterion("COMPANYCODE in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<String> values) {
            addCriterion("COMPANYCODE not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(String value1, String value2) {
            addCriterion("COMPANYCODE between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(String value1, String value2) {
            addCriterion("COMPANYCODE not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigIsNull() {
            addCriterion("TRANSACTIONNOORIG is null");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigIsNotNull() {
            addCriterion("TRANSACTIONNOORIG is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigEqualTo(String value) {
            addCriterion("TRANSACTIONNOORIG =", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigNotEqualTo(String value) {
            addCriterion("TRANSACTIONNOORIG <>", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigGreaterThan(String value) {
            addCriterion("TRANSACTIONNOORIG >", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONNOORIG >=", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigLessThan(String value) {
            addCriterion("TRANSACTIONNOORIG <", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONNOORIG <=", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigLike(String value) {
            addCriterion("TRANSACTIONNOORIG like", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigNotLike(String value) {
            addCriterion("TRANSACTIONNOORIG not like", value, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigIn(List<String> values) {
            addCriterion("TRANSACTIONNOORIG in", values, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigNotIn(List<String> values) {
            addCriterion("TRANSACTIONNOORIG not in", values, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigBetween(String value1, String value2) {
            addCriterion("TRANSACTIONNOORIG between", value1, value2, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andTransactionnoorigNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONNOORIG not between", value1, value2, "transactionnoorig");
            return (Criteria) this;
        }

        public Criteria andVisatypeIsNull() {
            addCriterion("VISATYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisatypeIsNotNull() {
            addCriterion("VISATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisatypeEqualTo(String value) {
            addCriterion("VISATYPE =", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeNotEqualTo(String value) {
            addCriterion("VISATYPE <>", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeGreaterThan(String value) {
            addCriterion("VISATYPE >", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISATYPE >=", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeLessThan(String value) {
            addCriterion("VISATYPE <", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeLessThanOrEqualTo(String value) {
            addCriterion("VISATYPE <=", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeLike(String value) {
            addCriterion("VISATYPE like", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeNotLike(String value) {
            addCriterion("VISATYPE not like", value, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeIn(List<String> values) {
            addCriterion("VISATYPE in", values, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeNotIn(List<String> values) {
            addCriterion("VISATYPE not in", values, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeBetween(String value1, String value2) {
            addCriterion("VISATYPE between", value1, value2, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisatypeNotBetween(String value1, String value2) {
            addCriterion("VISATYPE not between", value1, value2, "visatype");
            return (Criteria) this;
        }

        public Criteria andVisacodeIsNull() {
            addCriterion("VISACODE is null");
            return (Criteria) this;
        }

        public Criteria andVisacodeIsNotNull() {
            addCriterion("VISACODE is not null");
            return (Criteria) this;
        }

        public Criteria andVisacodeEqualTo(String value) {
            addCriterion("VISACODE =", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeNotEqualTo(String value) {
            addCriterion("VISACODE <>", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeGreaterThan(String value) {
            addCriterion("VISACODE >", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeGreaterThanOrEqualTo(String value) {
            addCriterion("VISACODE >=", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeLessThan(String value) {
            addCriterion("VISACODE <", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeLessThanOrEqualTo(String value) {
            addCriterion("VISACODE <=", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeLike(String value) {
            addCriterion("VISACODE like", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeNotLike(String value) {
            addCriterion("VISACODE not like", value, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeIn(List<String> values) {
            addCriterion("VISACODE in", values, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeNotIn(List<String> values) {
            addCriterion("VISACODE not in", values, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeBetween(String value1, String value2) {
            addCriterion("VISACODE between", value1, value2, "visacode");
            return (Criteria) this;
        }

        public Criteria andVisacodeNotBetween(String value1, String value2) {
            addCriterion("VISACODE not between", value1, value2, "visacode");
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

        public Criteria andActugetnoIsNull() {
            addCriterion("ACTUGETNO is null");
            return (Criteria) this;
        }

        public Criteria andActugetnoIsNotNull() {
            addCriterion("ACTUGETNO is not null");
            return (Criteria) this;
        }

        public Criteria andActugetnoEqualTo(String value) {
            addCriterion("ACTUGETNO =", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoNotEqualTo(String value) {
            addCriterion("ACTUGETNO <>", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoGreaterThan(String value) {
            addCriterion("ACTUGETNO >", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUGETNO >=", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoLessThan(String value) {
            addCriterion("ACTUGETNO <", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoLessThanOrEqualTo(String value) {
            addCriterion("ACTUGETNO <=", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoLike(String value) {
            addCriterion("ACTUGETNO like", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoNotLike(String value) {
            addCriterion("ACTUGETNO not like", value, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoIn(List<String> values) {
            addCriterion("ACTUGETNO in", values, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoNotIn(List<String> values) {
            addCriterion("ACTUGETNO not in", values, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoBetween(String value1, String value2) {
            addCriterion("ACTUGETNO between", value1, value2, "actugetno");
            return (Criteria) this;
        }

        public Criteria andActugetnoNotBetween(String value1, String value2) {
            addCriterion("ACTUGETNO not between", value1, value2, "actugetno");
            return (Criteria) this;
        }

        public Criteria andGettypeIsNull() {
            addCriterion("GETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGettypeIsNotNull() {
            addCriterion("GETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGettypeEqualTo(String value) {
            addCriterion("GETTYPE =", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeNotEqualTo(String value) {
            addCriterion("GETTYPE <>", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeGreaterThan(String value) {
            addCriterion("GETTYPE >", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeGreaterThanOrEqualTo(String value) {
            addCriterion("GETTYPE >=", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeLessThan(String value) {
            addCriterion("GETTYPE <", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeLessThanOrEqualTo(String value) {
            addCriterion("GETTYPE <=", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeLike(String value) {
            addCriterion("GETTYPE like", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeNotLike(String value) {
            addCriterion("GETTYPE not like", value, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeIn(List<String> values) {
            addCriterion("GETTYPE in", values, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeNotIn(List<String> values) {
            addCriterion("GETTYPE not in", values, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeBetween(String value1, String value2) {
            addCriterion("GETTYPE between", value1, value2, "gettype");
            return (Criteria) this;
        }

        public Criteria andGettypeNotBetween(String value1, String value2) {
            addCriterion("GETTYPE not between", value1, value2, "gettype");
            return (Criteria) this;
        }

        public Criteria andGetnameIsNull() {
            addCriterion("GETNAME is null");
            return (Criteria) this;
        }

        public Criteria andGetnameIsNotNull() {
            addCriterion("GETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGetnameEqualTo(String value) {
            addCriterion("GETNAME =", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameNotEqualTo(String value) {
            addCriterion("GETNAME <>", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameGreaterThan(String value) {
            addCriterion("GETNAME >", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameGreaterThanOrEqualTo(String value) {
            addCriterion("GETNAME >=", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameLessThan(String value) {
            addCriterion("GETNAME <", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameLessThanOrEqualTo(String value) {
            addCriterion("GETNAME <=", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameLike(String value) {
            addCriterion("GETNAME like", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameNotLike(String value) {
            addCriterion("GETNAME not like", value, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameIn(List<String> values) {
            addCriterion("GETNAME in", values, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameNotIn(List<String> values) {
            addCriterion("GETNAME not in", values, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameBetween(String value1, String value2) {
            addCriterion("GETNAME between", value1, value2, "getname");
            return (Criteria) this;
        }

        public Criteria andGetnameNotBetween(String value1, String value2) {
            addCriterion("GETNAME not between", value1, value2, "getname");
            return (Criteria) this;
        }

        public Criteria andGetwayIsNull() {
            addCriterion("GETWAY is null");
            return (Criteria) this;
        }

        public Criteria andGetwayIsNotNull() {
            addCriterion("GETWAY is not null");
            return (Criteria) this;
        }

        public Criteria andGetwayEqualTo(String value) {
            addCriterion("GETWAY =", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotEqualTo(String value) {
            addCriterion("GETWAY <>", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayGreaterThan(String value) {
            addCriterion("GETWAY >", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayGreaterThanOrEqualTo(String value) {
            addCriterion("GETWAY >=", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLessThan(String value) {
            addCriterion("GETWAY <", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLessThanOrEqualTo(String value) {
            addCriterion("GETWAY <=", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLike(String value) {
            addCriterion("GETWAY like", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotLike(String value) {
            addCriterion("GETWAY not like", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayIn(List<String> values) {
            addCriterion("GETWAY in", values, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotIn(List<String> values) {
            addCriterion("GETWAY not in", values, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayBetween(String value1, String value2) {
            addCriterion("GETWAY between", value1, value2, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotBetween(String value1, String value2) {
            addCriterion("GETWAY not between", value1, value2, "getway");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyIsNull() {
            addCriterion("SUMACTUGETMONEY is null");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyIsNotNull() {
            addCriterion("SUMACTUGETMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY =", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyNotEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY <>", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyGreaterThan(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY >", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY >=", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyLessThan(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY <", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEY <=", value, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyIn(List<BigDecimal> values) {
            addCriterion("SUMACTUGETMONEY in", values, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyNotIn(List<BigDecimal> values) {
            addCriterion("SUMACTUGETMONEY not in", values, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMACTUGETMONEY between", value1, value2, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMACTUGETMONEY not between", value1, value2, "sumactugetmoney");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyIsNull() {
            addCriterion("SUMACTUGETMONEYCNY is null");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyIsNotNull() {
            addCriterion("SUMACTUGETMONEYCNY is not null");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY =", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyNotEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY <>", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyGreaterThan(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY >", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY >=", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyLessThan(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY <", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMACTUGETMONEYCNY <=", value, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyIn(List<BigDecimal> values) {
            addCriterion("SUMACTUGETMONEYCNY in", values, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyNotIn(List<BigDecimal> values) {
            addCriterion("SUMACTUGETMONEYCNY not in", values, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMACTUGETMONEYCNY between", value1, value2, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andSumactugetmoneycnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMACTUGETMONEYCNY not between", value1, value2, "sumactugetmoneycny");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateIsNull() {
            addCriterion("ENTERACCDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateIsNotNull() {
            addCriterion("ENTERACCDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateEqualTo(Date value) {
            addCriterion("ENTERACCDATE =", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateNotEqualTo(Date value) {
            addCriterion("ENTERACCDATE <>", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateGreaterThan(Date value) {
            addCriterion("ENTERACCDATE >", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERACCDATE >=", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateLessThan(Date value) {
            addCriterion("ENTERACCDATE <", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateLessThanOrEqualTo(Date value) {
            addCriterion("ENTERACCDATE <=", value, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateIn(List<Date> values) {
            addCriterion("ENTERACCDATE in", values, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateNotIn(List<Date> values) {
            addCriterion("ENTERACCDATE not in", values, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateBetween(Date value1, Date value2) {
            addCriterion("ENTERACCDATE between", value1, value2, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andEnteraccdateNotBetween(Date value1, Date value2) {
            addCriterion("ENTERACCDATE not between", value1, value2, "enteraccdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateIsNull() {
            addCriterion("RECOGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRecogdateIsNotNull() {
            addCriterion("RECOGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecogdateEqualTo(Date value) {
            addCriterion("RECOGDATE =", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateNotEqualTo(Date value) {
            addCriterion("RECOGDATE <>", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateGreaterThan(Date value) {
            addCriterion("RECOGDATE >", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECOGDATE >=", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateLessThan(Date value) {
            addCriterion("RECOGDATE <", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateLessThanOrEqualTo(Date value) {
            addCriterion("RECOGDATE <=", value, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateIn(List<Date> values) {
            addCriterion("RECOGDATE in", values, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateNotIn(List<Date> values) {
            addCriterion("RECOGDATE not in", values, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateBetween(Date value1, Date value2) {
            addCriterion("RECOGDATE between", value1, value2, "recogdate");
            return (Criteria) this;
        }

        public Criteria andRecogdateNotBetween(Date value1, Date value2) {
            addCriterion("RECOGDATE not between", value1, value2, "recogdate");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeIsNull() {
            addCriterion("PAYEEBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeIsNotNull() {
            addCriterion("PAYEEBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeEqualTo(String value) {
            addCriterion("PAYEEBANKCODE =", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeNotEqualTo(String value) {
            addCriterion("PAYEEBANKCODE <>", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeGreaterThan(String value) {
            addCriterion("PAYEEBANKCODE >", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKCODE >=", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeLessThan(String value) {
            addCriterion("PAYEEBANKCODE <", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeLessThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKCODE <=", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeLike(String value) {
            addCriterion("PAYEEBANKCODE like", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeNotLike(String value) {
            addCriterion("PAYEEBANKCODE not like", value, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeIn(List<String> values) {
            addCriterion("PAYEEBANKCODE in", values, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeNotIn(List<String> values) {
            addCriterion("PAYEEBANKCODE not in", values, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeBetween(String value1, String value2) {
            addCriterion("PAYEEBANKCODE between", value1, value2, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebankcodeNotBetween(String value1, String value2) {
            addCriterion("PAYEEBANKCODE not between", value1, value2, "payeebankcode");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIsNull() {
            addCriterion("PAYEEBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIsNotNull() {
            addCriterion("PAYEEBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameEqualTo(String value) {
            addCriterion("PAYEEBANKNAME =", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotEqualTo(String value) {
            addCriterion("PAYEEBANKNAME <>", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameGreaterThan(String value) {
            addCriterion("PAYEEBANKNAME >", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNAME >=", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLessThan(String value) {
            addCriterion("PAYEEBANKNAME <", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLessThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKNAME <=", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameLike(String value) {
            addCriterion("PAYEEBANKNAME like", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotLike(String value) {
            addCriterion("PAYEEBANKNAME not like", value, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameIn(List<String> values) {
            addCriterion("PAYEEBANKNAME in", values, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotIn(List<String> values) {
            addCriterion("PAYEEBANKNAME not in", values, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNAME between", value1, value2, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebanknameNotBetween(String value1, String value2) {
            addCriterion("PAYEEBANKNAME not between", value1, value2, "payeebankname");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoIsNull() {
            addCriterion("PAYEEBANKACCNO is null");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoIsNotNull() {
            addCriterion("PAYEEBANKACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoEqualTo(String value) {
            addCriterion("PAYEEBANKACCNO =", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoNotEqualTo(String value) {
            addCriterion("PAYEEBANKACCNO <>", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoGreaterThan(String value) {
            addCriterion("PAYEEBANKACCNO >", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKACCNO >=", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoLessThan(String value) {
            addCriterion("PAYEEBANKACCNO <", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoLessThanOrEqualTo(String value) {
            addCriterion("PAYEEBANKACCNO <=", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoLike(String value) {
            addCriterion("PAYEEBANKACCNO like", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoNotLike(String value) {
            addCriterion("PAYEEBANKACCNO not like", value, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoIn(List<String> values) {
            addCriterion("PAYEEBANKACCNO in", values, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoNotIn(List<String> values) {
            addCriterion("PAYEEBANKACCNO not in", values, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoBetween(String value1, String value2) {
            addCriterion("PAYEEBANKACCNO between", value1, value2, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeebankaccnoNotBetween(String value1, String value2) {
            addCriterion("PAYEEBANKACCNO not between", value1, value2, "payeebankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameIsNull() {
            addCriterion("PAYEEACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameIsNotNull() {
            addCriterion("PAYEEACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameEqualTo(String value) {
            addCriterion("PAYEEACCNAME =", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameNotEqualTo(String value) {
            addCriterion("PAYEEACCNAME <>", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameGreaterThan(String value) {
            addCriterion("PAYEEACCNAME >", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCNAME >=", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameLessThan(String value) {
            addCriterion("PAYEEACCNAME <", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCNAME <=", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameLike(String value) {
            addCriterion("PAYEEACCNAME like", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameNotLike(String value) {
            addCriterion("PAYEEACCNAME not like", value, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameIn(List<String> values) {
            addCriterion("PAYEEACCNAME in", values, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameNotIn(List<String> values) {
            addCriterion("PAYEEACCNAME not in", values, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameBetween(String value1, String value2) {
            addCriterion("PAYEEACCNAME between", value1, value2, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeaccnameNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCNAME not between", value1, value2, "payeeaccname");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeIsNull() {
            addCriterion("PAYEEIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeIsNotNull() {
            addCriterion("PAYEEIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeEqualTo(String value) {
            addCriterion("PAYEEIDTYPE =", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeNotEqualTo(String value) {
            addCriterion("PAYEEIDTYPE <>", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeGreaterThan(String value) {
            addCriterion("PAYEEIDTYPE >", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEIDTYPE >=", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeLessThan(String value) {
            addCriterion("PAYEEIDTYPE <", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeLessThanOrEqualTo(String value) {
            addCriterion("PAYEEIDTYPE <=", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeLike(String value) {
            addCriterion("PAYEEIDTYPE like", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeNotLike(String value) {
            addCriterion("PAYEEIDTYPE not like", value, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeIn(List<String> values) {
            addCriterion("PAYEEIDTYPE in", values, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeNotIn(List<String> values) {
            addCriterion("PAYEEIDTYPE not in", values, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeBetween(String value1, String value2) {
            addCriterion("PAYEEIDTYPE between", value1, value2, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidtypeNotBetween(String value1, String value2) {
            addCriterion("PAYEEIDTYPE not between", value1, value2, "payeeidtype");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoIsNull() {
            addCriterion("PAYEEIDNO is null");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoIsNotNull() {
            addCriterion("PAYEEIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoEqualTo(String value) {
            addCriterion("PAYEEIDNO =", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoNotEqualTo(String value) {
            addCriterion("PAYEEIDNO <>", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoGreaterThan(String value) {
            addCriterion("PAYEEIDNO >", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEIDNO >=", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoLessThan(String value) {
            addCriterion("PAYEEIDNO <", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoLessThanOrEqualTo(String value) {
            addCriterion("PAYEEIDNO <=", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoLike(String value) {
            addCriterion("PAYEEIDNO like", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoNotLike(String value) {
            addCriterion("PAYEEIDNO not like", value, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoIn(List<String> values) {
            addCriterion("PAYEEIDNO in", values, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoNotIn(List<String> values) {
            addCriterion("PAYEEIDNO not in", values, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoBetween(String value1, String value2) {
            addCriterion("PAYEEIDNO between", value1, value2, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andPayeeidnoNotBetween(String value1, String value2) {
            addCriterion("PAYEEIDNO not between", value1, value2, "payeeidno");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("TRANSACTIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("TRANSACTIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(Date value) {
            addCriterion("TRANSACTIONDATE >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(Date value) {
            addCriterion("TRANSACTIONDATE <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : proget
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
     * @Table : proget
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