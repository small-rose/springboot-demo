package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class GlErpRuleTcExample {
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
    public GlErpRuleTcExample() {
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
     * @Table : gl_erp_rule_tc
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

        public Criteria andErpaccountcodeIsNull() {
            addCriterion("ERPACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIsNotNull() {
            addCriterion("ERPACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeEqualTo(Long value) {
            addCriterion("ERPACCOUNTCODE =", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotEqualTo(Long value) {
            addCriterion("ERPACCOUNTCODE <>", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThan(Long value) {
            addCriterion("ERPACCOUNTCODE >", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ERPACCOUNTCODE >=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThan(Long value) {
            addCriterion("ERPACCOUNTCODE <", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThanOrEqualTo(Long value) {
            addCriterion("ERPACCOUNTCODE <=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIn(List<Long> values) {
            addCriterion("ERPACCOUNTCODE in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotIn(List<Long> values) {
            addCriterion("ERPACCOUNTCODE not in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeBetween(Long value1, Long value2) {
            addCriterion("ERPACCOUNTCODE between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotBetween(Long value1, Long value2) {
            addCriterion("ERPACCOUNTCODE not between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIsNull() {
            addCriterion("ERPACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIsNotNull() {
            addCriterion("ERPACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME =", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME <>", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameGreaterThan(String value) {
            addCriterion("ERPACCOUNTNAME >", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME >=", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLessThan(String value) {
            addCriterion("ERPACCOUNTNAME <", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLessThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTNAME <=", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameLike(String value) {
            addCriterion("ERPACCOUNTNAME like", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotLike(String value) {
            addCriterion("ERPACCOUNTNAME not like", value, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameIn(List<String> values) {
            addCriterion("ERPACCOUNTNAME in", values, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotIn(List<String> values) {
            addCriterion("ERPACCOUNTNAME not in", values, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTNAME between", value1, value2, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andErpaccountnameNotBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTNAME not between", value1, value2, "erpaccountname");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("SEGMENT5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("SEGMENT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(String value) {
            addCriterion("SEGMENT5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(String value) {
            addCriterion("SEGMENT5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(String value) {
            addCriterion("SEGMENT5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(String value) {
            addCriterion("SEGMENT5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Like(String value) {
            addCriterion("SEGMENT5 like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotLike(String value) {
            addCriterion("SEGMENT5 not like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<String> values) {
            addCriterion("SEGMENT5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<String> values) {
            addCriterion("SEGMENT5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(String value1, String value2) {
            addCriterion("SEGMENT5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(String value1, String value2) {
            addCriterion("SEGMENT5 not between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNull() {
            addCriterion("SEGMENT6 is null");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNotNull() {
            addCriterion("SEGMENT6 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6EqualTo(String value) {
            addCriterion("SEGMENT6 =", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotEqualTo(String value) {
            addCriterion("SEGMENT6 <>", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThan(String value) {
            addCriterion("SEGMENT6 >", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 >=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThan(String value) {
            addCriterion("SEGMENT6 <", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 <=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Like(String value) {
            addCriterion("SEGMENT6 like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotLike(String value) {
            addCriterion("SEGMENT6 not like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6In(List<String> values) {
            addCriterion("SEGMENT6 in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotIn(List<String> values) {
            addCriterion("SEGMENT6 not in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Between(String value1, String value2) {
            addCriterion("SEGMENT6 between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotBetween(String value1, String value2) {
            addCriterion("SEGMENT6 not between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNull() {
            addCriterion("SEGMENT7 is null");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNotNull() {
            addCriterion("SEGMENT7 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7EqualTo(String value) {
            addCriterion("SEGMENT7 =", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotEqualTo(String value) {
            addCriterion("SEGMENT7 <>", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThan(String value) {
            addCriterion("SEGMENT7 >", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 >=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThan(String value) {
            addCriterion("SEGMENT7 <", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 <=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Like(String value) {
            addCriterion("SEGMENT7 like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotLike(String value) {
            addCriterion("SEGMENT7 not like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7In(List<String> values) {
            addCriterion("SEGMENT7 in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotIn(List<String> values) {
            addCriterion("SEGMENT7 not in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Between(String value1, String value2) {
            addCriterion("SEGMENT7 between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotBetween(String value1, String value2) {
            addCriterion("SEGMENT7 not between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNull() {
            addCriterion("SEGMENT8 is null");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNotNull() {
            addCriterion("SEGMENT8 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8EqualTo(String value) {
            addCriterion("SEGMENT8 =", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotEqualTo(String value) {
            addCriterion("SEGMENT8 <>", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThan(String value) {
            addCriterion("SEGMENT8 >", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 >=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThan(String value) {
            addCriterion("SEGMENT8 <", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT8 <=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Like(String value) {
            addCriterion("SEGMENT8 like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotLike(String value) {
            addCriterion("SEGMENT8 not like", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8In(List<String> values) {
            addCriterion("SEGMENT8 in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotIn(List<String> values) {
            addCriterion("SEGMENT8 not in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Between(String value1, String value2) {
            addCriterion("SEGMENT8 between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotBetween(String value1, String value2) {
            addCriterion("SEGMENT8 not between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNull() {
            addCriterion("SEGMENT9 is null");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNotNull() {
            addCriterion("SEGMENT9 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9EqualTo(String value) {
            addCriterion("SEGMENT9 =", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotEqualTo(String value) {
            addCriterion("SEGMENT9 <>", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThan(String value) {
            addCriterion("SEGMENT9 >", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 >=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThan(String value) {
            addCriterion("SEGMENT9 <", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT9 <=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Like(String value) {
            addCriterion("SEGMENT9 like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotLike(String value) {
            addCriterion("SEGMENT9 not like", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9In(List<String> values) {
            addCriterion("SEGMENT9 in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotIn(List<String> values) {
            addCriterion("SEGMENT9 not in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Between(String value1, String value2) {
            addCriterion("SEGMENT9 between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotBetween(String value1, String value2) {
            addCriterion("SEGMENT9 not between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNull() {
            addCriterion("SEGMENT10 is null");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNotNull() {
            addCriterion("SEGMENT10 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10EqualTo(String value) {
            addCriterion("SEGMENT10 =", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotEqualTo(String value) {
            addCriterion("SEGMENT10 <>", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThan(String value) {
            addCriterion("SEGMENT10 >", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 >=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThan(String value) {
            addCriterion("SEGMENT10 <", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT10 <=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Like(String value) {
            addCriterion("SEGMENT10 like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotLike(String value) {
            addCriterion("SEGMENT10 not like", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10In(List<String> values) {
            addCriterion("SEGMENT10 in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotIn(List<String> values) {
            addCriterion("SEGMENT10 not in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Between(String value1, String value2) {
            addCriterion("SEGMENT10 between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotBetween(String value1, String value2) {
            addCriterion("SEGMENT10 not between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNull() {
            addCriterion("SEGMENT11 is null");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNotNull() {
            addCriterion("SEGMENT11 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11EqualTo(String value) {
            addCriterion("SEGMENT11 =", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotEqualTo(String value) {
            addCriterion("SEGMENT11 <>", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThan(String value) {
            addCriterion("SEGMENT11 >", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 >=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThan(String value) {
            addCriterion("SEGMENT11 <", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT11 <=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Like(String value) {
            addCriterion("SEGMENT11 like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotLike(String value) {
            addCriterion("SEGMENT11 not like", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11In(List<String> values) {
            addCriterion("SEGMENT11 in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotIn(List<String> values) {
            addCriterion("SEGMENT11 not in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Between(String value1, String value2) {
            addCriterion("SEGMENT11 between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotBetween(String value1, String value2) {
            addCriterion("SEGMENT11 not between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNull() {
            addCriterion("SEGMENT12 is null");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNotNull() {
            addCriterion("SEGMENT12 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12EqualTo(String value) {
            addCriterion("SEGMENT12 =", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotEqualTo(String value) {
            addCriterion("SEGMENT12 <>", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThan(String value) {
            addCriterion("SEGMENT12 >", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 >=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThan(String value) {
            addCriterion("SEGMENT12 <", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT12 <=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Like(String value) {
            addCriterion("SEGMENT12 like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotLike(String value) {
            addCriterion("SEGMENT12 not like", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12In(List<String> values) {
            addCriterion("SEGMENT12 in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotIn(List<String> values) {
            addCriterion("SEGMENT12 not in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Between(String value1, String value2) {
            addCriterion("SEGMENT12 between", value1, value2, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotBetween(String value1, String value2) {
            addCriterion("SEGMENT12 not between", value1, value2, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment13IsNull() {
            addCriterion("SEGMENT13 is null");
            return (Criteria) this;
        }

        public Criteria andSegment13IsNotNull() {
            addCriterion("SEGMENT13 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment13EqualTo(String value) {
            addCriterion("SEGMENT13 =", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotEqualTo(String value) {
            addCriterion("SEGMENT13 <>", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThan(String value) {
            addCriterion("SEGMENT13 >", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 >=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThan(String value) {
            addCriterion("SEGMENT13 <", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT13 <=", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Like(String value) {
            addCriterion("SEGMENT13 like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotLike(String value) {
            addCriterion("SEGMENT13 not like", value, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13In(List<String> values) {
            addCriterion("SEGMENT13 in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotIn(List<String> values) {
            addCriterion("SEGMENT13 not in", values, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13Between(String value1, String value2) {
            addCriterion("SEGMENT13 between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment13NotBetween(String value1, String value2) {
            addCriterion("SEGMENT13 not between", value1, value2, "segment13");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNull() {
            addCriterion("SEGMENT14 is null");
            return (Criteria) this;
        }

        public Criteria andSegment14IsNotNull() {
            addCriterion("SEGMENT14 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment14EqualTo(String value) {
            addCriterion("SEGMENT14 =", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotEqualTo(String value) {
            addCriterion("SEGMENT14 <>", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThan(String value) {
            addCriterion("SEGMENT14 >", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 >=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThan(String value) {
            addCriterion("SEGMENT14 <", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT14 <=", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Like(String value) {
            addCriterion("SEGMENT14 like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotLike(String value) {
            addCriterion("SEGMENT14 not like", value, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14In(List<String> values) {
            addCriterion("SEGMENT14 in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotIn(List<String> values) {
            addCriterion("SEGMENT14 not in", values, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14Between(String value1, String value2) {
            addCriterion("SEGMENT14 between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment14NotBetween(String value1, String value2) {
            addCriterion("SEGMENT14 not between", value1, value2, "segment14");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNull() {
            addCriterion("SEGMENT15 is null");
            return (Criteria) this;
        }

        public Criteria andSegment15IsNotNull() {
            addCriterion("SEGMENT15 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment15EqualTo(String value) {
            addCriterion("SEGMENT15 =", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotEqualTo(String value) {
            addCriterion("SEGMENT15 <>", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThan(String value) {
            addCriterion("SEGMENT15 >", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 >=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThan(String value) {
            addCriterion("SEGMENT15 <", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT15 <=", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Like(String value) {
            addCriterion("SEGMENT15 like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotLike(String value) {
            addCriterion("SEGMENT15 not like", value, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15In(List<String> values) {
            addCriterion("SEGMENT15 in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotIn(List<String> values) {
            addCriterion("SEGMENT15 not in", values, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15Between(String value1, String value2) {
            addCriterion("SEGMENT15 between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment15NotBetween(String value1, String value2) {
            addCriterion("SEGMENT15 not between", value1, value2, "segment15");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNull() {
            addCriterion("SEGMENT16 is null");
            return (Criteria) this;
        }

        public Criteria andSegment16IsNotNull() {
            addCriterion("SEGMENT16 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment16EqualTo(String value) {
            addCriterion("SEGMENT16 =", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotEqualTo(String value) {
            addCriterion("SEGMENT16 <>", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThan(String value) {
            addCriterion("SEGMENT16 >", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 >=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThan(String value) {
            addCriterion("SEGMENT16 <", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT16 <=", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Like(String value) {
            addCriterion("SEGMENT16 like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotLike(String value) {
            addCriterion("SEGMENT16 not like", value, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16In(List<String> values) {
            addCriterion("SEGMENT16 in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotIn(List<String> values) {
            addCriterion("SEGMENT16 not in", values, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16Between(String value1, String value2) {
            addCriterion("SEGMENT16 between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment16NotBetween(String value1, String value2) {
            addCriterion("SEGMENT16 not between", value1, value2, "segment16");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNull() {
            addCriterion("SEGMENT17 is null");
            return (Criteria) this;
        }

        public Criteria andSegment17IsNotNull() {
            addCriterion("SEGMENT17 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment17EqualTo(String value) {
            addCriterion("SEGMENT17 =", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotEqualTo(String value) {
            addCriterion("SEGMENT17 <>", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThan(String value) {
            addCriterion("SEGMENT17 >", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 >=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThan(String value) {
            addCriterion("SEGMENT17 <", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT17 <=", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Like(String value) {
            addCriterion("SEGMENT17 like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotLike(String value) {
            addCriterion("SEGMENT17 not like", value, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17In(List<String> values) {
            addCriterion("SEGMENT17 in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotIn(List<String> values) {
            addCriterion("SEGMENT17 not in", values, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17Between(String value1, String value2) {
            addCriterion("SEGMENT17 between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment17NotBetween(String value1, String value2) {
            addCriterion("SEGMENT17 not between", value1, value2, "segment17");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNull() {
            addCriterion("SEGMENT18 is null");
            return (Criteria) this;
        }

        public Criteria andSegment18IsNotNull() {
            addCriterion("SEGMENT18 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment18EqualTo(String value) {
            addCriterion("SEGMENT18 =", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotEqualTo(String value) {
            addCriterion("SEGMENT18 <>", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThan(String value) {
            addCriterion("SEGMENT18 >", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 >=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThan(String value) {
            addCriterion("SEGMENT18 <", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT18 <=", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Like(String value) {
            addCriterion("SEGMENT18 like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotLike(String value) {
            addCriterion("SEGMENT18 not like", value, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18In(List<String> values) {
            addCriterion("SEGMENT18 in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotIn(List<String> values) {
            addCriterion("SEGMENT18 not in", values, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18Between(String value1, String value2) {
            addCriterion("SEGMENT18 between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment18NotBetween(String value1, String value2) {
            addCriterion("SEGMENT18 not between", value1, value2, "segment18");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNull() {
            addCriterion("SEGMENT19 is null");
            return (Criteria) this;
        }

        public Criteria andSegment19IsNotNull() {
            addCriterion("SEGMENT19 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment19EqualTo(String value) {
            addCriterion("SEGMENT19 =", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotEqualTo(String value) {
            addCriterion("SEGMENT19 <>", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThan(String value) {
            addCriterion("SEGMENT19 >", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 >=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThan(String value) {
            addCriterion("SEGMENT19 <", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT19 <=", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Like(String value) {
            addCriterion("SEGMENT19 like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotLike(String value) {
            addCriterion("SEGMENT19 not like", value, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19In(List<String> values) {
            addCriterion("SEGMENT19 in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotIn(List<String> values) {
            addCriterion("SEGMENT19 not in", values, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19Between(String value1, String value2) {
            addCriterion("SEGMENT19 between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment19NotBetween(String value1, String value2) {
            addCriterion("SEGMENT19 not between", value1, value2, "segment19");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNull() {
            addCriterion("SEGMENT20 is null");
            return (Criteria) this;
        }

        public Criteria andSegment20IsNotNull() {
            addCriterion("SEGMENT20 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment20EqualTo(String value) {
            addCriterion("SEGMENT20 =", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotEqualTo(String value) {
            addCriterion("SEGMENT20 <>", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThan(String value) {
            addCriterion("SEGMENT20 >", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 >=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThan(String value) {
            addCriterion("SEGMENT20 <", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT20 <=", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Like(String value) {
            addCriterion("SEGMENT20 like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotLike(String value) {
            addCriterion("SEGMENT20 not like", value, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20In(List<String> values) {
            addCriterion("SEGMENT20 in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotIn(List<String> values) {
            addCriterion("SEGMENT20 not in", values, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20Between(String value1, String value2) {
            addCriterion("SEGMENT20 between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment20NotBetween(String value1, String value2) {
            addCriterion("SEGMENT20 not between", value1, value2, "segment20");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNull() {
            addCriterion("SEGMENT21 is null");
            return (Criteria) this;
        }

        public Criteria andSegment21IsNotNull() {
            addCriterion("SEGMENT21 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment21EqualTo(String value) {
            addCriterion("SEGMENT21 =", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotEqualTo(String value) {
            addCriterion("SEGMENT21 <>", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThan(String value) {
            addCriterion("SEGMENT21 >", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 >=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThan(String value) {
            addCriterion("SEGMENT21 <", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT21 <=", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Like(String value) {
            addCriterion("SEGMENT21 like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotLike(String value) {
            addCriterion("SEGMENT21 not like", value, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21In(List<String> values) {
            addCriterion("SEGMENT21 in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotIn(List<String> values) {
            addCriterion("SEGMENT21 not in", values, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21Between(String value1, String value2) {
            addCriterion("SEGMENT21 between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment21NotBetween(String value1, String value2) {
            addCriterion("SEGMENT21 not between", value1, value2, "segment21");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNull() {
            addCriterion("SEGMENT22 is null");
            return (Criteria) this;
        }

        public Criteria andSegment22IsNotNull() {
            addCriterion("SEGMENT22 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment22EqualTo(String value) {
            addCriterion("SEGMENT22 =", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotEqualTo(String value) {
            addCriterion("SEGMENT22 <>", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThan(String value) {
            addCriterion("SEGMENT22 >", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 >=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThan(String value) {
            addCriterion("SEGMENT22 <", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT22 <=", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Like(String value) {
            addCriterion("SEGMENT22 like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotLike(String value) {
            addCriterion("SEGMENT22 not like", value, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22In(List<String> values) {
            addCriterion("SEGMENT22 in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotIn(List<String> values) {
            addCriterion("SEGMENT22 not in", values, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22Between(String value1, String value2) {
            addCriterion("SEGMENT22 between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment22NotBetween(String value1, String value2) {
            addCriterion("SEGMENT22 not between", value1, value2, "segment22");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNull() {
            addCriterion("SEGMENT23 is null");
            return (Criteria) this;
        }

        public Criteria andSegment23IsNotNull() {
            addCriterion("SEGMENT23 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment23EqualTo(String value) {
            addCriterion("SEGMENT23 =", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotEqualTo(String value) {
            addCriterion("SEGMENT23 <>", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThan(String value) {
            addCriterion("SEGMENT23 >", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 >=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThan(String value) {
            addCriterion("SEGMENT23 <", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT23 <=", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Like(String value) {
            addCriterion("SEGMENT23 like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotLike(String value) {
            addCriterion("SEGMENT23 not like", value, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23In(List<String> values) {
            addCriterion("SEGMENT23 in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotIn(List<String> values) {
            addCriterion("SEGMENT23 not in", values, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23Between(String value1, String value2) {
            addCriterion("SEGMENT23 between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment23NotBetween(String value1, String value2) {
            addCriterion("SEGMENT23 not between", value1, value2, "segment23");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNull() {
            addCriterion("SEGMENT24 is null");
            return (Criteria) this;
        }

        public Criteria andSegment24IsNotNull() {
            addCriterion("SEGMENT24 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment24EqualTo(String value) {
            addCriterion("SEGMENT24 =", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotEqualTo(String value) {
            addCriterion("SEGMENT24 <>", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThan(String value) {
            addCriterion("SEGMENT24 >", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 >=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThan(String value) {
            addCriterion("SEGMENT24 <", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT24 <=", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Like(String value) {
            addCriterion("SEGMENT24 like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotLike(String value) {
            addCriterion("SEGMENT24 not like", value, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24In(List<String> values) {
            addCriterion("SEGMENT24 in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotIn(List<String> values) {
            addCriterion("SEGMENT24 not in", values, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24Between(String value1, String value2) {
            addCriterion("SEGMENT24 between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment24NotBetween(String value1, String value2) {
            addCriterion("SEGMENT24 not between", value1, value2, "segment24");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNull() {
            addCriterion("SEGMENT25 is null");
            return (Criteria) this;
        }

        public Criteria andSegment25IsNotNull() {
            addCriterion("SEGMENT25 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment25EqualTo(String value) {
            addCriterion("SEGMENT25 =", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotEqualTo(String value) {
            addCriterion("SEGMENT25 <>", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThan(String value) {
            addCriterion("SEGMENT25 >", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 >=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThan(String value) {
            addCriterion("SEGMENT25 <", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT25 <=", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Like(String value) {
            addCriterion("SEGMENT25 like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotLike(String value) {
            addCriterion("SEGMENT25 not like", value, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25In(List<String> values) {
            addCriterion("SEGMENT25 in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotIn(List<String> values) {
            addCriterion("SEGMENT25 not in", values, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25Between(String value1, String value2) {
            addCriterion("SEGMENT25 between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment25NotBetween(String value1, String value2) {
            addCriterion("SEGMENT25 not between", value1, value2, "segment25");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNull() {
            addCriterion("SEGMENT26 is null");
            return (Criteria) this;
        }

        public Criteria andSegment26IsNotNull() {
            addCriterion("SEGMENT26 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment26EqualTo(String value) {
            addCriterion("SEGMENT26 =", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotEqualTo(String value) {
            addCriterion("SEGMENT26 <>", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThan(String value) {
            addCriterion("SEGMENT26 >", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 >=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThan(String value) {
            addCriterion("SEGMENT26 <", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT26 <=", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Like(String value) {
            addCriterion("SEGMENT26 like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotLike(String value) {
            addCriterion("SEGMENT26 not like", value, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26In(List<String> values) {
            addCriterion("SEGMENT26 in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotIn(List<String> values) {
            addCriterion("SEGMENT26 not in", values, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26Between(String value1, String value2) {
            addCriterion("SEGMENT26 between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment26NotBetween(String value1, String value2) {
            addCriterion("SEGMENT26 not between", value1, value2, "segment26");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNull() {
            addCriterion("SEGMENT27 is null");
            return (Criteria) this;
        }

        public Criteria andSegment27IsNotNull() {
            addCriterion("SEGMENT27 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment27EqualTo(String value) {
            addCriterion("SEGMENT27 =", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotEqualTo(String value) {
            addCriterion("SEGMENT27 <>", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThan(String value) {
            addCriterion("SEGMENT27 >", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 >=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThan(String value) {
            addCriterion("SEGMENT27 <", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT27 <=", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Like(String value) {
            addCriterion("SEGMENT27 like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotLike(String value) {
            addCriterion("SEGMENT27 not like", value, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27In(List<String> values) {
            addCriterion("SEGMENT27 in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotIn(List<String> values) {
            addCriterion("SEGMENT27 not in", values, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27Between(String value1, String value2) {
            addCriterion("SEGMENT27 between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment27NotBetween(String value1, String value2) {
            addCriterion("SEGMENT27 not between", value1, value2, "segment27");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNull() {
            addCriterion("SEGMENT28 is null");
            return (Criteria) this;
        }

        public Criteria andSegment28IsNotNull() {
            addCriterion("SEGMENT28 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment28EqualTo(String value) {
            addCriterion("SEGMENT28 =", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotEqualTo(String value) {
            addCriterion("SEGMENT28 <>", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThan(String value) {
            addCriterion("SEGMENT28 >", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 >=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThan(String value) {
            addCriterion("SEGMENT28 <", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT28 <=", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Like(String value) {
            addCriterion("SEGMENT28 like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotLike(String value) {
            addCriterion("SEGMENT28 not like", value, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28In(List<String> values) {
            addCriterion("SEGMENT28 in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotIn(List<String> values) {
            addCriterion("SEGMENT28 not in", values, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28Between(String value1, String value2) {
            addCriterion("SEGMENT28 between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment28NotBetween(String value1, String value2) {
            addCriterion("SEGMENT28 not between", value1, value2, "segment28");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNull() {
            addCriterion("SEGMENT29 is null");
            return (Criteria) this;
        }

        public Criteria andSegment29IsNotNull() {
            addCriterion("SEGMENT29 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment29EqualTo(String value) {
            addCriterion("SEGMENT29 =", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotEqualTo(String value) {
            addCriterion("SEGMENT29 <>", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThan(String value) {
            addCriterion("SEGMENT29 >", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 >=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThan(String value) {
            addCriterion("SEGMENT29 <", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT29 <=", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Like(String value) {
            addCriterion("SEGMENT29 like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotLike(String value) {
            addCriterion("SEGMENT29 not like", value, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29In(List<String> values) {
            addCriterion("SEGMENT29 in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotIn(List<String> values) {
            addCriterion("SEGMENT29 not in", values, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29Between(String value1, String value2) {
            addCriterion("SEGMENT29 between", value1, value2, "segment29");
            return (Criteria) this;
        }

        public Criteria andSegment29NotBetween(String value1, String value2) {
            addCriterion("SEGMENT29 not between", value1, value2, "segment29");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : gl_erp_rule_tc
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
     * @Table : gl_erp_rule_tc
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