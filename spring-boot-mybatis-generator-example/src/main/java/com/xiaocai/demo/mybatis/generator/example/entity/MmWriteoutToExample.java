package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmWriteoutToExample {
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
    public MmWriteoutToExample() {
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
     * @Table : mm_writeout_to
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

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("BATCH_ID like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("BATCH_ID not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoIsNull() {
            addCriterion("SEQREPORTNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoIsNotNull() {
            addCriterion("SEQREPORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoEqualTo(Long value) {
            addCriterion("SEQREPORTNO =", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotEqualTo(Long value) {
            addCriterion("SEQREPORTNO <>", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoGreaterThan(Long value) {
            addCriterion("SEQREPORTNO >", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQREPORTNO >=", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoLessThan(Long value) {
            addCriterion("SEQREPORTNO <", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoLessThanOrEqualTo(Long value) {
            addCriterion("SEQREPORTNO <=", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoIn(List<Long> values) {
            addCriterion("SEQREPORTNO in", values, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotIn(List<Long> values) {
            addCriterion("SEQREPORTNO not in", values, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoBetween(Long value1, Long value2) {
            addCriterion("SEQREPORTNO between", value1, value2, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotBetween(Long value1, Long value2) {
            addCriterion("SEQREPORTNO not between", value1, value2, "seqreportno");
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

        public Criteria andWriteouttypeIsNull() {
            addCriterion("WRITEOUTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeIsNotNull() {
            addCriterion("WRITEOUTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeEqualTo(String value) {
            addCriterion("WRITEOUTTYPE =", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeNotEqualTo(String value) {
            addCriterion("WRITEOUTTYPE <>", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeGreaterThan(String value) {
            addCriterion("WRITEOUTTYPE >", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeGreaterThanOrEqualTo(String value) {
            addCriterion("WRITEOUTTYPE >=", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeLessThan(String value) {
            addCriterion("WRITEOUTTYPE <", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeLessThanOrEqualTo(String value) {
            addCriterion("WRITEOUTTYPE <=", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeLike(String value) {
            addCriterion("WRITEOUTTYPE like", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeNotLike(String value) {
            addCriterion("WRITEOUTTYPE not like", value, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeIn(List<String> values) {
            addCriterion("WRITEOUTTYPE in", values, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeNotIn(List<String> values) {
            addCriterion("WRITEOUTTYPE not in", values, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeBetween(String value1, String value2) {
            addCriterion("WRITEOUTTYPE between", value1, value2, "writeouttype");
            return (Criteria) this;
        }

        public Criteria andWriteouttypeNotBetween(String value1, String value2) {
            addCriterion("WRITEOUTTYPE not between", value1, value2, "writeouttype");
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

        public Criteria andAccnoIsNull() {
            addCriterion("ACCNO is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("ACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("ACCNO =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("ACCNO <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("ACCNO >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNO >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("ACCNO <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("ACCNO <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("ACCNO like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("ACCNO not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("ACCNO in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("ACCNO not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("ACCNO between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("ACCNO not between", value1, value2, "accno");
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

        public Criteria andHascoinsIsNull() {
            addCriterion("HASCOINS is null");
            return (Criteria) this;
        }

        public Criteria andHascoinsIsNotNull() {
            addCriterion("HASCOINS is not null");
            return (Criteria) this;
        }

        public Criteria andHascoinsEqualTo(String value) {
            addCriterion("HASCOINS =", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotEqualTo(String value) {
            addCriterion("HASCOINS <>", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsGreaterThan(String value) {
            addCriterion("HASCOINS >", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsGreaterThanOrEqualTo(String value) {
            addCriterion("HASCOINS >=", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLessThan(String value) {
            addCriterion("HASCOINS <", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLessThanOrEqualTo(String value) {
            addCriterion("HASCOINS <=", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLike(String value) {
            addCriterion("HASCOINS like", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotLike(String value) {
            addCriterion("HASCOINS not like", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsIn(List<String> values) {
            addCriterion("HASCOINS in", values, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotIn(List<String> values) {
            addCriterion("HASCOINS not in", values, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsBetween(String value1, String value2) {
            addCriterion("HASCOINS between", value1, value2, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotBetween(String value1, String value2) {
            addCriterion("HASCOINS not between", value1, value2, "hascoins");
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

        public Criteria andHasfeeIsNull() {
            addCriterion("HASFEE is null");
            return (Criteria) this;
        }

        public Criteria andHasfeeIsNotNull() {
            addCriterion("HASFEE is not null");
            return (Criteria) this;
        }

        public Criteria andHasfeeEqualTo(String value) {
            addCriterion("HASFEE =", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeNotEqualTo(String value) {
            addCriterion("HASFEE <>", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeGreaterThan(String value) {
            addCriterion("HASFEE >", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeGreaterThanOrEqualTo(String value) {
            addCriterion("HASFEE >=", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeLessThan(String value) {
            addCriterion("HASFEE <", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeLessThanOrEqualTo(String value) {
            addCriterion("HASFEE <=", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeLike(String value) {
            addCriterion("HASFEE like", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeNotLike(String value) {
            addCriterion("HASFEE not like", value, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeIn(List<String> values) {
            addCriterion("HASFEE in", values, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeNotIn(List<String> values) {
            addCriterion("HASFEE not in", values, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeBetween(String value1, String value2) {
            addCriterion("HASFEE between", value1, value2, "hasfee");
            return (Criteria) this;
        }

        public Criteria andHasfeeNotBetween(String value1, String value2) {
            addCriterion("HASFEE not between", value1, value2, "hasfee");
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

        public Criteria andEbankingsequencenoIsNull() {
            addCriterion("EBANKINGSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIsNotNull() {
            addCriterion("EBANKINGSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO =", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <>", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThan(String value) {
            addCriterion("EBANKINGSEQUENCENO >", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO >=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThan(String value) {
            addCriterion("EBANKINGSEQUENCENO <", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLike(String value) {
            addCriterion("EBANKINGSEQUENCENO like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotLike(String value) {
            addCriterion("EBANKINGSEQUENCENO not like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO not in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO between", value1, value2, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO not between", value1, value2, "ebankingsequenceno");
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

        public Criteria andReference4IsNull() {
            addCriterion("REFERENCE4 is null");
            return (Criteria) this;
        }

        public Criteria andReference4IsNotNull() {
            addCriterion("REFERENCE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReference4EqualTo(String value) {
            addCriterion("REFERENCE4 =", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotEqualTo(String value) {
            addCriterion("REFERENCE4 <>", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThan(String value) {
            addCriterion("REFERENCE4 >", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 >=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThan(String value) {
            addCriterion("REFERENCE4 <", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 <=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Like(String value) {
            addCriterion("REFERENCE4 like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotLike(String value) {
            addCriterion("REFERENCE4 not like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4In(List<String> values) {
            addCriterion("REFERENCE4 in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotIn(List<String> values) {
            addCriterion("REFERENCE4 not in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Between(String value1, String value2) {
            addCriterion("REFERENCE4 between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotBetween(String value1, String value2) {
            addCriterion("REFERENCE4 not between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNull() {
            addCriterion("VOUCHERNO is null");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNotNull() {
            addCriterion("VOUCHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernoEqualTo(String value) {
            addCriterion("VOUCHERNO =", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotEqualTo(String value) {
            addCriterion("VOUCHERNO <>", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThan(String value) {
            addCriterion("VOUCHERNO >", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO >=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThan(String value) {
            addCriterion("VOUCHERNO <", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO <=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLike(String value) {
            addCriterion("VOUCHERNO like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotLike(String value) {
            addCriterion("VOUCHERNO not like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoIn(List<String> values) {
            addCriterion("VOUCHERNO in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotIn(List<String> values) {
            addCriterion("VOUCHERNO not in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoBetween(String value1, String value2) {
            addCriterion("VOUCHERNO between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotBetween(String value1, String value2) {
            addCriterion("VOUCHERNO not between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andThisseqIsNull() {
            addCriterion("THISSEQ is null");
            return (Criteria) this;
        }

        public Criteria andThisseqIsNotNull() {
            addCriterion("THISSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andThisseqEqualTo(Short value) {
            addCriterion("THISSEQ =", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotEqualTo(Short value) {
            addCriterion("THISSEQ <>", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqGreaterThan(Short value) {
            addCriterion("THISSEQ >", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqGreaterThanOrEqualTo(Short value) {
            addCriterion("THISSEQ >=", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqLessThan(Short value) {
            addCriterion("THISSEQ <", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqLessThanOrEqualTo(Short value) {
            addCriterion("THISSEQ <=", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqIn(List<Short> values) {
            addCriterion("THISSEQ in", values, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotIn(List<Short> values) {
            addCriterion("THISSEQ not in", values, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqBetween(Short value1, Short value2) {
            addCriterion("THISSEQ between", value1, value2, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotBetween(Short value1, Short value2) {
            addCriterion("THISSEQ not between", value1, value2, "thisseq");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("ERRORCODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("ERRORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(String value) {
            addCriterion("ERRORCODE =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(String value) {
            addCriterion("ERRORCODE <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(String value) {
            addCriterion("ERRORCODE >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORCODE >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(String value) {
            addCriterion("ERRORCODE <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("ERRORCODE <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLike(String value) {
            addCriterion("ERRORCODE like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotLike(String value) {
            addCriterion("ERRORCODE not like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<String> values) {
            addCriterion("ERRORCODE in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<String> values) {
            addCriterion("ERRORCODE not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(String value1, String value2) {
            addCriterion("ERRORCODE between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(String value1, String value2) {
            addCriterion("ERRORCODE not between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("ERRORMSG =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("ERRORMSG <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("ERRORMSG >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMSG >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("ERRORMSG <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("ERRORMSG <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("ERRORMSG like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("ERRORMSG not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("ERRORMSG in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("ERRORMSG not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("ERRORMSG between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("ERRORMSG not between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andOpflagIsNull() {
            addCriterion("OPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpflagIsNotNull() {
            addCriterion("OPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpflagEqualTo(String value) {
            addCriterion("OPFLAG =", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotEqualTo(String value) {
            addCriterion("OPFLAG <>", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagGreaterThan(String value) {
            addCriterion("OPFLAG >", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagGreaterThanOrEqualTo(String value) {
            addCriterion("OPFLAG >=", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLessThan(String value) {
            addCriterion("OPFLAG <", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLessThanOrEqualTo(String value) {
            addCriterion("OPFLAG <=", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagLike(String value) {
            addCriterion("OPFLAG like", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotLike(String value) {
            addCriterion("OPFLAG not like", value, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagIn(List<String> values) {
            addCriterion("OPFLAG in", values, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotIn(List<String> values) {
            addCriterion("OPFLAG not in", values, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagBetween(String value1, String value2) {
            addCriterion("OPFLAG between", value1, value2, "opflag");
            return (Criteria) this;
        }

        public Criteria andOpflagNotBetween(String value1, String value2) {
            addCriterion("OPFLAG not between", value1, value2, "opflag");
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

        public Criteria andOpcodeIsNull() {
            addCriterion("OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("OPCODE =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("OPCODE <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("OPCODE >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("OPCODE <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("OPCODE <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("OPCODE like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("OPCODE not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("OPCODE in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("OPCODE not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("OPCODE between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("OPCODE not between", value1, value2, "opcode");
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

        public Criteria andSourcetypeIsNull() {
            addCriterion("SOURCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SOURCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("SOURCETYPE =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("SOURCETYPE <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("SOURCETYPE >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("SOURCETYPE <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("SOURCETYPE like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("SOURCETYPE not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("SOURCETYPE in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("SOURCETYPE not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("SOURCETYPE between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("SOURCETYPE not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNull() {
            addCriterion("INPAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNotNull() {
            addCriterion("INPAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidEqualTo(Long value) {
            addCriterion("INPAYMENTID =", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotEqualTo(Long value) {
            addCriterion("INPAYMENTID <>", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThan(Long value) {
            addCriterion("INPAYMENTID >", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThanOrEqualTo(Long value) {
            addCriterion("INPAYMENTID >=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThan(Long value) {
            addCriterion("INPAYMENTID <", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThanOrEqualTo(Long value) {
            addCriterion("INPAYMENTID <=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIn(List<Long> values) {
            addCriterion("INPAYMENTID in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotIn(List<Long> values) {
            addCriterion("INPAYMENTID not in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidBetween(Long value1, Long value2) {
            addCriterion("INPAYMENTID between", value1, value2, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotBetween(Long value1, Long value2) {
            addCriterion("INPAYMENTID not between", value1, value2, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountIsNull() {
            addCriterion("BASEPAYABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountIsNotNull() {
            addCriterion("BASEPAYABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountEqualTo(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT =", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT <>", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountGreaterThan(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT >", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT >=", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountLessThan(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT <", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEPAYABLEAMOUNT <=", value, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountIn(List<BigDecimal> values) {
            addCriterion("BASEPAYABLEAMOUNT in", values, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEPAYABLEAMOUNT not in", values, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEPAYABLEAMOUNT between", value1, value2, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBasepayableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEPAYABLEAMOUNT not between", value1, value2, "basepayableamount");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeIsNull() {
            addCriterion("SUCESSTIME is null");
            return (Criteria) this;
        }

        public Criteria andSucesstimeIsNotNull() {
            addCriterion("SUCESSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSucesstimeEqualTo(Date value) {
            addCriterion("SUCESSTIME =", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeNotEqualTo(Date value) {
            addCriterion("SUCESSTIME <>", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeGreaterThan(Date value) {
            addCriterion("SUCESSTIME >", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUCESSTIME >=", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeLessThan(Date value) {
            addCriterion("SUCESSTIME <", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeLessThanOrEqualTo(Date value) {
            addCriterion("SUCESSTIME <=", value, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeIn(List<Date> values) {
            addCriterion("SUCESSTIME in", values, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeNotIn(List<Date> values) {
            addCriterion("SUCESSTIME not in", values, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeBetween(Date value1, Date value2) {
            addCriterion("SUCESSTIME between", value1, value2, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andSucesstimeNotBetween(Date value1, Date value2) {
            addCriterion("SUCESSTIME not between", value1, value2, "sucesstime");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNull() {
            addCriterion("BIZTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNotNull() {
            addCriterion("BIZTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBiztypeEqualTo(String value) {
            addCriterion("BIZTYPE =", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotEqualTo(String value) {
            addCriterion("BIZTYPE <>", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThan(String value) {
            addCriterion("BIZTYPE >", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZTYPE >=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThan(String value) {
            addCriterion("BIZTYPE <", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThanOrEqualTo(String value) {
            addCriterion("BIZTYPE <=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLike(String value) {
            addCriterion("BIZTYPE like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotLike(String value) {
            addCriterion("BIZTYPE not like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeIn(List<String> values) {
            addCriterion("BIZTYPE in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotIn(List<String> values) {
            addCriterion("BIZTYPE not in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeBetween(String value1, String value2) {
            addCriterion("BIZTYPE between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotBetween(String value1, String value2) {
            addCriterion("BIZTYPE not between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountIsNull() {
            addCriterion("TAXESREALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountIsNotNull() {
            addCriterion("TAXESREALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT =", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT <>", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT >", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT >=", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountLessThan(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT <", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNT <=", value, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountIn(List<BigDecimal> values) {
            addCriterion("TAXESREALAMOUNT in", values, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESREALAMOUNT not in", values, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESREALAMOUNT between", value1, value2, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESREALAMOUNT not between", value1, value2, "taxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountIsNull() {
            addCriterion("BASETAXESREALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountIsNotNull() {
            addCriterion("BASETAXESREALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountEqualTo(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT =", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountNotEqualTo(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT <>", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountGreaterThan(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT >", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT >=", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountLessThan(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT <", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASETAXESREALAMOUNT <=", value, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountIn(List<BigDecimal> values) {
            addCriterion("BASETAXESREALAMOUNT in", values, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountNotIn(List<BigDecimal> values) {
            addCriterion("BASETAXESREALAMOUNT not in", values, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASETAXESREALAMOUNT between", value1, value2, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesrealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASETAXESREALAMOUNT not between", value1, value2, "basetaxesrealamount");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbIsNull() {
            addCriterion("REALAMOUNTRMB is null");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbIsNotNull() {
            addCriterion("REALAMOUNTRMB is not null");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNTRMB =", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbNotEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNTRMB <>", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbGreaterThan(BigDecimal value) {
            addCriterion("REALAMOUNTRMB >", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNTRMB >=", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbLessThan(BigDecimal value) {
            addCriterion("REALAMOUNTRMB <", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNTRMB <=", value, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNTRMB in", values, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbNotIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNTRMB not in", values, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNTRMB between", value1, value2, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andRealamountrmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNTRMB not between", value1, value2, "realamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbIsNull() {
            addCriterion("TAXESREALAMOUNTRMB is null");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbIsNotNull() {
            addCriterion("TAXESREALAMOUNTRMB is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB =", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbNotEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB <>", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbGreaterThan(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB >", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB >=", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbLessThan(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB <", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESREALAMOUNTRMB <=", value, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbIn(List<BigDecimal> values) {
            addCriterion("TAXESREALAMOUNTRMB in", values, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbNotIn(List<BigDecimal> values) {
            addCriterion("TAXESREALAMOUNTRMB not in", values, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESREALAMOUNTRMB between", value1, value2, "taxesrealamountrmb");
            return (Criteria) this;
        }

        public Criteria andTaxesrealamountrmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESREALAMOUNTRMB not between", value1, value2, "taxesrealamountrmb");
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

        public Criteria andMasternoIsNull() {
            addCriterion("MASTERNO is null");
            return (Criteria) this;
        }

        public Criteria andMasternoIsNotNull() {
            addCriterion("MASTERNO is not null");
            return (Criteria) this;
        }

        public Criteria andMasternoEqualTo(String value) {
            addCriterion("MASTERNO =", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotEqualTo(String value) {
            addCriterion("MASTERNO <>", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThan(String value) {
            addCriterion("MASTERNO >", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNO >=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThan(String value) {
            addCriterion("MASTERNO <", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThanOrEqualTo(String value) {
            addCriterion("MASTERNO <=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLike(String value) {
            addCriterion("MASTERNO like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotLike(String value) {
            addCriterion("MASTERNO not like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoIn(List<String> values) {
            addCriterion("MASTERNO in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotIn(List<String> values) {
            addCriterion("MASTERNO not in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoBetween(String value1, String value2) {
            addCriterion("MASTERNO between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotBetween(String value1, String value2) {
            addCriterion("MASTERNO not between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNull() {
            addCriterion("MASTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNotNull() {
            addCriterion("MASTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMasternameEqualTo(String value) {
            addCriterion("MASTERNAME =", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotEqualTo(String value) {
            addCriterion("MASTERNAME <>", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThan(String value) {
            addCriterion("MASTERNAME >", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNAME >=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThan(String value) {
            addCriterion("MASTERNAME <", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThanOrEqualTo(String value) {
            addCriterion("MASTERNAME <=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLike(String value) {
            addCriterion("MASTERNAME like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotLike(String value) {
            addCriterion("MASTERNAME not like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameIn(List<String> values) {
            addCriterion("MASTERNAME in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotIn(List<String> values) {
            addCriterion("MASTERNAME not in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameBetween(String value1, String value2) {
            addCriterion("MASTERNAME between", value1, value2, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotBetween(String value1, String value2) {
            addCriterion("MASTERNAME not between", value1, value2, "mastername");
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

        public Criteria andTotalserialnoIsNull() {
            addCriterion("TOTALSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIsNotNull() {
            addCriterion("TOTALSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoEqualTo(String value) {
            addCriterion("TOTALSERIALNO =", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotEqualTo(String value) {
            addCriterion("TOTALSERIALNO <>", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThan(String value) {
            addCriterion("TOTALSERIALNO >", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALSERIALNO >=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThan(String value) {
            addCriterion("TOTALSERIALNO <", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThanOrEqualTo(String value) {
            addCriterion("TOTALSERIALNO <=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLike(String value) {
            addCriterion("TOTALSERIALNO like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotLike(String value) {
            addCriterion("TOTALSERIALNO not like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIn(List<String> values) {
            addCriterion("TOTALSERIALNO in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotIn(List<String> values) {
            addCriterion("TOTALSERIALNO not in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoBetween(String value1, String value2) {
            addCriterion("TOTALSERIALNO between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotBetween(String value1, String value2) {
            addCriterion("TOTALSERIALNO not between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andAgristatusIsNull() {
            addCriterion("agristatus is null");
            return (Criteria) this;
        }

        public Criteria andAgristatusIsNotNull() {
            addCriterion("agristatus is not null");
            return (Criteria) this;
        }

        public Criteria andAgristatusEqualTo(String value) {
            addCriterion("agristatus =", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusNotEqualTo(String value) {
            addCriterion("agristatus <>", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusGreaterThan(String value) {
            addCriterion("agristatus >", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusGreaterThanOrEqualTo(String value) {
            addCriterion("agristatus >=", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusLessThan(String value) {
            addCriterion("agristatus <", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusLessThanOrEqualTo(String value) {
            addCriterion("agristatus <=", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusLike(String value) {
            addCriterion("agristatus like", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusNotLike(String value) {
            addCriterion("agristatus not like", value, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusIn(List<String> values) {
            addCriterion("agristatus in", values, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusNotIn(List<String> values) {
            addCriterion("agristatus not in", values, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusBetween(String value1, String value2) {
            addCriterion("agristatus between", value1, value2, "agristatus");
            return (Criteria) this;
        }

        public Criteria andAgristatusNotBetween(String value1, String value2) {
            addCriterion("agristatus not between", value1, value2, "agristatus");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNull() {
            addCriterion("outdatasource is null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNotNull() {
            addCriterion("outdatasource is not null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceEqualTo(String value) {
            addCriterion("outdatasource =", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotEqualTo(String value) {
            addCriterion("outdatasource <>", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThan(String value) {
            addCriterion("outdatasource >", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("outdatasource >=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThan(String value) {
            addCriterion("outdatasource <", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThanOrEqualTo(String value) {
            addCriterion("outdatasource <=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLike(String value) {
            addCriterion("outdatasource like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotLike(String value) {
            addCriterion("outdatasource not like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIn(List<String> values) {
            addCriterion("outdatasource in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotIn(List<String> values) {
            addCriterion("outdatasource not in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceBetween(String value1, String value2) {
            addCriterion("outdatasource between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotBetween(String value1, String value2) {
            addCriterion("outdatasource not between", value1, value2, "outdatasource");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_writeout_to
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
     * @Table : mm_writeout_to
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