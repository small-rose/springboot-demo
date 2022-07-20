package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmDepartmentTcExample {
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
    public MmDepartmentTcExample() {
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
     * @Table : mm_department_tc
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

        public Criteria andRealldeptIsNull() {
            addCriterion("REALLDEPT is null");
            return (Criteria) this;
        }

        public Criteria andRealldeptIsNotNull() {
            addCriterion("REALLDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andRealldeptEqualTo(String value) {
            addCriterion("REALLDEPT =", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptNotEqualTo(String value) {
            addCriterion("REALLDEPT <>", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptGreaterThan(String value) {
            addCriterion("REALLDEPT >", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptGreaterThanOrEqualTo(String value) {
            addCriterion("REALLDEPT >=", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptLessThan(String value) {
            addCriterion("REALLDEPT <", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptLessThanOrEqualTo(String value) {
            addCriterion("REALLDEPT <=", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptLike(String value) {
            addCriterion("REALLDEPT like", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptNotLike(String value) {
            addCriterion("REALLDEPT not like", value, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptIn(List<String> values) {
            addCriterion("REALLDEPT in", values, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptNotIn(List<String> values) {
            addCriterion("REALLDEPT not in", values, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptBetween(String value1, String value2) {
            addCriterion("REALLDEPT between", value1, value2, "realldept");
            return (Criteria) this;
        }

        public Criteria andRealldeptNotBetween(String value1, String value2) {
            addCriterion("REALLDEPT not between", value1, value2, "realldept");
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

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNull() {
            addCriterion("SERVICEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNotNull() {
            addCriterion("SERVICEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andServicephoneEqualTo(String value) {
            addCriterion("SERVICEPHONE =", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotEqualTo(String value) {
            addCriterion("SERVICEPHONE <>", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThan(String value) {
            addCriterion("SERVICEPHONE >", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEPHONE >=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThan(String value) {
            addCriterion("SERVICEPHONE <", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThanOrEqualTo(String value) {
            addCriterion("SERVICEPHONE <=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLike(String value) {
            addCriterion("SERVICEPHONE like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotLike(String value) {
            addCriterion("SERVICEPHONE not like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneIn(List<String> values) {
            addCriterion("SERVICEPHONE in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotIn(List<String> values) {
            addCriterion("SERVICEPHONE not in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneBetween(String value1, String value2) {
            addCriterion("SERVICEPHONE between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotBetween(String value1, String value2) {
            addCriterion("SERVICEPHONE not between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNull() {
            addCriterion("TAXPAYERID is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNotNull() {
            addCriterion("TAXPAYERID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridEqualTo(String value) {
            addCriterion("TAXPAYERID =", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotEqualTo(String value) {
            addCriterion("TAXPAYERID <>", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThan(String value) {
            addCriterion("TAXPAYERID >", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERID >=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThan(String value) {
            addCriterion("TAXPAYERID <", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERID <=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLike(String value) {
            addCriterion("TAXPAYERID like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotLike(String value) {
            addCriterion("TAXPAYERID not like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIn(List<String> values) {
            addCriterion("TAXPAYERID in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotIn(List<String> values) {
            addCriterion("TAXPAYERID not in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridBetween(String value1, String value2) {
            addCriterion("TAXPAYERID between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERID not between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeIsNull() {
            addCriterion("DEPTGROUPCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeIsNotNull() {
            addCriterion("DEPTGROUPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeEqualTo(String value) {
            addCriterion("DEPTGROUPCODE =", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeNotEqualTo(String value) {
            addCriterion("DEPTGROUPCODE <>", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeGreaterThan(String value) {
            addCriterion("DEPTGROUPCODE >", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTGROUPCODE >=", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeLessThan(String value) {
            addCriterion("DEPTGROUPCODE <", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTGROUPCODE <=", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeLike(String value) {
            addCriterion("DEPTGROUPCODE like", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeNotLike(String value) {
            addCriterion("DEPTGROUPCODE not like", value, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeIn(List<String> values) {
            addCriterion("DEPTGROUPCODE in", values, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeNotIn(List<String> values) {
            addCriterion("DEPTGROUPCODE not in", values, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeBetween(String value1, String value2) {
            addCriterion("DEPTGROUPCODE between", value1, value2, "deptgroupcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTGROUPCODE not between", value1, value2, "deptgroupcode");
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

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
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

        public Criteria andTaxmanagementcodeIsNull() {
            addCriterion("TAXMANAGEMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeIsNotNull() {
            addCriterion("TAXMANAGEMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeEqualTo(String value) {
            addCriterion("TAXMANAGEMENTCODE =", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeNotEqualTo(String value) {
            addCriterion("TAXMANAGEMENTCODE <>", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeGreaterThan(String value) {
            addCriterion("TAXMANAGEMENTCODE >", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXMANAGEMENTCODE >=", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeLessThan(String value) {
            addCriterion("TAXMANAGEMENTCODE <", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeLessThanOrEqualTo(String value) {
            addCriterion("TAXMANAGEMENTCODE <=", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeLike(String value) {
            addCriterion("TAXMANAGEMENTCODE like", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeNotLike(String value) {
            addCriterion("TAXMANAGEMENTCODE not like", value, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeIn(List<String> values) {
            addCriterion("TAXMANAGEMENTCODE in", values, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeNotIn(List<String> values) {
            addCriterion("TAXMANAGEMENTCODE not in", values, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeBetween(String value1, String value2) {
            addCriterion("TAXMANAGEMENTCODE between", value1, value2, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andTaxmanagementcodeNotBetween(String value1, String value2) {
            addCriterion("TAXMANAGEMENTCODE not between", value1, value2, "taxmanagementcode");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameIsNull() {
            addCriterion("DEPTGROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameIsNotNull() {
            addCriterion("DEPTGROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameEqualTo(String value) {
            addCriterion("DEPTGROUPNAME =", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameNotEqualTo(String value) {
            addCriterion("DEPTGROUPNAME <>", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameGreaterThan(String value) {
            addCriterion("DEPTGROUPNAME >", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTGROUPNAME >=", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameLessThan(String value) {
            addCriterion("DEPTGROUPNAME <", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTGROUPNAME <=", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameLike(String value) {
            addCriterion("DEPTGROUPNAME like", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameNotLike(String value) {
            addCriterion("DEPTGROUPNAME not like", value, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameIn(List<String> values) {
            addCriterion("DEPTGROUPNAME in", values, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameNotIn(List<String> values) {
            addCriterion("DEPTGROUPNAME not in", values, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameBetween(String value1, String value2) {
            addCriterion("DEPTGROUPNAME between", value1, value2, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andDeptgroupnameNotBetween(String value1, String value2) {
            addCriterion("DEPTGROUPNAME not between", value1, value2, "deptgroupname");
            return (Criteria) this;
        }

        public Criteria andFathercodeIsNull() {
            addCriterion("FATHERCODE is null");
            return (Criteria) this;
        }

        public Criteria andFathercodeIsNotNull() {
            addCriterion("FATHERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFathercodeEqualTo(String value) {
            addCriterion("FATHERCODE =", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotEqualTo(String value) {
            addCriterion("FATHERCODE <>", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeGreaterThan(String value) {
            addCriterion("FATHERCODE >", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERCODE >=", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLessThan(String value) {
            addCriterion("FATHERCODE <", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLessThanOrEqualTo(String value) {
            addCriterion("FATHERCODE <=", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLike(String value) {
            addCriterion("FATHERCODE like", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotLike(String value) {
            addCriterion("FATHERCODE not like", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeIn(List<String> values) {
            addCriterion("FATHERCODE in", values, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotIn(List<String> values) {
            addCriterion("FATHERCODE not in", values, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeBetween(String value1, String value2) {
            addCriterion("FATHERCODE between", value1, value2, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotBetween(String value1, String value2) {
            addCriterion("FATHERCODE not between", value1, value2, "fathercode");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNull() {
            addCriterion("LEVELS is null");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNotNull() {
            addCriterion("LEVELS is not null");
            return (Criteria) this;
        }

        public Criteria andLevelsEqualTo(BigDecimal value) {
            addCriterion("LEVELS =", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotEqualTo(BigDecimal value) {
            addCriterion("LEVELS <>", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThan(BigDecimal value) {
            addCriterion("LEVELS >", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELS >=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThan(BigDecimal value) {
            addCriterion("LEVELS <", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELS <=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsIn(List<BigDecimal> values) {
            addCriterion("LEVELS in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotIn(List<BigDecimal> values) {
            addCriterion("LEVELS not in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELS between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELS not between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyIsNull() {
            addCriterion("ISSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyIsNotNull() {
            addCriterion("ISSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyEqualTo(String value) {
            addCriterion("ISSUBCOMPANY =", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyNotEqualTo(String value) {
            addCriterion("ISSUBCOMPANY <>", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyGreaterThan(String value) {
            addCriterion("ISSUBCOMPANY >", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUBCOMPANY >=", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyLessThan(String value) {
            addCriterion("ISSUBCOMPANY <", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyLessThanOrEqualTo(String value) {
            addCriterion("ISSUBCOMPANY <=", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyLike(String value) {
            addCriterion("ISSUBCOMPANY like", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyNotLike(String value) {
            addCriterion("ISSUBCOMPANY not like", value, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyIn(List<String> values) {
            addCriterion("ISSUBCOMPANY in", values, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyNotIn(List<String> values) {
            addCriterion("ISSUBCOMPANY not in", values, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyBetween(String value1, String value2) {
            addCriterion("ISSUBCOMPANY between", value1, value2, "issubcompany");
            return (Criteria) this;
        }

        public Criteria andIssubcompanyNotBetween(String value1, String value2) {
            addCriterion("ISSUBCOMPANY not between", value1, value2, "issubcompany");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_department_tc
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
     * @Table : mm_department_tc
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