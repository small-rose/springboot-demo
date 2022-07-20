package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmVoucherdetailTdExample {
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
    public MmVoucherdetailTdExample() {
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
     * @Table : mm_voucherdetail_td
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

        public Criteria andSeqreportIsNull() {
            addCriterion("SEQREPORT is null");
            return (Criteria) this;
        }

        public Criteria andSeqreportIsNotNull() {
            addCriterion("SEQREPORT is not null");
            return (Criteria) this;
        }

        public Criteria andSeqreportEqualTo(Long value) {
            addCriterion("SEQREPORT =", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportNotEqualTo(Long value) {
            addCriterion("SEQREPORT <>", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportGreaterThan(Long value) {
            addCriterion("SEQREPORT >", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQREPORT >=", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportLessThan(Long value) {
            addCriterion("SEQREPORT <", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportLessThanOrEqualTo(Long value) {
            addCriterion("SEQREPORT <=", value, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportIn(List<Long> values) {
            addCriterion("SEQREPORT in", values, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportNotIn(List<Long> values) {
            addCriterion("SEQREPORT not in", values, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportBetween(Long value1, Long value2) {
            addCriterion("SEQREPORT between", value1, value2, "seqreport");
            return (Criteria) this;
        }

        public Criteria andSeqreportNotBetween(Long value1, Long value2) {
            addCriterion("SEQREPORT not between", value1, value2, "seqreport");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNull() {
            addCriterion("MODULENO is null");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNotNull() {
            addCriterion("MODULENO is not null");
            return (Criteria) this;
        }

        public Criteria andModulenoEqualTo(Long value) {
            addCriterion("MODULENO =", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotEqualTo(Long value) {
            addCriterion("MODULENO <>", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThan(Long value) {
            addCriterion("MODULENO >", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThanOrEqualTo(Long value) {
            addCriterion("MODULENO >=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThan(Long value) {
            addCriterion("MODULENO <", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThanOrEqualTo(Long value) {
            addCriterion("MODULENO <=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoIn(List<Long> values) {
            addCriterion("MODULENO in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotIn(List<Long> values) {
            addCriterion("MODULENO not in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoBetween(Long value1, Long value2) {
            addCriterion("MODULENO between", value1, value2, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotBetween(Long value1, Long value2) {
            addCriterion("MODULENO not between", value1, value2, "moduleno");
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

        public Criteria andVouchertypeIsNull() {
            addCriterion("VOUCHERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIsNotNull() {
            addCriterion("VOUCHERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeEqualTo(String value) {
            addCriterion("VOUCHERTYPE =", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotEqualTo(String value) {
            addCriterion("VOUCHERTYPE <>", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThan(String value) {
            addCriterion("VOUCHERTYPE >", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERTYPE >=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThan(String value) {
            addCriterion("VOUCHERTYPE <", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERTYPE <=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLike(String value) {
            addCriterion("VOUCHERTYPE like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotLike(String value) {
            addCriterion("VOUCHERTYPE not like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIn(List<String> values) {
            addCriterion("VOUCHERTYPE in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotIn(List<String> values) {
            addCriterion("VOUCHERTYPE not in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeBetween(String value1, String value2) {
            addCriterion("VOUCHERTYPE between", value1, value2, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotBetween(String value1, String value2) {
            addCriterion("VOUCHERTYPE not between", value1, value2, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("SEGMENT5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("SEGMENT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(String value) {
            addCriterion("SEGMENT5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(String value) {
            addCriterion("SEGMENT5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(String value) {
            addCriterion("SEGMENT5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(String value) {
            addCriterion("SEGMENT5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Like(String value) {
            addCriterion("SEGMENT5 like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotLike(String value) {
            addCriterion("SEGMENT5 not like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<String> values) {
            addCriterion("SEGMENT5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<String> values) {
            addCriterion("SEGMENT5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(String value1, String value2) {
            addCriterion("SEGMENT5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(String value1, String value2) {
            addCriterion("SEGMENT5 not between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNull() {
            addCriterion("SEGMENT6 is null");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNotNull() {
            addCriterion("SEGMENT6 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6EqualTo(String value) {
            addCriterion("SEGMENT6 =", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotEqualTo(String value) {
            addCriterion("SEGMENT6 <>", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThan(String value) {
            addCriterion("SEGMENT6 >", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 >=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThan(String value) {
            addCriterion("SEGMENT6 <", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 <=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Like(String value) {
            addCriterion("SEGMENT6 like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotLike(String value) {
            addCriterion("SEGMENT6 not like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6In(List<String> values) {
            addCriterion("SEGMENT6 in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotIn(List<String> values) {
            addCriterion("SEGMENT6 not in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Between(String value1, String value2) {
            addCriterion("SEGMENT6 between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotBetween(String value1, String value2) {
            addCriterion("SEGMENT6 not between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNull() {
            addCriterion("SEGMENT7 is null");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNotNull() {
            addCriterion("SEGMENT7 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7EqualTo(String value) {
            addCriterion("SEGMENT7 =", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotEqualTo(String value) {
            addCriterion("SEGMENT7 <>", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThan(String value) {
            addCriterion("SEGMENT7 >", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 >=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThan(String value) {
            addCriterion("SEGMENT7 <", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 <=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Like(String value) {
            addCriterion("SEGMENT7 like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotLike(String value) {
            addCriterion("SEGMENT7 not like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7In(List<String> values) {
            addCriterion("SEGMENT7 in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotIn(List<String> values) {
            addCriterion("SEGMENT7 not in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Between(String value1, String value2) {
            addCriterion("SEGMENT7 between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotBetween(String value1, String value2) {
            addCriterion("SEGMENT7 not between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNull() {
            addCriterion("SEGMENT8 is null");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNotNull() {
            addCriterion("SEGMENT8 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8EqualTo(String value) {
            addCriterion("SEGMENT8 =", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotEqualTo(String value) {
            addCriterion("SEGMENT8 <>", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThan(String value) {
            addCriterion("SEGMENT8 >", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 >=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThan(String value) {
            addCriterion("SEGMENT8 <", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 <=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Like(String value) {
            addCriterion("SEGMENT8 like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotLike(String value) {
            addCriterion("SEGMENT8 not like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8In(List<String> values) {
            addCriterion("SEGMENT8 in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotIn(List<String> values) {
            addCriterion("SEGMENT8 not in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Between(String value1, String value2) {
            addCriterion("SEGMENT8 between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotBetween(String value1, String value2) {
            addCriterion("SEGMENT8 not between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIsNull() {
            addCriterion("ACCOUNTINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIsNotNull() {
            addCriterion("ACCOUNTINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE =", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <>", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE >", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE >=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThan(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNTINGDATE <=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNTINGDATE in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNTINGDATE not in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNTINGDATE between", value1, value2, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNTINGDATE not between", value1, value2, "accountingdate");
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

        public Criteria andBusinessnoIsNull() {
            addCriterion("BUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("BUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(Long value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(Long value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(Long value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(Long value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<Long> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<Long> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(Long value1, Long value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andEnteredDrIsNull() {
            addCriterion("ENTERED_DR is null");
            return (Criteria) this;
        }

        public Criteria andEnteredDrIsNotNull() {
            addCriterion("ENTERED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredDrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_DR =", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrNotEqualTo(BigDecimal value) {
            addCriterion("ENTERED_DR <>", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrGreaterThan(BigDecimal value) {
            addCriterion("ENTERED_DR >", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_DR >=", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrLessThan(BigDecimal value) {
            addCriterion("ENTERED_DR <", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_DR <=", value, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrIn(List<BigDecimal> values) {
            addCriterion("ENTERED_DR in", values, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrNotIn(List<BigDecimal> values) {
            addCriterion("ENTERED_DR not in", values, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTERED_DR between", value1, value2, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTERED_DR not between", value1, value2, "enteredDr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrIsNull() {
            addCriterion("ENTERED_CR is null");
            return (Criteria) this;
        }

        public Criteria andEnteredCrIsNotNull() {
            addCriterion("ENTERED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredCrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_CR =", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrNotEqualTo(BigDecimal value) {
            addCriterion("ENTERED_CR <>", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrGreaterThan(BigDecimal value) {
            addCriterion("ENTERED_CR >", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_CR >=", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrLessThan(BigDecimal value) {
            addCriterion("ENTERED_CR <", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTERED_CR <=", value, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrIn(List<BigDecimal> values) {
            addCriterion("ENTERED_CR in", values, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrNotIn(List<BigDecimal> values) {
            addCriterion("ENTERED_CR not in", values, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTERED_CR between", value1, value2, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andEnteredCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTERED_CR not between", value1, value2, "enteredCr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrIsNull() {
            addCriterion("ACCOUNTED_DR is null");
            return (Criteria) this;
        }

        public Criteria andAccountedDrIsNotNull() {
            addCriterion("ACCOUNTED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountedDrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR =", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <>", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTED_DR >", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR >=", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrLessThan(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <=", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_DR in", values, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_DR not in", values, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_DR between", value1, value2, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_DR not between", value1, value2, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrIsNull() {
            addCriterion("ACCOUNTED_CR is null");
            return (Criteria) this;
        }

        public Criteria andAccountedCrIsNotNull() {
            addCriterion("ACCOUNTED_CR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountedCrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_CR =", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_CR <>", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTED_CR >", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_CR >=", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrLessThan(BigDecimal value) {
            addCriterion("ACCOUNTED_CR <", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_CR <=", value, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_CR in", values, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_CR not in", values, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_CR between", value1, value2, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAccountedCrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_CR not between", value1, value2, "accountedCr");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
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

        public Criteria andJelinenoIsNull() {
            addCriterion("JELINENO is null");
            return (Criteria) this;
        }

        public Criteria andJelinenoIsNotNull() {
            addCriterion("JELINENO is not null");
            return (Criteria) this;
        }

        public Criteria andJelinenoEqualTo(Long value) {
            addCriterion("JELINENO =", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoNotEqualTo(Long value) {
            addCriterion("JELINENO <>", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoGreaterThan(Long value) {
            addCriterion("JELINENO >", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoGreaterThanOrEqualTo(Long value) {
            addCriterion("JELINENO >=", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoLessThan(Long value) {
            addCriterion("JELINENO <", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoLessThanOrEqualTo(Long value) {
            addCriterion("JELINENO <=", value, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoIn(List<Long> values) {
            addCriterion("JELINENO in", values, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoNotIn(List<Long> values) {
            addCriterion("JELINENO not in", values, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoBetween(Long value1, Long value2) {
            addCriterion("JELINENO between", value1, value2, "jelineno");
            return (Criteria) this;
        }

        public Criteria andJelinenoNotBetween(Long value1, Long value2) {
            addCriterion("JELINENO not between", value1, value2, "jelineno");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNull() {
            addCriterion("SEGMENT9 is null");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNotNull() {
            addCriterion("SEGMENT9 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9EqualTo(String value) {
            addCriterion("SEGMENT9 =", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotEqualTo(String value) {
            addCriterion("SEGMENT9 <>", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThan(String value) {
            addCriterion("SEGMENT9 >", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 >=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThan(String value) {
            addCriterion("SEGMENT9 <", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 <=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Like(String value) {
            addCriterion("SEGMENT9 like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotLike(String value) {
            addCriterion("SEGMENT9 not like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9In(List<String> values) {
            addCriterion("SEGMENT9 in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotIn(List<String> values) {
            addCriterion("SEGMENT9 not in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Between(String value1, String value2) {
            addCriterion("SEGMENT9 between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotBetween(String value1, String value2) {
            addCriterion("SEGMENT9 not between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNull() {
            addCriterion("SEGMENT10 is null");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNotNull() {
            addCriterion("SEGMENT10 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10EqualTo(String value) {
            addCriterion("SEGMENT10 =", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotEqualTo(String value) {
            addCriterion("SEGMENT10 <>", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThan(String value) {
            addCriterion("SEGMENT10 >", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 >=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThan(String value) {
            addCriterion("SEGMENT10 <", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 <=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Like(String value) {
            addCriterion("SEGMENT10 like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotLike(String value) {
            addCriterion("SEGMENT10 not like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10In(List<String> values) {
            addCriterion("SEGMENT10 in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotIn(List<String> values) {
            addCriterion("SEGMENT10 not in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Between(String value1, String value2) {
            addCriterion("SEGMENT10 between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotBetween(String value1, String value2) {
            addCriterion("SEGMENT10 not between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNull() {
            addCriterion("SEGMENT11 is null");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNotNull() {
            addCriterion("SEGMENT11 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11EqualTo(String value) {
            addCriterion("SEGMENT11 =", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotEqualTo(String value) {
            addCriterion("SEGMENT11 <>", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThan(String value) {
            addCriterion("SEGMENT11 >", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 >=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThan(String value) {
            addCriterion("SEGMENT11 <", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 <=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Like(String value) {
            addCriterion("SEGMENT11 like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotLike(String value) {
            addCriterion("SEGMENT11 not like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11In(List<String> values) {
            addCriterion("SEGMENT11 in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotIn(List<String> values) {
            addCriterion("SEGMENT11 not in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Between(String value1, String value2) {
            addCriterion("SEGMENT11 between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotBetween(String value1, String value2) {
            addCriterion("SEGMENT11 not between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNull() {
            addCriterion("SEGMENT12 is null");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNotNull() {
            addCriterion("SEGMENT12 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12EqualTo(String value) {
            addCriterion("SEGMENT12 =", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotEqualTo(String value) {
            addCriterion("SEGMENT12 <>", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThan(String value) {
            addCriterion("SEGMENT12 >", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 >=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThan(String value) {
            addCriterion("SEGMENT12 <", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 <=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Like(String value) {
            addCriterion("SEGMENT12 like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotLike(String value) {
            addCriterion("SEGMENT12 not like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12In(List<String> values) {
            addCriterion("SEGMENT12 in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotIn(List<String> values) {
            addCriterion("SEGMENT12 not in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Between(String value1, String value2) {
            addCriterion("SEGMENT12 between", value1, value2, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotBetween(String value1, String value2) {
            addCriterion("SEGMENT12 not between", value1, value2, "segment12");
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

        public Criteria andSegment13IsNull() {
            addCriterion("SEGMENT13 is null");
            return (Criteria) this;
        }

        public Criteria andSegment13IsNotNull() {
            addCriterion("SEGMENT13 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment13EqualTo(String value) {
            addCriterion("SEGMENT13 =", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotEqualTo(String value) {
            addCriterion("SEGMENT13 <>", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThan(String value) {
            addCriterion("SEGMENT13 >", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 >=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThan(String value) {
            addCriterion("SEGMENT13 <", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 <=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Like(String value) {
            addCriterion("SEGMENT13 like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotLike(String value) {
            addCriterion("SEGMENT13 not like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13In(List<String> values) {
            addCriterion("SEGMENT13 in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotIn(List<String> values) {
            addCriterion("SEGMENT13 not in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Between(String value1, String value2) {
            addCriterion("SEGMENT13 between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotBetween(String value1, String value2) {
            addCriterion("SEGMENT13 not between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoIsNull() {
            addCriterion("BUSIDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoIsNotNull() {
            addCriterion("BUSIDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoEqualTo(Long value) {
            addCriterion("BUSIDETAILNO =", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoNotEqualTo(Long value) {
            addCriterion("BUSIDETAILNO <>", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoGreaterThan(Long value) {
            addCriterion("BUSIDETAILNO >", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSIDETAILNO >=", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoLessThan(Long value) {
            addCriterion("BUSIDETAILNO <", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoLessThanOrEqualTo(Long value) {
            addCriterion("BUSIDETAILNO <=", value, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoIn(List<Long> values) {
            addCriterion("BUSIDETAILNO in", values, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoNotIn(List<Long> values) {
            addCriterion("BUSIDETAILNO not in", values, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoBetween(Long value1, Long value2) {
            addCriterion("BUSIDETAILNO between", value1, value2, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andBusidetailnoNotBetween(Long value1, Long value2) {
            addCriterion("BUSIDETAILNO not between", value1, value2, "busidetailno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNull() {
            addCriterion("ATSBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNotNull() {
            addCriterion("ATSBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoEqualTo(String value) {
            addCriterion("ATSBILLNO =", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotEqualTo(String value) {
            addCriterion("ATSBILLNO <>", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThan(String value) {
            addCriterion("ATSBILLNO >", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO >=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThan(String value) {
            addCriterion("ATSBILLNO <", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO <=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLike(String value) {
            addCriterion("ATSBILLNO like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotLike(String value) {
            addCriterion("ATSBILLNO not like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIn(List<String> values) {
            addCriterion("ATSBILLNO in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotIn(List<String> values) {
            addCriterion("ATSBILLNO not in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoBetween(String value1, String value2) {
            addCriterion("ATSBILLNO between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotBetween(String value1, String value2) {
            addCriterion("ATSBILLNO not between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNull() {
            addCriterion("CONVERSIONRATE is null");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNotNull() {
            addCriterion("CONVERSIONRATE is not null");
            return (Criteria) this;
        }

        public Criteria andConversionrateEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE =", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE <>", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThan(BigDecimal value) {
            addCriterion("CONVERSIONRATE >", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE >=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThan(BigDecimal value) {
            addCriterion("CONVERSIONRATE <", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSIONRATE <=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateIn(List<BigDecimal> values) {
            addCriterion("CONVERSIONRATE in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotIn(List<BigDecimal> values) {
            addCriterion("CONVERSIONRATE not in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSIONRATE between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSIONRATE not between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNull() {
            addCriterion("SEGMENT14 is null");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNotNull() {
            addCriterion("SEGMENT14 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment14EqualTo(String value) {
            addCriterion("SEGMENT14 =", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotEqualTo(String value) {
            addCriterion("SEGMENT14 <>", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThan(String value) {
            addCriterion("SEGMENT14 >", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 >=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThan(String value) {
            addCriterion("SEGMENT14 <", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 <=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Like(String value) {
            addCriterion("SEGMENT14 like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotLike(String value) {
            addCriterion("SEGMENT14 not like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14In(List<String> values) {
            addCriterion("SEGMENT14 in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotIn(List<String> values) {
            addCriterion("SEGMENT14 not in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Between(String value1, String value2) {
            addCriterion("SEGMENT14 between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotBetween(String value1, String value2) {
            addCriterion("SEGMENT14 not between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNull() {
            addCriterion("SEGMENT15 is null");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNotNull() {
            addCriterion("SEGMENT15 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment15EqualTo(String value) {
            addCriterion("SEGMENT15 =", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotEqualTo(String value) {
            addCriterion("SEGMENT15 <>", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThan(String value) {
            addCriterion("SEGMENT15 >", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 >=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThan(String value) {
            addCriterion("SEGMENT15 <", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 <=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Like(String value) {
            addCriterion("SEGMENT15 like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotLike(String value) {
            addCriterion("SEGMENT15 not like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15In(List<String> values) {
            addCriterion("SEGMENT15 in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotIn(List<String> values) {
            addCriterion("SEGMENT15 not in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Between(String value1, String value2) {
            addCriterion("SEGMENT15 between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotBetween(String value1, String value2) {
            addCriterion("SEGMENT15 not between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNull() {
            addCriterion("SEGMENT16 is null");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNotNull() {
            addCriterion("SEGMENT16 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment16EqualTo(String value) {
            addCriterion("SEGMENT16 =", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotEqualTo(String value) {
            addCriterion("SEGMENT16 <>", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThan(String value) {
            addCriterion("SEGMENT16 >", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 >=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThan(String value) {
            addCriterion("SEGMENT16 <", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 <=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Like(String value) {
            addCriterion("SEGMENT16 like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotLike(String value) {
            addCriterion("SEGMENT16 not like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16In(List<String> values) {
            addCriterion("SEGMENT16 in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotIn(List<String> values) {
            addCriterion("SEGMENT16 not in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Between(String value1, String value2) {
            addCriterion("SEGMENT16 between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotBetween(String value1, String value2) {
            addCriterion("SEGMENT16 not between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNull() {
            addCriterion("SEGMENT17 is null");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNotNull() {
            addCriterion("SEGMENT17 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment17EqualTo(String value) {
            addCriterion("SEGMENT17 =", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotEqualTo(String value) {
            addCriterion("SEGMENT17 <>", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThan(String value) {
            addCriterion("SEGMENT17 >", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 >=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThan(String value) {
            addCriterion("SEGMENT17 <", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 <=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Like(String value) {
            addCriterion("SEGMENT17 like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotLike(String value) {
            addCriterion("SEGMENT17 not like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17In(List<String> values) {
            addCriterion("SEGMENT17 in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotIn(List<String> values) {
            addCriterion("SEGMENT17 not in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Between(String value1, String value2) {
            addCriterion("SEGMENT17 between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotBetween(String value1, String value2) {
            addCriterion("SEGMENT17 not between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNull() {
            addCriterion("SEGMENT18 is null");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNotNull() {
            addCriterion("SEGMENT18 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment18EqualTo(String value) {
            addCriterion("SEGMENT18 =", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotEqualTo(String value) {
            addCriterion("SEGMENT18 <>", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThan(String value) {
            addCriterion("SEGMENT18 >", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 >=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThan(String value) {
            addCriterion("SEGMENT18 <", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 <=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Like(String value) {
            addCriterion("SEGMENT18 like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotLike(String value) {
            addCriterion("SEGMENT18 not like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18In(List<String> values) {
            addCriterion("SEGMENT18 in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotIn(List<String> values) {
            addCriterion("SEGMENT18 not in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Between(String value1, String value2) {
            addCriterion("SEGMENT18 between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotBetween(String value1, String value2) {
            addCriterion("SEGMENT18 not between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNull() {
            addCriterion("SEGMENT19 is null");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNotNull() {
            addCriterion("SEGMENT19 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment19EqualTo(String value) {
            addCriterion("SEGMENT19 =", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotEqualTo(String value) {
            addCriterion("SEGMENT19 <>", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThan(String value) {
            addCriterion("SEGMENT19 >", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 >=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThan(String value) {
            addCriterion("SEGMENT19 <", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 <=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Like(String value) {
            addCriterion("SEGMENT19 like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotLike(String value) {
            addCriterion("SEGMENT19 not like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19In(List<String> values) {
            addCriterion("SEGMENT19 in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotIn(List<String> values) {
            addCriterion("SEGMENT19 not in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Between(String value1, String value2) {
            addCriterion("SEGMENT19 between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotBetween(String value1, String value2) {
            addCriterion("SEGMENT19 not between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNull() {
            addCriterion("SEGMENT20 is null");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNotNull() {
            addCriterion("SEGMENT20 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment20EqualTo(String value) {
            addCriterion("SEGMENT20 =", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotEqualTo(String value) {
            addCriterion("SEGMENT20 <>", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThan(String value) {
            addCriterion("SEGMENT20 >", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 >=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThan(String value) {
            addCriterion("SEGMENT20 <", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 <=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Like(String value) {
            addCriterion("SEGMENT20 like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotLike(String value) {
            addCriterion("SEGMENT20 not like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20In(List<String> values) {
            addCriterion("SEGMENT20 in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotIn(List<String> values) {
            addCriterion("SEGMENT20 not in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Between(String value1, String value2) {
            addCriterion("SEGMENT20 between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotBetween(String value1, String value2) {
            addCriterion("SEGMENT20 not between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNull() {
            addCriterion("SEGMENT21 is null");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNotNull() {
            addCriterion("SEGMENT21 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment21EqualTo(String value) {
            addCriterion("SEGMENT21 =", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotEqualTo(String value) {
            addCriterion("SEGMENT21 <>", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThan(String value) {
            addCriterion("SEGMENT21 >", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 >=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThan(String value) {
            addCriterion("SEGMENT21 <", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 <=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Like(String value) {
            addCriterion("SEGMENT21 like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotLike(String value) {
            addCriterion("SEGMENT21 not like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21In(List<String> values) {
            addCriterion("SEGMENT21 in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotIn(List<String> values) {
            addCriterion("SEGMENT21 not in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Between(String value1, String value2) {
            addCriterion("SEGMENT21 between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotBetween(String value1, String value2) {
            addCriterion("SEGMENT21 not between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNull() {
            addCriterion("SEGMENT22 is null");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNotNull() {
            addCriterion("SEGMENT22 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment22EqualTo(String value) {
            addCriterion("SEGMENT22 =", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotEqualTo(String value) {
            addCriterion("SEGMENT22 <>", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThan(String value) {
            addCriterion("SEGMENT22 >", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 >=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThan(String value) {
            addCriterion("SEGMENT22 <", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 <=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Like(String value) {
            addCriterion("SEGMENT22 like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotLike(String value) {
            addCriterion("SEGMENT22 not like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22In(List<String> values) {
            addCriterion("SEGMENT22 in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotIn(List<String> values) {
            addCriterion("SEGMENT22 not in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Between(String value1, String value2) {
            addCriterion("SEGMENT22 between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotBetween(String value1, String value2) {
            addCriterion("SEGMENT22 not between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNull() {
            addCriterion("SEGMENT23 is null");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNotNull() {
            addCriterion("SEGMENT23 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment23EqualTo(String value) {
            addCriterion("SEGMENT23 =", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotEqualTo(String value) {
            addCriterion("SEGMENT23 <>", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThan(String value) {
            addCriterion("SEGMENT23 >", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 >=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThan(String value) {
            addCriterion("SEGMENT23 <", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 <=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Like(String value) {
            addCriterion("SEGMENT23 like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotLike(String value) {
            addCriterion("SEGMENT23 not like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23In(List<String> values) {
            addCriterion("SEGMENT23 in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotIn(List<String> values) {
            addCriterion("SEGMENT23 not in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Between(String value1, String value2) {
            addCriterion("SEGMENT23 between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotBetween(String value1, String value2) {
            addCriterion("SEGMENT23 not between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNull() {
            addCriterion("SEGMENT24 is null");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNotNull() {
            addCriterion("SEGMENT24 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment24EqualTo(String value) {
            addCriterion("SEGMENT24 =", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotEqualTo(String value) {
            addCriterion("SEGMENT24 <>", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThan(String value) {
            addCriterion("SEGMENT24 >", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 >=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThan(String value) {
            addCriterion("SEGMENT24 <", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 <=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Like(String value) {
            addCriterion("SEGMENT24 like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotLike(String value) {
            addCriterion("SEGMENT24 not like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24In(List<String> values) {
            addCriterion("SEGMENT24 in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotIn(List<String> values) {
            addCriterion("SEGMENT24 not in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Between(String value1, String value2) {
            addCriterion("SEGMENT24 between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotBetween(String value1, String value2) {
            addCriterion("SEGMENT24 not between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNull() {
            addCriterion("SEGMENT25 is null");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNotNull() {
            addCriterion("SEGMENT25 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment25EqualTo(String value) {
            addCriterion("SEGMENT25 =", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotEqualTo(String value) {
            addCriterion("SEGMENT25 <>", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThan(String value) {
            addCriterion("SEGMENT25 >", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 >=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThan(String value) {
            addCriterion("SEGMENT25 <", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 <=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Like(String value) {
            addCriterion("SEGMENT25 like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotLike(String value) {
            addCriterion("SEGMENT25 not like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25In(List<String> values) {
            addCriterion("SEGMENT25 in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotIn(List<String> values) {
            addCriterion("SEGMENT25 not in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Between(String value1, String value2) {
            addCriterion("SEGMENT25 between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotBetween(String value1, String value2) {
            addCriterion("SEGMENT25 not between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNull() {
            addCriterion("SEGMENT26 is null");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNotNull() {
            addCriterion("SEGMENT26 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment26EqualTo(String value) {
            addCriterion("SEGMENT26 =", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotEqualTo(String value) {
            addCriterion("SEGMENT26 <>", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThan(String value) {
            addCriterion("SEGMENT26 >", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 >=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThan(String value) {
            addCriterion("SEGMENT26 <", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 <=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Like(String value) {
            addCriterion("SEGMENT26 like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotLike(String value) {
            addCriterion("SEGMENT26 not like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26In(List<String> values) {
            addCriterion("SEGMENT26 in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotIn(List<String> values) {
            addCriterion("SEGMENT26 not in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Between(String value1, String value2) {
            addCriterion("SEGMENT26 between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotBetween(String value1, String value2) {
            addCriterion("SEGMENT26 not between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNull() {
            addCriterion("SEGMENT27 is null");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNotNull() {
            addCriterion("SEGMENT27 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment27EqualTo(String value) {
            addCriterion("SEGMENT27 =", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotEqualTo(String value) {
            addCriterion("SEGMENT27 <>", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThan(String value) {
            addCriterion("SEGMENT27 >", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 >=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThan(String value) {
            addCriterion("SEGMENT27 <", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 <=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Like(String value) {
            addCriterion("SEGMENT27 like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotLike(String value) {
            addCriterion("SEGMENT27 not like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27In(List<String> values) {
            addCriterion("SEGMENT27 in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotIn(List<String> values) {
            addCriterion("SEGMENT27 not in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Between(String value1, String value2) {
            addCriterion("SEGMENT27 between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotBetween(String value1, String value2) {
            addCriterion("SEGMENT27 not between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNull() {
            addCriterion("SEGMENT28 is null");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNotNull() {
            addCriterion("SEGMENT28 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment28EqualTo(String value) {
            addCriterion("SEGMENT28 =", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotEqualTo(String value) {
            addCriterion("SEGMENT28 <>", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThan(String value) {
            addCriterion("SEGMENT28 >", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 >=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThan(String value) {
            addCriterion("SEGMENT28 <", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 <=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Like(String value) {
            addCriterion("SEGMENT28 like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotLike(String value) {
            addCriterion("SEGMENT28 not like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28In(List<String> values) {
            addCriterion("SEGMENT28 in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotIn(List<String> values) {
            addCriterion("SEGMENT28 not in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Between(String value1, String value2) {
            addCriterion("SEGMENT28 between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotBetween(String value1, String value2) {
            addCriterion("SEGMENT28 not between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNull() {
            addCriterion("SEGMENT29 is null");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNotNull() {
            addCriterion("SEGMENT29 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment29EqualTo(String value) {
            addCriterion("SEGMENT29 =", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotEqualTo(String value) {
            addCriterion("SEGMENT29 <>", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThan(String value) {
            addCriterion("SEGMENT29 >", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 >=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThan(String value) {
            addCriterion("SEGMENT29 <", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 <=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Like(String value) {
            addCriterion("SEGMENT29 like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotLike(String value) {
            addCriterion("SEGMENT29 not like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29In(List<String> values) {
            addCriterion("SEGMENT29 in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotIn(List<String> values) {
            addCriterion("SEGMENT29 not in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Between(String value1, String value2) {
            addCriterion("SEGMENT29 between", value1, value2, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotBetween(String value1, String value2) {
            addCriterion("SEGMENT29 not between", value1, value2, "segment29");
            return (Criteria) this;
        }

        public Criteria andBankabstractIsNull() {
            addCriterion("BANKABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andBankabstractIsNotNull() {
            addCriterion("BANKABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andBankabstractEqualTo(String value) {
            addCriterion("BANKABSTRACT =", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotEqualTo(String value) {
            addCriterion("BANKABSTRACT <>", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractGreaterThan(String value) {
            addCriterion("BANKABSTRACT >", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractGreaterThanOrEqualTo(String value) {
            addCriterion("BANKABSTRACT >=", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLessThan(String value) {
            addCriterion("BANKABSTRACT <", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLessThanOrEqualTo(String value) {
            addCriterion("BANKABSTRACT <=", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLike(String value) {
            addCriterion("BANKABSTRACT like", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotLike(String value) {
            addCriterion("BANKABSTRACT not like", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractIn(List<String> values) {
            addCriterion("BANKABSTRACT in", values, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotIn(List<String> values) {
            addCriterion("BANKABSTRACT not in", values, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractBetween(String value1, String value2) {
            addCriterion("BANKABSTRACT between", value1, value2, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotBetween(String value1, String value2) {
            addCriterion("BANKABSTRACT not between", value1, value2, "bankabstract");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_voucherdetail_td
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
     * @Table : mm_voucherdetail_td
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