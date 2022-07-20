package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmFormatComponentTcExample {
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
    public MmFormatComponentTcExample() {
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
     * @Table : mm_format_component_tc
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

        public Criteria andComponentidIsNull() {
            addCriterion("COMPONENTID is null");
            return (Criteria) this;
        }

        public Criteria andComponentidIsNotNull() {
            addCriterion("COMPONENTID is not null");
            return (Criteria) this;
        }

        public Criteria andComponentidEqualTo(Long value) {
            addCriterion("COMPONENTID =", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotEqualTo(Long value) {
            addCriterion("COMPONENTID <>", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidGreaterThan(Long value) {
            addCriterion("COMPONENTID >", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPONENTID >=", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidLessThan(Long value) {
            addCriterion("COMPONENTID <", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidLessThanOrEqualTo(Long value) {
            addCriterion("COMPONENTID <=", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidIn(List<Long> values) {
            addCriterion("COMPONENTID in", values, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotIn(List<Long> values) {
            addCriterion("COMPONENTID not in", values, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidBetween(Long value1, Long value2) {
            addCriterion("COMPONENTID between", value1, value2, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotBetween(Long value1, Long value2) {
            addCriterion("COMPONENTID not between", value1, value2, "componentid");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNull() {
            addCriterion("FORMATID is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(BigDecimal value) {
            addCriterion("FORMATID =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(BigDecimal value) {
            addCriterion("FORMATID <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(BigDecimal value) {
            addCriterion("FORMATID >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATID >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(BigDecimal value) {
            addCriterion("FORMATID <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATID <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<BigDecimal> values) {
            addCriterion("FORMATID in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<BigDecimal> values) {
            addCriterion("FORMATID not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATID between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATID not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIsNull() {
            addCriterion("COMPONENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIsNotNull() {
            addCriterion("COMPONENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeEqualTo(String value) {
            addCriterion("COMPONENTTYPE =", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotEqualTo(String value) {
            addCriterion("COMPONENTTYPE <>", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThan(String value) {
            addCriterion("COMPONENTTYPE >", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENTTYPE >=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThan(String value) {
            addCriterion("COMPONENTTYPE <", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThanOrEqualTo(String value) {
            addCriterion("COMPONENTTYPE <=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLike(String value) {
            addCriterion("COMPONENTTYPE like", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotLike(String value) {
            addCriterion("COMPONENTTYPE not like", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIn(List<String> values) {
            addCriterion("COMPONENTTYPE in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotIn(List<String> values) {
            addCriterion("COMPONENTTYPE not in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeBetween(String value1, String value2) {
            addCriterion("COMPONENTTYPE between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotBetween(String value1, String value2) {
            addCriterion("COMPONENTTYPE not between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DISPLAYORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DISPLAYORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(BigDecimal value) {
            addCriterion("DISPLAYORDER >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(BigDecimal value) {
            addCriterion("DISPLAYORDER <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andIsaddIsNull() {
            addCriterion("ISADD is null");
            return (Criteria) this;
        }

        public Criteria andIsaddIsNotNull() {
            addCriterion("ISADD is not null");
            return (Criteria) this;
        }

        public Criteria andIsaddEqualTo(BigDecimal value) {
            addCriterion("ISADD =", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotEqualTo(BigDecimal value) {
            addCriterion("ISADD <>", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddGreaterThan(BigDecimal value) {
            addCriterion("ISADD >", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISADD >=", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddLessThan(BigDecimal value) {
            addCriterion("ISADD <", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISADD <=", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddIn(List<BigDecimal> values) {
            addCriterion("ISADD in", values, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotIn(List<BigDecimal> values) {
            addCriterion("ISADD not in", values, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISADD between", value1, value2, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISADD not between", value1, value2, "isadd");
            return (Criteria) this;
        }

        public Criteria andSplitIsNull() {
            addCriterion("SPLIT is null");
            return (Criteria) this;
        }

        public Criteria andSplitIsNotNull() {
            addCriterion("SPLIT is not null");
            return (Criteria) this;
        }

        public Criteria andSplitEqualTo(String value) {
            addCriterion("SPLIT =", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotEqualTo(String value) {
            addCriterion("SPLIT <>", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThan(String value) {
            addCriterion("SPLIT >", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThanOrEqualTo(String value) {
            addCriterion("SPLIT >=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThan(String value) {
            addCriterion("SPLIT <", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThanOrEqualTo(String value) {
            addCriterion("SPLIT <=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLike(String value) {
            addCriterion("SPLIT like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotLike(String value) {
            addCriterion("SPLIT not like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitIn(List<String> values) {
            addCriterion("SPLIT in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotIn(List<String> values) {
            addCriterion("SPLIT not in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitBetween(String value1, String value2) {
            addCriterion("SPLIT between", value1, value2, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotBetween(String value1, String value2) {
            addCriterion("SPLIT not between", value1, value2, "split");
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

        public Criteria andCellshowtypeIsNull() {
            addCriterion("CELLSHOWTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeIsNotNull() {
            addCriterion("CELLSHOWTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeEqualTo(String value) {
            addCriterion("CELLSHOWTYPE =", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeNotEqualTo(String value) {
            addCriterion("CELLSHOWTYPE <>", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeGreaterThan(String value) {
            addCriterion("CELLSHOWTYPE >", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CELLSHOWTYPE >=", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeLessThan(String value) {
            addCriterion("CELLSHOWTYPE <", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeLessThanOrEqualTo(String value) {
            addCriterion("CELLSHOWTYPE <=", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeLike(String value) {
            addCriterion("CELLSHOWTYPE like", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeNotLike(String value) {
            addCriterion("CELLSHOWTYPE not like", value, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeIn(List<String> values) {
            addCriterion("CELLSHOWTYPE in", values, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeNotIn(List<String> values) {
            addCriterion("CELLSHOWTYPE not in", values, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeBetween(String value1, String value2) {
            addCriterion("CELLSHOWTYPE between", value1, value2, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andCellshowtypeNotBetween(String value1, String value2) {
            addCriterion("CELLSHOWTYPE not between", value1, value2, "cellshowtype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeIsNull() {
            addCriterion("DATAGETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatagettypeIsNotNull() {
            addCriterion("DATAGETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatagettypeEqualTo(String value) {
            addCriterion("DATAGETTYPE =", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeNotEqualTo(String value) {
            addCriterion("DATAGETTYPE <>", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeGreaterThan(String value) {
            addCriterion("DATAGETTYPE >", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATAGETTYPE >=", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeLessThan(String value) {
            addCriterion("DATAGETTYPE <", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeLessThanOrEqualTo(String value) {
            addCriterion("DATAGETTYPE <=", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeLike(String value) {
            addCriterion("DATAGETTYPE like", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeNotLike(String value) {
            addCriterion("DATAGETTYPE not like", value, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeIn(List<String> values) {
            addCriterion("DATAGETTYPE in", values, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeNotIn(List<String> values) {
            addCriterion("DATAGETTYPE not in", values, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeBetween(String value1, String value2) {
            addCriterion("DATAGETTYPE between", value1, value2, "datagettype");
            return (Criteria) this;
        }

        public Criteria andDatagettypeNotBetween(String value1, String value2) {
            addCriterion("DATAGETTYPE not between", value1, value2, "datagettype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_format_component_tc
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
     * @Table : mm_format_component_tc
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