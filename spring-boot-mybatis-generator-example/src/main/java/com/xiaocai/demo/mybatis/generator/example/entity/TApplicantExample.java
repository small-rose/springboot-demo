package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TApplicantExample {
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
    public TApplicantExample() {
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
     * @Table : t_applicant
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

        public Criteria andBatchserialnoIsNull() {
            addCriterion("BATCHSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIsNotNull() {
            addCriterion("BATCHSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoEqualTo(String value) {
            addCriterion("BATCHSERIALNO =", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotEqualTo(String value) {
            addCriterion("BATCHSERIALNO <>", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThan(String value) {
            addCriterion("BATCHSERIALNO >", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO >=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThan(String value) {
            addCriterion("BATCHSERIALNO <", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO <=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLike(String value) {
            addCriterion("BATCHSERIALNO like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotLike(String value) {
            addCriterion("BATCHSERIALNO not like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIn(List<String> values) {
            addCriterion("BATCHSERIALNO in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotIn(List<String> values) {
            addCriterion("BATCHSERIALNO not in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO between", value1, value2, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO not between", value1, value2, "batchserialno");
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

        public Criteria andSigndateIsNull() {
            addCriterion("SIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("SIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE not between", value1, value2, "signdate");
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

        public Criteria andQuerydateIsNull() {
            addCriterion("QUERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andQuerydateIsNotNull() {
            addCriterion("QUERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuerydateEqualTo(Date value) {
            addCriterion("QUERYDATE =", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateNotEqualTo(Date value) {
            addCriterion("QUERYDATE <>", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateGreaterThan(Date value) {
            addCriterion("QUERYDATE >", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateGreaterThanOrEqualTo(Date value) {
            addCriterion("QUERYDATE >=", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateLessThan(Date value) {
            addCriterion("QUERYDATE <", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateLessThanOrEqualTo(Date value) {
            addCriterion("QUERYDATE <=", value, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateIn(List<Date> values) {
            addCriterion("QUERYDATE in", values, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateNotIn(List<Date> values) {
            addCriterion("QUERYDATE not in", values, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateBetween(Date value1, Date value2) {
            addCriterion("QUERYDATE between", value1, value2, "querydate");
            return (Criteria) this;
        }

        public Criteria andQuerydateNotBetween(Date value1, Date value2) {
            addCriterion("QUERYDATE not between", value1, value2, "querydate");
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

        public Criteria andAuditorcodeIsNull() {
            addCriterion("AUDITORCODE is null");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeIsNotNull() {
            addCriterion("AUDITORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeEqualTo(String value) {
            addCriterion("AUDITORCODE =", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeNotEqualTo(String value) {
            addCriterion("AUDITORCODE <>", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeGreaterThan(String value) {
            addCriterion("AUDITORCODE >", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITORCODE >=", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeLessThan(String value) {
            addCriterion("AUDITORCODE <", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeLessThanOrEqualTo(String value) {
            addCriterion("AUDITORCODE <=", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeLike(String value) {
            addCriterion("AUDITORCODE like", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeNotLike(String value) {
            addCriterion("AUDITORCODE not like", value, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeIn(List<String> values) {
            addCriterion("AUDITORCODE in", values, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeNotIn(List<String> values) {
            addCriterion("AUDITORCODE not in", values, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeBetween(String value1, String value2) {
            addCriterion("AUDITORCODE between", value1, value2, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditorcodeNotBetween(String value1, String value2) {
            addCriterion("AUDITORCODE not between", value1, value2, "auditorcode");
            return (Criteria) this;
        }

        public Criteria andAuditornameIsNull() {
            addCriterion("AUDITORNAME is null");
            return (Criteria) this;
        }

        public Criteria andAuditornameIsNotNull() {
            addCriterion("AUDITORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditornameEqualTo(String value) {
            addCriterion("AUDITORNAME =", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameNotEqualTo(String value) {
            addCriterion("AUDITORNAME <>", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameGreaterThan(String value) {
            addCriterion("AUDITORNAME >", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITORNAME >=", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameLessThan(String value) {
            addCriterion("AUDITORNAME <", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameLessThanOrEqualTo(String value) {
            addCriterion("AUDITORNAME <=", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameLike(String value) {
            addCriterion("AUDITORNAME like", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameNotLike(String value) {
            addCriterion("AUDITORNAME not like", value, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameIn(List<String> values) {
            addCriterion("AUDITORNAME in", values, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameNotIn(List<String> values) {
            addCriterion("AUDITORNAME not in", values, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameBetween(String value1, String value2) {
            addCriterion("AUDITORNAME between", value1, value2, "auditorname");
            return (Criteria) this;
        }

        public Criteria andAuditornameNotBetween(String value1, String value2) {
            addCriterion("AUDITORNAME not between", value1, value2, "auditorname");
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

        public Criteria andHasplanIsNull() {
            addCriterion("HASPLAN is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("HASPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("HASPLAN =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("HASPLAN <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("HASPLAN >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("HASPLAN >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("HASPLAN <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("HASPLAN <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("HASPLAN like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("HASPLAN not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("HASPLAN in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("HASPLAN not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("HASPLAN between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("HASPLAN not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNull() {
            addCriterion("FARMFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNotNull() {
            addCriterion("FARMFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagEqualTo(String value) {
            addCriterion("FARMFLAG =", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotEqualTo(String value) {
            addCriterion("FARMFLAG <>", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThan(String value) {
            addCriterion("FARMFLAG >", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAG >=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThan(String value) {
            addCriterion("FARMFLAG <", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAG <=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLike(String value) {
            addCriterion("FARMFLAG like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotLike(String value) {
            addCriterion("FARMFLAG not like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagIn(List<String> values) {
            addCriterion("FARMFLAG in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotIn(List<String> values) {
            addCriterion("FARMFLAG not in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagBetween(String value1, String value2) {
            addCriterion("FARMFLAG between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotBetween(String value1, String value2) {
            addCriterion("FARMFLAG not between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagIsNull() {
            addCriterion("FEEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFeeflagIsNotNull() {
            addCriterion("FEEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFeeflagEqualTo(String value) {
            addCriterion("FEEFLAG =", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotEqualTo(String value) {
            addCriterion("FEEFLAG <>", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagGreaterThan(String value) {
            addCriterion("FEEFLAG >", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagGreaterThanOrEqualTo(String value) {
            addCriterion("FEEFLAG >=", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLessThan(String value) {
            addCriterion("FEEFLAG <", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLessThanOrEqualTo(String value) {
            addCriterion("FEEFLAG <=", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagLike(String value) {
            addCriterion("FEEFLAG like", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotLike(String value) {
            addCriterion("FEEFLAG not like", value, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagIn(List<String> values) {
            addCriterion("FEEFLAG in", values, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotIn(List<String> values) {
            addCriterion("FEEFLAG not in", values, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagBetween(String value1, String value2) {
            addCriterion("FEEFLAG between", value1, value2, "feeflag");
            return (Criteria) this;
        }

        public Criteria andFeeflagNotBetween(String value1, String value2) {
            addCriterion("FEEFLAG not between", value1, value2, "feeflag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andProcessedamountIsNull() {
            addCriterion("PROCESSEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProcessedamountIsNotNull() {
            addCriterion("PROCESSEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedamountEqualTo(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT =", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountNotEqualTo(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT <>", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountGreaterThan(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT >", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT >=", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountLessThan(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT <", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSEDAMOUNT <=", value, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountIn(List<BigDecimal> values) {
            addCriterion("PROCESSEDAMOUNT in", values, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountNotIn(List<BigDecimal> values) {
            addCriterion("PROCESSEDAMOUNT not in", values, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSEDAMOUNT between", value1, value2, "processedamount");
            return (Criteria) this;
        }

        public Criteria andProcessedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSEDAMOUNT not between", value1, value2, "processedamount");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNull() {
            addCriterion("PREMIUMSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNotNull() {
            addCriterion("PREMIUMSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceEqualTo(String value) {
            addCriterion("PREMIUMSOURCE =", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <>", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThan(String value) {
            addCriterion("PREMIUMSOURCE >", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE >=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThan(String value) {
            addCriterion("PREMIUMSOURCE <", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLike(String value) {
            addCriterion("PREMIUMSOURCE like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotLike(String value) {
            addCriterion("PREMIUMSOURCE not like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIn(List<String> values) {
            addCriterion("PREMIUMSOURCE in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotIn(List<String> values) {
            addCriterion("PREMIUMSOURCE not in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE not between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNull() {
            addCriterion("OUTDATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNotNull() {
            addCriterion("OUTDATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceEqualTo(String value) {
            addCriterion("OUTDATASOURCE =", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotEqualTo(String value) {
            addCriterion("OUTDATASOURCE <>", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThan(String value) {
            addCriterion("OUTDATASOURCE >", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("OUTDATASOURCE >=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThan(String value) {
            addCriterion("OUTDATASOURCE <", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThanOrEqualTo(String value) {
            addCriterion("OUTDATASOURCE <=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLike(String value) {
            addCriterion("OUTDATASOURCE like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotLike(String value) {
            addCriterion("OUTDATASOURCE not like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIn(List<String> values) {
            addCriterion("OUTDATASOURCE in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotIn(List<String> values) {
            addCriterion("OUTDATASOURCE not in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceBetween(String value1, String value2) {
            addCriterion("OUTDATASOURCE between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotBetween(String value1, String value2) {
            addCriterion("OUTDATASOURCE not between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIsNull() {
            addCriterion("COINSURNO is null");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIsNotNull() {
            addCriterion("COINSURNO is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoEqualTo(String value) {
            addCriterion("COINSURNO =", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotEqualTo(String value) {
            addCriterion("COINSURNO <>", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoGreaterThan(String value) {
            addCriterion("COINSURNO >", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoGreaterThanOrEqualTo(String value) {
            addCriterion("COINSURNO >=", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLessThan(String value) {
            addCriterion("COINSURNO <", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLessThanOrEqualTo(String value) {
            addCriterion("COINSURNO <=", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLike(String value) {
            addCriterion("COINSURNO like", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotLike(String value) {
            addCriterion("COINSURNO not like", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIn(List<String> values) {
            addCriterion("COINSURNO in", values, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotIn(List<String> values) {
            addCriterion("COINSURNO not in", values, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoBetween(String value1, String value2) {
            addCriterion("COINSURNO between", value1, value2, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotBetween(String value1, String value2) {
            addCriterion("COINSURNO not between", value1, value2, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceIsNull() {
            addCriterion("ISJOINTINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceIsNotNull() {
            addCriterion("ISJOINTINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE =", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE <>", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceGreaterThan(String value) {
            addCriterion("ISJOINTINSURANCE >", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE >=", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLessThan(String value) {
            addCriterion("ISJOINTINSURANCE <", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLessThanOrEqualTo(String value) {
            addCriterion("ISJOINTINSURANCE <=", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceLike(String value) {
            addCriterion("ISJOINTINSURANCE like", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotLike(String value) {
            addCriterion("ISJOINTINSURANCE not like", value, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceIn(List<String> values) {
            addCriterion("ISJOINTINSURANCE in", values, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotIn(List<String> values) {
            addCriterion("ISJOINTINSURANCE not in", values, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceBetween(String value1, String value2) {
            addCriterion("ISJOINTINSURANCE between", value1, value2, "isjointinsurance");
            return (Criteria) this;
        }

        public Criteria andIsjointinsuranceNotBetween(String value1, String value2) {
            addCriterion("ISJOINTINSURANCE not between", value1, value2, "isjointinsurance");
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

        public Criteria andIssmsverificationIsNull() {
            addCriterion("ISSMSVERIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationIsNotNull() {
            addCriterion("ISSMSVERIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationEqualTo(String value) {
            addCriterion("ISSMSVERIFICATION =", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationNotEqualTo(String value) {
            addCriterion("ISSMSVERIFICATION <>", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationGreaterThan(String value) {
            addCriterion("ISSMSVERIFICATION >", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationGreaterThanOrEqualTo(String value) {
            addCriterion("ISSMSVERIFICATION >=", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationLessThan(String value) {
            addCriterion("ISSMSVERIFICATION <", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationLessThanOrEqualTo(String value) {
            addCriterion("ISSMSVERIFICATION <=", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationLike(String value) {
            addCriterion("ISSMSVERIFICATION like", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationNotLike(String value) {
            addCriterion("ISSMSVERIFICATION not like", value, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationIn(List<String> values) {
            addCriterion("ISSMSVERIFICATION in", values, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationNotIn(List<String> values) {
            addCriterion("ISSMSVERIFICATION not in", values, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationBetween(String value1, String value2) {
            addCriterion("ISSMSVERIFICATION between", value1, value2, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIssmsverificationNotBetween(String value1, String value2) {
            addCriterion("ISSMSVERIFICATION not between", value1, value2, "issmsverification");
            return (Criteria) this;
        }

        public Criteria andIscertificateIsNull() {
            addCriterion("ISCERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andIscertificateIsNotNull() {
            addCriterion("ISCERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andIscertificateEqualTo(String value) {
            addCriterion("ISCERTIFICATE =", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotEqualTo(String value) {
            addCriterion("ISCERTIFICATE <>", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateGreaterThan(String value) {
            addCriterion("ISCERTIFICATE >", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateGreaterThanOrEqualTo(String value) {
            addCriterion("ISCERTIFICATE >=", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLessThan(String value) {
            addCriterion("ISCERTIFICATE <", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLessThanOrEqualTo(String value) {
            addCriterion("ISCERTIFICATE <=", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLike(String value) {
            addCriterion("ISCERTIFICATE like", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotLike(String value) {
            addCriterion("ISCERTIFICATE not like", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateIn(List<String> values) {
            addCriterion("ISCERTIFICATE in", values, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotIn(List<String> values) {
            addCriterion("ISCERTIFICATE not in", values, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateBetween(String value1, String value2) {
            addCriterion("ISCERTIFICATE between", value1, value2, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotBetween(String value1, String value2) {
            addCriterion("ISCERTIFICATE not between", value1, value2, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
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

        public Criteria andLatesttimeIsNull() {
            addCriterion("LATESTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLatesttimeIsNotNull() {
            addCriterion("LATESTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLatesttimeEqualTo(Date value) {
            addCriterion("LATESTTIME =", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotEqualTo(Date value) {
            addCriterion("LATESTTIME <>", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeGreaterThan(Date value) {
            addCriterion("LATESTTIME >", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LATESTTIME >=", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeLessThan(Date value) {
            addCriterion("LATESTTIME <", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeLessThanOrEqualTo(Date value) {
            addCriterion("LATESTTIME <=", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeIn(List<Date> values) {
            addCriterion("LATESTTIME in", values, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotIn(List<Date> values) {
            addCriterion("LATESTTIME not in", values, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeBetween(Date value1, Date value2) {
            addCriterion("LATESTTIME between", value1, value2, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotBetween(Date value1, Date value2) {
            addCriterion("LATESTTIME not between", value1, value2, "latesttime");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("OPERATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OPERATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OPERATORNAME =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OPERATORNAME <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OPERATORNAME >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OPERATORNAME <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OPERATORNAME like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OPERATORNAME not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OPERATORNAME in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OPERATORNAME not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OPERATORNAME between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OPERATORNAME not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNull() {
            addCriterion("OPERATORCODE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNotNull() {
            addCriterion("OPERATORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeEqualTo(String value) {
            addCriterion("OPERATORCODE =", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotEqualTo(String value) {
            addCriterion("OPERATORCODE <>", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThan(String value) {
            addCriterion("OPERATORCODE >", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE >=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThan(String value) {
            addCriterion("OPERATORCODE <", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE <=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLike(String value) {
            addCriterion("OPERATORCODE like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotLike(String value) {
            addCriterion("OPERATORCODE not like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIn(List<String> values) {
            addCriterion("OPERATORCODE in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotIn(List<String> values) {
            addCriterion("OPERATORCODE not in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeBetween(String value1, String value2) {
            addCriterion("OPERATORCODE between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotBetween(String value1, String value2) {
            addCriterion("OPERATORCODE not between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("SUMMARY not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNull() {
            addCriterion("SUMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNotNull() {
            addCriterion("SUMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumamountEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT =", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <>", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThan(BigDecimal value) {
            addCriterion("SUMAMOUNT >", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT >=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThan(BigDecimal value) {
            addCriterion("SUMAMOUNT <", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT not in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT between", value1, value2, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT not between", value1, value2, "sumamount");
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

        public Criteria andRcptnoIsNull() {
            addCriterion("RCPTNO is null");
            return (Criteria) this;
        }

        public Criteria andRcptnoIsNotNull() {
            addCriterion("RCPTNO is not null");
            return (Criteria) this;
        }

        public Criteria andRcptnoEqualTo(String value) {
            addCriterion("RCPTNO =", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoNotEqualTo(String value) {
            addCriterion("RCPTNO <>", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoGreaterThan(String value) {
            addCriterion("RCPTNO >", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoGreaterThanOrEqualTo(String value) {
            addCriterion("RCPTNO >=", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoLessThan(String value) {
            addCriterion("RCPTNO <", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoLessThanOrEqualTo(String value) {
            addCriterion("RCPTNO <=", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoLike(String value) {
            addCriterion("RCPTNO like", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoNotLike(String value) {
            addCriterion("RCPTNO not like", value, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoIn(List<String> values) {
            addCriterion("RCPTNO in", values, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoNotIn(List<String> values) {
            addCriterion("RCPTNO not in", values, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoBetween(String value1, String value2) {
            addCriterion("RCPTNO between", value1, value2, "rcptno");
            return (Criteria) this;
        }

        public Criteria andRcptnoNotBetween(String value1, String value2) {
            addCriterion("RCPTNO not between", value1, value2, "rcptno");
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

        public Criteria andIfcarlinkIsNull() {
            addCriterion("IFCARLINK is null");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkIsNotNull() {
            addCriterion("IFCARLINK is not null");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkEqualTo(String value) {
            addCriterion("IFCARLINK =", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkNotEqualTo(String value) {
            addCriterion("IFCARLINK <>", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkGreaterThan(String value) {
            addCriterion("IFCARLINK >", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkGreaterThanOrEqualTo(String value) {
            addCriterion("IFCARLINK >=", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkLessThan(String value) {
            addCriterion("IFCARLINK <", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkLessThanOrEqualTo(String value) {
            addCriterion("IFCARLINK <=", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkLike(String value) {
            addCriterion("IFCARLINK like", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkNotLike(String value) {
            addCriterion("IFCARLINK not like", value, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkIn(List<String> values) {
            addCriterion("IFCARLINK in", values, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkNotIn(List<String> values) {
            addCriterion("IFCARLINK not in", values, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkBetween(String value1, String value2) {
            addCriterion("IFCARLINK between", value1, value2, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andIfcarlinkNotBetween(String value1, String value2) {
            addCriterion("IFCARLINK not between", value1, value2, "ifcarlink");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoIsNull() {
            addCriterion("CARLINKBUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoIsNotNull() {
            addCriterion("CARLINKBUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoEqualTo(String value) {
            addCriterion("CARLINKBUSINESSNO =", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoNotEqualTo(String value) {
            addCriterion("CARLINKBUSINESSNO <>", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoGreaterThan(String value) {
            addCriterion("CARLINKBUSINESSNO >", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("CARLINKBUSINESSNO >=", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoLessThan(String value) {
            addCriterion("CARLINKBUSINESSNO <", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoLessThanOrEqualTo(String value) {
            addCriterion("CARLINKBUSINESSNO <=", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoLike(String value) {
            addCriterion("CARLINKBUSINESSNO like", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoNotLike(String value) {
            addCriterion("CARLINKBUSINESSNO not like", value, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoIn(List<String> values) {
            addCriterion("CARLINKBUSINESSNO in", values, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoNotIn(List<String> values) {
            addCriterion("CARLINKBUSINESSNO not in", values, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoBetween(String value1, String value2) {
            addCriterion("CARLINKBUSINESSNO between", value1, value2, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andCarlinkbusinessnoNotBetween(String value1, String value2) {
            addCriterion("CARLINKBUSINESSNO not between", value1, value2, "carlinkbusinessno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIsNull() {
            addCriterion("PAYPROTOCOLNO is null");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIsNotNull() {
            addCriterion("PAYPROTOCOLNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO =", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO <>", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoGreaterThan(String value) {
            addCriterion("PAYPROTOCOLNO >", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO >=", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLessThan(String value) {
            addCriterion("PAYPROTOCOLNO <", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLessThanOrEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO <=", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLike(String value) {
            addCriterion("PAYPROTOCOLNO like", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotLike(String value) {
            addCriterion("PAYPROTOCOLNO not like", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIn(List<String> values) {
            addCriterion("PAYPROTOCOLNO in", values, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotIn(List<String> values) {
            addCriterion("PAYPROTOCOLNO not in", values, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoBetween(String value1, String value2) {
            addCriterion("PAYPROTOCOLNO between", value1, value2, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotBetween(String value1, String value2) {
            addCriterion("PAYPROTOCOLNO not between", value1, value2, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageIsNull() {
            addCriterion("IFONBOARDLUGGAGE is null");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageIsNotNull() {
            addCriterion("IFONBOARDLUGGAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageEqualTo(String value) {
            addCriterion("IFONBOARDLUGGAGE =", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageNotEqualTo(String value) {
            addCriterion("IFONBOARDLUGGAGE <>", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageGreaterThan(String value) {
            addCriterion("IFONBOARDLUGGAGE >", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageGreaterThanOrEqualTo(String value) {
            addCriterion("IFONBOARDLUGGAGE >=", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageLessThan(String value) {
            addCriterion("IFONBOARDLUGGAGE <", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageLessThanOrEqualTo(String value) {
            addCriterion("IFONBOARDLUGGAGE <=", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageLike(String value) {
            addCriterion("IFONBOARDLUGGAGE like", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageNotLike(String value) {
            addCriterion("IFONBOARDLUGGAGE not like", value, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageIn(List<String> values) {
            addCriterion("IFONBOARDLUGGAGE in", values, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageNotIn(List<String> values) {
            addCriterion("IFONBOARDLUGGAGE not in", values, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageBetween(String value1, String value2) {
            addCriterion("IFONBOARDLUGGAGE between", value1, value2, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andIfonboardluggageNotBetween(String value1, String value2) {
            addCriterion("IFONBOARDLUGGAGE not between", value1, value2, "ifonboardluggage");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoIsNull() {
            addCriterion("ONBOARDLUGGAGENO is null");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoIsNotNull() {
            addCriterion("ONBOARDLUGGAGENO is not null");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoEqualTo(String value) {
            addCriterion("ONBOARDLUGGAGENO =", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoNotEqualTo(String value) {
            addCriterion("ONBOARDLUGGAGENO <>", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoGreaterThan(String value) {
            addCriterion("ONBOARDLUGGAGENO >", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoGreaterThanOrEqualTo(String value) {
            addCriterion("ONBOARDLUGGAGENO >=", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoLessThan(String value) {
            addCriterion("ONBOARDLUGGAGENO <", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoLessThanOrEqualTo(String value) {
            addCriterion("ONBOARDLUGGAGENO <=", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoLike(String value) {
            addCriterion("ONBOARDLUGGAGENO like", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoNotLike(String value) {
            addCriterion("ONBOARDLUGGAGENO not like", value, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoIn(List<String> values) {
            addCriterion("ONBOARDLUGGAGENO in", values, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoNotIn(List<String> values) {
            addCriterion("ONBOARDLUGGAGENO not in", values, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoBetween(String value1, String value2) {
            addCriterion("ONBOARDLUGGAGENO between", value1, value2, "onboardluggageno");
            return (Criteria) this;
        }

        public Criteria andOnboardluggagenoNotBetween(String value1, String value2) {
            addCriterion("ONBOARDLUGGAGENO not between", value1, value2, "onboardluggageno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_applicant
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
     * @Table : t_applicant
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