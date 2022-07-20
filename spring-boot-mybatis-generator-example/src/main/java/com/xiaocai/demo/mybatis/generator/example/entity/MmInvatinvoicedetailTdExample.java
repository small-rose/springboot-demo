package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvatinvoicedetailTdExample {
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
    public MmInvatinvoicedetailTdExample() {
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
     * @Table : mm_invatinvoicedetail_td
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

        public Criteria andSeqinvoicedetailIsNull() {
            addCriterion("SEQINVOICEDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailIsNotNull() {
            addCriterion("SEQINVOICEDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailEqualTo(Long value) {
            addCriterion("SEQINVOICEDETAIL =", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailNotEqualTo(Long value) {
            addCriterion("SEQINVOICEDETAIL <>", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailGreaterThan(Long value) {
            addCriterion("SEQINVOICEDETAIL >", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICEDETAIL >=", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailLessThan(Long value) {
            addCriterion("SEQINVOICEDETAIL <", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICEDETAIL <=", value, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailIn(List<Long> values) {
            addCriterion("SEQINVOICEDETAIL in", values, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailNotIn(List<Long> values) {
            addCriterion("SEQINVOICEDETAIL not in", values, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICEDETAIL between", value1, value2, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andSeqinvoicedetailNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICEDETAIL not between", value1, value2, "seqinvoicedetail");
            return (Criteria) this;
        }

        public Criteria andTaxitemIsNull() {
            addCriterion("TAXITEM is null");
            return (Criteria) this;
        }

        public Criteria andTaxitemIsNotNull() {
            addCriterion("TAXITEM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxitemEqualTo(String value) {
            addCriterion("TAXITEM =", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemNotEqualTo(String value) {
            addCriterion("TAXITEM <>", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemGreaterThan(String value) {
            addCriterion("TAXITEM >", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemGreaterThanOrEqualTo(String value) {
            addCriterion("TAXITEM >=", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemLessThan(String value) {
            addCriterion("TAXITEM <", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemLessThanOrEqualTo(String value) {
            addCriterion("TAXITEM <=", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemLike(String value) {
            addCriterion("TAXITEM like", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemNotLike(String value) {
            addCriterion("TAXITEM not like", value, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemIn(List<String> values) {
            addCriterion("TAXITEM in", values, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemNotIn(List<String> values) {
            addCriterion("TAXITEM not in", values, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemBetween(String value1, String value2) {
            addCriterion("TAXITEM between", value1, value2, "taxitem");
            return (Criteria) this;
        }

        public Criteria andTaxitemNotBetween(String value1, String value2) {
            addCriterion("TAXITEM not between", value1, value2, "taxitem");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVnumIsNull() {
            addCriterion("VNUM is null");
            return (Criteria) this;
        }

        public Criteria andVnumIsNotNull() {
            addCriterion("VNUM is not null");
            return (Criteria) this;
        }

        public Criteria andVnumEqualTo(Long value) {
            addCriterion("VNUM =", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumNotEqualTo(Long value) {
            addCriterion("VNUM <>", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumGreaterThan(Long value) {
            addCriterion("VNUM >", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumGreaterThanOrEqualTo(Long value) {
            addCriterion("VNUM >=", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumLessThan(Long value) {
            addCriterion("VNUM <", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumLessThanOrEqualTo(Long value) {
            addCriterion("VNUM <=", value, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumIn(List<Long> values) {
            addCriterion("VNUM in", values, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumNotIn(List<Long> values) {
            addCriterion("VNUM not in", values, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumBetween(Long value1, Long value2) {
            addCriterion("VNUM between", value1, value2, "vnum");
            return (Criteria) this;
        }

        public Criteria andVnumNotBetween(Long value1, Long value2) {
            addCriterion("VNUM not between", value1, value2, "vnum");
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

        public Criteria andIndetailIsNull() {
            addCriterion("INDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andIndetailIsNotNull() {
            addCriterion("INDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andIndetailEqualTo(String value) {
            addCriterion("INDETAIL =", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailNotEqualTo(String value) {
            addCriterion("INDETAIL <>", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailGreaterThan(String value) {
            addCriterion("INDETAIL >", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailGreaterThanOrEqualTo(String value) {
            addCriterion("INDETAIL >=", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailLessThan(String value) {
            addCriterion("INDETAIL <", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailLessThanOrEqualTo(String value) {
            addCriterion("INDETAIL <=", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailLike(String value) {
            addCriterion("INDETAIL like", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailNotLike(String value) {
            addCriterion("INDETAIL not like", value, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailIn(List<String> values) {
            addCriterion("INDETAIL in", values, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailNotIn(List<String> values) {
            addCriterion("INDETAIL not in", values, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailBetween(String value1, String value2) {
            addCriterion("INDETAIL between", value1, value2, "indetail");
            return (Criteria) this;
        }

        public Criteria andIndetailNotBetween(String value1, String value2) {
            addCriterion("INDETAIL not between", value1, value2, "indetail");
            return (Criteria) this;
        }

        public Criteria andDectypeIsNull() {
            addCriterion("DECTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDectypeIsNotNull() {
            addCriterion("DECTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDectypeEqualTo(String value) {
            addCriterion("DECTYPE =", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotEqualTo(String value) {
            addCriterion("DECTYPE <>", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeGreaterThan(String value) {
            addCriterion("DECTYPE >", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeGreaterThanOrEqualTo(String value) {
            addCriterion("DECTYPE >=", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLessThan(String value) {
            addCriterion("DECTYPE <", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLessThanOrEqualTo(String value) {
            addCriterion("DECTYPE <=", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeLike(String value) {
            addCriterion("DECTYPE like", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotLike(String value) {
            addCriterion("DECTYPE not like", value, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeIn(List<String> values) {
            addCriterion("DECTYPE in", values, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotIn(List<String> values) {
            addCriterion("DECTYPE not in", values, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeBetween(String value1, String value2) {
            addCriterion("DECTYPE between", value1, value2, "dectype");
            return (Criteria) this;
        }

        public Criteria andDectypeNotBetween(String value1, String value2) {
            addCriterion("DECTYPE not between", value1, value2, "dectype");
            return (Criteria) this;
        }

        public Criteria andDkstatusIsNull() {
            addCriterion("DKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDkstatusIsNotNull() {
            addCriterion("DKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDkstatusEqualTo(String value) {
            addCriterion("DKSTATUS =", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotEqualTo(String value) {
            addCriterion("DKSTATUS <>", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusGreaterThan(String value) {
            addCriterion("DKSTATUS >", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("DKSTATUS >=", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLessThan(String value) {
            addCriterion("DKSTATUS <", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLessThanOrEqualTo(String value) {
            addCriterion("DKSTATUS <=", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusLike(String value) {
            addCriterion("DKSTATUS like", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotLike(String value) {
            addCriterion("DKSTATUS not like", value, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusIn(List<String> values) {
            addCriterion("DKSTATUS in", values, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotIn(List<String> values) {
            addCriterion("DKSTATUS not in", values, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusBetween(String value1, String value2) {
            addCriterion("DKSTATUS between", value1, value2, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andDkstatusNotBetween(String value1, String value2) {
            addCriterion("DKSTATUS not between", value1, value2, "dkstatus");
            return (Criteria) this;
        }

        public Criteria andSrcflagIsNull() {
            addCriterion("SRCFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSrcflagIsNotNull() {
            addCriterion("SRCFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSrcflagEqualTo(String value) {
            addCriterion("SRCFLAG =", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagNotEqualTo(String value) {
            addCriterion("SRCFLAG <>", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagGreaterThan(String value) {
            addCriterion("SRCFLAG >", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagGreaterThanOrEqualTo(String value) {
            addCriterion("SRCFLAG >=", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagLessThan(String value) {
            addCriterion("SRCFLAG <", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagLessThanOrEqualTo(String value) {
            addCriterion("SRCFLAG <=", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagLike(String value) {
            addCriterion("SRCFLAG like", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagNotLike(String value) {
            addCriterion("SRCFLAG not like", value, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagIn(List<String> values) {
            addCriterion("SRCFLAG in", values, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagNotIn(List<String> values) {
            addCriterion("SRCFLAG not in", values, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagBetween(String value1, String value2) {
            addCriterion("SRCFLAG between", value1, value2, "srcflag");
            return (Criteria) this;
        }

        public Criteria andSrcflagNotBetween(String value1, String value2) {
            addCriterion("SRCFLAG not between", value1, value2, "srcflag");
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

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("RESERVE2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("RESERVE2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("RESERVE2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("RESERVE2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("RESERVE2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("RESERVE2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("RESERVE2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("RESERVE2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("RESERVE2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("RESERVE2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("RESERVE2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("RESERVE3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("RESERVE3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("RESERVE3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("RESERVE3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("RESERVE3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("RESERVE3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("RESERVE3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("RESERVE3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("RESERVE3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("RESERVE3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("RESERVE3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("RESERVE3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("RESERVE3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("RESERVE4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("RESERVE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(Date value) {
            addCriterion("RESERVE4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(Date value) {
            addCriterion("RESERVE4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(Date value) {
            addCriterion("RESERVE4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(Date value) {
            addCriterion("RESERVE4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(Date value) {
            addCriterion("RESERVE4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(Date value) {
            addCriterion("RESERVE4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<Date> values) {
            addCriterion("RESERVE4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<Date> values) {
            addCriterion("RESERVE4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(Date value1, Date value2) {
            addCriterion("RESERVE4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(Date value1, Date value2) {
            addCriterion("RESERVE4 not between", value1, value2, "reserve4");
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

        public Criteria andHibernateversionEqualTo(String value) {
            addCriterion("HIBERNATEVERSION =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(String value) {
            addCriterion("HIBERNATEVERSION <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(String value) {
            addCriterion("HIBERNATEVERSION >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(String value) {
            addCriterion("HIBERNATEVERSION >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(String value) {
            addCriterion("HIBERNATEVERSION <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(String value) {
            addCriterion("HIBERNATEVERSION <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLike(String value) {
            addCriterion("HIBERNATEVERSION like", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotLike(String value) {
            addCriterion("HIBERNATEVERSION not like", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<String> values) {
            addCriterion("HIBERNATEVERSION in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<String> values) {
            addCriterion("HIBERNATEVERSION not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(String value1, String value2) {
            addCriterion("HIBERNATEVERSION between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(String value1, String value2) {
            addCriterion("HIBERNATEVERSION not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andReference4IsNull() {
            addCriterion("REFERENCE4 is null");
            return (Criteria) this;
        }

        public Criteria andReference4IsNotNull() {
            addCriterion("REFERENCE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReference4EqualTo(String value) {
            addCriterion("REFERENCE4 =", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotEqualTo(String value) {
            addCriterion("REFERENCE4 <>", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThan(String value) {
            addCriterion("REFERENCE4 >", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4GreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 >=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThan(String value) {
            addCriterion("REFERENCE4 <", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4LessThanOrEqualTo(String value) {
            addCriterion("REFERENCE4 <=", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Like(String value) {
            addCriterion("REFERENCE4 like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotLike(String value) {
            addCriterion("REFERENCE4 not like", value, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4In(List<String> values) {
            addCriterion("REFERENCE4 in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotIn(List<String> values) {
            addCriterion("REFERENCE4 not in", values, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4Between(String value1, String value2) {
            addCriterion("REFERENCE4 between", value1, value2, "reference4");
            return (Criteria) this;
        }

        public Criteria andReference4NotBetween(String value1, String value2) {
            addCriterion("REFERENCE4 not between", value1, value2, "reference4");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_invatinvoicedetail_td
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
     * @Table : mm_invatinvoicedetail_td
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