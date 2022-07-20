package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxpayerTcExample {
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
    public MmTaxpayerTcExample() {
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
     * @Table : mm_taxpayer_tc
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

        public Criteria andTaxpayeridIsNull() {
            addCriterion("TAXPAYERID is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNotNull() {
            addCriterion("TAXPAYERID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridEqualTo(Long value) {
            addCriterion("TAXPAYERID =", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotEqualTo(Long value) {
            addCriterion("TAXPAYERID <>", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThan(Long value) {
            addCriterion("TAXPAYERID >", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThanOrEqualTo(Long value) {
            addCriterion("TAXPAYERID >=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThan(Long value) {
            addCriterion("TAXPAYERID <", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThanOrEqualTo(Long value) {
            addCriterion("TAXPAYERID <=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIn(List<Long> values) {
            addCriterion("TAXPAYERID in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotIn(List<Long> values) {
            addCriterion("TAXPAYERID not in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridBetween(Long value1, Long value2) {
            addCriterion("TAXPAYERID between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotBetween(Long value1, Long value2) {
            addCriterion("TAXPAYERID not between", value1, value2, "taxpayerid");
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

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andFathercodeIsNull() {
            addCriterion("FATHERCODE is null");
            return (Criteria) this;
        }

        public Criteria andFathercodeIsNotNull() {
            addCriterion("FATHERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFathercodeEqualTo(String value) {
            addCriterion("FATHERCODE =", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotEqualTo(String value) {
            addCriterion("FATHERCODE <>", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeGreaterThan(String value) {
            addCriterion("FATHERCODE >", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERCODE >=", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLessThan(String value) {
            addCriterion("FATHERCODE <", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLessThanOrEqualTo(String value) {
            addCriterion("FATHERCODE <=", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeLike(String value) {
            addCriterion("FATHERCODE like", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotLike(String value) {
            addCriterion("FATHERCODE not like", value, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeIn(List<String> values) {
            addCriterion("FATHERCODE in", values, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotIn(List<String> values) {
            addCriterion("FATHERCODE not in", values, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeBetween(String value1, String value2) {
            addCriterion("FATHERCODE between", value1, value2, "fathercode");
            return (Criteria) this;
        }

        public Criteria andFathercodeNotBetween(String value1, String value2) {
            addCriterion("FATHERCODE not between", value1, value2, "fathercode");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNull() {
            addCriterion("ORGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNotNull() {
            addCriterion("ORGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrglevelEqualTo(String value) {
            addCriterion("ORGLEVEL =", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotEqualTo(String value) {
            addCriterion("ORGLEVEL <>", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThan(String value) {
            addCriterion("ORGLEVEL >", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORGLEVEL >=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThan(String value) {
            addCriterion("ORGLEVEL <", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThanOrEqualTo(String value) {
            addCriterion("ORGLEVEL <=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLike(String value) {
            addCriterion("ORGLEVEL like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotLike(String value) {
            addCriterion("ORGLEVEL not like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelIn(List<String> values) {
            addCriterion("ORGLEVEL in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotIn(List<String> values) {
            addCriterion("ORGLEVEL not in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelBetween(String value1, String value2) {
            addCriterion("ORGLEVEL between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotBetween(String value1, String value2) {
            addCriterion("ORGLEVEL not between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andComputercodeIsNull() {
            addCriterion("COMPUTERCODE is null");
            return (Criteria) this;
        }

        public Criteria andComputercodeIsNotNull() {
            addCriterion("COMPUTERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andComputercodeEqualTo(String value) {
            addCriterion("COMPUTERCODE =", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeNotEqualTo(String value) {
            addCriterion("COMPUTERCODE <>", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeGreaterThan(String value) {
            addCriterion("COMPUTERCODE >", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTERCODE >=", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeLessThan(String value) {
            addCriterion("COMPUTERCODE <", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeLessThanOrEqualTo(String value) {
            addCriterion("COMPUTERCODE <=", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeLike(String value) {
            addCriterion("COMPUTERCODE like", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeNotLike(String value) {
            addCriterion("COMPUTERCODE not like", value, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeIn(List<String> values) {
            addCriterion("COMPUTERCODE in", values, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeNotIn(List<String> values) {
            addCriterion("COMPUTERCODE not in", values, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeBetween(String value1, String value2) {
            addCriterion("COMPUTERCODE between", value1, value2, "computercode");
            return (Criteria) this;
        }

        public Criteria andComputercodeNotBetween(String value1, String value2) {
            addCriterion("COMPUTERCODE not between", value1, value2, "computercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeIsNull() {
            addCriterion("TAXAUTHORITIESCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeIsNotNull() {
            addCriterion("TAXAUTHORITIESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeEqualTo(String value) {
            addCriterion("TAXAUTHORITIESCODE =", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeNotEqualTo(String value) {
            addCriterion("TAXAUTHORITIESCODE <>", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeGreaterThan(String value) {
            addCriterion("TAXAUTHORITIESCODE >", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXAUTHORITIESCODE >=", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeLessThan(String value) {
            addCriterion("TAXAUTHORITIESCODE <", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeLessThanOrEqualTo(String value) {
            addCriterion("TAXAUTHORITIESCODE <=", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeLike(String value) {
            addCriterion("TAXAUTHORITIESCODE like", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeNotLike(String value) {
            addCriterion("TAXAUTHORITIESCODE not like", value, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeIn(List<String> values) {
            addCriterion("TAXAUTHORITIESCODE in", values, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeNotIn(List<String> values) {
            addCriterion("TAXAUTHORITIESCODE not in", values, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeBetween(String value1, String value2) {
            addCriterion("TAXAUTHORITIESCODE between", value1, value2, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiescodeNotBetween(String value1, String value2) {
            addCriterion("TAXAUTHORITIESCODE not between", value1, value2, "taxauthoritiescode");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameIsNull() {
            addCriterion("TAXAUTHORITIESNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameIsNotNull() {
            addCriterion("TAXAUTHORITIESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameEqualTo(String value) {
            addCriterion("TAXAUTHORITIESNAME =", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameNotEqualTo(String value) {
            addCriterion("TAXAUTHORITIESNAME <>", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameGreaterThan(String value) {
            addCriterion("TAXAUTHORITIESNAME >", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXAUTHORITIESNAME >=", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameLessThan(String value) {
            addCriterion("TAXAUTHORITIESNAME <", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameLessThanOrEqualTo(String value) {
            addCriterion("TAXAUTHORITIESNAME <=", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameLike(String value) {
            addCriterion("TAXAUTHORITIESNAME like", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameNotLike(String value) {
            addCriterion("TAXAUTHORITIESNAME not like", value, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameIn(List<String> values) {
            addCriterion("TAXAUTHORITIESNAME in", values, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameNotIn(List<String> values) {
            addCriterion("TAXAUTHORITIESNAME not in", values, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameBetween(String value1, String value2) {
            addCriterion("TAXAUTHORITIESNAME between", value1, value2, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andTaxauthoritiesnameNotBetween(String value1, String value2) {
            addCriterion("TAXAUTHORITIESNAME not between", value1, value2, "taxauthoritiesname");
            return (Criteria) this;
        }

        public Criteria andLevyflagIsNull() {
            addCriterion("LEVYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andLevyflagIsNotNull() {
            addCriterion("LEVYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLevyflagEqualTo(String value) {
            addCriterion("LEVYFLAG =", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagNotEqualTo(String value) {
            addCriterion("LEVYFLAG <>", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagGreaterThan(String value) {
            addCriterion("LEVYFLAG >", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagGreaterThanOrEqualTo(String value) {
            addCriterion("LEVYFLAG >=", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagLessThan(String value) {
            addCriterion("LEVYFLAG <", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagLessThanOrEqualTo(String value) {
            addCriterion("LEVYFLAG <=", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagLike(String value) {
            addCriterion("LEVYFLAG like", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagNotLike(String value) {
            addCriterion("LEVYFLAG not like", value, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagIn(List<String> values) {
            addCriterion("LEVYFLAG in", values, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagNotIn(List<String> values) {
            addCriterion("LEVYFLAG not in", values, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagBetween(String value1, String value2) {
            addCriterion("LEVYFLAG between", value1, value2, "levyflag");
            return (Criteria) this;
        }

        public Criteria andLevyflagNotBetween(String value1, String value2) {
            addCriterion("LEVYFLAG not between", value1, value2, "levyflag");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
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

        public Criteria andRegistertypeIsNull() {
            addCriterion("REGISTERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIsNotNull() {
            addCriterion("REGISTERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeEqualTo(String value) {
            addCriterion("REGISTERTYPE =", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotEqualTo(String value) {
            addCriterion("REGISTERTYPE <>", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThan(String value) {
            addCriterion("REGISTERTYPE >", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE >=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThan(String value) {
            addCriterion("REGISTERTYPE <", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE <=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLike(String value) {
            addCriterion("REGISTERTYPE like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotLike(String value) {
            addCriterion("REGISTERTYPE not like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIn(List<String> values) {
            addCriterion("REGISTERTYPE in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotIn(List<String> values) {
            addCriterion("REGISTERTYPE not in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE not between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusIsNull() {
            addCriterion("REGISTERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusIsNotNull() {
            addCriterion("REGISTERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusEqualTo(String value) {
            addCriterion("REGISTERSTATUS =", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotEqualTo(String value) {
            addCriterion("REGISTERSTATUS <>", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusGreaterThan(String value) {
            addCriterion("REGISTERSTATUS >", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERSTATUS >=", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLessThan(String value) {
            addCriterion("REGISTERSTATUS <", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLessThanOrEqualTo(String value) {
            addCriterion("REGISTERSTATUS <=", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLike(String value) {
            addCriterion("REGISTERSTATUS like", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotLike(String value) {
            addCriterion("REGISTERSTATUS not like", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusIn(List<String> values) {
            addCriterion("REGISTERSTATUS in", values, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotIn(List<String> values) {
            addCriterion("REGISTERSTATUS not in", values, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusBetween(String value1, String value2) {
            addCriterion("REGISTERSTATUS between", value1, value2, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotBetween(String value1, String value2) {
            addCriterion("REGISTERSTATUS not between", value1, value2, "registerstatus");
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

        public Criteria andAddrnameIsNull() {
            addCriterion("ADDRNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddrnameIsNotNull() {
            addCriterion("ADDRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddrnameEqualTo(String value) {
            addCriterion("ADDRNAME =", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotEqualTo(String value) {
            addCriterion("ADDRNAME <>", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameGreaterThan(String value) {
            addCriterion("ADDRNAME >", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRNAME >=", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLessThan(String value) {
            addCriterion("ADDRNAME <", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLessThanOrEqualTo(String value) {
            addCriterion("ADDRNAME <=", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLike(String value) {
            addCriterion("ADDRNAME like", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotLike(String value) {
            addCriterion("ADDRNAME not like", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameIn(List<String> values) {
            addCriterion("ADDRNAME in", values, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotIn(List<String> values) {
            addCriterion("ADDRNAME not in", values, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameBetween(String value1, String value2) {
            addCriterion("ADDRNAME between", value1, value2, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotBetween(String value1, String value2) {
            addCriterion("ADDRNAME not between", value1, value2, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrcodeIsNull() {
            addCriterion("ADDRCODE is null");
            return (Criteria) this;
        }

        public Criteria andAddrcodeIsNotNull() {
            addCriterion("ADDRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrcodeEqualTo(String value) {
            addCriterion("ADDRCODE =", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotEqualTo(String value) {
            addCriterion("ADDRCODE <>", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeGreaterThan(String value) {
            addCriterion("ADDRCODE >", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRCODE >=", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLessThan(String value) {
            addCriterion("ADDRCODE <", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLessThanOrEqualTo(String value) {
            addCriterion("ADDRCODE <=", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLike(String value) {
            addCriterion("ADDRCODE like", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotLike(String value) {
            addCriterion("ADDRCODE not like", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeIn(List<String> values) {
            addCriterion("ADDRCODE in", values, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotIn(List<String> values) {
            addCriterion("ADDRCODE not in", values, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeBetween(String value1, String value2) {
            addCriterion("ADDRCODE between", value1, value2, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotBetween(String value1, String value2) {
            addCriterion("ADDRCODE not between", value1, value2, "addrcode");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxpayer_tc
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
     * @Table : mm_taxpayer_tc
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