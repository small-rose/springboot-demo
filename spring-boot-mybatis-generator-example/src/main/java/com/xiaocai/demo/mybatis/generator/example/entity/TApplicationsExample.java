package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApplicationsExample {
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
    public TApplicationsExample() {
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
     * @Table : t_applications
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

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIsNull() {
            addCriterion("CHECK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIsNotNull() {
            addCriterion("CHECK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeEqualTo(String value) {
            addCriterion("CHECK_CODE =", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotEqualTo(String value) {
            addCriterion("CHECK_CODE <>", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThan(String value) {
            addCriterion("CHECK_CODE >", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_CODE >=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThan(String value) {
            addCriterion("CHECK_CODE <", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_CODE <=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLike(String value) {
            addCriterion("CHECK_CODE like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotLike(String value) {
            addCriterion("CHECK_CODE not like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIn(List<String> values) {
            addCriterion("CHECK_CODE in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotIn(List<String> values) {
            addCriterion("CHECK_CODE not in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeBetween(String value1, String value2) {
            addCriterion("CHECK_CODE between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotBetween(String value1, String value2) {
            addCriterion("CHECK_CODE not between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNull() {
            addCriterion("INSU_MIDNO is null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIsNotNull() {
            addCriterion("INSU_MIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoEqualTo(String value) {
            addCriterion("INSU_MIDNO =", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotEqualTo(String value) {
            addCriterion("INSU_MIDNO <>", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThan(String value) {
            addCriterion("INSU_MIDNO >", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoGreaterThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO >=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThan(String value) {
            addCriterion("INSU_MIDNO <", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLessThanOrEqualTo(String value) {
            addCriterion("INSU_MIDNO <=", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoLike(String value) {
            addCriterion("INSU_MIDNO like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotLike(String value) {
            addCriterion("INSU_MIDNO not like", value, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoIn(List<String> values) {
            addCriterion("INSU_MIDNO in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotIn(List<String> values) {
            addCriterion("INSU_MIDNO not in", values, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO between", value1, value2, "insuMidno");
            return (Criteria) this;
        }

        public Criteria andInsuMidnoNotBetween(String value1, String value2) {
            addCriterion("INSU_MIDNO not between", value1, value2, "insuMidno");
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

        public Criteria andOppwIsNull() {
            addCriterion("OPPW is null");
            return (Criteria) this;
        }

        public Criteria andOppwIsNotNull() {
            addCriterion("OPPW is not null");
            return (Criteria) this;
        }

        public Criteria andOppwEqualTo(String value) {
            addCriterion("OPPW =", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwNotEqualTo(String value) {
            addCriterion("OPPW <>", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwGreaterThan(String value) {
            addCriterion("OPPW >", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwGreaterThanOrEqualTo(String value) {
            addCriterion("OPPW >=", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwLessThan(String value) {
            addCriterion("OPPW <", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwLessThanOrEqualTo(String value) {
            addCriterion("OPPW <=", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwLike(String value) {
            addCriterion("OPPW like", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwNotLike(String value) {
            addCriterion("OPPW not like", value, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwIn(List<String> values) {
            addCriterion("OPPW in", values, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwNotIn(List<String> values) {
            addCriterion("OPPW not in", values, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwBetween(String value1, String value2) {
            addCriterion("OPPW between", value1, value2, "oppw");
            return (Criteria) this;
        }

        public Criteria andOppwNotBetween(String value1, String value2) {
            addCriterion("OPPW not between", value1, value2, "oppw");
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

        public Criteria andTanoIsNull() {
            addCriterion("TANO is null");
            return (Criteria) this;
        }

        public Criteria andTanoIsNotNull() {
            addCriterion("TANO is not null");
            return (Criteria) this;
        }

        public Criteria andTanoEqualTo(String value) {
            addCriterion("TANO =", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotEqualTo(String value) {
            addCriterion("TANO <>", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThan(String value) {
            addCriterion("TANO >", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThanOrEqualTo(String value) {
            addCriterion("TANO >=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThan(String value) {
            addCriterion("TANO <", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThanOrEqualTo(String value) {
            addCriterion("TANO <=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLike(String value) {
            addCriterion("TANO like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotLike(String value) {
            addCriterion("TANO not like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoIn(List<String> values) {
            addCriterion("TANO in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotIn(List<String> values) {
            addCriterion("TANO not in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoBetween(String value1, String value2) {
            addCriterion("TANO between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotBetween(String value1, String value2) {
            addCriterion("TANO not between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCheckcountIsNull() {
            addCriterion("CHECKCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCheckcountIsNotNull() {
            addCriterion("CHECKCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcountEqualTo(BigDecimal value) {
            addCriterion("CHECKCOUNT =", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountNotEqualTo(BigDecimal value) {
            addCriterion("CHECKCOUNT <>", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountGreaterThan(BigDecimal value) {
            addCriterion("CHECKCOUNT >", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKCOUNT >=", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountLessThan(BigDecimal value) {
            addCriterion("CHECKCOUNT <", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKCOUNT <=", value, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountIn(List<BigDecimal> values) {
            addCriterion("CHECKCOUNT in", values, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountNotIn(List<BigDecimal> values) {
            addCriterion("CHECKCOUNT not in", values, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKCOUNT between", value1, value2, "checkcount");
            return (Criteria) this;
        }

        public Criteria andCheckcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKCOUNT not between", value1, value2, "checkcount");
            return (Criteria) this;
        }

        public Criteria andRecognitionidIsNull() {
            addCriterion("RECOGNITIONID is null");
            return (Criteria) this;
        }

        public Criteria andRecognitionidIsNotNull() {
            addCriterion("RECOGNITIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRecognitionidEqualTo(String value) {
            addCriterion("RECOGNITIONID =", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidNotEqualTo(String value) {
            addCriterion("RECOGNITIONID <>", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidGreaterThan(String value) {
            addCriterion("RECOGNITIONID >", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidGreaterThanOrEqualTo(String value) {
            addCriterion("RECOGNITIONID >=", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidLessThan(String value) {
            addCriterion("RECOGNITIONID <", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidLessThanOrEqualTo(String value) {
            addCriterion("RECOGNITIONID <=", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidLike(String value) {
            addCriterion("RECOGNITIONID like", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidNotLike(String value) {
            addCriterion("RECOGNITIONID not like", value, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidIn(List<String> values) {
            addCriterion("RECOGNITIONID in", values, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidNotIn(List<String> values) {
            addCriterion("RECOGNITIONID not in", values, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidBetween(String value1, String value2) {
            addCriterion("RECOGNITIONID between", value1, value2, "recognitionid");
            return (Criteria) this;
        }

        public Criteria andRecognitionidNotBetween(String value1, String value2) {
            addCriterion("RECOGNITIONID not between", value1, value2, "recognitionid");
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

        public Criteria andCheckserralIsNull() {
            addCriterion("CHECKSERRAL is null");
            return (Criteria) this;
        }

        public Criteria andCheckserralIsNotNull() {
            addCriterion("CHECKSERRAL is not null");
            return (Criteria) this;
        }

        public Criteria andCheckserralEqualTo(String value) {
            addCriterion("CHECKSERRAL =", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralNotEqualTo(String value) {
            addCriterion("CHECKSERRAL <>", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralGreaterThan(String value) {
            addCriterion("CHECKSERRAL >", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSERRAL >=", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralLessThan(String value) {
            addCriterion("CHECKSERRAL <", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralLessThanOrEqualTo(String value) {
            addCriterion("CHECKSERRAL <=", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralLike(String value) {
            addCriterion("CHECKSERRAL like", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralNotLike(String value) {
            addCriterion("CHECKSERRAL not like", value, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralIn(List<String> values) {
            addCriterion("CHECKSERRAL in", values, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralNotIn(List<String> values) {
            addCriterion("CHECKSERRAL not in", values, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralBetween(String value1, String value2) {
            addCriterion("CHECKSERRAL between", value1, value2, "checkserral");
            return (Criteria) this;
        }

        public Criteria andCheckserralNotBetween(String value1, String value2) {
            addCriterion("CHECKSERRAL not between", value1, value2, "checkserral");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIsNull() {
            addCriterion("POLICYSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIsNotNull() {
            addCriterion("POLICYSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateEqualTo(String value) {
            addCriterion("POLICYSTARTDATE =", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotEqualTo(String value) {
            addCriterion("POLICYSTARTDATE <>", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateGreaterThan(String value) {
            addCriterion("POLICYSTARTDATE >", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYSTARTDATE >=", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateLessThan(String value) {
            addCriterion("POLICYSTARTDATE <", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateLessThanOrEqualTo(String value) {
            addCriterion("POLICYSTARTDATE <=", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateLike(String value) {
            addCriterion("POLICYSTARTDATE like", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotLike(String value) {
            addCriterion("POLICYSTARTDATE not like", value, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateIn(List<String> values) {
            addCriterion("POLICYSTARTDATE in", values, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotIn(List<String> values) {
            addCriterion("POLICYSTARTDATE not in", values, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateBetween(String value1, String value2) {
            addCriterion("POLICYSTARTDATE between", value1, value2, "policystartdate");
            return (Criteria) this;
        }

        public Criteria andPolicystartdateNotBetween(String value1, String value2) {
            addCriterion("POLICYSTARTDATE not between", value1, value2, "policystartdate");
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

        public Criteria andCurrencytypeIsNull() {
            addCriterion("CURRENCYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIsNotNull() {
            addCriterion("CURRENCYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeEqualTo(String value) {
            addCriterion("CURRENCYTYPE =", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotEqualTo(String value) {
            addCriterion("CURRENCYTYPE <>", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeGreaterThan(String value) {
            addCriterion("CURRENCYTYPE >", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYTYPE >=", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLessThan(String value) {
            addCriterion("CURRENCYTYPE <", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYTYPE <=", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeLike(String value) {
            addCriterion("CURRENCYTYPE like", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotLike(String value) {
            addCriterion("CURRENCYTYPE not like", value, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeIn(List<String> values) {
            addCriterion("CURRENCYTYPE in", values, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotIn(List<String> values) {
            addCriterion("CURRENCYTYPE not in", values, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeBetween(String value1, String value2) {
            addCriterion("CURRENCYTYPE between", value1, value2, "currencytype");
            return (Criteria) this;
        }

        public Criteria andCurrencytypeNotBetween(String value1, String value2) {
            addCriterion("CURRENCYTYPE not between", value1, value2, "currencytype");
            return (Criteria) this;
        }

        public Criteria andParanormaldayIsNull() {
            addCriterion("PARANORMALDAY is null");
            return (Criteria) this;
        }

        public Criteria andParanormaldayIsNotNull() {
            addCriterion("PARANORMALDAY is not null");
            return (Criteria) this;
        }

        public Criteria andParanormaldayEqualTo(String value) {
            addCriterion("PARANORMALDAY =", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayNotEqualTo(String value) {
            addCriterion("PARANORMALDAY <>", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayGreaterThan(String value) {
            addCriterion("PARANORMALDAY >", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayGreaterThanOrEqualTo(String value) {
            addCriterion("PARANORMALDAY >=", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayLessThan(String value) {
            addCriterion("PARANORMALDAY <", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayLessThanOrEqualTo(String value) {
            addCriterion("PARANORMALDAY <=", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayLike(String value) {
            addCriterion("PARANORMALDAY like", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayNotLike(String value) {
            addCriterion("PARANORMALDAY not like", value, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayIn(List<String> values) {
            addCriterion("PARANORMALDAY in", values, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayNotIn(List<String> values) {
            addCriterion("PARANORMALDAY not in", values, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayBetween(String value1, String value2) {
            addCriterion("PARANORMALDAY between", value1, value2, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andParanormaldayNotBetween(String value1, String value2) {
            addCriterion("PARANORMALDAY not between", value1, value2, "paranormalday");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("INSUREDNAME is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("INSUREDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("INSUREDNAME =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("INSUREDNAME <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("INSUREDNAME >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("INSUREDNAME <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("INSUREDNAME <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("INSUREDNAME like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("INSUREDNAME not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("INSUREDNAME in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("INSUREDNAME not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("INSUREDNAME between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("INSUREDNAME not between", value1, value2, "insuredname");
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

        public Criteria andCustaccountnameIsNull() {
            addCriterion("CUSTACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIsNotNull() {
            addCriterion("CUSTACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME =", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <>", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAME >", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME >=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThan(String value) {
            addCriterion("CUSTACCOUNTNAME <", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAME <=", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameLike(String value) {
            addCriterion("CUSTACCOUNTNAME like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotLike(String value) {
            addCriterion("CUSTACCOUNTNAME not like", value, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAME not in", values, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAME not between", value1, value2, "custaccountname");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNull() {
            addCriterion("CUSTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIsNotNull() {
            addCriterion("CUSTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO =", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <>", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNO >", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO >=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThan(String value) {
            addCriterion("CUSTACCOUNTNO <", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNO <=", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoLike(String value) {
            addCriterion("CUSTACCOUNTNO like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotLike(String value) {
            addCriterion("CUSTACCOUNTNO not like", value, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNO not in", values, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andCustaccountnoNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNO not between", value1, value2, "custaccountno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
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

        public Criteria andBankcityIsNull() {
            addCriterion("BANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("BANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("BANKCITY =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("BANKCITY <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("BANKCITY >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCITY >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("BANKCITY <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("BANKCITY <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("BANKCITY like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("BANKCITY not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("BANKCITY in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("BANKCITY not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("BANKCITY between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("BANKCITY not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("BANKPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("BANKPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("BANKPROVINCE =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("BANKPROVINCE <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("BANKPROVINCE >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("BANKPROVINCE <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("BANKPROVINCE <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("BANKPROVINCE like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("BANKPROVINCE not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("BANKPROVINCE in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("BANKPROVINCE not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("BANKPROVINCE not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("BANKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("BANKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("BANKTYPE =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("BANKTYPE <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("BANKTYPE >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTYPE >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("BANKTYPE <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("BANKTYPE <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("BANKTYPE like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("BANKTYPE not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("BANKTYPE in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("BANKTYPE not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("BANKTYPE between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("BANKTYPE not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNull() {
            addCriterion("ISPAYPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIsNotNull() {
            addCriterion("ISPAYPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIspaypublicEqualTo(String value) {
            addCriterion("ISPAYPUBLIC =", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <>", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThan(String value) {
            addCriterion("ISPAYPUBLIC >", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicGreaterThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC >=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThan(String value) {
            addCriterion("ISPAYPUBLIC <", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLessThanOrEqualTo(String value) {
            addCriterion("ISPAYPUBLIC <=", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicLike(String value) {
            addCriterion("ISPAYPUBLIC like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotLike(String value) {
            addCriterion("ISPAYPUBLIC not like", value, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicIn(List<String> values) {
            addCriterion("ISPAYPUBLIC in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotIn(List<String> values) {
            addCriterion("ISPAYPUBLIC not in", values, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andIspaypublicNotBetween(String value1, String value2) {
            addCriterion("ISPAYPUBLIC not between", value1, value2, "ispaypublic");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNull() {
            addCriterion("CARDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCardflagIsNotNull() {
            addCriterion("CARDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCardflagEqualTo(String value) {
            addCriterion("CARDFLAG =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(String value) {
            addCriterion("CARDFLAG <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(String value) {
            addCriterion("CARDFLAG >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(String value) {
            addCriterion("CARDFLAG >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(String value) {
            addCriterion("CARDFLAG <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(String value) {
            addCriterion("CARDFLAG <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLike(String value) {
            addCriterion("CARDFLAG like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotLike(String value) {
            addCriterion("CARDFLAG not like", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<String> values) {
            addCriterion("CARDFLAG in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<String> values) {
            addCriterion("CARDFLAG not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(String value1, String value2) {
            addCriterion("CARDFLAG between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(String value1, String value2) {
            addCriterion("CARDFLAG not between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNull() {
            addCriterion("CERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNotNull() {
            addCriterion("CERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoEqualTo(String value) {
            addCriterion("CERTIFICATENO =", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotEqualTo(String value) {
            addCriterion("CERTIFICATENO <>", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThan(String value) {
            addCriterion("CERTIFICATENO >", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO >=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThan(String value) {
            addCriterion("CERTIFICATENO <", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO <=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLike(String value) {
            addCriterion("CERTIFICATENO like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotLike(String value) {
            addCriterion("CERTIFICATENO not like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIn(List<String> values) {
            addCriterion("CERTIFICATENO in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotIn(List<String> values) {
            addCriterion("CERTIFICATENO not in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO not between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNull() {
            addCriterion("CUSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("CUSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("CUSTEMAIL =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("CUSTEMAIL <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("CUSTEMAIL >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("CUSTEMAIL <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("CUSTEMAIL like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("CUSTEMAIL not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("CUSTEMAIL in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("CUSTEMAIL not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL not between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIsNull() {
            addCriterion("INPAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIsNotNull() {
            addCriterion("INPAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateEqualTo(Date value) {
            addCriterion("INPAYMENTDATE =", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotEqualTo(Date value) {
            addCriterion("INPAYMENTDATE <>", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateGreaterThan(Date value) {
            addCriterion("INPAYMENTDATE >", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPAYMENTDATE >=", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateLessThan(Date value) {
            addCriterion("INPAYMENTDATE <", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("INPAYMENTDATE <=", value, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateIn(List<Date> values) {
            addCriterion("INPAYMENTDATE in", values, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotIn(List<Date> values) {
            addCriterion("INPAYMENTDATE not in", values, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateBetween(Date value1, Date value2) {
            addCriterion("INPAYMENTDATE between", value1, value2, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("INPAYMENTDATE not between", value1, value2, "inpaymentdate");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeIsNull() {
            addCriterion("INPAYMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeIsNotNull() {
            addCriterion("INPAYMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeEqualTo(String value) {
            addCriterion("INPAYMENTTIME =", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeNotEqualTo(String value) {
            addCriterion("INPAYMENTTIME <>", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeGreaterThan(String value) {
            addCriterion("INPAYMENTTIME >", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTTIME >=", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeLessThan(String value) {
            addCriterion("INPAYMENTTIME <", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTTIME <=", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeLike(String value) {
            addCriterion("INPAYMENTTIME like", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeNotLike(String value) {
            addCriterion("INPAYMENTTIME not like", value, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeIn(List<String> values) {
            addCriterion("INPAYMENTTIME in", values, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeNotIn(List<String> values) {
            addCriterion("INPAYMENTTIME not in", values, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeBetween(String value1, String value2) {
            addCriterion("INPAYMENTTIME between", value1, value2, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andInpaymenttimeNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTTIME not between", value1, value2, "inpaymenttime");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationIsNull() {
            addCriterion("IFRECONCILIATION is null");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationIsNotNull() {
            addCriterion("IFRECONCILIATION is not null");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationEqualTo(String value) {
            addCriterion("IFRECONCILIATION =", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationNotEqualTo(String value) {
            addCriterion("IFRECONCILIATION <>", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationGreaterThan(String value) {
            addCriterion("IFRECONCILIATION >", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationGreaterThanOrEqualTo(String value) {
            addCriterion("IFRECONCILIATION >=", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationLessThan(String value) {
            addCriterion("IFRECONCILIATION <", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationLessThanOrEqualTo(String value) {
            addCriterion("IFRECONCILIATION <=", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationLike(String value) {
            addCriterion("IFRECONCILIATION like", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationNotLike(String value) {
            addCriterion("IFRECONCILIATION not like", value, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationIn(List<String> values) {
            addCriterion("IFRECONCILIATION in", values, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationNotIn(List<String> values) {
            addCriterion("IFRECONCILIATION not in", values, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationBetween(String value1, String value2) {
            addCriterion("IFRECONCILIATION between", value1, value2, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andIfreconciliationNotBetween(String value1, String value2) {
            addCriterion("IFRECONCILIATION not between", value1, value2, "ifreconciliation");
            return (Criteria) this;
        }

        public Criteria andMergeChannelIsNull() {
            addCriterion("MERGE_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andMergeChannelIsNotNull() {
            addCriterion("MERGE_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andMergeChannelEqualTo(String value) {
            addCriterion("MERGE_CHANNEL =", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelNotEqualTo(String value) {
            addCriterion("MERGE_CHANNEL <>", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelGreaterThan(String value) {
            addCriterion("MERGE_CHANNEL >", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelGreaterThanOrEqualTo(String value) {
            addCriterion("MERGE_CHANNEL >=", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelLessThan(String value) {
            addCriterion("MERGE_CHANNEL <", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelLessThanOrEqualTo(String value) {
            addCriterion("MERGE_CHANNEL <=", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelLike(String value) {
            addCriterion("MERGE_CHANNEL like", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelNotLike(String value) {
            addCriterion("MERGE_CHANNEL not like", value, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelIn(List<String> values) {
            addCriterion("MERGE_CHANNEL in", values, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelNotIn(List<String> values) {
            addCriterion("MERGE_CHANNEL not in", values, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelBetween(String value1, String value2) {
            addCriterion("MERGE_CHANNEL between", value1, value2, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andMergeChannelNotBetween(String value1, String value2) {
            addCriterion("MERGE_CHANNEL not between", value1, value2, "mergeChannel");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNull() {
            addCriterion("FATHERNO is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("FATHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(String value) {
            addCriterion("FATHERNO =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(String value) {
            addCriterion("FATHERNO <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(String value) {
            addCriterion("FATHERNO >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERNO >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(String value) {
            addCriterion("FATHERNO <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(String value) {
            addCriterion("FATHERNO <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLike(String value) {
            addCriterion("FATHERNO like", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotLike(String value) {
            addCriterion("FATHERNO not like", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<String> values) {
            addCriterion("FATHERNO in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<String> values) {
            addCriterion("FATHERNO not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(String value1, String value2) {
            addCriterion("FATHERNO between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(String value1, String value2) {
            addCriterion("FATHERNO not between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andIfmergeIsNull() {
            addCriterion("IFMERGE is null");
            return (Criteria) this;
        }

        public Criteria andIfmergeIsNotNull() {
            addCriterion("IFMERGE is not null");
            return (Criteria) this;
        }

        public Criteria andIfmergeEqualTo(String value) {
            addCriterion("IFMERGE =", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeNotEqualTo(String value) {
            addCriterion("IFMERGE <>", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeGreaterThan(String value) {
            addCriterion("IFMERGE >", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeGreaterThanOrEqualTo(String value) {
            addCriterion("IFMERGE >=", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeLessThan(String value) {
            addCriterion("IFMERGE <", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeLessThanOrEqualTo(String value) {
            addCriterion("IFMERGE <=", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeLike(String value) {
            addCriterion("IFMERGE like", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeNotLike(String value) {
            addCriterion("IFMERGE not like", value, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeIn(List<String> values) {
            addCriterion("IFMERGE in", values, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeNotIn(List<String> values) {
            addCriterion("IFMERGE not in", values, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeBetween(String value1, String value2) {
            addCriterion("IFMERGE between", value1, value2, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andIfmergeNotBetween(String value1, String value2) {
            addCriterion("IFMERGE not between", value1, value2, "ifmerge");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeIsNull() {
            addCriterion("MERGESPLITOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeIsNotNull() {
            addCriterion("MERGESPLITOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeEqualTo(String value) {
            addCriterion("MERGESPLITOPCODE =", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeNotEqualTo(String value) {
            addCriterion("MERGESPLITOPCODE <>", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeGreaterThan(String value) {
            addCriterion("MERGESPLITOPCODE >", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERGESPLITOPCODE >=", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeLessThan(String value) {
            addCriterion("MERGESPLITOPCODE <", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeLessThanOrEqualTo(String value) {
            addCriterion("MERGESPLITOPCODE <=", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeLike(String value) {
            addCriterion("MERGESPLITOPCODE like", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeNotLike(String value) {
            addCriterion("MERGESPLITOPCODE not like", value, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeIn(List<String> values) {
            addCriterion("MERGESPLITOPCODE in", values, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeNotIn(List<String> values) {
            addCriterion("MERGESPLITOPCODE not in", values, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeBetween(String value1, String value2) {
            addCriterion("MERGESPLITOPCODE between", value1, value2, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andMergesplitopcodeNotBetween(String value1, String value2) {
            addCriterion("MERGESPLITOPCODE not between", value1, value2, "mergesplitopcode");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelIsNull() {
            addCriterion("BEGINPAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelIsNotNull() {
            addCriterion("BEGINPAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelEqualTo(String value) {
            addCriterion("BEGINPAYCHANNEL =", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelNotEqualTo(String value) {
            addCriterion("BEGINPAYCHANNEL <>", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelGreaterThan(String value) {
            addCriterion("BEGINPAYCHANNEL >", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("BEGINPAYCHANNEL >=", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelLessThan(String value) {
            addCriterion("BEGINPAYCHANNEL <", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelLessThanOrEqualTo(String value) {
            addCriterion("BEGINPAYCHANNEL <=", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelLike(String value) {
            addCriterion("BEGINPAYCHANNEL like", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelNotLike(String value) {
            addCriterion("BEGINPAYCHANNEL not like", value, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelIn(List<String> values) {
            addCriterion("BEGINPAYCHANNEL in", values, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelNotIn(List<String> values) {
            addCriterion("BEGINPAYCHANNEL not in", values, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelBetween(String value1, String value2) {
            addCriterion("BEGINPAYCHANNEL between", value1, value2, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andBeginpaychannelNotBetween(String value1, String value2) {
            addCriterion("BEGINPAYCHANNEL not between", value1, value2, "beginpaychannel");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeIsNull() {
            addCriterion("DIRECTBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeIsNotNull() {
            addCriterion("DIRECTBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeEqualTo(String value) {
            addCriterion("DIRECTBANKCODE =", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeNotEqualTo(String value) {
            addCriterion("DIRECTBANKCODE <>", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeGreaterThan(String value) {
            addCriterion("DIRECTBANKCODE >", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTBANKCODE >=", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeLessThan(String value) {
            addCriterion("DIRECTBANKCODE <", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeLessThanOrEqualTo(String value) {
            addCriterion("DIRECTBANKCODE <=", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeLike(String value) {
            addCriterion("DIRECTBANKCODE like", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeNotLike(String value) {
            addCriterion("DIRECTBANKCODE not like", value, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeIn(List<String> values) {
            addCriterion("DIRECTBANKCODE in", values, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeNotIn(List<String> values) {
            addCriterion("DIRECTBANKCODE not in", values, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeBetween(String value1, String value2) {
            addCriterion("DIRECTBANKCODE between", value1, value2, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectbankcodeNotBetween(String value1, String value2) {
            addCriterion("DIRECTBANKCODE not between", value1, value2, "directbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeIsNull() {
            addCriterion("DIRECT_ORDERBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeIsNotNull() {
            addCriterion("DIRECT_ORDERBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeEqualTo(String value) {
            addCriterion("DIRECT_ORDERBANKCODE =", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeNotEqualTo(String value) {
            addCriterion("DIRECT_ORDERBANKCODE <>", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeGreaterThan(String value) {
            addCriterion("DIRECT_ORDERBANKCODE >", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECT_ORDERBANKCODE >=", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeLessThan(String value) {
            addCriterion("DIRECT_ORDERBANKCODE <", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeLessThanOrEqualTo(String value) {
            addCriterion("DIRECT_ORDERBANKCODE <=", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeLike(String value) {
            addCriterion("DIRECT_ORDERBANKCODE like", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeNotLike(String value) {
            addCriterion("DIRECT_ORDERBANKCODE not like", value, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeIn(List<String> values) {
            addCriterion("DIRECT_ORDERBANKCODE in", values, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeNotIn(List<String> values) {
            addCriterion("DIRECT_ORDERBANKCODE not in", values, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeBetween(String value1, String value2) {
            addCriterion("DIRECT_ORDERBANKCODE between", value1, value2, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andDirectOrderbankcodeNotBetween(String value1, String value2) {
            addCriterion("DIRECT_ORDERBANKCODE not between", value1, value2, "directOrderbankcode");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNull() {
            addCriterion("EXPIRYDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNotNull() {
            addCriterion("EXPIRYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydateEqualTo(String value) {
            addCriterion("EXPIRYDATE =", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotEqualTo(String value) {
            addCriterion("EXPIRYDATE <>", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThan(String value) {
            addCriterion("EXPIRYDATE >", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRYDATE >=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThan(String value) {
            addCriterion("EXPIRYDATE <", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThanOrEqualTo(String value) {
            addCriterion("EXPIRYDATE <=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLike(String value) {
            addCriterion("EXPIRYDATE like", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotLike(String value) {
            addCriterion("EXPIRYDATE not like", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateIn(List<String> values) {
            addCriterion("EXPIRYDATE in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotIn(List<String> values) {
            addCriterion("EXPIRYDATE not in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateBetween(String value1, String value2) {
            addCriterion("EXPIRYDATE between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotBetween(String value1, String value2) {
            addCriterion("EXPIRYDATE not between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andStagenumIsNull() {
            addCriterion("STAGENUM is null");
            return (Criteria) this;
        }

        public Criteria andStagenumIsNotNull() {
            addCriterion("STAGENUM is not null");
            return (Criteria) this;
        }

        public Criteria andStagenumEqualTo(String value) {
            addCriterion("STAGENUM =", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumNotEqualTo(String value) {
            addCriterion("STAGENUM <>", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumGreaterThan(String value) {
            addCriterion("STAGENUM >", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumGreaterThanOrEqualTo(String value) {
            addCriterion("STAGENUM >=", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumLessThan(String value) {
            addCriterion("STAGENUM <", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumLessThanOrEqualTo(String value) {
            addCriterion("STAGENUM <=", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumLike(String value) {
            addCriterion("STAGENUM like", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumNotLike(String value) {
            addCriterion("STAGENUM not like", value, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumIn(List<String> values) {
            addCriterion("STAGENUM in", values, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumNotIn(List<String> values) {
            addCriterion("STAGENUM not in", values, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumBetween(String value1, String value2) {
            addCriterion("STAGENUM between", value1, value2, "stagenum");
            return (Criteria) this;
        }

        public Criteria andStagenumNotBetween(String value1, String value2) {
            addCriterion("STAGENUM not between", value1, value2, "stagenum");
            return (Criteria) this;
        }

        public Criteria andBackurlIsNull() {
            addCriterion("BACKURL is null");
            return (Criteria) this;
        }

        public Criteria andBackurlIsNotNull() {
            addCriterion("BACKURL is not null");
            return (Criteria) this;
        }

        public Criteria andBackurlEqualTo(String value) {
            addCriterion("BACKURL =", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlNotEqualTo(String value) {
            addCriterion("BACKURL <>", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlGreaterThan(String value) {
            addCriterion("BACKURL >", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlGreaterThanOrEqualTo(String value) {
            addCriterion("BACKURL >=", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlLessThan(String value) {
            addCriterion("BACKURL <", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlLessThanOrEqualTo(String value) {
            addCriterion("BACKURL <=", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlLike(String value) {
            addCriterion("BACKURL like", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlNotLike(String value) {
            addCriterion("BACKURL not like", value, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlIn(List<String> values) {
            addCriterion("BACKURL in", values, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlNotIn(List<String> values) {
            addCriterion("BACKURL not in", values, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlBetween(String value1, String value2) {
            addCriterion("BACKURL between", value1, value2, "backurl");
            return (Criteria) this;
        }

        public Criteria andBackurlNotBetween(String value1, String value2) {
            addCriterion("BACKURL not between", value1, value2, "backurl");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameIsNull() {
            addCriterion("VEHICLEOWNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameIsNotNull() {
            addCriterion("VEHICLEOWNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameEqualTo(String value) {
            addCriterion("VEHICLEOWNERNAME =", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameNotEqualTo(String value) {
            addCriterion("VEHICLEOWNERNAME <>", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameGreaterThan(String value) {
            addCriterion("VEHICLEOWNERNAME >", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERNAME >=", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameLessThan(String value) {
            addCriterion("VEHICLEOWNERNAME <", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERNAME <=", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameLike(String value) {
            addCriterion("VEHICLEOWNERNAME like", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameNotLike(String value) {
            addCriterion("VEHICLEOWNERNAME not like", value, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameIn(List<String> values) {
            addCriterion("VEHICLEOWNERNAME in", values, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameNotIn(List<String> values) {
            addCriterion("VEHICLEOWNERNAME not in", values, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERNAME between", value1, value2, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernameNotBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERNAME not between", value1, value2, "vehicleownername");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureIsNull() {
            addCriterion("VEHICLEOWNERNATURE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureIsNotNull() {
            addCriterion("VEHICLEOWNERNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureEqualTo(String value) {
            addCriterion("VEHICLEOWNERNATURE =", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureNotEqualTo(String value) {
            addCriterion("VEHICLEOWNERNATURE <>", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureGreaterThan(String value) {
            addCriterion("VEHICLEOWNERNATURE >", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERNATURE >=", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureLessThan(String value) {
            addCriterion("VEHICLEOWNERNATURE <", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureLessThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERNATURE <=", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureLike(String value) {
            addCriterion("VEHICLEOWNERNATURE like", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureNotLike(String value) {
            addCriterion("VEHICLEOWNERNATURE not like", value, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureIn(List<String> values) {
            addCriterion("VEHICLEOWNERNATURE in", values, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureNotIn(List<String> values) {
            addCriterion("VEHICLEOWNERNATURE not in", values, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERNATURE between", value1, value2, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleownernatureNotBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERNATURE not between", value1, value2, "vehicleownernature");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeIsNull() {
            addCriterion("VEHICLEOWNERIDCODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeIsNotNull() {
            addCriterion("VEHICLEOWNERIDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDCODE =", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeNotEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDCODE <>", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeGreaterThan(String value) {
            addCriterion("VEHICLEOWNERIDCODE >", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDCODE >=", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeLessThan(String value) {
            addCriterion("VEHICLEOWNERIDCODE <", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDCODE <=", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeLike(String value) {
            addCriterion("VEHICLEOWNERIDCODE like", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeNotLike(String value) {
            addCriterion("VEHICLEOWNERIDCODE not like", value, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeIn(List<String> values) {
            addCriterion("VEHICLEOWNERIDCODE in", values, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeNotIn(List<String> values) {
            addCriterion("VEHICLEOWNERIDCODE not in", values, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERIDCODE between", value1, value2, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridcodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERIDCODE not between", value1, value2, "vehicleowneridcode");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoIsNull() {
            addCriterion("VEHICLEOWNERIDNO is null");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoIsNotNull() {
            addCriterion("VEHICLEOWNERIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDNO =", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoNotEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDNO <>", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoGreaterThan(String value) {
            addCriterion("VEHICLEOWNERIDNO >", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDNO >=", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoLessThan(String value) {
            addCriterion("VEHICLEOWNERIDNO <", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERIDNO <=", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoLike(String value) {
            addCriterion("VEHICLEOWNERIDNO like", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoNotLike(String value) {
            addCriterion("VEHICLEOWNERIDNO not like", value, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoIn(List<String> values) {
            addCriterion("VEHICLEOWNERIDNO in", values, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoNotIn(List<String> values) {
            addCriterion("VEHICLEOWNERIDNO not in", values, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERIDNO between", value1, value2, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleowneridnoNotBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERIDNO not between", value1, value2, "vehicleowneridno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoIsNull() {
            addCriterion("VEHICLEOWNERPHONENO is null");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoIsNotNull() {
            addCriterion("VEHICLEOWNERPHONENO is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoEqualTo(String value) {
            addCriterion("VEHICLEOWNERPHONENO =", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoNotEqualTo(String value) {
            addCriterion("VEHICLEOWNERPHONENO <>", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoGreaterThan(String value) {
            addCriterion("VEHICLEOWNERPHONENO >", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERPHONENO >=", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoLessThan(String value) {
            addCriterion("VEHICLEOWNERPHONENO <", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLEOWNERPHONENO <=", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoLike(String value) {
            addCriterion("VEHICLEOWNERPHONENO like", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoNotLike(String value) {
            addCriterion("VEHICLEOWNERPHONENO not like", value, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoIn(List<String> values) {
            addCriterion("VEHICLEOWNERPHONENO in", values, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoNotIn(List<String> values) {
            addCriterion("VEHICLEOWNERPHONENO not in", values, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERPHONENO between", value1, value2, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andVehicleownerphonenoNotBetween(String value1, String value2) {
            addCriterion("VEHICLEOWNERPHONENO not between", value1, value2, "vehicleownerphoneno");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeIsNull() {
            addCriterion("APPLICANTIDCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeIsNotNull() {
            addCriterion("APPLICANTIDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeEqualTo(String value) {
            addCriterion("APPLICANTIDCODE =", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeNotEqualTo(String value) {
            addCriterion("APPLICANTIDCODE <>", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeGreaterThan(String value) {
            addCriterion("APPLICANTIDCODE >", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTIDCODE >=", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeLessThan(String value) {
            addCriterion("APPLICANTIDCODE <", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTIDCODE <=", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeLike(String value) {
            addCriterion("APPLICANTIDCODE like", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeNotLike(String value) {
            addCriterion("APPLICANTIDCODE not like", value, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeIn(List<String> values) {
            addCriterion("APPLICANTIDCODE in", values, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeNotIn(List<String> values) {
            addCriterion("APPLICANTIDCODE not in", values, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeBetween(String value1, String value2) {
            addCriterion("APPLICANTIDCODE between", value1, value2, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andApplicantidcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTIDCODE not between", value1, value2, "applicantidcode");
            return (Criteria) this;
        }

        public Criteria andIscertificateIsNull() {
            addCriterion("ISCERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andIscertificateIsNotNull() {
            addCriterion("ISCERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andIscertificateEqualTo(String value) {
            addCriterion("ISCERTIFICATE =", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotEqualTo(String value) {
            addCriterion("ISCERTIFICATE <>", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateGreaterThan(String value) {
            addCriterion("ISCERTIFICATE >", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateGreaterThanOrEqualTo(String value) {
            addCriterion("ISCERTIFICATE >=", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLessThan(String value) {
            addCriterion("ISCERTIFICATE <", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLessThanOrEqualTo(String value) {
            addCriterion("ISCERTIFICATE <=", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateLike(String value) {
            addCriterion("ISCERTIFICATE like", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotLike(String value) {
            addCriterion("ISCERTIFICATE not like", value, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateIn(List<String> values) {
            addCriterion("ISCERTIFICATE in", values, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotIn(List<String> values) {
            addCriterion("ISCERTIFICATE not in", values, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateBetween(String value1, String value2) {
            addCriterion("ISCERTIFICATE between", value1, value2, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andIscertificateNotBetween(String value1, String value2) {
            addCriterion("ISCERTIFICATE not between", value1, value2, "iscertificate");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureIsNull() {
            addCriterion("APPLICANTNATURE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureIsNotNull() {
            addCriterion("APPLICANTNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureEqualTo(String value) {
            addCriterion("APPLICANTNATURE =", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureNotEqualTo(String value) {
            addCriterion("APPLICANTNATURE <>", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureGreaterThan(String value) {
            addCriterion("APPLICANTNATURE >", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNATURE >=", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureLessThan(String value) {
            addCriterion("APPLICANTNATURE <", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNATURE <=", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureLike(String value) {
            addCriterion("APPLICANTNATURE like", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureNotLike(String value) {
            addCriterion("APPLICANTNATURE not like", value, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureIn(List<String> values) {
            addCriterion("APPLICANTNATURE in", values, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureNotIn(List<String> values) {
            addCriterion("APPLICANTNATURE not in", values, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureBetween(String value1, String value2) {
            addCriterion("APPLICANTNATURE between", value1, value2, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andApplicantnatureNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNATURE not between", value1, value2, "applicantnature");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoIsNull() {
            addCriterion("AUTHENTICATIONNO is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoIsNotNull() {
            addCriterion("AUTHENTICATIONNO is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoEqualTo(String value) {
            addCriterion("AUTHENTICATIONNO =", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoNotEqualTo(String value) {
            addCriterion("AUTHENTICATIONNO <>", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoGreaterThan(String value) {
            addCriterion("AUTHENTICATIONNO >", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONNO >=", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoLessThan(String value) {
            addCriterion("AUTHENTICATIONNO <", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoLessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONNO <=", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoLike(String value) {
            addCriterion("AUTHENTICATIONNO like", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoNotLike(String value) {
            addCriterion("AUTHENTICATIONNO not like", value, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoIn(List<String> values) {
            addCriterion("AUTHENTICATIONNO in", values, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoNotIn(List<String> values) {
            addCriterion("AUTHENTICATIONNO not in", values, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONNO between", value1, value2, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationnoNotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONNO not between", value1, value2, "authenticationno");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultIsNull() {
            addCriterion("AUTHENTICATIONRESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultIsNotNull() {
            addCriterion("AUTHENTICATIONRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultEqualTo(String value) {
            addCriterion("AUTHENTICATIONRESULT =", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultNotEqualTo(String value) {
            addCriterion("AUTHENTICATIONRESULT <>", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultGreaterThan(String value) {
            addCriterion("AUTHENTICATIONRESULT >", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONRESULT >=", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultLessThan(String value) {
            addCriterion("AUTHENTICATIONRESULT <", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultLessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONRESULT <=", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultLike(String value) {
            addCriterion("AUTHENTICATIONRESULT like", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultNotLike(String value) {
            addCriterion("AUTHENTICATIONRESULT not like", value, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultIn(List<String> values) {
            addCriterion("AUTHENTICATIONRESULT in", values, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultNotIn(List<String> values) {
            addCriterion("AUTHENTICATIONRESULT not in", values, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONRESULT between", value1, value2, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andAuthenticationresultNotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONRESULT not between", value1, value2, "authenticationresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultIsNull() {
            addCriterion("CERTIFICATERESULT is null");
            return (Criteria) this;
        }

        public Criteria andCertificateresultIsNotNull() {
            addCriterion("CERTIFICATERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateresultEqualTo(String value) {
            addCriterion("CERTIFICATERESULT =", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultNotEqualTo(String value) {
            addCriterion("CERTIFICATERESULT <>", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultGreaterThan(String value) {
            addCriterion("CERTIFICATERESULT >", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATERESULT >=", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultLessThan(String value) {
            addCriterion("CERTIFICATERESULT <", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATERESULT <=", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultLike(String value) {
            addCriterion("CERTIFICATERESULT like", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultNotLike(String value) {
            addCriterion("CERTIFICATERESULT not like", value, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultIn(List<String> values) {
            addCriterion("CERTIFICATERESULT in", values, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultNotIn(List<String> values) {
            addCriterion("CERTIFICATERESULT not in", values, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultBetween(String value1, String value2) {
            addCriterion("CERTIFICATERESULT between", value1, value2, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andCertificateresultNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATERESULT not between", value1, value2, "certificateresult");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNull() {
            addCriterion("PAYACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNotNull() {
            addCriterion("PAYACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountEqualTo(String value) {
            addCriterion("PAYACCOUNT =", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotEqualTo(String value) {
            addCriterion("PAYACCOUNT <>", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThan(String value) {
            addCriterion("PAYACCOUNT >", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("PAYACCOUNT >=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThan(String value) {
            addCriterion("PAYACCOUNT <", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThanOrEqualTo(String value) {
            addCriterion("PAYACCOUNT <=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLike(String value) {
            addCriterion("PAYACCOUNT like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotLike(String value) {
            addCriterion("PAYACCOUNT not like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountIn(List<String> values) {
            addCriterion("PAYACCOUNT in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotIn(List<String> values) {
            addCriterion("PAYACCOUNT not in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountBetween(String value1, String value2) {
            addCriterion("PAYACCOUNT between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotBetween(String value1, String value2) {
            addCriterion("PAYACCOUNT not between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlIsNull() {
            addCriterion("PAYBKTRANCHNL is null");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlIsNotNull() {
            addCriterion("PAYBKTRANCHNL is not null");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlEqualTo(String value) {
            addCriterion("PAYBKTRANCHNL =", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlNotEqualTo(String value) {
            addCriterion("PAYBKTRANCHNL <>", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlGreaterThan(String value) {
            addCriterion("PAYBKTRANCHNL >", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBKTRANCHNL >=", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlLessThan(String value) {
            addCriterion("PAYBKTRANCHNL <", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlLessThanOrEqualTo(String value) {
            addCriterion("PAYBKTRANCHNL <=", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlLike(String value) {
            addCriterion("PAYBKTRANCHNL like", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlNotLike(String value) {
            addCriterion("PAYBKTRANCHNL not like", value, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlIn(List<String> values) {
            addCriterion("PAYBKTRANCHNL in", values, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlNotIn(List<String> values) {
            addCriterion("PAYBKTRANCHNL not in", values, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlBetween(String value1, String value2) {
            addCriterion("PAYBKTRANCHNL between", value1, value2, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaybktranchnlNotBetween(String value1, String value2) {
            addCriterion("PAYBKTRANCHNL not between", value1, value2, "paybktranchnl");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceIsNull() {
            addCriterion("PAYWAYSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceIsNotNull() {
            addCriterion("PAYWAYSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceEqualTo(String value) {
            addCriterion("PAYWAYSOURCE =", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceNotEqualTo(String value) {
            addCriterion("PAYWAYSOURCE <>", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceGreaterThan(String value) {
            addCriterion("PAYWAYSOURCE >", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAYSOURCE >=", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceLessThan(String value) {
            addCriterion("PAYWAYSOURCE <", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceLessThanOrEqualTo(String value) {
            addCriterion("PAYWAYSOURCE <=", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceLike(String value) {
            addCriterion("PAYWAYSOURCE like", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceNotLike(String value) {
            addCriterion("PAYWAYSOURCE not like", value, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceIn(List<String> values) {
            addCriterion("PAYWAYSOURCE in", values, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceNotIn(List<String> values) {
            addCriterion("PAYWAYSOURCE not in", values, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceBetween(String value1, String value2) {
            addCriterion("PAYWAYSOURCE between", value1, value2, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andPaywaysourceNotBetween(String value1, String value2) {
            addCriterion("PAYWAYSOURCE not between", value1, value2, "paywaysource");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIsNull() {
            addCriterion("PAYPROTOCOLNO is null");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIsNotNull() {
            addCriterion("PAYPROTOCOLNO is not null");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO =", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO <>", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoGreaterThan(String value) {
            addCriterion("PAYPROTOCOLNO >", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO >=", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLessThan(String value) {
            addCriterion("PAYPROTOCOLNO <", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLessThanOrEqualTo(String value) {
            addCriterion("PAYPROTOCOLNO <=", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoLike(String value) {
            addCriterion("PAYPROTOCOLNO like", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotLike(String value) {
            addCriterion("PAYPROTOCOLNO not like", value, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoIn(List<String> values) {
            addCriterion("PAYPROTOCOLNO in", values, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotIn(List<String> values) {
            addCriterion("PAYPROTOCOLNO not in", values, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoBetween(String value1, String value2) {
            addCriterion("PAYPROTOCOLNO between", value1, value2, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andPayprotocolnoNotBetween(String value1, String value2) {
            addCriterion("PAYPROTOCOLNO not between", value1, value2, "payprotocolno");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNull() {
            addCriterion("APPLYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNotNull() {
            addCriterion("APPLYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyamountEqualTo(String value) {
            addCriterion("APPLYAMOUNT =", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotEqualTo(String value) {
            addCriterion("APPLYAMOUNT <>", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThan(String value) {
            addCriterion("APPLYAMOUNT >", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYAMOUNT >=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThan(String value) {
            addCriterion("APPLYAMOUNT <", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThanOrEqualTo(String value) {
            addCriterion("APPLYAMOUNT <=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLike(String value) {
            addCriterion("APPLYAMOUNT like", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotLike(String value) {
            addCriterion("APPLYAMOUNT not like", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountIn(List<String> values) {
            addCriterion("APPLYAMOUNT in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotIn(List<String> values) {
            addCriterion("APPLYAMOUNT not in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountBetween(String value1, String value2) {
            addCriterion("APPLYAMOUNT between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotBetween(String value1, String value2) {
            addCriterion("APPLYAMOUNT not between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("UNITCODE like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("UNITCODE not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andHandletimesIsNull() {
            addCriterion("HANDLETIMES is null");
            return (Criteria) this;
        }

        public Criteria andHandletimesIsNotNull() {
            addCriterion("HANDLETIMES is not null");
            return (Criteria) this;
        }

        public Criteria andHandletimesEqualTo(String value) {
            addCriterion("HANDLETIMES =", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesNotEqualTo(String value) {
            addCriterion("HANDLETIMES <>", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesGreaterThan(String value) {
            addCriterion("HANDLETIMES >", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLETIMES >=", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesLessThan(String value) {
            addCriterion("HANDLETIMES <", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesLessThanOrEqualTo(String value) {
            addCriterion("HANDLETIMES <=", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesLike(String value) {
            addCriterion("HANDLETIMES like", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesNotLike(String value) {
            addCriterion("HANDLETIMES not like", value, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesIn(List<String> values) {
            addCriterion("HANDLETIMES in", values, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesNotIn(List<String> values) {
            addCriterion("HANDLETIMES not in", values, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesBetween(String value1, String value2) {
            addCriterion("HANDLETIMES between", value1, value2, "handletimes");
            return (Criteria) this;
        }

        public Criteria andHandletimesNotBetween(String value1, String value2) {
            addCriterion("HANDLETIMES not between", value1, value2, "handletimes");
            return (Criteria) this;
        }

        public Criteria andPayidIsNull() {
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(String value) {
            addCriterion("PAYID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(String value) {
            addCriterion("PAYID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(String value) {
            addCriterion("PAYID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(String value) {
            addCriterion("PAYID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(String value) {
            addCriterion("PAYID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(String value) {
            addCriterion("PAYID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLike(String value) {
            addCriterion("PAYID like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotLike(String value) {
            addCriterion("PAYID not like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<String> values) {
            addCriterion("PAYID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<String> values) {
            addCriterion("PAYID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(String value1, String value2) {
            addCriterion("PAYID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(String value1, String value2) {
            addCriterion("PAYID not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoIsNull() {
            addCriterion("CIPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoIsNotNull() {
            addCriterion("CIPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoEqualTo(String value) {
            addCriterion("CIPAYMENTNO =", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoNotEqualTo(String value) {
            addCriterion("CIPAYMENTNO <>", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoGreaterThan(String value) {
            addCriterion("CIPAYMENTNO >", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("CIPAYMENTNO >=", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoLessThan(String value) {
            addCriterion("CIPAYMENTNO <", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoLessThanOrEqualTo(String value) {
            addCriterion("CIPAYMENTNO <=", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoLike(String value) {
            addCriterion("CIPAYMENTNO like", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoNotLike(String value) {
            addCriterion("CIPAYMENTNO not like", value, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoIn(List<String> values) {
            addCriterion("CIPAYMENTNO in", values, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoNotIn(List<String> values) {
            addCriterion("CIPAYMENTNO not in", values, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoBetween(String value1, String value2) {
            addCriterion("CIPAYMENTNO between", value1, value2, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andCipaymentnoNotBetween(String value1, String value2) {
            addCriterion("CIPAYMENTNO not between", value1, value2, "cipaymentno");
            return (Criteria) this;
        }

        public Criteria andTxOpenidIsNull() {
            addCriterion("TX_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andTxOpenidIsNotNull() {
            addCriterion("TX_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andTxOpenidEqualTo(String value) {
            addCriterion("TX_OPENID =", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidNotEqualTo(String value) {
            addCriterion("TX_OPENID <>", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidGreaterThan(String value) {
            addCriterion("TX_OPENID >", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("TX_OPENID >=", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidLessThan(String value) {
            addCriterion("TX_OPENID <", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidLessThanOrEqualTo(String value) {
            addCriterion("TX_OPENID <=", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidLike(String value) {
            addCriterion("TX_OPENID like", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidNotLike(String value) {
            addCriterion("TX_OPENID not like", value, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidIn(List<String> values) {
            addCriterion("TX_OPENID in", values, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidNotIn(List<String> values) {
            addCriterion("TX_OPENID not in", values, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidBetween(String value1, String value2) {
            addCriterion("TX_OPENID between", value1, value2, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxOpenidNotBetween(String value1, String value2) {
            addCriterion("TX_OPENID not between", value1, value2, "txOpenid");
            return (Criteria) this;
        }

        public Criteria andTxCodeIsNull() {
            addCriterion("TX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTxCodeIsNotNull() {
            addCriterion("TX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTxCodeEqualTo(String value) {
            addCriterion("TX_CODE =", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotEqualTo(String value) {
            addCriterion("TX_CODE <>", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeGreaterThan(String value) {
            addCriterion("TX_CODE >", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TX_CODE >=", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLessThan(String value) {
            addCriterion("TX_CODE <", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLessThanOrEqualTo(String value) {
            addCriterion("TX_CODE <=", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLike(String value) {
            addCriterion("TX_CODE like", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotLike(String value) {
            addCriterion("TX_CODE not like", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeIn(List<String> values) {
            addCriterion("TX_CODE in", values, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotIn(List<String> values) {
            addCriterion("TX_CODE not in", values, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeBetween(String value1, String value2) {
            addCriterion("TX_CODE between", value1, value2, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotBetween(String value1, String value2) {
            addCriterion("TX_CODE not between", value1, value2, "txCode");
            return (Criteria) this;
        }

        public Criteria andPaymentnoIsNull() {
            addCriterion("PAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentnoIsNotNull() {
            addCriterion("PAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentnoEqualTo(String value) {
            addCriterion("PAYMENTNO =", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotEqualTo(String value) {
            addCriterion("PAYMENTNO <>", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoGreaterThan(String value) {
            addCriterion("PAYMENTNO >", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTNO >=", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLessThan(String value) {
            addCriterion("PAYMENTNO <", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTNO <=", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoLike(String value) {
            addCriterion("PAYMENTNO like", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotLike(String value) {
            addCriterion("PAYMENTNO not like", value, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoIn(List<String> values) {
            addCriterion("PAYMENTNO in", values, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotIn(List<String> values) {
            addCriterion("PAYMENTNO not in", values, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoBetween(String value1, String value2) {
            addCriterion("PAYMENTNO between", value1, value2, "paymentno");
            return (Criteria) this;
        }

        public Criteria andPaymentnoNotBetween(String value1, String value2) {
            addCriterion("PAYMENTNO not between", value1, value2, "paymentno");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_applications
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
     * @Table : t_applications
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