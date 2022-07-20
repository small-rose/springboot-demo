package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtsBackTiExample {
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
    public AtsBackTiExample() {
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
     * @Table : ats_back_ti
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

        public Criteria andTranssourceIsNull() {
            addCriterion("TRANSSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTranssourceIsNotNull() {
            addCriterion("TRANSSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTranssourceEqualTo(String value) {
            addCriterion("TRANSSOURCE =", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceNotEqualTo(String value) {
            addCriterion("TRANSSOURCE <>", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceGreaterThan(String value) {
            addCriterion("TRANSSOURCE >", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSOURCE >=", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceLessThan(String value) {
            addCriterion("TRANSSOURCE <", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceLessThanOrEqualTo(String value) {
            addCriterion("TRANSSOURCE <=", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceLike(String value) {
            addCriterion("TRANSSOURCE like", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceNotLike(String value) {
            addCriterion("TRANSSOURCE not like", value, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceIn(List<String> values) {
            addCriterion("TRANSSOURCE in", values, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceNotIn(List<String> values) {
            addCriterion("TRANSSOURCE not in", values, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceBetween(String value1, String value2) {
            addCriterion("TRANSSOURCE between", value1, value2, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranssourceNotBetween(String value1, String value2) {
            addCriterion("TRANSSOURCE not between", value1, value2, "transsource");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNull() {
            addCriterion("TRANSCODE is null");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNotNull() {
            addCriterion("TRANSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranscodeEqualTo(String value) {
            addCriterion("TRANSCODE =", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotEqualTo(String value) {
            addCriterion("TRANSCODE <>", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThan(String value) {
            addCriterion("TRANSCODE >", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSCODE >=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThan(String value) {
            addCriterion("TRANSCODE <", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSCODE <=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLike(String value) {
            addCriterion("TRANSCODE like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotLike(String value) {
            addCriterion("TRANSCODE not like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeIn(List<String> values) {
            addCriterion("TRANSCODE in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotIn(List<String> values) {
            addCriterion("TRANSCODE not in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeBetween(String value1, String value2) {
            addCriterion("TRANSCODE between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotBetween(String value1, String value2) {
            addCriterion("TRANSCODE not between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(Date value) {
            addCriterion("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(Date value) {
            addCriterion("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(Date value) {
            addCriterion("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(Date value) {
            addCriterion("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<Date> values) {
            addCriterion("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<Date> values) {
            addCriterion("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(Date value1, Date value2) {
            addCriterion("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSDATE not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("TRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("TRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(String value) {
            addCriterion("TRANSTIME =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(String value) {
            addCriterion("TRANSTIME <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(String value) {
            addCriterion("TRANSTIME >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTIME >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(String value) {
            addCriterion("TRANSTIME <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTIME <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLike(String value) {
            addCriterion("TRANSTIME like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotLike(String value) {
            addCriterion("TRANSTIME not like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<String> values) {
            addCriterion("TRANSTIME in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<String> values) {
            addCriterion("TRANSTIME not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(String value1, String value2) {
            addCriterion("TRANSTIME between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(String value1, String value2) {
            addCriterion("TRANSTIME not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTransseqIsNull() {
            addCriterion("TRANSSEQ is null");
            return (Criteria) this;
        }

        public Criteria andTransseqIsNotNull() {
            addCriterion("TRANSSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTransseqEqualTo(String value) {
            addCriterion("TRANSSEQ =", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotEqualTo(String value) {
            addCriterion("TRANSSEQ <>", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThan(String value) {
            addCriterion("TRANSSEQ >", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSEQ >=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThan(String value) {
            addCriterion("TRANSSEQ <", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThanOrEqualTo(String value) {
            addCriterion("TRANSSEQ <=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLike(String value) {
            addCriterion("TRANSSEQ like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotLike(String value) {
            addCriterion("TRANSSEQ not like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqIn(List<String> values) {
            addCriterion("TRANSSEQ in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotIn(List<String> values) {
            addCriterion("TRANSSEQ not in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqBetween(String value1, String value2) {
            addCriterion("TRANSSEQ between", value1, value2, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotBetween(String value1, String value2) {
            addCriterion("TRANSSEQ not between", value1, value2, "transseq");
            return (Criteria) this;
        }

        public Criteria andReqseqidIsNull() {
            addCriterion("REQSEQID is null");
            return (Criteria) this;
        }

        public Criteria andReqseqidIsNotNull() {
            addCriterion("REQSEQID is not null");
            return (Criteria) this;
        }

        public Criteria andReqseqidEqualTo(String value) {
            addCriterion("REQSEQID =", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidNotEqualTo(String value) {
            addCriterion("REQSEQID <>", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidGreaterThan(String value) {
            addCriterion("REQSEQID >", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidGreaterThanOrEqualTo(String value) {
            addCriterion("REQSEQID >=", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidLessThan(String value) {
            addCriterion("REQSEQID <", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidLessThanOrEqualTo(String value) {
            addCriterion("REQSEQID <=", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidLike(String value) {
            addCriterion("REQSEQID like", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidNotLike(String value) {
            addCriterion("REQSEQID not like", value, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidIn(List<String> values) {
            addCriterion("REQSEQID in", values, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidNotIn(List<String> values) {
            addCriterion("REQSEQID not in", values, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidBetween(String value1, String value2) {
            addCriterion("REQSEQID between", value1, value2, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andReqseqidNotBetween(String value1, String value2) {
            addCriterion("REQSEQID not between", value1, value2, "reqseqid");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("BEGINDATE =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("BEGINDATE <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("BEGINDATE >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINDATE >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("BEGINDATE <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("BEGINDATE <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("BEGINDATE in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("BEGINDATE not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("BEGINDATE between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("BEGINDATE not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andReqreserved1IsNull() {
            addCriterion("REQRESERVED1 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved1IsNotNull() {
            addCriterion("REQRESERVED1 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved1EqualTo(String value) {
            addCriterion("REQRESERVED1 =", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1NotEqualTo(String value) {
            addCriterion("REQRESERVED1 <>", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1GreaterThan(String value) {
            addCriterion("REQRESERVED1 >", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED1 >=", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1LessThan(String value) {
            addCriterion("REQRESERVED1 <", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED1 <=", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1Like(String value) {
            addCriterion("REQRESERVED1 like", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1NotLike(String value) {
            addCriterion("REQRESERVED1 not like", value, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1In(List<String> values) {
            addCriterion("REQRESERVED1 in", values, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1NotIn(List<String> values) {
            addCriterion("REQRESERVED1 not in", values, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1Between(String value1, String value2) {
            addCriterion("REQRESERVED1 between", value1, value2, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved1NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED1 not between", value1, value2, "reqreserved1");
            return (Criteria) this;
        }

        public Criteria andReqreserved2IsNull() {
            addCriterion("REQRESERVED2 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved2IsNotNull() {
            addCriterion("REQRESERVED2 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved2EqualTo(String value) {
            addCriterion("REQRESERVED2 =", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2NotEqualTo(String value) {
            addCriterion("REQRESERVED2 <>", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2GreaterThan(String value) {
            addCriterion("REQRESERVED2 >", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED2 >=", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2LessThan(String value) {
            addCriterion("REQRESERVED2 <", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED2 <=", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2Like(String value) {
            addCriterion("REQRESERVED2 like", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2NotLike(String value) {
            addCriterion("REQRESERVED2 not like", value, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2In(List<String> values) {
            addCriterion("REQRESERVED2 in", values, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2NotIn(List<String> values) {
            addCriterion("REQRESERVED2 not in", values, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2Between(String value1, String value2) {
            addCriterion("REQRESERVED2 between", value1, value2, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andReqreserved2NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED2 not between", value1, value2, "reqreserved2");
            return (Criteria) this;
        }

        public Criteria andRdseqIsNull() {
            addCriterion("RDSEQ is null");
            return (Criteria) this;
        }

        public Criteria andRdseqIsNotNull() {
            addCriterion("RDSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRdseqEqualTo(String value) {
            addCriterion("RDSEQ =", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqNotEqualTo(String value) {
            addCriterion("RDSEQ <>", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqGreaterThan(String value) {
            addCriterion("RDSEQ >", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqGreaterThanOrEqualTo(String value) {
            addCriterion("RDSEQ >=", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqLessThan(String value) {
            addCriterion("RDSEQ <", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqLessThanOrEqualTo(String value) {
            addCriterion("RDSEQ <=", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqLike(String value) {
            addCriterion("RDSEQ like", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqNotLike(String value) {
            addCriterion("RDSEQ not like", value, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqIn(List<String> values) {
            addCriterion("RDSEQ in", values, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqNotIn(List<String> values) {
            addCriterion("RDSEQ not in", values, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqBetween(String value1, String value2) {
            addCriterion("RDSEQ between", value1, value2, "rdseq");
            return (Criteria) this;
        }

        public Criteria andRdseqNotBetween(String value1, String value2) {
            addCriterion("RDSEQ not between", value1, value2, "rdseq");
            return (Criteria) this;
        }

        public Criteria andCorpbankIsNull() {
            addCriterion("CORPBANK is null");
            return (Criteria) this;
        }

        public Criteria andCorpbankIsNotNull() {
            addCriterion("CORPBANK is not null");
            return (Criteria) this;
        }

        public Criteria andCorpbankEqualTo(String value) {
            addCriterion("CORPBANK =", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankNotEqualTo(String value) {
            addCriterion("CORPBANK <>", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankGreaterThan(String value) {
            addCriterion("CORPBANK >", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankGreaterThanOrEqualTo(String value) {
            addCriterion("CORPBANK >=", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankLessThan(String value) {
            addCriterion("CORPBANK <", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankLessThanOrEqualTo(String value) {
            addCriterion("CORPBANK <=", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankLike(String value) {
            addCriterion("CORPBANK like", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankNotLike(String value) {
            addCriterion("CORPBANK not like", value, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankIn(List<String> values) {
            addCriterion("CORPBANK in", values, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankNotIn(List<String> values) {
            addCriterion("CORPBANK not in", values, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankBetween(String value1, String value2) {
            addCriterion("CORPBANK between", value1, value2, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpbankNotBetween(String value1, String value2) {
            addCriterion("CORPBANK not between", value1, value2, "corpbank");
            return (Criteria) this;
        }

        public Criteria andCorpactIsNull() {
            addCriterion("CORPACT is null");
            return (Criteria) this;
        }

        public Criteria andCorpactIsNotNull() {
            addCriterion("CORPACT is not null");
            return (Criteria) this;
        }

        public Criteria andCorpactEqualTo(String value) {
            addCriterion("CORPACT =", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactNotEqualTo(String value) {
            addCriterion("CORPACT <>", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactGreaterThan(String value) {
            addCriterion("CORPACT >", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactGreaterThanOrEqualTo(String value) {
            addCriterion("CORPACT >=", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactLessThan(String value) {
            addCriterion("CORPACT <", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactLessThanOrEqualTo(String value) {
            addCriterion("CORPACT <=", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactLike(String value) {
            addCriterion("CORPACT like", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactNotLike(String value) {
            addCriterion("CORPACT not like", value, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactIn(List<String> values) {
            addCriterion("CORPACT in", values, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactNotIn(List<String> values) {
            addCriterion("CORPACT not in", values, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactBetween(String value1, String value2) {
            addCriterion("CORPACT between", value1, value2, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactNotBetween(String value1, String value2) {
            addCriterion("CORPACT not between", value1, value2, "corpact");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectIsNull() {
            addCriterion("CORPACTSUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectIsNotNull() {
            addCriterion("CORPACTSUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectEqualTo(String value) {
            addCriterion("CORPACTSUBJECT =", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectNotEqualTo(String value) {
            addCriterion("CORPACTSUBJECT <>", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectGreaterThan(String value) {
            addCriterion("CORPACTSUBJECT >", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("CORPACTSUBJECT >=", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectLessThan(String value) {
            addCriterion("CORPACTSUBJECT <", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectLessThanOrEqualTo(String value) {
            addCriterion("CORPACTSUBJECT <=", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectLike(String value) {
            addCriterion("CORPACTSUBJECT like", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectNotLike(String value) {
            addCriterion("CORPACTSUBJECT not like", value, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectIn(List<String> values) {
            addCriterion("CORPACTSUBJECT in", values, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectNotIn(List<String> values) {
            addCriterion("CORPACTSUBJECT not in", values, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectBetween(String value1, String value2) {
            addCriterion("CORPACTSUBJECT between", value1, value2, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpactsubjectNotBetween(String value1, String value2) {
            addCriterion("CORPACTSUBJECT not between", value1, value2, "corpactsubject");
            return (Criteria) this;
        }

        public Criteria andCorpentityIsNull() {
            addCriterion("CORPENTITY is null");
            return (Criteria) this;
        }

        public Criteria andCorpentityIsNotNull() {
            addCriterion("CORPENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCorpentityEqualTo(String value) {
            addCriterion("CORPENTITY =", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityNotEqualTo(String value) {
            addCriterion("CORPENTITY <>", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityGreaterThan(String value) {
            addCriterion("CORPENTITY >", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityGreaterThanOrEqualTo(String value) {
            addCriterion("CORPENTITY >=", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityLessThan(String value) {
            addCriterion("CORPENTITY <", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityLessThanOrEqualTo(String value) {
            addCriterion("CORPENTITY <=", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityLike(String value) {
            addCriterion("CORPENTITY like", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityNotLike(String value) {
            addCriterion("CORPENTITY not like", value, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityIn(List<String> values) {
            addCriterion("CORPENTITY in", values, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityNotIn(List<String> values) {
            addCriterion("CORPENTITY not in", values, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityBetween(String value1, String value2) {
            addCriterion("CORPENTITY between", value1, value2, "corpentity");
            return (Criteria) this;
        }

        public Criteria andCorpentityNotBetween(String value1, String value2) {
            addCriterion("CORPENTITY not between", value1, value2, "corpentity");
            return (Criteria) this;
        }

        public Criteria andOppactIsNull() {
            addCriterion("OPPACT is null");
            return (Criteria) this;
        }

        public Criteria andOppactIsNotNull() {
            addCriterion("OPPACT is not null");
            return (Criteria) this;
        }

        public Criteria andOppactEqualTo(String value) {
            addCriterion("OPPACT =", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactNotEqualTo(String value) {
            addCriterion("OPPACT <>", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactGreaterThan(String value) {
            addCriterion("OPPACT >", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactGreaterThanOrEqualTo(String value) {
            addCriterion("OPPACT >=", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactLessThan(String value) {
            addCriterion("OPPACT <", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactLessThanOrEqualTo(String value) {
            addCriterion("OPPACT <=", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactLike(String value) {
            addCriterion("OPPACT like", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactNotLike(String value) {
            addCriterion("OPPACT not like", value, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactIn(List<String> values) {
            addCriterion("OPPACT in", values, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactNotIn(List<String> values) {
            addCriterion("OPPACT not in", values, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactBetween(String value1, String value2) {
            addCriterion("OPPACT between", value1, value2, "oppact");
            return (Criteria) this;
        }

        public Criteria andOppactNotBetween(String value1, String value2) {
            addCriterion("OPPACT not between", value1, value2, "oppact");
            return (Criteria) this;
        }

        public Criteria andTransstateIsNull() {
            addCriterion("TRANSSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTransstateIsNotNull() {
            addCriterion("TRANSSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransstateEqualTo(String value) {
            addCriterion("TRANSSTATE =", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateNotEqualTo(String value) {
            addCriterion("TRANSSTATE <>", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateGreaterThan(String value) {
            addCriterion("TRANSSTATE >", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSTATE >=", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateLessThan(String value) {
            addCriterion("TRANSSTATE <", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateLessThanOrEqualTo(String value) {
            addCriterion("TRANSSTATE <=", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateLike(String value) {
            addCriterion("TRANSSTATE like", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateNotLike(String value) {
            addCriterion("TRANSSTATE not like", value, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateIn(List<String> values) {
            addCriterion("TRANSSTATE in", values, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateNotIn(List<String> values) {
            addCriterion("TRANSSTATE not in", values, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateBetween(String value1, String value2) {
            addCriterion("TRANSSTATE between", value1, value2, "transstate");
            return (Criteria) this;
        }

        public Criteria andTransstateNotBetween(String value1, String value2) {
            addCriterion("TRANSSTATE not between", value1, value2, "transstate");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeIsNull() {
            addCriterion("PAYINFOCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeIsNotNull() {
            addCriterion("PAYINFOCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeEqualTo(String value) {
            addCriterion("PAYINFOCODE =", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeNotEqualTo(String value) {
            addCriterion("PAYINFOCODE <>", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeGreaterThan(String value) {
            addCriterion("PAYINFOCODE >", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYINFOCODE >=", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeLessThan(String value) {
            addCriterion("PAYINFOCODE <", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeLessThanOrEqualTo(String value) {
            addCriterion("PAYINFOCODE <=", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeLike(String value) {
            addCriterion("PAYINFOCODE like", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeNotLike(String value) {
            addCriterion("PAYINFOCODE not like", value, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeIn(List<String> values) {
            addCriterion("PAYINFOCODE in", values, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeNotIn(List<String> values) {
            addCriterion("PAYINFOCODE not in", values, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeBetween(String value1, String value2) {
            addCriterion("PAYINFOCODE between", value1, value2, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfocodeNotBetween(String value1, String value2) {
            addCriterion("PAYINFOCODE not between", value1, value2, "payinfocode");
            return (Criteria) this;
        }

        public Criteria andPayinfoIsNull() {
            addCriterion("PAYINFO is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIsNotNull() {
            addCriterion("PAYINFO is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoEqualTo(String value) {
            addCriterion("PAYINFO =", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotEqualTo(String value) {
            addCriterion("PAYINFO <>", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoGreaterThan(String value) {
            addCriterion("PAYINFO >", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYINFO >=", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLessThan(String value) {
            addCriterion("PAYINFO <", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLessThanOrEqualTo(String value) {
            addCriterion("PAYINFO <=", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLike(String value) {
            addCriterion("PAYINFO like", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotLike(String value) {
            addCriterion("PAYINFO not like", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoIn(List<String> values) {
            addCriterion("PAYINFO in", values, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotIn(List<String> values) {
            addCriterion("PAYINFO not in", values, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoBetween(String value1, String value2) {
            addCriterion("PAYINFO between", value1, value2, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotBetween(String value1, String value2) {
            addCriterion("PAYINFO not between", value1, value2, "payinfo");
            return (Criteria) this;
        }

        public Criteria andFailtypeIsNull() {
            addCriterion("FAILTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFailtypeIsNotNull() {
            addCriterion("FAILTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFailtypeEqualTo(String value) {
            addCriterion("FAILTYPE =", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotEqualTo(String value) {
            addCriterion("FAILTYPE <>", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeGreaterThan(String value) {
            addCriterion("FAILTYPE >", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FAILTYPE >=", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLessThan(String value) {
            addCriterion("FAILTYPE <", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLessThanOrEqualTo(String value) {
            addCriterion("FAILTYPE <=", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLike(String value) {
            addCriterion("FAILTYPE like", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotLike(String value) {
            addCriterion("FAILTYPE not like", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeIn(List<String> values) {
            addCriterion("FAILTYPE in", values, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotIn(List<String> values) {
            addCriterion("FAILTYPE not in", values, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeBetween(String value1, String value2) {
            addCriterion("FAILTYPE between", value1, value2, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotBetween(String value1, String value2) {
            addCriterion("FAILTYPE not between", value1, value2, "failtype");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNull() {
            addCriterion("PAYMADEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNotNull() {
            addCriterion("PAYMADEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateEqualTo(String value) {
            addCriterion("PAYMADEDATE =", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotEqualTo(String value) {
            addCriterion("PAYMADEDATE <>", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThan(String value) {
            addCriterion("PAYMADEDATE >", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMADEDATE >=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThan(String value) {
            addCriterion("PAYMADEDATE <", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThanOrEqualTo(String value) {
            addCriterion("PAYMADEDATE <=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLike(String value) {
            addCriterion("PAYMADEDATE like", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotLike(String value) {
            addCriterion("PAYMADEDATE not like", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIn(List<String> values) {
            addCriterion("PAYMADEDATE in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotIn(List<String> values) {
            addCriterion("PAYMADEDATE not in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateBetween(String value1, String value2) {
            addCriterion("PAYMADEDATE between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotBetween(String value1, String value2) {
            addCriterion("PAYMADEDATE not between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeIsNull() {
            addCriterion("SOURCENOTECODE is null");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeIsNotNull() {
            addCriterion("SOURCENOTECODE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeEqualTo(String value) {
            addCriterion("SOURCENOTECODE =", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeNotEqualTo(String value) {
            addCriterion("SOURCENOTECODE <>", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeGreaterThan(String value) {
            addCriterion("SOURCENOTECODE >", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCENOTECODE >=", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeLessThan(String value) {
            addCriterion("SOURCENOTECODE <", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeLessThanOrEqualTo(String value) {
            addCriterion("SOURCENOTECODE <=", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeLike(String value) {
            addCriterion("SOURCENOTECODE like", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeNotLike(String value) {
            addCriterion("SOURCENOTECODE not like", value, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeIn(List<String> values) {
            addCriterion("SOURCENOTECODE in", values, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeNotIn(List<String> values) {
            addCriterion("SOURCENOTECODE not in", values, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeBetween(String value1, String value2) {
            addCriterion("SOURCENOTECODE between", value1, value2, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andSourcenotecodeNotBetween(String value1, String value2) {
            addCriterion("SOURCENOTECODE not between", value1, value2, "sourcenotecode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeIsNull() {
            addCriterion("PAYMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeIsNotNull() {
            addCriterion("PAYMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeEqualTo(String value) {
            addCriterion("PAYMENTCODE =", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeNotEqualTo(String value) {
            addCriterion("PAYMENTCODE <>", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeGreaterThan(String value) {
            addCriterion("PAYMENTCODE >", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTCODE >=", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeLessThan(String value) {
            addCriterion("PAYMENTCODE <", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTCODE <=", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeLike(String value) {
            addCriterion("PAYMENTCODE like", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeNotLike(String value) {
            addCriterion("PAYMENTCODE not like", value, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeIn(List<String> values) {
            addCriterion("PAYMENTCODE in", values, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeNotIn(List<String> values) {
            addCriterion("PAYMENTCODE not in", values, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeBetween(String value1, String value2) {
            addCriterion("PAYMENTCODE between", value1, value2, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andPaymentcodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENTCODE not between", value1, value2, "paymentcode");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNull() {
            addCriterion("ABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNotNull() {
            addCriterion("ABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractEqualTo(String value) {
            addCriterion("ABSTRACT =", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotEqualTo(String value) {
            addCriterion("ABSTRACT <>", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThan(String value) {
            addCriterion("ABSTRACT >", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("ABSTRACT >=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThan(String value) {
            addCriterion("ABSTRACT <", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThanOrEqualTo(String value) {
            addCriterion("ABSTRACT <=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLike(String value) {
            addCriterion("ABSTRACT like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotLike(String value) {
            addCriterion("ABSTRACT not like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractIn(List<String> values) {
            addCriterion("ABSTRACT in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotIn(List<String> values) {
            addCriterion("ABSTRACT not in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractBetween(String value1, String value2) {
            addCriterion("ABSTRACT between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotBetween(String value1, String value2) {
            addCriterion("ABSTRACT not between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andReqreserved3IsNull() {
            addCriterion("REQRESERVED3 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved3IsNotNull() {
            addCriterion("REQRESERVED3 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved3EqualTo(String value) {
            addCriterion("REQRESERVED3 =", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3NotEqualTo(String value) {
            addCriterion("REQRESERVED3 <>", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3GreaterThan(String value) {
            addCriterion("REQRESERVED3 >", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED3 >=", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3LessThan(String value) {
            addCriterion("REQRESERVED3 <", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED3 <=", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3Like(String value) {
            addCriterion("REQRESERVED3 like", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3NotLike(String value) {
            addCriterion("REQRESERVED3 not like", value, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3In(List<String> values) {
            addCriterion("REQRESERVED3 in", values, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3NotIn(List<String> values) {
            addCriterion("REQRESERVED3 not in", values, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3Between(String value1, String value2) {
            addCriterion("REQRESERVED3 between", value1, value2, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved3NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED3 not between", value1, value2, "reqreserved3");
            return (Criteria) this;
        }

        public Criteria andReqreserved4IsNull() {
            addCriterion("REQRESERVED4 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved4IsNotNull() {
            addCriterion("REQRESERVED4 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved4EqualTo(String value) {
            addCriterion("REQRESERVED4 =", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4NotEqualTo(String value) {
            addCriterion("REQRESERVED4 <>", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4GreaterThan(String value) {
            addCriterion("REQRESERVED4 >", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED4 >=", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4LessThan(String value) {
            addCriterion("REQRESERVED4 <", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED4 <=", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4Like(String value) {
            addCriterion("REQRESERVED4 like", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4NotLike(String value) {
            addCriterion("REQRESERVED4 not like", value, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4In(List<String> values) {
            addCriterion("REQRESERVED4 in", values, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4NotIn(List<String> values) {
            addCriterion("REQRESERVED4 not in", values, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4Between(String value1, String value2) {
            addCriterion("REQRESERVED4 between", value1, value2, "reqreserved4");
            return (Criteria) this;
        }

        public Criteria andReqreserved4NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED4 not between", value1, value2, "reqreserved4");
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

        public Criteria andRtncodeIsNull() {
            addCriterion("RTNCODE is null");
            return (Criteria) this;
        }

        public Criteria andRtncodeIsNotNull() {
            addCriterion("RTNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRtncodeEqualTo(String value) {
            addCriterion("RTNCODE =", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeNotEqualTo(String value) {
            addCriterion("RTNCODE <>", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeGreaterThan(String value) {
            addCriterion("RTNCODE >", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeGreaterThanOrEqualTo(String value) {
            addCriterion("RTNCODE >=", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeLessThan(String value) {
            addCriterion("RTNCODE <", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeLessThanOrEqualTo(String value) {
            addCriterion("RTNCODE <=", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeLike(String value) {
            addCriterion("RTNCODE like", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeNotLike(String value) {
            addCriterion("RTNCODE not like", value, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeIn(List<String> values) {
            addCriterion("RTNCODE in", values, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeNotIn(List<String> values) {
            addCriterion("RTNCODE not in", values, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeBetween(String value1, String value2) {
            addCriterion("RTNCODE between", value1, value2, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtncodeNotBetween(String value1, String value2) {
            addCriterion("RTNCODE not between", value1, value2, "rtncode");
            return (Criteria) this;
        }

        public Criteria andRtnmsgIsNull() {
            addCriterion("RTNMSG is null");
            return (Criteria) this;
        }

        public Criteria andRtnmsgIsNotNull() {
            addCriterion("RTNMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRtnmsgEqualTo(String value) {
            addCriterion("RTNMSG =", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgNotEqualTo(String value) {
            addCriterion("RTNMSG <>", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgGreaterThan(String value) {
            addCriterion("RTNMSG >", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RTNMSG >=", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgLessThan(String value) {
            addCriterion("RTNMSG <", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgLessThanOrEqualTo(String value) {
            addCriterion("RTNMSG <=", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgLike(String value) {
            addCriterion("RTNMSG like", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgNotLike(String value) {
            addCriterion("RTNMSG not like", value, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgIn(List<String> values) {
            addCriterion("RTNMSG in", values, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgNotIn(List<String> values) {
            addCriterion("RTNMSG not in", values, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgBetween(String value1, String value2) {
            addCriterion("RTNMSG between", value1, value2, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andRtnmsgNotBetween(String value1, String value2) {
            addCriterion("RTNMSG not between", value1, value2, "rtnmsg");
            return (Criteria) this;
        }

        public Criteria andBpbatchidIsNull() {
            addCriterion("BPBATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBpbatchidIsNotNull() {
            addCriterion("BPBATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBpbatchidEqualTo(String value) {
            addCriterion("BPBATCHID =", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidNotEqualTo(String value) {
            addCriterion("BPBATCHID <>", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidGreaterThan(String value) {
            addCriterion("BPBATCHID >", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BPBATCHID >=", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidLessThan(String value) {
            addCriterion("BPBATCHID <", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidLessThanOrEqualTo(String value) {
            addCriterion("BPBATCHID <=", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidLike(String value) {
            addCriterion("BPBATCHID like", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidNotLike(String value) {
            addCriterion("BPBATCHID not like", value, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidIn(List<String> values) {
            addCriterion("BPBATCHID in", values, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidNotIn(List<String> values) {
            addCriterion("BPBATCHID not in", values, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidBetween(String value1, String value2) {
            addCriterion("BPBATCHID between", value1, value2, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpbatchidNotBetween(String value1, String value2) {
            addCriterion("BPBATCHID not between", value1, value2, "bpbatchid");
            return (Criteria) this;
        }

        public Criteria andBpstatusIsNull() {
            addCriterion("BPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBpstatusIsNotNull() {
            addCriterion("BPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBpstatusEqualTo(String value) {
            addCriterion("BPSTATUS =", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusNotEqualTo(String value) {
            addCriterion("BPSTATUS <>", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusGreaterThan(String value) {
            addCriterion("BPSTATUS >", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BPSTATUS >=", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusLessThan(String value) {
            addCriterion("BPSTATUS <", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusLessThanOrEqualTo(String value) {
            addCriterion("BPSTATUS <=", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusLike(String value) {
            addCriterion("BPSTATUS like", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusNotLike(String value) {
            addCriterion("BPSTATUS not like", value, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusIn(List<String> values) {
            addCriterion("BPSTATUS in", values, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusNotIn(List<String> values) {
            addCriterion("BPSTATUS not in", values, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusBetween(String value1, String value2) {
            addCriterion("BPSTATUS between", value1, value2, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andBpstatusNotBetween(String value1, String value2) {
            addCriterion("BPSTATUS not between", value1, value2, "bpstatus");
            return (Criteria) this;
        }

        public Criteria andReqreserved5IsNull() {
            addCriterion("REQRESERVED5 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved5IsNotNull() {
            addCriterion("REQRESERVED5 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved5EqualTo(String value) {
            addCriterion("REQRESERVED5 =", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5NotEqualTo(String value) {
            addCriterion("REQRESERVED5 <>", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5GreaterThan(String value) {
            addCriterion("REQRESERVED5 >", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED5 >=", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5LessThan(String value) {
            addCriterion("REQRESERVED5 <", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED5 <=", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5Like(String value) {
            addCriterion("REQRESERVED5 like", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5NotLike(String value) {
            addCriterion("REQRESERVED5 not like", value, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5In(List<String> values) {
            addCriterion("REQRESERVED5 in", values, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5NotIn(List<String> values) {
            addCriterion("REQRESERVED5 not in", values, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5Between(String value1, String value2) {
            addCriterion("REQRESERVED5 between", value1, value2, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved5NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED5 not between", value1, value2, "reqreserved5");
            return (Criteria) this;
        }

        public Criteria andReqreserved6IsNull() {
            addCriterion("REQRESERVED6 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved6IsNotNull() {
            addCriterion("REQRESERVED6 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved6EqualTo(String value) {
            addCriterion("REQRESERVED6 =", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6NotEqualTo(String value) {
            addCriterion("REQRESERVED6 <>", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6GreaterThan(String value) {
            addCriterion("REQRESERVED6 >", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED6 >=", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6LessThan(String value) {
            addCriterion("REQRESERVED6 <", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED6 <=", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6Like(String value) {
            addCriterion("REQRESERVED6 like", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6NotLike(String value) {
            addCriterion("REQRESERVED6 not like", value, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6In(List<String> values) {
            addCriterion("REQRESERVED6 in", values, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6NotIn(List<String> values) {
            addCriterion("REQRESERVED6 not in", values, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6Between(String value1, String value2) {
            addCriterion("REQRESERVED6 between", value1, value2, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved6NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED6 not between", value1, value2, "reqreserved6");
            return (Criteria) this;
        }

        public Criteria andReqreserved7IsNull() {
            addCriterion("REQRESERVED7 is null");
            return (Criteria) this;
        }

        public Criteria andReqreserved7IsNotNull() {
            addCriterion("REQRESERVED7 is not null");
            return (Criteria) this;
        }

        public Criteria andReqreserved7EqualTo(String value) {
            addCriterion("REQRESERVED7 =", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7NotEqualTo(String value) {
            addCriterion("REQRESERVED7 <>", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7GreaterThan(String value) {
            addCriterion("REQRESERVED7 >", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7GreaterThanOrEqualTo(String value) {
            addCriterion("REQRESERVED7 >=", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7LessThan(String value) {
            addCriterion("REQRESERVED7 <", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7LessThanOrEqualTo(String value) {
            addCriterion("REQRESERVED7 <=", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7Like(String value) {
            addCriterion("REQRESERVED7 like", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7NotLike(String value) {
            addCriterion("REQRESERVED7 not like", value, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7In(List<String> values) {
            addCriterion("REQRESERVED7 in", values, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7NotIn(List<String> values) {
            addCriterion("REQRESERVED7 not in", values, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7Between(String value1, String value2) {
            addCriterion("REQRESERVED7 between", value1, value2, "reqreserved7");
            return (Criteria) this;
        }

        public Criteria andReqreserved7NotBetween(String value1, String value2) {
            addCriterion("REQRESERVED7 not between", value1, value2, "reqreserved7");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : ats_back_ti
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
     * @Table : ats_back_ti
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