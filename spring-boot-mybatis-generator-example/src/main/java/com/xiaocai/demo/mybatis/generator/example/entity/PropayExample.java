package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropayExample {
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
    public PropayExample() {
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
     * @Table : propay
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

        public Criteria andPrtnoIsNull() {
            addCriterion("PRTNO is null");
            return (Criteria) this;
        }

        public Criteria andPrtnoIsNotNull() {
            addCriterion("PRTNO is not null");
            return (Criteria) this;
        }

        public Criteria andPrtnoEqualTo(String value) {
            addCriterion("PRTNO =", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotEqualTo(String value) {
            addCriterion("PRTNO <>", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoGreaterThan(String value) {
            addCriterion("PRTNO >", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PRTNO >=", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLessThan(String value) {
            addCriterion("PRTNO <", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLessThanOrEqualTo(String value) {
            addCriterion("PRTNO <=", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLike(String value) {
            addCriterion("PRTNO like", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotLike(String value) {
            addCriterion("PRTNO not like", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoIn(List<String> values) {
            addCriterion("PRTNO in", values, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotIn(List<String> values) {
            addCriterion("PRTNO not in", values, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoBetween(String value1, String value2) {
            addCriterion("PRTNO between", value1, value2, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotBetween(String value1, String value2) {
            addCriterion("PRTNO not between", value1, value2, "prtno");
            return (Criteria) this;
        }

        public Criteria andChargetypeIsNull() {
            addCriterion("CHARGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargetypeIsNotNull() {
            addCriterion("CHARGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargetypeEqualTo(String value) {
            addCriterion("CHARGETYPE =", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotEqualTo(String value) {
            addCriterion("CHARGETYPE <>", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeGreaterThan(String value) {
            addCriterion("CHARGETYPE >", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGETYPE >=", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeLessThan(String value) {
            addCriterion("CHARGETYPE <", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeLessThanOrEqualTo(String value) {
            addCriterion("CHARGETYPE <=", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeLike(String value) {
            addCriterion("CHARGETYPE like", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotLike(String value) {
            addCriterion("CHARGETYPE not like", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeIn(List<String> values) {
            addCriterion("CHARGETYPE in", values, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotIn(List<String> values) {
            addCriterion("CHARGETYPE not in", values, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeBetween(String value1, String value2) {
            addCriterion("CHARGETYPE between", value1, value2, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotBetween(String value1, String value2) {
            addCriterion("CHARGETYPE not between", value1, value2, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNull() {
            addCriterion("CHARGENAME is null");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNotNull() {
            addCriterion("CHARGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andChargenameEqualTo(String value) {
            addCriterion("CHARGENAME =", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotEqualTo(String value) {
            addCriterion("CHARGENAME <>", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThan(String value) {
            addCriterion("CHARGENAME >", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGENAME >=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThan(String value) {
            addCriterion("CHARGENAME <", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThanOrEqualTo(String value) {
            addCriterion("CHARGENAME <=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLike(String value) {
            addCriterion("CHARGENAME like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotLike(String value) {
            addCriterion("CHARGENAME not like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameIn(List<String> values) {
            addCriterion("CHARGENAME in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotIn(List<String> values) {
            addCriterion("CHARGENAME not in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameBetween(String value1, String value2) {
            addCriterion("CHARGENAME between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotBetween(String value1, String value2) {
            addCriterion("CHARGENAME not between", value1, value2, "chargename");
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

        public Criteria andPayamountIsNull() {
            addCriterion("PAYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNotNull() {
            addCriterion("PAYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayamountEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNT =", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNT <>", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThan(BigDecimal value) {
            addCriterion("PAYAMOUNT >", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNT >=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThan(BigDecimal value) {
            addCriterion("PAYAMOUNT <", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNT <=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountIn(List<BigDecimal> values) {
            addCriterion("PAYAMOUNT in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotIn(List<BigDecimal> values) {
            addCriterion("PAYAMOUNT not in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMOUNT between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMOUNT not between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyIsNull() {
            addCriterion("PAYAMOUNTCNY is null");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyIsNotNull() {
            addCriterion("PAYAMOUNTCNY is not null");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY =", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyNotEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY <>", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyGreaterThan(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY >", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY >=", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyLessThan(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY <", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMOUNTCNY <=", value, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyIn(List<BigDecimal> values) {
            addCriterion("PAYAMOUNTCNY in", values, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyNotIn(List<BigDecimal> values) {
            addCriterion("PAYAMOUNTCNY not in", values, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMOUNTCNY between", value1, value2, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPayamountcnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMOUNTCNY not between", value1, value2, "payamountcny");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
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

        public Criteria andPremiumnoIsNull() {
            addCriterion("PREMIUMNO is null");
            return (Criteria) this;
        }

        public Criteria andPremiumnoIsNotNull() {
            addCriterion("PREMIUMNO is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumnoEqualTo(Integer value) {
            addCriterion("PREMIUMNO =", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoNotEqualTo(Integer value) {
            addCriterion("PREMIUMNO <>", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoGreaterThan(Integer value) {
            addCriterion("PREMIUMNO >", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PREMIUMNO >=", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoLessThan(Integer value) {
            addCriterion("PREMIUMNO <", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoLessThanOrEqualTo(Integer value) {
            addCriterion("PREMIUMNO <=", value, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoIn(List<Integer> values) {
            addCriterion("PREMIUMNO in", values, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoNotIn(List<Integer> values) {
            addCriterion("PREMIUMNO not in", values, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoBetween(Integer value1, Integer value2) {
            addCriterion("PREMIUMNO between", value1, value2, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPremiumnoNotBetween(Integer value1, Integer value2) {
            addCriterion("PREMIUMNO not between", value1, value2, "premiumno");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeIsNull() {
            addCriterion("PAYERBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeIsNotNull() {
            addCriterion("PAYERBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeEqualTo(String value) {
            addCriterion("PAYERBANKCODE =", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeNotEqualTo(String value) {
            addCriterion("PAYERBANKCODE <>", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeGreaterThan(String value) {
            addCriterion("PAYERBANKCODE >", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERBANKCODE >=", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeLessThan(String value) {
            addCriterion("PAYERBANKCODE <", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeLessThanOrEqualTo(String value) {
            addCriterion("PAYERBANKCODE <=", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeLike(String value) {
            addCriterion("PAYERBANKCODE like", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeNotLike(String value) {
            addCriterion("PAYERBANKCODE not like", value, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeIn(List<String> values) {
            addCriterion("PAYERBANKCODE in", values, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeNotIn(List<String> values) {
            addCriterion("PAYERBANKCODE not in", values, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeBetween(String value1, String value2) {
            addCriterion("PAYERBANKCODE between", value1, value2, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbankcodeNotBetween(String value1, String value2) {
            addCriterion("PAYERBANKCODE not between", value1, value2, "payerbankcode");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIsNull() {
            addCriterion("PAYERBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIsNotNull() {
            addCriterion("PAYERBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameEqualTo(String value) {
            addCriterion("PAYERBANKNAME =", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotEqualTo(String value) {
            addCriterion("PAYERBANKNAME <>", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameGreaterThan(String value) {
            addCriterion("PAYERBANKNAME >", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNAME >=", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLessThan(String value) {
            addCriterion("PAYERBANKNAME <", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLessThanOrEqualTo(String value) {
            addCriterion("PAYERBANKNAME <=", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameLike(String value) {
            addCriterion("PAYERBANKNAME like", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotLike(String value) {
            addCriterion("PAYERBANKNAME not like", value, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameIn(List<String> values) {
            addCriterion("PAYERBANKNAME in", values, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotIn(List<String> values) {
            addCriterion("PAYERBANKNAME not in", values, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameBetween(String value1, String value2) {
            addCriterion("PAYERBANKNAME between", value1, value2, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbanknameNotBetween(String value1, String value2) {
            addCriterion("PAYERBANKNAME not between", value1, value2, "payerbankname");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoIsNull() {
            addCriterion("PAYERBANKACCNO is null");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoIsNotNull() {
            addCriterion("PAYERBANKACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoEqualTo(String value) {
            addCriterion("PAYERBANKACCNO =", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoNotEqualTo(String value) {
            addCriterion("PAYERBANKACCNO <>", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoGreaterThan(String value) {
            addCriterion("PAYERBANKACCNO >", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERBANKACCNO >=", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoLessThan(String value) {
            addCriterion("PAYERBANKACCNO <", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoLessThanOrEqualTo(String value) {
            addCriterion("PAYERBANKACCNO <=", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoLike(String value) {
            addCriterion("PAYERBANKACCNO like", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoNotLike(String value) {
            addCriterion("PAYERBANKACCNO not like", value, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoIn(List<String> values) {
            addCriterion("PAYERBANKACCNO in", values, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoNotIn(List<String> values) {
            addCriterion("PAYERBANKACCNO not in", values, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoBetween(String value1, String value2) {
            addCriterion("PAYERBANKACCNO between", value1, value2, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayerbankaccnoNotBetween(String value1, String value2) {
            addCriterion("PAYERBANKACCNO not between", value1, value2, "payerbankaccno");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameIsNull() {
            addCriterion("PAYERACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameIsNotNull() {
            addCriterion("PAYERACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameEqualTo(String value) {
            addCriterion("PAYERACCNAME =", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameNotEqualTo(String value) {
            addCriterion("PAYERACCNAME <>", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameGreaterThan(String value) {
            addCriterion("PAYERACCNAME >", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCNAME >=", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameLessThan(String value) {
            addCriterion("PAYERACCNAME <", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCNAME <=", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameLike(String value) {
            addCriterion("PAYERACCNAME like", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameNotLike(String value) {
            addCriterion("PAYERACCNAME not like", value, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameIn(List<String> values) {
            addCriterion("PAYERACCNAME in", values, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameNotIn(List<String> values) {
            addCriterion("PAYERACCNAME not in", values, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameBetween(String value1, String value2) {
            addCriterion("PAYERACCNAME between", value1, value2, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayeraccnameNotBetween(String value1, String value2) {
            addCriterion("PAYERACCNAME not between", value1, value2, "payeraccname");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeIsNull() {
            addCriterion("PAYERCERTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeIsNotNull() {
            addCriterion("PAYERCERTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeEqualTo(String value) {
            addCriterion("PAYERCERTTYPE =", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeNotEqualTo(String value) {
            addCriterion("PAYERCERTTYPE <>", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeGreaterThan(String value) {
            addCriterion("PAYERCERTTYPE >", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERCERTTYPE >=", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeLessThan(String value) {
            addCriterion("PAYERCERTTYPE <", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeLessThanOrEqualTo(String value) {
            addCriterion("PAYERCERTTYPE <=", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeLike(String value) {
            addCriterion("PAYERCERTTYPE like", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeNotLike(String value) {
            addCriterion("PAYERCERTTYPE not like", value, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeIn(List<String> values) {
            addCriterion("PAYERCERTTYPE in", values, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeNotIn(List<String> values) {
            addCriterion("PAYERCERTTYPE not in", values, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeBetween(String value1, String value2) {
            addCriterion("PAYERCERTTYPE between", value1, value2, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercerttypeNotBetween(String value1, String value2) {
            addCriterion("PAYERCERTTYPE not between", value1, value2, "payercerttype");
            return (Criteria) this;
        }

        public Criteria andPayercertnoIsNull() {
            addCriterion("PAYERCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andPayercertnoIsNotNull() {
            addCriterion("PAYERCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayercertnoEqualTo(String value) {
            addCriterion("PAYERCERTNO =", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoNotEqualTo(String value) {
            addCriterion("PAYERCERTNO <>", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoGreaterThan(String value) {
            addCriterion("PAYERCERTNO >", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERCERTNO >=", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoLessThan(String value) {
            addCriterion("PAYERCERTNO <", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoLessThanOrEqualTo(String value) {
            addCriterion("PAYERCERTNO <=", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoLike(String value) {
            addCriterion("PAYERCERTNO like", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoNotLike(String value) {
            addCriterion("PAYERCERTNO not like", value, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoIn(List<String> values) {
            addCriterion("PAYERCERTNO in", values, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoNotIn(List<String> values) {
            addCriterion("PAYERCERTNO not in", values, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoBetween(String value1, String value2) {
            addCriterion("PAYERCERTNO between", value1, value2, "payercertno");
            return (Criteria) this;
        }

        public Criteria andPayercertnoNotBetween(String value1, String value2) {
            addCriterion("PAYERCERTNO not between", value1, value2, "payercertno");
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
     * @Table : propay
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
     * @Table : propay
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