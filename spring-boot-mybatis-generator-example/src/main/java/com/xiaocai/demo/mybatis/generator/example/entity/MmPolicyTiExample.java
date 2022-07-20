package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPolicyTiExample {
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
    public MmPolicyTiExample() {
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
     * @Table : mm_policy_ti
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

        public Criteria andCertitypeIsNull() {
            addCriterion("CERTITYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNotNull() {
            addCriterion("CERTITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertitypeEqualTo(String value) {
            addCriterion("CERTITYPE =", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotEqualTo(String value) {
            addCriterion("CERTITYPE <>", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThan(String value) {
            addCriterion("CERTITYPE >", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTITYPE >=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThan(String value) {
            addCriterion("CERTITYPE <", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThanOrEqualTo(String value) {
            addCriterion("CERTITYPE <=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLike(String value) {
            addCriterion("CERTITYPE like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotLike(String value) {
            addCriterion("CERTITYPE not like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeIn(List<String> values) {
            addCriterion("CERTITYPE in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotIn(List<String> values) {
            addCriterion("CERTITYPE not in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeBetween(String value1, String value2) {
            addCriterion("CERTITYPE between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotBetween(String value1, String value2) {
            addCriterion("CERTITYPE not between", value1, value2, "certitype");
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

        public Criteria andMasterprotocolnoIsNull() {
            addCriterion("MASTERPROTOCOLNO is null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIsNotNull() {
            addCriterion("MASTERPROTOCOLNO is not null");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO =", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO <>", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThan(String value) {
            addCriterion("MASTERPROTOCOLNO >", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO >=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThan(String value) {
            addCriterion("MASTERPROTOCOLNO <", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLessThanOrEqualTo(String value) {
            addCriterion("MASTERPROTOCOLNO <=", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoLike(String value) {
            addCriterion("MASTERPROTOCOLNO like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotLike(String value) {
            addCriterion("MASTERPROTOCOLNO not like", value, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoIn(List<String> values) {
            addCriterion("MASTERPROTOCOLNO in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotIn(List<String> values) {
            addCriterion("MASTERPROTOCOLNO not in", values, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoBetween(String value1, String value2) {
            addCriterion("MASTERPROTOCOLNO between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andMasterprotocolnoNotBetween(String value1, String value2) {
            addCriterion("MASTERPROTOCOLNO not between", value1, value2, "masterprotocolno");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNull() {
            addCriterion("INSURENCECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNotNull() {
            addCriterion("INSURENCECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT =", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <>", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT >", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT >=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT <", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT not in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT not between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNull() {
            addCriterion("UNDERWRITERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNotNull() {
            addCriterion("UNDERWRITERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeEqualTo(String value) {
            addCriterion("UNDERWRITERCODE =", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <>", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThan(String value) {
            addCriterion("UNDERWRITERCODE >", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE >=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThan(String value) {
            addCriterion("UNDERWRITERCODE <", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLike(String value) {
            addCriterion("UNDERWRITERCODE like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotLike(String value) {
            addCriterion("UNDERWRITERCODE not like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIn(List<String> values) {
            addCriterion("UNDERWRITERCODE in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotIn(List<String> values) {
            addCriterion("UNDERWRITERCODE not in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE not between", value1, value2, "underwritercode");
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

        public Criteria andEndorsetypeIsNull() {
            addCriterion("ENDORSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIsNotNull() {
            addCriterion("ENDORSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeEqualTo(String value) {
            addCriterion("ENDORSETYPE =", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotEqualTo(String value) {
            addCriterion("ENDORSETYPE <>", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThan(String value) {
            addCriterion("ENDORSETYPE >", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE >=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThan(String value) {
            addCriterion("ENDORSETYPE <", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE <=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLike(String value) {
            addCriterion("ENDORSETYPE like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotLike(String value) {
            addCriterion("ENDORSETYPE not like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIn(List<String> values) {
            addCriterion("ENDORSETYPE in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotIn(List<String> values) {
            addCriterion("ENDORSETYPE not in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE not between", value1, value2, "endorsetype");
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

        public Criteria andDonateflagIsNull() {
            addCriterion("DONATEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDonateflagIsNotNull() {
            addCriterion("DONATEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDonateflagEqualTo(String value) {
            addCriterion("DONATEFLAG =", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotEqualTo(String value) {
            addCriterion("DONATEFLAG <>", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagGreaterThan(String value) {
            addCriterion("DONATEFLAG >", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagGreaterThanOrEqualTo(String value) {
            addCriterion("DONATEFLAG >=", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLessThan(String value) {
            addCriterion("DONATEFLAG <", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLessThanOrEqualTo(String value) {
            addCriterion("DONATEFLAG <=", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagLike(String value) {
            addCriterion("DONATEFLAG like", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotLike(String value) {
            addCriterion("DONATEFLAG not like", value, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagIn(List<String> values) {
            addCriterion("DONATEFLAG in", values, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotIn(List<String> values) {
            addCriterion("DONATEFLAG not in", values, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagBetween(String value1, String value2) {
            addCriterion("DONATEFLAG between", value1, value2, "donateflag");
            return (Criteria) this;
        }

        public Criteria andDonateflagNotBetween(String value1, String value2) {
            addCriterion("DONATEFLAG not between", value1, value2, "donateflag");
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

        public Criteria andPolandinvIsNull() {
            addCriterion("POLANDINV is null");
            return (Criteria) this;
        }

        public Criteria andPolandinvIsNotNull() {
            addCriterion("POLANDINV is not null");
            return (Criteria) this;
        }

        public Criteria andPolandinvEqualTo(String value) {
            addCriterion("POLANDINV =", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotEqualTo(String value) {
            addCriterion("POLANDINV <>", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThan(String value) {
            addCriterion("POLANDINV >", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvGreaterThanOrEqualTo(String value) {
            addCriterion("POLANDINV >=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThan(String value) {
            addCriterion("POLANDINV <", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLessThanOrEqualTo(String value) {
            addCriterion("POLANDINV <=", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvLike(String value) {
            addCriterion("POLANDINV like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotLike(String value) {
            addCriterion("POLANDINV not like", value, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvIn(List<String> values) {
            addCriterion("POLANDINV in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotIn(List<String> values) {
            addCriterion("POLANDINV not in", values, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvBetween(String value1, String value2) {
            addCriterion("POLANDINV between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andPolandinvNotBetween(String value1, String value2) {
            addCriterion("POLANDINV not between", value1, value2, "polandinv");
            return (Criteria) this;
        }

        public Criteria andDamagedateIsNull() {
            addCriterion("DAMAGEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDamagedateIsNotNull() {
            addCriterion("DAMAGEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedateEqualTo(Date value) {
            addCriterion("DAMAGEDATE =", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateNotEqualTo(Date value) {
            addCriterion("DAMAGEDATE <>", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateGreaterThan(Date value) {
            addCriterion("DAMAGEDATE >", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAMAGEDATE >=", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateLessThan(Date value) {
            addCriterion("DAMAGEDATE <", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateLessThanOrEqualTo(Date value) {
            addCriterion("DAMAGEDATE <=", value, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateIn(List<Date> values) {
            addCriterion("DAMAGEDATE in", values, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateNotIn(List<Date> values) {
            addCriterion("DAMAGEDATE not in", values, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateBetween(Date value1, Date value2) {
            addCriterion("DAMAGEDATE between", value1, value2, "damagedate");
            return (Criteria) this;
        }

        public Criteria andDamagedateNotBetween(Date value1, Date value2) {
            addCriterion("DAMAGEDATE not between", value1, value2, "damagedate");
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

        public Criteria andClaimaddcodeIsNull() {
            addCriterion("CLAIMADDCODE is null");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeIsNotNull() {
            addCriterion("CLAIMADDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeEqualTo(String value) {
            addCriterion("CLAIMADDCODE =", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeNotEqualTo(String value) {
            addCriterion("CLAIMADDCODE <>", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeGreaterThan(String value) {
            addCriterion("CLAIMADDCODE >", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMADDCODE >=", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeLessThan(String value) {
            addCriterion("CLAIMADDCODE <", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeLessThanOrEqualTo(String value) {
            addCriterion("CLAIMADDCODE <=", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeLike(String value) {
            addCriterion("CLAIMADDCODE like", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeNotLike(String value) {
            addCriterion("CLAIMADDCODE not like", value, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeIn(List<String> values) {
            addCriterion("CLAIMADDCODE in", values, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeNotIn(List<String> values) {
            addCriterion("CLAIMADDCODE not in", values, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeBetween(String value1, String value2) {
            addCriterion("CLAIMADDCODE between", value1, value2, "claimaddcode");
            return (Criteria) this;
        }

        public Criteria andClaimaddcodeNotBetween(String value1, String value2) {
            addCriterion("CLAIMADDCODE not between", value1, value2, "claimaddcode");
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

        public Criteria andOptcodeIsNull() {
            addCriterion("OPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andOptcodeIsNotNull() {
            addCriterion("OPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptcodeEqualTo(String value) {
            addCriterion("OPTCODE =", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotEqualTo(String value) {
            addCriterion("OPTCODE <>", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThan(String value) {
            addCriterion("OPTCODE >", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTCODE >=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThan(String value) {
            addCriterion("OPTCODE <", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThanOrEqualTo(String value) {
            addCriterion("OPTCODE <=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLike(String value) {
            addCriterion("OPTCODE like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotLike(String value) {
            addCriterion("OPTCODE not like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeIn(List<String> values) {
            addCriterion("OPTCODE in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotIn(List<String> values) {
            addCriterion("OPTCODE not in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeBetween(String value1, String value2) {
            addCriterion("OPTCODE between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotBetween(String value1, String value2) {
            addCriterion("OPTCODE not between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNull() {
            addCriterion("OPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNotNull() {
            addCriterion("OPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptnameEqualTo(String value) {
            addCriterion("OPTNAME =", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotEqualTo(String value) {
            addCriterion("OPTNAME <>", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThan(String value) {
            addCriterion("OPTNAME >", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPTNAME >=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThan(String value) {
            addCriterion("OPTNAME <", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThanOrEqualTo(String value) {
            addCriterion("OPTNAME <=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLike(String value) {
            addCriterion("OPTNAME like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotLike(String value) {
            addCriterion("OPTNAME not like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameIn(List<String> values) {
            addCriterion("OPTNAME in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotIn(List<String> values) {
            addCriterion("OPTNAME not in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameBetween(String value1, String value2) {
            addCriterion("OPTNAME between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotBetween(String value1, String value2) {
            addCriterion("OPTNAME not between", value1, value2, "optname");
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

        public Criteria andBiznoIsNull() {
            addCriterion("BIZNO is null");
            return (Criteria) this;
        }

        public Criteria andBiznoIsNotNull() {
            addCriterion("BIZNO is not null");
            return (Criteria) this;
        }

        public Criteria andBiznoEqualTo(String value) {
            addCriterion("BIZNO =", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotEqualTo(String value) {
            addCriterion("BIZNO <>", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoGreaterThan(String value) {
            addCriterion("BIZNO >", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZNO >=", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLessThan(String value) {
            addCriterion("BIZNO <", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLessThanOrEqualTo(String value) {
            addCriterion("BIZNO <=", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoLike(String value) {
            addCriterion("BIZNO like", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotLike(String value) {
            addCriterion("BIZNO not like", value, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoIn(List<String> values) {
            addCriterion("BIZNO in", values, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotIn(List<String> values) {
            addCriterion("BIZNO not in", values, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoBetween(String value1, String value2) {
            addCriterion("BIZNO between", value1, value2, "bizno");
            return (Criteria) this;
        }

        public Criteria andBiznoNotBetween(String value1, String value2) {
            addCriterion("BIZNO not between", value1, value2, "bizno");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIsNull() {
            addCriterion("EQUALSALE is null");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIsNotNull() {
            addCriterion("EQUALSALE is not null");
            return (Criteria) this;
        }

        public Criteria andEqualsaleEqualTo(String value) {
            addCriterion("EQUALSALE =", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotEqualTo(String value) {
            addCriterion("EQUALSALE <>", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleGreaterThan(String value) {
            addCriterion("EQUALSALE >", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleGreaterThanOrEqualTo(String value) {
            addCriterion("EQUALSALE >=", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLessThan(String value) {
            addCriterion("EQUALSALE <", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLessThanOrEqualTo(String value) {
            addCriterion("EQUALSALE <=", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleLike(String value) {
            addCriterion("EQUALSALE like", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotLike(String value) {
            addCriterion("EQUALSALE not like", value, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleIn(List<String> values) {
            addCriterion("EQUALSALE in", values, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotIn(List<String> values) {
            addCriterion("EQUALSALE not in", values, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleBetween(String value1, String value2) {
            addCriterion("EQUALSALE between", value1, value2, "equalsale");
            return (Criteria) this;
        }

        public Criteria andEqualsaleNotBetween(String value1, String value2) {
            addCriterion("EQUALSALE not between", value1, value2, "equalsale");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIsNull() {
            addCriterion("IFAGENTBUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIsNotNull() {
            addCriterion("IFAGENTBUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS =", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS <>", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessGreaterThan(String value) {
            addCriterion("IFAGENTBUSINESS >", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS >=", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLessThan(String value) {
            addCriterion("IFAGENTBUSINESS <", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLessThanOrEqualTo(String value) {
            addCriterion("IFAGENTBUSINESS <=", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessLike(String value) {
            addCriterion("IFAGENTBUSINESS like", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotLike(String value) {
            addCriterion("IFAGENTBUSINESS not like", value, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessIn(List<String> values) {
            addCriterion("IFAGENTBUSINESS in", values, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotIn(List<String> values) {
            addCriterion("IFAGENTBUSINESS not in", values, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessBetween(String value1, String value2) {
            addCriterion("IFAGENTBUSINESS between", value1, value2, "ifagentbusiness");
            return (Criteria) this;
        }

        public Criteria andIfagentbusinessNotBetween(String value1, String value2) {
            addCriterion("IFAGENTBUSINESS not between", value1, value2, "ifagentbusiness");
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

        public Criteria andTaxpayercodeIsNull() {
            addCriterion("TAXPAYERCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNotNull() {
            addCriterion("TAXPAYERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeEqualTo(String value) {
            addCriterion("TAXPAYERCODE =", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotEqualTo(String value) {
            addCriterion("TAXPAYERCODE <>", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThan(String value) {
            addCriterion("TAXPAYERCODE >", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE >=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThan(String value) {
            addCriterion("TAXPAYERCODE <", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE <=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLike(String value) {
            addCriterion("TAXPAYERCODE like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotLike(String value) {
            addCriterion("TAXPAYERCODE not like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIn(List<String> values) {
            addCriterion("TAXPAYERCODE in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotIn(List<String> values) {
            addCriterion("TAXPAYERCODE not in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE not between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNull() {
            addCriterion("TAXPAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNotNull() {
            addCriterion("TAXPAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameEqualTo(String value) {
            addCriterion("TAXPAYERNAME =", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotEqualTo(String value) {
            addCriterion("TAXPAYERNAME <>", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThan(String value) {
            addCriterion("TAXPAYERNAME >", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME >=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThan(String value) {
            addCriterion("TAXPAYERNAME <", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME <=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLike(String value) {
            addCriterion("TAXPAYERNAME like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotLike(String value) {
            addCriterion("TAXPAYERNAME not like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIn(List<String> values) {
            addCriterion("TAXPAYERNAME in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotIn(List<String> values) {
            addCriterion("TAXPAYERNAME not in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME not between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("TAXPAYER is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("TAXPAYER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("TAXPAYER =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("TAXPAYER <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("TAXPAYER >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("TAXPAYER <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("TAXPAYER like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("TAXPAYER not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("TAXPAYER in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("TAXPAYER not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("TAXPAYER between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNull() {
            addCriterion("TAXESADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNotNull() {
            addCriterion("TAXESADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressEqualTo(String value) {
            addCriterion("TAXESADDRESS =", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotEqualTo(String value) {
            addCriterion("TAXESADDRESS <>", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThan(String value) {
            addCriterion("TAXESADDRESS >", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS >=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThan(String value) {
            addCriterion("TAXESADDRESS <", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS <=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLike(String value) {
            addCriterion("TAXESADDRESS like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotLike(String value) {
            addCriterion("TAXESADDRESS not like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIn(List<String> values) {
            addCriterion("TAXESADDRESS in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotIn(List<String> values) {
            addCriterion("TAXESADDRESS not in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS not between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNull() {
            addCriterion("TAXESPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNotNull() {
            addCriterion("TAXESPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneEqualTo(String value) {
            addCriterion("TAXESPHONE =", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotEqualTo(String value) {
            addCriterion("TAXESPHONE <>", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThan(String value) {
            addCriterion("TAXESPHONE >", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE >=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThan(String value) {
            addCriterion("TAXESPHONE <", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE <=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLike(String value) {
            addCriterion("TAXESPHONE like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotLike(String value) {
            addCriterion("TAXESPHONE not like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIn(List<String> values) {
            addCriterion("TAXESPHONE in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotIn(List<String> values) {
            addCriterion("TAXESPHONE not in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneBetween(String value1, String value2) {
            addCriterion("TAXESPHONE between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotBetween(String value1, String value2) {
            addCriterion("TAXESPHONE not between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNull() {
            addCriterion("TAXESMOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNotNull() {
            addCriterion("TAXESMOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE =", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <>", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThan(String value) {
            addCriterion("TAXESMOBILEPHONE >", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE >=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThan(String value) {
            addCriterion("TAXESMOBILEPHONE <", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLike(String value) {
            addCriterion("TAXESMOBILEPHONE like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotLike(String value) {
            addCriterion("TAXESMOBILEPHONE not like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE not in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE not between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNull() {
            addCriterion("TAXESEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNotNull() {
            addCriterion("TAXESEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailEqualTo(String value) {
            addCriterion("TAXESEMAIL =", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotEqualTo(String value) {
            addCriterion("TAXESEMAIL <>", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThan(String value) {
            addCriterion("TAXESEMAIL >", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL >=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThan(String value) {
            addCriterion("TAXESEMAIL <", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL <=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLike(String value) {
            addCriterion("TAXESEMAIL like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotLike(String value) {
            addCriterion("TAXESEMAIL not like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIn(List<String> values) {
            addCriterion("TAXESEMAIL in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotIn(List<String> values) {
            addCriterion("TAXESEMAIL not in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL not between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNull() {
            addCriterion("TAXESBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNotNull() {
            addCriterion("TAXESBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameEqualTo(String value) {
            addCriterion("TAXESBANKNAME =", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotEqualTo(String value) {
            addCriterion("TAXESBANKNAME <>", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThan(String value) {
            addCriterion("TAXESBANKNAME >", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME >=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThan(String value) {
            addCriterion("TAXESBANKNAME <", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME <=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLike(String value) {
            addCriterion("TAXESBANKNAME like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotLike(String value) {
            addCriterion("TAXESBANKNAME not like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIn(List<String> values) {
            addCriterion("TAXESBANKNAME in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotIn(List<String> values) {
            addCriterion("TAXESBANKNAME not in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME not between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNull() {
            addCriterion("TAXESACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNotNull() {
            addCriterion("TAXESACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO =", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <>", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThan(String value) {
            addCriterion("TAXESACCOUNTNO >", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO >=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThan(String value) {
            addCriterion("TAXESACCOUNTNO <", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLike(String value) {
            addCriterion("TAXESACCOUNTNO like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotLike(String value) {
            addCriterion("TAXESACCOUNTNO not like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO not in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO not between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNull() {
            addCriterion("TAXESPAYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNotNull() {
            addCriterion("TAXESPAYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE =", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <>", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThan(String value) {
            addCriterion("TAXESPAYERTYPE >", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE >=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThan(String value) {
            addCriterion("TAXESPAYERTYPE <", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLike(String value) {
            addCriterion("TAXESPAYERTYPE like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotLike(String value) {
            addCriterion("TAXESPAYERTYPE not like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE not in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE not between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNull() {
            addCriterion("TAXESCERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNotNull() {
            addCriterion("TAXESCERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE =", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <>", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE >", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE >=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE <", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE not like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE not in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE not between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNull() {
            addCriterion("TAXESCERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNotNull() {
            addCriterion("TAXESCERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO =", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <>", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATENO >", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO >=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThan(String value) {
            addCriterion("TAXESCERTIFICATENO <", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLike(String value) {
            addCriterion("TAXESCERTIFICATENO like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotLike(String value) {
            addCriterion("TAXESCERTIFICATENO not like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO not in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO not between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("INVOICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("INVOICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("INVOICETYPE =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("INVOICETYPE <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("INVOICETYPE >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("INVOICETYPE <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("INVOICETYPE like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("INVOICETYPE not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("INVOICETYPE in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("INVOICETYPE not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("INVOICETYPE between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("INVOICETYPE not between", value1, value2, "invoicetype");
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

        public Criteria andInvoicenoIsNull() {
            addCriterion("INVOICENO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("INVOICENO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("INVOICENO =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("INVOICENO <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("INVOICENO >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICENO >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("INVOICENO <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("INVOICENO <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("INVOICENO like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("INVOICENO not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("INVOICENO in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("INVOICENO not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("INVOICENO between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("INVOICENO not between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNull() {
            addCriterion("INVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNotNull() {
            addCriterion("INVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateEqualTo(Date value) {
            addCriterion("INVOICEDATE =", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotEqualTo(Date value) {
            addCriterion("INVOICEDATE <>", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThan(Date value) {
            addCriterion("INVOICEDATE >", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE >=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThan(Date value) {
            addCriterion("INVOICEDATE <", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE <=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIn(List<Date> values) {
            addCriterion("INVOICEDATE in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotIn(List<Date> values) {
            addCriterion("INVOICEDATE not in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE not between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNull() {
            addCriterion("PERIODFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNotNull() {
            addCriterion("PERIODFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagEqualTo(String value) {
            addCriterion("PERIODFLAG =", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotEqualTo(String value) {
            addCriterion("PERIODFLAG <>", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThan(String value) {
            addCriterion("PERIODFLAG >", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG >=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThan(String value) {
            addCriterion("PERIODFLAG <", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG <=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLike(String value) {
            addCriterion("PERIODFLAG like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotLike(String value) {
            addCriterion("PERIODFLAG not like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIn(List<String> values) {
            addCriterion("PERIODFLAG in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotIn(List<String> values) {
            addCriterion("PERIODFLAG not in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagBetween(String value1, String value2) {
            addCriterion("PERIODFLAG between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotBetween(String value1, String value2) {
            addCriterion("PERIODFLAG not between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNull() {
            addCriterion("GROUPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNotNull() {
            addCriterion("GROUPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGroupflagEqualTo(String value) {
            addCriterion("GROUPFLAG =", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotEqualTo(String value) {
            addCriterion("GROUPFLAG <>", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThan(String value) {
            addCriterion("GROUPFLAG >", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG >=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThan(String value) {
            addCriterion("GROUPFLAG <", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG <=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLike(String value) {
            addCriterion("GROUPFLAG like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotLike(String value) {
            addCriterion("GROUPFLAG not like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIn(List<String> values) {
            addCriterion("GROUPFLAG in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotIn(List<String> values) {
            addCriterion("GROUPFLAG not in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagBetween(String value1, String value2) {
            addCriterion("GROUPFLAG between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotBetween(String value1, String value2) {
            addCriterion("GROUPFLAG not between", value1, value2, "groupflag");
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

        public Criteria andJointinsurancenoIsNull() {
            addCriterion("JOINTINSURANCENO is null");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoIsNotNull() {
            addCriterion("JOINTINSURANCENO is not null");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoEqualTo(String value) {
            addCriterion("JOINTINSURANCENO =", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotEqualTo(String value) {
            addCriterion("JOINTINSURANCENO <>", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoGreaterThan(String value) {
            addCriterion("JOINTINSURANCENO >", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoGreaterThanOrEqualTo(String value) {
            addCriterion("JOINTINSURANCENO >=", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLessThan(String value) {
            addCriterion("JOINTINSURANCENO <", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLessThanOrEqualTo(String value) {
            addCriterion("JOINTINSURANCENO <=", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoLike(String value) {
            addCriterion("JOINTINSURANCENO like", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotLike(String value) {
            addCriterion("JOINTINSURANCENO not like", value, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoIn(List<String> values) {
            addCriterion("JOINTINSURANCENO in", values, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotIn(List<String> values) {
            addCriterion("JOINTINSURANCENO not in", values, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoBetween(String value1, String value2) {
            addCriterion("JOINTINSURANCENO between", value1, value2, "jointinsuranceno");
            return (Criteria) this;
        }

        public Criteria andJointinsurancenoNotBetween(String value1, String value2) {
            addCriterion("JOINTINSURANCENO not between", value1, value2, "jointinsuranceno");
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

        public Criteria andInvoiceremarkIsNull() {
            addCriterion("INVOICEREMARK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNotNull() {
            addCriterion("INVOICEREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkEqualTo(String value) {
            addCriterion("INVOICEREMARK =", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotEqualTo(String value) {
            addCriterion("INVOICEREMARK <>", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThan(String value) {
            addCriterion("INVOICEREMARK >", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK >=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThan(String value) {
            addCriterion("INVOICEREMARK <", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK <=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLike(String value) {
            addCriterion("INVOICEREMARK like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotLike(String value) {
            addCriterion("INVOICEREMARK not like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIn(List<String> values) {
            addCriterion("INVOICEREMARK in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotIn(List<String> values) {
            addCriterion("INVOICEREMARK not in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK not between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("BATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BATCHNUMBER =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BATCHNUMBER <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BATCHNUMBER >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BATCHNUMBER <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BATCHNUMBER like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BATCHNUMBER not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BATCHNUMBER in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BATCHNUMBER not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER not between", value1, value2, "batchnumber");
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

        public Criteria andCustomersourceIsNull() {
            addCriterion("CUSTOMERSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIsNotNull() {
            addCriterion("CUSTOMERSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE =", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE <>", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThan(String value) {
            addCriterion("CUSTOMERSOURCE >", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE >=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThan(String value) {
            addCriterion("CUSTOMERSOURCE <", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSOURCE <=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLike(String value) {
            addCriterion("CUSTOMERSOURCE like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotLike(String value) {
            addCriterion("CUSTOMERSOURCE not like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIn(List<String> values) {
            addCriterion("CUSTOMERSOURCE in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotIn(List<String> values) {
            addCriterion("CUSTOMERSOURCE not in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceBetween(String value1, String value2) {
            addCriterion("CUSTOMERSOURCE between", value1, value2, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSOURCE not between", value1, value2, "customersource");
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

        public Criteria andReportnoIsNull() {
            addCriterion("REPORTNO is null");
            return (Criteria) this;
        }

        public Criteria andReportnoIsNotNull() {
            addCriterion("REPORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andReportnoEqualTo(String value) {
            addCriterion("REPORTNO =", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoNotEqualTo(String value) {
            addCriterion("REPORTNO <>", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoGreaterThan(String value) {
            addCriterion("REPORTNO >", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTNO >=", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoLessThan(String value) {
            addCriterion("REPORTNO <", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoLessThanOrEqualTo(String value) {
            addCriterion("REPORTNO <=", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoLike(String value) {
            addCriterion("REPORTNO like", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoNotLike(String value) {
            addCriterion("REPORTNO not like", value, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoIn(List<String> values) {
            addCriterion("REPORTNO in", values, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoNotIn(List<String> values) {
            addCriterion("REPORTNO not in", values, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoBetween(String value1, String value2) {
            addCriterion("REPORTNO between", value1, value2, "reportno");
            return (Criteria) this;
        }

        public Criteria andReportnoNotBetween(String value1, String value2) {
            addCriterion("REPORTNO not between", value1, value2, "reportno");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIsNull() {
            addCriterion("INVOICEISSUEWAY is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIsNotNull() {
            addCriterion("INVOICEISSUEWAY is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY =", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY <>", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayGreaterThan(String value) {
            addCriterion("INVOICEISSUEWAY >", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY >=", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLessThan(String value) {
            addCriterion("INVOICEISSUEWAY <", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLessThanOrEqualTo(String value) {
            addCriterion("INVOICEISSUEWAY <=", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayLike(String value) {
            addCriterion("INVOICEISSUEWAY like", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotLike(String value) {
            addCriterion("INVOICEISSUEWAY not like", value, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayIn(List<String> values) {
            addCriterion("INVOICEISSUEWAY in", values, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotIn(List<String> values) {
            addCriterion("INVOICEISSUEWAY not in", values, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayBetween(String value1, String value2) {
            addCriterion("INVOICEISSUEWAY between", value1, value2, "invoiceissueway");
            return (Criteria) this;
        }

        public Criteria andInvoiceissuewayNotBetween(String value1, String value2) {
            addCriterion("INVOICEISSUEWAY not between", value1, value2, "invoiceissueway");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_policy_ti
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
     * @Table : mm_policy_ti
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