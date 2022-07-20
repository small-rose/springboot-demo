package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmApplyfeeTdExample {
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
    public MmApplyfeeTdExample() {
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
     * @Table : mm_applyfee_td
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

        public Criteria andSeqfeelistIsNull() {
            addCriterion("SEQFEELIST is null");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistIsNotNull() {
            addCriterion("SEQFEELIST is not null");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistEqualTo(Long value) {
            addCriterion("SEQFEELIST =", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistNotEqualTo(Long value) {
            addCriterion("SEQFEELIST <>", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistGreaterThan(Long value) {
            addCriterion("SEQFEELIST >", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQFEELIST >=", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistLessThan(Long value) {
            addCriterion("SEQFEELIST <", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistLessThanOrEqualTo(Long value) {
            addCriterion("SEQFEELIST <=", value, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistIn(List<Long> values) {
            addCriterion("SEQFEELIST in", values, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistNotIn(List<Long> values) {
            addCriterion("SEQFEELIST not in", values, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistBetween(Long value1, Long value2) {
            addCriterion("SEQFEELIST between", value1, value2, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeelistNotBetween(Long value1, Long value2) {
            addCriterion("SEQFEELIST not between", value1, value2, "seqfeelist");
            return (Criteria) this;
        }

        public Criteria andSeqfeeIsNull() {
            addCriterion("SEQFEE is null");
            return (Criteria) this;
        }

        public Criteria andSeqfeeIsNotNull() {
            addCriterion("SEQFEE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqfeeEqualTo(Long value) {
            addCriterion("SEQFEE =", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeNotEqualTo(Long value) {
            addCriterion("SEQFEE <>", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeGreaterThan(Long value) {
            addCriterion("SEQFEE >", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQFEE >=", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeLessThan(Long value) {
            addCriterion("SEQFEE <", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeLessThanOrEqualTo(Long value) {
            addCriterion("SEQFEE <=", value, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeIn(List<Long> values) {
            addCriterion("SEQFEE in", values, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeNotIn(List<Long> values) {
            addCriterion("SEQFEE not in", values, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeBetween(Long value1, Long value2) {
            addCriterion("SEQFEE between", value1, value2, "seqfee");
            return (Criteria) this;
        }

        public Criteria andSeqfeeNotBetween(Long value1, Long value2) {
            addCriterion("SEQFEE not between", value1, value2, "seqfee");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
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

        public Criteria andRendernoIsNull() {
            addCriterion("RENDERNO is null");
            return (Criteria) this;
        }

        public Criteria andRendernoIsNotNull() {
            addCriterion("RENDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andRendernoEqualTo(String value) {
            addCriterion("RENDERNO =", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotEqualTo(String value) {
            addCriterion("RENDERNO <>", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoGreaterThan(String value) {
            addCriterion("RENDERNO >", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoGreaterThanOrEqualTo(String value) {
            addCriterion("RENDERNO >=", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLessThan(String value) {
            addCriterion("RENDERNO <", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLessThanOrEqualTo(String value) {
            addCriterion("RENDERNO <=", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoLike(String value) {
            addCriterion("RENDERNO like", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotLike(String value) {
            addCriterion("RENDERNO not like", value, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoIn(List<String> values) {
            addCriterion("RENDERNO in", values, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotIn(List<String> values) {
            addCriterion("RENDERNO not in", values, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoBetween(String value1, String value2) {
            addCriterion("RENDERNO between", value1, value2, "renderno");
            return (Criteria) this;
        }

        public Criteria andRendernoNotBetween(String value1, String value2) {
            addCriterion("RENDERNO not between", value1, value2, "renderno");
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

        public Criteria andDeptcodeIsNull() {
            addCriterion("DEPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DEPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DEPTCODE =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DEPTCODE <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DEPTCODE >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCODE >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DEPTCODE <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTCODE <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DEPTCODE like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DEPTCODE not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DEPTCODE in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DEPTCODE not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DEPTCODE between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTCODE not between", value1, value2, "deptcode");
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

        public Criteria andAgentnameIsNull() {
            addCriterion("AGENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("AGENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("AGENTNAME =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("AGENTNAME <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("AGENTNAME >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAME >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("AGENTNAME <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAME <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("AGENTNAME like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("AGENTNAME not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("AGENTNAME in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("AGENTNAME not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("AGENTNAME between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("AGENTNAME not between", value1, value2, "agentname");
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

        public Criteria andFeetypeIsNull() {
            addCriterion("FEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeetypeIsNotNull() {
            addCriterion("FEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeetypeEqualTo(String value) {
            addCriterion("FEETYPE =", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotEqualTo(String value) {
            addCriterion("FEETYPE <>", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThan(String value) {
            addCriterion("FEETYPE >", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEETYPE >=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThan(String value) {
            addCriterion("FEETYPE <", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThanOrEqualTo(String value) {
            addCriterion("FEETYPE <=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLike(String value) {
            addCriterion("FEETYPE like", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotLike(String value) {
            addCriterion("FEETYPE not like", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeIn(List<String> values) {
            addCriterion("FEETYPE in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotIn(List<String> values) {
            addCriterion("FEETYPE not in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeBetween(String value1, String value2) {
            addCriterion("FEETYPE between", value1, value2, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotBetween(String value1, String value2) {
            addCriterion("FEETYPE not between", value1, value2, "feetype");
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

        public Criteria andBusinesstype1IsNull() {
            addCriterion("BUSINESSTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1IsNotNull() {
            addCriterion("BUSINESSTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1EqualTo(String value) {
            addCriterion("BUSINESSTYPE1 =", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 <>", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1GreaterThan(String value) {
            addCriterion("BUSINESSTYPE1 >", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 >=", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1LessThan(String value) {
            addCriterion("BUSINESSTYPE1 <", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE1 <=", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1Like(String value) {
            addCriterion("BUSINESSTYPE1 like", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotLike(String value) {
            addCriterion("BUSINESSTYPE1 not like", value, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1In(List<String> values) {
            addCriterion("BUSINESSTYPE1 in", values, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE1 not in", values, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE1 between", value1, value2, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype1NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE1 not between", value1, value2, "businesstype1");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2IsNull() {
            addCriterion("BUSINESSTYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2IsNotNull() {
            addCriterion("BUSINESSTYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2EqualTo(String value) {
            addCriterion("BUSINESSTYPE2 =", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 <>", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2GreaterThan(String value) {
            addCriterion("BUSINESSTYPE2 >", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 >=", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2LessThan(String value) {
            addCriterion("BUSINESSTYPE2 <", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2LessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE2 <=", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2Like(String value) {
            addCriterion("BUSINESSTYPE2 like", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotLike(String value) {
            addCriterion("BUSINESSTYPE2 not like", value, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2In(List<String> values) {
            addCriterion("BUSINESSTYPE2 in", values, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotIn(List<String> values) {
            addCriterion("BUSINESSTYPE2 not in", values, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2Between(String value1, String value2) {
            addCriterion("BUSINESSTYPE2 between", value1, value2, "businesstype2");
            return (Criteria) this;
        }

        public Criteria andBusinesstype2NotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE2 not between", value1, value2, "businesstype2");
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

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andGlDateIsNull() {
            addCriterion("GL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGlDateIsNotNull() {
            addCriterion("GL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGlDateEqualTo(Date value) {
            addCriterion("GL_DATE =", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotEqualTo(Date value) {
            addCriterion("GL_DATE <>", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateGreaterThan(Date value) {
            addCriterion("GL_DATE >", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("GL_DATE >=", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateLessThan(Date value) {
            addCriterion("GL_DATE <", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateLessThanOrEqualTo(Date value) {
            addCriterion("GL_DATE <=", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateIn(List<Date> values) {
            addCriterion("GL_DATE in", values, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotIn(List<Date> values) {
            addCriterion("GL_DATE not in", values, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateBetween(Date value1, Date value2) {
            addCriterion("GL_DATE between", value1, value2, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotBetween(Date value1, Date value2) {
            addCriterion("GL_DATE not between", value1, value2, "glDate");
            return (Criteria) this;
        }

        public Criteria andHandlercodeIsNull() {
            addCriterion("HANDLERCODE is null");
            return (Criteria) this;
        }

        public Criteria andHandlercodeIsNotNull() {
            addCriterion("HANDLERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlercodeEqualTo(String value) {
            addCriterion("HANDLERCODE =", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeNotEqualTo(String value) {
            addCriterion("HANDLERCODE <>", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeGreaterThan(String value) {
            addCriterion("HANDLERCODE >", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLERCODE >=", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeLessThan(String value) {
            addCriterion("HANDLERCODE <", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeLessThanOrEqualTo(String value) {
            addCriterion("HANDLERCODE <=", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeLike(String value) {
            addCriterion("HANDLERCODE like", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeNotLike(String value) {
            addCriterion("HANDLERCODE not like", value, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeIn(List<String> values) {
            addCriterion("HANDLERCODE in", values, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeNotIn(List<String> values) {
            addCriterion("HANDLERCODE not in", values, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeBetween(String value1, String value2) {
            addCriterion("HANDLERCODE between", value1, value2, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlercodeNotBetween(String value1, String value2) {
            addCriterion("HANDLERCODE not between", value1, value2, "handlercode");
            return (Criteria) this;
        }

        public Criteria andHandlernameIsNull() {
            addCriterion("HANDLERNAME is null");
            return (Criteria) this;
        }

        public Criteria andHandlernameIsNotNull() {
            addCriterion("HANDLERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHandlernameEqualTo(String value) {
            addCriterion("HANDLERNAME =", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameNotEqualTo(String value) {
            addCriterion("HANDLERNAME <>", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameGreaterThan(String value) {
            addCriterion("HANDLERNAME >", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLERNAME >=", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameLessThan(String value) {
            addCriterion("HANDLERNAME <", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameLessThanOrEqualTo(String value) {
            addCriterion("HANDLERNAME <=", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameLike(String value) {
            addCriterion("HANDLERNAME like", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameNotLike(String value) {
            addCriterion("HANDLERNAME not like", value, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameIn(List<String> values) {
            addCriterion("HANDLERNAME in", values, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameNotIn(List<String> values) {
            addCriterion("HANDLERNAME not in", values, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameBetween(String value1, String value2) {
            addCriterion("HANDLERNAME between", value1, value2, "handlername");
            return (Criteria) this;
        }

        public Criteria andHandlernameNotBetween(String value1, String value2) {
            addCriterion("HANDLERNAME not between", value1, value2, "handlername");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNull() {
            addCriterion("APPLYCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNotNull() {
            addCriterion("APPLYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplycodeEqualTo(String value) {
            addCriterion("APPLYCODE =", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotEqualTo(String value) {
            addCriterion("APPLYCODE <>", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThan(String value) {
            addCriterion("APPLYCODE >", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYCODE >=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThan(String value) {
            addCriterion("APPLYCODE <", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThanOrEqualTo(String value) {
            addCriterion("APPLYCODE <=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLike(String value) {
            addCriterion("APPLYCODE like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotLike(String value) {
            addCriterion("APPLYCODE not like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeIn(List<String> values) {
            addCriterion("APPLYCODE in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotIn(List<String> values) {
            addCriterion("APPLYCODE not in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeBetween(String value1, String value2) {
            addCriterion("APPLYCODE between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotBetween(String value1, String value2) {
            addCriterion("APPLYCODE not between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("APPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("APPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("APPLYDATE =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("APPLYDATE <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("APPLYDATE >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("APPLYDATE <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("APPLYDATE in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("APPLYDATE not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNull() {
            addCriterion("CHECKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("CHECKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("CHECKCODE =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("CHECKCODE <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("CHECKCODE >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKCODE >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("CHECKCODE <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKCODE <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("CHECKCODE like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("CHECKCODE not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("CHECKCODE in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("CHECKCODE not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("CHECKCODE between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("CHECKCODE not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNull() {
            addCriterion("IFCHECK is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNotNull() {
            addCriterion("IFCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckEqualTo(String value) {
            addCriterion("IFCHECK =", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotEqualTo(String value) {
            addCriterion("IFCHECK <>", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThan(String value) {
            addCriterion("IFCHECK >", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECK >=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThan(String value) {
            addCriterion("IFCHECK <", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThanOrEqualTo(String value) {
            addCriterion("IFCHECK <=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLike(String value) {
            addCriterion("IFCHECK like", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotLike(String value) {
            addCriterion("IFCHECK not like", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckIn(List<String> values) {
            addCriterion("IFCHECK in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotIn(List<String> values) {
            addCriterion("IFCHECK not in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckBetween(String value1, String value2) {
            addCriterion("IFCHECK between", value1, value2, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotBetween(String value1, String value2) {
            addCriterion("IFCHECK not between", value1, value2, "ifcheck");
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

        public Criteria andEffectdateIsNull() {
            addCriterion("EFFECTDATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectdateIsNotNull() {
            addCriterion("EFFECTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectdateEqualTo(Date value) {
            addCriterion("EFFECTDATE =", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotEqualTo(Date value) {
            addCriterion("EFFECTDATE <>", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateGreaterThan(Date value) {
            addCriterion("EFFECTDATE >", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTDATE >=", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateLessThan(Date value) {
            addCriterion("EFFECTDATE <", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTDATE <=", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateIn(List<Date> values) {
            addCriterion("EFFECTDATE in", values, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotIn(List<Date> values) {
            addCriterion("EFFECTDATE not in", values, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateBetween(Date value1, Date value2) {
            addCriterion("EFFECTDATE between", value1, value2, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTDATE not between", value1, value2, "effectdate");
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

        public Criteria andInsuredcodeIsNull() {
            addCriterion("INSUREDCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNotNull() {
            addCriterion("INSUREDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeEqualTo(String value) {
            addCriterion("INSUREDCODE =", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotEqualTo(String value) {
            addCriterion("INSUREDCODE <>", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThan(String value) {
            addCriterion("INSUREDCODE >", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE >=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThan(String value) {
            addCriterion("INSUREDCODE <", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThanOrEqualTo(String value) {
            addCriterion("INSUREDCODE <=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLike(String value) {
            addCriterion("INSUREDCODE like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotLike(String value) {
            addCriterion("INSUREDCODE not like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIn(List<String> values) {
            addCriterion("INSUREDCODE in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotIn(List<String> values) {
            addCriterion("INSUREDCODE not in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeBetween(String value1, String value2) {
            addCriterion("INSUREDCODE between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotBetween(String value1, String value2) {
            addCriterion("INSUREDCODE not between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNull() {
            addCriterion("INSUREDNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIsNotNull() {
            addCriterion("INSUREDNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameenEqualTo(String value) {
            addCriterion("INSUREDNAMEEN =", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <>", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThan(String value) {
            addCriterion("INSUREDNAMEEN >", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN >=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThan(String value) {
            addCriterion("INSUREDNAMEEN <", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAMEEN <=", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenLike(String value) {
            addCriterion("INSUREDNAMEEN like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotLike(String value) {
            addCriterion("INSUREDNAMEEN not like", value, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenIn(List<String> values) {
            addCriterion("INSUREDNAMEEN in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotIn(List<String> values) {
            addCriterion("INSUREDNAMEEN not in", values, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsurednameenNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAMEEN not between", value1, value2, "insurednameen");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNull() {
            addCriterion("INSUREDPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIsNotNull() {
            addCriterion("INSUREDPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoEqualTo(String value) {
            addCriterion("INSUREDPARTYNO =", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <>", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThan(String value) {
            addCriterion("INSUREDPARTYNO >", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO >=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThan(String value) {
            addCriterion("INSUREDPARTYNO <", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLessThanOrEqualTo(String value) {
            addCriterion("INSUREDPARTYNO <=", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoLike(String value) {
            addCriterion("INSUREDPARTYNO like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotLike(String value) {
            addCriterion("INSUREDPARTYNO not like", value, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoIn(List<String> values) {
            addCriterion("INSUREDPARTYNO in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotIn(List<String> values) {
            addCriterion("INSUREDPARTYNO not in", values, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andInsuredpartynoNotBetween(String value1, String value2) {
            addCriterion("INSUREDPARTYNO not between", value1, value2, "insuredpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNull() {
            addCriterion("APPLICANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNotNull() {
            addCriterion("APPLICANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeEqualTo(String value) {
            addCriterion("APPLICANTCODE =", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotEqualTo(String value) {
            addCriterion("APPLICANTCODE <>", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThan(String value) {
            addCriterion("APPLICANTCODE >", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE >=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThan(String value) {
            addCriterion("APPLICANTCODE <", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE <=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLike(String value) {
            addCriterion("APPLICANTCODE like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotLike(String value) {
            addCriterion("APPLICANTCODE not like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIn(List<String> values) {
            addCriterion("APPLICANTCODE in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotIn(List<String> values) {
            addCriterion("APPLICANTCODE not in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE not between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNull() {
            addCriterion("APPLICANTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNotNull() {
            addCriterion("APPLICANTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnEqualTo(String value) {
            addCriterion("APPLICANTNAMECN =", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <>", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThan(String value) {
            addCriterion("APPLICANTNAMECN >", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN >=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThan(String value) {
            addCriterion("APPLICANTNAMECN <", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLike(String value) {
            addCriterion("APPLICANTNAMECN like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotLike(String value) {
            addCriterion("APPLICANTNAMECN not like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIn(List<String> values) {
            addCriterion("APPLICANTNAMECN in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotIn(List<String> values) {
            addCriterion("APPLICANTNAMECN not in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN not between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNull() {
            addCriterion("APPLICANTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNotNull() {
            addCriterion("APPLICANTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN =", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <>", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThan(String value) {
            addCriterion("APPLICANTNAMEEN >", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN >=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThan(String value) {
            addCriterion("APPLICANTNAMEEN <", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLike(String value) {
            addCriterion("APPLICANTNAMEEN like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotLike(String value) {
            addCriterion("APPLICANTNAMEEN not like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN not in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN not between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNull() {
            addCriterion("APPLICANTIONPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNotNull() {
            addCriterion("APPLICANTIONPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO =", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <>", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThan(String value) {
            addCriterion("APPLICANTIONPARTYNO >", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO >=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThan(String value) {
            addCriterion("APPLICANTIONPARTYNO <", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLike(String value) {
            addCriterion("APPLICANTIONPARTYNO like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotLike(String value) {
            addCriterion("APPLICANTIONPARTYNO not like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO not in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO not between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNull() {
            addCriterion("APPISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNotNull() {
            addCriterion("APPISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanEqualTo(String value) {
            addCriterion("APPISJAPAN =", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotEqualTo(String value) {
            addCriterion("APPISJAPAN <>", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThan(String value) {
            addCriterion("APPISJAPAN >", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN >=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThan(String value) {
            addCriterion("APPISJAPAN <", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN <=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLike(String value) {
            addCriterion("APPISJAPAN like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotLike(String value) {
            addCriterion("APPISJAPAN not like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIn(List<String> values) {
            addCriterion("APPISJAPAN in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotIn(List<String> values) {
            addCriterion("APPISJAPAN not in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanBetween(String value1, String value2) {
            addCriterion("APPISJAPAN between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotBetween(String value1, String value2) {
            addCriterion("APPISJAPAN not between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("DOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("DOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(String value) {
            addCriterion("DOMESTIC =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(String value) {
            addCriterion("DOMESTIC <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(String value) {
            addCriterion("DOMESTIC >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(String value) {
            addCriterion("DOMESTIC <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLike(String value) {
            addCriterion("DOMESTIC like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotLike(String value) {
            addCriterion("DOMESTIC not like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<String> values) {
            addCriterion("DOMESTIC in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<String> values) {
            addCriterion("DOMESTIC not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(String value1, String value2) {
            addCriterion("DOMESTIC between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC not between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNull() {
            addCriterion("PORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNotNull() {
            addCriterion("PORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPorttypeEqualTo(String value) {
            addCriterion("PORTTYPE =", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotEqualTo(String value) {
            addCriterion("PORTTYPE <>", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThan(String value) {
            addCriterion("PORTTYPE >", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTTYPE >=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThan(String value) {
            addCriterion("PORTTYPE <", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThanOrEqualTo(String value) {
            addCriterion("PORTTYPE <=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLike(String value) {
            addCriterion("PORTTYPE like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotLike(String value) {
            addCriterion("PORTTYPE not like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeIn(List<String> values) {
            addCriterion("PORTTYPE in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotIn(List<String> values) {
            addCriterion("PORTTYPE not in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeBetween(String value1, String value2) {
            addCriterion("PORTTYPE between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotBetween(String value1, String value2) {
            addCriterion("PORTTYPE not between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BILLNO not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNull() {
            addCriterion("OFFSETNO is null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNotNull() {
            addCriterion("OFFSETNO is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoEqualTo(String value) {
            addCriterion("OFFSETNO =", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotEqualTo(String value) {
            addCriterion("OFFSETNO <>", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThan(String value) {
            addCriterion("OFFSETNO >", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETNO >=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThan(String value) {
            addCriterion("OFFSETNO <", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThanOrEqualTo(String value) {
            addCriterion("OFFSETNO <=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLike(String value) {
            addCriterion("OFFSETNO like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotLike(String value) {
            addCriterion("OFFSETNO not like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIn(List<String> values) {
            addCriterion("OFFSETNO in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotIn(List<String> values) {
            addCriterion("OFFSETNO not in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoBetween(String value1, String value2) {
            addCriterion("OFFSETNO between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotBetween(String value1, String value2) {
            addCriterion("OFFSETNO not between", value1, value2, "offsetno");
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

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("CUSTOMERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("CUSTOMERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("CUSTOMERPARTYNO >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("CUSTOMERPARTYNO <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("CUSTOMERPARTYNO like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("CUSTOMERPARTYNO not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO not between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNull() {
            addCriterion("CUSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNotNull() {
            addCriterion("CUSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanEqualTo(String value) {
            addCriterion("CUSTISJAPAN =", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotEqualTo(String value) {
            addCriterion("CUSTISJAPAN <>", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThan(String value) {
            addCriterion("CUSTISJAPAN >", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN >=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThan(String value) {
            addCriterion("CUSTISJAPAN <", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN <=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLike(String value) {
            addCriterion("CUSTISJAPAN like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotLike(String value) {
            addCriterion("CUSTISJAPAN not like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIn(List<String> values) {
            addCriterion("CUSTISJAPAN in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotIn(List<String> values) {
            addCriterion("CUSTISJAPAN not in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN not between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNull() {
            addCriterion("AGENTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNotNull() {
            addCriterion("AGENTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnEqualTo(String value) {
            addCriterion("AGENTNAMECN =", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotEqualTo(String value) {
            addCriterion("AGENTNAMECN <>", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThan(String value) {
            addCriterion("AGENTNAMECN >", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN >=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThan(String value) {
            addCriterion("AGENTNAMECN <", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN <=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLike(String value) {
            addCriterion("AGENTNAMECN like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotLike(String value) {
            addCriterion("AGENTNAMECN not like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIn(List<String> values) {
            addCriterion("AGENTNAMECN in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotIn(List<String> values) {
            addCriterion("AGENTNAMECN not in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN not between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNull() {
            addCriterion("AGENTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNotNull() {
            addCriterion("AGENTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenEqualTo(String value) {
            addCriterion("AGENTNAMEEN =", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotEqualTo(String value) {
            addCriterion("AGENTNAMEEN <>", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThan(String value) {
            addCriterion("AGENTNAMEEN >", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN >=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThan(String value) {
            addCriterion("AGENTNAMEEN <", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN <=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLike(String value) {
            addCriterion("AGENTNAMEEN like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotLike(String value) {
            addCriterion("AGENTNAMEEN not like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIn(List<String> values) {
            addCriterion("AGENTNAMEEN in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotIn(List<String> values) {
            addCriterion("AGENTNAMEEN not in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN not between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNull() {
            addCriterion("AGENTPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNotNull() {
            addCriterion("AGENTPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoEqualTo(String value) {
            addCriterion("AGENTPARTYNO =", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotEqualTo(String value) {
            addCriterion("AGENTPARTYNO <>", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThan(String value) {
            addCriterion("AGENTPARTYNO >", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO >=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThan(String value) {
            addCriterion("AGENTPARTYNO <", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO <=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLike(String value) {
            addCriterion("AGENTPARTYNO like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotLike(String value) {
            addCriterion("AGENTPARTYNO not like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIn(List<String> values) {
            addCriterion("AGENTPARTYNO in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotIn(List<String> values) {
            addCriterion("AGENTPARTYNO not in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO not between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNull() {
            addCriterion("CUSTACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNotNull() {
            addCriterion("CUSTACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME =", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <>", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAME >", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME >=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThan(String value) {
            addCriterion("CUSTACCOUNTNAME <", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLike(String value) {
            addCriterion("CUSTACCOUNTNAME like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotLike(String value) {
            addCriterion("CUSTACCOUNTNAME not like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME not in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME not between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNull() {
            addCriterion("CUSTACCOUNTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNotNull() {
            addCriterion("CUSTACCOUNTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN =", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <>", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN not like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN not in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN not between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNull() {
            addCriterion("CUSTBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIsNotNull() {
            addCriterion("CUSTBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknoEqualTo(String value) {
            addCriterion("CUSTBANKNO =", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotEqualTo(String value) {
            addCriterion("CUSTBANKNO <>", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThan(String value) {
            addCriterion("CUSTBANKNO >", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO >=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThan(String value) {
            addCriterion("CUSTBANKNO <", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNO <=", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoLike(String value) {
            addCriterion("CUSTBANKNO like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotLike(String value) {
            addCriterion("CUSTBANKNO not like", value, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoIn(List<String> values) {
            addCriterion("CUSTBANKNO in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotIn(List<String> values) {
            addCriterion("CUSTBANKNO not in", values, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO between", value1, value2, "custbankno");
            return (Criteria) this;
        }

        public Criteria andCustbanknoNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKNO not between", value1, value2, "custbankno");
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

        public Criteria andCustaccountnoIsNull() {
            addCriterion("CUSTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNotNull() {
            addCriterion("CUSTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO =", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <>", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNO >", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO >=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThan(String value) {
            addCriterion("CUSTACCOUNTNO <", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLike(String value) {
            addCriterion("CUSTACCOUNTNO like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotLike(String value) {
            addCriterion("CUSTACCOUNTNO not like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO not in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO not between", value1, value2, "custaccountno");
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

        public Criteria andInsurancetermIsNull() {
            addCriterion("INSURANCETERM is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNotNull() {
            addCriterion("INSURANCETERM is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermEqualTo(String value) {
            addCriterion("INSURANCETERM =", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotEqualTo(String value) {
            addCriterion("INSURANCETERM <>", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThan(String value) {
            addCriterion("INSURANCETERM >", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM >=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThan(String value) {
            addCriterion("INSURANCETERM <", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM <=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLike(String value) {
            addCriterion("INSURANCETERM like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotLike(String value) {
            addCriterion("INSURANCETERM not like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIn(List<String> values) {
            addCriterion("INSURANCETERM in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotIn(List<String> values) {
            addCriterion("INSURANCETERM not in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermBetween(String value1, String value2) {
            addCriterion("INSURANCETERM between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotBetween(String value1, String value2) {
            addCriterion("INSURANCETERM not between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNull() {
            addCriterion("USEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("USEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("USEDAMOUNT >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("USEDAMOUNT <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT not between", value1, value2, "usedamount");
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

        public Criteria andIssplittedIsNull() {
            addCriterion("ISSPLITTED is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("ISSPLITTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("ISSPLITTED like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("ISSPLITTED not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNull() {
            addCriterion("TAXORGTALLY is null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIsNotNull() {
            addCriterion("TAXORGTALLY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyEqualTo(String value) {
            addCriterion("TAXORGTALLY =", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotEqualTo(String value) {
            addCriterion("TAXORGTALLY <>", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThan(String value) {
            addCriterion("TAXORGTALLY >", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyGreaterThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY >=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThan(String value) {
            addCriterion("TAXORGTALLY <", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLessThanOrEqualTo(String value) {
            addCriterion("TAXORGTALLY <=", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyLike(String value) {
            addCriterion("TAXORGTALLY like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotLike(String value) {
            addCriterion("TAXORGTALLY not like", value, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyIn(List<String> values) {
            addCriterion("TAXORGTALLY in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotIn(List<String> values) {
            addCriterion("TAXORGTALLY not in", values, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxorgtallyNotBetween(String value1, String value2) {
            addCriterion("TAXORGTALLY not between", value1, value2, "taxorgtally");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNull() {
            addCriterion("TAXESAMOUNTOUT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNotNull() {
            addCriterion("TAXESAMOUNTOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT =", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <>", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT not in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT not between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNull() {
            addCriterion("TAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNotNull() {
            addCriterion("TAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT =", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <>", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT >", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT >=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT <", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT not in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT not between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNull() {
            addCriterion("BUSINESSSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNotNull() {
            addCriterion("BUSINESSSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceEqualTo(String value) {
            addCriterion("BUSINESSSOURCE =", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <>", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThan(String value) {
            addCriterion("BUSINESSSOURCE >", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE >=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThan(String value) {
            addCriterion("BUSINESSSOURCE <", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLike(String value) {
            addCriterion("BUSINESSSOURCE like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotLike(String value) {
            addCriterion("BUSINESSSOURCE not like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIn(List<String> values) {
            addCriterion("BUSINESSSOURCE in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotIn(List<String> values) {
            addCriterion("BUSINESSSOURCE not in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE not between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNull() {
            addCriterion("TAXPAYERCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNotNull() {
            addCriterion("TAXPAYERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeEqualTo(String value) {
            addCriterion("TAXPAYERCODE =", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotEqualTo(String value) {
            addCriterion("TAXPAYERCODE <>", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThan(String value) {
            addCriterion("TAXPAYERCODE >", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE >=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThan(String value) {
            addCriterion("TAXPAYERCODE <", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE <=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLike(String value) {
            addCriterion("TAXPAYERCODE like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotLike(String value) {
            addCriterion("TAXPAYERCODE not like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIn(List<String> values) {
            addCriterion("TAXPAYERCODE in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotIn(List<String> values) {
            addCriterion("TAXPAYERCODE not in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE not between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNull() {
            addCriterion("TAXPAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNotNull() {
            addCriterion("TAXPAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameEqualTo(String value) {
            addCriterion("TAXPAYERNAME =", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotEqualTo(String value) {
            addCriterion("TAXPAYERNAME <>", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThan(String value) {
            addCriterion("TAXPAYERNAME >", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME >=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThan(String value) {
            addCriterion("TAXPAYERNAME <", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME <=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLike(String value) {
            addCriterion("TAXPAYERNAME like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotLike(String value) {
            addCriterion("TAXPAYERNAME not like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIn(List<String> values) {
            addCriterion("TAXPAYERNAME in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotIn(List<String> values) {
            addCriterion("TAXPAYERNAME not in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME not between", value1, value2, "taxpayername");
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

        public Criteria andTaxesaddressIsNull() {
            addCriterion("TAXESADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNotNull() {
            addCriterion("TAXESADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressEqualTo(String value) {
            addCriterion("TAXESADDRESS =", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotEqualTo(String value) {
            addCriterion("TAXESADDRESS <>", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThan(String value) {
            addCriterion("TAXESADDRESS >", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS >=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThan(String value) {
            addCriterion("TAXESADDRESS <", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS <=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLike(String value) {
            addCriterion("TAXESADDRESS like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotLike(String value) {
            addCriterion("TAXESADDRESS not like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIn(List<String> values) {
            addCriterion("TAXESADDRESS in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotIn(List<String> values) {
            addCriterion("TAXESADDRESS not in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS not between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNull() {
            addCriterion("TAXESPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNotNull() {
            addCriterion("TAXESPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneEqualTo(String value) {
            addCriterion("TAXESPHONE =", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotEqualTo(String value) {
            addCriterion("TAXESPHONE <>", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThan(String value) {
            addCriterion("TAXESPHONE >", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE >=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThan(String value) {
            addCriterion("TAXESPHONE <", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE <=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLike(String value) {
            addCriterion("TAXESPHONE like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotLike(String value) {
            addCriterion("TAXESPHONE not like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIn(List<String> values) {
            addCriterion("TAXESPHONE in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotIn(List<String> values) {
            addCriterion("TAXESPHONE not in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneBetween(String value1, String value2) {
            addCriterion("TAXESPHONE between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotBetween(String value1, String value2) {
            addCriterion("TAXESPHONE not between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNull() {
            addCriterion("TAXESMOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNotNull() {
            addCriterion("TAXESMOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE =", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <>", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThan(String value) {
            addCriterion("TAXESMOBILEPHONE >", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE >=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThan(String value) {
            addCriterion("TAXESMOBILEPHONE <", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLike(String value) {
            addCriterion("TAXESMOBILEPHONE like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotLike(String value) {
            addCriterion("TAXESMOBILEPHONE not like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE not in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE not between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNull() {
            addCriterion("TAXESEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNotNull() {
            addCriterion("TAXESEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailEqualTo(String value) {
            addCriterion("TAXESEMAIL =", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotEqualTo(String value) {
            addCriterion("TAXESEMAIL <>", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThan(String value) {
            addCriterion("TAXESEMAIL >", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL >=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThan(String value) {
            addCriterion("TAXESEMAIL <", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL <=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLike(String value) {
            addCriterion("TAXESEMAIL like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotLike(String value) {
            addCriterion("TAXESEMAIL not like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIn(List<String> values) {
            addCriterion("TAXESEMAIL in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotIn(List<String> values) {
            addCriterion("TAXESEMAIL not in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL not between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNull() {
            addCriterion("TAXESBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNotNull() {
            addCriterion("TAXESBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameEqualTo(String value) {
            addCriterion("TAXESBANKNAME =", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotEqualTo(String value) {
            addCriterion("TAXESBANKNAME <>", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThan(String value) {
            addCriterion("TAXESBANKNAME >", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME >=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThan(String value) {
            addCriterion("TAXESBANKNAME <", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME <=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLike(String value) {
            addCriterion("TAXESBANKNAME like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotLike(String value) {
            addCriterion("TAXESBANKNAME not like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIn(List<String> values) {
            addCriterion("TAXESBANKNAME in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotIn(List<String> values) {
            addCriterion("TAXESBANKNAME not in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME not between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNull() {
            addCriterion("TAXESACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNotNull() {
            addCriterion("TAXESACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO =", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <>", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThan(String value) {
            addCriterion("TAXESACCOUNTNO >", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO >=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThan(String value) {
            addCriterion("TAXESACCOUNTNO <", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLike(String value) {
            addCriterion("TAXESACCOUNTNO like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotLike(String value) {
            addCriterion("TAXESACCOUNTNO not like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO not in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO not between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNull() {
            addCriterion("TAXESPAYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNotNull() {
            addCriterion("TAXESPAYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE =", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <>", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThan(String value) {
            addCriterion("TAXESPAYERTYPE >", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE >=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThan(String value) {
            addCriterion("TAXESPAYERTYPE <", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLike(String value) {
            addCriterion("TAXESPAYERTYPE like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotLike(String value) {
            addCriterion("TAXESPAYERTYPE not like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE not in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE not between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNull() {
            addCriterion("TAXESCERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNotNull() {
            addCriterion("TAXESCERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE =", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <>", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE >", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE >=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE <", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE not like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE not in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE not between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNull() {
            addCriterion("TAXESCERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNotNull() {
            addCriterion("TAXESCERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO =", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <>", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATENO >", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO >=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThan(String value) {
            addCriterion("TAXESCERTIFICATENO <", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLike(String value) {
            addCriterion("TAXESCERTIFICATENO like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotLike(String value) {
            addCriterion("TAXESCERTIFICATENO not like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO not in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO not between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("INVOICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("INVOICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("INVOICETYPE =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("INVOICETYPE <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("INVOICETYPE >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("INVOICETYPE <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("INVOICETYPE like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("INVOICETYPE not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("INVOICETYPE in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("INVOICETYPE not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("INVOICETYPE between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("INVOICETYPE not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNull() {
            addCriterion("INVOICEREMARK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNotNull() {
            addCriterion("INVOICEREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkEqualTo(String value) {
            addCriterion("INVOICEREMARK =", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotEqualTo(String value) {
            addCriterion("INVOICEREMARK <>", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThan(String value) {
            addCriterion("INVOICEREMARK >", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK >=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThan(String value) {
            addCriterion("INVOICEREMARK <", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK <=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLike(String value) {
            addCriterion("INVOICEREMARK like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotLike(String value) {
            addCriterion("INVOICEREMARK not like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIn(List<String> values) {
            addCriterion("INVOICEREMARK in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotIn(List<String> values) {
            addCriterion("INVOICEREMARK not in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK not between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNull() {
            addCriterion("AGENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNotNull() {
            addCriterion("AGENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeEqualTo(String value) {
            addCriterion("AGENTTYPE =", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotEqualTo(String value) {
            addCriterion("AGENTTYPE <>", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThan(String value) {
            addCriterion("AGENTTYPE >", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE >=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThan(String value) {
            addCriterion("AGENTTYPE <", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThanOrEqualTo(String value) {
            addCriterion("AGENTTYPE <=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLike(String value) {
            addCriterion("AGENTTYPE like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotLike(String value) {
            addCriterion("AGENTTYPE not like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIn(List<String> values) {
            addCriterion("AGENTTYPE in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotIn(List<String> values) {
            addCriterion("AGENTTYPE not in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeBetween(String value1, String value2) {
            addCriterion("AGENTTYPE between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotBetween(String value1, String value2) {
            addCriterion("AGENTTYPE not between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("USEPORPERTY like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("USEPORPERTY not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
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

        public Criteria andCharacteristicsIsNull() {
            addCriterion("CHARACTERISTICS is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNotNull() {
            addCriterion("CHARACTERISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsEqualTo(String value) {
            addCriterion("CHARACTERISTICS =", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotEqualTo(String value) {
            addCriterion("CHARACTERISTICS <>", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThan(String value) {
            addCriterion("CHARACTERISTICS >", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS >=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThan(String value) {
            addCriterion("CHARACTERISTICS <", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("CHARACTERISTICS <=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLike(String value) {
            addCriterion("CHARACTERISTICS like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotLike(String value) {
            addCriterion("CHARACTERISTICS not like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIn(List<String> values) {
            addCriterion("CHARACTERISTICS in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotIn(List<String> values) {
            addCriterion("CHARACTERISTICS not in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("CHARACTERISTICS not between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNull() {
            addCriterion("CARUSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNotNull() {
            addCriterion("CARUSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeEqualTo(String value) {
            addCriterion("CARUSETYPE =", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotEqualTo(String value) {
            addCriterion("CARUSETYPE <>", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThan(String value) {
            addCriterion("CARUSETYPE >", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE >=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThan(String value) {
            addCriterion("CARUSETYPE <", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThanOrEqualTo(String value) {
            addCriterion("CARUSETYPE <=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLike(String value) {
            addCriterion("CARUSETYPE like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotLike(String value) {
            addCriterion("CARUSETYPE not like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIn(List<String> values) {
            addCriterion("CARUSETYPE in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotIn(List<String> values) {
            addCriterion("CARUSETYPE not in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeBetween(String value1, String value2) {
            addCriterion("CARUSETYPE between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotBetween(String value1, String value2) {
            addCriterion("CARUSETYPE not between", value1, value2, "carusetype");
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

        public Criteria andSerialnoEqualTo(BigDecimal value) {
            addCriterion("SERIALNO =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(BigDecimal value) {
            addCriterion("SERIALNO <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(BigDecimal value) {
            addCriterion("SERIALNO >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIALNO >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(BigDecimal value) {
            addCriterion("SERIALNO <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIALNO <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<BigDecimal> values) {
            addCriterion("SERIALNO in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<BigDecimal> values) {
            addCriterion("SERIALNO not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIALNO between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIALNO not between", value1, value2, "serialno");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_applyfee_td
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
     * @Table : mm_applyfee_td
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