package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmPaymentinEventsTddelExample {
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
    public MmPaymentinEventsTddelExample() {
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
     * @Table : mm_paymentin_events_tddel
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

        public Criteria andListnoIsNull() {
            addCriterion("LISTNO is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("LISTNO is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(Long value) {
            addCriterion("LISTNO =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(Long value) {
            addCriterion("LISTNO <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(Long value) {
            addCriterion("LISTNO >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(Long value) {
            addCriterion("LISTNO >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(Long value) {
            addCriterion("LISTNO <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(Long value) {
            addCriterion("LISTNO <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<Long> values) {
            addCriterion("LISTNO in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<Long> values) {
            addCriterion("LISTNO not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(Long value1, Long value2) {
            addCriterion("LISTNO between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(Long value1, Long value2) {
            addCriterion("LISTNO not between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoIsNull() {
            addCriterion("TRADEBATNO is null");
            return (Criteria) this;
        }

        public Criteria andTradebatnoIsNotNull() {
            addCriterion("TRADEBATNO is not null");
            return (Criteria) this;
        }

        public Criteria andTradebatnoEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO =", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO <>", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoGreaterThan(BigDecimal value) {
            addCriterion("TRADEBATNO >", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO >=", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoLessThan(BigDecimal value) {
            addCriterion("TRADEBATNO <", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEBATNO <=", value, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoIn(List<BigDecimal> values) {
            addCriterion("TRADEBATNO in", values, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotIn(List<BigDecimal> values) {
            addCriterion("TRADEBATNO not in", values, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEBATNO between", value1, value2, "tradebatno");
            return (Criteria) this;
        }

        public Criteria andTradebatnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEBATNO not between", value1, value2, "tradebatno");
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

        public Criteria andFromunitcodeIsNull() {
            addCriterion("FROMUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIsNotNull() {
            addCriterion("FROMUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeEqualTo(String value) {
            addCriterion("FROMUNITCODE =", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotEqualTo(String value) {
            addCriterion("FROMUNITCODE <>", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThan(String value) {
            addCriterion("FROMUNITCODE >", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE >=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThan(String value) {
            addCriterion("FROMUNITCODE <", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLessThanOrEqualTo(String value) {
            addCriterion("FROMUNITCODE <=", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeLike(String value) {
            addCriterion("FROMUNITCODE like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotLike(String value) {
            addCriterion("FROMUNITCODE not like", value, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeIn(List<String> values) {
            addCriterion("FROMUNITCODE in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotIn(List<String> values) {
            addCriterion("FROMUNITCODE not in", values, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andFromunitcodeNotBetween(String value1, String value2) {
            addCriterion("FROMUNITCODE not between", value1, value2, "fromunitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIsNull() {
            addCriterion("TOUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIsNotNull() {
            addCriterion("TOUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeEqualTo(String value) {
            addCriterion("TOUNITCODE =", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotEqualTo(String value) {
            addCriterion("TOUNITCODE <>", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThan(String value) {
            addCriterion("TOUNITCODE >", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TOUNITCODE >=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThan(String value) {
            addCriterion("TOUNITCODE <", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThanOrEqualTo(String value) {
            addCriterion("TOUNITCODE <=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLike(String value) {
            addCriterion("TOUNITCODE like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotLike(String value) {
            addCriterion("TOUNITCODE not like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIn(List<String> values) {
            addCriterion("TOUNITCODE in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotIn(List<String> values) {
            addCriterion("TOUNITCODE not in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeBetween(String value1, String value2) {
            addCriterion("TOUNITCODE between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotBetween(String value1, String value2) {
            addCriterion("TOUNITCODE not between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNull() {
            addCriterion("OLDNO is null");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNotNull() {
            addCriterion("OLDNO is not null");
            return (Criteria) this;
        }

        public Criteria andOldnoEqualTo(Long value) {
            addCriterion("OLDNO =", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotEqualTo(Long value) {
            addCriterion("OLDNO <>", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThan(Long value) {
            addCriterion("OLDNO >", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThanOrEqualTo(Long value) {
            addCriterion("OLDNO >=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThan(Long value) {
            addCriterion("OLDNO <", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThanOrEqualTo(Long value) {
            addCriterion("OLDNO <=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoIn(List<Long> values) {
            addCriterion("OLDNO in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotIn(List<Long> values) {
            addCriterion("OLDNO not in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoBetween(Long value1, Long value2) {
            addCriterion("OLDNO between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotBetween(Long value1, Long value2) {
            addCriterion("OLDNO not between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNull() {
            addCriterion("NEWNO is null");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNotNull() {
            addCriterion("NEWNO is not null");
            return (Criteria) this;
        }

        public Criteria andNewnoEqualTo(Long value) {
            addCriterion("NEWNO =", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotEqualTo(Long value) {
            addCriterion("NEWNO <>", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThan(Long value) {
            addCriterion("NEWNO >", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWNO >=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThan(Long value) {
            addCriterion("NEWNO <", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThanOrEqualTo(Long value) {
            addCriterion("NEWNO <=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoIn(List<Long> values) {
            addCriterion("NEWNO in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotIn(List<Long> values) {
            addCriterion("NEWNO not in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoBetween(Long value1, Long value2) {
            addCriterion("NEWNO between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotBetween(Long value1, Long value2) {
            addCriterion("NEWNO not between", value1, value2, "newno");
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

        public Criteria andFathernoEqualTo(Long value) {
            addCriterion("FATHERNO =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(Long value) {
            addCriterion("FATHERNO <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(Long value) {
            addCriterion("FATHERNO >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(Long value) {
            addCriterion("FATHERNO >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(Long value) {
            addCriterion("FATHERNO <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(Long value) {
            addCriterion("FATHERNO <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<Long> values) {
            addCriterion("FATHERNO in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<Long> values) {
            addCriterion("FATHERNO not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(Long value1, Long value2) {
            addCriterion("FATHERNO between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(Long value1, Long value2) {
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

        public Criteria andSonnoEqualTo(Long value) {
            addCriterion("SONNO =", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotEqualTo(Long value) {
            addCriterion("SONNO <>", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThan(Long value) {
            addCriterion("SONNO >", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SONNO >=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThan(Long value) {
            addCriterion("SONNO <", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThanOrEqualTo(Long value) {
            addCriterion("SONNO <=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoIn(List<Long> values) {
            addCriterion("SONNO in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotIn(List<Long> values) {
            addCriterion("SONNO not in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoBetween(Long value1, Long value2) {
            addCriterion("SONNO between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotBetween(Long value1, Long value2) {
            addCriterion("SONNO not between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNull() {
            addCriterion("BUSINESSONE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNotNull() {
            addCriterion("BUSINESSONE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneEqualTo(String value) {
            addCriterion("BUSINESSONE =", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotEqualTo(String value) {
            addCriterion("BUSINESSONE <>", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThan(String value) {
            addCriterion("BUSINESSONE >", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE >=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThan(String value) {
            addCriterion("BUSINESSONE <", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE <=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLike(String value) {
            addCriterion("BUSINESSONE like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotLike(String value) {
            addCriterion("BUSINESSONE not like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIn(List<String> values) {
            addCriterion("BUSINESSONE in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotIn(List<String> values) {
            addCriterion("BUSINESSONE not in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneBetween(String value1, String value2) {
            addCriterion("BUSINESSONE between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotBetween(String value1, String value2) {
            addCriterion("BUSINESSONE not between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNull() {
            addCriterion("BUSINESSTWO is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNotNull() {
            addCriterion("BUSINESSTWO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoEqualTo(String value) {
            addCriterion("BUSINESSTWO =", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotEqualTo(String value) {
            addCriterion("BUSINESSTWO <>", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThan(String value) {
            addCriterion("BUSINESSTWO >", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO >=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThan(String value) {
            addCriterion("BUSINESSTWO <", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO <=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLike(String value) {
            addCriterion("BUSINESSTWO like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotLike(String value) {
            addCriterion("BUSINESSTWO not like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIn(List<String> values) {
            addCriterion("BUSINESSTWO in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotIn(List<String> values) {
            addCriterion("BUSINESSTWO not in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO not between", value1, value2, "businesstwo");
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

        public Criteria andOpcode2IsNull() {
            addCriterion("OPCODE2 is null");
            return (Criteria) this;
        }

        public Criteria andOpcode2IsNotNull() {
            addCriterion("OPCODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andOpcode2EqualTo(String value) {
            addCriterion("OPCODE2 =", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2NotEqualTo(String value) {
            addCriterion("OPCODE2 <>", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2GreaterThan(String value) {
            addCriterion("OPCODE2 >", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2GreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE2 >=", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2LessThan(String value) {
            addCriterion("OPCODE2 <", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2LessThanOrEqualTo(String value) {
            addCriterion("OPCODE2 <=", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2Like(String value) {
            addCriterion("OPCODE2 like", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2NotLike(String value) {
            addCriterion("OPCODE2 not like", value, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2In(List<String> values) {
            addCriterion("OPCODE2 in", values, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2NotIn(List<String> values) {
            addCriterion("OPCODE2 not in", values, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2Between(String value1, String value2) {
            addCriterion("OPCODE2 between", value1, value2, "opcode2");
            return (Criteria) this;
        }

        public Criteria andOpcode2NotBetween(String value1, String value2) {
            addCriterion("OPCODE2 not between", value1, value2, "opcode2");
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

        public Criteria andDepartmentnameIsNull() {
            addCriterion("DEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("DEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("DEPARTMENTNAME =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("DEPARTMENTNAME >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("DEPARTMENTNAME <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("DEPARTMENTNAME like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("DEPARTMENTNAME not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("DEPARTMENTNAME in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("DEPARTMENTNAME not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME not between", value1, value2, "departmentname");
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

        public Criteria andRisktypeIsNull() {
            addCriterion("RISKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("RISKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("RISKTYPE =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("RISKTYPE <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("RISKTYPE >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKTYPE >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("RISKTYPE <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("RISKTYPE <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("RISKTYPE like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("RISKTYPE not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("RISKTYPE in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("RISKTYPE not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("RISKTYPE between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("RISKTYPE not between", value1, value2, "risktype");
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

        public Criteria andReturnnoIsNull() {
            addCriterion("RETURNNO is null");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNotNull() {
            addCriterion("RETURNNO is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnoEqualTo(String value) {
            addCriterion("RETURNNO =", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotEqualTo(String value) {
            addCriterion("RETURNNO <>", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThan(String value) {
            addCriterion("RETURNNO >", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNNO >=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThan(String value) {
            addCriterion("RETURNNO <", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThanOrEqualTo(String value) {
            addCriterion("RETURNNO <=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLike(String value) {
            addCriterion("RETURNNO like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotLike(String value) {
            addCriterion("RETURNNO not like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIn(List<String> values) {
            addCriterion("RETURNNO in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotIn(List<String> values) {
            addCriterion("RETURNNO not in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoBetween(String value1, String value2) {
            addCriterion("RETURNNO between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotBetween(String value1, String value2) {
            addCriterion("RETURNNO not between", value1, value2, "returnno");
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

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE not between", value1, value2, "checkdate");
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

        public Criteria andAuditdateIsNull() {
            addCriterion("AUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITDATE =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITDATE <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterionForJDBCDate("AUDITDATE >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITDATE >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterionForJDBCDate("AUDITDATE <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITDATE <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterionForJDBCDate("AUDITDATE in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AUDITDATE not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AUDITDATE between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AUDITDATE not between", value1, value2, "auditdate");
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

        public Criteria andTosubcompanyIsNull() {
            addCriterion("TOSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIsNotNull() {
            addCriterion("TOSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyEqualTo(String value) {
            addCriterion("TOSUBCOMPANY =", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <>", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThan(String value) {
            addCriterion("TOSUBCOMPANY >", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY >=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThan(String value) {
            addCriterion("TOSUBCOMPANY <", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLessThanOrEqualTo(String value) {
            addCriterion("TOSUBCOMPANY <=", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyLike(String value) {
            addCriterion("TOSUBCOMPANY like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotLike(String value) {
            addCriterion("TOSUBCOMPANY not like", value, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyIn(List<String> values) {
            addCriterion("TOSUBCOMPANY in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotIn(List<String> values) {
            addCriterion("TOSUBCOMPANY not in", values, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY between", value1, value2, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andTosubcompanyNotBetween(String value1, String value2) {
            addCriterion("TOSUBCOMPANY not between", value1, value2, "tosubcompany");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidIsNull() {
            addCriterion("SPLITBATCHID is null");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidIsNotNull() {
            addCriterion("SPLITBATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidEqualTo(BigDecimal value) {
            addCriterion("SPLITBATCHID =", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidNotEqualTo(BigDecimal value) {
            addCriterion("SPLITBATCHID <>", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidGreaterThan(BigDecimal value) {
            addCriterion("SPLITBATCHID >", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPLITBATCHID >=", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidLessThan(BigDecimal value) {
            addCriterion("SPLITBATCHID <", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPLITBATCHID <=", value, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidIn(List<BigDecimal> values) {
            addCriterion("SPLITBATCHID in", values, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidNotIn(List<BigDecimal> values) {
            addCriterion("SPLITBATCHID not in", values, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPLITBATCHID between", value1, value2, "splitbatchid");
            return (Criteria) this;
        }

        public Criteria andSplitbatchidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPLITBATCHID not between", value1, value2, "splitbatchid");
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

        public Criteria andBillcodeIsNull() {
            addCriterion("BILLCODE is null");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNotNull() {
            addCriterion("BILLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillcodeEqualTo(String value) {
            addCriterion("BILLCODE =", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotEqualTo(String value) {
            addCriterion("BILLCODE <>", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThan(String value) {
            addCriterion("BILLCODE >", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLCODE >=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThan(String value) {
            addCriterion("BILLCODE <", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThanOrEqualTo(String value) {
            addCriterion("BILLCODE <=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLike(String value) {
            addCriterion("BILLCODE like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotLike(String value) {
            addCriterion("BILLCODE not like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeIn(List<String> values) {
            addCriterion("BILLCODE in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotIn(List<String> values) {
            addCriterion("BILLCODE not in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeBetween(String value1, String value2) {
            addCriterion("BILLCODE between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotBetween(String value1, String value2) {
            addCriterion("BILLCODE not between", value1, value2, "billcode");
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

        public Criteria andCorednoIsNull() {
            addCriterion("COREDNO is null");
            return (Criteria) this;
        }

        public Criteria andCorednoIsNotNull() {
            addCriterion("COREDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCorednoEqualTo(BigDecimal value) {
            addCriterion("COREDNO =", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoNotEqualTo(BigDecimal value) {
            addCriterion("COREDNO <>", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoGreaterThan(BigDecimal value) {
            addCriterion("COREDNO >", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COREDNO >=", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoLessThan(BigDecimal value) {
            addCriterion("COREDNO <", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COREDNO <=", value, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoIn(List<BigDecimal> values) {
            addCriterion("COREDNO in", values, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoNotIn(List<BigDecimal> values) {
            addCriterion("COREDNO not in", values, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COREDNO between", value1, value2, "coredno");
            return (Criteria) this;
        }

        public Criteria andCorednoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COREDNO not between", value1, value2, "coredno");
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

        public Criteria andCocurrencycodeIsNull() {
            addCriterion("COCURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeIsNotNull() {
            addCriterion("COCURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeEqualTo(String value) {
            addCriterion("COCURRENCYCODE =", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotEqualTo(String value) {
            addCriterion("COCURRENCYCODE <>", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeGreaterThan(String value) {
            addCriterion("COCURRENCYCODE >", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("COCURRENCYCODE >=", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLessThan(String value) {
            addCriterion("COCURRENCYCODE <", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("COCURRENCYCODE <=", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeLike(String value) {
            addCriterion("COCURRENCYCODE like", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotLike(String value) {
            addCriterion("COCURRENCYCODE not like", value, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeIn(List<String> values) {
            addCriterion("COCURRENCYCODE in", values, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotIn(List<String> values) {
            addCriterion("COCURRENCYCODE not in", values, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeBetween(String value1, String value2) {
            addCriterion("COCURRENCYCODE between", value1, value2, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCocurrencycodeNotBetween(String value1, String value2) {
            addCriterion("COCURRENCYCODE not between", value1, value2, "cocurrencycode");
            return (Criteria) this;
        }

        public Criteria andCoamountIsNull() {
            addCriterion("COAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCoamountIsNotNull() {
            addCriterion("COAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCoamountEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT =", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT <>", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountGreaterThan(BigDecimal value) {
            addCriterion("COAMOUNT >", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT >=", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountLessThan(BigDecimal value) {
            addCriterion("COAMOUNT <", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COAMOUNT <=", value, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountIn(List<BigDecimal> values) {
            addCriterion("COAMOUNT in", values, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotIn(List<BigDecimal> values) {
            addCriterion("COAMOUNT not in", values, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COAMOUNT between", value1, value2, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COAMOUNT not between", value1, value2, "coamount");
            return (Criteria) this;
        }

        public Criteria andCoarateIsNull() {
            addCriterion("COARATE is null");
            return (Criteria) this;
        }

        public Criteria andCoarateIsNotNull() {
            addCriterion("COARATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoarateEqualTo(BigDecimal value) {
            addCriterion("COARATE =", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotEqualTo(BigDecimal value) {
            addCriterion("COARATE <>", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateGreaterThan(BigDecimal value) {
            addCriterion("COARATE >", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COARATE >=", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateLessThan(BigDecimal value) {
            addCriterion("COARATE <", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COARATE <=", value, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateIn(List<BigDecimal> values) {
            addCriterion("COARATE in", values, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotIn(List<BigDecimal> values) {
            addCriterion("COARATE not in", values, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COARATE between", value1, value2, "coarate");
            return (Criteria) this;
        }

        public Criteria andCoarateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COARATE not between", value1, value2, "coarate");
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

        public Criteria andSettlementtypeIsNull() {
            addCriterion("SETTLEMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIsNotNull() {
            addCriterion("SETTLEMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE =", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE <>", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThan(String value) {
            addCriterion("SETTLEMENTTYPE >", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE >=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThan(String value) {
            addCriterion("SETTLEMENTTYPE <", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENTTYPE <=", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeLike(String value) {
            addCriterion("SETTLEMENTTYPE like", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotLike(String value) {
            addCriterion("SETTLEMENTTYPE not like", value, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeIn(List<String> values) {
            addCriterion("SETTLEMENTTYPE in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotIn(List<String> values) {
            addCriterion("SETTLEMENTTYPE not in", values, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeBetween(String value1, String value2) {
            addCriterion("SETTLEMENTTYPE between", value1, value2, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andSettlementtypeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENTTYPE not between", value1, value2, "settlementtype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeIsNull() {
            addCriterion("CANCELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCanceltypeIsNotNull() {
            addCriterion("CANCELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltypeEqualTo(String value) {
            addCriterion("CANCELTYPE =", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeNotEqualTo(String value) {
            addCriterion("CANCELTYPE <>", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeGreaterThan(String value) {
            addCriterion("CANCELTYPE >", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELTYPE >=", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeLessThan(String value) {
            addCriterion("CANCELTYPE <", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeLessThanOrEqualTo(String value) {
            addCriterion("CANCELTYPE <=", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeLike(String value) {
            addCriterion("CANCELTYPE like", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeNotLike(String value) {
            addCriterion("CANCELTYPE not like", value, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeIn(List<String> values) {
            addCriterion("CANCELTYPE in", values, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeNotIn(List<String> values) {
            addCriterion("CANCELTYPE not in", values, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeBetween(String value1, String value2) {
            addCriterion("CANCELTYPE between", value1, value2, "canceltype");
            return (Criteria) this;
        }

        public Criteria andCanceltypeNotBetween(String value1, String value2) {
            addCriterion("CANCELTYPE not between", value1, value2, "canceltype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeIsNull() {
            addCriterion("SUMMARYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSummarytypeIsNotNull() {
            addCriterion("SUMMARYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSummarytypeEqualTo(String value) {
            addCriterion("SUMMARYTYPE =", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeNotEqualTo(String value) {
            addCriterion("SUMMARYTYPE <>", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeGreaterThan(String value) {
            addCriterion("SUMMARYTYPE >", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARYTYPE >=", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeLessThan(String value) {
            addCriterion("SUMMARYTYPE <", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeLessThanOrEqualTo(String value) {
            addCriterion("SUMMARYTYPE <=", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeLike(String value) {
            addCriterion("SUMMARYTYPE like", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeNotLike(String value) {
            addCriterion("SUMMARYTYPE not like", value, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeIn(List<String> values) {
            addCriterion("SUMMARYTYPE in", values, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeNotIn(List<String> values) {
            addCriterion("SUMMARYTYPE not in", values, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeBetween(String value1, String value2) {
            addCriterion("SUMMARYTYPE between", value1, value2, "summarytype");
            return (Criteria) this;
        }

        public Criteria andSummarytypeNotBetween(String value1, String value2) {
            addCriterion("SUMMARYTYPE not between", value1, value2, "summarytype");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIsNull() {
            addCriterion("NEWDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIsNotNull() {
            addCriterion("NEWDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoEqualTo(Long value) {
            addCriterion("NEWDETAILNO =", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotEqualTo(Long value) {
            addCriterion("NEWDETAILNO <>", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoGreaterThan(Long value) {
            addCriterion("NEWDETAILNO >", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWDETAILNO >=", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoLessThan(Long value) {
            addCriterion("NEWDETAILNO <", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoLessThanOrEqualTo(Long value) {
            addCriterion("NEWDETAILNO <=", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIn(List<Long> values) {
            addCriterion("NEWDETAILNO in", values, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotIn(List<Long> values) {
            addCriterion("NEWDETAILNO not in", values, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoBetween(Long value1, Long value2) {
            addCriterion("NEWDETAILNO between", value1, value2, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotBetween(Long value1, Long value2) {
            addCriterion("NEWDETAILNO not between", value1, value2, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIsNull() {
            addCriterion("OLDDETAILNO is null");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIsNotNull() {
            addCriterion("OLDDETAILNO is not null");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoEqualTo(Long value) {
            addCriterion("OLDDETAILNO =", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotEqualTo(Long value) {
            addCriterion("OLDDETAILNO <>", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoGreaterThan(Long value) {
            addCriterion("OLDDETAILNO >", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoGreaterThanOrEqualTo(Long value) {
            addCriterion("OLDDETAILNO >=", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoLessThan(Long value) {
            addCriterion("OLDDETAILNO <", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoLessThanOrEqualTo(Long value) {
            addCriterion("OLDDETAILNO <=", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIn(List<Long> values) {
            addCriterion("OLDDETAILNO in", values, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotIn(List<Long> values) {
            addCriterion("OLDDETAILNO not in", values, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoBetween(Long value1, Long value2) {
            addCriterion("OLDDETAILNO between", value1, value2, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotBetween(Long value1, Long value2) {
            addCriterion("OLDDETAILNO not between", value1, value2, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("PAYCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("PAYCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("PAYCHANNEL =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("PAYCHANNEL <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("PAYCHANNEL >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("PAYCHANNEL <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("PAYCHANNEL <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("PAYCHANNEL like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("PAYCHANNEL not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("PAYCHANNEL in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("PAYCHANNEL not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("PAYCHANNEL not between", value1, value2, "paychannel");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_paymentin_events_tddel
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
     * @Table : mm_paymentin_events_tddel
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