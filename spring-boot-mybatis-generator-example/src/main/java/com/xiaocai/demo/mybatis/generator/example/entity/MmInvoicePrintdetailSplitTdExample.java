package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvoicePrintdetailSplitTdExample {
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
    public MmInvoicePrintdetailSplitTdExample() {
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
     * @Table : mm_invoice_printdetail_split_td
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

        public Criteria andSeqinvoiceIsNull() {
            addCriterion("SEQINVOICE is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIsNotNull() {
            addCriterion("SEQINVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceEqualTo(Long value) {
            addCriterion("SEQINVOICE =", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotEqualTo(Long value) {
            addCriterion("SEQINVOICE <>", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThan(Long value) {
            addCriterion("SEQINVOICE >", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE >=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThan(Long value) {
            addCriterion("SEQINVOICE <", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE <=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIn(List<Long> values) {
            addCriterion("SEQINVOICE in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotIn(List<Long> values) {
            addCriterion("SEQINVOICE not in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE not between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIsNull() {
            addCriterion("DETAILCODE is null");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIsNotNull() {
            addCriterion("DETAILCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailcodeEqualTo(String value) {
            addCriterion("DETAILCODE =", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotEqualTo(String value) {
            addCriterion("DETAILCODE <>", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeGreaterThan(String value) {
            addCriterion("DETAILCODE >", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILCODE >=", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLessThan(String value) {
            addCriterion("DETAILCODE <", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLessThanOrEqualTo(String value) {
            addCriterion("DETAILCODE <=", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLike(String value) {
            addCriterion("DETAILCODE like", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotLike(String value) {
            addCriterion("DETAILCODE not like", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIn(List<String> values) {
            addCriterion("DETAILCODE in", values, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotIn(List<String> values) {
            addCriterion("DETAILCODE not in", values, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeBetween(String value1, String value2) {
            addCriterion("DETAILCODE between", value1, value2, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotBetween(String value1, String value2) {
            addCriterion("DETAILCODE not between", value1, value2, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailnameIsNull() {
            addCriterion("DETAILNAME is null");
            return (Criteria) this;
        }

        public Criteria andDetailnameIsNotNull() {
            addCriterion("DETAILNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDetailnameEqualTo(String value) {
            addCriterion("DETAILNAME =", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameNotEqualTo(String value) {
            addCriterion("DETAILNAME <>", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameGreaterThan(String value) {
            addCriterion("DETAILNAME >", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILNAME >=", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameLessThan(String value) {
            addCriterion("DETAILNAME <", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameLessThanOrEqualTo(String value) {
            addCriterion("DETAILNAME <=", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameLike(String value) {
            addCriterion("DETAILNAME like", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameNotLike(String value) {
            addCriterion("DETAILNAME not like", value, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameIn(List<String> values) {
            addCriterion("DETAILNAME in", values, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameNotIn(List<String> values) {
            addCriterion("DETAILNAME not in", values, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameBetween(String value1, String value2) {
            addCriterion("DETAILNAME between", value1, value2, "detailname");
            return (Criteria) this;
        }

        public Criteria andDetailnameNotBetween(String value1, String value2) {
            addCriterion("DETAILNAME not between", value1, value2, "detailname");
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

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
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

        public Criteria andExclusivetaxamountIsNull() {
            addCriterion("EXCLUSIVETAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountIsNotNull() {
            addCriterion("EXCLUSIVETAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT =", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <>", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountGreaterThan(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT >", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT >=", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountLessThan(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCLUSIVETAXAMOUNT <=", value, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountIn(List<BigDecimal> values) {
            addCriterion("EXCLUSIVETAXAMOUNT in", values, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotIn(List<BigDecimal> values) {
            addCriterion("EXCLUSIVETAXAMOUNT not in", values, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCLUSIVETAXAMOUNT between", value1, value2, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andExclusivetaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCLUSIVETAXAMOUNT not between", value1, value2, "exclusivetaxamount");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsIsNull() {
            addCriterion("ISDETAILORPREMIUMS is null");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsIsNotNull() {
            addCriterion("ISDETAILORPREMIUMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsEqualTo(String value) {
            addCriterion("ISDETAILORPREMIUMS =", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsNotEqualTo(String value) {
            addCriterion("ISDETAILORPREMIUMS <>", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsGreaterThan(String value) {
            addCriterion("ISDETAILORPREMIUMS >", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsGreaterThanOrEqualTo(String value) {
            addCriterion("ISDETAILORPREMIUMS >=", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsLessThan(String value) {
            addCriterion("ISDETAILORPREMIUMS <", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsLessThanOrEqualTo(String value) {
            addCriterion("ISDETAILORPREMIUMS <=", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsLike(String value) {
            addCriterion("ISDETAILORPREMIUMS like", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsNotLike(String value) {
            addCriterion("ISDETAILORPREMIUMS not like", value, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsIn(List<String> values) {
            addCriterion("ISDETAILORPREMIUMS in", values, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsNotIn(List<String> values) {
            addCriterion("ISDETAILORPREMIUMS not in", values, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsBetween(String value1, String value2) {
            addCriterion("ISDETAILORPREMIUMS between", value1, value2, "isdetailorpremiums");
            return (Criteria) this;
        }

        public Criteria andIsdetailorpremiumsNotBetween(String value1, String value2) {
            addCriterion("ISDETAILORPREMIUMS not between", value1, value2, "isdetailorpremiums");
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

        public Criteria andTaxamount1IsNull() {
            addCriterion("TAXAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxamount1IsNotNull() {
            addCriterion("TAXAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamount1EqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 =", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <>", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT1 >", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 >=", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1LessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT1 <=", value, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1In(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT1 in", values, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT1 not in", values, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT1 between", value1, value2, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT1 not between", value1, value2, "taxamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1IsNull() {
            addCriterion("TAXBASEAMOUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1IsNotNull() {
            addCriterion("TAXBASEAMOUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1EqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 =", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1NotEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 <>", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1GreaterThan(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 >", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 >=", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1LessThan(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 <", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT1 <=", value, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1In(List<BigDecimal> values) {
            addCriterion("TAXBASEAMOUNT1 in", values, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1NotIn(List<BigDecimal> values) {
            addCriterion("TAXBASEAMOUNT1 not in", values, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXBASEAMOUNT1 between", value1, value2, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXBASEAMOUNT1 not between", value1, value2, "taxbaseamount1");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountIsNull() {
            addCriterion("TAXBASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountIsNotNull() {
            addCriterion("TAXBASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT =", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT <>", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountGreaterThan(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT >", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT >=", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountLessThan(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT <", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXBASEAMOUNT <=", value, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountIn(List<BigDecimal> values) {
            addCriterion("TAXBASEAMOUNT in", values, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXBASEAMOUNT not in", values, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXBASEAMOUNT between", value1, value2, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andTaxbaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXBASEAMOUNT not between", value1, value2, "taxbaseamount");
            return (Criteria) this;
        }

        public Criteria andGgxhIsNull() {
            addCriterion("ggxh is null");
            return (Criteria) this;
        }

        public Criteria andGgxhIsNotNull() {
            addCriterion("ggxh is not null");
            return (Criteria) this;
        }

        public Criteria andGgxhEqualTo(String value) {
            addCriterion("ggxh =", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotEqualTo(String value) {
            addCriterion("ggxh <>", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhGreaterThan(String value) {
            addCriterion("ggxh >", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhGreaterThanOrEqualTo(String value) {
            addCriterion("ggxh >=", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLessThan(String value) {
            addCriterion("ggxh <", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLessThanOrEqualTo(String value) {
            addCriterion("ggxh <=", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLike(String value) {
            addCriterion("ggxh like", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotLike(String value) {
            addCriterion("ggxh not like", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhIn(List<String> values) {
            addCriterion("ggxh in", values, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotIn(List<String> values) {
            addCriterion("ggxh not in", values, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhBetween(String value1, String value2) {
            addCriterion("ggxh between", value1, value2, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotBetween(String value1, String value2) {
            addCriterion("ggxh not between", value1, value2, "ggxh");
            return (Criteria) this;
        }

        public Criteria andJldwIsNull() {
            addCriterion("jldw is null");
            return (Criteria) this;
        }

        public Criteria andJldwIsNotNull() {
            addCriterion("jldw is not null");
            return (Criteria) this;
        }

        public Criteria andJldwEqualTo(String value) {
            addCriterion("jldw =", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotEqualTo(String value) {
            addCriterion("jldw <>", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwGreaterThan(String value) {
            addCriterion("jldw >", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwGreaterThanOrEqualTo(String value) {
            addCriterion("jldw >=", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLessThan(String value) {
            addCriterion("jldw <", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLessThanOrEqualTo(String value) {
            addCriterion("jldw <=", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLike(String value) {
            addCriterion("jldw like", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotLike(String value) {
            addCriterion("jldw not like", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwIn(List<String> values) {
            addCriterion("jldw in", values, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotIn(List<String> values) {
            addCriterion("jldw not in", values, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwBetween(String value1, String value2) {
            addCriterion("jldw between", value1, value2, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotBetween(String value1, String value2) {
            addCriterion("jldw not between", value1, value2, "jldw");
            return (Criteria) this;
        }

        public Criteria andSpslIsNull() {
            addCriterion("spsl is null");
            return (Criteria) this;
        }

        public Criteria andSpslIsNotNull() {
            addCriterion("spsl is not null");
            return (Criteria) this;
        }

        public Criteria andSpslEqualTo(String value) {
            addCriterion("spsl =", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslNotEqualTo(String value) {
            addCriterion("spsl <>", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslGreaterThan(String value) {
            addCriterion("spsl >", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslGreaterThanOrEqualTo(String value) {
            addCriterion("spsl >=", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslLessThan(String value) {
            addCriterion("spsl <", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslLessThanOrEqualTo(String value) {
            addCriterion("spsl <=", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslLike(String value) {
            addCriterion("spsl like", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslNotLike(String value) {
            addCriterion("spsl not like", value, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslIn(List<String> values) {
            addCriterion("spsl in", values, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslNotIn(List<String> values) {
            addCriterion("spsl not in", values, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslBetween(String value1, String value2) {
            addCriterion("spsl between", value1, value2, "spsl");
            return (Criteria) this;
        }

        public Criteria andSpslNotBetween(String value1, String value2) {
            addCriterion("spsl not between", value1, value2, "spsl");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invoice_printdetail_split_td
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
     * @Table : mm_invoice_printdetail_split_td
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