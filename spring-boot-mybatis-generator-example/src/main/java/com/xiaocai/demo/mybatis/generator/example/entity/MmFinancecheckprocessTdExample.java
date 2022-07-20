package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmFinancecheckprocessTdExample {
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
    public MmFinancecheckprocessTdExample() {
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
     * @Table : mm_financecheckprocess_td
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

        public Criteria andProcessidIsNull() {
            addCriterion("PROCESSID is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("PROCESSID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Long value) {
            addCriterion("PROCESSID =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Long value) {
            addCriterion("PROCESSID <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Long value) {
            addCriterion("PROCESSID >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESSID >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Long value) {
            addCriterion("PROCESSID <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Long value) {
            addCriterion("PROCESSID <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Long> values) {
            addCriterion("PROCESSID in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Long> values) {
            addCriterion("PROCESSID not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Long value1, Long value2) {
            addCriterion("PROCESSID between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Long value1, Long value2) {
            addCriterion("PROCESSID not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNull() {
            addCriterion("APPLYDATAID is null");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNotNull() {
            addCriterion("APPLYDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andApplydataidEqualTo(String value) {
            addCriterion("APPLYDATAID =", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotEqualTo(String value) {
            addCriterion("APPLYDATAID <>", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThan(String value) {
            addCriterion("APPLYDATAID >", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID >=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThan(String value) {
            addCriterion("APPLYDATAID <", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID <=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLike(String value) {
            addCriterion("APPLYDATAID like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotLike(String value) {
            addCriterion("APPLYDATAID not like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidIn(List<String> values) {
            addCriterion("APPLYDATAID in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotIn(List<String> values) {
            addCriterion("APPLYDATAID not in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidBetween(String value1, String value2) {
            addCriterion("APPLYDATAID between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotBetween(String value1, String value2) {
            addCriterion("APPLYDATAID not between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNull() {
            addCriterion("APPLYCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNotNull() {
            addCriterion("APPLYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplycodeEqualTo(String value) {
            addCriterion("APPLYCODE =", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotEqualTo(String value) {
            addCriterion("APPLYCODE <>", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThan(String value) {
            addCriterion("APPLYCODE >", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYCODE >=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThan(String value) {
            addCriterion("APPLYCODE <", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThanOrEqualTo(String value) {
            addCriterion("APPLYCODE <=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLike(String value) {
            addCriterion("APPLYCODE like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotLike(String value) {
            addCriterion("APPLYCODE not like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeIn(List<String> values) {
            addCriterion("APPLYCODE in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotIn(List<String> values) {
            addCriterion("APPLYCODE not in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeBetween(String value1, String value2) {
            addCriterion("APPLYCODE between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotBetween(String value1, String value2) {
            addCriterion("APPLYCODE not between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNull() {
            addCriterion("APPLYNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNotNull() {
            addCriterion("APPLYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplynameEqualTo(String value) {
            addCriterion("APPLYNAME =", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotEqualTo(String value) {
            addCriterion("APPLYNAME <>", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThan(String value) {
            addCriterion("APPLYNAME >", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNAME >=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThan(String value) {
            addCriterion("APPLYNAME <", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThanOrEqualTo(String value) {
            addCriterion("APPLYNAME <=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLike(String value) {
            addCriterion("APPLYNAME like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotLike(String value) {
            addCriterion("APPLYNAME not like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameIn(List<String> values) {
            addCriterion("APPLYNAME in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotIn(List<String> values) {
            addCriterion("APPLYNAME not in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameBetween(String value1, String value2) {
            addCriterion("APPLYNAME between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotBetween(String value1, String value2) {
            addCriterion("APPLYNAME not between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("APPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("APPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("APPLYDATE =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("APPLYDATE <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("APPLYDATE >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("APPLYDATE <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("APPLYDATE in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("APPLYDATE not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("APPLYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("APPLYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("APPLYTYPE =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("APPLYTYPE <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("APPLYTYPE >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYTYPE >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("APPLYTYPE <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("APPLYTYPE <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("APPLYTYPE like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("APPLYTYPE not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("APPLYTYPE in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("APPLYTYPE not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("APPLYTYPE between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("APPLYTYPE not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailIsNull() {
            addCriterion("APPLYTYPEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailIsNotNull() {
            addCriterion("APPLYTYPEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailEqualTo(String value) {
            addCriterion("APPLYTYPEDETAIL =", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailNotEqualTo(String value) {
            addCriterion("APPLYTYPEDETAIL <>", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailGreaterThan(String value) {
            addCriterion("APPLYTYPEDETAIL >", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYTYPEDETAIL >=", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailLessThan(String value) {
            addCriterion("APPLYTYPEDETAIL <", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailLessThanOrEqualTo(String value) {
            addCriterion("APPLYTYPEDETAIL <=", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailLike(String value) {
            addCriterion("APPLYTYPEDETAIL like", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailNotLike(String value) {
            addCriterion("APPLYTYPEDETAIL not like", value, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailIn(List<String> values) {
            addCriterion("APPLYTYPEDETAIL in", values, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailNotIn(List<String> values) {
            addCriterion("APPLYTYPEDETAIL not in", values, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailBetween(String value1, String value2) {
            addCriterion("APPLYTYPEDETAIL between", value1, value2, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andApplytypedetailNotBetween(String value1, String value2) {
            addCriterion("APPLYTYPEDETAIL not between", value1, value2, "applytypedetail");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("WORKID is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("WORKID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("WORKID =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("WORKID <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("WORKID >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("WORKID >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("WORKID <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("WORKID <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("WORKID like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("WORKID not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("WORKID in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("WORKID not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("WORKID between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("WORKID not between", value1, value2, "workid");
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

        public Criteria andApplyreasonIsNull() {
            addCriterion("APPLYREASON is null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNotNull() {
            addCriterion("APPLYREASON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonEqualTo(String value) {
            addCriterion("APPLYREASON =", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotEqualTo(String value) {
            addCriterion("APPLYREASON <>", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThan(String value) {
            addCriterion("APPLYREASON >", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYREASON >=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThan(String value) {
            addCriterion("APPLYREASON <", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThanOrEqualTo(String value) {
            addCriterion("APPLYREASON <=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLike(String value) {
            addCriterion("APPLYREASON like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotLike(String value) {
            addCriterion("APPLYREASON not like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIn(List<String> values) {
            addCriterion("APPLYREASON in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotIn(List<String> values) {
            addCriterion("APPLYREASON not in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonBetween(String value1, String value2) {
            addCriterion("APPLYREASON between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotBetween(String value1, String value2) {
            addCriterion("APPLYREASON not between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andCheckamountIsNull() {
            addCriterion("CHECKAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCheckamountIsNotNull() {
            addCriterion("CHECKAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckamountEqualTo(BigDecimal value) {
            addCriterion("CHECKAMOUNT =", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountNotEqualTo(BigDecimal value) {
            addCriterion("CHECKAMOUNT <>", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountGreaterThan(BigDecimal value) {
            addCriterion("CHECKAMOUNT >", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKAMOUNT >=", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountLessThan(BigDecimal value) {
            addCriterion("CHECKAMOUNT <", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKAMOUNT <=", value, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountIn(List<BigDecimal> values) {
            addCriterion("CHECKAMOUNT in", values, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountNotIn(List<BigDecimal> values) {
            addCriterion("CHECKAMOUNT not in", values, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKAMOUNT between", value1, value2, "checkamount");
            return (Criteria) this;
        }

        public Criteria andCheckamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKAMOUNT not between", value1, value2, "checkamount");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNull() {
            addCriterion("CHECKLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNotNull() {
            addCriterion("CHECKLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChecklevelEqualTo(String value) {
            addCriterion("CHECKLEVEL =", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotEqualTo(String value) {
            addCriterion("CHECKLEVEL <>", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThan(String value) {
            addCriterion("CHECKLEVEL >", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKLEVEL >=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThan(String value) {
            addCriterion("CHECKLEVEL <", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThanOrEqualTo(String value) {
            addCriterion("CHECKLEVEL <=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLike(String value) {
            addCriterion("CHECKLEVEL like", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotLike(String value) {
            addCriterion("CHECKLEVEL not like", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelIn(List<String> values) {
            addCriterion("CHECKLEVEL in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotIn(List<String> values) {
            addCriterion("CHECKLEVEL not in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelBetween(String value1, String value2) {
            addCriterion("CHECKLEVEL between", value1, value2, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotBetween(String value1, String value2) {
            addCriterion("CHECKLEVEL not between", value1, value2, "checklevel");
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

        public Criteria andIfattachmentIsNull() {
            addCriterion("IFATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andIfattachmentIsNotNull() {
            addCriterion("IFATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIfattachmentEqualTo(String value) {
            addCriterion("IFATTACHMENT =", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotEqualTo(String value) {
            addCriterion("IFATTACHMENT <>", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentGreaterThan(String value) {
            addCriterion("IFATTACHMENT >", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentGreaterThanOrEqualTo(String value) {
            addCriterion("IFATTACHMENT >=", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLessThan(String value) {
            addCriterion("IFATTACHMENT <", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLessThanOrEqualTo(String value) {
            addCriterion("IFATTACHMENT <=", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLike(String value) {
            addCriterion("IFATTACHMENT like", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotLike(String value) {
            addCriterion("IFATTACHMENT not like", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentIn(List<String> values) {
            addCriterion("IFATTACHMENT in", values, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotIn(List<String> values) {
            addCriterion("IFATTACHMENT not in", values, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentBetween(String value1, String value2) {
            addCriterion("IFATTACHMENT between", value1, value2, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotBetween(String value1, String value2) {
            addCriterion("IFATTACHMENT not between", value1, value2, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeIsNull() {
            addCriterion("ATTACHMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeIsNotNull() {
            addCriterion("ATTACHMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeEqualTo(String value) {
            addCriterion("ATTACHMENTCODE =", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotEqualTo(String value) {
            addCriterion("ATTACHMENTCODE <>", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeGreaterThan(String value) {
            addCriterion("ATTACHMENTCODE >", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTCODE >=", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLessThan(String value) {
            addCriterion("ATTACHMENTCODE <", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTCODE <=", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLike(String value) {
            addCriterion("ATTACHMENTCODE like", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotLike(String value) {
            addCriterion("ATTACHMENTCODE not like", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeIn(List<String> values) {
            addCriterion("ATTACHMENTCODE in", values, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotIn(List<String> values) {
            addCriterion("ATTACHMENTCODE not in", values, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeBetween(String value1, String value2) {
            addCriterion("ATTACHMENTCODE between", value1, value2, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENTCODE not between", value1, value2, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonIsNull() {
            addCriterion("ATTACHMENTREASON is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonIsNotNull() {
            addCriterion("ATTACHMENTREASON is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonEqualTo(String value) {
            addCriterion("ATTACHMENTREASON =", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonNotEqualTo(String value) {
            addCriterion("ATTACHMENTREASON <>", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonGreaterThan(String value) {
            addCriterion("ATTACHMENTREASON >", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTREASON >=", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonLessThan(String value) {
            addCriterion("ATTACHMENTREASON <", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTREASON <=", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonLike(String value) {
            addCriterion("ATTACHMENTREASON like", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonNotLike(String value) {
            addCriterion("ATTACHMENTREASON not like", value, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonIn(List<String> values) {
            addCriterion("ATTACHMENTREASON in", values, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonNotIn(List<String> values) {
            addCriterion("ATTACHMENTREASON not in", values, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonBetween(String value1, String value2) {
            addCriterion("ATTACHMENTREASON between", value1, value2, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andAttachmentreasonNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENTREASON not between", value1, value2, "attachmentreason");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIsNull() {
            addCriterion("CURRENTCHECKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIsNotNull() {
            addCriterion("CURRENTCHECKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE =", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE <>", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeGreaterThan(String value) {
            addCriterion("CURRENTCHECKCODE >", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE >=", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLessThan(String value) {
            addCriterion("CURRENTCHECKCODE <", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE <=", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLike(String value) {
            addCriterion("CURRENTCHECKCODE like", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotLike(String value) {
            addCriterion("CURRENTCHECKCODE not like", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIn(List<String> values) {
            addCriterion("CURRENTCHECKCODE in", values, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotIn(List<String> values) {
            addCriterion("CURRENTCHECKCODE not in", values, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeBetween(String value1, String value2) {
            addCriterion("CURRENTCHECKCODE between", value1, value2, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotBetween(String value1, String value2) {
            addCriterion("CURRENTCHECKCODE not between", value1, value2, "currentcheckcode");
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

        public Criteria andResultreasonIsNull() {
            addCriterion("RESULTREASON is null");
            return (Criteria) this;
        }

        public Criteria andResultreasonIsNotNull() {
            addCriterion("RESULTREASON is not null");
            return (Criteria) this;
        }

        public Criteria andResultreasonEqualTo(String value) {
            addCriterion("RESULTREASON =", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotEqualTo(String value) {
            addCriterion("RESULTREASON <>", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonGreaterThan(String value) {
            addCriterion("RESULTREASON >", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTREASON >=", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLessThan(String value) {
            addCriterion("RESULTREASON <", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLessThanOrEqualTo(String value) {
            addCriterion("RESULTREASON <=", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLike(String value) {
            addCriterion("RESULTREASON like", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotLike(String value) {
            addCriterion("RESULTREASON not like", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonIn(List<String> values) {
            addCriterion("RESULTREASON in", values, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotIn(List<String> values) {
            addCriterion("RESULTREASON not in", values, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonBetween(String value1, String value2) {
            addCriterion("RESULTREASON between", value1, value2, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotBetween(String value1, String value2) {
            addCriterion("RESULTREASON not between", value1, value2, "resultreason");
            return (Criteria) this;
        }

        public Criteria andPressflagIsNull() {
            addCriterion("PRESSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPressflagIsNotNull() {
            addCriterion("PRESSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPressflagEqualTo(String value) {
            addCriterion("PRESSFLAG =", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotEqualTo(String value) {
            addCriterion("PRESSFLAG <>", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagGreaterThan(String value) {
            addCriterion("PRESSFLAG >", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagGreaterThanOrEqualTo(String value) {
            addCriterion("PRESSFLAG >=", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLessThan(String value) {
            addCriterion("PRESSFLAG <", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLessThanOrEqualTo(String value) {
            addCriterion("PRESSFLAG <=", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLike(String value) {
            addCriterion("PRESSFLAG like", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotLike(String value) {
            addCriterion("PRESSFLAG not like", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagIn(List<String> values) {
            addCriterion("PRESSFLAG in", values, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotIn(List<String> values) {
            addCriterion("PRESSFLAG not in", values, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagBetween(String value1, String value2) {
            addCriterion("PRESSFLAG between", value1, value2, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotBetween(String value1, String value2) {
            addCriterion("PRESSFLAG not between", value1, value2, "pressflag");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andChecktimesIsNull() {
            addCriterion("CHECKTIMES is null");
            return (Criteria) this;
        }

        public Criteria andChecktimesIsNotNull() {
            addCriterion("CHECKTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimesEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES =", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES <>", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesGreaterThan(BigDecimal value) {
            addCriterion("CHECKTIMES >", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES >=", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesLessThan(BigDecimal value) {
            addCriterion("CHECKTIMES <", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES <=", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesIn(List<BigDecimal> values) {
            addCriterion("CHECKTIMES in", values, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotIn(List<BigDecimal> values) {
            addCriterion("CHECKTIMES not in", values, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKTIMES between", value1, value2, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKTIMES not between", value1, value2, "checktimes");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeIsNull() {
            addCriterion("PRECHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeIsNotNull() {
            addCriterion("PRECHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeEqualTo(Date value) {
            addCriterion("PRECHECKTIME =", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeNotEqualTo(Date value) {
            addCriterion("PRECHECKTIME <>", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeGreaterThan(Date value) {
            addCriterion("PRECHECKTIME >", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRECHECKTIME >=", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeLessThan(Date value) {
            addCriterion("PRECHECKTIME <", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeLessThanOrEqualTo(Date value) {
            addCriterion("PRECHECKTIME <=", value, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeIn(List<Date> values) {
            addCriterion("PRECHECKTIME in", values, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeNotIn(List<Date> values) {
            addCriterion("PRECHECKTIME not in", values, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeBetween(Date value1, Date value2) {
            addCriterion("PRECHECKTIME between", value1, value2, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andPrechecktimeNotBetween(Date value1, Date value2) {
            addCriterion("PRECHECKTIME not between", value1, value2, "prechecktime");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNull() {
            addCriterion("OPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNotNull() {
            addCriterion("OPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(String value) {
            addCriterion("OPTYPE =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(String value) {
            addCriterion("OPTYPE <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(String value) {
            addCriterion("OPTYPE >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTYPE >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(String value) {
            addCriterion("OPTYPE <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(String value) {
            addCriterion("OPTYPE <=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLike(String value) {
            addCriterion("OPTYPE like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotLike(String value) {
            addCriterion("OPTYPE not like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeIn(List<String> values) {
            addCriterion("OPTYPE in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<String> values) {
            addCriterion("OPTYPE not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(String value1, String value2) {
            addCriterion("OPTYPE between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(String value1, String value2) {
            addCriterion("OPTYPE not between", value1, value2, "optype");
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

        public Criteria andPaymentnoIsNull() {
            addCriterion("PAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentnoIsNotNull() {
            addCriterion("PAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentnoEqualTo(String value) {
            addCriterion("PAYMENTNO =", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotEqualTo(String value) {
            addCriterion("PAYMENTNO <>", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoGreaterThan(String value) {
            addCriterion("PAYMENTNO >", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTNO >=", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLessThan(String value) {
            addCriterion("PAYMENTNO <", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTNO <=", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLike(String value) {
            addCriterion("PAYMENTNO like", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotLike(String value) {
            addCriterion("PAYMENTNO not like", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoIn(List<String> values) {
            addCriterion("PAYMENTNO in", values, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotIn(List<String> values) {
            addCriterion("PAYMENTNO not in", values, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoBetween(String value1, String value2) {
            addCriterion("PAYMENTNO between", value1, value2, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotBetween(String value1, String value2) {
            addCriterion("PAYMENTNO not between", value1, value2, "paymentno");
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

        public Criteria andPayaccountnameIsNull() {
            addCriterion("PAYACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameIsNotNull() {
            addCriterion("PAYACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameEqualTo(String value) {
            addCriterion("PAYACCOUNTNAME =", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameNotEqualTo(String value) {
            addCriterion("PAYACCOUNTNAME <>", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameGreaterThan(String value) {
            addCriterion("PAYACCOUNTNAME >", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYACCOUNTNAME >=", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameLessThan(String value) {
            addCriterion("PAYACCOUNTNAME <", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameLessThanOrEqualTo(String value) {
            addCriterion("PAYACCOUNTNAME <=", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameLike(String value) {
            addCriterion("PAYACCOUNTNAME like", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameNotLike(String value) {
            addCriterion("PAYACCOUNTNAME not like", value, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameIn(List<String> values) {
            addCriterion("PAYACCOUNTNAME in", values, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameNotIn(List<String> values) {
            addCriterion("PAYACCOUNTNAME not in", values, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameBetween(String value1, String value2) {
            addCriterion("PAYACCOUNTNAME between", value1, value2, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPayaccountnameNotBetween(String value1, String value2) {
            addCriterion("PAYACCOUNTNAME not between", value1, value2, "payaccountname");
            return (Criteria) this;
        }

        public Criteria andPowerroleIsNull() {
            addCriterion("powerrole is null");
            return (Criteria) this;
        }

        public Criteria andPowerroleIsNotNull() {
            addCriterion("powerrole is not null");
            return (Criteria) this;
        }

        public Criteria andPowerroleEqualTo(String value) {
            addCriterion("powerrole =", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotEqualTo(String value) {
            addCriterion("powerrole <>", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleGreaterThan(String value) {
            addCriterion("powerrole >", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleGreaterThanOrEqualTo(String value) {
            addCriterion("powerrole >=", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLessThan(String value) {
            addCriterion("powerrole <", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLessThanOrEqualTo(String value) {
            addCriterion("powerrole <=", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLike(String value) {
            addCriterion("powerrole like", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotLike(String value) {
            addCriterion("powerrole not like", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleIn(List<String> values) {
            addCriterion("powerrole in", values, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotIn(List<String> values) {
            addCriterion("powerrole not in", values, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleBetween(String value1, String value2) {
            addCriterion("powerrole between", value1, value2, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotBetween(String value1, String value2) {
            addCriterion("powerrole not between", value1, value2, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerunitIsNull() {
            addCriterion("powerunit is null");
            return (Criteria) this;
        }

        public Criteria andPowerunitIsNotNull() {
            addCriterion("powerunit is not null");
            return (Criteria) this;
        }

        public Criteria andPowerunitEqualTo(String value) {
            addCriterion("powerunit =", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotEqualTo(String value) {
            addCriterion("powerunit <>", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitGreaterThan(String value) {
            addCriterion("powerunit >", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitGreaterThanOrEqualTo(String value) {
            addCriterion("powerunit >=", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLessThan(String value) {
            addCriterion("powerunit <", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLessThanOrEqualTo(String value) {
            addCriterion("powerunit <=", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLike(String value) {
            addCriterion("powerunit like", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotLike(String value) {
            addCriterion("powerunit not like", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitIn(List<String> values) {
            addCriterion("powerunit in", values, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotIn(List<String> values) {
            addCriterion("powerunit not in", values, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitBetween(String value1, String value2) {
            addCriterion("powerunit between", value1, value2, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotBetween(String value1, String value2) {
            addCriterion("powerunit not between", value1, value2, "powerunit");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_financecheckprocess_td
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
     * @Table : mm_financecheckprocess_td
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