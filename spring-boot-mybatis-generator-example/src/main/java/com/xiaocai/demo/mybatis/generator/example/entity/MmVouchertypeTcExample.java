package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmVouchertypeTcExample {
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
    public MmVouchertypeTcExample() {
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
     * @Table : mm_vouchertype_tc
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

        public Criteria andTypeidIsNull() {
            addCriterion("TYPEID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("TYPEID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("TYPEID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("TYPEID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("TYPEID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("TYPEID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("TYPEID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("TYPEID like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("TYPEID not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("TYPEID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("TYPEID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("TYPEID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("TYPEID not between", value1, value2, "typeid");
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

        public Criteria andEnabledflagIsNull() {
            addCriterion("ENABLEDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnabledflagIsNotNull() {
            addCriterion("ENABLEDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledflagEqualTo(String value) {
            addCriterion("ENABLEDFLAG =", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotEqualTo(String value) {
            addCriterion("ENABLEDFLAG <>", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagGreaterThan(String value) {
            addCriterion("ENABLEDFLAG >", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLEDFLAG >=", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLessThan(String value) {
            addCriterion("ENABLEDFLAG <", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLessThanOrEqualTo(String value) {
            addCriterion("ENABLEDFLAG <=", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagLike(String value) {
            addCriterion("ENABLEDFLAG like", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotLike(String value) {
            addCriterion("ENABLEDFLAG not like", value, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagIn(List<String> values) {
            addCriterion("ENABLEDFLAG in", values, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotIn(List<String> values) {
            addCriterion("ENABLEDFLAG not in", values, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagBetween(String value1, String value2) {
            addCriterion("ENABLEDFLAG between", value1, value2, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andEnabledflagNotBetween(String value1, String value2) {
            addCriterion("ENABLEDFLAG not between", value1, value2, "enabledflag");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNull() {
            addCriterion("DISABLEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNotNull() {
            addCriterion("DISABLEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledateEqualTo(Date value) {
            addCriterion("DISABLEDATE =", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotEqualTo(Date value) {
            addCriterion("DISABLEDATE <>", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThan(Date value) {
            addCriterion("DISABLEDATE >", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThanOrEqualTo(Date value) {
            addCriterion("DISABLEDATE >=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThan(Date value) {
            addCriterion("DISABLEDATE <", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThanOrEqualTo(Date value) {
            addCriterion("DISABLEDATE <=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateIn(List<Date> values) {
            addCriterion("DISABLEDATE in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotIn(List<Date> values) {
            addCriterion("DISABLEDATE not in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateBetween(Date value1, Date value2) {
            addCriterion("DISABLEDATE between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotBetween(Date value1, Date value2) {
            addCriterion("DISABLEDATE not between", value1, value2, "disabledate");
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

        public Criteria andVoucherkindIsNull() {
            addCriterion("VOUCHERKIND is null");
            return (Criteria) this;
        }

        public Criteria andVoucherkindIsNotNull() {
            addCriterion("VOUCHERKIND is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherkindEqualTo(String value) {
            addCriterion("VOUCHERKIND =", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotEqualTo(String value) {
            addCriterion("VOUCHERKIND <>", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindGreaterThan(String value) {
            addCriterion("VOUCHERKIND >", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERKIND >=", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindLessThan(String value) {
            addCriterion("VOUCHERKIND <", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERKIND <=", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindLike(String value) {
            addCriterion("VOUCHERKIND like", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotLike(String value) {
            addCriterion("VOUCHERKIND not like", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindIn(List<String> values) {
            addCriterion("VOUCHERKIND in", values, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotIn(List<String> values) {
            addCriterion("VOUCHERKIND not in", values, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindBetween(String value1, String value2) {
            addCriterion("VOUCHERKIND between", value1, value2, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotBetween(String value1, String value2) {
            addCriterion("VOUCHERKIND not between", value1, value2, "voucherkind");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_vouchertype_tc
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
     * @Table : mm_vouchertype_tc
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