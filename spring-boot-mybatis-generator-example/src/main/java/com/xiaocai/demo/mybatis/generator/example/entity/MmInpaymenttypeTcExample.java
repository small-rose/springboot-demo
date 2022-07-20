package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInpaymenttypeTcExample {
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
    public MmInpaymenttypeTcExample() {
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
     * @Table : mm_inpaymenttype_tc
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

        public Criteria andProcesstype1IsNull() {
            addCriterion("PROCESSTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andProcesstype1IsNotNull() {
            addCriterion("PROCESSTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstype1EqualTo(String value) {
            addCriterion("PROCESSTYPE1 =", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1NotEqualTo(String value) {
            addCriterion("PROCESSTYPE1 <>", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1GreaterThan(String value) {
            addCriterion("PROCESSTYPE1 >", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1GreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE1 >=", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1LessThan(String value) {
            addCriterion("PROCESSTYPE1 <", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1LessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE1 <=", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1Like(String value) {
            addCriterion("PROCESSTYPE1 like", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1NotLike(String value) {
            addCriterion("PROCESSTYPE1 not like", value, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1In(List<String> values) {
            addCriterion("PROCESSTYPE1 in", values, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1NotIn(List<String> values) {
            addCriterion("PROCESSTYPE1 not in", values, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1Between(String value1, String value2) {
            addCriterion("PROCESSTYPE1 between", value1, value2, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype1NotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE1 not between", value1, value2, "processtype1");
            return (Criteria) this;
        }

        public Criteria andProcesstype2IsNull() {
            addCriterion("PROCESSTYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andProcesstype2IsNotNull() {
            addCriterion("PROCESSTYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstype2EqualTo(String value) {
            addCriterion("PROCESSTYPE2 =", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2NotEqualTo(String value) {
            addCriterion("PROCESSTYPE2 <>", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2GreaterThan(String value) {
            addCriterion("PROCESSTYPE2 >", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2GreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE2 >=", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2LessThan(String value) {
            addCriterion("PROCESSTYPE2 <", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2LessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE2 <=", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2Like(String value) {
            addCriterion("PROCESSTYPE2 like", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2NotLike(String value) {
            addCriterion("PROCESSTYPE2 not like", value, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2In(List<String> values) {
            addCriterion("PROCESSTYPE2 in", values, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2NotIn(List<String> values) {
            addCriterion("PROCESSTYPE2 not in", values, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2Between(String value1, String value2) {
            addCriterion("PROCESSTYPE2 between", value1, value2, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype2NotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE2 not between", value1, value2, "processtype2");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameIsNull() {
            addCriterion("PROCESSTYPE1NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameIsNotNull() {
            addCriterion("PROCESSTYPE1NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameEqualTo(String value) {
            addCriterion("PROCESSTYPE1NAME =", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameNotEqualTo(String value) {
            addCriterion("PROCESSTYPE1NAME <>", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameGreaterThan(String value) {
            addCriterion("PROCESSTYPE1NAME >", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE1NAME >=", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameLessThan(String value) {
            addCriterion("PROCESSTYPE1NAME <", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameLessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE1NAME <=", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameLike(String value) {
            addCriterion("PROCESSTYPE1NAME like", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameNotLike(String value) {
            addCriterion("PROCESSTYPE1NAME not like", value, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameIn(List<String> values) {
            addCriterion("PROCESSTYPE1NAME in", values, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameNotIn(List<String> values) {
            addCriterion("PROCESSTYPE1NAME not in", values, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE1NAME between", value1, value2, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype1nameNotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE1NAME not between", value1, value2, "processtype1name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameIsNull() {
            addCriterion("PROCESSTYPE2NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameIsNotNull() {
            addCriterion("PROCESSTYPE2NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameEqualTo(String value) {
            addCriterion("PROCESSTYPE2NAME =", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameNotEqualTo(String value) {
            addCriterion("PROCESSTYPE2NAME <>", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameGreaterThan(String value) {
            addCriterion("PROCESSTYPE2NAME >", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE2NAME >=", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameLessThan(String value) {
            addCriterion("PROCESSTYPE2NAME <", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameLessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE2NAME <=", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameLike(String value) {
            addCriterion("PROCESSTYPE2NAME like", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameNotLike(String value) {
            addCriterion("PROCESSTYPE2NAME not like", value, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameIn(List<String> values) {
            addCriterion("PROCESSTYPE2NAME in", values, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameNotIn(List<String> values) {
            addCriterion("PROCESSTYPE2NAME not in", values, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE2NAME between", value1, value2, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andProcesstype2nameNotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE2NAME not between", value1, value2, "processtype2name");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1IsNull() {
            addCriterion("ACCBUSINESS1 is null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1IsNotNull() {
            addCriterion("ACCBUSINESS1 is not null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1EqualTo(String value) {
            addCriterion("ACCBUSINESS1 =", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1NotEqualTo(String value) {
            addCriterion("ACCBUSINESS1 <>", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1GreaterThan(String value) {
            addCriterion("ACCBUSINESS1 >", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1GreaterThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS1 >=", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1LessThan(String value) {
            addCriterion("ACCBUSINESS1 <", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1LessThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS1 <=", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1Like(String value) {
            addCriterion("ACCBUSINESS1 like", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1NotLike(String value) {
            addCriterion("ACCBUSINESS1 not like", value, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1In(List<String> values) {
            addCriterion("ACCBUSINESS1 in", values, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1NotIn(List<String> values) {
            addCriterion("ACCBUSINESS1 not in", values, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1Between(String value1, String value2) {
            addCriterion("ACCBUSINESS1 between", value1, value2, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness1NotBetween(String value1, String value2) {
            addCriterion("ACCBUSINESS1 not between", value1, value2, "accbusiness1");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2IsNull() {
            addCriterion("ACCBUSINESS2 is null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2IsNotNull() {
            addCriterion("ACCBUSINESS2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2EqualTo(String value) {
            addCriterion("ACCBUSINESS2 =", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2NotEqualTo(String value) {
            addCriterion("ACCBUSINESS2 <>", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2GreaterThan(String value) {
            addCriterion("ACCBUSINESS2 >", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2GreaterThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS2 >=", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2LessThan(String value) {
            addCriterion("ACCBUSINESS2 <", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2LessThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS2 <=", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2Like(String value) {
            addCriterion("ACCBUSINESS2 like", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2NotLike(String value) {
            addCriterion("ACCBUSINESS2 not like", value, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2In(List<String> values) {
            addCriterion("ACCBUSINESS2 in", values, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2NotIn(List<String> values) {
            addCriterion("ACCBUSINESS2 not in", values, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2Between(String value1, String value2) {
            addCriterion("ACCBUSINESS2 between", value1, value2, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness2NotBetween(String value1, String value2) {
            addCriterion("ACCBUSINESS2 not between", value1, value2, "accbusiness2");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3IsNull() {
            addCriterion("ACCBUSINESS3 is null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3IsNotNull() {
            addCriterion("ACCBUSINESS3 is not null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3EqualTo(String value) {
            addCriterion("ACCBUSINESS3 =", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3NotEqualTo(String value) {
            addCriterion("ACCBUSINESS3 <>", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3GreaterThan(String value) {
            addCriterion("ACCBUSINESS3 >", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3GreaterThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS3 >=", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3LessThan(String value) {
            addCriterion("ACCBUSINESS3 <", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3LessThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS3 <=", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3Like(String value) {
            addCriterion("ACCBUSINESS3 like", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3NotLike(String value) {
            addCriterion("ACCBUSINESS3 not like", value, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3In(List<String> values) {
            addCriterion("ACCBUSINESS3 in", values, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3NotIn(List<String> values) {
            addCriterion("ACCBUSINESS3 not in", values, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3Between(String value1, String value2) {
            addCriterion("ACCBUSINESS3 between", value1, value2, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness3NotBetween(String value1, String value2) {
            addCriterion("ACCBUSINESS3 not between", value1, value2, "accbusiness3");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4IsNull() {
            addCriterion("ACCBUSINESS4 is null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4IsNotNull() {
            addCriterion("ACCBUSINESS4 is not null");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4EqualTo(String value) {
            addCriterion("ACCBUSINESS4 =", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4NotEqualTo(String value) {
            addCriterion("ACCBUSINESS4 <>", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4GreaterThan(String value) {
            addCriterion("ACCBUSINESS4 >", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4GreaterThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS4 >=", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4LessThan(String value) {
            addCriterion("ACCBUSINESS4 <", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4LessThanOrEqualTo(String value) {
            addCriterion("ACCBUSINESS4 <=", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4Like(String value) {
            addCriterion("ACCBUSINESS4 like", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4NotLike(String value) {
            addCriterion("ACCBUSINESS4 not like", value, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4In(List<String> values) {
            addCriterion("ACCBUSINESS4 in", values, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4NotIn(List<String> values) {
            addCriterion("ACCBUSINESS4 not in", values, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4Between(String value1, String value2) {
            addCriterion("ACCBUSINESS4 between", value1, value2, "accbusiness4");
            return (Criteria) this;
        }

        public Criteria andAccbusiness4NotBetween(String value1, String value2) {
            addCriterion("ACCBUSINESS4 not between", value1, value2, "accbusiness4");
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

        public Criteria andIfvalidIsNull() {
            addCriterion("IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("IFVALID =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("IFVALID <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("IFVALID >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IFVALID >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("IFVALID <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("IFVALID <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("IFVALID like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("IFVALID not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("IFVALID in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("IFVALID not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("IFVALID between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("IFVALID not between", value1, value2, "ifvalid");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_inpaymenttype_tc
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
     * @Table : mm_inpaymenttype_tc
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