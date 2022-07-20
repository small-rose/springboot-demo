package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class HicmiMidAccMainExample {
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
    public HicmiMidAccMainExample() {
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
     * @Table : hicmi_mid_acc_main
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

        public Criteria andTrdnmIsNull() {
            addCriterion("TRDNM is null");
            return (Criteria) this;
        }

        public Criteria andTrdnmIsNotNull() {
            addCriterion("TRDNM is not null");
            return (Criteria) this;
        }

        public Criteria andTrdnmEqualTo(Long value) {
            addCriterion("TRDNM =", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotEqualTo(Long value) {
            addCriterion("TRDNM <>", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThan(Long value) {
            addCriterion("TRDNM >", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThanOrEqualTo(Long value) {
            addCriterion("TRDNM >=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThan(Long value) {
            addCriterion("TRDNM <", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThanOrEqualTo(Long value) {
            addCriterion("TRDNM <=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmIn(List<Long> values) {
            addCriterion("TRDNM in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotIn(List<Long> values) {
            addCriterion("TRDNM not in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmBetween(Long value1, Long value2) {
            addCriterion("TRDNM between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotBetween(Long value1, Long value2) {
            addCriterion("TRDNM not between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNull() {
            addCriterion("PK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNotNull() {
            addCriterion("PK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkGroupEqualTo(String value) {
            addCriterion("PK_GROUP =", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotEqualTo(String value) {
            addCriterion("PK_GROUP <>", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThan(String value) {
            addCriterion("PK_GROUP >", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_GROUP >=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThan(String value) {
            addCriterion("PK_GROUP <", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_GROUP <=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLike(String value) {
            addCriterion("PK_GROUP like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotLike(String value) {
            addCriterion("PK_GROUP not like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupIn(List<String> values) {
            addCriterion("PK_GROUP in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotIn(List<String> values) {
            addCriterion("PK_GROUP not in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupBetween(String value1, String value2) {
            addCriterion("PK_GROUP between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotBetween(String value1, String value2) {
            addCriterion("PK_GROUP not between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkPreparedIsNull() {
            addCriterion("PK_PREPARED is null");
            return (Criteria) this;
        }

        public Criteria andPkPreparedIsNotNull() {
            addCriterion("PK_PREPARED is not null");
            return (Criteria) this;
        }

        public Criteria andPkPreparedEqualTo(String value) {
            addCriterion("PK_PREPARED =", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedNotEqualTo(String value) {
            addCriterion("PK_PREPARED <>", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedGreaterThan(String value) {
            addCriterion("PK_PREPARED >", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PREPARED >=", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedLessThan(String value) {
            addCriterion("PK_PREPARED <", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedLessThanOrEqualTo(String value) {
            addCriterion("PK_PREPARED <=", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedLike(String value) {
            addCriterion("PK_PREPARED like", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedNotLike(String value) {
            addCriterion("PK_PREPARED not like", value, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedIn(List<String> values) {
            addCriterion("PK_PREPARED in", values, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedNotIn(List<String> values) {
            addCriterion("PK_PREPARED not in", values, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedBetween(String value1, String value2) {
            addCriterion("PK_PREPARED between", value1, value2, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkPreparedNotBetween(String value1, String value2) {
            addCriterion("PK_PREPARED not between", value1, value2, "pkPrepared");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNull() {
            addCriterion("PK_ORG_V is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNotNull() {
            addCriterion("PK_ORG_V is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVEqualTo(String value) {
            addCriterion("PK_ORG_V =", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotEqualTo(String value) {
            addCriterion("PK_ORG_V <>", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThan(String value) {
            addCriterion("PK_ORG_V >", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V >=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThan(String value) {
            addCriterion("PK_ORG_V <", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V <=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLike(String value) {
            addCriterion("PK_ORG_V like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotLike(String value) {
            addCriterion("PK_ORG_V not like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIn(List<String> values) {
            addCriterion("PK_ORG_V in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotIn(List<String> values) {
            addCriterion("PK_ORG_V not in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVBetween(String value1, String value2) {
            addCriterion("PK_ORG_V between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotBetween(String value1, String value2) {
            addCriterion("PK_ORG_V not between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeIsNull() {
            addCriterion("PK_VOUCHERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeIsNotNull() {
            addCriterion("PK_VOUCHERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeEqualTo(String value) {
            addCriterion("PK_VOUCHERTYPE =", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeNotEqualTo(String value) {
            addCriterion("PK_VOUCHERTYPE <>", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeGreaterThan(String value) {
            addCriterion("PK_VOUCHERTYPE >", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_VOUCHERTYPE >=", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeLessThan(String value) {
            addCriterion("PK_VOUCHERTYPE <", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeLessThanOrEqualTo(String value) {
            addCriterion("PK_VOUCHERTYPE <=", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeLike(String value) {
            addCriterion("PK_VOUCHERTYPE like", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeNotLike(String value) {
            addCriterion("PK_VOUCHERTYPE not like", value, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeIn(List<String> values) {
            addCriterion("PK_VOUCHERTYPE in", values, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeNotIn(List<String> values) {
            addCriterion("PK_VOUCHERTYPE not in", values, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeBetween(String value1, String value2) {
            addCriterion("PK_VOUCHERTYPE between", value1, value2, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andPkVouchertypeNotBetween(String value1, String value2) {
            addCriterion("PK_VOUCHERTYPE not between", value1, value2, "pkVouchertype");
            return (Criteria) this;
        }

        public Criteria andCYearIsNull() {
            addCriterion("C_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCYearIsNotNull() {
            addCriterion("C_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCYearEqualTo(String value) {
            addCriterion("C_YEAR =", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotEqualTo(String value) {
            addCriterion("C_YEAR <>", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearGreaterThan(String value) {
            addCriterion("C_YEAR >", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearGreaterThanOrEqualTo(String value) {
            addCriterion("C_YEAR >=", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearLessThan(String value) {
            addCriterion("C_YEAR <", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearLessThanOrEqualTo(String value) {
            addCriterion("C_YEAR <=", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearLike(String value) {
            addCriterion("C_YEAR like", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotLike(String value) {
            addCriterion("C_YEAR not like", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearIn(List<String> values) {
            addCriterion("C_YEAR in", values, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotIn(List<String> values) {
            addCriterion("C_YEAR not in", values, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearBetween(String value1, String value2) {
            addCriterion("C_YEAR between", value1, value2, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotBetween(String value1, String value2) {
            addCriterion("C_YEAR not between", value1, value2, "cYear");
            return (Criteria) this;
        }

        public Criteria andPkSystemIsNull() {
            addCriterion("PK_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andPkSystemIsNotNull() {
            addCriterion("PK_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andPkSystemEqualTo(String value) {
            addCriterion("PK_SYSTEM =", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotEqualTo(String value) {
            addCriterion("PK_SYSTEM <>", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemGreaterThan(String value) {
            addCriterion("PK_SYSTEM >", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SYSTEM >=", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLessThan(String value) {
            addCriterion("PK_SYSTEM <", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLessThanOrEqualTo(String value) {
            addCriterion("PK_SYSTEM <=", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLike(String value) {
            addCriterion("PK_SYSTEM like", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotLike(String value) {
            addCriterion("PK_SYSTEM not like", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemIn(List<String> values) {
            addCriterion("PK_SYSTEM in", values, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotIn(List<String> values) {
            addCriterion("PK_SYSTEM not in", values, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemBetween(String value1, String value2) {
            addCriterion("PK_SYSTEM between", value1, value2, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotBetween(String value1, String value2) {
            addCriterion("PK_SYSTEM not between", value1, value2, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andVoucherkindIsNull() {
            addCriterion("VOUCHERKIND is null");
            return (Criteria) this;
        }

        public Criteria andVoucherkindIsNotNull() {
            addCriterion("VOUCHERKIND is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherkindEqualTo(Byte value) {
            addCriterion("VOUCHERKIND =", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotEqualTo(Byte value) {
            addCriterion("VOUCHERKIND <>", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindGreaterThan(Byte value) {
            addCriterion("VOUCHERKIND >", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindGreaterThanOrEqualTo(Byte value) {
            addCriterion("VOUCHERKIND >=", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindLessThan(Byte value) {
            addCriterion("VOUCHERKIND <", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindLessThanOrEqualTo(Byte value) {
            addCriterion("VOUCHERKIND <=", value, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindIn(List<Byte> values) {
            addCriterion("VOUCHERKIND in", values, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotIn(List<Byte> values) {
            addCriterion("VOUCHERKIND not in", values, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindBetween(Byte value1, Byte value2) {
            addCriterion("VOUCHERKIND between", value1, value2, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andVoucherkindNotBetween(Byte value1, Byte value2) {
            addCriterion("VOUCHERKIND not between", value1, value2, "voucherkind");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookIsNull() {
            addCriterion("PK_ACCOUNTINGBOOK is null");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookIsNotNull() {
            addCriterion("PK_ACCOUNTINGBOOK is not null");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookEqualTo(String value) {
            addCriterion("PK_ACCOUNTINGBOOK =", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookNotEqualTo(String value) {
            addCriterion("PK_ACCOUNTINGBOOK <>", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookGreaterThan(String value) {
            addCriterion("PK_ACCOUNTINGBOOK >", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ACCOUNTINGBOOK >=", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookLessThan(String value) {
            addCriterion("PK_ACCOUNTINGBOOK <", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookLessThanOrEqualTo(String value) {
            addCriterion("PK_ACCOUNTINGBOOK <=", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookLike(String value) {
            addCriterion("PK_ACCOUNTINGBOOK like", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookNotLike(String value) {
            addCriterion("PK_ACCOUNTINGBOOK not like", value, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookIn(List<String> values) {
            addCriterion("PK_ACCOUNTINGBOOK in", values, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookNotIn(List<String> values) {
            addCriterion("PK_ACCOUNTINGBOOK not in", values, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookBetween(String value1, String value2) {
            addCriterion("PK_ACCOUNTINGBOOK between", value1, value2, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andPkAccountingbookNotBetween(String value1, String value2) {
            addCriterion("PK_ACCOUNTINGBOOK not between", value1, value2, "pkAccountingbook");
            return (Criteria) this;
        }

        public Criteria andDiscardflagIsNull() {
            addCriterion("DISCARDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDiscardflagIsNotNull() {
            addCriterion("DISCARDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDiscardflagEqualTo(String value) {
            addCriterion("DISCARDFLAG =", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagNotEqualTo(String value) {
            addCriterion("DISCARDFLAG <>", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagGreaterThan(String value) {
            addCriterion("DISCARDFLAG >", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagGreaterThanOrEqualTo(String value) {
            addCriterion("DISCARDFLAG >=", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagLessThan(String value) {
            addCriterion("DISCARDFLAG <", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagLessThanOrEqualTo(String value) {
            addCriterion("DISCARDFLAG <=", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagLike(String value) {
            addCriterion("DISCARDFLAG like", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagNotLike(String value) {
            addCriterion("DISCARDFLAG not like", value, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagIn(List<String> values) {
            addCriterion("DISCARDFLAG in", values, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagNotIn(List<String> values) {
            addCriterion("DISCARDFLAG not in", values, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagBetween(String value1, String value2) {
            addCriterion("DISCARDFLAG between", value1, value2, "discardflag");
            return (Criteria) this;
        }

        public Criteria andDiscardflagNotBetween(String value1, String value2) {
            addCriterion("DISCARDFLAG not between", value1, value2, "discardflag");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("PERIOD like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("PERIOD not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andCNoIsNull() {
            addCriterion("C_NO is null");
            return (Criteria) this;
        }

        public Criteria andCNoIsNotNull() {
            addCriterion("C_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCNoEqualTo(Integer value) {
            addCriterion("C_NO =", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotEqualTo(Integer value) {
            addCriterion("C_NO <>", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThan(Integer value) {
            addCriterion("C_NO >", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_NO >=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThan(Integer value) {
            addCriterion("C_NO <", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThanOrEqualTo(Integer value) {
            addCriterion("C_NO <=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoIn(List<Integer> values) {
            addCriterion("C_NO in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotIn(List<Integer> values) {
            addCriterion("C_NO not in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoBetween(Integer value1, Integer value2) {
            addCriterion("C_NO between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotBetween(Integer value1, Integer value2) {
            addCriterion("C_NO not between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("ATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("ATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(Integer value) {
            addCriterion("ATTACHMENT =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(Integer value) {
            addCriterion("ATTACHMENT <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(Integer value) {
            addCriterion("ATTACHMENT >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTACHMENT >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(Integer value) {
            addCriterion("ATTACHMENT <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(Integer value) {
            addCriterion("ATTACHMENT <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<Integer> values) {
            addCriterion("ATTACHMENT in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<Integer> values) {
            addCriterion("ATTACHMENT not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(Integer value1, Integer value2) {
            addCriterion("ATTACHMENT between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(Integer value1, Integer value2) {
            addCriterion("ATTACHMENT not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andPrepareddateIsNull() {
            addCriterion("PREPAREDDATE is null");
            return (Criteria) this;
        }

        public Criteria andPrepareddateIsNotNull() {
            addCriterion("PREPAREDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareddateEqualTo(String value) {
            addCriterion("PREPAREDDATE =", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateNotEqualTo(String value) {
            addCriterion("PREPAREDDATE <>", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateGreaterThan(String value) {
            addCriterion("PREPAREDDATE >", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateGreaterThanOrEqualTo(String value) {
            addCriterion("PREPAREDDATE >=", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateLessThan(String value) {
            addCriterion("PREPAREDDATE <", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateLessThanOrEqualTo(String value) {
            addCriterion("PREPAREDDATE <=", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateLike(String value) {
            addCriterion("PREPAREDDATE like", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateNotLike(String value) {
            addCriterion("PREPAREDDATE not like", value, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateIn(List<String> values) {
            addCriterion("PREPAREDDATE in", values, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateNotIn(List<String> values) {
            addCriterion("PREPAREDDATE not in", values, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateBetween(String value1, String value2) {
            addCriterion("PREPAREDDATE between", value1, value2, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPrepareddateNotBetween(String value1, String value2) {
            addCriterion("PREPAREDDATE not between", value1, value2, "prepareddate");
            return (Criteria) this;
        }

        public Criteria andPkCasherIsNull() {
            addCriterion("PK_CASHER is null");
            return (Criteria) this;
        }

        public Criteria andPkCasherIsNotNull() {
            addCriterion("PK_CASHER is not null");
            return (Criteria) this;
        }

        public Criteria andPkCasherEqualTo(String value) {
            addCriterion("PK_CASHER =", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherNotEqualTo(String value) {
            addCriterion("PK_CASHER <>", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherGreaterThan(String value) {
            addCriterion("PK_CASHER >", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CASHER >=", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherLessThan(String value) {
            addCriterion("PK_CASHER <", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherLessThanOrEqualTo(String value) {
            addCriterion("PK_CASHER <=", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherLike(String value) {
            addCriterion("PK_CASHER like", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherNotLike(String value) {
            addCriterion("PK_CASHER not like", value, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherIn(List<String> values) {
            addCriterion("PK_CASHER in", values, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherNotIn(List<String> values) {
            addCriterion("PK_CASHER not in", values, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherBetween(String value1, String value2) {
            addCriterion("PK_CASHER between", value1, value2, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andPkCasherNotBetween(String value1, String value2) {
            addCriterion("PK_CASHER not between", value1, value2, "pkCasher");
            return (Criteria) this;
        }

        public Criteria andSignflagIsNull() {
            addCriterion("SIGNFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSignflagIsNotNull() {
            addCriterion("SIGNFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSignflagEqualTo(String value) {
            addCriterion("SIGNFLAG =", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagNotEqualTo(String value) {
            addCriterion("SIGNFLAG <>", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagGreaterThan(String value) {
            addCriterion("SIGNFLAG >", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNFLAG >=", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagLessThan(String value) {
            addCriterion("SIGNFLAG <", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagLessThanOrEqualTo(String value) {
            addCriterion("SIGNFLAG <=", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagLike(String value) {
            addCriterion("SIGNFLAG like", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagNotLike(String value) {
            addCriterion("SIGNFLAG not like", value, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagIn(List<String> values) {
            addCriterion("SIGNFLAG in", values, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagNotIn(List<String> values) {
            addCriterion("SIGNFLAG not in", values, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagBetween(String value1, String value2) {
            addCriterion("SIGNFLAG between", value1, value2, "signflag");
            return (Criteria) this;
        }

        public Criteria andSignflagNotBetween(String value1, String value2) {
            addCriterion("SIGNFLAG not between", value1, value2, "signflag");
            return (Criteria) this;
        }

        public Criteria andPkCheckedIsNull() {
            addCriterion("PK_CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andPkCheckedIsNotNull() {
            addCriterion("PK_CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andPkCheckedEqualTo(String value) {
            addCriterion("PK_CHECKED =", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedNotEqualTo(String value) {
            addCriterion("PK_CHECKED <>", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedGreaterThan(String value) {
            addCriterion("PK_CHECKED >", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CHECKED >=", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedLessThan(String value) {
            addCriterion("PK_CHECKED <", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedLessThanOrEqualTo(String value) {
            addCriterion("PK_CHECKED <=", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedLike(String value) {
            addCriterion("PK_CHECKED like", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedNotLike(String value) {
            addCriterion("PK_CHECKED not like", value, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedIn(List<String> values) {
            addCriterion("PK_CHECKED in", values, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedNotIn(List<String> values) {
            addCriterion("PK_CHECKED not in", values, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedBetween(String value1, String value2) {
            addCriterion("PK_CHECKED between", value1, value2, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andPkCheckedNotBetween(String value1, String value2) {
            addCriterion("PK_CHECKED not between", value1, value2, "pkChecked");
            return (Criteria) this;
        }

        public Criteria andTallydateIsNull() {
            addCriterion("TALLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andTallydateIsNotNull() {
            addCriterion("TALLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTallydateEqualTo(String value) {
            addCriterion("TALLYDATE =", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateNotEqualTo(String value) {
            addCriterion("TALLYDATE <>", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateGreaterThan(String value) {
            addCriterion("TALLYDATE >", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateGreaterThanOrEqualTo(String value) {
            addCriterion("TALLYDATE >=", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateLessThan(String value) {
            addCriterion("TALLYDATE <", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateLessThanOrEqualTo(String value) {
            addCriterion("TALLYDATE <=", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateLike(String value) {
            addCriterion("TALLYDATE like", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateNotLike(String value) {
            addCriterion("TALLYDATE not like", value, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateIn(List<String> values) {
            addCriterion("TALLYDATE in", values, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateNotIn(List<String> values) {
            addCriterion("TALLYDATE not in", values, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateBetween(String value1, String value2) {
            addCriterion("TALLYDATE between", value1, value2, "tallydate");
            return (Criteria) this;
        }

        public Criteria andTallydateNotBetween(String value1, String value2) {
            addCriterion("TALLYDATE not between", value1, value2, "tallydate");
            return (Criteria) this;
        }

        public Criteria andPkManagerIsNull() {
            addCriterion("PK_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andPkManagerIsNotNull() {
            addCriterion("PK_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andPkManagerEqualTo(String value) {
            addCriterion("PK_MANAGER =", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotEqualTo(String value) {
            addCriterion("PK_MANAGER <>", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerGreaterThan(String value) {
            addCriterion("PK_MANAGER >", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PK_MANAGER >=", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLessThan(String value) {
            addCriterion("PK_MANAGER <", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLessThanOrEqualTo(String value) {
            addCriterion("PK_MANAGER <=", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLike(String value) {
            addCriterion("PK_MANAGER like", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotLike(String value) {
            addCriterion("PK_MANAGER not like", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerIn(List<String> values) {
            addCriterion("PK_MANAGER in", values, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotIn(List<String> values) {
            addCriterion("PK_MANAGER not in", values, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerBetween(String value1, String value2) {
            addCriterion("PK_MANAGER between", value1, value2, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotBetween(String value1, String value2) {
            addCriterion("PK_MANAGER not between", value1, value2, "pkManager");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusIsNull() {
            addCriterion("TRANSLATE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusIsNotNull() {
            addCriterion("TRANSLATE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusEqualTo(String value) {
            addCriterion("TRANSLATE_STATUS =", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusNotEqualTo(String value) {
            addCriterion("TRANSLATE_STATUS <>", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusGreaterThan(String value) {
            addCriterion("TRANSLATE_STATUS >", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_STATUS >=", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusLessThan(String value) {
            addCriterion("TRANSLATE_STATUS <", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_STATUS <=", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusLike(String value) {
            addCriterion("TRANSLATE_STATUS like", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusNotLike(String value) {
            addCriterion("TRANSLATE_STATUS not like", value, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusIn(List<String> values) {
            addCriterion("TRANSLATE_STATUS in", values, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusNotIn(List<String> values) {
            addCriterion("TRANSLATE_STATUS not in", values, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusBetween(String value1, String value2) {
            addCriterion("TRANSLATE_STATUS between", value1, value2, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateStatusNotBetween(String value1, String value2) {
            addCriterion("TRANSLATE_STATUS not between", value1, value2, "translateStatus");
            return (Criteria) this;
        }

        public Criteria andTranslateMesIsNull() {
            addCriterion("TRANSLATE_MES is null");
            return (Criteria) this;
        }

        public Criteria andTranslateMesIsNotNull() {
            addCriterion("TRANSLATE_MES is not null");
            return (Criteria) this;
        }

        public Criteria andTranslateMesEqualTo(String value) {
            addCriterion("TRANSLATE_MES =", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesNotEqualTo(String value) {
            addCriterion("TRANSLATE_MES <>", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesGreaterThan(String value) {
            addCriterion("TRANSLATE_MES >", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_MES >=", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesLessThan(String value) {
            addCriterion("TRANSLATE_MES <", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_MES <=", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesLike(String value) {
            addCriterion("TRANSLATE_MES like", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesNotLike(String value) {
            addCriterion("TRANSLATE_MES not like", value, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesIn(List<String> values) {
            addCriterion("TRANSLATE_MES in", values, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesNotIn(List<String> values) {
            addCriterion("TRANSLATE_MES not in", values, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesBetween(String value1, String value2) {
            addCriterion("TRANSLATE_MES between", value1, value2, "translateMes");
            return (Criteria) this;
        }

        public Criteria andTranslateMesNotBetween(String value1, String value2) {
            addCriterion("TRANSLATE_MES not between", value1, value2, "translateMes");
            return (Criteria) this;
        }

        public Criteria andPkNcidIsNull() {
            addCriterion("PK_NCID is null");
            return (Criteria) this;
        }

        public Criteria andPkNcidIsNotNull() {
            addCriterion("PK_NCID is not null");
            return (Criteria) this;
        }

        public Criteria andPkNcidEqualTo(String value) {
            addCriterion("PK_NCID =", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidNotEqualTo(String value) {
            addCriterion("PK_NCID <>", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidGreaterThan(String value) {
            addCriterion("PK_NCID >", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidGreaterThanOrEqualTo(String value) {
            addCriterion("PK_NCID >=", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidLessThan(String value) {
            addCriterion("PK_NCID <", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidLessThanOrEqualTo(String value) {
            addCriterion("PK_NCID <=", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidLike(String value) {
            addCriterion("PK_NCID like", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidNotLike(String value) {
            addCriterion("PK_NCID not like", value, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidIn(List<String> values) {
            addCriterion("PK_NCID in", values, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidNotIn(List<String> values) {
            addCriterion("PK_NCID not in", values, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidBetween(String value1, String value2) {
            addCriterion("PK_NCID between", value1, value2, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andPkNcidNotBetween(String value1, String value2) {
            addCriterion("PK_NCID not between", value1, value2, "pkNcid");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andFree1IsNull() {
            addCriterion("FREE1 is null");
            return (Criteria) this;
        }

        public Criteria andFree1IsNotNull() {
            addCriterion("FREE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFree1EqualTo(String value) {
            addCriterion("FREE1 =", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotEqualTo(String value) {
            addCriterion("FREE1 <>", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThan(String value) {
            addCriterion("FREE1 >", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThanOrEqualTo(String value) {
            addCriterion("FREE1 >=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThan(String value) {
            addCriterion("FREE1 <", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThanOrEqualTo(String value) {
            addCriterion("FREE1 <=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Like(String value) {
            addCriterion("FREE1 like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotLike(String value) {
            addCriterion("FREE1 not like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1In(List<String> values) {
            addCriterion("FREE1 in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotIn(List<String> values) {
            addCriterion("FREE1 not in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Between(String value1, String value2) {
            addCriterion("FREE1 between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotBetween(String value1, String value2) {
            addCriterion("FREE1 not between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree2IsNull() {
            addCriterion("FREE2 is null");
            return (Criteria) this;
        }

        public Criteria andFree2IsNotNull() {
            addCriterion("FREE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFree2EqualTo(String value) {
            addCriterion("FREE2 =", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotEqualTo(String value) {
            addCriterion("FREE2 <>", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThan(String value) {
            addCriterion("FREE2 >", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThanOrEqualTo(String value) {
            addCriterion("FREE2 >=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThan(String value) {
            addCriterion("FREE2 <", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThanOrEqualTo(String value) {
            addCriterion("FREE2 <=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Like(String value) {
            addCriterion("FREE2 like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotLike(String value) {
            addCriterion("FREE2 not like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2In(List<String> values) {
            addCriterion("FREE2 in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotIn(List<String> values) {
            addCriterion("FREE2 not in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Between(String value1, String value2) {
            addCriterion("FREE2 between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotBetween(String value1, String value2) {
            addCriterion("FREE2 not between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andFree3IsNull() {
            addCriterion("FREE3 is null");
            return (Criteria) this;
        }

        public Criteria andFree3IsNotNull() {
            addCriterion("FREE3 is not null");
            return (Criteria) this;
        }

        public Criteria andFree3EqualTo(String value) {
            addCriterion("FREE3 =", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotEqualTo(String value) {
            addCriterion("FREE3 <>", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThan(String value) {
            addCriterion("FREE3 >", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThanOrEqualTo(String value) {
            addCriterion("FREE3 >=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThan(String value) {
            addCriterion("FREE3 <", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThanOrEqualTo(String value) {
            addCriterion("FREE3 <=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Like(String value) {
            addCriterion("FREE3 like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotLike(String value) {
            addCriterion("FREE3 not like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3In(List<String> values) {
            addCriterion("FREE3 in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotIn(List<String> values) {
            addCriterion("FREE3 not in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Between(String value1, String value2) {
            addCriterion("FREE3 between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotBetween(String value1, String value2) {
            addCriterion("FREE3 not between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andFree4IsNull() {
            addCriterion("FREE4 is null");
            return (Criteria) this;
        }

        public Criteria andFree4IsNotNull() {
            addCriterion("FREE4 is not null");
            return (Criteria) this;
        }

        public Criteria andFree4EqualTo(String value) {
            addCriterion("FREE4 =", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotEqualTo(String value) {
            addCriterion("FREE4 <>", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4GreaterThan(String value) {
            addCriterion("FREE4 >", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4GreaterThanOrEqualTo(String value) {
            addCriterion("FREE4 >=", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4LessThan(String value) {
            addCriterion("FREE4 <", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4LessThanOrEqualTo(String value) {
            addCriterion("FREE4 <=", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4Like(String value) {
            addCriterion("FREE4 like", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotLike(String value) {
            addCriterion("FREE4 not like", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4In(List<String> values) {
            addCriterion("FREE4 in", values, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotIn(List<String> values) {
            addCriterion("FREE4 not in", values, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4Between(String value1, String value2) {
            addCriterion("FREE4 between", value1, value2, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotBetween(String value1, String value2) {
            addCriterion("FREE4 not between", value1, value2, "free4");
            return (Criteria) this;
        }

        public Criteria andFree5IsNull() {
            addCriterion("FREE5 is null");
            return (Criteria) this;
        }

        public Criteria andFree5IsNotNull() {
            addCriterion("FREE5 is not null");
            return (Criteria) this;
        }

        public Criteria andFree5EqualTo(String value) {
            addCriterion("FREE5 =", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotEqualTo(String value) {
            addCriterion("FREE5 <>", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5GreaterThan(String value) {
            addCriterion("FREE5 >", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5GreaterThanOrEqualTo(String value) {
            addCriterion("FREE5 >=", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5LessThan(String value) {
            addCriterion("FREE5 <", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5LessThanOrEqualTo(String value) {
            addCriterion("FREE5 <=", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5Like(String value) {
            addCriterion("FREE5 like", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotLike(String value) {
            addCriterion("FREE5 not like", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5In(List<String> values) {
            addCriterion("FREE5 in", values, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotIn(List<String> values) {
            addCriterion("FREE5 not in", values, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5Between(String value1, String value2) {
            addCriterion("FREE5 between", value1, value2, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotBetween(String value1, String value2) {
            addCriterion("FREE5 not between", value1, value2, "free5");
            return (Criteria) this;
        }

        public Criteria andFree6IsNull() {
            addCriterion("FREE6 is null");
            return (Criteria) this;
        }

        public Criteria andFree6IsNotNull() {
            addCriterion("FREE6 is not null");
            return (Criteria) this;
        }

        public Criteria andFree6EqualTo(String value) {
            addCriterion("FREE6 =", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotEqualTo(String value) {
            addCriterion("FREE6 <>", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6GreaterThan(String value) {
            addCriterion("FREE6 >", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6GreaterThanOrEqualTo(String value) {
            addCriterion("FREE6 >=", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6LessThan(String value) {
            addCriterion("FREE6 <", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6LessThanOrEqualTo(String value) {
            addCriterion("FREE6 <=", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6Like(String value) {
            addCriterion("FREE6 like", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotLike(String value) {
            addCriterion("FREE6 not like", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6In(List<String> values) {
            addCriterion("FREE6 in", values, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotIn(List<String> values) {
            addCriterion("FREE6 not in", values, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6Between(String value1, String value2) {
            addCriterion("FREE6 between", value1, value2, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotBetween(String value1, String value2) {
            addCriterion("FREE6 not between", value1, value2, "free6");
            return (Criteria) this;
        }

        public Criteria andFree7IsNull() {
            addCriterion("FREE7 is null");
            return (Criteria) this;
        }

        public Criteria andFree7IsNotNull() {
            addCriterion("FREE7 is not null");
            return (Criteria) this;
        }

        public Criteria andFree7EqualTo(String value) {
            addCriterion("FREE7 =", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7NotEqualTo(String value) {
            addCriterion("FREE7 <>", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7GreaterThan(String value) {
            addCriterion("FREE7 >", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7GreaterThanOrEqualTo(String value) {
            addCriterion("FREE7 >=", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7LessThan(String value) {
            addCriterion("FREE7 <", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7LessThanOrEqualTo(String value) {
            addCriterion("FREE7 <=", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7Like(String value) {
            addCriterion("FREE7 like", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7NotLike(String value) {
            addCriterion("FREE7 not like", value, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7In(List<String> values) {
            addCriterion("FREE7 in", values, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7NotIn(List<String> values) {
            addCriterion("FREE7 not in", values, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7Between(String value1, String value2) {
            addCriterion("FREE7 between", value1, value2, "free7");
            return (Criteria) this;
        }

        public Criteria andFree7NotBetween(String value1, String value2) {
            addCriterion("FREE7 not between", value1, value2, "free7");
            return (Criteria) this;
        }

        public Criteria andFree8IsNull() {
            addCriterion("FREE8 is null");
            return (Criteria) this;
        }

        public Criteria andFree8IsNotNull() {
            addCriterion("FREE8 is not null");
            return (Criteria) this;
        }

        public Criteria andFree8EqualTo(String value) {
            addCriterion("FREE8 =", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8NotEqualTo(String value) {
            addCriterion("FREE8 <>", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8GreaterThan(String value) {
            addCriterion("FREE8 >", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8GreaterThanOrEqualTo(String value) {
            addCriterion("FREE8 >=", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8LessThan(String value) {
            addCriterion("FREE8 <", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8LessThanOrEqualTo(String value) {
            addCriterion("FREE8 <=", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8Like(String value) {
            addCriterion("FREE8 like", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8NotLike(String value) {
            addCriterion("FREE8 not like", value, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8In(List<String> values) {
            addCriterion("FREE8 in", values, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8NotIn(List<String> values) {
            addCriterion("FREE8 not in", values, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8Between(String value1, String value2) {
            addCriterion("FREE8 between", value1, value2, "free8");
            return (Criteria) this;
        }

        public Criteria andFree8NotBetween(String value1, String value2) {
            addCriterion("FREE8 not between", value1, value2, "free8");
            return (Criteria) this;
        }

        public Criteria andFree9IsNull() {
            addCriterion("FREE9 is null");
            return (Criteria) this;
        }

        public Criteria andFree9IsNotNull() {
            addCriterion("FREE9 is not null");
            return (Criteria) this;
        }

        public Criteria andFree9EqualTo(String value) {
            addCriterion("FREE9 =", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9NotEqualTo(String value) {
            addCriterion("FREE9 <>", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9GreaterThan(String value) {
            addCriterion("FREE9 >", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9GreaterThanOrEqualTo(String value) {
            addCriterion("FREE9 >=", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9LessThan(String value) {
            addCriterion("FREE9 <", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9LessThanOrEqualTo(String value) {
            addCriterion("FREE9 <=", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9Like(String value) {
            addCriterion("FREE9 like", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9NotLike(String value) {
            addCriterion("FREE9 not like", value, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9In(List<String> values) {
            addCriterion("FREE9 in", values, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9NotIn(List<String> values) {
            addCriterion("FREE9 not in", values, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9Between(String value1, String value2) {
            addCriterion("FREE9 between", value1, value2, "free9");
            return (Criteria) this;
        }

        public Criteria andFree9NotBetween(String value1, String value2) {
            addCriterion("FREE9 not between", value1, value2, "free9");
            return (Criteria) this;
        }

        public Criteria andFree10IsNull() {
            addCriterion("FREE10 is null");
            return (Criteria) this;
        }

        public Criteria andFree10IsNotNull() {
            addCriterion("FREE10 is not null");
            return (Criteria) this;
        }

        public Criteria andFree10EqualTo(String value) {
            addCriterion("FREE10 =", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10NotEqualTo(String value) {
            addCriterion("FREE10 <>", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10GreaterThan(String value) {
            addCriterion("FREE10 >", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10GreaterThanOrEqualTo(String value) {
            addCriterion("FREE10 >=", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10LessThan(String value) {
            addCriterion("FREE10 <", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10LessThanOrEqualTo(String value) {
            addCriterion("FREE10 <=", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10Like(String value) {
            addCriterion("FREE10 like", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10NotLike(String value) {
            addCriterion("FREE10 not like", value, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10In(List<String> values) {
            addCriterion("FREE10 in", values, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10NotIn(List<String> values) {
            addCriterion("FREE10 not in", values, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10Between(String value1, String value2) {
            addCriterion("FREE10 between", value1, value2, "free10");
            return (Criteria) this;
        }

        public Criteria andFree10NotBetween(String value1, String value2) {
            addCriterion("FREE10 not between", value1, value2, "free10");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNull() {
            addCriterion("EXPLANATION is null");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNotNull() {
            addCriterion("EXPLANATION is not null");
            return (Criteria) this;
        }

        public Criteria andExplanationEqualTo(String value) {
            addCriterion("EXPLANATION =", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotEqualTo(String value) {
            addCriterion("EXPLANATION <>", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThan(String value) {
            addCriterion("EXPLANATION >", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLANATION >=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThan(String value) {
            addCriterion("EXPLANATION <", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThanOrEqualTo(String value) {
            addCriterion("EXPLANATION <=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLike(String value) {
            addCriterion("EXPLANATION like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotLike(String value) {
            addCriterion("EXPLANATION not like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationIn(List<String> values) {
            addCriterion("EXPLANATION in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotIn(List<String> values) {
            addCriterion("EXPLANATION not in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationBetween(String value1, String value2) {
            addCriterion("EXPLANATION between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotBetween(String value1, String value2) {
            addCriterion("EXPLANATION not between", value1, value2, "explanation");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : hicmi_mid_acc_main
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
     * @Table : hicmi_mid_acc_main
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