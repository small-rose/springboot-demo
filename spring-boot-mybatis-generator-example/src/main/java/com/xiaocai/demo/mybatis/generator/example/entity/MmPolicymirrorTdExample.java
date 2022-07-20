package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPolicymirrorTdExample {
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
    public MmPolicymirrorTdExample() {
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
     * @Table : mm_policymirror_td
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

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(Long value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(Long value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(Long value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(Long value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(Long value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(Long value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<Long> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<Long> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(Long value1, Long value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(Long value1, Long value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNull() {
            addCriterion("MIRRORID is null");
            return (Criteria) this;
        }

        public Criteria andMirroridIsNotNull() {
            addCriterion("MIRRORID is not null");
            return (Criteria) this;
        }

        public Criteria andMirroridEqualTo(Long value) {
            addCriterion("MIRRORID =", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotEqualTo(Long value) {
            addCriterion("MIRRORID <>", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThan(Long value) {
            addCriterion("MIRRORID >", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridGreaterThanOrEqualTo(Long value) {
            addCriterion("MIRRORID >=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThan(Long value) {
            addCriterion("MIRRORID <", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridLessThanOrEqualTo(Long value) {
            addCriterion("MIRRORID <=", value, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridIn(List<Long> values) {
            addCriterion("MIRRORID in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotIn(List<Long> values) {
            addCriterion("MIRRORID not in", values, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridBetween(Long value1, Long value2) {
            addCriterion("MIRRORID between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andMirroridNotBetween(Long value1, Long value2) {
            addCriterion("MIRRORID not between", value1, value2, "mirrorid");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNull() {
            addCriterion("SEQPOLICY is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("SEQPOLICY is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(Long value) {
            addCriterion("SEQPOLICY =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(Long value) {
            addCriterion("SEQPOLICY <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(Long value) {
            addCriterion("SEQPOLICY >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQPOLICY >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(Long value) {
            addCriterion("SEQPOLICY <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(Long value) {
            addCriterion("SEQPOLICY <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<Long> values) {
            addCriterion("SEQPOLICY in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<Long> values) {
            addCriterion("SEQPOLICY not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(Long value1, Long value2) {
            addCriterion("SEQPOLICY between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(Long value1, Long value2) {
            addCriterion("SEQPOLICY not between", value1, value2, "seqpolicy");
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

        public Criteria andRemainsIsNull() {
            addCriterion("REMAINS is null");
            return (Criteria) this;
        }

        public Criteria andRemainsIsNotNull() {
            addCriterion("REMAINS is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsEqualTo(BigDecimal value) {
            addCriterion("REMAINS =", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotEqualTo(BigDecimal value) {
            addCriterion("REMAINS <>", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsGreaterThan(BigDecimal value) {
            addCriterion("REMAINS >", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS >=", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsLessThan(BigDecimal value) {
            addCriterion("REMAINS <", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS <=", value, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsIn(List<BigDecimal> values) {
            addCriterion("REMAINS in", values, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotIn(List<BigDecimal> values) {
            addCriterion("REMAINS not in", values, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS between", value1, value2, "remains");
            return (Criteria) this;
        }

        public Criteria andRemainsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS not between", value1, value2, "remains");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNull() {
            addCriterion("BUSINESSATTR is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("BUSINESSATTR is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("BUSINESSATTR =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("BUSINESSATTR <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("BUSINESSATTR >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("BUSINESSATTR <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("BUSINESSATTR like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("BUSINESSATTR not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("BUSINESSATTR in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("BUSINESSATTR not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNull() {
            addCriterion("IFSTART is null");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNotNull() {
            addCriterion("IFSTART is not null");
            return (Criteria) this;
        }

        public Criteria andIfstartEqualTo(String value) {
            addCriterion("IFSTART =", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotEqualTo(String value) {
            addCriterion("IFSTART <>", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThan(String value) {
            addCriterion("IFSTART >", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThanOrEqualTo(String value) {
            addCriterion("IFSTART >=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThan(String value) {
            addCriterion("IFSTART <", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThanOrEqualTo(String value) {
            addCriterion("IFSTART <=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLike(String value) {
            addCriterion("IFSTART like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotLike(String value) {
            addCriterion("IFSTART not like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartIn(List<String> values) {
            addCriterion("IFSTART in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotIn(List<String> values) {
            addCriterion("IFSTART not in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartBetween(String value1, String value2) {
            addCriterion("IFSTART between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotBetween(String value1, String value2) {
            addCriterion("IFSTART not between", value1, value2, "ifstart");
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

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
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

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
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

        public Criteria andTransactorcodeIsNull() {
            addCriterion("TRANSACTORCODE is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("TRANSACTORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("TRANSACTORCODE =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("TRANSACTORCODE <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("TRANSACTORCODE >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("TRANSACTORCODE <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("TRANSACTORCODE like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("TRANSACTORCODE not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("TRANSACTORCODE in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("TRANSACTORCODE not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNull() {
            addCriterion("UNDERWRITERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIsNotNull() {
            addCriterion("UNDERWRITERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeEqualTo(String value) {
            addCriterion("UNDERWRITERCODE =", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <>", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThan(String value) {
            addCriterion("UNDERWRITERCODE >", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE >=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThan(String value) {
            addCriterion("UNDERWRITERCODE <", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLessThanOrEqualTo(String value) {
            addCriterion("UNDERWRITERCODE <=", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeLike(String value) {
            addCriterion("UNDERWRITERCODE like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotLike(String value) {
            addCriterion("UNDERWRITERCODE not like", value, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeIn(List<String> values) {
            addCriterion("UNDERWRITERCODE in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotIn(List<String> values) {
            addCriterion("UNDERWRITERCODE not in", values, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andUnderwritercodeNotBetween(String value1, String value2) {
            addCriterion("UNDERWRITERCODE not between", value1, value2, "underwritercode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("CLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("CLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("CLASSESCODE like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("CLASSESCODE not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNull() {
            addCriterion("RISKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("RISKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("RISKTYPE =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("RISKTYPE <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("RISKTYPE >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKTYPE >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("RISKTYPE <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("RISKTYPE <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("RISKTYPE like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("RISKTYPE not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("RISKTYPE in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("RISKTYPE not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("RISKTYPE between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("RISKTYPE not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNull() {
            addCriterion("CLASSESKIND is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNotNull() {
            addCriterion("CLASSESKIND is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindEqualTo(String value) {
            addCriterion("CLASSESKIND =", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotEqualTo(String value) {
            addCriterion("CLASSESKIND <>", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThan(String value) {
            addCriterion("CLASSESKIND >", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND >=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThan(String value) {
            addCriterion("CLASSESKIND <", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND <=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLike(String value) {
            addCriterion("CLASSESKIND like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotLike(String value) {
            addCriterion("CLASSESKIND not like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindIn(List<String> values) {
            addCriterion("CLASSESKIND in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotIn(List<String> values) {
            addCriterion("CLASSESKIND not in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindBetween(String value1, String value2) {
            addCriterion("CLASSESKIND between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotBetween(String value1, String value2) {
            addCriterion("CLASSESKIND not between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("AGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("AGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("AGENTCODE =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("AGENTCODE <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("AGENTCODE >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTCODE >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("AGENTCODE <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENTCODE <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("AGENTCODE like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("AGENTCODE not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("AGENTCODE in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("AGENTCODE not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("AGENTCODE between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("AGENTCODE not between", value1, value2, "agentcode");
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

        public Criteria andHibernateversionIsNull() {
            addCriterion("HIBERNATEVERSION is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("HIBERNATEVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andAccountageIsNull() {
            addCriterion("ACCOUNTAGE is null");
            return (Criteria) this;
        }

        public Criteria andAccountageIsNotNull() {
            addCriterion("ACCOUNTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountageEqualTo(String value) {
            addCriterion("ACCOUNTAGE =", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotEqualTo(String value) {
            addCriterion("ACCOUNTAGE <>", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThan(String value) {
            addCriterion("ACCOUNTAGE >", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE >=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThan(String value) {
            addCriterion("ACCOUNTAGE <", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE <=", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageLike(String value) {
            addCriterion("ACCOUNTAGE like", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotLike(String value) {
            addCriterion("ACCOUNTAGE not like", value, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageIn(List<String> values) {
            addCriterion("ACCOUNTAGE in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotIn(List<String> values) {
            addCriterion("ACCOUNTAGE not in", values, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageBetween(String value1, String value2) {
            addCriterion("ACCOUNTAGE between", value1, value2, "accountage");
            return (Criteria) this;
        }

        public Criteria andAccountageNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTAGE not between", value1, value2, "accountage");
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

        public Criteria andRealamountIsNull() {
            addCriterion("REALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealamountIsNotNull() {
            addCriterion("REALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealamountEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT =", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <>", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThan(BigDecimal value) {
            addCriterion("REALAMOUNT >", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT >=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThan(BigDecimal value) {
            addCriterion("REALAMOUNT <", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALAMOUNT <=", value, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotIn(List<BigDecimal> values) {
            addCriterion("REALAMOUNT not in", values, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andRealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALAMOUNT not between", value1, value2, "realamount");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNull() {
            addCriterion("SEQCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIsNotNull() {
            addCriterion("SEQCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqchargeEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE =", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE <>", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThan(BigDecimal value) {
            addCriterion("SEQCHARGE >", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE >=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThan(BigDecimal value) {
            addCriterion("SEQCHARGE <", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQCHARGE <=", value, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeIn(List<BigDecimal> values) {
            addCriterion("SEQCHARGE in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotIn(List<BigDecimal> values) {
            addCriterion("SEQCHARGE not in", values, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQCHARGE between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSeqchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQCHARGE not between", value1, value2, "seqcharge");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("SIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("SIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterionForJDBCDate("SIGNDATE <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIGNDATE <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SIGNDATE not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIGNDATE not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andAccountdayIsNull() {
            addCriterion("ACCOUNTDAY is null");
            return (Criteria) this;
        }

        public Criteria andAccountdayIsNotNull() {
            addCriterion("ACCOUNTDAY is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdayEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY =", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayNotEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY <>", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayGreaterThan(Integer value) {
            addCriterion("ACCOUNTDAY >", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY >=", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayLessThan(Integer value) {
            addCriterion("ACCOUNTDAY <", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY <=", value, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayIn(List<Integer> values) {
            addCriterion("ACCOUNTDAY in", values, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayNotIn(List<Integer> values) {
            addCriterion("ACCOUNTDAY not in", values, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY between", value1, value2, "accountday");
            return (Criteria) this;
        }

        public Criteria andAccountdayNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY not between", value1, value2, "accountday");
            return (Criteria) this;
        }

        public Criteria andClassescodenameIsNull() {
            addCriterion("CLASSESCODENAME is null");
            return (Criteria) this;
        }

        public Criteria andClassescodenameIsNotNull() {
            addCriterion("CLASSESCODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodenameEqualTo(String value) {
            addCriterion("CLASSESCODENAME =", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameNotEqualTo(String value) {
            addCriterion("CLASSESCODENAME <>", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameGreaterThan(String value) {
            addCriterion("CLASSESCODENAME >", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODENAME >=", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameLessThan(String value) {
            addCriterion("CLASSESCODENAME <", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODENAME <=", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameLike(String value) {
            addCriterion("CLASSESCODENAME like", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameNotLike(String value) {
            addCriterion("CLASSESCODENAME not like", value, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameIn(List<String> values) {
            addCriterion("CLASSESCODENAME in", values, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameNotIn(List<String> values) {
            addCriterion("CLASSESCODENAME not in", values, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameBetween(String value1, String value2) {
            addCriterion("CLASSESCODENAME between", value1, value2, "classescodename");
            return (Criteria) this;
        }

        public Criteria andClassescodenameNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODENAME not between", value1, value2, "classescodename");
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

        public Criteria andAccountedDrIsNull() {
            addCriterion("ACCOUNTED_DR is null");
            return (Criteria) this;
        }

        public Criteria andAccountedDrIsNotNull() {
            addCriterion("ACCOUNTED_DR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountedDrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR =", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <>", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTED_DR >", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR >=", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrLessThan(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTED_DR <=", value, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_DR in", values, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTED_DR not in", values, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_DR between", value1, value2, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andAccountedDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTED_DR not between", value1, value2, "accountedDr");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andAccountday2IsNull() {
            addCriterion("ACCOUNTDAY2 is null");
            return (Criteria) this;
        }

        public Criteria andAccountday2IsNotNull() {
            addCriterion("ACCOUNTDAY2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountday2EqualTo(Integer value) {
            addCriterion("ACCOUNTDAY2 =", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2NotEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY2 <>", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2GreaterThan(Integer value) {
            addCriterion("ACCOUNTDAY2 >", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY2 >=", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2LessThan(Integer value) {
            addCriterion("ACCOUNTDAY2 <", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2LessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY2 <=", value, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2In(List<Integer> values) {
            addCriterion("ACCOUNTDAY2 in", values, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2NotIn(List<Integer> values) {
            addCriterion("ACCOUNTDAY2 not in", values, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2Between(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY2 between", value1, value2, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday2NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY2 not between", value1, value2, "accountday2");
            return (Criteria) this;
        }

        public Criteria andAccountday1IsNull() {
            addCriterion("ACCOUNTDAY1 is null");
            return (Criteria) this;
        }

        public Criteria andAccountday1IsNotNull() {
            addCriterion("ACCOUNTDAY1 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountday1EqualTo(Integer value) {
            addCriterion("ACCOUNTDAY1 =", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1NotEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY1 <>", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1GreaterThan(Integer value) {
            addCriterion("ACCOUNTDAY1 >", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY1 >=", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1LessThan(Integer value) {
            addCriterion("ACCOUNTDAY1 <", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1LessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTDAY1 <=", value, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1In(List<Integer> values) {
            addCriterion("ACCOUNTDAY1 in", values, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1NotIn(List<Integer> values) {
            addCriterion("ACCOUNTDAY1 not in", values, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1Between(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY1 between", value1, value2, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountday1NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTDAY1 not between", value1, value2, "accountday1");
            return (Criteria) this;
        }

        public Criteria andAccountage1IsNull() {
            addCriterion("ACCOUNTAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andAccountage1IsNotNull() {
            addCriterion("ACCOUNTAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountage1EqualTo(String value) {
            addCriterion("ACCOUNTAGE1 =", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1NotEqualTo(String value) {
            addCriterion("ACCOUNTAGE1 <>", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1GreaterThan(String value) {
            addCriterion("ACCOUNTAGE1 >", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1GreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE1 >=", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1LessThan(String value) {
            addCriterion("ACCOUNTAGE1 <", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1LessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE1 <=", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1Like(String value) {
            addCriterion("ACCOUNTAGE1 like", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1NotLike(String value) {
            addCriterion("ACCOUNTAGE1 not like", value, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1In(List<String> values) {
            addCriterion("ACCOUNTAGE1 in", values, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1NotIn(List<String> values) {
            addCriterion("ACCOUNTAGE1 not in", values, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1Between(String value1, String value2) {
            addCriterion("ACCOUNTAGE1 between", value1, value2, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage1NotBetween(String value1, String value2) {
            addCriterion("ACCOUNTAGE1 not between", value1, value2, "accountage1");
            return (Criteria) this;
        }

        public Criteria andAccountage2IsNull() {
            addCriterion("ACCOUNTAGE2 is null");
            return (Criteria) this;
        }

        public Criteria andAccountage2IsNotNull() {
            addCriterion("ACCOUNTAGE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountage2EqualTo(String value) {
            addCriterion("ACCOUNTAGE2 =", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2NotEqualTo(String value) {
            addCriterion("ACCOUNTAGE2 <>", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2GreaterThan(String value) {
            addCriterion("ACCOUNTAGE2 >", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2GreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE2 >=", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2LessThan(String value) {
            addCriterion("ACCOUNTAGE2 <", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2LessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTAGE2 <=", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2Like(String value) {
            addCriterion("ACCOUNTAGE2 like", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2NotLike(String value) {
            addCriterion("ACCOUNTAGE2 not like", value, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2In(List<String> values) {
            addCriterion("ACCOUNTAGE2 in", values, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2NotIn(List<String> values) {
            addCriterion("ACCOUNTAGE2 not in", values, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2Between(String value1, String value2) {
            addCriterion("ACCOUNTAGE2 between", value1, value2, "accountage2");
            return (Criteria) this;
        }

        public Criteria andAccountage2NotBetween(String value1, String value2) {
            addCriterion("ACCOUNTAGE2 not between", value1, value2, "accountage2");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNull() {
            addCriterion("CUSTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNotNull() {
            addCriterion("CUSTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustseqEqualTo(String value) {
            addCriterion("CUSTSEQ =", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotEqualTo(String value) {
            addCriterion("CUSTSEQ <>", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThan(String value) {
            addCriterion("CUSTSEQ >", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ >=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThan(String value) {
            addCriterion("CUSTSEQ <", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ <=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLike(String value) {
            addCriterion("CUSTSEQ like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotLike(String value) {
            addCriterion("CUSTSEQ not like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqIn(List<String> values) {
            addCriterion("CUSTSEQ in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotIn(List<String> values) {
            addCriterion("CUSTSEQ not in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqBetween(String value1, String value2) {
            addCriterion("CUSTSEQ between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotBetween(String value1, String value2) {
            addCriterion("CUSTSEQ not between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIsNull() {
            addCriterion("REMAINS_DUED is null");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIsNotNull() {
            addCriterion("REMAINS_DUED is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DUED =", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DUED <>", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedGreaterThan(BigDecimal value) {
            addCriterion("REMAINS_DUED >", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DUED >=", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedLessThan(BigDecimal value) {
            addCriterion("REMAINS_DUED <", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_DUED <=", value, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DUED in", values, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_DUED not in", values, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DUED between", value1, value2, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsDuedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_DUED not between", value1, value2, "remainsDued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNull() {
            addCriterion("REMAINS_UNDUED is null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIsNotNull() {
            addCriterion("REMAINS_UNDUED is not null");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED =", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <>", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThan(BigDecimal value) {
            addCriterion("REMAINS_UNDUED >", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED >=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThan(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAINS_UNDUED <=", value, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedIn(List<BigDecimal> values) {
            addCriterion("REMAINS_UNDUED in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotIn(List<BigDecimal> values) {
            addCriterion("REMAINS_UNDUED not in", values, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_UNDUED between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andRemainsUnduedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAINS_UNDUED not between", value1, value2, "remainsUndued");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNull() {
            addCriterion("HASPLAN is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("HASPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("HASPLAN =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("HASPLAN <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("HASPLAN >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("HASPLAN >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("HASPLAN <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("HASPLAN <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("HASPLAN like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("HASPLAN not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("HASPLAN in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("HASPLAN not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("HASPLAN between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("HASPLAN not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("BUSINESSCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("BUSINESSCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("BUSINESSCHANNEL >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("BUSINESSCHANNEL <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("BUSINESSCHANNEL like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("BUSINESSCHANNEL not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameIsNull() {
            addCriterion("BUSINESSCHANNELNAME is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameIsNotNull() {
            addCriterion("BUSINESSCHANNELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameEqualTo(String value) {
            addCriterion("BUSINESSCHANNELNAME =", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameNotEqualTo(String value) {
            addCriterion("BUSINESSCHANNELNAME <>", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameGreaterThan(String value) {
            addCriterion("BUSINESSCHANNELNAME >", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNELNAME >=", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameLessThan(String value) {
            addCriterion("BUSINESSCHANNELNAME <", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNELNAME <=", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameLike(String value) {
            addCriterion("BUSINESSCHANNELNAME like", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameNotLike(String value) {
            addCriterion("BUSINESSCHANNELNAME not like", value, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameIn(List<String> values) {
            addCriterion("BUSINESSCHANNELNAME in", values, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameNotIn(List<String> values) {
            addCriterion("BUSINESSCHANNELNAME not in", values, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNELNAME between", value1, value2, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelnameNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNELNAME not between", value1, value2, "businesschannelname");
            return (Criteria) this;
        }

        public Criteria andMasternoIsNull() {
            addCriterion("MASTERNO is null");
            return (Criteria) this;
        }

        public Criteria andMasternoIsNotNull() {
            addCriterion("MASTERNO is not null");
            return (Criteria) this;
        }

        public Criteria andMasternoEqualTo(String value) {
            addCriterion("MASTERNO =", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotEqualTo(String value) {
            addCriterion("MASTERNO <>", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThan(String value) {
            addCriterion("MASTERNO >", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNO >=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThan(String value) {
            addCriterion("MASTERNO <", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLessThanOrEqualTo(String value) {
            addCriterion("MASTERNO <=", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoLike(String value) {
            addCriterion("MASTERNO like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotLike(String value) {
            addCriterion("MASTERNO not like", value, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoIn(List<String> values) {
            addCriterion("MASTERNO in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotIn(List<String> values) {
            addCriterion("MASTERNO not in", values, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoBetween(String value1, String value2) {
            addCriterion("MASTERNO between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternoNotBetween(String value1, String value2) {
            addCriterion("MASTERNO not between", value1, value2, "masterno");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNull() {
            addCriterion("MASTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMasternameIsNotNull() {
            addCriterion("MASTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMasternameEqualTo(String value) {
            addCriterion("MASTERNAME =", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotEqualTo(String value) {
            addCriterion("MASTERNAME <>", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThan(String value) {
            addCriterion("MASTERNAME >", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameGreaterThanOrEqualTo(String value) {
            addCriterion("MASTERNAME >=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThan(String value) {
            addCriterion("MASTERNAME <", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLessThanOrEqualTo(String value) {
            addCriterion("MASTERNAME <=", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameLike(String value) {
            addCriterion("MASTERNAME like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotLike(String value) {
            addCriterion("MASTERNAME not like", value, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameIn(List<String> values) {
            addCriterion("MASTERNAME in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotIn(List<String> values) {
            addCriterion("MASTERNAME not in", values, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameBetween(String value1, String value2) {
            addCriterion("MASTERNAME between", value1, value2, "mastername");
            return (Criteria) this;
        }

        public Criteria andMasternameNotBetween(String value1, String value2) {
            addCriterion("MASTERNAME not between", value1, value2, "mastername");
            return (Criteria) this;
        }

        public Criteria andOptcodeIsNull() {
            addCriterion("OPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andOptcodeIsNotNull() {
            addCriterion("OPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptcodeEqualTo(String value) {
            addCriterion("OPTCODE =", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotEqualTo(String value) {
            addCriterion("OPTCODE <>", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThan(String value) {
            addCriterion("OPTCODE >", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTCODE >=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThan(String value) {
            addCriterion("OPTCODE <", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLessThanOrEqualTo(String value) {
            addCriterion("OPTCODE <=", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeLike(String value) {
            addCriterion("OPTCODE like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotLike(String value) {
            addCriterion("OPTCODE not like", value, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeIn(List<String> values) {
            addCriterion("OPTCODE in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotIn(List<String> values) {
            addCriterion("OPTCODE not in", values, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeBetween(String value1, String value2) {
            addCriterion("OPTCODE between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptcodeNotBetween(String value1, String value2) {
            addCriterion("OPTCODE not between", value1, value2, "optcode");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNull() {
            addCriterion("OPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNotNull() {
            addCriterion("OPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptnameEqualTo(String value) {
            addCriterion("OPTNAME =", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotEqualTo(String value) {
            addCriterion("OPTNAME <>", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThan(String value) {
            addCriterion("OPTNAME >", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPTNAME >=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThan(String value) {
            addCriterion("OPTNAME <", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThanOrEqualTo(String value) {
            addCriterion("OPTNAME <=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLike(String value) {
            addCriterion("OPTNAME like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotLike(String value) {
            addCriterion("OPTNAME not like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameIn(List<String> values) {
            addCriterion("OPTNAME in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotIn(List<String> values) {
            addCriterion("OPTNAME not in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameBetween(String value1, String value2) {
            addCriterion("OPTNAME between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotBetween(String value1, String value2) {
            addCriterion("OPTNAME not between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andTransactornameIsNull() {
            addCriterion("TRANSACTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andTransactornameIsNotNull() {
            addCriterion("TRANSACTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransactornameEqualTo(String value) {
            addCriterion("TRANSACTORNAME =", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotEqualTo(String value) {
            addCriterion("TRANSACTORNAME <>", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThan(String value) {
            addCriterion("TRANSACTORNAME >", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME >=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThan(String value) {
            addCriterion("TRANSACTORNAME <", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORNAME <=", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameLike(String value) {
            addCriterion("TRANSACTORNAME like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotLike(String value) {
            addCriterion("TRANSACTORNAME not like", value, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameIn(List<String> values) {
            addCriterion("TRANSACTORNAME in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotIn(List<String> values) {
            addCriterion("TRANSACTORNAME not in", values, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andTransactornameNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORNAME not between", value1, value2, "transactorname");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("SERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(Integer value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(Integer value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(Integer value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(Integer value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(Integer value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<Integer> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<Integer> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(Integer value1, Integer value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeIsNull() {
            addCriterion("SAPCLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeIsNotNull() {
            addCriterion("SAPCLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeEqualTo(String value) {
            addCriterion("SAPCLASSESCODE =", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeNotEqualTo(String value) {
            addCriterion("SAPCLASSESCODE <>", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeGreaterThan(String value) {
            addCriterion("SAPCLASSESCODE >", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAPCLASSESCODE >=", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeLessThan(String value) {
            addCriterion("SAPCLASSESCODE <", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeLessThanOrEqualTo(String value) {
            addCriterion("SAPCLASSESCODE <=", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeLike(String value) {
            addCriterion("SAPCLASSESCODE like", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeNotLike(String value) {
            addCriterion("SAPCLASSESCODE not like", value, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeIn(List<String> values) {
            addCriterion("SAPCLASSESCODE in", values, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeNotIn(List<String> values) {
            addCriterion("SAPCLASSESCODE not in", values, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeBetween(String value1, String value2) {
            addCriterion("SAPCLASSESCODE between", value1, value2, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclassescodeNotBetween(String value1, String value2) {
            addCriterion("SAPCLASSESCODE not between", value1, value2, "sapclassescode");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindIsNull() {
            addCriterion("SAPCLASSESKIND is null");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindIsNotNull() {
            addCriterion("SAPCLASSESKIND is not null");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindEqualTo(String value) {
            addCriterion("SAPCLASSESKIND =", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindNotEqualTo(String value) {
            addCriterion("SAPCLASSESKIND <>", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindGreaterThan(String value) {
            addCriterion("SAPCLASSESKIND >", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("SAPCLASSESKIND >=", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindLessThan(String value) {
            addCriterion("SAPCLASSESKIND <", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindLessThanOrEqualTo(String value) {
            addCriterion("SAPCLASSESKIND <=", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindLike(String value) {
            addCriterion("SAPCLASSESKIND like", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindNotLike(String value) {
            addCriterion("SAPCLASSESKIND not like", value, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindIn(List<String> values) {
            addCriterion("SAPCLASSESKIND in", values, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindNotIn(List<String> values) {
            addCriterion("SAPCLASSESKIND not in", values, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindBetween(String value1, String value2) {
            addCriterion("SAPCLASSESKIND between", value1, value2, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andSapclasseskindNotBetween(String value1, String value2) {
            addCriterion("SAPCLASSESKIND not between", value1, value2, "sapclasseskind");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeIsNull() {
            addCriterion("RISKCLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeIsNotNull() {
            addCriterion("RISKCLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeEqualTo(String value) {
            addCriterion("RISKCLASSESCODE =", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeNotEqualTo(String value) {
            addCriterion("RISKCLASSESCODE <>", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeGreaterThan(String value) {
            addCriterion("RISKCLASSESCODE >", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKCLASSESCODE >=", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeLessThan(String value) {
            addCriterion("RISKCLASSESCODE <", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeLessThanOrEqualTo(String value) {
            addCriterion("RISKCLASSESCODE <=", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeLike(String value) {
            addCriterion("RISKCLASSESCODE like", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeNotLike(String value) {
            addCriterion("RISKCLASSESCODE not like", value, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeIn(List<String> values) {
            addCriterion("RISKCLASSESCODE in", values, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeNotIn(List<String> values) {
            addCriterion("RISKCLASSESCODE not in", values, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeBetween(String value1, String value2) {
            addCriterion("RISKCLASSESCODE between", value1, value2, "riskclassescode");
            return (Criteria) this;
        }

        public Criteria andRiskclassescodeNotBetween(String value1, String value2) {
            addCriterion("RISKCLASSESCODE not between", value1, value2, "riskclassescode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_policymirror_td
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
     * @Table : mm_policymirror_td
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