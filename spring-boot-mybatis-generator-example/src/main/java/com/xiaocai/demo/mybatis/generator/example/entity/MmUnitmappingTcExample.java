package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmUnitmappingTcExample {
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
    public MmUnitmappingTcExample() {
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
     * @Table : mm_unitmapping_tc
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

        public Criteria andZgswjgmcIsNull() {
            addCriterion("ZGSWJGMC is null");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcIsNotNull() {
            addCriterion("ZGSWJGMC is not null");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcEqualTo(String value) {
            addCriterion("ZGSWJGMC =", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcNotEqualTo(String value) {
            addCriterion("ZGSWJGMC <>", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcGreaterThan(String value) {
            addCriterion("ZGSWJGMC >", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZGSWJGMC >=", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcLessThan(String value) {
            addCriterion("ZGSWJGMC <", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcLessThanOrEqualTo(String value) {
            addCriterion("ZGSWJGMC <=", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcLike(String value) {
            addCriterion("ZGSWJGMC like", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcNotLike(String value) {
            addCriterion("ZGSWJGMC not like", value, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcIn(List<String> values) {
            addCriterion("ZGSWJGMC in", values, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcNotIn(List<String> values) {
            addCriterion("ZGSWJGMC not in", values, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcBetween(String value1, String value2) {
            addCriterion("ZGSWJGMC between", value1, value2, "zgswjgmc");
            return (Criteria) this;
        }

        public Criteria andZgswjgmcNotBetween(String value1, String value2) {
            addCriterion("ZGSWJGMC not between", value1, value2, "zgswjgmc");
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

        public Criteria andBankaccountIsNull() {
            addCriterion("BANKACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BANKACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("BANKACCOUNT =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("BANKACCOUNT <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("BANKACCOUNT >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("BANKACCOUNT <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("BANKACCOUNT like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("BANKACCOUNT not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("BANKACCOUNT in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("BANKACCOUNT not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNull() {
            addCriterion("GLBM is null");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNotNull() {
            addCriterion("GLBM is not null");
            return (Criteria) this;
        }

        public Criteria andGlbmEqualTo(String value) {
            addCriterion("GLBM =", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotEqualTo(String value) {
            addCriterion("GLBM <>", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThan(String value) {
            addCriterion("GLBM >", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThanOrEqualTo(String value) {
            addCriterion("GLBM >=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThan(String value) {
            addCriterion("GLBM <", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThanOrEqualTo(String value) {
            addCriterion("GLBM <=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLike(String value) {
            addCriterion("GLBM like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotLike(String value) {
            addCriterion("GLBM not like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmIn(List<String> values) {
            addCriterion("GLBM in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotIn(List<String> values) {
            addCriterion("GLBM not in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmBetween(String value1, String value2) {
            addCriterion("GLBM between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotBetween(String value1, String value2) {
            addCriterion("GLBM not between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhIsNull() {
            addCriterion("SWDJZZH is null");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhIsNotNull() {
            addCriterion("SWDJZZH is not null");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhEqualTo(String value) {
            addCriterion("SWDJZZH =", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhNotEqualTo(String value) {
            addCriterion("SWDJZZH <>", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhGreaterThan(String value) {
            addCriterion("SWDJZZH >", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhGreaterThanOrEqualTo(String value) {
            addCriterion("SWDJZZH >=", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhLessThan(String value) {
            addCriterion("SWDJZZH <", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhLessThanOrEqualTo(String value) {
            addCriterion("SWDJZZH <=", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhLike(String value) {
            addCriterion("SWDJZZH like", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhNotLike(String value) {
            addCriterion("SWDJZZH not like", value, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhIn(List<String> values) {
            addCriterion("SWDJZZH in", values, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhNotIn(List<String> values) {
            addCriterion("SWDJZZH not in", values, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhBetween(String value1, String value2) {
            addCriterion("SWDJZZH between", value1, value2, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andSwdjzzhNotBetween(String value1, String value2) {
            addCriterion("SWDJZZH not between", value1, value2, "swdjzzh");
            return (Criteria) this;
        }

        public Criteria andNsrmcIsNull() {
            addCriterion("NSRMC is null");
            return (Criteria) this;
        }

        public Criteria andNsrmcIsNotNull() {
            addCriterion("NSRMC is not null");
            return (Criteria) this;
        }

        public Criteria andNsrmcEqualTo(String value) {
            addCriterion("NSRMC =", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotEqualTo(String value) {
            addCriterion("NSRMC <>", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcGreaterThan(String value) {
            addCriterion("NSRMC >", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcGreaterThanOrEqualTo(String value) {
            addCriterion("NSRMC >=", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLessThan(String value) {
            addCriterion("NSRMC <", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLessThanOrEqualTo(String value) {
            addCriterion("NSRMC <=", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLike(String value) {
            addCriterion("NSRMC like", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotLike(String value) {
            addCriterion("NSRMC not like", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcIn(List<String> values) {
            addCriterion("NSRMC in", values, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotIn(List<String> values) {
            addCriterion("NSRMC not in", values, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcBetween(String value1, String value2) {
            addCriterion("NSRMC between", value1, value2, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotBetween(String value1, String value2) {
            addCriterion("NSRMC not between", value1, value2, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andSwjgbmIsNull() {
            addCriterion("SWJGBM is null");
            return (Criteria) this;
        }

        public Criteria andSwjgbmIsNotNull() {
            addCriterion("SWJGBM is not null");
            return (Criteria) this;
        }

        public Criteria andSwjgbmEqualTo(String value) {
            addCriterion("SWJGBM =", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmNotEqualTo(String value) {
            addCriterion("SWJGBM <>", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmGreaterThan(String value) {
            addCriterion("SWJGBM >", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmGreaterThanOrEqualTo(String value) {
            addCriterion("SWJGBM >=", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmLessThan(String value) {
            addCriterion("SWJGBM <", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmLessThanOrEqualTo(String value) {
            addCriterion("SWJGBM <=", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmLike(String value) {
            addCriterion("SWJGBM like", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmNotLike(String value) {
            addCriterion("SWJGBM not like", value, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmIn(List<String> values) {
            addCriterion("SWJGBM in", values, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmNotIn(List<String> values) {
            addCriterion("SWJGBM not in", values, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmBetween(String value1, String value2) {
            addCriterion("SWJGBM between", value1, value2, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andSwjgbmNotBetween(String value1, String value2) {
            addCriterion("SWJGBM not between", value1, value2, "swjgbm");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIsNull() {
            addCriterion("GSDJZH is null");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIsNotNull() {
            addCriterion("GSDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andGsdjzhEqualTo(String value) {
            addCriterion("GSDJZH =", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotEqualTo(String value) {
            addCriterion("GSDJZH <>", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhGreaterThan(String value) {
            addCriterion("GSDJZH >", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("GSDJZH >=", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLessThan(String value) {
            addCriterion("GSDJZH <", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLessThanOrEqualTo(String value) {
            addCriterion("GSDJZH <=", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLike(String value) {
            addCriterion("GSDJZH like", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotLike(String value) {
            addCriterion("GSDJZH not like", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIn(List<String> values) {
            addCriterion("GSDJZH in", values, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotIn(List<String> values) {
            addCriterion("GSDJZH not in", values, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhBetween(String value1, String value2) {
            addCriterion("GSDJZH between", value1, value2, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotBetween(String value1, String value2) {
            addCriterion("GSDJZH not between", value1, value2, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andHydmIsNull() {
            addCriterion("HYDM is null");
            return (Criteria) this;
        }

        public Criteria andHydmIsNotNull() {
            addCriterion("HYDM is not null");
            return (Criteria) this;
        }

        public Criteria andHydmEqualTo(String value) {
            addCriterion("HYDM =", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmNotEqualTo(String value) {
            addCriterion("HYDM <>", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmGreaterThan(String value) {
            addCriterion("HYDM >", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmGreaterThanOrEqualTo(String value) {
            addCriterion("HYDM >=", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmLessThan(String value) {
            addCriterion("HYDM <", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmLessThanOrEqualTo(String value) {
            addCriterion("HYDM <=", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmLike(String value) {
            addCriterion("HYDM like", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmNotLike(String value) {
            addCriterion("HYDM not like", value, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmIn(List<String> values) {
            addCriterion("HYDM in", values, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmNotIn(List<String> values) {
            addCriterion("HYDM not in", values, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmBetween(String value1, String value2) {
            addCriterion("HYDM between", value1, value2, "hydm");
            return (Criteria) this;
        }

        public Criteria andHydmNotBetween(String value1, String value2) {
            addCriterion("HYDM not between", value1, value2, "hydm");
            return (Criteria) this;
        }

        public Criteria andXmdzIsNull() {
            addCriterion("XMDZ is null");
            return (Criteria) this;
        }

        public Criteria andXmdzIsNotNull() {
            addCriterion("XMDZ is not null");
            return (Criteria) this;
        }

        public Criteria andXmdzEqualTo(String value) {
            addCriterion("XMDZ =", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzNotEqualTo(String value) {
            addCriterion("XMDZ <>", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzGreaterThan(String value) {
            addCriterion("XMDZ >", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzGreaterThanOrEqualTo(String value) {
            addCriterion("XMDZ >=", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzLessThan(String value) {
            addCriterion("XMDZ <", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzLessThanOrEqualTo(String value) {
            addCriterion("XMDZ <=", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzLike(String value) {
            addCriterion("XMDZ like", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzNotLike(String value) {
            addCriterion("XMDZ not like", value, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzIn(List<String> values) {
            addCriterion("XMDZ in", values, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzNotIn(List<String> values) {
            addCriterion("XMDZ not in", values, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzBetween(String value1, String value2) {
            addCriterion("XMDZ between", value1, value2, "xmdz");
            return (Criteria) this;
        }

        public Criteria andXmdzNotBetween(String value1, String value2) {
            addCriterion("XMDZ not between", value1, value2, "xmdz");
            return (Criteria) this;
        }

        public Criteria andYhbmIsNull() {
            addCriterion("YHBM is null");
            return (Criteria) this;
        }

        public Criteria andYhbmIsNotNull() {
            addCriterion("YHBM is not null");
            return (Criteria) this;
        }

        public Criteria andYhbmEqualTo(String value) {
            addCriterion("YHBM =", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmNotEqualTo(String value) {
            addCriterion("YHBM <>", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmGreaterThan(String value) {
            addCriterion("YHBM >", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmGreaterThanOrEqualTo(String value) {
            addCriterion("YHBM >=", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmLessThan(String value) {
            addCriterion("YHBM <", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmLessThanOrEqualTo(String value) {
            addCriterion("YHBM <=", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmLike(String value) {
            addCriterion("YHBM like", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmNotLike(String value) {
            addCriterion("YHBM not like", value, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmIn(List<String> values) {
            addCriterion("YHBM in", values, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmNotIn(List<String> values) {
            addCriterion("YHBM not in", values, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmBetween(String value1, String value2) {
            addCriterion("YHBM between", value1, value2, "yhbm");
            return (Criteria) this;
        }

        public Criteria andYhbmNotBetween(String value1, String value2) {
            addCriterion("YHBM not between", value1, value2, "yhbm");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameIsNull() {
            addCriterion("INVOICEUNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameIsNotNull() {
            addCriterion("INVOICEUNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameEqualTo(String value) {
            addCriterion("INVOICEUNITNAME =", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameNotEqualTo(String value) {
            addCriterion("INVOICEUNITNAME <>", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameGreaterThan(String value) {
            addCriterion("INVOICEUNITNAME >", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEUNITNAME >=", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameLessThan(String value) {
            addCriterion("INVOICEUNITNAME <", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameLessThanOrEqualTo(String value) {
            addCriterion("INVOICEUNITNAME <=", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameLike(String value) {
            addCriterion("INVOICEUNITNAME like", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameNotLike(String value) {
            addCriterion("INVOICEUNITNAME not like", value, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameIn(List<String> values) {
            addCriterion("INVOICEUNITNAME in", values, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameNotIn(List<String> values) {
            addCriterion("INVOICEUNITNAME not in", values, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameBetween(String value1, String value2) {
            addCriterion("INVOICEUNITNAME between", value1, value2, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitnameNotBetween(String value1, String value2) {
            addCriterion("INVOICEUNITNAME not between", value1, value2, "invoiceunitname");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhIsNull() {
            addCriterion("XHDWSBH is null");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhIsNotNull() {
            addCriterion("XHDWSBH is not null");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhEqualTo(String value) {
            addCriterion("XHDWSBH =", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhNotEqualTo(String value) {
            addCriterion("XHDWSBH <>", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhGreaterThan(String value) {
            addCriterion("XHDWSBH >", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhGreaterThanOrEqualTo(String value) {
            addCriterion("XHDWSBH >=", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhLessThan(String value) {
            addCriterion("XHDWSBH <", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhLessThanOrEqualTo(String value) {
            addCriterion("XHDWSBH <=", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhLike(String value) {
            addCriterion("XHDWSBH like", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhNotLike(String value) {
            addCriterion("XHDWSBH not like", value, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhIn(List<String> values) {
            addCriterion("XHDWSBH in", values, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhNotIn(List<String> values) {
            addCriterion("XHDWSBH not in", values, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhBetween(String value1, String value2) {
            addCriterion("XHDWSBH between", value1, value2, "xhdwsbh");
            return (Criteria) this;
        }

        public Criteria andXhdwsbhNotBetween(String value1, String value2) {
            addCriterion("XHDWSBH not between", value1, value2, "xhdwsbh");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_unitmapping_tc
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
     * @Table : mm_unitmapping_tc
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