package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmMatchcancelDetailTdExample {
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
    public MmMatchcancelDetailTdExample() {
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
     * @Table : mm_matchcancel_detail_td
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

        public Criteria andMainidIsNull() {
            addCriterion("MAINID is null");
            return (Criteria) this;
        }

        public Criteria andMainidIsNotNull() {
            addCriterion("MAINID is not null");
            return (Criteria) this;
        }

        public Criteria andMainidEqualTo(Long value) {
            addCriterion("MAINID =", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotEqualTo(Long value) {
            addCriterion("MAINID <>", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThan(Long value) {
            addCriterion("MAINID >", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThanOrEqualTo(Long value) {
            addCriterion("MAINID >=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThan(Long value) {
            addCriterion("MAINID <", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThanOrEqualTo(Long value) {
            addCriterion("MAINID <=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidIn(List<Long> values) {
            addCriterion("MAINID in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotIn(List<Long> values) {
            addCriterion("MAINID not in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidBetween(Long value1, Long value2) {
            addCriterion("MAINID between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotBetween(Long value1, Long value2) {
            addCriterion("MAINID not between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(Long value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(Long value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(Long value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(Long value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(Long value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(Long value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<Long> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<Long> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(Long value1, Long value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(Long value1, Long value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
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

        public Criteria andDestnoIsNull() {
            addCriterion("DESTNO is null");
            return (Criteria) this;
        }

        public Criteria andDestnoIsNotNull() {
            addCriterion("DESTNO is not null");
            return (Criteria) this;
        }

        public Criteria andDestnoEqualTo(BigDecimal value) {
            addCriterion("DESTNO =", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoNotEqualTo(BigDecimal value) {
            addCriterion("DESTNO <>", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoGreaterThan(BigDecimal value) {
            addCriterion("DESTNO >", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTNO >=", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoLessThan(BigDecimal value) {
            addCriterion("DESTNO <", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTNO <=", value, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoIn(List<BigDecimal> values) {
            addCriterion("DESTNO in", values, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoNotIn(List<BigDecimal> values) {
            addCriterion("DESTNO not in", values, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTNO between", value1, value2, "destno");
            return (Criteria) this;
        }

        public Criteria andDestnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTNO not between", value1, value2, "destno");
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

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(BigDecimal value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(BigDecimal value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(BigDecimal value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(BigDecimal value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<BigDecimal> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<BigDecimal> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andIsdestIsNull() {
            addCriterion("ISDEST is null");
            return (Criteria) this;
        }

        public Criteria andIsdestIsNotNull() {
            addCriterion("ISDEST is not null");
            return (Criteria) this;
        }

        public Criteria andIsdestEqualTo(String value) {
            addCriterion("ISDEST =", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestNotEqualTo(String value) {
            addCriterion("ISDEST <>", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestGreaterThan(String value) {
            addCriterion("ISDEST >", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEST >=", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestLessThan(String value) {
            addCriterion("ISDEST <", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestLessThanOrEqualTo(String value) {
            addCriterion("ISDEST <=", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestLike(String value) {
            addCriterion("ISDEST like", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestNotLike(String value) {
            addCriterion("ISDEST not like", value, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestIn(List<String> values) {
            addCriterion("ISDEST in", values, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestNotIn(List<String> values) {
            addCriterion("ISDEST not in", values, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestBetween(String value1, String value2) {
            addCriterion("ISDEST between", value1, value2, "isdest");
            return (Criteria) this;
        }

        public Criteria andIsdestNotBetween(String value1, String value2) {
            addCriterion("ISDEST not between", value1, value2, "isdest");
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

        public Criteria andDestdetailnoIsNull() {
            addCriterion("DESTDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoIsNotNull() {
            addCriterion("DESTDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoEqualTo(BigDecimal value) {
            addCriterion("DESTDETAILNO =", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoNotEqualTo(BigDecimal value) {
            addCriterion("DESTDETAILNO <>", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoGreaterThan(BigDecimal value) {
            addCriterion("DESTDETAILNO >", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTDETAILNO >=", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoLessThan(BigDecimal value) {
            addCriterion("DESTDETAILNO <", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTDETAILNO <=", value, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoIn(List<BigDecimal> values) {
            addCriterion("DESTDETAILNO in", values, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoNotIn(List<BigDecimal> values) {
            addCriterion("DESTDETAILNO not in", values, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTDETAILNO between", value1, value2, "destdetailno");
            return (Criteria) this;
        }

        public Criteria andDestdetailnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTDETAILNO not between", value1, value2, "destdetailno");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_matchcancel_detail_td
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
     * @Table : mm_matchcancel_detail_td
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