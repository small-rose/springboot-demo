package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmReinsuranceTiExample {
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
    public MmReinsuranceTiExample() {
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
     * @Table : mm_reinsurance_ti
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

        public Criteria andTabperiodIsNull() {
            addCriterion("TABPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTabperiodIsNotNull() {
            addCriterion("TABPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTabperiodEqualTo(String value) {
            addCriterion("TABPERIOD =", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotEqualTo(String value) {
            addCriterion("TABPERIOD <>", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThan(String value) {
            addCriterion("TABPERIOD >", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodGreaterThanOrEqualTo(String value) {
            addCriterion("TABPERIOD >=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThan(String value) {
            addCriterion("TABPERIOD <", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLessThanOrEqualTo(String value) {
            addCriterion("TABPERIOD <=", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodLike(String value) {
            addCriterion("TABPERIOD like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotLike(String value) {
            addCriterion("TABPERIOD not like", value, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodIn(List<String> values) {
            addCriterion("TABPERIOD in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotIn(List<String> values) {
            addCriterion("TABPERIOD not in", values, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodBetween(String value1, String value2) {
            addCriterion("TABPERIOD between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andTabperiodNotBetween(String value1, String value2) {
            addCriterion("TABPERIOD not between", value1, value2, "tabperiod");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNull() {
            addCriterion("CONTRACTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNotNull() {
            addCriterion("CONTRACTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractcodeEqualTo(String value) {
            addCriterion("CONTRACTCODE =", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotEqualTo(String value) {
            addCriterion("CONTRACTCODE <>", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThan(String value) {
            addCriterion("CONTRACTCODE >", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE >=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThan(String value) {
            addCriterion("CONTRACTCODE <", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTCODE <=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLike(String value) {
            addCriterion("CONTRACTCODE like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotLike(String value) {
            addCriterion("CONTRACTCODE not like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeIn(List<String> values) {
            addCriterion("CONTRACTCODE in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotIn(List<String> values) {
            addCriterion("CONTRACTCODE not in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTCODE not between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("LAYER is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(BigDecimal value) {
            addCriterion("LAYER =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(BigDecimal value) {
            addCriterion("LAYER <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(BigDecimal value) {
            addCriterion("LAYER >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYER >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(BigDecimal value) {
            addCriterion("LAYER <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYER <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<BigDecimal> values) {
            addCriterion("LAYER in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<BigDecimal> values) {
            addCriterion("LAYER not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYER between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYER not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNull() {
            addCriterion("QSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQstypeIsNotNull() {
            addCriterion("QSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQstypeEqualTo(String value) {
            addCriterion("QSTYPE =", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotEqualTo(String value) {
            addCriterion("QSTYPE <>", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThan(String value) {
            addCriterion("QSTYPE >", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeGreaterThanOrEqualTo(String value) {
            addCriterion("QSTYPE >=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThan(String value) {
            addCriterion("QSTYPE <", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLessThanOrEqualTo(String value) {
            addCriterion("QSTYPE <=", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeLike(String value) {
            addCriterion("QSTYPE like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotLike(String value) {
            addCriterion("QSTYPE not like", value, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeIn(List<String> values) {
            addCriterion("QSTYPE in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotIn(List<String> values) {
            addCriterion("QSTYPE not in", values, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeBetween(String value1, String value2) {
            addCriterion("QSTYPE between", value1, value2, "qstype");
            return (Criteria) this;
        }

        public Criteria andQstypeNotBetween(String value1, String value2) {
            addCriterion("QSTYPE not between", value1, value2, "qstype");
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

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(String value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(String value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(String value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(String value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(String value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(String value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLike(String value) {
            addCriterion("LISTNO like", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotLike(String value) {
            addCriterion("LISTNO not like", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<String> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<String> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(String value1, String value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(String value1, String value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNull() {
            addCriterion("REINSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNotNull() {
            addCriterion("REINSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeEqualTo(String value) {
            addCriterion("REINSURERCODE =", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotEqualTo(String value) {
            addCriterion("REINSURERCODE <>", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThan(String value) {
            addCriterion("REINSURERCODE >", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE >=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThan(String value) {
            addCriterion("REINSURERCODE <", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE <=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLike(String value) {
            addCriterion("REINSURERCODE like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotLike(String value) {
            addCriterion("REINSURERCODE not like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIn(List<String> values) {
            addCriterion("REINSURERCODE in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotIn(List<String> values) {
            addCriterion("REINSURERCODE not in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeBetween(String value1, String value2) {
            addCriterion("REINSURERCODE between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotBetween(String value1, String value2) {
            addCriterion("REINSURERCODE not between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNull() {
            addCriterion("TRANSACTORCODE is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("TRANSACTORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("TRANSACTORCODE =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("TRANSACTORCODE <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("TRANSACTORCODE >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("TRANSACTORCODE <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTORCODE <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("TRANSACTORCODE like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("TRANSACTORCODE not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("TRANSACTORCODE in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("TRANSACTORCODE not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTORCODE not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNull() {
            addCriterion("CLASSESKIND is null");
            return (Criteria) this;
        }

        public Criteria andClasseskindIsNotNull() {
            addCriterion("CLASSESKIND is not null");
            return (Criteria) this;
        }

        public Criteria andClasseskindEqualTo(String value) {
            addCriterion("CLASSESKIND =", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotEqualTo(String value) {
            addCriterion("CLASSESKIND <>", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThan(String value) {
            addCriterion("CLASSESKIND >", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND >=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThan(String value) {
            addCriterion("CLASSESKIND <", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLessThanOrEqualTo(String value) {
            addCriterion("CLASSESKIND <=", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindLike(String value) {
            addCriterion("CLASSESKIND like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotLike(String value) {
            addCriterion("CLASSESKIND not like", value, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindIn(List<String> values) {
            addCriterion("CLASSESKIND in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotIn(List<String> values) {
            addCriterion("CLASSESKIND not in", values, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindBetween(String value1, String value2) {
            addCriterion("CLASSESKIND between", value1, value2, "classeskind");
            return (Criteria) this;
        }

        public Criteria andClasseskindNotBetween(String value1, String value2) {
            addCriterion("CLASSESKIND not between", value1, value2, "classeskind");
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

        public Criteria andContracttypeIsNull() {
            addCriterion("CONTRACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("CONTRACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("CONTRACTTYPE =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("CONTRACTTYPE <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("CONTRACTTYPE >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("CONTRACTTYPE <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTTYPE <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("CONTRACTTYPE like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("CONTRACTTYPE not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("CONTRACTTYPE in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("CONTRACTTYPE not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACTTYPE not between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNull() {
            addCriterion("OPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNotNull() {
            addCriterion("OPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpttypeEqualTo(String value) {
            addCriterion("OPTTYPE =", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotEqualTo(String value) {
            addCriterion("OPTTYPE <>", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThan(String value) {
            addCriterion("OPTTYPE >", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTTYPE >=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThan(String value) {
            addCriterion("OPTTYPE <", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThanOrEqualTo(String value) {
            addCriterion("OPTTYPE <=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLike(String value) {
            addCriterion("OPTTYPE like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotLike(String value) {
            addCriterion("OPTTYPE not like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeIn(List<String> values) {
            addCriterion("OPTTYPE in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotIn(List<String> values) {
            addCriterion("OPTTYPE not in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeBetween(String value1, String value2) {
            addCriterion("OPTTYPE between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotBetween(String value1, String value2) {
            addCriterion("OPTTYPE not between", value1, value2, "opttype");
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

        public Criteria andSummarynoIsNull() {
            addCriterion("SUMMARYNO is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("SUMMARYNO is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("SUMMARYNO =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("SUMMARYNO <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("SUMMARYNO >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("SUMMARYNO <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("SUMMARYNO <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("SUMMARYNO like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("SUMMARYNO not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("SUMMARYNO in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("SUMMARYNO not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("SUMMARYNO between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("SUMMARYNO not between", value1, value2, "summaryno");
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

        public Criteria andAccnoIsNull() {
            addCriterion("ACCNO is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("ACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("ACCNO =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("ACCNO <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("ACCNO >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNO >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("ACCNO <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("ACCNO <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("ACCNO like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("ACCNO not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("ACCNO in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("ACCNO not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("ACCNO between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("ACCNO not between", value1, value2, "accno");
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

        public Criteria andErrmsgIsNull() {
            addCriterion("ERRMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNotNull() {
            addCriterion("ERRMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrmsgEqualTo(String value) {
            addCriterion("ERRMSG =", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotEqualTo(String value) {
            addCriterion("ERRMSG <>", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThan(String value) {
            addCriterion("ERRMSG >", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRMSG >=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThan(String value) {
            addCriterion("ERRMSG <", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThanOrEqualTo(String value) {
            addCriterion("ERRMSG <=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLike(String value) {
            addCriterion("ERRMSG like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotLike(String value) {
            addCriterion("ERRMSG not like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgIn(List<String> values) {
            addCriterion("ERRMSG in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotIn(List<String> values) {
            addCriterion("ERRMSG not in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgBetween(String value1, String value2) {
            addCriterion("ERRMSG between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotBetween(String value1, String value2) {
            addCriterion("ERRMSG not between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnIsNull() {
            addCriterion("REINSURERNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnIsNotNull() {
            addCriterion("REINSURERNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnEqualTo(String value) {
            addCriterion("REINSURERNAMECN =", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnNotEqualTo(String value) {
            addCriterion("REINSURERNAMECN <>", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnGreaterThan(String value) {
            addCriterion("REINSURERNAMECN >", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERNAMECN >=", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnLessThan(String value) {
            addCriterion("REINSURERNAMECN <", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnLessThanOrEqualTo(String value) {
            addCriterion("REINSURERNAMECN <=", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnLike(String value) {
            addCriterion("REINSURERNAMECN like", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnNotLike(String value) {
            addCriterion("REINSURERNAMECN not like", value, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnIn(List<String> values) {
            addCriterion("REINSURERNAMECN in", values, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnNotIn(List<String> values) {
            addCriterion("REINSURERNAMECN not in", values, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnBetween(String value1, String value2) {
            addCriterion("REINSURERNAMECN between", value1, value2, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernamecnNotBetween(String value1, String value2) {
            addCriterion("REINSURERNAMECN not between", value1, value2, "reinsurernamecn");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenIsNull() {
            addCriterion("REINSURERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenIsNotNull() {
            addCriterion("REINSURERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenEqualTo(String value) {
            addCriterion("REINSURERNAMEEN =", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenNotEqualTo(String value) {
            addCriterion("REINSURERNAMEEN <>", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenGreaterThan(String value) {
            addCriterion("REINSURERNAMEEN >", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERNAMEEN >=", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenLessThan(String value) {
            addCriterion("REINSURERNAMEEN <", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenLessThanOrEqualTo(String value) {
            addCriterion("REINSURERNAMEEN <=", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenLike(String value) {
            addCriterion("REINSURERNAMEEN like", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenNotLike(String value) {
            addCriterion("REINSURERNAMEEN not like", value, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenIn(List<String> values) {
            addCriterion("REINSURERNAMEEN in", values, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenNotIn(List<String> values) {
            addCriterion("REINSURERNAMEEN not in", values, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenBetween(String value1, String value2) {
            addCriterion("REINSURERNAMEEN between", value1, value2, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurernameenNotBetween(String value1, String value2) {
            addCriterion("REINSURERNAMEEN not between", value1, value2, "reinsurernameen");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoIsNull() {
            addCriterion("REINSURERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoIsNotNull() {
            addCriterion("REINSURERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoEqualTo(String value) {
            addCriterion("REINSURERPARTYNO =", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoNotEqualTo(String value) {
            addCriterion("REINSURERPARTYNO <>", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoGreaterThan(String value) {
            addCriterion("REINSURERPARTYNO >", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERPARTYNO >=", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoLessThan(String value) {
            addCriterion("REINSURERPARTYNO <", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoLessThanOrEqualTo(String value) {
            addCriterion("REINSURERPARTYNO <=", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoLike(String value) {
            addCriterion("REINSURERPARTYNO like", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoNotLike(String value) {
            addCriterion("REINSURERPARTYNO not like", value, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoIn(List<String> values) {
            addCriterion("REINSURERPARTYNO in", values, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoNotIn(List<String> values) {
            addCriterion("REINSURERPARTYNO not in", values, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoBetween(String value1, String value2) {
            addCriterion("REINSURERPARTYNO between", value1, value2, "reinsurerpartyno");
            return (Criteria) this;
        }

        public Criteria andReinsurerpartynoNotBetween(String value1, String value2) {
            addCriterion("REINSURERPARTYNO not between", value1, value2, "reinsurerpartyno");
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

        public Criteria andBusinesschannelIsNull() {
            addCriterion("BUSINESSCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("BUSINESSCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("BUSINESSCHANNEL >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("BUSINESSCHANNEL <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCHANNEL <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("BUSINESSCHANNEL like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("BUSINESSCHANNEL not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("BUSINESSCHANNEL not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCHANNEL not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("DOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("DOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(String value) {
            addCriterion("DOMESTIC =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(String value) {
            addCriterion("DOMESTIC <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(String value) {
            addCriterion("DOMESTIC >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(String value) {
            addCriterion("DOMESTIC <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLike(String value) {
            addCriterion("DOMESTIC like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotLike(String value) {
            addCriterion("DOMESTIC not like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<String> values) {
            addCriterion("DOMESTIC in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<String> values) {
            addCriterion("DOMESTIC not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(String value1, String value2) {
            addCriterion("DOMESTIC between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC not between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNull() {
            addCriterion("CUSTACCOUNTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIsNotNull() {
            addCriterion("CUSTACCOUNTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN =", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <>", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN >=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThan(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTNAMEEN <=", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotLike(String value) {
            addCriterion("CUSTACCOUNTNAMEEN not like", value, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTNAMEEN not in", values, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN between", value1, value2, "custaccountnameen");
            return (Criteria) this;
        }

        public Criteria andCustaccountnameenNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTNAMEEN not between", value1, value2, "custaccountnameen");
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

        public Criteria andApplicantcodeIsNull() {
            addCriterion("APPLICANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIsNotNull() {
            addCriterion("APPLICANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeEqualTo(String value) {
            addCriterion("APPLICANTCODE =", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotEqualTo(String value) {
            addCriterion("APPLICANTCODE <>", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThan(String value) {
            addCriterion("APPLICANTCODE >", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE >=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThan(String value) {
            addCriterion("APPLICANTCODE <", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTCODE <=", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeLike(String value) {
            addCriterion("APPLICANTCODE like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotLike(String value) {
            addCriterion("APPLICANTCODE not like", value, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeIn(List<String> values) {
            addCriterion("APPLICANTCODE in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotIn(List<String> values) {
            addCriterion("APPLICANTCODE not in", values, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantcodeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTCODE not between", value1, value2, "applicantcode");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNull() {
            addCriterion("APPLICANTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIsNotNull() {
            addCriterion("APPLICANTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnEqualTo(String value) {
            addCriterion("APPLICANTNAMECN =", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <>", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThan(String value) {
            addCriterion("APPLICANTNAMECN >", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN >=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThan(String value) {
            addCriterion("APPLICANTNAMECN <", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMECN <=", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnLike(String value) {
            addCriterion("APPLICANTNAMECN like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotLike(String value) {
            addCriterion("APPLICANTNAMECN not like", value, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnIn(List<String> values) {
            addCriterion("APPLICANTNAMECN in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotIn(List<String> values) {
            addCriterion("APPLICANTNAMECN not in", values, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnamecnNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMECN not between", value1, value2, "applicantnamecn");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNull() {
            addCriterion("APPLICANTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIsNotNull() {
            addCriterion("APPLICANTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN =", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <>", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThan(String value) {
            addCriterion("APPLICANTNAMEEN >", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN >=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThan(String value) {
            addCriterion("APPLICANTNAMEEN <", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTNAMEEN <=", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenLike(String value) {
            addCriterion("APPLICANTNAMEEN like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotLike(String value) {
            addCriterion("APPLICANTNAMEEN not like", value, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotIn(List<String> values) {
            addCriterion("APPLICANTNAMEEN not in", values, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantnameenNotBetween(String value1, String value2) {
            addCriterion("APPLICANTNAMEEN not between", value1, value2, "applicantnameen");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNull() {
            addCriterion("APPLICANTIONPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIsNotNull() {
            addCriterion("APPLICANTIONPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO =", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <>", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThan(String value) {
            addCriterion("APPLICANTIONPARTYNO >", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO >=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThan(String value) {
            addCriterion("APPLICANTIONPARTYNO <", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTIONPARTYNO <=", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoLike(String value) {
            addCriterion("APPLICANTIONPARTYNO like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotLike(String value) {
            addCriterion("APPLICANTIONPARTYNO not like", value, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotIn(List<String> values) {
            addCriterion("APPLICANTIONPARTYNO not in", values, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andApplicantionpartynoNotBetween(String value1, String value2) {
            addCriterion("APPLICANTIONPARTYNO not between", value1, value2, "applicantionpartyno");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNull() {
            addCriterion("APPISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIsNotNull() {
            addCriterion("APPISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andAppisjapanEqualTo(String value) {
            addCriterion("APPISJAPAN =", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotEqualTo(String value) {
            addCriterion("APPISJAPAN <>", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThan(String value) {
            addCriterion("APPISJAPAN >", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN >=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThan(String value) {
            addCriterion("APPISJAPAN <", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLessThanOrEqualTo(String value) {
            addCriterion("APPISJAPAN <=", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanLike(String value) {
            addCriterion("APPISJAPAN like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotLike(String value) {
            addCriterion("APPISJAPAN not like", value, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanIn(List<String> values) {
            addCriterion("APPISJAPAN in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotIn(List<String> values) {
            addCriterion("APPISJAPAN not in", values, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanBetween(String value1, String value2) {
            addCriterion("APPISJAPAN between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andAppisjapanNotBetween(String value1, String value2) {
            addCriterion("APPISJAPAN not between", value1, value2, "appisjapan");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNull() {
            addCriterion("INSURANCETERM is null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIsNotNull() {
            addCriterion("INSURANCETERM is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancetermEqualTo(String value) {
            addCriterion("INSURANCETERM =", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotEqualTo(String value) {
            addCriterion("INSURANCETERM <>", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThan(String value) {
            addCriterion("INSURANCETERM >", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM >=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThan(String value) {
            addCriterion("INSURANCETERM <", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLessThanOrEqualTo(String value) {
            addCriterion("INSURANCETERM <=", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermLike(String value) {
            addCriterion("INSURANCETERM like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotLike(String value) {
            addCriterion("INSURANCETERM not like", value, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermIn(List<String> values) {
            addCriterion("INSURANCETERM in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotIn(List<String> values) {
            addCriterion("INSURANCETERM not in", values, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermBetween(String value1, String value2) {
            addCriterion("INSURANCETERM between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andInsurancetermNotBetween(String value1, String value2) {
            addCriterion("INSURANCETERM not between", value1, value2, "insuranceterm");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("AGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("AGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("AGENTCODE =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("AGENTCODE <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("AGENTCODE >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTCODE >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("AGENTCODE <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENTCODE <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("AGENTCODE like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("AGENTCODE not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("AGENTCODE in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("AGENTCODE not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("AGENTCODE between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("AGENTCODE not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNull() {
            addCriterion("AGENTNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIsNotNull() {
            addCriterion("AGENTNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnEqualTo(String value) {
            addCriterion("AGENTNAMECN =", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotEqualTo(String value) {
            addCriterion("AGENTNAMECN <>", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThan(String value) {
            addCriterion("AGENTNAMECN >", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN >=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThan(String value) {
            addCriterion("AGENTNAMECN <", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMECN <=", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnLike(String value) {
            addCriterion("AGENTNAMECN like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotLike(String value) {
            addCriterion("AGENTNAMECN not like", value, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnIn(List<String> values) {
            addCriterion("AGENTNAMECN in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotIn(List<String> values) {
            addCriterion("AGENTNAMECN not in", values, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnamecnNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMECN not between", value1, value2, "agentnamecn");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNull() {
            addCriterion("AGENTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNotNull() {
            addCriterion("AGENTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenEqualTo(String value) {
            addCriterion("AGENTNAMEEN =", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotEqualTo(String value) {
            addCriterion("AGENTNAMEEN <>", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThan(String value) {
            addCriterion("AGENTNAMEEN >", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN >=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThan(String value) {
            addCriterion("AGENTNAMEEN <", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN <=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLike(String value) {
            addCriterion("AGENTNAMEEN like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotLike(String value) {
            addCriterion("AGENTNAMEEN not like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIn(List<String> values) {
            addCriterion("AGENTNAMEEN in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotIn(List<String> values) {
            addCriterion("AGENTNAMEEN not in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN not between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNull() {
            addCriterion("AGENTPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIsNotNull() {
            addCriterion("AGENTPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoEqualTo(String value) {
            addCriterion("AGENTPARTYNO =", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotEqualTo(String value) {
            addCriterion("AGENTPARTYNO <>", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThan(String value) {
            addCriterion("AGENTPARTYNO >", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO >=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThan(String value) {
            addCriterion("AGENTPARTYNO <", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLessThanOrEqualTo(String value) {
            addCriterion("AGENTPARTYNO <=", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoLike(String value) {
            addCriterion("AGENTPARTYNO like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotLike(String value) {
            addCriterion("AGENTPARTYNO not like", value, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoIn(List<String> values) {
            addCriterion("AGENTPARTYNO in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotIn(List<String> values) {
            addCriterion("AGENTPARTYNO not in", values, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andAgentpartynoNotBetween(String value1, String value2) {
            addCriterion("AGENTPARTYNO not between", value1, value2, "agentpartyno");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNull() {
            addCriterion("PORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPorttypeIsNotNull() {
            addCriterion("PORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPorttypeEqualTo(String value) {
            addCriterion("PORTTYPE =", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotEqualTo(String value) {
            addCriterion("PORTTYPE <>", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThan(String value) {
            addCriterion("PORTTYPE >", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTTYPE >=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThan(String value) {
            addCriterion("PORTTYPE <", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLessThanOrEqualTo(String value) {
            addCriterion("PORTTYPE <=", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeLike(String value) {
            addCriterion("PORTTYPE like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotLike(String value) {
            addCriterion("PORTTYPE not like", value, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeIn(List<String> values) {
            addCriterion("PORTTYPE in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotIn(List<String> values) {
            addCriterion("PORTTYPE not in", values, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeBetween(String value1, String value2) {
            addCriterion("PORTTYPE between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andPorttypeNotBetween(String value1, String value2) {
            addCriterion("PORTTYPE not between", value1, value2, "porttype");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNull() {
            addCriterion("HASPLAN is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("HASPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("HASPLAN =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("HASPLAN <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("HASPLAN >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("HASPLAN >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("HASPLAN <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("HASPLAN <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("HASPLAN like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("HASPLAN not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("HASPLAN in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("HASPLAN not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("HASPLAN between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("HASPLAN not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andRibillnoIsNull() {
            addCriterion("RIBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andRibillnoIsNotNull() {
            addCriterion("RIBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andRibillnoEqualTo(String value) {
            addCriterion("RIBILLNO =", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotEqualTo(String value) {
            addCriterion("RIBILLNO <>", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoGreaterThan(String value) {
            addCriterion("RIBILLNO >", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoGreaterThanOrEqualTo(String value) {
            addCriterion("RIBILLNO >=", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLessThan(String value) {
            addCriterion("RIBILLNO <", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLessThanOrEqualTo(String value) {
            addCriterion("RIBILLNO <=", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoLike(String value) {
            addCriterion("RIBILLNO like", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotLike(String value) {
            addCriterion("RIBILLNO not like", value, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoIn(List<String> values) {
            addCriterion("RIBILLNO in", values, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotIn(List<String> values) {
            addCriterion("RIBILLNO not in", values, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoBetween(String value1, String value2) {
            addCriterion("RIBILLNO between", value1, value2, "ribillno");
            return (Criteria) this;
        }

        public Criteria andRibillnoNotBetween(String value1, String value2) {
            addCriterion("RIBILLNO not between", value1, value2, "ribillno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNull() {
            addCriterion("OFFSETNO is null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIsNotNull() {
            addCriterion("OFFSETNO is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetnoEqualTo(String value) {
            addCriterion("OFFSETNO =", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotEqualTo(String value) {
            addCriterion("OFFSETNO <>", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThan(String value) {
            addCriterion("OFFSETNO >", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETNO >=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThan(String value) {
            addCriterion("OFFSETNO <", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLessThanOrEqualTo(String value) {
            addCriterion("OFFSETNO <=", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoLike(String value) {
            addCriterion("OFFSETNO like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotLike(String value) {
            addCriterion("OFFSETNO not like", value, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoIn(List<String> values) {
            addCriterion("OFFSETNO in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotIn(List<String> values) {
            addCriterion("OFFSETNO not in", values, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoBetween(String value1, String value2) {
            addCriterion("OFFSETNO between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andOffsetnoNotBetween(String value1, String value2) {
            addCriterion("OFFSETNO not between", value1, value2, "offsetno");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIsNull() {
            addCriterion("CUSTOMERNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIsNotNull() {
            addCriterion("CUSTOMERNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN =", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN <>", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnGreaterThan(String value) {
            addCriterion("CUSTOMERNAMECN >", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN >=", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLessThan(String value) {
            addCriterion("CUSTOMERNAMECN <", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN <=", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLike(String value) {
            addCriterion("CUSTOMERNAMECN like", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotLike(String value) {
            addCriterion("CUSTOMERNAMECN not like", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIn(List<String> values) {
            addCriterion("CUSTOMERNAMECN in", values, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMECN not in", values, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMECN between", value1, value2, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMECN not between", value1, value2, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DUEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DUEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterion("DUEDATE =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterion("DUEDATE <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterion("DUEDATE >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DUEDATE >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterion("DUEDATE <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterion("DUEDATE <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterion("DUEDATE in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterion("DUEDATE not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterion("DUEDATE between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterion("DUEDATE not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyIsNull() {
            addCriterion("EXCHANGECURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyIsNotNull() {
            addCriterion("EXCHANGECURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyEqualTo(String value) {
            addCriterion("EXCHANGECURRENCY =", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyNotEqualTo(String value) {
            addCriterion("EXCHANGECURRENCY <>", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyGreaterThan(String value) {
            addCriterion("EXCHANGECURRENCY >", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCY >=", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyLessThan(String value) {
            addCriterion("EXCHANGECURRENCY <", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGECURRENCY <=", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyLike(String value) {
            addCriterion("EXCHANGECURRENCY like", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyNotLike(String value) {
            addCriterion("EXCHANGECURRENCY not like", value, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyIn(List<String> values) {
            addCriterion("EXCHANGECURRENCY in", values, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyNotIn(List<String> values) {
            addCriterion("EXCHANGECURRENCY not in", values, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCY between", value1, value2, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangecurrencyNotBetween(String value1, String value2) {
            addCriterion("EXCHANGECURRENCY not between", value1, value2, "exchangecurrency");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNull() {
            addCriterion("EXCHANGEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIsNotNull() {
            addCriterion("EXCHANGEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeamountEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT =", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <>", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT >=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThan(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEAMOUNT <=", value, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEAMOUNT not in", values, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andExchangeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEAMOUNT not between", value1, value2, "exchangeamount");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoIsNull() {
            addCriterion("ORIGINALBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoIsNotNull() {
            addCriterion("ORIGINALBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoEqualTo(String value) {
            addCriterion("ORIGINALBILLNO =", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoNotEqualTo(String value) {
            addCriterion("ORIGINALBILLNO <>", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoGreaterThan(String value) {
            addCriterion("ORIGINALBILLNO >", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINALBILLNO >=", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoLessThan(String value) {
            addCriterion("ORIGINALBILLNO <", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoLessThanOrEqualTo(String value) {
            addCriterion("ORIGINALBILLNO <=", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoLike(String value) {
            addCriterion("ORIGINALBILLNO like", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoNotLike(String value) {
            addCriterion("ORIGINALBILLNO not like", value, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoIn(List<String> values) {
            addCriterion("ORIGINALBILLNO in", values, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoNotIn(List<String> values) {
            addCriterion("ORIGINALBILLNO not in", values, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoBetween(String value1, String value2) {
            addCriterion("ORIGINALBILLNO between", value1, value2, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andOriginalbillnoNotBetween(String value1, String value2) {
            addCriterion("ORIGINALBILLNO not between", value1, value2, "originalbillno");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerIsNull() {
            addCriterion("INSURANCEBROKER is null");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerIsNotNull() {
            addCriterion("INSURANCEBROKER is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerEqualTo(String value) {
            addCriterion("INSURANCEBROKER =", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerNotEqualTo(String value) {
            addCriterion("INSURANCEBROKER <>", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerGreaterThan(String value) {
            addCriterion("INSURANCEBROKER >", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCEBROKER >=", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerLessThan(String value) {
            addCriterion("INSURANCEBROKER <", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerLessThanOrEqualTo(String value) {
            addCriterion("INSURANCEBROKER <=", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerLike(String value) {
            addCriterion("INSURANCEBROKER like", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerNotLike(String value) {
            addCriterion("INSURANCEBROKER not like", value, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerIn(List<String> values) {
            addCriterion("INSURANCEBROKER in", values, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerNotIn(List<String> values) {
            addCriterion("INSURANCEBROKER not in", values, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerBetween(String value1, String value2) {
            addCriterion("INSURANCEBROKER between", value1, value2, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokerNotBetween(String value1, String value2) {
            addCriterion("INSURANCEBROKER not between", value1, value2, "insurancebroker");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeIsNull() {
            addCriterion("INSURANCEBROKERCODE is null");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeIsNotNull() {
            addCriterion("INSURANCEBROKERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeEqualTo(String value) {
            addCriterion("INSURANCEBROKERCODE =", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeNotEqualTo(String value) {
            addCriterion("INSURANCEBROKERCODE <>", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeGreaterThan(String value) {
            addCriterion("INSURANCEBROKERCODE >", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCEBROKERCODE >=", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeLessThan(String value) {
            addCriterion("INSURANCEBROKERCODE <", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeLessThanOrEqualTo(String value) {
            addCriterion("INSURANCEBROKERCODE <=", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeLike(String value) {
            addCriterion("INSURANCEBROKERCODE like", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeNotLike(String value) {
            addCriterion("INSURANCEBROKERCODE not like", value, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeIn(List<String> values) {
            addCriterion("INSURANCEBROKERCODE in", values, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeNotIn(List<String> values) {
            addCriterion("INSURANCEBROKERCODE not in", values, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeBetween(String value1, String value2) {
            addCriterion("INSURANCEBROKERCODE between", value1, value2, "insurancebrokercode");
            return (Criteria) this;
        }

        public Criteria andInsurancebrokercodeNotBetween(String value1, String value2) {
            addCriterion("INSURANCEBROKERCODE not between", value1, value2, "insurancebrokercode");
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

        public Criteria andProtocolflagIsNull() {
            addCriterion("PROTOCOLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIsNotNull() {
            addCriterion("PROTOCOLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolflagEqualTo(String value) {
            addCriterion("PROTOCOLFLAG =", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <>", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThan(String value) {
            addCriterion("PROTOCOLFLAG >", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG >=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThan(String value) {
            addCriterion("PROTOCOLFLAG <", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOLFLAG <=", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagLike(String value) {
            addCriterion("PROTOCOLFLAG like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotLike(String value) {
            addCriterion("PROTOCOLFLAG not like", value, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagIn(List<String> values) {
            addCriterion("PROTOCOLFLAG in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotIn(List<String> values) {
            addCriterion("PROTOCOLFLAG not in", values, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andProtocolflagNotBetween(String value1, String value2) {
            addCriterion("PROTOCOLFLAG not between", value1, value2, "protocolflag");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNull() {
            addCriterion("INSTALLMENTSTIMES is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIsNotNull() {
            addCriterion("INSTALLMENTSTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES =", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <>", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThan(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES >", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES >=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThan(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALLMENTSTIMES <=", value, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesIn(List<BigDecimal> values) {
            addCriterion("INSTALLMENTSTIMES in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotIn(List<BigDecimal> values) {
            addCriterion("INSTALLMENTSTIMES not in", values, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALLMENTSTIMES between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentstimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALLMENTSTIMES not between", value1, value2, "installmentstimes");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoIsNull() {
            addCriterion("SEQNEWNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoIsNotNull() {
            addCriterion("SEQNEWNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoEqualTo(Long value) {
            addCriterion("SEQNEWNO =", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoNotEqualTo(Long value) {
            addCriterion("SEQNEWNO <>", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoGreaterThan(Long value) {
            addCriterion("SEQNEWNO >", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQNEWNO >=", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoLessThan(Long value) {
            addCriterion("SEQNEWNO <", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoLessThanOrEqualTo(Long value) {
            addCriterion("SEQNEWNO <=", value, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoIn(List<Long> values) {
            addCriterion("SEQNEWNO in", values, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoNotIn(List<Long> values) {
            addCriterion("SEQNEWNO not in", values, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoBetween(Long value1, Long value2) {
            addCriterion("SEQNEWNO between", value1, value2, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andSeqnewnoNotBetween(Long value1, Long value2) {
            addCriterion("SEQNEWNO not between", value1, value2, "seqnewno");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIsNull() {
            addCriterion("INPAYMENTDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIsNotNull() {
            addCriterion("INPAYMENTDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT =", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <>", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT >", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT >=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThan(String value) {
            addCriterion("INPAYMENTDEPARTMENT <", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTDEPARTMENT <=", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotLike(String value) {
            addCriterion("INPAYMENTDEPARTMENT not like", value, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotIn(List<String> values) {
            addCriterion("INPAYMENTDEPARTMENT not in", values, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT between", value1, value2, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andInpaymentdepartmentNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTDEPARTMENT not between", value1, value2, "inpaymentdepartment");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNull() {
            addCriterion("FARPOLICYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNotNull() {
            addCriterion("FARPOLICYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeEqualTo(String value) {
            addCriterion("FARPOLICYTYPE =", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <>", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThan(String value) {
            addCriterion("FARPOLICYTYPE >", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE >=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThan(String value) {
            addCriterion("FARPOLICYTYPE <", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLike(String value) {
            addCriterion("FARPOLICYTYPE like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotLike(String value) {
            addCriterion("FARPOLICYTYPE not like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIn(List<String> values) {
            addCriterion("FARPOLICYTYPE in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotIn(List<String> values) {
            addCriterion("FARPOLICYTYPE not in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE not between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNull() {
            addCriterion("FARMFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNotNull() {
            addCriterion("FARMFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagEqualTo(String value) {
            addCriterion("FARMFLAG =", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotEqualTo(String value) {
            addCriterion("FARMFLAG <>", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThan(String value) {
            addCriterion("FARMFLAG >", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAG >=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThan(String value) {
            addCriterion("FARMFLAG <", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAG <=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLike(String value) {
            addCriterion("FARMFLAG like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotLike(String value) {
            addCriterion("FARMFLAG not like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagIn(List<String> values) {
            addCriterion("FARMFLAG in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotIn(List<String> values) {
            addCriterion("FARMFLAG not in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagBetween(String value1, String value2) {
            addCriterion("FARMFLAG between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotBetween(String value1, String value2) {
            addCriterion("FARMFLAG not between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNull() {
            addCriterion("FARMFLAGCODE is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNotNull() {
            addCriterion("FARMFLAGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeEqualTo(String value) {
            addCriterion("FARMFLAGCODE =", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotEqualTo(String value) {
            addCriterion("FARMFLAGCODE <>", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThan(String value) {
            addCriterion("FARMFLAGCODE >", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE >=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThan(String value) {
            addCriterion("FARMFLAGCODE <", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE <=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLike(String value) {
            addCriterion("FARMFLAGCODE like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotLike(String value) {
            addCriterion("FARMFLAGCODE not like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIn(List<String> values) {
            addCriterion("FARMFLAGCODE in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotIn(List<String> values) {
            addCriterion("FARMFLAGCODE not in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE not between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNull() {
            addCriterion("ISSPLITTED is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("ISSPLITTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("ISSPLITTED like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("ISSPLITTED not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("USEPORPERTY like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("USEPORPERTY not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNull() {
            addCriterion("PERIODFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIsNotNull() {
            addCriterion("PERIODFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodflagEqualTo(String value) {
            addCriterion("PERIODFLAG =", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotEqualTo(String value) {
            addCriterion("PERIODFLAG <>", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThan(String value) {
            addCriterion("PERIODFLAG >", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagGreaterThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG >=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThan(String value) {
            addCriterion("PERIODFLAG <", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLessThanOrEqualTo(String value) {
            addCriterion("PERIODFLAG <=", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagLike(String value) {
            addCriterion("PERIODFLAG like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotLike(String value) {
            addCriterion("PERIODFLAG not like", value, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagIn(List<String> values) {
            addCriterion("PERIODFLAG in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotIn(List<String> values) {
            addCriterion("PERIODFLAG not in", values, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagBetween(String value1, String value2) {
            addCriterion("PERIODFLAG between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andPeriodflagNotBetween(String value1, String value2) {
            addCriterion("PERIODFLAG not between", value1, value2, "periodflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNull() {
            addCriterion("GROUPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNotNull() {
            addCriterion("GROUPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGroupflagEqualTo(String value) {
            addCriterion("GROUPFLAG =", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotEqualTo(String value) {
            addCriterion("GROUPFLAG <>", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThan(String value) {
            addCriterion("GROUPFLAG >", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG >=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThan(String value) {
            addCriterion("GROUPFLAG <", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThanOrEqualTo(String value) {
            addCriterion("GROUPFLAG <=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLike(String value) {
            addCriterion("GROUPFLAG like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotLike(String value) {
            addCriterion("GROUPFLAG not like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIn(List<String> values) {
            addCriterion("GROUPFLAG in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotIn(List<String> values) {
            addCriterion("GROUPFLAG not in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagBetween(String value1, String value2) {
            addCriterion("GROUPFLAG between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotBetween(String value1, String value2) {
            addCriterion("GROUPFLAG not between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNull() {
            addCriterion("PREMIUMSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNotNull() {
            addCriterion("PREMIUMSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceEqualTo(String value) {
            addCriterion("PREMIUMSOURCE =", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <>", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThan(String value) {
            addCriterion("PREMIUMSOURCE >", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE >=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThan(String value) {
            addCriterion("PREMIUMSOURCE <", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThanOrEqualTo(String value) {
            addCriterion("PREMIUMSOURCE <=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLike(String value) {
            addCriterion("PREMIUMSOURCE like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotLike(String value) {
            addCriterion("PREMIUMSOURCE not like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIn(List<String> values) {
            addCriterion("PREMIUMSOURCE in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotIn(List<String> values) {
            addCriterion("PREMIUMSOURCE not in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotBetween(String value1, String value2) {
            addCriterion("PREMIUMSOURCE not between", value1, value2, "premiumsource");
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

        public Criteria andInvoiceunitIsNull() {
            addCriterion("INVOICEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitIsNotNull() {
            addCriterion("INVOICEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitEqualTo(String value) {
            addCriterion("INVOICEUNIT =", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitNotEqualTo(String value) {
            addCriterion("INVOICEUNIT <>", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitGreaterThan(String value) {
            addCriterion("INVOICEUNIT >", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEUNIT >=", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitLessThan(String value) {
            addCriterion("INVOICEUNIT <", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitLessThanOrEqualTo(String value) {
            addCriterion("INVOICEUNIT <=", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitLike(String value) {
            addCriterion("INVOICEUNIT like", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitNotLike(String value) {
            addCriterion("INVOICEUNIT not like", value, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitIn(List<String> values) {
            addCriterion("INVOICEUNIT in", values, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitNotIn(List<String> values) {
            addCriterion("INVOICEUNIT not in", values, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitBetween(String value1, String value2) {
            addCriterion("INVOICEUNIT between", value1, value2, "invoiceunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceunitNotBetween(String value1, String value2) {
            addCriterion("INVOICEUNIT not between", value1, value2, "invoiceunit");
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

        public Criteria andMarineflagIsNull() {
            addCriterion("MARINEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andMarineflagIsNotNull() {
            addCriterion("MARINEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMarineflagEqualTo(String value) {
            addCriterion("MARINEFLAG =", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotEqualTo(String value) {
            addCriterion("MARINEFLAG <>", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagGreaterThan(String value) {
            addCriterion("MARINEFLAG >", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagGreaterThanOrEqualTo(String value) {
            addCriterion("MARINEFLAG >=", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLessThan(String value) {
            addCriterion("MARINEFLAG <", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLessThanOrEqualTo(String value) {
            addCriterion("MARINEFLAG <=", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagLike(String value) {
            addCriterion("MARINEFLAG like", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotLike(String value) {
            addCriterion("MARINEFLAG not like", value, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagIn(List<String> values) {
            addCriterion("MARINEFLAG in", values, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotIn(List<String> values) {
            addCriterion("MARINEFLAG not in", values, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagBetween(String value1, String value2) {
            addCriterion("MARINEFLAG between", value1, value2, "marineflag");
            return (Criteria) this;
        }

        public Criteria andMarineflagNotBetween(String value1, String value2) {
            addCriterion("MARINEFLAG not between", value1, value2, "marineflag");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIsNull() {
            addCriterion("CLASSESCODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIsNotNull() {
            addCriterion("CLASSESCODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodedescEqualTo(String value) {
            addCriterion("CLASSESCODEDESC =", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotEqualTo(String value) {
            addCriterion("CLASSESCODEDESC <>", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescGreaterThan(String value) {
            addCriterion("CLASSESCODEDESC >", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODEDESC >=", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLessThan(String value) {
            addCriterion("CLASSESCODEDESC <", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODEDESC <=", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescLike(String value) {
            addCriterion("CLASSESCODEDESC like", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotLike(String value) {
            addCriterion("CLASSESCODEDESC not like", value, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescIn(List<String> values) {
            addCriterion("CLASSESCODEDESC in", values, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotIn(List<String> values) {
            addCriterion("CLASSESCODEDESC not in", values, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescBetween(String value1, String value2) {
            addCriterion("CLASSESCODEDESC between", value1, value2, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andClassescodedescNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODEDESC not between", value1, value2, "classescodedesc");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNull() {
            addCriterion("BUSINESSSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNotNull() {
            addCriterion("BUSINESSSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceEqualTo(String value) {
            addCriterion("BUSINESSSOURCE =", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <>", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThan(String value) {
            addCriterion("BUSINESSSOURCE >", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE >=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThan(String value) {
            addCriterion("BUSINESSSOURCE <", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSSOURCE <=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLike(String value) {
            addCriterion("BUSINESSSOURCE like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotLike(String value) {
            addCriterion("BUSINESSSOURCE not like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIn(List<String> values) {
            addCriterion("BUSINESSSOURCE in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotIn(List<String> values) {
            addCriterion("BUSINESSSOURCE not in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotBetween(String value1, String value2) {
            addCriterion("BUSINESSSOURCE not between", value1, value2, "businesssource");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reinsurance_ti
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
     * @Table : mm_reinsurance_ti
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