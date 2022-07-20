package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmQuerycontrolTdExample {
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
    public MmQuerycontrolTdExample() {
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
     * @Table : mm_querycontrol_td
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

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(Long value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(Long value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(Long value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(Long value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(Long value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<Long> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<Long> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(Long value1, Long value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(Long value1, Long value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIsNull() {
            addCriterion("TASKCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIsNotNull() {
            addCriterion("TASKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeEqualTo(String value) {
            addCriterion("TASKCODE =", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotEqualTo(String value) {
            addCriterion("TASKCODE <>", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThan(String value) {
            addCriterion("TASKCODE >", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCODE >=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThan(String value) {
            addCriterion("TASKCODE <", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThanOrEqualTo(String value) {
            addCriterion("TASKCODE <=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLike(String value) {
            addCriterion("TASKCODE like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotLike(String value) {
            addCriterion("TASKCODE not like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIn(List<String> values) {
            addCriterion("TASKCODE in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotIn(List<String> values) {
            addCriterion("TASKCODE not in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeBetween(String value1, String value2) {
            addCriterion("TASKCODE between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotBetween(String value1, String value2) {
            addCriterion("TASKCODE not between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("APPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("APPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("APPLYTIME =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("APPLYTIME <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("APPLYTIME >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYTIME >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("APPLYTIME <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLYTIME <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("APPLYTIME in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("APPLYTIME not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("APPLYTIME between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLYTIME not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNull() {
            addCriterion("FINISHEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNotNull() {
            addCriterion("FINISHEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeEqualTo(Date value) {
            addCriterion("FINISHEDTIME =", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotEqualTo(Date value) {
            addCriterion("FINISHEDTIME <>", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThan(Date value) {
            addCriterion("FINISHEDTIME >", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISHEDTIME >=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThan(Date value) {
            addCriterion("FINISHEDTIME <", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISHEDTIME <=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIn(List<Date> values) {
            addCriterion("FINISHEDTIME in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotIn(List<Date> values) {
            addCriterion("FINISHEDTIME not in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeBetween(Date value1, Date value2) {
            addCriterion("FINISHEDTIME between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISHEDTIME not between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("RESULTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("RESULTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResulttypeEqualTo(Short value) {
            addCriterion("RESULTTYPE =", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotEqualTo(Short value) {
            addCriterion("RESULTTYPE <>", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThan(Short value) {
            addCriterion("RESULTTYPE >", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(Short value) {
            addCriterion("RESULTTYPE >=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThan(Short value) {
            addCriterion("RESULTTYPE <", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(Short value) {
            addCriterion("RESULTTYPE <=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeIn(List<Short> values) {
            addCriterion("RESULTTYPE in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotIn(List<Short> values) {
            addCriterion("RESULTTYPE not in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeBetween(Short value1, Short value2) {
            addCriterion("RESULTTYPE between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotBetween(Short value1, Short value2) {
            addCriterion("RESULTTYPE not between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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

        public Criteria andParamIsNull() {
            addCriterion("PARAM is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("PARAM =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("PARAM <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("PARAM >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("PARAM <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("PARAM <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("PARAM like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("PARAM not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("PARAM in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("PARAM not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("PARAM between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("PARAM not between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andPriIsNull() {
            addCriterion("PRI is null");
            return (Criteria) this;
        }

        public Criteria andPriIsNotNull() {
            addCriterion("PRI is not null");
            return (Criteria) this;
        }

        public Criteria andPriEqualTo(Long value) {
            addCriterion("PRI =", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotEqualTo(Long value) {
            addCriterion("PRI <>", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThan(Long value) {
            addCriterion("PRI >", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThanOrEqualTo(Long value) {
            addCriterion("PRI >=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThan(Long value) {
            addCriterion("PRI <", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThanOrEqualTo(Long value) {
            addCriterion("PRI <=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriIn(List<Long> values) {
            addCriterion("PRI in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotIn(List<Long> values) {
            addCriterion("PRI not in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriBetween(Long value1, Long value2) {
            addCriterion("PRI between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotBetween(Long value1, Long value2) {
            addCriterion("PRI not between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andAgainnumIsNull() {
            addCriterion("AGAINNUM is null");
            return (Criteria) this;
        }

        public Criteria andAgainnumIsNotNull() {
            addCriterion("AGAINNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAgainnumEqualTo(Long value) {
            addCriterion("AGAINNUM =", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumNotEqualTo(Long value) {
            addCriterion("AGAINNUM <>", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumGreaterThan(Long value) {
            addCriterion("AGAINNUM >", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumGreaterThanOrEqualTo(Long value) {
            addCriterion("AGAINNUM >=", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumLessThan(Long value) {
            addCriterion("AGAINNUM <", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumLessThanOrEqualTo(Long value) {
            addCriterion("AGAINNUM <=", value, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumIn(List<Long> values) {
            addCriterion("AGAINNUM in", values, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumNotIn(List<Long> values) {
            addCriterion("AGAINNUM not in", values, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumBetween(Long value1, Long value2) {
            addCriterion("AGAINNUM between", value1, value2, "againnum");
            return (Criteria) this;
        }

        public Criteria andAgainnumNotBetween(Long value1, Long value2) {
            addCriterion("AGAINNUM not between", value1, value2, "againnum");
            return (Criteria) this;
        }

        public Criteria andModenameIsNull() {
            addCriterion("MODENAME is null");
            return (Criteria) this;
        }

        public Criteria andModenameIsNotNull() {
            addCriterion("MODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andModenameEqualTo(String value) {
            addCriterion("MODENAME =", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotEqualTo(String value) {
            addCriterion("MODENAME <>", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThan(String value) {
            addCriterion("MODENAME >", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThanOrEqualTo(String value) {
            addCriterion("MODENAME >=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThan(String value) {
            addCriterion("MODENAME <", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThanOrEqualTo(String value) {
            addCriterion("MODENAME <=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLike(String value) {
            addCriterion("MODENAME like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotLike(String value) {
            addCriterion("MODENAME not like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameIn(List<String> values) {
            addCriterion("MODENAME in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotIn(List<String> values) {
            addCriterion("MODENAME not in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameBetween(String value1, String value2) {
            addCriterion("MODENAME between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotBetween(String value1, String value2) {
            addCriterion("MODENAME not between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andSqlstrIsNull() {
            addCriterion("SQLSTR is null");
            return (Criteria) this;
        }

        public Criteria andSqlstrIsNotNull() {
            addCriterion("SQLSTR is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstrEqualTo(String value) {
            addCriterion("SQLSTR =", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotEqualTo(String value) {
            addCriterion("SQLSTR <>", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrGreaterThan(String value) {
            addCriterion("SQLSTR >", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrGreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR >=", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLessThan(String value) {
            addCriterion("SQLSTR <", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLessThanOrEqualTo(String value) {
            addCriterion("SQLSTR <=", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrLike(String value) {
            addCriterion("SQLSTR like", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotLike(String value) {
            addCriterion("SQLSTR not like", value, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrIn(List<String> values) {
            addCriterion("SQLSTR in", values, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotIn(List<String> values) {
            addCriterion("SQLSTR not in", values, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrBetween(String value1, String value2) {
            addCriterion("SQLSTR between", value1, value2, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andSqlstrNotBetween(String value1, String value2) {
            addCriterion("SQLSTR not between", value1, value2, "sqlstr");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNull() {
            addCriterion("FIELDNAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("FIELDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("FIELDNAME =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("FIELDNAME <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("FIELDNAME >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELDNAME >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("FIELDNAME <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("FIELDNAME <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("FIELDNAME like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("FIELDNAME not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("FIELDNAME in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("FIELDNAME not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("FIELDNAME between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("FIELDNAME not between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andSqlstr1IsNull() {
            addCriterion("SQLSTR1 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr1IsNotNull() {
            addCriterion("SQLSTR1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr1EqualTo(String value) {
            addCriterion("SQLSTR1 =", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1NotEqualTo(String value) {
            addCriterion("SQLSTR1 <>", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1GreaterThan(String value) {
            addCriterion("SQLSTR1 >", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR1 >=", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1LessThan(String value) {
            addCriterion("SQLSTR1 <", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR1 <=", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1Like(String value) {
            addCriterion("SQLSTR1 like", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1NotLike(String value) {
            addCriterion("SQLSTR1 not like", value, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1In(List<String> values) {
            addCriterion("SQLSTR1 in", values, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1NotIn(List<String> values) {
            addCriterion("SQLSTR1 not in", values, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1Between(String value1, String value2) {
            addCriterion("SQLSTR1 between", value1, value2, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr1NotBetween(String value1, String value2) {
            addCriterion("SQLSTR1 not between", value1, value2, "sqlstr1");
            return (Criteria) this;
        }

        public Criteria andSqlstr2IsNull() {
            addCriterion("SQLSTR2 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr2IsNotNull() {
            addCriterion("SQLSTR2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr2EqualTo(String value) {
            addCriterion("SQLSTR2 =", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2NotEqualTo(String value) {
            addCriterion("SQLSTR2 <>", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2GreaterThan(String value) {
            addCriterion("SQLSTR2 >", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR2 >=", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2LessThan(String value) {
            addCriterion("SQLSTR2 <", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR2 <=", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2Like(String value) {
            addCriterion("SQLSTR2 like", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2NotLike(String value) {
            addCriterion("SQLSTR2 not like", value, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2In(List<String> values) {
            addCriterion("SQLSTR2 in", values, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2NotIn(List<String> values) {
            addCriterion("SQLSTR2 not in", values, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2Between(String value1, String value2) {
            addCriterion("SQLSTR2 between", value1, value2, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr2NotBetween(String value1, String value2) {
            addCriterion("SQLSTR2 not between", value1, value2, "sqlstr2");
            return (Criteria) this;
        }

        public Criteria andSqlstr3IsNull() {
            addCriterion("SQLSTR3 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr3IsNotNull() {
            addCriterion("SQLSTR3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr3EqualTo(String value) {
            addCriterion("SQLSTR3 =", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3NotEqualTo(String value) {
            addCriterion("SQLSTR3 <>", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3GreaterThan(String value) {
            addCriterion("SQLSTR3 >", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR3 >=", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3LessThan(String value) {
            addCriterion("SQLSTR3 <", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR3 <=", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3Like(String value) {
            addCriterion("SQLSTR3 like", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3NotLike(String value) {
            addCriterion("SQLSTR3 not like", value, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3In(List<String> values) {
            addCriterion("SQLSTR3 in", values, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3NotIn(List<String> values) {
            addCriterion("SQLSTR3 not in", values, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3Between(String value1, String value2) {
            addCriterion("SQLSTR3 between", value1, value2, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr3NotBetween(String value1, String value2) {
            addCriterion("SQLSTR3 not between", value1, value2, "sqlstr3");
            return (Criteria) this;
        }

        public Criteria andSqlstr4IsNull() {
            addCriterion("SQLSTR4 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr4IsNotNull() {
            addCriterion("SQLSTR4 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr4EqualTo(String value) {
            addCriterion("SQLSTR4 =", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4NotEqualTo(String value) {
            addCriterion("SQLSTR4 <>", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4GreaterThan(String value) {
            addCriterion("SQLSTR4 >", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR4 >=", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4LessThan(String value) {
            addCriterion("SQLSTR4 <", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR4 <=", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4Like(String value) {
            addCriterion("SQLSTR4 like", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4NotLike(String value) {
            addCriterion("SQLSTR4 not like", value, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4In(List<String> values) {
            addCriterion("SQLSTR4 in", values, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4NotIn(List<String> values) {
            addCriterion("SQLSTR4 not in", values, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4Between(String value1, String value2) {
            addCriterion("SQLSTR4 between", value1, value2, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr4NotBetween(String value1, String value2) {
            addCriterion("SQLSTR4 not between", value1, value2, "sqlstr4");
            return (Criteria) this;
        }

        public Criteria andSqlstr5IsNull() {
            addCriterion("SQLSTR5 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr5IsNotNull() {
            addCriterion("SQLSTR5 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr5EqualTo(String value) {
            addCriterion("SQLSTR5 =", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5NotEqualTo(String value) {
            addCriterion("SQLSTR5 <>", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5GreaterThan(String value) {
            addCriterion("SQLSTR5 >", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR5 >=", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5LessThan(String value) {
            addCriterion("SQLSTR5 <", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR5 <=", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5Like(String value) {
            addCriterion("SQLSTR5 like", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5NotLike(String value) {
            addCriterion("SQLSTR5 not like", value, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5In(List<String> values) {
            addCriterion("SQLSTR5 in", values, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5NotIn(List<String> values) {
            addCriterion("SQLSTR5 not in", values, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5Between(String value1, String value2) {
            addCriterion("SQLSTR5 between", value1, value2, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr5NotBetween(String value1, String value2) {
            addCriterion("SQLSTR5 not between", value1, value2, "sqlstr5");
            return (Criteria) this;
        }

        public Criteria andSqlstr6IsNull() {
            addCriterion("SQLSTR6 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr6IsNotNull() {
            addCriterion("SQLSTR6 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr6EqualTo(String value) {
            addCriterion("SQLSTR6 =", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6NotEqualTo(String value) {
            addCriterion("SQLSTR6 <>", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6GreaterThan(String value) {
            addCriterion("SQLSTR6 >", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR6 >=", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6LessThan(String value) {
            addCriterion("SQLSTR6 <", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR6 <=", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6Like(String value) {
            addCriterion("SQLSTR6 like", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6NotLike(String value) {
            addCriterion("SQLSTR6 not like", value, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6In(List<String> values) {
            addCriterion("SQLSTR6 in", values, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6NotIn(List<String> values) {
            addCriterion("SQLSTR6 not in", values, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6Between(String value1, String value2) {
            addCriterion("SQLSTR6 between", value1, value2, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr6NotBetween(String value1, String value2) {
            addCriterion("SQLSTR6 not between", value1, value2, "sqlstr6");
            return (Criteria) this;
        }

        public Criteria andSqlstr7IsNull() {
            addCriterion("SQLSTR7 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr7IsNotNull() {
            addCriterion("SQLSTR7 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr7EqualTo(String value) {
            addCriterion("SQLSTR7 =", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7NotEqualTo(String value) {
            addCriterion("SQLSTR7 <>", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7GreaterThan(String value) {
            addCriterion("SQLSTR7 >", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR7 >=", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7LessThan(String value) {
            addCriterion("SQLSTR7 <", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR7 <=", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7Like(String value) {
            addCriterion("SQLSTR7 like", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7NotLike(String value) {
            addCriterion("SQLSTR7 not like", value, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7In(List<String> values) {
            addCriterion("SQLSTR7 in", values, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7NotIn(List<String> values) {
            addCriterion("SQLSTR7 not in", values, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7Between(String value1, String value2) {
            addCriterion("SQLSTR7 between", value1, value2, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr7NotBetween(String value1, String value2) {
            addCriterion("SQLSTR7 not between", value1, value2, "sqlstr7");
            return (Criteria) this;
        }

        public Criteria andSqlstr8IsNull() {
            addCriterion("SQLSTR8 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr8IsNotNull() {
            addCriterion("SQLSTR8 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr8EqualTo(String value) {
            addCriterion("SQLSTR8 =", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8NotEqualTo(String value) {
            addCriterion("SQLSTR8 <>", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8GreaterThan(String value) {
            addCriterion("SQLSTR8 >", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR8 >=", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8LessThan(String value) {
            addCriterion("SQLSTR8 <", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR8 <=", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8Like(String value) {
            addCriterion("SQLSTR8 like", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8NotLike(String value) {
            addCriterion("SQLSTR8 not like", value, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8In(List<String> values) {
            addCriterion("SQLSTR8 in", values, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8NotIn(List<String> values) {
            addCriterion("SQLSTR8 not in", values, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8Between(String value1, String value2) {
            addCriterion("SQLSTR8 between", value1, value2, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr8NotBetween(String value1, String value2) {
            addCriterion("SQLSTR8 not between", value1, value2, "sqlstr8");
            return (Criteria) this;
        }

        public Criteria andSqlstr9IsNull() {
            addCriterion("SQLSTR9 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr9IsNotNull() {
            addCriterion("SQLSTR9 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr9EqualTo(String value) {
            addCriterion("SQLSTR9 =", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9NotEqualTo(String value) {
            addCriterion("SQLSTR9 <>", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9GreaterThan(String value) {
            addCriterion("SQLSTR9 >", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR9 >=", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9LessThan(String value) {
            addCriterion("SQLSTR9 <", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR9 <=", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9Like(String value) {
            addCriterion("SQLSTR9 like", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9NotLike(String value) {
            addCriterion("SQLSTR9 not like", value, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9In(List<String> values) {
            addCriterion("SQLSTR9 in", values, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9NotIn(List<String> values) {
            addCriterion("SQLSTR9 not in", values, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9Between(String value1, String value2) {
            addCriterion("SQLSTR9 between", value1, value2, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr9NotBetween(String value1, String value2) {
            addCriterion("SQLSTR9 not between", value1, value2, "sqlstr9");
            return (Criteria) this;
        }

        public Criteria andSqlstr10IsNull() {
            addCriterion("SQLSTR10 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr10IsNotNull() {
            addCriterion("SQLSTR10 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr10EqualTo(String value) {
            addCriterion("SQLSTR10 =", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10NotEqualTo(String value) {
            addCriterion("SQLSTR10 <>", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10GreaterThan(String value) {
            addCriterion("SQLSTR10 >", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR10 >=", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10LessThan(String value) {
            addCriterion("SQLSTR10 <", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR10 <=", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10Like(String value) {
            addCriterion("SQLSTR10 like", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10NotLike(String value) {
            addCriterion("SQLSTR10 not like", value, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10In(List<String> values) {
            addCriterion("SQLSTR10 in", values, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10NotIn(List<String> values) {
            addCriterion("SQLSTR10 not in", values, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10Between(String value1, String value2) {
            addCriterion("SQLSTR10 between", value1, value2, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr10NotBetween(String value1, String value2) {
            addCriterion("SQLSTR10 not between", value1, value2, "sqlstr10");
            return (Criteria) this;
        }

        public Criteria andSqlstr11IsNull() {
            addCriterion("SQLSTR11 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr11IsNotNull() {
            addCriterion("SQLSTR11 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr11EqualTo(String value) {
            addCriterion("SQLSTR11 =", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11NotEqualTo(String value) {
            addCriterion("SQLSTR11 <>", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11GreaterThan(String value) {
            addCriterion("SQLSTR11 >", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR11 >=", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11LessThan(String value) {
            addCriterion("SQLSTR11 <", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR11 <=", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11Like(String value) {
            addCriterion("SQLSTR11 like", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11NotLike(String value) {
            addCriterion("SQLSTR11 not like", value, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11In(List<String> values) {
            addCriterion("SQLSTR11 in", values, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11NotIn(List<String> values) {
            addCriterion("SQLSTR11 not in", values, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11Between(String value1, String value2) {
            addCriterion("SQLSTR11 between", value1, value2, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr11NotBetween(String value1, String value2) {
            addCriterion("SQLSTR11 not between", value1, value2, "sqlstr11");
            return (Criteria) this;
        }

        public Criteria andSqlstr12IsNull() {
            addCriterion("SQLSTR12 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr12IsNotNull() {
            addCriterion("SQLSTR12 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr12EqualTo(String value) {
            addCriterion("SQLSTR12 =", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12NotEqualTo(String value) {
            addCriterion("SQLSTR12 <>", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12GreaterThan(String value) {
            addCriterion("SQLSTR12 >", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR12 >=", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12LessThan(String value) {
            addCriterion("SQLSTR12 <", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR12 <=", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12Like(String value) {
            addCriterion("SQLSTR12 like", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12NotLike(String value) {
            addCriterion("SQLSTR12 not like", value, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12In(List<String> values) {
            addCriterion("SQLSTR12 in", values, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12NotIn(List<String> values) {
            addCriterion("SQLSTR12 not in", values, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12Between(String value1, String value2) {
            addCriterion("SQLSTR12 between", value1, value2, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr12NotBetween(String value1, String value2) {
            addCriterion("SQLSTR12 not between", value1, value2, "sqlstr12");
            return (Criteria) this;
        }

        public Criteria andSqlstr13IsNull() {
            addCriterion("SQLSTR13 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr13IsNotNull() {
            addCriterion("SQLSTR13 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr13EqualTo(String value) {
            addCriterion("SQLSTR13 =", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13NotEqualTo(String value) {
            addCriterion("SQLSTR13 <>", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13GreaterThan(String value) {
            addCriterion("SQLSTR13 >", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR13 >=", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13LessThan(String value) {
            addCriterion("SQLSTR13 <", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR13 <=", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13Like(String value) {
            addCriterion("SQLSTR13 like", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13NotLike(String value) {
            addCriterion("SQLSTR13 not like", value, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13In(List<String> values) {
            addCriterion("SQLSTR13 in", values, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13NotIn(List<String> values) {
            addCriterion("SQLSTR13 not in", values, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13Between(String value1, String value2) {
            addCriterion("SQLSTR13 between", value1, value2, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr13NotBetween(String value1, String value2) {
            addCriterion("SQLSTR13 not between", value1, value2, "sqlstr13");
            return (Criteria) this;
        }

        public Criteria andSqlstr14IsNull() {
            addCriterion("SQLSTR14 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr14IsNotNull() {
            addCriterion("SQLSTR14 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr14EqualTo(String value) {
            addCriterion("SQLSTR14 =", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14NotEqualTo(String value) {
            addCriterion("SQLSTR14 <>", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14GreaterThan(String value) {
            addCriterion("SQLSTR14 >", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR14 >=", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14LessThan(String value) {
            addCriterion("SQLSTR14 <", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR14 <=", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14Like(String value) {
            addCriterion("SQLSTR14 like", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14NotLike(String value) {
            addCriterion("SQLSTR14 not like", value, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14In(List<String> values) {
            addCriterion("SQLSTR14 in", values, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14NotIn(List<String> values) {
            addCriterion("SQLSTR14 not in", values, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14Between(String value1, String value2) {
            addCriterion("SQLSTR14 between", value1, value2, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr14NotBetween(String value1, String value2) {
            addCriterion("SQLSTR14 not between", value1, value2, "sqlstr14");
            return (Criteria) this;
        }

        public Criteria andSqlstr15IsNull() {
            addCriterion("SQLSTR15 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr15IsNotNull() {
            addCriterion("SQLSTR15 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr15EqualTo(String value) {
            addCriterion("SQLSTR15 =", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15NotEqualTo(String value) {
            addCriterion("SQLSTR15 <>", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15GreaterThan(String value) {
            addCriterion("SQLSTR15 >", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR15 >=", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15LessThan(String value) {
            addCriterion("SQLSTR15 <", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR15 <=", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15Like(String value) {
            addCriterion("SQLSTR15 like", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15NotLike(String value) {
            addCriterion("SQLSTR15 not like", value, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15In(List<String> values) {
            addCriterion("SQLSTR15 in", values, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15NotIn(List<String> values) {
            addCriterion("SQLSTR15 not in", values, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15Between(String value1, String value2) {
            addCriterion("SQLSTR15 between", value1, value2, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr15NotBetween(String value1, String value2) {
            addCriterion("SQLSTR15 not between", value1, value2, "sqlstr15");
            return (Criteria) this;
        }

        public Criteria andSqlstr16IsNull() {
            addCriterion("SQLSTR16 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr16IsNotNull() {
            addCriterion("SQLSTR16 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr16EqualTo(String value) {
            addCriterion("SQLSTR16 =", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16NotEqualTo(String value) {
            addCriterion("SQLSTR16 <>", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16GreaterThan(String value) {
            addCriterion("SQLSTR16 >", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR16 >=", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16LessThan(String value) {
            addCriterion("SQLSTR16 <", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR16 <=", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16Like(String value) {
            addCriterion("SQLSTR16 like", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16NotLike(String value) {
            addCriterion("SQLSTR16 not like", value, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16In(List<String> values) {
            addCriterion("SQLSTR16 in", values, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16NotIn(List<String> values) {
            addCriterion("SQLSTR16 not in", values, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16Between(String value1, String value2) {
            addCriterion("SQLSTR16 between", value1, value2, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr16NotBetween(String value1, String value2) {
            addCriterion("SQLSTR16 not between", value1, value2, "sqlstr16");
            return (Criteria) this;
        }

        public Criteria andSqlstr17IsNull() {
            addCriterion("SQLSTR17 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr17IsNotNull() {
            addCriterion("SQLSTR17 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr17EqualTo(String value) {
            addCriterion("SQLSTR17 =", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17NotEqualTo(String value) {
            addCriterion("SQLSTR17 <>", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17GreaterThan(String value) {
            addCriterion("SQLSTR17 >", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR17 >=", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17LessThan(String value) {
            addCriterion("SQLSTR17 <", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR17 <=", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17Like(String value) {
            addCriterion("SQLSTR17 like", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17NotLike(String value) {
            addCriterion("SQLSTR17 not like", value, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17In(List<String> values) {
            addCriterion("SQLSTR17 in", values, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17NotIn(List<String> values) {
            addCriterion("SQLSTR17 not in", values, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17Between(String value1, String value2) {
            addCriterion("SQLSTR17 between", value1, value2, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr17NotBetween(String value1, String value2) {
            addCriterion("SQLSTR17 not between", value1, value2, "sqlstr17");
            return (Criteria) this;
        }

        public Criteria andSqlstr18IsNull() {
            addCriterion("SQLSTR18 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr18IsNotNull() {
            addCriterion("SQLSTR18 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr18EqualTo(String value) {
            addCriterion("SQLSTR18 =", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18NotEqualTo(String value) {
            addCriterion("SQLSTR18 <>", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18GreaterThan(String value) {
            addCriterion("SQLSTR18 >", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR18 >=", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18LessThan(String value) {
            addCriterion("SQLSTR18 <", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR18 <=", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18Like(String value) {
            addCriterion("SQLSTR18 like", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18NotLike(String value) {
            addCriterion("SQLSTR18 not like", value, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18In(List<String> values) {
            addCriterion("SQLSTR18 in", values, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18NotIn(List<String> values) {
            addCriterion("SQLSTR18 not in", values, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18Between(String value1, String value2) {
            addCriterion("SQLSTR18 between", value1, value2, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr18NotBetween(String value1, String value2) {
            addCriterion("SQLSTR18 not between", value1, value2, "sqlstr18");
            return (Criteria) this;
        }

        public Criteria andSqlstr19IsNull() {
            addCriterion("SQLSTR19 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr19IsNotNull() {
            addCriterion("SQLSTR19 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr19EqualTo(String value) {
            addCriterion("SQLSTR19 =", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19NotEqualTo(String value) {
            addCriterion("SQLSTR19 <>", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19GreaterThan(String value) {
            addCriterion("SQLSTR19 >", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR19 >=", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19LessThan(String value) {
            addCriterion("SQLSTR19 <", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR19 <=", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19Like(String value) {
            addCriterion("SQLSTR19 like", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19NotLike(String value) {
            addCriterion("SQLSTR19 not like", value, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19In(List<String> values) {
            addCriterion("SQLSTR19 in", values, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19NotIn(List<String> values) {
            addCriterion("SQLSTR19 not in", values, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19Between(String value1, String value2) {
            addCriterion("SQLSTR19 between", value1, value2, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr19NotBetween(String value1, String value2) {
            addCriterion("SQLSTR19 not between", value1, value2, "sqlstr19");
            return (Criteria) this;
        }

        public Criteria andSqlstr20IsNull() {
            addCriterion("SQLSTR20 is null");
            return (Criteria) this;
        }

        public Criteria andSqlstr20IsNotNull() {
            addCriterion("SQLSTR20 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlstr20EqualTo(String value) {
            addCriterion("SQLSTR20 =", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20NotEqualTo(String value) {
            addCriterion("SQLSTR20 <>", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20GreaterThan(String value) {
            addCriterion("SQLSTR20 >", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20GreaterThanOrEqualTo(String value) {
            addCriterion("SQLSTR20 >=", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20LessThan(String value) {
            addCriterion("SQLSTR20 <", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20LessThanOrEqualTo(String value) {
            addCriterion("SQLSTR20 <=", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20Like(String value) {
            addCriterion("SQLSTR20 like", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20NotLike(String value) {
            addCriterion("SQLSTR20 not like", value, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20In(List<String> values) {
            addCriterion("SQLSTR20 in", values, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20NotIn(List<String> values) {
            addCriterion("SQLSTR20 not in", values, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20Between(String value1, String value2) {
            addCriterion("SQLSTR20 between", value1, value2, "sqlstr20");
            return (Criteria) this;
        }

        public Criteria andSqlstr20NotBetween(String value1, String value2) {
            addCriterion("SQLSTR20 not between", value1, value2, "sqlstr20");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_querycontrol_td
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
     * @Table : mm_querycontrol_td
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