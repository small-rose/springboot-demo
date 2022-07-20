package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BfpTransactionTdExample {
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
    public BfpTransactionTdExample() {
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
     * @Table : bfp_transaction_td
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

        public Criteria andBalanceidIsNull() {
            addCriterion("BALANCEID is null");
            return (Criteria) this;
        }

        public Criteria andBalanceidIsNotNull() {
            addCriterion("BALANCEID is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceidEqualTo(BigDecimal value) {
            addCriterion("BALANCEID =", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotEqualTo(BigDecimal value) {
            addCriterion("BALANCEID <>", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThan(BigDecimal value) {
            addCriterion("BALANCEID >", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCEID >=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThan(BigDecimal value) {
            addCriterion("BALANCEID <", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCEID <=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidIn(List<BigDecimal> values) {
            addCriterion("BALANCEID in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotIn(List<BigDecimal> values) {
            addCriterion("BALANCEID not in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCEID between", value1, value2, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCEID not between", value1, value2, "balanceid");
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

        public Criteria andBstatusIsNull() {
            addCriterion("BSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNotNull() {
            addCriterion("BSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBstatusEqualTo(String value) {
            addCriterion("BSTATUS =", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotEqualTo(String value) {
            addCriterion("BSTATUS <>", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThan(String value) {
            addCriterion("BSTATUS >", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BSTATUS >=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThan(String value) {
            addCriterion("BSTATUS <", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThanOrEqualTo(String value) {
            addCriterion("BSTATUS <=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLike(String value) {
            addCriterion("BSTATUS like", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotLike(String value) {
            addCriterion("BSTATUS not like", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusIn(List<String> values) {
            addCriterion("BSTATUS in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotIn(List<String> values) {
            addCriterion("BSTATUS not in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusBetween(String value1, String value2) {
            addCriterion("BSTATUS between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotBetween(String value1, String value2) {
            addCriterion("BSTATUS not between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andAbstractnoIsNull() {
            addCriterion("ABSTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andAbstractnoIsNotNull() {
            addCriterion("ABSTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractnoEqualTo(String value) {
            addCriterion("ABSTRACTNO =", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoNotEqualTo(String value) {
            addCriterion("ABSTRACTNO <>", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoGreaterThan(String value) {
            addCriterion("ABSTRACTNO >", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoGreaterThanOrEqualTo(String value) {
            addCriterion("ABSTRACTNO >=", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoLessThan(String value) {
            addCriterion("ABSTRACTNO <", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoLessThanOrEqualTo(String value) {
            addCriterion("ABSTRACTNO <=", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoLike(String value) {
            addCriterion("ABSTRACTNO like", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoNotLike(String value) {
            addCriterion("ABSTRACTNO not like", value, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoIn(List<String> values) {
            addCriterion("ABSTRACTNO in", values, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoNotIn(List<String> values) {
            addCriterion("ABSTRACTNO not in", values, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoBetween(String value1, String value2) {
            addCriterion("ABSTRACTNO between", value1, value2, "abstractno");
            return (Criteria) this;
        }

        public Criteria andAbstractnoNotBetween(String value1, String value2) {
            addCriterion("ABSTRACTNO not between", value1, value2, "abstractno");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
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

        public Criteria andMarkstatusIsNull() {
            addCriterion("MARKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andMarkstatusIsNotNull() {
            addCriterion("MARKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMarkstatusEqualTo(String value) {
            addCriterion("MARKSTATUS =", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotEqualTo(String value) {
            addCriterion("MARKSTATUS <>", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusGreaterThan(String value) {
            addCriterion("MARKSTATUS >", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARKSTATUS >=", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusLessThan(String value) {
            addCriterion("MARKSTATUS <", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusLessThanOrEqualTo(String value) {
            addCriterion("MARKSTATUS <=", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusLike(String value) {
            addCriterion("MARKSTATUS like", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotLike(String value) {
            addCriterion("MARKSTATUS not like", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusIn(List<String> values) {
            addCriterion("MARKSTATUS in", values, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotIn(List<String> values) {
            addCriterion("MARKSTATUS not in", values, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusBetween(String value1, String value2) {
            addCriterion("MARKSTATUS between", value1, value2, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotBetween(String value1, String value2) {
            addCriterion("MARKSTATUS not between", value1, value2, "markstatus");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("PAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("PAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("PAYNAME =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("PAYNAME <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("PAYNAME >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYNAME >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("PAYNAME <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("PAYNAME <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("PAYNAME like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("PAYNAME not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("PAYNAME in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("PAYNAME not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("PAYNAME between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("PAYNAME not between", value1, value2, "payname");
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

        public Criteria andIfbalanceIsNull() {
            addCriterion("IFBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andIfbalanceIsNotNull() {
            addCriterion("IFBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIfbalanceEqualTo(String value) {
            addCriterion("IFBALANCE =", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceNotEqualTo(String value) {
            addCriterion("IFBALANCE <>", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceGreaterThan(String value) {
            addCriterion("IFBALANCE >", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("IFBALANCE >=", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceLessThan(String value) {
            addCriterion("IFBALANCE <", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceLessThanOrEqualTo(String value) {
            addCriterion("IFBALANCE <=", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceLike(String value) {
            addCriterion("IFBALANCE like", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceNotLike(String value) {
            addCriterion("IFBALANCE not like", value, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceIn(List<String> values) {
            addCriterion("IFBALANCE in", values, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceNotIn(List<String> values) {
            addCriterion("IFBALANCE not in", values, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceBetween(String value1, String value2) {
            addCriterion("IFBALANCE between", value1, value2, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andIfbalanceNotBetween(String value1, String value2) {
            addCriterion("IFBALANCE not between", value1, value2, "ifbalance");
            return (Criteria) this;
        }

        public Criteria andBalancedateIsNull() {
            addCriterion("BALANCEDATE is null");
            return (Criteria) this;
        }

        public Criteria andBalancedateIsNotNull() {
            addCriterion("BALANCEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBalancedateEqualTo(Date value) {
            addCriterion("BALANCEDATE =", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotEqualTo(Date value) {
            addCriterion("BALANCEDATE <>", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThan(Date value) {
            addCriterion("BALANCEDATE >", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThanOrEqualTo(Date value) {
            addCriterion("BALANCEDATE >=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThan(Date value) {
            addCriterion("BALANCEDATE <", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThanOrEqualTo(Date value) {
            addCriterion("BALANCEDATE <=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateIn(List<Date> values) {
            addCriterion("BALANCEDATE in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotIn(List<Date> values) {
            addCriterion("BALANCEDATE not in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateBetween(Date value1, Date value2) {
            addCriterion("BALANCEDATE between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotBetween(Date value1, Date value2) {
            addCriterion("BALANCEDATE not between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceIsNull() {
            addCriterion("BALANCESEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceIsNotNull() {
            addCriterion("BALANCESEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceEqualTo(String value) {
            addCriterion("BALANCESEQUENCE =", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceNotEqualTo(String value) {
            addCriterion("BALANCESEQUENCE <>", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceGreaterThan(String value) {
            addCriterion("BALANCESEQUENCE >", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCESEQUENCE >=", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceLessThan(String value) {
            addCriterion("BALANCESEQUENCE <", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceLessThanOrEqualTo(String value) {
            addCriterion("BALANCESEQUENCE <=", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceLike(String value) {
            addCriterion("BALANCESEQUENCE like", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceNotLike(String value) {
            addCriterion("BALANCESEQUENCE not like", value, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceIn(List<String> values) {
            addCriterion("BALANCESEQUENCE in", values, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceNotIn(List<String> values) {
            addCriterion("BALANCESEQUENCE not in", values, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceBetween(String value1, String value2) {
            addCriterion("BALANCESEQUENCE between", value1, value2, "balancesequence");
            return (Criteria) this;
        }

        public Criteria andBalancesequenceNotBetween(String value1, String value2) {
            addCriterion("BALANCESEQUENCE not between", value1, value2, "balancesequence");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : bfp_transaction_td
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
     * @Table : bfp_transaction_td
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