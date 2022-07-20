package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmQuerysettlementTempExample {
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
    public MmQuerysettlementTempExample() {
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
     * @Table : mm_querysettlement_temp
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

        public Criteria andApplydataidIsNull() {
            addCriterion("APPLYDATAID is null");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNotNull() {
            addCriterion("APPLYDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andApplydataidEqualTo(String value) {
            addCriterion("APPLYDATAID =", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotEqualTo(String value) {
            addCriterion("APPLYDATAID <>", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThan(String value) {
            addCriterion("APPLYDATAID >", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID >=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThan(String value) {
            addCriterion("APPLYDATAID <", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID <=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLike(String value) {
            addCriterion("APPLYDATAID like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotLike(String value) {
            addCriterion("APPLYDATAID not like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidIn(List<String> values) {
            addCriterion("APPLYDATAID in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotIn(List<String> values) {
            addCriterion("APPLYDATAID not in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidBetween(String value1, String value2) {
            addCriterion("APPLYDATAID between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotBetween(String value1, String value2) {
            addCriterion("APPLYDATAID not between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNull() {
            addCriterion("SETTLEMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("SETTLEMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(Long value) {
            addCriterion("SETTLEMENTNO =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(Long value) {
            addCriterion("SETTLEMENTNO <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(Long value) {
            addCriterion("SETTLEMENTNO >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENTNO >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(Long value) {
            addCriterion("SETTLEMENTNO <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENTNO <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<Long> values) {
            addCriterion("SETTLEMENTNO in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<Long> values) {
            addCriterion("SETTLEMENTNO not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENTNO between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENTNO not between", value1, value2, "settlementno");
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

        public Criteria andPayableseqIsNull() {
            addCriterion("PAYABLESEQ is null");
            return (Criteria) this;
        }

        public Criteria andPayableseqIsNotNull() {
            addCriterion("PAYABLESEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPayableseqEqualTo(Long value) {
            addCriterion("PAYABLESEQ =", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotEqualTo(Long value) {
            addCriterion("PAYABLESEQ <>", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqGreaterThan(Long value) {
            addCriterion("PAYABLESEQ >", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYABLESEQ >=", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqLessThan(Long value) {
            addCriterion("PAYABLESEQ <", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqLessThanOrEqualTo(Long value) {
            addCriterion("PAYABLESEQ <=", value, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqIn(List<Long> values) {
            addCriterion("PAYABLESEQ in", values, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotIn(List<Long> values) {
            addCriterion("PAYABLESEQ not in", values, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqBetween(Long value1, Long value2) {
            addCriterion("PAYABLESEQ between", value1, value2, "payableseq");
            return (Criteria) this;
        }

        public Criteria andPayableseqNotBetween(Long value1, Long value2) {
            addCriterion("PAYABLESEQ not between", value1, value2, "payableseq");
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

        public Criteria andFathernoIsNull() {
            addCriterion("FATHERNO is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("FATHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(Long value) {
            addCriterion("FATHERNO =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(Long value) {
            addCriterion("FATHERNO <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(Long value) {
            addCriterion("FATHERNO >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(Long value) {
            addCriterion("FATHERNO >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(Long value) {
            addCriterion("FATHERNO <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(Long value) {
            addCriterion("FATHERNO <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<Long> values) {
            addCriterion("FATHERNO in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<Long> values) {
            addCriterion("FATHERNO not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(Long value1, Long value2) {
            addCriterion("FATHERNO between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(Long value1, Long value2) {
            addCriterion("FATHERNO not between", value1, value2, "fatherno");
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

        public Criteria andHandledamountIsNull() {
            addCriterion("HANDLEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandledamountIsNotNull() {
            addCriterion("HANDLEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandledamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT =", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <>", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT >=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThan(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDAMOUNT <=", value, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEDAMOUNT not in", values, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT between", value1, value2, "handledamount");
            return (Criteria) this;
        }

        public Criteria andHandledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDAMOUNT not between", value1, value2, "handledamount");
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

        public Criteria andHandledbaseamountIsNull() {
            addCriterion("HANDLEDBASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIsNotNull() {
            addCriterion("HANDLEDBASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT =", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <>", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT >", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT >=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThan(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEDBASEAMOUNT <=", value, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEDBASEAMOUNT in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEDBASEAMOUNT not in", values, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDBASEAMOUNT between", value1, value2, "handledbaseamount");
            return (Criteria) this;
        }

        public Criteria andHandledbaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEDBASEAMOUNT not between", value1, value2, "handledbaseamount");
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

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
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

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("CUSTOMERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("CUSTOMERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("CUSTOMERPARTYNO >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("CUSTOMERPARTYNO <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("CUSTOMERPARTYNO like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("CUSTOMERPARTYNO not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO not between", value1, value2, "customerpartyno");
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

        public Criteria andDepartmentnameIsNull() {
            addCriterion("DEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("DEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("DEPARTMENTNAME =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("DEPARTMENTNAME >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("DEPARTMENTNAME <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("DEPARTMENTNAME like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("DEPARTMENTNAME not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("DEPARTMENTNAME in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("DEPARTMENTNAME not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME not between", value1, value2, "departmentname");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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

        public Criteria andReturnnoIsNull() {
            addCriterion("RETURNNO is null");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNotNull() {
            addCriterion("RETURNNO is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnoEqualTo(String value) {
            addCriterion("RETURNNO =", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotEqualTo(String value) {
            addCriterion("RETURNNO <>", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThan(String value) {
            addCriterion("RETURNNO >", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNNO >=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThan(String value) {
            addCriterion("RETURNNO <", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThanOrEqualTo(String value) {
            addCriterion("RETURNNO <=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLike(String value) {
            addCriterion("RETURNNO like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotLike(String value) {
            addCriterion("RETURNNO not like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIn(List<String> values) {
            addCriterion("RETURNNO in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotIn(List<String> values) {
            addCriterion("RETURNNO not in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoBetween(String value1, String value2) {
            addCriterion("RETURNNO between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotBetween(String value1, String value2) {
            addCriterion("RETURNNO not between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNull() {
            addCriterion("CANCELDATE is null");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNotNull() {
            addCriterion("CANCELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCanceldateEqualTo(Date value) {
            addCriterion("CANCELDATE =", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotEqualTo(Date value) {
            addCriterion("CANCELDATE <>", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThan(Date value) {
            addCriterion("CANCELDATE >", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCELDATE >=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThan(Date value) {
            addCriterion("CANCELDATE <", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThanOrEqualTo(Date value) {
            addCriterion("CANCELDATE <=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIn(List<Date> values) {
            addCriterion("CANCELDATE in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotIn(List<Date> values) {
            addCriterion("CANCELDATE not in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateBetween(Date value1, Date value2) {
            addCriterion("CANCELDATE between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotBetween(Date value1, Date value2) {
            addCriterion("CANCELDATE not between", value1, value2, "canceldate");
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

        public Criteria andCancelflagIsNull() {
            addCriterion("CANCELFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCancelflagIsNotNull() {
            addCriterion("CANCELFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCancelflagEqualTo(String value) {
            addCriterion("CANCELFLAG =", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotEqualTo(String value) {
            addCriterion("CANCELFLAG <>", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThan(String value) {
            addCriterion("CANCELFLAG >", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELFLAG >=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThan(String value) {
            addCriterion("CANCELFLAG <", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThanOrEqualTo(String value) {
            addCriterion("CANCELFLAG <=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLike(String value) {
            addCriterion("CANCELFLAG like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotLike(String value) {
            addCriterion("CANCELFLAG not like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagIn(List<String> values) {
            addCriterion("CANCELFLAG in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotIn(List<String> values) {
            addCriterion("CANCELFLAG not in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagBetween(String value1, String value2) {
            addCriterion("CANCELFLAG between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotBetween(String value1, String value2) {
            addCriterion("CANCELFLAG not between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
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

        public Criteria andInpaymentbatchnoIsNull() {
            addCriterion("INPAYMENTBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNotNull() {
            addCriterion("INPAYMENTBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO =", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <>", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThan(String value) {
            addCriterion("INPAYMENTBATCHNO >", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO >=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThan(String value) {
            addCriterion("INPAYMENTBATCHNO <", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLike(String value) {
            addCriterion("INPAYMENTBATCHNO like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotLike(String value) {
            addCriterion("INPAYMENTBATCHNO not like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO not in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO not between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNull() {
            addCriterion("CHECKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("CHECKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("CHECKCODE =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("CHECKCODE <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("CHECKCODE >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKCODE >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("CHECKCODE <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKCODE <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("CHECKCODE like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("CHECKCODE not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("CHECKCODE in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("CHECKCODE not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("CHECKCODE between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("CHECKCODE not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIsNull() {
            addCriterion("CHECKCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIsNotNull() {
            addCriterion("CHECKCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcontentEqualTo(String value) {
            addCriterion("CHECKCONTENT =", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotEqualTo(String value) {
            addCriterion("CHECKCONTENT <>", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThan(String value) {
            addCriterion("CHECKCONTENT >", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKCONTENT >=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThan(String value) {
            addCriterion("CHECKCONTENT <", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLessThanOrEqualTo(String value) {
            addCriterion("CHECKCONTENT <=", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentLike(String value) {
            addCriterion("CHECKCONTENT like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotLike(String value) {
            addCriterion("CHECKCONTENT not like", value, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentIn(List<String> values) {
            addCriterion("CHECKCONTENT in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotIn(List<String> values) {
            addCriterion("CHECKCONTENT not in", values, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentBetween(String value1, String value2) {
            addCriterion("CHECKCONTENT between", value1, value2, "checkcontent");
            return (Criteria) this;
        }

        public Criteria andCheckcontentNotBetween(String value1, String value2) {
            addCriterion("CHECKCONTENT not between", value1, value2, "checkcontent");
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

        public Criteria andBatchsummarynoIsNull() {
            addCriterion("BATCHSUMMARYNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoIsNotNull() {
            addCriterion("BATCHSUMMARYNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoEqualTo(String value) {
            addCriterion("BATCHSUMMARYNO =", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotEqualTo(String value) {
            addCriterion("BATCHSUMMARYNO <>", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoGreaterThan(String value) {
            addCriterion("BATCHSUMMARYNO >", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHSUMMARYNO >=", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLessThan(String value) {
            addCriterion("BATCHSUMMARYNO <", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLessThanOrEqualTo(String value) {
            addCriterion("BATCHSUMMARYNO <=", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoLike(String value) {
            addCriterion("BATCHSUMMARYNO like", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotLike(String value) {
            addCriterion("BATCHSUMMARYNO not like", value, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoIn(List<String> values) {
            addCriterion("BATCHSUMMARYNO in", values, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotIn(List<String> values) {
            addCriterion("BATCHSUMMARYNO not in", values, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoBetween(String value1, String value2) {
            addCriterion("BATCHSUMMARYNO between", value1, value2, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchsummarynoNotBetween(String value1, String value2) {
            addCriterion("BATCHSUMMARYNO not between", value1, value2, "batchsummaryno");
            return (Criteria) this;
        }

        public Criteria andBatchamountIsNull() {
            addCriterion("BATCHAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBatchamountIsNotNull() {
            addCriterion("BATCHAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBatchamountEqualTo(BigDecimal value) {
            addCriterion("BATCHAMOUNT =", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotEqualTo(BigDecimal value) {
            addCriterion("BATCHAMOUNT <>", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountGreaterThan(BigDecimal value) {
            addCriterion("BATCHAMOUNT >", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHAMOUNT >=", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountLessThan(BigDecimal value) {
            addCriterion("BATCHAMOUNT <", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHAMOUNT <=", value, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountIn(List<BigDecimal> values) {
            addCriterion("BATCHAMOUNT in", values, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotIn(List<BigDecimal> values) {
            addCriterion("BATCHAMOUNT not in", values, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHAMOUNT between", value1, value2, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBatchamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHAMOUNT not between", value1, value2, "batchamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIsNull() {
            addCriterion("BASELEFTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIsNotNull() {
            addCriterion("BASELEFTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountEqualTo(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT =", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotEqualTo(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT <>", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountGreaterThan(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT >", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT >=", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountLessThan(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT <", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASELEFTAMOUNT <=", value, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountIn(List<BigDecimal> values) {
            addCriterion("BASELEFTAMOUNT in", values, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotIn(List<BigDecimal> values) {
            addCriterion("BASELEFTAMOUNT not in", values, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASELEFTAMOUNT between", value1, value2, "baseleftamount");
            return (Criteria) this;
        }

        public Criteria andBaseleftamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASELEFTAMOUNT not between", value1, value2, "baseleftamount");
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
            addCriterion("actualexchangerate is null");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateIsNotNull() {
            addCriterion("actualexchangerate is not null");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateEqualTo(Long value) {
            addCriterion("actualexchangerate =", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotEqualTo(Long value) {
            addCriterion("actualexchangerate <>", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateGreaterThan(Long value) {
            addCriterion("actualexchangerate >", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateGreaterThanOrEqualTo(Long value) {
            addCriterion("actualexchangerate >=", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateLessThan(Long value) {
            addCriterion("actualexchangerate <", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateLessThanOrEqualTo(Long value) {
            addCriterion("actualexchangerate <=", value, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateIn(List<Long> values) {
            addCriterion("actualexchangerate in", values, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotIn(List<Long> values) {
            addCriterion("actualexchangerate not in", values, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateBetween(Long value1, Long value2) {
            addCriterion("actualexchangerate between", value1, value2, "actualexchangerate");
            return (Criteria) this;
        }

        public Criteria andActualexchangerateNotBetween(Long value1, Long value2) {
            addCriterion("actualexchangerate not between", value1, value2, "actualexchangerate");
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

        public Criteria andAuthorizedstateIsNull() {
            addCriterion("AUTHORIZEDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateIsNotNull() {
            addCriterion("AUTHORIZEDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateEqualTo(String value) {
            addCriterion("AUTHORIZEDSTATE =", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotEqualTo(String value) {
            addCriterion("AUTHORIZEDSTATE <>", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateGreaterThan(String value) {
            addCriterion("AUTHORIZEDSTATE >", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDSTATE >=", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLessThan(String value) {
            addCriterion("AUTHORIZEDSTATE <", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZEDSTATE <=", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateLike(String value) {
            addCriterion("AUTHORIZEDSTATE like", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotLike(String value) {
            addCriterion("AUTHORIZEDSTATE not like", value, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateIn(List<String> values) {
            addCriterion("AUTHORIZEDSTATE in", values, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotIn(List<String> values) {
            addCriterion("AUTHORIZEDSTATE not in", values, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDSTATE between", value1, value2, "authorizedstate");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstateNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZEDSTATE not between", value1, value2, "authorizedstate");
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

        public Criteria andSeqinvplyIsNull() {
            addCriterion("SEQINVPLY is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIsNotNull() {
            addCriterion("SEQINVPLY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyEqualTo(Long value) {
            addCriterion("SEQINVPLY =", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotEqualTo(Long value) {
            addCriterion("SEQINVPLY <>", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThan(Long value) {
            addCriterion("SEQINVPLY >", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVPLY >=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThan(Long value) {
            addCriterion("SEQINVPLY <", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVPLY <=", value, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyIn(List<Long> values) {
            addCriterion("SEQINVPLY in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotIn(List<Long> values) {
            addCriterion("SEQINVPLY not in", values, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyBetween(Long value1, Long value2) {
            addCriterion("SEQINVPLY between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andSeqinvplyNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVPLY not between", value1, value2, "seqinvply");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNull() {
            addCriterion("PAYCODE is null");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNotNull() {
            addCriterion("PAYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaycodeEqualTo(String value) {
            addCriterion("PAYCODE =", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotEqualTo(String value) {
            addCriterion("PAYCODE <>", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThan(String value) {
            addCriterion("PAYCODE >", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCODE >=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThan(String value) {
            addCriterion("PAYCODE <", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThanOrEqualTo(String value) {
            addCriterion("PAYCODE <=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLike(String value) {
            addCriterion("PAYCODE like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotLike(String value) {
            addCriterion("PAYCODE not like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeIn(List<String> values) {
            addCriterion("PAYCODE in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotIn(List<String> values) {
            addCriterion("PAYCODE not in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeBetween(String value1, String value2) {
            addCriterion("PAYCODE between", value1, value2, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotBetween(String value1, String value2) {
            addCriterion("PAYCODE not between", value1, value2, "paycode");
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

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
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

        public Criteria andProportionamountIsNull() {
            addCriterion("PROPORTIONAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProportionamountIsNotNull() {
            addCriterion("PROPORTIONAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProportionamountEqualTo(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT =", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountNotEqualTo(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT <>", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountGreaterThan(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT >", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT >=", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountLessThan(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT <", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTIONAMOUNT <=", value, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountIn(List<BigDecimal> values) {
            addCriterion("PROPORTIONAMOUNT in", values, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountNotIn(List<BigDecimal> values) {
            addCriterion("PROPORTIONAMOUNT not in", values, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTIONAMOUNT between", value1, value2, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andProportionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTIONAMOUNT not between", value1, value2, "proportionamount");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNull() {
            addCriterion("CUSTAGENTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIsNotNull() {
            addCriterion("CUSTAGENTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME =", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME <>", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThan(String value) {
            addCriterion("CUSTAGENTBANKNAME >", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME >=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThan(String value) {
            addCriterion("CUSTAGENTBANKNAME <", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKNAME <=", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameLike(String value) {
            addCriterion("CUSTAGENTBANKNAME like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotLike(String value) {
            addCriterion("CUSTAGENTBANKNAME not like", value, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameIn(List<String> values) {
            addCriterion("CUSTAGENTBANKNAME in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotIn(List<String> values) {
            addCriterion("CUSTAGENTBANKNAME not in", values, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKNAME between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKNAME not between", value1, value2, "custagentbankname");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNull() {
            addCriterion("CUSTAGENTBANKADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIsNotNull() {
            addCriterion("CUSTAGENTBANKADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR =", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR <>", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThan(String value) {
            addCriterion("CUSTAGENTBANKADDR >", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR >=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThan(String value) {
            addCriterion("CUSTAGENTBANKADDR <", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTBANKADDR <=", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrLike(String value) {
            addCriterion("CUSTAGENTBANKADDR like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotLike(String value) {
            addCriterion("CUSTAGENTBANKADDR not like", value, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrIn(List<String> values) {
            addCriterion("CUSTAGENTBANKADDR in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotIn(List<String> values) {
            addCriterion("CUSTAGENTBANKADDR not in", values, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKADDR between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentbankaddrNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTBANKADDR not between", value1, value2, "custagentbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNull() {
            addCriterion("CUSTAGENTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIsNotNull() {
            addCriterion("CUSTAGENTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO =", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <>", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThan(String value) {
            addCriterion("CUSTAGENTACCOUNTNO >", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO >=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThan(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTAGENTACCOUNTNO <=", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoLike(String value) {
            addCriterion("CUSTAGENTACCOUNTNO like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotLike(String value) {
            addCriterion("CUSTAGENTACCOUNTNO not like", value, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoIn(List<String> values) {
            addCriterion("CUSTAGENTACCOUNTNO in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotIn(List<String> values) {
            addCriterion("CUSTAGENTACCOUNTNO not in", values, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTAGENTACCOUNTNO between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustagentaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTAGENTACCOUNTNO not between", value1, value2, "custagentaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNull() {
            addCriterion("CUSTADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNotNull() {
            addCriterion("CUSTADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustaddressEqualTo(String value) {
            addCriterion("CUSTADDRESS =", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotEqualTo(String value) {
            addCriterion("CUSTADDRESS <>", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThan(String value) {
            addCriterion("CUSTADDRESS >", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTADDRESS >=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThan(String value) {
            addCriterion("CUSTADDRESS <", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTADDRESS <=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLike(String value) {
            addCriterion("CUSTADDRESS like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotLike(String value) {
            addCriterion("CUSTADDRESS not like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressIn(List<String> values) {
            addCriterion("CUSTADDRESS in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotIn(List<String> values) {
            addCriterion("CUSTADDRESS not in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressBetween(String value1, String value2) {
            addCriterion("CUSTADDRESS between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotBetween(String value1, String value2) {
            addCriterion("CUSTADDRESS not between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNull() {
            addCriterion("CUSTCOUNTRYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIsNotNull() {
            addCriterion("CUSTCOUNTRYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME =", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME <>", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThan(String value) {
            addCriterion("CUSTCOUNTRYNAME >", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME >=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThan(String value) {
            addCriterion("CUSTCOUNTRYNAME <", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLessThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYNAME <=", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameLike(String value) {
            addCriterion("CUSTCOUNTRYNAME like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotLike(String value) {
            addCriterion("CUSTCOUNTRYNAME not like", value, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameIn(List<String> values) {
            addCriterion("CUSTCOUNTRYNAME in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotIn(List<String> values) {
            addCriterion("CUSTCOUNTRYNAME not in", values, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYNAME between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrynameNotBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYNAME not between", value1, value2, "custcountryname");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNull() {
            addCriterion("CUSTCOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIsNotNull() {
            addCriterion("CUSTCOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE =", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE <>", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThan(String value) {
            addCriterion("CUSTCOUNTRYCODE >", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE >=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThan(String value) {
            addCriterion("CUSTCOUNTRYCODE <", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTCOUNTRYCODE <=", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeLike(String value) {
            addCriterion("CUSTCOUNTRYCODE like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotLike(String value) {
            addCriterion("CUSTCOUNTRYCODE not like", value, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeIn(List<String> values) {
            addCriterion("CUSTCOUNTRYCODE in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotIn(List<String> values) {
            addCriterion("CUSTCOUNTRYCODE not in", values, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYCODE between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andCustcountrycodeNotBetween(String value1, String value2) {
            addCriterion("CUSTCOUNTRYCODE not between", value1, value2, "custcountrycode");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("PAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("PAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("PAYMENTMETHOD =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("PAYMENTMETHOD <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("PAYMENTMETHOD >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTMETHOD >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("PAYMENTMETHOD <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTMETHOD <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("PAYMENTMETHOD like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("PAYMENTMETHOD not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("PAYMENTMETHOD in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("PAYMENTMETHOD not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("PAYMENTMETHOD between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("PAYMENTMETHOD not between", value1, value2, "paymentmethod");
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

        public Criteria andBasetaxesamountIsNull() {
            addCriterion("BASETAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountIsNotNull() {
            addCriterion("BASETAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountEqualTo(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT =", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT <>", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountGreaterThan(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT >", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT >=", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountLessThan(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT <", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASETAXESAMOUNT <=", value, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountIn(List<BigDecimal> values) {
            addCriterion("BASETAXESAMOUNT in", values, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("BASETAXESAMOUNT not in", values, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASETAXESAMOUNT between", value1, value2, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andBasetaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASETAXESAMOUNT not between", value1, value2, "basetaxesamount");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNull() {
            addCriterion("EXCHANGECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIsNotNull() {
            addCriterion("EXCHANGECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE =", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE <>", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThan(String value) {
            addCriterion("EXCHANGECURRENCYCODE >", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE >=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThan(String value) {
            addCriterion("EXCHANGECURRENCYCODE <", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCYCODE <=", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeLike(String value) {
            addCriterion("EXCHANGECURRENCYCODE like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotLike(String value) {
            addCriterion("EXCHANGECURRENCYCODE not like", value, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeIn(List<String> values) {
            addCriterion("EXCHANGECURRENCYCODE in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotIn(List<String> values) {
            addCriterion("EXCHANGECURRENCYCODE not in", values, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCYCODE between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCYCODE not between", value1, value2, "exchangecurrencycode");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNull() {
            addCriterion("EXCHANGEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNotNull() {
            addCriterion("EXCHANGEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountEqualTo(String value) {
            addCriterion("EXCHANGEAMOUNT =", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotEqualTo(String value) {
            addCriterion("EXCHANGEAMOUNT <>", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThan(String value) {
            addCriterion("EXCHANGEAMOUNT >", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGEAMOUNT >=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThan(String value) {
            addCriterion("EXCHANGEAMOUNT <", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGEAMOUNT <=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLike(String value) {
            addCriterion("EXCHANGEAMOUNT like", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotLike(String value) {
            addCriterion("EXCHANGEAMOUNT not like", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIn(List<String> values) {
            addCriterion("EXCHANGEAMOUNT in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotIn(List<String> values) {
            addCriterion("EXCHANGEAMOUNT not in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountBetween(String value1, String value2) {
            addCriterion("EXCHANGEAMOUNT between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotBetween(String value1, String value2) {
            addCriterion("EXCHANGEAMOUNT not between", value1, value2, "exchangeamount");
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

        public Criteria andSeqhandoverIsNull() {
            addCriterion("SEQHANDOVER is null");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverIsNotNull() {
            addCriterion("SEQHANDOVER is not null");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverEqualTo(Long value) {
            addCriterion("SEQHANDOVER =", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotEqualTo(Long value) {
            addCriterion("SEQHANDOVER <>", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverGreaterThan(Long value) {
            addCriterion("SEQHANDOVER >", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQHANDOVER >=", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverLessThan(Long value) {
            addCriterion("SEQHANDOVER <", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverLessThanOrEqualTo(Long value) {
            addCriterion("SEQHANDOVER <=", value, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverIn(List<Long> values) {
            addCriterion("SEQHANDOVER in", values, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotIn(List<Long> values) {
            addCriterion("SEQHANDOVER not in", values, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverBetween(Long value1, Long value2) {
            addCriterion("SEQHANDOVER between", value1, value2, "seqhandover");
            return (Criteria) this;
        }

        public Criteria andSeqhandoverNotBetween(Long value1, Long value2) {
            addCriterion("SEQHANDOVER not between", value1, value2, "seqhandover");
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

        public Criteria andIssplittedEqualTo(Byte value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(Byte value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(Byte value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(Byte value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(Byte value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(Byte value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<Byte> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<Byte> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(Byte value1, Byte value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(Byte value1, Byte value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_querysettlement_temp
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
     * @Table : mm_querysettlement_temp
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