package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmSapVoucherDetailToExample {
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
    public MmSapVoucherDetailToExample() {
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
     * @Table : mm_sap_voucher_detail_to
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

        public Criteria andSequencenoIsNull() {
            addCriterion("SEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNotNull() {
            addCriterion("SEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenoEqualTo(Long value) {
            addCriterion("SEQUENCENO =", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotEqualTo(Long value) {
            addCriterion("SEQUENCENO <>", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThan(Long value) {
            addCriterion("SEQUENCENO >", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQUENCENO >=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThan(Long value) {
            addCriterion("SEQUENCENO <", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThanOrEqualTo(Long value) {
            addCriterion("SEQUENCENO <=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoIn(List<Long> values) {
            addCriterion("SEQUENCENO in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotIn(List<Long> values) {
            addCriterion("SEQUENCENO not in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoBetween(Long value1, Long value2) {
            addCriterion("SEQUENCENO between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotBetween(Long value1, Long value2) {
            addCriterion("SEQUENCENO not between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andBranchcodeIsNull() {
            addCriterion("BRANCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andBranchcodeIsNotNull() {
            addCriterion("BRANCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBranchcodeEqualTo(String value) {
            addCriterion("BRANCHCODE =", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeNotEqualTo(String value) {
            addCriterion("BRANCHCODE <>", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeGreaterThan(String value) {
            addCriterion("BRANCHCODE >", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHCODE >=", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeLessThan(String value) {
            addCriterion("BRANCHCODE <", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeLessThanOrEqualTo(String value) {
            addCriterion("BRANCHCODE <=", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeLike(String value) {
            addCriterion("BRANCHCODE like", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeNotLike(String value) {
            addCriterion("BRANCHCODE not like", value, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeIn(List<String> values) {
            addCriterion("BRANCHCODE in", values, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeNotIn(List<String> values) {
            addCriterion("BRANCHCODE not in", values, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeBetween(String value1, String value2) {
            addCriterion("BRANCHCODE between", value1, value2, "branchcode");
            return (Criteria) this;
        }

        public Criteria andBranchcodeNotBetween(String value1, String value2) {
            addCriterion("BRANCHCODE not between", value1, value2, "branchcode");
            return (Criteria) this;
        }

        public Criteria andAccountyearIsNull() {
            addCriterion("ACCOUNTYEAR is null");
            return (Criteria) this;
        }

        public Criteria andAccountyearIsNotNull() {
            addCriterion("ACCOUNTYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAccountyearEqualTo(String value) {
            addCriterion("ACCOUNTYEAR =", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotEqualTo(String value) {
            addCriterion("ACCOUNTYEAR <>", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearGreaterThan(String value) {
            addCriterion("ACCOUNTYEAR >", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYEAR >=", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearLessThan(String value) {
            addCriterion("ACCOUNTYEAR <", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYEAR <=", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearLike(String value) {
            addCriterion("ACCOUNTYEAR like", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotLike(String value) {
            addCriterion("ACCOUNTYEAR not like", value, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearIn(List<String> values) {
            addCriterion("ACCOUNTYEAR in", values, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotIn(List<String> values) {
            addCriterion("ACCOUNTYEAR not in", values, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearBetween(String value1, String value2) {
            addCriterion("ACCOUNTYEAR between", value1, value2, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountyearNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTYEAR not between", value1, value2, "accountyear");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIsNull() {
            addCriterion("ACCOUNTMONTH is null");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIsNotNull() {
            addCriterion("ACCOUNTMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andAccountmonthEqualTo(String value) {
            addCriterion("ACCOUNTMONTH =", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotEqualTo(String value) {
            addCriterion("ACCOUNTMONTH <>", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthGreaterThan(String value) {
            addCriterion("ACCOUNTMONTH >", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTMONTH >=", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthLessThan(String value) {
            addCriterion("ACCOUNTMONTH <", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTMONTH <=", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthLike(String value) {
            addCriterion("ACCOUNTMONTH like", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotLike(String value) {
            addCriterion("ACCOUNTMONTH not like", value, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthIn(List<String> values) {
            addCriterion("ACCOUNTMONTH in", values, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotIn(List<String> values) {
            addCriterion("ACCOUNTMONTH not in", values, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthBetween(String value1, String value2) {
            addCriterion("ACCOUNTMONTH between", value1, value2, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andAccountmonthNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTMONTH not between", value1, value2, "accountmonth");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNull() {
            addCriterion("POSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("POSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(String value) {
            addCriterion("POSTDATE =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(String value) {
            addCriterion("POSTDATE <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(String value) {
            addCriterion("POSTDATE >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(String value) {
            addCriterion("POSTDATE >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(String value) {
            addCriterion("POSTDATE <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(String value) {
            addCriterion("POSTDATE <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLike(String value) {
            addCriterion("POSTDATE like", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotLike(String value) {
            addCriterion("POSTDATE not like", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(List<String> values) {
            addCriterion("POSTDATE in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(List<String> values) {
            addCriterion("POSTDATE not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(String value1, String value2) {
            addCriterion("POSTDATE between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(String value1, String value2) {
            addCriterion("POSTDATE not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNull() {
            addCriterion("VOUCHERNO is null");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNotNull() {
            addCriterion("VOUCHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernoEqualTo(String value) {
            addCriterion("VOUCHERNO =", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotEqualTo(String value) {
            addCriterion("VOUCHERNO <>", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThan(String value) {
            addCriterion("VOUCHERNO >", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO >=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThan(String value) {
            addCriterion("VOUCHERNO <", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO <=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLike(String value) {
            addCriterion("VOUCHERNO like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotLike(String value) {
            addCriterion("VOUCHERNO not like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoIn(List<String> values) {
            addCriterion("VOUCHERNO in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotIn(List<String> values) {
            addCriterion("VOUCHERNO not in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoBetween(String value1, String value2) {
            addCriterion("VOUCHERNO between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotBetween(String value1, String value2) {
            addCriterion("VOUCHERNO not between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoIsNull() {
            addCriterion("VOUCHERLINENO is null");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoIsNotNull() {
            addCriterion("VOUCHERLINENO is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoEqualTo(String value) {
            addCriterion("VOUCHERLINENO =", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoNotEqualTo(String value) {
            addCriterion("VOUCHERLINENO <>", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoGreaterThan(String value) {
            addCriterion("VOUCHERLINENO >", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERLINENO >=", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoLessThan(String value) {
            addCriterion("VOUCHERLINENO <", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERLINENO <=", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoLike(String value) {
            addCriterion("VOUCHERLINENO like", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoNotLike(String value) {
            addCriterion("VOUCHERLINENO not like", value, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoIn(List<String> values) {
            addCriterion("VOUCHERLINENO in", values, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoNotIn(List<String> values) {
            addCriterion("VOUCHERLINENO not in", values, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoBetween(String value1, String value2) {
            addCriterion("VOUCHERLINENO between", value1, value2, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andVoucherlinenoNotBetween(String value1, String value2) {
            addCriterion("VOUCHERLINENO not between", value1, value2, "voucherlineno");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeIsNull() {
            addCriterion("CROSSBRANCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeIsNotNull() {
            addCriterion("CROSSBRANCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeEqualTo(String value) {
            addCriterion("CROSSBRANCHCODE =", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeNotEqualTo(String value) {
            addCriterion("CROSSBRANCHCODE <>", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeGreaterThan(String value) {
            addCriterion("CROSSBRANCHCODE >", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CROSSBRANCHCODE >=", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeLessThan(String value) {
            addCriterion("CROSSBRANCHCODE <", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeLessThanOrEqualTo(String value) {
            addCriterion("CROSSBRANCHCODE <=", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeLike(String value) {
            addCriterion("CROSSBRANCHCODE like", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeNotLike(String value) {
            addCriterion("CROSSBRANCHCODE not like", value, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeIn(List<String> values) {
            addCriterion("CROSSBRANCHCODE in", values, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeNotIn(List<String> values) {
            addCriterion("CROSSBRANCHCODE not in", values, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeBetween(String value1, String value2) {
            addCriterion("CROSSBRANCHCODE between", value1, value2, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andCrossbranchcodeNotBetween(String value1, String value2) {
            addCriterion("CROSSBRANCHCODE not between", value1, value2, "crossbranchcode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeIsNull() {
            addCriterion("ACCOUNTTITLECODE is null");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeIsNotNull() {
            addCriterion("ACCOUNTTITLECODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeEqualTo(String value) {
            addCriterion("ACCOUNTTITLECODE =", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeNotEqualTo(String value) {
            addCriterion("ACCOUNTTITLECODE <>", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeGreaterThan(String value) {
            addCriterion("ACCOUNTTITLECODE >", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTITLECODE >=", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeLessThan(String value) {
            addCriterion("ACCOUNTTITLECODE <", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTITLECODE <=", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeLike(String value) {
            addCriterion("ACCOUNTTITLECODE like", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeNotLike(String value) {
            addCriterion("ACCOUNTTITLECODE not like", value, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeIn(List<String> values) {
            addCriterion("ACCOUNTTITLECODE in", values, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeNotIn(List<String> values) {
            addCriterion("ACCOUNTTITLECODE not in", values, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeBetween(String value1, String value2) {
            addCriterion("ACCOUNTTITLECODE between", value1, value2, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAccounttitlecodeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTTITLECODE not between", value1, value2, "accounttitlecode");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNull() {
            addCriterion("ABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andAbstractIsNotNull() {
            addCriterion("ABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractEqualTo(String value) {
            addCriterion("ABSTRACT =", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotEqualTo(String value) {
            addCriterion("ABSTRACT <>", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThan(String value) {
            addCriterion("ABSTRACT >", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("ABSTRACT >=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThan(String value) {
            addCriterion("ABSTRACT <", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLessThanOrEqualTo(String value) {
            addCriterion("ABSTRACT <=", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractLike(String value) {
            addCriterion("ABSTRACT like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotLike(String value) {
            addCriterion("ABSTRACT not like", value, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractIn(List<String> values) {
            addCriterion("ABSTRACT in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotIn(List<String> values) {
            addCriterion("ABSTRACT not in", values, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractBetween(String value1, String value2) {
            addCriterion("ABSTRACT between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andAbstractNotBetween(String value1, String value2) {
            addCriterion("ABSTRACT not between", value1, value2, "abstract");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNull() {
            addCriterion("CHECKNO is null");
            return (Criteria) this;
        }

        public Criteria andChecknoIsNotNull() {
            addCriterion("CHECKNO is not null");
            return (Criteria) this;
        }

        public Criteria andChecknoEqualTo(String value) {
            addCriterion("CHECKNO =", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotEqualTo(String value) {
            addCriterion("CHECKNO <>", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThan(String value) {
            addCriterion("CHECKNO >", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNO >=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThan(String value) {
            addCriterion("CHECKNO <", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLessThanOrEqualTo(String value) {
            addCriterion("CHECKNO <=", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoLike(String value) {
            addCriterion("CHECKNO like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotLike(String value) {
            addCriterion("CHECKNO not like", value, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoIn(List<String> values) {
            addCriterion("CHECKNO in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotIn(List<String> values) {
            addCriterion("CHECKNO not in", values, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoBetween(String value1, String value2) {
            addCriterion("CHECKNO between", value1, value2, "checkno");
            return (Criteria) this;
        }

        public Criteria andChecknoNotBetween(String value1, String value2) {
            addCriterion("CHECKNO not between", value1, value2, "checkno");
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

        public Criteria andDramountIsNull() {
            addCriterion("DRAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDramountIsNotNull() {
            addCriterion("DRAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDramountEqualTo(BigDecimal value) {
            addCriterion("DRAMOUNT =", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountNotEqualTo(BigDecimal value) {
            addCriterion("DRAMOUNT <>", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountGreaterThan(BigDecimal value) {
            addCriterion("DRAMOUNT >", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAMOUNT >=", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountLessThan(BigDecimal value) {
            addCriterion("DRAMOUNT <", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAMOUNT <=", value, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountIn(List<BigDecimal> values) {
            addCriterion("DRAMOUNT in", values, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountNotIn(List<BigDecimal> values) {
            addCriterion("DRAMOUNT not in", values, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAMOUNT between", value1, value2, "dramount");
            return (Criteria) this;
        }

        public Criteria andDramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAMOUNT not between", value1, value2, "dramount");
            return (Criteria) this;
        }

        public Criteria andCramountIsNull() {
            addCriterion("CRAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCramountIsNotNull() {
            addCriterion("CRAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCramountEqualTo(BigDecimal value) {
            addCriterion("CRAMOUNT =", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountNotEqualTo(BigDecimal value) {
            addCriterion("CRAMOUNT <>", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountGreaterThan(BigDecimal value) {
            addCriterion("CRAMOUNT >", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRAMOUNT >=", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountLessThan(BigDecimal value) {
            addCriterion("CRAMOUNT <", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRAMOUNT <=", value, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountIn(List<BigDecimal> values) {
            addCriterion("CRAMOUNT in", values, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountNotIn(List<BigDecimal> values) {
            addCriterion("CRAMOUNT not in", values, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRAMOUNT between", value1, value2, "cramount");
            return (Criteria) this;
        }

        public Criteria andCramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRAMOUNT not between", value1, value2, "cramount");
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

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
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
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
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

        public Criteria andIsdomesticIsNull() {
            addCriterion("ISDOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andIsdomesticIsNotNull() {
            addCriterion("ISDOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsdomesticEqualTo(String value) {
            addCriterion("ISDOMESTIC =", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticNotEqualTo(String value) {
            addCriterion("ISDOMESTIC <>", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticGreaterThan(String value) {
            addCriterion("ISDOMESTIC >", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticGreaterThanOrEqualTo(String value) {
            addCriterion("ISDOMESTIC >=", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticLessThan(String value) {
            addCriterion("ISDOMESTIC <", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticLessThanOrEqualTo(String value) {
            addCriterion("ISDOMESTIC <=", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticLike(String value) {
            addCriterion("ISDOMESTIC like", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticNotLike(String value) {
            addCriterion("ISDOMESTIC not like", value, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticIn(List<String> values) {
            addCriterion("ISDOMESTIC in", values, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticNotIn(List<String> values) {
            addCriterion("ISDOMESTIC not in", values, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticBetween(String value1, String value2) {
            addCriterion("ISDOMESTIC between", value1, value2, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andIsdomesticNotBetween(String value1, String value2) {
            addCriterion("ISDOMESTIC not between", value1, value2, "isdomestic");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeIsNull() {
            addCriterion("APPLICATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeIsNotNull() {
            addCriterion("APPLICATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeEqualTo(String value) {
            addCriterion("APPLICATIONCODE =", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeNotEqualTo(String value) {
            addCriterion("APPLICATIONCODE <>", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeGreaterThan(String value) {
            addCriterion("APPLICATIONCODE >", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATIONCODE >=", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeLessThan(String value) {
            addCriterion("APPLICATIONCODE <", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICATIONCODE <=", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeLike(String value) {
            addCriterion("APPLICATIONCODE like", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeNotLike(String value) {
            addCriterion("APPLICATIONCODE not like", value, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeIn(List<String> values) {
            addCriterion("APPLICATIONCODE in", values, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeNotIn(List<String> values) {
            addCriterion("APPLICATIONCODE not in", values, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeBetween(String value1, String value2) {
            addCriterion("APPLICATIONCODE between", value1, value2, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICATIONCODE not between", value1, value2, "applicationcode");
            return (Criteria) this;
        }

        public Criteria andApplicationnameIsNull() {
            addCriterion("APPLICATIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplicationnameIsNotNull() {
            addCriterion("APPLICATIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationnameEqualTo(String value) {
            addCriterion("APPLICATIONNAME =", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameNotEqualTo(String value) {
            addCriterion("APPLICATIONNAME <>", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameGreaterThan(String value) {
            addCriterion("APPLICATIONNAME >", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATIONNAME >=", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameLessThan(String value) {
            addCriterion("APPLICATIONNAME <", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameLessThanOrEqualTo(String value) {
            addCriterion("APPLICATIONNAME <=", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameLike(String value) {
            addCriterion("APPLICATIONNAME like", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameNotLike(String value) {
            addCriterion("APPLICATIONNAME not like", value, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameIn(List<String> values) {
            addCriterion("APPLICATIONNAME in", values, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameNotIn(List<String> values) {
            addCriterion("APPLICATIONNAME not in", values, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameBetween(String value1, String value2) {
            addCriterion("APPLICATIONNAME between", value1, value2, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameNotBetween(String value1, String value2) {
            addCriterion("APPLICATIONNAME not between", value1, value2, "applicationname");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenIsNull() {
            addCriterion("APPLICATIONNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenIsNotNull() {
            addCriterion("APPLICATIONNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenEqualTo(String value) {
            addCriterion("APPLICATIONNAMEEN =", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenNotEqualTo(String value) {
            addCriterion("APPLICATIONNAMEEN <>", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenGreaterThan(String value) {
            addCriterion("APPLICATIONNAMEEN >", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATIONNAMEEN >=", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenLessThan(String value) {
            addCriterion("APPLICATIONNAMEEN <", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenLessThanOrEqualTo(String value) {
            addCriterion("APPLICATIONNAMEEN <=", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenLike(String value) {
            addCriterion("APPLICATIONNAMEEN like", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenNotLike(String value) {
            addCriterion("APPLICATIONNAMEEN not like", value, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenIn(List<String> values) {
            addCriterion("APPLICATIONNAMEEN in", values, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenNotIn(List<String> values) {
            addCriterion("APPLICATIONNAMEEN not in", values, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenBetween(String value1, String value2) {
            addCriterion("APPLICATIONNAMEEN between", value1, value2, "applicationnameen");
            return (Criteria) this;
        }

        public Criteria andApplicationnameenNotBetween(String value1, String value2) {
            addCriterion("APPLICATIONNAMEEN not between", value1, value2, "applicationnameen");
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

        public Criteria andApplicationpartynoIsNull() {
            addCriterion("APPLICATIONPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoIsNotNull() {
            addCriterion("APPLICATIONPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoEqualTo(String value) {
            addCriterion("APPLICATIONPARTYNO =", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoNotEqualTo(String value) {
            addCriterion("APPLICATIONPARTYNO <>", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoGreaterThan(String value) {
            addCriterion("APPLICATIONPARTYNO >", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATIONPARTYNO >=", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoLessThan(String value) {
            addCriterion("APPLICATIONPARTYNO <", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoLessThanOrEqualTo(String value) {
            addCriterion("APPLICATIONPARTYNO <=", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoLike(String value) {
            addCriterion("APPLICATIONPARTYNO like", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoNotLike(String value) {
            addCriterion("APPLICATIONPARTYNO not like", value, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoIn(List<String> values) {
            addCriterion("APPLICATIONPARTYNO in", values, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoNotIn(List<String> values) {
            addCriterion("APPLICATIONPARTYNO not in", values, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoBetween(String value1, String value2) {
            addCriterion("APPLICATIONPARTYNO between", value1, value2, "applicationpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicationpartynoNotBetween(String value1, String value2) {
            addCriterion("APPLICATIONPARTYNO not between", value1, value2, "applicationpartyno");
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

        public Criteria andCstisjapanIsNull() {
            addCriterion("CSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCstisjapanIsNotNull() {
            addCriterion("CSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCstisjapanEqualTo(String value) {
            addCriterion("CSTISJAPAN =", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanNotEqualTo(String value) {
            addCriterion("CSTISJAPAN <>", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanGreaterThan(String value) {
            addCriterion("CSTISJAPAN >", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CSTISJAPAN >=", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanLessThan(String value) {
            addCriterion("CSTISJAPAN <", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanLessThanOrEqualTo(String value) {
            addCriterion("CSTISJAPAN <=", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanLike(String value) {
            addCriterion("CSTISJAPAN like", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanNotLike(String value) {
            addCriterion("CSTISJAPAN not like", value, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanIn(List<String> values) {
            addCriterion("CSTISJAPAN in", values, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanNotIn(List<String> values) {
            addCriterion("CSTISJAPAN not in", values, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanBetween(String value1, String value2) {
            addCriterion("CSTISJAPAN between", value1, value2, "cstisjapan");
            return (Criteria) this;
        }

        public Criteria andCstisjapanNotBetween(String value1, String value2) {
            addCriterion("CSTISJAPAN not between", value1, value2, "cstisjapan");
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

        public Criteria andInsurercodeIsNull() {
            addCriterion("INSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsurercodeIsNotNull() {
            addCriterion("INSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurercodeEqualTo(String value) {
            addCriterion("INSURERCODE =", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeNotEqualTo(String value) {
            addCriterion("INSURERCODE <>", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeGreaterThan(String value) {
            addCriterion("INSURERCODE >", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURERCODE >=", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeLessThan(String value) {
            addCriterion("INSURERCODE <", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeLessThanOrEqualTo(String value) {
            addCriterion("INSURERCODE <=", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeLike(String value) {
            addCriterion("INSURERCODE like", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeNotLike(String value) {
            addCriterion("INSURERCODE not like", value, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeIn(List<String> values) {
            addCriterion("INSURERCODE in", values, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeNotIn(List<String> values) {
            addCriterion("INSURERCODE not in", values, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeBetween(String value1, String value2) {
            addCriterion("INSURERCODE between", value1, value2, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurercodeNotBetween(String value1, String value2) {
            addCriterion("INSURERCODE not between", value1, value2, "insurercode");
            return (Criteria) this;
        }

        public Criteria andInsurenameIsNull() {
            addCriterion("INSURENAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurenameIsNotNull() {
            addCriterion("INSURENAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurenameEqualTo(String value) {
            addCriterion("INSURENAME =", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameNotEqualTo(String value) {
            addCriterion("INSURENAME <>", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameGreaterThan(String value) {
            addCriterion("INSURENAME >", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameGreaterThanOrEqualTo(String value) {
            addCriterion("INSURENAME >=", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameLessThan(String value) {
            addCriterion("INSURENAME <", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameLessThanOrEqualTo(String value) {
            addCriterion("INSURENAME <=", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameLike(String value) {
            addCriterion("INSURENAME like", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameNotLike(String value) {
            addCriterion("INSURENAME not like", value, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameIn(List<String> values) {
            addCriterion("INSURENAME in", values, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameNotIn(List<String> values) {
            addCriterion("INSURENAME not in", values, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameBetween(String value1, String value2) {
            addCriterion("INSURENAME between", value1, value2, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameNotBetween(String value1, String value2) {
            addCriterion("INSURENAME not between", value1, value2, "insurename");
            return (Criteria) this;
        }

        public Criteria andInsurenameenIsNull() {
            addCriterion("INSURENAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andInsurenameenIsNotNull() {
            addCriterion("INSURENAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andInsurenameenEqualTo(String value) {
            addCriterion("INSURENAMEEN =", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenNotEqualTo(String value) {
            addCriterion("INSURENAMEEN <>", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenGreaterThan(String value) {
            addCriterion("INSURENAMEEN >", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenGreaterThanOrEqualTo(String value) {
            addCriterion("INSURENAMEEN >=", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenLessThan(String value) {
            addCriterion("INSURENAMEEN <", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenLessThanOrEqualTo(String value) {
            addCriterion("INSURENAMEEN <=", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenLike(String value) {
            addCriterion("INSURENAMEEN like", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenNotLike(String value) {
            addCriterion("INSURENAMEEN not like", value, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenIn(List<String> values) {
            addCriterion("INSURENAMEEN in", values, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenNotIn(List<String> values) {
            addCriterion("INSURENAMEEN not in", values, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenBetween(String value1, String value2) {
            addCriterion("INSURENAMEEN between", value1, value2, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenameenNotBetween(String value1, String value2) {
            addCriterion("INSURENAMEEN not between", value1, value2, "insurenameen");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoIsNull() {
            addCriterion("INSURENPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoIsNotNull() {
            addCriterion("INSURENPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoEqualTo(String value) {
            addCriterion("INSURENPARTYNO =", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoNotEqualTo(String value) {
            addCriterion("INSURENPARTYNO <>", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoGreaterThan(String value) {
            addCriterion("INSURENPARTYNO >", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("INSURENPARTYNO >=", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoLessThan(String value) {
            addCriterion("INSURENPARTYNO <", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoLessThanOrEqualTo(String value) {
            addCriterion("INSURENPARTYNO <=", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoLike(String value) {
            addCriterion("INSURENPARTYNO like", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoNotLike(String value) {
            addCriterion("INSURENPARTYNO not like", value, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoIn(List<String> values) {
            addCriterion("INSURENPARTYNO in", values, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoNotIn(List<String> values) {
            addCriterion("INSURENPARTYNO not in", values, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoBetween(String value1, String value2) {
            addCriterion("INSURENPARTYNO between", value1, value2, "insurenpartyno");
            return (Criteria) this;
        }

        public Criteria andInsurenpartynoNotBetween(String value1, String value2) {
            addCriterion("INSURENPARTYNO not between", value1, value2, "insurenpartyno");
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

        public Criteria andStatusflagIsNull() {
            addCriterion("STATUSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andStatusflagIsNotNull() {
            addCriterion("STATUSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStatusflagEqualTo(String value) {
            addCriterion("STATUSFLAG =", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagNotEqualTo(String value) {
            addCriterion("STATUSFLAG <>", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagGreaterThan(String value) {
            addCriterion("STATUSFLAG >", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagGreaterThanOrEqualTo(String value) {
            addCriterion("STATUSFLAG >=", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagLessThan(String value) {
            addCriterion("STATUSFLAG <", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagLessThanOrEqualTo(String value) {
            addCriterion("STATUSFLAG <=", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagLike(String value) {
            addCriterion("STATUSFLAG like", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagNotLike(String value) {
            addCriterion("STATUSFLAG not like", value, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagIn(List<String> values) {
            addCriterion("STATUSFLAG in", values, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagNotIn(List<String> values) {
            addCriterion("STATUSFLAG not in", values, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagBetween(String value1, String value2) {
            addCriterion("STATUSFLAG between", value1, value2, "statusflag");
            return (Criteria) this;
        }

        public Criteria andStatusflagNotBetween(String value1, String value2) {
            addCriterion("STATUSFLAG not between", value1, value2, "statusflag");
            return (Criteria) this;
        }

        public Criteria andZsapdIsNull() {
            addCriterion("ZSAPD is null");
            return (Criteria) this;
        }

        public Criteria andZsapdIsNotNull() {
            addCriterion("ZSAPD is not null");
            return (Criteria) this;
        }

        public Criteria andZsapdEqualTo(String value) {
            addCriterion("ZSAPD =", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdNotEqualTo(String value) {
            addCriterion("ZSAPD <>", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdGreaterThan(String value) {
            addCriterion("ZSAPD >", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdGreaterThanOrEqualTo(String value) {
            addCriterion("ZSAPD >=", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdLessThan(String value) {
            addCriterion("ZSAPD <", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdLessThanOrEqualTo(String value) {
            addCriterion("ZSAPD <=", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdLike(String value) {
            addCriterion("ZSAPD like", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdNotLike(String value) {
            addCriterion("ZSAPD not like", value, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdIn(List<String> values) {
            addCriterion("ZSAPD in", values, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdNotIn(List<String> values) {
            addCriterion("ZSAPD not in", values, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdBetween(String value1, String value2) {
            addCriterion("ZSAPD between", value1, value2, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsapdNotBetween(String value1, String value2) {
            addCriterion("ZSAPD not between", value1, value2, "zsapd");
            return (Criteria) this;
        }

        public Criteria andZsaptIsNull() {
            addCriterion("ZSAPT is null");
            return (Criteria) this;
        }

        public Criteria andZsaptIsNotNull() {
            addCriterion("ZSAPT is not null");
            return (Criteria) this;
        }

        public Criteria andZsaptEqualTo(String value) {
            addCriterion("ZSAPT =", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptNotEqualTo(String value) {
            addCriterion("ZSAPT <>", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptGreaterThan(String value) {
            addCriterion("ZSAPT >", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptGreaterThanOrEqualTo(String value) {
            addCriterion("ZSAPT >=", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptLessThan(String value) {
            addCriterion("ZSAPT <", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptLessThanOrEqualTo(String value) {
            addCriterion("ZSAPT <=", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptLike(String value) {
            addCriterion("ZSAPT like", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptNotLike(String value) {
            addCriterion("ZSAPT not like", value, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptIn(List<String> values) {
            addCriterion("ZSAPT in", values, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptNotIn(List<String> values) {
            addCriterion("ZSAPT not in", values, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptBetween(String value1, String value2) {
            addCriterion("ZSAPT between", value1, value2, "zsapt");
            return (Criteria) this;
        }

        public Criteria andZsaptNotBetween(String value1, String value2) {
            addCriterion("ZSAPT not between", value1, value2, "zsapt");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoIsNull() {
            addCriterion("SAPDOCUMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoIsNotNull() {
            addCriterion("SAPDOCUMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoEqualTo(String value) {
            addCriterion("SAPDOCUMENTNO =", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoNotEqualTo(String value) {
            addCriterion("SAPDOCUMENTNO <>", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoGreaterThan(String value) {
            addCriterion("SAPDOCUMENTNO >", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoGreaterThanOrEqualTo(String value) {
            addCriterion("SAPDOCUMENTNO >=", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoLessThan(String value) {
            addCriterion("SAPDOCUMENTNO <", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoLessThanOrEqualTo(String value) {
            addCriterion("SAPDOCUMENTNO <=", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoLike(String value) {
            addCriterion("SAPDOCUMENTNO like", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoNotLike(String value) {
            addCriterion("SAPDOCUMENTNO not like", value, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoIn(List<String> values) {
            addCriterion("SAPDOCUMENTNO in", values, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoNotIn(List<String> values) {
            addCriterion("SAPDOCUMENTNO not in", values, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoBetween(String value1, String value2) {
            addCriterion("SAPDOCUMENTNO between", value1, value2, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapdocumentnoNotBetween(String value1, String value2) {
            addCriterion("SAPDOCUMENTNO not between", value1, value2, "sapdocumentno");
            return (Criteria) this;
        }

        public Criteria andSapyearIsNull() {
            addCriterion("SAPYEAR is null");
            return (Criteria) this;
        }

        public Criteria andSapyearIsNotNull() {
            addCriterion("SAPYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andSapyearEqualTo(String value) {
            addCriterion("SAPYEAR =", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearNotEqualTo(String value) {
            addCriterion("SAPYEAR <>", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearGreaterThan(String value) {
            addCriterion("SAPYEAR >", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearGreaterThanOrEqualTo(String value) {
            addCriterion("SAPYEAR >=", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearLessThan(String value) {
            addCriterion("SAPYEAR <", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearLessThanOrEqualTo(String value) {
            addCriterion("SAPYEAR <=", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearLike(String value) {
            addCriterion("SAPYEAR like", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearNotLike(String value) {
            addCriterion("SAPYEAR not like", value, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearIn(List<String> values) {
            addCriterion("SAPYEAR in", values, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearNotIn(List<String> values) {
            addCriterion("SAPYEAR not in", values, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearBetween(String value1, String value2) {
            addCriterion("SAPYEAR between", value1, value2, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapyearNotBetween(String value1, String value2) {
            addCriterion("SAPYEAR not between", value1, value2, "sapyear");
            return (Criteria) this;
        }

        public Criteria andSapmonthIsNull() {
            addCriterion("SAPMONTH is null");
            return (Criteria) this;
        }

        public Criteria andSapmonthIsNotNull() {
            addCriterion("SAPMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andSapmonthEqualTo(String value) {
            addCriterion("SAPMONTH =", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthNotEqualTo(String value) {
            addCriterion("SAPMONTH <>", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthGreaterThan(String value) {
            addCriterion("SAPMONTH >", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthGreaterThanOrEqualTo(String value) {
            addCriterion("SAPMONTH >=", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthLessThan(String value) {
            addCriterion("SAPMONTH <", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthLessThanOrEqualTo(String value) {
            addCriterion("SAPMONTH <=", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthLike(String value) {
            addCriterion("SAPMONTH like", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthNotLike(String value) {
            addCriterion("SAPMONTH not like", value, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthIn(List<String> values) {
            addCriterion("SAPMONTH in", values, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthNotIn(List<String> values) {
            addCriterion("SAPMONTH not in", values, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthBetween(String value1, String value2) {
            addCriterion("SAPMONTH between", value1, value2, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSapmonthNotBetween(String value1, String value2) {
            addCriterion("SAPMONTH not between", value1, value2, "sapmonth");
            return (Criteria) this;
        }

        public Criteria andSappostingdateIsNull() {
            addCriterion("SAPPOSTINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andSappostingdateIsNotNull() {
            addCriterion("SAPPOSTINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSappostingdateEqualTo(String value) {
            addCriterion("SAPPOSTINGDATE =", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateNotEqualTo(String value) {
            addCriterion("SAPPOSTINGDATE <>", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateGreaterThan(String value) {
            addCriterion("SAPPOSTINGDATE >", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateGreaterThanOrEqualTo(String value) {
            addCriterion("SAPPOSTINGDATE >=", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateLessThan(String value) {
            addCriterion("SAPPOSTINGDATE <", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateLessThanOrEqualTo(String value) {
            addCriterion("SAPPOSTINGDATE <=", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateLike(String value) {
            addCriterion("SAPPOSTINGDATE like", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateNotLike(String value) {
            addCriterion("SAPPOSTINGDATE not like", value, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateIn(List<String> values) {
            addCriterion("SAPPOSTINGDATE in", values, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateNotIn(List<String> values) {
            addCriterion("SAPPOSTINGDATE not in", values, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateBetween(String value1, String value2) {
            addCriterion("SAPPOSTINGDATE between", value1, value2, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andSappostingdateNotBetween(String value1, String value2) {
            addCriterion("SAPPOSTINGDATE not between", value1, value2, "sappostingdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIsNull() {
            addCriterion("BUSINESSDATE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIsNotNull() {
            addCriterion("BUSINESSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateEqualTo(String value) {
            addCriterion("BUSINESSDATE =", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotEqualTo(String value) {
            addCriterion("BUSINESSDATE <>", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThan(String value) {
            addCriterion("BUSINESSDATE >", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSDATE >=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThan(String value) {
            addCriterion("BUSINESSDATE <", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSDATE <=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLike(String value) {
            addCriterion("BUSINESSDATE like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotLike(String value) {
            addCriterion("BUSINESSDATE not like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIn(List<String> values) {
            addCriterion("BUSINESSDATE in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotIn(List<String> values) {
            addCriterion("BUSINESSDATE not in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateBetween(String value1, String value2) {
            addCriterion("BUSINESSDATE between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotBetween(String value1, String value2) {
            addCriterion("BUSINESSDATE not between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIsNull() {
            addCriterion("VOUCHERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIsNotNull() {
            addCriterion("VOUCHERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeEqualTo(String value) {
            addCriterion("VOUCHERTYPE =", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotEqualTo(String value) {
            addCriterion("VOUCHERTYPE <>", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThan(String value) {
            addCriterion("VOUCHERTYPE >", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERTYPE >=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThan(String value) {
            addCriterion("VOUCHERTYPE <", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERTYPE <=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLike(String value) {
            addCriterion("VOUCHERTYPE like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotLike(String value) {
            addCriterion("VOUCHERTYPE not like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIn(List<String> values) {
            addCriterion("VOUCHERTYPE in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotIn(List<String> values) {
            addCriterion("VOUCHERTYPE not in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeBetween(String value1, String value2) {
            addCriterion("VOUCHERTYPE between", value1, value2, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotBetween(String value1, String value2) {
            addCriterion("VOUCHERTYPE not between", value1, value2, "vouchertype");
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

        public Criteria andPlandateEqualTo(String value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(String value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(String value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(String value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(String value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLike(String value) {
            addCriterion("PLANDATE like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotLike(String value) {
            addCriterion("PLANDATE not like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<String> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<String> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(String value1, String value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(String value1, String value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
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

        public Criteria andInstallmentstimesIsNull() {
            addCriterion("INSTALLMENTSTIMES is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNotNull() {
            addCriterion("INSTALLMENTSTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES =", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES <>", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThan(String value) {
            addCriterion("INSTALLMENTSTIMES >", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES >=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThan(String value) {
            addCriterion("INSTALLMENTSTIMES <", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThanOrEqualTo(String value) {
            addCriterion("INSTALLMENTSTIMES <=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLike(String value) {
            addCriterion("INSTALLMENTSTIMES like", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotLike(String value) {
            addCriterion("INSTALLMENTSTIMES not like", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIn(List<String> values) {
            addCriterion("INSTALLMENTSTIMES in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotIn(List<String> values) {
            addCriterion("INSTALLMENTSTIMES not in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesBetween(String value1, String value2) {
            addCriterion("INSTALLMENTSTIMES between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotBetween(String value1, String value2) {
            addCriterion("INSTALLMENTSTIMES not between", value1, value2, "installmentstimes");
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

        public Criteria andCustsettlementnoIsNull() {
            addCriterion("CUSTSETTLEMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoIsNotNull() {
            addCriterion("CUSTSETTLEMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoEqualTo(String value) {
            addCriterion("CUSTSETTLEMENTNO =", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoNotEqualTo(String value) {
            addCriterion("CUSTSETTLEMENTNO <>", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoGreaterThan(String value) {
            addCriterion("CUSTSETTLEMENTNO >", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTSETTLEMENTNO >=", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoLessThan(String value) {
            addCriterion("CUSTSETTLEMENTNO <", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTSETTLEMENTNO <=", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoLike(String value) {
            addCriterion("CUSTSETTLEMENTNO like", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoNotLike(String value) {
            addCriterion("CUSTSETTLEMENTNO not like", value, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoIn(List<String> values) {
            addCriterion("CUSTSETTLEMENTNO in", values, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoNotIn(List<String> values) {
            addCriterion("CUSTSETTLEMENTNO not in", values, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoBetween(String value1, String value2) {
            addCriterion("CUSTSETTLEMENTNO between", value1, value2, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andCustsettlementnoNotBetween(String value1, String value2) {
            addCriterion("CUSTSETTLEMENTNO not between", value1, value2, "custsettlementno");
            return (Criteria) this;
        }

        public Criteria andDatumIsNull() {
            addCriterion("DATUM is null");
            return (Criteria) this;
        }

        public Criteria andDatumIsNotNull() {
            addCriterion("DATUM is not null");
            return (Criteria) this;
        }

        public Criteria andDatumEqualTo(String value) {
            addCriterion("DATUM =", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotEqualTo(String value) {
            addCriterion("DATUM <>", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumGreaterThan(String value) {
            addCriterion("DATUM >", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumGreaterThanOrEqualTo(String value) {
            addCriterion("DATUM >=", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLessThan(String value) {
            addCriterion("DATUM <", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLessThanOrEqualTo(String value) {
            addCriterion("DATUM <=", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLike(String value) {
            addCriterion("DATUM like", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotLike(String value) {
            addCriterion("DATUM not like", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumIn(List<String> values) {
            addCriterion("DATUM in", values, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotIn(List<String> values) {
            addCriterion("DATUM not in", values, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumBetween(String value1, String value2) {
            addCriterion("DATUM between", value1, value2, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotBetween(String value1, String value2) {
            addCriterion("DATUM not between", value1, value2, "datum");
            return (Criteria) this;
        }

        public Criteria andUzeitIsNull() {
            addCriterion("UZEIT is null");
            return (Criteria) this;
        }

        public Criteria andUzeitIsNotNull() {
            addCriterion("UZEIT is not null");
            return (Criteria) this;
        }

        public Criteria andUzeitEqualTo(String value) {
            addCriterion("UZEIT =", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitNotEqualTo(String value) {
            addCriterion("UZEIT <>", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitGreaterThan(String value) {
            addCriterion("UZEIT >", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitGreaterThanOrEqualTo(String value) {
            addCriterion("UZEIT >=", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitLessThan(String value) {
            addCriterion("UZEIT <", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitLessThanOrEqualTo(String value) {
            addCriterion("UZEIT <=", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitLike(String value) {
            addCriterion("UZEIT like", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitNotLike(String value) {
            addCriterion("UZEIT not like", value, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitIn(List<String> values) {
            addCriterion("UZEIT in", values, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitNotIn(List<String> values) {
            addCriterion("UZEIT not in", values, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitBetween(String value1, String value2) {
            addCriterion("UZEIT between", value1, value2, "uzeit");
            return (Criteria) this;
        }

        public Criteria andUzeitNotBetween(String value1, String value2) {
            addCriterion("UZEIT not between", value1, value2, "uzeit");
            return (Criteria) this;
        }

        public Criteria andIntFlagIsNull() {
            addCriterion("INT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIntFlagIsNotNull() {
            addCriterion("INT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIntFlagEqualTo(String value) {
            addCriterion("INT_FLAG =", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagNotEqualTo(String value) {
            addCriterion("INT_FLAG <>", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagGreaterThan(String value) {
            addCriterion("INT_FLAG >", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagGreaterThanOrEqualTo(String value) {
            addCriterion("INT_FLAG >=", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagLessThan(String value) {
            addCriterion("INT_FLAG <", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagLessThanOrEqualTo(String value) {
            addCriterion("INT_FLAG <=", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagLike(String value) {
            addCriterion("INT_FLAG like", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagNotLike(String value) {
            addCriterion("INT_FLAG not like", value, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagIn(List<String> values) {
            addCriterion("INT_FLAG in", values, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagNotIn(List<String> values) {
            addCriterion("INT_FLAG not in", values, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagBetween(String value1, String value2) {
            addCriterion("INT_FLAG between", value1, value2, "intFlag");
            return (Criteria) this;
        }

        public Criteria andIntFlagNotBetween(String value1, String value2) {
            addCriterion("INT_FLAG not between", value1, value2, "intFlag");
            return (Criteria) this;
        }

        public Criteria andCpudtIsNull() {
            addCriterion("CPUDT is null");
            return (Criteria) this;
        }

        public Criteria andCpudtIsNotNull() {
            addCriterion("CPUDT is not null");
            return (Criteria) this;
        }

        public Criteria andCpudtEqualTo(String value) {
            addCriterion("CPUDT =", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtNotEqualTo(String value) {
            addCriterion("CPUDT <>", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtGreaterThan(String value) {
            addCriterion("CPUDT >", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtGreaterThanOrEqualTo(String value) {
            addCriterion("CPUDT >=", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtLessThan(String value) {
            addCriterion("CPUDT <", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtLessThanOrEqualTo(String value) {
            addCriterion("CPUDT <=", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtLike(String value) {
            addCriterion("CPUDT like", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtNotLike(String value) {
            addCriterion("CPUDT not like", value, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtIn(List<String> values) {
            addCriterion("CPUDT in", values, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtNotIn(List<String> values) {
            addCriterion("CPUDT not in", values, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtBetween(String value1, String value2) {
            addCriterion("CPUDT between", value1, value2, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCpudtNotBetween(String value1, String value2) {
            addCriterion("CPUDT not between", value1, value2, "cpudt");
            return (Criteria) this;
        }

        public Criteria andCputmIsNull() {
            addCriterion("CPUTM is null");
            return (Criteria) this;
        }

        public Criteria andCputmIsNotNull() {
            addCriterion("CPUTM is not null");
            return (Criteria) this;
        }

        public Criteria andCputmEqualTo(String value) {
            addCriterion("CPUTM =", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmNotEqualTo(String value) {
            addCriterion("CPUTM <>", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmGreaterThan(String value) {
            addCriterion("CPUTM >", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmGreaterThanOrEqualTo(String value) {
            addCriterion("CPUTM >=", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmLessThan(String value) {
            addCriterion("CPUTM <", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmLessThanOrEqualTo(String value) {
            addCriterion("CPUTM <=", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmLike(String value) {
            addCriterion("CPUTM like", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmNotLike(String value) {
            addCriterion("CPUTM not like", value, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmIn(List<String> values) {
            addCriterion("CPUTM in", values, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmNotIn(List<String> values) {
            addCriterion("CPUTM not in", values, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmBetween(String value1, String value2) {
            addCriterion("CPUTM between", value1, value2, "cputm");
            return (Criteria) this;
        }

        public Criteria andCputmNotBetween(String value1, String value2) {
            addCriterion("CPUTM not between", value1, value2, "cputm");
            return (Criteria) this;
        }

        public Criteria andBelnrIsNull() {
            addCriterion("BELNR is null");
            return (Criteria) this;
        }

        public Criteria andBelnrIsNotNull() {
            addCriterion("BELNR is not null");
            return (Criteria) this;
        }

        public Criteria andBelnrEqualTo(String value) {
            addCriterion("BELNR =", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrNotEqualTo(String value) {
            addCriterion("BELNR <>", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrGreaterThan(String value) {
            addCriterion("BELNR >", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrGreaterThanOrEqualTo(String value) {
            addCriterion("BELNR >=", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrLessThan(String value) {
            addCriterion("BELNR <", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrLessThanOrEqualTo(String value) {
            addCriterion("BELNR <=", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrLike(String value) {
            addCriterion("BELNR like", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrNotLike(String value) {
            addCriterion("BELNR not like", value, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrIn(List<String> values) {
            addCriterion("BELNR in", values, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrNotIn(List<String> values) {
            addCriterion("BELNR not in", values, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrBetween(String value1, String value2) {
            addCriterion("BELNR between", value1, value2, "belnr");
            return (Criteria) this;
        }

        public Criteria andBelnrNotBetween(String value1, String value2) {
            addCriterion("BELNR not between", value1, value2, "belnr");
            return (Criteria) this;
        }

        public Criteria andGjahrIsNull() {
            addCriterion("GJAHR is null");
            return (Criteria) this;
        }

        public Criteria andGjahrIsNotNull() {
            addCriterion("GJAHR is not null");
            return (Criteria) this;
        }

        public Criteria andGjahrEqualTo(String value) {
            addCriterion("GJAHR =", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrNotEqualTo(String value) {
            addCriterion("GJAHR <>", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrGreaterThan(String value) {
            addCriterion("GJAHR >", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrGreaterThanOrEqualTo(String value) {
            addCriterion("GJAHR >=", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrLessThan(String value) {
            addCriterion("GJAHR <", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrLessThanOrEqualTo(String value) {
            addCriterion("GJAHR <=", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrLike(String value) {
            addCriterion("GJAHR like", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrNotLike(String value) {
            addCriterion("GJAHR not like", value, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrIn(List<String> values) {
            addCriterion("GJAHR in", values, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrNotIn(List<String> values) {
            addCriterion("GJAHR not in", values, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrBetween(String value1, String value2) {
            addCriterion("GJAHR between", value1, value2, "gjahr");
            return (Criteria) this;
        }

        public Criteria andGjahrNotBetween(String value1, String value2) {
            addCriterion("GJAHR not between", value1, value2, "gjahr");
            return (Criteria) this;
        }

        public Criteria andMonatIsNull() {
            addCriterion("MONAT is null");
            return (Criteria) this;
        }

        public Criteria andMonatIsNotNull() {
            addCriterion("MONAT is not null");
            return (Criteria) this;
        }

        public Criteria andMonatEqualTo(String value) {
            addCriterion("MONAT =", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatNotEqualTo(String value) {
            addCriterion("MONAT <>", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatGreaterThan(String value) {
            addCriterion("MONAT >", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatGreaterThanOrEqualTo(String value) {
            addCriterion("MONAT >=", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatLessThan(String value) {
            addCriterion("MONAT <", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatLessThanOrEqualTo(String value) {
            addCriterion("MONAT <=", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatLike(String value) {
            addCriterion("MONAT like", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatNotLike(String value) {
            addCriterion("MONAT not like", value, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatIn(List<String> values) {
            addCriterion("MONAT in", values, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatNotIn(List<String> values) {
            addCriterion("MONAT not in", values, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatBetween(String value1, String value2) {
            addCriterion("MONAT between", value1, value2, "monat");
            return (Criteria) this;
        }

        public Criteria andMonatNotBetween(String value1, String value2) {
            addCriterion("MONAT not between", value1, value2, "monat");
            return (Criteria) this;
        }

        public Criteria andBudatIsNull() {
            addCriterion("BUDAT is null");
            return (Criteria) this;
        }

        public Criteria andBudatIsNotNull() {
            addCriterion("BUDAT is not null");
            return (Criteria) this;
        }

        public Criteria andBudatEqualTo(String value) {
            addCriterion("BUDAT =", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatNotEqualTo(String value) {
            addCriterion("BUDAT <>", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatGreaterThan(String value) {
            addCriterion("BUDAT >", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatGreaterThanOrEqualTo(String value) {
            addCriterion("BUDAT >=", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatLessThan(String value) {
            addCriterion("BUDAT <", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatLessThanOrEqualTo(String value) {
            addCriterion("BUDAT <=", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatLike(String value) {
            addCriterion("BUDAT like", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatNotLike(String value) {
            addCriterion("BUDAT not like", value, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatIn(List<String> values) {
            addCriterion("BUDAT in", values, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatNotIn(List<String> values) {
            addCriterion("BUDAT not in", values, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatBetween(String value1, String value2) {
            addCriterion("BUDAT between", value1, value2, "budat");
            return (Criteria) this;
        }

        public Criteria andBudatNotBetween(String value1, String value2) {
            addCriterion("BUDAT not between", value1, value2, "budat");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(BigDecimal value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(BigDecimal value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(BigDecimal value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(BigDecimal value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<BigDecimal> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<BigDecimal> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNull() {
            addCriterion("DAILYAUDITNO is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNotNull() {
            addCriterion("DAILYAUDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoEqualTo(String value) {
            addCriterion("DAILYAUDITNO =", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotEqualTo(String value) {
            addCriterion("DAILYAUDITNO <>", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThan(String value) {
            addCriterion("DAILYAUDITNO >", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO >=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThan(String value) {
            addCriterion("DAILYAUDITNO <", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO <=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLike(String value) {
            addCriterion("DAILYAUDITNO like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotLike(String value) {
            addCriterion("DAILYAUDITNO not like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIn(List<String> values) {
            addCriterion("DAILYAUDITNO in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotIn(List<String> values) {
            addCriterion("DAILYAUDITNO not in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO not between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNull() {
            addCriterion("BUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("BUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("BUSINESSNO like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("BUSINESSNO not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andPartycodeIsNull() {
            addCriterion("PARTYCODE is null");
            return (Criteria) this;
        }

        public Criteria andPartycodeIsNotNull() {
            addCriterion("PARTYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPartycodeEqualTo(String value) {
            addCriterion("PARTYCODE =", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotEqualTo(String value) {
            addCriterion("PARTYCODE <>", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeGreaterThan(String value) {
            addCriterion("PARTYCODE >", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYCODE >=", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLessThan(String value) {
            addCriterion("PARTYCODE <", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLessThanOrEqualTo(String value) {
            addCriterion("PARTYCODE <=", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLike(String value) {
            addCriterion("PARTYCODE like", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotLike(String value) {
            addCriterion("PARTYCODE not like", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeIn(List<String> values) {
            addCriterion("PARTYCODE in", values, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotIn(List<String> values) {
            addCriterion("PARTYCODE not in", values, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeBetween(String value1, String value2) {
            addCriterion("PARTYCODE between", value1, value2, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotBetween(String value1, String value2) {
            addCriterion("PARTYCODE not between", value1, value2, "partycode");
            return (Criteria) this;
        }

        public Criteria andIsprintedIsNull() {
            addCriterion("ISPRINTED is null");
            return (Criteria) this;
        }

        public Criteria andIsprintedIsNotNull() {
            addCriterion("ISPRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintedEqualTo(String value) {
            addCriterion("ISPRINTED =", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedNotEqualTo(String value) {
            addCriterion("ISPRINTED <>", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedGreaterThan(String value) {
            addCriterion("ISPRINTED >", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRINTED >=", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedLessThan(String value) {
            addCriterion("ISPRINTED <", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedLessThanOrEqualTo(String value) {
            addCriterion("ISPRINTED <=", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedLike(String value) {
            addCriterion("ISPRINTED like", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedNotLike(String value) {
            addCriterion("ISPRINTED not like", value, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedIn(List<String> values) {
            addCriterion("ISPRINTED in", values, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedNotIn(List<String> values) {
            addCriterion("ISPRINTED not in", values, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedBetween(String value1, String value2) {
            addCriterion("ISPRINTED between", value1, value2, "isprinted");
            return (Criteria) this;
        }

        public Criteria andIsprintedNotBetween(String value1, String value2) {
            addCriterion("ISPRINTED not between", value1, value2, "isprinted");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_sap_voucher_detail_to
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
     * @Table : mm_sap_voucher_detail_to
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