package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmUnitTcExample {
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
    public MmUnitTcExample() {
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
     * @Table : mm_unit_tc
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

        public Criteria andUnitnameIsNull() {
            addCriterion("UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UNITNAME =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UNITNAME <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UNITNAME >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNITNAME >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UNITNAME <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UNITNAME <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UNITNAME like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UNITNAME not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UNITNAME in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UNITNAME not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UNITNAME between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UNITNAME not between", value1, value2, "unitname");
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

        public Criteria andUnitlevelIsNull() {
            addCriterion("UNITLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUnitlevelIsNotNull() {
            addCriterion("UNITLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUnitlevelEqualTo(String value) {
            addCriterion("UNITLEVEL =", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelNotEqualTo(String value) {
            addCriterion("UNITLEVEL <>", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelGreaterThan(String value) {
            addCriterion("UNITLEVEL >", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelGreaterThanOrEqualTo(String value) {
            addCriterion("UNITLEVEL >=", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelLessThan(String value) {
            addCriterion("UNITLEVEL <", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelLessThanOrEqualTo(String value) {
            addCriterion("UNITLEVEL <=", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelLike(String value) {
            addCriterion("UNITLEVEL like", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelNotLike(String value) {
            addCriterion("UNITLEVEL not like", value, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelIn(List<String> values) {
            addCriterion("UNITLEVEL in", values, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelNotIn(List<String> values) {
            addCriterion("UNITLEVEL not in", values, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelBetween(String value1, String value2) {
            addCriterion("UNITLEVEL between", value1, value2, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andUnitlevelNotBetween(String value1, String value2) {
            addCriterion("UNITLEVEL not between", value1, value2, "unitlevel");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeIsNull() {
            addCriterion("FATHERUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeIsNotNull() {
            addCriterion("FATHERUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeEqualTo(String value) {
            addCriterion("FATHERUNITCODE =", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeNotEqualTo(String value) {
            addCriterion("FATHERUNITCODE <>", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeGreaterThan(String value) {
            addCriterion("FATHERUNITCODE >", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERUNITCODE >=", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeLessThan(String value) {
            addCriterion("FATHERUNITCODE <", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeLessThanOrEqualTo(String value) {
            addCriterion("FATHERUNITCODE <=", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeLike(String value) {
            addCriterion("FATHERUNITCODE like", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeNotLike(String value) {
            addCriterion("FATHERUNITCODE not like", value, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeIn(List<String> values) {
            addCriterion("FATHERUNITCODE in", values, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeNotIn(List<String> values) {
            addCriterion("FATHERUNITCODE not in", values, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeBetween(String value1, String value2) {
            addCriterion("FATHERUNITCODE between", value1, value2, "fatherunitcode");
            return (Criteria) this;
        }

        public Criteria andFatherunitcodeNotBetween(String value1, String value2) {
            addCriterion("FATHERUNITCODE not between", value1, value2, "fatherunitcode");
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

        public Criteria andTaxpayernoIsNull() {
            addCriterion("TAXPAYERNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoIsNotNull() {
            addCriterion("TAXPAYERNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoEqualTo(String value) {
            addCriterion("TAXPAYERNO =", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotEqualTo(String value) {
            addCriterion("TAXPAYERNO <>", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoGreaterThan(String value) {
            addCriterion("TAXPAYERNO >", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNO >=", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLessThan(String value) {
            addCriterion("TAXPAYERNO <", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNO <=", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLike(String value) {
            addCriterion("TAXPAYERNO like", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotLike(String value) {
            addCriterion("TAXPAYERNO not like", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoIn(List<String> values) {
            addCriterion("TAXPAYERNO in", values, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotIn(List<String> values) {
            addCriterion("TAXPAYERNO not in", values, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoBetween(String value1, String value2) {
            addCriterion("TAXPAYERNO between", value1, value2, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNO not between", value1, value2, "taxpayerno");
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

        public Criteria andShortunitnameIsNull() {
            addCriterion("SHORTUNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortunitnameIsNotNull() {
            addCriterion("SHORTUNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortunitnameEqualTo(String value) {
            addCriterion("SHORTUNITNAME =", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameNotEqualTo(String value) {
            addCriterion("SHORTUNITNAME <>", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameGreaterThan(String value) {
            addCriterion("SHORTUNITNAME >", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTUNITNAME >=", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameLessThan(String value) {
            addCriterion("SHORTUNITNAME <", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTUNITNAME <=", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameLike(String value) {
            addCriterion("SHORTUNITNAME like", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameNotLike(String value) {
            addCriterion("SHORTUNITNAME not like", value, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameIn(List<String> values) {
            addCriterion("SHORTUNITNAME in", values, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameNotIn(List<String> values) {
            addCriterion("SHORTUNITNAME not in", values, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameBetween(String value1, String value2) {
            addCriterion("SHORTUNITNAME between", value1, value2, "shortunitname");
            return (Criteria) this;
        }

        public Criteria andShortunitnameNotBetween(String value1, String value2) {
            addCriterion("SHORTUNITNAME not between", value1, value2, "shortunitname");
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

        public Criteria andDrawerIsNull() {
            addCriterion("DRAWER is null");
            return (Criteria) this;
        }

        public Criteria andDrawerIsNotNull() {
            addCriterion("DRAWER is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerEqualTo(String value) {
            addCriterion("DRAWER =", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotEqualTo(String value) {
            addCriterion("DRAWER <>", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThan(String value) {
            addCriterion("DRAWER >", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWER >=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThan(String value) {
            addCriterion("DRAWER <", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThanOrEqualTo(String value) {
            addCriterion("DRAWER <=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLike(String value) {
            addCriterion("DRAWER like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotLike(String value) {
            addCriterion("DRAWER not like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerIn(List<String> values) {
            addCriterion("DRAWER in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotIn(List<String> values) {
            addCriterion("DRAWER not in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerBetween(String value1, String value2) {
            addCriterion("DRAWER between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotBetween(String value1, String value2) {
            addCriterion("DRAWER not between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("CHECKER =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("CHECKER <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("CHECKER >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKER >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("CHECKER <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("CHECKER <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("CHECKER like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("CHECKER not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("CHECKER in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("CHECKER not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("CHECKER between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("CHECKER not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andPayeenameIsNull() {
            addCriterion("PAYEENAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeenameIsNotNull() {
            addCriterion("PAYEENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeenameEqualTo(String value) {
            addCriterion("PAYEENAME =", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotEqualTo(String value) {
            addCriterion("PAYEENAME <>", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThan(String value) {
            addCriterion("PAYEENAME >", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEENAME >=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThan(String value) {
            addCriterion("PAYEENAME <", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThanOrEqualTo(String value) {
            addCriterion("PAYEENAME <=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLike(String value) {
            addCriterion("PAYEENAME like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotLike(String value) {
            addCriterion("PAYEENAME not like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameIn(List<String> values) {
            addCriterion("PAYEENAME in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotIn(List<String> values) {
            addCriterion("PAYEENAME not in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameBetween(String value1, String value2) {
            addCriterion("PAYEENAME between", value1, value2, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotBetween(String value1, String value2) {
            addCriterion("PAYEENAME not between", value1, value2, "payeename");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_unit_tc
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
     * @Table : mm_unit_tc
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