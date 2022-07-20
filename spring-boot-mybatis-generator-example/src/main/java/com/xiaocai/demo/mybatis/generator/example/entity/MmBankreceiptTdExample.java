package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBankreceiptTdExample {
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
    public MmBankreceiptTdExample() {
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
     * @Table : mm_bankreceipt_td
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

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andLinecountIsNull() {
            addCriterion("LINECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLinecountIsNotNull() {
            addCriterion("LINECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLinecountEqualTo(BigDecimal value) {
            addCriterion("LINECOUNT =", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotEqualTo(BigDecimal value) {
            addCriterion("LINECOUNT <>", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountGreaterThan(BigDecimal value) {
            addCriterion("LINECOUNT >", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LINECOUNT >=", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountLessThan(BigDecimal value) {
            addCriterion("LINECOUNT <", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LINECOUNT <=", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountIn(List<BigDecimal> values) {
            addCriterion("LINECOUNT in", values, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotIn(List<BigDecimal> values) {
            addCriterion("LINECOUNT not in", values, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LINECOUNT between", value1, value2, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LINECOUNT not between", value1, value2, "linecount");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoIsNull() {
            addCriterion("BANKTRANSACTIONSNO is null");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoIsNotNull() {
            addCriterion("BANKTRANSACTIONSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoEqualTo(String value) {
            addCriterion("BANKTRANSACTIONSNO =", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoNotEqualTo(String value) {
            addCriterion("BANKTRANSACTIONSNO <>", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoGreaterThan(String value) {
            addCriterion("BANKTRANSACTIONSNO >", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTRANSACTIONSNO >=", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoLessThan(String value) {
            addCriterion("BANKTRANSACTIONSNO <", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoLessThanOrEqualTo(String value) {
            addCriterion("BANKTRANSACTIONSNO <=", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoLike(String value) {
            addCriterion("BANKTRANSACTIONSNO like", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoNotLike(String value) {
            addCriterion("BANKTRANSACTIONSNO not like", value, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoIn(List<String> values) {
            addCriterion("BANKTRANSACTIONSNO in", values, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoNotIn(List<String> values) {
            addCriterion("BANKTRANSACTIONSNO not in", values, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoBetween(String value1, String value2) {
            addCriterion("BANKTRANSACTIONSNO between", value1, value2, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanktransactionsnoNotBetween(String value1, String value2) {
            addCriterion("BANKTRANSACTIONSNO not between", value1, value2, "banktransactionsno");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("BANKNO is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BANKNO =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BANKNO <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BANKNO >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNO >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BANKNO <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BANKNO <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BANKNO like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BANKNO not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BANKNO in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BANKNO not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BANKNO between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BANKNO not between", value1, value2, "bankno");
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

        public Criteria andModifydescIsNull() {
            addCriterion("MODIFYDESC is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("MODIFYDESC is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("MODIFYDESC =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("MODIFYDESC <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("MODIFYDESC >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("MODIFYDESC <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("MODIFYDESC like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("MODIFYDESC not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("MODIFYDESC in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("MODIFYDESC not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("MODIFYDESC between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("MODIFYDESC not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andSxflIsNull() {
            addCriterion("SXFL is null");
            return (Criteria) this;
        }

        public Criteria andSxflIsNotNull() {
            addCriterion("SXFL is not null");
            return (Criteria) this;
        }

        public Criteria andSxflEqualTo(String value) {
            addCriterion("SXFL =", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflNotEqualTo(String value) {
            addCriterion("SXFL <>", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflGreaterThan(String value) {
            addCriterion("SXFL >", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflGreaterThanOrEqualTo(String value) {
            addCriterion("SXFL >=", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflLessThan(String value) {
            addCriterion("SXFL <", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflLessThanOrEqualTo(String value) {
            addCriterion("SXFL <=", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflLike(String value) {
            addCriterion("SXFL like", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflNotLike(String value) {
            addCriterion("SXFL not like", value, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflIn(List<String> values) {
            addCriterion("SXFL in", values, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflNotIn(List<String> values) {
            addCriterion("SXFL not in", values, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflBetween(String value1, String value2) {
            addCriterion("SXFL between", value1, value2, "sxfl");
            return (Criteria) this;
        }

        public Criteria andSxflNotBetween(String value1, String value2) {
            addCriterion("SXFL not between", value1, value2, "sxfl");
            return (Criteria) this;
        }

        public Criteria andBanksourceIsNull() {
            addCriterion("BANKSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBanksourceIsNotNull() {
            addCriterion("BANKSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBanksourceEqualTo(String value) {
            addCriterion("BANKSOURCE =", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceNotEqualTo(String value) {
            addCriterion("BANKSOURCE <>", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceGreaterThan(String value) {
            addCriterion("BANKSOURCE >", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKSOURCE >=", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceLessThan(String value) {
            addCriterion("BANKSOURCE <", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceLessThanOrEqualTo(String value) {
            addCriterion("BANKSOURCE <=", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceLike(String value) {
            addCriterion("BANKSOURCE like", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceNotLike(String value) {
            addCriterion("BANKSOURCE not like", value, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceIn(List<String> values) {
            addCriterion("BANKSOURCE in", values, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceNotIn(List<String> values) {
            addCriterion("BANKSOURCE not in", values, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceBetween(String value1, String value2) {
            addCriterion("BANKSOURCE between", value1, value2, "banksource");
            return (Criteria) this;
        }

        public Criteria andBanksourceNotBetween(String value1, String value2) {
            addCriterion("BANKSOURCE not between", value1, value2, "banksource");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeIsNull() {
            addCriterion("INACCOUNTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeIsNotNull() {
            addCriterion("INACCOUNTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeEqualTo(Date value) {
            addCriterion("INACCOUNTTIME =", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeNotEqualTo(Date value) {
            addCriterion("INACCOUNTTIME <>", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeGreaterThan(Date value) {
            addCriterion("INACCOUNTTIME >", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INACCOUNTTIME >=", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeLessThan(Date value) {
            addCriterion("INACCOUNTTIME <", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeLessThanOrEqualTo(Date value) {
            addCriterion("INACCOUNTTIME <=", value, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeIn(List<Date> values) {
            addCriterion("INACCOUNTTIME in", values, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeNotIn(List<Date> values) {
            addCriterion("INACCOUNTTIME not in", values, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeBetween(Date value1, Date value2) {
            addCriterion("INACCOUNTTIME between", value1, value2, "inaccounttime");
            return (Criteria) this;
        }

        public Criteria andInaccounttimeNotBetween(Date value1, Date value2) {
            addCriterion("INACCOUNTTIME not between", value1, value2, "inaccounttime");
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

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBusstypeIsNull() {
            addCriterion("BUSSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusstypeIsNotNull() {
            addCriterion("BUSSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusstypeEqualTo(String value) {
            addCriterion("BUSSTYPE =", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeNotEqualTo(String value) {
            addCriterion("BUSSTYPE <>", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeGreaterThan(String value) {
            addCriterion("BUSSTYPE >", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSSTYPE >=", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeLessThan(String value) {
            addCriterion("BUSSTYPE <", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSSTYPE <=", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeLike(String value) {
            addCriterion("BUSSTYPE like", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeNotLike(String value) {
            addCriterion("BUSSTYPE not like", value, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeIn(List<String> values) {
            addCriterion("BUSSTYPE in", values, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeNotIn(List<String> values) {
            addCriterion("BUSSTYPE not in", values, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeBetween(String value1, String value2) {
            addCriterion("BUSSTYPE between", value1, value2, "busstype");
            return (Criteria) this;
        }

        public Criteria andBusstypeNotBetween(String value1, String value2) {
            addCriterion("BUSSTYPE not between", value1, value2, "busstype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_bankreceipt_td
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
     * @Table : mm_bankreceipt_td
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