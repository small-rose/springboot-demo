package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPolicyextensionTdExample {
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
    public MmPolicyextensionTdExample() {
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
     * @Table : mm_policyextension_td
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

        public Criteria andAssuredamountIsNull() {
            addCriterion("ASSUREDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAssuredamountIsNotNull() {
            addCriterion("ASSUREDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAssuredamountEqualTo(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT =", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountNotEqualTo(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT <>", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountGreaterThan(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT >", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT >=", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountLessThan(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT <", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSUREDAMOUNT <=", value, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountIn(List<BigDecimal> values) {
            addCriterion("ASSUREDAMOUNT in", values, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountNotIn(List<BigDecimal> values) {
            addCriterion("ASSUREDAMOUNT not in", values, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSUREDAMOUNT between", value1, value2, "assuredamount");
            return (Criteria) this;
        }

        public Criteria andAssuredamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSUREDAMOUNT not between", value1, value2, "assuredamount");
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

        public Criteria andApplicantnameIsNull() {
            addCriterion("APPLICANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameIsNotNull() {
            addCriterion("APPLICANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameEqualTo(String value) {
            addCriterion("APPLICANTNAME =", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotEqualTo(String value) {
            addCriterion("APPLICANTNAME <>", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameGreaterThan(String value) {
            addCriterion("APPLICANTNAME >", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAME >=", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLessThan(String value) {
            addCriterion("APPLICANTNAME <", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAME <=", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameLike(String value) {
            addCriterion("APPLICANTNAME like", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotLike(String value) {
            addCriterion("APPLICANTNAME not like", value, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameIn(List<String> values) {
            addCriterion("APPLICANTNAME in", values, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotIn(List<String> values) {
            addCriterion("APPLICANTNAME not in", values, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameBetween(String value1, String value2) {
            addCriterion("APPLICANTNAME between", value1, value2, "applicantname");
            return (Criteria) this;
        }

        public Criteria andApplicantnameNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAME not between", value1, value2, "applicantname");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeIsNull() {
            addCriterion("INSURANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeIsNotNull() {
            addCriterion("INSURANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeEqualTo(String value) {
            addCriterion("INSURANTCODE =", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeNotEqualTo(String value) {
            addCriterion("INSURANTCODE <>", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeGreaterThan(String value) {
            addCriterion("INSURANTCODE >", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANTCODE >=", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeLessThan(String value) {
            addCriterion("INSURANTCODE <", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeLessThanOrEqualTo(String value) {
            addCriterion("INSURANTCODE <=", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeLike(String value) {
            addCriterion("INSURANTCODE like", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeNotLike(String value) {
            addCriterion("INSURANTCODE not like", value, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeIn(List<String> values) {
            addCriterion("INSURANTCODE in", values, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeNotIn(List<String> values) {
            addCriterion("INSURANTCODE not in", values, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeBetween(String value1, String value2) {
            addCriterion("INSURANTCODE between", value1, value2, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantcodeNotBetween(String value1, String value2) {
            addCriterion("INSURANTCODE not between", value1, value2, "insurantcode");
            return (Criteria) this;
        }

        public Criteria andInsurantnameIsNull() {
            addCriterion("INSURANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurantnameIsNotNull() {
            addCriterion("INSURANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantnameEqualTo(String value) {
            addCriterion("INSURANTNAME =", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotEqualTo(String value) {
            addCriterion("INSURANTNAME <>", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameGreaterThan(String value) {
            addCriterion("INSURANTNAME >", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANTNAME >=", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLessThan(String value) {
            addCriterion("INSURANTNAME <", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLessThanOrEqualTo(String value) {
            addCriterion("INSURANTNAME <=", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLike(String value) {
            addCriterion("INSURANTNAME like", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotLike(String value) {
            addCriterion("INSURANTNAME not like", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameIn(List<String> values) {
            addCriterion("INSURANTNAME in", values, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotIn(List<String> values) {
            addCriterion("INSURANTNAME not in", values, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameBetween(String value1, String value2) {
            addCriterion("INSURANTNAME between", value1, value2, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotBetween(String value1, String value2) {
            addCriterion("INSURANTNAME not between", value1, value2, "insurantname");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNull() {
            addCriterion("SECTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNotNull() {
            addCriterion("SECTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeEqualTo(String value) {
            addCriterion("SECTIONCODE =", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotEqualTo(String value) {
            addCriterion("SECTIONCODE <>", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThan(String value) {
            addCriterion("SECTIONCODE >", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("SECTIONCODE >=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThan(String value) {
            addCriterion("SECTIONCODE <", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThanOrEqualTo(String value) {
            addCriterion("SECTIONCODE <=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLike(String value) {
            addCriterion("SECTIONCODE like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotLike(String value) {
            addCriterion("SECTIONCODE not like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIn(List<String> values) {
            addCriterion("SECTIONCODE in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotIn(List<String> values) {
            addCriterion("SECTIONCODE not in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeBetween(String value1, String value2) {
            addCriterion("SECTIONCODE between", value1, value2, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotBetween(String value1, String value2) {
            addCriterion("SECTIONCODE not between", value1, value2, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNull() {
            addCriterion("OBJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("OBJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("OBJECTNAME =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("OBJECTNAME <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("OBJECTNAME >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("OBJECTNAME <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("OBJECTNAME like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("OBJECTNAME not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("OBJECTNAME in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("OBJECTNAME not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("OBJECTNAME between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("OBJECTNAME not between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNull() {
            addCriterion("SETTLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNotNull() {
            addCriterion("SETTLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSettleamountEqualTo(BigDecimal value) {
            addCriterion("SETTLEAMOUNT =", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEAMOUNT <>", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThan(BigDecimal value) {
            addCriterion("SETTLEAMOUNT >", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEAMOUNT >=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThan(BigDecimal value) {
            addCriterion("SETTLEAMOUNT <", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEAMOUNT <=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountIn(List<BigDecimal> values) {
            addCriterion("SETTLEAMOUNT in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEAMOUNT not in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEAMOUNT between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEAMOUNT not between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andPosbanknoIsNull() {
            addCriterion("POSBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andPosbanknoIsNotNull() {
            addCriterion("POSBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andPosbanknoEqualTo(String value) {
            addCriterion("POSBANKNO =", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoNotEqualTo(String value) {
            addCriterion("POSBANKNO <>", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoGreaterThan(String value) {
            addCriterion("POSBANKNO >", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("POSBANKNO >=", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoLessThan(String value) {
            addCriterion("POSBANKNO <", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoLessThanOrEqualTo(String value) {
            addCriterion("POSBANKNO <=", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoLike(String value) {
            addCriterion("POSBANKNO like", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoNotLike(String value) {
            addCriterion("POSBANKNO not like", value, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoIn(List<String> values) {
            addCriterion("POSBANKNO in", values, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoNotIn(List<String> values) {
            addCriterion("POSBANKNO not in", values, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoBetween(String value1, String value2) {
            addCriterion("POSBANKNO between", value1, value2, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPosbanknoNotBetween(String value1, String value2) {
            addCriterion("POSBANKNO not between", value1, value2, "posbankno");
            return (Criteria) this;
        }

        public Criteria andPrintdateIsNull() {
            addCriterion("PRINTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPrintdateIsNotNull() {
            addCriterion("PRINTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintdateEqualTo(Date value) {
            addCriterion("PRINTDATE =", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotEqualTo(Date value) {
            addCriterion("PRINTDATE <>", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateGreaterThan(Date value) {
            addCriterion("PRINTDATE >", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRINTDATE >=", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateLessThan(Date value) {
            addCriterion("PRINTDATE <", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateLessThanOrEqualTo(Date value) {
            addCriterion("PRINTDATE <=", value, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateIn(List<Date> values) {
            addCriterion("PRINTDATE in", values, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotIn(List<Date> values) {
            addCriterion("PRINTDATE not in", values, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateBetween(Date value1, Date value2) {
            addCriterion("PRINTDATE between", value1, value2, "printdate");
            return (Criteria) this;
        }

        public Criteria andPrintdateNotBetween(Date value1, Date value2) {
            addCriterion("PRINTDATE not between", value1, value2, "printdate");
            return (Criteria) this;
        }

        public Criteria andAidingfundIsNull() {
            addCriterion("AIDINGFUND is null");
            return (Criteria) this;
        }

        public Criteria andAidingfundIsNotNull() {
            addCriterion("AIDINGFUND is not null");
            return (Criteria) this;
        }

        public Criteria andAidingfundEqualTo(BigDecimal value) {
            addCriterion("AIDINGFUND =", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundNotEqualTo(BigDecimal value) {
            addCriterion("AIDINGFUND <>", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundGreaterThan(BigDecimal value) {
            addCriterion("AIDINGFUND >", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AIDINGFUND >=", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundLessThan(BigDecimal value) {
            addCriterion("AIDINGFUND <", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AIDINGFUND <=", value, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundIn(List<BigDecimal> values) {
            addCriterion("AIDINGFUND in", values, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundNotIn(List<BigDecimal> values) {
            addCriterion("AIDINGFUND not in", values, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AIDINGFUND between", value1, value2, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AIDINGFUND not between", value1, value2, "aidingfund");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionIsNull() {
            addCriterion("AIDINGFUNDPROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionIsNotNull() {
            addCriterion("AIDINGFUNDPROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionEqualTo(String value) {
            addCriterion("AIDINGFUNDPROPORTION =", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionNotEqualTo(String value) {
            addCriterion("AIDINGFUNDPROPORTION <>", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionGreaterThan(String value) {
            addCriterion("AIDINGFUNDPROPORTION >", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionGreaterThanOrEqualTo(String value) {
            addCriterion("AIDINGFUNDPROPORTION >=", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionLessThan(String value) {
            addCriterion("AIDINGFUNDPROPORTION <", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionLessThanOrEqualTo(String value) {
            addCriterion("AIDINGFUNDPROPORTION <=", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionLike(String value) {
            addCriterion("AIDINGFUNDPROPORTION like", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionNotLike(String value) {
            addCriterion("AIDINGFUNDPROPORTION not like", value, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionIn(List<String> values) {
            addCriterion("AIDINGFUNDPROPORTION in", values, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionNotIn(List<String> values) {
            addCriterion("AIDINGFUNDPROPORTION not in", values, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionBetween(String value1, String value2) {
            addCriterion("AIDINGFUNDPROPORTION between", value1, value2, "aidingfundproportion");
            return (Criteria) this;
        }

        public Criteria andAidingfundproportionNotBetween(String value1, String value2) {
            addCriterion("AIDINGFUNDPROPORTION not between", value1, value2, "aidingfundproportion");
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

        public Criteria andHandleamountIsNull() {
            addCriterion("HANDLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandleamountIsNotNull() {
            addCriterion("HANDLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandleamountEqualTo(BigDecimal value) {
            addCriterion("HANDLEAMOUNT =", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountNotEqualTo(BigDecimal value) {
            addCriterion("HANDLEAMOUNT <>", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountGreaterThan(BigDecimal value) {
            addCriterion("HANDLEAMOUNT >", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEAMOUNT >=", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountLessThan(BigDecimal value) {
            addCriterion("HANDLEAMOUNT <", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLEAMOUNT <=", value, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountIn(List<BigDecimal> values) {
            addCriterion("HANDLEAMOUNT in", values, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountNotIn(List<BigDecimal> values) {
            addCriterion("HANDLEAMOUNT not in", values, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEAMOUNT between", value1, value2, "handleamount");
            return (Criteria) this;
        }

        public Criteria andHandleamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLEAMOUNT not between", value1, value2, "handleamount");
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

        public Criteria andIdentifyIsNull() {
            addCriterion("IDENTIFY is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNotNull() {
            addCriterion("IDENTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyEqualTo(String value) {
            addCriterion("IDENTIFY =", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotEqualTo(String value) {
            addCriterion("IDENTIFY <>", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThan(String value) {
            addCriterion("IDENTIFY >", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFY >=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThan(String value) {
            addCriterion("IDENTIFY <", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFY <=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLike(String value) {
            addCriterion("IDENTIFY like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotLike(String value) {
            addCriterion("IDENTIFY not like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyIn(List<String> values) {
            addCriterion("IDENTIFY in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotIn(List<String> values) {
            addCriterion("IDENTIFY not in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyBetween(String value1, String value2) {
            addCriterion("IDENTIFY between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotBetween(String value1, String value2) {
            addCriterion("IDENTIFY not between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIsNull() {
            addCriterion("ISACTIVEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIsNotNull() {
            addCriterion("ISACTIVEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagEqualTo(String value) {
            addCriterion("ISACTIVEFLAG =", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotEqualTo(String value) {
            addCriterion("ISACTIVEFLAG <>", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagGreaterThan(String value) {
            addCriterion("ISACTIVEFLAG >", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVEFLAG >=", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLessThan(String value) {
            addCriterion("ISACTIVEFLAG <", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVEFLAG <=", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagLike(String value) {
            addCriterion("ISACTIVEFLAG like", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotLike(String value) {
            addCriterion("ISACTIVEFLAG not like", value, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagIn(List<String> values) {
            addCriterion("ISACTIVEFLAG in", values, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotIn(List<String> values) {
            addCriterion("ISACTIVEFLAG not in", values, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagBetween(String value1, String value2) {
            addCriterion("ISACTIVEFLAG between", value1, value2, "isactiveflag");
            return (Criteria) this;
        }

        public Criteria andIsactiveflagNotBetween(String value1, String value2) {
            addCriterion("ISACTIVEFLAG not between", value1, value2, "isactiveflag");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_policyextension_td
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
     * @Table : mm_policyextension_td
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