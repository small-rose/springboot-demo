package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBankmappingExample {
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
    public DBankmappingExample() {
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
     * @Table : d_bankmapping
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

        public Criteria andOrderBankcodeIsNull() {
            addCriterion("ORDER_BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeIsNotNull() {
            addCriterion("ORDER_BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeEqualTo(String value) {
            addCriterion("ORDER_BANKCODE =", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotEqualTo(String value) {
            addCriterion("ORDER_BANKCODE <>", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeGreaterThan(String value) {
            addCriterion("ORDER_BANKCODE >", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKCODE >=", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLessThan(String value) {
            addCriterion("ORDER_BANKCODE <", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_BANKCODE <=", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeLike(String value) {
            addCriterion("ORDER_BANKCODE like", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotLike(String value) {
            addCriterion("ORDER_BANKCODE not like", value, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeIn(List<String> values) {
            addCriterion("ORDER_BANKCODE in", values, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotIn(List<String> values) {
            addCriterion("ORDER_BANKCODE not in", values, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeBetween(String value1, String value2) {
            addCriterion("ORDER_BANKCODE between", value1, value2, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andOrderBankcodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_BANKCODE not between", value1, value2, "orderBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeIsNull() {
            addCriterion("SRC_BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeIsNotNull() {
            addCriterion("SRC_BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeEqualTo(String value) {
            addCriterion("SRC_BANKCODE =", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeNotEqualTo(String value) {
            addCriterion("SRC_BANKCODE <>", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeGreaterThan(String value) {
            addCriterion("SRC_BANKCODE >", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_BANKCODE >=", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeLessThan(String value) {
            addCriterion("SRC_BANKCODE <", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeLessThanOrEqualTo(String value) {
            addCriterion("SRC_BANKCODE <=", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeLike(String value) {
            addCriterion("SRC_BANKCODE like", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeNotLike(String value) {
            addCriterion("SRC_BANKCODE not like", value, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeIn(List<String> values) {
            addCriterion("SRC_BANKCODE in", values, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeNotIn(List<String> values) {
            addCriterion("SRC_BANKCODE not in", values, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeBetween(String value1, String value2) {
            addCriterion("SRC_BANKCODE between", value1, value2, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andSrcBankcodeNotBetween(String value1, String value2) {
            addCriterion("SRC_BANKCODE not between", value1, value2, "srcBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeIsNull() {
            addCriterion("DESC_BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeIsNotNull() {
            addCriterion("DESC_BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeEqualTo(String value) {
            addCriterion("DESC_BANKCODE =", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeNotEqualTo(String value) {
            addCriterion("DESC_BANKCODE <>", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeGreaterThan(String value) {
            addCriterion("DESC_BANKCODE >", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DESC_BANKCODE >=", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeLessThan(String value) {
            addCriterion("DESC_BANKCODE <", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeLessThanOrEqualTo(String value) {
            addCriterion("DESC_BANKCODE <=", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeLike(String value) {
            addCriterion("DESC_BANKCODE like", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeNotLike(String value) {
            addCriterion("DESC_BANKCODE not like", value, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeIn(List<String> values) {
            addCriterion("DESC_BANKCODE in", values, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeNotIn(List<String> values) {
            addCriterion("DESC_BANKCODE not in", values, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeBetween(String value1, String value2) {
            addCriterion("DESC_BANKCODE between", value1, value2, "descBankcode");
            return (Criteria) this;
        }

        public Criteria andDescBankcodeNotBetween(String value1, String value2) {
            addCriterion("DESC_BANKCODE not between", value1, value2, "descBankcode");
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

        public Criteria andIfvalidIsNull() {
            addCriterion("IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("IFVALID =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("IFVALID <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("IFVALID >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IFVALID >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("IFVALID <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("IFVALID <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("IFVALID like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("IFVALID not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("IFVALID in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("IFVALID not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("IFVALID between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("IFVALID not between", value1, value2, "ifvalid");
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

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankClassIsNull() {
            addCriterion("BANK_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andBankClassIsNotNull() {
            addCriterion("BANK_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBankClassEqualTo(String value) {
            addCriterion("BANK_CLASS =", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassNotEqualTo(String value) {
            addCriterion("BANK_CLASS <>", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassGreaterThan(String value) {
            addCriterion("BANK_CLASS >", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CLASS >=", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassLessThan(String value) {
            addCriterion("BANK_CLASS <", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassLessThanOrEqualTo(String value) {
            addCriterion("BANK_CLASS <=", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassLike(String value) {
            addCriterion("BANK_CLASS like", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassNotLike(String value) {
            addCriterion("BANK_CLASS not like", value, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassIn(List<String> values) {
            addCriterion("BANK_CLASS in", values, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassNotIn(List<String> values) {
            addCriterion("BANK_CLASS not in", values, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassBetween(String value1, String value2) {
            addCriterion("BANK_CLASS between", value1, value2, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankClassNotBetween(String value1, String value2) {
            addCriterion("BANK_CLASS not between", value1, value2, "bankClass");
            return (Criteria) this;
        }

        public Criteria andBankValueIsNull() {
            addCriterion("BANK_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andBankValueIsNotNull() {
            addCriterion("BANK_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andBankValueEqualTo(String value) {
            addCriterion("BANK_VALUE =", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueNotEqualTo(String value) {
            addCriterion("BANK_VALUE <>", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueGreaterThan(String value) {
            addCriterion("BANK_VALUE >", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_VALUE >=", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueLessThan(String value) {
            addCriterion("BANK_VALUE <", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueLessThanOrEqualTo(String value) {
            addCriterion("BANK_VALUE <=", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueLike(String value) {
            addCriterion("BANK_VALUE like", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueNotLike(String value) {
            addCriterion("BANK_VALUE not like", value, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueIn(List<String> values) {
            addCriterion("BANK_VALUE in", values, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueNotIn(List<String> values) {
            addCriterion("BANK_VALUE not in", values, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueBetween(String value1, String value2) {
            addCriterion("BANK_VALUE between", value1, value2, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankValueNotBetween(String value1, String value2) {
            addCriterion("BANK_VALUE not between", value1, value2, "bankValue");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAltIsNull() {
            addCriterion("BANK_ALT is null");
            return (Criteria) this;
        }

        public Criteria andBankAltIsNotNull() {
            addCriterion("BANK_ALT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAltEqualTo(String value) {
            addCriterion("BANK_ALT =", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltNotEqualTo(String value) {
            addCriterion("BANK_ALT <>", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltGreaterThan(String value) {
            addCriterion("BANK_ALT >", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ALT >=", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltLessThan(String value) {
            addCriterion("BANK_ALT <", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltLessThanOrEqualTo(String value) {
            addCriterion("BANK_ALT <=", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltLike(String value) {
            addCriterion("BANK_ALT like", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltNotLike(String value) {
            addCriterion("BANK_ALT not like", value, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltIn(List<String> values) {
            addCriterion("BANK_ALT in", values, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltNotIn(List<String> values) {
            addCriterion("BANK_ALT not in", values, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltBetween(String value1, String value2) {
            addCriterion("BANK_ALT between", value1, value2, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankAltNotBetween(String value1, String value2) {
            addCriterion("BANK_ALT not between", value1, value2, "bankAlt");
            return (Criteria) this;
        }

        public Criteria andBankSrcIsNull() {
            addCriterion("BANK_SRC is null");
            return (Criteria) this;
        }

        public Criteria andBankSrcIsNotNull() {
            addCriterion("BANK_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andBankSrcEqualTo(String value) {
            addCriterion("BANK_SRC =", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcNotEqualTo(String value) {
            addCriterion("BANK_SRC <>", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcGreaterThan(String value) {
            addCriterion("BANK_SRC >", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_SRC >=", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcLessThan(String value) {
            addCriterion("BANK_SRC <", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcLessThanOrEqualTo(String value) {
            addCriterion("BANK_SRC <=", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcLike(String value) {
            addCriterion("BANK_SRC like", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcNotLike(String value) {
            addCriterion("BANK_SRC not like", value, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcIn(List<String> values) {
            addCriterion("BANK_SRC in", values, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcNotIn(List<String> values) {
            addCriterion("BANK_SRC not in", values, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcBetween(String value1, String value2) {
            addCriterion("BANK_SRC between", value1, value2, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andBankSrcNotBetween(String value1, String value2) {
            addCriterion("BANK_SRC not between", value1, value2, "bankSrc");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DISPLAYORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DISPLAYORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(BigDecimal value) {
            addCriterion("DISPLAYORDER >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(BigDecimal value) {
            addCriterion("DISPLAYORDER <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andBankinstnoIsNull() {
            addCriterion("BANKINSTNO is null");
            return (Criteria) this;
        }

        public Criteria andBankinstnoIsNotNull() {
            addCriterion("BANKINSTNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankinstnoEqualTo(String value) {
            addCriterion("BANKINSTNO =", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoNotEqualTo(String value) {
            addCriterion("BANKINSTNO <>", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoGreaterThan(String value) {
            addCriterion("BANKINSTNO >", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKINSTNO >=", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoLessThan(String value) {
            addCriterion("BANKINSTNO <", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoLessThanOrEqualTo(String value) {
            addCriterion("BANKINSTNO <=", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoLike(String value) {
            addCriterion("BANKINSTNO like", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoNotLike(String value) {
            addCriterion("BANKINSTNO not like", value, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoIn(List<String> values) {
            addCriterion("BANKINSTNO in", values, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoNotIn(List<String> values) {
            addCriterion("BANKINSTNO not in", values, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoBetween(String value1, String value2) {
            addCriterion("BANKINSTNO between", value1, value2, "bankinstno");
            return (Criteria) this;
        }

        public Criteria andBankinstnoNotBetween(String value1, String value2) {
            addCriterion("BANKINSTNO not between", value1, value2, "bankinstno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : d_bankmapping
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
     * @Table : d_bankmapping
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