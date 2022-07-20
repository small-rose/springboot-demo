package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmSettlementforaxavoTempExample {
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
    public MmSettlementforaxavoTempExample() {
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
     * @Table : mm_settlementforaxavo_temp
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNull() {
            addCriterion("applydataid is null");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNotNull() {
            addCriterion("applydataid is not null");
            return (Criteria) this;
        }

        public Criteria andApplydataidEqualTo(String value) {
            addCriterion("applydataid =", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotEqualTo(String value) {
            addCriterion("applydataid <>", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThan(String value) {
            addCriterion("applydataid >", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThanOrEqualTo(String value) {
            addCriterion("applydataid >=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThan(String value) {
            addCriterion("applydataid <", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThanOrEqualTo(String value) {
            addCriterion("applydataid <=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLike(String value) {
            addCriterion("applydataid like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotLike(String value) {
            addCriterion("applydataid not like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidIn(List<String> values) {
            addCriterion("applydataid in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotIn(List<String> values) {
            addCriterion("applydataid not in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidBetween(String value1, String value2) {
            addCriterion("applydataid between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotBetween(String value1, String value2) {
            addCriterion("applydataid not between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andMergeidIsNull() {
            addCriterion("mergeid is null");
            return (Criteria) this;
        }

        public Criteria andMergeidIsNotNull() {
            addCriterion("mergeid is not null");
            return (Criteria) this;
        }

        public Criteria andMergeidEqualTo(String value) {
            addCriterion("mergeid =", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotEqualTo(String value) {
            addCriterion("mergeid <>", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidGreaterThan(String value) {
            addCriterion("mergeid >", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidGreaterThanOrEqualTo(String value) {
            addCriterion("mergeid >=", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLessThan(String value) {
            addCriterion("mergeid <", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLessThanOrEqualTo(String value) {
            addCriterion("mergeid <=", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidLike(String value) {
            addCriterion("mergeid like", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotLike(String value) {
            addCriterion("mergeid not like", value, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidIn(List<String> values) {
            addCriterion("mergeid in", values, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotIn(List<String> values) {
            addCriterion("mergeid not in", values, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidBetween(String value1, String value2) {
            addCriterion("mergeid between", value1, value2, "mergeid");
            return (Criteria) this;
        }

        public Criteria andMergeidNotBetween(String value1, String value2) {
            addCriterion("mergeid not between", value1, value2, "mergeid");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNull() {
            addCriterion("settlementno is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("settlementno is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(Long value) {
            addCriterion("settlementno =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(Long value) {
            addCriterion("settlementno <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(Long value) {
            addCriterion("settlementno >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(Long value) {
            addCriterion("settlementno >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(Long value) {
            addCriterion("settlementno <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(Long value) {
            addCriterion("settlementno <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<Long> values) {
            addCriterion("settlementno in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<Long> values) {
            addCriterion("settlementno not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(Long value1, Long value2) {
            addCriterion("settlementno between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(Long value1, Long value2) {
            addCriterion("settlementno not between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoIsNull() {
            addCriterion("ifoldcustaccountno is null");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoIsNotNull() {
            addCriterion("ifoldcustaccountno is not null");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoEqualTo(String value) {
            addCriterion("ifoldcustaccountno =", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoNotEqualTo(String value) {
            addCriterion("ifoldcustaccountno <>", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoGreaterThan(String value) {
            addCriterion("ifoldcustaccountno >", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ifoldcustaccountno >=", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoLessThan(String value) {
            addCriterion("ifoldcustaccountno <", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("ifoldcustaccountno <=", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoLike(String value) {
            addCriterion("ifoldcustaccountno like", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoNotLike(String value) {
            addCriterion("ifoldcustaccountno not like", value, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoIn(List<String> values) {
            addCriterion("ifoldcustaccountno in", values, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoNotIn(List<String> values) {
            addCriterion("ifoldcustaccountno not in", values, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoBetween(String value1, String value2) {
            addCriterion("ifoldcustaccountno between", value1, value2, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andIfoldcustaccountnoNotBetween(String value1, String value2) {
            addCriterion("ifoldcustaccountno not between", value1, value2, "ifoldcustaccountno");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andPayableseqIsNull() {
            addCriterion("payableseq is null");
            return (Criteria) this;
        }

        public Criteria andPayableseqIsNotNull() {
            addCriterion("payableseq is not null");
            return (Criteria) this;
        }

        public Criteria andPayableseqEqualTo(Long value) {
            addCriterion("payableseq =", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotEqualTo(Long value) {
            addCriterion("payableseq <>", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqGreaterThan(Long value) {
            addCriterion("payableseq >", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqGreaterThanOrEqualTo(Long value) {
            addCriterion("payableseq >=", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqLessThan(Long value) {
            addCriterion("payableseq <", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqLessThanOrEqualTo(Long value) {
            addCriterion("payableseq <=", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqIn(List<Long> values) {
            addCriterion("payableseq in", values, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotIn(List<Long> values) {
            addCriterion("payableseq not in", values, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqBetween(Long value1, Long value2) {
            addCriterion("payableseq between", value1, value2, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotBetween(Long value1, Long value2) {
            addCriterion("payableseq not between", value1, value2, "payableseq");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNull() {
            addCriterion("summaryno is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("summaryno is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("summaryno =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("summaryno <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("summaryno >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("summaryno >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("summaryno <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("summaryno <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("summaryno like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("summaryno not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("summaryno in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("summaryno not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("summaryno between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("summaryno not between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("datatype is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("datatype is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("datatype =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("datatype <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("datatype >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("datatype >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("datatype <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("datatype <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("datatype like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("datatype not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("datatype in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("datatype not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("datatype between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("datatype not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businesstype is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businesstype is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("businesstype =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("businesstype <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("businesstype >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("businesstype >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("businesstype <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("businesstype <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("businesstype like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("businesstype not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("businesstype in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("businesstype not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("businesstype between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("businesstype not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNull() {
            addCriterion("fatherno is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("fatherno is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(Long value) {
            addCriterion("fatherno =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(Long value) {
            addCriterion("fatherno <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(Long value) {
            addCriterion("fatherno >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(Long value) {
            addCriterion("fatherno >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(Long value) {
            addCriterion("fatherno <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(Long value) {
            addCriterion("fatherno <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<Long> values) {
            addCriterion("fatherno in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<Long> values) {
            addCriterion("fatherno not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(Long value1, Long value2) {
            addCriterion("fatherno between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(Long value1, Long value2) {
            addCriterion("fatherno not between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subcompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subcompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subcompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subcompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subcompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subcompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subcompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subcompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subcompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subcompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subcompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subcompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subcompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subcompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("unitcode is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("unitcode is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("unitcode =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("unitcode <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("unitcode >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unitcode >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("unitcode <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("unitcode <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("unitcode like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("unitcode not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("unitcode in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("unitcode not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("unitcode between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("unitcode not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencycode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencycode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencycode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencycode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencycode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencycode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencycode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencycode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencycode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencycode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencycode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencycode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencycode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencycode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNull() {
            addCriterion("handledamount is null");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNotNull() {
            addCriterion("handledamount is not null");
            return (Criteria) this;
        }

        public Criteria andHandledamountEqualTo(BigDecimal value) {
            addCriterion("handledamount =", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotEqualTo(BigDecimal value) {
            addCriterion("handledamount <>", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThan(BigDecimal value) {
            addCriterion("handledamount >", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("handledamount >=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThan(BigDecimal value) {
            addCriterion("handledamount <", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("handledamount <=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountIn(List<BigDecimal> values) {
            addCriterion("handledamount in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotIn(List<BigDecimal> values) {
            addCriterion("handledamount not in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handledamount between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handledamount not between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNull() {
            addCriterion("usedamount is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("usedamount is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("usedamount =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("usedamount <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("usedamount >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usedamount >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("usedamount <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usedamount <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("usedamount in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("usedamount not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedamount between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedamount not between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("basecurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("basecurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("basecurrencycode =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("basecurrencycode <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("basecurrencycode >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("basecurrencycode >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("basecurrencycode <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("basecurrencycode <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("basecurrencycode like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("basecurrencycode not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("basecurrencycode in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("basecurrencycode not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("basecurrencycode between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("basecurrencycode not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIsNull() {
            addCriterion("handledbaseamount is null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIsNotNull() {
            addCriterion("handledbaseamount is not null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountEqualTo(BigDecimal value) {
            addCriterion("handledbaseamount =", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotEqualTo(BigDecimal value) {
            addCriterion("handledbaseamount <>", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThan(BigDecimal value) {
            addCriterion("handledbaseamount >", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("handledbaseamount >=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThan(BigDecimal value) {
            addCriterion("handledbaseamount <", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("handledbaseamount <=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIn(List<BigDecimal> values) {
            addCriterion("handledbaseamount in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotIn(List<BigDecimal> values) {
            addCriterion("handledbaseamount not in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handledbaseamount between", value1, value2, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handledbaseamount not between", value1, value2, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("baseamount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("baseamount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("baseamount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("baseamount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("baseamount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("baseamount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNull() {
            addCriterion("baseusedamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNotNull() {
            addCriterion("baseusedamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountEqualTo(BigDecimal value) {
            addCriterion("baseusedamount =", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotEqualTo(BigDecimal value) {
            addCriterion("baseusedamount <>", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThan(BigDecimal value) {
            addCriterion("baseusedamount >", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseusedamount >=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThan(BigDecimal value) {
            addCriterion("baseusedamount <", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseusedamount <=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIn(List<BigDecimal> values) {
            addCriterion("baseusedamount in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotIn(List<BigDecimal> values) {
            addCriterion("baseusedamount not in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseusedamount between", value1, value2, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseusedamount not between", value1, value2, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("customercode is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("customercode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("customercode =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("customercode <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("customercode >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("customercode >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("customercode <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("customercode <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("customercode like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("customercode not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("customercode in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("customercode not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("customercode between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("customercode not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNull() {
            addCriterion("customernameen is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("customernameen is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("customernameen =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("customernameen <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("customernameen >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("customernameen >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("customernameen <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("customernameen <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("customernameen like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("customernameen not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("customernameen in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("customernameen not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("customernameen between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("customernameen not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("customerpartyno is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("customerpartyno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("customerpartyno =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("customerpartyno <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("customerpartyno >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("customerpartyno >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("customerpartyno <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("customerpartyno <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("customerpartyno like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("customerpartyno not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("customerpartyno in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("customerpartyno not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("customerpartyno between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("customerpartyno not between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("opdate is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("opdate is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterion("opdate =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterion("opdate <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterion("opdate >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("opdate >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterion("opdate <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterion("opdate <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterion("opdate in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterion("opdate not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterion("opdate between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterion("opdate not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("opcode is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("opcode is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("opcode =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("opcode <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("opcode >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opcode >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("opcode <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("opcode <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("opcode like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("opcode not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("opcode in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("opcode not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("opcode between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("opcode not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("lastopdate is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("lastopdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("lastopdate =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("lastopdate <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("lastopdate >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdate >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("lastopdate <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("lastopdate <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("lastopdate in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("lastopdate not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("lastopdate between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("lastopdate not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("agentcode is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("agentcode is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("agentcode =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("agentcode <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("agentcode >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("agentcode >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("agentcode <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("agentcode <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("agentcode like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("agentcode not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("agentcode in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("agentcode not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("agentcode between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("agentcode not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("policyno is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("policyno is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("policyno =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("policyno <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("policyno >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("policyno >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("policyno <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("policyno <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("policyno like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("policyno not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("policyno in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("policyno not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("policyno between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("policyno not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("endorseno is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("endorseno is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("endorseno =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("endorseno <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("endorseno >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("endorseno >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("endorseno <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("endorseno <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("endorseno like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("endorseno not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("endorseno in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("endorseno not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("endorseno between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("endorseno not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("classescode is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("classescode is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("classescode =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("classescode <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("classescode >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("classescode >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("classescode <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("classescode <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("classescode like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("classescode not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("classescode in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("classescode not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("classescode between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("classescode not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNull() {
            addCriterion("risktype is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("risktype is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("risktype =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("risktype <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("risktype >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("risktype >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("risktype <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("risktype <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("risktype like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("risktype not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("risktype in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("risktype not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("risktype between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("risktype not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNull() {
            addCriterion("claimno is null");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNotNull() {
            addCriterion("claimno is not null");
            return (Criteria) this;
        }

        public Criteria andClaimnoEqualTo(String value) {
            addCriterion("claimno =", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotEqualTo(String value) {
            addCriterion("claimno <>", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThan(String value) {
            addCriterion("claimno >", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThanOrEqualTo(String value) {
            addCriterion("claimno >=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThan(String value) {
            addCriterion("claimno <", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThanOrEqualTo(String value) {
            addCriterion("claimno <=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLike(String value) {
            addCriterion("claimno like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotLike(String value) {
            addCriterion("claimno not like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIn(List<String> values) {
            addCriterion("claimno in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotIn(List<String> values) {
            addCriterion("claimno not in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoBetween(String value1, String value2) {
            addCriterion("claimno between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotBetween(String value1, String value2) {
            addCriterion("claimno not between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNull() {
            addCriterion("returnno is null");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNotNull() {
            addCriterion("returnno is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnoEqualTo(String value) {
            addCriterion("returnno =", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotEqualTo(String value) {
            addCriterion("returnno <>", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThan(String value) {
            addCriterion("returnno >", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThanOrEqualTo(String value) {
            addCriterion("returnno >=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThan(String value) {
            addCriterion("returnno <", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThanOrEqualTo(String value) {
            addCriterion("returnno <=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLike(String value) {
            addCriterion("returnno like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotLike(String value) {
            addCriterion("returnno not like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIn(List<String> values) {
            addCriterion("returnno in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotIn(List<String> values) {
            addCriterion("returnno not in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoBetween(String value1, String value2) {
            addCriterion("returnno between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotBetween(String value1, String value2) {
            addCriterion("returnno not between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNull() {
            addCriterion("canceldate is null");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNotNull() {
            addCriterion("canceldate is not null");
            return (Criteria) this;
        }

        public Criteria andCanceldateEqualTo(Date value) {
            addCriterion("canceldate =", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotEqualTo(Date value) {
            addCriterion("canceldate <>", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThan(Date value) {
            addCriterion("canceldate >", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThanOrEqualTo(Date value) {
            addCriterion("canceldate >=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThan(Date value) {
            addCriterion("canceldate <", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThanOrEqualTo(Date value) {
            addCriterion("canceldate <=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIn(List<Date> values) {
            addCriterion("canceldate in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotIn(List<Date> values) {
            addCriterion("canceldate not in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateBetween(Date value1, Date value2) {
            addCriterion("canceldate between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotBetween(Date value1, Date value2) {
            addCriterion("canceldate not between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andCancelflagIsNull() {
            addCriterion("cancelflag is null");
            return (Criteria) this;
        }

        public Criteria andCancelflagIsNotNull() {
            addCriterion("cancelflag is not null");
            return (Criteria) this;
        }

        public Criteria andCancelflagEqualTo(String value) {
            addCriterion("cancelflag =", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotEqualTo(String value) {
            addCriterion("cancelflag <>", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThan(String value) {
            addCriterion("cancelflag >", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThanOrEqualTo(String value) {
            addCriterion("cancelflag >=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThan(String value) {
            addCriterion("cancelflag <", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThanOrEqualTo(String value) {
            addCriterion("cancelflag <=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLike(String value) {
            addCriterion("cancelflag like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotLike(String value) {
            addCriterion("cancelflag not like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagIn(List<String> values) {
            addCriterion("cancelflag in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotIn(List<String> values) {
            addCriterion("cancelflag not in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagBetween(String value1, String value2) {
            addCriterion("cancelflag between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotBetween(String value1, String value2) {
            addCriterion("cancelflag not between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNull() {
            addCriterion("businessattr is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("businessattr is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("businessattr =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("businessattr <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("businessattr >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("businessattr >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("businessattr <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("businessattr <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("businessattr like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("businessattr not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("businessattr in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("businessattr not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("businessattr between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("businessattr not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("serialno is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("serialno is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("serialno =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("serialno <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("serialno >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("serialno >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("serialno <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("serialno <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("serialno like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("serialno not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("serialno in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("serialno not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("serialno between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("serialno not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNull() {
            addCriterion("custseq is null");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNotNull() {
            addCriterion("custseq is not null");
            return (Criteria) this;
        }

        public Criteria andCustseqEqualTo(String value) {
            addCriterion("custseq =", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotEqualTo(String value) {
            addCriterion("custseq <>", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThan(String value) {
            addCriterion("custseq >", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThanOrEqualTo(String value) {
            addCriterion("custseq >=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThan(String value) {
            addCriterion("custseq <", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThanOrEqualTo(String value) {
            addCriterion("custseq <=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLike(String value) {
            addCriterion("custseq like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotLike(String value) {
            addCriterion("custseq not like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqIn(List<String> values) {
            addCriterion("custseq in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotIn(List<String> values) {
            addCriterion("custseq not in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqBetween(String value1, String value2) {
            addCriterion("custseq between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotBetween(String value1, String value2) {
            addCriterion("custseq not between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNull() {
            addCriterion("inpaymentbatchno is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNotNull() {
            addCriterion("inpaymentbatchno is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoEqualTo(String value) {
            addCriterion("inpaymentbatchno =", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotEqualTo(String value) {
            addCriterion("inpaymentbatchno <>", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThan(String value) {
            addCriterion("inpaymentbatchno >", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("inpaymentbatchno >=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThan(String value) {
            addCriterion("inpaymentbatchno <", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThanOrEqualTo(String value) {
            addCriterion("inpaymentbatchno <=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLike(String value) {
            addCriterion("inpaymentbatchno like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotLike(String value) {
            addCriterion("inpaymentbatchno not like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIn(List<String> values) {
            addCriterion("inpaymentbatchno in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotIn(List<String> values) {
            addCriterion("inpaymentbatchno not in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoBetween(String value1, String value2) {
            addCriterion("inpaymentbatchno between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotBetween(String value1, String value2) {
            addCriterion("inpaymentbatchno not between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("batchid is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("batchid is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("batchid =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("batchid <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("batchid >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("batchid >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("batchid <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("batchid <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("batchid like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("batchid not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("batchid in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("batchid not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("batchid between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("batchid not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoIsNull() {
            addCriterion("batchsummaryno is null");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoIsNotNull() {
            addCriterion("batchsummaryno is not null");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoEqualTo(String value) {
            addCriterion("batchsummaryno =", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotEqualTo(String value) {
            addCriterion("batchsummaryno <>", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoGreaterThan(String value) {
            addCriterion("batchsummaryno >", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("batchsummaryno >=", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLessThan(String value) {
            addCriterion("batchsummaryno <", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLessThanOrEqualTo(String value) {
            addCriterion("batchsummaryno <=", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLike(String value) {
            addCriterion("batchsummaryno like", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotLike(String value) {
            addCriterion("batchsummaryno not like", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoIn(List<String> values) {
            addCriterion("batchsummaryno in", values, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotIn(List<String> values) {
            addCriterion("batchsummaryno not in", values, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoBetween(String value1, String value2) {
            addCriterion("batchsummaryno between", value1, value2, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotBetween(String value1, String value2) {
            addCriterion("batchsummaryno not between", value1, value2, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchamountIsNull() {
            addCriterion("batchamount is null");
            return (Criteria) this;
        }

        public Criteria andBatchamountIsNotNull() {
            addCriterion("batchamount is not null");
            return (Criteria) this;
        }

        public Criteria andBatchamountEqualTo(BigDecimal value) {
            addCriterion("batchamount =", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotEqualTo(BigDecimal value) {
            addCriterion("batchamount <>", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountGreaterThan(BigDecimal value) {
            addCriterion("batchamount >", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("batchamount >=", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountLessThan(BigDecimal value) {
            addCriterion("batchamount <", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("batchamount <=", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountIn(List<BigDecimal> values) {
            addCriterion("batchamount in", values, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotIn(List<BigDecimal> values) {
            addCriterion("batchamount not in", values, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batchamount between", value1, value2, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batchamount not between", value1, value2, "batchamount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateIsNull() {
            addCriterion("authorizedstate is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateIsNotNull() {
            addCriterion("authorizedstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateEqualTo(String value) {
            addCriterion("authorizedstate =", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotEqualTo(String value) {
            addCriterion("authorizedstate <>", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateGreaterThan(String value) {
            addCriterion("authorizedstate >", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateGreaterThanOrEqualTo(String value) {
            addCriterion("authorizedstate >=", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLessThan(String value) {
            addCriterion("authorizedstate <", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLessThanOrEqualTo(String value) {
            addCriterion("authorizedstate <=", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLike(String value) {
            addCriterion("authorizedstate like", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotLike(String value) {
            addCriterion("authorizedstate not like", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateIn(List<String> values) {
            addCriterion("authorizedstate in", values, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotIn(List<String> values) {
            addCriterion("authorizedstate not in", values, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateBetween(String value1, String value2) {
            addCriterion("authorizedstate between", value1, value2, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotBetween(String value1, String value2) {
            addCriterion("authorizedstate not between", value1, value2, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNull() {
            addCriterion("confirmsequenceno is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNotNull() {
            addCriterion("confirmsequenceno is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoEqualTo(String value) {
            addCriterion("confirmsequenceno =", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotEqualTo(String value) {
            addCriterion("confirmsequenceno <>", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThan(String value) {
            addCriterion("confirmsequenceno >", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("confirmsequenceno >=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThan(String value) {
            addCriterion("confirmsequenceno <", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThanOrEqualTo(String value) {
            addCriterion("confirmsequenceno <=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLike(String value) {
            addCriterion("confirmsequenceno like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotLike(String value) {
            addCriterion("confirmsequenceno not like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIn(List<String> values) {
            addCriterion("confirmsequenceno in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotIn(List<String> values) {
            addCriterion("confirmsequenceno not in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoBetween(String value1, String value2) {
            addCriterion("confirmsequenceno between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotBetween(String value1, String value2) {
            addCriterion("confirmsequenceno not between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNull() {
            addCriterion("ifupload is null");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNotNull() {
            addCriterion("ifupload is not null");
            return (Criteria) this;
        }

        public Criteria andIfuploadEqualTo(String value) {
            addCriterion("ifupload =", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotEqualTo(String value) {
            addCriterion("ifupload <>", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThan(String value) {
            addCriterion("ifupload >", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThanOrEqualTo(String value) {
            addCriterion("ifupload >=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThan(String value) {
            addCriterion("ifupload <", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThanOrEqualTo(String value) {
            addCriterion("ifupload <=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLike(String value) {
            addCriterion("ifupload like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotLike(String value) {
            addCriterion("ifupload not like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadIn(List<String> values) {
            addCriterion("ifupload in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotIn(List<String> values) {
            addCriterion("ifupload not in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadBetween(String value1, String value2) {
            addCriterion("ifupload between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotBetween(String value1, String value2) {
            addCriterion("ifupload not between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNull() {
            addCriterion("seqinvply is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNotNull() {
            addCriterion("seqinvply is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyEqualTo(Long value) {
            addCriterion("seqinvply =", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotEqualTo(Long value) {
            addCriterion("seqinvply <>", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThan(Long value) {
            addCriterion("seqinvply >", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThanOrEqualTo(Long value) {
            addCriterion("seqinvply >=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThan(Long value) {
            addCriterion("seqinvply <", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThanOrEqualTo(Long value) {
            addCriterion("seqinvply <=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIn(List<Long> values) {
            addCriterion("seqinvply in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotIn(List<Long> values) {
            addCriterion("seqinvply not in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyBetween(Long value1, Long value2) {
            addCriterion("seqinvply between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotBetween(Long value1, Long value2) {
            addCriterion("seqinvply not between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessIsNull() {
            addCriterion("seqbusiness is null");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessIsNotNull() {
            addCriterion("seqbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessEqualTo(String value) {
            addCriterion("seqbusiness =", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessNotEqualTo(String value) {
            addCriterion("seqbusiness <>", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessGreaterThan(String value) {
            addCriterion("seqbusiness >", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("seqbusiness >=", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessLessThan(String value) {
            addCriterion("seqbusiness <", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessLessThanOrEqualTo(String value) {
            addCriterion("seqbusiness <=", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessLike(String value) {
            addCriterion("seqbusiness like", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessNotLike(String value) {
            addCriterion("seqbusiness not like", value, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessIn(List<String> values) {
            addCriterion("seqbusiness in", values, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessNotIn(List<String> values) {
            addCriterion("seqbusiness not in", values, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessBetween(String value1, String value2) {
            addCriterion("seqbusiness between", value1, value2, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andSeqbusinessNotBetween(String value1, String value2) {
            addCriterion("seqbusiness not between", value1, value2, "seqbusiness");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNull() {
            addCriterion("inpaymentflag is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNotNull() {
            addCriterion("inpaymentflag is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagEqualTo(String value) {
            addCriterion("inpaymentflag =", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotEqualTo(String value) {
            addCriterion("inpaymentflag <>", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThan(String value) {
            addCriterion("inpaymentflag >", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThanOrEqualTo(String value) {
            addCriterion("inpaymentflag >=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThan(String value) {
            addCriterion("inpaymentflag <", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThanOrEqualTo(String value) {
            addCriterion("inpaymentflag <=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLike(String value) {
            addCriterion("inpaymentflag like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotLike(String value) {
            addCriterion("inpaymentflag not like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIn(List<String> values) {
            addCriterion("inpaymentflag in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotIn(List<String> values) {
            addCriterion("inpaymentflag not in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagBetween(String value1, String value2) {
            addCriterion("inpaymentflag between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotBetween(String value1, String value2) {
            addCriterion("inpaymentflag not between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNull() {
            addCriterion("custaccountname is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNotNull() {
            addCriterion("custaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameEqualTo(String value) {
            addCriterion("custaccountname =", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotEqualTo(String value) {
            addCriterion("custaccountname <>", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThan(String value) {
            addCriterion("custaccountname >", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("custaccountname >=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThan(String value) {
            addCriterion("custaccountname <", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThanOrEqualTo(String value) {
            addCriterion("custaccountname <=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLike(String value) {
            addCriterion("custaccountname like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotLike(String value) {
            addCriterion("custaccountname not like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIn(List<String> values) {
            addCriterion("custaccountname in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotIn(List<String> values) {
            addCriterion("custaccountname not in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameBetween(String value1, String value2) {
            addCriterion("custaccountname between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotBetween(String value1, String value2) {
            addCriterion("custaccountname not between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNull() {
            addCriterion("custaccountno is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNotNull() {
            addCriterion("custaccountno is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoEqualTo(String value) {
            addCriterion("custaccountno =", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotEqualTo(String value) {
            addCriterion("custaccountno <>", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThan(String value) {
            addCriterion("custaccountno >", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("custaccountno >=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThan(String value) {
            addCriterion("custaccountno <", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("custaccountno <=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLike(String value) {
            addCriterion("custaccountno like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotLike(String value) {
            addCriterion("custaccountno not like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIn(List<String> values) {
            addCriterion("custaccountno in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotIn(List<String> values) {
            addCriterion("custaccountno not in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoBetween(String value1, String value2) {
            addCriterion("custaccountno between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotBetween(String value1, String value2) {
            addCriterion("custaccountno not between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNull() {
            addCriterion("custbankno is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNotNull() {
            addCriterion("custbankno is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoEqualTo(String value) {
            addCriterion("custbankno =", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotEqualTo(String value) {
            addCriterion("custbankno <>", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThan(String value) {
            addCriterion("custbankno >", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("custbankno >=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThan(String value) {
            addCriterion("custbankno <", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThanOrEqualTo(String value) {
            addCriterion("custbankno <=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLike(String value) {
            addCriterion("custbankno like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotLike(String value) {
            addCriterion("custbankno not like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIn(List<String> values) {
            addCriterion("custbankno in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotIn(List<String> values) {
            addCriterion("custbankno not in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoBetween(String value1, String value2) {
            addCriterion("custbankno between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotBetween(String value1, String value2) {
            addCriterion("custbankno not between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("banktype is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("banktype is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("banktype =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("banktype <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("banktype >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("banktype >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("banktype <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("banktype <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("banktype like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("banktype not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("banktype in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("banktype not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("banktype between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("banktype not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNull() {
            addCriterion("bankcity is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("bankcity is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("bankcity =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("bankcity <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("bankcity >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("bankcity >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("bankcity <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("bankcity <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("bankcity like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("bankcity not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("bankcity in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("bankcity not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("bankcity between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("bankcity not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("bankprovince is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("bankprovince is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("bankprovince =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("bankprovince <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("bankprovince >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("bankprovince >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("bankprovince <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("bankprovince <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("bankprovince like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("bankprovince not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("bankprovince in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("bankprovince not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("bankprovince between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("bankprovince not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNull() {
            addCriterion("ispaypublic is null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNotNull() {
            addCriterion("ispaypublic is not null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicEqualTo(String value) {
            addCriterion("ispaypublic =", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotEqualTo(String value) {
            addCriterion("ispaypublic <>", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThan(String value) {
            addCriterion("ispaypublic >", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThanOrEqualTo(String value) {
            addCriterion("ispaypublic >=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThan(String value) {
            addCriterion("ispaypublic <", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThanOrEqualTo(String value) {
            addCriterion("ispaypublic <=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLike(String value) {
            addCriterion("ispaypublic like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotLike(String value) {
            addCriterion("ispaypublic not like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIn(List<String> values) {
            addCriterion("ispaypublic in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotIn(List<String> values) {
            addCriterion("ispaypublic not in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicBetween(String value1, String value2) {
            addCriterion("ispaypublic between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotBetween(String value1, String value2) {
            addCriterion("ispaypublic not between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNull() {
            addCriterion("cardflag is null");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNotNull() {
            addCriterion("cardflag is not null");
            return (Criteria) this;
        }

        public Criteria andCardflagEqualTo(String value) {
            addCriterion("cardflag =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(String value) {
            addCriterion("cardflag <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(String value) {
            addCriterion("cardflag >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(String value) {
            addCriterion("cardflag >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(String value) {
            addCriterion("cardflag <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(String value) {
            addCriterion("cardflag <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLike(String value) {
            addCriterion("cardflag like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotLike(String value) {
            addCriterion("cardflag not like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<String> values) {
            addCriterion("cardflag in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<String> values) {
            addCriterion("cardflag not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(String value1, String value2) {
            addCriterion("cardflag between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(String value1, String value2) {
            addCriterion("cardflag not between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("certificatetype is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("certificatetype is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("certificatetype =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("certificatetype <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("certificatetype >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificatetype >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("certificatetype <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("certificatetype <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("certificatetype like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("certificatetype not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("certificatetype in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("certificatetype not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("certificatetype between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("certificatetype not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNull() {
            addCriterion("certificateno is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNotNull() {
            addCriterion("certificateno is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoEqualTo(String value) {
            addCriterion("certificateno =", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotEqualTo(String value) {
            addCriterion("certificateno <>", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThan(String value) {
            addCriterion("certificateno >", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("certificateno >=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThan(String value) {
            addCriterion("certificateno <", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThanOrEqualTo(String value) {
            addCriterion("certificateno <=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLike(String value) {
            addCriterion("certificateno like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotLike(String value) {
            addCriterion("certificateno not like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIn(List<String> values) {
            addCriterion("certificateno in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotIn(List<String> values) {
            addCriterion("certificateno not in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoBetween(String value1, String value2) {
            addCriterion("certificateno between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotBetween(String value1, String value2) {
            addCriterion("certificateno not between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNull() {
            addCriterion("custemail is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("custemail is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("custemail =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("custemail <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("custemail >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("custemail >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("custemail <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("custemail <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("custemail like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("custemail not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("custemail in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("custemail not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("custemail between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("custemail not between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("mobilenumber is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("mobilenumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("mobilenumber =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("mobilenumber <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("mobilenumber >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobilenumber >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("mobilenumber <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("mobilenumber <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("mobilenumber like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("mobilenumber not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("mobilenumber in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("mobilenumber not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("mobilenumber between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("mobilenumber not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIsNull() {
            addCriterion("unitbankno is null");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIsNotNull() {
            addCriterion("unitbankno is not null");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoEqualTo(String value) {
            addCriterion("unitbankno =", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotEqualTo(String value) {
            addCriterion("unitbankno <>", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoGreaterThan(String value) {
            addCriterion("unitbankno >", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("unitbankno >=", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLessThan(String value) {
            addCriterion("unitbankno <", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLessThanOrEqualTo(String value) {
            addCriterion("unitbankno <=", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoLike(String value) {
            addCriterion("unitbankno like", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotLike(String value) {
            addCriterion("unitbankno not like", value, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoIn(List<String> values) {
            addCriterion("unitbankno in", values, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotIn(List<String> values) {
            addCriterion("unitbankno not in", values, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoBetween(String value1, String value2) {
            addCriterion("unitbankno between", value1, value2, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andUnitbanknoNotBetween(String value1, String value2) {
            addCriterion("unitbankno not between", value1, value2, "unitbankno");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNull() {
            addCriterion("fastflag is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("fastflag is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(String value) {
            addCriterion("fastflag =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(String value) {
            addCriterion("fastflag <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(String value) {
            addCriterion("fastflag >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(String value) {
            addCriterion("fastflag >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(String value) {
            addCriterion("fastflag <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(String value) {
            addCriterion("fastflag <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLike(String value) {
            addCriterion("fastflag like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotLike(String value) {
            addCriterion("fastflag not like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<String> values) {
            addCriterion("fastflag in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<String> values) {
            addCriterion("fastflag not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(String value1, String value2) {
            addCriterion("fastflag between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(String value1, String value2) {
            addCriterion("fastflag not between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNull() {
            addCriterion("smsflag is null");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNotNull() {
            addCriterion("smsflag is not null");
            return (Criteria) this;
        }

        public Criteria andSmsflagEqualTo(String value) {
            addCriterion("smsflag =", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotEqualTo(String value) {
            addCriterion("smsflag <>", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThan(String value) {
            addCriterion("smsflag >", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThanOrEqualTo(String value) {
            addCriterion("smsflag >=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThan(String value) {
            addCriterion("smsflag <", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThanOrEqualTo(String value) {
            addCriterion("smsflag <=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLike(String value) {
            addCriterion("smsflag like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotLike(String value) {
            addCriterion("smsflag not like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIn(List<String> values) {
            addCriterion("smsflag in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotIn(List<String> values) {
            addCriterion("smsflag not in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagBetween(String value1, String value2) {
            addCriterion("smsflag between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotBetween(String value1, String value2) {
            addCriterion("smsflag not between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNull() {
            addCriterion("custagentbankname is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNotNull() {
            addCriterion("custagentbankname is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameEqualTo(String value) {
            addCriterion("custagentbankname =", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotEqualTo(String value) {
            addCriterion("custagentbankname <>", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThan(String value) {
            addCriterion("custagentbankname >", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("custagentbankname >=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThan(String value) {
            addCriterion("custagentbankname <", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThanOrEqualTo(String value) {
            addCriterion("custagentbankname <=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLike(String value) {
            addCriterion("custagentbankname like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotLike(String value) {
            addCriterion("custagentbankname not like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIn(List<String> values) {
            addCriterion("custagentbankname in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotIn(List<String> values) {
            addCriterion("custagentbankname not in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameBetween(String value1, String value2) {
            addCriterion("custagentbankname between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotBetween(String value1, String value2) {
            addCriterion("custagentbankname not between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNull() {
            addCriterion("custagentbankaddr is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNotNull() {
            addCriterion("custagentbankaddr is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrEqualTo(String value) {
            addCriterion("custagentbankaddr =", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotEqualTo(String value) {
            addCriterion("custagentbankaddr <>", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThan(String value) {
            addCriterion("custagentbankaddr >", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("custagentbankaddr >=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThan(String value) {
            addCriterion("custagentbankaddr <", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThanOrEqualTo(String value) {
            addCriterion("custagentbankaddr <=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLike(String value) {
            addCriterion("custagentbankaddr like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotLike(String value) {
            addCriterion("custagentbankaddr not like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIn(List<String> values) {
            addCriterion("custagentbankaddr in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotIn(List<String> values) {
            addCriterion("custagentbankaddr not in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrBetween(String value1, String value2) {
            addCriterion("custagentbankaddr between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotBetween(String value1, String value2) {
            addCriterion("custagentbankaddr not between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNull() {
            addCriterion("custagentaccountno is null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNotNull() {
            addCriterion("custagentaccountno is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoEqualTo(String value) {
            addCriterion("custagentaccountno =", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotEqualTo(String value) {
            addCriterion("custagentaccountno <>", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThan(String value) {
            addCriterion("custagentaccountno >", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("custagentaccountno >=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThan(String value) {
            addCriterion("custagentaccountno <", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThanOrEqualTo(String value) {
            addCriterion("custagentaccountno <=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLike(String value) {
            addCriterion("custagentaccountno like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotLike(String value) {
            addCriterion("custagentaccountno not like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIn(List<String> values) {
            addCriterion("custagentaccountno in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotIn(List<String> values) {
            addCriterion("custagentaccountno not in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoBetween(String value1, String value2) {
            addCriterion("custagentaccountno between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotBetween(String value1, String value2) {
            addCriterion("custagentaccountno not between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNull() {
            addCriterion("custaddress is null");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNotNull() {
            addCriterion("custaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustaddressEqualTo(String value) {
            addCriterion("custaddress =", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotEqualTo(String value) {
            addCriterion("custaddress <>", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThan(String value) {
            addCriterion("custaddress >", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThanOrEqualTo(String value) {
            addCriterion("custaddress >=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThan(String value) {
            addCriterion("custaddress <", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThanOrEqualTo(String value) {
            addCriterion("custaddress <=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLike(String value) {
            addCriterion("custaddress like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotLike(String value) {
            addCriterion("custaddress not like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressIn(List<String> values) {
            addCriterion("custaddress in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotIn(List<String> values) {
            addCriterion("custaddress not in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressBetween(String value1, String value2) {
            addCriterion("custaddress between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotBetween(String value1, String value2) {
            addCriterion("custaddress not between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNull() {
            addCriterion("custcountryname is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNotNull() {
            addCriterion("custcountryname is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameEqualTo(String value) {
            addCriterion("custcountryname =", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotEqualTo(String value) {
            addCriterion("custcountryname <>", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThan(String value) {
            addCriterion("custcountryname >", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("custcountryname >=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThan(String value) {
            addCriterion("custcountryname <", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThanOrEqualTo(String value) {
            addCriterion("custcountryname <=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLike(String value) {
            addCriterion("custcountryname like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotLike(String value) {
            addCriterion("custcountryname not like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIn(List<String> values) {
            addCriterion("custcountryname in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotIn(List<String> values) {
            addCriterion("custcountryname not in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameBetween(String value1, String value2) {
            addCriterion("custcountryname between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotBetween(String value1, String value2) {
            addCriterion("custcountryname not between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNull() {
            addCriterion("custcountrycode is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNotNull() {
            addCriterion("custcountrycode is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeEqualTo(String value) {
            addCriterion("custcountrycode =", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotEqualTo(String value) {
            addCriterion("custcountrycode <>", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThan(String value) {
            addCriterion("custcountrycode >", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("custcountrycode >=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThan(String value) {
            addCriterion("custcountrycode <", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThanOrEqualTo(String value) {
            addCriterion("custcountrycode <=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLike(String value) {
            addCriterion("custcountrycode like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotLike(String value) {
            addCriterion("custcountrycode not like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIn(List<String> values) {
            addCriterion("custcountrycode in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotIn(List<String> values) {
            addCriterion("custcountrycode not in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeBetween(String value1, String value2) {
            addCriterion("custcountrycode between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotBetween(String value1, String value2) {
            addCriterion("custcountrycode not between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNull() {
            addCriterion("inpaymentmethod is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNotNull() {
            addCriterion("inpaymentmethod is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodEqualTo(String value) {
            addCriterion("inpaymentmethod =", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotEqualTo(String value) {
            addCriterion("inpaymentmethod <>", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThan(String value) {
            addCriterion("inpaymentmethod >", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("inpaymentmethod >=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThan(String value) {
            addCriterion("inpaymentmethod <", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("inpaymentmethod <=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLike(String value) {
            addCriterion("inpaymentmethod like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotLike(String value) {
            addCriterion("inpaymentmethod not like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIn(List<String> values) {
            addCriterion("inpaymentmethod in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotIn(List<String> values) {
            addCriterion("inpaymentmethod not in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodBetween(String value1, String value2) {
            addCriterion("inpaymentmethod between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotBetween(String value1, String value2) {
            addCriterion("inpaymentmethod not between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNull() {
            addCriterion("certitype is null");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNotNull() {
            addCriterion("certitype is not null");
            return (Criteria) this;
        }

        public Criteria andCertitypeEqualTo(String value) {
            addCriterion("certitype =", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotEqualTo(String value) {
            addCriterion("certitype <>", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThan(String value) {
            addCriterion("certitype >", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("certitype >=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThan(String value) {
            addCriterion("certitype <", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThanOrEqualTo(String value) {
            addCriterion("certitype <=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLike(String value) {
            addCriterion("certitype like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotLike(String value) {
            addCriterion("certitype not like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeIn(List<String> values) {
            addCriterion("certitype in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotIn(List<String> values) {
            addCriterion("certitype not in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeBetween(String value1, String value2) {
            addCriterion("certitype between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotBetween(String value1, String value2) {
            addCriterion("certitype not between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andBankareaIsNull() {
            addCriterion("bankarea is null");
            return (Criteria) this;
        }

        public Criteria andBankareaIsNotNull() {
            addCriterion("bankarea is not null");
            return (Criteria) this;
        }

        public Criteria andBankareaEqualTo(String value) {
            addCriterion("bankarea =", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotEqualTo(String value) {
            addCriterion("bankarea <>", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaGreaterThan(String value) {
            addCriterion("bankarea >", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaGreaterThanOrEqualTo(String value) {
            addCriterion("bankarea >=", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLessThan(String value) {
            addCriterion("bankarea <", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLessThanOrEqualTo(String value) {
            addCriterion("bankarea <=", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLike(String value) {
            addCriterion("bankarea like", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotLike(String value) {
            addCriterion("bankarea not like", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaIn(List<String> values) {
            addCriterion("bankarea in", values, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotIn(List<String> values) {
            addCriterion("bankarea not in", values, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaBetween(String value1, String value2) {
            addCriterion("bankarea between", value1, value2, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotBetween(String value1, String value2) {
            addCriterion("bankarea not between", value1, value2, "bankarea");
            return (Criteria) this;
        }

        public Criteria andIfbillbackIsNull() {
            addCriterion("ifbillback is null");
            return (Criteria) this;
        }

        public Criteria andIfbillbackIsNotNull() {
            addCriterion("ifbillback is not null");
            return (Criteria) this;
        }

        public Criteria andIfbillbackEqualTo(String value) {
            addCriterion("ifbillback =", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotEqualTo(String value) {
            addCriterion("ifbillback <>", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackGreaterThan(String value) {
            addCriterion("ifbillback >", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackGreaterThanOrEqualTo(String value) {
            addCriterion("ifbillback >=", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLessThan(String value) {
            addCriterion("ifbillback <", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLessThanOrEqualTo(String value) {
            addCriterion("ifbillback <=", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackLike(String value) {
            addCriterion("ifbillback like", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotLike(String value) {
            addCriterion("ifbillback not like", value, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackIn(List<String> values) {
            addCriterion("ifbillback in", values, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotIn(List<String> values) {
            addCriterion("ifbillback not in", values, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackBetween(String value1, String value2) {
            addCriterion("ifbillback between", value1, value2, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andIfbillbackNotBetween(String value1, String value2) {
            addCriterion("ifbillback not between", value1, value2, "ifbillback");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andIfsupplementIsNull() {
            addCriterion("ifsupplement is null");
            return (Criteria) this;
        }

        public Criteria andIfsupplementIsNotNull() {
            addCriterion("ifsupplement is not null");
            return (Criteria) this;
        }

        public Criteria andIfsupplementEqualTo(String value) {
            addCriterion("ifsupplement =", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementNotEqualTo(String value) {
            addCriterion("ifsupplement <>", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementGreaterThan(String value) {
            addCriterion("ifsupplement >", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementGreaterThanOrEqualTo(String value) {
            addCriterion("ifsupplement >=", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementLessThan(String value) {
            addCriterion("ifsupplement <", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementLessThanOrEqualTo(String value) {
            addCriterion("ifsupplement <=", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementLike(String value) {
            addCriterion("ifsupplement like", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementNotLike(String value) {
            addCriterion("ifsupplement not like", value, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementIn(List<String> values) {
            addCriterion("ifsupplement in", values, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementNotIn(List<String> values) {
            addCriterion("ifsupplement not in", values, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementBetween(String value1, String value2) {
            addCriterion("ifsupplement between", value1, value2, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andIfsupplementNotBetween(String value1, String value2) {
            addCriterion("ifsupplement not between", value1, value2, "ifsupplement");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNull() {
            addCriterion("platformid is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("platformid is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(String value) {
            addCriterion("platformid =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(String value) {
            addCriterion("platformid <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(String value) {
            addCriterion("platformid >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(String value) {
            addCriterion("platformid >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(String value) {
            addCriterion("platformid <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(String value) {
            addCriterion("platformid <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLike(String value) {
            addCriterion("platformid like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotLike(String value) {
            addCriterion("platformid not like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<String> values) {
            addCriterion("platformid in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<String> values) {
            addCriterion("platformid not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(String value1, String value2) {
            addCriterion("platformid between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(String value1, String value2) {
            addCriterion("platformid not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentmethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentmethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("paymentmethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("paymentmethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("paymentmethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("paymentmethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("paymentmethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("paymentmethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("paymentmethod like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("paymentmethod not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("paymentmethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("paymentmethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("paymentmethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("paymentmethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("businesschannel is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("businesschannel is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("businesschannel =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("businesschannel <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("businesschannel >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("businesschannel >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("businesschannel <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("businesschannel <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("businesschannel like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("businesschannel not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("businesschannel in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("businesschannel not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("businesschannel between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("businesschannel not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIsNull() {
            addCriterion("checkcontent is null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIsNotNull() {
            addCriterion("checkcontent is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentEqualTo(String value) {
            addCriterion("checkcontent =", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotEqualTo(String value) {
            addCriterion("checkcontent <>", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThan(String value) {
            addCriterion("checkcontent >", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThanOrEqualTo(String value) {
            addCriterion("checkcontent >=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThan(String value) {
            addCriterion("checkcontent <", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThanOrEqualTo(String value) {
            addCriterion("checkcontent <=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLike(String value) {
            addCriterion("checkcontent like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotLike(String value) {
            addCriterion("checkcontent not like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIn(List<String> values) {
            addCriterion("checkcontent in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotIn(List<String> values) {
            addCriterion("checkcontent not in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentBetween(String value1, String value2) {
            addCriterion("checkcontent between", value1, value2, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotBetween(String value1, String value2) {
            addCriterion("checkcontent not between", value1, value2, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNull() {
            addCriterion("custaccountarea is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNotNull() {
            addCriterion("custaccountarea is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaEqualTo(String value) {
            addCriterion("custaccountarea =", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotEqualTo(String value) {
            addCriterion("custaccountarea <>", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThan(String value) {
            addCriterion("custaccountarea >", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThanOrEqualTo(String value) {
            addCriterion("custaccountarea >=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThan(String value) {
            addCriterion("custaccountarea <", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThanOrEqualTo(String value) {
            addCriterion("custaccountarea <=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLike(String value) {
            addCriterion("custaccountarea like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotLike(String value) {
            addCriterion("custaccountarea not like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIn(List<String> values) {
            addCriterion("custaccountarea in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotIn(List<String> values) {
            addCriterion("custaccountarea not in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaBetween(String value1, String value2) {
            addCriterion("custaccountarea between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotBetween(String value1, String value2) {
            addCriterion("custaccountarea not between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIsNull() {
            addCriterion("baseleftamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIsNotNull() {
            addCriterion("baseleftamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountEqualTo(String value) {
            addCriterion("baseleftamount =", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotEqualTo(String value) {
            addCriterion("baseleftamount <>", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountGreaterThan(String value) {
            addCriterion("baseleftamount >", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountGreaterThanOrEqualTo(String value) {
            addCriterion("baseleftamount >=", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountLessThan(String value) {
            addCriterion("baseleftamount <", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountLessThanOrEqualTo(String value) {
            addCriterion("baseleftamount <=", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountLike(String value) {
            addCriterion("baseleftamount like", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotLike(String value) {
            addCriterion("baseleftamount not like", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIn(List<String> values) {
            addCriterion("baseleftamount in", values, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotIn(List<String> values) {
            addCriterion("baseleftamount not in", values, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountBetween(String value1, String value2) {
            addCriterion("baseleftamount between", value1, value2, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotBetween(String value1, String value2) {
            addCriterion("baseleftamount not between", value1, value2, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNull() {
            addCriterion("taxesamount is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNotNull() {
            addCriterion("taxesamount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountEqualTo(BigDecimal value) {
            addCriterion("taxesamount =", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("taxesamount <>", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThan(BigDecimal value) {
            addCriterion("taxesamount >", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxesamount >=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThan(BigDecimal value) {
            addCriterion("taxesamount <", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxesamount <=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIn(List<BigDecimal> values) {
            addCriterion("taxesamount in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("taxesamount not in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxesamount between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxesamount not between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountIsNull() {
            addCriterion("basetaxesamount is null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountIsNotNull() {
            addCriterion("basetaxesamount is not null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountEqualTo(BigDecimal value) {
            addCriterion("basetaxesamount =", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("basetaxesamount <>", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountGreaterThan(BigDecimal value) {
            addCriterion("basetaxesamount >", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("basetaxesamount >=", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountLessThan(BigDecimal value) {
            addCriterion("basetaxesamount <", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("basetaxesamount <=", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountIn(List<BigDecimal> values) {
            addCriterion("basetaxesamount in", values, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("basetaxesamount not in", values, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basetaxesamount between", value1, value2, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basetaxesamount not between", value1, value2, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNull() {
            addCriterion("exchangecurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNotNull() {
            addCriterion("exchangecurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeEqualTo(String value) {
            addCriterion("exchangecurrencycode =", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotEqualTo(String value) {
            addCriterion("exchangecurrencycode <>", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThan(String value) {
            addCriterion("exchangecurrencycode >", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("exchangecurrencycode >=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThan(String value) {
            addCriterion("exchangecurrencycode <", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("exchangecurrencycode <=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLike(String value) {
            addCriterion("exchangecurrencycode like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotLike(String value) {
            addCriterion("exchangecurrencycode not like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIn(List<String> values) {
            addCriterion("exchangecurrencycode in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotIn(List<String> values) {
            addCriterion("exchangecurrencycode not in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeBetween(String value1, String value2) {
            addCriterion("exchangecurrencycode between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("exchangecurrencycode not between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNull() {
            addCriterion("exchangeamount is null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNotNull() {
            addCriterion("exchangeamount is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountEqualTo(String value) {
            addCriterion("exchangeamount =", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotEqualTo(String value) {
            addCriterion("exchangeamount <>", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThan(String value) {
            addCriterion("exchangeamount >", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeamount >=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThan(String value) {
            addCriterion("exchangeamount <", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThanOrEqualTo(String value) {
            addCriterion("exchangeamount <=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLike(String value) {
            addCriterion("exchangeamount like", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotLike(String value) {
            addCriterion("exchangeamount not like", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIn(List<String> values) {
            addCriterion("exchangeamount in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotIn(List<String> values) {
            addCriterion("exchangeamount not in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountBetween(String value1, String value2) {
            addCriterion("exchangeamount between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotBetween(String value1, String value2) {
            addCriterion("exchangeamount not between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andHascoinsIsNull() {
            addCriterion("hascoins is null");
            return (Criteria) this;
        }

        public Criteria andHascoinsIsNotNull() {
            addCriterion("hascoins is not null");
            return (Criteria) this;
        }

        public Criteria andHascoinsEqualTo(String value) {
            addCriterion("hascoins =", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotEqualTo(String value) {
            addCriterion("hascoins <>", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsGreaterThan(String value) {
            addCriterion("hascoins >", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsGreaterThanOrEqualTo(String value) {
            addCriterion("hascoins >=", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLessThan(String value) {
            addCriterion("hascoins <", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLessThanOrEqualTo(String value) {
            addCriterion("hascoins <=", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsLike(String value) {
            addCriterion("hascoins like", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotLike(String value) {
            addCriterion("hascoins not like", value, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsIn(List<String> values) {
            addCriterion("hascoins in", values, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotIn(List<String> values) {
            addCriterion("hascoins not in", values, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsBetween(String value1, String value2) {
            addCriterion("hascoins between", value1, value2, "hascoins");
            return (Criteria) this;
        }

        public Criteria andHascoinsNotBetween(String value1, String value2) {
            addCriterion("hascoins not between", value1, value2, "hascoins");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIsNull() {
            addCriterion("coinsurno is null");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIsNotNull() {
            addCriterion("coinsurno is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoEqualTo(String value) {
            addCriterion("coinsurno =", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotEqualTo(String value) {
            addCriterion("coinsurno <>", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoGreaterThan(String value) {
            addCriterion("coinsurno >", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoGreaterThanOrEqualTo(String value) {
            addCriterion("coinsurno >=", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLessThan(String value) {
            addCriterion("coinsurno <", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLessThanOrEqualTo(String value) {
            addCriterion("coinsurno <=", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoLike(String value) {
            addCriterion("coinsurno like", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotLike(String value) {
            addCriterion("coinsurno not like", value, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoIn(List<String> values) {
            addCriterion("coinsurno in", values, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotIn(List<String> values) {
            addCriterion("coinsurno not in", values, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoBetween(String value1, String value2) {
            addCriterion("coinsurno between", value1, value2, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andCoinsurnoNotBetween(String value1, String value2) {
            addCriterion("coinsurno not between", value1, value2, "coinsurno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIsNull() {
            addCriterion("reportcaseno is null");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIsNotNull() {
            addCriterion("reportcaseno is not null");
            return (Criteria) this;
        }

        public Criteria andReportcasenoEqualTo(String value) {
            addCriterion("reportcaseno =", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotEqualTo(String value) {
            addCriterion("reportcaseno <>", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoGreaterThan(String value) {
            addCriterion("reportcaseno >", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoGreaterThanOrEqualTo(String value) {
            addCriterion("reportcaseno >=", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLessThan(String value) {
            addCriterion("reportcaseno <", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLessThanOrEqualTo(String value) {
            addCriterion("reportcaseno <=", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoLike(String value) {
            addCriterion("reportcaseno like", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotLike(String value) {
            addCriterion("reportcaseno not like", value, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoIn(List<String> values) {
            addCriterion("reportcaseno in", values, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotIn(List<String> values) {
            addCriterion("reportcaseno not in", values, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoBetween(String value1, String value2) {
            addCriterion("reportcaseno between", value1, value2, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andReportcasenoNotBetween(String value1, String value2) {
            addCriterion("reportcaseno not between", value1, value2, "reportcaseno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIsNull() {
            addCriterion("totalserialno is null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIsNotNull() {
            addCriterion("totalserialno is not null");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoEqualTo(String value) {
            addCriterion("totalserialno =", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotEqualTo(String value) {
            addCriterion("totalserialno <>", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThan(String value) {
            addCriterion("totalserialno >", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("totalserialno >=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThan(String value) {
            addCriterion("totalserialno <", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLessThanOrEqualTo(String value) {
            addCriterion("totalserialno <=", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoLike(String value) {
            addCriterion("totalserialno like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotLike(String value) {
            addCriterion("totalserialno not like", value, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoIn(List<String> values) {
            addCriterion("totalserialno in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotIn(List<String> values) {
            addCriterion("totalserialno not in", values, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoBetween(String value1, String value2) {
            addCriterion("totalserialno between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andTotalserialnoNotBetween(String value1, String value2) {
            addCriterion("totalserialno not between", value1, value2, "totalserialno");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNull() {
            addCriterion("issplitted is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("issplitted is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("issplitted =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("issplitted <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("issplitted >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("issplitted >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("issplitted <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("issplitted <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("issplitted like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("issplitted not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("issplitted in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("issplitted not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("issplitted between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("issplitted not between", value1, value2, "issplitted");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_settlementforaxavo_temp
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
     * @Table : mm_settlementforaxavo_temp
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