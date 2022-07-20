package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmDailyreportDetailTdDelExample {
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
    public MmDailyreportDetailTdDelExample() {
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
     * @Table : mm_dailyreport_detail_td_del
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

        public Criteria andSeqreportnoIsNull() {
            addCriterion("SEQREPORTNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoIsNotNull() {
            addCriterion("SEQREPORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoEqualTo(Long value) {
            addCriterion("SEQREPORTNO =", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotEqualTo(Long value) {
            addCriterion("SEQREPORTNO <>", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoGreaterThan(Long value) {
            addCriterion("SEQREPORTNO >", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQREPORTNO >=", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoLessThan(Long value) {
            addCriterion("SEQREPORTNO <", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoLessThanOrEqualTo(Long value) {
            addCriterion("SEQREPORTNO <=", value, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoIn(List<Long> values) {
            addCriterion("SEQREPORTNO in", values, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotIn(List<Long> values) {
            addCriterion("SEQREPORTNO not in", values, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoBetween(Long value1, Long value2) {
            addCriterion("SEQREPORTNO between", value1, value2, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andSeqreportnoNotBetween(Long value1, Long value2) {
            addCriterion("SEQREPORTNO not between", value1, value2, "seqreportno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNull() {
            addCriterion("DAILYAUDITNO is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNotNull() {
            addCriterion("DAILYAUDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoEqualTo(String value) {
            addCriterion("DAILYAUDITNO =", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotEqualTo(String value) {
            addCriterion("DAILYAUDITNO <>", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThan(String value) {
            addCriterion("DAILYAUDITNO >", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO >=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThan(String value) {
            addCriterion("DAILYAUDITNO <", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO <=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLike(String value) {
            addCriterion("DAILYAUDITNO like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotLike(String value) {
            addCriterion("DAILYAUDITNO not like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIn(List<String> values) {
            addCriterion("DAILYAUDITNO in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotIn(List<String> values) {
            addCriterion("DAILYAUDITNO not in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO not between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andReportkindIsNull() {
            addCriterion("REPORTKIND is null");
            return (Criteria) this;
        }

        public Criteria andReportkindIsNotNull() {
            addCriterion("REPORTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andReportkindEqualTo(String value) {
            addCriterion("REPORTKIND =", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotEqualTo(String value) {
            addCriterion("REPORTKIND <>", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindGreaterThan(String value) {
            addCriterion("REPORTKIND >", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTKIND >=", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLessThan(String value) {
            addCriterion("REPORTKIND <", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLessThanOrEqualTo(String value) {
            addCriterion("REPORTKIND <=", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLike(String value) {
            addCriterion("REPORTKIND like", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotLike(String value) {
            addCriterion("REPORTKIND not like", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindIn(List<String> values) {
            addCriterion("REPORTKIND in", values, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotIn(List<String> values) {
            addCriterion("REPORTKIND not in", values, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindBetween(String value1, String value2) {
            addCriterion("REPORTKIND between", value1, value2, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotBetween(String value1, String value2) {
            addCriterion("REPORTKIND not between", value1, value2, "reportkind");
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

        public Criteria andTounitcodeIsNull() {
            addCriterion("TOUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIsNotNull() {
            addCriterion("TOUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeEqualTo(String value) {
            addCriterion("TOUNITCODE =", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotEqualTo(String value) {
            addCriterion("TOUNITCODE <>", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThan(String value) {
            addCriterion("TOUNITCODE >", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TOUNITCODE >=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThan(String value) {
            addCriterion("TOUNITCODE <", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThanOrEqualTo(String value) {
            addCriterion("TOUNITCODE <=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLike(String value) {
            addCriterion("TOUNITCODE like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotLike(String value) {
            addCriterion("TOUNITCODE not like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIn(List<String> values) {
            addCriterion("TOUNITCODE in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotIn(List<String> values) {
            addCriterion("TOUNITCODE not in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeBetween(String value1, String value2) {
            addCriterion("TOUNITCODE between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotBetween(String value1, String value2) {
            addCriterion("TOUNITCODE not between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIsNull() {
            addCriterion("FROMUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIsNotNull() {
            addCriterion("FROMUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeEqualTo(String value) {
            addCriterion("FROMUNITCODE =", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotEqualTo(String value) {
            addCriterion("FROMUNITCODE <>", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThan(String value) {
            addCriterion("FROMUNITCODE >", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE >=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThan(String value) {
            addCriterion("FROMUNITCODE <", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE <=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLike(String value) {
            addCriterion("FROMUNITCODE like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotLike(String value) {
            addCriterion("FROMUNITCODE not like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIn(List<String> values) {
            addCriterion("FROMUNITCODE in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotIn(List<String> values) {
            addCriterion("FROMUNITCODE not in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE not between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNull() {
            addCriterion("OLDNO is null");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNotNull() {
            addCriterion("OLDNO is not null");
            return (Criteria) this;
        }

        public Criteria andOldnoEqualTo(Long value) {
            addCriterion("OLDNO =", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotEqualTo(Long value) {
            addCriterion("OLDNO <>", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThan(Long value) {
            addCriterion("OLDNO >", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThanOrEqualTo(Long value) {
            addCriterion("OLDNO >=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThan(Long value) {
            addCriterion("OLDNO <", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThanOrEqualTo(Long value) {
            addCriterion("OLDNO <=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoIn(List<Long> values) {
            addCriterion("OLDNO in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotIn(List<Long> values) {
            addCriterion("OLDNO not in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoBetween(Long value1, Long value2) {
            addCriterion("OLDNO between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotBetween(Long value1, Long value2) {
            addCriterion("OLDNO not between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNull() {
            addCriterion("NEWNO is null");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNotNull() {
            addCriterion("NEWNO is not null");
            return (Criteria) this;
        }

        public Criteria andNewnoEqualTo(Long value) {
            addCriterion("NEWNO =", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotEqualTo(Long value) {
            addCriterion("NEWNO <>", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThan(Long value) {
            addCriterion("NEWNO >", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWNO >=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThan(Long value) {
            addCriterion("NEWNO <", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThanOrEqualTo(Long value) {
            addCriterion("NEWNO <=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoIn(List<Long> values) {
            addCriterion("NEWNO in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotIn(List<Long> values) {
            addCriterion("NEWNO not in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoBetween(Long value1, Long value2) {
            addCriterion("NEWNO between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotBetween(Long value1, Long value2) {
            addCriterion("NEWNO not between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNull() {
            addCriterion("BUSINESSONE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNotNull() {
            addCriterion("BUSINESSONE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneEqualTo(String value) {
            addCriterion("BUSINESSONE =", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotEqualTo(String value) {
            addCriterion("BUSINESSONE <>", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThan(String value) {
            addCriterion("BUSINESSONE >", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE >=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThan(String value) {
            addCriterion("BUSINESSONE <", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE <=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLike(String value) {
            addCriterion("BUSINESSONE like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotLike(String value) {
            addCriterion("BUSINESSONE not like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIn(List<String> values) {
            addCriterion("BUSINESSONE in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotIn(List<String> values) {
            addCriterion("BUSINESSONE not in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneBetween(String value1, String value2) {
            addCriterion("BUSINESSONE between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotBetween(String value1, String value2) {
            addCriterion("BUSINESSONE not between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNull() {
            addCriterion("BUSINESSTWO is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNotNull() {
            addCriterion("BUSINESSTWO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoEqualTo(String value) {
            addCriterion("BUSINESSTWO =", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotEqualTo(String value) {
            addCriterion("BUSINESSTWO <>", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThan(String value) {
            addCriterion("BUSINESSTWO >", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO >=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThan(String value) {
            addCriterion("BUSINESSTWO <", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO <=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLike(String value) {
            addCriterion("BUSINESSTWO like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotLike(String value) {
            addCriterion("BUSINESSTWO not like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIn(List<String> values) {
            addCriterion("BUSINESSTWO in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotIn(List<String> values) {
            addCriterion("BUSINESSTWO not in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO not between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1IsNull() {
            addCriterion("BUSINESSTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1IsNotNull() {
            addCriterion("BUSINESSTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1EqualTo(String value) {
            addCriterion("BUSINESSTYPE1 =", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 <>", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1GreaterThan(String value) {
            addCriterion("BUSINESSTYPE1 >", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 >=", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1LessThan(String value) {
            addCriterion("BUSINESSTYPE1 <", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 <=", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1Like(String value) {
            addCriterion("BUSINESSTYPE1 like", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotLike(String value) {
            addCriterion("BUSINESSTYPE1 not like", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1In(List<String> values) {
            addCriterion("BUSINESSTYPE1 in", values, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE1 not in", values, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE1 between", value1, value2, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE1 not between", value1, value2, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2IsNull() {
            addCriterion("BUSINESSTYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2IsNotNull() {
            addCriterion("BUSINESSTYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2EqualTo(String value) {
            addCriterion("BUSINESSTYPE2 =", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 <>", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2GreaterThan(String value) {
            addCriterion("BUSINESSTYPE2 >", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 >=", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2LessThan(String value) {
            addCriterion("BUSINESSTYPE2 <", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 <=", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2Like(String value) {
            addCriterion("BUSINESSTYPE2 like", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotLike(String value) {
            addCriterion("BUSINESSTYPE2 not like", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2In(List<String> values) {
            addCriterion("BUSINESSTYPE2 in", values, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE2 not in", values, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE2 between", value1, value2, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE2 not between", value1, value2, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3IsNull() {
            addCriterion("BUSINESSTYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3IsNotNull() {
            addCriterion("BUSINESSTYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3EqualTo(String value) {
            addCriterion("BUSINESSTYPE3 =", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE3 <>", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3GreaterThan(String value) {
            addCriterion("BUSINESSTYPE3 >", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE3 >=", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3LessThan(String value) {
            addCriterion("BUSINESSTYPE3 <", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE3 <=", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3Like(String value) {
            addCriterion("BUSINESSTYPE3 like", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3NotLike(String value) {
            addCriterion("BUSINESSTYPE3 not like", value, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3In(List<String> values) {
            addCriterion("BUSINESSTYPE3 in", values, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE3 not in", values, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE3 between", value1, value2, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype3NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE3 not between", value1, value2, "businesstype3");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4IsNull() {
            addCriterion("BUSINESSTYPE4 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4IsNotNull() {
            addCriterion("BUSINESSTYPE4 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4EqualTo(String value) {
            addCriterion("BUSINESSTYPE4 =", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE4 <>", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4GreaterThan(String value) {
            addCriterion("BUSINESSTYPE4 >", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE4 >=", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4LessThan(String value) {
            addCriterion("BUSINESSTYPE4 <", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE4 <=", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4Like(String value) {
            addCriterion("BUSINESSTYPE4 like", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4NotLike(String value) {
            addCriterion("BUSINESSTYPE4 not like", value, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4In(List<String> values) {
            addCriterion("BUSINESSTYPE4 in", values, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE4 not in", values, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE4 between", value1, value2, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andBusinesstype4NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE4 not between", value1, value2, "businesstype4");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNull() {
            addCriterion("INPAYMENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNotNull() {
            addCriterion("INPAYMENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagEqualTo(String value) {
            addCriterion("INPAYMENTFLAG =", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <>", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThan(String value) {
            addCriterion("INPAYMENTFLAG >", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG >=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThan(String value) {
            addCriterion("INPAYMENTFLAG <", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLike(String value) {
            addCriterion("INPAYMENTFLAG like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotLike(String value) {
            addCriterion("INPAYMENTFLAG not like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIn(List<String> values) {
            addCriterion("INPAYMENTFLAG in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotIn(List<String> values) {
            addCriterion("INPAYMENTFLAG not in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG not between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
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

        public Criteria andOpnameIsNull() {
            addCriterion("OPNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNotNull() {
            addCriterion("OPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpnameEqualTo(String value) {
            addCriterion("OPNAME =", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotEqualTo(String value) {
            addCriterion("OPNAME <>", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThan(String value) {
            addCriterion("OPNAME >", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPNAME >=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThan(String value) {
            addCriterion("OPNAME <", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThanOrEqualTo(String value) {
            addCriterion("OPNAME <=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLike(String value) {
            addCriterion("OPNAME like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotLike(String value) {
            addCriterion("OPNAME not like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameIn(List<String> values) {
            addCriterion("OPNAME in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotIn(List<String> values) {
            addCriterion("OPNAME not in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameBetween(String value1, String value2) {
            addCriterion("OPNAME between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotBetween(String value1, String value2) {
            addCriterion("OPNAME not between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIsNull() {
            addCriterion("CHECKERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIsNotNull() {
            addCriterion("CHECKERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckercodeEqualTo(String value) {
            addCriterion("CHECKERCODE =", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotEqualTo(String value) {
            addCriterion("CHECKERCODE <>", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeGreaterThan(String value) {
            addCriterion("CHECKERCODE >", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKERCODE >=", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLessThan(String value) {
            addCriterion("CHECKERCODE <", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKERCODE <=", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLike(String value) {
            addCriterion("CHECKERCODE like", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotLike(String value) {
            addCriterion("CHECKERCODE not like", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIn(List<String> values) {
            addCriterion("CHECKERCODE in", values, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotIn(List<String> values) {
            addCriterion("CHECKERCODE not in", values, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeBetween(String value1, String value2) {
            addCriterion("CHECKERCODE between", value1, value2, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotBetween(String value1, String value2) {
            addCriterion("CHECKERCODE not between", value1, value2, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNull() {
            addCriterion("CHECKERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNotNull() {
            addCriterion("CHECKERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckernameEqualTo(String value) {
            addCriterion("CHECKERNAME =", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotEqualTo(String value) {
            addCriterion("CHECKERNAME <>", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThan(String value) {
            addCriterion("CHECKERNAME >", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKERNAME >=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThan(String value) {
            addCriterion("CHECKERNAME <", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThanOrEqualTo(String value) {
            addCriterion("CHECKERNAME <=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLike(String value) {
            addCriterion("CHECKERNAME like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotLike(String value) {
            addCriterion("CHECKERNAME not like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameIn(List<String> values) {
            addCriterion("CHECKERNAME in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotIn(List<String> values) {
            addCriterion("CHECKERNAME not in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameBetween(String value1, String value2) {
            addCriterion("CHECKERNAME between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotBetween(String value1, String value2) {
            addCriterion("CHECKERNAME not between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIsNull() {
            addCriterion("AUDITERCODE is null");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIsNotNull() {
            addCriterion("AUDITERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditercodeEqualTo(String value) {
            addCriterion("AUDITERCODE =", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotEqualTo(String value) {
            addCriterion("AUDITERCODE <>", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeGreaterThan(String value) {
            addCriterion("AUDITERCODE >", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITERCODE >=", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLessThan(String value) {
            addCriterion("AUDITERCODE <", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLessThanOrEqualTo(String value) {
            addCriterion("AUDITERCODE <=", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLike(String value) {
            addCriterion("AUDITERCODE like", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotLike(String value) {
            addCriterion("AUDITERCODE not like", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIn(List<String> values) {
            addCriterion("AUDITERCODE in", values, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotIn(List<String> values) {
            addCriterion("AUDITERCODE not in", values, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeBetween(String value1, String value2) {
            addCriterion("AUDITERCODE between", value1, value2, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotBetween(String value1, String value2) {
            addCriterion("AUDITERCODE not between", value1, value2, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditernameIsNull() {
            addCriterion("AUDITERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAuditernameIsNotNull() {
            addCriterion("AUDITERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditernameEqualTo(String value) {
            addCriterion("AUDITERNAME =", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotEqualTo(String value) {
            addCriterion("AUDITERNAME <>", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameGreaterThan(String value) {
            addCriterion("AUDITERNAME >", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITERNAME >=", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLessThan(String value) {
            addCriterion("AUDITERNAME <", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLessThanOrEqualTo(String value) {
            addCriterion("AUDITERNAME <=", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLike(String value) {
            addCriterion("AUDITERNAME like", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotLike(String value) {
            addCriterion("AUDITERNAME not like", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameIn(List<String> values) {
            addCriterion("AUDITERNAME in", values, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotIn(List<String> values) {
            addCriterion("AUDITERNAME not in", values, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameBetween(String value1, String value2) {
            addCriterion("AUDITERNAME between", value1, value2, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotBetween(String value1, String value2) {
            addCriterion("AUDITERNAME not between", value1, value2, "auditername");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("AUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("AUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("AUDITTIME =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("AUDITTIME <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("AUDITTIME >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("AUDITTIME <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("AUDITTIME in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("AUDITTIME not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andReportercodeIsNull() {
            addCriterion("REPORTERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReportercodeIsNotNull() {
            addCriterion("REPORTERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReportercodeEqualTo(String value) {
            addCriterion("REPORTERCODE =", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeNotEqualTo(String value) {
            addCriterion("REPORTERCODE <>", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeGreaterThan(String value) {
            addCriterion("REPORTERCODE >", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTERCODE >=", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeLessThan(String value) {
            addCriterion("REPORTERCODE <", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeLessThanOrEqualTo(String value) {
            addCriterion("REPORTERCODE <=", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeLike(String value) {
            addCriterion("REPORTERCODE like", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeNotLike(String value) {
            addCriterion("REPORTERCODE not like", value, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeIn(List<String> values) {
            addCriterion("REPORTERCODE in", values, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeNotIn(List<String> values) {
            addCriterion("REPORTERCODE not in", values, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeBetween(String value1, String value2) {
            addCriterion("REPORTERCODE between", value1, value2, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReportercodeNotBetween(String value1, String value2) {
            addCriterion("REPORTERCODE not between", value1, value2, "reportercode");
            return (Criteria) this;
        }

        public Criteria andReporternameIsNull() {
            addCriterion("REPORTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReporternameIsNotNull() {
            addCriterion("REPORTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReporternameEqualTo(String value) {
            addCriterion("REPORTERNAME =", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameNotEqualTo(String value) {
            addCriterion("REPORTERNAME <>", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameGreaterThan(String value) {
            addCriterion("REPORTERNAME >", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTERNAME >=", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameLessThan(String value) {
            addCriterion("REPORTERNAME <", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameLessThanOrEqualTo(String value) {
            addCriterion("REPORTERNAME <=", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameLike(String value) {
            addCriterion("REPORTERNAME like", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameNotLike(String value) {
            addCriterion("REPORTERNAME not like", value, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameIn(List<String> values) {
            addCriterion("REPORTERNAME in", values, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameNotIn(List<String> values) {
            addCriterion("REPORTERNAME not in", values, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameBetween(String value1, String value2) {
            addCriterion("REPORTERNAME between", value1, value2, "reportername");
            return (Criteria) this;
        }

        public Criteria andReporternameNotBetween(String value1, String value2) {
            addCriterion("REPORTERNAME not between", value1, value2, "reportername");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("REPORTDATE is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("REPORTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(Date value) {
            addCriterion("REPORTDATE =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(Date value) {
            addCriterion("REPORTDATE <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(Date value) {
            addCriterion("REPORTDATE >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORTDATE >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(Date value) {
            addCriterion("REPORTDATE <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(Date value) {
            addCriterion("REPORTDATE <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<Date> values) {
            addCriterion("REPORTDATE in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<Date> values) {
            addCriterion("REPORTDATE not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(Date value1, Date value2) {
            addCriterion("REPORTDATE between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(Date value1, Date value2) {
            addCriterion("REPORTDATE not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("REPORTTIME is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("REPORTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterion("REPORTTIME =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterion("REPORTTIME <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterion("REPORTTIME >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORTTIME >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterion("REPORTTIME <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("REPORTTIME <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterion("REPORTTIME in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterion("REPORTTIME not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterion("REPORTTIME between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("REPORTTIME not between", value1, value2, "reporttime");
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

        public Criteria andInsurencecountIsNull() {
            addCriterion("INSURENCECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNotNull() {
            addCriterion("INSURENCECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT =", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <>", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT >", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT >=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThan(BigDecimal value) {
            addCriterion("INSURENCECOUNT <", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURENCECOUNT <=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotIn(List<BigDecimal> values) {
            addCriterion("INSURENCECOUNT not in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURENCECOUNT not between", value1, value2, "insurencecount");
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

        public Criteria andTransactiornameIsNull() {
            addCriterion("TRANSACTIORNAME is null");
            return (Criteria) this;
        }

        public Criteria andTransactiornameIsNotNull() {
            addCriterion("TRANSACTIORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiornameEqualTo(String value) {
            addCriterion("TRANSACTIORNAME =", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameNotEqualTo(String value) {
            addCriterion("TRANSACTIORNAME <>", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameGreaterThan(String value) {
            addCriterion("TRANSACTIORNAME >", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIORNAME >=", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameLessThan(String value) {
            addCriterion("TRANSACTIORNAME <", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIORNAME <=", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameLike(String value) {
            addCriterion("TRANSACTIORNAME like", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameNotLike(String value) {
            addCriterion("TRANSACTIORNAME not like", value, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameIn(List<String> values) {
            addCriterion("TRANSACTIORNAME in", values, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameNotIn(List<String> values) {
            addCriterion("TRANSACTIORNAME not in", values, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameBetween(String value1, String value2) {
            addCriterion("TRANSACTIORNAME between", value1, value2, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andTransactiornameNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIORNAME not between", value1, value2, "transactiorname");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("SIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("SIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE not between", value1, value2, "signdate");
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

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
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

        public Criteria andCasenoIsNull() {
            addCriterion("CASENO is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CASENO is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CASENO =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CASENO <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CASENO >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CASENO >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CASENO <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CASENO <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CASENO like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CASENO not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CASENO in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CASENO not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CASENO between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CASENO not between", value1, value2, "caseno");
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

        public Criteria andChecktypeIsNull() {
            addCriterion("CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CHECKTYPE not between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNull() {
            addCriterion("CHECKNO is null");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNotNull() {
            addCriterion("CHECKNO is not null");
            return (Criteria) this;
        }

        public Criteria andChecknoEqualTo(String value) {
            addCriterion("CHECKNO =", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotEqualTo(String value) {
            addCriterion("CHECKNO <>", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThan(String value) {
            addCriterion("CHECKNO >", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNO >=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThan(String value) {
            addCriterion("CHECKNO <", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThanOrEqualTo(String value) {
            addCriterion("CHECKNO <=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLike(String value) {
            addCriterion("CHECKNO like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotLike(String value) {
            addCriterion("CHECKNO not like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoIn(List<String> values) {
            addCriterion("CHECKNO in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotIn(List<String> values) {
            addCriterion("CHECKNO not in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoBetween(String value1, String value2) {
            addCriterion("CHECKNO between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotBetween(String value1, String value2) {
            addCriterion("CHECKNO not between", value1, value2, "checkno");
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

        public Criteria andCustomerbanknameIsNull() {
            addCriterion("CUSTOMERBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameIsNotNull() {
            addCriterion("CUSTOMERBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME =", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME <>", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameGreaterThan(String value) {
            addCriterion("CUSTOMERBANKNAME >", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME >=", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLessThan(String value) {
            addCriterion("CUSTOMERBANKNAME <", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME <=", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLike(String value) {
            addCriterion("CUSTOMERBANKNAME like", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotLike(String value) {
            addCriterion("CUSTOMERBANKNAME not like", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameIn(List<String> values) {
            addCriterion("CUSTOMERBANKNAME in", values, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotIn(List<String> values) {
            addCriterion("CUSTOMERBANKNAME not in", values, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANKNAME between", value1, value2, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANKNAME not between", value1, value2, "customerbankname");
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

        public Criteria andUsablenoIsNull() {
            addCriterion("USABLENO is null");
            return (Criteria) this;
        }

        public Criteria andUsablenoIsNotNull() {
            addCriterion("USABLENO is not null");
            return (Criteria) this;
        }

        public Criteria andUsablenoEqualTo(Long value) {
            addCriterion("USABLENO =", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoNotEqualTo(Long value) {
            addCriterion("USABLENO <>", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoGreaterThan(Long value) {
            addCriterion("USABLENO >", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoGreaterThanOrEqualTo(Long value) {
            addCriterion("USABLENO >=", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoLessThan(Long value) {
            addCriterion("USABLENO <", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoLessThanOrEqualTo(Long value) {
            addCriterion("USABLENO <=", value, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoIn(List<Long> values) {
            addCriterion("USABLENO in", values, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoNotIn(List<Long> values) {
            addCriterion("USABLENO not in", values, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoBetween(Long value1, Long value2) {
            addCriterion("USABLENO between", value1, value2, "usableno");
            return (Criteria) this;
        }

        public Criteria andUsablenoNotBetween(Long value1, Long value2) {
            addCriterion("USABLENO not between", value1, value2, "usableno");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNull() {
            addCriterion("INPAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNotNull() {
            addCriterion("INPAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTID =", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTID <>", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThan(BigDecimal value) {
            addCriterion("INPAYMENTID >", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTID >=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThan(BigDecimal value) {
            addCriterion("INPAYMENTID <", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTID <=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTID in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTID not in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTID between", value1, value2, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTID not between", value1, value2, "inpaymentid");
            return (Criteria) this;
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

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
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

        public Criteria andTosubcompanyIsNull() {
            addCriterion("TOSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIsNotNull() {
            addCriterion("TOSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyEqualTo(String value) {
            addCriterion("TOSUBCOMPANY =", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <>", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThan(String value) {
            addCriterion("TOSUBCOMPANY >", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY >=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThan(String value) {
            addCriterion("TOSUBCOMPANY <", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLike(String value) {
            addCriterion("TOSUBCOMPANY like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotLike(String value) {
            addCriterion("TOSUBCOMPANY not like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIn(List<String> values) {
            addCriterion("TOSUBCOMPANY in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotIn(List<String> values) {
            addCriterion("TOSUBCOMPANY not in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY between", value1, value2, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY not between", value1, value2, "tosubcompany");
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

        public Criteria andRendernoIsNull() {
            addCriterion("RENDERNO is null");
            return (Criteria) this;
        }

        public Criteria andRendernoIsNotNull() {
            addCriterion("RENDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andRendernoEqualTo(String value) {
            addCriterion("RENDERNO =", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotEqualTo(String value) {
            addCriterion("RENDERNO <>", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoGreaterThan(String value) {
            addCriterion("RENDERNO >", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoGreaterThanOrEqualTo(String value) {
            addCriterion("RENDERNO >=", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLessThan(String value) {
            addCriterion("RENDERNO <", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLessThanOrEqualTo(String value) {
            addCriterion("RENDERNO <=", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLike(String value) {
            addCriterion("RENDERNO like", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotLike(String value) {
            addCriterion("RENDERNO not like", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoIn(List<String> values) {
            addCriterion("RENDERNO in", values, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotIn(List<String> values) {
            addCriterion("RENDERNO not in", values, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoBetween(String value1, String value2) {
            addCriterion("RENDERNO between", value1, value2, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotBetween(String value1, String value2) {
            addCriterion("RENDERNO not between", value1, value2, "renderno");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIsNull() {
            addCriterion("TRANSTOACC is null");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIsNotNull() {
            addCriterion("TRANSTOACC is not null");
            return (Criteria) this;
        }

        public Criteria andTranstoaccEqualTo(String value) {
            addCriterion("TRANSTOACC =", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotEqualTo(String value) {
            addCriterion("TRANSTOACC <>", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccGreaterThan(String value) {
            addCriterion("TRANSTOACC >", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTOACC >=", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLessThan(String value) {
            addCriterion("TRANSTOACC <", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLessThanOrEqualTo(String value) {
            addCriterion("TRANSTOACC <=", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLike(String value) {
            addCriterion("TRANSTOACC like", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotLike(String value) {
            addCriterion("TRANSTOACC not like", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIn(List<String> values) {
            addCriterion("TRANSTOACC in", values, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotIn(List<String> values) {
            addCriterion("TRANSTOACC not in", values, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccBetween(String value1, String value2) {
            addCriterion("TRANSTOACC between", value1, value2, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotBetween(String value1, String value2) {
            addCriterion("TRANSTOACC not between", value1, value2, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andUsableno2IsNull() {
            addCriterion("USABLENO2 is null");
            return (Criteria) this;
        }

        public Criteria andUsableno2IsNotNull() {
            addCriterion("USABLENO2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsableno2EqualTo(String value) {
            addCriterion("USABLENO2 =", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2NotEqualTo(String value) {
            addCriterion("USABLENO2 <>", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2GreaterThan(String value) {
            addCriterion("USABLENO2 >", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2GreaterThanOrEqualTo(String value) {
            addCriterion("USABLENO2 >=", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2LessThan(String value) {
            addCriterion("USABLENO2 <", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2LessThanOrEqualTo(String value) {
            addCriterion("USABLENO2 <=", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2Like(String value) {
            addCriterion("USABLENO2 like", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2NotLike(String value) {
            addCriterion("USABLENO2 not like", value, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2In(List<String> values) {
            addCriterion("USABLENO2 in", values, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2NotIn(List<String> values) {
            addCriterion("USABLENO2 not in", values, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2Between(String value1, String value2) {
            addCriterion("USABLENO2 between", value1, value2, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno2NotBetween(String value1, String value2) {
            addCriterion("USABLENO2 not between", value1, value2, "usableno2");
            return (Criteria) this;
        }

        public Criteria andUsableno3IsNull() {
            addCriterion("USABLENO3 is null");
            return (Criteria) this;
        }

        public Criteria andUsableno3IsNotNull() {
            addCriterion("USABLENO3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsableno3EqualTo(String value) {
            addCriterion("USABLENO3 =", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3NotEqualTo(String value) {
            addCriterion("USABLENO3 <>", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3GreaterThan(String value) {
            addCriterion("USABLENO3 >", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3GreaterThanOrEqualTo(String value) {
            addCriterion("USABLENO3 >=", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3LessThan(String value) {
            addCriterion("USABLENO3 <", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3LessThanOrEqualTo(String value) {
            addCriterion("USABLENO3 <=", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3Like(String value) {
            addCriterion("USABLENO3 like", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3NotLike(String value) {
            addCriterion("USABLENO3 not like", value, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3In(List<String> values) {
            addCriterion("USABLENO3 in", values, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3NotIn(List<String> values) {
            addCriterion("USABLENO3 not in", values, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3Between(String value1, String value2) {
            addCriterion("USABLENO3 between", value1, value2, "usableno3");
            return (Criteria) this;
        }

        public Criteria andUsableno3NotBetween(String value1, String value2) {
            addCriterion("USABLENO3 not between", value1, value2, "usableno3");
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

        public Criteria andCocurrencycodeIsNull() {
            addCriterion("COCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeIsNotNull() {
            addCriterion("COCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeEqualTo(String value) {
            addCriterion("COCURRENCYCODE =", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotEqualTo(String value) {
            addCriterion("COCURRENCYCODE <>", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeGreaterThan(String value) {
            addCriterion("COCURRENCYCODE >", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("COCURRENCYCODE >=", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLessThan(String value) {
            addCriterion("COCURRENCYCODE <", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("COCURRENCYCODE <=", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLike(String value) {
            addCriterion("COCURRENCYCODE like", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotLike(String value) {
            addCriterion("COCURRENCYCODE not like", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeIn(List<String> values) {
            addCriterion("COCURRENCYCODE in", values, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotIn(List<String> values) {
            addCriterion("COCURRENCYCODE not in", values, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeBetween(String value1, String value2) {
            addCriterion("COCURRENCYCODE between", value1, value2, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotBetween(String value1, String value2) {
            addCriterion("COCURRENCYCODE not between", value1, value2, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCoamountIsNull() {
            addCriterion("COAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCoamountIsNotNull() {
            addCriterion("COAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCoamountEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT =", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT <>", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountGreaterThan(BigDecimal value) {
            addCriterion("COAMOUNT >", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT >=", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountLessThan(BigDecimal value) {
            addCriterion("COAMOUNT <", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT <=", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountIn(List<BigDecimal> values) {
            addCriterion("COAMOUNT in", values, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotIn(List<BigDecimal> values) {
            addCriterion("COAMOUNT not in", values, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COAMOUNT between", value1, value2, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COAMOUNT not between", value1, value2, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoarateIsNull() {
            addCriterion("COARATE is null");
            return (Criteria) this;
        }

        public Criteria andCoarateIsNotNull() {
            addCriterion("COARATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoarateEqualTo(BigDecimal value) {
            addCriterion("COARATE =", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotEqualTo(BigDecimal value) {
            addCriterion("COARATE <>", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateGreaterThan(BigDecimal value) {
            addCriterion("COARATE >", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COARATE >=", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateLessThan(BigDecimal value) {
            addCriterion("COARATE <", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COARATE <=", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateIn(List<BigDecimal> values) {
            addCriterion("COARATE in", values, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotIn(List<BigDecimal> values) {
            addCriterion("COARATE not in", values, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COARATE between", value1, value2, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COARATE not between", value1, value2, "coarate");
            return (Criteria) this;
        }

        public Criteria andAccountrateIsNull() {
            addCriterion("ACCOUNTRATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountrateIsNotNull() {
            addCriterion("ACCOUNTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountrateEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE =", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE <>", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTRATE >", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE >=", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateLessThan(BigDecimal value) {
            addCriterion("ACCOUNTRATE <", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE <=", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTRATE in", values, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTRATE not in", values, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTRATE between", value1, value2, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTRATE not between", value1, value2, "accountrate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_dailyreport_detail_td_del
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
     * @Table : mm_dailyreport_detail_td_del
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