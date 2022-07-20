package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxbackreportTdExample {
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
    public MmTaxbackreportTdExample() {
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
     * @Table : mm_taxbackreport_td
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

        public Criteria andComcodeIsNull() {
            addCriterion("COMCODE is null");
            return (Criteria) this;
        }

        public Criteria andComcodeIsNotNull() {
            addCriterion("COMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andComcodeEqualTo(String value) {
            addCriterion("COMCODE =", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotEqualTo(String value) {
            addCriterion("COMCODE <>", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThan(String value) {
            addCriterion("COMCODE >", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMCODE >=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThan(String value) {
            addCriterion("COMCODE <", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThanOrEqualTo(String value) {
            addCriterion("COMCODE <=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLike(String value) {
            addCriterion("COMCODE like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotLike(String value) {
            addCriterion("COMCODE not like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeIn(List<String> values) {
            addCriterion("COMCODE in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotIn(List<String> values) {
            addCriterion("COMCODE not in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeBetween(String value1, String value2) {
            addCriterion("COMCODE between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotBetween(String value1, String value2) {
            addCriterion("COMCODE not between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("DATETIME =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("DATETIME <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("DATETIME >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATETIME >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("DATETIME <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("DATETIME <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("DATETIME like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("DATETIME not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("DATETIME in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("DATETIME not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("DATETIME between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("DATETIME not between", value1, value2, "datetime");
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

        public Criteria andRequesttypeIsNull() {
            addCriterion("REQUESTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRequesttypeIsNotNull() {
            addCriterion("REQUESTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRequesttypeEqualTo(String value) {
            addCriterion("REQUESTTYPE =", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotEqualTo(String value) {
            addCriterion("REQUESTTYPE <>", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeGreaterThan(String value) {
            addCriterion("REQUESTTYPE >", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTTYPE >=", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLessThan(String value) {
            addCriterion("REQUESTTYPE <", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLessThanOrEqualTo(String value) {
            addCriterion("REQUESTTYPE <=", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLike(String value) {
            addCriterion("REQUESTTYPE like", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotLike(String value) {
            addCriterion("REQUESTTYPE not like", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeIn(List<String> values) {
            addCriterion("REQUESTTYPE in", values, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotIn(List<String> values) {
            addCriterion("REQUESTTYPE not in", values, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeBetween(String value1, String value2) {
            addCriterion("REQUESTTYPE between", value1, value2, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotBetween(String value1, String value2) {
            addCriterion("REQUESTTYPE not between", value1, value2, "requesttype");
            return (Criteria) this;
        }

        public Criteria andResponsecodeIsNull() {
            addCriterion("RESPONSECODE is null");
            return (Criteria) this;
        }

        public Criteria andResponsecodeIsNotNull() {
            addCriterion("RESPONSECODE is not null");
            return (Criteria) this;
        }

        public Criteria andResponsecodeEqualTo(String value) {
            addCriterion("RESPONSECODE =", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeNotEqualTo(String value) {
            addCriterion("RESPONSECODE <>", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeGreaterThan(String value) {
            addCriterion("RESPONSECODE >", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSECODE >=", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeLessThan(String value) {
            addCriterion("RESPONSECODE <", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeLessThanOrEqualTo(String value) {
            addCriterion("RESPONSECODE <=", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeLike(String value) {
            addCriterion("RESPONSECODE like", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeNotLike(String value) {
            addCriterion("RESPONSECODE not like", value, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeIn(List<String> values) {
            addCriterion("RESPONSECODE in", values, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeNotIn(List<String> values) {
            addCriterion("RESPONSECODE not in", values, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeBetween(String value1, String value2) {
            addCriterion("RESPONSECODE between", value1, value2, "responsecode");
            return (Criteria) this;
        }

        public Criteria andResponsecodeNotBetween(String value1, String value2) {
            addCriterion("RESPONSECODE not between", value1, value2, "responsecode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("ERRORCODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("ERRORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(String value) {
            addCriterion("ERRORCODE =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(String value) {
            addCriterion("ERRORCODE <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(String value) {
            addCriterion("ERRORCODE >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORCODE >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(String value) {
            addCriterion("ERRORCODE <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("ERRORCODE <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLike(String value) {
            addCriterion("ERRORCODE like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotLike(String value) {
            addCriterion("ERRORCODE not like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<String> values) {
            addCriterion("ERRORCODE in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<String> values) {
            addCriterion("ERRORCODE not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(String value1, String value2) {
            addCriterion("ERRORCODE between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(String value1, String value2) {
            addCriterion("ERRORCODE not between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrormessageIsNull() {
            addCriterion("ERRORMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andErrormessageIsNotNull() {
            addCriterion("ERRORMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andErrormessageEqualTo(String value) {
            addCriterion("ERRORMESSAGE =", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotEqualTo(String value) {
            addCriterion("ERRORMESSAGE <>", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageGreaterThan(String value) {
            addCriterion("ERRORMESSAGE >", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMESSAGE >=", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLessThan(String value) {
            addCriterion("ERRORMESSAGE <", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLessThanOrEqualTo(String value) {
            addCriterion("ERRORMESSAGE <=", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLike(String value) {
            addCriterion("ERRORMESSAGE like", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotLike(String value) {
            addCriterion("ERRORMESSAGE not like", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageIn(List<String> values) {
            addCriterion("ERRORMESSAGE in", values, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotIn(List<String> values) {
            addCriterion("ERRORMESSAGE not in", values, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageBetween(String value1, String value2) {
            addCriterion("ERRORMESSAGE between", value1, value2, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotBetween(String value1, String value2) {
            addCriterion("ERRORMESSAGE not between", value1, value2, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailIsNull() {
            addCriterion("ERRORCODEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailIsNotNull() {
            addCriterion("ERRORCODEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailEqualTo(String value) {
            addCriterion("ERRORCODEDETAIL =", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailNotEqualTo(String value) {
            addCriterion("ERRORCODEDETAIL <>", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailGreaterThan(String value) {
            addCriterion("ERRORCODEDETAIL >", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORCODEDETAIL >=", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailLessThan(String value) {
            addCriterion("ERRORCODEDETAIL <", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailLessThanOrEqualTo(String value) {
            addCriterion("ERRORCODEDETAIL <=", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailLike(String value) {
            addCriterion("ERRORCODEDETAIL like", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailNotLike(String value) {
            addCriterion("ERRORCODEDETAIL not like", value, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailIn(List<String> values) {
            addCriterion("ERRORCODEDETAIL in", values, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailNotIn(List<String> values) {
            addCriterion("ERRORCODEDETAIL not in", values, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailBetween(String value1, String value2) {
            addCriterion("ERRORCODEDETAIL between", value1, value2, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrorcodedetailNotBetween(String value1, String value2) {
            addCriterion("ERRORCODEDETAIL not between", value1, value2, "errorcodedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailIsNull() {
            addCriterion("ERRORMESSAGEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailIsNotNull() {
            addCriterion("ERRORMESSAGEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailEqualTo(String value) {
            addCriterion("ERRORMESSAGEDETAIL =", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailNotEqualTo(String value) {
            addCriterion("ERRORMESSAGEDETAIL <>", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailGreaterThan(String value) {
            addCriterion("ERRORMESSAGEDETAIL >", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMESSAGEDETAIL >=", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailLessThan(String value) {
            addCriterion("ERRORMESSAGEDETAIL <", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailLessThanOrEqualTo(String value) {
            addCriterion("ERRORMESSAGEDETAIL <=", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailLike(String value) {
            addCriterion("ERRORMESSAGEDETAIL like", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailNotLike(String value) {
            addCriterion("ERRORMESSAGEDETAIL not like", value, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailIn(List<String> values) {
            addCriterion("ERRORMESSAGEDETAIL in", values, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailNotIn(List<String> values) {
            addCriterion("ERRORMESSAGEDETAIL not in", values, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailBetween(String value1, String value2) {
            addCriterion("ERRORMESSAGEDETAIL between", value1, value2, "errormessagedetail");
            return (Criteria) this;
        }

        public Criteria andErrormessagedetailNotBetween(String value1, String value2) {
            addCriterion("ERRORMESSAGEDETAIL not between", value1, value2, "errormessagedetail");
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

        public Criteria andIfuploadIsNull() {
            addCriterion("IFUPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNotNull() {
            addCriterion("IFUPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIfuploadEqualTo(String value) {
            addCriterion("IFUPLOAD =", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotEqualTo(String value) {
            addCriterion("IFUPLOAD <>", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThan(String value) {
            addCriterion("IFUPLOAD >", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD >=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThan(String value) {
            addCriterion("IFUPLOAD <", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD <=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLike(String value) {
            addCriterion("IFUPLOAD like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotLike(String value) {
            addCriterion("IFUPLOAD not like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadIn(List<String> values) {
            addCriterion("IFUPLOAD in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotIn(List<String> values) {
            addCriterion("IFUPLOAD not in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadBetween(String value1, String value2) {
            addCriterion("IFUPLOAD between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotBetween(String value1, String value2) {
            addCriterion("IFUPLOAD not between", value1, value2, "ifupload");
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

        public Criteria andSeqpolicyEqualTo(String value) {
            addCriterion("SEQPOLICY =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(String value) {
            addCriterion("SEQPOLICY <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(String value) {
            addCriterion("SEQPOLICY >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(String value) {
            addCriterion("SEQPOLICY >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(String value) {
            addCriterion("SEQPOLICY <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(String value) {
            addCriterion("SEQPOLICY <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLike(String value) {
            addCriterion("SEQPOLICY like", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotLike(String value) {
            addCriterion("SEQPOLICY not like", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<String> values) {
            addCriterion("SEQPOLICY in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<String> values) {
            addCriterion("SEQPOLICY not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(String value1, String value2) {
            addCriterion("SEQPOLICY between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(String value1, String value2) {
            addCriterion("SEQPOLICY not between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNull() {
            addCriterion("CONFIRMSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNotNull() {
            addCriterion("CONFIRMSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO =", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <>", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThan(String value) {
            addCriterion("CONFIRMSEQUENCENO >", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO >=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThan(String value) {
            addCriterion("CONFIRMSEQUENCENO <", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLike(String value) {
            addCriterion("CONFIRMSEQUENCENO like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotLike(String value) {
            addCriterion("CONFIRMSEQUENCENO not like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO not in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO not between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxbackreport_td
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
     * @Table : mm_taxbackreport_td
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