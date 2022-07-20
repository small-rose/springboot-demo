package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmMatchSourceTdErrExample {
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
    public MmMatchSourceTdErrExample() {
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
     * @Table : mm_match_source_td_err
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

        public Criteria andBatchidEqualTo(BigDecimal value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(BigDecimal value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(BigDecimal value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(BigDecimal value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<BigDecimal> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<BigDecimal> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
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

        public Criteria andSourcesettlementtypeIsNull() {
            addCriterion("SOURCESETTLEMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeIsNotNull() {
            addCriterion("SOURCESETTLEMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeEqualTo(String value) {
            addCriterion("SOURCESETTLEMENTTYPE =", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeNotEqualTo(String value) {
            addCriterion("SOURCESETTLEMENTTYPE <>", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeGreaterThan(String value) {
            addCriterion("SOURCESETTLEMENTTYPE >", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCESETTLEMENTTYPE >=", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeLessThan(String value) {
            addCriterion("SOURCESETTLEMENTTYPE <", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCESETTLEMENTTYPE <=", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeLike(String value) {
            addCriterion("SOURCESETTLEMENTTYPE like", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeNotLike(String value) {
            addCriterion("SOURCESETTLEMENTTYPE not like", value, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeIn(List<String> values) {
            addCriterion("SOURCESETTLEMENTTYPE in", values, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeNotIn(List<String> values) {
            addCriterion("SOURCESETTLEMENTTYPE not in", values, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeBetween(String value1, String value2) {
            addCriterion("SOURCESETTLEMENTTYPE between", value1, value2, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcesettlementtypeNotBetween(String value1, String value2) {
            addCriterion("SOURCESETTLEMENTTYPE not between", value1, value2, "sourcesettlementtype");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNull() {
            addCriterion("SOURCENO is null");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNotNull() {
            addCriterion("SOURCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenoEqualTo(BigDecimal value) {
            addCriterion("SOURCENO =", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <>", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThan(BigDecimal value) {
            addCriterion("SOURCENO >", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO >=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThan(BigDecimal value) {
            addCriterion("SOURCENO <", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCENO <=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIn(List<BigDecimal> values) {
            addCriterion("SOURCENO in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotIn(List<BigDecimal> values) {
            addCriterion("SOURCENO not in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCENO not between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeIsNull() {
            addCriterion("SOURCEDATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeIsNotNull() {
            addCriterion("SOURCEDATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeEqualTo(String value) {
            addCriterion("SOURCEDATATYPE =", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeNotEqualTo(String value) {
            addCriterion("SOURCEDATATYPE <>", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeGreaterThan(String value) {
            addCriterion("SOURCEDATATYPE >", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEDATATYPE >=", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeLessThan(String value) {
            addCriterion("SOURCEDATATYPE <", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCEDATATYPE <=", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeLike(String value) {
            addCriterion("SOURCEDATATYPE like", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeNotLike(String value) {
            addCriterion("SOURCEDATATYPE not like", value, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeIn(List<String> values) {
            addCriterion("SOURCEDATATYPE in", values, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeNotIn(List<String> values) {
            addCriterion("SOURCEDATATYPE not in", values, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeBetween(String value1, String value2) {
            addCriterion("SOURCEDATATYPE between", value1, value2, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcedatatypeNotBetween(String value1, String value2) {
            addCriterion("SOURCEDATATYPE not between", value1, value2, "sourcedatatype");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeIsNull() {
            addCriterion("SOURCECURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeIsNotNull() {
            addCriterion("SOURCECURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeEqualTo(String value) {
            addCriterion("SOURCECURRENCYCODE =", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeNotEqualTo(String value) {
            addCriterion("SOURCECURRENCYCODE <>", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeGreaterThan(String value) {
            addCriterion("SOURCECURRENCYCODE >", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCECURRENCYCODE >=", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeLessThan(String value) {
            addCriterion("SOURCECURRENCYCODE <", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("SOURCECURRENCYCODE <=", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeLike(String value) {
            addCriterion("SOURCECURRENCYCODE like", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeNotLike(String value) {
            addCriterion("SOURCECURRENCYCODE not like", value, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeIn(List<String> values) {
            addCriterion("SOURCECURRENCYCODE in", values, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeNotIn(List<String> values) {
            addCriterion("SOURCECURRENCYCODE not in", values, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeBetween(String value1, String value2) {
            addCriterion("SOURCECURRENCYCODE between", value1, value2, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("SOURCECURRENCYCODE not between", value1, value2, "sourcecurrencycode");
            return (Criteria) this;
        }

        public Criteria andSourceamountIsNull() {
            addCriterion("SOURCEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSourceamountIsNotNull() {
            addCriterion("SOURCEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSourceamountEqualTo(BigDecimal value) {
            addCriterion("SOURCEAMOUNT =", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountNotEqualTo(BigDecimal value) {
            addCriterion("SOURCEAMOUNT <>", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountGreaterThan(BigDecimal value) {
            addCriterion("SOURCEAMOUNT >", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCEAMOUNT >=", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountLessThan(BigDecimal value) {
            addCriterion("SOURCEAMOUNT <", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCEAMOUNT <=", value, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountIn(List<BigDecimal> values) {
            addCriterion("SOURCEAMOUNT in", values, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountNotIn(List<BigDecimal> values) {
            addCriterion("SOURCEAMOUNT not in", values, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCEAMOUNT between", value1, value2, "sourceamount");
            return (Criteria) this;
        }

        public Criteria andSourceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCEAMOUNT not between", value1, value2, "sourceamount");
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

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNull() {
            addCriterion("CUSTOMERPARTYNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIsNotNull() {
            addCriterion("CUSTOMERPARTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO =", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <>", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThan(String value) {
            addCriterion("CUSTOMERPARTYNO >", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO >=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThan(String value) {
            addCriterion("CUSTOMERPARTYNO <", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPARTYNO <=", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoLike(String value) {
            addCriterion("CUSTOMERPARTYNO like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotLike(String value) {
            addCriterion("CUSTOMERPARTYNO not like", value, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotIn(List<String> values) {
            addCriterion("CUSTOMERPARTYNO not in", values, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustomerpartynoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPARTYNO not between", value1, value2, "customerpartyno");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNull() {
            addCriterion("CUSTISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIsNotNull() {
            addCriterion("CUSTISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustisjapanEqualTo(String value) {
            addCriterion("CUSTISJAPAN =", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotEqualTo(String value) {
            addCriterion("CUSTISJAPAN <>", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThan(String value) {
            addCriterion("CUSTISJAPAN >", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN >=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThan(String value) {
            addCriterion("CUSTISJAPAN <", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLessThanOrEqualTo(String value) {
            addCriterion("CUSTISJAPAN <=", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanLike(String value) {
            addCriterion("CUSTISJAPAN like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotLike(String value) {
            addCriterion("CUSTISJAPAN not like", value, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanIn(List<String> values) {
            addCriterion("CUSTISJAPAN in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotIn(List<String> values) {
            addCriterion("CUSTISJAPAN not in", values, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN between", value1, value2, "custisjapan");
            return (Criteria) this;
        }

        public Criteria andCustisjapanNotBetween(String value1, String value2) {
            addCriterion("CUSTISJAPAN not between", value1, value2, "custisjapan");
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

        public Criteria andMmaccountidEqualTo(Long value) {
            addCriterion("MMACCOUNTID =", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotEqualTo(Long value) {
            addCriterion("MMACCOUNTID <>", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThan(Long value) {
            addCriterion("MMACCOUNTID >", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("MMACCOUNTID >=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThan(Long value) {
            addCriterion("MMACCOUNTID <", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidLessThanOrEqualTo(Long value) {
            addCriterion("MMACCOUNTID <=", value, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidIn(List<Long> values) {
            addCriterion("MMACCOUNTID in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotIn(List<Long> values) {
            addCriterion("MMACCOUNTID not in", values, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidBetween(Long value1, Long value2) {
            addCriterion("MMACCOUNTID between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andMmaccountidNotBetween(Long value1, Long value2) {
            addCriterion("MMACCOUNTID not between", value1, value2, "mmaccountid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNull() {
            addCriterion("PLATFORMID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("PLATFORMID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(String value) {
            addCriterion("PLATFORMID =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(String value) {
            addCriterion("PLATFORMID <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(String value) {
            addCriterion("PLATFORMID >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMID >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(String value) {
            addCriterion("PLATFORMID <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMID <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLike(String value) {
            addCriterion("PLATFORMID like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotLike(String value) {
            addCriterion("PLATFORMID not like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<String> values) {
            addCriterion("PLATFORMID in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<String> values) {
            addCriterion("PLATFORMID not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(String value1, String value2) {
            addCriterion("PLATFORMID between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(String value1, String value2) {
            addCriterion("PLATFORMID not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNull() {
            addCriterion("INPAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIsNotNull() {
            addCriterion("INPAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD =", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <>", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThan(String value) {
            addCriterion("INPAYMENTMETHOD >", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD >=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThan(String value) {
            addCriterion("INPAYMENTMETHOD <", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTMETHOD <=", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodLike(String value) {
            addCriterion("INPAYMENTMETHOD like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotLike(String value) {
            addCriterion("INPAYMENTMETHOD not like", value, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotIn(List<String> values) {
            addCriterion("INPAYMENTMETHOD not in", values, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD between", value1, value2, "inpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andInpaymentmethodNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTMETHOD not between", value1, value2, "inpaymentmethod");
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

        public Criteria andFastflagIsNull() {
            addCriterion("FASTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFastflagIsNotNull() {
            addCriterion("FASTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFastflagEqualTo(String value) {
            addCriterion("FASTFLAG =", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotEqualTo(String value) {
            addCriterion("FASTFLAG <>", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThan(String value) {
            addCriterion("FASTFLAG >", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagGreaterThanOrEqualTo(String value) {
            addCriterion("FASTFLAG >=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThan(String value) {
            addCriterion("FASTFLAG <", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLessThanOrEqualTo(String value) {
            addCriterion("FASTFLAG <=", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagLike(String value) {
            addCriterion("FASTFLAG like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotLike(String value) {
            addCriterion("FASTFLAG not like", value, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagIn(List<String> values) {
            addCriterion("FASTFLAG in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotIn(List<String> values) {
            addCriterion("FASTFLAG not in", values, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagBetween(String value1, String value2) {
            addCriterion("FASTFLAG between", value1, value2, "fastflag");
            return (Criteria) this;
        }

        public Criteria andFastflagNotBetween(String value1, String value2) {
            addCriterion("FASTFLAG not between", value1, value2, "fastflag");
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

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
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

        public Criteria andRemittercodeIsNull() {
            addCriterion("REMITTERCODE is null");
            return (Criteria) this;
        }

        public Criteria andRemittercodeIsNotNull() {
            addCriterion("REMITTERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRemittercodeEqualTo(String value) {
            addCriterion("REMITTERCODE =", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeNotEqualTo(String value) {
            addCriterion("REMITTERCODE <>", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeGreaterThan(String value) {
            addCriterion("REMITTERCODE >", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REMITTERCODE >=", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeLessThan(String value) {
            addCriterion("REMITTERCODE <", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeLessThanOrEqualTo(String value) {
            addCriterion("REMITTERCODE <=", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeLike(String value) {
            addCriterion("REMITTERCODE like", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeNotLike(String value) {
            addCriterion("REMITTERCODE not like", value, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeIn(List<String> values) {
            addCriterion("REMITTERCODE in", values, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeNotIn(List<String> values) {
            addCriterion("REMITTERCODE not in", values, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeBetween(String value1, String value2) {
            addCriterion("REMITTERCODE between", value1, value2, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemittercodeNotBetween(String value1, String value2) {
            addCriterion("REMITTERCODE not between", value1, value2, "remittercode");
            return (Criteria) this;
        }

        public Criteria andRemitternameIsNull() {
            addCriterion("REMITTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andRemitternameIsNotNull() {
            addCriterion("REMITTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRemitternameEqualTo(String value) {
            addCriterion("REMITTERNAME =", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotEqualTo(String value) {
            addCriterion("REMITTERNAME <>", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameGreaterThan(String value) {
            addCriterion("REMITTERNAME >", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameGreaterThanOrEqualTo(String value) {
            addCriterion("REMITTERNAME >=", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLessThan(String value) {
            addCriterion("REMITTERNAME <", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLessThanOrEqualTo(String value) {
            addCriterion("REMITTERNAME <=", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameLike(String value) {
            addCriterion("REMITTERNAME like", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotLike(String value) {
            addCriterion("REMITTERNAME not like", value, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameIn(List<String> values) {
            addCriterion("REMITTERNAME in", values, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotIn(List<String> values) {
            addCriterion("REMITTERNAME not in", values, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameBetween(String value1, String value2) {
            addCriterion("REMITTERNAME between", value1, value2, "remittername");
            return (Criteria) this;
        }

        public Criteria andRemitternameNotBetween(String value1, String value2) {
            addCriterion("REMITTERNAME not between", value1, value2, "remittername");
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

        public Criteria andConfirmsequencenoIsNull() {
            addCriterion("CONFIRMSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIsNotNull() {
            addCriterion("CONFIRMSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO =", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <>", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThan(String value) {
            addCriterion("CONFIRMSEQUENCENO >", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO >=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThan(String value) {
            addCriterion("CONFIRMSEQUENCENO <", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMSEQUENCENO <=", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoLike(String value) {
            addCriterion("CONFIRMSEQUENCENO like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotLike(String value) {
            addCriterion("CONFIRMSEQUENCENO not like", value, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotIn(List<String> values) {
            addCriterion("CONFIRMSEQUENCENO not in", values, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO between", value1, value2, "confirmsequenceno");
            return (Criteria) this;
        }

        public Criteria andConfirmsequencenoNotBetween(String value1, String value2) {
            addCriterion("CONFIRMSEQUENCENO not between", value1, value2, "confirmsequenceno");
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

        public Criteria andInvoicedunitIsNull() {
            addCriterion("INVOICEDUNIT is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitIsNotNull() {
            addCriterion("INVOICEDUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitEqualTo(String value) {
            addCriterion("INVOICEDUNIT =", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotEqualTo(String value) {
            addCriterion("INVOICEDUNIT <>", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitGreaterThan(String value) {
            addCriterion("INVOICEDUNIT >", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEDUNIT >=", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLessThan(String value) {
            addCriterion("INVOICEDUNIT <", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLessThanOrEqualTo(String value) {
            addCriterion("INVOICEDUNIT <=", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitLike(String value) {
            addCriterion("INVOICEDUNIT like", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotLike(String value) {
            addCriterion("INVOICEDUNIT not like", value, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitIn(List<String> values) {
            addCriterion("INVOICEDUNIT in", values, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotIn(List<String> values) {
            addCriterion("INVOICEDUNIT not in", values, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitBetween(String value1, String value2) {
            addCriterion("INVOICEDUNIT between", value1, value2, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoicedunitNotBetween(String value1, String value2) {
            addCriterion("INVOICEDUNIT not between", value1, value2, "invoicedunit");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNull() {
            addCriterion("INVOICEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNotNull() {
            addCriterion("INVOICEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT =", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <>", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT not in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT not between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIsNull() {
            addCriterion("EBANKINGSEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIsNotNull() {
            addCriterion("EBANKINGSEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO =", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <>", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThan(String value) {
            addCriterion("EBANKINGSEQUENCENO >", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO >=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThan(String value) {
            addCriterion("EBANKINGSEQUENCENO <", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLessThanOrEqualTo(String value) {
            addCriterion("EBANKINGSEQUENCENO <=", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoLike(String value) {
            addCriterion("EBANKINGSEQUENCENO like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotLike(String value) {
            addCriterion("EBANKINGSEQUENCENO not like", value, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotIn(List<String> values) {
            addCriterion("EBANKINGSEQUENCENO not in", values, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO between", value1, value2, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andEbankingsequencenoNotBetween(String value1, String value2) {
            addCriterion("EBANKINGSEQUENCENO not between", value1, value2, "ebankingsequenceno");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNull() {
            addCriterion("RECEIVEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNotNull() {
            addCriterion("RECEIVEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitEqualTo(String value) {
            addCriterion("RECEIVEUNIT =", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotEqualTo(String value) {
            addCriterion("RECEIVEUNIT <>", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThan(String value) {
            addCriterion("RECEIVEUNIT >", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEUNIT >=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThan(String value) {
            addCriterion("RECEIVEUNIT <", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEUNIT <=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLike(String value) {
            addCriterion("RECEIVEUNIT like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotLike(String value) {
            addCriterion("RECEIVEUNIT not like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIn(List<String> values) {
            addCriterion("RECEIVEUNIT in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotIn(List<String> values) {
            addCriterion("RECEIVEUNIT not in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitBetween(String value1, String value2) {
            addCriterion("RECEIVEUNIT between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotBetween(String value1, String value2) {
            addCriterion("RECEIVEUNIT not between", value1, value2, "receiveunit");
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

        public Criteria andIfuploadIsNull() {
            addCriterion("IFUPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIfuploadIsNotNull() {
            addCriterion("IFUPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIfuploadEqualTo(String value) {
            addCriterion("IFUPLOAD =", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotEqualTo(String value) {
            addCriterion("IFUPLOAD <>", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThan(String value) {
            addCriterion("IFUPLOAD >", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadGreaterThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD >=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThan(String value) {
            addCriterion("IFUPLOAD <", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLessThanOrEqualTo(String value) {
            addCriterion("IFUPLOAD <=", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadLike(String value) {
            addCriterion("IFUPLOAD like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotLike(String value) {
            addCriterion("IFUPLOAD not like", value, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadIn(List<String> values) {
            addCriterion("IFUPLOAD in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotIn(List<String> values) {
            addCriterion("IFUPLOAD not in", values, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadBetween(String value1, String value2) {
            addCriterion("IFUPLOAD between", value1, value2, "ifupload");
            return (Criteria) this;
        }

        public Criteria andIfuploadNotBetween(String value1, String value2) {
            addCriterion("IFUPLOAD not between", value1, value2, "ifupload");
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

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
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

        public Criteria andReceiptnoIsNull() {
            addCriterion("RECEIPTNO is null");
            return (Criteria) this;
        }

        public Criteria andReceiptnoIsNotNull() {
            addCriterion("RECEIPTNO is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptnoEqualTo(String value) {
            addCriterion("RECEIPTNO =", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoNotEqualTo(String value) {
            addCriterion("RECEIPTNO <>", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoGreaterThan(String value) {
            addCriterion("RECEIPTNO >", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPTNO >=", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoLessThan(String value) {
            addCriterion("RECEIPTNO <", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoLessThanOrEqualTo(String value) {
            addCriterion("RECEIPTNO <=", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoLike(String value) {
            addCriterion("RECEIPTNO like", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoNotLike(String value) {
            addCriterion("RECEIPTNO not like", value, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoIn(List<String> values) {
            addCriterion("RECEIPTNO in", values, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoNotIn(List<String> values) {
            addCriterion("RECEIPTNO not in", values, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoBetween(String value1, String value2) {
            addCriterion("RECEIPTNO between", value1, value2, "receiptno");
            return (Criteria) this;
        }

        public Criteria andReceiptnoNotBetween(String value1, String value2) {
            addCriterion("RECEIPTNO not between", value1, value2, "receiptno");
            return (Criteria) this;
        }

        public Criteria andDatamarkIsNull() {
            addCriterion("DATAMARK is null");
            return (Criteria) this;
        }

        public Criteria andDatamarkIsNotNull() {
            addCriterion("DATAMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDatamarkEqualTo(String value) {
            addCriterion("DATAMARK =", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkNotEqualTo(String value) {
            addCriterion("DATAMARK <>", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkGreaterThan(String value) {
            addCriterion("DATAMARK >", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkGreaterThanOrEqualTo(String value) {
            addCriterion("DATAMARK >=", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkLessThan(String value) {
            addCriterion("DATAMARK <", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkLessThanOrEqualTo(String value) {
            addCriterion("DATAMARK <=", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkLike(String value) {
            addCriterion("DATAMARK like", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkNotLike(String value) {
            addCriterion("DATAMARK not like", value, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkIn(List<String> values) {
            addCriterion("DATAMARK in", values, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkNotIn(List<String> values) {
            addCriterion("DATAMARK not in", values, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkBetween(String value1, String value2) {
            addCriterion("DATAMARK between", value1, value2, "datamark");
            return (Criteria) this;
        }

        public Criteria andDatamarkNotBetween(String value1, String value2) {
            addCriterion("DATAMARK not between", value1, value2, "datamark");
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

        public Criteria andPlatformdetailidIsNull() {
            addCriterion("PLATFORMDETAILID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidIsNotNull() {
            addCriterion("PLATFORMDETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidEqualTo(BigDecimal value) {
            addCriterion("PLATFORMDETAILID =", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotEqualTo(BigDecimal value) {
            addCriterion("PLATFORMDETAILID <>", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidGreaterThan(BigDecimal value) {
            addCriterion("PLATFORMDETAILID >", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLATFORMDETAILID >=", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidLessThan(BigDecimal value) {
            addCriterion("PLATFORMDETAILID <", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLATFORMDETAILID <=", value, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidIn(List<BigDecimal> values) {
            addCriterion("PLATFORMDETAILID in", values, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotIn(List<BigDecimal> values) {
            addCriterion("PLATFORMDETAILID not in", values, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLATFORMDETAILID between", value1, value2, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andPlatformdetailidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLATFORMDETAILID not between", value1, value2, "platformdetailid");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIsNull() {
            addCriterion("INPAYMENTNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIsNotNull() {
            addCriterion("INPAYMENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoEqualTo(String value) {
            addCriterion("INPAYMENTNO =", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotEqualTo(String value) {
            addCriterion("INPAYMENTNO <>", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThan(String value) {
            addCriterion("INPAYMENTNO >", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO >=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThan(String value) {
            addCriterion("INPAYMENTNO <", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTNO <=", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoLike(String value) {
            addCriterion("INPAYMENTNO like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotLike(String value) {
            addCriterion("INPAYMENTNO not like", value, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoIn(List<String> values) {
            addCriterion("INPAYMENTNO in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotIn(List<String> values) {
            addCriterion("INPAYMENTNO not in", values, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO between", value1, value2, "inpaymentno");
            return (Criteria) this;
        }

        public Criteria andInpaymentnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTNO not between", value1, value2, "inpaymentno");
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

        public Criteria andCreatetypeIsNull() {
            addCriterion("CREATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("CREATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(String value) {
            addCriterion("CREATETYPE =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(String value) {
            addCriterion("CREATETYPE <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(String value) {
            addCriterion("CREATETYPE >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETYPE >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(String value) {
            addCriterion("CREATETYPE <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(String value) {
            addCriterion("CREATETYPE <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLike(String value) {
            addCriterion("CREATETYPE like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotLike(String value) {
            addCriterion("CREATETYPE not like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<String> values) {
            addCriterion("CREATETYPE in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<String> values) {
            addCriterion("CREATETYPE not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(String value1, String value2) {
            addCriterion("CREATETYPE between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(String value1, String value2) {
            addCriterion("CREATETYPE not between", value1, value2, "createtype");
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

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
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

        public Criteria andAccountrateIsNull() {
            addCriterion("ACCOUNTRATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountrateIsNotNull() {
            addCriterion("ACCOUNTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountrateEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE =", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE <>", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTRATE >", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE >=", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateLessThan(BigDecimal value) {
            addCriterion("ACCOUNTRATE <", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTRATE <=", value, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTRATE in", values, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTRATE not in", values, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTRATE between", value1, value2, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTRATE not between", value1, value2, "accountrate");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNull() {
            addCriterion("ACCOUNTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("ACCOUNTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTAMOUNT <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTAMOUNT not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTAMOUNT not between", value1, value2, "accountamount");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_match_source_td_err
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
     * @Table : mm_match_source_td_err
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