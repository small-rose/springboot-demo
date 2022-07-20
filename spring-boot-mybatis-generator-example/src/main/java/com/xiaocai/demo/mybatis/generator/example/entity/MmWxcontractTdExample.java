package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmWxcontractTdExample {
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
    public MmWxcontractTdExample() {
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
     * @Table : mm_wxcontract_td
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

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(String value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(String value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(String value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(String value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(String value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(String value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLike(String value) {
            addCriterion("PLANID like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotLike(String value) {
            addCriterion("PLANID not like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<String> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<String> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(String value1, String value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(String value1, String value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
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

        public Criteria andReturnurlIsNull() {
            addCriterion("RETURNURL is null");
            return (Criteria) this;
        }

        public Criteria andReturnurlIsNotNull() {
            addCriterion("RETURNURL is not null");
            return (Criteria) this;
        }

        public Criteria andReturnurlEqualTo(String value) {
            addCriterion("RETURNURL =", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlNotEqualTo(String value) {
            addCriterion("RETURNURL <>", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlGreaterThan(String value) {
            addCriterion("RETURNURL >", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNURL >=", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlLessThan(String value) {
            addCriterion("RETURNURL <", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlLessThanOrEqualTo(String value) {
            addCriterion("RETURNURL <=", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlLike(String value) {
            addCriterion("RETURNURL like", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlNotLike(String value) {
            addCriterion("RETURNURL not like", value, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlIn(List<String> values) {
            addCriterion("RETURNURL in", values, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlNotIn(List<String> values) {
            addCriterion("RETURNURL not in", values, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlBetween(String value1, String value2) {
            addCriterion("RETURNURL between", value1, value2, "returnurl");
            return (Criteria) this;
        }

        public Criteria andReturnurlNotBetween(String value1, String value2) {
            addCriterion("RETURNURL not between", value1, value2, "returnurl");
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

        public Criteria andContractidIsNull() {
            addCriterion("CONTRACTID is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("CONTRACTID is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("CONTRACTID =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("CONTRACTID <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("CONTRACTID >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTID >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("CONTRACTID <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTID <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("CONTRACTID like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("CONTRACTID not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("CONTRACTID in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("CONTRACTID not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("CONTRACTID between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("CONTRACTID not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
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

        public Criteria andContactcodeIsNull() {
            addCriterion("CONTACTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContactcodeIsNotNull() {
            addCriterion("CONTACTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactcodeEqualTo(String value) {
            addCriterion("CONTACTCODE =", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeNotEqualTo(String value) {
            addCriterion("CONTACTCODE <>", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeGreaterThan(String value) {
            addCriterion("CONTACTCODE >", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTCODE >=", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeLessThan(String value) {
            addCriterion("CONTACTCODE <", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTCODE <=", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeLike(String value) {
            addCriterion("CONTACTCODE like", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeNotLike(String value) {
            addCriterion("CONTACTCODE not like", value, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeIn(List<String> values) {
            addCriterion("CONTACTCODE in", values, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeNotIn(List<String> values) {
            addCriterion("CONTACTCODE not in", values, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeBetween(String value1, String value2) {
            addCriterion("CONTACTCODE between", value1, value2, "contactcode");
            return (Criteria) this;
        }

        public Criteria andContactcodeNotBetween(String value1, String value2) {
            addCriterion("CONTACTCODE not between", value1, value2, "contactcode");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNull() {
            addCriterion("CHANGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNotNull() {
            addCriterion("CHANGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChangetypeEqualTo(String value) {
            addCriterion("CHANGETYPE =", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotEqualTo(String value) {
            addCriterion("CHANGETYPE <>", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThan(String value) {
            addCriterion("CHANGETYPE >", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGETYPE >=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThan(String value) {
            addCriterion("CHANGETYPE <", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGETYPE <=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLike(String value) {
            addCriterion("CHANGETYPE like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotLike(String value) {
            addCriterion("CHANGETYPE not like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeIn(List<String> values) {
            addCriterion("CHANGETYPE in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotIn(List<String> values) {
            addCriterion("CHANGETYPE not in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeBetween(String value1, String value2) {
            addCriterion("CHANGETYPE between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotBetween(String value1, String value2) {
            addCriterion("CHANGETYPE not between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andContractterminationIsNull() {
            addCriterion("CONTRACTTERMINATION is null");
            return (Criteria) this;
        }

        public Criteria andContractterminationIsNotNull() {
            addCriterion("CONTRACTTERMINATION is not null");
            return (Criteria) this;
        }

        public Criteria andContractterminationEqualTo(String value) {
            addCriterion("CONTRACTTERMINATION =", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationNotEqualTo(String value) {
            addCriterion("CONTRACTTERMINATION <>", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationGreaterThan(String value) {
            addCriterion("CONTRACTTERMINATION >", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTERMINATION >=", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationLessThan(String value) {
            addCriterion("CONTRACTTERMINATION <", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTERMINATION <=", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationLike(String value) {
            addCriterion("CONTRACTTERMINATION like", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationNotLike(String value) {
            addCriterion("CONTRACTTERMINATION not like", value, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationIn(List<String> values) {
            addCriterion("CONTRACTTERMINATION in", values, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationNotIn(List<String> values) {
            addCriterion("CONTRACTTERMINATION not in", values, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationBetween(String value1, String value2) {
            addCriterion("CONTRACTTERMINATION between", value1, value2, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andContractterminationNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTERMINATION not between", value1, value2, "contracttermination");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("OPERATETIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("OPERATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATETIME =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATETIME <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OPERATETIME >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATETIME >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterionForJDBCDate("OPERATETIME <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATETIME <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATETIME in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATETIME not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATETIME between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATETIME not between", value1, value2, "operatetime");
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
     * @Table : mm_wxcontract_td
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
     * @Table : mm_wxcontract_td
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