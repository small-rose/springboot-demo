package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvoiceBackTiExample {
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
    public MmInvoiceBackTiExample() {
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
     * @Table : mm_invoice_back_ti
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

        public Criteria andReqserialnoIsNull() {
            addCriterion("REQSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andReqserialnoIsNotNull() {
            addCriterion("REQSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andReqserialnoEqualTo(String value) {
            addCriterion("REQSERIALNO =", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoNotEqualTo(String value) {
            addCriterion("REQSERIALNO <>", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoGreaterThan(String value) {
            addCriterion("REQSERIALNO >", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("REQSERIALNO >=", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoLessThan(String value) {
            addCriterion("REQSERIALNO <", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoLessThanOrEqualTo(String value) {
            addCriterion("REQSERIALNO <=", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoLike(String value) {
            addCriterion("REQSERIALNO like", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoNotLike(String value) {
            addCriterion("REQSERIALNO not like", value, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoIn(List<String> values) {
            addCriterion("REQSERIALNO in", values, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoNotIn(List<String> values) {
            addCriterion("REQSERIALNO not in", values, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoBetween(String value1, String value2) {
            addCriterion("REQSERIALNO between", value1, value2, "reqserialno");
            return (Criteria) this;
        }

        public Criteria andReqserialnoNotBetween(String value1, String value2) {
            addCriterion("REQSERIALNO not between", value1, value2, "reqserialno");
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

        public Criteria andFlowintimeIsNull() {
            addCriterion("FLOWINTIME is null");
            return (Criteria) this;
        }

        public Criteria andFlowintimeIsNotNull() {
            addCriterion("FLOWINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFlowintimeEqualTo(String value) {
            addCriterion("FLOWINTIME =", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeNotEqualTo(String value) {
            addCriterion("FLOWINTIME <>", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeGreaterThan(String value) {
            addCriterion("FLOWINTIME >", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWINTIME >=", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeLessThan(String value) {
            addCriterion("FLOWINTIME <", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeLessThanOrEqualTo(String value) {
            addCriterion("FLOWINTIME <=", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeLike(String value) {
            addCriterion("FLOWINTIME like", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeNotLike(String value) {
            addCriterion("FLOWINTIME not like", value, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeIn(List<String> values) {
            addCriterion("FLOWINTIME in", values, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeNotIn(List<String> values) {
            addCriterion("FLOWINTIME not in", values, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeBetween(String value1, String value2) {
            addCriterion("FLOWINTIME between", value1, value2, "flowintime");
            return (Criteria) this;
        }

        public Criteria andFlowintimeNotBetween(String value1, String value2) {
            addCriterion("FLOWINTIME not between", value1, value2, "flowintime");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNull() {
            addCriterion("INVOICEID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("INVOICEID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(String value) {
            addCriterion("INVOICEID =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(String value) {
            addCriterion("INVOICEID <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(String value) {
            addCriterion("INVOICEID >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEID >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(String value) {
            addCriterion("INVOICEID <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(String value) {
            addCriterion("INVOICEID <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLike(String value) {
            addCriterion("INVOICEID like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotLike(String value) {
            addCriterion("INVOICEID not like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<String> values) {
            addCriterion("INVOICEID in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<String> values) {
            addCriterion("INVOICEID not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(String value1, String value2) {
            addCriterion("INVOICEID between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(String value1, String value2) {
            addCriterion("INVOICEID not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNull() {
            addCriterion("INVOICECODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNotNull() {
            addCriterion("INVOICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeEqualTo(String value) {
            addCriterion("INVOICECODE =", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotEqualTo(String value) {
            addCriterion("INVOICECODE <>", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThan(String value) {
            addCriterion("INVOICECODE >", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICECODE >=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThan(String value) {
            addCriterion("INVOICECODE <", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICECODE <=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLike(String value) {
            addCriterion("INVOICECODE like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotLike(String value) {
            addCriterion("INVOICECODE not like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIn(List<String> values) {
            addCriterion("INVOICECODE in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotIn(List<String> values) {
            addCriterion("INVOICECODE not in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeBetween(String value1, String value2) {
            addCriterion("INVOICECODE between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotBetween(String value1, String value2) {
            addCriterion("INVOICECODE not between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("INVOICENO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("INVOICENO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("INVOICENO =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("INVOICENO <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("INVOICENO >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICENO >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("INVOICENO <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("INVOICENO <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("INVOICENO like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("INVOICENO not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("INVOICENO in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("INVOICENO not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("INVOICENO between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("INVOICENO not between", value1, value2, "invoiceno");
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

        public Criteria andInvoicestatusIsNull() {
            addCriterion("INVOICESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIsNotNull() {
            addCriterion("INVOICESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusEqualTo(String value) {
            addCriterion("INVOICESTATUS =", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotEqualTo(String value) {
            addCriterion("INVOICESTATUS <>", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThan(String value) {
            addCriterion("INVOICESTATUS >", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICESTATUS >=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThan(String value) {
            addCriterion("INVOICESTATUS <", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThanOrEqualTo(String value) {
            addCriterion("INVOICESTATUS <=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLike(String value) {
            addCriterion("INVOICESTATUS like", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotLike(String value) {
            addCriterion("INVOICESTATUS not like", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIn(List<String> values) {
            addCriterion("INVOICESTATUS in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotIn(List<String> values) {
            addCriterion("INVOICESTATUS not in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusBetween(String value1, String value2) {
            addCriterion("INVOICESTATUS between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotBetween(String value1, String value2) {
            addCriterion("INVOICESTATUS not between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReviewpersonIsNull() {
            addCriterion("REVIEWPERSON is null");
            return (Criteria) this;
        }

        public Criteria andReviewpersonIsNotNull() {
            addCriterion("REVIEWPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReviewpersonEqualTo(String value) {
            addCriterion("REVIEWPERSON =", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonNotEqualTo(String value) {
            addCriterion("REVIEWPERSON <>", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonGreaterThan(String value) {
            addCriterion("REVIEWPERSON >", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWPERSON >=", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonLessThan(String value) {
            addCriterion("REVIEWPERSON <", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonLessThanOrEqualTo(String value) {
            addCriterion("REVIEWPERSON <=", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonLike(String value) {
            addCriterion("REVIEWPERSON like", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonNotLike(String value) {
            addCriterion("REVIEWPERSON not like", value, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonIn(List<String> values) {
            addCriterion("REVIEWPERSON in", values, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonNotIn(List<String> values) {
            addCriterion("REVIEWPERSON not in", values, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonBetween(String value1, String value2) {
            addCriterion("REVIEWPERSON between", value1, value2, "reviewperson");
            return (Criteria) this;
        }

        public Criteria andReviewpersonNotBetween(String value1, String value2) {
            addCriterion("REVIEWPERSON not between", value1, value2, "reviewperson");
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

        public Criteria andReturncanldateIsNull() {
            addCriterion("RETURNCANLDATE is null");
            return (Criteria) this;
        }

        public Criteria andReturncanldateIsNotNull() {
            addCriterion("RETURNCANLDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturncanldateEqualTo(Date value) {
            addCriterion("RETURNCANLDATE =", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateNotEqualTo(Date value) {
            addCriterion("RETURNCANLDATE <>", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateGreaterThan(Date value) {
            addCriterion("RETURNCANLDATE >", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNCANLDATE >=", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateLessThan(Date value) {
            addCriterion("RETURNCANLDATE <", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateLessThanOrEqualTo(Date value) {
            addCriterion("RETURNCANLDATE <=", value, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateIn(List<Date> values) {
            addCriterion("RETURNCANLDATE in", values, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateNotIn(List<Date> values) {
            addCriterion("RETURNCANLDATE not in", values, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateBetween(Date value1, Date value2) {
            addCriterion("RETURNCANLDATE between", value1, value2, "returncanldate");
            return (Criteria) this;
        }

        public Criteria andReturncanldateNotBetween(Date value1, Date value2) {
            addCriterion("RETURNCANLDATE not between", value1, value2, "returncanldate");
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

        public Criteria andLandstatusIsNull() {
            addCriterion("LANDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andLandstatusIsNotNull() {
            addCriterion("LANDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLandstatusEqualTo(String value) {
            addCriterion("LANDSTATUS =", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusNotEqualTo(String value) {
            addCriterion("LANDSTATUS <>", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusGreaterThan(String value) {
            addCriterion("LANDSTATUS >", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusGreaterThanOrEqualTo(String value) {
            addCriterion("LANDSTATUS >=", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusLessThan(String value) {
            addCriterion("LANDSTATUS <", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusLessThanOrEqualTo(String value) {
            addCriterion("LANDSTATUS <=", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusLike(String value) {
            addCriterion("LANDSTATUS like", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusNotLike(String value) {
            addCriterion("LANDSTATUS not like", value, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusIn(List<String> values) {
            addCriterion("LANDSTATUS in", values, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusNotIn(List<String> values) {
            addCriterion("LANDSTATUS not in", values, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusBetween(String value1, String value2) {
            addCriterion("LANDSTATUS between", value1, value2, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandstatusNotBetween(String value1, String value2) {
            addCriterion("LANDSTATUS not between", value1, value2, "landstatus");
            return (Criteria) this;
        }

        public Criteria andLandmsgIsNull() {
            addCriterion("LANDMSG is null");
            return (Criteria) this;
        }

        public Criteria andLandmsgIsNotNull() {
            addCriterion("LANDMSG is not null");
            return (Criteria) this;
        }

        public Criteria andLandmsgEqualTo(String value) {
            addCriterion("LANDMSG =", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgNotEqualTo(String value) {
            addCriterion("LANDMSG <>", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgGreaterThan(String value) {
            addCriterion("LANDMSG >", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgGreaterThanOrEqualTo(String value) {
            addCriterion("LANDMSG >=", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgLessThan(String value) {
            addCriterion("LANDMSG <", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgLessThanOrEqualTo(String value) {
            addCriterion("LANDMSG <=", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgLike(String value) {
            addCriterion("LANDMSG like", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgNotLike(String value) {
            addCriterion("LANDMSG not like", value, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgIn(List<String> values) {
            addCriterion("LANDMSG in", values, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgNotIn(List<String> values) {
            addCriterion("LANDMSG not in", values, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgBetween(String value1, String value2) {
            addCriterion("LANDMSG between", value1, value2, "landmsg");
            return (Criteria) this;
        }

        public Criteria andLandmsgNotBetween(String value1, String value2) {
            addCriterion("LANDMSG not between", value1, value2, "landmsg");
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

        public Criteria andOpmsgIsNull() {
            addCriterion("OPMSG is null");
            return (Criteria) this;
        }

        public Criteria andOpmsgIsNotNull() {
            addCriterion("OPMSG is not null");
            return (Criteria) this;
        }

        public Criteria andOpmsgEqualTo(String value) {
            addCriterion("OPMSG =", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotEqualTo(String value) {
            addCriterion("OPMSG <>", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgGreaterThan(String value) {
            addCriterion("OPMSG >", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgGreaterThanOrEqualTo(String value) {
            addCriterion("OPMSG >=", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLessThan(String value) {
            addCriterion("OPMSG <", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLessThanOrEqualTo(String value) {
            addCriterion("OPMSG <=", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLike(String value) {
            addCriterion("OPMSG like", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotLike(String value) {
            addCriterion("OPMSG not like", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgIn(List<String> values) {
            addCriterion("OPMSG in", values, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotIn(List<String> values) {
            addCriterion("OPMSG not in", values, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgBetween(String value1, String value2) {
            addCriterion("OPMSG between", value1, value2, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotBetween(String value1, String value2) {
            addCriterion("OPMSG not between", value1, value2, "opmsg");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invoice_back_ti
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
     * @Table : mm_invoice_back_ti
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