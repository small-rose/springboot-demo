package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmBadDebtsListExample {
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
    public MmBadDebtsListExample() {
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
     * @Table : mm_bad_debts_list
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

        public Criteria andExtractDateIsNull() {
            addCriterion("EXTRACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExtractDateIsNotNull() {
            addCriterion("EXTRACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtractDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE =", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE <>", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE >", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE >=", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateLessThan(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE <", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXTRACT_DATE <=", value, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXTRACT_DATE in", values, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXTRACT_DATE not in", values, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXTRACT_DATE between", value1, value2, "extractDate");
            return (Criteria) this;
        }

        public Criteria andExtractDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXTRACT_DATE not between", value1, value2, "extractDate");
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

        public Criteria andAccountdateIsNull() {
            addCriterion("ACCOUNTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountdateIsNotNull() {
            addCriterion("ACCOUNTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdateEqualTo(Long value) {
            addCriterion("ACCOUNTDATE =", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotEqualTo(Long value) {
            addCriterion("ACCOUNTDATE <>", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThan(Long value) {
            addCriterion("ACCOUNTDATE >", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTDATE >=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThan(Long value) {
            addCriterion("ACCOUNTDATE <", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTDATE <=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateIn(List<Long> values) {
            addCriterion("ACCOUNTDATE in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotIn(List<Long> values) {
            addCriterion("ACCOUNTDATE not in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTDATE between", value1, value2, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTDATE not between", value1, value2, "accountdate");
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

        public Criteria andPlanDateIsNull() {
            addCriterion("PLAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("PLAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("PLAN_DATE =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("PLAN_DATE <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("PLAN_DATE >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("PLAN_DATE <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("PLAN_DATE in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("PLAN_DATE not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanSeqIsNull() {
            addCriterion("PLAN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPlanSeqIsNotNull() {
            addCriterion("PLAN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPlanSeqEqualTo(BigDecimal value) {
            addCriterion("PLAN_SEQ =", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqNotEqualTo(BigDecimal value) {
            addCriterion("PLAN_SEQ <>", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqGreaterThan(BigDecimal value) {
            addCriterion("PLAN_SEQ >", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_SEQ >=", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqLessThan(BigDecimal value) {
            addCriterion("PLAN_SEQ <", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_SEQ <=", value, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqIn(List<BigDecimal> values) {
            addCriterion("PLAN_SEQ in", values, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqNotIn(List<BigDecimal> values) {
            addCriterion("PLAN_SEQ not in", values, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_SEQ between", value1, value2, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_SEQ not between", value1, value2, "planSeq");
            return (Criteria) this;
        }

        public Criteria andPlanAmountIsNull() {
            addCriterion("PLAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPlanAmountIsNotNull() {
            addCriterion("PLAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAmountEqualTo(BigDecimal value) {
            addCriterion("PLAN_AMOUNT =", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountNotEqualTo(BigDecimal value) {
            addCriterion("PLAN_AMOUNT <>", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountGreaterThan(BigDecimal value) {
            addCriterion("PLAN_AMOUNT >", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_AMOUNT >=", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountLessThan(BigDecimal value) {
            addCriterion("PLAN_AMOUNT <", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_AMOUNT <=", value, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountIn(List<BigDecimal> values) {
            addCriterion("PLAN_AMOUNT in", values, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountNotIn(List<BigDecimal> values) {
            addCriterion("PLAN_AMOUNT not in", values, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_AMOUNT between", value1, value2, "planAmount");
            return (Criteria) this;
        }

        public Criteria andPlanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_AMOUNT not between", value1, value2, "planAmount");
            return (Criteria) this;
        }

        public Criteria andIsBadIsNull() {
            addCriterion("IS_BAD is null");
            return (Criteria) this;
        }

        public Criteria andIsBadIsNotNull() {
            addCriterion("IS_BAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsBadEqualTo(String value) {
            addCriterion("IS_BAD =", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadNotEqualTo(String value) {
            addCriterion("IS_BAD <>", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadGreaterThan(String value) {
            addCriterion("IS_BAD >", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BAD >=", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadLessThan(String value) {
            addCriterion("IS_BAD <", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadLessThanOrEqualTo(String value) {
            addCriterion("IS_BAD <=", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadLike(String value) {
            addCriterion("IS_BAD like", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadNotLike(String value) {
            addCriterion("IS_BAD not like", value, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadIn(List<String> values) {
            addCriterion("IS_BAD in", values, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadNotIn(List<String> values) {
            addCriterion("IS_BAD not in", values, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadBetween(String value1, String value2) {
            addCriterion("IS_BAD between", value1, value2, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsBadNotBetween(String value1, String value2) {
            addCriterion("IS_BAD not between", value1, value2, "isBad");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNull() {
            addCriterion("IS_START is null");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNotNull() {
            addCriterion("IS_START is not null");
            return (Criteria) this;
        }

        public Criteria andIsStartEqualTo(String value) {
            addCriterion("IS_START =", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotEqualTo(String value) {
            addCriterion("IS_START <>", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThan(String value) {
            addCriterion("IS_START >", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThanOrEqualTo(String value) {
            addCriterion("IS_START >=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThan(String value) {
            addCriterion("IS_START <", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThanOrEqualTo(String value) {
            addCriterion("IS_START <=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLike(String value) {
            addCriterion("IS_START like", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotLike(String value) {
            addCriterion("IS_START not like", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartIn(List<String> values) {
            addCriterion("IS_START in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotIn(List<String> values) {
            addCriterion("IS_START not in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartBetween(String value1, String value2) {
            addCriterion("IS_START between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotBetween(String value1, String value2) {
            addCriterion("IS_START not between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andThisAmountIsNull() {
            addCriterion("THIS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andThisAmountIsNotNull() {
            addCriterion("THIS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andThisAmountEqualTo(BigDecimal value) {
            addCriterion("THIS_AMOUNT =", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountNotEqualTo(BigDecimal value) {
            addCriterion("THIS_AMOUNT <>", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountGreaterThan(BigDecimal value) {
            addCriterion("THIS_AMOUNT >", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THIS_AMOUNT >=", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountLessThan(BigDecimal value) {
            addCriterion("THIS_AMOUNT <", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THIS_AMOUNT <=", value, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountIn(List<BigDecimal> values) {
            addCriterion("THIS_AMOUNT in", values, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountNotIn(List<BigDecimal> values) {
            addCriterion("THIS_AMOUNT not in", values, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THIS_AMOUNT between", value1, value2, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andThisAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THIS_AMOUNT not between", value1, value2, "thisAmount");
            return (Criteria) this;
        }

        public Criteria andBadPercentIsNull() {
            addCriterion("BAD_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andBadPercentIsNotNull() {
            addCriterion("BAD_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andBadPercentEqualTo(BigDecimal value) {
            addCriterion("BAD_PERCENT =", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentNotEqualTo(BigDecimal value) {
            addCriterion("BAD_PERCENT <>", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentGreaterThan(BigDecimal value) {
            addCriterion("BAD_PERCENT >", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BAD_PERCENT >=", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentLessThan(BigDecimal value) {
            addCriterion("BAD_PERCENT <", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BAD_PERCENT <=", value, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentIn(List<BigDecimal> values) {
            addCriterion("BAD_PERCENT in", values, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentNotIn(List<BigDecimal> values) {
            addCriterion("BAD_PERCENT not in", values, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAD_PERCENT between", value1, value2, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAD_PERCENT not between", value1, value2, "badPercent");
            return (Criteria) this;
        }

        public Criteria andBadAmountIsNull() {
            addCriterion("BAD_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBadAmountIsNotNull() {
            addCriterion("BAD_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBadAmountEqualTo(BigDecimal value) {
            addCriterion("BAD_AMOUNT =", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountNotEqualTo(BigDecimal value) {
            addCriterion("BAD_AMOUNT <>", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountGreaterThan(BigDecimal value) {
            addCriterion("BAD_AMOUNT >", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BAD_AMOUNT >=", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountLessThan(BigDecimal value) {
            addCriterion("BAD_AMOUNT <", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BAD_AMOUNT <=", value, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountIn(List<BigDecimal> values) {
            addCriterion("BAD_AMOUNT in", values, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountNotIn(List<BigDecimal> values) {
            addCriterion("BAD_AMOUNT not in", values, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAD_AMOUNT between", value1, value2, "badAmount");
            return (Criteria) this;
        }

        public Criteria andBadAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAD_AMOUNT not between", value1, value2, "badAmount");
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

        public Criteria andHibernateversionEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Short value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Short value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Short value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Short> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Short value1, Short value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
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

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(BigDecimal value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(BigDecimal value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(BigDecimal value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(BigDecimal value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<BigDecimal> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<BigDecimal> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bad_debts_list
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
     * @Table : mm_bad_debts_list
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