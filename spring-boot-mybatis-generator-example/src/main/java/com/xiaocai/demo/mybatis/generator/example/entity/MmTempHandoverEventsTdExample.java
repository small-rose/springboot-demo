package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmTempHandoverEventsTdExample {
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
    public MmTempHandoverEventsTdExample() {
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
     * @Table : mm_temp_handover_events_td
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHandovernoIsNull() {
            addCriterion("handoverno is null");
            return (Criteria) this;
        }

        public Criteria andHandovernoIsNotNull() {
            addCriterion("handoverno is not null");
            return (Criteria) this;
        }

        public Criteria andHandovernoEqualTo(String value) {
            addCriterion("handoverno =", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotEqualTo(String value) {
            addCriterion("handoverno <>", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThan(String value) {
            addCriterion("handoverno >", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoGreaterThanOrEqualTo(String value) {
            addCriterion("handoverno >=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThan(String value) {
            addCriterion("handoverno <", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLessThanOrEqualTo(String value) {
            addCriterion("handoverno <=", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoLike(String value) {
            addCriterion("handoverno like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotLike(String value) {
            addCriterion("handoverno not like", value, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoIn(List<String> values) {
            addCriterion("handoverno in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotIn(List<String> values) {
            addCriterion("handoverno not in", values, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoBetween(String value1, String value2) {
            addCriterion("handoverno between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andHandovernoNotBetween(String value1, String value2) {
            addCriterion("handoverno not between", value1, value2, "handoverno");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subcompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subcompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subcompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subcompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subcompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subcompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subcompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subcompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subcompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subcompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subcompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subcompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subcompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subcompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNull() {
            addCriterion("seqpolicy is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("seqpolicy is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(Long value) {
            addCriterion("seqpolicy =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(Long value) {
            addCriterion("seqpolicy <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(Long value) {
            addCriterion("seqpolicy >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(Long value) {
            addCriterion("seqpolicy >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(Long value) {
            addCriterion("seqpolicy <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(Long value) {
            addCriterion("seqpolicy <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<Long> values) {
            addCriterion("seqpolicy in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<Long> values) {
            addCriterion("seqpolicy not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(Long value1, Long value2) {
            addCriterion("seqpolicy between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(Long value1, Long value2) {
            addCriterion("seqpolicy not between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("policyno is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("policyno is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("policyno =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("policyno <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("policyno >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("policyno >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("policyno <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("policyno <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("policyno like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("policyno not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("policyno in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("policyno not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("policyno between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("policyno not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("opcode is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("opcode is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("opcode =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("opcode <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("opcode >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opcode >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("opcode <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("opcode <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("opcode like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("opcode not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("opcode in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("opcode not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("opcode between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("opcode not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("opdate is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("opdate is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("opdate =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("opdate <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("opdate >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opdate >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("opdate <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opdate <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("opdate in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("opdate not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opdate between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opdate not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNull() {
            addCriterion("canceldate is null");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNotNull() {
            addCriterion("canceldate is not null");
            return (Criteria) this;
        }

        public Criteria andCanceldateEqualTo(Date value) {
            addCriterion("canceldate =", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotEqualTo(Date value) {
            addCriterion("canceldate <>", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThan(Date value) {
            addCriterion("canceldate >", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThanOrEqualTo(Date value) {
            addCriterion("canceldate >=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThan(Date value) {
            addCriterion("canceldate <", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThanOrEqualTo(Date value) {
            addCriterion("canceldate <=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIn(List<Date> values) {
            addCriterion("canceldate in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotIn(List<Date> values) {
            addCriterion("canceldate not in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateBetween(Date value1, Date value2) {
            addCriterion("canceldate between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotBetween(Date value1, Date value2) {
            addCriterion("canceldate not between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("hibernateversion is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("hibernateversion is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("hibernateversion =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("hibernateversion <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("hibernateversion >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("hibernateversion >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("hibernateversion <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("hibernateversion <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("hibernateversion in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("hibernateversion not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("hibernateversion between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("hibernateversion not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andPayablenoIsNull() {
            addCriterion("payableno is null");
            return (Criteria) this;
        }

        public Criteria andPayablenoIsNotNull() {
            addCriterion("payableno is not null");
            return (Criteria) this;
        }

        public Criteria andPayablenoEqualTo(Long value) {
            addCriterion("payableno =", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotEqualTo(Long value) {
            addCriterion("payableno <>", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThan(Long value) {
            addCriterion("payableno >", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThanOrEqualTo(Long value) {
            addCriterion("payableno >=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThan(Long value) {
            addCriterion("payableno <", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThanOrEqualTo(Long value) {
            addCriterion("payableno <=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoIn(List<Long> values) {
            addCriterion("payableno in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotIn(List<Long> values) {
            addCriterion("payableno not in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoBetween(Long value1, Long value2) {
            addCriterion("payableno between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotBetween(Long value1, Long value2) {
            addCriterion("payableno not between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencycode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencycode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencycode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencycode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencycode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencycode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencycode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencycode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencycode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencycode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencycode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencycode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencycode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencycode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNull() {
            addCriterion("vkclass is null");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNotNull() {
            addCriterion("vkclass is not null");
            return (Criteria) this;
        }

        public Criteria andVkclassEqualTo(String value) {
            addCriterion("vkclass =", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotEqualTo(String value) {
            addCriterion("vkclass <>", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThan(String value) {
            addCriterion("vkclass >", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThanOrEqualTo(String value) {
            addCriterion("vkclass >=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThan(String value) {
            addCriterion("vkclass <", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThanOrEqualTo(String value) {
            addCriterion("vkclass <=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLike(String value) {
            addCriterion("vkclass like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotLike(String value) {
            addCriterion("vkclass not like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassIn(List<String> values) {
            addCriterion("vkclass in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotIn(List<String> values) {
            addCriterion("vkclass not in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassBetween(String value1, String value2) {
            addCriterion("vkclass between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotBetween(String value1, String value2) {
            addCriterion("vkclass not between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("vehkind is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("vehkind is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("vehkind =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("vehkind <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("vehkind >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("vehkind >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("vehkind <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("vehkind <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("vehkind like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("vehkind not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("vehkind in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("vehkind not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("vehkind between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("vehkind not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNull() {
            addCriterion("vehname is null");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNotNull() {
            addCriterion("vehname is not null");
            return (Criteria) this;
        }

        public Criteria andVehnameEqualTo(String value) {
            addCriterion("vehname =", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotEqualTo(String value) {
            addCriterion("vehname <>", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThan(String value) {
            addCriterion("vehname >", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThanOrEqualTo(String value) {
            addCriterion("vehname >=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThan(String value) {
            addCriterion("vehname <", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThanOrEqualTo(String value) {
            addCriterion("vehname <=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLike(String value) {
            addCriterion("vehname like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotLike(String value) {
            addCriterion("vehname not like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameIn(List<String> values) {
            addCriterion("vehname in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotIn(List<String> values) {
            addCriterion("vehname not in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameBetween(String value1, String value2) {
            addCriterion("vehname between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotBetween(String value1, String value2) {
            addCriterion("vehname not between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNull() {
            addCriterion("vehvin is null");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNotNull() {
            addCriterion("vehvin is not null");
            return (Criteria) this;
        }

        public Criteria andVehvinEqualTo(String value) {
            addCriterion("vehvin =", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotEqualTo(String value) {
            addCriterion("vehvin <>", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThan(String value) {
            addCriterion("vehvin >", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThanOrEqualTo(String value) {
            addCriterion("vehvin >=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThan(String value) {
            addCriterion("vehvin <", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThanOrEqualTo(String value) {
            addCriterion("vehvin <=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLike(String value) {
            addCriterion("vehvin like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotLike(String value) {
            addCriterion("vehvin not like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinIn(List<String> values) {
            addCriterion("vehvin in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotIn(List<String> values) {
            addCriterion("vehvin not in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinBetween(String value1, String value2) {
            addCriterion("vehvin between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotBetween(String value1, String value2) {
            addCriterion("vehvin not between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNull() {
            addCriterion("vehtype is null");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNotNull() {
            addCriterion("vehtype is not null");
            return (Criteria) this;
        }

        public Criteria andVehtypeEqualTo(String value) {
            addCriterion("vehtype =", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotEqualTo(String value) {
            addCriterion("vehtype <>", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThan(String value) {
            addCriterion("vehtype >", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehtype >=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThan(String value) {
            addCriterion("vehtype <", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThanOrEqualTo(String value) {
            addCriterion("vehtype <=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLike(String value) {
            addCriterion("vehtype like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotLike(String value) {
            addCriterion("vehtype not like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeIn(List<String> values) {
            addCriterion("vehtype in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotIn(List<String> values) {
            addCriterion("vehtype not in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeBetween(String value1, String value2) {
            addCriterion("vehtype between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotBetween(String value1, String value2) {
            addCriterion("vehtype not between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNull() {
            addCriterion("grossweight is null");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNotNull() {
            addCriterion("grossweight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossweightEqualTo(Long value) {
            addCriterion("grossweight =", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotEqualTo(Long value) {
            addCriterion("grossweight <>", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThan(Long value) {
            addCriterion("grossweight >", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThanOrEqualTo(Long value) {
            addCriterion("grossweight >=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThan(Long value) {
            addCriterion("grossweight <", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThanOrEqualTo(Long value) {
            addCriterion("grossweight <=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIn(List<Long> values) {
            addCriterion("grossweight in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotIn(List<Long> values) {
            addCriterion("grossweight not in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightBetween(Long value1, Long value2) {
            addCriterion("grossweight between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotBetween(Long value1, Long value2) {
            addCriterion("grossweight not between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNull() {
            addCriterion("loadcapacity is null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNotNull() {
            addCriterion("loadcapacity is not null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityEqualTo(Long value) {
            addCriterion("loadcapacity =", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotEqualTo(Long value) {
            addCriterion("loadcapacity <>", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThan(Long value) {
            addCriterion("loadcapacity >", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThanOrEqualTo(Long value) {
            addCriterion("loadcapacity >=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThan(Long value) {
            addCriterion("loadcapacity <", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThanOrEqualTo(Long value) {
            addCriterion("loadcapacity <=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIn(List<Long> values) {
            addCriterion("loadcapacity in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotIn(List<Long> values) {
            addCriterion("loadcapacity not in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityBetween(Long value1, Long value2) {
            addCriterion("loadcapacity between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotBetween(Long value1, Long value2) {
            addCriterion("loadcapacity not between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(Long value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(Long value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(Long value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(Long value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(Long value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(Long value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<Long> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<Long> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(Long value1, Long value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(Long value1, Long value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNull() {
            addCriterion("curbweight is null");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNotNull() {
            addCriterion("curbweight is not null");
            return (Criteria) this;
        }

        public Criteria andCurbweightEqualTo(Long value) {
            addCriterion("curbweight =", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotEqualTo(Long value) {
            addCriterion("curbweight <>", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThan(Long value) {
            addCriterion("curbweight >", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThanOrEqualTo(Long value) {
            addCriterion("curbweight >=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThan(Long value) {
            addCriterion("curbweight <", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThanOrEqualTo(Long value) {
            addCriterion("curbweight <=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightIn(List<Long> values) {
            addCriterion("curbweight in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotIn(List<Long> values) {
            addCriterion("curbweight not in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightBetween(Long value1, Long value2) {
            addCriterion("curbweight between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotBetween(Long value1, Long value2) {
            addCriterion("curbweight not between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("taxpayer is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("taxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("taxpayer =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("taxpayer <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("taxpayer >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("taxpayer <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("taxpayer <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("taxpayer like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("taxpayer not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("taxpayer in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("taxpayer not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("taxpayer between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("taxpayer not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNull() {
            addCriterion("payeraddress is null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNotNull() {
            addCriterion("payeraddress is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressEqualTo(String value) {
            addCriterion("payeraddress =", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotEqualTo(String value) {
            addCriterion("payeraddress <>", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThan(String value) {
            addCriterion("payeraddress >", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("payeraddress >=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThan(String value) {
            addCriterion("payeraddress <", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThanOrEqualTo(String value) {
            addCriterion("payeraddress <=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLike(String value) {
            addCriterion("payeraddress like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotLike(String value) {
            addCriterion("payeraddress not like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIn(List<String> values) {
            addCriterion("payeraddress in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotIn(List<String> values) {
            addCriterion("payeraddress not in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressBetween(String value1, String value2) {
            addCriterion("payeraddress between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotBetween(String value1, String value2) {
            addCriterion("payeraddress not between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIsNull() {
            addCriterion("backdatefrom is null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIsNotNull() {
            addCriterion("backdatefrom is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromEqualTo(Date value) {
            addCriterion("backdatefrom =", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotEqualTo(Date value) {
            addCriterion("backdatefrom <>", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThan(Date value) {
            addCriterion("backdatefrom >", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("backdatefrom >=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThan(Date value) {
            addCriterion("backdatefrom <", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThanOrEqualTo(Date value) {
            addCriterion("backdatefrom <=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIn(List<Date> values) {
            addCriterion("backdatefrom in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotIn(List<Date> values) {
            addCriterion("backdatefrom not in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromBetween(Date value1, Date value2) {
            addCriterion("backdatefrom between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotBetween(Date value1, Date value2) {
            addCriterion("backdatefrom not between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNull() {
            addCriterion("backdateto is null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNotNull() {
            addCriterion("backdateto is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoEqualTo(Date value) {
            addCriterion("backdateto =", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotEqualTo(Date value) {
            addCriterion("backdateto <>", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThan(Date value) {
            addCriterion("backdateto >", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("backdateto >=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThan(Date value) {
            addCriterion("backdateto <", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThanOrEqualTo(Date value) {
            addCriterion("backdateto <=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIn(List<Date> values) {
            addCriterion("backdateto in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotIn(List<Date> values) {
            addCriterion("backdateto not in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoBetween(Date value1, Date value2) {
            addCriterion("backdateto between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotBetween(Date value1, Date value2) {
            addCriterion("backdateto not between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNull() {
            addCriterion("latedatefrom is null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNotNull() {
            addCriterion("latedatefrom is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromEqualTo(Date value) {
            addCriterion("latedatefrom =", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotEqualTo(Date value) {
            addCriterion("latedatefrom <>", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThan(Date value) {
            addCriterion("latedatefrom >", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("latedatefrom >=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThan(Date value) {
            addCriterion("latedatefrom <", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThanOrEqualTo(Date value) {
            addCriterion("latedatefrom <=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIn(List<Date> values) {
            addCriterion("latedatefrom in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotIn(List<Date> values) {
            addCriterion("latedatefrom not in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromBetween(Date value1, Date value2) {
            addCriterion("latedatefrom between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotBetween(Date value1, Date value2) {
            addCriterion("latedatefrom not between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNull() {
            addCriterion("latedateto is null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNotNull() {
            addCriterion("latedateto is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoEqualTo(Date value) {
            addCriterion("latedateto =", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotEqualTo(Date value) {
            addCriterion("latedateto <>", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThan(Date value) {
            addCriterion("latedateto >", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("latedateto >=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThan(Date value) {
            addCriterion("latedateto <", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThanOrEqualTo(Date value) {
            addCriterion("latedateto <=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIn(List<Date> values) {
            addCriterion("latedateto in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotIn(List<Date> values) {
            addCriterion("latedateto not in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoBetween(Date value1, Date value2) {
            addCriterion("latedateto between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotBetween(Date value1, Date value2) {
            addCriterion("latedateto not between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNull() {
            addCriterion("taxpayable is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNotNull() {
            addCriterion("taxpayable is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableEqualTo(BigDecimal value) {
            addCriterion("taxpayable =", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotEqualTo(BigDecimal value) {
            addCriterion("taxpayable <>", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThan(BigDecimal value) {
            addCriterion("taxpayable >", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxpayable >=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThan(BigDecimal value) {
            addCriterion("taxpayable <", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxpayable <=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIn(List<BigDecimal> values) {
            addCriterion("taxpayable in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotIn(List<BigDecimal> values) {
            addCriterion("taxpayable not in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxpayable between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxpayable not between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNull() {
            addCriterion("backtax is null");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNotNull() {
            addCriterion("backtax is not null");
            return (Criteria) this;
        }

        public Criteria andBacktaxEqualTo(BigDecimal value) {
            addCriterion("backtax =", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotEqualTo(BigDecimal value) {
            addCriterion("backtax <>", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThan(BigDecimal value) {
            addCriterion("backtax >", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backtax >=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThan(BigDecimal value) {
            addCriterion("backtax <", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backtax <=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxIn(List<BigDecimal> values) {
            addCriterion("backtax in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotIn(List<BigDecimal> values) {
            addCriterion("backtax not in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backtax between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backtax not between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNull() {
            addCriterion("latefee is null");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNotNull() {
            addCriterion("latefee is not null");
            return (Criteria) this;
        }

        public Criteria andLatefeeEqualTo(BigDecimal value) {
            addCriterion("latefee =", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotEqualTo(BigDecimal value) {
            addCriterion("latefee <>", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThan(BigDecimal value) {
            addCriterion("latefee >", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latefee >=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThan(BigDecimal value) {
            addCriterion("latefee <", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latefee <=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeIn(List<BigDecimal> values) {
            addCriterion("latefee in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotIn(List<BigDecimal> values) {
            addCriterion("latefee not in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latefee between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latefee not between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNull() {
            addCriterion("taxfree is null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNotNull() {
            addCriterion("taxfree is not null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeEqualTo(BigDecimal value) {
            addCriterion("taxfree =", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotEqualTo(BigDecimal value) {
            addCriterion("taxfree <>", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThan(BigDecimal value) {
            addCriterion("taxfree >", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxfree >=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThan(BigDecimal value) {
            addCriterion("taxfree <", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxfree <=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIn(List<BigDecimal> values) {
            addCriterion("taxfree in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotIn(List<BigDecimal> values) {
            addCriterion("taxfree not in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxfree between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxfree not between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNull() {
            addCriterion("taxtotal is null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNotNull() {
            addCriterion("taxtotal is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalEqualTo(BigDecimal value) {
            addCriterion("taxtotal =", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotEqualTo(BigDecimal value) {
            addCriterion("taxtotal <>", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThan(BigDecimal value) {
            addCriterion("taxtotal >", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxtotal >=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThan(BigDecimal value) {
            addCriterion("taxtotal <", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxtotal <=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIn(List<BigDecimal> values) {
            addCriterion("taxtotal in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotIn(List<BigDecimal> values) {
            addCriterion("taxtotal not in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxtotal between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxtotal not between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNull() {
            addCriterion("taxcertno is null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNotNull() {
            addCriterion("taxcertno is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoEqualTo(String value) {
            addCriterion("taxcertno =", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotEqualTo(String value) {
            addCriterion("taxcertno <>", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThan(String value) {
            addCriterion("taxcertno >", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("taxcertno >=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThan(String value) {
            addCriterion("taxcertno <", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThanOrEqualTo(String value) {
            addCriterion("taxcertno <=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLike(String value) {
            addCriterion("taxcertno like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotLike(String value) {
            addCriterion("taxcertno not like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIn(List<String> values) {
            addCriterion("taxcertno in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotIn(List<String> values) {
            addCriterion("taxcertno not in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoBetween(String value1, String value2) {
            addCriterion("taxcertno between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotBetween(String value1, String value2) {
            addCriterion("taxcertno not between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNull() {
            addCriterion("taxoffice is null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNotNull() {
            addCriterion("taxoffice is not null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeEqualTo(String value) {
            addCriterion("taxoffice =", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotEqualTo(String value) {
            addCriterion("taxoffice <>", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThan(String value) {
            addCriterion("taxoffice >", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThanOrEqualTo(String value) {
            addCriterion("taxoffice >=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThan(String value) {
            addCriterion("taxoffice <", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThanOrEqualTo(String value) {
            addCriterion("taxoffice <=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLike(String value) {
            addCriterion("taxoffice like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotLike(String value) {
            addCriterion("taxoffice not like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIn(List<String> values) {
            addCriterion("taxoffice in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotIn(List<String> values) {
            addCriterion("taxoffice not in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeBetween(String value1, String value2) {
            addCriterion("taxoffice between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotBetween(String value1, String value2) {
            addCriterion("taxoffice not between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNull() {
            addCriterion("taxday is null");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNotNull() {
            addCriterion("taxday is not null");
            return (Criteria) this;
        }

        public Criteria andTaxdayEqualTo(Date value) {
            addCriterion("taxday =", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotEqualTo(Date value) {
            addCriterion("taxday <>", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThan(Date value) {
            addCriterion("taxday >", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThanOrEqualTo(Date value) {
            addCriterion("taxday >=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThan(Date value) {
            addCriterion("taxday <", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThanOrEqualTo(Date value) {
            addCriterion("taxday <=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayIn(List<Date> values) {
            addCriterion("taxday in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotIn(List<Date> values) {
            addCriterion("taxday not in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayBetween(Date value1, Date value2) {
            addCriterion("taxday between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotBetween(Date value1, Date value2) {
            addCriterion("taxday not between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNull() {
            addCriterion("insurer is null");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNotNull() {
            addCriterion("insurer is not null");
            return (Criteria) this;
        }

        public Criteria andInsurerEqualTo(String value) {
            addCriterion("insurer =", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotEqualTo(String value) {
            addCriterion("insurer <>", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThan(String value) {
            addCriterion("insurer >", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThanOrEqualTo(String value) {
            addCriterion("insurer >=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThan(String value) {
            addCriterion("insurer <", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThanOrEqualTo(String value) {
            addCriterion("insurer <=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLike(String value) {
            addCriterion("insurer like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotLike(String value) {
            addCriterion("insurer not like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerIn(List<String> values) {
            addCriterion("insurer in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotIn(List<String> values) {
            addCriterion("insurer not in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerBetween(String value1, String value2) {
            addCriterion("insurer between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotBetween(String value1, String value2) {
            addCriterion("insurer not between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNull() {
            addCriterion("insurerno is null");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNotNull() {
            addCriterion("insurerno is not null");
            return (Criteria) this;
        }

        public Criteria andInsurernoEqualTo(String value) {
            addCriterion("insurerno =", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotEqualTo(String value) {
            addCriterion("insurerno <>", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThan(String value) {
            addCriterion("insurerno >", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThanOrEqualTo(String value) {
            addCriterion("insurerno >=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThan(String value) {
            addCriterion("insurerno <", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThanOrEqualTo(String value) {
            addCriterion("insurerno <=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLike(String value) {
            addCriterion("insurerno like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotLike(String value) {
            addCriterion("insurerno not like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoIn(List<String> values) {
            addCriterion("insurerno in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotIn(List<String> values) {
            addCriterion("insurerno not in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoBetween(String value1, String value2) {
            addCriterion("insurerno between", value1, value2, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotBetween(String value1, String value2) {
            addCriterion("insurerno not between", value1, value2, "insurerno");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("engine is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("engine is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("engine =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("engine <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("engine >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("engine >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("engine <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("engine <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("engine like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("engine not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("engine in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("engine not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("engine between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("engine not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNull() {
            addCriterion("usedtaxamount is null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIsNotNull() {
            addCriterion("usedtaxamount is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount =", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount <>", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThan(BigDecimal value) {
            addCriterion("usedtaxamount >", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount >=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThan(BigDecimal value) {
            addCriterion("usedtaxamount <", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usedtaxamount <=", value, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountIn(List<BigDecimal> values) {
            addCriterion("usedtaxamount in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotIn(List<BigDecimal> values) {
            addCriterion("usedtaxamount not in", values, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedtaxamount between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andUsedtaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedtaxamount not between", value1, value2, "usedtaxamount");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("modifydesc is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("modifydesc is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("modifydesc =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("modifydesc <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("modifydesc >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("modifydesc >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("modifydesc <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("modifydesc <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("modifydesc like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("modifydesc not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("modifydesc in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("modifydesc not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("modifydesc between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("modifydesc not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIsNull() {
            addCriterion("seqtax is null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIsNotNull() {
            addCriterion("seqtax is not null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxEqualTo(String value) {
            addCriterion("seqtax =", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotEqualTo(String value) {
            addCriterion("seqtax <>", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThan(String value) {
            addCriterion("seqtax >", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThanOrEqualTo(String value) {
            addCriterion("seqtax >=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThan(String value) {
            addCriterion("seqtax <", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThanOrEqualTo(String value) {
            addCriterion("seqtax <=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLike(String value) {
            addCriterion("seqtax like", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotLike(String value) {
            addCriterion("seqtax not like", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIn(List<String> values) {
            addCriterion("seqtax in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotIn(List<String> values) {
            addCriterion("seqtax not in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxBetween(String value1, String value2) {
            addCriterion("seqtax between", value1, value2, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotBetween(String value1, String value2) {
            addCriterion("seqtax not between", value1, value2, "seqtax");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("endorseno is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("endorseno is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("endorseno =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("endorseno <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("endorseno >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("endorseno >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("endorseno <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("endorseno <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("endorseno like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("endorseno not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("endorseno in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("endorseno not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("endorseno between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("endorseno not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("lastopdate is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("lastopdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("lastopdate =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("lastopdate <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("lastopdate >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdate >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("lastopdate <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("lastopdate <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("lastopdate in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("lastopdate not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("lastopdate between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("lastopdate not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNull() {
            addCriterion("baserealamount is null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIsNotNull() {
            addCriterion("baserealamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaserealamountEqualTo(BigDecimal value) {
            addCriterion("baserealamount =", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotEqualTo(BigDecimal value) {
            addCriterion("baserealamount <>", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThan(BigDecimal value) {
            addCriterion("baserealamount >", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baserealamount >=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThan(BigDecimal value) {
            addCriterion("baserealamount <", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baserealamount <=", value, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountIn(List<BigDecimal> values) {
            addCriterion("baserealamount in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotIn(List<BigDecimal> values) {
            addCriterion("baserealamount not in", values, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baserealamount between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andBaserealamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baserealamount not between", value1, value2, "baserealamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNull() {
            addCriterion("accountamount is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("accountamount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("accountamount =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("accountamount <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("accountamount >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("accountamount <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("accountamount in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("accountamount not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount not between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("signdate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterion("signdate =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterion("signdate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterion("signdate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("signdate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterion("signdate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterion("signdate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterion("signdate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterion("signdate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterion("signdate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterion("signdate not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("invoiceno is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("invoiceno is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("invoiceno =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("invoiceno <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("invoiceno >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceno >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("invoiceno <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("invoiceno <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("invoiceno like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("invoiceno not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("invoiceno in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("invoiceno not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("invoiceno between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("invoiceno not between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("taxamount is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("taxamount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("taxamount =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("taxamount <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("taxamount >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxamount >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("taxamount <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxamount <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("taxamount in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("taxamount not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxamount between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxamount not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("baseamount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("baseamount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("baseamount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("baseamount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("baseamount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("baseamount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("fueltype is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("fueltype is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("fueltype =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("fueltype <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("fueltype >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fueltype >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("fueltype <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("fueltype <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("fueltype like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("fueltype not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("fueltype in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("fueltype not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("fueltype between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("fueltype not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNull() {
            addCriterion("fuelname is null");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNotNull() {
            addCriterion("fuelname is not null");
            return (Criteria) this;
        }

        public Criteria andFuelnameEqualTo(String value) {
            addCriterion("fuelname =", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotEqualTo(String value) {
            addCriterion("fuelname <>", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThan(String value) {
            addCriterion("fuelname >", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThanOrEqualTo(String value) {
            addCriterion("fuelname >=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThan(String value) {
            addCriterion("fuelname <", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThanOrEqualTo(String value) {
            addCriterion("fuelname <=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLike(String value) {
            addCriterion("fuelname like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotLike(String value) {
            addCriterion("fuelname not like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameIn(List<String> values) {
            addCriterion("fuelname in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotIn(List<String> values) {
            addCriterion("fuelname not in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameBetween(String value1, String value2) {
            addCriterion("fuelname between", value1, value2, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotBetween(String value1, String value2) {
            addCriterion("fuelname not between", value1, value2, "fuelname");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIsNull() {
            addCriterion("taxtype is null");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIsNotNull() {
            addCriterion("taxtype is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtypeEqualTo(String value) {
            addCriterion("taxtype =", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotEqualTo(String value) {
            addCriterion("taxtype <>", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeGreaterThan(String value) {
            addCriterion("taxtype >", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeGreaterThanOrEqualTo(String value) {
            addCriterion("taxtype >=", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLessThan(String value) {
            addCriterion("taxtype <", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLessThanOrEqualTo(String value) {
            addCriterion("taxtype <=", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeLike(String value) {
            addCriterion("taxtype like", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotLike(String value) {
            addCriterion("taxtype not like", value, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeIn(List<String> values) {
            addCriterion("taxtype in", values, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotIn(List<String> values) {
            addCriterion("taxtype not in", values, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeBetween(String value1, String value2) {
            addCriterion("taxtype between", value1, value2, "taxtype");
            return (Criteria) this;
        }

        public Criteria andTaxtypeNotBetween(String value1, String value2) {
            addCriterion("taxtype not between", value1, value2, "taxtype");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerdate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("registerdate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("registerdate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("registerdate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registerdate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("registerdate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("registerdate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("registerdate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("registerdate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("registerdate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("registerdate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIsNull() {
            addCriterion("vehiclestyle is null");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIsNotNull() {
            addCriterion("vehiclestyle is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleEqualTo(String value) {
            addCriterion("vehiclestyle =", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotEqualTo(String value) {
            addCriterion("vehiclestyle <>", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleGreaterThan(String value) {
            addCriterion("vehiclestyle >", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleGreaterThanOrEqualTo(String value) {
            addCriterion("vehiclestyle >=", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLessThan(String value) {
            addCriterion("vehiclestyle <", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLessThanOrEqualTo(String value) {
            addCriterion("vehiclestyle <=", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleLike(String value) {
            addCriterion("vehiclestyle like", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotLike(String value) {
            addCriterion("vehiclestyle not like", value, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleIn(List<String> values) {
            addCriterion("vehiclestyle in", values, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotIn(List<String> values) {
            addCriterion("vehiclestyle not in", values, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleBetween(String value1, String value2) {
            addCriterion("vehiclestyle between", value1, value2, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestyleNotBetween(String value1, String value2) {
            addCriterion("vehiclestyle not between", value1, value2, "vehiclestyle");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIsNull() {
            addCriterion("vehiclestylename is null");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIsNotNull() {
            addCriterion("vehiclestylename is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameEqualTo(String value) {
            addCriterion("vehiclestylename =", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotEqualTo(String value) {
            addCriterion("vehiclestylename <>", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameGreaterThan(String value) {
            addCriterion("vehiclestylename >", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameGreaterThanOrEqualTo(String value) {
            addCriterion("vehiclestylename >=", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLessThan(String value) {
            addCriterion("vehiclestylename <", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLessThanOrEqualTo(String value) {
            addCriterion("vehiclestylename <=", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameLike(String value) {
            addCriterion("vehiclestylename like", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotLike(String value) {
            addCriterion("vehiclestylename not like", value, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameIn(List<String> values) {
            addCriterion("vehiclestylename in", values, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotIn(List<String> values) {
            addCriterion("vehiclestylename not in", values, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameBetween(String value1, String value2) {
            addCriterion("vehiclestylename between", value1, value2, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andVehiclestylenameNotBetween(String value1, String value2) {
            addCriterion("vehiclestylename not between", value1, value2, "vehiclestylename");
            return (Criteria) this;
        }

        public Criteria andDeratenoIsNull() {
            addCriterion("derateno is null");
            return (Criteria) this;
        }

        public Criteria andDeratenoIsNotNull() {
            addCriterion("derateno is not null");
            return (Criteria) this;
        }

        public Criteria andDeratenoEqualTo(String value) {
            addCriterion("derateno =", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotEqualTo(String value) {
            addCriterion("derateno <>", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoGreaterThan(String value) {
            addCriterion("derateno >", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoGreaterThanOrEqualTo(String value) {
            addCriterion("derateno >=", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLessThan(String value) {
            addCriterion("derateno <", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLessThanOrEqualTo(String value) {
            addCriterion("derateno <=", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoLike(String value) {
            addCriterion("derateno like", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotLike(String value) {
            addCriterion("derateno not like", value, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoIn(List<String> values) {
            addCriterion("derateno in", values, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotIn(List<String> values) {
            addCriterion("derateno not in", values, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoBetween(String value1, String value2) {
            addCriterion("derateno between", value1, value2, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeratenoNotBetween(String value1, String value2) {
            addCriterion("derateno not between", value1, value2, "derateno");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIsNull() {
            addCriterion("deductionduecode is null");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIsNotNull() {
            addCriterion("deductionduecode is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeEqualTo(String value) {
            addCriterion("deductionduecode =", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotEqualTo(String value) {
            addCriterion("deductionduecode <>", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeGreaterThan(String value) {
            addCriterion("deductionduecode >", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeGreaterThanOrEqualTo(String value) {
            addCriterion("deductionduecode >=", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLessThan(String value) {
            addCriterion("deductionduecode <", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLessThanOrEqualTo(String value) {
            addCriterion("deductionduecode <=", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeLike(String value) {
            addCriterion("deductionduecode like", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotLike(String value) {
            addCriterion("deductionduecode not like", value, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeIn(List<String> values) {
            addCriterion("deductionduecode in", values, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotIn(List<String> values) {
            addCriterion("deductionduecode not in", values, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeBetween(String value1, String value2) {
            addCriterion("deductionduecode between", value1, value2, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduecodeNotBetween(String value1, String value2) {
            addCriterion("deductionduecode not between", value1, value2, "deductionduecode");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIsNull() {
            addCriterion("deductionduename is null");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIsNotNull() {
            addCriterion("deductionduename is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameEqualTo(String value) {
            addCriterion("deductionduename =", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotEqualTo(String value) {
            addCriterion("deductionduename <>", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameGreaterThan(String value) {
            addCriterion("deductionduename >", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameGreaterThanOrEqualTo(String value) {
            addCriterion("deductionduename >=", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLessThan(String value) {
            addCriterion("deductionduename <", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLessThanOrEqualTo(String value) {
            addCriterion("deductionduename <=", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameLike(String value) {
            addCriterion("deductionduename like", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotLike(String value) {
            addCriterion("deductionduename not like", value, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameIn(List<String> values) {
            addCriterion("deductionduename in", values, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotIn(List<String> values) {
            addCriterion("deductionduename not in", values, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameBetween(String value1, String value2) {
            addCriterion("deductionduename between", value1, value2, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andDeductionduenameNotBetween(String value1, String value2) {
            addCriterion("deductionduename not between", value1, value2, "deductionduename");
            return (Criteria) this;
        }

        public Criteria andMakermodelIsNull() {
            addCriterion("makermodel is null");
            return (Criteria) this;
        }

        public Criteria andMakermodelIsNotNull() {
            addCriterion("makermodel is not null");
            return (Criteria) this;
        }

        public Criteria andMakermodelEqualTo(String value) {
            addCriterion("makermodel =", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotEqualTo(String value) {
            addCriterion("makermodel <>", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelGreaterThan(String value) {
            addCriterion("makermodel >", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelGreaterThanOrEqualTo(String value) {
            addCriterion("makermodel >=", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLessThan(String value) {
            addCriterion("makermodel <", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLessThanOrEqualTo(String value) {
            addCriterion("makermodel <=", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelLike(String value) {
            addCriterion("makermodel like", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotLike(String value) {
            addCriterion("makermodel not like", value, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelIn(List<String> values) {
            addCriterion("makermodel in", values, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotIn(List<String> values) {
            addCriterion("makermodel not in", values, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelBetween(String value1, String value2) {
            addCriterion("makermodel between", value1, value2, "makermodel");
            return (Criteria) this;
        }

        public Criteria andMakermodelNotBetween(String value1, String value2) {
            addCriterion("makermodel not between", value1, value2, "makermodel");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("customertype is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("customertype is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("customertype =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("customertype <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("customertype >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("customertype >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("customertype <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("customertype <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("customertype like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("customertype not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("customertype in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("customertype not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("customertype between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("customertype not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("certificatetype is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("certificatetype is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("certificatetype =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("certificatetype <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("certificatetype >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificatetype >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("certificatetype <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("certificatetype <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("certificatetype like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("certificatetype not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("certificatetype in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("certificatetype not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("certificatetype between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("certificatetype not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIsNull() {
            addCriterion("certificatetypename is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIsNotNull() {
            addCriterion("certificatetypename is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameEqualTo(String value) {
            addCriterion("certificatetypename =", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotEqualTo(String value) {
            addCriterion("certificatetypename <>", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameGreaterThan(String value) {
            addCriterion("certificatetypename >", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("certificatetypename >=", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLessThan(String value) {
            addCriterion("certificatetypename <", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLessThanOrEqualTo(String value) {
            addCriterion("certificatetypename <=", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameLike(String value) {
            addCriterion("certificatetypename like", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotLike(String value) {
            addCriterion("certificatetypename not like", value, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameIn(List<String> values) {
            addCriterion("certificatetypename in", values, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotIn(List<String> values) {
            addCriterion("certificatetypename not in", values, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameBetween(String value1, String value2) {
            addCriterion("certificatetypename between", value1, value2, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andCertificatetypenameNotBetween(String value1, String value2) {
            addCriterion("certificatetypename not between", value1, value2, "certificatetypename");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNull() {
            addCriterion("yeartaxstandard is null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIsNotNull() {
            addCriterion("yeartaxstandard is not null");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardEqualTo(BigDecimal value) {
            addCriterion("yeartaxstandard =", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotEqualTo(BigDecimal value) {
            addCriterion("yeartaxstandard <>", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThan(BigDecimal value) {
            addCriterion("yeartaxstandard >", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartaxstandard >=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThan(BigDecimal value) {
            addCriterion("yeartaxstandard <", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartaxstandard <=", value, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardIn(List<BigDecimal> values) {
            addCriterion("yeartaxstandard in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotIn(List<BigDecimal> values) {
            addCriterion("yeartaxstandard not in", values, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartaxstandard between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andYeartaxstandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartaxstandard not between", value1, value2, "yeartaxstandard");
            return (Criteria) this;
        }

        public Criteria andLatedayIsNull() {
            addCriterion("lateday is null");
            return (Criteria) this;
        }

        public Criteria andLatedayIsNotNull() {
            addCriterion("lateday is not null");
            return (Criteria) this;
        }

        public Criteria andLatedayEqualTo(Long value) {
            addCriterion("lateday =", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotEqualTo(Long value) {
            addCriterion("lateday <>", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayGreaterThan(Long value) {
            addCriterion("lateday >", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayGreaterThanOrEqualTo(Long value) {
            addCriterion("lateday >=", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayLessThan(Long value) {
            addCriterion("lateday <", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayLessThanOrEqualTo(Long value) {
            addCriterion("lateday <=", value, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayIn(List<Long> values) {
            addCriterion("lateday in", values, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotIn(List<Long> values) {
            addCriterion("lateday not in", values, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayBetween(Long value1, Long value2) {
            addCriterion("lateday between", value1, value2, "lateday");
            return (Criteria) this;
        }

        public Criteria andLatedayNotBetween(Long value1, Long value2) {
            addCriterion("lateday not between", value1, value2, "lateday");
            return (Criteria) this;
        }

        public Criteria andInputoridIsNull() {
            addCriterion("inputorid is null");
            return (Criteria) this;
        }

        public Criteria andInputoridIsNotNull() {
            addCriterion("inputorid is not null");
            return (Criteria) this;
        }

        public Criteria andInputoridEqualTo(String value) {
            addCriterion("inputorid =", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotEqualTo(String value) {
            addCriterion("inputorid <>", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThan(String value) {
            addCriterion("inputorid >", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThanOrEqualTo(String value) {
            addCriterion("inputorid >=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThan(String value) {
            addCriterion("inputorid <", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThanOrEqualTo(String value) {
            addCriterion("inputorid <=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLike(String value) {
            addCriterion("inputorid like", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotLike(String value) {
            addCriterion("inputorid not like", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridIn(List<String> values) {
            addCriterion("inputorid in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotIn(List<String> values) {
            addCriterion("inputorid not in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridBetween(String value1, String value2) {
            addCriterion("inputorid between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotBetween(String value1, String value2) {
            addCriterion("inputorid not between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNull() {
            addCriterion("taxnum is null");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNotNull() {
            addCriterion("taxnum is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnumEqualTo(BigDecimal value) {
            addCriterion("taxnum =", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotEqualTo(BigDecimal value) {
            addCriterion("taxnum <>", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThan(BigDecimal value) {
            addCriterion("taxnum >", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxnum >=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThan(BigDecimal value) {
            addCriterion("taxnum <", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxnum <=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumIn(List<BigDecimal> values) {
            addCriterion("taxnum in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotIn(List<BigDecimal> values) {
            addCriterion("taxnum not in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxnum between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxnum not between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIsNull() {
            addCriterion("freequalitytax is null");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIsNotNull() {
            addCriterion("freequalitytax is not null");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxEqualTo(BigDecimal value) {
            addCriterion("freequalitytax =", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotEqualTo(BigDecimal value) {
            addCriterion("freequalitytax <>", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxGreaterThan(BigDecimal value) {
            addCriterion("freequalitytax >", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freequalitytax >=", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxLessThan(BigDecimal value) {
            addCriterion("freequalitytax <", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freequalitytax <=", value, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxIn(List<BigDecimal> values) {
            addCriterion("freequalitytax in", values, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotIn(List<BigDecimal> values) {
            addCriterion("freequalitytax not in", values, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freequalitytax between", value1, value2, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andFreequalitytaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freequalitytax not between", value1, value2, "freequalitytax");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIsNull() {
            addCriterion("policystartdate is null");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIsNotNull() {
            addCriterion("policystartdate is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateEqualTo(Date value) {
            addCriterion("policystartdate =", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotEqualTo(Date value) {
            addCriterion("policystartdate <>", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateGreaterThan(Date value) {
            addCriterion("policystartdate >", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("policystartdate >=", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateLessThan(Date value) {
            addCriterion("policystartdate <", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateLessThanOrEqualTo(Date value) {
            addCriterion("policystartdate <=", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIn(List<Date> values) {
            addCriterion("policystartdate in", values, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotIn(List<Date> values) {
            addCriterion("policystartdate not in", values, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateBetween(Date value1, Date value2) {
            addCriterion("policystartdate between", value1, value2, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotBetween(Date value1, Date value2) {
            addCriterion("policystartdate not between", value1, value2, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateIsNull() {
            addCriterion("policyenddate is null");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateIsNotNull() {
            addCriterion("policyenddate is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateEqualTo(Date value) {
            addCriterion("policyenddate =", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateNotEqualTo(Date value) {
            addCriterion("policyenddate <>", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateGreaterThan(Date value) {
            addCriterion("policyenddate >", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("policyenddate >=", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateLessThan(Date value) {
            addCriterion("policyenddate <", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateLessThanOrEqualTo(Date value) {
            addCriterion("policyenddate <=", value, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateIn(List<Date> values) {
            addCriterion("policyenddate in", values, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateNotIn(List<Date> values) {
            addCriterion("policyenddate not in", values, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateBetween(Date value1, Date value2) {
            addCriterion("policyenddate between", value1, value2, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andPolicyenddateNotBetween(Date value1, Date value2) {
            addCriterion("policyenddate not between", value1, value2, "policyenddate");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("carnumber is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("carnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("carnumber =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("carnumber <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("carnumber >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("carnumber >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("carnumber <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("carnumber <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("carnumber like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("carnumber not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("carnumber in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("carnumber not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("carnumber between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("carnumber not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andVehaddressIsNull() {
            addCriterion("vehaddress is null");
            return (Criteria) this;
        }

        public Criteria andVehaddressIsNotNull() {
            addCriterion("vehaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVehaddressEqualTo(String value) {
            addCriterion("vehaddress =", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotEqualTo(String value) {
            addCriterion("vehaddress <>", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressGreaterThan(String value) {
            addCriterion("vehaddress >", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vehaddress >=", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLessThan(String value) {
            addCriterion("vehaddress <", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLessThanOrEqualTo(String value) {
            addCriterion("vehaddress <=", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressLike(String value) {
            addCriterion("vehaddress like", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotLike(String value) {
            addCriterion("vehaddress not like", value, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressIn(List<String> values) {
            addCriterion("vehaddress in", values, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotIn(List<String> values) {
            addCriterion("vehaddress not in", values, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressBetween(String value1, String value2) {
            addCriterion("vehaddress between", value1, value2, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andVehaddressNotBetween(String value1, String value2) {
            addCriterion("vehaddress not between", value1, value2, "vehaddress");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIsNull() {
            addCriterion("enginecapacity is null");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIsNotNull() {
            addCriterion("enginecapacity is not null");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityEqualTo(BigDecimal value) {
            addCriterion("enginecapacity =", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotEqualTo(BigDecimal value) {
            addCriterion("enginecapacity <>", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityGreaterThan(BigDecimal value) {
            addCriterion("enginecapacity >", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enginecapacity >=", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityLessThan(BigDecimal value) {
            addCriterion("enginecapacity <", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enginecapacity <=", value, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityIn(List<BigDecimal> values) {
            addCriterion("enginecapacity in", values, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotIn(List<BigDecimal> values) {
            addCriterion("enginecapacity not in", values, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enginecapacity between", value1, value2, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andEnginecapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enginecapacity not between", value1, value2, "enginecapacity");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNull() {
            addCriterion("sendstatus is null");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNotNull() {
            addCriterion("sendstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendstatusEqualTo(String value) {
            addCriterion("sendstatus =", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotEqualTo(String value) {
            addCriterion("sendstatus <>", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThan(String value) {
            addCriterion("sendstatus >", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sendstatus >=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThan(String value) {
            addCriterion("sendstatus <", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThanOrEqualTo(String value) {
            addCriterion("sendstatus <=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLike(String value) {
            addCriterion("sendstatus like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotLike(String value) {
            addCriterion("sendstatus not like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusIn(List<String> values) {
            addCriterion("sendstatus in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotIn(List<String> values) {
            addCriterion("sendstatus not in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusBetween(String value1, String value2) {
            addCriterion("sendstatus between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotBetween(String value1, String value2) {
            addCriterion("sendstatus not between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andErrormessageIsNull() {
            addCriterion("errormessage is null");
            return (Criteria) this;
        }

        public Criteria andErrormessageIsNotNull() {
            addCriterion("errormessage is not null");
            return (Criteria) this;
        }

        public Criteria andErrormessageEqualTo(String value) {
            addCriterion("errormessage =", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotEqualTo(String value) {
            addCriterion("errormessage <>", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageGreaterThan(String value) {
            addCriterion("errormessage >", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageGreaterThanOrEqualTo(String value) {
            addCriterion("errormessage >=", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLessThan(String value) {
            addCriterion("errormessage <", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLessThanOrEqualTo(String value) {
            addCriterion("errormessage <=", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageLike(String value) {
            addCriterion("errormessage like", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotLike(String value) {
            addCriterion("errormessage not like", value, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageIn(List<String> values) {
            addCriterion("errormessage in", values, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotIn(List<String> values) {
            addCriterion("errormessage not in", values, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageBetween(String value1, String value2) {
            addCriterion("errormessage between", value1, value2, "errormessage");
            return (Criteria) this;
        }

        public Criteria andErrormessageNotBetween(String value1, String value2) {
            addCriterion("errormessage not between", value1, value2, "errormessage");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateIsNull() {
            addCriterion("tax_startdate is null");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateIsNotNull() {
            addCriterion("tax_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateEqualTo(Date value) {
            addCriterion("tax_startdate =", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateNotEqualTo(Date value) {
            addCriterion("tax_startdate <>", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateGreaterThan(Date value) {
            addCriterion("tax_startdate >", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("tax_startdate >=", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateLessThan(Date value) {
            addCriterion("tax_startdate <", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateLessThanOrEqualTo(Date value) {
            addCriterion("tax_startdate <=", value, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateIn(List<Date> values) {
            addCriterion("tax_startdate in", values, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateNotIn(List<Date> values) {
            addCriterion("tax_startdate not in", values, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateBetween(Date value1, Date value2) {
            addCriterion("tax_startdate between", value1, value2, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andTaxStartdateNotBetween(Date value1, Date value2) {
            addCriterion("tax_startdate not between", value1, value2, "taxStartdate");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIsNull() {
            addCriterion("platecolor is null");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIsNotNull() {
            addCriterion("platecolor is not null");
            return (Criteria) this;
        }

        public Criteria andPlatecolorEqualTo(String value) {
            addCriterion("platecolor =", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotEqualTo(String value) {
            addCriterion("platecolor <>", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorGreaterThan(String value) {
            addCriterion("platecolor >", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorGreaterThanOrEqualTo(String value) {
            addCriterion("platecolor >=", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLessThan(String value) {
            addCriterion("platecolor <", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLessThanOrEqualTo(String value) {
            addCriterion("platecolor <=", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLike(String value) {
            addCriterion("platecolor like", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotLike(String value) {
            addCriterion("platecolor not like", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIn(List<String> values) {
            addCriterion("platecolor in", values, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotIn(List<String> values) {
            addCriterion("platecolor not in", values, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorBetween(String value1, String value2) {
            addCriterion("platecolor between", value1, value2, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotBetween(String value1, String value2) {
            addCriterion("platecolor not between", value1, value2, "platecolor");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerIsNull() {
            addCriterion("applicanttaxpayer is null");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerIsNotNull() {
            addCriterion("applicanttaxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerEqualTo(String value) {
            addCriterion("applicanttaxpayer =", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerNotEqualTo(String value) {
            addCriterion("applicanttaxpayer <>", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerGreaterThan(String value) {
            addCriterion("applicanttaxpayer >", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("applicanttaxpayer >=", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerLessThan(String value) {
            addCriterion("applicanttaxpayer <", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerLessThanOrEqualTo(String value) {
            addCriterion("applicanttaxpayer <=", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerLike(String value) {
            addCriterion("applicanttaxpayer like", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerNotLike(String value) {
            addCriterion("applicanttaxpayer not like", value, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerIn(List<String> values) {
            addCriterion("applicanttaxpayer in", values, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerNotIn(List<String> values) {
            addCriterion("applicanttaxpayer not in", values, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerBetween(String value1, String value2) {
            addCriterion("applicanttaxpayer between", value1, value2, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andApplicanttaxpayerNotBetween(String value1, String value2) {
            addCriterion("applicanttaxpayer not between", value1, value2, "applicanttaxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeIsNull() {
            addCriterion("taxofficecode is null");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeIsNotNull() {
            addCriterion("taxofficecode is not null");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeEqualTo(String value) {
            addCriterion("taxofficecode =", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeNotEqualTo(String value) {
            addCriterion("taxofficecode <>", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeGreaterThan(String value) {
            addCriterion("taxofficecode >", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeGreaterThanOrEqualTo(String value) {
            addCriterion("taxofficecode >=", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeLessThan(String value) {
            addCriterion("taxofficecode <", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeLessThanOrEqualTo(String value) {
            addCriterion("taxofficecode <=", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeLike(String value) {
            addCriterion("taxofficecode like", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeNotLike(String value) {
            addCriterion("taxofficecode not like", value, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeIn(List<String> values) {
            addCriterion("taxofficecode in", values, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeNotIn(List<String> values) {
            addCriterion("taxofficecode not in", values, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeBetween(String value1, String value2) {
            addCriterion("taxofficecode between", value1, value2, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxofficecodeNotBetween(String value1, String value2) {
            addCriterion("taxofficecode not between", value1, value2, "taxofficecode");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateIsNull() {
            addCriterion("tax_enddate is null");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateIsNotNull() {
            addCriterion("tax_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateEqualTo(Date value) {
            addCriterion("tax_enddate =", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateNotEqualTo(Date value) {
            addCriterion("tax_enddate <>", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateGreaterThan(Date value) {
            addCriterion("tax_enddate >", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("tax_enddate >=", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateLessThan(Date value) {
            addCriterion("tax_enddate <", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateLessThanOrEqualTo(Date value) {
            addCriterion("tax_enddate <=", value, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateIn(List<Date> values) {
            addCriterion("tax_enddate in", values, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateNotIn(List<Date> values) {
            addCriterion("tax_enddate not in", values, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateBetween(Date value1, Date value2) {
            addCriterion("tax_enddate between", value1, value2, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTaxEnddateNotBetween(Date value1, Date value2) {
            addCriterion("tax_enddate not between", value1, value2, "taxEnddate");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIsNull() {
            addCriterion("useproperty is null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIsNotNull() {
            addCriterion("useproperty is not null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyEqualTo(String value) {
            addCriterion("useproperty =", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotEqualTo(String value) {
            addCriterion("useproperty <>", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThan(String value) {
            addCriterion("useproperty >", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThanOrEqualTo(String value) {
            addCriterion("useproperty >=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThan(String value) {
            addCriterion("useproperty <", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThanOrEqualTo(String value) {
            addCriterion("useproperty <=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLike(String value) {
            addCriterion("useproperty like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotLike(String value) {
            addCriterion("useproperty not like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIn(List<String> values) {
            addCriterion("useproperty in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotIn(List<String> values) {
            addCriterion("useproperty not in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyBetween(String value1, String value2) {
            addCriterion("useproperty between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotBetween(String value1, String value2) {
            addCriterion("useproperty not between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("serialno is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("serialno is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(String value) {
            addCriterion("serialno =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(String value) {
            addCriterion("serialno <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(String value) {
            addCriterion("serialno >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("serialno >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(String value) {
            addCriterion("serialno <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(String value) {
            addCriterion("serialno <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLike(String value) {
            addCriterion("serialno like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotLike(String value) {
            addCriterion("serialno not like", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<String> values) {
            addCriterion("serialno in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<String> values) {
            addCriterion("serialno not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(String value1, String value2) {
            addCriterion("serialno between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(String value1, String value2) {
            addCriterion("serialno not between", value1, value2, "serialno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_handover_events_td
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
     * @Table : mm_temp_handover_events_td
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