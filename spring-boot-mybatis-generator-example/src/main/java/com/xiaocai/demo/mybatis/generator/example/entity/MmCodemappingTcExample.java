package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmCodemappingTcExample {
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
    public MmCodemappingTcExample() {
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
     * @Table : mm_codemapping_tc
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

        public Criteria andCodetypeIsNull() {
            addCriterion("CODETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNotNull() {
            addCriterion("CODETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeEqualTo(String value) {
            addCriterion("CODETYPE =", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotEqualTo(String value) {
            addCriterion("CODETYPE <>", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThan(String value) {
            addCriterion("CODETYPE >", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CODETYPE >=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThan(String value) {
            addCriterion("CODETYPE <", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThanOrEqualTo(String value) {
            addCriterion("CODETYPE <=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLike(String value) {
            addCriterion("CODETYPE like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotLike(String value) {
            addCriterion("CODETYPE not like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeIn(List<String> values) {
            addCriterion("CODETYPE in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotIn(List<String> values) {
            addCriterion("CODETYPE not in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeBetween(String value1, String value2) {
            addCriterion("CODETYPE between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotBetween(String value1, String value2) {
            addCriterion("CODETYPE not between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andOldcodeIsNull() {
            addCriterion("OLDCODE is null");
            return (Criteria) this;
        }

        public Criteria andOldcodeIsNotNull() {
            addCriterion("OLDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOldcodeEqualTo(String value) {
            addCriterion("OLDCODE =", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotEqualTo(String value) {
            addCriterion("OLDCODE <>", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeGreaterThan(String value) {
            addCriterion("OLDCODE >", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OLDCODE >=", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLessThan(String value) {
            addCriterion("OLDCODE <", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLessThanOrEqualTo(String value) {
            addCriterion("OLDCODE <=", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLike(String value) {
            addCriterion("OLDCODE like", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotLike(String value) {
            addCriterion("OLDCODE not like", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeIn(List<String> values) {
            addCriterion("OLDCODE in", values, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotIn(List<String> values) {
            addCriterion("OLDCODE not in", values, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeBetween(String value1, String value2) {
            addCriterion("OLDCODE between", value1, value2, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotBetween(String value1, String value2) {
            addCriterion("OLDCODE not between", value1, value2, "oldcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeIsNull() {
            addCriterion("NEWCODE is null");
            return (Criteria) this;
        }

        public Criteria andNewcodeIsNotNull() {
            addCriterion("NEWCODE is not null");
            return (Criteria) this;
        }

        public Criteria andNewcodeEqualTo(String value) {
            addCriterion("NEWCODE =", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeNotEqualTo(String value) {
            addCriterion("NEWCODE <>", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeGreaterThan(String value) {
            addCriterion("NEWCODE >", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeGreaterThanOrEqualTo(String value) {
            addCriterion("NEWCODE >=", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeLessThan(String value) {
            addCriterion("NEWCODE <", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeLessThanOrEqualTo(String value) {
            addCriterion("NEWCODE <=", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeLike(String value) {
            addCriterion("NEWCODE like", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeNotLike(String value) {
            addCriterion("NEWCODE not like", value, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeIn(List<String> values) {
            addCriterion("NEWCODE in", values, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeNotIn(List<String> values) {
            addCriterion("NEWCODE not in", values, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeBetween(String value1, String value2) {
            addCriterion("NEWCODE between", value1, value2, "newcode");
            return (Criteria) this;
        }

        public Criteria andNewcodeNotBetween(String value1, String value2) {
            addCriterion("NEWCODE not between", value1, value2, "newcode");
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

        public Criteria andLastopcodeIsNull() {
            addCriterion("LASTOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNotNull() {
            addCriterion("LASTOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeEqualTo(String value) {
            addCriterion("LASTOPCODE =", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotEqualTo(String value) {
            addCriterion("LASTOPCODE <>", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThan(String value) {
            addCriterion("LASTOPCODE >", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE >=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThan(String value) {
            addCriterion("LASTOPCODE <", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE <=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLike(String value) {
            addCriterion("LASTOPCODE like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotLike(String value) {
            addCriterion("LASTOPCODE not like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIn(List<String> values) {
            addCriterion("LASTOPCODE in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotIn(List<String> values) {
            addCriterion("LASTOPCODE not in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeBetween(String value1, String value2) {
            addCriterion("LASTOPCODE between", value1, value2, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotBetween(String value1, String value2) {
            addCriterion("LASTOPCODE not between", value1, value2, "lastopcode");
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

        public Criteria andReference1IsNull() {
            addCriterion("REFERENCE1 is null");
            return (Criteria) this;
        }

        public Criteria andReference1IsNotNull() {
            addCriterion("REFERENCE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReference1EqualTo(String value) {
            addCriterion("REFERENCE1 =", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotEqualTo(String value) {
            addCriterion("REFERENCE1 <>", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1GreaterThan(String value) {
            addCriterion("REFERENCE1 >", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE1 >=", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1LessThan(String value) {
            addCriterion("REFERENCE1 <", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE1 <=", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1Like(String value) {
            addCriterion("REFERENCE1 like", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotLike(String value) {
            addCriterion("REFERENCE1 not like", value, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1In(List<String> values) {
            addCriterion("REFERENCE1 in", values, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotIn(List<String> values) {
            addCriterion("REFERENCE1 not in", values, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1Between(String value1, String value2) {
            addCriterion("REFERENCE1 between", value1, value2, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference1NotBetween(String value1, String value2) {
            addCriterion("REFERENCE1 not between", value1, value2, "reference1");
            return (Criteria) this;
        }

        public Criteria andReference2IsNull() {
            addCriterion("REFERENCE2 is null");
            return (Criteria) this;
        }

        public Criteria andReference2IsNotNull() {
            addCriterion("REFERENCE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReference2EqualTo(String value) {
            addCriterion("REFERENCE2 =", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2NotEqualTo(String value) {
            addCriterion("REFERENCE2 <>", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2GreaterThan(String value) {
            addCriterion("REFERENCE2 >", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE2 >=", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2LessThan(String value) {
            addCriterion("REFERENCE2 <", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE2 <=", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2Like(String value) {
            addCriterion("REFERENCE2 like", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2NotLike(String value) {
            addCriterion("REFERENCE2 not like", value, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2In(List<String> values) {
            addCriterion("REFERENCE2 in", values, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2NotIn(List<String> values) {
            addCriterion("REFERENCE2 not in", values, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2Between(String value1, String value2) {
            addCriterion("REFERENCE2 between", value1, value2, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference2NotBetween(String value1, String value2) {
            addCriterion("REFERENCE2 not between", value1, value2, "reference2");
            return (Criteria) this;
        }

        public Criteria andReference3IsNull() {
            addCriterion("REFERENCE3 is null");
            return (Criteria) this;
        }

        public Criteria andReference3IsNotNull() {
            addCriterion("REFERENCE3 is not null");
            return (Criteria) this;
        }

        public Criteria andReference3EqualTo(String value) {
            addCriterion("REFERENCE3 =", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3NotEqualTo(String value) {
            addCriterion("REFERENCE3 <>", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3GreaterThan(String value) {
            addCriterion("REFERENCE3 >", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE3 >=", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3LessThan(String value) {
            addCriterion("REFERENCE3 <", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE3 <=", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3Like(String value) {
            addCriterion("REFERENCE3 like", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3NotLike(String value) {
            addCriterion("REFERENCE3 not like", value, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3In(List<String> values) {
            addCriterion("REFERENCE3 in", values, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3NotIn(List<String> values) {
            addCriterion("REFERENCE3 not in", values, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3Between(String value1, String value2) {
            addCriterion("REFERENCE3 between", value1, value2, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference3NotBetween(String value1, String value2) {
            addCriterion("REFERENCE3 not between", value1, value2, "reference3");
            return (Criteria) this;
        }

        public Criteria andReference4IsNull() {
            addCriterion("REFERENCE4 is null");
            return (Criteria) this;
        }

        public Criteria andReference4IsNotNull() {
            addCriterion("REFERENCE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReference4EqualTo(String value) {
            addCriterion("REFERENCE4 =", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotEqualTo(String value) {
            addCriterion("REFERENCE4 <>", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThan(String value) {
            addCriterion("REFERENCE4 >", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 >=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThan(String value) {
            addCriterion("REFERENCE4 <", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 <=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Like(String value) {
            addCriterion("REFERENCE4 like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotLike(String value) {
            addCriterion("REFERENCE4 not like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4In(List<String> values) {
            addCriterion("REFERENCE4 in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotIn(List<String> values) {
            addCriterion("REFERENCE4 not in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Between(String value1, String value2) {
            addCriterion("REFERENCE4 between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotBetween(String value1, String value2) {
            addCriterion("REFERENCE4 not between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("OPCODE =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("OPCODE <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("OPCODE >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("OPCODE <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("OPCODE <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("OPCODE like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("OPCODE not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("OPCODE in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("OPCODE not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("OPCODE between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("OPCODE not between", value1, value2, "opcode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_codemapping_tc
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
     * @Table : mm_codemapping_tc
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