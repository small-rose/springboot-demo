package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HicmiMidAccSubExample {
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
    public HicmiMidAccSubExample() {
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
     * @Table : hicmi_mid_acc_sub
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

        public Criteria andMainIdIsNull() {
            addCriterion("MAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("MAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(Long value) {
            addCriterion("MAIN_ID =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(Long value) {
            addCriterion("MAIN_ID <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(Long value) {
            addCriterion("MAIN_ID >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MAIN_ID >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(Long value) {
            addCriterion("MAIN_ID <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(Long value) {
            addCriterion("MAIN_ID <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<Long> values) {
            addCriterion("MAIN_ID in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<Long> values) {
            addCriterion("MAIN_ID not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(Long value1, Long value2) {
            addCriterion("MAIN_ID between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(Long value1, Long value2) {
            addCriterion("MAIN_ID not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andTrdnmIsNull() {
            addCriterion("TRDNM is null");
            return (Criteria) this;
        }

        public Criteria andTrdnmIsNotNull() {
            addCriterion("TRDNM is not null");
            return (Criteria) this;
        }

        public Criteria andTrdnmEqualTo(String value) {
            addCriterion("TRDNM =", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotEqualTo(String value) {
            addCriterion("TRDNM <>", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThan(String value) {
            addCriterion("TRDNM >", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThanOrEqualTo(String value) {
            addCriterion("TRDNM >=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThan(String value) {
            addCriterion("TRDNM <", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThanOrEqualTo(String value) {
            addCriterion("TRDNM <=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLike(String value) {
            addCriterion("TRDNM like", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotLike(String value) {
            addCriterion("TRDNM not like", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmIn(List<String> values) {
            addCriterion("TRDNM in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotIn(List<String> values) {
            addCriterion("TRDNM not in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmBetween(String value1, String value2) {
            addCriterion("TRDNM between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotBetween(String value1, String value2) {
            addCriterion("TRDNM not between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailindexIsNull() {
            addCriterion("DETAILINDEX is null");
            return (Criteria) this;
        }

        public Criteria andDetailindexIsNotNull() {
            addCriterion("DETAILINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andDetailindexEqualTo(Integer value) {
            addCriterion("DETAILINDEX =", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotEqualTo(Integer value) {
            addCriterion("DETAILINDEX <>", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexGreaterThan(Integer value) {
            addCriterion("DETAILINDEX >", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("DETAILINDEX >=", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexLessThan(Integer value) {
            addCriterion("DETAILINDEX <", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexLessThanOrEqualTo(Integer value) {
            addCriterion("DETAILINDEX <=", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexIn(List<Integer> values) {
            addCriterion("DETAILINDEX in", values, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotIn(List<Integer> values) {
            addCriterion("DETAILINDEX not in", values, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexBetween(Integer value1, Integer value2) {
            addCriterion("DETAILINDEX between", value1, value2, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotBetween(Integer value1, Integer value2) {
            addCriterion("DETAILINDEX not between", value1, value2, "detailindex");
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

        public Criteria andYearmonthIsNull() {
            addCriterion("YEARMONTH is null");
            return (Criteria) this;
        }

        public Criteria andYearmonthIsNotNull() {
            addCriterion("YEARMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andYearmonthEqualTo(String value) {
            addCriterion("YEARMONTH =", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthNotEqualTo(String value) {
            addCriterion("YEARMONTH <>", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthGreaterThan(String value) {
            addCriterion("YEARMONTH >", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthGreaterThanOrEqualTo(String value) {
            addCriterion("YEARMONTH >=", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthLessThan(String value) {
            addCriterion("YEARMONTH <", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthLessThanOrEqualTo(String value) {
            addCriterion("YEARMONTH <=", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthLike(String value) {
            addCriterion("YEARMONTH like", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthNotLike(String value) {
            addCriterion("YEARMONTH not like", value, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthIn(List<String> values) {
            addCriterion("YEARMONTH in", values, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthNotIn(List<String> values) {
            addCriterion("YEARMONTH not in", values, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthBetween(String value1, String value2) {
            addCriterion("YEARMONTH between", value1, value2, "yearmonth");
            return (Criteria) this;
        }

        public Criteria andYearmonthNotBetween(String value1, String value2) {
            addCriterion("YEARMONTH not between", value1, value2, "yearmonth");
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

        public Criteria andExplanationIsNull() {
            addCriterion("EXPLANATION is null");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNotNull() {
            addCriterion("EXPLANATION is not null");
            return (Criteria) this;
        }

        public Criteria andExplanationEqualTo(String value) {
            addCriterion("EXPLANATION =", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotEqualTo(String value) {
            addCriterion("EXPLANATION <>", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThan(String value) {
            addCriterion("EXPLANATION >", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLANATION >=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThan(String value) {
            addCriterion("EXPLANATION <", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThanOrEqualTo(String value) {
            addCriterion("EXPLANATION <=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLike(String value) {
            addCriterion("EXPLANATION like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotLike(String value) {
            addCriterion("EXPLANATION not like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationIn(List<String> values) {
            addCriterion("EXPLANATION in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotIn(List<String> values) {
            addCriterion("EXPLANATION not in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationBetween(String value1, String value2) {
            addCriterion("EXPLANATION between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotBetween(String value1, String value2) {
            addCriterion("EXPLANATION not between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andDebitamountIsNull() {
            addCriterion("DEBITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDebitamountIsNotNull() {
            addCriterion("DEBITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDebitamountEqualTo(BigDecimal value) {
            addCriterion("DEBITAMOUNT =", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountNotEqualTo(BigDecimal value) {
            addCriterion("DEBITAMOUNT <>", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountGreaterThan(BigDecimal value) {
            addCriterion("DEBITAMOUNT >", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEBITAMOUNT >=", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountLessThan(BigDecimal value) {
            addCriterion("DEBITAMOUNT <", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEBITAMOUNT <=", value, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountIn(List<BigDecimal> values) {
            addCriterion("DEBITAMOUNT in", values, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountNotIn(List<BigDecimal> values) {
            addCriterion("DEBITAMOUNT not in", values, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEBITAMOUNT between", value1, value2, "debitamount");
            return (Criteria) this;
        }

        public Criteria andDebitamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEBITAMOUNT not between", value1, value2, "debitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountIsNull() {
            addCriterion("LOCALDEBITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountIsNotNull() {
            addCriterion("LOCALDEBITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountEqualTo(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT =", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountNotEqualTo(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT <>", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountGreaterThan(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT >", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT >=", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountLessThan(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT <", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCALDEBITAMOUNT <=", value, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountIn(List<BigDecimal> values) {
            addCriterion("LOCALDEBITAMOUNT in", values, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountNotIn(List<BigDecimal> values) {
            addCriterion("LOCALDEBITAMOUNT not in", values, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCALDEBITAMOUNT between", value1, value2, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andLocaldebitamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCALDEBITAMOUNT not between", value1, value2, "localdebitamount");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNull() {
            addCriterion("PK_CURRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNotNull() {
            addCriterion("PK_CURRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeEqualTo(String value) {
            addCriterion("PK_CURRTYPE =", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotEqualTo(String value) {
            addCriterion("PK_CURRTYPE <>", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThan(String value) {
            addCriterion("PK_CURRTYPE >", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE >=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThan(String value) {
            addCriterion("PK_CURRTYPE <", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE <=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLike(String value) {
            addCriterion("PK_CURRTYPE like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotLike(String value) {
            addCriterion("PK_CURRTYPE not like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIn(List<String> values) {
            addCriterion("PK_CURRTYPE in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotIn(List<String> values) {
            addCriterion("PK_CURRTYPE not in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE not between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaIsNull() {
            addCriterion("PK_ACCASOA is null");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaIsNotNull() {
            addCriterion("PK_ACCASOA is not null");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaEqualTo(String value) {
            addCriterion("PK_ACCASOA =", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaNotEqualTo(String value) {
            addCriterion("PK_ACCASOA <>", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaGreaterThan(String value) {
            addCriterion("PK_ACCASOA >", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ACCASOA >=", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaLessThan(String value) {
            addCriterion("PK_ACCASOA <", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaLessThanOrEqualTo(String value) {
            addCriterion("PK_ACCASOA <=", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaLike(String value) {
            addCriterion("PK_ACCASOA like", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaNotLike(String value) {
            addCriterion("PK_ACCASOA not like", value, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaIn(List<String> values) {
            addCriterion("PK_ACCASOA in", values, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaNotIn(List<String> values) {
            addCriterion("PK_ACCASOA not in", values, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaBetween(String value1, String value2) {
            addCriterion("PK_ACCASOA between", value1, value2, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andPkAccasoaNotBetween(String value1, String value2) {
            addCriterion("PK_ACCASOA not between", value1, value2, "pkAccasoa");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNull() {
            addCriterion("CREDITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNotNull() {
            addCriterion("CREDITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditamountEqualTo(BigDecimal value) {
            addCriterion("CREDITAMOUNT =", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotEqualTo(BigDecimal value) {
            addCriterion("CREDITAMOUNT <>", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThan(BigDecimal value) {
            addCriterion("CREDITAMOUNT >", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITAMOUNT >=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThan(BigDecimal value) {
            addCriterion("CREDITAMOUNT <", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITAMOUNT <=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountIn(List<BigDecimal> values) {
            addCriterion("CREDITAMOUNT in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotIn(List<BigDecimal> values) {
            addCriterion("CREDITAMOUNT not in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITAMOUNT between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITAMOUNT not between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountIsNull() {
            addCriterion("LOCALCREDITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountIsNotNull() {
            addCriterion("LOCALCREDITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountEqualTo(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT =", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountNotEqualTo(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT <>", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountGreaterThan(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT >", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT >=", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountLessThan(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT <", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCALCREDITAMOUNT <=", value, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountIn(List<BigDecimal> values) {
            addCriterion("LOCALCREDITAMOUNT in", values, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountNotIn(List<BigDecimal> values) {
            addCriterion("LOCALCREDITAMOUNT not in", values, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCALCREDITAMOUNT between", value1, value2, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andLocalcreditamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCALCREDITAMOUNT not between", value1, value2, "localcreditamount");
            return (Criteria) this;
        }

        public Criteria andFreevalue1IsNull() {
            addCriterion("FREEVALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue1IsNotNull() {
            addCriterion("FREEVALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue1EqualTo(String value) {
            addCriterion("FREEVALUE1 =", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1NotEqualTo(String value) {
            addCriterion("FREEVALUE1 <>", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1GreaterThan(String value) {
            addCriterion("FREEVALUE1 >", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE1 >=", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1LessThan(String value) {
            addCriterion("FREEVALUE1 <", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE1 <=", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1Like(String value) {
            addCriterion("FREEVALUE1 like", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1NotLike(String value) {
            addCriterion("FREEVALUE1 not like", value, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1In(List<String> values) {
            addCriterion("FREEVALUE1 in", values, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1NotIn(List<String> values) {
            addCriterion("FREEVALUE1 not in", values, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1Between(String value1, String value2) {
            addCriterion("FREEVALUE1 between", value1, value2, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue1NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE1 not between", value1, value2, "freevalue1");
            return (Criteria) this;
        }

        public Criteria andFreevalue2IsNull() {
            addCriterion("FREEVALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue2IsNotNull() {
            addCriterion("FREEVALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue2EqualTo(String value) {
            addCriterion("FREEVALUE2 =", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2NotEqualTo(String value) {
            addCriterion("FREEVALUE2 <>", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2GreaterThan(String value) {
            addCriterion("FREEVALUE2 >", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE2 >=", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2LessThan(String value) {
            addCriterion("FREEVALUE2 <", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE2 <=", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2Like(String value) {
            addCriterion("FREEVALUE2 like", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2NotLike(String value) {
            addCriterion("FREEVALUE2 not like", value, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2In(List<String> values) {
            addCriterion("FREEVALUE2 in", values, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2NotIn(List<String> values) {
            addCriterion("FREEVALUE2 not in", values, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2Between(String value1, String value2) {
            addCriterion("FREEVALUE2 between", value1, value2, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue2NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE2 not between", value1, value2, "freevalue2");
            return (Criteria) this;
        }

        public Criteria andFreevalue3IsNull() {
            addCriterion("FREEVALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue3IsNotNull() {
            addCriterion("FREEVALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue3EqualTo(String value) {
            addCriterion("FREEVALUE3 =", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3NotEqualTo(String value) {
            addCriterion("FREEVALUE3 <>", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3GreaterThan(String value) {
            addCriterion("FREEVALUE3 >", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE3 >=", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3LessThan(String value) {
            addCriterion("FREEVALUE3 <", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE3 <=", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3Like(String value) {
            addCriterion("FREEVALUE3 like", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3NotLike(String value) {
            addCriterion("FREEVALUE3 not like", value, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3In(List<String> values) {
            addCriterion("FREEVALUE3 in", values, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3NotIn(List<String> values) {
            addCriterion("FREEVALUE3 not in", values, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3Between(String value1, String value2) {
            addCriterion("FREEVALUE3 between", value1, value2, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue3NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE3 not between", value1, value2, "freevalue3");
            return (Criteria) this;
        }

        public Criteria andFreevalue4IsNull() {
            addCriterion("FREEVALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue4IsNotNull() {
            addCriterion("FREEVALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue4EqualTo(String value) {
            addCriterion("FREEVALUE4 =", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4NotEqualTo(String value) {
            addCriterion("FREEVALUE4 <>", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4GreaterThan(String value) {
            addCriterion("FREEVALUE4 >", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE4 >=", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4LessThan(String value) {
            addCriterion("FREEVALUE4 <", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE4 <=", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4Like(String value) {
            addCriterion("FREEVALUE4 like", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4NotLike(String value) {
            addCriterion("FREEVALUE4 not like", value, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4In(List<String> values) {
            addCriterion("FREEVALUE4 in", values, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4NotIn(List<String> values) {
            addCriterion("FREEVALUE4 not in", values, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4Between(String value1, String value2) {
            addCriterion("FREEVALUE4 between", value1, value2, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue4NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE4 not between", value1, value2, "freevalue4");
            return (Criteria) this;
        }

        public Criteria andFreevalue5IsNull() {
            addCriterion("FREEVALUE5 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue5IsNotNull() {
            addCriterion("FREEVALUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue5EqualTo(String value) {
            addCriterion("FREEVALUE5 =", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5NotEqualTo(String value) {
            addCriterion("FREEVALUE5 <>", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5GreaterThan(String value) {
            addCriterion("FREEVALUE5 >", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE5 >=", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5LessThan(String value) {
            addCriterion("FREEVALUE5 <", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE5 <=", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5Like(String value) {
            addCriterion("FREEVALUE5 like", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5NotLike(String value) {
            addCriterion("FREEVALUE5 not like", value, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5In(List<String> values) {
            addCriterion("FREEVALUE5 in", values, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5NotIn(List<String> values) {
            addCriterion("FREEVALUE5 not in", values, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5Between(String value1, String value2) {
            addCriterion("FREEVALUE5 between", value1, value2, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue5NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE5 not between", value1, value2, "freevalue5");
            return (Criteria) this;
        }

        public Criteria andFreevalue6IsNull() {
            addCriterion("FREEVALUE6 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue6IsNotNull() {
            addCriterion("FREEVALUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue6EqualTo(String value) {
            addCriterion("FREEVALUE6 =", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6NotEqualTo(String value) {
            addCriterion("FREEVALUE6 <>", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6GreaterThan(String value) {
            addCriterion("FREEVALUE6 >", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE6 >=", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6LessThan(String value) {
            addCriterion("FREEVALUE6 <", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE6 <=", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6Like(String value) {
            addCriterion("FREEVALUE6 like", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6NotLike(String value) {
            addCriterion("FREEVALUE6 not like", value, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6In(List<String> values) {
            addCriterion("FREEVALUE6 in", values, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6NotIn(List<String> values) {
            addCriterion("FREEVALUE6 not in", values, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6Between(String value1, String value2) {
            addCriterion("FREEVALUE6 between", value1, value2, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue6NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE6 not between", value1, value2, "freevalue6");
            return (Criteria) this;
        }

        public Criteria andFreevalue7IsNull() {
            addCriterion("FREEVALUE7 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue7IsNotNull() {
            addCriterion("FREEVALUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue7EqualTo(String value) {
            addCriterion("FREEVALUE7 =", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7NotEqualTo(String value) {
            addCriterion("FREEVALUE7 <>", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7GreaterThan(String value) {
            addCriterion("FREEVALUE7 >", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE7 >=", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7LessThan(String value) {
            addCriterion("FREEVALUE7 <", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE7 <=", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7Like(String value) {
            addCriterion("FREEVALUE7 like", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7NotLike(String value) {
            addCriterion("FREEVALUE7 not like", value, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7In(List<String> values) {
            addCriterion("FREEVALUE7 in", values, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7NotIn(List<String> values) {
            addCriterion("FREEVALUE7 not in", values, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7Between(String value1, String value2) {
            addCriterion("FREEVALUE7 between", value1, value2, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue7NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE7 not between", value1, value2, "freevalue7");
            return (Criteria) this;
        }

        public Criteria andFreevalue8IsNull() {
            addCriterion("FREEVALUE8 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue8IsNotNull() {
            addCriterion("FREEVALUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue8EqualTo(String value) {
            addCriterion("FREEVALUE8 =", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8NotEqualTo(String value) {
            addCriterion("FREEVALUE8 <>", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8GreaterThan(String value) {
            addCriterion("FREEVALUE8 >", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE8 >=", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8LessThan(String value) {
            addCriterion("FREEVALUE8 <", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE8 <=", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8Like(String value) {
            addCriterion("FREEVALUE8 like", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8NotLike(String value) {
            addCriterion("FREEVALUE8 not like", value, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8In(List<String> values) {
            addCriterion("FREEVALUE8 in", values, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8NotIn(List<String> values) {
            addCriterion("FREEVALUE8 not in", values, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8Between(String value1, String value2) {
            addCriterion("FREEVALUE8 between", value1, value2, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue8NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE8 not between", value1, value2, "freevalue8");
            return (Criteria) this;
        }

        public Criteria andFreevalue9IsNull() {
            addCriterion("FREEVALUE9 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue9IsNotNull() {
            addCriterion("FREEVALUE9 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue9EqualTo(String value) {
            addCriterion("FREEVALUE9 =", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9NotEqualTo(String value) {
            addCriterion("FREEVALUE9 <>", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9GreaterThan(String value) {
            addCriterion("FREEVALUE9 >", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE9 >=", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9LessThan(String value) {
            addCriterion("FREEVALUE9 <", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE9 <=", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9Like(String value) {
            addCriterion("FREEVALUE9 like", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9NotLike(String value) {
            addCriterion("FREEVALUE9 not like", value, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9In(List<String> values) {
            addCriterion("FREEVALUE9 in", values, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9NotIn(List<String> values) {
            addCriterion("FREEVALUE9 not in", values, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9Between(String value1, String value2) {
            addCriterion("FREEVALUE9 between", value1, value2, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue9NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE9 not between", value1, value2, "freevalue9");
            return (Criteria) this;
        }

        public Criteria andFreevalue10IsNull() {
            addCriterion("FREEVALUE10 is null");
            return (Criteria) this;
        }

        public Criteria andFreevalue10IsNotNull() {
            addCriterion("FREEVALUE10 is not null");
            return (Criteria) this;
        }

        public Criteria andFreevalue10EqualTo(String value) {
            addCriterion("FREEVALUE10 =", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10NotEqualTo(String value) {
            addCriterion("FREEVALUE10 <>", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10GreaterThan(String value) {
            addCriterion("FREEVALUE10 >", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10GreaterThanOrEqualTo(String value) {
            addCriterion("FREEVALUE10 >=", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10LessThan(String value) {
            addCriterion("FREEVALUE10 <", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10LessThanOrEqualTo(String value) {
            addCriterion("FREEVALUE10 <=", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10Like(String value) {
            addCriterion("FREEVALUE10 like", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10NotLike(String value) {
            addCriterion("FREEVALUE10 not like", value, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10In(List<String> values) {
            addCriterion("FREEVALUE10 in", values, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10NotIn(List<String> values) {
            addCriterion("FREEVALUE10 not in", values, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10Between(String value1, String value2) {
            addCriterion("FREEVALUE10 between", value1, value2, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andFreevalue10NotBetween(String value1, String value2) {
            addCriterion("FREEVALUE10 not between", value1, value2, "freevalue10");
            return (Criteria) this;
        }

        public Criteria andExcrate1IsNull() {
            addCriterion("EXCRATE1 is null");
            return (Criteria) this;
        }

        public Criteria andExcrate1IsNotNull() {
            addCriterion("EXCRATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andExcrate1EqualTo(BigDecimal value) {
            addCriterion("EXCRATE1 =", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1NotEqualTo(BigDecimal value) {
            addCriterion("EXCRATE1 <>", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1GreaterThan(BigDecimal value) {
            addCriterion("EXCRATE1 >", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCRATE1 >=", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1LessThan(BigDecimal value) {
            addCriterion("EXCRATE1 <", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCRATE1 <=", value, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1In(List<BigDecimal> values) {
            addCriterion("EXCRATE1 in", values, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1NotIn(List<BigDecimal> values) {
            addCriterion("EXCRATE1 not in", values, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCRATE1 between", value1, value2, "excrate1");
            return (Criteria) this;
        }

        public Criteria andExcrate1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCRATE1 not between", value1, value2, "excrate1");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : hicmi_mid_acc_sub
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
     * @Table : hicmi_mid_acc_sub
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