package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPlanModifiedTdExample {
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
    public MmPlanModifiedTdExample() {
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
     * @Table : mm_plan_modified_td
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

        public Criteria andThisseqIsNull() {
            addCriterion("THISSEQ is null");
            return (Criteria) this;
        }

        public Criteria andThisseqIsNotNull() {
            addCriterion("THISSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andThisseqEqualTo(BigDecimal value) {
            addCriterion("THISSEQ =", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotEqualTo(BigDecimal value) {
            addCriterion("THISSEQ <>", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqGreaterThan(BigDecimal value) {
            addCriterion("THISSEQ >", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THISSEQ >=", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqLessThan(BigDecimal value) {
            addCriterion("THISSEQ <", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THISSEQ <=", value, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqIn(List<BigDecimal> values) {
            addCriterion("THISSEQ in", values, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotIn(List<BigDecimal> values) {
            addCriterion("THISSEQ not in", values, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISSEQ between", value1, value2, "thisseq");
            return (Criteria) this;
        }

        public Criteria andThisseqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISSEQ not between", value1, value2, "thisseq");
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

        public Criteria andSeqchargeIsNull() {
            addCriterion("SEQCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNotNull() {
            addCriterion("SEQCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeEqualTo(String value) {
            addCriterion("SEQCHARGE =", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotEqualTo(String value) {
            addCriterion("SEQCHARGE <>", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThan(String value) {
            addCriterion("SEQCHARGE >", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThanOrEqualTo(String value) {
            addCriterion("SEQCHARGE >=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThan(String value) {
            addCriterion("SEQCHARGE <", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThanOrEqualTo(String value) {
            addCriterion("SEQCHARGE <=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLike(String value) {
            addCriterion("SEQCHARGE like", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotLike(String value) {
            addCriterion("SEQCHARGE not like", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIn(List<String> values) {
            addCriterion("SEQCHARGE in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotIn(List<String> values) {
            addCriterion("SEQCHARGE not in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeBetween(String value1, String value2) {
            addCriterion("SEQCHARGE between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotBetween(String value1, String value2) {
            addCriterion("SEQCHARGE not between", value1, value2, "seqcharge");
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

        public Criteria andDatedateIsNull() {
            addCriterion("DATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDatedateIsNotNull() {
            addCriterion("DATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatedateEqualTo(Date value) {
            addCriterion("DATEDATE =", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotEqualTo(Date value) {
            addCriterion("DATEDATE <>", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateGreaterThan(Date value) {
            addCriterion("DATEDATE >", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATEDATE >=", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateLessThan(Date value) {
            addCriterion("DATEDATE <", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateLessThanOrEqualTo(Date value) {
            addCriterion("DATEDATE <=", value, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateIn(List<Date> values) {
            addCriterion("DATEDATE in", values, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotIn(List<Date> values) {
            addCriterion("DATEDATE not in", values, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateBetween(Date value1, Date value2) {
            addCriterion("DATEDATE between", value1, value2, "datedate");
            return (Criteria) this;
        }

        public Criteria andDatedateNotBetween(Date value1, Date value2) {
            addCriterion("DATEDATE not between", value1, value2, "datedate");
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

        public Criteria andSeqpayplanIsNull() {
            addCriterion("SEQPAYPLAN is null");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanIsNotNull() {
            addCriterion("SEQPAYPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanEqualTo(Long value) {
            addCriterion("SEQPAYPLAN =", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanNotEqualTo(Long value) {
            addCriterion("SEQPAYPLAN <>", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanGreaterThan(Long value) {
            addCriterion("SEQPAYPLAN >", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQPAYPLAN >=", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanLessThan(Long value) {
            addCriterion("SEQPAYPLAN <", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanLessThanOrEqualTo(Long value) {
            addCriterion("SEQPAYPLAN <=", value, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanIn(List<Long> values) {
            addCriterion("SEQPAYPLAN in", values, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanNotIn(List<Long> values) {
            addCriterion("SEQPAYPLAN not in", values, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanBetween(Long value1, Long value2) {
            addCriterion("SEQPAYPLAN between", value1, value2, "seqpayplan");
            return (Criteria) this;
        }

        public Criteria andSeqpayplanNotBetween(Long value1, Long value2) {
            addCriterion("SEQPAYPLAN not between", value1, value2, "seqpayplan");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_plan_modified_td
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
     * @Table : mm_plan_modified_td
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