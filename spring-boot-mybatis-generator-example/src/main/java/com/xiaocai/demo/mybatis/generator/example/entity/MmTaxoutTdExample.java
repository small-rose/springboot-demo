package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmTaxoutTdExample {
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
    public MmTaxoutTdExample() {
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
     * @Table : mm_taxout_td
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

        public Criteria andSeqtaxoutIsNull() {
            addCriterion("seqtaxout is null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutIsNotNull() {
            addCriterion("seqtaxout is not null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutEqualTo(String value) {
            addCriterion("seqtaxout =", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutNotEqualTo(String value) {
            addCriterion("seqtaxout <>", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutGreaterThan(String value) {
            addCriterion("seqtaxout >", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutGreaterThanOrEqualTo(String value) {
            addCriterion("seqtaxout >=", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutLessThan(String value) {
            addCriterion("seqtaxout <", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutLessThanOrEqualTo(String value) {
            addCriterion("seqtaxout <=", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutLike(String value) {
            addCriterion("seqtaxout like", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutNotLike(String value) {
            addCriterion("seqtaxout not like", value, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutIn(List<String> values) {
            addCriterion("seqtaxout in", values, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutNotIn(List<String> values) {
            addCriterion("seqtaxout not in", values, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutBetween(String value1, String value2) {
            addCriterion("seqtaxout between", value1, value2, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andSeqtaxoutNotBetween(String value1, String value2) {
            addCriterion("seqtaxout not between", value1, value2, "seqtaxout");
            return (Criteria) this;
        }

        public Criteria andBsqdhIsNull() {
            addCriterion("bsqdh is null");
            return (Criteria) this;
        }

        public Criteria andBsqdhIsNotNull() {
            addCriterion("bsqdh is not null");
            return (Criteria) this;
        }

        public Criteria andBsqdhEqualTo(String value) {
            addCriterion("bsqdh =", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhNotEqualTo(String value) {
            addCriterion("bsqdh <>", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhGreaterThan(String value) {
            addCriterion("bsqdh >", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhGreaterThanOrEqualTo(String value) {
            addCriterion("bsqdh >=", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhLessThan(String value) {
            addCriterion("bsqdh <", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhLessThanOrEqualTo(String value) {
            addCriterion("bsqdh <=", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhLike(String value) {
            addCriterion("bsqdh like", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhNotLike(String value) {
            addCriterion("bsqdh not like", value, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhIn(List<String> values) {
            addCriterion("bsqdh in", values, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhNotIn(List<String> values) {
            addCriterion("bsqdh not in", values, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhBetween(String value1, String value2) {
            addCriterion("bsqdh between", value1, value2, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andBsqdhNotBetween(String value1, String value2) {
            addCriterion("bsqdh not between", value1, value2, "bsqdh");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subcompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subcompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subcompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subcompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subcompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subcompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subcompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subcompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subcompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subcompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subcompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subcompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subcompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subcompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("basecurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("basecurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("basecurrencycode =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("basecurrencycode <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("basecurrencycode >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("basecurrencycode >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("basecurrencycode <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("basecurrencycode <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("basecurrencycode like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("basecurrencycode not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("basecurrencycode in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("basecurrencycode not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("basecurrencycode between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("basecurrencycode not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeIsNull() {
            addCriterion("bsdepartmentcode is null");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeIsNotNull() {
            addCriterion("bsdepartmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeEqualTo(String value) {
            addCriterion("bsdepartmentcode =", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeNotEqualTo(String value) {
            addCriterion("bsdepartmentcode <>", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeGreaterThan(String value) {
            addCriterion("bsdepartmentcode >", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bsdepartmentcode >=", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeLessThan(String value) {
            addCriterion("bsdepartmentcode <", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("bsdepartmentcode <=", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeLike(String value) {
            addCriterion("bsdepartmentcode like", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeNotLike(String value) {
            addCriterion("bsdepartmentcode not like", value, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeIn(List<String> values) {
            addCriterion("bsdepartmentcode in", values, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeNotIn(List<String> values) {
            addCriterion("bsdepartmentcode not in", values, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeBetween(String value1, String value2) {
            addCriterion("bsdepartmentcode between", value1, value2, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andBsdepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("bsdepartmentcode not between", value1, value2, "bsdepartmentcode");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("opdate is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("opdate is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("opdate =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("opdate <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("opdate >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opdate >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("opdate <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opdate <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("opdate in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("opdate not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opdate between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opdate not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andBsdateIsNull() {
            addCriterion("bsdate is null");
            return (Criteria) this;
        }

        public Criteria andBsdateIsNotNull() {
            addCriterion("bsdate is not null");
            return (Criteria) this;
        }

        public Criteria andBsdateEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate =", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate <>", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateGreaterThan(Date value) {
            addCriterionForJDBCDate("bsdate >", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate >=", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateLessThan(Date value) {
            addCriterionForJDBCDate("bsdate <", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate <=", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateIn(List<Date> values) {
            addCriterionForJDBCDate("bsdate in", values, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bsdate not in", values, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bsdate between", value1, value2, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bsdate not between", value1, value2, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateIsNull() {
            addCriterion("bsqdstate is null");
            return (Criteria) this;
        }

        public Criteria andBsqdstateIsNotNull() {
            addCriterion("bsqdstate is not null");
            return (Criteria) this;
        }

        public Criteria andBsqdstateEqualTo(String value) {
            addCriterion("bsqdstate =", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateNotEqualTo(String value) {
            addCriterion("bsqdstate <>", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateGreaterThan(String value) {
            addCriterion("bsqdstate >", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateGreaterThanOrEqualTo(String value) {
            addCriterion("bsqdstate >=", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateLessThan(String value) {
            addCriterion("bsqdstate <", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateLessThanOrEqualTo(String value) {
            addCriterion("bsqdstate <=", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateLike(String value) {
            addCriterion("bsqdstate like", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateNotLike(String value) {
            addCriterion("bsqdstate not like", value, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateIn(List<String> values) {
            addCriterion("bsqdstate in", values, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateNotIn(List<String> values) {
            addCriterion("bsqdstate not in", values, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateBetween(String value1, String value2) {
            addCriterion("bsqdstate between", value1, value2, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andBsqdstateNotBetween(String value1, String value2) {
            addCriterion("bsqdstate not between", value1, value2, "bsqdstate");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("opcode is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("opcode is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("opcode =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("opcode <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("opcode >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opcode >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("opcode <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("opcode <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("opcode like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("opcode not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("opcode in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("opcode not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("opcode between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("opcode not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andSbjeIsNull() {
            addCriterion("sbje is null");
            return (Criteria) this;
        }

        public Criteria andSbjeIsNotNull() {
            addCriterion("sbje is not null");
            return (Criteria) this;
        }

        public Criteria andSbjeEqualTo(BigDecimal value) {
            addCriterion("sbje =", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeNotEqualTo(BigDecimal value) {
            addCriterion("sbje <>", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeGreaterThan(BigDecimal value) {
            addCriterion("sbje >", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sbje >=", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeLessThan(BigDecimal value) {
            addCriterion("sbje <", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sbje <=", value, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeIn(List<BigDecimal> values) {
            addCriterion("sbje in", values, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeNotIn(List<BigDecimal> values) {
            addCriterion("sbje not in", values, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sbje between", value1, value2, "sbje");
            return (Criteria) this;
        }

        public Criteria andSbjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sbje not between", value1, value2, "sbje");
            return (Criteria) this;
        }

        public Criteria andDjvehnumIsNull() {
            addCriterion("djvehnum is null");
            return (Criteria) this;
        }

        public Criteria andDjvehnumIsNotNull() {
            addCriterion("djvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andDjvehnumEqualTo(Long value) {
            addCriterion("djvehnum =", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumNotEqualTo(Long value) {
            addCriterion("djvehnum <>", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumGreaterThan(Long value) {
            addCriterion("djvehnum >", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("djvehnum >=", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumLessThan(Long value) {
            addCriterion("djvehnum <", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumLessThanOrEqualTo(Long value) {
            addCriterion("djvehnum <=", value, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumIn(List<Long> values) {
            addCriterion("djvehnum in", values, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumNotIn(List<Long> values) {
            addCriterion("djvehnum not in", values, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumBetween(Long value1, Long value2) {
            addCriterion("djvehnum between", value1, value2, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andDjvehnumNotBetween(Long value1, Long value2) {
            addCriterion("djvehnum not between", value1, value2, "djvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumIsNull() {
            addCriterion("rejvehnum is null");
            return (Criteria) this;
        }

        public Criteria andRejvehnumIsNotNull() {
            addCriterion("rejvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andRejvehnumEqualTo(Long value) {
            addCriterion("rejvehnum =", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumNotEqualTo(Long value) {
            addCriterion("rejvehnum <>", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumGreaterThan(Long value) {
            addCriterion("rejvehnum >", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("rejvehnum >=", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumLessThan(Long value) {
            addCriterion("rejvehnum <", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumLessThanOrEqualTo(Long value) {
            addCriterion("rejvehnum <=", value, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumIn(List<Long> values) {
            addCriterion("rejvehnum in", values, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumNotIn(List<Long> values) {
            addCriterion("rejvehnum not in", values, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumBetween(Long value1, Long value2) {
            addCriterion("rejvehnum between", value1, value2, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andRejvehnumNotBetween(Long value1, Long value2) {
            addCriterion("rejvehnum not between", value1, value2, "rejvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumIsNull() {
            addCriterion("jsvehnum is null");
            return (Criteria) this;
        }

        public Criteria andJsvehnumIsNotNull() {
            addCriterion("jsvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andJsvehnumEqualTo(Long value) {
            addCriterion("jsvehnum =", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumNotEqualTo(Long value) {
            addCriterion("jsvehnum <>", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumGreaterThan(Long value) {
            addCriterion("jsvehnum >", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("jsvehnum >=", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumLessThan(Long value) {
            addCriterion("jsvehnum <", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumLessThanOrEqualTo(Long value) {
            addCriterion("jsvehnum <=", value, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumIn(List<Long> values) {
            addCriterion("jsvehnum in", values, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumNotIn(List<Long> values) {
            addCriterion("jsvehnum not in", values, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumBetween(Long value1, Long value2) {
            addCriterion("jsvehnum between", value1, value2, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andJsvehnumNotBetween(Long value1, Long value2) {
            addCriterion("jsvehnum not between", value1, value2, "jsvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumIsNull() {
            addCriterion("msvehnum is null");
            return (Criteria) this;
        }

        public Criteria andMsvehnumIsNotNull() {
            addCriterion("msvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andMsvehnumEqualTo(Long value) {
            addCriterion("msvehnum =", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumNotEqualTo(Long value) {
            addCriterion("msvehnum <>", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumGreaterThan(Long value) {
            addCriterion("msvehnum >", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("msvehnum >=", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumLessThan(Long value) {
            addCriterion("msvehnum <", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumLessThanOrEqualTo(Long value) {
            addCriterion("msvehnum <=", value, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumIn(List<Long> values) {
            addCriterion("msvehnum in", values, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumNotIn(List<Long> values) {
            addCriterion("msvehnum not in", values, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumBetween(Long value1, Long value2) {
            addCriterion("msvehnum between", value1, value2, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andMsvehnumNotBetween(Long value1, Long value2) {
            addCriterion("msvehnum not between", value1, value2, "msvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumIsNull() {
            addCriterion("wsvehnum is null");
            return (Criteria) this;
        }

        public Criteria andWsvehnumIsNotNull() {
            addCriterion("wsvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andWsvehnumEqualTo(Long value) {
            addCriterion("wsvehnum =", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumNotEqualTo(Long value) {
            addCriterion("wsvehnum <>", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumGreaterThan(Long value) {
            addCriterion("wsvehnum >", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("wsvehnum >=", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumLessThan(Long value) {
            addCriterion("wsvehnum <", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumLessThanOrEqualTo(Long value) {
            addCriterion("wsvehnum <=", value, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumIn(List<Long> values) {
            addCriterion("wsvehnum in", values, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumNotIn(List<Long> values) {
            addCriterion("wsvehnum not in", values, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumBetween(Long value1, Long value2) {
            addCriterion("wsvehnum between", value1, value2, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andWsvehnumNotBetween(Long value1, Long value2) {
            addCriterion("wsvehnum not between", value1, value2, "wsvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumIsNull() {
            addCriterion("bjvehnum is null");
            return (Criteria) this;
        }

        public Criteria andBjvehnumIsNotNull() {
            addCriterion("bjvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andBjvehnumEqualTo(Long value) {
            addCriterion("bjvehnum =", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumNotEqualTo(Long value) {
            addCriterion("bjvehnum <>", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumGreaterThan(Long value) {
            addCriterion("bjvehnum >", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("bjvehnum >=", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumLessThan(Long value) {
            addCriterion("bjvehnum <", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumLessThanOrEqualTo(Long value) {
            addCriterion("bjvehnum <=", value, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumIn(List<Long> values) {
            addCriterion("bjvehnum in", values, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumNotIn(List<Long> values) {
            addCriterion("bjvehnum not in", values, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumBetween(Long value1, Long value2) {
            addCriterion("bjvehnum between", value1, value2, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andBjvehnumNotBetween(Long value1, Long value2) {
            addCriterion("bjvehnum not between", value1, value2, "bjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumIsNull() {
            addCriterion("znjvehnum is null");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumIsNotNull() {
            addCriterion("znjvehnum is not null");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumEqualTo(Long value) {
            addCriterion("znjvehnum =", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumNotEqualTo(Long value) {
            addCriterion("znjvehnum <>", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumGreaterThan(Long value) {
            addCriterion("znjvehnum >", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumGreaterThanOrEqualTo(Long value) {
            addCriterion("znjvehnum >=", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumLessThan(Long value) {
            addCriterion("znjvehnum <", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumLessThanOrEqualTo(Long value) {
            addCriterion("znjvehnum <=", value, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumIn(List<Long> values) {
            addCriterion("znjvehnum in", values, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumNotIn(List<Long> values) {
            addCriterion("znjvehnum not in", values, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumBetween(Long value1, Long value2) {
            addCriterion("znjvehnum between", value1, value2, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andZnjvehnumNotBetween(Long value1, Long value2) {
            addCriterion("znjvehnum not between", value1, value2, "znjvehnum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumIsNull() {
            addCriterion("yeartaxpaysum is null");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumIsNotNull() {
            addCriterion("yeartaxpaysum is not null");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumEqualTo(BigDecimal value) {
            addCriterion("yeartaxpaysum =", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumNotEqualTo(BigDecimal value) {
            addCriterion("yeartaxpaysum <>", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumGreaterThan(BigDecimal value) {
            addCriterion("yeartaxpaysum >", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartaxpaysum >=", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumLessThan(BigDecimal value) {
            addCriterion("yeartaxpaysum <", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartaxpaysum <=", value, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumIn(List<BigDecimal> values) {
            addCriterion("yeartaxpaysum in", values, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumNotIn(List<BigDecimal> values) {
            addCriterion("yeartaxpaysum not in", values, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartaxpaysum between", value1, value2, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYeartaxpaysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartaxpaysum not between", value1, value2, "yeartaxpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumIsNull() {
            addCriterion("yearrealpaysum is null");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumIsNotNull() {
            addCriterion("yearrealpaysum is not null");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumEqualTo(BigDecimal value) {
            addCriterion("yearrealpaysum =", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumNotEqualTo(BigDecimal value) {
            addCriterion("yearrealpaysum <>", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumGreaterThan(BigDecimal value) {
            addCriterion("yearrealpaysum >", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yearrealpaysum >=", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumLessThan(BigDecimal value) {
            addCriterion("yearrealpaysum <", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yearrealpaysum <=", value, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumIn(List<BigDecimal> values) {
            addCriterion("yearrealpaysum in", values, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumNotIn(List<BigDecimal> values) {
            addCriterion("yearrealpaysum not in", values, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yearrealpaysum between", value1, value2, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andYearrealpaysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yearrealpaysum not between", value1, value2, "yearrealpaysum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumIsNull() {
            addCriterion("lasyearynbjsum is null");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumIsNotNull() {
            addCriterion("lasyearynbjsum is not null");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumEqualTo(BigDecimal value) {
            addCriterion("lasyearynbjsum =", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumNotEqualTo(BigDecimal value) {
            addCriterion("lasyearynbjsum <>", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumGreaterThan(BigDecimal value) {
            addCriterion("lasyearynbjsum >", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearynbjsum >=", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumLessThan(BigDecimal value) {
            addCriterion("lasyearynbjsum <", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearynbjsum <=", value, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumIn(List<BigDecimal> values) {
            addCriterion("lasyearynbjsum in", values, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumNotIn(List<BigDecimal> values) {
            addCriterion("lasyearynbjsum not in", values, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearynbjsum between", value1, value2, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynbjsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearynbjsum not between", value1, value2, "lasyearynbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumIsNull() {
            addCriterion("lasyearsnbjsum is null");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumIsNotNull() {
            addCriterion("lasyearsnbjsum is not null");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumEqualTo(BigDecimal value) {
            addCriterion("lasyearsnbjsum =", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumNotEqualTo(BigDecimal value) {
            addCriterion("lasyearsnbjsum <>", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumGreaterThan(BigDecimal value) {
            addCriterion("lasyearsnbjsum >", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearsnbjsum >=", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumLessThan(BigDecimal value) {
            addCriterion("lasyearsnbjsum <", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearsnbjsum <=", value, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumIn(List<BigDecimal> values) {
            addCriterion("lasyearsnbjsum in", values, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumNotIn(List<BigDecimal> values) {
            addCriterion("lasyearsnbjsum not in", values, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearsnbjsum between", value1, value2, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnbjsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearsnbjsum not between", value1, value2, "lasyearsnbjsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumIsNull() {
            addCriterion("lasyearynznsum is null");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumIsNotNull() {
            addCriterion("lasyearynznsum is not null");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumEqualTo(BigDecimal value) {
            addCriterion("lasyearynznsum =", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumNotEqualTo(BigDecimal value) {
            addCriterion("lasyearynznsum <>", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumGreaterThan(BigDecimal value) {
            addCriterion("lasyearynznsum >", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearynznsum >=", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumLessThan(BigDecimal value) {
            addCriterion("lasyearynznsum <", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearynznsum <=", value, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumIn(List<BigDecimal> values) {
            addCriterion("lasyearynznsum in", values, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumNotIn(List<BigDecimal> values) {
            addCriterion("lasyearynznsum not in", values, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearynznsum between", value1, value2, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearynznsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearynznsum not between", value1, value2, "lasyearynznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumIsNull() {
            addCriterion("lasyearsnznsum is null");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumIsNotNull() {
            addCriterion("lasyearsnznsum is not null");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumEqualTo(BigDecimal value) {
            addCriterion("lasyearsnznsum =", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumNotEqualTo(BigDecimal value) {
            addCriterion("lasyearsnznsum <>", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumGreaterThan(BigDecimal value) {
            addCriterion("lasyearsnznsum >", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearsnznsum >=", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumLessThan(BigDecimal value) {
            addCriterion("lasyearsnznsum <", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lasyearsnznsum <=", value, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumIn(List<BigDecimal> values) {
            addCriterion("lasyearsnznsum in", values, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumNotIn(List<BigDecimal> values) {
            addCriterion("lasyearsnznsum not in", values, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearsnznsum between", value1, value2, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andLasyearsnznsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lasyearsnznsum not between", value1, value2, "lasyearsnznsum");
            return (Criteria) this;
        }

        public Criteria andSbrjdhIsNull() {
            addCriterion("sbrjdh is null");
            return (Criteria) this;
        }

        public Criteria andSbrjdhIsNotNull() {
            addCriterion("sbrjdh is not null");
            return (Criteria) this;
        }

        public Criteria andSbrjdhEqualTo(String value) {
            addCriterion("sbrjdh =", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhNotEqualTo(String value) {
            addCriterion("sbrjdh <>", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhGreaterThan(String value) {
            addCriterion("sbrjdh >", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhGreaterThanOrEqualTo(String value) {
            addCriterion("sbrjdh >=", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhLessThan(String value) {
            addCriterion("sbrjdh <", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhLessThanOrEqualTo(String value) {
            addCriterion("sbrjdh <=", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhLike(String value) {
            addCriterion("sbrjdh like", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhNotLike(String value) {
            addCriterion("sbrjdh not like", value, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhIn(List<String> values) {
            addCriterion("sbrjdh in", values, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhNotIn(List<String> values) {
            addCriterion("sbrjdh not in", values, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhBetween(String value1, String value2) {
            addCriterion("sbrjdh between", value1, value2, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andSbrjdhNotBetween(String value1, String value2) {
            addCriterion("sbrjdh not between", value1, value2, "sbrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhIsNull() {
            addCriterion("jjrjdh is null");
            return (Criteria) this;
        }

        public Criteria andJjrjdhIsNotNull() {
            addCriterion("jjrjdh is not null");
            return (Criteria) this;
        }

        public Criteria andJjrjdhEqualTo(String value) {
            addCriterion("jjrjdh =", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhNotEqualTo(String value) {
            addCriterion("jjrjdh <>", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhGreaterThan(String value) {
            addCriterion("jjrjdh >", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhGreaterThanOrEqualTo(String value) {
            addCriterion("jjrjdh >=", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhLessThan(String value) {
            addCriterion("jjrjdh <", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhLessThanOrEqualTo(String value) {
            addCriterion("jjrjdh <=", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhLike(String value) {
            addCriterion("jjrjdh like", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhNotLike(String value) {
            addCriterion("jjrjdh not like", value, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhIn(List<String> values) {
            addCriterion("jjrjdh in", values, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhNotIn(List<String> values) {
            addCriterion("jjrjdh not in", values, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhBetween(String value1, String value2) {
            addCriterion("jjrjdh between", value1, value2, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andJjrjdhNotBetween(String value1, String value2) {
            addCriterion("jjrjdh not between", value1, value2, "jjrjdh");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("hibernateversion is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("hibernateversion is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("hibernateversion =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("hibernateversion <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("hibernateversion >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("hibernateversion >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("hibernateversion <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("hibernateversion <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("hibernateversion in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("hibernateversion not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("hibernateversion between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("hibernateversion not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("modifydesc is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("modifydesc is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("modifydesc =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("modifydesc <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("modifydesc >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("modifydesc >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("modifydesc <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("modifydesc <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("modifydesc like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("modifydesc not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("modifydesc in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("modifydesc not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("modifydesc between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("modifydesc not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNull() {
            addCriterion("createtype is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("createtype is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(String value) {
            addCriterion("createtype =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(String value) {
            addCriterion("createtype <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(String value) {
            addCriterion("createtype >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("createtype >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(String value) {
            addCriterion("createtype <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(String value) {
            addCriterion("createtype <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLike(String value) {
            addCriterion("createtype like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotLike(String value) {
            addCriterion("createtype not like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<String> values) {
            addCriterion("createtype in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<String> values) {
            addCriterion("createtype not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(String value1, String value2) {
            addCriterion("createtype between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(String value1, String value2) {
            addCriterion("createtype not between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIfconfirmIsNull() {
            addCriterion("ifconfirm is null");
            return (Criteria) this;
        }

        public Criteria andIfconfirmIsNotNull() {
            addCriterion("ifconfirm is not null");
            return (Criteria) this;
        }

        public Criteria andIfconfirmEqualTo(String value) {
            addCriterion("ifconfirm =", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmNotEqualTo(String value) {
            addCriterion("ifconfirm <>", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmGreaterThan(String value) {
            addCriterion("ifconfirm >", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmGreaterThanOrEqualTo(String value) {
            addCriterion("ifconfirm >=", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmLessThan(String value) {
            addCriterion("ifconfirm <", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmLessThanOrEqualTo(String value) {
            addCriterion("ifconfirm <=", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmLike(String value) {
            addCriterion("ifconfirm like", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmNotLike(String value) {
            addCriterion("ifconfirm not like", value, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmIn(List<String> values) {
            addCriterion("ifconfirm in", values, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmNotIn(List<String> values) {
            addCriterion("ifconfirm not in", values, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmBetween(String value1, String value2) {
            addCriterion("ifconfirm between", value1, value2, "ifconfirm");
            return (Criteria) this;
        }

        public Criteria andIfconfirmNotBetween(String value1, String value2) {
            addCriterion("ifconfirm not between", value1, value2, "ifconfirm");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxout_td
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
     * @Table : mm_taxout_td
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