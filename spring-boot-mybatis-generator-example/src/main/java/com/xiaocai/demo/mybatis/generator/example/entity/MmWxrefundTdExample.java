package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmWxrefundTdExample {
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
    public MmWxrefundTdExample() {
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
     * @Table : mm_wxrefund_td
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

        public Criteria andPayappnoIsNull() {
            addCriterion("PAYAPPNO is null");
            return (Criteria) this;
        }

        public Criteria andPayappnoIsNotNull() {
            addCriterion("PAYAPPNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayappnoEqualTo(String value) {
            addCriterion("PAYAPPNO =", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoNotEqualTo(String value) {
            addCriterion("PAYAPPNO <>", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoGreaterThan(String value) {
            addCriterion("PAYAPPNO >", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYAPPNO >=", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoLessThan(String value) {
            addCriterion("PAYAPPNO <", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoLessThanOrEqualTo(String value) {
            addCriterion("PAYAPPNO <=", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoLike(String value) {
            addCriterion("PAYAPPNO like", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoNotLike(String value) {
            addCriterion("PAYAPPNO not like", value, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoIn(List<String> values) {
            addCriterion("PAYAPPNO in", values, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoNotIn(List<String> values) {
            addCriterion("PAYAPPNO not in", values, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoBetween(String value1, String value2) {
            addCriterion("PAYAPPNO between", value1, value2, "payappno");
            return (Criteria) this;
        }

        public Criteria andPayappnoNotBetween(String value1, String value2) {
            addCriterion("PAYAPPNO not between", value1, value2, "payappno");
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

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andMchidIsNull() {
            addCriterion("MCHID is null");
            return (Criteria) this;
        }

        public Criteria andMchidIsNotNull() {
            addCriterion("MCHID is not null");
            return (Criteria) this;
        }

        public Criteria andMchidEqualTo(String value) {
            addCriterion("MCHID =", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotEqualTo(String value) {
            addCriterion("MCHID <>", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThan(String value) {
            addCriterion("MCHID >", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThanOrEqualTo(String value) {
            addCriterion("MCHID >=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThan(String value) {
            addCriterion("MCHID <", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThanOrEqualTo(String value) {
            addCriterion("MCHID <=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLike(String value) {
            addCriterion("MCHID like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotLike(String value) {
            addCriterion("MCHID not like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidIn(List<String> values) {
            addCriterion("MCHID in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotIn(List<String> values) {
            addCriterion("MCHID not in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidBetween(String value1, String value2) {
            addCriterion("MCHID between", value1, value2, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotBetween(String value1, String value2) {
            addCriterion("MCHID not between", value1, value2, "mchid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNull() {
            addCriterion("TRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("TRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(String value) {
            addCriterion("TRANSACTIONID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(String value) {
            addCriterion("TRANSACTIONID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(String value) {
            addCriterion("TRANSACTIONID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(String value) {
            addCriterion("TRANSACTIONID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLike(String value) {
            addCriterion("TRANSACTIONID like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotLike(String value) {
            addCriterion("TRANSACTIONID not like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<String> values) {
            addCriterion("TRANSACTIONID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<String> values) {
            addCriterion("TRANSACTIONID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(String value1, String value2) {
            addCriterion("TRANSACTIONID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONID not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNull() {
            addCriterion("REFUNDID is null");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNotNull() {
            addCriterion("REFUNDID is not null");
            return (Criteria) this;
        }

        public Criteria andRefundidEqualTo(String value) {
            addCriterion("REFUNDID =", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotEqualTo(String value) {
            addCriterion("REFUNDID <>", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThan(String value) {
            addCriterion("REFUNDID >", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDID >=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThan(String value) {
            addCriterion("REFUNDID <", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThanOrEqualTo(String value) {
            addCriterion("REFUNDID <=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLike(String value) {
            addCriterion("REFUNDID like", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotLike(String value) {
            addCriterion("REFUNDID not like", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidIn(List<String> values) {
            addCriterion("REFUNDID in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotIn(List<String> values) {
            addCriterion("REFUNDID not in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidBetween(String value1, String value2) {
            addCriterion("REFUNDID between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotBetween(String value1, String value2) {
            addCriterion("REFUNDID not between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoIsNull() {
            addCriterion("OUTREFUNDNO is null");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoIsNotNull() {
            addCriterion("OUTREFUNDNO is not null");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoEqualTo(String value) {
            addCriterion("OUTREFUNDNO =", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoNotEqualTo(String value) {
            addCriterion("OUTREFUNDNO <>", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoGreaterThan(String value) {
            addCriterion("OUTREFUNDNO >", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoGreaterThanOrEqualTo(String value) {
            addCriterion("OUTREFUNDNO >=", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoLessThan(String value) {
            addCriterion("OUTREFUNDNO <", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoLessThanOrEqualTo(String value) {
            addCriterion("OUTREFUNDNO <=", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoLike(String value) {
            addCriterion("OUTREFUNDNO like", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoNotLike(String value) {
            addCriterion("OUTREFUNDNO not like", value, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoIn(List<String> values) {
            addCriterion("OUTREFUNDNO in", values, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoNotIn(List<String> values) {
            addCriterion("OUTREFUNDNO not in", values, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoBetween(String value1, String value2) {
            addCriterion("OUTREFUNDNO between", value1, value2, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOutrefundnoNotBetween(String value1, String value2) {
            addCriterion("OUTREFUNDNO not between", value1, value2, "outrefundno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIsNull() {
            addCriterion("OUTTRADENO is null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIsNotNull() {
            addCriterion("OUTTRADENO is not null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoEqualTo(String value) {
            addCriterion("OUTTRADENO =", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotEqualTo(String value) {
            addCriterion("OUTTRADENO <>", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThan(String value) {
            addCriterion("OUTTRADENO >", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThanOrEqualTo(String value) {
            addCriterion("OUTTRADENO >=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThan(String value) {
            addCriterion("OUTTRADENO <", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThanOrEqualTo(String value) {
            addCriterion("OUTTRADENO <=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLike(String value) {
            addCriterion("OUTTRADENO like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotLike(String value) {
            addCriterion("OUTTRADENO not like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIn(List<String> values) {
            addCriterion("OUTTRADENO in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotIn(List<String> values) {
            addCriterion("OUTTRADENO not in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoBetween(String value1, String value2) {
            addCriterion("OUTTRADENO between", value1, value2, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotBetween(String value1, String value2) {
            addCriterion("OUTTRADENO not between", value1, value2, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andRefunddescIsNull() {
            addCriterion("REFUNDDESC is null");
            return (Criteria) this;
        }

        public Criteria andRefunddescIsNotNull() {
            addCriterion("REFUNDDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddescEqualTo(String value) {
            addCriterion("REFUNDDESC =", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescNotEqualTo(String value) {
            addCriterion("REFUNDDESC <>", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescGreaterThan(String value) {
            addCriterion("REFUNDDESC >", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDDESC >=", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescLessThan(String value) {
            addCriterion("REFUNDDESC <", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescLessThanOrEqualTo(String value) {
            addCriterion("REFUNDDESC <=", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescLike(String value) {
            addCriterion("REFUNDDESC like", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescNotLike(String value) {
            addCriterion("REFUNDDESC not like", value, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescIn(List<String> values) {
            addCriterion("REFUNDDESC in", values, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescNotIn(List<String> values) {
            addCriterion("REFUNDDESC not in", values, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescBetween(String value1, String value2) {
            addCriterion("REFUNDDESC between", value1, value2, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andRefunddescNotBetween(String value1, String value2) {
            addCriterion("REFUNDDESC not between", value1, value2, "refunddesc");
            return (Criteria) this;
        }

        public Criteria andApplicantnoIsNull() {
            addCriterion("APPLICANTNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnoIsNotNull() {
            addCriterion("APPLICANTNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnoEqualTo(String value) {
            addCriterion("APPLICANTNO =", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotEqualTo(String value) {
            addCriterion("APPLICANTNO <>", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoGreaterThan(String value) {
            addCriterion("APPLICANTNO >", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNO >=", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLessThan(String value) {
            addCriterion("APPLICANTNO <", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNO <=", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoLike(String value) {
            addCriterion("APPLICANTNO like", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotLike(String value) {
            addCriterion("APPLICANTNO not like", value, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoIn(List<String> values) {
            addCriterion("APPLICANTNO in", values, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotIn(List<String> values) {
            addCriterion("APPLICANTNO not in", values, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoBetween(String value1, String value2) {
            addCriterion("APPLICANTNO between", value1, value2, "applicantno");
            return (Criteria) this;
        }

        public Criteria andApplicantnoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNO not between", value1, value2, "applicantno");
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

        public Criteria andNotifyurlIsNull() {
            addCriterion("NOTIFYURL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyurlIsNotNull() {
            addCriterion("NOTIFYURL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyurlEqualTo(String value) {
            addCriterion("NOTIFYURL =", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotEqualTo(String value) {
            addCriterion("NOTIFYURL <>", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlGreaterThan(String value) {
            addCriterion("NOTIFYURL >", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFYURL >=", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLessThan(String value) {
            addCriterion("NOTIFYURL <", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFYURL <=", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLike(String value) {
            addCriterion("NOTIFYURL like", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotLike(String value) {
            addCriterion("NOTIFYURL not like", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlIn(List<String> values) {
            addCriterion("NOTIFYURL in", values, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotIn(List<String> values) {
            addCriterion("NOTIFYURL not in", values, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlBetween(String value1, String value2) {
            addCriterion("NOTIFYURL between", value1, value2, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotBetween(String value1, String value2) {
            addCriterion("NOTIFYURL not between", value1, value2, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNull() {
            addCriterion("RETURNCODE is null");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNotNull() {
            addCriterion("RETURNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturncodeEqualTo(String value) {
            addCriterion("RETURNCODE =", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotEqualTo(String value) {
            addCriterion("RETURNCODE <>", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThan(String value) {
            addCriterion("RETURNCODE >", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNCODE >=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThan(String value) {
            addCriterion("RETURNCODE <", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThanOrEqualTo(String value) {
            addCriterion("RETURNCODE <=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLike(String value) {
            addCriterion("RETURNCODE like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotLike(String value) {
            addCriterion("RETURNCODE not like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeIn(List<String> values) {
            addCriterion("RETURNCODE in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotIn(List<String> values) {
            addCriterion("RETURNCODE not in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeBetween(String value1, String value2) {
            addCriterion("RETURNCODE between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotBetween(String value1, String value2) {
            addCriterion("RETURNCODE not between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNull() {
            addCriterion("RETURNMSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIsNotNull() {
            addCriterion("RETURNMSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmsgEqualTo(String value) {
            addCriterion("RETURNMSG =", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotEqualTo(String value) {
            addCriterion("RETURNMSG <>", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThan(String value) {
            addCriterion("RETURNMSG >", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNMSG >=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThan(String value) {
            addCriterion("RETURNMSG <", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLessThanOrEqualTo(String value) {
            addCriterion("RETURNMSG <=", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgLike(String value) {
            addCriterion("RETURNMSG like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotLike(String value) {
            addCriterion("RETURNMSG not like", value, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgIn(List<String> values) {
            addCriterion("RETURNMSG in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotIn(List<String> values) {
            addCriterion("RETURNMSG not in", values, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgBetween(String value1, String value2) {
            addCriterion("RETURNMSG between", value1, value2, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andReturnmsgNotBetween(String value1, String value2) {
            addCriterion("RETURNMSG not between", value1, value2, "returnmsg");
            return (Criteria) this;
        }

        public Criteria andResultcodeIsNull() {
            addCriterion("RESULTCODE is null");
            return (Criteria) this;
        }

        public Criteria andResultcodeIsNotNull() {
            addCriterion("RESULTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultcodeEqualTo(String value) {
            addCriterion("RESULTCODE =", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotEqualTo(String value) {
            addCriterion("RESULTCODE <>", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeGreaterThan(String value) {
            addCriterion("RESULTCODE >", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTCODE >=", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLessThan(String value) {
            addCriterion("RESULTCODE <", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLessThanOrEqualTo(String value) {
            addCriterion("RESULTCODE <=", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLike(String value) {
            addCriterion("RESULTCODE like", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotLike(String value) {
            addCriterion("RESULTCODE not like", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeIn(List<String> values) {
            addCriterion("RESULTCODE in", values, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotIn(List<String> values) {
            addCriterion("RESULTCODE not in", values, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeBetween(String value1, String value2) {
            addCriterion("RESULTCODE between", value1, value2, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotBetween(String value1, String value2) {
            addCriterion("RESULTCODE not between", value1, value2, "resultcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNull() {
            addCriterion("ERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNotNull() {
            addCriterion("ERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrcodeEqualTo(String value) {
            addCriterion("ERRCODE =", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotEqualTo(String value) {
            addCriterion("ERRCODE <>", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThan(String value) {
            addCriterion("ERRCODE >", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERRCODE >=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThan(String value) {
            addCriterion("ERRCODE <", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThanOrEqualTo(String value) {
            addCriterion("ERRCODE <=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLike(String value) {
            addCriterion("ERRCODE like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotLike(String value) {
            addCriterion("ERRCODE not like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIn(List<String> values) {
            addCriterion("ERRCODE in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotIn(List<String> values) {
            addCriterion("ERRCODE not in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeBetween(String value1, String value2) {
            addCriterion("ERRCODE between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotBetween(String value1, String value2) {
            addCriterion("ERRCODE not between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIsNull() {
            addCriterion("ERR_CODE_DES is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIsNotNull() {
            addCriterion("ERR_CODE_DES is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesEqualTo(String value) {
            addCriterion("ERR_CODE_DES =", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotEqualTo(String value) {
            addCriterion("ERR_CODE_DES <>", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesGreaterThan(String value) {
            addCriterion("ERR_CODE_DES >", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_CODE_DES >=", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLessThan(String value) {
            addCriterion("ERR_CODE_DES <", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLessThanOrEqualTo(String value) {
            addCriterion("ERR_CODE_DES <=", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLike(String value) {
            addCriterion("ERR_CODE_DES like", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotLike(String value) {
            addCriterion("ERR_CODE_DES not like", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIn(List<String> values) {
            addCriterion("ERR_CODE_DES in", values, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotIn(List<String> values) {
            addCriterion("ERR_CODE_DES not in", values, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesBetween(String value1, String value2) {
            addCriterion("ERR_CODE_DES between", value1, value2, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotBetween(String value1, String value2) {
            addCriterion("ERR_CODE_DES not between", value1, value2, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andRefundcountIsNull() {
            addCriterion("REFUNDCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundcountIsNotNull() {
            addCriterion("REFUNDCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundcountEqualTo(String value) {
            addCriterion("REFUNDCOUNT =", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountNotEqualTo(String value) {
            addCriterion("REFUNDCOUNT <>", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountGreaterThan(String value) {
            addCriterion("REFUNDCOUNT >", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDCOUNT >=", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountLessThan(String value) {
            addCriterion("REFUNDCOUNT <", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountLessThanOrEqualTo(String value) {
            addCriterion("REFUNDCOUNT <=", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountLike(String value) {
            addCriterion("REFUNDCOUNT like", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountNotLike(String value) {
            addCriterion("REFUNDCOUNT not like", value, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountIn(List<String> values) {
            addCriterion("REFUNDCOUNT in", values, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountNotIn(List<String> values) {
            addCriterion("REFUNDCOUNT not in", values, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountBetween(String value1, String value2) {
            addCriterion("REFUNDCOUNT between", value1, value2, "refundcount");
            return (Criteria) this;
        }

        public Criteria andRefundcountNotBetween(String value1, String value2) {
            addCriterion("REFUNDCOUNT not between", value1, value2, "refundcount");
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

        public Criteria andAmountEqualTo(String value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIsNull() {
            addCriterion("REFUNDFEE is null");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIsNotNull() {
            addCriterion("REFUNDFEE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundfeeEqualTo(String value) {
            addCriterion("REFUNDFEE =", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotEqualTo(String value) {
            addCriterion("REFUNDFEE <>", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeGreaterThan(String value) {
            addCriterion("REFUNDFEE >", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDFEE >=", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLessThan(String value) {
            addCriterion("REFUNDFEE <", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLessThanOrEqualTo(String value) {
            addCriterion("REFUNDFEE <=", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLike(String value) {
            addCriterion("REFUNDFEE like", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotLike(String value) {
            addCriterion("REFUNDFEE not like", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIn(List<String> values) {
            addCriterion("REFUNDFEE in", values, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotIn(List<String> values) {
            addCriterion("REFUNDFEE not in", values, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeBetween(String value1, String value2) {
            addCriterion("REFUNDFEE between", value1, value2, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotBetween(String value1, String value2) {
            addCriterion("REFUNDFEE not between", value1, value2, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNull() {
            addCriterion("REFUNDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("REFUNDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(String value) {
            addCriterion("REFUNDSTATUS =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(String value) {
            addCriterion("REFUNDSTATUS <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(String value) {
            addCriterion("REFUNDSTATUS >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(String value) {
            addCriterion("REFUNDSTATUS <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLike(String value) {
            addCriterion("REFUNDSTATUS like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotLike(String value) {
            addCriterion("REFUNDSTATUS not like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<String> values) {
            addCriterion("REFUNDSTATUS in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<String> values) {
            addCriterion("REFUNDSTATUS not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS not between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutIsNull() {
            addCriterion("REFUND_RECV_ACCOUT is null");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutIsNotNull() {
            addCriterion("REFUND_RECV_ACCOUT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT =", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT <>", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutGreaterThan(String value) {
            addCriterion("REFUND_RECV_ACCOUT >", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT >=", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLessThan(String value) {
            addCriterion("REFUND_RECV_ACCOUT <", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLessThanOrEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT <=", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLike(String value) {
            addCriterion("REFUND_RECV_ACCOUT like", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotLike(String value) {
            addCriterion("REFUND_RECV_ACCOUT not like", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutIn(List<String> values) {
            addCriterion("REFUND_RECV_ACCOUT in", values, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotIn(List<String> values) {
            addCriterion("REFUND_RECV_ACCOUT not in", values, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutBetween(String value1, String value2) {
            addCriterion("REFUND_RECV_ACCOUT between", value1, value2, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotBetween(String value1, String value2) {
            addCriterion("REFUND_RECV_ACCOUT not between", value1, value2, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNull() {
            addCriterion("REFUND_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNotNull() {
            addCriterion("REFUND_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME =", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME <>", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME >", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME >=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThan(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME <", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME <=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIn(List<Date> values) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME not in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFUND_SUCCESS_TIME not between", value1, value2, "refundSuccessTime");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_wxrefund_td
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
     * @Table : mm_wxrefund_td
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