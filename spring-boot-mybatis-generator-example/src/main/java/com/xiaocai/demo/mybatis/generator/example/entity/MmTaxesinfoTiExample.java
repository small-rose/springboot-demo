package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxesinfoTiExample {
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
    public MmTaxesinfoTiExample() {
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
     * @Table : mm_taxesinfo_ti
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

        public Criteria andDatatypeIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("DATATYPE =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("DATATYPE <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("DATATYPE >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("DATATYPE <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("DATATYPE like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("DATATYPE not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("DATATYPE in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("DATATYPE not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("DATATYPE between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("DATATYPE not between", value1, value2, "datatype");
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

        public Criteria andTaxpayercodeIsNull() {
            addCriterion("TAXPAYERCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIsNotNull() {
            addCriterion("TAXPAYERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeEqualTo(String value) {
            addCriterion("TAXPAYERCODE =", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotEqualTo(String value) {
            addCriterion("TAXPAYERCODE <>", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThan(String value) {
            addCriterion("TAXPAYERCODE >", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE >=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThan(String value) {
            addCriterion("TAXPAYERCODE <", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCODE <=", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeLike(String value) {
            addCriterion("TAXPAYERCODE like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotLike(String value) {
            addCriterion("TAXPAYERCODE not like", value, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeIn(List<String> values) {
            addCriterion("TAXPAYERCODE in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotIn(List<String> values) {
            addCriterion("TAXPAYERCODE not in", values, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayercodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERCODE not between", value1, value2, "taxpayercode");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNull() {
            addCriterion("TAXPAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIsNotNull() {
            addCriterion("TAXPAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameEqualTo(String value) {
            addCriterion("TAXPAYERNAME =", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotEqualTo(String value) {
            addCriterion("TAXPAYERNAME <>", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThan(String value) {
            addCriterion("TAXPAYERNAME >", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME >=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThan(String value) {
            addCriterion("TAXPAYERNAME <", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNAME <=", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameLike(String value) {
            addCriterion("TAXPAYERNAME like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotLike(String value) {
            addCriterion("TAXPAYERNAME not like", value, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameIn(List<String> values) {
            addCriterion("TAXPAYERNAME in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotIn(List<String> values) {
            addCriterion("TAXPAYERNAME not in", values, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayernameNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNAME not between", value1, value2, "taxpayername");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("TAXPAYER is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("TAXPAYER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("TAXPAYER =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("TAXPAYER <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("TAXPAYER >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("TAXPAYER <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("TAXPAYER like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("TAXPAYER not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("TAXPAYER in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("TAXPAYER not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("TAXPAYER between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNull() {
            addCriterion("TAXESADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIsNotNull() {
            addCriterion("TAXESADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressEqualTo(String value) {
            addCriterion("TAXESADDRESS =", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotEqualTo(String value) {
            addCriterion("TAXESADDRESS <>", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThan(String value) {
            addCriterion("TAXESADDRESS >", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS >=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThan(String value) {
            addCriterion("TAXESADDRESS <", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLessThanOrEqualTo(String value) {
            addCriterion("TAXESADDRESS <=", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressLike(String value) {
            addCriterion("TAXESADDRESS like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotLike(String value) {
            addCriterion("TAXESADDRESS not like", value, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressIn(List<String> values) {
            addCriterion("TAXESADDRESS in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotIn(List<String> values) {
            addCriterion("TAXESADDRESS not in", values, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesaddressNotBetween(String value1, String value2) {
            addCriterion("TAXESADDRESS not between", value1, value2, "taxesaddress");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNull() {
            addCriterion("TAXESPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIsNotNull() {
            addCriterion("TAXESPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneEqualTo(String value) {
            addCriterion("TAXESPHONE =", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotEqualTo(String value) {
            addCriterion("TAXESPHONE <>", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThan(String value) {
            addCriterion("TAXESPHONE >", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE >=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThan(String value) {
            addCriterion("TAXESPHONE <", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESPHONE <=", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneLike(String value) {
            addCriterion("TAXESPHONE like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotLike(String value) {
            addCriterion("TAXESPHONE not like", value, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneIn(List<String> values) {
            addCriterion("TAXESPHONE in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotIn(List<String> values) {
            addCriterion("TAXESPHONE not in", values, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneBetween(String value1, String value2) {
            addCriterion("TAXESPHONE between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesphoneNotBetween(String value1, String value2) {
            addCriterion("TAXESPHONE not between", value1, value2, "taxesphone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNull() {
            addCriterion("TAXESMOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIsNotNull() {
            addCriterion("TAXESMOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE =", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <>", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThan(String value) {
            addCriterion("TAXESMOBILEPHONE >", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE >=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThan(String value) {
            addCriterion("TAXESMOBILEPHONE <", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("TAXESMOBILEPHONE <=", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneLike(String value) {
            addCriterion("TAXESMOBILEPHONE like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotLike(String value) {
            addCriterion("TAXESMOBILEPHONE not like", value, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotIn(List<String> values) {
            addCriterion("TAXESMOBILEPHONE not in", values, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesmobilephoneNotBetween(String value1, String value2) {
            addCriterion("TAXESMOBILEPHONE not between", value1, value2, "taxesmobilephone");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNull() {
            addCriterion("TAXESEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIsNotNull() {
            addCriterion("TAXESEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesemailEqualTo(String value) {
            addCriterion("TAXESEMAIL =", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotEqualTo(String value) {
            addCriterion("TAXESEMAIL <>", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThan(String value) {
            addCriterion("TAXESEMAIL >", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL >=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThan(String value) {
            addCriterion("TAXESEMAIL <", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLessThanOrEqualTo(String value) {
            addCriterion("TAXESEMAIL <=", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailLike(String value) {
            addCriterion("TAXESEMAIL like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotLike(String value) {
            addCriterion("TAXESEMAIL not like", value, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailIn(List<String> values) {
            addCriterion("TAXESEMAIL in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotIn(List<String> values) {
            addCriterion("TAXESEMAIL not in", values, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesemailNotBetween(String value1, String value2) {
            addCriterion("TAXESEMAIL not between", value1, value2, "taxesemail");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNull() {
            addCriterion("TAXESBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIsNotNull() {
            addCriterion("TAXESBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameEqualTo(String value) {
            addCriterion("TAXESBANKNAME =", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotEqualTo(String value) {
            addCriterion("TAXESBANKNAME <>", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThan(String value) {
            addCriterion("TAXESBANKNAME >", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME >=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThan(String value) {
            addCriterion("TAXESBANKNAME <", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLessThanOrEqualTo(String value) {
            addCriterion("TAXESBANKNAME <=", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameLike(String value) {
            addCriterion("TAXESBANKNAME like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotLike(String value) {
            addCriterion("TAXESBANKNAME not like", value, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameIn(List<String> values) {
            addCriterion("TAXESBANKNAME in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotIn(List<String> values) {
            addCriterion("TAXESBANKNAME not in", values, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesbanknameNotBetween(String value1, String value2) {
            addCriterion("TAXESBANKNAME not between", value1, value2, "taxesbankname");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNull() {
            addCriterion("TAXESACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIsNotNull() {
            addCriterion("TAXESACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO =", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <>", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThan(String value) {
            addCriterion("TAXESACCOUNTNO >", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO >=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThan(String value) {
            addCriterion("TAXESACCOUNTNO <", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLessThanOrEqualTo(String value) {
            addCriterion("TAXESACCOUNTNO <=", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoLike(String value) {
            addCriterion("TAXESACCOUNTNO like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotLike(String value) {
            addCriterion("TAXESACCOUNTNO not like", value, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotIn(List<String> values) {
            addCriterion("TAXESACCOUNTNO not in", values, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxesaccountnoNotBetween(String value1, String value2) {
            addCriterion("TAXESACCOUNTNO not between", value1, value2, "taxesaccountno");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNull() {
            addCriterion("TAXESPAYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIsNotNull() {
            addCriterion("TAXESPAYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE =", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <>", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThan(String value) {
            addCriterion("TAXESPAYERTYPE >", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE >=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThan(String value) {
            addCriterion("TAXESPAYERTYPE <", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESPAYERTYPE <=", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeLike(String value) {
            addCriterion("TAXESPAYERTYPE like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotLike(String value) {
            addCriterion("TAXESPAYERTYPE not like", value, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotIn(List<String> values) {
            addCriterion("TAXESPAYERTYPE not in", values, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxespayertypeNotBetween(String value1, String value2) {
            addCriterion("TAXESPAYERTYPE not between", value1, value2, "taxespayertype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNull() {
            addCriterion("TAXESCERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIsNotNull() {
            addCriterion("TAXESCERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE =", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <>", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE >", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE >=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThan(String value) {
            addCriterion("TAXESCERTIFICATETYPE <", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATETYPE <=", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotLike(String value) {
            addCriterion("TAXESCERTIFICATETYPE not like", value, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATETYPE not in", values, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatetypeNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATETYPE not between", value1, value2, "taxescertificatetype");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNull() {
            addCriterion("TAXESCERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIsNotNull() {
            addCriterion("TAXESCERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO =", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <>", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThan(String value) {
            addCriterion("TAXESCERTIFICATENO >", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO >=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThan(String value) {
            addCriterion("TAXESCERTIFICATENO <", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLessThanOrEqualTo(String value) {
            addCriterion("TAXESCERTIFICATENO <=", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoLike(String value) {
            addCriterion("TAXESCERTIFICATENO like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotLike(String value) {
            addCriterion("TAXESCERTIFICATENO not like", value, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotIn(List<String> values) {
            addCriterion("TAXESCERTIFICATENO not in", values, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO between", value1, value2, "taxescertificateno");
            return (Criteria) this;
        }

        public Criteria andTaxescertificatenoNotBetween(String value1, String value2) {
            addCriterion("TAXESCERTIFICATENO not between", value1, value2, "taxescertificateno");
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

        public Criteria andReturncodeIsNull() {
            addCriterion("RETURNCODE is null");
            return (Criteria) this;
        }

        public Criteria andReturncodeIsNotNull() {
            addCriterion("RETURNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturncodeEqualTo(String value) {
            addCriterion("RETURNCODE =", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotEqualTo(String value) {
            addCriterion("RETURNCODE <>", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThan(String value) {
            addCriterion("RETURNCODE >", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNCODE >=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThan(String value) {
            addCriterion("RETURNCODE <", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLessThanOrEqualTo(String value) {
            addCriterion("RETURNCODE <=", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeLike(String value) {
            addCriterion("RETURNCODE like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotLike(String value) {
            addCriterion("RETURNCODE not like", value, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeIn(List<String> values) {
            addCriterion("RETURNCODE in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotIn(List<String> values) {
            addCriterion("RETURNCODE not in", values, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeBetween(String value1, String value2) {
            addCriterion("RETURNCODE between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturncodeNotBetween(String value1, String value2) {
            addCriterion("RETURNCODE not between", value1, value2, "returncode");
            return (Criteria) this;
        }

        public Criteria andReturnmssageIsNull() {
            addCriterion("RETURNMSSAGE is null");
            return (Criteria) this;
        }

        public Criteria andReturnmssageIsNotNull() {
            addCriterion("RETURNMSSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmssageEqualTo(String value) {
            addCriterion("RETURNMSSAGE =", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageNotEqualTo(String value) {
            addCriterion("RETURNMSSAGE <>", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageGreaterThan(String value) {
            addCriterion("RETURNMSSAGE >", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNMSSAGE >=", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageLessThan(String value) {
            addCriterion("RETURNMSSAGE <", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageLessThanOrEqualTo(String value) {
            addCriterion("RETURNMSSAGE <=", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageLike(String value) {
            addCriterion("RETURNMSSAGE like", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageNotLike(String value) {
            addCriterion("RETURNMSSAGE not like", value, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageIn(List<String> values) {
            addCriterion("RETURNMSSAGE in", values, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageNotIn(List<String> values) {
            addCriterion("RETURNMSSAGE not in", values, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageBetween(String value1, String value2) {
            addCriterion("RETURNMSSAGE between", value1, value2, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andReturnmssageNotBetween(String value1, String value2) {
            addCriterion("RETURNMSSAGE not between", value1, value2, "returnmssage");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNull() {
            addCriterion("INVOICEREMARK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIsNotNull() {
            addCriterion("INVOICEREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkEqualTo(String value) {
            addCriterion("INVOICEREMARK =", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotEqualTo(String value) {
            addCriterion("INVOICEREMARK <>", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThan(String value) {
            addCriterion("INVOICEREMARK >", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK >=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThan(String value) {
            addCriterion("INVOICEREMARK <", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLessThanOrEqualTo(String value) {
            addCriterion("INVOICEREMARK <=", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkLike(String value) {
            addCriterion("INVOICEREMARK like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotLike(String value) {
            addCriterion("INVOICEREMARK not like", value, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkIn(List<String> values) {
            addCriterion("INVOICEREMARK in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotIn(List<String> values) {
            addCriterion("INVOICEREMARK not in", values, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andInvoiceremarkNotBetween(String value1, String value2) {
            addCriterion("INVOICEREMARK not between", value1, value2, "invoiceremark");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNull() {
            addCriterion("opType is null");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNotNull() {
            addCriterion("opType is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(String value) {
            addCriterion("opType =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(String value) {
            addCriterion("opType <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(String value) {
            addCriterion("opType >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(String value) {
            addCriterion("opType >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(String value) {
            addCriterion("opType <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(String value) {
            addCriterion("opType <=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLike(String value) {
            addCriterion("opType like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotLike(String value) {
            addCriterion("opType not like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeIn(List<String> values) {
            addCriterion("opType in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<String> values) {
            addCriterion("opType not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(String value1, String value2) {
            addCriterion("opType between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(String value1, String value2) {
            addCriterion("opType not between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andInformidIsNull() {
            addCriterion("informId is null");
            return (Criteria) this;
        }

        public Criteria andInformidIsNotNull() {
            addCriterion("informId is not null");
            return (Criteria) this;
        }

        public Criteria andInformidEqualTo(String value) {
            addCriterion("informId =", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidNotEqualTo(String value) {
            addCriterion("informId <>", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidGreaterThan(String value) {
            addCriterion("informId >", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidGreaterThanOrEqualTo(String value) {
            addCriterion("informId >=", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidLessThan(String value) {
            addCriterion("informId <", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidLessThanOrEqualTo(String value) {
            addCriterion("informId <=", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidLike(String value) {
            addCriterion("informId like", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidNotLike(String value) {
            addCriterion("informId not like", value, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidIn(List<String> values) {
            addCriterion("informId in", values, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidNotIn(List<String> values) {
            addCriterion("informId not in", values, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidBetween(String value1, String value2) {
            addCriterion("informId between", value1, value2, "informid");
            return (Criteria) this;
        }

        public Criteria andInformidNotBetween(String value1, String value2) {
            addCriterion("informId not between", value1, value2, "informid");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxesinfo_ti
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
     * @Table : mm_taxesinfo_ti
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