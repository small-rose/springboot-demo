package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmBatchinfoTdExample {
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
    public MmBatchinfoTdExample() {
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
     * @Table : mm_batchinfo_td
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

        public Criteria andSeqbatchIsNull() {
            addCriterion("SEQBATCH is null");
            return (Criteria) this;
        }

        public Criteria andSeqbatchIsNotNull() {
            addCriterion("SEQBATCH is not null");
            return (Criteria) this;
        }

        public Criteria andSeqbatchEqualTo(String value) {
            addCriterion("SEQBATCH =", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchNotEqualTo(String value) {
            addCriterion("SEQBATCH <>", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchGreaterThan(String value) {
            addCriterion("SEQBATCH >", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchGreaterThanOrEqualTo(String value) {
            addCriterion("SEQBATCH >=", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchLessThan(String value) {
            addCriterion("SEQBATCH <", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchLessThanOrEqualTo(String value) {
            addCriterion("SEQBATCH <=", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchLike(String value) {
            addCriterion("SEQBATCH like", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchNotLike(String value) {
            addCriterion("SEQBATCH not like", value, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchIn(List<String> values) {
            addCriterion("SEQBATCH in", values, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchNotIn(List<String> values) {
            addCriterion("SEQBATCH not in", values, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchBetween(String value1, String value2) {
            addCriterion("SEQBATCH between", value1, value2, "seqbatch");
            return (Criteria) this;
        }

        public Criteria andSeqbatchNotBetween(String value1, String value2) {
            addCriterion("SEQBATCH not between", value1, value2, "seqbatch");
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

        public Criteria andHibernateversionEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Short value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Short value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
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

        public Criteria andActualcurrencycodeIsNull() {
            addCriterion("ACTUALCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeIsNotNull() {
            addCriterion("ACTUALCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeEqualTo(String value) {
            addCriterion("ACTUALCURRENCYCODE =", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeNotEqualTo(String value) {
            addCriterion("ACTUALCURRENCYCODE <>", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeGreaterThan(String value) {
            addCriterion("ACTUALCURRENCYCODE >", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCURRENCYCODE >=", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeLessThan(String value) {
            addCriterion("ACTUALCURRENCYCODE <", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCURRENCYCODE <=", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeLike(String value) {
            addCriterion("ACTUALCURRENCYCODE like", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeNotLike(String value) {
            addCriterion("ACTUALCURRENCYCODE not like", value, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeIn(List<String> values) {
            addCriterion("ACTUALCURRENCYCODE in", values, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeNotIn(List<String> values) {
            addCriterion("ACTUALCURRENCYCODE not in", values, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeBetween(String value1, String value2) {
            addCriterion("ACTUALCURRENCYCODE between", value1, value2, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualcurrencycodeNotBetween(String value1, String value2) {
            addCriterion("ACTUALCURRENCYCODE not between", value1, value2, "actualcurrencycode");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateIsNull() {
            addCriterion("ACTUALEXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateIsNotNull() {
            addCriterion("ACTUALEXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateEqualTo(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE =", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotEqualTo(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE <>", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateGreaterThan(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE >", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE >=", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateLessThan(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE <", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALEXCHANGERATE <=", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateIn(List<BigDecimal> values) {
            addCriterion("ACTUALEXCHANGERATE in", values, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotIn(List<BigDecimal> values) {
            addCriterion("ACTUALEXCHANGERATE not in", values, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALEXCHANGERATE between", value1, value2, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALEXCHANGERATE not between", value1, value2, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountIsNull() {
            addCriterion("ACTUALCOMMISSIONAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountIsNotNull() {
            addCriterion("ACTUALCOMMISSIONAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountEqualTo(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT =", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountNotEqualTo(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT <>", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountGreaterThan(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT >", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT >=", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountLessThan(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT <", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALCOMMISSIONAMOUNT <=", value, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountIn(List<BigDecimal> values) {
            addCriterion("ACTUALCOMMISSIONAMOUNT in", values, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountNotIn(List<BigDecimal> values) {
            addCriterion("ACTUALCOMMISSIONAMOUNT not in", values, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALCOMMISSIONAMOUNT between", value1, value2, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andActualcommissionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALCOMMISSIONAMOUNT not between", value1, value2, "actualcommissionamount");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("BANKPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("BANKPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("BANKPROVINCE =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("BANKPROVINCE <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("BANKPROVINCE >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("BANKPROVINCE <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("BANKPROVINCE like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("BANKPROVINCE not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("BANKPROVINCE in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("BANKPROVINCE not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNull() {
            addCriterion("BANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("BANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("BANKCITY =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("BANKCITY <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("BANKCITY >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCITY >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("BANKCITY <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("BANKCITY <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("BANKCITY like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("BANKCITY not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("BANKCITY in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("BANKCITY not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("BANKCITY between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("BANKCITY not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("BANKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("BANKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("BANKTYPE =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("BANKTYPE <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("BANKTYPE >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTYPE >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("BANKTYPE <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("BANKTYPE <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("BANKTYPE like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("BANKTYPE not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("BANKTYPE in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("BANKTYPE not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("BANKTYPE between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("BANKTYPE not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNull() {
            addCriterion("ISPAYPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNotNull() {
            addCriterion("ISPAYPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicEqualTo(String value) {
            addCriterion("ISPAYPUBLIC =", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <>", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThan(String value) {
            addCriterion("ISPAYPUBLIC >", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC >=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThan(String value) {
            addCriterion("ISPAYPUBLIC <", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLike(String value) {
            addCriterion("ISPAYPUBLIC like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotLike(String value) {
            addCriterion("ISPAYPUBLIC not like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIn(List<String> values) {
            addCriterion("ISPAYPUBLIC in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotIn(List<String> values) {
            addCriterion("ISPAYPUBLIC not in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC not between", value1, value2, "ispaypublic");
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

        public Criteria andRibillnoIsNull() {
            addCriterion("RIBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andRibillnoIsNotNull() {
            addCriterion("RIBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andRibillnoEqualTo(String value) {
            addCriterion("RIBILLNO =", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotEqualTo(String value) {
            addCriterion("RIBILLNO <>", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoGreaterThan(String value) {
            addCriterion("RIBILLNO >", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoGreaterThanOrEqualTo(String value) {
            addCriterion("RIBILLNO >=", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLessThan(String value) {
            addCriterion("RIBILLNO <", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLessThanOrEqualTo(String value) {
            addCriterion("RIBILLNO <=", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLike(String value) {
            addCriterion("RIBILLNO like", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotLike(String value) {
            addCriterion("RIBILLNO not like", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoIn(List<String> values) {
            addCriterion("RIBILLNO in", values, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotIn(List<String> values) {
            addCriterion("RIBILLNO not in", values, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoBetween(String value1, String value2) {
            addCriterion("RIBILLNO between", value1, value2, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotBetween(String value1, String value2) {
            addCriterion("RIBILLNO not between", value1, value2, "ribillno");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNull() {
            addCriterion("REINSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNotNull() {
            addCriterion("REINSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeEqualTo(String value) {
            addCriterion("REINSURERCODE =", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotEqualTo(String value) {
            addCriterion("REINSURERCODE <>", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThan(String value) {
            addCriterion("REINSURERCODE >", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE >=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThan(String value) {
            addCriterion("REINSURERCODE <", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE <=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLike(String value) {
            addCriterion("REINSURERCODE like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotLike(String value) {
            addCriterion("REINSURERCODE not like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIn(List<String> values) {
            addCriterion("REINSURERCODE in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotIn(List<String> values) {
            addCriterion("REINSURERCODE not in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeBetween(String value1, String value2) {
            addCriterion("REINSURERCODE between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotBetween(String value1, String value2) {
            addCriterion("REINSURERCODE not between", value1, value2, "reinsurercode");
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

        public Criteria andSeqnoIsNull() {
            addCriterion("SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(BigDecimal value) {
            addCriterion("SEQNO =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(BigDecimal value) {
            addCriterion("SEQNO <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(BigDecimal value) {
            addCriterion("SEQNO >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQNO >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(BigDecimal value) {
            addCriterion("SEQNO <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQNO <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<BigDecimal> values) {
            addCriterion("SEQNO in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<BigDecimal> values) {
            addCriterion("SEQNO not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQNO between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQNO not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSignamountIsNull() {
            addCriterion("SIGNAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSignamountIsNotNull() {
            addCriterion("SIGNAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSignamountEqualTo(BigDecimal value) {
            addCriterion("SIGNAMOUNT =", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountNotEqualTo(BigDecimal value) {
            addCriterion("SIGNAMOUNT <>", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountGreaterThan(BigDecimal value) {
            addCriterion("SIGNAMOUNT >", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNAMOUNT >=", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountLessThan(BigDecimal value) {
            addCriterion("SIGNAMOUNT <", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNAMOUNT <=", value, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountIn(List<BigDecimal> values) {
            addCriterion("SIGNAMOUNT in", values, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountNotIn(List<BigDecimal> values) {
            addCriterion("SIGNAMOUNT not in", values, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNAMOUNT between", value1, value2, "signamount");
            return (Criteria) this;
        }

        public Criteria andSignamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNAMOUNT not between", value1, value2, "signamount");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNull() {
            addCriterion("BILLCODE is null");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNotNull() {
            addCriterion("BILLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillcodeEqualTo(String value) {
            addCriterion("BILLCODE =", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotEqualTo(String value) {
            addCriterion("BILLCODE <>", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThan(String value) {
            addCriterion("BILLCODE >", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLCODE >=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThan(String value) {
            addCriterion("BILLCODE <", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThanOrEqualTo(String value) {
            addCriterion("BILLCODE <=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLike(String value) {
            addCriterion("BILLCODE like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotLike(String value) {
            addCriterion("BILLCODE not like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeIn(List<String> values) {
            addCriterion("BILLCODE in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotIn(List<String> values) {
            addCriterion("BILLCODE not in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeBetween(String value1, String value2) {
            addCriterion("BILLCODE between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotBetween(String value1, String value2) {
            addCriterion("BILLCODE not between", value1, value2, "billcode");
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

        public Criteria andIfbillbackIsNull() {
            addCriterion("IFBILLBACK is null");
            return (Criteria) this;
        }

        public Criteria andIfbillbackIsNotNull() {
            addCriterion("IFBILLBACK is not null");
            return (Criteria) this;
        }

        public Criteria andIfbillbackEqualTo(String value) {
            addCriterion("IFBILLBACK =", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotEqualTo(String value) {
            addCriterion("IFBILLBACK <>", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackGreaterThan(String value) {
            addCriterion("IFBILLBACK >", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackGreaterThanOrEqualTo(String value) {
            addCriterion("IFBILLBACK >=", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLessThan(String value) {
            addCriterion("IFBILLBACK <", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLessThanOrEqualTo(String value) {
            addCriterion("IFBILLBACK <=", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLike(String value) {
            addCriterion("IFBILLBACK like", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotLike(String value) {
            addCriterion("IFBILLBACK not like", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackIn(List<String> values) {
            addCriterion("IFBILLBACK in", values, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotIn(List<String> values) {
            addCriterion("IFBILLBACK not in", values, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackBetween(String value1, String value2) {
            addCriterion("IFBILLBACK between", value1, value2, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotBetween(String value1, String value2) {
            addCriterion("IFBILLBACK not between", value1, value2, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andRibillcountIsNull() {
            addCriterion("RIBILLCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRibillcountIsNotNull() {
            addCriterion("RIBILLCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRibillcountEqualTo(BigDecimal value) {
            addCriterion("RIBILLCOUNT =", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountNotEqualTo(BigDecimal value) {
            addCriterion("RIBILLCOUNT <>", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountGreaterThan(BigDecimal value) {
            addCriterion("RIBILLCOUNT >", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RIBILLCOUNT >=", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountLessThan(BigDecimal value) {
            addCriterion("RIBILLCOUNT <", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RIBILLCOUNT <=", value, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountIn(List<BigDecimal> values) {
            addCriterion("RIBILLCOUNT in", values, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountNotIn(List<BigDecimal> values) {
            addCriterion("RIBILLCOUNT not in", values, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RIBILLCOUNT between", value1, value2, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andRibillcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RIBILLCOUNT not between", value1, value2, "ribillcount");
            return (Criteria) this;
        }

        public Criteria andIffinalIsNull() {
            addCriterion("IFFINAL is null");
            return (Criteria) this;
        }

        public Criteria andIffinalIsNotNull() {
            addCriterion("IFFINAL is not null");
            return (Criteria) this;
        }

        public Criteria andIffinalEqualTo(String value) {
            addCriterion("IFFINAL =", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalNotEqualTo(String value) {
            addCriterion("IFFINAL <>", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalGreaterThan(String value) {
            addCriterion("IFFINAL >", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalGreaterThanOrEqualTo(String value) {
            addCriterion("IFFINAL >=", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalLessThan(String value) {
            addCriterion("IFFINAL <", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalLessThanOrEqualTo(String value) {
            addCriterion("IFFINAL <=", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalLike(String value) {
            addCriterion("IFFINAL like", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalNotLike(String value) {
            addCriterion("IFFINAL not like", value, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalIn(List<String> values) {
            addCriterion("IFFINAL in", values, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalNotIn(List<String> values) {
            addCriterion("IFFINAL not in", values, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalBetween(String value1, String value2) {
            addCriterion("IFFINAL between", value1, value2, "iffinal");
            return (Criteria) this;
        }

        public Criteria andIffinalNotBetween(String value1, String value2) {
            addCriterion("IFFINAL not between", value1, value2, "iffinal");
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

        public Criteria andConversionrateIsNull() {
            addCriterion("CONVERSIONRATE is null");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNotNull() {
            addCriterion("CONVERSIONRATE is not null");
            return (Criteria) this;
        }

        public Criteria andConversionrateEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE =", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE <>", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThan(BigDecimal value) {
            addCriterion("CONVERSIONRATE >", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE >=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThan(BigDecimal value) {
            addCriterion("CONVERSIONRATE <", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE <=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateIn(List<BigDecimal> values) {
            addCriterion("CONVERSIONRATE in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotIn(List<BigDecimal> values) {
            addCriterion("CONVERSIONRATE not in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSIONRATE between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSIONRATE not between", value1, value2, "conversionrate");
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

        public Criteria andClassessprodIsNull() {
            addCriterion("CLASSESSPROD is null");
            return (Criteria) this;
        }

        public Criteria andClassessprodIsNotNull() {
            addCriterion("CLASSESSPROD is not null");
            return (Criteria) this;
        }

        public Criteria andClassessprodEqualTo(String value) {
            addCriterion("CLASSESSPROD =", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodNotEqualTo(String value) {
            addCriterion("CLASSESSPROD <>", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodGreaterThan(String value) {
            addCriterion("CLASSESSPROD >", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESSPROD >=", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodLessThan(String value) {
            addCriterion("CLASSESSPROD <", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodLessThanOrEqualTo(String value) {
            addCriterion("CLASSESSPROD <=", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodLike(String value) {
            addCriterion("CLASSESSPROD like", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodNotLike(String value) {
            addCriterion("CLASSESSPROD not like", value, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodIn(List<String> values) {
            addCriterion("CLASSESSPROD in", values, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodNotIn(List<String> values) {
            addCriterion("CLASSESSPROD not in", values, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodBetween(String value1, String value2) {
            addCriterion("CLASSESSPROD between", value1, value2, "classessprod");
            return (Criteria) this;
        }

        public Criteria andClassessprodNotBetween(String value1, String value2) {
            addCriterion("CLASSESSPROD not between", value1, value2, "classessprod");
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

        public Criteria andMarineflagIsNull() {
            addCriterion("MARINEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andMarineflagIsNotNull() {
            addCriterion("MARINEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMarineflagEqualTo(String value) {
            addCriterion("MARINEFLAG =", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotEqualTo(String value) {
            addCriterion("MARINEFLAG <>", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagGreaterThan(String value) {
            addCriterion("MARINEFLAG >", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagGreaterThanOrEqualTo(String value) {
            addCriterion("MARINEFLAG >=", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLessThan(String value) {
            addCriterion("MARINEFLAG <", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLessThanOrEqualTo(String value) {
            addCriterion("MARINEFLAG <=", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLike(String value) {
            addCriterion("MARINEFLAG like", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotLike(String value) {
            addCriterion("MARINEFLAG not like", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagIn(List<String> values) {
            addCriterion("MARINEFLAG in", values, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotIn(List<String> values) {
            addCriterion("MARINEFLAG not in", values, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagBetween(String value1, String value2) {
            addCriterion("MARINEFLAG between", value1, value2, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotBetween(String value1, String value2) {
            addCriterion("MARINEFLAG not between", value1, value2, "marineflag");
            return (Criteria) this;
        }

        public Criteria andProcudecodeIsNull() {
            addCriterion("PROCUDECODE is null");
            return (Criteria) this;
        }

        public Criteria andProcudecodeIsNotNull() {
            addCriterion("PROCUDECODE is not null");
            return (Criteria) this;
        }

        public Criteria andProcudecodeEqualTo(String value) {
            addCriterion("PROCUDECODE =", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeNotEqualTo(String value) {
            addCriterion("PROCUDECODE <>", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeGreaterThan(String value) {
            addCriterion("PROCUDECODE >", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCUDECODE >=", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeLessThan(String value) {
            addCriterion("PROCUDECODE <", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeLessThanOrEqualTo(String value) {
            addCriterion("PROCUDECODE <=", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeLike(String value) {
            addCriterion("PROCUDECODE like", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeNotLike(String value) {
            addCriterion("PROCUDECODE not like", value, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeIn(List<String> values) {
            addCriterion("PROCUDECODE in", values, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeNotIn(List<String> values) {
            addCriterion("PROCUDECODE not in", values, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeBetween(String value1, String value2) {
            addCriterion("PROCUDECODE between", value1, value2, "procudecode");
            return (Criteria) this;
        }

        public Criteria andProcudecodeNotBetween(String value1, String value2) {
            addCriterion("PROCUDECODE not between", value1, value2, "procudecode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_batchinfo_td
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
     * @Table : mm_batchinfo_td
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