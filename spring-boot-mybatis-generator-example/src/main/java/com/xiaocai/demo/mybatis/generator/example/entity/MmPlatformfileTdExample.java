package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPlatformfileTdExample {
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
    public MmPlatformfileTdExample() {
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
     * @Table : mm_platformfile_td
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andDetailcountIsNull() {
            addCriterion("DETAILCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDetailcountIsNotNull() {
            addCriterion("DETAILCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDetailcountEqualTo(BigDecimal value) {
            addCriterion("DETAILCOUNT =", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountNotEqualTo(BigDecimal value) {
            addCriterion("DETAILCOUNT <>", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountGreaterThan(BigDecimal value) {
            addCriterion("DETAILCOUNT >", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DETAILCOUNT >=", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountLessThan(BigDecimal value) {
            addCriterion("DETAILCOUNT <", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DETAILCOUNT <=", value, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountIn(List<BigDecimal> values) {
            addCriterion("DETAILCOUNT in", values, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountNotIn(List<BigDecimal> values) {
            addCriterion("DETAILCOUNT not in", values, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DETAILCOUNT between", value1, value2, "detailcount");
            return (Criteria) this;
        }

        public Criteria andDetailcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DETAILCOUNT not between", value1, value2, "detailcount");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNull() {
            addCriterion("SUMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNotNull() {
            addCriterion("SUMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumamountEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT =", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <>", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThan(BigDecimal value) {
            addCriterion("SUMAMOUNT >", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT >=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThan(BigDecimal value) {
            addCriterion("SUMAMOUNT <", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT not in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT between", value1, value2, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT not between", value1, value2, "sumamount");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
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

        public Criteria andOutputdateIsNull() {
            addCriterion("OUTPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andOutputdateIsNotNull() {
            addCriterion("OUTPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutputdateEqualTo(String value) {
            addCriterion("OUTPUTDATE =", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotEqualTo(String value) {
            addCriterion("OUTPUTDATE <>", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateGreaterThan(String value) {
            addCriterion("OUTPUTDATE >", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPUTDATE >=", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateLessThan(String value) {
            addCriterion("OUTPUTDATE <", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateLessThanOrEqualTo(String value) {
            addCriterion("OUTPUTDATE <=", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateLike(String value) {
            addCriterion("OUTPUTDATE like", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotLike(String value) {
            addCriterion("OUTPUTDATE not like", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateIn(List<String> values) {
            addCriterion("OUTPUTDATE in", values, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotIn(List<String> values) {
            addCriterion("OUTPUTDATE not in", values, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateBetween(String value1, String value2) {
            addCriterion("OUTPUTDATE between", value1, value2, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotBetween(String value1, String value2) {
            addCriterion("OUTPUTDATE not between", value1, value2, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("OPTIME is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("OPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(String value) {
            addCriterion("OPTIME =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(String value) {
            addCriterion("OPTIME <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(String value) {
            addCriterion("OPTIME >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTIME >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(String value) {
            addCriterion("OPTIME <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(String value) {
            addCriterion("OPTIME <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLike(String value) {
            addCriterion("OPTIME like", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotLike(String value) {
            addCriterion("OPTIME not like", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(List<String> values) {
            addCriterion("OPTIME in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(List<String> values) {
            addCriterion("OPTIME not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(String value1, String value2) {
            addCriterion("OPTIME between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(String value1, String value2) {
            addCriterion("OPTIME not between", value1, value2, "optime");
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

        public Criteria andFilestatusIsNull() {
            addCriterion("FILESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andFilestatusIsNotNull() {
            addCriterion("FILESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFilestatusEqualTo(String value) {
            addCriterion("FILESTATUS =", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotEqualTo(String value) {
            addCriterion("FILESTATUS <>", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusGreaterThan(String value) {
            addCriterion("FILESTATUS >", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusGreaterThanOrEqualTo(String value) {
            addCriterion("FILESTATUS >=", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLessThan(String value) {
            addCriterion("FILESTATUS <", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLessThanOrEqualTo(String value) {
            addCriterion("FILESTATUS <=", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLike(String value) {
            addCriterion("FILESTATUS like", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotLike(String value) {
            addCriterion("FILESTATUS not like", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusIn(List<String> values) {
            addCriterion("FILESTATUS in", values, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotIn(List<String> values) {
            addCriterion("FILESTATUS not in", values, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusBetween(String value1, String value2) {
            addCriterion("FILESTATUS between", value1, value2, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotBetween(String value1, String value2) {
            addCriterion("FILESTATUS not between", value1, value2, "filestatus");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsIsNull() {
            addCriterion("DOWNLOADCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsIsNotNull() {
            addCriterion("DOWNLOADCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsEqualTo(Integer value) {
            addCriterion("DOWNLOADCOUNTS =", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsNotEqualTo(Integer value) {
            addCriterion("DOWNLOADCOUNTS <>", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsGreaterThan(Integer value) {
            addCriterion("DOWNLOADCOUNTS >", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOADCOUNTS >=", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsLessThan(Integer value) {
            addCriterion("DOWNLOADCOUNTS <", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOADCOUNTS <=", value, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsIn(List<Integer> values) {
            addCriterion("DOWNLOADCOUNTS in", values, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsNotIn(List<Integer> values) {
            addCriterion("DOWNLOADCOUNTS not in", values, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOADCOUNTS between", value1, value2, "downloadcounts");
            return (Criteria) this;
        }

        public Criteria andDownloadcountsNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOADCOUNTS not between", value1, value2, "downloadcounts");
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

        public Criteria andCrsumamountIsNull() {
            addCriterion("CRSUMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCrsumamountIsNotNull() {
            addCriterion("CRSUMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCrsumamountEqualTo(BigDecimal value) {
            addCriterion("CRSUMAMOUNT =", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountNotEqualTo(BigDecimal value) {
            addCriterion("CRSUMAMOUNT <>", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountGreaterThan(BigDecimal value) {
            addCriterion("CRSUMAMOUNT >", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRSUMAMOUNT >=", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountLessThan(BigDecimal value) {
            addCriterion("CRSUMAMOUNT <", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRSUMAMOUNT <=", value, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountIn(List<BigDecimal> values) {
            addCriterion("CRSUMAMOUNT in", values, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountNotIn(List<BigDecimal> values) {
            addCriterion("CRSUMAMOUNT not in", values, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRSUMAMOUNT between", value1, value2, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRSUMAMOUNT not between", value1, value2, "crsumamount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountIsNull() {
            addCriterion("CRSUMCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCrsumcountIsNotNull() {
            addCriterion("CRSUMCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCrsumcountEqualTo(Integer value) {
            addCriterion("CRSUMCOUNT =", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountNotEqualTo(Integer value) {
            addCriterion("CRSUMCOUNT <>", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountGreaterThan(Integer value) {
            addCriterion("CRSUMCOUNT >", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRSUMCOUNT >=", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountLessThan(Integer value) {
            addCriterion("CRSUMCOUNT <", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountLessThanOrEqualTo(Integer value) {
            addCriterion("CRSUMCOUNT <=", value, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountIn(List<Integer> values) {
            addCriterion("CRSUMCOUNT in", values, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountNotIn(List<Integer> values) {
            addCriterion("CRSUMCOUNT not in", values, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountBetween(Integer value1, Integer value2) {
            addCriterion("CRSUMCOUNT between", value1, value2, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andCrsumcountNotBetween(Integer value1, Integer value2) {
            addCriterion("CRSUMCOUNT not between", value1, value2, "crsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountIsNull() {
            addCriterion("DRSUMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDrsumamountIsNotNull() {
            addCriterion("DRSUMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDrsumamountEqualTo(BigDecimal value) {
            addCriterion("DRSUMAMOUNT =", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountNotEqualTo(BigDecimal value) {
            addCriterion("DRSUMAMOUNT <>", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountGreaterThan(BigDecimal value) {
            addCriterion("DRSUMAMOUNT >", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRSUMAMOUNT >=", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountLessThan(BigDecimal value) {
            addCriterion("DRSUMAMOUNT <", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRSUMAMOUNT <=", value, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountIn(List<BigDecimal> values) {
            addCriterion("DRSUMAMOUNT in", values, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountNotIn(List<BigDecimal> values) {
            addCriterion("DRSUMAMOUNT not in", values, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRSUMAMOUNT between", value1, value2, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRSUMAMOUNT not between", value1, value2, "drsumamount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountIsNull() {
            addCriterion("DRSUMCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDrsumcountIsNotNull() {
            addCriterion("DRSUMCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDrsumcountEqualTo(Integer value) {
            addCriterion("DRSUMCOUNT =", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountNotEqualTo(Integer value) {
            addCriterion("DRSUMCOUNT <>", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountGreaterThan(Integer value) {
            addCriterion("DRSUMCOUNT >", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRSUMCOUNT >=", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountLessThan(Integer value) {
            addCriterion("DRSUMCOUNT <", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountLessThanOrEqualTo(Integer value) {
            addCriterion("DRSUMCOUNT <=", value, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountIn(List<Integer> values) {
            addCriterion("DRSUMCOUNT in", values, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountNotIn(List<Integer> values) {
            addCriterion("DRSUMCOUNT not in", values, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountBetween(Integer value1, Integer value2) {
            addCriterion("DRSUMCOUNT between", value1, value2, "drsumcount");
            return (Criteria) this;
        }

        public Criteria andDrsumcountNotBetween(Integer value1, Integer value2) {
            addCriterion("DRSUMCOUNT not between", value1, value2, "drsumcount");
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

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIsNull() {
            addCriterion("SUCCESSCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIsNotNull() {
            addCriterion("SUCCESSCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccesscountEqualTo(BigDecimal value) {
            addCriterion("SUCCESSCOUNT =", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotEqualTo(BigDecimal value) {
            addCriterion("SUCCESSCOUNT <>", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountGreaterThan(BigDecimal value) {
            addCriterion("SUCCESSCOUNT >", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSCOUNT >=", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountLessThan(BigDecimal value) {
            addCriterion("SUCCESSCOUNT <", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSCOUNT <=", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIn(List<BigDecimal> values) {
            addCriterion("SUCCESSCOUNT in", values, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotIn(List<BigDecimal> values) {
            addCriterion("SUCCESSCOUNT not in", values, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSCOUNT between", value1, value2, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSCOUNT not between", value1, value2, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountIsNull() {
            addCriterion("SUCCESSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccessamountIsNotNull() {
            addCriterion("SUCCESSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessamountEqualTo(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT =", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountNotEqualTo(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT <>", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountGreaterThan(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT >", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT >=", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountLessThan(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT <", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSAMOUNT <=", value, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountIn(List<BigDecimal> values) {
            addCriterion("SUCCESSAMOUNT in", values, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountNotIn(List<BigDecimal> values) {
            addCriterion("SUCCESSAMOUNT not in", values, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSAMOUNT between", value1, value2, "successamount");
            return (Criteria) this;
        }

        public Criteria andSuccessamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSAMOUNT not between", value1, value2, "successamount");
            return (Criteria) this;
        }

        public Criteria andFailcountIsNull() {
            addCriterion("FAILCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFailcountIsNotNull() {
            addCriterion("FAILCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailcountEqualTo(BigDecimal value) {
            addCriterion("FAILCOUNT =", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotEqualTo(BigDecimal value) {
            addCriterion("FAILCOUNT <>", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountGreaterThan(BigDecimal value) {
            addCriterion("FAILCOUNT >", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILCOUNT >=", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountLessThan(BigDecimal value) {
            addCriterion("FAILCOUNT <", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILCOUNT <=", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountIn(List<BigDecimal> values) {
            addCriterion("FAILCOUNT in", values, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotIn(List<BigDecimal> values) {
            addCriterion("FAILCOUNT not in", values, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILCOUNT between", value1, value2, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILCOUNT not between", value1, value2, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailamountIsNull() {
            addCriterion("FAILAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFailamountIsNotNull() {
            addCriterion("FAILAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailamountEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT =", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT <>", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountGreaterThan(BigDecimal value) {
            addCriterion("FAILAMOUNT >", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT >=", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountLessThan(BigDecimal value) {
            addCriterion("FAILAMOUNT <", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT <=", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountIn(List<BigDecimal> values) {
            addCriterion("FAILAMOUNT in", values, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotIn(List<BigDecimal> values) {
            addCriterion("FAILAMOUNT not in", values, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILAMOUNT between", value1, value2, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILAMOUNT not between", value1, value2, "failamount");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_platformfile_td
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
     * @Table : mm_platformfile_td
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