package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmDailyreportTdDelExample {
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
    public MmDailyreportTdDelExample() {
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
     * @Table : mm_dailyreport_td_del
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

        public Criteria andDailyauditnoIsNull() {
            addCriterion("DAILYAUDITNO is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNotNull() {
            addCriterion("DAILYAUDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoEqualTo(Long value) {
            addCriterion("DAILYAUDITNO =", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotEqualTo(Long value) {
            addCriterion("DAILYAUDITNO <>", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThan(Long value) {
            addCriterion("DAILYAUDITNO >", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThanOrEqualTo(Long value) {
            addCriterion("DAILYAUDITNO >=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThan(Long value) {
            addCriterion("DAILYAUDITNO <", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThanOrEqualTo(Long value) {
            addCriterion("DAILYAUDITNO <=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIn(List<Long> values) {
            addCriterion("DAILYAUDITNO in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotIn(List<Long> values) {
            addCriterion("DAILYAUDITNO not in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoBetween(Long value1, Long value2) {
            addCriterion("DAILYAUDITNO between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotBetween(Long value1, Long value2) {
            addCriterion("DAILYAUDITNO not between", value1, value2, "dailyauditno");
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

        public Criteria andAuditdateIsNull() {
            addCriterion("AUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AUDITDATE =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AUDITDATE <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AUDITDATE >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AUDITDATE <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AUDITDATE in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AUDITDATE not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE not between", value1, value2, "auditdate");
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

        public Criteria andOpnameIsNull() {
            addCriterion("OPNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNotNull() {
            addCriterion("OPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpnameEqualTo(String value) {
            addCriterion("OPNAME =", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotEqualTo(String value) {
            addCriterion("OPNAME <>", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThan(String value) {
            addCriterion("OPNAME >", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPNAME >=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThan(String value) {
            addCriterion("OPNAME <", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThanOrEqualTo(String value) {
            addCriterion("OPNAME <=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLike(String value) {
            addCriterion("OPNAME like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotLike(String value) {
            addCriterion("OPNAME not like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameIn(List<String> values) {
            addCriterion("OPNAME in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotIn(List<String> values) {
            addCriterion("OPNAME not in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameBetween(String value1, String value2) {
            addCriterion("OPNAME between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotBetween(String value1, String value2) {
            addCriterion("OPNAME not between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIsNull() {
            addCriterion("CHECKERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIsNotNull() {
            addCriterion("CHECKERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckercodeEqualTo(String value) {
            addCriterion("CHECKERCODE =", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotEqualTo(String value) {
            addCriterion("CHECKERCODE <>", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeGreaterThan(String value) {
            addCriterion("CHECKERCODE >", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKERCODE >=", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLessThan(String value) {
            addCriterion("CHECKERCODE <", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKERCODE <=", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeLike(String value) {
            addCriterion("CHECKERCODE like", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotLike(String value) {
            addCriterion("CHECKERCODE not like", value, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeIn(List<String> values) {
            addCriterion("CHECKERCODE in", values, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotIn(List<String> values) {
            addCriterion("CHECKERCODE not in", values, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeBetween(String value1, String value2) {
            addCriterion("CHECKERCODE between", value1, value2, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckercodeNotBetween(String value1, String value2) {
            addCriterion("CHECKERCODE not between", value1, value2, "checkercode");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNull() {
            addCriterion("CHECKERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNotNull() {
            addCriterion("CHECKERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckernameEqualTo(String value) {
            addCriterion("CHECKERNAME =", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotEqualTo(String value) {
            addCriterion("CHECKERNAME <>", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThan(String value) {
            addCriterion("CHECKERNAME >", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKERNAME >=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThan(String value) {
            addCriterion("CHECKERNAME <", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThanOrEqualTo(String value) {
            addCriterion("CHECKERNAME <=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLike(String value) {
            addCriterion("CHECKERNAME like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotLike(String value) {
            addCriterion("CHECKERNAME not like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameIn(List<String> values) {
            addCriterion("CHECKERNAME in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotIn(List<String> values) {
            addCriterion("CHECKERNAME not in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameBetween(String value1, String value2) {
            addCriterion("CHECKERNAME between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotBetween(String value1, String value2) {
            addCriterion("CHECKERNAME not between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIsNull() {
            addCriterion("AUDITERCODE is null");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIsNotNull() {
            addCriterion("AUDITERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditercodeEqualTo(String value) {
            addCriterion("AUDITERCODE =", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotEqualTo(String value) {
            addCriterion("AUDITERCODE <>", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeGreaterThan(String value) {
            addCriterion("AUDITERCODE >", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITERCODE >=", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLessThan(String value) {
            addCriterion("AUDITERCODE <", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLessThanOrEqualTo(String value) {
            addCriterion("AUDITERCODE <=", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeLike(String value) {
            addCriterion("AUDITERCODE like", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotLike(String value) {
            addCriterion("AUDITERCODE not like", value, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeIn(List<String> values) {
            addCriterion("AUDITERCODE in", values, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotIn(List<String> values) {
            addCriterion("AUDITERCODE not in", values, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeBetween(String value1, String value2) {
            addCriterion("AUDITERCODE between", value1, value2, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditercodeNotBetween(String value1, String value2) {
            addCriterion("AUDITERCODE not between", value1, value2, "auditercode");
            return (Criteria) this;
        }

        public Criteria andAuditernameIsNull() {
            addCriterion("AUDITERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAuditernameIsNotNull() {
            addCriterion("AUDITERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditernameEqualTo(String value) {
            addCriterion("AUDITERNAME =", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotEqualTo(String value) {
            addCriterion("AUDITERNAME <>", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameGreaterThan(String value) {
            addCriterion("AUDITERNAME >", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITERNAME >=", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLessThan(String value) {
            addCriterion("AUDITERNAME <", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLessThanOrEqualTo(String value) {
            addCriterion("AUDITERNAME <=", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameLike(String value) {
            addCriterion("AUDITERNAME like", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotLike(String value) {
            addCriterion("AUDITERNAME not like", value, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameIn(List<String> values) {
            addCriterion("AUDITERNAME in", values, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotIn(List<String> values) {
            addCriterion("AUDITERNAME not in", values, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameBetween(String value1, String value2) {
            addCriterion("AUDITERNAME between", value1, value2, "auditername");
            return (Criteria) this;
        }

        public Criteria andAuditernameNotBetween(String value1, String value2) {
            addCriterion("AUDITERNAME not between", value1, value2, "auditername");
            return (Criteria) this;
        }

        public Criteria andReportkindIsNull() {
            addCriterion("REPORTKIND is null");
            return (Criteria) this;
        }

        public Criteria andReportkindIsNotNull() {
            addCriterion("REPORTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andReportkindEqualTo(String value) {
            addCriterion("REPORTKIND =", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotEqualTo(String value) {
            addCriterion("REPORTKIND <>", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindGreaterThan(String value) {
            addCriterion("REPORTKIND >", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTKIND >=", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLessThan(String value) {
            addCriterion("REPORTKIND <", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLessThanOrEqualTo(String value) {
            addCriterion("REPORTKIND <=", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindLike(String value) {
            addCriterion("REPORTKIND like", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotLike(String value) {
            addCriterion("REPORTKIND not like", value, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindIn(List<String> values) {
            addCriterion("REPORTKIND in", values, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotIn(List<String> values) {
            addCriterion("REPORTKIND not in", values, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindBetween(String value1, String value2) {
            addCriterion("REPORTKIND between", value1, value2, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportkindNotBetween(String value1, String value2) {
            addCriterion("REPORTKIND not between", value1, value2, "reportkind");
            return (Criteria) this;
        }

        public Criteria andReportstatusIsNull() {
            addCriterion("REPORTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportstatusIsNotNull() {
            addCriterion("REPORTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportstatusEqualTo(String value) {
            addCriterion("REPORTSTATUS =", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotEqualTo(String value) {
            addCriterion("REPORTSTATUS <>", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusGreaterThan(String value) {
            addCriterion("REPORTSTATUS >", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTSTATUS >=", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLessThan(String value) {
            addCriterion("REPORTSTATUS <", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLessThanOrEqualTo(String value) {
            addCriterion("REPORTSTATUS <=", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLike(String value) {
            addCriterion("REPORTSTATUS like", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotLike(String value) {
            addCriterion("REPORTSTATUS not like", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusIn(List<String> values) {
            addCriterion("REPORTSTATUS in", values, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotIn(List<String> values) {
            addCriterion("REPORTSTATUS not in", values, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusBetween(String value1, String value2) {
            addCriterion("REPORTSTATUS between", value1, value2, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotBetween(String value1, String value2) {
            addCriterion("REPORTSTATUS not between", value1, value2, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIsNull() {
            addCriterion("TRANSTOACC is null");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIsNotNull() {
            addCriterion("TRANSTOACC is not null");
            return (Criteria) this;
        }

        public Criteria andTranstoaccEqualTo(String value) {
            addCriterion("TRANSTOACC =", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotEqualTo(String value) {
            addCriterion("TRANSTOACC <>", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccGreaterThan(String value) {
            addCriterion("TRANSTOACC >", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTOACC >=", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLessThan(String value) {
            addCriterion("TRANSTOACC <", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLessThanOrEqualTo(String value) {
            addCriterion("TRANSTOACC <=", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccLike(String value) {
            addCriterion("TRANSTOACC like", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotLike(String value) {
            addCriterion("TRANSTOACC not like", value, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccIn(List<String> values) {
            addCriterion("TRANSTOACC in", values, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotIn(List<String> values) {
            addCriterion("TRANSTOACC not in", values, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccBetween(String value1, String value2) {
            addCriterion("TRANSTOACC between", value1, value2, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstoaccNotBetween(String value1, String value2) {
            addCriterion("TRANSTOACC not between", value1, value2, "transtoacc");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessIsNull() {
            addCriterion("TRANSTOBUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessIsNotNull() {
            addCriterion("TRANSTOBUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessEqualTo(String value) {
            addCriterion("TRANSTOBUSINESS =", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessNotEqualTo(String value) {
            addCriterion("TRANSTOBUSINESS <>", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessGreaterThan(String value) {
            addCriterion("TRANSTOBUSINESS >", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTOBUSINESS >=", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessLessThan(String value) {
            addCriterion("TRANSTOBUSINESS <", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessLessThanOrEqualTo(String value) {
            addCriterion("TRANSTOBUSINESS <=", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessLike(String value) {
            addCriterion("TRANSTOBUSINESS like", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessNotLike(String value) {
            addCriterion("TRANSTOBUSINESS not like", value, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessIn(List<String> values) {
            addCriterion("TRANSTOBUSINESS in", values, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessNotIn(List<String> values) {
            addCriterion("TRANSTOBUSINESS not in", values, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessBetween(String value1, String value2) {
            addCriterion("TRANSTOBUSINESS between", value1, value2, "transtobusiness");
            return (Criteria) this;
        }

        public Criteria andTranstobusinessNotBetween(String value1, String value2) {
            addCriterion("TRANSTOBUSINESS not between", value1, value2, "transtobusiness");
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

        public Criteria andIsmergedIsNull() {
            addCriterion("ISMERGED is null");
            return (Criteria) this;
        }

        public Criteria andIsmergedIsNotNull() {
            addCriterion("ISMERGED is not null");
            return (Criteria) this;
        }

        public Criteria andIsmergedEqualTo(String value) {
            addCriterion("ISMERGED =", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedNotEqualTo(String value) {
            addCriterion("ISMERGED <>", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedGreaterThan(String value) {
            addCriterion("ISMERGED >", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedGreaterThanOrEqualTo(String value) {
            addCriterion("ISMERGED >=", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedLessThan(String value) {
            addCriterion("ISMERGED <", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedLessThanOrEqualTo(String value) {
            addCriterion("ISMERGED <=", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedLike(String value) {
            addCriterion("ISMERGED like", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedNotLike(String value) {
            addCriterion("ISMERGED not like", value, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedIn(List<String> values) {
            addCriterion("ISMERGED in", values, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedNotIn(List<String> values) {
            addCriterion("ISMERGED not in", values, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedBetween(String value1, String value2) {
            addCriterion("ISMERGED between", value1, value2, "ismerged");
            return (Criteria) this;
        }

        public Criteria andIsmergedNotBetween(String value1, String value2) {
            addCriterion("ISMERGED not between", value1, value2, "ismerged");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_dailyreport_td_del
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
     * @Table : mm_dailyreport_td_del
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