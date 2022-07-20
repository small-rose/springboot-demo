package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmPlatformfileDetailTdExample {
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
    public MmPlatformfileDetailTdExample() {
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
     * @Table : mm_platformfile_detail_td
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

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIsNull() {
            addCriterion("BATCHSERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIsNotNull() {
            addCriterion("BATCHSERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoEqualTo(String value) {
            addCriterion("BATCHSERIALNO =", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotEqualTo(String value) {
            addCriterion("BATCHSERIALNO <>", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThan(String value) {
            addCriterion("BATCHSERIALNO >", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO >=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThan(String value) {
            addCriterion("BATCHSERIALNO <", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHSERIALNO <=", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoLike(String value) {
            addCriterion("BATCHSERIALNO like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotLike(String value) {
            addCriterion("BATCHSERIALNO not like", value, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoIn(List<String> values) {
            addCriterion("BATCHSERIALNO in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotIn(List<String> values) {
            addCriterion("BATCHSERIALNO not in", values, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO between", value1, value2, "batchserialno");
            return (Criteria) this;
        }

        public Criteria andBatchserialnoNotBetween(String value1, String value2) {
            addCriterion("BATCHSERIALNO not between", value1, value2, "batchserialno");
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

        public Criteria andPaydateIsNull() {
            addCriterion("PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("PAYDATE =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("PAYDATE <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("PAYDATE >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYDATE >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("PAYDATE <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("PAYDATE <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("PAYDATE in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("PAYDATE not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("PAYDATE between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("PAYDATE not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeIsNull() {
            addCriterion("SETTLEMENTMODE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeIsNotNull() {
            addCriterion("SETTLEMENTMODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeEqualTo(String value) {
            addCriterion("SETTLEMENTMODE =", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeNotEqualTo(String value) {
            addCriterion("SETTLEMENTMODE <>", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeGreaterThan(String value) {
            addCriterion("SETTLEMENTMODE >", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTMODE >=", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeLessThan(String value) {
            addCriterion("SETTLEMENTMODE <", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTMODE <=", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeLike(String value) {
            addCriterion("SETTLEMENTMODE like", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeNotLike(String value) {
            addCriterion("SETTLEMENTMODE not like", value, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeIn(List<String> values) {
            addCriterion("SETTLEMENTMODE in", values, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeNotIn(List<String> values) {
            addCriterion("SETTLEMENTMODE not in", values, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeBetween(String value1, String value2) {
            addCriterion("SETTLEMENTMODE between", value1, value2, "settlementmode");
            return (Criteria) this;
        }

        public Criteria andSettlementmodeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENTMODE not between", value1, value2, "settlementmode");
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

        public Criteria andFundcategorycodeIsNull() {
            addCriterion("FUNDCATEGORYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeIsNotNull() {
            addCriterion("FUNDCATEGORYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeEqualTo(String value) {
            addCriterion("FUNDCATEGORYCODE =", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeNotEqualTo(String value) {
            addCriterion("FUNDCATEGORYCODE <>", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeGreaterThan(String value) {
            addCriterion("FUNDCATEGORYCODE >", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDCATEGORYCODE >=", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeLessThan(String value) {
            addCriterion("FUNDCATEGORYCODE <", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeLessThanOrEqualTo(String value) {
            addCriterion("FUNDCATEGORYCODE <=", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeLike(String value) {
            addCriterion("FUNDCATEGORYCODE like", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeNotLike(String value) {
            addCriterion("FUNDCATEGORYCODE not like", value, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeIn(List<String> values) {
            addCriterion("FUNDCATEGORYCODE in", values, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeNotIn(List<String> values) {
            addCriterion("FUNDCATEGORYCODE not in", values, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeBetween(String value1, String value2) {
            addCriterion("FUNDCATEGORYCODE between", value1, value2, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundcategorycodeNotBetween(String value1, String value2) {
            addCriterion("FUNDCATEGORYCODE not between", value1, value2, "fundcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeIsNull() {
            addCriterion("FUNDSUBCATEGORYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeIsNotNull() {
            addCriterion("FUNDSUBCATEGORYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeEqualTo(String value) {
            addCriterion("FUNDSUBCATEGORYCODE =", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeNotEqualTo(String value) {
            addCriterion("FUNDSUBCATEGORYCODE <>", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeGreaterThan(String value) {
            addCriterion("FUNDSUBCATEGORYCODE >", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDSUBCATEGORYCODE >=", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeLessThan(String value) {
            addCriterion("FUNDSUBCATEGORYCODE <", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeLessThanOrEqualTo(String value) {
            addCriterion("FUNDSUBCATEGORYCODE <=", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeLike(String value) {
            addCriterion("FUNDSUBCATEGORYCODE like", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeNotLike(String value) {
            addCriterion("FUNDSUBCATEGORYCODE not like", value, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeIn(List<String> values) {
            addCriterion("FUNDSUBCATEGORYCODE in", values, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeNotIn(List<String> values) {
            addCriterion("FUNDSUBCATEGORYCODE not in", values, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeBetween(String value1, String value2) {
            addCriterion("FUNDSUBCATEGORYCODE between", value1, value2, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andFundsubcategorycodeNotBetween(String value1, String value2) {
            addCriterion("FUNDSUBCATEGORYCODE not between", value1, value2, "fundsubcategorycode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeIsNull() {
            addCriterion("BUDGETITEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeIsNotNull() {
            addCriterion("BUDGETITEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeEqualTo(String value) {
            addCriterion("BUDGETITEMCODE =", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeNotEqualTo(String value) {
            addCriterion("BUDGETITEMCODE <>", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeGreaterThan(String value) {
            addCriterion("BUDGETITEMCODE >", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGETITEMCODE >=", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeLessThan(String value) {
            addCriterion("BUDGETITEMCODE <", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeLessThanOrEqualTo(String value) {
            addCriterion("BUDGETITEMCODE <=", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeLike(String value) {
            addCriterion("BUDGETITEMCODE like", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeNotLike(String value) {
            addCriterion("BUDGETITEMCODE not like", value, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeIn(List<String> values) {
            addCriterion("BUDGETITEMCODE in", values, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeNotIn(List<String> values) {
            addCriterion("BUDGETITEMCODE not in", values, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeBetween(String value1, String value2) {
            addCriterion("BUDGETITEMCODE between", value1, value2, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andBudgetitemcodeNotBetween(String value1, String value2) {
            addCriterion("BUDGETITEMCODE not between", value1, value2, "budgetitemcode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeIsNull() {
            addCriterion("MMENTITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeIsNotNull() {
            addCriterion("MMENTITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeEqualTo(String value) {
            addCriterion("MMENTITYCODE =", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeNotEqualTo(String value) {
            addCriterion("MMENTITYCODE <>", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeGreaterThan(String value) {
            addCriterion("MMENTITYCODE >", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("MMENTITYCODE >=", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeLessThan(String value) {
            addCriterion("MMENTITYCODE <", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeLessThanOrEqualTo(String value) {
            addCriterion("MMENTITYCODE <=", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeLike(String value) {
            addCriterion("MMENTITYCODE like", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeNotLike(String value) {
            addCriterion("MMENTITYCODE not like", value, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeIn(List<String> values) {
            addCriterion("MMENTITYCODE in", values, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeNotIn(List<String> values) {
            addCriterion("MMENTITYCODE not in", values, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeBetween(String value1, String value2) {
            addCriterion("MMENTITYCODE between", value1, value2, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmentitycodeNotBetween(String value1, String value2) {
            addCriterion("MMENTITYCODE not between", value1, value2, "mmentitycode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeIsNull() {
            addCriterion("MMBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeIsNotNull() {
            addCriterion("MMBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeEqualTo(String value) {
            addCriterion("MMBANKCODE =", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeNotEqualTo(String value) {
            addCriterion("MMBANKCODE <>", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeGreaterThan(String value) {
            addCriterion("MMBANKCODE >", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MMBANKCODE >=", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeLessThan(String value) {
            addCriterion("MMBANKCODE <", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeLessThanOrEqualTo(String value) {
            addCriterion("MMBANKCODE <=", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeLike(String value) {
            addCriterion("MMBANKCODE like", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeNotLike(String value) {
            addCriterion("MMBANKCODE not like", value, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeIn(List<String> values) {
            addCriterion("MMBANKCODE in", values, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeNotIn(List<String> values) {
            addCriterion("MMBANKCODE not in", values, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeBetween(String value1, String value2) {
            addCriterion("MMBANKCODE between", value1, value2, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmbankcodeNotBetween(String value1, String value2) {
            addCriterion("MMBANKCODE not between", value1, value2, "mmbankcode");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoIsNull() {
            addCriterion("MMACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoIsNotNull() {
            addCriterion("MMACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoEqualTo(String value) {
            addCriterion("MMACCOUNTNO =", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoNotEqualTo(String value) {
            addCriterion("MMACCOUNTNO <>", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoGreaterThan(String value) {
            addCriterion("MMACCOUNTNO >", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("MMACCOUNTNO >=", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoLessThan(String value) {
            addCriterion("MMACCOUNTNO <", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoLessThanOrEqualTo(String value) {
            addCriterion("MMACCOUNTNO <=", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoLike(String value) {
            addCriterion("MMACCOUNTNO like", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoNotLike(String value) {
            addCriterion("MMACCOUNTNO not like", value, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoIn(List<String> values) {
            addCriterion("MMACCOUNTNO in", values, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoNotIn(List<String> values) {
            addCriterion("MMACCOUNTNO not in", values, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoBetween(String value1, String value2) {
            addCriterion("MMACCOUNTNO between", value1, value2, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andMmaccountnoNotBetween(String value1, String value2) {
            addCriterion("MMACCOUNTNO not between", value1, value2, "mmaccountno");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(Short value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(Short value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(Short value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(Short value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<Short> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<Short> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(Short value1, Short value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustbankareaIsNull() {
            addCriterion("CUSTBANKAREA is null");
            return (Criteria) this;
        }

        public Criteria andCustbankareaIsNotNull() {
            addCriterion("CUSTBANKAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankareaEqualTo(String value) {
            addCriterion("CUSTBANKAREA =", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaNotEqualTo(String value) {
            addCriterion("CUSTBANKAREA <>", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaGreaterThan(String value) {
            addCriterion("CUSTBANKAREA >", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKAREA >=", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaLessThan(String value) {
            addCriterion("CUSTBANKAREA <", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKAREA <=", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaLike(String value) {
            addCriterion("CUSTBANKAREA like", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaNotLike(String value) {
            addCriterion("CUSTBANKAREA not like", value, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaIn(List<String> values) {
            addCriterion("CUSTBANKAREA in", values, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaNotIn(List<String> values) {
            addCriterion("CUSTBANKAREA not in", values, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaBetween(String value1, String value2) {
            addCriterion("CUSTBANKAREA between", value1, value2, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankareaNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKAREA not between", value1, value2, "custbankarea");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeIsNull() {
            addCriterion("CUSTBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeIsNotNull() {
            addCriterion("CUSTBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeEqualTo(String value) {
            addCriterion("CUSTBANKCODE =", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeNotEqualTo(String value) {
            addCriterion("CUSTBANKCODE <>", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeGreaterThan(String value) {
            addCriterion("CUSTBANKCODE >", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKCODE >=", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeLessThan(String value) {
            addCriterion("CUSTBANKCODE <", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKCODE <=", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeLike(String value) {
            addCriterion("CUSTBANKCODE like", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeNotLike(String value) {
            addCriterion("CUSTBANKCODE not like", value, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeIn(List<String> values) {
            addCriterion("CUSTBANKCODE in", values, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeNotIn(List<String> values) {
            addCriterion("CUSTBANKCODE not in", values, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeBetween(String value1, String value2) {
            addCriterion("CUSTBANKCODE between", value1, value2, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbankcodeNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKCODE not between", value1, value2, "custbankcode");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIsNull() {
            addCriterion("CUSTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIsNotNull() {
            addCriterion("CUSTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustbanknameEqualTo(String value) {
            addCriterion("CUSTBANKNAME =", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotEqualTo(String value) {
            addCriterion("CUSTBANKNAME <>", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameGreaterThan(String value) {
            addCriterion("CUSTBANKNAME >", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNAME >=", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLessThan(String value) {
            addCriterion("CUSTBANKNAME <", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKNAME <=", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameLike(String value) {
            addCriterion("CUSTBANKNAME like", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotLike(String value) {
            addCriterion("CUSTBANKNAME not like", value, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameIn(List<String> values) {
            addCriterion("CUSTBANKNAME in", values, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotIn(List<String> values) {
            addCriterion("CUSTBANKNAME not in", values, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameBetween(String value1, String value2) {
            addCriterion("CUSTBANKNAME between", value1, value2, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKNAME not between", value1, value2, "custbankname");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoIsNull() {
            addCriterion("CUSTUNITBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoIsNotNull() {
            addCriterion("CUSTUNITBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoEqualTo(String value) {
            addCriterion("CUSTUNITBANKNO =", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoNotEqualTo(String value) {
            addCriterion("CUSTUNITBANKNO <>", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoGreaterThan(String value) {
            addCriterion("CUSTUNITBANKNO >", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTUNITBANKNO >=", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoLessThan(String value) {
            addCriterion("CUSTUNITBANKNO <", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoLessThanOrEqualTo(String value) {
            addCriterion("CUSTUNITBANKNO <=", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoLike(String value) {
            addCriterion("CUSTUNITBANKNO like", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoNotLike(String value) {
            addCriterion("CUSTUNITBANKNO not like", value, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoIn(List<String> values) {
            addCriterion("CUSTUNITBANKNO in", values, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoNotIn(List<String> values) {
            addCriterion("CUSTUNITBANKNO not in", values, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoBetween(String value1, String value2) {
            addCriterion("CUSTUNITBANKNO between", value1, value2, "custunitbankno");
            return (Criteria) this;
        }

        public Criteria andCustunitbanknoNotBetween(String value1, String value2) {
            addCriterion("CUSTUNITBANKNO not between", value1, value2, "custunitbankno");
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

        public Criteria andBusinessnoIsNull() {
            addCriterion("BUSINESSNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("BUSINESSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("BUSINESSNO =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("BUSINESSNO <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("BUSINESSNO >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("BUSINESSNO <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNO <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("BUSINESSNO like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("BUSINESSNO not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("BUSINESSNO in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("BUSINESSNO not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("BUSINESSNO between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNO not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andIspublicIsNull() {
            addCriterion("ISPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIspublicIsNotNull() {
            addCriterion("ISPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIspublicEqualTo(Short value) {
            addCriterion("ISPUBLIC =", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotEqualTo(Short value) {
            addCriterion("ISPUBLIC <>", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicGreaterThan(Short value) {
            addCriterion("ISPUBLIC >", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicGreaterThanOrEqualTo(Short value) {
            addCriterion("ISPUBLIC >=", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicLessThan(Short value) {
            addCriterion("ISPUBLIC <", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicLessThanOrEqualTo(Short value) {
            addCriterion("ISPUBLIC <=", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicIn(List<Short> values) {
            addCriterion("ISPUBLIC in", values, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotIn(List<Short> values) {
            addCriterion("ISPUBLIC not in", values, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicBetween(Short value1, Short value2) {
            addCriterion("ISPUBLIC between", value1, value2, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotBetween(Short value1, Short value2) {
            addCriterion("ISPUBLIC not between", value1, value2, "ispublic");
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

        public Criteria andCardflagEqualTo(Short value) {
            addCriterion("CARDFLAG =", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotEqualTo(Short value) {
            addCriterion("CARDFLAG <>", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThan(Short value) {
            addCriterion("CARDFLAG >", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagGreaterThanOrEqualTo(Short value) {
            addCriterion("CARDFLAG >=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThan(Short value) {
            addCriterion("CARDFLAG <", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagLessThanOrEqualTo(Short value) {
            addCriterion("CARDFLAG <=", value, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagIn(List<Short> values) {
            addCriterion("CARDFLAG in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotIn(List<Short> values) {
            addCriterion("CARDFLAG not in", values, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagBetween(Short value1, Short value2) {
            addCriterion("CARDFLAG between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andCardflagNotBetween(Short value1, Short value2) {
            addCriterion("CARDFLAG not between", value1, value2, "cardflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNull() {
            addCriterion("FASTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("FASTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(Short value) {
            addCriterion("FASTFLAG =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(Short value) {
            addCriterion("FASTFLAG <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(Short value) {
            addCriterion("FASTFLAG >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(Short value) {
            addCriterion("FASTFLAG >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(Short value) {
            addCriterion("FASTFLAG <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(Short value) {
            addCriterion("FASTFLAG <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<Short> values) {
            addCriterion("FASTFLAG in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<Short> values) {
            addCriterion("FASTFLAG not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(Short value1, Short value2) {
            addCriterion("FASTFLAG between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(Short value1, Short value2) {
            addCriterion("FASTFLAG not between", value1, value2, "fastflag");
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

        public Criteria andCvvcodeIsNull() {
            addCriterion("CVVCODE is null");
            return (Criteria) this;
        }

        public Criteria andCvvcodeIsNotNull() {
            addCriterion("CVVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCvvcodeEqualTo(String value) {
            addCriterion("CVVCODE =", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeNotEqualTo(String value) {
            addCriterion("CVVCODE <>", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeGreaterThan(String value) {
            addCriterion("CVVCODE >", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CVVCODE >=", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeLessThan(String value) {
            addCriterion("CVVCODE <", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeLessThanOrEqualTo(String value) {
            addCriterion("CVVCODE <=", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeLike(String value) {
            addCriterion("CVVCODE like", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeNotLike(String value) {
            addCriterion("CVVCODE not like", value, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeIn(List<String> values) {
            addCriterion("CVVCODE in", values, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeNotIn(List<String> values) {
            addCriterion("CVVCODE not in", values, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeBetween(String value1, String value2) {
            addCriterion("CVVCODE between", value1, value2, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvcodeNotBetween(String value1, String value2) {
            addCriterion("CVVCODE not between", value1, value2, "cvvcode");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateIsNull() {
            addCriterion("CVVVALIDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateIsNotNull() {
            addCriterion("CVVVALIDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateEqualTo(String value) {
            addCriterion("CVVVALIDDATE =", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateNotEqualTo(String value) {
            addCriterion("CVVVALIDDATE <>", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateGreaterThan(String value) {
            addCriterion("CVVVALIDDATE >", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateGreaterThanOrEqualTo(String value) {
            addCriterion("CVVVALIDDATE >=", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateLessThan(String value) {
            addCriterion("CVVVALIDDATE <", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateLessThanOrEqualTo(String value) {
            addCriterion("CVVVALIDDATE <=", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateLike(String value) {
            addCriterion("CVVVALIDDATE like", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateNotLike(String value) {
            addCriterion("CVVVALIDDATE not like", value, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateIn(List<String> values) {
            addCriterion("CVVVALIDDATE in", values, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateNotIn(List<String> values) {
            addCriterion("CVVVALIDDATE not in", values, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateBetween(String value1, String value2) {
            addCriterion("CVVVALIDDATE between", value1, value2, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andCvvvaliddateNotBetween(String value1, String value2) {
            addCriterion("CVVVALIDDATE not between", value1, value2, "cvvvaliddate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateIsNull() {
            addCriterion("ATSDEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateIsNotNull() {
            addCriterion("ATSDEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateEqualTo(Short value) {
            addCriterion("ATSDEALSTATE =", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateNotEqualTo(Short value) {
            addCriterion("ATSDEALSTATE <>", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateGreaterThan(Short value) {
            addCriterion("ATSDEALSTATE >", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateGreaterThanOrEqualTo(Short value) {
            addCriterion("ATSDEALSTATE >=", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateLessThan(Short value) {
            addCriterion("ATSDEALSTATE <", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateLessThanOrEqualTo(Short value) {
            addCriterion("ATSDEALSTATE <=", value, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateIn(List<Short> values) {
            addCriterion("ATSDEALSTATE in", values, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateNotIn(List<Short> values) {
            addCriterion("ATSDEALSTATE not in", values, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateBetween(Short value1, Short value2) {
            addCriterion("ATSDEALSTATE between", value1, value2, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealstateNotBetween(Short value1, Short value2) {
            addCriterion("ATSDEALSTATE not between", value1, value2, "atsdealstate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateIsNull() {
            addCriterion("ATSDEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateIsNotNull() {
            addCriterion("ATSDEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateEqualTo(Date value) {
            addCriterion("ATSDEALDATE =", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateNotEqualTo(Date value) {
            addCriterion("ATSDEALDATE <>", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateGreaterThan(Date value) {
            addCriterion("ATSDEALDATE >", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ATSDEALDATE >=", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateLessThan(Date value) {
            addCriterion("ATSDEALDATE <", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateLessThanOrEqualTo(Date value) {
            addCriterion("ATSDEALDATE <=", value, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateIn(List<Date> values) {
            addCriterion("ATSDEALDATE in", values, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateNotIn(List<Date> values) {
            addCriterion("ATSDEALDATE not in", values, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateBetween(Date value1, Date value2) {
            addCriterion("ATSDEALDATE between", value1, value2, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealdateNotBetween(Date value1, Date value2) {
            addCriterion("ATSDEALDATE not between", value1, value2, "atsdealdate");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoIsNull() {
            addCriterion("ATSDEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoIsNotNull() {
            addCriterion("ATSDEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoEqualTo(String value) {
            addCriterion("ATSDEALERRORINFO =", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoNotEqualTo(String value) {
            addCriterion("ATSDEALERRORINFO <>", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoGreaterThan(String value) {
            addCriterion("ATSDEALERRORINFO >", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ATSDEALERRORINFO >=", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoLessThan(String value) {
            addCriterion("ATSDEALERRORINFO <", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("ATSDEALERRORINFO <=", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoLike(String value) {
            addCriterion("ATSDEALERRORINFO like", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoNotLike(String value) {
            addCriterion("ATSDEALERRORINFO not like", value, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoIn(List<String> values) {
            addCriterion("ATSDEALERRORINFO in", values, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoNotIn(List<String> values) {
            addCriterion("ATSDEALERRORINFO not in", values, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoBetween(String value1, String value2) {
            addCriterion("ATSDEALERRORINFO between", value1, value2, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsdealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("ATSDEALERRORINFO not between", value1, value2, "atsdealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateIsNull() {
            addCriterion("ATSRETURNSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateIsNotNull() {
            addCriterion("ATSRETURNSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateEqualTo(Short value) {
            addCriterion("ATSRETURNSTATE =", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateNotEqualTo(Short value) {
            addCriterion("ATSRETURNSTATE <>", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateGreaterThan(Short value) {
            addCriterion("ATSRETURNSTATE >", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateGreaterThanOrEqualTo(Short value) {
            addCriterion("ATSRETURNSTATE >=", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateLessThan(Short value) {
            addCriterion("ATSRETURNSTATE <", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateLessThanOrEqualTo(Short value) {
            addCriterion("ATSRETURNSTATE <=", value, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateIn(List<Short> values) {
            addCriterion("ATSRETURNSTATE in", values, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateNotIn(List<Short> values) {
            addCriterion("ATSRETURNSTATE not in", values, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateBetween(Short value1, Short value2) {
            addCriterion("ATSRETURNSTATE between", value1, value2, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturnstateNotBetween(Short value1, Short value2) {
            addCriterion("ATSRETURNSTATE not between", value1, value2, "atsreturnstate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateIsNull() {
            addCriterion("ATSRETURNDATE is null");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateIsNotNull() {
            addCriterion("ATSRETURNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateEqualTo(Date value) {
            addCriterion("ATSRETURNDATE =", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateNotEqualTo(Date value) {
            addCriterion("ATSRETURNDATE <>", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateGreaterThan(Date value) {
            addCriterion("ATSRETURNDATE >", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("ATSRETURNDATE >=", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateLessThan(Date value) {
            addCriterion("ATSRETURNDATE <", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateLessThanOrEqualTo(Date value) {
            addCriterion("ATSRETURNDATE <=", value, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateIn(List<Date> values) {
            addCriterion("ATSRETURNDATE in", values, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateNotIn(List<Date> values) {
            addCriterion("ATSRETURNDATE not in", values, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateBetween(Date value1, Date value2) {
            addCriterion("ATSRETURNDATE between", value1, value2, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturndateNotBetween(Date value1, Date value2) {
            addCriterion("ATSRETURNDATE not between", value1, value2, "atsreturndate");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoIsNull() {
            addCriterion("ATSRETURNINFO is null");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoIsNotNull() {
            addCriterion("ATSRETURNINFO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoEqualTo(String value) {
            addCriterion("ATSRETURNINFO =", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoNotEqualTo(String value) {
            addCriterion("ATSRETURNINFO <>", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoGreaterThan(String value) {
            addCriterion("ATSRETURNINFO >", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoGreaterThanOrEqualTo(String value) {
            addCriterion("ATSRETURNINFO >=", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoLessThan(String value) {
            addCriterion("ATSRETURNINFO <", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoLessThanOrEqualTo(String value) {
            addCriterion("ATSRETURNINFO <=", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoLike(String value) {
            addCriterion("ATSRETURNINFO like", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoNotLike(String value) {
            addCriterion("ATSRETURNINFO not like", value, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoIn(List<String> values) {
            addCriterion("ATSRETURNINFO in", values, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoNotIn(List<String> values) {
            addCriterion("ATSRETURNINFO not in", values, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoBetween(String value1, String value2) {
            addCriterion("ATSRETURNINFO between", value1, value2, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andAtsreturninfoNotBetween(String value1, String value2) {
            addCriterion("ATSRETURNINFO not between", value1, value2, "atsreturninfo");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("PAYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("PAYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(Short value) {
            addCriterion("PAYSTATE =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(Short value) {
            addCriterion("PAYSTATE <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(Short value) {
            addCriterion("PAYSTATE >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYSTATE >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(Short value) {
            addCriterion("PAYSTATE <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(Short value) {
            addCriterion("PAYSTATE <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<Short> values) {
            addCriterion("PAYSTATE in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<Short> values) {
            addCriterion("PAYSTATE not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(Short value1, Short value2) {
            addCriterion("PAYSTATE between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(Short value1, Short value2) {
            addCriterion("PAYSTATE not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNull() {
            addCriterion("PAYMADEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIsNotNull() {
            addCriterion("PAYMADEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymadedateEqualTo(Date value) {
            addCriterion("PAYMADEDATE =", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotEqualTo(Date value) {
            addCriterion("PAYMADEDATE <>", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThan(Date value) {
            addCriterion("PAYMADEDATE >", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMADEDATE >=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThan(Date value) {
            addCriterion("PAYMADEDATE <", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMADEDATE <=", value, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateIn(List<Date> values) {
            addCriterion("PAYMADEDATE in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotIn(List<Date> values) {
            addCriterion("PAYMADEDATE not in", values, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateBetween(Date value1, Date value2) {
            addCriterion("PAYMADEDATE between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPaymadedateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMADEDATE not between", value1, value2, "paymadedate");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIsNull() {
            addCriterion("PAYRESULTINFO is null");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIsNotNull() {
            addCriterion("PAYRESULTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoEqualTo(String value) {
            addCriterion("PAYRESULTINFO =", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotEqualTo(String value) {
            addCriterion("PAYRESULTINFO <>", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoGreaterThan(String value) {
            addCriterion("PAYRESULTINFO >", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYRESULTINFO >=", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLessThan(String value) {
            addCriterion("PAYRESULTINFO <", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLessThanOrEqualTo(String value) {
            addCriterion("PAYRESULTINFO <=", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoLike(String value) {
            addCriterion("PAYRESULTINFO like", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotLike(String value) {
            addCriterion("PAYRESULTINFO not like", value, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoIn(List<String> values) {
            addCriterion("PAYRESULTINFO in", values, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotIn(List<String> values) {
            addCriterion("PAYRESULTINFO not in", values, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoBetween(String value1, String value2) {
            addCriterion("PAYRESULTINFO between", value1, value2, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andPayresultinfoNotBetween(String value1, String value2) {
            addCriterion("PAYRESULTINFO not between", value1, value2, "payresultinfo");
            return (Criteria) this;
        }

        public Criteria andFailtypeIsNull() {
            addCriterion("FAILTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFailtypeIsNotNull() {
            addCriterion("FAILTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFailtypeEqualTo(String value) {
            addCriterion("FAILTYPE =", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotEqualTo(String value) {
            addCriterion("FAILTYPE <>", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeGreaterThan(String value) {
            addCriterion("FAILTYPE >", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FAILTYPE >=", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLessThan(String value) {
            addCriterion("FAILTYPE <", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLessThanOrEqualTo(String value) {
            addCriterion("FAILTYPE <=", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeLike(String value) {
            addCriterion("FAILTYPE like", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotLike(String value) {
            addCriterion("FAILTYPE not like", value, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeIn(List<String> values) {
            addCriterion("FAILTYPE in", values, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotIn(List<String> values) {
            addCriterion("FAILTYPE not in", values, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeBetween(String value1, String value2) {
            addCriterion("FAILTYPE between", value1, value2, "failtype");
            return (Criteria) this;
        }

        public Criteria andFailtypeNotBetween(String value1, String value2) {
            addCriterion("FAILTYPE not between", value1, value2, "failtype");
            return (Criteria) this;
        }

        public Criteria andBankabstractIsNull() {
            addCriterion("BANKABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andBankabstractIsNotNull() {
            addCriterion("BANKABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andBankabstractEqualTo(String value) {
            addCriterion("BANKABSTRACT =", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotEqualTo(String value) {
            addCriterion("BANKABSTRACT <>", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractGreaterThan(String value) {
            addCriterion("BANKABSTRACT >", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractGreaterThanOrEqualTo(String value) {
            addCriterion("BANKABSTRACT >=", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLessThan(String value) {
            addCriterion("BANKABSTRACT <", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLessThanOrEqualTo(String value) {
            addCriterion("BANKABSTRACT <=", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractLike(String value) {
            addCriterion("BANKABSTRACT like", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotLike(String value) {
            addCriterion("BANKABSTRACT not like", value, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractIn(List<String> values) {
            addCriterion("BANKABSTRACT in", values, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotIn(List<String> values) {
            addCriterion("BANKABSTRACT not in", values, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractBetween(String value1, String value2) {
            addCriterion("BANKABSTRACT between", value1, value2, "bankabstract");
            return (Criteria) this;
        }

        public Criteria andBankabstractNotBetween(String value1, String value2) {
            addCriterion("BANKABSTRACT not between", value1, value2, "bankabstract");
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

        public Criteria andRefundstateIsNull() {
            addCriterion("REFUNDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andRefundstateIsNotNull() {
            addCriterion("REFUNDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstateEqualTo(Short value) {
            addCriterion("REFUNDSTATE =", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateNotEqualTo(Short value) {
            addCriterion("REFUNDSTATE <>", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateGreaterThan(Short value) {
            addCriterion("REFUNDSTATE >", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateGreaterThanOrEqualTo(Short value) {
            addCriterion("REFUNDSTATE >=", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateLessThan(Short value) {
            addCriterion("REFUNDSTATE <", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateLessThanOrEqualTo(Short value) {
            addCriterion("REFUNDSTATE <=", value, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateIn(List<Short> values) {
            addCriterion("REFUNDSTATE in", values, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateNotIn(List<Short> values) {
            addCriterion("REFUNDSTATE not in", values, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateBetween(Short value1, Short value2) {
            addCriterion("REFUNDSTATE between", value1, value2, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundstateNotBetween(Short value1, Short value2) {
            addCriterion("REFUNDSTATE not between", value1, value2, "refundstate");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNull() {
            addCriterion("REFUNDINFO is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNotNull() {
            addCriterion("REFUNDINFO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoEqualTo(String value) {
            addCriterion("REFUNDINFO =", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotEqualTo(String value) {
            addCriterion("REFUNDINFO <>", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThan(String value) {
            addCriterion("REFUNDINFO >", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDINFO >=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThan(String value) {
            addCriterion("REFUNDINFO <", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThanOrEqualTo(String value) {
            addCriterion("REFUNDINFO <=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLike(String value) {
            addCriterion("REFUNDINFO like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotLike(String value) {
            addCriterion("REFUNDINFO not like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIn(List<String> values) {
            addCriterion("REFUNDINFO in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotIn(List<String> values) {
            addCriterion("REFUNDINFO not in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoBetween(String value1, String value2) {
            addCriterion("REFUNDINFO between", value1, value2, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotBetween(String value1, String value2) {
            addCriterion("REFUNDINFO not between", value1, value2, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNull() {
            addCriterion("REFUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNotNull() {
            addCriterion("REFUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeEqualTo(Date value) {
            addCriterion("REFUNDTIME =", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotEqualTo(Date value) {
            addCriterion("REFUNDTIME <>", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThan(Date value) {
            addCriterion("REFUNDTIME >", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUNDTIME >=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThan(Date value) {
            addCriterion("REFUNDTIME <", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUNDTIME <=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIn(List<Date> values) {
            addCriterion("REFUNDTIME in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotIn(List<Date> values) {
            addCriterion("REFUNDTIME not in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeBetween(Date value1, Date value2) {
            addCriterion("REFUNDTIME between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUNDTIME not between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNull() {
            addCriterion("CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andChecktypeIsNotNull() {
            addCriterion("CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChecktypeEqualTo(String value) {
            addCriterion("CHECKTYPE =", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotEqualTo(String value) {
            addCriterion("CHECKTYPE <>", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThan(String value) {
            addCriterion("CHECKTYPE >", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE >=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThan(String value) {
            addCriterion("CHECKTYPE <", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTYPE <=", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeLike(String value) {
            addCriterion("CHECKTYPE like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotLike(String value) {
            addCriterion("CHECKTYPE not like", value, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeIn(List<String> values) {
            addCriterion("CHECKTYPE in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotIn(List<String> values) {
            addCriterion("CHECKTYPE not in", values, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeBetween(String value1, String value2) {
            addCriterion("CHECKTYPE between", value1, value2, "checktype");
            return (Criteria) this;
        }

        public Criteria andChecktypeNotBetween(String value1, String value2) {
            addCriterion("CHECKTYPE not between", value1, value2, "checktype");
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

        public Criteria andSourcedealstateIsNull() {
            addCriterion("SOURCEDEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateIsNotNull() {
            addCriterion("SOURCEDEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateEqualTo(Short value) {
            addCriterion("SOURCEDEALSTATE =", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateNotEqualTo(Short value) {
            addCriterion("SOURCEDEALSTATE <>", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateGreaterThan(Short value) {
            addCriterion("SOURCEDEALSTATE >", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateGreaterThanOrEqualTo(Short value) {
            addCriterion("SOURCEDEALSTATE >=", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateLessThan(Short value) {
            addCriterion("SOURCEDEALSTATE <", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateLessThanOrEqualTo(Short value) {
            addCriterion("SOURCEDEALSTATE <=", value, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateIn(List<Short> values) {
            addCriterion("SOURCEDEALSTATE in", values, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateNotIn(List<Short> values) {
            addCriterion("SOURCEDEALSTATE not in", values, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateBetween(Short value1, Short value2) {
            addCriterion("SOURCEDEALSTATE between", value1, value2, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealstateNotBetween(Short value1, Short value2) {
            addCriterion("SOURCEDEALSTATE not between", value1, value2, "sourcedealstate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateIsNull() {
            addCriterion("SOURCEDEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateIsNotNull() {
            addCriterion("SOURCEDEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateEqualTo(Date value) {
            addCriterion("SOURCEDEALDATE =", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateNotEqualTo(Date value) {
            addCriterion("SOURCEDEALDATE <>", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateGreaterThan(Date value) {
            addCriterion("SOURCEDEALDATE >", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SOURCEDEALDATE >=", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateLessThan(Date value) {
            addCriterion("SOURCEDEALDATE <", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateLessThanOrEqualTo(Date value) {
            addCriterion("SOURCEDEALDATE <=", value, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateIn(List<Date> values) {
            addCriterion("SOURCEDEALDATE in", values, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateNotIn(List<Date> values) {
            addCriterion("SOURCEDEALDATE not in", values, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateBetween(Date value1, Date value2) {
            addCriterion("SOURCEDEALDATE between", value1, value2, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealdateNotBetween(Date value1, Date value2) {
            addCriterion("SOURCEDEALDATE not between", value1, value2, "sourcedealdate");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoIsNull() {
            addCriterion("SOURCEDEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoIsNotNull() {
            addCriterion("SOURCEDEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoEqualTo(String value) {
            addCriterion("SOURCEDEALERRORINFO =", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoNotEqualTo(String value) {
            addCriterion("SOURCEDEALERRORINFO <>", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoGreaterThan(String value) {
            addCriterion("SOURCEDEALERRORINFO >", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEDEALERRORINFO >=", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoLessThan(String value) {
            addCriterion("SOURCEDEALERRORINFO <", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("SOURCEDEALERRORINFO <=", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoLike(String value) {
            addCriterion("SOURCEDEALERRORINFO like", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoNotLike(String value) {
            addCriterion("SOURCEDEALERRORINFO not like", value, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoIn(List<String> values) {
            addCriterion("SOURCEDEALERRORINFO in", values, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoNotIn(List<String> values) {
            addCriterion("SOURCEDEALERRORINFO not in", values, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoBetween(String value1, String value2) {
            addCriterion("SOURCEDEALERRORINFO between", value1, value2, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcedealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("SOURCEDEALERRORINFO not between", value1, value2, "sourcedealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateIsNull() {
            addCriterion("SOURCEREFUNDDEALSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateIsNotNull() {
            addCriterion("SOURCEREFUNDDEALSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateEqualTo(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE =", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateNotEqualTo(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE <>", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateGreaterThan(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE >", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateGreaterThanOrEqualTo(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE >=", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateLessThan(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE <", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateLessThanOrEqualTo(Short value) {
            addCriterion("SOURCEREFUNDDEALSTATE <=", value, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateIn(List<Short> values) {
            addCriterion("SOURCEREFUNDDEALSTATE in", values, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateNotIn(List<Short> values) {
            addCriterion("SOURCEREFUNDDEALSTATE not in", values, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateBetween(Short value1, Short value2) {
            addCriterion("SOURCEREFUNDDEALSTATE between", value1, value2, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealstateNotBetween(Short value1, Short value2) {
            addCriterion("SOURCEREFUNDDEALSTATE not between", value1, value2, "sourcerefunddealstate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateIsNull() {
            addCriterion("SOURCEREFUNDDEALDATE is null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateIsNotNull() {
            addCriterion("SOURCEREFUNDDEALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateEqualTo(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE =", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateNotEqualTo(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE <>", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateGreaterThan(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE >", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE >=", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateLessThan(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE <", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateLessThanOrEqualTo(Date value) {
            addCriterion("SOURCEREFUNDDEALDATE <=", value, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateIn(List<Date> values) {
            addCriterion("SOURCEREFUNDDEALDATE in", values, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateNotIn(List<Date> values) {
            addCriterion("SOURCEREFUNDDEALDATE not in", values, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateBetween(Date value1, Date value2) {
            addCriterion("SOURCEREFUNDDEALDATE between", value1, value2, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealdateNotBetween(Date value1, Date value2) {
            addCriterion("SOURCEREFUNDDEALDATE not between", value1, value2, "sourcerefunddealdate");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoIsNull() {
            addCriterion("SOURCEREFUNDDEALERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoIsNotNull() {
            addCriterion("SOURCEREFUNDDEALERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoEqualTo(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO =", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoNotEqualTo(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO <>", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoGreaterThan(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO >", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO >=", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoLessThan(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO <", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoLessThanOrEqualTo(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO <=", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoLike(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO like", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoNotLike(String value) {
            addCriterion("SOURCEREFUNDDEALERRORINFO not like", value, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoIn(List<String> values) {
            addCriterion("SOURCEREFUNDDEALERRORINFO in", values, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoNotIn(List<String> values) {
            addCriterion("SOURCEREFUNDDEALERRORINFO not in", values, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoBetween(String value1, String value2) {
            addCriterion("SOURCEREFUNDDEALERRORINFO between", value1, value2, "sourcerefunddealerrorinfo");
            return (Criteria) this;
        }

        public Criteria andSourcerefunddealerrorinfoNotBetween(String value1, String value2) {
            addCriterion("SOURCEREFUNDDEALERRORINFO not between", value1, value2, "sourcerefunddealerrorinfo");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNull() {
            addCriterion("LASTOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNotNull() {
            addCriterion("LASTOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeEqualTo(String value) {
            addCriterion("LASTOPCODE =", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotEqualTo(String value) {
            addCriterion("LASTOPCODE <>", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThan(String value) {
            addCriterion("LASTOPCODE >", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE >=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThan(String value) {
            addCriterion("LASTOPCODE <", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE <=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLike(String value) {
            addCriterion("LASTOPCODE like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotLike(String value) {
            addCriterion("LASTOPCODE not like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIn(List<String> values) {
            addCriterion("LASTOPCODE in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotIn(List<String> values) {
            addCriterion("LASTOPCODE not in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeBetween(String value1, String value2) {
            addCriterion("LASTOPCODE between", value1, value2, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotBetween(String value1, String value2) {
            addCriterion("LASTOPCODE not between", value1, value2, "lastopcode");
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

        public Criteria andRowversionIsNull() {
            addCriterion("ROWVERSION is null");
            return (Criteria) this;
        }

        public Criteria andRowversionIsNotNull() {
            addCriterion("ROWVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRowversionEqualTo(Short value) {
            addCriterion("ROWVERSION =", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotEqualTo(Short value) {
            addCriterion("ROWVERSION <>", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThan(Short value) {
            addCriterion("ROWVERSION >", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThanOrEqualTo(Short value) {
            addCriterion("ROWVERSION >=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThan(Short value) {
            addCriterion("ROWVERSION <", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThanOrEqualTo(Short value) {
            addCriterion("ROWVERSION <=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionIn(List<Short> values) {
            addCriterion("ROWVERSION in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotIn(List<Short> values) {
            addCriterion("ROWVERSION not in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionBetween(Short value1, Short value2) {
            addCriterion("ROWVERSION between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotBetween(Short value1, Short value2) {
            addCriterion("ROWVERSION not between", value1, value2, "rowversion");
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

        public Criteria andCurrencynameIsNull() {
            addCriterion("CURRENCYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIsNotNull() {
            addCriterion("CURRENCYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameEqualTo(String value) {
            addCriterion("CURRENCYNAME =", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotEqualTo(String value) {
            addCriterion("CURRENCYNAME <>", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThan(String value) {
            addCriterion("CURRENCYNAME >", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME >=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThan(String value) {
            addCriterion("CURRENCYNAME <", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYNAME <=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLike(String value) {
            addCriterion("CURRENCYNAME like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotLike(String value) {
            addCriterion("CURRENCYNAME not like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIn(List<String> values) {
            addCriterion("CURRENCYNAME in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotIn(List<String> values) {
            addCriterion("CURRENCYNAME not in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotBetween(String value1, String value2) {
            addCriterion("CURRENCYNAME not between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIsNull() {
            addCriterion("MMACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIsNotNull() {
            addCriterion("MMACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andMmaccountidEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID =", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID <>", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThan(BigDecimal value) {
            addCriterion("MMACCOUNTID >", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID >=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThan(BigDecimal value) {
            addCriterion("MMACCOUNTID <", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MMACCOUNTID <=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIn(List<BigDecimal> values) {
            addCriterion("MMACCOUNTID in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotIn(List<BigDecimal> values) {
            addCriterion("MMACCOUNTID not in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMACCOUNTID between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMACCOUNTID not between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameIsNull() {
            addCriterion("MMACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameIsNotNull() {
            addCriterion("MMACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameEqualTo(String value) {
            addCriterion("MMACCOUNTNAME =", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameNotEqualTo(String value) {
            addCriterion("MMACCOUNTNAME <>", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameGreaterThan(String value) {
            addCriterion("MMACCOUNTNAME >", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("MMACCOUNTNAME >=", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameLessThan(String value) {
            addCriterion("MMACCOUNTNAME <", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameLessThanOrEqualTo(String value) {
            addCriterion("MMACCOUNTNAME <=", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameLike(String value) {
            addCriterion("MMACCOUNTNAME like", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameNotLike(String value) {
            addCriterion("MMACCOUNTNAME not like", value, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameIn(List<String> values) {
            addCriterion("MMACCOUNTNAME in", values, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameNotIn(List<String> values) {
            addCriterion("MMACCOUNTNAME not in", values, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameBetween(String value1, String value2) {
            addCriterion("MMACCOUNTNAME between", value1, value2, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmaccountnameNotBetween(String value1, String value2) {
            addCriterion("MMACCOUNTNAME not between", value1, value2, "mmaccountname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameIsNull() {
            addCriterion("MMBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andMmbanknameIsNotNull() {
            addCriterion("MMBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMmbanknameEqualTo(String value) {
            addCriterion("MMBANKNAME =", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameNotEqualTo(String value) {
            addCriterion("MMBANKNAME <>", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameGreaterThan(String value) {
            addCriterion("MMBANKNAME >", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("MMBANKNAME >=", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameLessThan(String value) {
            addCriterion("MMBANKNAME <", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameLessThanOrEqualTo(String value) {
            addCriterion("MMBANKNAME <=", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameLike(String value) {
            addCriterion("MMBANKNAME like", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameNotLike(String value) {
            addCriterion("MMBANKNAME not like", value, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameIn(List<String> values) {
            addCriterion("MMBANKNAME in", values, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameNotIn(List<String> values) {
            addCriterion("MMBANKNAME not in", values, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameBetween(String value1, String value2) {
            addCriterion("MMBANKNAME between", value1, value2, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andMmbanknameNotBetween(String value1, String value2) {
            addCriterion("MMBANKNAME not between", value1, value2, "mmbankname");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceIsNull() {
            addCriterion("CUSTBANKPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceIsNotNull() {
            addCriterion("CUSTBANKPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceEqualTo(String value) {
            addCriterion("CUSTBANKPROVINCE =", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceNotEqualTo(String value) {
            addCriterion("CUSTBANKPROVINCE <>", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceGreaterThan(String value) {
            addCriterion("CUSTBANKPROVINCE >", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKPROVINCE >=", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceLessThan(String value) {
            addCriterion("CUSTBANKPROVINCE <", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKPROVINCE <=", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceLike(String value) {
            addCriterion("CUSTBANKPROVINCE like", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceNotLike(String value) {
            addCriterion("CUSTBANKPROVINCE not like", value, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceIn(List<String> values) {
            addCriterion("CUSTBANKPROVINCE in", values, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceNotIn(List<String> values) {
            addCriterion("CUSTBANKPROVINCE not in", values, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceBetween(String value1, String value2) {
            addCriterion("CUSTBANKPROVINCE between", value1, value2, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankprovinceNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKPROVINCE not between", value1, value2, "custbankprovince");
            return (Criteria) this;
        }

        public Criteria andCustbankcityIsNull() {
            addCriterion("CUSTBANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andCustbankcityIsNotNull() {
            addCriterion("CUSTBANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankcityEqualTo(String value) {
            addCriterion("CUSTBANKCITY =", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityNotEqualTo(String value) {
            addCriterion("CUSTBANKCITY <>", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityGreaterThan(String value) {
            addCriterion("CUSTBANKCITY >", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKCITY >=", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityLessThan(String value) {
            addCriterion("CUSTBANKCITY <", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKCITY <=", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityLike(String value) {
            addCriterion("CUSTBANKCITY like", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityNotLike(String value) {
            addCriterion("CUSTBANKCITY not like", value, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityIn(List<String> values) {
            addCriterion("CUSTBANKCITY in", values, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityNotIn(List<String> values) {
            addCriterion("CUSTBANKCITY not in", values, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityBetween(String value1, String value2) {
            addCriterion("CUSTBANKCITY between", value1, value2, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andCustbankcityNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKCITY not between", value1, value2, "custbankcity");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNull() {
            addCriterion("INPAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIsNotNull() {
            addCriterion("INPAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentidEqualTo(Long value) {
            addCriterion("INPAYMENTID =", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotEqualTo(Long value) {
            addCriterion("INPAYMENTID <>", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThan(Long value) {
            addCriterion("INPAYMENTID >", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidGreaterThanOrEqualTo(Long value) {
            addCriterion("INPAYMENTID >=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThan(Long value) {
            addCriterion("INPAYMENTID <", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidLessThanOrEqualTo(Long value) {
            addCriterion("INPAYMENTID <=", value, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidIn(List<Long> values) {
            addCriterion("INPAYMENTID in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotIn(List<Long> values) {
            addCriterion("INPAYMENTID not in", values, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidBetween(Long value1, Long value2) {
            addCriterion("INPAYMENTID between", value1, value2, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andInpaymentidNotBetween(Long value1, Long value2) {
            addCriterion("INPAYMENTID not between", value1, value2, "inpaymentid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidIsNull() {
            addCriterion("PLATFORMFILEID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidIsNotNull() {
            addCriterion("PLATFORMFILEID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidEqualTo(String value) {
            addCriterion("PLATFORMFILEID =", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidNotEqualTo(String value) {
            addCriterion("PLATFORMFILEID <>", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidGreaterThan(String value) {
            addCriterion("PLATFORMFILEID >", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMFILEID >=", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidLessThan(String value) {
            addCriterion("PLATFORMFILEID <", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMFILEID <=", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidLike(String value) {
            addCriterion("PLATFORMFILEID like", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidNotLike(String value) {
            addCriterion("PLATFORMFILEID not like", value, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidIn(List<String> values) {
            addCriterion("PLATFORMFILEID in", values, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidNotIn(List<String> values) {
            addCriterion("PLATFORMFILEID not in", values, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidBetween(String value1, String value2) {
            addCriterion("PLATFORMFILEID between", value1, value2, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andPlatformfileidNotBetween(String value1, String value2) {
            addCriterion("PLATFORMFILEID not between", value1, value2, "platformfileid");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNull() {
            addCriterion("INPAYMENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIsNotNull() {
            addCriterion("INPAYMENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagEqualTo(String value) {
            addCriterion("INPAYMENTFLAG =", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <>", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThan(String value) {
            addCriterion("INPAYMENTFLAG >", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG >=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThan(String value) {
            addCriterion("INPAYMENTFLAG <", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTFLAG <=", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagLike(String value) {
            addCriterion("INPAYMENTFLAG like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotLike(String value) {
            addCriterion("INPAYMENTFLAG not like", value, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagIn(List<String> values) {
            addCriterion("INPAYMENTFLAG in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotIn(List<String> values) {
            addCriterion("INPAYMENTFLAG not in", values, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG between", value1, value2, "inpaymentflag");
            return (Criteria) this;
        }

        public Criteria andInpaymentflagNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTFLAG not between", value1, value2, "inpaymentflag");
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

        public Criteria andMerchantnoIsNull() {
            addCriterion("MERCHANTNO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNotNull() {
            addCriterion("MERCHANTNO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoEqualTo(String value) {
            addCriterion("MERCHANTNO =", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotEqualTo(String value) {
            addCriterion("MERCHANTNO <>", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThan(String value) {
            addCriterion("MERCHANTNO >", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTNO >=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThan(String value) {
            addCriterion("MERCHANTNO <", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTNO <=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLike(String value) {
            addCriterion("MERCHANTNO like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotLike(String value) {
            addCriterion("MERCHANTNO not like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIn(List<String> values) {
            addCriterion("MERCHANTNO in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotIn(List<String> values) {
            addCriterion("MERCHANTNO not in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoBetween(String value1, String value2) {
            addCriterion("MERCHANTNO between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotBetween(String value1, String value2) {
            addCriterion("MERCHANTNO not between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeIsNull() {
            addCriterion("BANK_FAILTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeIsNotNull() {
            addCriterion("BANK_FAILTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeEqualTo(String value) {
            addCriterion("BANK_FAILTYPE =", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeNotEqualTo(String value) {
            addCriterion("BANK_FAILTYPE <>", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeGreaterThan(String value) {
            addCriterion("BANK_FAILTYPE >", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_FAILTYPE >=", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeLessThan(String value) {
            addCriterion("BANK_FAILTYPE <", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_FAILTYPE <=", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeLike(String value) {
            addCriterion("BANK_FAILTYPE like", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeNotLike(String value) {
            addCriterion("BANK_FAILTYPE not like", value, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeIn(List<String> values) {
            addCriterion("BANK_FAILTYPE in", values, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeNotIn(List<String> values) {
            addCriterion("BANK_FAILTYPE not in", values, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeBetween(String value1, String value2) {
            addCriterion("BANK_FAILTYPE between", value1, value2, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankFailtypeNotBetween(String value1, String value2) {
            addCriterion("BANK_FAILTYPE not between", value1, value2, "bankFailtype");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoIsNull() {
            addCriterion("BANK_PAYRESULTINFO is null");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoIsNotNull() {
            addCriterion("BANK_PAYRESULTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoEqualTo(String value) {
            addCriterion("BANK_PAYRESULTINFO =", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoNotEqualTo(String value) {
            addCriterion("BANK_PAYRESULTINFO <>", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoGreaterThan(String value) {
            addCriterion("BANK_PAYRESULTINFO >", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_PAYRESULTINFO >=", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoLessThan(String value) {
            addCriterion("BANK_PAYRESULTINFO <", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoLessThanOrEqualTo(String value) {
            addCriterion("BANK_PAYRESULTINFO <=", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoLike(String value) {
            addCriterion("BANK_PAYRESULTINFO like", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoNotLike(String value) {
            addCriterion("BANK_PAYRESULTINFO not like", value, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoIn(List<String> values) {
            addCriterion("BANK_PAYRESULTINFO in", values, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoNotIn(List<String> values) {
            addCriterion("BANK_PAYRESULTINFO not in", values, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoBetween(String value1, String value2) {
            addCriterion("BANK_PAYRESULTINFO between", value1, value2, "bankPayresultinfo");
            return (Criteria) this;
        }

        public Criteria andBankPayresultinfoNotBetween(String value1, String value2) {
            addCriterion("BANK_PAYRESULTINFO not between", value1, value2, "bankPayresultinfo");
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

        public Criteria andSmsflagIsNull() {
            addCriterion("SMSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSmsflagIsNotNull() {
            addCriterion("SMSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSmsflagEqualTo(String value) {
            addCriterion("SMSFLAG =", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotEqualTo(String value) {
            addCriterion("SMSFLAG <>", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThan(String value) {
            addCriterion("SMSFLAG >", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagGreaterThanOrEqualTo(String value) {
            addCriterion("SMSFLAG >=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThan(String value) {
            addCriterion("SMSFLAG <", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLessThanOrEqualTo(String value) {
            addCriterion("SMSFLAG <=", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagLike(String value) {
            addCriterion("SMSFLAG like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotLike(String value) {
            addCriterion("SMSFLAG not like", value, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagIn(List<String> values) {
            addCriterion("SMSFLAG in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotIn(List<String> values) {
            addCriterion("SMSFLAG not in", values, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagBetween(String value1, String value2) {
            addCriterion("SMSFLAG between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andSmsflagNotBetween(String value1, String value2) {
            addCriterion("SMSFLAG not between", value1, value2, "smsflag");
            return (Criteria) this;
        }

        public Criteria andMailflagIsNull() {
            addCriterion("MAILFLAG is null");
            return (Criteria) this;
        }

        public Criteria andMailflagIsNotNull() {
            addCriterion("MAILFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMailflagEqualTo(String value) {
            addCriterion("MAILFLAG =", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagNotEqualTo(String value) {
            addCriterion("MAILFLAG <>", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagGreaterThan(String value) {
            addCriterion("MAILFLAG >", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagGreaterThanOrEqualTo(String value) {
            addCriterion("MAILFLAG >=", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagLessThan(String value) {
            addCriterion("MAILFLAG <", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagLessThanOrEqualTo(String value) {
            addCriterion("MAILFLAG <=", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagLike(String value) {
            addCriterion("MAILFLAG like", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagNotLike(String value) {
            addCriterion("MAILFLAG not like", value, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagIn(List<String> values) {
            addCriterion("MAILFLAG in", values, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagNotIn(List<String> values) {
            addCriterion("MAILFLAG not in", values, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagBetween(String value1, String value2) {
            addCriterion("MAILFLAG between", value1, value2, "mailflag");
            return (Criteria) this;
        }

        public Criteria andMailflagNotBetween(String value1, String value2) {
            addCriterion("MAILFLAG not between", value1, value2, "mailflag");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNull() {
            addCriterion("ATSBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIsNotNull() {
            addCriterion("ATSBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoEqualTo(String value) {
            addCriterion("ATSBILLNO =", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotEqualTo(String value) {
            addCriterion("ATSBILLNO <>", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThan(String value) {
            addCriterion("ATSBILLNO >", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO >=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThan(String value) {
            addCriterion("ATSBILLNO <", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLessThanOrEqualTo(String value) {
            addCriterion("ATSBILLNO <=", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoLike(String value) {
            addCriterion("ATSBILLNO like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotLike(String value) {
            addCriterion("ATSBILLNO not like", value, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoIn(List<String> values) {
            addCriterion("ATSBILLNO in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotIn(List<String> values) {
            addCriterion("ATSBILLNO not in", values, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoBetween(String value1, String value2) {
            addCriterion("ATSBILLNO between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andAtsbillnoNotBetween(String value1, String value2) {
            addCriterion("ATSBILLNO not between", value1, value2, "atsbillno");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNull() {
            addCriterion("CUSTACCOUNTAREA is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIsNotNull() {
            addCriterion("CUSTACCOUNTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA =", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <>", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThan(String value) {
            addCriterion("CUSTACCOUNTAREA >", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA >=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThan(String value) {
            addCriterion("CUSTACCOUNTAREA <", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTAREA <=", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaLike(String value) {
            addCriterion("CUSTACCOUNTAREA like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotLike(String value) {
            addCriterion("CUSTACCOUNTAREA not like", value, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTAREA not in", values, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustaccountareaNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTAREA not between", value1, value2, "custaccountarea");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNull() {
            addCriterion("CUSTBANKADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIsNotNull() {
            addCriterion("CUSTBANKADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrEqualTo(String value) {
            addCriterion("CUSTBANKADDR =", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotEqualTo(String value) {
            addCriterion("CUSTBANKADDR <>", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThan(String value) {
            addCriterion("CUSTBANKADDR >", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR >=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThan(String value) {
            addCriterion("CUSTBANKADDR <", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKADDR <=", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrLike(String value) {
            addCriterion("CUSTBANKADDR like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotLike(String value) {
            addCriterion("CUSTBANKADDR not like", value, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrIn(List<String> values) {
            addCriterion("CUSTBANKADDR in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotIn(List<String> values) {
            addCriterion("CUSTBANKADDR not in", values, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankaddrNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKADDR not between", value1, value2, "custbankaddr");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNull() {
            addCriterion("CUSTBANKSWIFTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIsNotNull() {
            addCriterion("CUSTBANKSWIFTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE =", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <>", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE >", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE >=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThan(String value) {
            addCriterion("CUSTBANKSWIFTCODE <", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTBANKSWIFTCODE <=", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotLike(String value) {
            addCriterion("CUSTBANKSWIFTCODE not like", value, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotIn(List<String> values) {
            addCriterion("CUSTBANKSWIFTCODE not in", values, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustbankswiftcodeNotBetween(String value1, String value2) {
            addCriterion("CUSTBANKSWIFTCODE not between", value1, value2, "custbankswiftcode");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNull() {
            addCriterion("CUSTCHARGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIsNotNull() {
            addCriterion("CUSTCHARGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE =", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <>", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThan(String value) {
            addCriterion("CUSTCHARGETYPE >", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE >=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThan(String value) {
            addCriterion("CUSTCHARGETYPE <", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTCHARGETYPE <=", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeLike(String value) {
            addCriterion("CUSTCHARGETYPE like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotLike(String value) {
            addCriterion("CUSTCHARGETYPE not like", value, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotIn(List<String> values) {
            addCriterion("CUSTCHARGETYPE not in", values, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE between", value1, value2, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andCustchargetypeNotBetween(String value1, String value2) {
            addCriterion("CUSTCHARGETYPE not between", value1, value2, "custchargetype");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeIsNull() {
            addCriterion("B_CURRENCODE is null");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeIsNotNull() {
            addCriterion("B_CURRENCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeEqualTo(String value) {
            addCriterion("B_CURRENCODE =", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeNotEqualTo(String value) {
            addCriterion("B_CURRENCODE <>", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeGreaterThan(String value) {
            addCriterion("B_CURRENCODE >", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeGreaterThanOrEqualTo(String value) {
            addCriterion("B_CURRENCODE >=", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeLessThan(String value) {
            addCriterion("B_CURRENCODE <", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeLessThanOrEqualTo(String value) {
            addCriterion("B_CURRENCODE <=", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeLike(String value) {
            addCriterion("B_CURRENCODE like", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeNotLike(String value) {
            addCriterion("B_CURRENCODE not like", value, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeIn(List<String> values) {
            addCriterion("B_CURRENCODE in", values, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeNotIn(List<String> values) {
            addCriterion("B_CURRENCODE not in", values, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeBetween(String value1, String value2) {
            addCriterion("B_CURRENCODE between", value1, value2, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBCurrencodeNotBetween(String value1, String value2) {
            addCriterion("B_CURRENCODE not between", value1, value2, "bCurrencode");
            return (Criteria) this;
        }

        public Criteria andBAmountIsNull() {
            addCriterion("B_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBAmountIsNotNull() {
            addCriterion("B_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBAmountEqualTo(BigDecimal value) {
            addCriterion("B_AMOUNT =", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotEqualTo(BigDecimal value) {
            addCriterion("B_AMOUNT <>", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountGreaterThan(BigDecimal value) {
            addCriterion("B_AMOUNT >", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("B_AMOUNT >=", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountLessThan(BigDecimal value) {
            addCriterion("B_AMOUNT <", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("B_AMOUNT <=", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountIn(List<BigDecimal> values) {
            addCriterion("B_AMOUNT in", values, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotIn(List<BigDecimal> values) {
            addCriterion("B_AMOUNT not in", values, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_AMOUNT between", value1, value2, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_AMOUNT not between", value1, value2, "bAmount");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("SEGMENT5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("SEGMENT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(String value) {
            addCriterion("SEGMENT5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(String value) {
            addCriterion("SEGMENT5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(String value) {
            addCriterion("SEGMENT5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(String value) {
            addCriterion("SEGMENT5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Like(String value) {
            addCriterion("SEGMENT5 like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotLike(String value) {
            addCriterion("SEGMENT5 not like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<String> values) {
            addCriterion("SEGMENT5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<String> values) {
            addCriterion("SEGMENT5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(String value1, String value2) {
            addCriterion("SEGMENT5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(String value1, String value2) {
            addCriterion("SEGMENT5 not between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME not between", value1, value2, "begintime");
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

        public Criteria andTimingBatchnoIsNull() {
            addCriterion("TIMING_BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoIsNotNull() {
            addCriterion("TIMING_BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoEqualTo(String value) {
            addCriterion("TIMING_BATCHNO =", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoNotEqualTo(String value) {
            addCriterion("TIMING_BATCHNO <>", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoGreaterThan(String value) {
            addCriterion("TIMING_BATCHNO >", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("TIMING_BATCHNO >=", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoLessThan(String value) {
            addCriterion("TIMING_BATCHNO <", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoLessThanOrEqualTo(String value) {
            addCriterion("TIMING_BATCHNO <=", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoLike(String value) {
            addCriterion("TIMING_BATCHNO like", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoNotLike(String value) {
            addCriterion("TIMING_BATCHNO not like", value, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoIn(List<String> values) {
            addCriterion("TIMING_BATCHNO in", values, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoNotIn(List<String> values) {
            addCriterion("TIMING_BATCHNO not in", values, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoBetween(String value1, String value2) {
            addCriterion("TIMING_BATCHNO between", value1, value2, "timingBatchno");
            return (Criteria) this;
        }

        public Criteria andTimingBatchnoNotBetween(String value1, String value2) {
            addCriterion("TIMING_BATCHNO not between", value1, value2, "timingBatchno");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_platformfile_detail_td
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
     * @Table : mm_platformfile_detail_td
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