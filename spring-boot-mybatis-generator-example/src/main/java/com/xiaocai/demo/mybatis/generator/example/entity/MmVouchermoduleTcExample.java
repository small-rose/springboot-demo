package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmVouchermoduleTcExample {
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
    public MmVouchermoduleTcExample() {
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
     * @Table : mm_vouchermodule_tc
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

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNull() {
            addCriterion("MODULENO is null");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNotNull() {
            addCriterion("MODULENO is not null");
            return (Criteria) this;
        }

        public Criteria andModulenoEqualTo(String value) {
            addCriterion("MODULENO =", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotEqualTo(String value) {
            addCriterion("MODULENO <>", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThan(String value) {
            addCriterion("MODULENO >", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThanOrEqualTo(String value) {
            addCriterion("MODULENO >=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThan(String value) {
            addCriterion("MODULENO <", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThanOrEqualTo(String value) {
            addCriterion("MODULENO <=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLike(String value) {
            addCriterion("MODULENO like", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotLike(String value) {
            addCriterion("MODULENO not like", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoIn(List<String> values) {
            addCriterion("MODULENO in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotIn(List<String> values) {
            addCriterion("MODULENO not in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoBetween(String value1, String value2) {
            addCriterion("MODULENO between", value1, value2, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotBetween(String value1, String value2) {
            addCriterion("MODULENO not between", value1, value2, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModuletypeIsNull() {
            addCriterion("MODULETYPE is null");
            return (Criteria) this;
        }

        public Criteria andModuletypeIsNotNull() {
            addCriterion("MODULETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModuletypeEqualTo(String value) {
            addCriterion("MODULETYPE =", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeNotEqualTo(String value) {
            addCriterion("MODULETYPE <>", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeGreaterThan(String value) {
            addCriterion("MODULETYPE >", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODULETYPE >=", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeLessThan(String value) {
            addCriterion("MODULETYPE <", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeLessThanOrEqualTo(String value) {
            addCriterion("MODULETYPE <=", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeLike(String value) {
            addCriterion("MODULETYPE like", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeNotLike(String value) {
            addCriterion("MODULETYPE not like", value, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeIn(List<String> values) {
            addCriterion("MODULETYPE in", values, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeNotIn(List<String> values) {
            addCriterion("MODULETYPE not in", values, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeBetween(String value1, String value2) {
            addCriterion("MODULETYPE between", value1, value2, "moduletype");
            return (Criteria) this;
        }

        public Criteria andModuletypeNotBetween(String value1, String value2) {
            addCriterion("MODULETYPE not between", value1, value2, "moduletype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIsNull() {
            addCriterion("BALANCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIsNotNull() {
            addCriterion("BALANCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBalancetypeEqualTo(BigDecimal value) {
            addCriterion("BALANCETYPE =", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotEqualTo(BigDecimal value) {
            addCriterion("BALANCETYPE <>", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeGreaterThan(BigDecimal value) {
            addCriterion("BALANCETYPE >", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCETYPE >=", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeLessThan(BigDecimal value) {
            addCriterion("BALANCETYPE <", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCETYPE <=", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIn(List<BigDecimal> values) {
            addCriterion("BALANCETYPE in", values, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotIn(List<BigDecimal> values) {
            addCriterion("BALANCETYPE not in", values, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCETYPE between", value1, value2, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCETYPE not between", value1, value2, "balancetype");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIsNull() {
            addCriterion("ERPACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIsNotNull() {
            addCriterion("ERPACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE =", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <>", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThan(String value) {
            addCriterion("ERPACCOUNTCODE >", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE >=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThan(String value) {
            addCriterion("ERPACCOUNTCODE <", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("ERPACCOUNTCODE <=", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeLike(String value) {
            addCriterion("ERPACCOUNTCODE like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotLike(String value) {
            addCriterion("ERPACCOUNTCODE not like", value, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotIn(List<String> values) {
            addCriterion("ERPACCOUNTCODE not in", values, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andErpaccountcodeNotBetween(String value1, String value2) {
            addCriterion("ERPACCOUNTCODE not between", value1, value2, "erpaccountcode");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(BigDecimal value) {
            addCriterion("SIGN =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(BigDecimal value) {
            addCriterion("SIGN <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(BigDecimal value) {
            addCriterion("SIGN >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(BigDecimal value) {
            addCriterion("SIGN <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<BigDecimal> values) {
            addCriterion("SIGN in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<BigDecimal> values) {
            addCriterion("SIGN not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN not between", value1, value2, "sign");
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

        public Criteria andTransinnerIsNull() {
            addCriterion("TRANSINNER is null");
            return (Criteria) this;
        }

        public Criteria andTransinnerIsNotNull() {
            addCriterion("TRANSINNER is not null");
            return (Criteria) this;
        }

        public Criteria andTransinnerEqualTo(String value) {
            addCriterion("TRANSINNER =", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerNotEqualTo(String value) {
            addCriterion("TRANSINNER <>", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerGreaterThan(String value) {
            addCriterion("TRANSINNER >", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSINNER >=", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerLessThan(String value) {
            addCriterion("TRANSINNER <", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerLessThanOrEqualTo(String value) {
            addCriterion("TRANSINNER <=", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerLike(String value) {
            addCriterion("TRANSINNER like", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerNotLike(String value) {
            addCriterion("TRANSINNER not like", value, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerIn(List<String> values) {
            addCriterion("TRANSINNER in", values, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerNotIn(List<String> values) {
            addCriterion("TRANSINNER not in", values, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerBetween(String value1, String value2) {
            addCriterion("TRANSINNER between", value1, value2, "transinner");
            return (Criteria) this;
        }

        public Criteria andTransinnerNotBetween(String value1, String value2) {
            addCriterion("TRANSINNER not between", value1, value2, "transinner");
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

        public Criteria andModulestatusIsNull() {
            addCriterion("MODULESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andModulestatusIsNotNull() {
            addCriterion("MODULESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andModulestatusEqualTo(BigDecimal value) {
            addCriterion("MODULESTATUS =", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusNotEqualTo(BigDecimal value) {
            addCriterion("MODULESTATUS <>", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusGreaterThan(BigDecimal value) {
            addCriterion("MODULESTATUS >", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULESTATUS >=", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusLessThan(BigDecimal value) {
            addCriterion("MODULESTATUS <", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULESTATUS <=", value, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusIn(List<BigDecimal> values) {
            addCriterion("MODULESTATUS in", values, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusNotIn(List<BigDecimal> values) {
            addCriterion("MODULESTATUS not in", values, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULESTATUS between", value1, value2, "modulestatus");
            return (Criteria) this;
        }

        public Criteria andModulestatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULESTATUS not between", value1, value2, "modulestatus");
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

        public Criteria andBusinessnotypeIsNull() {
            addCriterion("BUSINESSNOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeIsNotNull() {
            addCriterion("BUSINESSNOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeEqualTo(String value) {
            addCriterion("BUSINESSNOTYPE =", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeNotEqualTo(String value) {
            addCriterion("BUSINESSNOTYPE <>", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeGreaterThan(String value) {
            addCriterion("BUSINESSNOTYPE >", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNOTYPE >=", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeLessThan(String value) {
            addCriterion("BUSINESSNOTYPE <", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNOTYPE <=", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeLike(String value) {
            addCriterion("BUSINESSNOTYPE like", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeNotLike(String value) {
            addCriterion("BUSINESSNOTYPE not like", value, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeIn(List<String> values) {
            addCriterion("BUSINESSNOTYPE in", values, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeNotIn(List<String> values) {
            addCriterion("BUSINESSNOTYPE not in", values, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeBetween(String value1, String value2) {
            addCriterion("BUSINESSNOTYPE between", value1, value2, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andBusinessnotypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNOTYPE not between", value1, value2, "businessnotype");
            return (Criteria) this;
        }

        public Criteria andCashflowIsNull() {
            addCriterion("CASHFLOW is null");
            return (Criteria) this;
        }

        public Criteria andCashflowIsNotNull() {
            addCriterion("CASHFLOW is not null");
            return (Criteria) this;
        }

        public Criteria andCashflowEqualTo(String value) {
            addCriterion("CASHFLOW =", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowNotEqualTo(String value) {
            addCriterion("CASHFLOW <>", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowGreaterThan(String value) {
            addCriterion("CASHFLOW >", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowGreaterThanOrEqualTo(String value) {
            addCriterion("CASHFLOW >=", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowLessThan(String value) {
            addCriterion("CASHFLOW <", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowLessThanOrEqualTo(String value) {
            addCriterion("CASHFLOW <=", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowLike(String value) {
            addCriterion("CASHFLOW like", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowNotLike(String value) {
            addCriterion("CASHFLOW not like", value, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowIn(List<String> values) {
            addCriterion("CASHFLOW in", values, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowNotIn(List<String> values) {
            addCriterion("CASHFLOW not in", values, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowBetween(String value1, String value2) {
            addCriterion("CASHFLOW between", value1, value2, "cashflow");
            return (Criteria) this;
        }

        public Criteria andCashflowNotBetween(String value1, String value2) {
            addCriterion("CASHFLOW not between", value1, value2, "cashflow");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_vouchermodule_tc
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
     * @Table : mm_vouchermodule_tc
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