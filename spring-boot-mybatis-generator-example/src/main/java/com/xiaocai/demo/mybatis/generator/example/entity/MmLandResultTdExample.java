package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmLandResultTdExample {
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
    public MmLandResultTdExample() {
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
     * @Table : mm_land_result_td
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

        public Criteria andSeqlandIsNull() {
            addCriterion("SEQLAND is null");
            return (Criteria) this;
        }

        public Criteria andSeqlandIsNotNull() {
            addCriterion("SEQLAND is not null");
            return (Criteria) this;
        }

        public Criteria andSeqlandEqualTo(Long value) {
            addCriterion("SEQLAND =", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandNotEqualTo(Long value) {
            addCriterion("SEQLAND <>", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandGreaterThan(Long value) {
            addCriterion("SEQLAND >", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQLAND >=", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandLessThan(Long value) {
            addCriterion("SEQLAND <", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandLessThanOrEqualTo(Long value) {
            addCriterion("SEQLAND <=", value, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandIn(List<Long> values) {
            addCriterion("SEQLAND in", values, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandNotIn(List<Long> values) {
            addCriterion("SEQLAND not in", values, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandBetween(Long value1, Long value2) {
            addCriterion("SEQLAND between", value1, value2, "seqland");
            return (Criteria) this;
        }

        public Criteria andSeqlandNotBetween(Long value1, Long value2) {
            addCriterion("SEQLAND not between", value1, value2, "seqland");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIsNull() {
            addCriterion("DATATYPE_FORCOINPAY is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIsNotNull() {
            addCriterion("DATATYPE_FORCOINPAY is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY =", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY <>", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayGreaterThan(String value) {
            addCriterion("DATATYPE_FORCOINPAY >", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY >=", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLessThan(String value) {
            addCriterion("DATATYPE_FORCOINPAY <", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY <=", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLike(String value) {
            addCriterion("DATATYPE_FORCOINPAY like", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotLike(String value) {
            addCriterion("DATATYPE_FORCOINPAY not like", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIn(List<String> values) {
            addCriterion("DATATYPE_FORCOINPAY in", values, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotIn(List<String> values) {
            addCriterion("DATATYPE_FORCOINPAY not in", values, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayBetween(String value1, String value2) {
            addCriterion("DATATYPE_FORCOINPAY between", value1, value2, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_FORCOINPAY not between", value1, value2, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIsNull() {
            addCriterion("DATATYPE_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIsNotNull() {
            addCriterion("DATATYPE_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyEqualTo(String value) {
            addCriterion("DATATYPE_POLICY =", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotEqualTo(String value) {
            addCriterion("DATATYPE_POLICY <>", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyGreaterThan(String value) {
            addCriterion("DATATYPE_POLICY >", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY >=", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLessThan(String value) {
            addCriterion("DATATYPE_POLICY <", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY <=", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLike(String value) {
            addCriterion("DATATYPE_POLICY like", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotLike(String value) {
            addCriterion("DATATYPE_POLICY not like", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIn(List<String> values) {
            addCriterion("DATATYPE_POLICY in", values, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotIn(List<String> values) {
            addCriterion("DATATYPE_POLICY not in", values, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY between", value1, value2, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY not between", value1, value2, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNull() {
            addCriterion("CLAIMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNotNull() {
            addCriterion("CLAIMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeEqualTo(String value) {
            addCriterion("CLAIMTYPE =", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotEqualTo(String value) {
            addCriterion("CLAIMTYPE <>", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThan(String value) {
            addCriterion("CLAIMTYPE >", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE >=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThan(String value) {
            addCriterion("CLAIMTYPE <", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE <=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLike(String value) {
            addCriterion("CLAIMTYPE like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotLike(String value) {
            addCriterion("CLAIMTYPE not like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIn(List<String> values) {
            addCriterion("CLAIMTYPE in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotIn(List<String> values) {
            addCriterion("CLAIMTYPE not in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE not between", value1, value2, "claimtype");
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

        public Criteria andBusinessattrPayableIsNull() {
            addCriterion("BUSINESSATTR_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableIsNotNull() {
            addCriterion("BUSINESSATTR_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE =", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <>", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableGreaterThan(String value) {
            addCriterion("BUSINESSATTR_PAYABLE >", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE >=", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLessThan(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <=", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLike(String value) {
            addCriterion("BUSINESSATTR_PAYABLE like", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotLike(String value) {
            addCriterion("BUSINESSATTR_PAYABLE not like", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableIn(List<String> values) {
            addCriterion("BUSINESSATTR_PAYABLE in", values, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotIn(List<String> values) {
            addCriterion("BUSINESSATTR_PAYABLE not in", values, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_PAYABLE between", value1, value2, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_PAYABLE not between", value1, value2, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIsNull() {
            addCriterion("SIGN_REVERSE_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIsNotNull() {
            addCriterion("SIGN_REVERSE_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE =", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE <>", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableGreaterThan(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE >", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE >=", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableLessThan(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE <", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_PAYABLE <=", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIn(List<BigDecimal> values) {
            addCriterion("SIGN_REVERSE_PAYABLE in", values, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotIn(List<BigDecimal> values) {
            addCriterion("SIGN_REVERSE_PAYABLE not in", values, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_REVERSE_PAYABLE between", value1, value2, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_REVERSE_PAYABLE not between", value1, value2, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescIsNull() {
            addCriterion("PAYTYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescIsNotNull() {
            addCriterion("PAYTYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescEqualTo(String value) {
            addCriterion("PAYTYPE_DESC =", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotEqualTo(String value) {
            addCriterion("PAYTYPE_DESC <>", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescGreaterThan(String value) {
            addCriterion("PAYTYPE_DESC >", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE_DESC >=", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLessThan(String value) {
            addCriterion("PAYTYPE_DESC <", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE_DESC <=", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLike(String value) {
            addCriterion("PAYTYPE_DESC like", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotLike(String value) {
            addCriterion("PAYTYPE_DESC not like", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescIn(List<String> values) {
            addCriterion("PAYTYPE_DESC in", values, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotIn(List<String> values) {
            addCriterion("PAYTYPE_DESC not in", values, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescBetween(String value1, String value2) {
            addCriterion("PAYTYPE_DESC between", value1, value2, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE_DESC not between", value1, value2, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIsNull() {
            addCriterion("DATATYPE_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIsNotNull() {
            addCriterion("DATATYPE_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE =", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE <>", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableGreaterThan(String value) {
            addCriterion("DATATYPE_PAYABLE >", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE >=", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLessThan(String value) {
            addCriterion("DATATYPE_PAYABLE <", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE <=", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLike(String value) {
            addCriterion("DATATYPE_PAYABLE like", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotLike(String value) {
            addCriterion("DATATYPE_PAYABLE not like", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE in", values, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE not in", values, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE between", value1, value2, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE not between", value1, value2, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIsNull() {
            addCriterion("DATATYPE_PAYABLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIsNotNull() {
            addCriterion("DATATYPE_PAYABLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC =", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <>", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescGreaterThan(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC >", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC >=", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLessThan(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <=", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLike(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC like", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotLike(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC not like", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE_DESC in", values, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE_DESC not in", values, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE_DESC between", value1, value2, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE_DESC not between", value1, value2, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNull() {
            addCriterion("BUSINESSONE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNotNull() {
            addCriterion("BUSINESSONE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneEqualTo(String value) {
            addCriterion("BUSINESSONE =", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotEqualTo(String value) {
            addCriterion("BUSINESSONE <>", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThan(String value) {
            addCriterion("BUSINESSONE >", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE >=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThan(String value) {
            addCriterion("BUSINESSONE <", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE <=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLike(String value) {
            addCriterion("BUSINESSONE like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotLike(String value) {
            addCriterion("BUSINESSONE not like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIn(List<String> values) {
            addCriterion("BUSINESSONE in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotIn(List<String> values) {
            addCriterion("BUSINESSONE not in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneBetween(String value1, String value2) {
            addCriterion("BUSINESSONE between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotBetween(String value1, String value2) {
            addCriterion("BUSINESSONE not between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIsNull() {
            addCriterion("BUSINESSONE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIsNotNull() {
            addCriterion("BUSINESSONE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC =", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC <>", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescGreaterThan(String value) {
            addCriterion("BUSINESSONE_DESC >", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC >=", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLessThan(String value) {
            addCriterion("BUSINESSONE_DESC <", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC <=", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLike(String value) {
            addCriterion("BUSINESSONE_DESC like", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotLike(String value) {
            addCriterion("BUSINESSONE_DESC not like", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIn(List<String> values) {
            addCriterion("BUSINESSONE_DESC in", values, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotIn(List<String> values) {
            addCriterion("BUSINESSONE_DESC not in", values, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescBetween(String value1, String value2) {
            addCriterion("BUSINESSONE_DESC between", value1, value2, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotBetween(String value1, String value2) {
            addCriterion("BUSINESSONE_DESC not between", value1, value2, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNull() {
            addCriterion("BUSINESSTWO is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNotNull() {
            addCriterion("BUSINESSTWO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoEqualTo(String value) {
            addCriterion("BUSINESSTWO =", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotEqualTo(String value) {
            addCriterion("BUSINESSTWO <>", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThan(String value) {
            addCriterion("BUSINESSTWO >", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO >=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThan(String value) {
            addCriterion("BUSINESSTWO <", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO <=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLike(String value) {
            addCriterion("BUSINESSTWO like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotLike(String value) {
            addCriterion("BUSINESSTWO not like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIn(List<String> values) {
            addCriterion("BUSINESSTWO in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotIn(List<String> values) {
            addCriterion("BUSINESSTWO not in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO not between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIsNull() {
            addCriterion("BUSINESSTWO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIsNotNull() {
            addCriterion("BUSINESSTWO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC =", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC <>", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescGreaterThan(String value) {
            addCriterion("BUSINESSTWO_DESC >", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC >=", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLessThan(String value) {
            addCriterion("BUSINESSTWO_DESC <", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC <=", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLike(String value) {
            addCriterion("BUSINESSTWO_DESC like", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotLike(String value) {
            addCriterion("BUSINESSTWO_DESC not like", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIn(List<String> values) {
            addCriterion("BUSINESSTWO_DESC in", values, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotIn(List<String> values) {
            addCriterion("BUSINESSTWO_DESC not in", values, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO_DESC between", value1, value2, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO_DESC not between", value1, value2, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIsNull() {
            addCriterion("SIGN_REVERSE_POLCYEVENTS is null");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIsNotNull() {
            addCriterion("SIGN_REVERSE_POLCYEVENTS is not null");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS =", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <>", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsGreaterThan(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS >", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS >=", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsLessThan(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <=", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIn(List<BigDecimal> values) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS in", values, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotIn(List<BigDecimal> values) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS not in", values, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS between", value1, value2, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS not between", value1, value2, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIsNull() {
            addCriterion("IF_TAXFORAPPLYFEE is null");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIsNotNull() {
            addCriterion("IF_TAXFORAPPLYFEE is not null");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeEqualTo(String value) {
            addCriterion("IF_TAXFORAPPLYFEE =", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotEqualTo(String value) {
            addCriterion("IF_TAXFORAPPLYFEE <>", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeGreaterThan(String value) {
            addCriterion("IF_TAXFORAPPLYFEE >", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeGreaterThanOrEqualTo(String value) {
            addCriterion("IF_TAXFORAPPLYFEE >=", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLessThan(String value) {
            addCriterion("IF_TAXFORAPPLYFEE <", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLessThanOrEqualTo(String value) {
            addCriterion("IF_TAXFORAPPLYFEE <=", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLike(String value) {
            addCriterion("IF_TAXFORAPPLYFEE like", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotLike(String value) {
            addCriterion("IF_TAXFORAPPLYFEE not like", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIn(List<String> values) {
            addCriterion("IF_TAXFORAPPLYFEE in", values, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotIn(List<String> values) {
            addCriterion("IF_TAXFORAPPLYFEE not in", values, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeBetween(String value1, String value2) {
            addCriterion("IF_TAXFORAPPLYFEE between", value1, value2, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotBetween(String value1, String value2) {
            addCriterion("IF_TAXFORAPPLYFEE not between", value1, value2, "ifTaxforapplyfee");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_land_result_td
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
     * @Table : mm_land_result_td
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