package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmTempRiinsurenceTiExample {
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
    public MmTempRiinsurenceTiExample() {
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
     * @Table : mm_temp_riinsurence_ti
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

        public Criteria andSeqricontracttabIsNull() {
            addCriterion("SEQRICONTRACTTAB is null");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabIsNotNull() {
            addCriterion("SEQRICONTRACTTAB is not null");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB =", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB <>", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabGreaterThan(Long value) {
            addCriterion("SEQRICONTRACTTAB >", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB >=", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabLessThan(Long value) {
            addCriterion("SEQRICONTRACTTAB <", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabLessThanOrEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB <=", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabIn(List<Long> values) {
            addCriterion("SEQRICONTRACTTAB in", values, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotIn(List<Long> values) {
            addCriterion("SEQRICONTRACTTAB not in", values, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabBetween(Long value1, Long value2) {
            addCriterion("SEQRICONTRACTTAB between", value1, value2, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotBetween(Long value1, Long value2) {
            addCriterion("SEQRICONTRACTTAB not between", value1, value2, "seqricontracttab");
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

        public Criteria andTabperiodIsNull() {
            addCriterion("TABPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTabperiodIsNotNull() {
            addCriterion("TABPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTabperiodEqualTo(String value) {
            addCriterion("TABPERIOD =", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotEqualTo(String value) {
            addCriterion("TABPERIOD <>", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThan(String value) {
            addCriterion("TABPERIOD >", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThanOrEqualTo(String value) {
            addCriterion("TABPERIOD >=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThan(String value) {
            addCriterion("TABPERIOD <", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThanOrEqualTo(String value) {
            addCriterion("TABPERIOD <=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLike(String value) {
            addCriterion("TABPERIOD like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotLike(String value) {
            addCriterion("TABPERIOD not like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodIn(List<String> values) {
            addCriterion("TABPERIOD in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotIn(List<String> values) {
            addCriterion("TABPERIOD not in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodBetween(String value1, String value2) {
            addCriterion("TABPERIOD between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotBetween(String value1, String value2) {
            addCriterion("TABPERIOD not between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNull() {
            addCriterion("CONTRACTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNotNull() {
            addCriterion("CONTRACTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractcodeEqualTo(String value) {
            addCriterion("CONTRACTCODE =", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotEqualTo(String value) {
            addCriterion("CONTRACTCODE <>", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThan(String value) {
            addCriterion("CONTRACTCODE >", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE >=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThan(String value) {
            addCriterion("CONTRACTCODE <", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE <=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLike(String value) {
            addCriterion("CONTRACTCODE like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotLike(String value) {
            addCriterion("CONTRACTCODE not like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeIn(List<String> values) {
            addCriterion("CONTRACTCODE in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotIn(List<String> values) {
            addCriterion("CONTRACTCODE not in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE not between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("LAYER is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(BigDecimal value) {
            addCriterion("LAYER =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(BigDecimal value) {
            addCriterion("LAYER <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(BigDecimal value) {
            addCriterion("LAYER >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYER >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(BigDecimal value) {
            addCriterion("LAYER <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYER <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<BigDecimal> values) {
            addCriterion("LAYER in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<BigDecimal> values) {
            addCriterion("LAYER not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYER between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYER not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNull() {
            addCriterion("QSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNotNull() {
            addCriterion("QSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQstypeEqualTo(String value) {
            addCriterion("QSTYPE =", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotEqualTo(String value) {
            addCriterion("QSTYPE <>", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThan(String value) {
            addCriterion("QSTYPE >", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThanOrEqualTo(String value) {
            addCriterion("QSTYPE >=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThan(String value) {
            addCriterion("QSTYPE <", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThanOrEqualTo(String value) {
            addCriterion("QSTYPE <=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLike(String value) {
            addCriterion("QSTYPE like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotLike(String value) {
            addCriterion("QSTYPE not like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeIn(List<String> values) {
            addCriterion("QSTYPE in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotIn(List<String> values) {
            addCriterion("QSTYPE not in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeBetween(String value1, String value2) {
            addCriterion("QSTYPE between", value1, value2, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotBetween(String value1, String value2) {
            addCriterion("QSTYPE not between", value1, value2, "qstype");
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

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(BigDecimal value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(BigDecimal value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(BigDecimal value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(BigDecimal value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<BigDecimal> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<BigDecimal> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
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

        public Criteria andRipremiumIsNull() {
            addCriterion("RIPREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andRipremiumIsNotNull() {
            addCriterion("RIPREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andRipremiumEqualTo(BigDecimal value) {
            addCriterion("RIPREMIUM =", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumNotEqualTo(BigDecimal value) {
            addCriterion("RIPREMIUM <>", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumGreaterThan(BigDecimal value) {
            addCriterion("RIPREMIUM >", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RIPREMIUM >=", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumLessThan(BigDecimal value) {
            addCriterion("RIPREMIUM <", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RIPREMIUM <=", value, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumIn(List<BigDecimal> values) {
            addCriterion("RIPREMIUM in", values, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumNotIn(List<BigDecimal> values) {
            addCriterion("RIPREMIUM not in", values, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RIPREMIUM between", value1, value2, "ripremium");
            return (Criteria) this;
        }

        public Criteria andRipremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RIPREMIUM not between", value1, value2, "ripremium");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedIsNull() {
            addCriterion("PRMRSVRETAINED is null");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedIsNotNull() {
            addCriterion("PRMRSVRETAINED is not null");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRETAINED =", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedNotEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRETAINED <>", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedGreaterThan(BigDecimal value) {
            addCriterion("PRMRSVRETAINED >", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRETAINED >=", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedLessThan(BigDecimal value) {
            addCriterion("PRMRSVRETAINED <", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRETAINED <=", value, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedIn(List<BigDecimal> values) {
            addCriterion("PRMRSVRETAINED in", values, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedNotIn(List<BigDecimal> values) {
            addCriterion("PRMRSVRETAINED not in", values, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRMRSVRETAINED between", value1, value2, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andPrmrsvretainedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRMRSVRETAINED not between", value1, value2, "prmrsvretained");
            return (Criteria) this;
        }

        public Criteria andRsvinterestIsNull() {
            addCriterion("RSVINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andRsvinterestIsNotNull() {
            addCriterion("RSVINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andRsvinterestEqualTo(BigDecimal value) {
            addCriterion("RSVINTEREST =", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestNotEqualTo(BigDecimal value) {
            addCriterion("RSVINTEREST <>", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestGreaterThan(BigDecimal value) {
            addCriterion("RSVINTEREST >", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSVINTEREST >=", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestLessThan(BigDecimal value) {
            addCriterion("RSVINTEREST <", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSVINTEREST <=", value, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestIn(List<BigDecimal> values) {
            addCriterion("RSVINTEREST in", values, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestNotIn(List<BigDecimal> values) {
            addCriterion("RSVINTEREST not in", values, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSVINTEREST between", value1, value2, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andRsvinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSVINTEREST not between", value1, value2, "rsvinterest");
            return (Criteria) this;
        }

        public Criteria andCashcallIsNull() {
            addCriterion("CASHCALL is null");
            return (Criteria) this;
        }

        public Criteria andCashcallIsNotNull() {
            addCriterion("CASHCALL is not null");
            return (Criteria) this;
        }

        public Criteria andCashcallEqualTo(BigDecimal value) {
            addCriterion("CASHCALL =", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallNotEqualTo(BigDecimal value) {
            addCriterion("CASHCALL <>", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallGreaterThan(BigDecimal value) {
            addCriterion("CASHCALL >", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHCALL >=", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallLessThan(BigDecimal value) {
            addCriterion("CASHCALL <", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHCALL <=", value, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallIn(List<BigDecimal> values) {
            addCriterion("CASHCALL in", values, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallNotIn(List<BigDecimal> values) {
            addCriterion("CASHCALL not in", values, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHCALL between", value1, value2, "cashcall");
            return (Criteria) this;
        }

        public Criteria andCashcallNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHCALL not between", value1, value2, "cashcall");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmIsNull() {
            addCriterion("PORTFOLIOPRM is null");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmIsNotNull() {
            addCriterion("PORTFOLIOPRM is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOPRM =", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmNotEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOPRM <>", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmGreaterThan(BigDecimal value) {
            addCriterion("PORTFOLIOPRM >", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOPRM >=", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmLessThan(BigDecimal value) {
            addCriterion("PORTFOLIOPRM <", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOPRM <=", value, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOPRM in", values, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmNotIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOPRM not in", values, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOPRM between", value1, value2, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfolioprmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOPRM not between", value1, value2, "portfolioprm");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossIsNull() {
            addCriterion("PORTFOLIOLOSS is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossIsNotNull() {
            addCriterion("PORTFOLIOLOSS is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS =", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossNotEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS <>", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossGreaterThan(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS >", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS >=", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossLessThan(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS <", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOLOSS <=", value, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOLOSS in", values, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossNotIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOLOSS not in", values, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOLOSS between", value1, value2, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPortfoliolossNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOLOSS not between", value1, value2, "portfolioloss");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseIsNull() {
            addCriterion("PRMRSVRELEASE is null");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseIsNotNull() {
            addCriterion("PRMRSVRELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRELEASE =", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseNotEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRELEASE <>", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseGreaterThan(BigDecimal value) {
            addCriterion("PRMRSVRELEASE >", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRELEASE >=", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseLessThan(BigDecimal value) {
            addCriterion("PRMRSVRELEASE <", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRMRSVRELEASE <=", value, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseIn(List<BigDecimal> values) {
            addCriterion("PRMRSVRELEASE in", values, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseNotIn(List<BigDecimal> values) {
            addCriterion("PRMRSVRELEASE not in", values, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRMRSVRELEASE between", value1, value2, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andPrmrsvreleaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRMRSVRELEASE not between", value1, value2, "prmrsvrelease");
            return (Criteria) this;
        }

        public Criteria andFactorageIsNull() {
            addCriterion("FACTORAGE is null");
            return (Criteria) this;
        }

        public Criteria andFactorageIsNotNull() {
            addCriterion("FACTORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFactorageEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE =", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE <>", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageGreaterThan(BigDecimal value) {
            addCriterion("FACTORAGE >", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE >=", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageLessThan(BigDecimal value) {
            addCriterion("FACTORAGE <", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE <=", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageIn(List<BigDecimal> values) {
            addCriterion("FACTORAGE in", values, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotIn(List<BigDecimal> values) {
            addCriterion("FACTORAGE not in", values, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORAGE between", value1, value2, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORAGE not between", value1, value2, "factorage");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andProfitfacIsNull() {
            addCriterion("PROFITFAC is null");
            return (Criteria) this;
        }

        public Criteria andProfitfacIsNotNull() {
            addCriterion("PROFITFAC is not null");
            return (Criteria) this;
        }

        public Criteria andProfitfacEqualTo(BigDecimal value) {
            addCriterion("PROFITFAC =", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacNotEqualTo(BigDecimal value) {
            addCriterion("PROFITFAC <>", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacGreaterThan(BigDecimal value) {
            addCriterion("PROFITFAC >", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFITFAC >=", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacLessThan(BigDecimal value) {
            addCriterion("PROFITFAC <", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFITFAC <=", value, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacIn(List<BigDecimal> values) {
            addCriterion("PROFITFAC in", values, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacNotIn(List<BigDecimal> values) {
            addCriterion("PROFITFAC not in", values, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFITFAC between", value1, value2, "profitfac");
            return (Criteria) this;
        }

        public Criteria andProfitfacNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFITFAC not between", value1, value2, "profitfac");
            return (Criteria) this;
        }

        public Criteria andLossesIsNull() {
            addCriterion("LOSSES is null");
            return (Criteria) this;
        }

        public Criteria andLossesIsNotNull() {
            addCriterion("LOSSES is not null");
            return (Criteria) this;
        }

        public Criteria andLossesEqualTo(BigDecimal value) {
            addCriterion("LOSSES =", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesNotEqualTo(BigDecimal value) {
            addCriterion("LOSSES <>", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesGreaterThan(BigDecimal value) {
            addCriterion("LOSSES >", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSSES >=", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesLessThan(BigDecimal value) {
            addCriterion("LOSSES <", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSSES <=", value, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesIn(List<BigDecimal> values) {
            addCriterion("LOSSES in", values, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesNotIn(List<BigDecimal> values) {
            addCriterion("LOSSES not in", values, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSSES between", value1, value2, "losses");
            return (Criteria) this;
        }

        public Criteria andLossesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSSES not between", value1, value2, "losses");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNull() {
            addCriterion("OTHERFEE is null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNotNull() {
            addCriterion("OTHERFEE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE =", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE <>", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThan(BigDecimal value) {
            addCriterion("OTHERFEE >", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE >=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThan(BigDecimal value) {
            addCriterion("OTHERFEE <", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE <=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIn(List<BigDecimal> values) {
            addCriterion("OTHERFEE in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotIn(List<BigDecimal> values) {
            addCriterion("OTHERFEE not in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERFEE between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERFEE not between", value1, value2, "otherfee");
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_riinsurence_ti
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
     * @Table : mm_temp_riinsurence_ti
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