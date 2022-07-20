package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmErrorLogExample {
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
    public MmErrorLogExample() {
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
     * @Table : mm_error_log
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

        public Criteria andErroridIsNull() {
            addCriterion("ERRORID is null");
            return (Criteria) this;
        }

        public Criteria andErroridIsNotNull() {
            addCriterion("ERRORID is not null");
            return (Criteria) this;
        }

        public Criteria andErroridEqualTo(Long value) {
            addCriterion("ERRORID =", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotEqualTo(Long value) {
            addCriterion("ERRORID <>", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThan(Long value) {
            addCriterion("ERRORID >", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThanOrEqualTo(Long value) {
            addCriterion("ERRORID >=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThan(Long value) {
            addCriterion("ERRORID <", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThanOrEqualTo(Long value) {
            addCriterion("ERRORID <=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridIn(List<Long> values) {
            addCriterion("ERRORID in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotIn(List<Long> values) {
            addCriterion("ERRORID not in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridBetween(Long value1, Long value2) {
            addCriterion("ERRORID between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotBetween(Long value1, Long value2) {
            addCriterion("ERRORID not between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("INFO is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("INFO is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("INFO =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("INFO <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("INFO >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INFO >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("INFO <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("INFO <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("INFO like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("INFO not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("INFO in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("INFO not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("INFO between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("INFO not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIsNull() {
            addCriterion("SQLCODE is null");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIsNotNull() {
            addCriterion("SQLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlcodeEqualTo(BigDecimal value) {
            addCriterion("SQLCODE =", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotEqualTo(BigDecimal value) {
            addCriterion("SQLCODE <>", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeGreaterThan(BigDecimal value) {
            addCriterion("SQLCODE >", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQLCODE >=", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeLessThan(BigDecimal value) {
            addCriterion("SQLCODE <", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQLCODE <=", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIn(List<BigDecimal> values) {
            addCriterion("SQLCODE in", values, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotIn(List<BigDecimal> values) {
            addCriterion("SQLCODE not in", values, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQLCODE between", value1, value2, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQLCODE not between", value1, value2, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlerrmIsNull() {
            addCriterion("SQLERRM is null");
            return (Criteria) this;
        }

        public Criteria andSqlerrmIsNotNull() {
            addCriterion("SQLERRM is not null");
            return (Criteria) this;
        }

        public Criteria andSqlerrmEqualTo(String value) {
            addCriterion("SQLERRM =", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmNotEqualTo(String value) {
            addCriterion("SQLERRM <>", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmGreaterThan(String value) {
            addCriterion("SQLERRM >", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmGreaterThanOrEqualTo(String value) {
            addCriterion("SQLERRM >=", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmLessThan(String value) {
            addCriterion("SQLERRM <", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmLessThanOrEqualTo(String value) {
            addCriterion("SQLERRM <=", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmLike(String value) {
            addCriterion("SQLERRM like", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmNotLike(String value) {
            addCriterion("SQLERRM not like", value, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmIn(List<String> values) {
            addCriterion("SQLERRM in", values, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmNotIn(List<String> values) {
            addCriterion("SQLERRM not in", values, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmBetween(String value1, String value2) {
            addCriterion("SQLERRM between", value1, value2, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andSqlerrmNotBetween(String value1, String value2) {
            addCriterion("SQLERRM not between", value1, value2, "sqlerrm");
            return (Criteria) this;
        }

        public Criteria andTraceIsNull() {
            addCriterion("TRACE is null");
            return (Criteria) this;
        }

        public Criteria andTraceIsNotNull() {
            addCriterion("TRACE is not null");
            return (Criteria) this;
        }

        public Criteria andTraceEqualTo(String value) {
            addCriterion("TRACE =", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceNotEqualTo(String value) {
            addCriterion("TRACE <>", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceGreaterThan(String value) {
            addCriterion("TRACE >", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceGreaterThanOrEqualTo(String value) {
            addCriterion("TRACE >=", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceLessThan(String value) {
            addCriterion("TRACE <", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceLessThanOrEqualTo(String value) {
            addCriterion("TRACE <=", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceLike(String value) {
            addCriterion("TRACE like", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceNotLike(String value) {
            addCriterion("TRACE not like", value, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceIn(List<String> values) {
            addCriterion("TRACE in", values, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceNotIn(List<String> values) {
            addCriterion("TRACE not in", values, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceBetween(String value1, String value2) {
            addCriterion("TRACE between", value1, value2, "trace");
            return (Criteria) this;
        }

        public Criteria andTraceNotBetween(String value1, String value2) {
            addCriterion("TRACE not between", value1, value2, "trace");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNull() {
            addCriterion("LOGDATE is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("LOGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(Date value) {
            addCriterion("LOGDATE =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(Date value) {
            addCriterion("LOGDATE <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(Date value) {
            addCriterion("LOGDATE >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGDATE >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(Date value) {
            addCriterion("LOGDATE <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(Date value) {
            addCriterion("LOGDATE <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<Date> values) {
            addCriterion("LOGDATE in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<Date> values) {
            addCriterion("LOGDATE not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(Date value1, Date value2) {
            addCriterion("LOGDATE between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(Date value1, Date value2) {
            addCriterion("LOGDATE not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andProcnameIsNull() {
            addCriterion("PROCNAME is null");
            return (Criteria) this;
        }

        public Criteria andProcnameIsNotNull() {
            addCriterion("PROCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcnameEqualTo(String value) {
            addCriterion("PROCNAME =", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotEqualTo(String value) {
            addCriterion("PROCNAME <>", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameGreaterThan(String value) {
            addCriterion("PROCNAME >", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCNAME >=", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLessThan(String value) {
            addCriterion("PROCNAME <", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLessThanOrEqualTo(String value) {
            addCriterion("PROCNAME <=", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLike(String value) {
            addCriterion("PROCNAME like", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotLike(String value) {
            addCriterion("PROCNAME not like", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameIn(List<String> values) {
            addCriterion("PROCNAME in", values, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotIn(List<String> values) {
            addCriterion("PROCNAME not in", values, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameBetween(String value1, String value2) {
            addCriterion("PROCNAME between", value1, value2, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotBetween(String value1, String value2) {
            addCriterion("PROCNAME not between", value1, value2, "procname");
            return (Criteria) this;
        }

        public Criteria andKeyword1IsNull() {
            addCriterion("KEYWORD1 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword1IsNotNull() {
            addCriterion("KEYWORD1 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword1EqualTo(String value) {
            addCriterion("KEYWORD1 =", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotEqualTo(String value) {
            addCriterion("KEYWORD1 <>", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1GreaterThan(String value) {
            addCriterion("KEYWORD1 >", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1GreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD1 >=", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1LessThan(String value) {
            addCriterion("KEYWORD1 <", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1LessThanOrEqualTo(String value) {
            addCriterion("KEYWORD1 <=", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1Like(String value) {
            addCriterion("KEYWORD1 like", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotLike(String value) {
            addCriterion("KEYWORD1 not like", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1In(List<String> values) {
            addCriterion("KEYWORD1 in", values, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotIn(List<String> values) {
            addCriterion("KEYWORD1 not in", values, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1Between(String value1, String value2) {
            addCriterion("KEYWORD1 between", value1, value2, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotBetween(String value1, String value2) {
            addCriterion("KEYWORD1 not between", value1, value2, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword2IsNull() {
            addCriterion("KEYWORD2 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword2IsNotNull() {
            addCriterion("KEYWORD2 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword2EqualTo(String value) {
            addCriterion("KEYWORD2 =", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotEqualTo(String value) {
            addCriterion("KEYWORD2 <>", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2GreaterThan(String value) {
            addCriterion("KEYWORD2 >", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2GreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD2 >=", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2LessThan(String value) {
            addCriterion("KEYWORD2 <", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2LessThanOrEqualTo(String value) {
            addCriterion("KEYWORD2 <=", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2Like(String value) {
            addCriterion("KEYWORD2 like", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotLike(String value) {
            addCriterion("KEYWORD2 not like", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2In(List<String> values) {
            addCriterion("KEYWORD2 in", values, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotIn(List<String> values) {
            addCriterion("KEYWORD2 not in", values, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2Between(String value1, String value2) {
            addCriterion("KEYWORD2 between", value1, value2, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotBetween(String value1, String value2) {
            addCriterion("KEYWORD2 not between", value1, value2, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword3IsNull() {
            addCriterion("KEYWORD3 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword3IsNotNull() {
            addCriterion("KEYWORD3 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword3EqualTo(String value) {
            addCriterion("KEYWORD3 =", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotEqualTo(String value) {
            addCriterion("KEYWORD3 <>", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3GreaterThan(String value) {
            addCriterion("KEYWORD3 >", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3GreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD3 >=", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3LessThan(String value) {
            addCriterion("KEYWORD3 <", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3LessThanOrEqualTo(String value) {
            addCriterion("KEYWORD3 <=", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3Like(String value) {
            addCriterion("KEYWORD3 like", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotLike(String value) {
            addCriterion("KEYWORD3 not like", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3In(List<String> values) {
            addCriterion("KEYWORD3 in", values, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotIn(List<String> values) {
            addCriterion("KEYWORD3 not in", values, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3Between(String value1, String value2) {
            addCriterion("KEYWORD3 between", value1, value2, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotBetween(String value1, String value2) {
            addCriterion("KEYWORD3 not between", value1, value2, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword4IsNull() {
            addCriterion("KEYWORD4 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword4IsNotNull() {
            addCriterion("KEYWORD4 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword4EqualTo(String value) {
            addCriterion("KEYWORD4 =", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotEqualTo(String value) {
            addCriterion("KEYWORD4 <>", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4GreaterThan(String value) {
            addCriterion("KEYWORD4 >", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4GreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD4 >=", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4LessThan(String value) {
            addCriterion("KEYWORD4 <", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4LessThanOrEqualTo(String value) {
            addCriterion("KEYWORD4 <=", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4Like(String value) {
            addCriterion("KEYWORD4 like", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotLike(String value) {
            addCriterion("KEYWORD4 not like", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4In(List<String> values) {
            addCriterion("KEYWORD4 in", values, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotIn(List<String> values) {
            addCriterion("KEYWORD4 not in", values, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4Between(String value1, String value2) {
            addCriterion("KEYWORD4 between", value1, value2, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotBetween(String value1, String value2) {
            addCriterion("KEYWORD4 not between", value1, value2, "keyword4");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_error_log
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
     * @Table : mm_error_log
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