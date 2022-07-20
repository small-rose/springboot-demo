package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmTaxdetailTiExample {
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
    public MmTaxdetailTiExample() {
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
     * @Table : mm_taxdetail_ti
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

        public Criteria andSeqtaxIsNull() {
            addCriterion("SEQTAX is null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIsNotNull() {
            addCriterion("SEQTAX is not null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxEqualTo(Long value) {
            addCriterion("SEQTAX =", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotEqualTo(Long value) {
            addCriterion("SEQTAX <>", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThan(Long value) {
            addCriterion("SEQTAX >", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQTAX >=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThan(Long value) {
            addCriterion("SEQTAX <", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThanOrEqualTo(Long value) {
            addCriterion("SEQTAX <=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIn(List<Long> values) {
            addCriterion("SEQTAX in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotIn(List<Long> values) {
            addCriterion("SEQTAX not in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxBetween(Long value1, Long value2) {
            addCriterion("SEQTAX between", value1, value2, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotBetween(Long value1, Long value2) {
            addCriterion("SEQTAX not between", value1, value2, "seqtax");
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

        public Criteria andDeclarenoIsNull() {
            addCriterion("DECLARENO is null");
            return (Criteria) this;
        }

        public Criteria andDeclarenoIsNotNull() {
            addCriterion("DECLARENO is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarenoEqualTo(String value) {
            addCriterion("DECLARENO =", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotEqualTo(String value) {
            addCriterion("DECLARENO <>", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoGreaterThan(String value) {
            addCriterion("DECLARENO >", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARENO >=", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLessThan(String value) {
            addCriterion("DECLARENO <", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLessThanOrEqualTo(String value) {
            addCriterion("DECLARENO <=", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLike(String value) {
            addCriterion("DECLARENO like", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotLike(String value) {
            addCriterion("DECLARENO not like", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoIn(List<String> values) {
            addCriterion("DECLARENO in", values, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotIn(List<String> values) {
            addCriterion("DECLARENO not in", values, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoBetween(String value1, String value2) {
            addCriterion("DECLARENO between", value1, value2, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotBetween(String value1, String value2) {
            addCriterion("DECLARENO not between", value1, value2, "declareno");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNull() {
            addCriterion("VKCLASS is null");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNotNull() {
            addCriterion("VKCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andVkclassEqualTo(String value) {
            addCriterion("VKCLASS =", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotEqualTo(String value) {
            addCriterion("VKCLASS <>", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThan(String value) {
            addCriterion("VKCLASS >", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThanOrEqualTo(String value) {
            addCriterion("VKCLASS >=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThan(String value) {
            addCriterion("VKCLASS <", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThanOrEqualTo(String value) {
            addCriterion("VKCLASS <=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLike(String value) {
            addCriterion("VKCLASS like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotLike(String value) {
            addCriterion("VKCLASS not like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassIn(List<String> values) {
            addCriterion("VKCLASS in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotIn(List<String> values) {
            addCriterion("VKCLASS not in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassBetween(String value1, String value2) {
            addCriterion("VKCLASS between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotBetween(String value1, String value2) {
            addCriterion("VKCLASS not between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("VEHKIND is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("VEHKIND is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("VEHKIND =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("VEHKIND <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("VEHKIND >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("VEHKIND >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("VEHKIND <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("VEHKIND <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("VEHKIND like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("VEHKIND not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("VEHKIND in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("VEHKIND not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("VEHKIND between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("VEHKIND not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNull() {
            addCriterion("VEHNAME is null");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNotNull() {
            addCriterion("VEHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehnameEqualTo(String value) {
            addCriterion("VEHNAME =", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotEqualTo(String value) {
            addCriterion("VEHNAME <>", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThan(String value) {
            addCriterion("VEHNAME >", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHNAME >=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThan(String value) {
            addCriterion("VEHNAME <", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThanOrEqualTo(String value) {
            addCriterion("VEHNAME <=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLike(String value) {
            addCriterion("VEHNAME like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotLike(String value) {
            addCriterion("VEHNAME not like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameIn(List<String> values) {
            addCriterion("VEHNAME in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotIn(List<String> values) {
            addCriterion("VEHNAME not in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameBetween(String value1, String value2) {
            addCriterion("VEHNAME between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotBetween(String value1, String value2) {
            addCriterion("VEHNAME not between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNull() {
            addCriterion("VEHVIN is null");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNotNull() {
            addCriterion("VEHVIN is not null");
            return (Criteria) this;
        }

        public Criteria andVehvinEqualTo(String value) {
            addCriterion("VEHVIN =", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotEqualTo(String value) {
            addCriterion("VEHVIN <>", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThan(String value) {
            addCriterion("VEHVIN >", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThanOrEqualTo(String value) {
            addCriterion("VEHVIN >=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThan(String value) {
            addCriterion("VEHVIN <", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThanOrEqualTo(String value) {
            addCriterion("VEHVIN <=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLike(String value) {
            addCriterion("VEHVIN like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotLike(String value) {
            addCriterion("VEHVIN not like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinIn(List<String> values) {
            addCriterion("VEHVIN in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotIn(List<String> values) {
            addCriterion("VEHVIN not in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinBetween(String value1, String value2) {
            addCriterion("VEHVIN between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotBetween(String value1, String value2) {
            addCriterion("VEHVIN not between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNull() {
            addCriterion("VEHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNotNull() {
            addCriterion("VEHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehtypeEqualTo(String value) {
            addCriterion("VEHTYPE =", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotEqualTo(String value) {
            addCriterion("VEHTYPE <>", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThan(String value) {
            addCriterion("VEHTYPE >", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHTYPE >=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThan(String value) {
            addCriterion("VEHTYPE <", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThanOrEqualTo(String value) {
            addCriterion("VEHTYPE <=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLike(String value) {
            addCriterion("VEHTYPE like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotLike(String value) {
            addCriterion("VEHTYPE not like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeIn(List<String> values) {
            addCriterion("VEHTYPE in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotIn(List<String> values) {
            addCriterion("VEHTYPE not in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeBetween(String value1, String value2) {
            addCriterion("VEHTYPE between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotBetween(String value1, String value2) {
            addCriterion("VEHTYPE not between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNull() {
            addCriterion("GROSSWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNotNull() {
            addCriterion("GROSSWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGrossweightEqualTo(BigDecimal value) {
            addCriterion("GROSSWEIGHT =", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotEqualTo(BigDecimal value) {
            addCriterion("GROSSWEIGHT <>", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThan(BigDecimal value) {
            addCriterion("GROSSWEIGHT >", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSSWEIGHT >=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThan(BigDecimal value) {
            addCriterion("GROSSWEIGHT <", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSSWEIGHT <=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIn(List<BigDecimal> values) {
            addCriterion("GROSSWEIGHT in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotIn(List<BigDecimal> values) {
            addCriterion("GROSSWEIGHT not in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSSWEIGHT between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSSWEIGHT not between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNull() {
            addCriterion("LOADCAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNotNull() {
            addCriterion("LOADCAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityEqualTo(BigDecimal value) {
            addCriterion("LOADCAPACITY =", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotEqualTo(BigDecimal value) {
            addCriterion("LOADCAPACITY <>", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThan(BigDecimal value) {
            addCriterion("LOADCAPACITY >", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOADCAPACITY >=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThan(BigDecimal value) {
            addCriterion("LOADCAPACITY <", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOADCAPACITY <=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIn(List<BigDecimal> values) {
            addCriterion("LOADCAPACITY in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotIn(List<BigDecimal> values) {
            addCriterion("LOADCAPACITY not in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOADCAPACITY between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOADCAPACITY not between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("SEAT is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("SEAT is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(BigDecimal value) {
            addCriterion("SEAT =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(BigDecimal value) {
            addCriterion("SEAT <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(BigDecimal value) {
            addCriterion("SEAT >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEAT >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(BigDecimal value) {
            addCriterion("SEAT <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEAT <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<BigDecimal> values) {
            addCriterion("SEAT in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<BigDecimal> values) {
            addCriterion("SEAT not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEAT between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEAT not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNull() {
            addCriterion("CURBWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNotNull() {
            addCriterion("CURBWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCurbweightEqualTo(BigDecimal value) {
            addCriterion("CURBWEIGHT =", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotEqualTo(BigDecimal value) {
            addCriterion("CURBWEIGHT <>", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThan(BigDecimal value) {
            addCriterion("CURBWEIGHT >", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURBWEIGHT >=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThan(BigDecimal value) {
            addCriterion("CURBWEIGHT <", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURBWEIGHT <=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightIn(List<BigDecimal> values) {
            addCriterion("CURBWEIGHT in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotIn(List<BigDecimal> values) {
            addCriterion("CURBWEIGHT not in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURBWEIGHT between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURBWEIGHT not between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("TAXPAYER is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("TAXPAYER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("TAXPAYER =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("TAXPAYER <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("TAXPAYER >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("TAXPAYER <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("TAXPAYER like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("TAXPAYER not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("TAXPAYER in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("TAXPAYER not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("TAXPAYER between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNull() {
            addCriterion("PAYERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNotNull() {
            addCriterion("PAYERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressEqualTo(String value) {
            addCriterion("PAYERADDRESS =", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotEqualTo(String value) {
            addCriterion("PAYERADDRESS <>", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThan(String value) {
            addCriterion("PAYERADDRESS >", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERADDRESS >=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThan(String value) {
            addCriterion("PAYERADDRESS <", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThanOrEqualTo(String value) {
            addCriterion("PAYERADDRESS <=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLike(String value) {
            addCriterion("PAYERADDRESS like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotLike(String value) {
            addCriterion("PAYERADDRESS not like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIn(List<String> values) {
            addCriterion("PAYERADDRESS in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotIn(List<String> values) {
            addCriterion("PAYERADDRESS not in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressBetween(String value1, String value2) {
            addCriterion("PAYERADDRESS between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotBetween(String value1, String value2) {
            addCriterion("PAYERADDRESS not between", value1, value2, "payeraddress");
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

        public Criteria andBackdatefromIsNull() {
            addCriterion("BACKDATEFROM is null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIsNotNull() {
            addCriterion("BACKDATEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromEqualTo(Date value) {
            addCriterion("BACKDATEFROM =", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotEqualTo(Date value) {
            addCriterion("BACKDATEFROM <>", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThan(Date value) {
            addCriterion("BACKDATEFROM >", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("BACKDATEFROM >=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThan(Date value) {
            addCriterion("BACKDATEFROM <", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThanOrEqualTo(Date value) {
            addCriterion("BACKDATEFROM <=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIn(List<Date> values) {
            addCriterion("BACKDATEFROM in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotIn(List<Date> values) {
            addCriterion("BACKDATEFROM not in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromBetween(Date value1, Date value2) {
            addCriterion("BACKDATEFROM between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotBetween(Date value1, Date value2) {
            addCriterion("BACKDATEFROM not between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNull() {
            addCriterion("BACKDATETO is null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNotNull() {
            addCriterion("BACKDATETO is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoEqualTo(Date value) {
            addCriterion("BACKDATETO =", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotEqualTo(Date value) {
            addCriterion("BACKDATETO <>", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThan(Date value) {
            addCriterion("BACKDATETO >", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("BACKDATETO >=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThan(Date value) {
            addCriterion("BACKDATETO <", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThanOrEqualTo(Date value) {
            addCriterion("BACKDATETO <=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIn(List<Date> values) {
            addCriterion("BACKDATETO in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotIn(List<Date> values) {
            addCriterion("BACKDATETO not in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoBetween(Date value1, Date value2) {
            addCriterion("BACKDATETO between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotBetween(Date value1, Date value2) {
            addCriterion("BACKDATETO not between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNull() {
            addCriterion("LATEDATEFROM is null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNotNull() {
            addCriterion("LATEDATEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromEqualTo(Date value) {
            addCriterion("LATEDATEFROM =", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotEqualTo(Date value) {
            addCriterion("LATEDATEFROM <>", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThan(Date value) {
            addCriterion("LATEDATEFROM >", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("LATEDATEFROM >=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThan(Date value) {
            addCriterion("LATEDATEFROM <", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThanOrEqualTo(Date value) {
            addCriterion("LATEDATEFROM <=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIn(List<Date> values) {
            addCriterion("LATEDATEFROM in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotIn(List<Date> values) {
            addCriterion("LATEDATEFROM not in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromBetween(Date value1, Date value2) {
            addCriterion("LATEDATEFROM between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotBetween(Date value1, Date value2) {
            addCriterion("LATEDATEFROM not between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNull() {
            addCriterion("LATEDATETO is null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNotNull() {
            addCriterion("LATEDATETO is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoEqualTo(Date value) {
            addCriterion("LATEDATETO =", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotEqualTo(Date value) {
            addCriterion("LATEDATETO <>", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThan(Date value) {
            addCriterion("LATEDATETO >", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("LATEDATETO >=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThan(Date value) {
            addCriterion("LATEDATETO <", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThanOrEqualTo(Date value) {
            addCriterion("LATEDATETO <=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIn(List<Date> values) {
            addCriterion("LATEDATETO in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotIn(List<Date> values) {
            addCriterion("LATEDATETO not in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoBetween(Date value1, Date value2) {
            addCriterion("LATEDATETO between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotBetween(Date value1, Date value2) {
            addCriterion("LATEDATETO not between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNull() {
            addCriterion("TAXPAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNotNull() {
            addCriterion("TAXPAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE =", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <>", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThan(BigDecimal value) {
            addCriterion("TAXPAYABLE >", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE >=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThan(BigDecimal value) {
            addCriterion("TAXPAYABLE <", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXPAYABLE <=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotIn(List<BigDecimal> values) {
            addCriterion("TAXPAYABLE not in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXPAYABLE not between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNull() {
            addCriterion("BACKTAX is null");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNotNull() {
            addCriterion("BACKTAX is not null");
            return (Criteria) this;
        }

        public Criteria andBacktaxEqualTo(BigDecimal value) {
            addCriterion("BACKTAX =", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <>", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThan(BigDecimal value) {
            addCriterion("BACKTAX >", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX >=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThan(BigDecimal value) {
            addCriterion("BACKTAX <", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKTAX <=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxIn(List<BigDecimal> values) {
            addCriterion("BACKTAX in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotIn(List<BigDecimal> values) {
            addCriterion("BACKTAX not in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKTAX not between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNull() {
            addCriterion("LATEFEE is null");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNotNull() {
            addCriterion("LATEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andLatefeeEqualTo(BigDecimal value) {
            addCriterion("LATEFEE =", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotEqualTo(BigDecimal value) {
            addCriterion("LATEFEE <>", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThan(BigDecimal value) {
            addCriterion("LATEFEE >", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEFEE >=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThan(BigDecimal value) {
            addCriterion("LATEFEE <", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEFEE <=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeIn(List<BigDecimal> values) {
            addCriterion("LATEFEE in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotIn(List<BigDecimal> values) {
            addCriterion("LATEFEE not in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEFEE between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEFEE not between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNull() {
            addCriterion("TAXFREE is null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNotNull() {
            addCriterion("TAXFREE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeEqualTo(BigDecimal value) {
            addCriterion("TAXFREE =", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotEqualTo(BigDecimal value) {
            addCriterion("TAXFREE <>", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThan(BigDecimal value) {
            addCriterion("TAXFREE >", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXFREE >=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThan(BigDecimal value) {
            addCriterion("TAXFREE <", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXFREE <=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIn(List<BigDecimal> values) {
            addCriterion("TAXFREE in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotIn(List<BigDecimal> values) {
            addCriterion("TAXFREE not in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXFREE between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXFREE not between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNull() {
            addCriterion("TAXTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNotNull() {
            addCriterion("TAXTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL =", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL <>", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThan(BigDecimal value) {
            addCriterion("TAXTOTAL >", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL >=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThan(BigDecimal value) {
            addCriterion("TAXTOTAL <", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXTOTAL <=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIn(List<BigDecimal> values) {
            addCriterion("TAXTOTAL in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotIn(List<BigDecimal> values) {
            addCriterion("TAXTOTAL not in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXTOTAL between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXTOTAL not between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNull() {
            addCriterion("TAXCERTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNotNull() {
            addCriterion("TAXCERTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoEqualTo(String value) {
            addCriterion("TAXCERTNO =", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotEqualTo(String value) {
            addCriterion("TAXCERTNO <>", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThan(String value) {
            addCriterion("TAXCERTNO >", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXCERTNO >=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThan(String value) {
            addCriterion("TAXCERTNO <", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThanOrEqualTo(String value) {
            addCriterion("TAXCERTNO <=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLike(String value) {
            addCriterion("TAXCERTNO like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotLike(String value) {
            addCriterion("TAXCERTNO not like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIn(List<String> values) {
            addCriterion("TAXCERTNO in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotIn(List<String> values) {
            addCriterion("TAXCERTNO not in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoBetween(String value1, String value2) {
            addCriterion("TAXCERTNO between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotBetween(String value1, String value2) {
            addCriterion("TAXCERTNO not between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNull() {
            addCriterion("TAXOFFICE is null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNotNull() {
            addCriterion("TAXOFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeEqualTo(String value) {
            addCriterion("TAXOFFICE =", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotEqualTo(String value) {
            addCriterion("TAXOFFICE <>", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThan(String value) {
            addCriterion("TAXOFFICE >", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXOFFICE >=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThan(String value) {
            addCriterion("TAXOFFICE <", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThanOrEqualTo(String value) {
            addCriterion("TAXOFFICE <=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLike(String value) {
            addCriterion("TAXOFFICE like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotLike(String value) {
            addCriterion("TAXOFFICE not like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIn(List<String> values) {
            addCriterion("TAXOFFICE in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotIn(List<String> values) {
            addCriterion("TAXOFFICE not in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeBetween(String value1, String value2) {
            addCriterion("TAXOFFICE between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotBetween(String value1, String value2) {
            addCriterion("TAXOFFICE not between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNull() {
            addCriterion("TAXDAY is null");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNotNull() {
            addCriterion("TAXDAY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxdayEqualTo(Date value) {
            addCriterion("TAXDAY =", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotEqualTo(Date value) {
            addCriterion("TAXDAY <>", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThan(Date value) {
            addCriterion("TAXDAY >", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThanOrEqualTo(Date value) {
            addCriterion("TAXDAY >=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThan(Date value) {
            addCriterion("TAXDAY <", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThanOrEqualTo(Date value) {
            addCriterion("TAXDAY <=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayIn(List<Date> values) {
            addCriterion("TAXDAY in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotIn(List<Date> values) {
            addCriterion("TAXDAY not in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayBetween(Date value1, Date value2) {
            addCriterion("TAXDAY between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotBetween(Date value1, Date value2) {
            addCriterion("TAXDAY not between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNull() {
            addCriterion("INSURER is null");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNotNull() {
            addCriterion("INSURER is not null");
            return (Criteria) this;
        }

        public Criteria andInsurerEqualTo(String value) {
            addCriterion("INSURER =", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotEqualTo(String value) {
            addCriterion("INSURER <>", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThan(String value) {
            addCriterion("INSURER >", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThanOrEqualTo(String value) {
            addCriterion("INSURER >=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThan(String value) {
            addCriterion("INSURER <", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThanOrEqualTo(String value) {
            addCriterion("INSURER <=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLike(String value) {
            addCriterion("INSURER like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotLike(String value) {
            addCriterion("INSURER not like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerIn(List<String> values) {
            addCriterion("INSURER in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotIn(List<String> values) {
            addCriterion("INSURER not in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerBetween(String value1, String value2) {
            addCriterion("INSURER between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotBetween(String value1, String value2) {
            addCriterion("INSURER not between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNull() {
            addCriterion("INSURERNO is null");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNotNull() {
            addCriterion("INSURERNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsurernoEqualTo(String value) {
            addCriterion("INSURERNO =", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotEqualTo(String value) {
            addCriterion("INSURERNO <>", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThan(String value) {
            addCriterion("INSURERNO >", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThanOrEqualTo(String value) {
            addCriterion("INSURERNO >=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThan(String value) {
            addCriterion("INSURERNO <", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThanOrEqualTo(String value) {
            addCriterion("INSURERNO <=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLike(String value) {
            addCriterion("INSURERNO like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotLike(String value) {
            addCriterion("INSURERNO not like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoIn(List<String> values) {
            addCriterion("INSURERNO in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotIn(List<String> values) {
            addCriterion("INSURERNO not in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoBetween(String value1, String value2) {
            addCriterion("INSURERNO between", value1, value2, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotBetween(String value1, String value2) {
            addCriterion("INSURERNO not between", value1, value2, "insurerno");
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

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DATASOURCE like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DATASOURCE not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
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

        public Criteria andEngineIsNull() {
            addCriterion("ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("ENGINE =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("ENGINE <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("ENGINE >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("ENGINE <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("ENGINE <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("ENGINE like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("ENGINE not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("ENGINE in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("ENGINE not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("ENGINE between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("ENGINE not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andLastpaydateIsNull() {
            addCriterion("LASTPAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastpaydateIsNotNull() {
            addCriterion("LASTPAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastpaydateEqualTo(Date value) {
            addCriterion("LASTPAYDATE =", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateNotEqualTo(Date value) {
            addCriterion("LASTPAYDATE <>", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateGreaterThan(Date value) {
            addCriterion("LASTPAYDATE >", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTPAYDATE >=", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateLessThan(Date value) {
            addCriterion("LASTPAYDATE <", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateLessThanOrEqualTo(Date value) {
            addCriterion("LASTPAYDATE <=", value, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateIn(List<Date> values) {
            addCriterion("LASTPAYDATE in", values, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateNotIn(List<Date> values) {
            addCriterion("LASTPAYDATE not in", values, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateBetween(Date value1, Date value2) {
            addCriterion("LASTPAYDATE between", value1, value2, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andLastpaydateNotBetween(Date value1, Date value2) {
            addCriterion("LASTPAYDATE not between", value1, value2, "lastpaydate");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIsNull() {
            addCriterion("USEPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIsNotNull() {
            addCriterion("USEPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyEqualTo(String value) {
            addCriterion("USEPROPERTY =", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotEqualTo(String value) {
            addCriterion("USEPROPERTY <>", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThan(String value) {
            addCriterion("USEPROPERTY >", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPROPERTY >=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThan(String value) {
            addCriterion("USEPROPERTY <", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThanOrEqualTo(String value) {
            addCriterion("USEPROPERTY <=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLike(String value) {
            addCriterion("USEPROPERTY like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotLike(String value) {
            addCriterion("USEPROPERTY not like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIn(List<String> values) {
            addCriterion("USEPROPERTY in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotIn(List<String> values) {
            addCriterion("USEPROPERTY not in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyBetween(String value1, String value2) {
            addCriterion("USEPROPERTY between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotBetween(String value1, String value2) {
            addCriterion("USEPROPERTY not between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("CARNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("CARNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("CARNUMBER =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("CARNUMBER <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("CARNUMBER >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARNUMBER >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("CARNUMBER <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("CARNUMBER <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("CARNUMBER like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("CARNUMBER not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("CARNUMBER in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("CARNUMBER not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("CARNUMBER between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("CARNUMBER not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andVehaddressIsNull() {
            addCriterion("VEHADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andVehaddressIsNotNull() {
            addCriterion("VEHADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andVehaddressEqualTo(String value) {
            addCriterion("VEHADDRESS =", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotEqualTo(String value) {
            addCriterion("VEHADDRESS <>", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressGreaterThan(String value) {
            addCriterion("VEHADDRESS >", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressGreaterThanOrEqualTo(String value) {
            addCriterion("VEHADDRESS >=", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLessThan(String value) {
            addCriterion("VEHADDRESS <", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLessThanOrEqualTo(String value) {
            addCriterion("VEHADDRESS <=", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLike(String value) {
            addCriterion("VEHADDRESS like", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotLike(String value) {
            addCriterion("VEHADDRESS not like", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressIn(List<String> values) {
            addCriterion("VEHADDRESS in", values, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotIn(List<String> values) {
            addCriterion("VEHADDRESS not in", values, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressBetween(String value1, String value2) {
            addCriterion("VEHADDRESS between", value1, value2, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotBetween(String value1, String value2) {
            addCriterion("VEHADDRESS not between", value1, value2, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("FUELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("FUELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("FUELTYPE =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("FUELTYPE <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("FUELTYPE >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUELTYPE >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("FUELTYPE <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("FUELTYPE <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("FUELTYPE like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("FUELTYPE not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("FUELTYPE in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("FUELTYPE not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("FUELTYPE between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("FUELTYPE not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNull() {
            addCriterion("FUELNAME is null");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNotNull() {
            addCriterion("FUELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFuelnameEqualTo(String value) {
            addCriterion("FUELNAME =", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotEqualTo(String value) {
            addCriterion("FUELNAME <>", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThan(String value) {
            addCriterion("FUELNAME >", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUELNAME >=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThan(String value) {
            addCriterion("FUELNAME <", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThanOrEqualTo(String value) {
            addCriterion("FUELNAME <=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLike(String value) {
            addCriterion("FUELNAME like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotLike(String value) {
            addCriterion("FUELNAME not like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameIn(List<String> values) {
            addCriterion("FUELNAME in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotIn(List<String> values) {
            addCriterion("FUELNAME not in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameBetween(String value1, String value2) {
            addCriterion("FUELNAME between", value1, value2, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotBetween(String value1, String value2) {
            addCriterion("FUELNAME not between", value1, value2, "fuelname");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIsNull() {
            addCriterion("TAXTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIsNotNull() {
            addCriterion("TAXTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtypeEqualTo(String value) {
            addCriterion("TAXTYPE =", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotEqualTo(String value) {
            addCriterion("TAXTYPE <>", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeGreaterThan(String value) {
            addCriterion("TAXTYPE >", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXTYPE >=", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLessThan(String value) {
            addCriterion("TAXTYPE <", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLessThanOrEqualTo(String value) {
            addCriterion("TAXTYPE <=", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLike(String value) {
            addCriterion("TAXTYPE like", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotLike(String value) {
            addCriterion("TAXTYPE not like", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIn(List<String> values) {
            addCriterion("TAXTYPE in", values, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotIn(List<String> values) {
            addCriterion("TAXTYPE not in", values, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeBetween(String value1, String value2) {
            addCriterion("TAXTYPE between", value1, value2, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotBetween(String value1, String value2) {
            addCriterion("TAXTYPE not between", value1, value2, "taxtype");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("REGISTERDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("REGISTERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("REGISTERDATE =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("REGISTERDATE <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("REGISTERDATE >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTERDATE >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("REGISTERDATE <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTERDATE <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("REGISTERDATE in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("REGISTERDATE not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("REGISTERDATE between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTERDATE not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIsNull() {
            addCriterion("VEHICLESTYLE is null");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIsNotNull() {
            addCriterion("VEHICLESTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleEqualTo(String value) {
            addCriterion("VEHICLESTYLE =", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotEqualTo(String value) {
            addCriterion("VEHICLESTYLE <>", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleGreaterThan(String value) {
            addCriterion("VEHICLESTYLE >", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLESTYLE >=", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLessThan(String value) {
            addCriterion("VEHICLESTYLE <", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLessThanOrEqualTo(String value) {
            addCriterion("VEHICLESTYLE <=", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLike(String value) {
            addCriterion("VEHICLESTYLE like", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotLike(String value) {
            addCriterion("VEHICLESTYLE not like", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIn(List<String> values) {
            addCriterion("VEHICLESTYLE in", values, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotIn(List<String> values) {
            addCriterion("VEHICLESTYLE not in", values, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleBetween(String value1, String value2) {
            addCriterion("VEHICLESTYLE between", value1, value2, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotBetween(String value1, String value2) {
            addCriterion("VEHICLESTYLE not between", value1, value2, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIsNull() {
            addCriterion("VEHICLESTYLENAME is null");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIsNotNull() {
            addCriterion("VEHICLESTYLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameEqualTo(String value) {
            addCriterion("VEHICLESTYLENAME =", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotEqualTo(String value) {
            addCriterion("VEHICLESTYLENAME <>", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameGreaterThan(String value) {
            addCriterion("VEHICLESTYLENAME >", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLESTYLENAME >=", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLessThan(String value) {
            addCriterion("VEHICLESTYLENAME <", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLESTYLENAME <=", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLike(String value) {
            addCriterion("VEHICLESTYLENAME like", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotLike(String value) {
            addCriterion("VEHICLESTYLENAME not like", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIn(List<String> values) {
            addCriterion("VEHICLESTYLENAME in", values, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotIn(List<String> values) {
            addCriterion("VEHICLESTYLENAME not in", values, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameBetween(String value1, String value2) {
            addCriterion("VEHICLESTYLENAME between", value1, value2, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotBetween(String value1, String value2) {
            addCriterion("VEHICLESTYLENAME not between", value1, value2, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andDeratenoIsNull() {
            addCriterion("DERATENO is null");
            return (Criteria) this;
        }

        public Criteria andDeratenoIsNotNull() {
            addCriterion("DERATENO is not null");
            return (Criteria) this;
        }

        public Criteria andDeratenoEqualTo(String value) {
            addCriterion("DERATENO =", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotEqualTo(String value) {
            addCriterion("DERATENO <>", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoGreaterThan(String value) {
            addCriterion("DERATENO >", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoGreaterThanOrEqualTo(String value) {
            addCriterion("DERATENO >=", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLessThan(String value) {
            addCriterion("DERATENO <", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLessThanOrEqualTo(String value) {
            addCriterion("DERATENO <=", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLike(String value) {
            addCriterion("DERATENO like", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotLike(String value) {
            addCriterion("DERATENO not like", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoIn(List<String> values) {
            addCriterion("DERATENO in", values, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotIn(List<String> values) {
            addCriterion("DERATENO not in", values, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoBetween(String value1, String value2) {
            addCriterion("DERATENO between", value1, value2, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotBetween(String value1, String value2) {
            addCriterion("DERATENO not between", value1, value2, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIsNull() {
            addCriterion("DEDUCTIONDUECODE is null");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIsNotNull() {
            addCriterion("DEDUCTIONDUECODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeEqualTo(String value) {
            addCriterion("DEDUCTIONDUECODE =", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotEqualTo(String value) {
            addCriterion("DEDUCTIONDUECODE <>", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeGreaterThan(String value) {
            addCriterion("DEDUCTIONDUECODE >", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTIONDUECODE >=", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLessThan(String value) {
            addCriterion("DEDUCTIONDUECODE <", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTIONDUECODE <=", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLike(String value) {
            addCriterion("DEDUCTIONDUECODE like", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotLike(String value) {
            addCriterion("DEDUCTIONDUECODE not like", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIn(List<String> values) {
            addCriterion("DEDUCTIONDUECODE in", values, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotIn(List<String> values) {
            addCriterion("DEDUCTIONDUECODE not in", values, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeBetween(String value1, String value2) {
            addCriterion("DEDUCTIONDUECODE between", value1, value2, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotBetween(String value1, String value2) {
            addCriterion("DEDUCTIONDUECODE not between", value1, value2, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIsNull() {
            addCriterion("DEDUCTIONDUENAME is null");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIsNotNull() {
            addCriterion("DEDUCTIONDUENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameEqualTo(String value) {
            addCriterion("DEDUCTIONDUENAME =", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotEqualTo(String value) {
            addCriterion("DEDUCTIONDUENAME <>", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameGreaterThan(String value) {
            addCriterion("DEDUCTIONDUENAME >", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTIONDUENAME >=", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLessThan(String value) {
            addCriterion("DEDUCTIONDUENAME <", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTIONDUENAME <=", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLike(String value) {
            addCriterion("DEDUCTIONDUENAME like", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotLike(String value) {
            addCriterion("DEDUCTIONDUENAME not like", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIn(List<String> values) {
            addCriterion("DEDUCTIONDUENAME in", values, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotIn(List<String> values) {
            addCriterion("DEDUCTIONDUENAME not in", values, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameBetween(String value1, String value2) {
            addCriterion("DEDUCTIONDUENAME between", value1, value2, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotBetween(String value1, String value2) {
            addCriterion("DEDUCTIONDUENAME not between", value1, value2, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andMakermodelIsNull() {
            addCriterion("MAKERMODEL is null");
            return (Criteria) this;
        }

        public Criteria andMakermodelIsNotNull() {
            addCriterion("MAKERMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andMakermodelEqualTo(String value) {
            addCriterion("MAKERMODEL =", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotEqualTo(String value) {
            addCriterion("MAKERMODEL <>", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelGreaterThan(String value) {
            addCriterion("MAKERMODEL >", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelGreaterThanOrEqualTo(String value) {
            addCriterion("MAKERMODEL >=", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLessThan(String value) {
            addCriterion("MAKERMODEL <", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLessThanOrEqualTo(String value) {
            addCriterion("MAKERMODEL <=", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLike(String value) {
            addCriterion("MAKERMODEL like", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotLike(String value) {
            addCriterion("MAKERMODEL not like", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelIn(List<String> values) {
            addCriterion("MAKERMODEL in", values, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotIn(List<String> values) {
            addCriterion("MAKERMODEL not in", values, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelBetween(String value1, String value2) {
            addCriterion("MAKERMODEL between", value1, value2, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotBetween(String value1, String value2) {
            addCriterion("MAKERMODEL not between", value1, value2, "makermodel");
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

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIsNull() {
            addCriterion("CERTIFICATETYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIsNotNull() {
            addCriterion("CERTIFICATETYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameEqualTo(String value) {
            addCriterion("CERTIFICATETYPENAME =", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPENAME <>", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameGreaterThan(String value) {
            addCriterion("CERTIFICATETYPENAME >", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPENAME >=", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLessThan(String value) {
            addCriterion("CERTIFICATETYPENAME <", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPENAME <=", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLike(String value) {
            addCriterion("CERTIFICATETYPENAME like", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotLike(String value) {
            addCriterion("CERTIFICATETYPENAME not like", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIn(List<String> values) {
            addCriterion("CERTIFICATETYPENAME in", values, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPENAME not in", values, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPENAME between", value1, value2, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPENAME not between", value1, value2, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNull() {
            addCriterion("YEARTAXSTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNotNull() {
            addCriterion("YEARTAXSTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD =", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <>", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThan(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD >", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD >=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThan(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARTAXSTANDARD <=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIn(List<BigDecimal> values) {
            addCriterion("YEARTAXSTANDARD in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotIn(List<BigDecimal> values) {
            addCriterion("YEARTAXSTANDARD not in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARTAXSTANDARD between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARTAXSTANDARD not between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andLatedayIsNull() {
            addCriterion("LATEDAY is null");
            return (Criteria) this;
        }

        public Criteria andLatedayIsNotNull() {
            addCriterion("LATEDAY is not null");
            return (Criteria) this;
        }

        public Criteria andLatedayEqualTo(BigDecimal value) {
            addCriterion("LATEDAY =", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotEqualTo(BigDecimal value) {
            addCriterion("LATEDAY <>", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayGreaterThan(BigDecimal value) {
            addCriterion("LATEDAY >", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEDAY >=", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayLessThan(BigDecimal value) {
            addCriterion("LATEDAY <", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATEDAY <=", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayIn(List<BigDecimal> values) {
            addCriterion("LATEDAY in", values, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotIn(List<BigDecimal> values) {
            addCriterion("LATEDAY not in", values, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEDAY between", value1, value2, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATEDAY not between", value1, value2, "lateday");
            return (Criteria) this;
        }

        public Criteria andInputoridIsNull() {
            addCriterion("INPUTORID is null");
            return (Criteria) this;
        }

        public Criteria andInputoridIsNotNull() {
            addCriterion("INPUTORID is not null");
            return (Criteria) this;
        }

        public Criteria andInputoridEqualTo(String value) {
            addCriterion("INPUTORID =", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotEqualTo(String value) {
            addCriterion("INPUTORID <>", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThan(String value) {
            addCriterion("INPUTORID >", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTORID >=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThan(String value) {
            addCriterion("INPUTORID <", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThanOrEqualTo(String value) {
            addCriterion("INPUTORID <=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLike(String value) {
            addCriterion("INPUTORID like", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotLike(String value) {
            addCriterion("INPUTORID not like", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridIn(List<String> values) {
            addCriterion("INPUTORID in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotIn(List<String> values) {
            addCriterion("INPUTORID not in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridBetween(String value1, String value2) {
            addCriterion("INPUTORID between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotBetween(String value1, String value2) {
            addCriterion("INPUTORID not between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNull() {
            addCriterion("TAXNUM is null");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNotNull() {
            addCriterion("TAXNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnumEqualTo(BigDecimal value) {
            addCriterion("TAXNUM =", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotEqualTo(BigDecimal value) {
            addCriterion("TAXNUM <>", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThan(BigDecimal value) {
            addCriterion("TAXNUM >", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXNUM >=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThan(BigDecimal value) {
            addCriterion("TAXNUM <", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXNUM <=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumIn(List<BigDecimal> values) {
            addCriterion("TAXNUM in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotIn(List<BigDecimal> values) {
            addCriterion("TAXNUM not in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXNUM between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXNUM not between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIsNull() {
            addCriterion("FREEQUALITYTAX is null");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIsNotNull() {
            addCriterion("FREEQUALITYTAX is not null");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxEqualTo(BigDecimal value) {
            addCriterion("FREEQUALITYTAX =", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotEqualTo(BigDecimal value) {
            addCriterion("FREEQUALITYTAX <>", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxGreaterThan(BigDecimal value) {
            addCriterion("FREEQUALITYTAX >", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREEQUALITYTAX >=", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxLessThan(BigDecimal value) {
            addCriterion("FREEQUALITYTAX <", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREEQUALITYTAX <=", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIn(List<BigDecimal> values) {
            addCriterion("FREEQUALITYTAX in", values, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotIn(List<BigDecimal> values) {
            addCriterion("FREEQUALITYTAX not in", values, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREEQUALITYTAX between", value1, value2, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREEQUALITYTAX not between", value1, value2, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalIsNull() {
            addCriterion("ISNONLOCAL is null");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalIsNotNull() {
            addCriterion("ISNONLOCAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalEqualTo(String value) {
            addCriterion("ISNONLOCAL =", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalNotEqualTo(String value) {
            addCriterion("ISNONLOCAL <>", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalGreaterThan(String value) {
            addCriterion("ISNONLOCAL >", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalGreaterThanOrEqualTo(String value) {
            addCriterion("ISNONLOCAL >=", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalLessThan(String value) {
            addCriterion("ISNONLOCAL <", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalLessThanOrEqualTo(String value) {
            addCriterion("ISNONLOCAL <=", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalLike(String value) {
            addCriterion("ISNONLOCAL like", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalNotLike(String value) {
            addCriterion("ISNONLOCAL not like", value, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalIn(List<String> values) {
            addCriterion("ISNONLOCAL in", values, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalNotIn(List<String> values) {
            addCriterion("ISNONLOCAL not in", values, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalBetween(String value1, String value2) {
            addCriterion("ISNONLOCAL between", value1, value2, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andIsnonlocalNotBetween(String value1, String value2) {
            addCriterion("ISNONLOCAL not between", value1, value2, "isnonlocal");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("HOMEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("HOMEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("HOMEADDRESS =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("HOMEADDRESS <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("HOMEADDRESS >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HOMEADDRESS >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("HOMEADDRESS <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("HOMEADDRESS <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("HOMEADDRESS like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("HOMEADDRESS not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("HOMEADDRESS in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("HOMEADDRESS not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("HOMEADDRESS between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("HOMEADDRESS not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("ZIP like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("ZIP not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("NATIONAL is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("NATIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("NATIONAL =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("NATIONAL <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("NATIONAL >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("NATIONAL <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("NATIONAL like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("NATIONAL not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("NATIONAL in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("NATIONAL not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("NATIONAL between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("NATIONAL not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andSettleaddressIsNull() {
            addCriterion("SETTLEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSettleaddressIsNotNull() {
            addCriterion("SETTLEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSettleaddressEqualTo(String value) {
            addCriterion("SETTLEADDRESS =", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressNotEqualTo(String value) {
            addCriterion("SETTLEADDRESS <>", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressGreaterThan(String value) {
            addCriterion("SETTLEADDRESS >", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEADDRESS >=", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressLessThan(String value) {
            addCriterion("SETTLEADDRESS <", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressLessThanOrEqualTo(String value) {
            addCriterion("SETTLEADDRESS <=", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressLike(String value) {
            addCriterion("SETTLEADDRESS like", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressNotLike(String value) {
            addCriterion("SETTLEADDRESS not like", value, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressIn(List<String> values) {
            addCriterion("SETTLEADDRESS in", values, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressNotIn(List<String> values) {
            addCriterion("SETTLEADDRESS not in", values, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressBetween(String value1, String value2) {
            addCriterion("SETTLEADDRESS between", value1, value2, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andSettleaddressNotBetween(String value1, String value2) {
            addCriterion("SETTLEADDRESS not between", value1, value2, "settleaddress");
            return (Criteria) this;
        }

        public Criteria andTaxtermIsNull() {
            addCriterion("TAXTERM is null");
            return (Criteria) this;
        }

        public Criteria andTaxtermIsNotNull() {
            addCriterion("TAXTERM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtermEqualTo(String value) {
            addCriterion("TAXTERM =", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermNotEqualTo(String value) {
            addCriterion("TAXTERM <>", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermGreaterThan(String value) {
            addCriterion("TAXTERM >", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermGreaterThanOrEqualTo(String value) {
            addCriterion("TAXTERM >=", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermLessThan(String value) {
            addCriterion("TAXTERM <", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermLessThanOrEqualTo(String value) {
            addCriterion("TAXTERM <=", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermLike(String value) {
            addCriterion("TAXTERM like", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermNotLike(String value) {
            addCriterion("TAXTERM not like", value, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermIn(List<String> values) {
            addCriterion("TAXTERM in", values, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermNotIn(List<String> values) {
            addCriterion("TAXTERM not in", values, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermBetween(String value1, String value2) {
            addCriterion("TAXTERM between", value1, value2, "taxterm");
            return (Criteria) this;
        }

        public Criteria andTaxtermNotBetween(String value1, String value2) {
            addCriterion("TAXTERM not between", value1, value2, "taxterm");
            return (Criteria) this;
        }

        public Criteria andPccodeIsNull() {
            addCriterion("PCCODE is null");
            return (Criteria) this;
        }

        public Criteria andPccodeIsNotNull() {
            addCriterion("PCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPccodeEqualTo(String value) {
            addCriterion("PCCODE =", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotEqualTo(String value) {
            addCriterion("PCCODE <>", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeGreaterThan(String value) {
            addCriterion("PCCODE >", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCCODE >=", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLessThan(String value) {
            addCriterion("PCCODE <", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLessThanOrEqualTo(String value) {
            addCriterion("PCCODE <=", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLike(String value) {
            addCriterion("PCCODE like", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotLike(String value) {
            addCriterion("PCCODE not like", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeIn(List<String> values) {
            addCriterion("PCCODE in", values, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotIn(List<String> values) {
            addCriterion("PCCODE not in", values, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeBetween(String value1, String value2) {
            addCriterion("PCCODE between", value1, value2, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotBetween(String value1, String value2) {
            addCriterion("PCCODE not between", value1, value2, "pccode");
            return (Criteria) this;
        }

        public Criteria andChangenativedateIsNull() {
            addCriterion("CHANGENATIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andChangenativedateIsNotNull() {
            addCriterion("CHANGENATIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andChangenativedateEqualTo(Date value) {
            addCriterion("CHANGENATIVEDATE =", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateNotEqualTo(Date value) {
            addCriterion("CHANGENATIVEDATE <>", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateGreaterThan(Date value) {
            addCriterion("CHANGENATIVEDATE >", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGENATIVEDATE >=", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateLessThan(Date value) {
            addCriterion("CHANGENATIVEDATE <", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateLessThanOrEqualTo(Date value) {
            addCriterion("CHANGENATIVEDATE <=", value, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateIn(List<Date> values) {
            addCriterion("CHANGENATIVEDATE in", values, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateNotIn(List<Date> values) {
            addCriterion("CHANGENATIVEDATE not in", values, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateBetween(Date value1, Date value2) {
            addCriterion("CHANGENATIVEDATE between", value1, value2, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andChangenativedateNotBetween(Date value1, Date value2) {
            addCriterion("CHANGENATIVEDATE not between", value1, value2, "changenativedate");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoIsNull() {
            addCriterion("OLDLICENSENO is null");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoIsNotNull() {
            addCriterion("OLDLICENSENO is not null");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoEqualTo(String value) {
            addCriterion("OLDLICENSENO =", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoNotEqualTo(String value) {
            addCriterion("OLDLICENSENO <>", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoGreaterThan(String value) {
            addCriterion("OLDLICENSENO >", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoGreaterThanOrEqualTo(String value) {
            addCriterion("OLDLICENSENO >=", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoLessThan(String value) {
            addCriterion("OLDLICENSENO <", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoLessThanOrEqualTo(String value) {
            addCriterion("OLDLICENSENO <=", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoLike(String value) {
            addCriterion("OLDLICENSENO like", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoNotLike(String value) {
            addCriterion("OLDLICENSENO not like", value, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoIn(List<String> values) {
            addCriterion("OLDLICENSENO in", values, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoNotIn(List<String> values) {
            addCriterion("OLDLICENSENO not in", values, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoBetween(String value1, String value2) {
            addCriterion("OLDLICENSENO between", value1, value2, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andOldlicensenoNotBetween(String value1, String value2) {
            addCriterion("OLDLICENSENO not between", value1, value2, "oldlicenseno");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIsNull() {
            addCriterion("ENGINECAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIsNotNull() {
            addCriterion("ENGINECAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityEqualTo(BigDecimal value) {
            addCriterion("ENGINECAPACITY =", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotEqualTo(BigDecimal value) {
            addCriterion("ENGINECAPACITY <>", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityGreaterThan(BigDecimal value) {
            addCriterion("ENGINECAPACITY >", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINECAPACITY >=", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityLessThan(BigDecimal value) {
            addCriterion("ENGINECAPACITY <", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINECAPACITY <=", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIn(List<BigDecimal> values) {
            addCriterion("ENGINECAPACITY in", values, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotIn(List<BigDecimal> values) {
            addCriterion("ENGINECAPACITY not in", values, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINECAPACITY between", value1, value2, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINECAPACITY not between", value1, value2, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeIsNull() {
            addCriterion("REDUCTIONNATURECODE is null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeIsNotNull() {
            addCriterion("REDUCTIONNATURECODE is not null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE =", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeNotEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE <>", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeGreaterThan(String value) {
            addCriterion("REDUCTIONNATURECODE >", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeGreaterThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE >=", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeLessThan(String value) {
            addCriterion("REDUCTIONNATURECODE <", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeLessThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE <=", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeLike(String value) {
            addCriterion("REDUCTIONNATURECODE like", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeNotLike(String value) {
            addCriterion("REDUCTIONNATURECODE not like", value, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeIn(List<String> values) {
            addCriterion("REDUCTIONNATURECODE in", values, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeNotIn(List<String> values) {
            addCriterion("REDUCTIONNATURECODE not in", values, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURECODE between", value1, value2, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecodeNotBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURECODE not between", value1, value2, "reductionnaturecode");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameIsNull() {
            addCriterion("REDUCTIONNATURENAME is null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameIsNotNull() {
            addCriterion("REDUCTIONNATURENAME is not null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME =", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameNotEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME <>", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameGreaterThan(String value) {
            addCriterion("REDUCTIONNATURENAME >", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameGreaterThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME >=", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameLessThan(String value) {
            addCriterion("REDUCTIONNATURENAME <", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameLessThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME <=", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameLike(String value) {
            addCriterion("REDUCTIONNATURENAME like", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameNotLike(String value) {
            addCriterion("REDUCTIONNATURENAME not like", value, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameIn(List<String> values) {
            addCriterion("REDUCTIONNATURENAME in", values, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameNotIn(List<String> values) {
            addCriterion("REDUCTIONNATURENAME not in", values, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURENAME between", value1, value2, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andReductionnaturenameNotBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURENAME not between", value1, value2, "reductionnaturename");
            return (Criteria) this;
        }

        public Criteria andDerateno2IsNull() {
            addCriterion("DERATENO2 is null");
            return (Criteria) this;
        }

        public Criteria andDerateno2IsNotNull() {
            addCriterion("DERATENO2 is not null");
            return (Criteria) this;
        }

        public Criteria andDerateno2EqualTo(String value) {
            addCriterion("DERATENO2 =", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2NotEqualTo(String value) {
            addCriterion("DERATENO2 <>", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2GreaterThan(String value) {
            addCriterion("DERATENO2 >", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2GreaterThanOrEqualTo(String value) {
            addCriterion("DERATENO2 >=", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2LessThan(String value) {
            addCriterion("DERATENO2 <", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2LessThanOrEqualTo(String value) {
            addCriterion("DERATENO2 <=", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2Like(String value) {
            addCriterion("DERATENO2 like", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2NotLike(String value) {
            addCriterion("DERATENO2 not like", value, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2In(List<String> values) {
            addCriterion("DERATENO2 in", values, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2NotIn(List<String> values) {
            addCriterion("DERATENO2 not in", values, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2Between(String value1, String value2) {
            addCriterion("DERATENO2 between", value1, value2, "derateno2");
            return (Criteria) this;
        }

        public Criteria andDerateno2NotBetween(String value1, String value2) {
            addCriterion("DERATENO2 not between", value1, value2, "derateno2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2IsNull() {
            addCriterion("REDUCTIONNATURECODE2 is null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2IsNotNull() {
            addCriterion("REDUCTIONNATURECODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2EqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE2 =", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2NotEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE2 <>", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2GreaterThan(String value) {
            addCriterion("REDUCTIONNATURECODE2 >", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2GreaterThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE2 >=", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2LessThan(String value) {
            addCriterion("REDUCTIONNATURECODE2 <", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2LessThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURECODE2 <=", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2Like(String value) {
            addCriterion("REDUCTIONNATURECODE2 like", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2NotLike(String value) {
            addCriterion("REDUCTIONNATURECODE2 not like", value, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2In(List<String> values) {
            addCriterion("REDUCTIONNATURECODE2 in", values, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2NotIn(List<String> values) {
            addCriterion("REDUCTIONNATURECODE2 not in", values, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2Between(String value1, String value2) {
            addCriterion("REDUCTIONNATURECODE2 between", value1, value2, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturecode2NotBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURECODE2 not between", value1, value2, "reductionnaturecode2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2IsNull() {
            addCriterion("REDUCTIONNATURENAME2 is null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2IsNotNull() {
            addCriterion("REDUCTIONNATURENAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2EqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME2 =", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2NotEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME2 <>", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2GreaterThan(String value) {
            addCriterion("REDUCTIONNATURENAME2 >", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2GreaterThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME2 >=", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2LessThan(String value) {
            addCriterion("REDUCTIONNATURENAME2 <", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2LessThanOrEqualTo(String value) {
            addCriterion("REDUCTIONNATURENAME2 <=", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2Like(String value) {
            addCriterion("REDUCTIONNATURENAME2 like", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2NotLike(String value) {
            addCriterion("REDUCTIONNATURENAME2 not like", value, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2In(List<String> values) {
            addCriterion("REDUCTIONNATURENAME2 in", values, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2NotIn(List<String> values) {
            addCriterion("REDUCTIONNATURENAME2 not in", values, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2Between(String value1, String value2) {
            addCriterion("REDUCTIONNATURENAME2 between", value1, value2, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andReductionnaturename2NotBetween(String value1, String value2) {
            addCriterion("REDUCTIONNATURENAME2 not between", value1, value2, "reductionnaturename2");
            return (Criteria) this;
        }

        public Criteria andTaxyearIsNull() {
            addCriterion("TAXYEAR is null");
            return (Criteria) this;
        }

        public Criteria andTaxyearIsNotNull() {
            addCriterion("TAXYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andTaxyearEqualTo(String value) {
            addCriterion("TAXYEAR =", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearNotEqualTo(String value) {
            addCriterion("TAXYEAR <>", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearGreaterThan(String value) {
            addCriterion("TAXYEAR >", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearGreaterThanOrEqualTo(String value) {
            addCriterion("TAXYEAR >=", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearLessThan(String value) {
            addCriterion("TAXYEAR <", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearLessThanOrEqualTo(String value) {
            addCriterion("TAXYEAR <=", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearLike(String value) {
            addCriterion("TAXYEAR like", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearNotLike(String value) {
            addCriterion("TAXYEAR not like", value, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearIn(List<String> values) {
            addCriterion("TAXYEAR in", values, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearNotIn(List<String> values) {
            addCriterion("TAXYEAR not in", values, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearBetween(String value1, String value2) {
            addCriterion("TAXYEAR between", value1, value2, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxyearNotBetween(String value1, String value2) {
            addCriterion("TAXYEAR not between", value1, value2, "taxyear");
            return (Criteria) this;
        }

        public Criteria andTaxmonthIsNull() {
            addCriterion("TAXMONTH is null");
            return (Criteria) this;
        }

        public Criteria andTaxmonthIsNotNull() {
            addCriterion("TAXMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andTaxmonthEqualTo(String value) {
            addCriterion("TAXMONTH =", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthNotEqualTo(String value) {
            addCriterion("TAXMONTH <>", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthGreaterThan(String value) {
            addCriterion("TAXMONTH >", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthGreaterThanOrEqualTo(String value) {
            addCriterion("TAXMONTH >=", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthLessThan(String value) {
            addCriterion("TAXMONTH <", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthLessThanOrEqualTo(String value) {
            addCriterion("TAXMONTH <=", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthLike(String value) {
            addCriterion("TAXMONTH like", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthNotLike(String value) {
            addCriterion("TAXMONTH not like", value, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthIn(List<String> values) {
            addCriterion("TAXMONTH in", values, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthNotIn(List<String> values) {
            addCriterion("TAXMONTH not in", values, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthBetween(String value1, String value2) {
            addCriterion("TAXMONTH between", value1, value2, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxmonthNotBetween(String value1, String value2) {
            addCriterion("TAXMONTH not between", value1, value2, "taxmonth");
            return (Criteria) this;
        }

        public Criteria andTaxfree2IsNull() {
            addCriterion("TAXFREE2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxfree2IsNotNull() {
            addCriterion("TAXFREE2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxfree2EqualTo(BigDecimal value) {
            addCriterion("TAXFREE2 =", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2NotEqualTo(BigDecimal value) {
            addCriterion("TAXFREE2 <>", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2GreaterThan(BigDecimal value) {
            addCriterion("TAXFREE2 >", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXFREE2 >=", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2LessThan(BigDecimal value) {
            addCriterion("TAXFREE2 <", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXFREE2 <=", value, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2In(List<BigDecimal> values) {
            addCriterion("TAXFREE2 in", values, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2NotIn(List<BigDecimal> values) {
            addCriterion("TAXFREE2 not in", values, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXFREE2 between", value1, value2, "taxfree2");
            return (Criteria) this;
        }

        public Criteria andTaxfree2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXFREE2 not between", value1, value2, "taxfree2");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxdetail_ti
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
     * @Table : mm_taxdetail_ti
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