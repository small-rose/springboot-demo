package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtsPayTransactionsHistoryExample {
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
    public AtsPayTransactionsHistoryExample() {
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
     * @Table : ats_pay_transactions_history
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

        public Criteria andUridIsNull() {
            addCriterion("URID is null");
            return (Criteria) this;
        }

        public Criteria andUridIsNotNull() {
            addCriterion("URID is not null");
            return (Criteria) this;
        }

        public Criteria andUridEqualTo(Long value) {
            addCriterion("URID =", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotEqualTo(Long value) {
            addCriterion("URID <>", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThan(Long value) {
            addCriterion("URID >", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThanOrEqualTo(Long value) {
            addCriterion("URID >=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThan(Long value) {
            addCriterion("URID <", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThanOrEqualTo(Long value) {
            addCriterion("URID <=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridIn(List<Long> values) {
            addCriterion("URID in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotIn(List<Long> values) {
            addCriterion("URID not in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridBetween(Long value1, Long value2) {
            addCriterion("URID between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotBetween(Long value1, Long value2) {
            addCriterion("URID not between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNull() {
            addCriterion("SOURCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNotNull() {
            addCriterion("SOURCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNameEqualTo(String value) {
            addCriterion("SOURCE_NAME =", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotEqualTo(String value) {
            addCriterion("SOURCE_NAME <>", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThan(String value) {
            addCriterion("SOURCE_NAME >", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME >=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThan(String value) {
            addCriterion("SOURCE_NAME <", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME <=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLike(String value) {
            addCriterion("SOURCE_NAME like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotLike(String value) {
            addCriterion("SOURCE_NAME not like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameIn(List<String> values) {
            addCriterion("SOURCE_NAME in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotIn(List<String> values) {
            addCriterion("SOURCE_NAME not in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME not between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoIsNull() {
            addCriterion("RECORDSOURCE_BATNO is null");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoIsNotNull() {
            addCriterion("RECORDSOURCE_BATNO is not null");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoEqualTo(String value) {
            addCriterion("RECORDSOURCE_BATNO =", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoNotEqualTo(String value) {
            addCriterion("RECORDSOURCE_BATNO <>", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoGreaterThan(String value) {
            addCriterion("RECORDSOURCE_BATNO >", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDSOURCE_BATNO >=", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoLessThan(String value) {
            addCriterion("RECORDSOURCE_BATNO <", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoLessThanOrEqualTo(String value) {
            addCriterion("RECORDSOURCE_BATNO <=", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoLike(String value) {
            addCriterion("RECORDSOURCE_BATNO like", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoNotLike(String value) {
            addCriterion("RECORDSOURCE_BATNO not like", value, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoIn(List<String> values) {
            addCriterion("RECORDSOURCE_BATNO in", values, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoNotIn(List<String> values) {
            addCriterion("RECORDSOURCE_BATNO not in", values, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoBetween(String value1, String value2) {
            addCriterion("RECORDSOURCE_BATNO between", value1, value2, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andRecordsourceBatnoNotBetween(String value1, String value2) {
            addCriterion("RECORDSOURCE_BATNO not between", value1, value2, "recordsourceBatno");
            return (Criteria) this;
        }

        public Criteria andOriginNoteIsNull() {
            addCriterion("ORIGIN_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andOriginNoteIsNotNull() {
            addCriterion("ORIGIN_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginNoteEqualTo(String value) {
            addCriterion("ORIGIN_NOTE =", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteNotEqualTo(String value) {
            addCriterion("ORIGIN_NOTE <>", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteGreaterThan(String value) {
            addCriterion("ORIGIN_NOTE >", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_NOTE >=", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteLessThan(String value) {
            addCriterion("ORIGIN_NOTE <", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_NOTE <=", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteLike(String value) {
            addCriterion("ORIGIN_NOTE like", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteNotLike(String value) {
            addCriterion("ORIGIN_NOTE not like", value, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteIn(List<String> values) {
            addCriterion("ORIGIN_NOTE in", values, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteNotIn(List<String> values) {
            addCriterion("ORIGIN_NOTE not in", values, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteBetween(String value1, String value2) {
            addCriterion("ORIGIN_NOTE between", value1, value2, "originNote");
            return (Criteria) this;
        }

        public Criteria andOriginNoteNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_NOTE not between", value1, value2, "originNote");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeIsNull() {
            addCriterion("APPLY_ENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeIsNotNull() {
            addCriterion("APPLY_ENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeEqualTo(String value) {
            addCriterion("APPLY_ENTITY_CODE =", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeNotEqualTo(String value) {
            addCriterion("APPLY_ENTITY_CODE <>", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeGreaterThan(String value) {
            addCriterion("APPLY_ENTITY_CODE >", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_ENTITY_CODE >=", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeLessThan(String value) {
            addCriterion("APPLY_ENTITY_CODE <", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_ENTITY_CODE <=", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeLike(String value) {
            addCriterion("APPLY_ENTITY_CODE like", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeNotLike(String value) {
            addCriterion("APPLY_ENTITY_CODE not like", value, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeIn(List<String> values) {
            addCriterion("APPLY_ENTITY_CODE in", values, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeNotIn(List<String> values) {
            addCriterion("APPLY_ENTITY_CODE not in", values, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeBetween(String value1, String value2) {
            addCriterion("APPLY_ENTITY_CODE between", value1, value2, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyEntityCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_ENTITY_CODE not between", value1, value2, "applyEntityCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIsNull() {
            addCriterion("APPLY_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIsNotNull() {
            addCriterion("APPLY_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE =", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE <>", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeGreaterThan(String value) {
            addCriterion("APPLY_DEPT_CODE >", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE >=", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLessThan(String value) {
            addCriterion("APPLY_DEPT_CODE <", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE <=", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLike(String value) {
            addCriterion("APPLY_DEPT_CODE like", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotLike(String value) {
            addCriterion("APPLY_DEPT_CODE not like", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIn(List<String> values) {
            addCriterion("APPLY_DEPT_CODE in", values, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotIn(List<String> values) {
            addCriterion("APPLY_DEPT_CODE not in", values, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT_CODE between", value1, value2, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT_CODE not between", value1, value2, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("PAY_DATE =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("PAY_DATE <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("PAY_DATE >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("PAY_DATE <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("PAY_DATE in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("PAY_DATE not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIsNull() {
            addCriterion("SETTLEMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIsNotNull() {
            addCriterion("SETTLEMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementModeEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE =", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE <>", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeGreaterThan(String value) {
            addCriterion("SETTLEMENT_MODE >", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE >=", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLessThan(String value) {
            addCriterion("SETTLEMENT_MODE <", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE <=", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLike(String value) {
            addCriterion("SETTLEMENT_MODE like", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotLike(String value) {
            addCriterion("SETTLEMENT_MODE not like", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIn(List<String> values) {
            addCriterion("SETTLEMENT_MODE in", values, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_MODE not in", values, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_MODE between", value1, value2, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_MODE not between", value1, value2, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNull() {
            addCriterion("PAY_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNotNull() {
            addCriterion("PAY_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE =", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE <>", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThan(String value) {
            addCriterion("PAY_TYPE_CODE >", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE >=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThan(String value) {
            addCriterion("PAY_TYPE_CODE <", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE <=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLike(String value) {
            addCriterion("PAY_TYPE_CODE like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotLike(String value) {
            addCriterion("PAY_TYPE_CODE not like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIn(List<String> values) {
            addCriterion("PAY_TYPE_CODE in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotIn(List<String> values) {
            addCriterion("PAY_TYPE_CODE not in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE_CODE between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE_CODE not between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("CATEGORY_CODE =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("CATEGORY_CODE <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("CATEGORY_CODE >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("CATEGORY_CODE <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("CATEGORY_CODE like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("CATEGORY_CODE not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("CATEGORY_CODE in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("CATEGORY_CODE not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeIsNull() {
            addCriterion("SUB_CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeIsNotNull() {
            addCriterion("SUB_CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeEqualTo(String value) {
            addCriterion("SUB_CATEGORY_CODE =", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeNotEqualTo(String value) {
            addCriterion("SUB_CATEGORY_CODE <>", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeGreaterThan(String value) {
            addCriterion("SUB_CATEGORY_CODE >", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_CATEGORY_CODE >=", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeLessThan(String value) {
            addCriterion("SUB_CATEGORY_CODE <", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("SUB_CATEGORY_CODE <=", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeLike(String value) {
            addCriterion("SUB_CATEGORY_CODE like", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeNotLike(String value) {
            addCriterion("SUB_CATEGORY_CODE not like", value, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeIn(List<String> values) {
            addCriterion("SUB_CATEGORY_CODE in", values, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeNotIn(List<String> values) {
            addCriterion("SUB_CATEGORY_CODE not in", values, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeBetween(String value1, String value2) {
            addCriterion("SUB_CATEGORY_CODE between", value1, value2, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSubCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("SUB_CATEGORY_CODE not between", value1, value2, "subCategoryCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeIsNull() {
            addCriterion("BUDGET_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeIsNotNull() {
            addCriterion("BUDGET_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeEqualTo(String value) {
            addCriterion("BUDGET_ITEM_CODE =", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeNotEqualTo(String value) {
            addCriterion("BUDGET_ITEM_CODE <>", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeGreaterThan(String value) {
            addCriterion("BUDGET_ITEM_CODE >", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_ITEM_CODE >=", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeLessThan(String value) {
            addCriterion("BUDGET_ITEM_CODE <", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_ITEM_CODE <=", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeLike(String value) {
            addCriterion("BUDGET_ITEM_CODE like", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeNotLike(String value) {
            addCriterion("BUDGET_ITEM_CODE not like", value, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeIn(List<String> values) {
            addCriterion("BUDGET_ITEM_CODE in", values, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeNotIn(List<String> values) {
            addCriterion("BUDGET_ITEM_CODE not in", values, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeBetween(String value1, String value2) {
            addCriterion("BUDGET_ITEM_CODE between", value1, value2, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andBudgetItemCodeNotBetween(String value1, String value2) {
            addCriterion("BUDGET_ITEM_CODE not between", value1, value2, "budgetItemCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeIsNull() {
            addCriterion("PAY_ENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeIsNotNull() {
            addCriterion("PAY_ENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeEqualTo(String value) {
            addCriterion("PAY_ENTITY_CODE =", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeNotEqualTo(String value) {
            addCriterion("PAY_ENTITY_CODE <>", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeGreaterThan(String value) {
            addCriterion("PAY_ENTITY_CODE >", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ENTITY_CODE >=", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeLessThan(String value) {
            addCriterion("PAY_ENTITY_CODE <", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_ENTITY_CODE <=", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeLike(String value) {
            addCriterion("PAY_ENTITY_CODE like", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeNotLike(String value) {
            addCriterion("PAY_ENTITY_CODE not like", value, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeIn(List<String> values) {
            addCriterion("PAY_ENTITY_CODE in", values, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeNotIn(List<String> values) {
            addCriterion("PAY_ENTITY_CODE not in", values, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeBetween(String value1, String value2) {
            addCriterion("PAY_ENTITY_CODE between", value1, value2, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayEntityCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_ENTITY_CODE not between", value1, value2, "payEntityCode");
            return (Criteria) this;
        }

        public Criteria andPayBankIsNull() {
            addCriterion("PAY_BANK is null");
            return (Criteria) this;
        }

        public Criteria andPayBankIsNotNull() {
            addCriterion("PAY_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andPayBankEqualTo(String value) {
            addCriterion("PAY_BANK =", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankNotEqualTo(String value) {
            addCriterion("PAY_BANK <>", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankGreaterThan(String value) {
            addCriterion("PAY_BANK >", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_BANK >=", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankLessThan(String value) {
            addCriterion("PAY_BANK <", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankLessThanOrEqualTo(String value) {
            addCriterion("PAY_BANK <=", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankLike(String value) {
            addCriterion("PAY_BANK like", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankNotLike(String value) {
            addCriterion("PAY_BANK not like", value, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankIn(List<String> values) {
            addCriterion("PAY_BANK in", values, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankNotIn(List<String> values) {
            addCriterion("PAY_BANK not in", values, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankBetween(String value1, String value2) {
            addCriterion("PAY_BANK between", value1, value2, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayBankNotBetween(String value1, String value2) {
            addCriterion("PAY_BANK not between", value1, value2, "payBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNull() {
            addCriterion("PAY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("PAY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("PAY_ACCOUNT =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("PAY_ACCOUNT <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("PAY_ACCOUNT >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("PAY_ACCOUNT <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("PAY_ACCOUNT like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("PAY_ACCOUNT not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("PAY_ACCOUNT in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("PAY_ACCOUNT not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT not between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeIsNull() {
            addCriterion("REC_OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeIsNotNull() {
            addCriterion("REC_OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeEqualTo(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE =", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeNotEqualTo(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE <>", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeGreaterThan(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE >", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE >=", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeLessThan(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE <", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_OBJECT_TYPE <=", value, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeIn(List<BigDecimal> values) {
            addCriterion("REC_OBJECT_TYPE in", values, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeNotIn(List<BigDecimal> values) {
            addCriterion("REC_OBJECT_TYPE not in", values, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REC_OBJECT_TYPE between", value1, value2, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecObjectTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REC_OBJECT_TYPE not between", value1, value2, "recObjectType");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNull() {
            addCriterion("REC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNotNull() {
            addCriterion("REC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecNameEqualTo(String value) {
            addCriterion("REC_NAME =", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotEqualTo(String value) {
            addCriterion("REC_NAME <>", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThan(String value) {
            addCriterion("REC_NAME >", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("REC_NAME >=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThan(String value) {
            addCriterion("REC_NAME <", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThanOrEqualTo(String value) {
            addCriterion("REC_NAME <=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLike(String value) {
            addCriterion("REC_NAME like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotLike(String value) {
            addCriterion("REC_NAME not like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameIn(List<String> values) {
            addCriterion("REC_NAME in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotIn(List<String> values) {
            addCriterion("REC_NAME not in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameBetween(String value1, String value2) {
            addCriterion("REC_NAME between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotBetween(String value1, String value2) {
            addCriterion("REC_NAME not between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaIsNull() {
            addCriterion("REC_BANK_AREA is null");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaIsNotNull() {
            addCriterion("REC_BANK_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaEqualTo(String value) {
            addCriterion("REC_BANK_AREA =", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaNotEqualTo(String value) {
            addCriterion("REC_BANK_AREA <>", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaGreaterThan(String value) {
            addCriterion("REC_BANK_AREA >", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaGreaterThanOrEqualTo(String value) {
            addCriterion("REC_BANK_AREA >=", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaLessThan(String value) {
            addCriterion("REC_BANK_AREA <", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaLessThanOrEqualTo(String value) {
            addCriterion("REC_BANK_AREA <=", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaLike(String value) {
            addCriterion("REC_BANK_AREA like", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaNotLike(String value) {
            addCriterion("REC_BANK_AREA not like", value, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaIn(List<String> values) {
            addCriterion("REC_BANK_AREA in", values, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaNotIn(List<String> values) {
            addCriterion("REC_BANK_AREA not in", values, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaBetween(String value1, String value2) {
            addCriterion("REC_BANK_AREA between", value1, value2, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankAreaNotBetween(String value1, String value2) {
            addCriterion("REC_BANK_AREA not between", value1, value2, "recBankArea");
            return (Criteria) this;
        }

        public Criteria andRecBankIsNull() {
            addCriterion("REC_BANK is null");
            return (Criteria) this;
        }

        public Criteria andRecBankIsNotNull() {
            addCriterion("REC_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andRecBankEqualTo(String value) {
            addCriterion("REC_BANK =", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankNotEqualTo(String value) {
            addCriterion("REC_BANK <>", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankGreaterThan(String value) {
            addCriterion("REC_BANK >", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankGreaterThanOrEqualTo(String value) {
            addCriterion("REC_BANK >=", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankLessThan(String value) {
            addCriterion("REC_BANK <", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankLessThanOrEqualTo(String value) {
            addCriterion("REC_BANK <=", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankLike(String value) {
            addCriterion("REC_BANK like", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankNotLike(String value) {
            addCriterion("REC_BANK not like", value, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankIn(List<String> values) {
            addCriterion("REC_BANK in", values, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankNotIn(List<String> values) {
            addCriterion("REC_BANK not in", values, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankBetween(String value1, String value2) {
            addCriterion("REC_BANK between", value1, value2, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankNotBetween(String value1, String value2) {
            addCriterion("REC_BANK not between", value1, value2, "recBank");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsIsNull() {
            addCriterion("REC_BANK_LOCATIONS is null");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsIsNotNull() {
            addCriterion("REC_BANK_LOCATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsEqualTo(String value) {
            addCriterion("REC_BANK_LOCATIONS =", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsNotEqualTo(String value) {
            addCriterion("REC_BANK_LOCATIONS <>", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsGreaterThan(String value) {
            addCriterion("REC_BANK_LOCATIONS >", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsGreaterThanOrEqualTo(String value) {
            addCriterion("REC_BANK_LOCATIONS >=", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsLessThan(String value) {
            addCriterion("REC_BANK_LOCATIONS <", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsLessThanOrEqualTo(String value) {
            addCriterion("REC_BANK_LOCATIONS <=", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsLike(String value) {
            addCriterion("REC_BANK_LOCATIONS like", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsNotLike(String value) {
            addCriterion("REC_BANK_LOCATIONS not like", value, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsIn(List<String> values) {
            addCriterion("REC_BANK_LOCATIONS in", values, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsNotIn(List<String> values) {
            addCriterion("REC_BANK_LOCATIONS not in", values, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsBetween(String value1, String value2) {
            addCriterion("REC_BANK_LOCATIONS between", value1, value2, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andRecBankLocationsNotBetween(String value1, String value2) {
            addCriterion("REC_BANK_LOCATIONS not between", value1, value2, "recBankLocations");
            return (Criteria) this;
        }

        public Criteria andCnapscodeIsNull() {
            addCriterion("CNAPSCODE is null");
            return (Criteria) this;
        }

        public Criteria andCnapscodeIsNotNull() {
            addCriterion("CNAPSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCnapscodeEqualTo(String value) {
            addCriterion("CNAPSCODE =", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeNotEqualTo(String value) {
            addCriterion("CNAPSCODE <>", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeGreaterThan(String value) {
            addCriterion("CNAPSCODE >", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeGreaterThanOrEqualTo(String value) {
            addCriterion("CNAPSCODE >=", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeLessThan(String value) {
            addCriterion("CNAPSCODE <", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeLessThanOrEqualTo(String value) {
            addCriterion("CNAPSCODE <=", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeLike(String value) {
            addCriterion("CNAPSCODE like", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeNotLike(String value) {
            addCriterion("CNAPSCODE not like", value, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeIn(List<String> values) {
            addCriterion("CNAPSCODE in", values, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeNotIn(List<String> values) {
            addCriterion("CNAPSCODE not in", values, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeBetween(String value1, String value2) {
            addCriterion("CNAPSCODE between", value1, value2, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andCnapscodeNotBetween(String value1, String value2) {
            addCriterion("CNAPSCODE not between", value1, value2, "cnapscode");
            return (Criteria) this;
        }

        public Criteria andRecAccountIsNull() {
            addCriterion("REC_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecAccountIsNotNull() {
            addCriterion("REC_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecAccountEqualTo(String value) {
            addCriterion("REC_ACCOUNT =", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotEqualTo(String value) {
            addCriterion("REC_ACCOUNT <>", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountGreaterThan(String value) {
            addCriterion("REC_ACCOUNT >", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountGreaterThanOrEqualTo(String value) {
            addCriterion("REC_ACCOUNT >=", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLessThan(String value) {
            addCriterion("REC_ACCOUNT <", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLessThanOrEqualTo(String value) {
            addCriterion("REC_ACCOUNT <=", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLike(String value) {
            addCriterion("REC_ACCOUNT like", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotLike(String value) {
            addCriterion("REC_ACCOUNT not like", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountIn(List<String> values) {
            addCriterion("REC_ACCOUNT in", values, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotIn(List<String> values) {
            addCriterion("REC_ACCOUNT not in", values, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountBetween(String value1, String value2) {
            addCriterion("REC_ACCOUNT between", value1, value2, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotBetween(String value1, String value2) {
            addCriterion("REC_ACCOUNT not between", value1, value2, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameIsNull() {
            addCriterion("REC_ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameIsNotNull() {
            addCriterion("REC_ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameEqualTo(String value) {
            addCriterion("REC_ACCOUNT_NAME =", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameNotEqualTo(String value) {
            addCriterion("REC_ACCOUNT_NAME <>", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameGreaterThan(String value) {
            addCriterion("REC_ACCOUNT_NAME >", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("REC_ACCOUNT_NAME >=", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameLessThan(String value) {
            addCriterion("REC_ACCOUNT_NAME <", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameLessThanOrEqualTo(String value) {
            addCriterion("REC_ACCOUNT_NAME <=", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameLike(String value) {
            addCriterion("REC_ACCOUNT_NAME like", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameNotLike(String value) {
            addCriterion("REC_ACCOUNT_NAME not like", value, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameIn(List<String> values) {
            addCriterion("REC_ACCOUNT_NAME in", values, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameNotIn(List<String> values) {
            addCriterion("REC_ACCOUNT_NAME not in", values, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameBetween(String value1, String value2) {
            addCriterion("REC_ACCOUNT_NAME between", value1, value2, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecAccountNameNotBetween(String value1, String value2) {
            addCriterion("REC_ACCOUNT_NAME not between", value1, value2, "recAccountName");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyIsNull() {
            addCriterion("REC_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyIsNotNull() {
            addCriterion("REC_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyEqualTo(String value) {
            addCriterion("REC_CURRENCY =", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyNotEqualTo(String value) {
            addCriterion("REC_CURRENCY <>", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyGreaterThan(String value) {
            addCriterion("REC_CURRENCY >", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("REC_CURRENCY >=", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyLessThan(String value) {
            addCriterion("REC_CURRENCY <", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyLessThanOrEqualTo(String value) {
            addCriterion("REC_CURRENCY <=", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyLike(String value) {
            addCriterion("REC_CURRENCY like", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyNotLike(String value) {
            addCriterion("REC_CURRENCY not like", value, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyIn(List<String> values) {
            addCriterion("REC_CURRENCY in", values, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyNotIn(List<String> values) {
            addCriterion("REC_CURRENCY not in", values, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyBetween(String value1, String value2) {
            addCriterion("REC_CURRENCY between", value1, value2, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecCurrencyNotBetween(String value1, String value2) {
            addCriterion("REC_CURRENCY not between", value1, value2, "recCurrency");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNull() {
            addCriterion("REC_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNotNull() {
            addCriterion("REC_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyEqualTo(BigDecimal value) {
            addCriterion("REC_MONEY =", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotEqualTo(BigDecimal value) {
            addCriterion("REC_MONEY <>", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThan(BigDecimal value) {
            addCriterion("REC_MONEY >", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_MONEY >=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThan(BigDecimal value) {
            addCriterion("REC_MONEY <", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REC_MONEY <=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIn(List<BigDecimal> values) {
            addCriterion("REC_MONEY in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotIn(List<BigDecimal> values) {
            addCriterion("REC_MONEY not in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REC_MONEY between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REC_MONEY not between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("PURPOSE =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("PURPOSE <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("PURPOSE >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("PURPOSE >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("PURPOSE <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("PURPOSE <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("PURPOSE like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("PURPOSE not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("PURPOSE in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("PURPOSE not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("PURPOSE between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("PURPOSE not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
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

        public Criteria andVendorCodeIsNull() {
            addCriterion("VENDOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNotNull() {
            addCriterion("VENDOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeEqualTo(String value) {
            addCriterion("VENDOR_CODE =", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotEqualTo(String value) {
            addCriterion("VENDOR_CODE <>", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThan(String value) {
            addCriterion("VENDOR_CODE >", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_CODE >=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThan(String value) {
            addCriterion("VENDOR_CODE <", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_CODE <=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLike(String value) {
            addCriterion("VENDOR_CODE like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotLike(String value) {
            addCriterion("VENDOR_CODE not like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIn(List<String> values) {
            addCriterion("VENDOR_CODE in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotIn(List<String> values) {
            addCriterion("VENDOR_CODE not in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeBetween(String value1, String value2) {
            addCriterion("VENDOR_CODE between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotBetween(String value1, String value2) {
            addCriterion("VENDOR_CODE not between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeIsNull() {
            addCriterion("SOURCE_NOTECODE is null");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeIsNotNull() {
            addCriterion("SOURCE_NOTECODE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeEqualTo(String value) {
            addCriterion("SOURCE_NOTECODE =", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeNotEqualTo(String value) {
            addCriterion("SOURCE_NOTECODE <>", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeGreaterThan(String value) {
            addCriterion("SOURCE_NOTECODE >", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_NOTECODE >=", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeLessThan(String value) {
            addCriterion("SOURCE_NOTECODE <", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_NOTECODE <=", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeLike(String value) {
            addCriterion("SOURCE_NOTECODE like", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeNotLike(String value) {
            addCriterion("SOURCE_NOTECODE not like", value, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeIn(List<String> values) {
            addCriterion("SOURCE_NOTECODE in", values, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeNotIn(List<String> values) {
            addCriterion("SOURCE_NOTECODE not in", values, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeBetween(String value1, String value2) {
            addCriterion("SOURCE_NOTECODE between", value1, value2, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andSourceNotecodeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_NOTECODE not between", value1, value2, "sourceNotecode");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNull() {
            addCriterion("ISPRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNotNull() {
            addCriterion("ISPRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivateEqualTo(Short value) {
            addCriterion("ISPRIVATE =", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotEqualTo(Short value) {
            addCriterion("ISPRIVATE <>", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThan(Short value) {
            addCriterion("ISPRIVATE >", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThanOrEqualTo(Short value) {
            addCriterion("ISPRIVATE >=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThan(Short value) {
            addCriterion("ISPRIVATE <", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThanOrEqualTo(Short value) {
            addCriterion("ISPRIVATE <=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateIn(List<Short> values) {
            addCriterion("ISPRIVATE in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotIn(List<Short> values) {
            addCriterion("ISPRIVATE not in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateBetween(Short value1, Short value2) {
            addCriterion("ISPRIVATE between", value1, value2, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotBetween(Short value1, Short value2) {
            addCriterion("ISPRIVATE not between", value1, value2, "isprivate");
            return (Criteria) this;
        }

        public Criteria andCardFlagIsNull() {
            addCriterion("CARD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCardFlagIsNotNull() {
            addCriterion("CARD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCardFlagEqualTo(BigDecimal value) {
            addCriterion("CARD_FLAG =", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagNotEqualTo(BigDecimal value) {
            addCriterion("CARD_FLAG <>", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagGreaterThan(BigDecimal value) {
            addCriterion("CARD_FLAG >", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_FLAG >=", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagLessThan(BigDecimal value) {
            addCriterion("CARD_FLAG <", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_FLAG <=", value, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagIn(List<BigDecimal> values) {
            addCriterion("CARD_FLAG in", values, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagNotIn(List<BigDecimal> values) {
            addCriterion("CARD_FLAG not in", values, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_FLAG between", value1, value2, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andCardFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_FLAG not between", value1, value2, "cardFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagIsNull() {
            addCriterion("FAST_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastFlagIsNotNull() {
            addCriterion("FAST_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastFlagEqualTo(BigDecimal value) {
            addCriterion("FAST_FLAG =", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotEqualTo(BigDecimal value) {
            addCriterion("FAST_FLAG <>", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagGreaterThan(BigDecimal value) {
            addCriterion("FAST_FLAG >", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAST_FLAG >=", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagLessThan(BigDecimal value) {
            addCriterion("FAST_FLAG <", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAST_FLAG <=", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagIn(List<BigDecimal> values) {
            addCriterion("FAST_FLAG in", values, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotIn(List<BigDecimal> values) {
            addCriterion("FAST_FLAG not in", values, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAST_FLAG between", value1, value2, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAST_FLAG not between", value1, value2, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNull() {
            addCriterion("CREDENTIALS is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNotNull() {
            addCriterion("CREDENTIALS is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsEqualTo(Short value) {
            addCriterion("CREDENTIALS =", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotEqualTo(Short value) {
            addCriterion("CREDENTIALS <>", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThan(Short value) {
            addCriterion("CREDENTIALS >", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThanOrEqualTo(Short value) {
            addCriterion("CREDENTIALS >=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThan(Short value) {
            addCriterion("CREDENTIALS <", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThanOrEqualTo(Short value) {
            addCriterion("CREDENTIALS <=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsIn(List<Short> values) {
            addCriterion("CREDENTIALS in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotIn(List<Short> values) {
            addCriterion("CREDENTIALS not in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsBetween(Short value1, Short value2) {
            addCriterion("CREDENTIALS between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotBetween(Short value1, Short value2) {
            addCriterion("CREDENTIALS not between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andCvvCodeIsNull() {
            addCriterion("CVV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCvvCodeIsNotNull() {
            addCriterion("CVV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCvvCodeEqualTo(String value) {
            addCriterion("CVV_CODE =", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeNotEqualTo(String value) {
            addCriterion("CVV_CODE <>", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeGreaterThan(String value) {
            addCriterion("CVV_CODE >", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CVV_CODE >=", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeLessThan(String value) {
            addCriterion("CVV_CODE <", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeLessThanOrEqualTo(String value) {
            addCriterion("CVV_CODE <=", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeLike(String value) {
            addCriterion("CVV_CODE like", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeNotLike(String value) {
            addCriterion("CVV_CODE not like", value, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeIn(List<String> values) {
            addCriterion("CVV_CODE in", values, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeNotIn(List<String> values) {
            addCriterion("CVV_CODE not in", values, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeBetween(String value1, String value2) {
            addCriterion("CVV_CODE between", value1, value2, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andCvvCodeNotBetween(String value1, String value2) {
            addCriterion("CVV_CODE not between", value1, value2, "cvvCode");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("VALID_DATE =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("VALID_DATE <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("VALID_DATE >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_DATE >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("VALID_DATE <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("VALID_DATE <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("VALID_DATE like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("VALID_DATE not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("VALID_DATE in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("VALID_DATE not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("VALID_DATE between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("VALID_DATE not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateIsNull() {
            addCriterion("ATS_DEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateIsNotNull() {
            addCriterion("ATS_DEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateEqualTo(BigDecimal value) {
            addCriterion("ATS_DEALSTATE =", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateNotEqualTo(BigDecimal value) {
            addCriterion("ATS_DEALSTATE <>", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateGreaterThan(BigDecimal value) {
            addCriterion("ATS_DEALSTATE >", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ATS_DEALSTATE >=", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateLessThan(BigDecimal value) {
            addCriterion("ATS_DEALSTATE <", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ATS_DEALSTATE <=", value, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateIn(List<BigDecimal> values) {
            addCriterion("ATS_DEALSTATE in", values, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateNotIn(List<BigDecimal> values) {
            addCriterion("ATS_DEALSTATE not in", values, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATS_DEALSTATE between", value1, value2, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATS_DEALSTATE not between", value1, value2, "atsDealstate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateIsNull() {
            addCriterion("ATS_DEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateIsNotNull() {
            addCriterion("ATS_DEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateEqualTo(Date value) {
            addCriterion("ATS_DEALDATE =", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateNotEqualTo(Date value) {
            addCriterion("ATS_DEALDATE <>", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateGreaterThan(Date value) {
            addCriterion("ATS_DEALDATE >", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ATS_DEALDATE >=", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateLessThan(Date value) {
            addCriterion("ATS_DEALDATE <", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateLessThanOrEqualTo(Date value) {
            addCriterion("ATS_DEALDATE <=", value, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateIn(List<Date> values) {
            addCriterion("ATS_DEALDATE in", values, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateNotIn(List<Date> values) {
            addCriterion("ATS_DEALDATE not in", values, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateBetween(Date value1, Date value2) {
            addCriterion("ATS_DEALDATE between", value1, value2, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealdateNotBetween(Date value1, Date value2) {
            addCriterion("ATS_DEALDATE not between", value1, value2, "atsDealdate");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoIsNull() {
            addCriterion("ATS_DEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoIsNotNull() {
            addCriterion("ATS_DEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoEqualTo(String value) {
            addCriterion("ATS_DEALERRORINFO =", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoNotEqualTo(String value) {
            addCriterion("ATS_DEALERRORINFO <>", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoGreaterThan(String value) {
            addCriterion("ATS_DEALERRORINFO >", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ATS_DEALERRORINFO >=", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoLessThan(String value) {
            addCriterion("ATS_DEALERRORINFO <", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("ATS_DEALERRORINFO <=", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoLike(String value) {
            addCriterion("ATS_DEALERRORINFO like", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoNotLike(String value) {
            addCriterion("ATS_DEALERRORINFO not like", value, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoIn(List<String> values) {
            addCriterion("ATS_DEALERRORINFO in", values, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoNotIn(List<String> values) {
            addCriterion("ATS_DEALERRORINFO not in", values, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoBetween(String value1, String value2) {
            addCriterion("ATS_DEALERRORINFO between", value1, value2, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsDealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("ATS_DEALERRORINFO not between", value1, value2, "atsDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateIsNull() {
            addCriterion("ATS_RETURNSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateIsNotNull() {
            addCriterion("ATS_RETURNSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateEqualTo(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE =", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateNotEqualTo(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE <>", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateGreaterThan(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE >", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE >=", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateLessThan(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE <", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ATS_RETURNSTATE <=", value, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateIn(List<BigDecimal> values) {
            addCriterion("ATS_RETURNSTATE in", values, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateNotIn(List<BigDecimal> values) {
            addCriterion("ATS_RETURNSTATE not in", values, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATS_RETURNSTATE between", value1, value2, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturnstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATS_RETURNSTATE not between", value1, value2, "atsReturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateIsNull() {
            addCriterion("ATS_RETURNDATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateIsNotNull() {
            addCriterion("ATS_RETURNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateEqualTo(Date value) {
            addCriterion("ATS_RETURNDATE =", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateNotEqualTo(Date value) {
            addCriterion("ATS_RETURNDATE <>", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateGreaterThan(Date value) {
            addCriterion("ATS_RETURNDATE >", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("ATS_RETURNDATE >=", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateLessThan(Date value) {
            addCriterion("ATS_RETURNDATE <", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateLessThanOrEqualTo(Date value) {
            addCriterion("ATS_RETURNDATE <=", value, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateIn(List<Date> values) {
            addCriterion("ATS_RETURNDATE in", values, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateNotIn(List<Date> values) {
            addCriterion("ATS_RETURNDATE not in", values, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateBetween(Date value1, Date value2) {
            addCriterion("ATS_RETURNDATE between", value1, value2, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturndateNotBetween(Date value1, Date value2) {
            addCriterion("ATS_RETURNDATE not between", value1, value2, "atsReturndate");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoIsNull() {
            addCriterion("ATS_RETURNINFO is null");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoIsNotNull() {
            addCriterion("ATS_RETURNINFO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoEqualTo(String value) {
            addCriterion("ATS_RETURNINFO =", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoNotEqualTo(String value) {
            addCriterion("ATS_RETURNINFO <>", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoGreaterThan(String value) {
            addCriterion("ATS_RETURNINFO >", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoGreaterThanOrEqualTo(String value) {
            addCriterion("ATS_RETURNINFO >=", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoLessThan(String value) {
            addCriterion("ATS_RETURNINFO <", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoLessThanOrEqualTo(String value) {
            addCriterion("ATS_RETURNINFO <=", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoLike(String value) {
            addCriterion("ATS_RETURNINFO like", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoNotLike(String value) {
            addCriterion("ATS_RETURNINFO not like", value, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoIn(List<String> values) {
            addCriterion("ATS_RETURNINFO in", values, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoNotIn(List<String> values) {
            addCriterion("ATS_RETURNINFO not in", values, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoBetween(String value1, String value2) {
            addCriterion("ATS_RETURNINFO between", value1, value2, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsReturninfoNotBetween(String value1, String value2) {
            addCriterion("ATS_RETURNINFO not between", value1, value2, "atsReturninfo");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(BigDecimal value) {
            addCriterion("PAY_STATE =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(BigDecimal value) {
            addCriterion("PAY_STATE <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(BigDecimal value) {
            addCriterion("PAY_STATE >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_STATE >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(BigDecimal value) {
            addCriterion("PAY_STATE <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_STATE <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<BigDecimal> values) {
            addCriterion("PAY_STATE in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<BigDecimal> values) {
            addCriterion("PAY_STATE not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_STATE between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_STATE not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateIsNull() {
            addCriterion("PAY_MADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateIsNotNull() {
            addCriterion("PAY_MADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateEqualTo(Date value) {
            addCriterion("PAY_MADE_DATE =", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateNotEqualTo(Date value) {
            addCriterion("PAY_MADE_DATE <>", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateGreaterThan(Date value) {
            addCriterion("PAY_MADE_DATE >", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_MADE_DATE >=", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateLessThan(Date value) {
            addCriterion("PAY_MADE_DATE <", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateLessThanOrEqualTo(Date value) {
            addCriterion("PAY_MADE_DATE <=", value, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateIn(List<Date> values) {
            addCriterion("PAY_MADE_DATE in", values, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateNotIn(List<Date> values) {
            addCriterion("PAY_MADE_DATE not in", values, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateBetween(Date value1, Date value2) {
            addCriterion("PAY_MADE_DATE between", value1, value2, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayMadeDateNotBetween(Date value1, Date value2) {
            addCriterion("PAY_MADE_DATE not between", value1, value2, "payMadeDate");
            return (Criteria) this;
        }

        public Criteria andPayInfoIsNull() {
            addCriterion("PAY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIsNotNull() {
            addCriterion("PAY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPayInfoEqualTo(String value) {
            addCriterion("PAY_INFO =", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotEqualTo(String value) {
            addCriterion("PAY_INFO <>", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoGreaterThan(String value) {
            addCriterion("PAY_INFO >", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_INFO >=", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLessThan(String value) {
            addCriterion("PAY_INFO <", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLessThanOrEqualTo(String value) {
            addCriterion("PAY_INFO <=", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLike(String value) {
            addCriterion("PAY_INFO like", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotLike(String value) {
            addCriterion("PAY_INFO not like", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoIn(List<String> values) {
            addCriterion("PAY_INFO in", values, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotIn(List<String> values) {
            addCriterion("PAY_INFO not in", values, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoBetween(String value1, String value2) {
            addCriterion("PAY_INFO between", value1, value2, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotBetween(String value1, String value2) {
            addCriterion("PAY_INFO not between", value1, value2, "payInfo");
            return (Criteria) this;
        }

        public Criteria andFailTypeIsNull() {
            addCriterion("FAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFailTypeIsNotNull() {
            addCriterion("FAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFailTypeEqualTo(BigDecimal value) {
            addCriterion("FAIL_TYPE =", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_TYPE <>", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeGreaterThan(BigDecimal value) {
            addCriterion("FAIL_TYPE >", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_TYPE >=", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeLessThan(BigDecimal value) {
            addCriterion("FAIL_TYPE <", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_TYPE <=", value, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeIn(List<BigDecimal> values) {
            addCriterion("FAIL_TYPE in", values, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_TYPE not in", values, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_TYPE between", value1, value2, "failType");
            return (Criteria) this;
        }

        public Criteria andFailTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_TYPE not between", value1, value2, "failType");
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

        public Criteria andCheckbatchnoIsNull() {
            addCriterion("CHECKBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoIsNotNull() {
            addCriterion("CHECKBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoEqualTo(String value) {
            addCriterion("CHECKBATCHNO =", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoNotEqualTo(String value) {
            addCriterion("CHECKBATCHNO <>", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoGreaterThan(String value) {
            addCriterion("CHECKBATCHNO >", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKBATCHNO >=", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoLessThan(String value) {
            addCriterion("CHECKBATCHNO <", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoLessThanOrEqualTo(String value) {
            addCriterion("CHECKBATCHNO <=", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoLike(String value) {
            addCriterion("CHECKBATCHNO like", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoNotLike(String value) {
            addCriterion("CHECKBATCHNO not like", value, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoIn(List<String> values) {
            addCriterion("CHECKBATCHNO in", values, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoNotIn(List<String> values) {
            addCriterion("CHECKBATCHNO not in", values, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoBetween(String value1, String value2) {
            addCriterion("CHECKBATCHNO between", value1, value2, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andCheckbatchnoNotBetween(String value1, String value2) {
            addCriterion("CHECKBATCHNO not between", value1, value2, "checkbatchno");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNull() {
            addCriterion("REFUND_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("REFUND_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(BigDecimal value) {
            addCriterion("REFUND_STATE =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_STATE <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(BigDecimal value) {
            addCriterion("REFUND_STATE >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_STATE >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(BigDecimal value) {
            addCriterion("REFUND_STATE <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_STATE <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<BigDecimal> values) {
            addCriterion("REFUND_STATE in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_STATE not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_STATE between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_STATE not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIsNull() {
            addCriterion("REFUND_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIsNotNull() {
            addCriterion("REFUND_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundInfoEqualTo(String value) {
            addCriterion("REFUND_INFO =", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotEqualTo(String value) {
            addCriterion("REFUND_INFO <>", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoGreaterThan(String value) {
            addCriterion("REFUND_INFO >", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_INFO >=", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLessThan(String value) {
            addCriterion("REFUND_INFO <", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLessThanOrEqualTo(String value) {
            addCriterion("REFUND_INFO <=", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLike(String value) {
            addCriterion("REFUND_INFO like", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotLike(String value) {
            addCriterion("REFUND_INFO not like", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIn(List<String> values) {
            addCriterion("REFUND_INFO in", values, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotIn(List<String> values) {
            addCriterion("REFUND_INFO not in", values, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoBetween(String value1, String value2) {
            addCriterion("REFUND_INFO between", value1, value2, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotBetween(String value1, String value2) {
            addCriterion("REFUND_INFO not between", value1, value2, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("REFUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("REFUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("REFUND_TIME =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("REFUND_TIME <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("REFUND_TIME >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_TIME >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("REFUND_TIME <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_TIME <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("REFUND_TIME in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("REFUND_TIME not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_TIME between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_TIME not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNull() {
            addCriterion("BILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNotNull() {
            addCriterion("BILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypeEqualTo(String value) {
            addCriterion("BILLTYPE =", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotEqualTo(String value) {
            addCriterion("BILLTYPE <>", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThan(String value) {
            addCriterion("BILLTYPE >", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLTYPE >=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThan(String value) {
            addCriterion("BILLTYPE <", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThanOrEqualTo(String value) {
            addCriterion("BILLTYPE <=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLike(String value) {
            addCriterion("BILLTYPE like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotLike(String value) {
            addCriterion("BILLTYPE not like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIn(List<String> values) {
            addCriterion("BILLTYPE in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotIn(List<String> values) {
            addCriterion("BILLTYPE not in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeBetween(String value1, String value2) {
            addCriterion("BILLTYPE between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotBetween(String value1, String value2) {
            addCriterion("BILLTYPE not between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNull() {
            addCriterion("BILLCODE is null");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNotNull() {
            addCriterion("BILLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillcodeEqualTo(String value) {
            addCriterion("BILLCODE =", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotEqualTo(String value) {
            addCriterion("BILLCODE <>", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThan(String value) {
            addCriterion("BILLCODE >", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLCODE >=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThan(String value) {
            addCriterion("BILLCODE <", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThanOrEqualTo(String value) {
            addCriterion("BILLCODE <=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLike(String value) {
            addCriterion("BILLCODE like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotLike(String value) {
            addCriterion("BILLCODE not like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeIn(List<String> values) {
            addCriterion("BILLCODE in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotIn(List<String> values) {
            addCriterion("BILLCODE not in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeBetween(String value1, String value2) {
            addCriterion("BILLCODE between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotBetween(String value1, String value2) {
            addCriterion("BILLCODE not between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateIsNull() {
            addCriterion("SOURCE_DEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateIsNotNull() {
            addCriterion("SOURCE_DEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateEqualTo(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE =", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateNotEqualTo(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE <>", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateGreaterThan(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE >", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE >=", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateLessThan(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE <", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCE_DEALSTATE <=", value, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateIn(List<BigDecimal> values) {
            addCriterion("SOURCE_DEALSTATE in", values, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateNotIn(List<BigDecimal> values) {
            addCriterion("SOURCE_DEALSTATE not in", values, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCE_DEALSTATE between", value1, value2, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCE_DEALSTATE not between", value1, value2, "sourceDealstate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateIsNull() {
            addCriterion("SOURCE_DEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateIsNotNull() {
            addCriterion("SOURCE_DEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateEqualTo(Date value) {
            addCriterion("SOURCE_DEALDATE =", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateNotEqualTo(Date value) {
            addCriterion("SOURCE_DEALDATE <>", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateGreaterThan(Date value) {
            addCriterion("SOURCE_DEALDATE >", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SOURCE_DEALDATE >=", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateLessThan(Date value) {
            addCriterion("SOURCE_DEALDATE <", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateLessThanOrEqualTo(Date value) {
            addCriterion("SOURCE_DEALDATE <=", value, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateIn(List<Date> values) {
            addCriterion("SOURCE_DEALDATE in", values, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateNotIn(List<Date> values) {
            addCriterion("SOURCE_DEALDATE not in", values, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateBetween(Date value1, Date value2) {
            addCriterion("SOURCE_DEALDATE between", value1, value2, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealdateNotBetween(Date value1, Date value2) {
            addCriterion("SOURCE_DEALDATE not between", value1, value2, "sourceDealdate");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoIsNull() {
            addCriterion("SOURCE_DEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoIsNotNull() {
            addCriterion("SOURCE_DEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoEqualTo(String value) {
            addCriterion("SOURCE_DEALERRORINFO =", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoNotEqualTo(String value) {
            addCriterion("SOURCE_DEALERRORINFO <>", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoGreaterThan(String value) {
            addCriterion("SOURCE_DEALERRORINFO >", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_DEALERRORINFO >=", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoLessThan(String value) {
            addCriterion("SOURCE_DEALERRORINFO <", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_DEALERRORINFO <=", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoLike(String value) {
            addCriterion("SOURCE_DEALERRORINFO like", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoNotLike(String value) {
            addCriterion("SOURCE_DEALERRORINFO not like", value, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoIn(List<String> values) {
            addCriterion("SOURCE_DEALERRORINFO in", values, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoNotIn(List<String> values) {
            addCriterion("SOURCE_DEALERRORINFO not in", values, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoBetween(String value1, String value2) {
            addCriterion("SOURCE_DEALERRORINFO between", value1, value2, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceDealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("SOURCE_DEALERRORINFO not between", value1, value2, "sourceDealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateIsNull() {
            addCriterion("SOURCE_REFUNDDEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateIsNotNull() {
            addCriterion("SOURCE_REFUNDDEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateEqualTo(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE =", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateNotEqualTo(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE <>", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateGreaterThan(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE >", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE >=", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateLessThan(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE <", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCE_REFUNDDEALSTATE <=", value, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateIn(List<BigDecimal> values) {
            addCriterion("SOURCE_REFUNDDEALSTATE in", values, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateNotIn(List<BigDecimal> values) {
            addCriterion("SOURCE_REFUNDDEALSTATE not in", values, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCE_REFUNDDEALSTATE between", value1, value2, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCE_REFUNDDEALSTATE not between", value1, value2, "sourceRefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateIsNull() {
            addCriterion("SOURCE_REFUNDDEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateIsNotNull() {
            addCriterion("SOURCE_REFUNDDEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateEqualTo(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE =", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateNotEqualTo(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE <>", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateGreaterThan(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE >", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE >=", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateLessThan(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE <", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateLessThanOrEqualTo(Date value) {
            addCriterion("SOURCE_REFUNDDEALDATE <=", value, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateIn(List<Date> values) {
            addCriterion("SOURCE_REFUNDDEALDATE in", values, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateNotIn(List<Date> values) {
            addCriterion("SOURCE_REFUNDDEALDATE not in", values, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateBetween(Date value1, Date value2) {
            addCriterion("SOURCE_REFUNDDEALDATE between", value1, value2, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealdateNotBetween(Date value1, Date value2) {
            addCriterion("SOURCE_REFUNDDEALDATE not between", value1, value2, "sourceRefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoIsNull() {
            addCriterion("SOURCE_REFUNDDEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoIsNotNull() {
            addCriterion("SOURCE_REFUNDDEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoEqualTo(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO =", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoNotEqualTo(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO <>", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoGreaterThan(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO >", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO >=", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoLessThan(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO <", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO <=", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoLike(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO like", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoNotLike(String value) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO not like", value, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoIn(List<String> values) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO in", values, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoNotIn(List<String> values) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO not in", values, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoBetween(String value1, String value2) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO between", value1, value2, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourceRefunddealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("SOURCE_REFUNDDEALERRORINFO not between", value1, value2, "sourceRefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(BigDecimal value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(BigDecimal value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(BigDecimal value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(BigDecimal value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<BigDecimal> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<BigDecimal> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_UPDATED_BY <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<BigDecimal> values) {
            addCriterion("LAST_UPDATED_BY in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<BigDecimal> values) {
            addCriterion("LAST_UPDATED_BY not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_UPDATED_BY between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_UPDATED_BY not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNull() {
            addCriterion("ROW_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNotNull() {
            addCriterion("ROW_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRowVersionEqualTo(BigDecimal value) {
            addCriterion("ROW_VERSION =", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotEqualTo(BigDecimal value) {
            addCriterion("ROW_VERSION <>", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThan(BigDecimal value) {
            addCriterion("ROW_VERSION >", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROW_VERSION >=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThan(BigDecimal value) {
            addCriterion("ROW_VERSION <", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROW_VERSION <=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionIn(List<BigDecimal> values) {
            addCriterion("ROW_VERSION in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotIn(List<BigDecimal> values) {
            addCriterion("ROW_VERSION not in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROW_VERSION between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROW_VERSION not between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNull() {
            addCriterion("MOVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNotNull() {
            addCriterion("MOVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMovedateEqualTo(Date value) {
            addCriterion("MOVEDATE =", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotEqualTo(Date value) {
            addCriterion("MOVEDATE <>", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThan(Date value) {
            addCriterion("MOVEDATE >", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("MOVEDATE >=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThan(Date value) {
            addCriterion("MOVEDATE <", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThanOrEqualTo(Date value) {
            addCriterion("MOVEDATE <=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateIn(List<Date> values) {
            addCriterion("MOVEDATE in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotIn(List<Date> values) {
            addCriterion("MOVEDATE not in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateBetween(Date value1, Date value2) {
            addCriterion("MOVEDATE between", value1, value2, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotBetween(Date value1, Date value2) {
            addCriterion("MOVEDATE not between", value1, value2, "movedate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : ats_pay_transactions_history
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
     * @Table : ats_pay_transactions_history
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