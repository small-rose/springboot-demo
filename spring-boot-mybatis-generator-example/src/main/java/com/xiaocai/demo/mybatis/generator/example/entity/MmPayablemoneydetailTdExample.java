package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPayablemoneydetailTdExample {
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
    public MmPayablemoneydetailTdExample() {
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
     * @Table : mm_payablemoneydetail_td
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

        public Criteria andSeqpayabledetailIsNull() {
            addCriterion("SEQPAYABLEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailIsNotNull() {
            addCriterion("SEQPAYABLEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailEqualTo(Long value) {
            addCriterion("SEQPAYABLEDETAIL =", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailNotEqualTo(Long value) {
            addCriterion("SEQPAYABLEDETAIL <>", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailGreaterThan(Long value) {
            addCriterion("SEQPAYABLEDETAIL >", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQPAYABLEDETAIL >=", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailLessThan(Long value) {
            addCriterion("SEQPAYABLEDETAIL <", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailLessThanOrEqualTo(Long value) {
            addCriterion("SEQPAYABLEDETAIL <=", value, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailIn(List<Long> values) {
            addCriterion("SEQPAYABLEDETAIL in", values, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailNotIn(List<Long> values) {
            addCriterion("SEQPAYABLEDETAIL not in", values, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailBetween(Long value1, Long value2) {
            addCriterion("SEQPAYABLEDETAIL between", value1, value2, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andSeqpayabledetailNotBetween(Long value1, Long value2) {
            addCriterion("SEQPAYABLEDETAIL not between", value1, value2, "seqpayabledetail");
            return (Criteria) this;
        }

        public Criteria andPayablenoIsNull() {
            addCriterion("PAYABLENO is null");
            return (Criteria) this;
        }

        public Criteria andPayablenoIsNotNull() {
            addCriterion("PAYABLENO is not null");
            return (Criteria) this;
        }

        public Criteria andPayablenoEqualTo(Long value) {
            addCriterion("PAYABLENO =", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotEqualTo(Long value) {
            addCriterion("PAYABLENO <>", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThan(Long value) {
            addCriterion("PAYABLENO >", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYABLENO >=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThan(Long value) {
            addCriterion("PAYABLENO <", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoLessThanOrEqualTo(Long value) {
            addCriterion("PAYABLENO <=", value, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoIn(List<Long> values) {
            addCriterion("PAYABLENO in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotIn(List<Long> values) {
            addCriterion("PAYABLENO not in", values, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoBetween(Long value1, Long value2) {
            addCriterion("PAYABLENO between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andPayablenoNotBetween(Long value1, Long value2) {
            addCriterion("PAYABLENO not between", value1, value2, "payableno");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailIsNull() {
            addCriterion("SEQCLAIMDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailIsNotNull() {
            addCriterion("SEQCLAIMDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailEqualTo(Long value) {
            addCriterion("SEQCLAIMDETAIL =", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailNotEqualTo(Long value) {
            addCriterion("SEQCLAIMDETAIL <>", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailGreaterThan(Long value) {
            addCriterion("SEQCLAIMDETAIL >", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQCLAIMDETAIL >=", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailLessThan(Long value) {
            addCriterion("SEQCLAIMDETAIL <", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailLessThanOrEqualTo(Long value) {
            addCriterion("SEQCLAIMDETAIL <=", value, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailIn(List<Long> values) {
            addCriterion("SEQCLAIMDETAIL in", values, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailNotIn(List<Long> values) {
            addCriterion("SEQCLAIMDETAIL not in", values, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailBetween(Long value1, Long value2) {
            addCriterion("SEQCLAIMDETAIL between", value1, value2, "seqclaimdetail");
            return (Criteria) this;
        }

        public Criteria andSeqclaimdetailNotBetween(Long value1, Long value2) {
            addCriterion("SEQCLAIMDETAIL not between", value1, value2, "seqclaimdetail");
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

        public Criteria andUsedamountIsNull() {
            addCriterion("USEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("USEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("USEDAMOUNT >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("USEDAMOUNT <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT not between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("BASECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("BASECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("BASECURRENCYCODE =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("BASECURRENCYCODE >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("BASECURRENCYCODE <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("BASECURRENCYCODE <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("BASECURRENCYCODE like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("BASECURRENCYCODE not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("BASECURRENCYCODE in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("BASECURRENCYCODE not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("BASECURRENCYCODE not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("BASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("BASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("BASEAMOUNT >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("BASEAMOUNT <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEAMOUNT <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEAMOUNT not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEAMOUNT not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNull() {
            addCriterion("BASEUSEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIsNotNull() {
            addCriterion("BASEUSEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT =", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <>", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThan(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT >", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT >=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThan(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEUSEDAMOUNT <=", value, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountIn(List<BigDecimal> values) {
            addCriterion("BASEUSEDAMOUNT in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotIn(List<BigDecimal> values) {
            addCriterion("BASEUSEDAMOUNT not in", values, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEUSEDAMOUNT between", value1, value2, "baseusedamount");
            return (Criteria) this;
        }

        public Criteria andBaseusedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEUSEDAMOUNT not between", value1, value2, "baseusedamount");
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

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DATASOURCE like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DATASOURCE not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
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

        public Criteria andCustseqIsNull() {
            addCriterion("CUSTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andCustseqIsNotNull() {
            addCriterion("CUSTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustseqEqualTo(String value) {
            addCriterion("CUSTSEQ =", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotEqualTo(String value) {
            addCriterion("CUSTSEQ <>", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThan(String value) {
            addCriterion("CUSTSEQ >", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ >=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThan(String value) {
            addCriterion("CUSTSEQ <", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLessThanOrEqualTo(String value) {
            addCriterion("CUSTSEQ <=", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqLike(String value) {
            addCriterion("CUSTSEQ like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotLike(String value) {
            addCriterion("CUSTSEQ not like", value, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqIn(List<String> values) {
            addCriterion("CUSTSEQ in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotIn(List<String> values) {
            addCriterion("CUSTSEQ not in", values, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqBetween(String value1, String value2) {
            addCriterion("CUSTSEQ between", value1, value2, "custseq");
            return (Criteria) this;
        }

        public Criteria andCustseqNotBetween(String value1, String value2) {
            addCriterion("CUSTSEQ not between", value1, value2, "custseq");
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

        public Criteria andTablenameIsNull() {
            addCriterion("TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("TABLENAME =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("TABLENAME <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("TABLENAME >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLENAME >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("TABLENAME <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("TABLENAME <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("TABLENAME like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("TABLENAME not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("TABLENAME in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("TABLENAME not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("TABLENAME between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("TABLENAME not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNull() {
            addCriterion("TAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIsNotNull() {
            addCriterion("TAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT =", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <>", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT >", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT >=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT <", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT <=", value, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT not in", values, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT not between", value1, value2, "taxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIsNull() {
            addCriterion("TAXESRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIsNotNull() {
            addCriterion("TAXESRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesrateEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE =", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <>", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThan(BigDecimal value) {
            addCriterion("TAXESRATE >", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE >=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThan(BigDecimal value) {
            addCriterion("TAXESRATE <", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESRATE <=", value, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotIn(List<BigDecimal> values) {
            addCriterion("TAXESRATE not in", values, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andTaxesrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESRATE not between", value1, value2, "taxesrate");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIsNull() {
            addCriterion("CLASSESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIsNotNull() {
            addCriterion("CLASSESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassesstypeEqualTo(String value) {
            addCriterion("CLASSESSTYPE =", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotEqualTo(String value) {
            addCriterion("CLASSESSTYPE <>", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThan(String value) {
            addCriterion("CLASSESSTYPE >", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE >=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThan(String value) {
            addCriterion("CLASSESSTYPE <", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESSTYPE <=", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeLike(String value) {
            addCriterion("CLASSESSTYPE like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotLike(String value) {
            addCriterion("CLASSESSTYPE not like", value, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeIn(List<String> values) {
            addCriterion("CLASSESSTYPE in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotIn(List<String> values) {
            addCriterion("CLASSESSTYPE not in", values, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE between", value1, value2, "classesstype");
            return (Criteria) this;
        }

        public Criteria andClassesstypeNotBetween(String value1, String value2) {
            addCriterion("CLASSESSTYPE not between", value1, value2, "classesstype");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNull() {
            addCriterion("TAXESAMOUNTOUT is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIsNotNull() {
            addCriterion("TAXESAMOUNTOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT =", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <>", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT >=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNTOUT <=", value, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNTOUT not in", values, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxesamountoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNTOUT not between", value1, value2, "taxesamountout");
            return (Criteria) this;
        }

        public Criteria andTaxstrIsNull() {
            addCriterion("TAXSTR is null");
            return (Criteria) this;
        }

        public Criteria andTaxstrIsNotNull() {
            addCriterion("TAXSTR is not null");
            return (Criteria) this;
        }

        public Criteria andTaxstrEqualTo(String value) {
            addCriterion("TAXSTR =", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrNotEqualTo(String value) {
            addCriterion("TAXSTR <>", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrGreaterThan(String value) {
            addCriterion("TAXSTR >", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrGreaterThanOrEqualTo(String value) {
            addCriterion("TAXSTR >=", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrLessThan(String value) {
            addCriterion("TAXSTR <", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrLessThanOrEqualTo(String value) {
            addCriterion("TAXSTR <=", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrLike(String value) {
            addCriterion("TAXSTR like", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrNotLike(String value) {
            addCriterion("TAXSTR not like", value, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrIn(List<String> values) {
            addCriterion("TAXSTR in", values, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrNotIn(List<String> values) {
            addCriterion("TAXSTR not in", values, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrBetween(String value1, String value2) {
            addCriterion("TAXSTR between", value1, value2, "taxstr");
            return (Criteria) this;
        }

        public Criteria andTaxstrNotBetween(String value1, String value2) {
            addCriterion("TAXSTR not between", value1, value2, "taxstr");
            return (Criteria) this;
        }

        public Criteria andReturnitemIsNull() {
            addCriterion("RETURNITEM is null");
            return (Criteria) this;
        }

        public Criteria andReturnitemIsNotNull() {
            addCriterion("RETURNITEM is not null");
            return (Criteria) this;
        }

        public Criteria andReturnitemEqualTo(String value) {
            addCriterion("RETURNITEM =", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemNotEqualTo(String value) {
            addCriterion("RETURNITEM <>", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemGreaterThan(String value) {
            addCriterion("RETURNITEM >", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNITEM >=", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemLessThan(String value) {
            addCriterion("RETURNITEM <", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemLessThanOrEqualTo(String value) {
            addCriterion("RETURNITEM <=", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemLike(String value) {
            addCriterion("RETURNITEM like", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemNotLike(String value) {
            addCriterion("RETURNITEM not like", value, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemIn(List<String> values) {
            addCriterion("RETURNITEM in", values, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemNotIn(List<String> values) {
            addCriterion("RETURNITEM not in", values, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemBetween(String value1, String value2) {
            addCriterion("RETURNITEM between", value1, value2, "returnitem");
            return (Criteria) this;
        }

        public Criteria andReturnitemNotBetween(String value1, String value2) {
            addCriterion("RETURNITEM not between", value1, value2, "returnitem");
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

        public Criteria andInvoicedateIsNull() {
            addCriterion("INVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNotNull() {
            addCriterion("INVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateEqualTo(Date value) {
            addCriterion("INVOICEDATE =", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotEqualTo(Date value) {
            addCriterion("INVOICEDATE <>", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThan(Date value) {
            addCriterion("INVOICEDATE >", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE >=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThan(Date value) {
            addCriterion("INVOICEDATE <", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICEDATE <=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIn(List<Date> values) {
            addCriterion("INVOICEDATE in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotIn(List<Date> values) {
            addCriterion("INVOICEDATE not in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICEDATE not between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountIsNull() {
            addCriterion("INVOICEBASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountIsNotNull() {
            addCriterion("INVOICEBASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT =", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT <>", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT >", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT >=", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountLessThan(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT <", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASEAMOUNT <=", value, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEBASEAMOUNT in", values, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEBASEAMOUNT not in", values, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASEAMOUNT between", value1, value2, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASEAMOUNT not between", value1, value2, "invoicebaseamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountIsNull() {
            addCriterion("UNBILLEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountIsNotNull() {
            addCriterion("UNBILLEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountEqualTo(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT =", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountNotEqualTo(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT <>", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountGreaterThan(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT >", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT >=", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountLessThan(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT <", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNBILLEDAMOUNT <=", value, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountIn(List<BigDecimal> values) {
            addCriterion("UNBILLEDAMOUNT in", values, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountNotIn(List<BigDecimal> values) {
            addCriterion("UNBILLEDAMOUNT not in", values, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNBILLEDAMOUNT between", value1, value2, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andUnbilledamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNBILLEDAMOUNT not between", value1, value2, "unbilledamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountIsNull() {
            addCriterion("INVOICEBASETAXESAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountIsNotNull() {
            addCriterion("INVOICEBASETAXESAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT =", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT <>", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT >", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT >=", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountLessThan(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT <", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT <=", value, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEBASETAXESAMOUNT in", values, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEBASETAXESAMOUNT not in", values, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASETAXESAMOUNT between", value1, value2, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASETAXESAMOUNT not between", value1, value2, "invoicebasetaxesamount");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNull() {
            addCriterion("TAXESAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1IsNotNull() {
            addCriterion("TAXESAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1EqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 =", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <>", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 >=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThan(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXESAMOUNT1 <=", value, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1In(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXESAMOUNT1 not in", values, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andTaxesamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXESAMOUNT1 not between", value1, value2, "taxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1IsNull() {
            addCriterion("INVOICEBASETAXESAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1IsNotNull() {
            addCriterion("INVOICEBASETAXESAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1EqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 =", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1NotEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 <>", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1GreaterThan(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 >", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 >=", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1LessThan(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 <", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEBASETAXESAMOUNT1 <=", value, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1In(List<BigDecimal> values) {
            addCriterion("INVOICEBASETAXESAMOUNT1 in", values, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1NotIn(List<BigDecimal> values) {
            addCriterion("INVOICEBASETAXESAMOUNT1 not in", values, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASETAXESAMOUNT1 between", value1, value2, "invoicebasetaxesamount1");
            return (Criteria) this;
        }

        public Criteria andInvoicebasetaxesamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEBASETAXESAMOUNT1 not between", value1, value2, "invoicebasetaxesamount1");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_payablemoneydetail_td
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
     * @Table : mm_payablemoneydetail_td
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