package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPayablemoneyTdExample {
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
    public MmPayablemoneyTdExample() {
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
     * @Table : mm_payablemoney_td
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

        public Criteria andIfeffectIsNull() {
            addCriterion("IFEFFECT is null");
            return (Criteria) this;
        }

        public Criteria andIfeffectIsNotNull() {
            addCriterion("IFEFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andIfeffectEqualTo(String value) {
            addCriterion("IFEFFECT =", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotEqualTo(String value) {
            addCriterion("IFEFFECT <>", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectGreaterThan(String value) {
            addCriterion("IFEFFECT >", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectGreaterThanOrEqualTo(String value) {
            addCriterion("IFEFFECT >=", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLessThan(String value) {
            addCriterion("IFEFFECT <", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLessThanOrEqualTo(String value) {
            addCriterion("IFEFFECT <=", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLike(String value) {
            addCriterion("IFEFFECT like", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotLike(String value) {
            addCriterion("IFEFFECT not like", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectIn(List<String> values) {
            addCriterion("IFEFFECT in", values, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotIn(List<String> values) {
            addCriterion("IFEFFECT not in", values, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectBetween(String value1, String value2) {
            addCriterion("IFEFFECT between", value1, value2, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotBetween(String value1, String value2) {
            addCriterion("IFEFFECT not between", value1, value2, "ifeffect");
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

        public Criteria andCardpolicynoIsNull() {
            addCriterion("CARDPOLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIsNotNull() {
            addCriterion("CARDPOLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoEqualTo(String value) {
            addCriterion("CARDPOLICYNO =", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotEqualTo(String value) {
            addCriterion("CARDPOLICYNO <>", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThan(String value) {
            addCriterion("CARDPOLICYNO >", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDPOLICYNO >=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThan(String value) {
            addCriterion("CARDPOLICYNO <", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLessThanOrEqualTo(String value) {
            addCriterion("CARDPOLICYNO <=", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoLike(String value) {
            addCriterion("CARDPOLICYNO like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotLike(String value) {
            addCriterion("CARDPOLICYNO not like", value, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoIn(List<String> values) {
            addCriterion("CARDPOLICYNO in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotIn(List<String> values) {
            addCriterion("CARDPOLICYNO not in", values, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoBetween(String value1, String value2) {
            addCriterion("CARDPOLICYNO between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andCardpolicynoNotBetween(String value1, String value2) {
            addCriterion("CARDPOLICYNO not between", value1, value2, "cardpolicyno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoIsNull() {
            addCriterion("WAITPAYNO is null");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoIsNotNull() {
            addCriterion("WAITPAYNO is not null");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoEqualTo(String value) {
            addCriterion("WAITPAYNO =", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoNotEqualTo(String value) {
            addCriterion("WAITPAYNO <>", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoGreaterThan(String value) {
            addCriterion("WAITPAYNO >", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoGreaterThanOrEqualTo(String value) {
            addCriterion("WAITPAYNO >=", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoLessThan(String value) {
            addCriterion("WAITPAYNO <", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoLessThanOrEqualTo(String value) {
            addCriterion("WAITPAYNO <=", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoLike(String value) {
            addCriterion("WAITPAYNO like", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoNotLike(String value) {
            addCriterion("WAITPAYNO not like", value, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoIn(List<String> values) {
            addCriterion("WAITPAYNO in", values, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoNotIn(List<String> values) {
            addCriterion("WAITPAYNO not in", values, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoBetween(String value1, String value2) {
            addCriterion("WAITPAYNO between", value1, value2, "waitpayno");
            return (Criteria) this;
        }

        public Criteria andWaitpaynoNotBetween(String value1, String value2) {
            addCriterion("WAITPAYNO not between", value1, value2, "waitpayno");
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

        public Criteria andInpaymentdepartmentIsNull() {
            addCriterion("INPAYMENTDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIsNotNull() {
            addCriterion("INPAYMENTDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT =", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <>", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT >", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT >=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT <", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT not like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT not in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT between", value1, value2, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT not between", value1, value2, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andCloseamountIsNull() {
            addCriterion("CLOSEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCloseamountIsNotNull() {
            addCriterion("CLOSEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCloseamountEqualTo(BigDecimal value) {
            addCriterion("CLOSEAMOUNT =", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountNotEqualTo(BigDecimal value) {
            addCriterion("CLOSEAMOUNT <>", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountGreaterThan(BigDecimal value) {
            addCriterion("CLOSEAMOUNT >", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLOSEAMOUNT >=", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountLessThan(BigDecimal value) {
            addCriterion("CLOSEAMOUNT <", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLOSEAMOUNT <=", value, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountIn(List<BigDecimal> values) {
            addCriterion("CLOSEAMOUNT in", values, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountNotIn(List<BigDecimal> values) {
            addCriterion("CLOSEAMOUNT not in", values, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLOSEAMOUNT between", value1, value2, "closeamount");
            return (Criteria) this;
        }

        public Criteria andCloseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLOSEAMOUNT not between", value1, value2, "closeamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountIsNull() {
            addCriterion("BASECLOSEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountIsNotNull() {
            addCriterion("BASECLOSEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountEqualTo(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT =", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountNotEqualTo(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT <>", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountGreaterThan(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT >", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT >=", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountLessThan(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT <", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASECLOSEAMOUNT <=", value, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountIn(List<BigDecimal> values) {
            addCriterion("BASECLOSEAMOUNT in", values, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountNotIn(List<BigDecimal> values) {
            addCriterion("BASECLOSEAMOUNT not in", values, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASECLOSEAMOUNT between", value1, value2, "basecloseamount");
            return (Criteria) this;
        }

        public Criteria andBasecloseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASECLOSEAMOUNT not between", value1, value2, "basecloseamount");
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

        public Criteria andOffsetnoIsNull() {
            addCriterion("OFFSETNO is null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNotNull() {
            addCriterion("OFFSETNO is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoEqualTo(String value) {
            addCriterion("OFFSETNO =", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotEqualTo(String value) {
            addCriterion("OFFSETNO <>", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThan(String value) {
            addCriterion("OFFSETNO >", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETNO >=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThan(String value) {
            addCriterion("OFFSETNO <", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThanOrEqualTo(String value) {
            addCriterion("OFFSETNO <=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLike(String value) {
            addCriterion("OFFSETNO like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotLike(String value) {
            addCriterion("OFFSETNO not like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIn(List<String> values) {
            addCriterion("OFFSETNO in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotIn(List<String> values) {
            addCriterion("OFFSETNO not in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoBetween(String value1, String value2) {
            addCriterion("OFFSETNO between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotBetween(String value1, String value2) {
            addCriterion("OFFSETNO not between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
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

        public Criteria andCustisjapanIsNull() {
            addCriterion("CUSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNotNull() {
            addCriterion("CUSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanEqualTo(String value) {
            addCriterion("CUSTISJAPAN =", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotEqualTo(String value) {
            addCriterion("CUSTISJAPAN <>", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThan(String value) {
            addCriterion("CUSTISJAPAN >", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN >=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThan(String value) {
            addCriterion("CUSTISJAPAN <", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN <=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLike(String value) {
            addCriterion("CUSTISJAPAN like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotLike(String value) {
            addCriterion("CUSTISJAPAN not like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIn(List<String> values) {
            addCriterion("CUSTISJAPAN in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotIn(List<String> values) {
            addCriterion("CUSTISJAPAN not in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN not between", value1, value2, "custisjapan");
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

        public Criteria andAgentpartynoIsNull() {
            addCriterion("AGENTPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNotNull() {
            addCriterion("AGENTPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoEqualTo(String value) {
            addCriterion("AGENTPARTYNO =", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotEqualTo(String value) {
            addCriterion("AGENTPARTYNO <>", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThan(String value) {
            addCriterion("AGENTPARTYNO >", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO >=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThan(String value) {
            addCriterion("AGENTPARTYNO <", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO <=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLike(String value) {
            addCriterion("AGENTPARTYNO like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotLike(String value) {
            addCriterion("AGENTPARTYNO not like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIn(List<String> values) {
            addCriterion("AGENTPARTYNO in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotIn(List<String> values) {
            addCriterion("AGENTPARTYNO not in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO not between", value1, value2, "agentpartyno");
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

        public Criteria andCustaccountnameenIsNull() {
            addCriterion("CUSTACCOUNTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNotNull() {
            addCriterion("CUSTACCOUNTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN =", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <>", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN not like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN not in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN not between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNull() {
            addCriterion("CHARGEDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNotNull() {
            addCriterion("CHARGEDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION =", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION <>", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThan(String value) {
            addCriterion("CHARGEDESCRIPTION >", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION >=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThan(String value) {
            addCriterion("CHARGEDESCRIPTION <", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThanOrEqualTo(String value) {
            addCriterion("CHARGEDESCRIPTION <=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLike(String value) {
            addCriterion("CHARGEDESCRIPTION like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotLike(String value) {
            addCriterion("CHARGEDESCRIPTION not like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIn(List<String> values) {
            addCriterion("CHARGEDESCRIPTION in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotIn(List<String> values) {
            addCriterion("CHARGEDESCRIPTION not in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionBetween(String value1, String value2) {
            addCriterion("CHARGEDESCRIPTION between", value1, value2, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotBetween(String value1, String value2) {
            addCriterion("CHARGEDESCRIPTION not between", value1, value2, "chargedescription");
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

        public Criteria andSettlementnoIsNull() {
            addCriterion("SETTLEMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("SETTLEMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(String value) {
            addCriterion("SETTLEMENTNO =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(String value) {
            addCriterion("SETTLEMENTNO <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(String value) {
            addCriterion("SETTLEMENTNO >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTNO >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(String value) {
            addCriterion("SETTLEMENTNO <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTNO <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLike(String value) {
            addCriterion("SETTLEMENTNO like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotLike(String value) {
            addCriterion("SETTLEMENTNO not like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<String> values) {
            addCriterion("SETTLEMENTNO in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<String> values) {
            addCriterion("SETTLEMENTNO not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(String value1, String value2) {
            addCriterion("SETTLEMENTNO between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENTNO not between", value1, value2, "settlementno");
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

        public Criteria andExstatusIsNull() {
            addCriterion("EXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNotNull() {
            addCriterion("EXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExstatusEqualTo(String value) {
            addCriterion("EXSTATUS =", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotEqualTo(String value) {
            addCriterion("EXSTATUS <>", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThan(String value) {
            addCriterion("EXSTATUS >", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXSTATUS >=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThan(String value) {
            addCriterion("EXSTATUS <", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThanOrEqualTo(String value) {
            addCriterion("EXSTATUS <=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLike(String value) {
            addCriterion("EXSTATUS like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotLike(String value) {
            addCriterion("EXSTATUS not like", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusIn(List<String> values) {
            addCriterion("EXSTATUS in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotIn(List<String> values) {
            addCriterion("EXSTATUS not in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusBetween(String value1, String value2) {
            addCriterion("EXSTATUS between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotBetween(String value1, String value2) {
            addCriterion("EXSTATUS not between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNull() {
            addCriterion("EXCEPTIONCAUSE is null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIsNotNull() {
            addCriterion("EXCEPTIONCAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE =", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <>", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThan(String value) {
            addCriterion("EXCEPTIONCAUSE >", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE >=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThan(String value) {
            addCriterion("EXCEPTIONCAUSE <", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONCAUSE <=", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseLike(String value) {
            addCriterion("EXCEPTIONCAUSE like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotLike(String value) {
            addCriterion("EXCEPTIONCAUSE not like", value, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotIn(List<String> values) {
            addCriterion("EXCEPTIONCAUSE not in", values, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andExceptioncauseNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONCAUSE not between", value1, value2, "exceptioncause");
            return (Criteria) this;
        }

        public Criteria andIflocalIsNull() {
            addCriterion("IFLOCAL is null");
            return (Criteria) this;
        }

        public Criteria andIflocalIsNotNull() {
            addCriterion("IFLOCAL is not null");
            return (Criteria) this;
        }

        public Criteria andIflocalEqualTo(String value) {
            addCriterion("IFLOCAL =", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotEqualTo(String value) {
            addCriterion("IFLOCAL <>", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalGreaterThan(String value) {
            addCriterion("IFLOCAL >", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalGreaterThanOrEqualTo(String value) {
            addCriterion("IFLOCAL >=", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLessThan(String value) {
            addCriterion("IFLOCAL <", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLessThanOrEqualTo(String value) {
            addCriterion("IFLOCAL <=", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLike(String value) {
            addCriterion("IFLOCAL like", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotLike(String value) {
            addCriterion("IFLOCAL not like", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalIn(List<String> values) {
            addCriterion("IFLOCAL in", values, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotIn(List<String> values) {
            addCriterion("IFLOCAL not in", values, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalBetween(String value1, String value2) {
            addCriterion("IFLOCAL between", value1, value2, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotBetween(String value1, String value2) {
            addCriterion("IFLOCAL not between", value1, value2, "iflocal");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
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

        public Criteria andSourcenoIsNull() {
            addCriterion("SOURCENO is null");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNotNull() {
            addCriterion("SOURCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenoEqualTo(BigDecimal value) {
            addCriterion("SOURCENO =", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <>", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThan(BigDecimal value) {
            addCriterion("SOURCENO >", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO >=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThan(BigDecimal value) {
            addCriterion("SOURCENO <", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIn(List<BigDecimal> values) {
            addCriterion("SOURCENO in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotIn(List<BigDecimal> values) {
            addCriterion("SOURCENO not in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO not between", value1, value2, "sourceno");
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

        public Criteria andCardflagIsNull() {
            addCriterion("CARDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNotNull() {
            addCriterion("CARDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCardflagEqualTo(String value) {
            addCriterion("CARDFLAG =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(String value) {
            addCriterion("CARDFLAG <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(String value) {
            addCriterion("CARDFLAG >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(String value) {
            addCriterion("CARDFLAG >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(String value) {
            addCriterion("CARDFLAG <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(String value) {
            addCriterion("CARDFLAG <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLike(String value) {
            addCriterion("CARDFLAG like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotLike(String value) {
            addCriterion("CARDFLAG not like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<String> values) {
            addCriterion("CARDFLAG in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<String> values) {
            addCriterion("CARDFLAG not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(String value1, String value2) {
            addCriterion("CARDFLAG between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(String value1, String value2) {
            addCriterion("CARDFLAG not between", value1, value2, "cardflag");
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

        public Criteria andCustemailIsNull() {
            addCriterion("CUSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("CUSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("CUSTEMAIL =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("CUSTEMAIL <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("CUSTEMAIL >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("CUSTEMAIL <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("CUSTEMAIL like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("CUSTEMAIL not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("CUSTEMAIL in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("CUSTEMAIL not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL not between", value1, value2, "custemail");
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

        public Criteria andPairnoIsNull() {
            addCriterion("PAIRNO is null");
            return (Criteria) this;
        }

        public Criteria andPairnoIsNotNull() {
            addCriterion("PAIRNO is not null");
            return (Criteria) this;
        }

        public Criteria andPairnoEqualTo(String value) {
            addCriterion("PAIRNO =", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotEqualTo(String value) {
            addCriterion("PAIRNO <>", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoGreaterThan(String value) {
            addCriterion("PAIRNO >", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAIRNO >=", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLessThan(String value) {
            addCriterion("PAIRNO <", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLessThanOrEqualTo(String value) {
            addCriterion("PAIRNO <=", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoLike(String value) {
            addCriterion("PAIRNO like", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotLike(String value) {
            addCriterion("PAIRNO not like", value, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoIn(List<String> values) {
            addCriterion("PAIRNO in", values, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotIn(List<String> values) {
            addCriterion("PAIRNO not in", values, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoBetween(String value1, String value2) {
            addCriterion("PAIRNO between", value1, value2, "pairno");
            return (Criteria) this;
        }

        public Criteria andPairnoNotBetween(String value1, String value2) {
            addCriterion("PAIRNO not between", value1, value2, "pairno");
            return (Criteria) this;
        }

        public Criteria andBankareaIsNull() {
            addCriterion("BANKAREA is null");
            return (Criteria) this;
        }

        public Criteria andBankareaIsNotNull() {
            addCriterion("BANKAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBankareaEqualTo(String value) {
            addCriterion("BANKAREA =", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotEqualTo(String value) {
            addCriterion("BANKAREA <>", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaGreaterThan(String value) {
            addCriterion("BANKAREA >", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaGreaterThanOrEqualTo(String value) {
            addCriterion("BANKAREA >=", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLessThan(String value) {
            addCriterion("BANKAREA <", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLessThanOrEqualTo(String value) {
            addCriterion("BANKAREA <=", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaLike(String value) {
            addCriterion("BANKAREA like", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotLike(String value) {
            addCriterion("BANKAREA not like", value, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaIn(List<String> values) {
            addCriterion("BANKAREA in", values, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotIn(List<String> values) {
            addCriterion("BANKAREA not in", values, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaBetween(String value1, String value2) {
            addCriterion("BANKAREA between", value1, value2, "bankarea");
            return (Criteria) this;
        }

        public Criteria andBankareaNotBetween(String value1, String value2) {
            addCriterion("BANKAREA not between", value1, value2, "bankarea");
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

        public Criteria andFastflagIsNull() {
            addCriterion("FASTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("FASTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(String value) {
            addCriterion("FASTFLAG =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(String value) {
            addCriterion("FASTFLAG <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(String value) {
            addCriterion("FASTFLAG >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(String value) {
            addCriterion("FASTFLAG >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(String value) {
            addCriterion("FASTFLAG <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(String value) {
            addCriterion("FASTFLAG <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLike(String value) {
            addCriterion("FASTFLAG like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotLike(String value) {
            addCriterion("FASTFLAG not like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<String> values) {
            addCriterion("FASTFLAG in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<String> values) {
            addCriterion("FASTFLAG not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(String value1, String value2) {
            addCriterion("FASTFLAG between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(String value1, String value2) {
            addCriterion("FASTFLAG not between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNull() {
            addCriterion("SMSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNotNull() {
            addCriterion("SMSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSmsflagEqualTo(String value) {
            addCriterion("SMSFLAG =", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotEqualTo(String value) {
            addCriterion("SMSFLAG <>", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThan(String value) {
            addCriterion("SMSFLAG >", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThanOrEqualTo(String value) {
            addCriterion("SMSFLAG >=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThan(String value) {
            addCriterion("SMSFLAG <", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThanOrEqualTo(String value) {
            addCriterion("SMSFLAG <=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLike(String value) {
            addCriterion("SMSFLAG like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotLike(String value) {
            addCriterion("SMSFLAG not like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIn(List<String> values) {
            addCriterion("SMSFLAG in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotIn(List<String> values) {
            addCriterion("SMSFLAG not in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagBetween(String value1, String value2) {
            addCriterion("SMSFLAG between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotBetween(String value1, String value2) {
            addCriterion("SMSFLAG not between", value1, value2, "smsflag");
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

        public Criteria andCustaccountareaIsNull() {
            addCriterion("CUSTACCOUNTAREA is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNotNull() {
            addCriterion("CUSTACCOUNTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA =", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <>", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThan(String value) {
            addCriterion("CUSTACCOUNTAREA >", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA >=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThan(String value) {
            addCriterion("CUSTACCOUNTAREA <", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLike(String value) {
            addCriterion("CUSTACCOUNTAREA like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotLike(String value) {
            addCriterion("CUSTACCOUNTAREA not like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA not in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA not between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNull() {
            addCriterion("CUSTBANKADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNotNull() {
            addCriterion("CUSTBANKADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrEqualTo(String value) {
            addCriterion("CUSTBANKADDR =", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotEqualTo(String value) {
            addCriterion("CUSTBANKADDR <>", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThan(String value) {
            addCriterion("CUSTBANKADDR >", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR >=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThan(String value) {
            addCriterion("CUSTBANKADDR <", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR <=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLike(String value) {
            addCriterion("CUSTBANKADDR like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotLike(String value) {
            addCriterion("CUSTBANKADDR not like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIn(List<String> values) {
            addCriterion("CUSTBANKADDR in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotIn(List<String> values) {
            addCriterion("CUSTBANKADDR not in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR not between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNull() {
            addCriterion("CUSTBANKSWIFTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNotNull() {
            addCriterion("CUSTBANKSWIFTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE =", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <>", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE >", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE >=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE <", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE not like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE not in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE not between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNull() {
            addCriterion("CUSTCHARGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNotNull() {
            addCriterion("CUSTCHARGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE =", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <>", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThan(String value) {
            addCriterion("CUSTCHARGETYPE >", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE >=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThan(String value) {
            addCriterion("CUSTCHARGETYPE <", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLike(String value) {
            addCriterion("CUSTCHARGETYPE like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotLike(String value) {
            addCriterion("CUSTCHARGETYPE not like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE not in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE between", value1, value2, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE not between", value1, value2, "custchargetype");
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

        public Criteria andIfprecostIsNull() {
            addCriterion("IFPRECOST is null");
            return (Criteria) this;
        }

        public Criteria andIfprecostIsNotNull() {
            addCriterion("IFPRECOST is not null");
            return (Criteria) this;
        }

        public Criteria andIfprecostEqualTo(String value) {
            addCriterion("IFPRECOST =", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotEqualTo(String value) {
            addCriterion("IFPRECOST <>", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostGreaterThan(String value) {
            addCriterion("IFPRECOST >", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostGreaterThanOrEqualTo(String value) {
            addCriterion("IFPRECOST >=", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLessThan(String value) {
            addCriterion("IFPRECOST <", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLessThanOrEqualTo(String value) {
            addCriterion("IFPRECOST <=", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostLike(String value) {
            addCriterion("IFPRECOST like", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotLike(String value) {
            addCriterion("IFPRECOST not like", value, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostIn(List<String> values) {
            addCriterion("IFPRECOST in", values, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotIn(List<String> values) {
            addCriterion("IFPRECOST not in", values, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostBetween(String value1, String value2) {
            addCriterion("IFPRECOST between", value1, value2, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andIfprecostNotBetween(String value1, String value2) {
            addCriterion("IFPRECOST not between", value1, value2, "ifprecost");
            return (Criteria) this;
        }

        public Criteria andCertinoIsNull() {
            addCriterion("CERTINO is null");
            return (Criteria) this;
        }

        public Criteria andCertinoIsNotNull() {
            addCriterion("CERTINO is not null");
            return (Criteria) this;
        }

        public Criteria andCertinoEqualTo(String value) {
            addCriterion("CERTINO =", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoNotEqualTo(String value) {
            addCriterion("CERTINO <>", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoGreaterThan(String value) {
            addCriterion("CERTINO >", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTINO >=", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoLessThan(String value) {
            addCriterion("CERTINO <", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoLessThanOrEqualTo(String value) {
            addCriterion("CERTINO <=", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoLike(String value) {
            addCriterion("CERTINO like", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoNotLike(String value) {
            addCriterion("CERTINO not like", value, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoIn(List<String> values) {
            addCriterion("CERTINO in", values, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoNotIn(List<String> values) {
            addCriterion("CERTINO not in", values, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoBetween(String value1, String value2) {
            addCriterion("CERTINO between", value1, value2, "certino");
            return (Criteria) this;
        }

        public Criteria andCertinoNotBetween(String value1, String value2) {
            addCriterion("CERTINO not between", value1, value2, "certino");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoIsNull() {
            addCriterion("PAYBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoIsNotNull() {
            addCriterion("PAYBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoEqualTo(String value) {
            addCriterion("PAYBATCHNO =", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoNotEqualTo(String value) {
            addCriterion("PAYBATCHNO <>", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoGreaterThan(String value) {
            addCriterion("PAYBATCHNO >", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBATCHNO >=", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoLessThan(String value) {
            addCriterion("PAYBATCHNO <", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoLessThanOrEqualTo(String value) {
            addCriterion("PAYBATCHNO <=", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoLike(String value) {
            addCriterion("PAYBATCHNO like", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoNotLike(String value) {
            addCriterion("PAYBATCHNO not like", value, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoIn(List<String> values) {
            addCriterion("PAYBATCHNO in", values, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoNotIn(List<String> values) {
            addCriterion("PAYBATCHNO not in", values, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoBetween(String value1, String value2) {
            addCriterion("PAYBATCHNO between", value1, value2, "paybatchno");
            return (Criteria) this;
        }

        public Criteria andPaybatchnoNotBetween(String value1, String value2) {
            addCriterion("PAYBATCHNO not between", value1, value2, "paybatchno");
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

        public Criteria andExchangeamountEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT =", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <>", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT not in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT not between", value1, value2, "exchangeamount");
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

        public Criteria andAgenttypeIsNull() {
            addCriterion("AGENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNotNull() {
            addCriterion("AGENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeEqualTo(String value) {
            addCriterion("AGENTTYPE =", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotEqualTo(String value) {
            addCriterion("AGENTTYPE <>", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThan(String value) {
            addCriterion("AGENTTYPE >", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE >=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThan(String value) {
            addCriterion("AGENTTYPE <", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE <=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLike(String value) {
            addCriterion("AGENTTYPE like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotLike(String value) {
            addCriterion("AGENTTYPE not like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIn(List<String> values) {
            addCriterion("AGENTTYPE in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotIn(List<String> values) {
            addCriterion("AGENTTYPE not in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeBetween(String value1, String value2) {
            addCriterion("AGENTTYPE between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotBetween(String value1, String value2) {
            addCriterion("AGENTTYPE not between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNull() {
            addCriterion("FARMFLAGCODE is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNotNull() {
            addCriterion("FARMFLAGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeEqualTo(String value) {
            addCriterion("FARMFLAGCODE =", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotEqualTo(String value) {
            addCriterion("FARMFLAGCODE <>", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThan(String value) {
            addCriterion("FARMFLAGCODE >", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE >=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThan(String value) {
            addCriterion("FARMFLAGCODE <", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE <=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLike(String value) {
            addCriterion("FARMFLAGCODE like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotLike(String value) {
            addCriterion("FARMFLAGCODE not like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIn(List<String> values) {
            addCriterion("FARMFLAGCODE in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotIn(List<String> values) {
            addCriterion("FARMFLAGCODE not in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE not between", value1, value2, "farmflagcode");
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

        public Criteria andCharacteristicsIsNull() {
            addCriterion("CHARACTERISTICS is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNotNull() {
            addCriterion("CHARACTERISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsEqualTo(String value) {
            addCriterion("CHARACTERISTICS =", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotEqualTo(String value) {
            addCriterion("CHARACTERISTICS <>", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThan(String value) {
            addCriterion("CHARACTERISTICS >", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS >=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThan(String value) {
            addCriterion("CHARACTERISTICS <", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS <=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLike(String value) {
            addCriterion("CHARACTERISTICS like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotLike(String value) {
            addCriterion("CHARACTERISTICS not like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIn(List<String> values) {
            addCriterion("CHARACTERISTICS in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotIn(List<String> values) {
            addCriterion("CHARACTERISTICS not in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS not between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNull() {
            addCriterion("FARPOLICYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNotNull() {
            addCriterion("FARPOLICYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeEqualTo(String value) {
            addCriterion("FARPOLICYTYPE =", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <>", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThan(String value) {
            addCriterion("FARPOLICYTYPE >", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE >=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThan(String value) {
            addCriterion("FARPOLICYTYPE <", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLike(String value) {
            addCriterion("FARPOLICYTYPE like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotLike(String value) {
            addCriterion("FARPOLICYTYPE not like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIn(List<String> values) {
            addCriterion("FARPOLICYTYPE in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotIn(List<String> values) {
            addCriterion("FARPOLICYTYPE not in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE not between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIsNull() {
            addCriterion("SETTLEMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIsNotNull() {
            addCriterion("SETTLEMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE =", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE <>", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThan(String value) {
            addCriterion("SETTLEMENTTYPE >", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE >=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThan(String value) {
            addCriterion("SETTLEMENTTYPE <", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE <=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLike(String value) {
            addCriterion("SETTLEMENTTYPE like", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotLike(String value) {
            addCriterion("SETTLEMENTTYPE not like", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIn(List<String> values) {
            addCriterion("SETTLEMENTTYPE in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotIn(List<String> values) {
            addCriterion("SETTLEMENTTYPE not in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeBetween(String value1, String value2) {
            addCriterion("SETTLEMENTTYPE between", value1, value2, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENTTYPE not between", value1, value2, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNull() {
            addCriterion("CARUSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNotNull() {
            addCriterion("CARUSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeEqualTo(String value) {
            addCriterion("CARUSETYPE =", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotEqualTo(String value) {
            addCriterion("CARUSETYPE <>", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThan(String value) {
            addCriterion("CARUSETYPE >", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE >=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThan(String value) {
            addCriterion("CARUSETYPE <", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE <=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLike(String value) {
            addCriterion("CARUSETYPE like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotLike(String value) {
            addCriterion("CARUSETYPE not like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIn(List<String> values) {
            addCriterion("CARUSETYPE in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotIn(List<String> values) {
            addCriterion("CARUSETYPE not in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeBetween(String value1, String value2) {
            addCriterion("CARUSETYPE between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotBetween(String value1, String value2) {
            addCriterion("CARUSETYPE not between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andConfirmamountIsNull() {
            addCriterion("CONFIRMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmamountIsNotNull() {
            addCriterion("CONFIRMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmamountEqualTo(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT =", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountNotEqualTo(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT <>", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountGreaterThan(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT >", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT >=", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountLessThan(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT <", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRMAMOUNT <=", value, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountIn(List<BigDecimal> values) {
            addCriterion("CONFIRMAMOUNT in", values, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountNotIn(List<BigDecimal> values) {
            addCriterion("CONFIRMAMOUNT not in", values, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMAMOUNT between", value1, value2, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andConfirmamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRMAMOUNT not between", value1, value2, "confirmamount");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIsNull() {
            addCriterion("MAINPOLICYNO is null");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIsNotNull() {
            addCriterion("MAINPOLICYNO is not null");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoEqualTo(String value) {
            addCriterion("MAINPOLICYNO =", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotEqualTo(String value) {
            addCriterion("MAINPOLICYNO <>", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoGreaterThan(String value) {
            addCriterion("MAINPOLICYNO >", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("MAINPOLICYNO >=", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLessThan(String value) {
            addCriterion("MAINPOLICYNO <", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLessThanOrEqualTo(String value) {
            addCriterion("MAINPOLICYNO <=", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoLike(String value) {
            addCriterion("MAINPOLICYNO like", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotLike(String value) {
            addCriterion("MAINPOLICYNO not like", value, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoIn(List<String> values) {
            addCriterion("MAINPOLICYNO in", values, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotIn(List<String> values) {
            addCriterion("MAINPOLICYNO not in", values, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoBetween(String value1, String value2) {
            addCriterion("MAINPOLICYNO between", value1, value2, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andMainpolicynoNotBetween(String value1, String value2) {
            addCriterion("MAINPOLICYNO not between", value1, value2, "mainpolicyno");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusIsNull() {
            addCriterion("CONFIRMSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusIsNotNull() {
            addCriterion("CONFIRMSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusEqualTo(String value) {
            addCriterion("CONFIRMSTATUS =", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusNotEqualTo(String value) {
            addCriterion("CONFIRMSTATUS <>", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusGreaterThan(String value) {
            addCriterion("CONFIRMSTATUS >", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMSTATUS >=", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusLessThan(String value) {
            addCriterion("CONFIRMSTATUS <", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMSTATUS <=", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusLike(String value) {
            addCriterion("CONFIRMSTATUS like", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusNotLike(String value) {
            addCriterion("CONFIRMSTATUS not like", value, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusIn(List<String> values) {
            addCriterion("CONFIRMSTATUS in", values, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusNotIn(List<String> values) {
            addCriterion("CONFIRMSTATUS not in", values, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusBetween(String value1, String value2) {
            addCriterion("CONFIRMSTATUS between", value1, value2, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andConfirmstatusNotBetween(String value1, String value2) {
            addCriterion("CONFIRMSTATUS not between", value1, value2, "confirmstatus");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNull() {
            addCriterion("TAXESAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNotNull() {
            addCriterion("TAXESAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1EqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 =", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <>", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1In(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 not in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 not between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIsNull() {
            addCriterion("CUSTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIsNotNull() {
            addCriterion("CUSTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknameEqualTo(String value) {
            addCriterion("CUSTBANKNAME =", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotEqualTo(String value) {
            addCriterion("CUSTBANKNAME <>", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameGreaterThan(String value) {
            addCriterion("CUSTBANKNAME >", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNAME >=", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLessThan(String value) {
            addCriterion("CUSTBANKNAME <", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNAME <=", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLike(String value) {
            addCriterion("CUSTBANKNAME like", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotLike(String value) {
            addCriterion("CUSTBANKNAME not like", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIn(List<String> values) {
            addCriterion("CUSTBANKNAME in", values, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotIn(List<String> values) {
            addCriterion("CUSTBANKNAME not in", values, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameBetween(String value1, String value2) {
            addCriterion("CUSTBANKNAME between", value1, value2, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKNAME not between", value1, value2, "custbankname");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIsNull() {
            addCriterion("businessBelong is null");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIsNotNull() {
            addCriterion("businessBelong is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongEqualTo(String value) {
            addCriterion("businessBelong =", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotEqualTo(String value) {
            addCriterion("businessBelong <>", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongGreaterThan(String value) {
            addCriterion("businessBelong >", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongGreaterThanOrEqualTo(String value) {
            addCriterion("businessBelong >=", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLessThan(String value) {
            addCriterion("businessBelong <", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLessThanOrEqualTo(String value) {
            addCriterion("businessBelong <=", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongLike(String value) {
            addCriterion("businessBelong like", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotLike(String value) {
            addCriterion("businessBelong not like", value, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongIn(List<String> values) {
            addCriterion("businessBelong in", values, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotIn(List<String> values) {
            addCriterion("businessBelong not in", values, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongBetween(String value1, String value2) {
            addCriterion("businessBelong between", value1, value2, "businessbelong");
            return (Criteria) this;
        }

        public Criteria andBusinessbelongNotBetween(String value1, String value2) {
            addCriterion("businessBelong not between", value1, value2, "businessbelong");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_payablemoney_td
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
     * @Table : mm_payablemoney_td
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