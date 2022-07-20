package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmCentralizationlistTdExample {
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
    public MmCentralizationlistTdExample() {
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
     * @Table : mm_centralizationlist_td
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

        public Criteria andSeqcentralizationIsNull() {
            addCriterion("SEQCENTRALIZATION is null");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationIsNotNull() {
            addCriterion("SEQCENTRALIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationEqualTo(Long value) {
            addCriterion("SEQCENTRALIZATION =", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationNotEqualTo(Long value) {
            addCriterion("SEQCENTRALIZATION <>", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationGreaterThan(Long value) {
            addCriterion("SEQCENTRALIZATION >", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQCENTRALIZATION >=", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationLessThan(Long value) {
            addCriterion("SEQCENTRALIZATION <", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationLessThanOrEqualTo(Long value) {
            addCriterion("SEQCENTRALIZATION <=", value, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationIn(List<Long> values) {
            addCriterion("SEQCENTRALIZATION in", values, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationNotIn(List<Long> values) {
            addCriterion("SEQCENTRALIZATION not in", values, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationBetween(Long value1, Long value2) {
            addCriterion("SEQCENTRALIZATION between", value1, value2, "seqcentralization");
            return (Criteria) this;
        }

        public Criteria andSeqcentralizationNotBetween(Long value1, Long value2) {
            addCriterion("SEQCENTRALIZATION not between", value1, value2, "seqcentralization");
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

        public Criteria andRealcurrencycodeIsNull() {
            addCriterion("REALCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeIsNotNull() {
            addCriterion("REALCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeEqualTo(String value) {
            addCriterion("REALCURRENCYCODE =", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeNotEqualTo(String value) {
            addCriterion("REALCURRENCYCODE <>", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeGreaterThan(String value) {
            addCriterion("REALCURRENCYCODE >", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALCURRENCYCODE >=", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeLessThan(String value) {
            addCriterion("REALCURRENCYCODE <", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("REALCURRENCYCODE <=", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeLike(String value) {
            addCriterion("REALCURRENCYCODE like", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeNotLike(String value) {
            addCriterion("REALCURRENCYCODE not like", value, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeIn(List<String> values) {
            addCriterion("REALCURRENCYCODE in", values, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeNotIn(List<String> values) {
            addCriterion("REALCURRENCYCODE not in", values, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeBetween(String value1, String value2) {
            addCriterion("REALCURRENCYCODE between", value1, value2, "realcurrencycode");
            return (Criteria) this;
        }

        public Criteria andRealcurrencycodeNotBetween(String value1, String value2) {
            addCriterion("REALCURRENCYCODE not between", value1, value2, "realcurrencycode");
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

        public Criteria andFeepercentageIsNull() {
            addCriterion("FEEPERCENTAGE is null");
            return (Criteria) this;
        }

        public Criteria andFeepercentageIsNotNull() {
            addCriterion("FEEPERCENTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFeepercentageEqualTo(BigDecimal value) {
            addCriterion("FEEPERCENTAGE =", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageNotEqualTo(BigDecimal value) {
            addCriterion("FEEPERCENTAGE <>", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageGreaterThan(BigDecimal value) {
            addCriterion("FEEPERCENTAGE >", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEPERCENTAGE >=", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageLessThan(BigDecimal value) {
            addCriterion("FEEPERCENTAGE <", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEPERCENTAGE <=", value, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageIn(List<BigDecimal> values) {
            addCriterion("FEEPERCENTAGE in", values, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageNotIn(List<BigDecimal> values) {
            addCriterion("FEEPERCENTAGE not in", values, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEPERCENTAGE between", value1, value2, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andFeepercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEPERCENTAGE not between", value1, value2, "feepercentage");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeIsNull() {
            addCriterion("CONFIRMCODE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeIsNotNull() {
            addCriterion("CONFIRMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeEqualTo(String value) {
            addCriterion("CONFIRMCODE =", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeNotEqualTo(String value) {
            addCriterion("CONFIRMCODE <>", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeGreaterThan(String value) {
            addCriterion("CONFIRMCODE >", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMCODE >=", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeLessThan(String value) {
            addCriterion("CONFIRMCODE <", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMCODE <=", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeLike(String value) {
            addCriterion("CONFIRMCODE like", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeNotLike(String value) {
            addCriterion("CONFIRMCODE not like", value, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeIn(List<String> values) {
            addCriterion("CONFIRMCODE in", values, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeNotIn(List<String> values) {
            addCriterion("CONFIRMCODE not in", values, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeBetween(String value1, String value2) {
            addCriterion("CONFIRMCODE between", value1, value2, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andConfirmcodeNotBetween(String value1, String value2) {
            addCriterion("CONFIRMCODE not between", value1, value2, "confirmcode");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIsNull() {
            addCriterion("INPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIsNotNull() {
            addCriterion("INPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoEqualTo(String value) {
            addCriterion("INPAYMENTNO =", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotEqualTo(String value) {
            addCriterion("INPAYMENTNO <>", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThan(String value) {
            addCriterion("INPAYMENTNO >", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO >=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThan(String value) {
            addCriterion("INPAYMENTNO <", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO <=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLike(String value) {
            addCriterion("INPAYMENTNO like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotLike(String value) {
            addCriterion("INPAYMENTNO not like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIn(List<String> values) {
            addCriterion("INPAYMENTNO in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotIn(List<String> values) {
            addCriterion("INPAYMENTNO not in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO between", value1, value2, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO not between", value1, value2, "inpaymentno");
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

        public Criteria andErrmsgIsNull() {
            addCriterion("ERRMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNotNull() {
            addCriterion("ERRMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrmsgEqualTo(String value) {
            addCriterion("ERRMSG =", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotEqualTo(String value) {
            addCriterion("ERRMSG <>", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThan(String value) {
            addCriterion("ERRMSG >", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRMSG >=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThan(String value) {
            addCriterion("ERRMSG <", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThanOrEqualTo(String value) {
            addCriterion("ERRMSG <=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLike(String value) {
            addCriterion("ERRMSG like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotLike(String value) {
            addCriterion("ERRMSG not like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgIn(List<String> values) {
            addCriterion("ERRMSG in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotIn(List<String> values) {
            addCriterion("ERRMSG not in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgBetween(String value1, String value2) {
            addCriterion("ERRMSG between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotBetween(String value1, String value2) {
            addCriterion("ERRMSG not between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
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

        public Criteria andIssplittedIsNull() {
            addCriterion("ISSPLITTED is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("ISSPLITTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("ISSPLITTED like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("ISSPLITTED not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIsNull() {
            addCriterion("PROTOCOLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIsNotNull() {
            addCriterion("PROTOCOLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagEqualTo(String value) {
            addCriterion("PROTOCOLFLAG =", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <>", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThan(String value) {
            addCriterion("PROTOCOLFLAG >", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG >=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThan(String value) {
            addCriterion("PROTOCOLFLAG <", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLike(String value) {
            addCriterion("PROTOCOLFLAG like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotLike(String value) {
            addCriterion("PROTOCOLFLAG not like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIn(List<String> values) {
            addCriterion("PROTOCOLFLAG in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotIn(List<String> values) {
            addCriterion("PROTOCOLFLAG not in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG not between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNull() {
            addCriterion("TOTALPROTOCOLTNO is null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIsNotNull() {
            addCriterion("TOTALPROTOCOLTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO =", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO <>", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThan(String value) {
            addCriterion("TOTALPROTOCOLTNO >", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO >=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThan(String value) {
            addCriterion("TOTALPROTOCOLTNO <", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLessThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLTNO <=", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoLike(String value) {
            addCriterion("TOTALPROTOCOLTNO like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotLike(String value) {
            addCriterion("TOTALPROTOCOLTNO not like", value, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoIn(List<String> values) {
            addCriterion("TOTALPROTOCOLTNO in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotIn(List<String> values) {
            addCriterion("TOTALPROTOCOLTNO not in", values, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLTNO between", value1, value2, "totalprotocoltno");
            return (Criteria) this;
        }

        public Criteria andTotalprotocoltnoNotBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLTNO not between", value1, value2, "totalprotocoltno");
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

        public Criteria andTaxesrateIsNull() {
            addCriterion("TAXESRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIsNotNull() {
            addCriterion("TAXESRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE =", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <>", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThan(BigDecimal value) {
            addCriterion("TAXESRATE >", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE >=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThan(BigDecimal value) {
            addCriterion("TAXESRATE <", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE not in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE not between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIsNull() {
            addCriterion("CLASSESCODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIsNotNull() {
            addCriterion("CLASSESCODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodedescEqualTo(String value) {
            addCriterion("CLASSESCODEDESC =", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotEqualTo(String value) {
            addCriterion("CLASSESCODEDESC <>", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescGreaterThan(String value) {
            addCriterion("CLASSESCODEDESC >", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODEDESC >=", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLessThan(String value) {
            addCriterion("CLASSESCODEDESC <", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODEDESC <=", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLike(String value) {
            addCriterion("CLASSESCODEDESC like", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotLike(String value) {
            addCriterion("CLASSESCODEDESC not like", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIn(List<String> values) {
            addCriterion("CLASSESCODEDESC in", values, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotIn(List<String> values) {
            addCriterion("CLASSESCODEDESC not in", values, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescBetween(String value1, String value2) {
            addCriterion("CLASSESCODEDESC between", value1, value2, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODEDESC not between", value1, value2, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIsNull() {
            addCriterion("CLASSESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIsNotNull() {
            addCriterion("CLASSESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeEqualTo(String value) {
            addCriterion("CLASSESSTYPE =", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotEqualTo(String value) {
            addCriterion("CLASSESSTYPE <>", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThan(String value) {
            addCriterion("CLASSESSTYPE >", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE >=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThan(String value) {
            addCriterion("CLASSESSTYPE <", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE <=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLike(String value) {
            addCriterion("CLASSESSTYPE like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotLike(String value) {
            addCriterion("CLASSESSTYPE not like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIn(List<String> values) {
            addCriterion("CLASSESSTYPE in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotIn(List<String> values) {
            addCriterion("CLASSESSTYPE not in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE between", value1, value2, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE not between", value1, value2, "classesstype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_centralizationlist_td
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
     * @Table : mm_centralizationlist_td
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