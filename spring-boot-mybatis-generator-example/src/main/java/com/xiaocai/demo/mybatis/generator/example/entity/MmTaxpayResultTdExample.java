package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTaxpayResultTdExample {
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
    public MmTaxpayResultTdExample() {
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
     * @Table : mm_taxpay_result_td
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

        public Criteria andResultnoIsNull() {
            addCriterion("RESULTNO is null");
            return (Criteria) this;
        }

        public Criteria andResultnoIsNotNull() {
            addCriterion("RESULTNO is not null");
            return (Criteria) this;
        }

        public Criteria andResultnoEqualTo(Long value) {
            addCriterion("RESULTNO =", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoNotEqualTo(Long value) {
            addCriterion("RESULTNO <>", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoGreaterThan(Long value) {
            addCriterion("RESULTNO >", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoGreaterThanOrEqualTo(Long value) {
            addCriterion("RESULTNO >=", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoLessThan(Long value) {
            addCriterion("RESULTNO <", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoLessThanOrEqualTo(Long value) {
            addCriterion("RESULTNO <=", value, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoIn(List<Long> values) {
            addCriterion("RESULTNO in", values, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoNotIn(List<Long> values) {
            addCriterion("RESULTNO not in", values, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoBetween(Long value1, Long value2) {
            addCriterion("RESULTNO between", value1, value2, "resultno");
            return (Criteria) this;
        }

        public Criteria andResultnoNotBetween(Long value1, Long value2) {
            addCriterion("RESULTNO not between", value1, value2, "resultno");
            return (Criteria) this;
        }

        public Criteria andPayidIsNull() {
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Long value) {
            addCriterion("PAYID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Long value) {
            addCriterion("PAYID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Long value) {
            addCriterion("PAYID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Long value) {
            addCriterion("PAYID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Long value) {
            addCriterion("PAYID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Long> values) {
            addCriterion("PAYID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Long> values) {
            addCriterion("PAYID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Long value1, Long value2) {
            addCriterion("PAYID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Long value1, Long value2) {
            addCriterion("PAYID not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("CHECKRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("CHECKRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("CHECKRESULT =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("CHECKRESULT <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("CHECKRESULT >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKRESULT >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("CHECKRESULT <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("CHECKRESULT <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("CHECKRESULT like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("CHECKRESULT not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("CHECKRESULT in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("CHECKRESULT not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("CHECKRESULT between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("CHECKRESULT not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountIsNull() {
            addCriterion("TOTAL_TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountIsNotNull() {
            addCriterion("TOTAL_TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT =", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT <>", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT >", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT >=", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountLessThan(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT <", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_TAXAMOUNT <=", value, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_TAXAMOUNT in", values, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_TAXAMOUNT not in", values, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_TAXAMOUNT between", value1, value2, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_TAXAMOUNT not between", value1, value2, "totalTaxamount");
            return (Criteria) this;
        }

        public Criteria andTotalNoIsNull() {
            addCriterion("TOTAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTotalNoIsNotNull() {
            addCriterion("TOTAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNoEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NO =", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NO <>", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_NO >", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NO >=", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoLessThan(BigDecimal value) {
            addCriterion("TOTAL_NO <", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NO <=", value, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoIn(List<BigDecimal> values) {
            addCriterion("TOTAL_NO in", values, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_NO not in", values, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_NO between", value1, value2, "totalNo");
            return (Criteria) this;
        }

        public Criteria andTotalNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_NO not between", value1, value2, "totalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountIsNull() {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountIsNotNull() {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT =", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT <>", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT >", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT >=", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountLessThan(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT <", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT <=", value, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT in", values, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT not in", values, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT between", value1, value2, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_TOTAL_TAXAMOUNT not between", value1, value2, "paymentTotalTaxamount");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoIsNull() {
            addCriterion("PAYMENT_TOTAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoIsNotNull() {
            addCriterion("PAYMENT_TOTAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO =", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO <>", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO >", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO >=", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoLessThan(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO <", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_TOTAL_NO <=", value, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_TOTAL_NO in", values, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_TOTAL_NO not in", values, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_TOTAL_NO between", value1, value2, "paymentTotalNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTotalNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_TOTAL_NO not between", value1, value2, "paymentTotalNo");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_taxpay_result_td
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
     * @Table : mm_taxpay_result_td
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