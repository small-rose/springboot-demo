package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmInpaymentTdExample {
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
    public MmInpaymentTdExample() {
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
     * @Table : mm_inpayment_td
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

        public Criteria andInpaymentbatnoIsNull() {
            addCriterion("INPAYMENTBATNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoIsNotNull() {
            addCriterion("INPAYMENTBATNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTBATNO =", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoNotEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTBATNO <>", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoGreaterThan(BigDecimal value) {
            addCriterion("INPAYMENTBATNO >", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTBATNO >=", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoLessThan(BigDecimal value) {
            addCriterion("INPAYMENTBATNO <", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INPAYMENTBATNO <=", value, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTBATNO in", values, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoNotIn(List<BigDecimal> values) {
            addCriterion("INPAYMENTBATNO not in", values, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTBATNO between", value1, value2, "inpaymentbatno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INPAYMENTBATNO not between", value1, value2, "inpaymentbatno");
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

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andSaveflagIsNull() {
            addCriterion("SAVEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSaveflagIsNotNull() {
            addCriterion("SAVEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSaveflagEqualTo(String value) {
            addCriterion("SAVEFLAG =", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotEqualTo(String value) {
            addCriterion("SAVEFLAG <>", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagGreaterThan(String value) {
            addCriterion("SAVEFLAG >", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagGreaterThanOrEqualTo(String value) {
            addCriterion("SAVEFLAG >=", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagLessThan(String value) {
            addCriterion("SAVEFLAG <", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagLessThanOrEqualTo(String value) {
            addCriterion("SAVEFLAG <=", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagLike(String value) {
            addCriterion("SAVEFLAG like", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotLike(String value) {
            addCriterion("SAVEFLAG not like", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagIn(List<String> values) {
            addCriterion("SAVEFLAG in", values, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotIn(List<String> values) {
            addCriterion("SAVEFLAG not in", values, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagBetween(String value1, String value2) {
            addCriterion("SAVEFLAG between", value1, value2, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotBetween(String value1, String value2) {
            addCriterion("SAVEFLAG not between", value1, value2, "saveflag");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNull() {
            addCriterion("OPERATEDTIMES is null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIsNotNull() {
            addCriterion("OPERATEDTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES =", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES <>", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThan(BigDecimal value) {
            addCriterion("OPERATEDTIMES >", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES >=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThan(BigDecimal value) {
            addCriterion("OPERATEDTIMES <", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATEDTIMES <=", value, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesIn(List<BigDecimal> values) {
            addCriterion("OPERATEDTIMES in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotIn(List<BigDecimal> values) {
            addCriterion("OPERATEDTIMES not in", values, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATEDTIMES between", value1, value2, "operatedtimes");
            return (Criteria) this;
        }

        public Criteria andOperatedtimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATEDTIMES not between", value1, value2, "operatedtimes");
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

        public Criteria andCancelflagIsNull() {
            addCriterion("CANCELFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCancelflagIsNotNull() {
            addCriterion("CANCELFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCancelflagEqualTo(String value) {
            addCriterion("CANCELFLAG =", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotEqualTo(String value) {
            addCriterion("CANCELFLAG <>", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThan(String value) {
            addCriterion("CANCELFLAG >", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELFLAG >=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThan(String value) {
            addCriterion("CANCELFLAG <", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLessThanOrEqualTo(String value) {
            addCriterion("CANCELFLAG <=", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagLike(String value) {
            addCriterion("CANCELFLAG like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotLike(String value) {
            addCriterion("CANCELFLAG not like", value, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagIn(List<String> values) {
            addCriterion("CANCELFLAG in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotIn(List<String> values) {
            addCriterion("CANCELFLAG not in", values, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagBetween(String value1, String value2) {
            addCriterion("CANCELFLAG between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCancelflagNotBetween(String value1, String value2) {
            addCriterion("CANCELFLAG not between", value1, value2, "cancelflag");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNull() {
            addCriterion("CANCELDATE is null");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNotNull() {
            addCriterion("CANCELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCanceldateEqualTo(Date value) {
            addCriterion("CANCELDATE =", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotEqualTo(Date value) {
            addCriterion("CANCELDATE <>", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThan(Date value) {
            addCriterion("CANCELDATE >", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCELDATE >=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThan(Date value) {
            addCriterion("CANCELDATE <", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThanOrEqualTo(Date value) {
            addCriterion("CANCELDATE <=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIn(List<Date> values) {
            addCriterion("CANCELDATE in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotIn(List<Date> values) {
            addCriterion("CANCELDATE not in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateBetween(Date value1, Date value2) {
            addCriterion("CANCELDATE between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotBetween(Date value1, Date value2) {
            addCriterion("CANCELDATE not between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andIfprintedIsNull() {
            addCriterion("IFPRINTED is null");
            return (Criteria) this;
        }

        public Criteria andIfprintedIsNotNull() {
            addCriterion("IFPRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andIfprintedEqualTo(String value) {
            addCriterion("IFPRINTED =", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotEqualTo(String value) {
            addCriterion("IFPRINTED <>", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedGreaterThan(String value) {
            addCriterion("IFPRINTED >", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedGreaterThanOrEqualTo(String value) {
            addCriterion("IFPRINTED >=", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLessThan(String value) {
            addCriterion("IFPRINTED <", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLessThanOrEqualTo(String value) {
            addCriterion("IFPRINTED <=", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedLike(String value) {
            addCriterion("IFPRINTED like", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotLike(String value) {
            addCriterion("IFPRINTED not like", value, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedIn(List<String> values) {
            addCriterion("IFPRINTED in", values, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotIn(List<String> values) {
            addCriterion("IFPRINTED not in", values, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedBetween(String value1, String value2) {
            addCriterion("IFPRINTED between", value1, value2, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andIfprintedNotBetween(String value1, String value2) {
            addCriterion("IFPRINTED not between", value1, value2, "ifprinted");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidIsNull() {
            addCriterion("COINPAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidIsNotNull() {
            addCriterion("COINPAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidEqualTo(BigDecimal value) {
            addCriterion("COINPAYMENTID =", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidNotEqualTo(BigDecimal value) {
            addCriterion("COINPAYMENTID <>", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidGreaterThan(BigDecimal value) {
            addCriterion("COINPAYMENTID >", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COINPAYMENTID >=", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidLessThan(BigDecimal value) {
            addCriterion("COINPAYMENTID <", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COINPAYMENTID <=", value, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidIn(List<BigDecimal> values) {
            addCriterion("COINPAYMENTID in", values, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidNotIn(List<BigDecimal> values) {
            addCriterion("COINPAYMENTID not in", values, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COINPAYMENTID between", value1, value2, "coinpaymentid");
            return (Criteria) this;
        }

        public Criteria andCoinpaymentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COINPAYMENTID not between", value1, value2, "coinpaymentid");
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

        public Criteria andCustaccountidIsNull() {
            addCriterion("CUSTACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountidIsNotNull() {
            addCriterion("CUSTACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountidEqualTo(Long value) {
            addCriterion("CUSTACCOUNTID =", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidNotEqualTo(Long value) {
            addCriterion("CUSTACCOUNTID <>", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidGreaterThan(Long value) {
            addCriterion("CUSTACCOUNTID >", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTACCOUNTID >=", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidLessThan(Long value) {
            addCriterion("CUSTACCOUNTID <", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidLessThanOrEqualTo(Long value) {
            addCriterion("CUSTACCOUNTID <=", value, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidIn(List<Long> values) {
            addCriterion("CUSTACCOUNTID in", values, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidNotIn(List<Long> values) {
            addCriterion("CUSTACCOUNTID not in", values, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidBetween(Long value1, Long value2) {
            addCriterion("CUSTACCOUNTID between", value1, value2, "custaccountid");
            return (Criteria) this;
        }

        public Criteria andCustaccountidNotBetween(Long value1, Long value2) {
            addCriterion("CUSTACCOUNTID not between", value1, value2, "custaccountid");
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

        public Criteria andCustomerbanknameIsNull() {
            addCriterion("CUSTOMERBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameIsNotNull() {
            addCriterion("CUSTOMERBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME =", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME <>", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameGreaterThan(String value) {
            addCriterion("CUSTOMERBANKNAME >", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME >=", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLessThan(String value) {
            addCriterion("CUSTOMERBANKNAME <", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANKNAME <=", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameLike(String value) {
            addCriterion("CUSTOMERBANKNAME like", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotLike(String value) {
            addCriterion("CUSTOMERBANKNAME not like", value, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameIn(List<String> values) {
            addCriterion("CUSTOMERBANKNAME in", values, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotIn(List<String> values) {
            addCriterion("CUSTOMERBANKNAME not in", values, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANKNAME between", value1, value2, "customerbankname");
            return (Criteria) this;
        }

        public Criteria andCustomerbanknameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANKNAME not between", value1, value2, "customerbankname");
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

        public Criteria andInpaymentbatchnoIsNull() {
            addCriterion("INPAYMENTBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIsNotNull() {
            addCriterion("INPAYMENTBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO =", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <>", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThan(String value) {
            addCriterion("INPAYMENTBATCHNO >", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO >=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThan(String value) {
            addCriterion("INPAYMENTBATCHNO <", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTBATCHNO <=", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoLike(String value) {
            addCriterion("INPAYMENTBATCHNO like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotLike(String value) {
            addCriterion("INPAYMENTBATCHNO not like", value, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotIn(List<String> values) {
            addCriterion("INPAYMENTBATCHNO not in", values, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andInpaymentbatchnoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTBATCHNO not between", value1, value2, "inpaymentbatchno");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("AUDITSTATUS like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("AUDITSTATUS not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNull() {
            addCriterion("DAILYAUDITNO is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNotNull() {
            addCriterion("DAILYAUDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoEqualTo(String value) {
            addCriterion("DAILYAUDITNO =", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotEqualTo(String value) {
            addCriterion("DAILYAUDITNO <>", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThan(String value) {
            addCriterion("DAILYAUDITNO >", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO >=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThan(String value) {
            addCriterion("DAILYAUDITNO <", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITNO <=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLike(String value) {
            addCriterion("DAILYAUDITNO like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotLike(String value) {
            addCriterion("DAILYAUDITNO not like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIn(List<String> values) {
            addCriterion("DAILYAUDITNO in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotIn(List<String> values) {
            addCriterion("DAILYAUDITNO not in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITNO not between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andIncomemethodIsNull() {
            addCriterion("INCOMEMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andIncomemethodIsNotNull() {
            addCriterion("INCOMEMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andIncomemethodEqualTo(String value) {
            addCriterion("INCOMEMETHOD =", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodNotEqualTo(String value) {
            addCriterion("INCOMEMETHOD <>", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodGreaterThan(String value) {
            addCriterion("INCOMEMETHOD >", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodGreaterThanOrEqualTo(String value) {
            addCriterion("INCOMEMETHOD >=", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodLessThan(String value) {
            addCriterion("INCOMEMETHOD <", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodLessThanOrEqualTo(String value) {
            addCriterion("INCOMEMETHOD <=", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodLike(String value) {
            addCriterion("INCOMEMETHOD like", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodNotLike(String value) {
            addCriterion("INCOMEMETHOD not like", value, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodIn(List<String> values) {
            addCriterion("INCOMEMETHOD in", values, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodNotIn(List<String> values) {
            addCriterion("INCOMEMETHOD not in", values, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodBetween(String value1, String value2) {
            addCriterion("INCOMEMETHOD between", value1, value2, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andIncomemethodNotBetween(String value1, String value2) {
            addCriterion("INCOMEMETHOD not between", value1, value2, "incomemethod");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoIsNull() {
            addCriterion("INNERAPPLYBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoIsNotNull() {
            addCriterion("INNERAPPLYBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoEqualTo(String value) {
            addCriterion("INNERAPPLYBILLNO =", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoNotEqualTo(String value) {
            addCriterion("INNERAPPLYBILLNO <>", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoGreaterThan(String value) {
            addCriterion("INNERAPPLYBILLNO >", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoGreaterThanOrEqualTo(String value) {
            addCriterion("INNERAPPLYBILLNO >=", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoLessThan(String value) {
            addCriterion("INNERAPPLYBILLNO <", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoLessThanOrEqualTo(String value) {
            addCriterion("INNERAPPLYBILLNO <=", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoLike(String value) {
            addCriterion("INNERAPPLYBILLNO like", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoNotLike(String value) {
            addCriterion("INNERAPPLYBILLNO not like", value, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoIn(List<String> values) {
            addCriterion("INNERAPPLYBILLNO in", values, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoNotIn(List<String> values) {
            addCriterion("INNERAPPLYBILLNO not in", values, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoBetween(String value1, String value2) {
            addCriterion("INNERAPPLYBILLNO between", value1, value2, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andInnerapplybillnoNotBetween(String value1, String value2) {
            addCriterion("INNERAPPLYBILLNO not between", value1, value2, "innerapplybillno");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNull() {
            addCriterion("FATHERNO is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("FATHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(BigDecimal value) {
            addCriterion("FATHERNO =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(BigDecimal value) {
            addCriterion("FATHERNO <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(BigDecimal value) {
            addCriterion("FATHERNO >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FATHERNO >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(BigDecimal value) {
            addCriterion("FATHERNO <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FATHERNO <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<BigDecimal> values) {
            addCriterion("FATHERNO in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<BigDecimal> values) {
            addCriterion("FATHERNO not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FATHERNO between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FATHERNO not between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNull() {
            addCriterion("SONNO is null");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNotNull() {
            addCriterion("SONNO is not null");
            return (Criteria) this;
        }

        public Criteria andSonnoEqualTo(BigDecimal value) {
            addCriterion("SONNO =", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotEqualTo(BigDecimal value) {
            addCriterion("SONNO <>", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThan(BigDecimal value) {
            addCriterion("SONNO >", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SONNO >=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThan(BigDecimal value) {
            addCriterion("SONNO <", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SONNO <=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoIn(List<BigDecimal> values) {
            addCriterion("SONNO in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotIn(List<BigDecimal> values) {
            addCriterion("SONNO not in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SONNO between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SONNO not between", value1, value2, "sonno");
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

        public Criteria andGatherstatusIsNull() {
            addCriterion("GATHERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andGatherstatusIsNotNull() {
            addCriterion("GATHERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGatherstatusEqualTo(String value) {
            addCriterion("GATHERSTATUS =", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusNotEqualTo(String value) {
            addCriterion("GATHERSTATUS <>", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusGreaterThan(String value) {
            addCriterion("GATHERSTATUS >", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusGreaterThanOrEqualTo(String value) {
            addCriterion("GATHERSTATUS >=", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusLessThan(String value) {
            addCriterion("GATHERSTATUS <", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusLessThanOrEqualTo(String value) {
            addCriterion("GATHERSTATUS <=", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusLike(String value) {
            addCriterion("GATHERSTATUS like", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusNotLike(String value) {
            addCriterion("GATHERSTATUS not like", value, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusIn(List<String> values) {
            addCriterion("GATHERSTATUS in", values, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusNotIn(List<String> values) {
            addCriterion("GATHERSTATUS not in", values, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusBetween(String value1, String value2) {
            addCriterion("GATHERSTATUS between", value1, value2, "gatherstatus");
            return (Criteria) this;
        }

        public Criteria andGatherstatusNotBetween(String value1, String value2) {
            addCriterion("GATHERSTATUS not between", value1, value2, "gatherstatus");
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

        public Criteria andP07responsedateIsNull() {
            addCriterion("P07RESPONSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andP07responsedateIsNotNull() {
            addCriterion("P07RESPONSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andP07responsedateEqualTo(Date value) {
            addCriterion("P07RESPONSEDATE =", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateNotEqualTo(Date value) {
            addCriterion("P07RESPONSEDATE <>", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateGreaterThan(Date value) {
            addCriterion("P07RESPONSEDATE >", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateGreaterThanOrEqualTo(Date value) {
            addCriterion("P07RESPONSEDATE >=", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateLessThan(Date value) {
            addCriterion("P07RESPONSEDATE <", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateLessThanOrEqualTo(Date value) {
            addCriterion("P07RESPONSEDATE <=", value, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateIn(List<Date> values) {
            addCriterion("P07RESPONSEDATE in", values, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateNotIn(List<Date> values) {
            addCriterion("P07RESPONSEDATE not in", values, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateBetween(Date value1, Date value2) {
            addCriterion("P07RESPONSEDATE between", value1, value2, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07responsedateNotBetween(Date value1, Date value2) {
            addCriterion("P07RESPONSEDATE not between", value1, value2, "p07responsedate");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeIsNull() {
            addCriterion("P07ERRORCODE is null");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeIsNotNull() {
            addCriterion("P07ERRORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeEqualTo(String value) {
            addCriterion("P07ERRORCODE =", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeNotEqualTo(String value) {
            addCriterion("P07ERRORCODE <>", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeGreaterThan(String value) {
            addCriterion("P07ERRORCODE >", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("P07ERRORCODE >=", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeLessThan(String value) {
            addCriterion("P07ERRORCODE <", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeLessThanOrEqualTo(String value) {
            addCriterion("P07ERRORCODE <=", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeLike(String value) {
            addCriterion("P07ERRORCODE like", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeNotLike(String value) {
            addCriterion("P07ERRORCODE not like", value, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeIn(List<String> values) {
            addCriterion("P07ERRORCODE in", values, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeNotIn(List<String> values) {
            addCriterion("P07ERRORCODE not in", values, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeBetween(String value1, String value2) {
            addCriterion("P07ERRORCODE between", value1, value2, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errorcodeNotBetween(String value1, String value2) {
            addCriterion("P07ERRORCODE not between", value1, value2, "p07errorcode");
            return (Criteria) this;
        }

        public Criteria andP07errormsgIsNull() {
            addCriterion("P07ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andP07errormsgIsNotNull() {
            addCriterion("P07ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andP07errormsgEqualTo(String value) {
            addCriterion("P07ERRORMSG =", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgNotEqualTo(String value) {
            addCriterion("P07ERRORMSG <>", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgGreaterThan(String value) {
            addCriterion("P07ERRORMSG >", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgGreaterThanOrEqualTo(String value) {
            addCriterion("P07ERRORMSG >=", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgLessThan(String value) {
            addCriterion("P07ERRORMSG <", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgLessThanOrEqualTo(String value) {
            addCriterion("P07ERRORMSG <=", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgLike(String value) {
            addCriterion("P07ERRORMSG like", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgNotLike(String value) {
            addCriterion("P07ERRORMSG not like", value, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgIn(List<String> values) {
            addCriterion("P07ERRORMSG in", values, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgNotIn(List<String> values) {
            addCriterion("P07ERRORMSG not in", values, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgBetween(String value1, String value2) {
            addCriterion("P07ERRORMSG between", value1, value2, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07errormsgNotBetween(String value1, String value2) {
            addCriterion("P07ERRORMSG not between", value1, value2, "p07errormsg");
            return (Criteria) this;
        }

        public Criteria andP07paydateIsNull() {
            addCriterion("P07PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andP07paydateIsNotNull() {
            addCriterion("P07PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andP07paydateEqualTo(Date value) {
            addCriterion("P07PAYDATE =", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateNotEqualTo(Date value) {
            addCriterion("P07PAYDATE <>", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateGreaterThan(Date value) {
            addCriterion("P07PAYDATE >", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateGreaterThanOrEqualTo(Date value) {
            addCriterion("P07PAYDATE >=", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateLessThan(Date value) {
            addCriterion("P07PAYDATE <", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateLessThanOrEqualTo(Date value) {
            addCriterion("P07PAYDATE <=", value, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateIn(List<Date> values) {
            addCriterion("P07PAYDATE in", values, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateNotIn(List<Date> values) {
            addCriterion("P07PAYDATE not in", values, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateBetween(Date value1, Date value2) {
            addCriterion("P07PAYDATE between", value1, value2, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andP07paydateNotBetween(Date value1, Date value2) {
            addCriterion("P07PAYDATE not between", value1, value2, "p07paydate");
            return (Criteria) this;
        }

        public Criteria andCoreasonIsNull() {
            addCriterion("COREASON is null");
            return (Criteria) this;
        }

        public Criteria andCoreasonIsNotNull() {
            addCriterion("COREASON is not null");
            return (Criteria) this;
        }

        public Criteria andCoreasonEqualTo(String value) {
            addCriterion("COREASON =", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonNotEqualTo(String value) {
            addCriterion("COREASON <>", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonGreaterThan(String value) {
            addCriterion("COREASON >", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonGreaterThanOrEqualTo(String value) {
            addCriterion("COREASON >=", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonLessThan(String value) {
            addCriterion("COREASON <", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonLessThanOrEqualTo(String value) {
            addCriterion("COREASON <=", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonLike(String value) {
            addCriterion("COREASON like", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonNotLike(String value) {
            addCriterion("COREASON not like", value, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonIn(List<String> values) {
            addCriterion("COREASON in", values, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonNotIn(List<String> values) {
            addCriterion("COREASON not in", values, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonBetween(String value1, String value2) {
            addCriterion("COREASON between", value1, value2, "coreason");
            return (Criteria) this;
        }

        public Criteria andCoreasonNotBetween(String value1, String value2) {
            addCriterion("COREASON not between", value1, value2, "coreason");
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

        public Criteria andIflocalIsNull() {
            addCriterion("IFLOCAL is null");
            return (Criteria) this;
        }

        public Criteria andIflocalIsNotNull() {
            addCriterion("IFLOCAL is not null");
            return (Criteria) this;
        }

        public Criteria andIflocalEqualTo(String value) {
            addCriterion("IFLOCAL =", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotEqualTo(String value) {
            addCriterion("IFLOCAL <>", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalGreaterThan(String value) {
            addCriterion("IFLOCAL >", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalGreaterThanOrEqualTo(String value) {
            addCriterion("IFLOCAL >=", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLessThan(String value) {
            addCriterion("IFLOCAL <", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLessThanOrEqualTo(String value) {
            addCriterion("IFLOCAL <=", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalLike(String value) {
            addCriterion("IFLOCAL like", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotLike(String value) {
            addCriterion("IFLOCAL not like", value, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalIn(List<String> values) {
            addCriterion("IFLOCAL in", values, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotIn(List<String> values) {
            addCriterion("IFLOCAL not in", values, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalBetween(String value1, String value2) {
            addCriterion("IFLOCAL between", value1, value2, "iflocal");
            return (Criteria) this;
        }

        public Criteria andIflocalNotBetween(String value1, String value2) {
            addCriterion("IFLOCAL not between", value1, value2, "iflocal");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("ACTIVITYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("ACTIVITYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(String value) {
            addCriterion("ACTIVITYTYPE =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(String value) {
            addCriterion("ACTIVITYTYPE <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(String value) {
            addCriterion("ACTIVITYTYPE >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITYTYPE >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(String value) {
            addCriterion("ACTIVITYTYPE <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITYTYPE <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLike(String value) {
            addCriterion("ACTIVITYTYPE like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotLike(String value) {
            addCriterion("ACTIVITYTYPE not like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<String> values) {
            addCriterion("ACTIVITYTYPE in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<String> values) {
            addCriterion("ACTIVITYTYPE not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(String value1, String value2) {
            addCriterion("ACTIVITYTYPE between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(String value1, String value2) {
            addCriterion("ACTIVITYTYPE not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameIsNull() {
            addCriterion("ACTIVITYTYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameIsNotNull() {
            addCriterion("ACTIVITYTYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameEqualTo(String value) {
            addCriterion("ACTIVITYTYPENAME =", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameNotEqualTo(String value) {
            addCriterion("ACTIVITYTYPENAME <>", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameGreaterThan(String value) {
            addCriterion("ACTIVITYTYPENAME >", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITYTYPENAME >=", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameLessThan(String value) {
            addCriterion("ACTIVITYTYPENAME <", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITYTYPENAME <=", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameLike(String value) {
            addCriterion("ACTIVITYTYPENAME like", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameNotLike(String value) {
            addCriterion("ACTIVITYTYPENAME not like", value, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameIn(List<String> values) {
            addCriterion("ACTIVITYTYPENAME in", values, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameNotIn(List<String> values) {
            addCriterion("ACTIVITYTYPENAME not in", values, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameBetween(String value1, String value2) {
            addCriterion("ACTIVITYTYPENAME between", value1, value2, "activitytypename");
            return (Criteria) this;
        }

        public Criteria andActivitytypenameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITYTYPENAME not between", value1, value2, "activitytypename");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_inpayment_td
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
     * @Table : mm_inpayment_td
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