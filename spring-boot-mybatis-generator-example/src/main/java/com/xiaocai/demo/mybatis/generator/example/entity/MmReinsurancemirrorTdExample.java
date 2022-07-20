package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmReinsurancemirrorTdExample {
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
    public MmReinsurancemirrorTdExample() {
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
     * @Table : mm_reinsurancemirror_td
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
            addCriterion("listno is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("listno is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(Long value) {
            addCriterion("listno =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(Long value) {
            addCriterion("listno <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(Long value) {
            addCriterion("listno >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(Long value) {
            addCriterion("listno >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(Long value) {
            addCriterion("listno <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(Long value) {
            addCriterion("listno <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<Long> values) {
            addCriterion("listno in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<Long> values) {
            addCriterion("listno not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(Long value1, Long value2) {
            addCriterion("listno between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(Long value1, Long value2) {
            addCriterion("listno not between", value1, value2, "listno");
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

        public Criteria andSeqriinsurenceIsNull() {
            addCriterion("SEQRIINSURENCE is null");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceIsNotNull() {
            addCriterion("SEQRIINSURENCE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceEqualTo(Long value) {
            addCriterion("SEQRIINSURENCE =", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceNotEqualTo(Long value) {
            addCriterion("SEQRIINSURENCE <>", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceGreaterThan(Long value) {
            addCriterion("SEQRIINSURENCE >", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQRIINSURENCE >=", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceLessThan(Long value) {
            addCriterion("SEQRIINSURENCE <", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceLessThanOrEqualTo(Long value) {
            addCriterion("SEQRIINSURENCE <=", value, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceIn(List<Long> values) {
            addCriterion("SEQRIINSURENCE in", values, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceNotIn(List<Long> values) {
            addCriterion("SEQRIINSURENCE not in", values, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceBetween(Long value1, Long value2) {
            addCriterion("SEQRIINSURENCE between", value1, value2, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqriinsurenceNotBetween(Long value1, Long value2) {
            addCriterion("SEQRIINSURENCE not between", value1, value2, "seqriinsurence");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabIsNull() {
            addCriterion("SEQRICONTRACTTAB is null");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabIsNotNull() {
            addCriterion("SEQRICONTRACTTAB is not null");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB =", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB <>", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabGreaterThan(Long value) {
            addCriterion("SEQRICONTRACTTAB >", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB >=", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabLessThan(Long value) {
            addCriterion("SEQRICONTRACTTAB <", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabLessThanOrEqualTo(Long value) {
            addCriterion("SEQRICONTRACTTAB <=", value, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabIn(List<Long> values) {
            addCriterion("SEQRICONTRACTTAB in", values, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotIn(List<Long> values) {
            addCriterion("SEQRICONTRACTTAB not in", values, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabBetween(Long value1, Long value2) {
            addCriterion("SEQRICONTRACTTAB between", value1, value2, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andSeqricontracttabNotBetween(Long value1, Long value2) {
            addCriterion("SEQRICONTRACTTAB not between", value1, value2, "seqricontracttab");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("DATATYPE =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("DATATYPE <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("DATATYPE >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("DATATYPE <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("DATATYPE like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("DATATYPE not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("DATATYPE in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("DATATYPE not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("DATATYPE between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("DATATYPE not between", value1, value2, "datatype");
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

        public Criteria andTabperiodIsNull() {
            addCriterion("TABPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTabperiodIsNotNull() {
            addCriterion("TABPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTabperiodEqualTo(String value) {
            addCriterion("TABPERIOD =", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotEqualTo(String value) {
            addCriterion("TABPERIOD <>", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThan(String value) {
            addCriterion("TABPERIOD >", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThanOrEqualTo(String value) {
            addCriterion("TABPERIOD >=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThan(String value) {
            addCriterion("TABPERIOD <", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThanOrEqualTo(String value) {
            addCriterion("TABPERIOD <=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLike(String value) {
            addCriterion("TABPERIOD like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotLike(String value) {
            addCriterion("TABPERIOD not like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodIn(List<String> values) {
            addCriterion("TABPERIOD in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotIn(List<String> values) {
            addCriterion("TABPERIOD not in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodBetween(String value1, String value2) {
            addCriterion("TABPERIOD between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotBetween(String value1, String value2) {
            addCriterion("TABPERIOD not between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNull() {
            addCriterion("CONTRACTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNotNull() {
            addCriterion("CONTRACTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractcodeEqualTo(String value) {
            addCriterion("CONTRACTCODE =", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotEqualTo(String value) {
            addCriterion("CONTRACTCODE <>", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThan(String value) {
            addCriterion("CONTRACTCODE >", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE >=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThan(String value) {
            addCriterion("CONTRACTCODE <", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE <=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLike(String value) {
            addCriterion("CONTRACTCODE like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotLike(String value) {
            addCriterion("CONTRACTCODE not like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeIn(List<String> values) {
            addCriterion("CONTRACTCODE in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotIn(List<String> values) {
            addCriterion("CONTRACTCODE not in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE not between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNull() {
            addCriterion("CLAIMNO is null");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNotNull() {
            addCriterion("CLAIMNO is not null");
            return (Criteria) this;
        }

        public Criteria andClaimnoEqualTo(String value) {
            addCriterion("CLAIMNO =", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotEqualTo(String value) {
            addCriterion("CLAIMNO <>", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThan(String value) {
            addCriterion("CLAIMNO >", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMNO >=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThan(String value) {
            addCriterion("CLAIMNO <", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThanOrEqualTo(String value) {
            addCriterion("CLAIMNO <=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLike(String value) {
            addCriterion("CLAIMNO like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotLike(String value) {
            addCriterion("CLAIMNO not like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIn(List<String> values) {
            addCriterion("CLAIMNO in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotIn(List<String> values) {
            addCriterion("CLAIMNO not in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoBetween(String value1, String value2) {
            addCriterion("CLAIMNO between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotBetween(String value1, String value2) {
            addCriterion("CLAIMNO not between", value1, value2, "claimno");
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

        public Criteria andReinsurercodeIsNull() {
            addCriterion("REINSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNotNull() {
            addCriterion("REINSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeEqualTo(String value) {
            addCriterion("REINSURERCODE =", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotEqualTo(String value) {
            addCriterion("REINSURERCODE <>", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThan(String value) {
            addCriterion("REINSURERCODE >", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE >=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThan(String value) {
            addCriterion("REINSURERCODE <", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE <=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLike(String value) {
            addCriterion("REINSURERCODE like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotLike(String value) {
            addCriterion("REINSURERCODE not like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIn(List<String> values) {
            addCriterion("REINSURERCODE in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotIn(List<String> values) {
            addCriterion("REINSURERCODE not in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeBetween(String value1, String value2) {
            addCriterion("REINSURERCODE between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotBetween(String value1, String value2) {
            addCriterion("REINSURERCODE not between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIsNull() {
            addCriterion("REINSURERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIsNotNull() {
            addCriterion("REINSURERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameEqualTo(String value) {
            addCriterion("REINSURERNAME =", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotEqualTo(String value) {
            addCriterion("REINSURERNAME <>", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameGreaterThan(String value) {
            addCriterion("REINSURERNAME >", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERNAME >=", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLessThan(String value) {
            addCriterion("REINSURERNAME <", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLessThanOrEqualTo(String value) {
            addCriterion("REINSURERNAME <=", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLike(String value) {
            addCriterion("REINSURERNAME like", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotLike(String value) {
            addCriterion("REINSURERNAME not like", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIn(List<String> values) {
            addCriterion("REINSURERNAME in", values, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotIn(List<String> values) {
            addCriterion("REINSURERNAME not in", values, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameBetween(String value1, String value2) {
            addCriterion("REINSURERNAME between", value1, value2, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotBetween(String value1, String value2) {
            addCriterion("REINSURERNAME not between", value1, value2, "reinsurername");
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

        public Criteria andIfoverseaIsNull() {
            addCriterion("IFOVERSEA is null");
            return (Criteria) this;
        }

        public Criteria andIfoverseaIsNotNull() {
            addCriterion("IFOVERSEA is not null");
            return (Criteria) this;
        }

        public Criteria andIfoverseaEqualTo(String value) {
            addCriterion("IFOVERSEA =", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotEqualTo(String value) {
            addCriterion("IFOVERSEA <>", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaGreaterThan(String value) {
            addCriterion("IFOVERSEA >", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaGreaterThanOrEqualTo(String value) {
            addCriterion("IFOVERSEA >=", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLessThan(String value) {
            addCriterion("IFOVERSEA <", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLessThanOrEqualTo(String value) {
            addCriterion("IFOVERSEA <=", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLike(String value) {
            addCriterion("IFOVERSEA like", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotLike(String value) {
            addCriterion("IFOVERSEA not like", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaIn(List<String> values) {
            addCriterion("IFOVERSEA in", values, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotIn(List<String> values) {
            addCriterion("IFOVERSEA not in", values, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaBetween(String value1, String value2) {
            addCriterion("IFOVERSEA between", value1, value2, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotBetween(String value1, String value2) {
            addCriterion("IFOVERSEA not between", value1, value2, "ifoversea");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reinsurancemirror_td
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
     * @Table : mm_reinsurancemirror_td
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